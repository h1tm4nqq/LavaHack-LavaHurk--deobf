//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import org.objectweb.asm.tree.*;

public class Class1017 implements Class24
{
    private String Field12419 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method193(final ClassNode classNode, final Class1790 class1790) {
        for (final FieldNode fieldNode : classNode.fields) {
            fieldNode.desc = Class1722.Method6589(fieldNode.desc, class1790);
            if (fieldNode.signature != null) {
                fieldNode.signature = Class1722.Method6590(fieldNode.signature, class1790);
            }
            if (this.Method4130(fieldNode)) {
                fieldNode.name = class1790.Method6770().getOrDefault(fieldNode.name, fieldNode.name);
            }
        }
    }
    
    private boolean Method4130(final FieldNode fieldNode) {
        if (fieldNode.visibleAnnotations != null) {
            for (final AnnotationNode annotationNode : fieldNode.visibleAnnotations) {
                if (annotationNode != null && "Lorg/spongepowered/asm/mixin/Shadow;".equals(annotationNode.desc)) {
                    return true;
                }
            }
        }
        if (fieldNode.invisibleAnnotations != null) {
            for (final AnnotationNode annotationNode2 : fieldNode.invisibleAnnotations) {
                if (annotationNode2 != null && "Lme/earth/earthhack/installer/srg2notch/RemapFieldName;".equals(annotationNode2.desc)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static String Method4131(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2D37 ^ 0xAE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
