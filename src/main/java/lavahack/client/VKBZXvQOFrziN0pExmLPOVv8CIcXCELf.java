/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Iterator;
import lavahack.client.N6R0AufgOgIxMFLWEEQHTzfAeRkXxQ8M;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

public class VKBZXvQOFrziN0pExmLPOVv8CIcXCELf {
    private String Field14325 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static ClassNode Method5516(byte[] byArray, int ... nArray) {
        ClassNode classNode = new ClassNode();
        ClassReader classReader = new ClassReader(byArray);
        classReader.accept(classNode, VKBZXvQOFrziN0pExmLPOVv8CIcXCELf.Method5523(nArray));
        return classNode;
    }

    public static byte[] Method5517(ClassNode classNode, int ... nArray) {
        ClassWriter classWriter = new ClassWriter(VKBZXvQOFrziN0pExmLPOVv8CIcXCELf.Method5523(nArray));
        classNode.accept(classWriter);
        return classWriter.toByteArray();
    }

    public static byte[] Method5518(ClassNode classNode, int ... nArray) {
        N6R0AufgOgIxMFLWEEQHTzfAeRkXxQ8M n6R0AufgOgIxMFLWEEQHTzfAeRkXxQ8M = new N6R0AufgOgIxMFLWEEQHTzfAeRkXxQ8M(VKBZXvQOFrziN0pExmLPOVv8CIcXCELf.Method5523(nArray));
        classNode.accept(n6R0AufgOgIxMFLWEEQHTzfAeRkXxQ8M);
        return n6R0AufgOgIxMFLWEEQHTzfAeRkXxQ8M.toByteArray();
    }

    public static MethodNode Method5519(ClassNode classNode, String string, String string2, String string3, String string4, String string5) {
        MethodNode methodNode = VKBZXvQOFrziN0pExmLPOVv8CIcXCELf.Method5520(classNode, string, string2);
        if (methodNode != null) return methodNode;
        methodNode = VKBZXvQOFrziN0pExmLPOVv8CIcXCELf.Method5520(classNode, string3, string5);
        if (methodNode != null) return methodNode;
        return VKBZXvQOFrziN0pExmLPOVv8CIcXCELf.Method5520(classNode, string4, string5);
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
        int n2 = (int)((long)-1750043572 ^ (long)-1750043572);
        while (n2 < n) {
            String string = stringArray2[n2];
            FieldNode fieldNode = VKBZXvQOFrziN0pExmLPOVv8CIcXCELf.Method5522(classNode, string);
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
        int n = (int)((long)-118582342 ^ (long)-118582342);
        int[] nArray2 = nArray;
        int n2 = nArray2.length;
        int n3 = (int)((long)1466556475 ^ (long)1466556475);
        while (n3 < n2) {
            int n4 = nArray2[n3];
            n |= n4;
            ++n3;
        }
        return n;
    }
}

