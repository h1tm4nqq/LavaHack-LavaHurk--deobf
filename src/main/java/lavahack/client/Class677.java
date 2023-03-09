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

import com.kisman.cc.util.Class2027;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1266;
import lavahack.client.Class1811;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class470;
import lavahack.client.Class97;
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
public final class Class677
extends Class42 {
    private final Class44 Field10876 = this.Method23(new Class44("Moving Length", (Class42)this, Double.longBitsToDouble(4645744490609377280L), 0.0, Double.longBitsToDouble(4652007308841189376L), Class467.Field9943));
    private final Class44 Field10877 = this.Method23(new Class44("Fade Length", (Class42)this, Double.longBitsToDouble((long)399448367 ^ 0x4069000017CF192FL), 0.0, Double.longBitsToDouble((long)266623891 ^ 0x408F40000FE45B93L), Class467.Field9943));
    private final Class44 Field10878 = this.Method23(new Class44("Depth", (Class42)this, false));
    private final Class44 Field10879 = this.Method23(new Class44("Alpha", (Class42)this, true));
    private final Class470 Field10880 = new Class470();
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
        if (Class677.Method2863().objectMouseOver == null) return;
        if (Class677.Method2863().objectMouseOver.typeOfHit != RayTraceResult.Type.BLOCK) {
            return;
        }
        Class44 class44 = this.Field10876;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"movingLength");
        float f = class44.Method368();
        Class44 class442 = this.Field10877;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"fadeLength");
        float f2 = class442.Method368();
        RayTraceResult rayTraceResult = Class677.Method2863().objectMouseOver;
        Intrinsics.checkExpressionValueIsNotNull((Object)rayTraceResult, (String)"mc.objectMouseOver");
        BlockPos blockPos = rayTraceResult.getBlockPos();
        WorldClient worldClient = Class677.Method2863().world;
        RayTraceResult rayTraceResult2 = Class677.Method2863().objectMouseOver;
        Intrinsics.checkExpressionValueIsNotNull((Object)rayTraceResult2, (String)"mc.objectMouseOver");
        IBlockState iBlockState = worldClient.getBlockState(rayTraceResult2.getBlockPos());
        World world = (World)Class677.Method2863().world;
        RayTraceResult rayTraceResult3 = Class677.Method2863().objectMouseOver;
        Intrinsics.checkExpressionValueIsNotNull((Object)rayTraceResult3, (String)"mc.objectMouseOver");
        Class1266 class1266 = new Class1266(blockPos, Class1811.Method6834(iBlockState.getSelectedBoundingBox(world, rayTraceResult3.getBlockPos()), new Class2027(255, 255, 255, 150)));
        Class44 class443 = this.Field10878;
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"depth");
        boolean bl = class443.Method365();
        Class44 class444 = this.Field10879;
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"alpha");
        this.Field10880.Method2205(f, f2, class1266, bl, class444.Method365());
    }

    public Class677() {
        super("SmoothRenderer", "idk", Class97.Field8345);
    }

    public static final Minecraft Method2863() {
        return Class42.Field8052;
    }

    public static final void Method2864(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 158;
            cArray2[n] = (char)(cArray[n] ^ (0x4B62 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

