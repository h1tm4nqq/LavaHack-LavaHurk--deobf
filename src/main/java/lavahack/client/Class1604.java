/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.spongepowered.asm.mixin.Mixins
 */
package lavahack.client;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1096;
import lavahack.client.Class1207;
import lavahack.client.Class1669;
import lavahack.client.Class1796;
import lavahack.client.Class379;
import org.spongepowered.asm.mixin.Mixins;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/features/plugins/PluginHandler;", "", "()V", "coreModInit", "", "init", "kisman.cc"})
public final class Class1604 {
    private String Field15503 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method6264() {
        Class379 class379 = Class379.Method1845();
        Intrinsics.checkExpressionValueIsNotNull((Object)class379, (String)"PluginManager.getInstance()");
        Iterator iterator = class379.Method1850().values().iterator();
        while (iterator.hasNext()) {
            Class1669 class1669 = (Class1669)iterator.next();
            String[] stringArray = new String[1];
            Class1669 class16692 = class1669;
            Intrinsics.checkExpressionValueIsNotNull((Object)class16692, (String)"config");
            stringArray[0] = class16692.Method6443();
            Mixins.addConfigurations((String[])stringArray);
        }
    }

    public final void Method6265() {
        Class379.Method1845().Method1848();
        Class379 class379 = Class379.Method1845();
        Intrinsics.checkExpressionValueIsNotNull((Object)class379, (String)"PluginManager.getInstance()");
        Iterator iterator = class379.Method1850().values().iterator();
        while (iterator.hasNext()) {
            Class1669 class1669;
            Class1669 class16692 = class1669 = (Class1669)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)class16692, (String)"config");
            Class1096 class1096 = new Class1096(class16692);
            Class1796.Field16241.Field16254.Field8854.add(class1096);
            class1096.Method4487().Method3759();
            class1096.Method4489();
        }
    }

    public Class1604() {
        Class1207.Method4872();
        Class379.Method1845().Method1846(Class379.class.getClassLoader());
    }

    private static String Method6266(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 108;
            cArray2[n] = (char)(cArray[n] ^ (0x5D59 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

