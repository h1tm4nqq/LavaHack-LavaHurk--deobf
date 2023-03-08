//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.util.math.*;
import net.minecraftforge.event.entity.player.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.init.*;
import net.minecraft.block.state.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.client.*;

@Class1270(parents = { "AutoRer" })
@Class794
@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0006\u0010\u0018\u001a\u00020\u0013R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011?\u0006\u0019" }, d2 = { "Lcom/kisman/cc/features/module/combat/Crystals;", "Lcom/kisman/cc/features/module/Module;", "()V", "debug", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "pos", "Lnet/minecraft/util/math/BlockPos;", "getPos", "()Lnet/minecraft/util/math/BlockPos;", "setPos", "(Lnet/minecraft/util/math/BlockPos;)V", "state", "", "getState", "()Z", "setState", "(Z)V", "onDisable", "", "onEnable", "onLeftClickBlock", "event", "Lnet/minecraftforge/event/entity/player/PlayerInteractEvent$LeftClickBlock;", "reset", "kisman.cc" })
public final class Class1082 extends Class42
{
    private static final Class44 Field12829;
    @Nullable
    private static BlockPos Field12830;
    private static boolean Field12831;
    public static final Class1082 Field12832;
    private String Field12833 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Nullable
    @Nullable
    public final BlockPos Method4368() {
        return Class1082.Field12830;
    }
    
    public final void Method4369(@Nullable @Nullable final BlockPos field12830) {
        Class1082.Field12830 = field12830;
    }
    
    public final boolean Method27() {
        return Class1082.Field12831;
    }
    
    public final void Method4370(final boolean field12831) {
        Class1082.Field12831 = field12831;
    }
    
    @Override
    public void Method38() {
        super.Method38();
        this.Method4371();
    }
    
    @Override
    public void Method39() {
        super.Method39();
        this.Method4371();
    }
    
    public final void Method4371() {
        Class1082.Field12830 = null;
        Class1082.Field12831 = false;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method4372(@NotNull @NotNull final PlayerInteractEvent$LeftClickBlock playerInteractEvent$LeftClickBlock) {
        Intrinsics.checkParameterIsNotNull((Object)playerInteractEvent$LeftClickBlock, "event");
        final IBlockState getBlockState = Method4373().world.getBlockState(playerInteractEvent$LeftClickBlock.getPos());
        if (Intrinsics.areEqual((Object)getBlockState, (Object)Blocks.OBSIDIAN) || Intrinsics.areEqual((Object)getBlockState, (Object)Blocks.BEDROCK)) {
            final Class44 field12829 = Class1082.Field12829;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12829, "debug");
            if (field12829.Method365()) {
                System.out.println((Object)"meow2 its obby or bebrock");
            }
            Class1082.Field12830 = playerInteractEvent$LeftClickBlock.getPos();
            Class1082.Field12831 = true;
        }
    }
    
    private Class1082() {
        super("Crystals", "Changes place of of AutoRer if he have no valid place pos. Useful for breaking surround.", Class97.Field8338);
    }
    
    static {
        final Class1082 class1082 = Field12832 = new Class1082();
        Field12829 = class1082.Method23(new Class44("Debug", class1082, true));
    }
    
    public static final Minecraft Method4373() {
        return Class42.Field8052;
    }
    
    public static final void Method4374(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x43AB ^ 0x13));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
