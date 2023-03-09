/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Iterator;
import lavahack.client.Class1722;
import lavahack.client.Class1790;
import lavahack.client.Class24;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;

public class Class1017
implements Class24 {
    private String Field12419 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method193(ClassNode classNode, Class1790 class1790) {
        Iterator<FieldNode> iterator = classNode.fields.iterator();
        while (iterator.hasNext()) {
            FieldNode fieldNode = iterator.next();
            fieldNode.desc = Class1722.Method6589(fieldNode.desc, class1790);
            if (fieldNode.signature != null) {
                fieldNode.signature = Class1722.Method6590(fieldNode.signature, class1790);
            }
            if (!this.Method4130(fieldNode)) continue;
            fieldNode.name = class1790.Method6770().getOrDefault(fieldNode.name, fieldNode.name);
        }
    }

    private boolean Method4130(FieldNode fieldNode) {
        AnnotationNode annotationNode2;
        if (fieldNode.visibleAnnotations != null) {
            for (AnnotationNode annotationNode2 : fieldNode.visibleAnnotations) {
                if (annotationNode2 == null || !"Lorg/spongepowered/asm/mixin/Shadow;".equals(annotationNode2.desc)) continue;
                return true;
            }
        }
        if (fieldNode.invisibleAnnotations == null) return false;
        Iterator<AnnotationNode> iterator = fieldNode.invisibleAnnotations.iterator();
        do {
            if (!iterator.hasNext()) return false;
        } while ((annotationNode2 = iterator.next()) == null || !"Lme/earth/earthhack/installer/srg2notch/RemapFieldName;".equals(annotationNode2.desc));
        return true;
    }

    private static String Method4131(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 174;
            cArray2[n] = (char)(cArray[n] ^ (0x2D37 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

