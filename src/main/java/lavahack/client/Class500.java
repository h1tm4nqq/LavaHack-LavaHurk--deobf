/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class2074;
import lavahack.client.Class415;
import lavahack.client.Class42;
import lavahack.client.Class97;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/features/module/misc/Printer;", "Lcom/kisman/cc/features/module/Module;", "()V", "onDisable", "", "onEnable", "kisman.cc"})
public final class Class500
extends Class42 {
    private String Field10081 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        Class415 class415 = Class415.Field9718;
        Intrinsics.checkExpressionValueIsNotNull((Object)class415, (String)"SchematicPrinter.INSTANCE");
        class415.Method2013(true);
    }

    @Override
    public void Method39() {
        super.Method39();
        Class415 class415 = Class415.Field9718;
        Intrinsics.checkExpressionValueIsNotNull((Object)class415, (String)"SchematicPrinter.INSTANCE");
        class415.Method2013(false);
    }

    public Class500() {
        super("Printer", "Integration of Schematica's printer", Class97.Field8343);
        super.Method44(Class2074.Field17487);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 50;
            cArray2[n] = (char)(cArray[n] ^ (0x2208 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

