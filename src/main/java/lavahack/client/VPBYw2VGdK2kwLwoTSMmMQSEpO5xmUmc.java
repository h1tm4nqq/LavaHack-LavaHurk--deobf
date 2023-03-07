/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.ArrayList;
import lavahack.client.CtVtyQkWPun0wJTOiNCcP66ptb2oORzD;
import lavahack.client.OXnmHkicoKSXO07qPVZZlEOZLMS63HK3;
import lavahack.client.VKswaMs8Qxm0K4Sninx8F7JXZylB2itm;
import org.objectweb.asm.tree.ClassNode;

public class VPBYw2VGdK2kwLwoTSMmMQSEpO5xmUmc
implements VKswaMs8Qxm0K4Sninx8F7JXZylB2itm {
    private int Field13538;

    @Override
    public void Method193(ClassNode classNode, OXnmHkicoKSXO07qPVZZlEOZLMS63HK3 oXnmHkicoKSXO07qPVZZlEOZLMS63HK3) {
        if (classNode.superName != null) {
            classNode.superName = oXnmHkicoKSXO07qPVZZlEOZLMS63HK3.Method6769().getOrDefault(classNode.superName, classNode.superName);
        }
        if (classNode.interfaces != null && !classNode.interfaces.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<String>(classNode.interfaces.size());
            for (String string : classNode.interfaces) {
                arrayList.add(oXnmHkicoKSXO07qPVZZlEOZLMS63HK3.Method6769().getOrDefault(string, string));
            }
            classNode.interfaces = arrayList;
        }
        if (classNode.signature == null) return;
        classNode.signature = CtVtyQkWPun0wJTOiNCcP66ptb2oORzD.Method6590(classNode.signature, oXnmHkicoKSXO07qPVZZlEOZLMS63HK3);
    }
}

