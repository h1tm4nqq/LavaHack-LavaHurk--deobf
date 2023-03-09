/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.Lambda
 *  kotlin.text.StringsKt
 */
package lavahack.loader;

import com.kisman.cc.loader.Class1214;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import lavahack.loader.Class328;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "invoke"})
final class Class951
extends Lambda
implements Function0 {
    public static final Class951 Field12051 = new Class951();
    private String Field12052 = "TheKisDevs & LavaHack Development owns you";

    public Object invoke() {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
        return Unit.INSTANCE;
    }

    public final void leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        Process process;
        if (!Class1214.Method4883()) return;
        Process process2 = process = Runtime.getRuntime().exec("tasklist");
        Intrinsics.checkExpressionValueIsNotNull((Object)process2, (String)"process");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process2.getInputStream()));
        String string = null;
        while (true) {
            String string2 = bufferedReader.readLine();
            boolean bl = false;
            boolean bl2 = false;
            String string3 = string2;
            boolean bl3 = false;
            string = string3;
            if (string2 == null) return;
            String string4 = string;
            if (string4 == null) {
                Intrinsics.throwNpe();
            }
            string2 = (String)StringsKt.split$default((CharSequence)string4, (String[])new String[]{" "}, (boolean)false, (int)0, (int)6, null).get(0);
            if (!Class328.Method1646().contains(string2)) continue;
            Class1214.Method4886();
        }
    }

    Class951() {
        super(0);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 99;
            cArray2[n] = (char)(cArray[n] ^ (0x386E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

