/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Iterator;
import lavahack.client.CtVtyQkWPun0wJTOiNCcP66ptb2oORzD;
import lavahack.client.OXnmHkicoKSXO07qPVZZlEOZLMS63HK3;
import lavahack.client.VKswaMs8Qxm0K4Sninx8F7JXZylB2itm;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;

public class PlexElxneO8yJrjYrpdC3UIsltSpVGba
implements VKswaMs8Qxm0K4Sninx8F7JXZylB2itm {
    private String Field12419 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method193(ClassNode classNode, OXnmHkicoKSXO07qPVZZlEOZLMS63HK3 oXnmHkicoKSXO07qPVZZlEOZLMS63HK3) {
        Iterator<FieldNode> iterator = classNode.fields.iterator();
        while (iterator.hasNext()) {
            FieldNode fieldNode = iterator.next();
            fieldNode.desc = CtVtyQkWPun0wJTOiNCcP66ptb2oORzD.Method6589(fieldNode.desc, oXnmHkicoKSXO07qPVZZlEOZLMS63HK3);
            if (fieldNode.signature != null) {
                fieldNode.signature = CtVtyQkWPun0wJTOiNCcP66ptb2oORzD.Method6590(fieldNode.signature, oXnmHkicoKSXO07qPVZZlEOZLMS63HK3);
            }
            if (!this.Method4130(fieldNode)) continue;
            fieldNode.name = oXnmHkicoKSXO07qPVZZlEOZLMS63HK3.Method6770().getOrDefault(fieldNode.name, fieldNode.name);
        }
    }

    private boolean Method4130(FieldNode fieldNode) {
        AnnotationNode annotationNode2;
        if (fieldNode.visibleAnnotations != null) {
            for (AnnotationNode annotationNode2 : fieldNode.visibleAnnotations) {
                if (annotationNode2 == null || !"Lorg/spongepowered/asm/mixin/Shadow;".equals(annotationNode2.desc)) continue;
                return (int)((long)1935593329 ^ (long)1935593328) != 0;
            }
        }
        if (fieldNode.invisibleAnnotations == null) return ((int)1534261174L ^ 0x5B72F7B6) != 0;
        Iterator<AnnotationNode> iterator = fieldNode.invisibleAnnotations.iterator();
        do {
            if (!iterator.hasNext()) return ((int)1534261174L ^ 0x5B72F7B6) != 0;
        } while ((annotationNode2 = iterator.next()) == null || !"Lme/earth/earthhack/installer/srg2notch/RemapFieldName;".equals(annotationNode2.desc));
        return ((int)2121443377L ^ 0x7E72A830) != 0;
    }

    private static String Method4131(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1303686988 ^ (long)-1303686988);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)584299659 ^ (long)584299636);
            int n2 = ((int)657964816L ^ 0x2737BF47) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)1658362102L ^ 0x62D8B5C1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

