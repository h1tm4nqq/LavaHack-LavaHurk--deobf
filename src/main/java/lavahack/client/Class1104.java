//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.item.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.block.*;
import net.minecraft.client.entity.*;
import java.util.*;
import net.minecraft.block.state.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e?\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0014" }, d2 = { "Lcom/kisman/cc/features/module/misc/AntiRegear;", "Lcom/kisman/cc/features/module/Module;", "()V", "breakQueue", "Ljava/util/ArrayList;", "Lnet/minecraft/util/math/BlockPos;", "Lkotlin/collections/ArrayList;", "oldSlot", "", "getOldSlot", "()I", "setOldSlot", "(I)V", "range", "Lcom/kisman/cc/settings/Setting;", "getRange", "()Lcom/kisman/cc/settings/Setting;", "switchToPick", "update", "", "kisman.cc" })
public final class Class1104 extends Class42
{
    @NotNull
    private final Class44 Field12980;
    private final Class44 Field12981;
    private int Field12982;
    private final ArrayList Field12983;
    private String Field12984 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class44 Method4520() {
        return this.Field12980;
    }
    
    public final int Method4521() {
        return this.Field12982;
    }
    
    public final void Method4522(final int field12982) {
        this.Field12982 = field12982;
    }
    
    @Override
    public void Method45() {
        if (Method4523().player == null || Method4523().world == null) {
            return;
        }
        if (this.Field12983.isEmpty() && this.Field12982 != -1) {
            final EntityPlayerSP player = Method4523().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
            if (player.getHeldItemMainhand().item instanceof ItemPickaxe && this.Field12981.Method365()) {
                Class1393.Method5505().Method1886("Switching back to original slot.");
                Class9.Method110(this.Field12982, false);
                this.Field12982 = -1;
            }
        }
        for (final BlockPos blockPos : Class2155.Method7756((Entity)Method4523().player, this.Field12980.Method368(), false, true)) {
            final IBlockState getBlockState = Method4523().world.getBlockState(blockPos);
            Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState, "mc.world.getBlockState(pos)");
            if (getBlockState.getBlock() instanceof BlockShulkerBox && !this.Field12983.contains(blockPos)) {
                this.Field12983.add(blockPos);
            }
        }
        if (!this.Field12983.isEmpty()) {}
    }
    
    public Class1104() {
        super("AntiRegear", "Breaks shulkers for you.", Class97.Field8343);
        this.Field12980 = new Class44("Range", this, Double.longBitsToDouble(4617315517961601024L), 0.0, Double.longBitsToDouble((long)1414134738 ^ 0x401800005449FBD2L), true);
        this.Field12981 = new Class44("Switch To Pick", this, true);
        this.Field12982 = -1;
        this.Field12983 = new ArrayList();
    }
    
    public static final Minecraft Method4523() {
        return Class42.Field8052;
    }
    
    public static final void Method4524(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x70D5 ^ 0xF8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
