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

import com.kisman.cc.loader.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import lavahack.loader.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "invoke"})
final class ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Lambda
implements Function0 {
    public static final ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12051 = new ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    private String Field12052 = "TheKisDevs & LavaHack Development owns you";

    public Object invoke() {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
        return Unit.INSTANCE;
    }

    public final void leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        Process process;
        if (!UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method4883()) return;
        Process process2 = process = Runtime.getRuntime().exec("tasklist");
        Intrinsics.checkExpressionValueIsNotNull((Object)process2, (String)"process");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process2.getInputStream()));
        String string = null;
        while (true) {
            String string2 = bufferedReader.readLine();
            int n = (int)122973604L ^ 0x7546DA4;
            int n2 = (int)-972148389L ^ 0xC60E315B;
            String string3 = string2;
            int n3 = (int)-732677164L ^ 0xD4543BD4;
            string = string3;
            if (string2 == null) return;
            String string4 = string;
            if (string4 == null) {
                Intrinsics.throwNpe();
            }
            String[] stringArray = new String[(int)-2027771401L ^ 0x8722A9F6];
            stringArray[(int)((long)-202804744 ^ (long)-202804744)] = " ";
            string2 = (String)StringsKt.split$default((CharSequence)string4, (String[])stringArray, (boolean)((long)1271487431 ^ (long)1271487431), (int)((int)((long)-569626782 ^ (long)-569626782)), (int)(((int)-143799519L ^ 0xF76DCB22) << 1), null).get((int)-1142194212L ^ 0xBBEB7FDC);
            if (!ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method1646().contains(string2)) continue;
            UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method4886();
        }
    }

    ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        super((int)((long)130241014 ^ (long)130241014));
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1174821053L ^ 0x460658BD;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1253470187L ^ 0x4AB66F14);
            int n2 = (int)((long)-517354388 ^ (long)-517354481);
            cArray2[n] = (char)(cArray[n] ^ (((int)-1165167354L ^ 0xBA8CE931) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

