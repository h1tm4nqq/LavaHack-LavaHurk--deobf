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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI;
import lavahack.client.qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K;
import lavahack.client.wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2={"Lcom/kisman/cc/util/manager/file/ConfigManager$Save;", "", "config", "Lcom/kisman/cc/util/manager/file/ConfigManager;", "(Lcom/kisman/cc/util/manager/file/ConfigManager;)V", "getConfig", "()Lcom/kisman/cc/util/manager/file/ConfigManager;", "fileCheck", "", "init", "save", "writer", "Ljava/io/BufferedWriter;", "kisman.cc"})
public final class wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV {
    @NotNull
    private final wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz Field17806;
    private String Field17807 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method7717() throws IOException {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6786();
        this.Method7719();
        Closeable closeable = new BufferedWriter(new FileWriter(Paths.get(this.Field17806.Method4001() + this.Field17806.Method4007() + this.Field17806.Method4000(), new String[(int)((long)2107518755 ^ (long)2107518755)]).toFile()));
        int n = (int)546319315L ^ 0x20902BD3;
        Throwable throwable = null;
        BufferedWriter bufferedWriter = (BufferedWriter)closeable;
        int n2 = (int)((long)747788077 ^ (long)747788077);
        this.Method7718(bufferedWriter);
        bufferedWriter = Unit.INSTANCE;
        CloseableKt.closeFinally((Closeable)closeable, (Throwable)throwable);
    }

    /*
     * Unable to fully structure code
     */
    private final void Method7718(BufferedWriter var1_1) throws IOException {
        var3_2 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Field8854.iterator();
        while (true) {
            if (!var3_2.hasNext()) break;
            var2_4 = (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)var3_2.next();
            v0 = var2_4;
            Intrinsics.checkExpressionValueIsNotNull((Object)v0, (String)"module");
            if (v0.Method41() == qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8347) continue;
            var1_1.write(this.Field17806.Method4002() + (((int)1421139111L ^ 1421139120) << 1) + var2_4.Method40() + ".toggle=" + var2_4.Method35());
            var1_1.newLine();
            var1_1.write(this.Field17806.Method4002() + (((int)1140181185L ^ 1140181206) << 1) + var2_4.Method40() + ".hold=" + var2_4.Field8065);
            var1_1.newLine();
            var1_1.write(this.Field17806.Method4002() + ((int)((long)-30167173 ^ (long)-30167188) << 1) + var2_4.Method40() + ".visible=" + var2_4.Method51());
            var1_1.newLine();
            var1_1.write(this.Field17806.Method4002() + (((int)-1687901843L ^ -1687901830) << 1) + var2_4.Method40() + ".key=" + var2_4.Method8());
            var1_1.newLine();
            var1_1.write(this.Field17806.Method4002() + (((int)777193408L ^ 777193431) << 1) + var2_4.Method40() + ".button=" + var2_4.Method10());
            var1_1.newLine();
            var1_1.write(this.Field17806.Method4002() + (((int)300474478L ^ 300474489) << 1) + var2_4.Method40() + ".mouseBind=" + (boolean)(var2_4.Method12() == ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12069 ? (int)752587852L ^ 752587853 : (int)((long)-376241063 ^ (long)-376241063)));
            var1_1.newLine();
            if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258.Method7571((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)var2_4) == null) continue;
            var5_6 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258.Method7571((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)var2_4).iterator();
            while (true) {
                if (!var5_6.hasNext()) ** break;
                var4_5 = (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)var5_6.next();
                if (var4_5 == null || var4_5.Method382()) continue;
                if (var4_5.Method386()) {
                    var1_1.write(this.Field17806.Method4002() + (((int)1835430336L ^ 1835430359) << 1) + var2_4.Method40() + (((int)1845325343L ^ 1845325320) << 1) + this.Field17806.Method4003() + (((int)-1919960361L ^ -1919960384) << 1) + var4_5.Method356() + (char)((int)1580394352L ^ 1580394317) + var4_5.Method365());
                    var1_1.newLine();
                    if (var4_5.Method8() != (int)((long)1989566443 ^ (long)-1989566444)) {
                        var1_1.write(this.Field17806.Method4002() + ((int)((long)540782853 ^ (long)540782866) << 1) + var2_4.Method40() + ((int)((long)37296239 ^ (long)37296248) << 1) + this.Field17806.Method4003() + (((int)347295814L ^ 347295825) << 1) + var4_5.Method356() + ":key=" + var4_5.Method8());
                        var1_1.newLine();
                    }
                    if (var4_5.Method10() != (int)((long)295315271 ^ (long)-295315272)) {
                        var1_1.write(this.Field17806.Method4002() + (((int)-288362641L ^ -288362632) << 1) + var2_4.Method40() + ((int)((long)-2025605907 ^ (long)-2025605894) << 1) + this.Field17806.Method4003() + ((int)((long)-361466713 ^ (long)-361466704) << 1) + var4_5.Method356() + ":button=" + var4_5.Method8());
                        var1_1.newLine();
                    }
                    if (U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Field10935.Method7141(var4_5)) {
                        var1_1.write(this.Field17806.Method4002() + ((int)((long)-840215675 ^ (long)-840215662) << 1) + var2_4.Method40() + (((int)-1321178090L ^ -1321178111) << 1) + this.Field17806.Method4003() + (((int)1575293041L ^ 1575293030) << 1) + var4_5.Method356() + ":mouseBind=" + (boolean)(var4_5.Method12() == ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12069 ? (int)964394135L ^ 964394134 : (int)((long)794091074 ^ (long)794091074)));
                        var1_1.newLine();
                    }
                }
                if (var4_5.Method385()) {
                    var1_1.write(this.Field17806.Method4002() + ((int)((long)584907623 ^ (long)584907632) << 1) + var2_4.Method40() + (((int)-1223371767L ^ -1223371746) << 1) + this.Field17806.Method4003() + ((int)((long)1200459149 ^ (long)1200459162) << 1) + var4_5.Method356() + "=\"" + var4_5.Method359() + (((int)1062460747L ^ 1062460762) << 1));
                    var1_1.newLine();
                    for (String var6_7 : var4_5.Field8115.keySet()) {
                        v1 = new StringBuilder().append(this.Field17806.Method4002()).append(((int)-1714367581L ^ -1714367564) << 1).append(var2_4.Method40()).append((int)((long)2023212701 ^ (long)2023212682) << 1).append(this.Field17806.Method4003()).append(((int)-1188456977L ^ -1188456968) << 1).append(var4_5.Method356()).append((int)((long)1036757700 ^ (long)1036757715) << 1).append(var6_7).append(":key=");
                        v2 = var4_5.Field8115.get(var6_7);
                        if (v2 == null) {
                            Intrinsics.throwNpe();
                        }
                        var1_1.write(v1.append(((g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh)v2).Method8()).toString());
                        var1_1.newLine();
                        v3 = new StringBuilder().append(this.Field17806.Method4002()).append((int)((long)-960118362 ^ (long)-960118351) << 1).append(var2_4.Method40()).append((int)((long)-1146854073 ^ (long)-1146854064) << 1).append(this.Field17806.Method4003()).append(((int)-537091999L ^ -537091978) << 1).append(var4_5.Method356()).append((int)((long)-254365964 ^ (long)-254365981) << 1).append(var6_7).append(":mouse=");
                        v4 = var4_5.Field8115.get(var6_7);
                        if (v4 == null) {
                            Intrinsics.throwNpe();
                        }
                        var1_1.write(v3.append(((g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh)v4).Method10()).toString());
                        var1_1.newLine();
                        var1_1.write(this.Field17806.Method4002() + ((int)((long)1765479113 ^ (long)1765479134) << 1) + var2_4.Method40() + ((int)((long)-1330759562 ^ (long)-1330759583) << 1) + this.Field17806.Method4003() + (((int)-2090326867L ^ -2090326854) << 1) + var4_5.Method356() + (((int)-462134922L ^ -462134943) << 1) + var6_7 + ":mouseBind=" + (boolean)(var4_5.Method12() == ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12069 ? (int)1078069733L ^ 1078069732 : (int)340240455L ^ 340240455));
                        var1_1.newLine();
                    }
                }
                if (var4_5.Method387()) {
                    var1_1.write(this.Field17806.Method4002() + (((int)-1647454372L ^ -1647454389) << 1) + var2_4.Method40() + (((int)1494459909L ^ 1494459922) << 1) + this.Field17806.Method4003() + (((int)768869002L ^ 768869021) << 1) + var4_5.Method356() + (char)((int)-1498758022L ^ -1498758073) + var4_5.Method367());
                    var1_1.newLine();
                }
                if (!var4_5.Method389()) continue;
                v5 = new StringBuilder().append(this.Field17806.Method4002()).append((int)((long)1628777459 ^ (long)1628777444) << 1).append(var2_4.Method40()).append((int)((long)-1168530657 ^ (long)-1168530680) << 1).append(this.Field17806.Method4003()).append(((int)-403795606L ^ -403795587) << 1).append(var4_5.Method356()).append((char)((long)-10141631 ^ (long)-10141572));
                v6 = var4_5.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)v6, (String)"setting.colour");
                var1_1.write(v5.append(ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field11115.Method6139(v6)).toString());
                var1_1.newLine();
            }
            break;
        }
        var3_2 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16257.Field9235.iterator();
        while (true) {
            if (var3_2.hasNext()) {
                var2_4 = (qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2)var3_2.next();
                v7 = new StringBuilder().append(this.Field17806.Method4004()).append(((int)-1126725331L ^ -1126725318) << 1);
                v8 = var2_4;
                Intrinsics.checkExpressionValueIsNotNull((Object)v8, (String)"hud");
                var1_1.write(v7.append(v8.Method40()).append(".toggle=").append(var2_4.Method35()).toString());
                var1_1.newLine();
                var1_1.write(this.Field17806.Method4004() + ((int)((long)2080296565 ^ (long)2080296546) << 1) + var2_4.Method40() + ".hold=" + var2_4.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E);
                var1_1.newLine();
                var1_1.write(this.Field17806.Method4004() + (((int)213512335L ^ 213512344) << 1) + var2_4.Method40() + ".visible=" + var2_4.Method51());
                var1_1.newLine();
                var1_1.write(this.Field17806.Method4004() + (((int)-1316439807L ^ -1316439786) << 1) + var2_4.Method40() + ".key=" + var2_4.Method33());
                var1_1.newLine();
                var1_1.write(this.Field17806.Method4004() + ((int)((long)-1312929697 ^ (long)-1312929720) << 1) + var2_4.Method40() + ".key=" + var2_4.Method8());
                var1_1.newLine();
                var1_1.write(this.Field17806.Method4004() + ((int)((long)699823142 ^ (long)699823153) << 1) + var2_4.Method40() + ".button=" + var2_4.Method10());
                var1_1.newLine();
                var1_1.write(this.Field17806.Method4004() + (((int)-855083171L ^ -855083190) << 1) + var2_4.Method40() + ".mouseBind=" + (boolean)(var2_4.Method12() == ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12069 ? (int)((long)773926122 ^ (long)773926123) : (int)846863424L ^ 846863424));
                var1_1.newLine();
                var1_1.write(this.Field17806.Method4004() + (((int)349532463L ^ 349532472) << 1) + var2_4.Method40() + ".x=" + var2_4.Method267());
                var1_1.newLine();
                var1_1.write(this.Field17806.Method4004() + ((int)((long)-374278197 ^ (long)-374278180) << 1) + var2_4.Method40() + ".y=" + var2_4.Method268());
                var1_1.newLine();
                if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258.Method7571((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)var2_4) == null) continue;
            } else {
                var1_1.write(this.Field17806.Method4005() + ".color=" + ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field11115.Method6139(leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16263.Method6671()));
                var1_1.newLine();
                v9 = n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI.Field11086;
                Intrinsics.checkExpressionValueIsNotNull((Object)v9, (String)"FriendManager.instance");
                v10 = v9.Method3039();
                Intrinsics.checkExpressionValueIsNotNull((Object)v10, (String)"FriendManager.instance.friends");
                var2_4 = v10;
                var3_3 = (int)((long)-1949910997 ^ (long)-1949910997);
                if (!var2_4.isEmpty()) {
                    v11 = (int)-413021701L ^ -413021702;
                    return;
                }
                v11 = (int)((long)1732368632 ^ (long)1732368632);
                return;
            }
            var5_6 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258.Method7571((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)var2_4).iterator();
            while (true) {
                if (!var5_6.hasNext()) ** break;
                var4_5 = (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)var5_6.next();
                if (var4_5 == null || var4_5.Method382()) continue;
                if (var4_5.Method386()) {
                    var1_1.write(this.Field17806.Method4004() + (((int)873755308L ^ 873755323) << 1) + var2_4.Method40() + (((int)-305130392L ^ -305130369) << 1) + this.Field17806.Method4003() + ((int)((long)1320059034 ^ (long)1320059021) << 1) + var4_5.Method356() + (char)((int)570691807L ^ 570691810) + var4_5.Method365());
                    var1_1.newLine();
                    if (var4_5.Method8() != (int)((long)-409740860 ^ (long)409740859)) {
                        var1_1.write(this.Field17806.Method4004() + ((int)((long)-1639985663 ^ (long)-1639985642) << 1) + var2_4.Method40() + (((int)878874490L ^ 878874477) << 1) + this.Field17806.Method4003() + (((int)843944475L ^ 843944460) << 1) + var4_5.Method356() + ":key=" + var4_5.Method8());
                        var1_1.newLine();
                    }
                    if (var4_5.Method10() != ((int)-1175657679L ^ 1175657678)) {
                        var1_1.write(this.Field17806.Method4004() + ((int)((long)865991880 ^ (long)865991903) << 1) + var2_4.Method40() + ((int)((long)-1988499422 ^ (long)-1988499403) << 1) + this.Field17806.Method4003() + ((int)((long)-864310610 ^ (long)-864310599) << 1) + var4_5.Method356() + ":button=" + var4_5.Method10());
                        var1_1.newLine();
                    }
                    if (U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Field10935.Method7141(var4_5)) {
                        var1_1.write(this.Field17806.Method4004() + ((int)((long)-1357210617 ^ (long)-1357210608) << 1) + var2_4.Method40() + (((int)-1792296135L ^ -1792296146) << 1) + this.Field17806.Method4003() + ((int)((long)707163136 ^ (long)707163159) << 1) + var4_5.Method356() + ":mouseBind=" + (boolean)(var4_5.Method12() == ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12069 ? (int)((long)-580894717 ^ (long)-580894718) : (int)2088694433L ^ 2088694433));
                        var1_1.newLine();
                    }
                }
                if (var4_5.Method385()) {
                    var1_1.write(this.Field17806.Method4004() + ((int)((long)1758807995 ^ (long)1758807980) << 1) + var2_4.Method40() + ((int)((long)-754416560 ^ (long)-754416569) << 1) + this.Field17806.Method4003() + ((int)((long)-1467850275 ^ (long)-1467850294) << 1) + var4_5.Method356() + "=\"" + var4_5.Method359() + (((int)1303198795L ^ 1303198810) << 1));
                    var1_1.newLine();
                    for (String var6_7 : var4_5.Field8115.keySet()) {
                        v12 = new StringBuilder().append(this.Field17806.Method4004()).append(((int)-6137807L ^ -6137818) << 1).append(var2_4.Method40()).append((int)((long)-300018014 ^ (long)-300017995) << 1).append(this.Field17806.Method4003()).append((int)((long)-272131213 ^ (long)-272131228) << 1).append(var4_5.Method356()).append(((int)1701343254L ^ 1701343233) << 1).append(var6_7).append(":key=");
                        v13 = var4_5.Field8115.get(var6_7);
                        if (v13 == null) {
                            Intrinsics.throwNpe();
                        }
                        var1_1.write(v12.append(((g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh)v13).Method8()).toString());
                        var1_1.newLine();
                        v14 = new StringBuilder().append(this.Field17806.Method4004()).append((int)((long)-147020052 ^ (long)-147020037) << 1).append(var2_4.Method40()).append((int)((long)1973490676 ^ (long)1973490659) << 1).append(this.Field17806.Method4003()).append((int)((long)1792275522 ^ (long)1792275541) << 1).append(var4_5.Method356()).append((int)((long)-1610499811 ^ (long)-1610499830) << 1).append(var6_7).append(":mouse=");
                        v15 = var4_5.Field8115.get(var6_7);
                        if (v15 == null) {
                            Intrinsics.throwNpe();
                        }
                        var1_1.write(v14.append(((g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh)v15).Method10()).toString());
                        var1_1.newLine();
                        var1_1.write(this.Field17806.Method4004() + (((int)-468185339L ^ -468185326) << 1) + var2_4.Method40() + (((int)-901429661L ^ -901429644) << 1) + this.Field17806.Method4003() + ((int)((long)-325816337 ^ (long)-325816328) << 1) + var4_5.Method356() + ((int)((long)1305700548 ^ (long)1305700563) << 1) + var6_7 + ":mouseBind=" + (boolean)(var4_5.Method12() == ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12069 ? (int)-869506398L ^ -869506397 : (int)((long)1979560285 ^ (long)1979560285)));
                        var1_1.newLine();
                    }
                }
                if (var4_5.Method387()) {
                    var1_1.write(this.Field17806.Method4004() + ((int)((long)-1382831076 ^ (long)-1382831093) << 1) + var2_4.Method40() + (((int)-1123126192L ^ -1123126201) << 1) + this.Field17806.Method4003() + ((int)((long)542743740 ^ (long)542743723) << 1) + var4_5.Method356() + (char)((long)1727820849 ^ (long)1727820812) + var4_5.Method367());
                    var1_1.newLine();
                }
                if (!var4_5.Method389()) continue;
                v16 = new StringBuilder().append(this.Field17806.Method4004()).append((int)((long)-266737201 ^ (long)-266737192) << 1).append(var2_4.Method40()).append(((int)1134532886L ^ 1134532865) << 1).append(this.Field17806.Method4003()).append((int)((long)598783918 ^ (long)598783929) << 1).append(var4_5.Method356()).append((char)((int)-231119155L ^ -231119120));
                v17 = var4_5.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)v17, (String)"setting.colour");
                var1_1.write(v16.append(ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field11115.Method6139(v17)).toString());
                var1_1.newLine();
            }
            break;
        }
    }

    private final void Method7719() throws IOException {
        if (Files.exists(Paths.get(this.Field17806.Method4001() + this.Field17806.Method4007() + this.Field17806.Method4000(), new String[(int)((long)-1057160202 ^ (long)-1057160202)]), new LinkOption[(int)-1433812637L ^ 0xAA89C163])) {
            new File(this.Field17806.Method4001() + this.Field17806.Method4007() + this.Field17806.Method4000()).delete();
            return;
        }
        Files.createFile(Paths.get(this.Field17806.Method4001() + this.Field17806.Method4007() + this.Field17806.Method4000(), new String[(int)((long)-2125759011 ^ (long)-2125759011)]), new FileAttribute[(int)1383225344L ^ 0x52725800]);
    }

    @NotNull
    @NotNull
    public final wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz Method7720() {
        return this.Field17806;
    }

    public wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(@NotNull @NotNull wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz2) {
        Intrinsics.checkParameterIsNotNull((Object)wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz2, (String)"config");
        this.Field17806 = wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz2;
    }

    private static String Method7721(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)482404620L ^ 0x1CC0E90C;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-481284304L ^ 0xE3502FCF);
            int n2 = (int)-722762232L ^ 0xD4EB864F;
            cArray2[n] = (char)(cArray[n] ^ (((int)-2083704991L ^ 0x83CD2FD6) << 7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

