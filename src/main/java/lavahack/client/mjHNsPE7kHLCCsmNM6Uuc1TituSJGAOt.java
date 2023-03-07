/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import lavahack.client.CtVtyQkWPun0wJTOiNCcP66ptb2oORzD;
import lavahack.client.OXnmHkicoKSXO07qPVZZlEOZLMS63HK3;
import lavahack.client.VKswaMs8Qxm0K4Sninx8F7JXZylB2itm;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.LocalVariableNode;

public class mjHNsPE7kHLCCsmNM6Uuc1TituSJGAOt
implements VKswaMs8Qxm0K4Sninx8F7JXZylB2itm {
    private int Field12389;

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    @Override
    public void Method193(ClassNode var1_1, OXnmHkicoKSXO07qPVZZlEOZLMS63HK3 var2_2) {
        var3_3 = var1_1.methods.iterator();
        block0: while (true) {
            if (var3_3.hasNext() == false) return;
            var4_4 = var3_3.next();
            var4_4.desc = CtVtyQkWPun0wJTOiNCcP66ptb2oORzD.Method6589(var4_4.desc, var2_2);
            var4_4.name = CtVtyQkWPun0wJTOiNCcP66ptb2oORzD.Method6582(null, var4_4.name, var4_4.desc, var2_2);
            if (var4_4.signature != null) {
                var4_4.signature = CtVtyQkWPun0wJTOiNCcP66ptb2oORzD.Method6590(var4_4.signature, var2_2);
            }
            if (var4_4.tryCatchBlocks != null) {
                for (Iterator<String> var6_6 : var4_4.tryCatchBlocks) {
                    var6_6.type = var2_2.Method6769().getOrDefault(var6_6.type, var6_6.type);
                }
            }
            if (var4_4.exceptions != null && !var4_4.exceptions.isEmpty()) {
                var5_5 = new ArrayList<E>(var4_4.exceptions.size());
                for (String var7_7 : var4_4.exceptions) {
                    var5_5.add(var2_2.Method6769().getOrDefault(var7_7, var7_7));
                }
                var4_4.exceptions = var5_5;
            }
            if (var4_4.localVariables == null) continue;
            var5_5 = var4_4.localVariables.iterator();
            while (true) {
                if (var5_5.hasNext()) ** break;
                continue block0;
                var6_6 = (LocalVariableNode)var5_5.next();
                var6_6.desc = CtVtyQkWPun0wJTOiNCcP66ptb2oORzD.Method6589(var6_6.desc, var2_2);
                if (var6_6.signature == null) continue;
                var6_6.signature = CtVtyQkWPun0wJTOiNCcP66ptb2oORzD.Method6590(var6_6.signature, var2_2);
            }
            break;
        }
    }
}

