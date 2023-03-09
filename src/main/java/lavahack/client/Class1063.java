/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.ArrayList;
import lavahack.client.Class1722;
import lavahack.client.Class1790;
import lavahack.client.Class24;
import org.objectweb.asm.tree.ClassNode;

public class Class1063
implements Class24 {
    private String Field12691 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method193(ClassNode classNode, Class1790 class1790) {
        if (classNode.superName != null) {
            classNode.superName = class1790.Method6769().getOrDefault(classNode.superName, classNode.superName);
        }
        if (classNode.interfaces != null && !classNode.interfaces.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<String>(classNode.interfaces.size());
            for (String string : classNode.interfaces) {
                arrayList.add(class1790.Method6769().getOrDefault(string, string));
            }
            classNode.interfaces = arrayList;
        }
        if (classNode.signature == null) return;
        classNode.signature = Class1722.Method6590(classNode.signature, class1790);
    }
}

