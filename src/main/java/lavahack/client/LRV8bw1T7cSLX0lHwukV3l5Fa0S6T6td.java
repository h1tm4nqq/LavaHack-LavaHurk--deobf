//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.RayTraceResult$Type
 *  net.minecraft.world.World
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.HxNufwqIKdASUlhzDMzyCRUIub26n5S3;
import lavahack.client.LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2={"Lcom/kisman/cc/features/module/Debug/SmoothRenderer;", "Lcom/kisman/cc/features/module/Module;", "()V", "alpha", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "depth", "fadeLength", "movingLength", "renderer", "Lcom/kisman/cc/features/module/Debug/SmoothRenderer$Renderer;", "onEnable", "", "onRenderWorld", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "PlaceInfo", "Renderer", "kisman.cc"})
public final class LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10876 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Moving Length", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x27E707564E903CB9L ^ 0x679E07564E903CB9L), 0.0, Double.longBitsToDouble(0x79B0ED600AB7268L ^ 0x47144ED600AB7268L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10877 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Fade Length", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)399448367 ^ 0x4069000017CF192FL), 0.0, Double.longBitsToDouble((long)266623891 ^ 0x408F40000FE45B93L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10878 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Depth", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1722372698 ^ (long)1722372698)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10879 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Alpha", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1334847246 ^ (long)-1334847245)));
    private final LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field10880 = new LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf();
    private String Field10881 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        this.Field10880.Method2204();
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method2862(@NotNull @NotNull RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, (String)"event");
        if (LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td.Method2863().objectMouseOver == null) return;
        if (LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td.Method2863().objectMouseOver.typeOfHit != RayTraceResult.Type.BLOCK) {
            return;
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field10876;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"movingLength");
        float f = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method368();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field10877;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"fadeLength");
        float f2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method368();
        RayTraceResult rayTraceResult = LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td.Method2863().objectMouseOver;
        Intrinsics.checkExpressionValueIsNotNull((Object)rayTraceResult, (String)"mc.objectMouseOver");
        BlockPos blockPos = rayTraceResult.getBlockPos();
        WorldClient worldClient = LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td.Method2863().world;
        RayTraceResult rayTraceResult2 = LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td.Method2863().objectMouseOver;
        Intrinsics.checkExpressionValueIsNotNull((Object)rayTraceResult2, (String)"mc.objectMouseOver");
        IBlockState iBlockState = worldClient.getBlockState(rayTraceResult2.getBlockPos());
        World world = (World)LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td.Method2863().world;
        RayTraceResult rayTraceResult3 = LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td.Method2863().objectMouseOver;
        Intrinsics.checkExpressionValueIsNotNull((Object)rayTraceResult3, (String)"mc.objectMouseOver");
        LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = new LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos, HxNufwqIKdASUlhzDMzyCRUIub26n5S3.Method6834(iBlockState.getSelectedBoundingBox(world, rayTraceResult3.getBlockPos()), new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)725848040L ^ 0x2B438F17, (int)1974675919L ^ 0x75B32930, (int)37278331L ^ 0x238D284, (int)((long)581395393 ^ (long)581395338) << 1)));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field10878;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"depth");
        boolean bl = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method365();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field10879;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"alpha");
        this.Field10880.Method2205(f, f2, lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, bl, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method365());
    }

    public LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td() {
        super("SmoothRenderer", "idk", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    public static final Minecraft Method2863() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method2864(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)803217640 ^ (long)803217640);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1711805719 ^ (long)-1711805930);
            int n2 = (int)((long)-1539023456 ^ (long)-1539023377) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1105627494L ^ 0xBE19532B) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

