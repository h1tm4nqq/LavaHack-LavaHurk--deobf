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
import lavahack.client.R5qRfoconoryjIZMLcXF3UgKlG2GLvzd$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.R5qRfoconoryjIZMLcXF3UgKlG2GLvzd$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.R5qRfoconoryjIZMLcXF3UgKlG2GLvzd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.R5qRfoconoryjIZMLcXF3UgKlG2GLvzd$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import lavahack.client.R5qRfoconoryjIZMLcXF3UgKlG2GLvzd$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.YrZIuXfGERo9PD5YYVbqvS1v5x1Tr9n0;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.k2xS3X9Hiu97q1kXmWdLuKIc9dhkROz8;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.util.math.AxisAlignedBB;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\u001fH\u0002J\b\u0010\f\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0014J\u0018\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0011\u0010\u0015\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0011\u0010\u0017\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0011\u0010\u0019\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\nR\u0011\u0010\u001b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\nR\u0011\u0010\u001d\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\n\u00a8\u0006)"}, d2={"Lcom/kisman/cc/util/render/cubic/ModuleSuffixRenderPattern;", "Lcom/kisman/cc/util/render/cubic/DelegateRenderPattern;", "module", "Lcom/kisman/cc/features/module/Module;", "suffix", "", "(Lcom/kisman/cc/features/module/Module;Ljava/lang/String;)V", "color1", "Lcom/kisman/cc/settings/Setting;", "getColor1", "()Lcom/kisman/cc/settings/Setting;", "color2", "getColor2", "group", "Lcom/kisman/cc/settings/types/SettingGroup;", "getGroup", "()Lcom/kisman/cc/settings/types/SettingGroup;", "lineWidth", "getLineWidth", "mode", "getMode", "rainbow", "getRainbow", "rainbowBright", "getRainbowBright", "rainbowGlow", "getRainbowGlow", "rainbowSat", "getRainbowSat", "rainbowSpeed", "getRainbowSpeed", "Lcom/kisman/cc/util/Colour;", "getRenderBuilder", "Lcom/kisman/cc/util/render/cubic/RenderBuilder;", "initialize", "", "render", "aabb", "Lnet/minecraft/util/math/AxisAlignedBB;", "delegate", "Lcom/kisman/cc/util/render/cubic/DelegateRenderBuilder;", "kisman.cc"})
public final class R5qRfoconoryjIZMLcXF3UgKlG2GLvzd
extends LORhAMEJX3BtnGyXypLCBikcxCRHGhsv {
    @NotNull
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12847;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12848;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12849;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12850;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12851;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12852;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12853;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12854;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12855;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12856;
    private int Field12857;

    @NotNull
    @NotNull
    public final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Method4379() {
        return this.Field12847;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4380() {
        return this.Field12848;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4381() {
        return this.Field12849;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4382() {
        return this.Field12850;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4383() {
        return this.Field12851;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4384() {
        return this.Field12852;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4385() {
        return this.Field12853;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4386() {
        return this.Field12854;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4387() {
        return this.Field12855;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4388() {
        return this.Field12856;
    }

    @Override
    protected void Method2730() {
        this.Method2728("group", this.Field12847);
        this.Method2728("mode", this.Field12848);
        this.Method2728("lineWidth", this.Field12849);
        this.Method2728("rainbow", this.Field12850);
        this.Method2728("rainbowSpeed", this.Field12851);
        this.Method2728("rainbowSat", this.Field12852);
        this.Method2728("rainbowBright", this.Field12853);
        this.Method2728("rainbowGlow", this.Field12854);
        this.Method2728("color1", this.Field12855);
        this.Method2728("color2", this.Field12856);
    }

    @Override
    @NotNull
    @NotNull
    public CwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY Method2732() {
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = this.Method4389();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = this.Method4390();
        Enum enum_ = this.Field12848.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RenderingRewriteModes");
        }
        CwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY cwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY = new YrZIuXfGERo9PD5YYVbqvS1v5x1Tr9n0(this).Method7316(((k2xS3X9Hiu97q1kXmWdLuKIc9dhkROz8)enum_).Method3273()).Method7314(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3).Method7315(this.Field12849.Method368());
        Intrinsics.checkExpressionValueIsNotNull((Object)cwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY, (String)"DelegateRenderBuilder(th\u2026Width(lineWidth.valFloat)");
        return cwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY;
    }

    @Override
    public void Method2733(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull YrZIuXfGERo9PD5YYVbqvS1v5x1Tr9n0 yrZIuXfGERo9PD5YYVbqvS1v5x1Tr9n0) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Intrinsics.checkParameterIsNotNull((Object)yrZIuXfGERo9PD5YYVbqvS1v5x1Tr9n0, (String)"delegate");
        if (this.Field12854.Method359().equals("None")) {
            yrZIuXfGERo9PD5YYVbqvS1v5x1Tr9n0.Method7318();
            return;
        }
        AxisAlignedBB axisAlignedBB2 = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3447(axisAlignedBB);
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = this.Method4389();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = this.Method4390();
        int n = (int)((long)-1159411521 ^ (long)-1159411648);
        int n2 = (int)((long)-207771152 ^ (long)-207771377);
        boolean bl = this.Field12854.Method359().equals("ReverseGlow");
        if (bl) {
            n = (int)((long)303365853 ^ (long)303365853);
        } else {
            n2 = (int)1124140096L ^ 0x43010440;
        }
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3446(axisAlignedBB2, this.Field12849.Method368(), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17219);
    }

    private final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method4389() {
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        String string = this.Field12854.Method359();
        int n = this.Field12855.Method339().Field17324;
        if (string.equals("ReverseGlow")) {
            n = (int)((long)-1560667529 ^ (long)-1560667529);
        }
        if (this.Field12850.Method365()) {
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Method3579((int)-1681707412L ^ 0x9BC32E6C, this.Field12852.Method335(), this.Field12853.Method335(), n, this.Field12851.Method367());
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
            Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"RainbowUtil.rainbow2(0, \u2026, rainbowSpeed.valDouble)");
            return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        }
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4 = this.Field12855.Method339();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4;
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"color1.colour");
        return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
    }

    private final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method4390() {
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        String string = this.Field12854.Method359();
        int n = this.Field12856.Method339().Field17324;
        if (string.equals("Glow")) {
            n = (int)((long)-1733523666 ^ (long)-1733523666);
        }
        if (this.Field12850.Method365()) {
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Method3579((int)((long)-1497218119 ^ (long)-1497218144) << 1, this.Field12852.Method335(), this.Field12853.Method335(), n, this.Field12851.Method367());
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
            Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"RainbowUtil.rainbow2(50,\u2026, rainbowSpeed.valDouble)");
            return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        }
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4 = this.Field12856.Method339();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4;
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"color2.colour");
        return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
    }

    public R5qRfoconoryjIZMLcXF3UgKlG2GLvzd(@NotNull @NotNull WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, @NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, (String)"module");
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"suffix");
        this.Field12847 = new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render " + string, wjjBVRrUqJUKhloA7ANknrTEODhuGa0J));
        this.Field12848 = this.Field12847.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render Mode " + string, wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, k2xS3X9Hiu97q1kXmWdLuKIc9dhkROz8.Field11309));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render Line Width " + string, wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, 1.0, Double.longBitsToDouble(0x7A3364CD0F4B3D60L ^ 0x458AFD5496D2A4FAL), Double.longBitsToDouble((long)1683352706 ^ 0x401400006455EC82L), ((int)1336903153L ^ 0x4FAF85F1) != 0).Method313(new R5qRfoconoryjIZMLcXF3UgKlG2GLvzd$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"Setting(\"Render Line Wid\u2026odes.FilledGradient\n    }");
        this.Field12849 = this.Field12847.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2);
        this.Field12850 = this.Field12847.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rainbow " + string, wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, ((int)-103665907L ^ 0xF9D22F0D) != 0));
        this.Field12851 = this.Field12847.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RainbowSpeed " + string, wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, 1.0, Double.longBitsToDouble(0x5EA3B44C6A71981BL ^ 0x6173B44C6A71981BL), Double.longBitsToDouble((long)1022239173 ^ 0x401400003CEE21C5L), ((int)162269798L ^ 0x9AC0A66) != 0));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Saturation " + string, wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, Double.longBitsToDouble((long)69590590 ^ 0x405900000425DE3EL), 0.0, Double.longBitsToDouble(0x3C28431699D984FAL ^ 0x7C71431699D984FAL), ((int)-1835922815L ^ 0x92920A80) != 0).Method313(new R5qRfoconoryjIZMLcXF3UgKlG2GLvzd$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"Setting(\"Saturation $suf\u2026sible{rainbow.valBoolean}");
        this.Field12852 = this.Field12847.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Brightness " + string, wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, Double.longBitsToDouble(0xB1D0DDABA4E12373L ^ 0xF189DDABA4E12373L), 0.0, Double.longBitsToDouble((long)1185398164 ^ 0x4059000046A7BD94L), (boolean)((long)798618042 ^ (long)798618043)).Method313(new R5qRfoconoryjIZMLcXF3UgKlG2GLvzd$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"Setting(\"Brightness $suf\u2026sible{rainbow.valBoolean}");
        this.Field12853 = this.Field12847.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4);
        Object[] objectArray = new String[(int)1694984202L ^ 0x65076809];
        objectArray[(int)((long)-758335332 ^ (long)-758335332)] = "None";
        objectArray[(int)-2145139634L ^ 0x8023C44F] = "Glow";
        objectArray[((int)1003056108L ^ 0x3BC96BED) << 1] = "ReverseGlow";
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Glow " + string, wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, "None", CollectionsKt.listOf((Object[])objectArray)).Method313(new R5qRfoconoryjIZMLcXF3UgKlG2GLvzd$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"Setting(\"Glow $suffix\", \u2026sible{rainbow.valBoolean}");
        this.Field12854 = this.Field12847.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5);
        this.Field12855 = this.Field12847.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render Color " + string, wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, "Render Color", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)-1567563438 ^ (long)-1567563347), (int)-1405832092L ^ 0xAC34B464, (int)((long)-1904394206 ^ (long)-1904394206), (int)((long)-1658400695 ^ (long)-1658400586))));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render Second Color " + string, wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, "Render Second Color", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)1834752021L ^ 0x6D5C1815, ((int)862257498L ^ 0x33650155) << 3, (int)-498690710L ^ 0xE2469595, (int)-1374527705L ^ 0xAE125FD8)).Method313(new R5qRfoconoryjIZMLcXF3UgKlG2GLvzd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"Setting(\"Render Second C\u2026.Glow\n            )\n    }");
        this.Field12856 = this.Field12847.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6);
    }

    private static String Method4391(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1343113678L ^ 0x500E49CE;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1382005604L ^ 0x525FBB9B);
            int n2 = (int)((long)-649194146 ^ (long)-649194131) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)93534526L ^ 0x5931ABB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

