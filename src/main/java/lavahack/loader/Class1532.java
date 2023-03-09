/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.loader;

import com.kisman.cc.loader.Class1204;
import com.kisman.cc.loader.Class1214;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class Class1532
implements Runnable {
    final String Field15159;
    final String Field15160;
    private String Field15161 = "TheKisDevs & LavaHack Development owns you";

    @Override
    public final void run() {
        String string = Class1214.Method4892(this.Field15159);
        Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"Utility.cleaner(key)");
        String string2 = Class1214.Method4887();
        Intrinsics.checkExpressionValueIsNotNull((Object)string2, (String)"Utility.properties()");
        String string3 = String.valueOf(Runtime.getRuntime().availableProcessors());
        String string4 = Class1214.Method4889(this.Field15160);
        Intrinsics.checkExpressionValueIsNotNull((Object)string4, (String)"Utility.stringFixer(version)");
        Class1204.Method4855(string, "2.0", string2, string3, string4);
    }

    Class1532(String string, String string2) {
        this.Field15159 = string;
        this.Field15160 = string2;
    }

    private static String Method6074(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 55;
            cArray2[n] = (char)(cArray[n] ^ (0x2B62 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

