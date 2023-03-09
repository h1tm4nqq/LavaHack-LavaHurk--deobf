/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Iterator;
import lavahack.client.Class205;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

public class Class1396 {
    private String Field14325 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static ClassNode Method5516(byte[] byArray, int ... nArray) {
        ClassNode classNode = new ClassNode();
        ClassReader classReader = new ClassReader(byArray);
        classReader.accept(classNode, Class1396.Method5523(nArray));
        return classNode;
    }

    public static byte[] Method5517(ClassNode classNode, int ... nArray) {
        ClassWriter classWriter = new ClassWriter(Class1396.Method5523(nArray));
        classNode.accept(classWriter);
        return classWriter.toByteArray();
    }

    public static byte[] Method5518(ClassNode classNode, int ... nArray) {
        Class205 class205 = new Class205(Class1396.Method5523(nArray));
        classNode.accept(class205);
        return class205.toByteArray();
    }

    public static MethodNode Method5519(ClassNode classNode, String string, String string2, String string3, String string4, String string5) {
        MethodNode methodNode = Class1396.Method5520(classNode, string, string2);
        if (methodNode != null) return methodNode;
        methodNode = Class1396.Method5520(classNode, string3, string5);
        if (methodNode != null) return methodNode;
        return Class1396.Method5520(classNode, string4, string5);
    }

    public static MethodNode Method5520(ClassNode classNode, String string, String string2) {
        MethodNode methodNode;
        Iterator<MethodNode> iterator = classNode.methods.iterator();
        do {
            if (!iterator.hasNext()) return null;
            methodNode = iterator.next();
        } while (!methodNode.name.equals(string) || !methodNode.desc.equals(string2));
        return methodNode;
    }

    public static FieldNode Method5521(ClassNode classNode, String ... stringArray) {
        String[] stringArray2 = stringArray;
        int n = stringArray2.length;
        int n2 = 0;
        while (n2 < n) {
            String string = stringArray2[n2];
            FieldNode fieldNode = Class1396.Method5522(classNode, string);
            if (fieldNode != null) {
                return fieldNode;
            }
            ++n2;
        }
        return null;
    }

    public static FieldNode Method5522(ClassNode classNode, String string) {
        FieldNode fieldNode;
        Iterator<FieldNode> iterator = classNode.fields.iterator();
        do {
            if (!iterator.hasNext()) return null;
            fieldNode = iterator.next();
        } while (!fieldNode.name.equals(string));
        return fieldNode;
    }

    public static int Method5523(int ... nArray) {
        int n = 0;
        int[] nArray2 = nArray;
        int n2 = nArray2.length;
        int n3 = 0;
        while (n3 < n2) {
            int n4 = nArray2[n3];
            n |= n4;
            ++n3;
        }
        return n;
    }
}

