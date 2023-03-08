//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.objectweb.asm.*;
import java.util.*;
import org.objectweb.asm.tree.*;

public class Class1396
{
    private String Field14325 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static ClassNode Method5516(final byte[] array, final int... array2) {
        final ClassNode classNode = new ClassNode();
        new ClassReader(array).accept((ClassVisitor)classNode, Method5523(array2));
        return classNode;
    }
    
    public static byte[] Method5517(final ClassNode classNode, final int... array) {
        final ClassWriter classWriter = new ClassWriter(Method5523(array));
        classNode.accept((ClassVisitor)classWriter);
        return classWriter.toByteArray();
    }
    
    public static byte[] Method5518(final ClassNode classNode, final int... array) {
        final Class205 class205 = new Class205(Method5523(array));
        classNode.accept((ClassVisitor)class205);
        return class205.toByteArray();
    }
    
    public static MethodNode Method5519(final ClassNode classNode, final String s, final String s2, final String s3, final String s4, final String s5) {
        MethodNode methodNode = Method5520(classNode, s, s2);
        if (methodNode == null) {
            methodNode = Method5520(classNode, s3, s5);
            if (methodNode == null) {
                return Method5520(classNode, s4, s5);
            }
        }
        return methodNode;
    }
    
    public static MethodNode Method5520(final ClassNode classNode, final String anObject, final String anObject2) {
        for (final MethodNode methodNode : classNode.methods) {
            if (methodNode.name.equals(anObject) && methodNode.desc.equals(anObject2)) {
                return methodNode;
            }
        }
        return null;
    }
    
    public static FieldNode Method5521(final ClassNode classNode, final String... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            final FieldNode method5522 = Method5522(classNode, array[i]);
            if (method5522 != null) {
                return method5522;
            }
        }
        return null;
    }
    
    public static FieldNode Method5522(final ClassNode classNode, final String anObject) {
        for (final FieldNode fieldNode : classNode.fields) {
            if (fieldNode.name.equals(anObject)) {
                return fieldNode;
            }
        }
        return null;
    }
    
    public static int Method5523(final int... array) {
        int n = 0;
        for (int length = array.length, i = 0; i < length; ++i) {
            n |= array[i];
        }
        return n;
    }
}
