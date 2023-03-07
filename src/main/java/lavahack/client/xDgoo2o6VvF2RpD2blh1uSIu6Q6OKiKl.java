//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.util.EnumHandSide
 */
package lavahack.client;

import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.EnumHandSide;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0016\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2={"Lcom/kisman/cc/features/module/Debug/SwingTest;", "Lcom/kisman/cc/features/module/Module;", "()V", "handRotateX", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "handRotateY", "handRotateZ", "itemRotateX", "itemRotateY", "itemRotateZ", "offhandFix", "swing", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/EventItemRenderer;", "translateX", "translateY", "translateZ", "onDisable", "", "onEnable", "renderItems", "side", "Lnet/minecraft/util/EnumHandSide;", "progress", "", "kisman.cc"})
public final class xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13237;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13238;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13239;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13240;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13241;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13242;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13243;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13244;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13245;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13246;
    private static final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field13247;
    public static final xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl Field13248;
    private int Field13249;

    @Override
    public void Method38() {
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(Field13247);
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(Field13247);
    }

    /*
     * Unable to fully structure code
     */
    public final void Method4681(@NotNull @NotNull EnumHandSide var1_1, float var2_2) {
        Intrinsics.checkParameterIsNotNull((Object)var1_1, (String)"side");
        v0 = xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl.Field13237;
        Intrinsics.checkExpressionValueIsNotNull((Object)v0, (String)"translateX");
        v1 = v0.Method367() * (double)var2_2;
        if (var1_1 != EnumHandSide.LEFT) ** GOTO lbl-1000
        v2 = xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl.Field13246;
        Intrinsics.checkExpressionValueIsNotNull((Object)v2, (String)"offhandFix");
        if (v2.Method365()) {
            v3 = (int)982277139L ^ -982277140;
        } else lbl-1000:
        // 2 sources

        {
            v3 = (int)((long)-170619312 ^ (long)-170619311);
        }
        v4 = v1 * (double)v3;
        v5 = xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl.Field13238;
        Intrinsics.checkExpressionValueIsNotNull((Object)v5, (String)"translateY");
        v6 = v5.Method367() * (double)var2_2;
        v7 = xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl.Field13239;
        Intrinsics.checkExpressionValueIsNotNull((Object)v7, (String)"translateZ");
        GlStateManager.translate((double)v4, (double)v6, (double)(v7.Method367() * (double)var2_2));
        v8 = xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl.Field13240;
        Intrinsics.checkExpressionValueIsNotNull((Object)v8, (String)"itemRotateX");
        GlStateManager.rotate((float)(v8.Method368() * var2_2), (float)1.0f, (float)0.0f, (float)0.0f);
        v9 = xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl.Field13241;
        Intrinsics.checkExpressionValueIsNotNull((Object)v9, (String)"itemRotateY");
        GlStateManager.rotate((float)(v9.Method368() * var2_2), (float)0.0f, (float)1.0f, (float)0.0f);
        v10 = xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl.Field13242;
        Intrinsics.checkExpressionValueIsNotNull((Object)v10, (String)"itemRotateZ");
        GlStateManager.rotate((float)(v10.Method368() * var2_2), (float)0.0f, (float)0.0f, (float)1.0f);
    }

    private xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl() {
        super("SwingTest", "I need this test because i want to make custom swing.", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    static {
        xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2;
        Field13248 = xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2 = new xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl();
        Field13237 = xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Translate X", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2, 0.0, Double.longBitsToDouble(0x7031A9DAFE54C684L ^ 0xB039A9DAFE54C684L), Double.longBitsToDouble(0x7DC9852B64BB6E5DL ^ 0x3DC1852B64BB6E5DL), (boolean)((long)-2136871108 ^ (long)-2136871108)));
        Field13238 = xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Translate Y", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2, 0.0, Double.longBitsToDouble(0x144B8CBF76C86039L ^ 0xD4438CBF76C86039L), Double.longBitsToDouble(0xE093E230A8F8C57FL ^ 0xA09BE230A8F8C57FL), (boolean)((long)1278489858 ^ (long)1278489858)));
        Field13239 = xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Translate Z", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2, 0.0, Double.longBitsToDouble((long)154956289 ^ 0xC0080000093C7201L), Double.longBitsToDouble(0x6F7011C8D9CF75E8L ^ 0x2F7811C8D9CF75E8L), (boolean)((long)-1817384789 ^ (long)-1817384789)));
        Field13240 = xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Item Rotate X", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2, 0.0, Double.longBitsToDouble((long)1151914254 ^ 0xC076800044A8D10EL), Double.longBitsToDouble(0xAAACB6D5051C9542L ^ 0xEADA36D5051C9542L), (boolean)((long)1276792406 ^ (long)1276792407)));
        Field13241 = xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Item Rotate Y", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2, 0.0, Double.longBitsToDouble((long)212053967 ^ 0xC07680000CA3AFCFL), Double.longBitsToDouble((long)542649116 ^ 0x4076800020582B1CL), (boolean)((long)-806547473 ^ (long)-806547474)));
        Field13242 = xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Item Rotate Z", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2, 0.0, Double.longBitsToDouble(0xEA085E46FDBA1269L ^ 0x2A7EDE46FDBA1269L), Double.longBitsToDouble((long)1430076436 ^ 0x40768000553D3C14L), ((int)-410544812L ^ 0xE7879555) != 0));
        Field13243 = xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Hand Rotate X", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2, 0.0, Double.longBitsToDouble(0x77346F1199B2638DL ^ 0xB742EF1199B2638DL), Double.longBitsToDouble(0xD6BDE0E4975258EFL ^ 0x96CB60E4975258EFL), (boolean)((long)1808818461 ^ (long)1808818460)));
        Field13244 = xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Hand Rotate Y", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2, 0.0, Double.longBitsToDouble(0xD6C87899B1F43BC9L ^ 0x16BEF899B1F43BC9L), Double.longBitsToDouble(0x8D0E475FCE5BCE31L ^ 0xCD78C75FCE5BCE31L), ((int)-262389211L ^ 0xF05C4224) != 0));
        Field13245 = xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Hand Rotate Z", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2, 0.0, Double.longBitsToDouble(0x6DDDC25FF502687CL ^ 0xADAB425FF502687CL), Double.longBitsToDouble(0x7C916FBD22888BE1L ^ 0x3CE7EFBD22888BE1L), (boolean)((long)1592979988 ^ (long)1592979989)));
        Field13246 = xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("OffHand Fix", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2, ((int)736043932L ^ 0x2BDF239C) != 0));
        Field13247 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field15979, new Predicate[(int)((long)-1938184906 ^ (long)-1938184906)]);
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4682(xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2) {
        xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl3 = xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2;
        return Field13243;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4683(xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2) {
        xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl3 = xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2;
        return Field13244;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4684(xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2) {
        xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl3 = xDgoo2o6VvF2RpD2blh1uSIu6Q6OKiKl2;
        return Field13245;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1213929546 ^ (long)1213929546);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)24074157 ^ (long)24074066);
            int n2 = (int)((long)-1779189905 ^ (long)-1779189836);
            cArray2[n] = (char)(cArray[n] ^ (((int)-1808024385L ^ 0x943BBD86) << 6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

