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
import lavahack.client.DZhxCGAc8sX8Q52Jr3RJX2HnqL7CzxkU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.DZhxCGAc8sX8Q52Jr3RJX2HnqL7CzxkU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.DZhxCGAc8sX8Q52Jr3RJX2HnqL7CzxkU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.DZhxCGAc8sX8Q52Jr3RJX2HnqL7CzxkU$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import lavahack.client.DZhxCGAc8sX8Q52Jr3RJX2HnqL7CzxkU$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.LORhAMEJX3BtnGyXypLCBikcxCRHGhsv;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.YrZIuXfGERo9PD5YYVbqvS1v5x1Tr9n0;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.k2xS3X9Hiu97q1kXmWdLuKIc9dhkROz8;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.util.math.AxisAlignedBB;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\u001fH\u0002J\b\u0010\f\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0014J\u0018\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0011\u0010\u0015\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0011\u0010\u0017\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0011\u0010\u0019\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\nR\u0011\u0010\u001b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\nR\u0011\u0010\u001d\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\n\u00a8\u0006)"}, d2={"Lcom/kisman/cc/util/render/cubic/ModulePrefixRenderPattern;", "Lcom/kisman/cc/util/render/cubic/DelegateRenderPattern;", "module", "Lcom/kisman/cc/features/module/Module;", "prefix", "", "(Lcom/kisman/cc/features/module/Module;Ljava/lang/String;)V", "color1", "Lcom/kisman/cc/settings/Setting;", "getColor1", "()Lcom/kisman/cc/settings/Setting;", "color2", "getColor2", "group", "Lcom/kisman/cc/settings/types/SettingGroup;", "getGroup", "()Lcom/kisman/cc/settings/types/SettingGroup;", "lineWidth", "getLineWidth", "mode", "getMode", "rainbow", "getRainbow", "rainbowBright", "getRainbowBright", "rainbowGlow", "getRainbowGlow", "rainbowSat", "getRainbowSat", "rainbowSpeed", "getRainbowSpeed", "Lcom/kisman/cc/util/Colour;", "getRenderBuilder", "Lcom/kisman/cc/util/render/cubic/RenderBuilder;", "initialize", "", "render", "aabb", "Lnet/minecraft/util/math/AxisAlignedBB;", "delegate", "Lcom/kisman/cc/util/render/cubic/DelegateRenderBuilder;", "kisman.cc"})
public final class DZhxCGAc8sX8Q52Jr3RJX2HnqL7CzxkU
extends LORhAMEJX3BtnGyXypLCBikcxCRHGhsv {
    @NotNull
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field10690;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10691;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10692;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10693;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10694;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10695;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10696;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10697;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10698;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10699;
    private int Field10700;

    @NotNull
    @NotNull
    public final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Method2734() {
        return this.Field10690;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2735() {
        return this.Field10691;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2736() {
        return this.Field10692;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2737() {
        return this.Field10693;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2738() {
        return this.Field10694;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2739() {
        return this.Field10695;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2740() {
        return this.Field10696;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2741() {
        return this.Field10697;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2742() {
        return this.Field10698;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2743() {
        return this.Field10699;
    }

    @Override
    protected void Method2730() {
        this.Method2728("group", this.Field10690);
        this.Method2728("mode", this.Field10691);
        this.Method2728("lineWidth", this.Field10692);
        this.Method2728("rainbow", this.Field10693);
        this.Method2728("rainbowSpeed", this.Field10694);
        this.Method2728("rainbowSat", this.Field10695);
        this.Method2728("rainbowBright", this.Field10696);
        this.Method2728("rainbowGlow", this.Field10697);
        this.Method2728("color1", this.Field10698);
        this.Method2728("color2", this.Field10699);
    }

    @Override
    @NotNull
    @NotNull
    public CwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY Method2732() {
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = this.Method2744();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = this.Method2745();
        Enum enum_ = this.Field10691.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RenderingRewriteModes");
        }
        CwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY cwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY = new YrZIuXfGERo9PD5YYVbqvS1v5x1Tr9n0(this).Method7316(((k2xS3X9Hiu97q1kXmWdLuKIc9dhkROz8)enum_).Method3273()).Method7314(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3).Method7315(this.Field10692.Method368());
        Intrinsics.checkExpressionValueIsNotNull((Object)cwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY, (String)"DelegateRenderBuilder(th\u2026Width(lineWidth.valFloat)");
        return cwEo7gYx6g7WvHLf7z8vSrm0Y59KeUvY;
    }

    @Override
    public void Method2733(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull YrZIuXfGERo9PD5YYVbqvS1v5x1Tr9n0 yrZIuXfGERo9PD5YYVbqvS1v5x1Tr9n0) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Intrinsics.checkParameterIsNotNull((Object)yrZIuXfGERo9PD5YYVbqvS1v5x1Tr9n0, (String)"delegate");
        if (this.Field10697.Method359().equals("None")) {
            yrZIuXfGERo9PD5YYVbqvS1v5x1Tr9n0.Method7318();
            return;
        }
        AxisAlignedBB axisAlignedBB2 = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3447(axisAlignedBB);
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = this.Method2744();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = this.Method2745();
        int n = (int)((long)-2042664160 ^ (long)-2042663969);
        int n2 = (int)((long)2130379024 ^ (long)2130379247);
        boolean bl = this.Field10697.Method359().equals("ReverseGlow");
        if (bl) {
            n = (int)-1918521612L ^ 0x8DA5AEF4;
        } else {
            n2 = (int)((long)601961089 ^ (long)601961089);
        }
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3446(axisAlignedBB2, this.Field10692.Method368(), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17219);
    }

    private final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method2744() {
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        String string = this.Field10697.Method359();
        int n = this.Field10698.Method339().Field17324;
        if (string.equals("ReverseGlow")) {
            n = (int)((long)-1083477429 ^ (long)-1083477429);
        }
        if (this.Field10693.Method365()) {
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Method3579((int)-1682429928L ^ 0x9BB82818, this.Field10695.Method335(), this.Field10696.Method335(), n, this.Field10694.Method367());
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
            Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"RainbowUtil.rainbow2(0, \u2026, rainbowSpeed.valDouble)");
            return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        }
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4 = this.Field10698.Method339();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4;
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"color1.colour");
        return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
    }

    private final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method2745() {
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        String string = this.Field10697.Method359();
        int n = this.Field10699.Method339().Field17324;
        if (string.equals("Glow")) {
            n = (int)1803226001L ^ 0x6B7B0B91;
        }
        if (this.Field10693.Method365()) {
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Method3579((int)((long)1041446563 ^ (long)1041446586) << 1, this.Field10695.Method335(), this.Field10696.Method335(), n, this.Field10694.Method367());
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
            Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"RainbowUtil.rainbow2(50,\u2026, rainbowSpeed.valDouble)");
            return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        }
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4 = this.Field10699.Method339();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4;
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"color2.colour");
        return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
    }

    public DZhxCGAc8sX8Q52Jr3RJX2HnqL7CzxkU(@NotNull @NotNull WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, @NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, (String)"module");
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"prefix");
        this.Field10690 = new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(string, wjjBVRrUqJUKhloA7ANknrTEODhuGa0J));
        this.Field10691 = this.Field10690.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(string + "Render Mode", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, k2xS3X9Hiu97q1kXmWdLuKIc9dhkROz8.Field11309));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(string + "Render Line Width", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, 1.0, Double.longBitsToDouble((long)2133887238 ^ 0x3FB99999E6A9109CL), Double.longBitsToDouble(0x22B02980E1BD8635L ^ 0x62A42980E1BD8635L), ((int)275506346L ^ 0x106BE4AA) != 0).Method313(new DZhxCGAc8sX8Q52Jr3RJX2HnqL7CzxkU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"Setting(prefix + \"Render\u2026odes.FilledGradient\n    }");
        this.Field10692 = this.Field10690.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2);
        this.Field10693 = this.Field10690.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(string + " Rainbow", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, ((int)-664428204L ^ 0xD865A154) != 0));
        this.Field10694 = this.Field10690.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(string + " RainbowSpeed", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, 1.0, Double.longBitsToDouble(0xA36E7D6D84210CF9L ^ 0x9CBE7D6D84210CF9L), Double.longBitsToDouble(0xCD669AFDCE33288CL ^ 0x8D729AFDCE33288CL), (boolean)((long)816950778 ^ (long)816950778)));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(string + " Saturation", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, Double.longBitsToDouble((long)1710940075 ^ 0x4059000065FADFABL), 0.0, Double.longBitsToDouble(0xF60376ECBB8F789DL ^ 0xB65A76ECBB8F789DL), ((int)533757503L ^ 0x1FD07E3E) != 0).Method313(new DZhxCGAc8sX8Q52Jr3RJX2HnqL7CzxkU$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"Setting(\"$prefix Saturat\u2026sible{rainbow.valBoolean}");
        this.Field10695 = this.Field10690.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(string + " Brightness", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, Double.longBitsToDouble(0x2AA30806499CFD3FL ^ 0x6AFA0806499CFD3FL), 0.0, Double.longBitsToDouble(0x898828C74920C3D2L ^ 0xC9D128C74920C3D2L), ((int)-1999094096L ^ 0x88D83EB1) != 0).Method313(new DZhxCGAc8sX8Q52Jr3RJX2HnqL7CzxkU$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"Setting(\"$prefix Brightn\u2026sible{rainbow.valBoolean}");
        this.Field10696 = this.Field10690.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4);
        Object[] objectArray = new String[(int)((long)-102218219 ^ (long)-102218218)];
        objectArray[(int)((long)1114656801 ^ (long)1114656801)] = "None";
        objectArray[(int)-1739305472L ^ 0x98544E01] = "Glow";
        objectArray[((int)675489143L ^ 0x28432576) << 1] = "ReverseGlow";
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(string + "  Glow", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, "None", CollectionsKt.listOf((Object[])objectArray)).Method313(new DZhxCGAc8sX8Q52Jr3RJX2HnqL7CzxkU$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"Setting(\"$prefix  Glow\",\u2026sible{rainbow.valBoolean}");
        this.Field10697 = this.Field10690.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5);
        this.Field10698 = this.Field10690.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(string + "Render Color", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, "Render Color", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)602188601L ^ 0x23E4ABC6, (int)172091864L ^ 0xA41E9D8, (int)((long)1818212166 ^ (long)1818212166), (int)-1844573412L ^ 0x920E0BE3)));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(string + "Render Second Color", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, "Render Second Color", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)474332041L ^ 0x1C45BB89, ((int)1655201608L ^ 0x62A85F47) << 3, (int)((long)-598757190 ^ (long)-598757307), (int)582988362L ^ 0x22BFB2B5)).Method313(new DZhxCGAc8sX8Q52Jr3RJX2HnqL7CzxkU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"Setting(prefix + \"Render\u2026.Glow\n            )\n    }");
        this.Field10699 = this.Field10690.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6);
    }

    private static String Method2746(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-2081763057 ^ (long)-2081763057);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1824872585 ^ (long)1824872566);
            int n2 = ((int)-1037159687L ^ 0xC22E32AC) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1203572006L ^ 0xB842CAF9) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

