//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraftforge.client.event.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.world.*;
import com.kisman.cc.util.*;
import net.minecraft.util.math.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.block.state.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0012" }, d2 = { "Lcom/kisman/cc/features/module/Debug/SmoothRenderer;", "Lcom/kisman/cc/features/module/Module;", "()V", "alpha", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "depth", "fadeLength", "movingLength", "renderer", "Lcom/kisman/cc/features/module/Debug/SmoothRenderer$Renderer;", "onEnable", "", "onRenderWorld", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "PlaceInfo", "Renderer", "kisman.cc" })
public final class Class677 extends Class42
{
    private final Class44 Field10876;
    private final Class44 Field10877;
    private final Class44 Field10878;
    private final Class44 Field10879;
    private final Class470 Field10880;
    private String Field10881 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method38() {
        super.Method38();
        this.Field10880.Method2204();
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method2862(@NotNull @NotNull final RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, "event");
        if (Method2863().objectMouseOver == null || Method2863().objectMouseOver.typeOfHit != RayTraceResult$Type.BLOCK) {
            return;
        }
        final Class470 field10880 = this.Field10880;
        final Class44 field10881 = this.Field10876;
        Intrinsics.checkExpressionValueIsNotNull((Object)field10881, "movingLength");
        final float method368 = field10881.Method368();
        final Class44 field10882 = this.Field10877;
        Intrinsics.checkExpressionValueIsNotNull((Object)field10882, "fadeLength");
        final float method369 = field10882.Method368();
        final RayTraceResult objectMouseOver = Method2863().objectMouseOver;
        Intrinsics.checkExpressionValueIsNotNull((Object)objectMouseOver, "mc.objectMouseOver");
        final BlockPos getBlockPos = objectMouseOver.getBlockPos();
        final WorldClient world = Method2863().world;
        final RayTraceResult objectMouseOver2 = Method2863().objectMouseOver;
        Intrinsics.checkExpressionValueIsNotNull((Object)objectMouseOver2, "mc.objectMouseOver");
        final IBlockState getBlockState = world.getBlockState(objectMouseOver2.getBlockPos());
        final World world = (World)Method2863().world;
        final RayTraceResult objectMouseOver3 = Method2863().objectMouseOver;
        Intrinsics.checkExpressionValueIsNotNull((Object)objectMouseOver3, "mc.objectMouseOver");
        final Class1266 class1266 = new Class1266(getBlockPos, Class1811.Method6834(getBlockState.getSelectedBoundingBox(world, objectMouseOver3.getBlockPos()), new Class2027(255, 255, 255, 150)));
        final Class44 field10883 = this.Field10878;
        Intrinsics.checkExpressionValueIsNotNull((Object)field10883, "depth");
        final boolean method370 = field10883.Method365();
        final Class44 field10884 = this.Field10879;
        Intrinsics.checkExpressionValueIsNotNull((Object)field10884, "alpha");
        field10880.Method2205(method368, method369, class1266, method370, field10884.Method365());
    }
    
    public Class677() {
        super("SmoothRenderer", "idk", Class97.Field8345);
        this.Field10876 = this.Method23(new Class44("Moving Length", (Class42)this, Double.longBitsToDouble(4645744490609377280L), 0.0, Double.longBitsToDouble(4652007308841189376L), Class467.Field9943));
        this.Field10877 = this.Method23(new Class44("Fade Length", (Class42)this, Double.longBitsToDouble((long)399448367 ^ 0x4069000017CF192FL), 0.0, Double.longBitsToDouble((long)266623891 ^ 0x408F40000FE45B93L), Class467.Field9943));
        this.Field10878 = this.Method23(new Class44("Depth", (Class42)this, false));
        this.Field10879 = this.Method23(new Class44("Alpha", (Class42)this, true));
        this.Field10880 = new Class470();
    }
    
    public static final Minecraft Method2863() {
        return Class42.Field8052;
    }
    
    public static final void Method2864(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4B62 ^ 0x9E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
