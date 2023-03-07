/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.math.AxisAlignedBB
 */
package lavahack.client;

import com.kisman.cc.util.JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm;
import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.CwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY;
import lavahack.client.LORhAMEJX3BtnGyXypLCBikcxCRHGhsv;
import lavahack.client.MgkVR9HHlUDpUz6LaQ4j3bCzG1nsQJpY$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.MgkVR9HHlUDpUz6LaQ4j3bCzG1nsQJpY$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.MgkVR9HHlUDpUz6LaQ4j3bCzG1nsQJpY$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.MgkVR9HHlUDpUz6LaQ4j3bCzG1nsQJpY$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import lavahack.client.MgkVR9HHlUDpUz6LaQ4j3bCzG1nsQJpY$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.YrZIuXfGERo9PD5YYVbqvS1v5x1Tr9n0;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.k2xS3X9Hiu97q1kXmWdLuKIc9dhkROz8;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.util.math.AxisAlignedBB;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u001dH\u0002J\b\u0010\n\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0014J\u0018\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0011\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u0011\u0010\u0017\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u0011\u0010\u0019\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR\u0011\u0010\u001b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\b\u00a8\u0006'"}, d2={"Lcom/kisman/cc/util/render/cubic/ModuleRenderPattern;", "Lcom/kisman/cc/util/render/cubic/DelegateRenderPattern;", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "color1", "Lcom/kisman/cc/settings/Setting;", "getColor1", "()Lcom/kisman/cc/settings/Setting;", "color2", "getColor2", "group", "Lcom/kisman/cc/settings/types/SettingGroup;", "getGroup", "()Lcom/kisman/cc/settings/types/SettingGroup;", "lineWidth", "getLineWidth", "mode", "getMode", "rainbow", "getRainbow", "rainbowBright", "getRainbowBright", "rainbowGlow", "getRainbowGlow", "rainbowSat", "getRainbowSat", "rainbowSpeed", "getRainbowSpeed", "Lcom/kisman/cc/util/Colour;", "getRenderBuilder", "Lcom/kisman/cc/util/render/cubic/RenderBuilder;", "initialize", "", "render", "aabb", "Lnet/minecraft/util/math/AxisAlignedBB;", "delegate", "Lcom/kisman/cc/util/render/cubic/DelegateRenderBuilder;", "kisman.cc"})
public final class MgkVR9HHlUDpUz6LaQ4j3bCzG1nsQJpY
extends LORhAMEJX3BtnGyXypLCBikcxCRHGhsv {
    @NotNull
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field17474;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17475;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17476;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17477;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17478;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17479;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17480;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17481;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17482;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17483;
    private int Field17484;

    @NotNull
    @NotNull
    public final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Method7602() {
        return this.Field17474;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7603() {
        return this.Field17475;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7604() {
        return this.Field17476;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7605() {
        return this.Field17477;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7606() {
        return this.Field17478;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7607() {
        return this.Field17479;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7608() {
        return this.Field17480;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7609() {
        return this.Field17481;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7610() {
        return this.Field17482;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7611() {
        return this.Field17483;
    }

    @Override
    protected void Method2730() {
        this.Method2728("group", this.Field17474);
        this.Method2728("mode", this.Field17475);
        this.Method2728("lineWidth", this.Field17476);
        this.Method2728("rainbow", this.Field17477);
        this.Method2728("rainbowSpeed", this.Field17478);
        this.Method2728("rainbowSat", this.Field17479);
        this.Method2728("rainbowBright", this.Field17480);
        this.Method2728("rainbowGlow", this.Field17481);
        this.Method2728("color1", this.Field17482);
        this.Method2728("color2", this.Field17483);
    }

    @Override
    @NotNull
    @NotNull
    public CwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY Method2732() {
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = this.Method7612();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = this.Method7613();
        Enum enum_ = this.Field17475.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RenderingRewriteModes");
        }
        CwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY cwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY = new YrZIuXfGERo9PD5YYVbqvS1v5x1Tr9n0(this).Method7316(((k2xS3X9Hiu97q1kXmWdLuKIc9dhkROz8)enum_).Method3273()).Method7314(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3).Method7315(this.Field17476.Method368());
        Intrinsics.checkExpressionValueIsNotNull((Object)cwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY, (String)"DelegateRenderBuilder(th\u2026Width(lineWidth.valFloat)");
        return cwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY;
    }

    @Override
    public void Method2733(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull YrZIuXfGERo9PD5YYVbqvS1v5x1Tr9n0 yrZIuXfGERo9PD5YYVbqvS1v5x1Tr9n0) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Intrinsics.checkParameterIsNotNull((Object)yrZIuXfGERo9PD5YYVbqvS1v5x1Tr9n0, (String)"delegate");
        if (this.Field17481.Method359().equals("None")) {
            yrZIuXfGERo9PD5YYVbqvS1v5x1Tr9n0.Method7318();
            return;
        }
        AxisAlignedBB axisAlignedBB2 = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3447(axisAlignedBB);
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = this.Method7612();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = this.Method7613();
        int n = (int)((long)791644124 ^ (long)791643939);
        int n2 = (int)-1225528597L ^ 0xB6F3EA14;
        boolean bl = this.Field17481.Method359().equals("ReverseGlow");
        if (bl) {
            n = (int)-1335626018L ^ 0xB063F6DE;
        } else {
            n2 = (int)-1640624376L ^ 0x9E360F08;
        }
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3446(axisAlignedBB2, this.Field17476.Method368(), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17219);
    }

    private final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method7612() {
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        String string = this.Field17481.Method359();
        int n = this.Field17482.Method339().Field17324;
        if (string.equals("ReverseGlow")) {
            n = (int)((long)-1283338954 ^ (long)-1283338954);
        }
        if (this.Field17477.Method365()) {
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Method3579((int)((long)-1142766043 ^ (long)-1142766043), this.Field17479.Method335(), this.Field17480.Method335(), n, this.Field17478.Method367());
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
            Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"RainbowUtil.rainbow2(0, \u2026, rainbowSpeed.valDouble)");
            return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        }
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4 = this.Field17482.Method339();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4;
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"color1.colour");
        return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
    }

    private final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method7613() {
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        String string = this.Field17481.Method359();
        int n = this.Field17483.Method339().Field17324;
        if (string.equals("Glow")) {
            n = (int)-822535978L ^ 0xCEF918D6;
        }
        if (this.Field17477.Method365()) {
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Method3579(((int)1023431064L ^ 0x3D005181) << 1, this.Field17479.Method335(), this.Field17480.Method335(), n, this.Field17478.Method367());
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
            Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"RainbowUtil.rainbow2(50,\u2026, rainbowSpeed.valDouble)");
            return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        }
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4 = this.Field17483.Method339();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4;
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"color2.colour");
        return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
    }

    public MgkVR9HHlUDpUz6LaQ4j3bCzG1nsQJpY(@NotNull @NotNull WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        Intrinsics.checkParameterIsNotNull((Object)wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, (String)"module");
        this.Field17474 = new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J));
        this.Field17475 = this.Field17474.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render Mode", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, k2xS3X9Hiu97q1kXmWdLuKIc9dhkROz8.Field11309));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render Line Width", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, 1.0, Double.longBitsToDouble((long)1423522019 ^ 0x3FB99999CD40A179L), Double.longBitsToDouble(0x7C8D2B02EEAE4752L ^ 0x3C992B02EEAE4752L), ((int)1775386339L ^ 0x69D23EE3) != 0).Method313(new MgkVR9HHlUDpUz6LaQ4j3bCzG1nsQJpY$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"Setting(\"Render Line Wid\u2026odes.FilledGradient\n    }");
        this.Field17476 = this.Field17474.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2);
        this.Field17477 = this.Field17474.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rainbow", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, (boolean)((long)-152609622 ^ (long)-152609622)));
        this.Field17478 = this.Field17474.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RainbowSpeed", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, 1.0, Double.longBitsToDouble(0x1219FEBBF1CD2EBEL ^ 0x2DC9FEBBF1CD2EBEL), Double.longBitsToDouble(0x4262932A0924A379L ^ 0x276932A0924A379L), (boolean)((long)-1912533223 ^ (long)-1912533223)));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Saturation", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, Double.longBitsToDouble((long)516052103 ^ 0x405900001EC25487L), 0.0, Double.longBitsToDouble((long)528253246 ^ 0x405900001F7C813EL), ((int)1210251600L ^ 0x4822F951) != 0).Method313(new MgkVR9HHlUDpUz6LaQ4j3bCzG1nsQJpY$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"Setting(\"Saturation\", mo\u2026sible{rainbow.valBoolean}");
        this.Field17479 = this.Field17474.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Brightness", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, Double.longBitsToDouble(0xF0B1B755D56AA976L ^ 0xB0E8B755D56AA976L), 0.0, Double.longBitsToDouble(0xF3B43E26DBCD8E5FL ^ 0xB3ED3E26DBCD8E5FL), ((int)-1734965131L ^ 0x98968874) != 0).Method313(new MgkVR9HHlUDpUz6LaQ4j3bCzG1nsQJpY$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"Setting(\"Brightness\", mo\u2026sible{rainbow.valBoolean}");
        this.Field17480 = this.Field17474.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4);
        Object[] objectArray = new String[(int)-1596284505L ^ 0xA0DAA1A4];
        objectArray[(int)((long)-326318188 ^ (long)-326318188)] = "None";
        objectArray[(int)-1607202712L ^ 0xA0340869] = "Glow";
        objectArray[(int)((long)889099004 ^ (long)889099005) << 1] = "ReverseGlow";
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Glow", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, "None", CollectionsKt.listOf((Object[])objectArray)).Method313(new MgkVR9HHlUDpUz6LaQ4j3bCzG1nsQJpY$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"Setting(\"Glow\", module, \u2026sible{rainbow.valBoolean}");
        this.Field17481 = this.Field17474.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5);
        this.Field17482 = this.Field17474.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render Color", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, "Render Color", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)1565649976L ^ 0x5D51ECC7, (int)1173250576L ^ 0x45EE6210, (int)((long)-1333337240 ^ (long)-1333337240), (int)((long)1005713985 ^ (long)1005714110))));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render Second Color", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, "Render Second Color", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)605936282 ^ (long)605936282), (int)((long)30561096 ^ (long)30561095) << 3, (int)615350536L ^ 0x24AD81F7, (int)-1676847598L ^ 0x9C0D56ED)).Method313(new MgkVR9HHlUDpUz6LaQ4j3bCzG1nsQJpY$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"Setting(\"Render Second C\u2026w\n                )\n    }");
        this.Field17483 = this.Field17474.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6);
    }

    private static String Method7614(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-6728802 ^ (long)-6728802);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)73284993 ^ (long)73284990);
            int n2 = (int)-1051555139L ^ 0xC1528A1C;
            cArray2[n] = (char)(cArray[n] ^ ((int)-337342622L ^ 0xEBE4EA69 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

