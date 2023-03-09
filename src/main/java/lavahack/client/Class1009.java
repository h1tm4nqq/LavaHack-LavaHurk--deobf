/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import lavahack.client.Class1722;
import lavahack.client.Class1790;
import lavahack.client.Class24;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.LocalVariableNode;

public class Class1009
implements Class24 {
    private int Field12389;

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    @Override
    public void Method193(ClassNode var1_1, Class1790 var2_2) {
        var3_3 = var1_1.methods.iterator();
        block0: while (true) {
            if (var3_3.hasNext() == false) return;
            var4_4 = var3_3.next();
            var4_4.desc = Class1722.Method6589(var4_4.desc, var2_2);
            var4_4.name = Class1722.Method6582(null, var4_4.name, var4_4.desc, var2_2);
            if (var4_4.signature != null) {
                var4_4.signature = Class1722.Method6590(var4_4.signature, var2_2);
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
                var6_6.desc = Class1722.Method6589(var6_6.desc, var2_2);
                if (var6_6.signature == null) continue;
                var6_6.signature = Class1722.Method6590(var6_6.signature, var2_2);
            }
            break;
        }
    }
}

