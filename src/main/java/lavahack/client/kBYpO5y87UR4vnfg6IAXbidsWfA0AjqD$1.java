/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import java.util.function.Supplier;
import kotlin.Metadata;
import lavahack.client.IdtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0002\b\u0003"}, d2={"<anonymous>", "", "kotlin.jvm.PlatformType", "get"})
final class kBYpO5y87UR4vnfg6IAXbidsWfA0AjqD$1
implements Supplier {
    public static final kBYpO5y87UR4vnfg6IAXbidsWfA0AjqD$1 Field17487 = new kBYpO5y87UR4vnfg6IAXbidsWfA0AjqD$1();
    private String Field17488 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method7615();
    }

    public final String Method7615() {
        if (!IdtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE.Field9718.Method2015()) return "Printing";
        return "Stationary";
    }

    kBYpO5y87UR4vnfg6IAXbidsWfA0AjqD$1() {
    }

    private static String Method7616(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1848647022L ^ 0x91CFE292;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)199412738 ^ (long)199412989);
            int n2 = (int)-1375674230L ^ 0xAE00E06B;
            cArray2[n] = (char)(cArray[n] ^ (((int)1126073383L ^ 0x431E8B2E) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

