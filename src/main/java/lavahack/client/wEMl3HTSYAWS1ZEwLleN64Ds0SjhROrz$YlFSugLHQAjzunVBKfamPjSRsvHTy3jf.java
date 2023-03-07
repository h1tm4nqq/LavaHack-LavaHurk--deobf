/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.io.CloseableKt
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.kisman.cc.util.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K;
import lavahack.client.wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u001e\u0010\t\u001a\u00020\b2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rJ(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2={"Lcom/kisman/cc/util/manager/file/ConfigManager$ModuleSave;", "", "config", "Lcom/kisman/cc/util/manager/file/ConfigManager;", "(Lcom/kisman/cc/util/manager/file/ConfigManager;)V", "getConfig", "()Lcom/kisman/cc/util/manager/file/ConfigManager;", "fileCheck", "", "init", "modules", "Ljava/util/ArrayList;", "Lcom/kisman/cc/features/module/Module;", "Lkotlin/collections/ArrayList;", "save", "writer", "Ljava/io/BufferedWriter;", "kisman.cc"})
public final class wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf {
    @NotNull
    private final wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz Field11214;
    private String Field11215 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method3141(@NotNull @NotNull ArrayList arrayList) throws IOException {
        Intrinsics.checkParameterIsNotNull((Object)arrayList, (String)"modules");
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6786();
        this.Method3143();
        Closeable closeable = new BufferedWriter(new FileWriter(Paths.get(this.Field11214.Method4001() + this.Field11214.Method4007() + this.Field11214.Method4000(), new String[(int)((long)-831062718 ^ (long)-831062718)]).toFile()));
        int n = (int)((long)-1125712564 ^ (long)-1125712564);
        Throwable throwable = null;
        BufferedWriter bufferedWriter = (BufferedWriter)closeable;
        int n2 = (int)1343455386L ^ 0x5013809A;
        this.Method3142(bufferedWriter, arrayList);
        bufferedWriter = Unit.INSTANCE;
        CloseableKt.closeFinally((Closeable)closeable, (Throwable)throwable);
    }

    /*
     * Unable to fully structure code
     */
    private final void Method3142(BufferedWriter var1_1, ArrayList var2_2) throws IOException {
        var4_3 = var2_2.iterator();
        block0: while (true) {
            if (var4_3.hasNext() == false) return;
            var3_4 = (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)var4_3.next();
            var5_5 = var3_4 instanceof qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2 != false ? this.Field11214.Method4004() : this.Field11214.Method4002();
            v0 = new StringBuilder().append(var5_5).append((int)((long)2110902451 ^ (long)2110902436) << 1);
            v1 = var3_4;
            Intrinsics.checkExpressionValueIsNotNull((Object)v1, (String)"module");
            var1_1.write(v0.append(v1.Method40()).append(".toggle=").append(var3_4.Method35()).toString());
            var1_1.newLine();
            var1_1.write(var5_5 + ((int)((long)-994141270 ^ (long)-994141251) << 1) + var3_4.Method40() + ".hold=" + var3_4.Field8065);
            var1_1.newLine();
            var1_1.write(var5_5 + (((int)-989428427L ^ -989428446) << 1) + var3_4.Method40() + ".visible=" + var3_4.Method51());
            var1_1.newLine();
            var1_1.write(var5_5 + (((int)859455901L ^ 859455882) << 1) + var3_4.Method40() + ".key=" + var3_4.Method8());
            var1_1.newLine();
            var1_1.write(var5_5 + ((int)((long)-1527875127 ^ (long)-1527875106) << 1) + var3_4.Method40() + ".button=" + var3_4.Method10());
            var1_1.newLine();
            var1_1.write(var5_5 + ((int)((long)-437103219 ^ (long)-437103206) << 1) + var3_4.Method40() + ".mouseBind=" + (boolean)(var3_4.Method12() == ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12069 ? (int)429125045L ^ 429125044 : (int)((long)675862568 ^ (long)675862568)));
            var1_1.newLine();
            if (var3_4 instanceof qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2) {
                var1_1.write(var5_5 + (((int)400277312L ^ 400277335) << 1) + ((qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2)var3_4).Method40() + ".x=" + ((qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2)var3_4).Method267());
                var1_1.newLine();
                var1_1.write(var5_5 + ((int)((long)-1071550320 ^ (long)-1071550329) << 1) + ((qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2)var3_4).Method40() + ".y=" + ((qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2)var3_4).Method268());
                var1_1.newLine();
            }
            if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258.Method7571(var3_4) == null) continue;
            var7_7 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258.Method7571(var3_4).iterator();
            while (true) {
                if (var7_7.hasNext()) ** break;
                continue block0;
                var6_6 = (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)var7_7.next();
                if (var6_6 == null || var6_6.Method382()) continue;
                if (var6_6.Method386()) {
                    var1_1.write(var5_5 + ((int)((long)-475849454 ^ (long)-475849467) << 1) + var3_4.Method40() + ((int)((long)2037358323 ^ (long)2037358308) << 1) + this.Field11214.Method4003() + ((int)((long)1130177139 ^ (long)1130177124) << 1) + var6_6.Method356() + (char)((long)-1571615373 ^ (long)-1571615410) + var6_6.Method365());
                    var1_1.newLine();
                    if (var6_6.Method8() != (int)((long)-1964291383 ^ (long)1964291382)) {
                        var1_1.write(var5_5 + (((int)1526108763L ^ 1526108748) << 1) + var3_4.Method40() + ((int)((long)-1728593504 ^ (long)-1728593481) << 1) + this.Field11214.Method4003() + ((int)((long)-1071628478 ^ (long)-1071628459) << 1) + var6_6.Method356() + ":key=" + var6_6.Method8());
                        var1_1.newLine();
                    }
                    if (var6_6.Method10() != (int)((long)-1124977672 ^ (long)1124977671)) {
                        var1_1.write(var5_5 + ((int)((long)-564324390 ^ (long)-564324403) << 1) + var3_4.Method40() + (((int)1201249646L ^ 1201249657) << 1) + this.Field11214.Method4003() + (((int)1656504997L ^ 1656505010) << 1) + var6_6.Method356() + ":button=" + var6_6.Method8());
                        var1_1.newLine();
                    }
                    if (U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Field10935.Method7141(var6_6)) {
                        var1_1.write(var5_5 + ((int)((long)1241661749 ^ (long)1241661730) << 1) + var3_4.Method40() + (((int)-211866847L ^ -211866826) << 1) + this.Field11214.Method4003() + (((int)-320926878L ^ -320926859) << 1) + var6_6.Method356() + ":mouseBind=" + (boolean)(var6_6.Method12() == ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12069 ? (int)1134438818L ^ 1134438819 : (int)((long)-305052700 ^ (long)-305052700)));
                        var1_1.newLine();
                    }
                }
                if (var6_6.Method385()) {
                    var1_1.write(var5_5 + (((int)-1211376651L ^ -1211376670) << 1) + var3_4.Method40() + ((int)((long)1464258923 ^ (long)1464258940) << 1) + this.Field11214.Method4003() + ((int)((long)-2098515954 ^ (long)-2098515943) << 1) + var6_6.Method356() + "=\"" + var6_6.Method359() + (((int)-383710286L ^ -383710301) << 1));
                    var1_1.newLine();
                    for (String var8_8 : var6_6.Field8115.keySet()) {
                        v2 = new StringBuilder().append(var5_5).append(((int)1104243821L ^ 1104243834) << 1).append(var3_4.Method40()).append(((int)1103608548L ^ 1103608563) << 1).append(this.Field11214.Method4003()).append(((int)560545997L ^ 560546010) << 1).append(var6_6.Method356()).append(((int)1246553720L ^ 1246553711) << 1).append(var8_8).append(":key=");
                        v3 = var6_6.Field8115.get(var8_8);
                        if (v3 == null) {
                            Intrinsics.throwNpe();
                        }
                        var1_1.write(v2.append(((g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh)v3).Method8()).toString());
                        var1_1.newLine();
                        v4 = new StringBuilder().append(var5_5).append((int)((long)1165410957 ^ (long)1165410970) << 1).append(var3_4.Method40()).append((int)((long)-1781362154 ^ (long)-1781362175) << 1).append(this.Field11214.Method4003()).append(((int)698138472L ^ 698138495) << 1).append(var6_6.Method356()).append((int)((long)1799776970 ^ (long)1799776989) << 1).append(var8_8).append(":mouse=");
                        v5 = var6_6.Field8115.get(var8_8);
                        if (v5 == null) {
                            Intrinsics.throwNpe();
                        }
                        var1_1.write(v4.append(((g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh)v5).Method10()).toString());
                        var1_1.newLine();
                        var1_1.write(var5_5 + ((int)((long)1061548905 ^ (long)1061548926) << 1) + var3_4.Method40() + ((int)((long)1171024953 ^ (long)1171024942) << 1) + this.Field11214.Method4003() + ((int)((long)96576827 ^ (long)96576812) << 1) + var6_6.Method356() + ((int)((long)203259062 ^ (long)203259041) << 1) + var8_8 + ":mouseBind=" + (boolean)(var6_6.Method12() == ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12069 ? (int)-27486549L ^ -27486550 : (int)-983022694L ^ -983022694));
                        var1_1.newLine();
                    }
                }
                if (var6_6.Method387()) {
                    var1_1.write(var5_5 + (((int)-331909382L ^ -331909395) << 1) + var3_4.Method40() + (((int)580263543L ^ 580263520) << 1) + this.Field11214.Method4003() + ((int)((long)-1536427087 ^ (long)-1536427098) << 1) + var6_6.Method356() + (char)((int)-890658324L ^ -890658351) + var6_6.Method367());
                    var1_1.newLine();
                }
                if (!var6_6.Method389()) continue;
                v6 = new StringBuilder().append(var5_5).append((int)((long)513394961 ^ (long)513394950) << 1).append(var3_4.Method40()).append((int)((long)-1534159088 ^ (long)-1534159097) << 1).append(this.Field11214.Method4003()).append((int)((long)652298726 ^ (long)652298737) << 1).append(var6_6.Method356()).append((char)((int)-1515031145L ^ -1515031126));
                v7 = var6_6.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)v7, (String)"setting.colour");
                var1_1.write(v6.append(ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field11115.Method6139(v7)).toString());
                var1_1.newLine();
            }
            break;
        }
    }

    private final void Method3143() throws IOException {
        if (Files.exists(Paths.get(this.Field11214.Method4001() + this.Field11214.Method4007() + this.Field11214.Method4000(), new String[(int)((long)1102555527 ^ (long)1102555527)]), new LinkOption[(int)((long)494925299 ^ (long)494925299)])) {
            new File(this.Field11214.Method4001() + this.Field11214.Method4007() + this.Field11214.Method4000()).delete();
            return;
        }
        Files.createFile(Paths.get(this.Field11214.Method4001() + this.Field11214.Method4007() + this.Field11214.Method4000(), new String[(int)835613282L ^ 0x31CE7262]), new FileAttribute[(int)((long)778600690 ^ (long)778600690)]);
    }

    @NotNull
    @NotNull
    public final wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz Method3144() {
        return this.Field11214;
    }

    public wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(@NotNull @NotNull wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz2) {
        Intrinsics.checkParameterIsNotNull((Object)wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz2, (String)"config");
        this.Field11214 = wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz2;
    }

    private static String Method3145(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-349135882L ^ 0xEB309BF6;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-963538678 ^ (long)-963538443);
            int n2 = (int)((long)2063727875 ^ (long)2063727964);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)620840847 ^ (long)620843518) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

