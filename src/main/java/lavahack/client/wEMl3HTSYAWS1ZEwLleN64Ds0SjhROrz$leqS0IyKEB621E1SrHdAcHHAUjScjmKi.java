/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.io.CloseableKt
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.Ref$ObjectRef
 *  kotlin.text.StringsKt
 */
package lavahack.client;

import com.kisman.cc.util.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI;
import lavahack.client.ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K;
import lavahack.client.wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/util/manager/file/ConfigManager$Load;", "", "config", "Lcom/kisman/cc/util/manager/file/ConfigManager;", "(Lcom/kisman/cc/util/manager/file/ConfigManager;)V", "getConfig", "()Lcom/kisman/cc/util/manager/file/ConfigManager;", "init", "", "load", "reader", "Ljava/io/BufferedReader;", "kisman.cc"})
public final class wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    @NotNull
    private final wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz Field9158;
    private int Field9159;

    public final void Method1420() throws IOException {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16250 = this.Field9158.Method4007();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6786();
        if (!Files.exists(Paths.get(this.Field9158.Method4001() + this.Field9158.Method4007() + this.Field9158.Method4000(), new String[(int)((long)1908589809 ^ (long)1908589809)]), new LinkOption[(int)((long)-426033695 ^ (long)-426033695)])) {
            return;
        }
        Closeable closeable = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get(this.Field9158.Method4001() + this.Field9158.Method4007() + this.Field9158.Method4000(), new String[(int)859459215L ^ 0x333A4E8F]), new OpenOption[(int)((long)-1409617060 ^ (long)-1409617060)])));
        int n = (int)((long)-1081438476 ^ (long)-1081438476);
        Throwable throwable = null;
        BufferedReader bufferedReader = (BufferedReader)closeable;
        int n2 = (int)-170959929L ^ 0xF5CF5BC7;
        this.Method1421(bufferedReader);
        bufferedReader = Unit.INSTANCE;
        CloseableKt.closeFinally((Closeable)closeable, (Throwable)throwable);
    }

    /*
     * Unable to fully structure code
     */
    public final void Method1421(@NotNull @NotNull BufferedReader var1_1) throws IOException {
        Intrinsics.checkParameterIsNotNull((Object)var1_1, (String)"reader");
        var2_2 = new Ref.ObjectRef();
        block23: while (true) {
            block70: {
                block72: {
                    block75: {
                        block73: {
                            block74: {
                                block71: {
                                    block64: {
                                        block66: {
                                            block69: {
                                                block67: {
                                                    block68: {
                                                        block65: {
                                                            var3_3 = var1_1.readLine();
                                                            var4_5 = (int)((long)-896844219 ^ (long)-896844219);
                                                            var5_7 = (int)((long)587804787 ^ (long)587804787);
                                                            var6_8 = var3_3;
                                                            var7_9 = (int)1479734031L ^ 1479734031;
                                                            var2_2.element = var6_8;
                                                            if (var3_3 == null) return;
                                                            v0 = (String)var2_2.element;
                                                            if (v0 != null) {
                                                                v1 = new String[(int)((long)35638674 ^ (long)35638675)];
                                                                v1[(int)-1931500977L ^ -1931500977] = "=";
                                                                v2 = StringsKt.split$default((CharSequence)v0, (String[])v1, (boolean)((long)-1476021378 ^ (long)-1476021378), (int)((int)((long)-717828204 ^ (long)-717828204)), (int)(((int)-2025048118L ^ -2025048119) << 1), null);
                                                            } else {
                                                                v2 = null;
                                                            }
                                                            if ((v3 = (var3_3 = v2)) != null && (v3 = (String)v3.get((int)((long)-1439011858 ^ (long)-1439011858))) != null) {
                                                                v4 = new String[(int)((long)391068116 ^ (long)391068117)];
                                                                v4[(int)((long)1007978475 ^ (long)1007978475)] = ".";
                                                                v5 = StringsKt.split$default((CharSequence)v3, (String[])v4, (boolean)((int)-657639711L ^ -657639711), (int)((int)68744716L ^ 68744716), (int)(((int)-460786255L ^ -460786254) << 1), null);
                                                            } else {
                                                                v5 = null;
                                                            }
                                                            v6 = var4_4 = v5;
                                                            v7 = var5_6 = v6 != null ? (String)v6.get((int)((long)1844077693 ^ (long)1844077693)) : null;
                                                            if (!Intrinsics.areEqual((Object)var5_6, (Object)this.Field9158.Method4002())) break block64;
                                                            var6_8 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1163((String)var4_4.get((int)-536032180L ^ -536032179), (boolean)((long)-1571184823 ^ (long)-1571184823), (boolean)((int)1417895760L ^ 1417895760));
                                                            if (var6_8 == null) continue;
                                                            var7_10 = (String)var4_4.get((int)((long)1280751274 ^ (long)1280751275) << 1);
                                                            if (Intrinsics.areEqual((Object)var7_10, (Object)"toggle")) {
                                                                var8_12 = Boolean.parseBoolean((String)var3_3.get((int)((long)-991341749 ^ (long)-991341750)));
                                                                if (var6_8.Method35() == var8_12) continue;
                                                                var6_8.Method21(var8_12);
                                                                continue;
                                                            }
                                                            if (Intrinsics.areEqual((Object)var7_10, (Object)"hold")) {
                                                                var6_8.Field8065 = Boolean.parseBoolean((String)var3_3.get((int)((long)2133908244 ^ (long)2133908245)));
                                                                continue;
                                                            }
                                                            if (Intrinsics.areEqual((Object)var7_10, (Object)"visible")) {
                                                                var6_8.Field8064 = Boolean.parseBoolean((String)var3_3.get((int)399693336L ^ 399693337));
                                                                continue;
                                                            }
                                                            if (Intrinsics.areEqual((Object)var7_10, (Object)"key")) {
                                                                var6_8.Method9(Integer.parseInt((String)var3_3.get((int)941200027L ^ 941200026)));
                                                                continue;
                                                            }
                                                            if (Intrinsics.areEqual((Object)var7_10, (Object)"button")) {
                                                                var6_8.Method11(Integer.parseInt((String)var3_3.get((int)-1357484559L ^ -1357484560)));
                                                                continue;
                                                            }
                                                            if (Intrinsics.areEqual((Object)var7_10, (Object)"mouseBind")) {
                                                                var6_8.Method13(Boolean.parseBoolean((String)var3_3.get((int)486175658L ^ 486175659)) != false ? ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12069 : ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12068);
                                                                continue;
                                                            }
                                                            if (!Intrinsics.areEqual((Object)var7_10, (Object)this.Field9158.Method4003())) continue;
                                                            var8_12 = StringsKt.contains$default((CharSequence)((CharSequence)var4_4.get((int)-1220128924L ^ -1220128921)), (CharSequence)":", (boolean)((long)-1009635532 ^ (long)-1009635532), (int)((int)((long)-31706596 ^ (long)-31706595) << 1), null);
                                                            v8 = var9_13 = var4_4.size() > ((int)-958794691L ^ -958794692) << 2 ? (int)StringsKt.contains$default((CharSequence)((CharSequence)var4_4.get(((int)1638793320L ^ 1638793321) << 2)), (CharSequence)":", (boolean)((long)86716249 ^ (long)86716249), (int)((int)((long)-597039795 ^ (long)-597039796) << 1), null) : (int)((long)-119643732 ^ (long)-119643732);
                                                            if (var8_12) break block65;
                                                            var10_14 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258.Method7573((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)var6_8, (String)var4_4.get((int)((long)996905457 ^ (long)996905458)), (boolean)((int)2025065557L ^ 2025065556));
                                                            if (var10_14 == null) continue;
                                                            break block66;
                                                        }
                                                        if (var8_12) {
                                                            v9 = new String[(int)-1328419307L ^ -1328419308];
                                                            v9[(int)((long)-432205469 ^ (long)-432205469)] = ":";
                                                            v10 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258.Method7573((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)var6_8, (String)StringsKt.split$default((CharSequence)((CharSequence)var4_4.get((int)((long)-1197062500 ^ (long)-1197062497))), (String[])v9, (boolean)((long)-1562521702 ^ (long)-1562521702), (int)((int)((long)-1414017833 ^ (long)-1414017833)), (int)((int)((long)-1194630726 ^ (long)-1194630727) << 1), null).get((int)((long)1788634059 ^ (long)1788634059)), (boolean)((int)1272133962L ^ 1272133963));
                                                        } else {
                                                            v10 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258.Method7573((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)var6_8, (String)var4_4.get((int)((long)449691138 ^ (long)449691137)), (boolean)((int)607425408L ^ 607425409));
                                                        }
                                                        if ((var10_14 = v10) == null || var10_14.Method382()) continue;
                                                        if (var8_12) {
                                                            v11 = new String[(int)-34730056L ^ -34730055];
                                                            v11[(int)((long)-526848599 ^ (long)-526848599)] = ":";
                                                            v12 = StringsKt.split$default((CharSequence)((CharSequence)var4_4.get((int)297833461L ^ 297833462)), (String[])v11, (boolean)((long)1429133748 ^ (long)1429133748), (int)((int)-1110703360L ^ -1110703360), (int)((int)((long)-612470278 ^ (long)-612470279) << 1), null);
                                                        } else {
                                                            v13 = new String[(int)((long)-1020618899 ^ (long)-1020618900)];
                                                            v13[(int)((long)-1298506969 ^ (long)-1298506969)] = ":";
                                                            v12 = var11_15 = StringsKt.split$default((CharSequence)((CharSequence)var4_4.get(((int)-977502258L ^ -977502257) << 2)), (String[])v13, (boolean)((long)-1654140808 ^ (long)-1654140808), (int)((int)-991421629L ^ -991421629), (int)((int)((long)1603650144 ^ (long)1603650147) << 1), null);
                                                        }
                                                        if (!var10_14.Method386()) break block67;
                                                        var12_16 = (String)var11_15.get((int)-1532678722L ^ -1532678721);
                                                        switch (var12_16.hashCode()) {
                                                            case -1377687758: {
                                                                if (!var12_16.equals("button")) continue block23;
                                                                break;
                                                            }
                                                            case 585824898: {
                                                                if (!var12_16.equals("mouseBind")) continue block23;
                                                                break block68;
                                                            }
                                                            case 106079: {
                                                                if (!var12_16.equals("key")) continue block23;
                                                                var10_14.Method9(Integer.parseInt((String)var3_3.get((int)((long)773105851 ^ (long)773105850))));
                                                                continue block23;
                                                            }
                                                        }
                                                        var10_14.Method11(Integer.parseInt((String)var3_3.get((int)((long)-886672383 ^ (long)-886672384))));
                                                        continue;
                                                    }
                                                    var10_14.Method13(Boolean.parseBoolean((String)var3_3.get((int)-849731984L ^ -849731983)) != false ? ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12069 : ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12068);
                                                    continue;
                                                }
                                                if (!var10_14.Method385() || !var10_14.Field8115.containsKey(var12_16 = (String)var11_15.get((int)1939362025L ^ 1939362025))) continue;
                                                var13_17 = (String)var11_15.get((int)-909915335L ^ -909915336);
                                                switch (var13_17.hashCode()) {
                                                    case -1377687758: {
                                                        if (!var13_17.equals("button")) ** break;
                                                        break;
                                                    }
                                                    case 585824898: {
                                                        if (!var13_17.equals("mouseBind")) ** break;
                                                        break block69;
                                                    }
                                                    case 106079: {
                                                        if (!var13_17.equals("key")) ** break;
                                                        v14 = (g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh)var10_14.Field8115.get(var12_16);
                                                        if (v14 != null) {
                                                            v14.Method9(Integer.parseInt((String)var3_3.get((int)-62342328L ^ -62342327)));
                                                            v15 = Unit.INSTANCE;
                                                            continue block23;
                                                        }
                                                        v15 = null;
                                                        ** break;
                                                    }
                                                }
                                                v16 = (g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh)var10_14.Field8115.get(var12_16);
                                                if (v16 != null) {
                                                    v16.Method11(Integer.parseInt((String)var3_3.get((int)-1286281025L ^ -1286281026)));
                                                    v17 = Unit.INSTANCE;
                                                    continue;
                                                }
                                                v17 = null;
                                                ** break;
                                            }
                                            v18 = (g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh)var10_14.Field8115.get(var12_16);
                                            if (v18 != null) {
                                                v18.Method13(Boolean.parseBoolean((String)var3_3.get((int)((long)1784501892 ^ (long)1784501893))) != false ? ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12069 : ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12068);
                                                v19 = Unit.INSTANCE;
                                                continue;
                                            }
                                            v19 = null;
                                            ** break;
lbl137:
                                            // 7 sources

                                            continue;
                                        }
                                        if (var10_14.Method382()) continue;
                                        if (var10_14.Method386()) {
                                            var10_14.Method366(Boolean.parseBoolean((String)var3_3.get((int)-2069493754L ^ -2069493753)));
                                        }
                                        if (var10_14.Method385()) {
                                            v20 = new String[(int)487700217L ^ 487700216];
                                            v20[(int)-1271519482L ^ -1271519482] = "\"";
                                            if (var10_14.Field8115.containsKey(StringsKt.split$default((CharSequence)((CharSequence)var3_3.get((int)-325599001L ^ -325599002)), (String[])v20, (boolean)((long)1000609113 ^ (long)1000609113), (int)((int)-1374123634L ^ -1374123634), (int)(((int)2108878949L ^ 2108878950) << 1), null).get((int)1033119696L ^ 1033119697))) {
                                                v21 = new String[(int)((long)1099498634 ^ (long)1099498635)];
                                                v21[(int)498717458L ^ 498717458] = "\"";
                                                var10_14.Method360((String)StringsKt.split$default((CharSequence)((CharSequence)var3_3.get((int)-139190829L ^ -139190830)), (String[])v21, (boolean)((int)-139531586L ^ -139531586), (int)((int)((long)128499541 ^ (long)128499541)), (int)(((int)-1106334530L ^ -1106334531) << 1), null).get((int)-742396602L ^ -742396601));
                                            }
                                        }
                                        if (var10_14.Method387()) {
                                            var10_14.Method370(Double.parseDouble((String)var3_3.get((int)-128771460L ^ -128771459)));
                                        }
                                        if (!var10_14.Method389()) continue;
                                        v22 = (String)var3_3.get((int)1973735200L ^ 1973735201);
                                        v23 = var10_14.Method339();
                                        Intrinsics.checkExpressionValueIsNotNull((Object)v23, (String)"setting.colour");
                                        var10_14.Method340(ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field11115.Method6140(v22, v23));
                                        continue;
                                    }
                                    if (!Intrinsics.areEqual((Object)var5_6, (Object)this.Field9158.Method4004())) break block70;
                                    var6_8 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16257.Method1523((String)var4_4.get((int)-895345458L ^ -895345457));
                                    if (var6_8 == null) continue;
                                    var7_11 = (String)var4_4.get(((int)-1614539222L ^ -1614539221) << 1);
                                    if (Intrinsics.areEqual((Object)var7_11, (Object)"toggle")) {
                                        var8_12 = Boolean.parseBoolean((String)var3_3.get((int)((long)-1600586531 ^ (long)-1600586532)));
                                        if (var6_8.Method35() == var8_12) continue;
                                        var6_8.Method21(var8_12);
                                        continue;
                                    }
                                    if (Intrinsics.areEqual((Object)var7_11, (Object)"hold")) {
                                        var6_8.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E = Boolean.parseBoolean((String)var3_3.get((int)((long)2032913761 ^ (long)2032913760)));
                                        continue;
                                    }
                                    if (Intrinsics.areEqual((Object)var7_11, (Object)"visible")) {
                                        var6_8.Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro = Boolean.parseBoolean((String)var3_3.get((int)((long)200983923 ^ (long)200983922)));
                                        continue;
                                    }
                                    if (Intrinsics.areEqual((Object)var7_11, (Object)"key")) {
                                        var6_8.Method9(Integer.parseInt((String)var3_3.get((int)((long)-2118082888 ^ (long)-2118082887))));
                                        continue;
                                    }
                                    if (Intrinsics.areEqual((Object)var7_11, (Object)"button")) {
                                        var6_8.Method11(Integer.parseInt((String)var3_3.get((int)((long)1888524731 ^ (long)1888524730))));
                                        continue;
                                    }
                                    if (Intrinsics.areEqual((Object)var7_11, (Object)"mouseBind")) {
                                        var6_8.Method13(Boolean.parseBoolean((String)var3_3.get((int)((long)1627245088 ^ (long)1627245089))) != false ? ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12069 : ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12068);
                                        continue;
                                    }
                                    if (Intrinsics.areEqual((Object)var7_11, (Object)"x")) {
                                        var6_8.Method271(Double.parseDouble((String)var3_3.get((int)((long)1553584311 ^ (long)1553584310))));
                                        continue;
                                    }
                                    if (Intrinsics.areEqual((Object)var7_11, (Object)"y")) {
                                        var6_8.Method272(Double.parseDouble((String)var3_3.get((int)((long)383083927 ^ (long)383083926))));
                                        continue;
                                    }
                                    if (!Intrinsics.areEqual((Object)var7_11, (Object)this.Field9158.Method4003())) continue;
                                    var8_12 = StringsKt.contains$default((CharSequence)((CharSequence)var4_4.get((int)((long)-1342968516 ^ (long)-1342968513))), (CharSequence)":", (boolean)((int)1707230433L ^ 1707230433), (int)((int)((long)-1680385904 ^ (long)-1680385903) << 1), null);
                                    v24 = var9_13 = var4_4.size() > (int)((long)1294284744 ^ (long)1294284745) << 2 ? (int)StringsKt.contains$default((CharSequence)((CharSequence)var4_4.get(((int)-691133093L ^ -691133094) << 2)), (CharSequence)":", (boolean)((long)-1592772249 ^ (long)-1592772249), (int)((int)((long)2023146773 ^ (long)2023146772) << 1), null) : (int)((long)-1753180132 ^ (long)-1753180132);
                                    if (var8_12) break block71;
                                    var10_14 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258.Method7573((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)var6_8, (String)var4_4.get((int)((long)2122548137 ^ (long)2122548138)), (boolean)((int)-1591544523L ^ -1591544524));
                                    if (var10_14 == null) continue;
                                    break block72;
                                }
                                if (var8_12) {
                                    v25 = new String[(int)-1279375414L ^ -1279375413];
                                    v25[(int)687270012L ^ 687270012] = ":";
                                    v26 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258.Method7573((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)var6_8, (String)StringsKt.split$default((CharSequence)((CharSequence)var4_4.get((int)1697772453L ^ 1697772454)), (String[])v25, (boolean)((long)393226007 ^ (long)393226007), (int)((int)-2031287599L ^ -2031287599), (int)(((int)1655296981L ^ 1655296982) << 1), null).get((int)((long)547836272 ^ (long)547836272)), (boolean)((long)-797532003 ^ (long)-797532004));
                                } else {
                                    v26 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258.Method7573((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)var6_8, (String)var4_4.get((int)-1831761211L ^ -1831761210), (boolean)((int)-76295801L ^ -76295802));
                                }
                                if ((var10_14 = v26) == null || var10_14.Method382()) continue;
                                if (var8_12) {
                                    v27 = new String[(int)((long)-1475059464 ^ (long)-1475059463)];
                                    v27[(int)-1541347762L ^ -1541347762] = ":";
                                    v28 = StringsKt.split$default((CharSequence)((CharSequence)var4_4.get((int)-424830796L ^ -424830793)), (String[])v27, (boolean)((int)-1111783590L ^ -1111783590), (int)((int)((long)-2026208975 ^ (long)-2026208975)), (int)((int)((long)2034730370 ^ (long)2034730369) << 1), null);
                                } else {
                                    v29 = new String[(int)1611707201L ^ 1611707200];
                                    v29[(int)-453874921L ^ -453874921] = ":";
                                    v28 = var11_15 = StringsKt.split$default((CharSequence)((CharSequence)var4_4.get(((int)31551481L ^ 31551480) << 2)), (String[])v29, (boolean)((long)-1044512787 ^ (long)-1044512787), (int)((int)-1204263099L ^ -1204263099), (int)(((int)-1445541709L ^ -1445541712) << 1), null);
                                }
                                if (!var10_14.Method386()) break block73;
                                var12_16 = (String)var11_15.get((int)203551962L ^ 203551963);
                                switch (var12_16.hashCode()) {
                                    case -1377687758: {
                                        if (!var12_16.equals("button")) continue block23;
                                        break;
                                    }
                                    case 585824898: {
                                        if (!var12_16.equals("mouseBind")) continue block23;
                                        break block74;
                                    }
                                    case 106079: {
                                        if (!var12_16.equals("key")) continue block23;
                                        var10_14.Method9(Integer.parseInt((String)var3_3.get((int)-1786004521L ^ -1786004522)));
                                        continue block23;
                                    }
                                }
                                var10_14.Method11(Integer.parseInt((String)var3_3.get((int)1291367870L ^ 1291367871)));
                                continue;
                            }
                            var10_14.Method13(Boolean.parseBoolean((String)var3_3.get((int)430411349L ^ 430411348)) != false ? ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12069 : ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12068);
                            continue;
                        }
                        if (!var10_14.Method385() || !var10_14.Field8115.containsKey(var12_16 = (String)var11_15.get((int)-1505943370L ^ -1505943370))) continue;
                        var13_17 = (String)var11_15.get((int)((long)-1246565656 ^ (long)-1246565655));
                        switch (var13_17.hashCode()) {
                            case -1377687758: {
                                if (!var13_17.equals("button")) ** break;
                                break;
                            }
                            case 585824898: {
                                if (!var13_17.equals("mouseBind")) ** break;
                                break block75;
                            }
                            case 106079: {
                                if (!var13_17.equals("key")) ** break;
                                v30 = (g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh)var10_14.Field8115.get(var12_16);
                                if (v30 != null) {
                                    v30.Method9(Integer.parseInt((String)var3_3.get((int)((long)-471943112 ^ (long)-471943111))));
                                    v31 = Unit.INSTANCE;
                                    continue block23;
                                }
                                v31 = null;
                                ** break;
                            }
                        }
                        v32 = (g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh)var10_14.Field8115.get(var12_16);
                        if (v32 != null) {
                            v32.Method11(Integer.parseInt((String)var3_3.get((int)-25508129L ^ -25508130)));
                            v33 = Unit.INSTANCE;
                            continue;
                        }
                        v33 = null;
                        ** break;
                    }
                    v34 = (g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh)var10_14.Field8115.get(var12_16);
                    if (v34 != null) {
                        v34.Method13(Boolean.parseBoolean((String)var3_3.get((int)121006231L ^ 121006230)) != false ? ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12069 : ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12068);
                        v35 = Unit.INSTANCE;
                        continue;
                    }
                    v35 = null;
                    ** break;
lbl280:
                    // 7 sources

                    continue;
                }
                if (var10_14.Method382()) continue;
                if (var10_14.Method386()) {
                    var10_14.Method366(Boolean.parseBoolean((String)var3_3.get((int)-823206782L ^ -823206781)));
                }
                if (var10_14.Method385()) {
                    v36 = new String[(int)((long)473167142 ^ (long)473167143)];
                    v36[(int)953939467L ^ 953939467] = "\"";
                    var10_14.Method360((String)StringsKt.split$default((CharSequence)((CharSequence)var3_3.get((int)((long)408413236 ^ (long)408413237))), (String[])v36, (boolean)((long)-1029579335 ^ (long)-1029579335), (int)((int)((long)-85873459 ^ (long)-85873459)), (int)(((int)113696829L ^ 113696830) << 1), null).get((int)((long)-636692087 ^ (long)-636692088)));
                }
                if (var10_14.Method387()) {
                    var10_14.Method370(Double.parseDouble((String)var3_3.get((int)((long)1207859778 ^ (long)1207859779))));
                }
                if (!var10_14.Method389()) continue;
                v37 = (String)var3_3.get((int)225733611L ^ 225733610);
                v38 = var10_14.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)v38, (String)"setting.colour");
                var10_14.Method340(ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field11115.Method6140(v37, v38));
                continue;
            }
            if (Intrinsics.areEqual((Object)var5_6, (Object)this.Field9158.Method4005())) {
                var6_8 = (String)var4_4.get((int)((long)2013613360 ^ (long)2013613361));
                switch (var6_8.hashCode()) {
                    case 94842723: {
                        if (!var6_8.equals("color")) continue block23;
                        v39 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16263.Method6673().Method5387();
                        v40 = (String)var3_3.get((int)((long)1284479271 ^ (long)1284479270));
                        v41 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16263.Method6673().Method5387().Method339();
                        Intrinsics.checkExpressionValueIsNotNull((Object)v41, (String)"Kisman.instance.halqHudG\u2026Frame.colorSetting.colour");
                        v39.Method340(ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field11115.Method6140(v40, v41));
                        continue block23;
                    }
                }
                continue;
            }
            if (!Intrinsics.areEqual((Object)var5_6, (Object)this.Field9158.Method4006())) continue;
            v42 = new String[(int)((long)1209594044 ^ (long)1209594045)];
            v42[(int)-1491191801L ^ -1491191801] = "\"";
            n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI.Field11086.Method3040((String)StringsKt.split$default((CharSequence)((CharSequence)var3_3.get((int)-125832582L ^ -125832581)), (String[])v42, (boolean)((long)-385596388 ^ (long)-385596388), (int)((int)-1277848983L ^ -1277848983), (int)(((int)-224406513L ^ -224406516) << 1), null).get((int)-69013972L ^ -69013971));
        }
    }

    @NotNull
    @NotNull
    public final wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz Method1422() {
        return this.Field9158;
    }

    public wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz2) {
        Intrinsics.checkParameterIsNotNull((Object)wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz2, (String)"config");
        this.Field9158 = wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz2;
    }

    private static String Method1423(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-2147088878L ^ 0x80060612;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1511763714 ^ (long)-1511763967);
            int n2 = ((int)87525099L ^ 0x53786E6) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-40621357L ^ 0xFD9429EA) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

