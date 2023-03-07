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
import lavahack.client.IdtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.kBYpO5y87UR4vnfg6IAXbidsWfA0AjqD$1;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/features/module/misc/Printer;", "Lcom/kisman/cc/features/module/Module;", "()V", "onDisable", "", "onEnable", "kisman.cc"})
public final class kBYpO5y87UR4vnfg6IAXbidsWfA0AjqD
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private String Field10081 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        IdtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE idtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE = IdtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE.Field9718;
        Intrinsics.checkExpressionValueIsNotNull((Object)idtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE, (String)"SchematicPrinter.INSTANCE");
        idtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE.Method2013((boolean)((long)1390417459 ^ (long)1390417458));
    }

    @Override
    public void Method39() {
        super.Method39();
        IdtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE idtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE = IdtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE.Field9718;
        Intrinsics.checkExpressionValueIsNotNull((Object)idtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE, (String)"SchematicPrinter.INSTANCE");
        idtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE.Method2013(((int)-595059164L ^ 0xDC881E24) != 0);
    }

    public kBYpO5y87UR4vnfg6IAXbidsWfA0AjqD() {
        super("Printer", "Integration of Schematica's printer", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
        super.Method44(kBYpO5y87UR4vnfg6IAXbidsWfA0AjqD$1.Field17487);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)954237809L ^ 0x38E08371;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)572122287 ^ (long)572122192);
            int n2 = ((int)1881291263L ^ 0x702239E6) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)260514581 ^ (long)260515668) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

