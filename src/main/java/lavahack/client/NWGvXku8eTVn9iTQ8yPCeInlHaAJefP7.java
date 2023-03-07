/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.NoWhenBranchMatchedException
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.BGULmvqqNlxlHI2oJs1L97aRSbuIjAmr;
import lavahack.client.HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU;
import lavahack.client.m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J0\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J;\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0017JS\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u0018J\u001e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006J&\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ6\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ)\u0010\u000f\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0019J1\u0010\u000f\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u001aJA\u0010\u000f\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u001bJ8\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J(\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u00a8\u0006 "}, d2={"Lcom/kisman/cc/util/render/ChromaColorHelper;", "", "()V", "astolfo", "Lcom/kisman/cc/util/Colour;", "hOffset", "", "sat", "", "bright", "speed", "", "fade", "color", "minBright", "getColor", "staticColor", "pulsiveColors", "", "type", "Lcom/kisman/cc/util/enums/ChromaColorTypes;", "hOffsetRaw", "hOffsetModifier", "(Lcom/kisman/cc/util/Colour;[Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/enums/ChromaColorTypes;II)Lcom/kisman/cc/util/Colour;", "(Lcom/kisman/cc/util/Colour;[Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/enums/ChromaColorTypes;IIFFD)Lcom/kisman/cc/util/Colour;", "([Lcom/kisman/cc/util/Colour;II)Lcom/kisman/cc/util/Colour;", "([Lcom/kisman/cc/util/Colour;IID)Lcom/kisman/cc/util/Colour;", "([Lcom/kisman/cc/util/Colour;IIFFD)Lcom/kisman/cc/util/Colour;", "pulsive", "color1", "color2", "rainbow", "kisman.cc"})
public final class NWGvXku8eTVn9iTQ8yPCeInlHaAJefP7 {
    public static final NWGvXku8eTVn9iTQ8yPCeInlHaAJefP7 Field15802;
    private String Field15803 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method6449(@NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray, int n, int n2, float f, float f2, double d) {
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray, (String)"pulsiveColors");
        return this.Method6456(null, vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray, m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs.Field8720, n, n2, f, f2, d);
    }

    @NotNull
    @NotNull
    public final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method6450(@NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray, int n, int n2, double d) {
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray, (String)"pulsiveColors");
        return this.Method6456(null, vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray, m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs.Field8720, n, n2, Float.intBitsToFloat((int)((long)2035550190 ^ (long)1000081390)), Float.intBitsToFloat((int)((long)2078690380 ^ (long)967724108)), d);
    }

    @NotNull
    @NotNull
    public final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method6451(@NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray, int n, int n2) {
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray, (String)"pulsiveColors");
        return this.Method6456(null, vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray, m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs.Field8720, n, n2, Float.intBitsToFloat((int)((long)1592248875 ^ (long)472893995)), Float.intBitsToFloat((int)758752362L ^ 0x6F71A46A), Double.longBitsToDouble(0xB9D693A46CF14799L ^ 0xF9D693A46CF14799L));
    }

    @NotNull
    @NotNull
    public final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method6452(@NotNull @NotNull m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs2, int n, int n2, float f, float f2, double d) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs2), (String)"type");
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = null;
        NWGvXku8eTVn9iTQ8yPCeInlHaAJefP7 nWGvXku8eTVn9iTQ8yPCeInlHaAJefP7 = this;
        int n3 = (int)((long)-506039029 ^ (long)-506039029);
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray = new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[(int)((long)-1443095584 ^ (long)-1443095584)];
        return nWGvXku8eTVn9iTQ8yPCeInlHaAJefP7.Method6456(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray, m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs2, n, n2, f, f2, d);
    }

    @NotNull
    @NotNull
    public final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method6453(@NotNull @NotNull m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs2, int n, int n2, double d) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs2), (String)"type");
        return this.Method6452(m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs2, n, n2, Float.intBitsToFloat(0x75544567 ^ 0x379C4567), Float.intBitsToFloat(0x399EC357 ^ 0x7BD6C357), d);
    }

    @NotNull
    @NotNull
    public final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method6454(@NotNull @NotNull m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs2, int n, int n2) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs2), (String)"type");
        return this.Method6452(m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs2, n, n2, Float.intBitsToFloat((int)((long)327395159 ^ (long)1363912535)), Float.intBitsToFloat(0x7A33D575 ^ 0x387BD575), Double.longBitsToDouble((long)340541736 ^ 0x40000000144C4128L));
    }

    @NotNull
    @NotNull
    public final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method6455(@Nullable @Nullable vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray, @NotNull @NotNull m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs2, int n, int n2) {
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray, (String)"pulsiveColors");
        Intrinsics.checkParameterIsNotNull((Object)((Object)m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs2), (String)"type");
        return this.Method6456(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray, m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs2, n, n2, Float.intBitsToFloat((int)((long)1016583878 ^ (long)2120210118)), Float.intBitsToFloat((int)((long)2034030648 ^ (long)997513272)), Double.longBitsToDouble(0x2849F364DC431C21L ^ 0x6849F364DC431C21L));
    }

    @NotNull
    @NotNull
    public final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method6456(@Nullable @Nullable vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray, @NotNull @NotNull m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs2, int n, int n2, float f, float f2, double d) {
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray, (String)"pulsiveColors");
        Intrinsics.checkParameterIsNotNull((Object)((Object)m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs2), (String)"type");
        int n3 = n * n2;
        switch (BGULmvqqNlxlHI2oJs1L97aRSbuIjAmr.Field8776[m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs2.ordinal()]) {
            case 1: {
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = this.Method6460(n3, f, f2, d);
                return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
            }
            case 2: {
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = this.Method6459(n3, f, f2, d);
                return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
            }
            case 3: {
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
                if (vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray.length == (int)((long)323000185 ^ (long)323000184) << 1) {
                    vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = this.Method6458(vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[(int)-1002314865L ^ 0xC441E38F], vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[(int)-745993936L ^ 0xD3890931], n3, f, f2, d);
                    return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
                }
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)536816205L ^ 0x1FFF2AB2, (int)-7044192L ^ 0xFF94835F, (int)((long)1935055111 ^ (long)1935055352), (int)-1314000229L ^ 0xB1ADF264);
                return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
            }
            case 4: {
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
                if (vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 != null) {
                    return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
                }
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)553891887L ^ 0x2103B8D0, (int)((long)-1027810471 ^ (long)-1027810394), (int)((long)1353275438 ^ (long)1353275601), (int)((long)-1789177301 ^ (long)-1789177132));
                return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
            }
            case 5: {
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
                if (vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 != null) {
                    vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = this.Method6457(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, n3, f, f2, d);
                    return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
                }
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)655030622L ^ 0x270AF9A1, (int)-1392886877L ^ 0xACFA3B5C, (int)((long)2035229383 ^ (long)2035229240), (int)1188363760L ^ 0x46D4FD0F);
                return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    private final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method6457(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, int n, float f, float f2, double d) {
        double d2 = (double)(0x31642D0FL & 0x46182D09L) / d;
        double d3 = d2 / (double)(((int)-507149263L ^ 0xE1C5841C) << 3);
        double d4 = (double)System.currentTimeMillis() % d2 / d3 + (double)n;
        float f3 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method3620();
        int n2 = (int)-1824395372L ^ 0x9341EF94;
        double d5 = Math.abs(d4);
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method3618(f3, (float)HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU.Method4278(d5, f2, 1.0), f);
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"Colour.fromHSB(\n        \u2026            sat\n        )");
        return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
    }

    private final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method6458(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, int n, float f, float f2, double d) {
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4;
        double d2 = (double)(0x1CAD69L & 0xC606F89L) / d;
        double d3 = d2 / (double)(((int)209075627L ^ 0xC763D86) << 3);
        int n2 = (int)((double)System.currentTimeMillis() % d2 / d3) + n;
        if (n2 > (int)((long)-1124301734 ^ (long)-1124301733)) {
            int n3 = n2 % ((int)1558144089L ^ 0x5CDF6458);
            n2 = n2 % ((int)((long)1139869227 ^ (long)1139869226) << 1) == 0 ? n3 : (int)((long)1287286925 ^ (long)1287286924) - n3;
        }
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4;
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4;
        int n4 = n2;
        int n5 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Field17321;
        int n6 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17321;
        return n6 + (n5 - n6) * n4;
    }

    private final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method6459(int n, float f, float f2, double d) {
        double d2;
        for (d2 = (double)((float)((double)System.currentTimeMillis() % d)) + (double)((((int)835362640L ^ 0x31CA9F2D) << 3) - n) * Double.longBitsToDouble((long)736539841 ^ 0x402200002BE6B4C1L); d2 > d; d2 -= d) {
        }
        if ((d2 /= d) > Double.longBitsToDouble((long)2080359718 ^ 0x3FE000007BFFC526L)) {
            d2 = (double)Float.intBitsToFloat(0xA3EDFB2 ^ 0x353EDFB2) - (d2 - (double)Float.intBitsToFloat(0x79BB6F21 ^ 0x46BB6F21));
        }
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method3618((float)(d2 += (double)Float.intBitsToFloat((int)((long)1114431515 ^ (long)2104287259))), f, f2);
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"Colour.fromHSB(hue.toFloat(), sat, bright)");
        return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
    }

    private final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method6460(int n, float f, float f2, double d) {
        double d2 = (double)(0xB457D49L & 0x44002D3DL) / d;
        double d3 = d2 / (double)((int)((long)1001982205 ^ (long)1001982160) << 3);
        int n2 = (int)((double)System.currentTimeMillis() % d2 / d3) + n;
        if (n2 > (int)((long)-1137628191 ^ (long)-1137628212) << 3) {
            n2 -= (int)((long)-986935005 ^ (long)-986935026) << 3;
        }
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method3618((float)n2 / Float.intBitsToFloat((int)((long)1901599769 ^ (long)854334489)), f / (float)((int)((long)-389592579 ^ (long)-389592604) << 2), f2 / (float)((int)((long)-655106326 ^ (long)-655106317) << 2));
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"Colour.fromHSB(hue / 360\u2026 sat / 100, bright / 100)");
        return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
    }

    private NWGvXku8eTVn9iTQ8yPCeInlHaAJefP7() {
    }

    static {
        NWGvXku8eTVn9iTQ8yPCeInlHaAJefP7 nWGvXku8eTVn9iTQ8yPCeInlHaAJefP7;
        Field15802 = nWGvXku8eTVn9iTQ8yPCeInlHaAJefP7 = new NWGvXku8eTVn9iTQ8yPCeInlHaAJefP7();
    }

    private static String Method6461(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1271816174 ^ (long)-1271816174);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)426703377 ^ (long)426703598);
            int n2 = (int)638928632L ^ 0x261546A5;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1085321288 ^ (long)1085339833) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

