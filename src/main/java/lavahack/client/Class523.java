//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.block.*;
import net.minecraft.util.math.*;
import net.minecraft.client.entity.*;
import net.minecraft.block.state.*;
import kotlin.collections.*;
import net.minecraft.util.*;
import java.util.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u001c" }, d2 = { "Lcom/kisman/cc/features/module/movement/ScaffoldRewrite;", "Lcom/kisman/cc/features/module/Module;", "()V", "debug2", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "lastY", "", "packet", "swap", "Lcom/kisman/cc/settings/types/SettingEnum;", "Lcom/kisman/cc/util/enums/dynamic/SwapEnum2$Swap;", "tower", "addConnectingBlocks", "", "pos1", "Lnet/minecraft/util/math/BlockPos;", "pos2", "queue", "Ljava/util/Queue;", "connected", "", "getPossibleConnectingFacings", "Lcom/kisman/cc/util/collections/Pair;", "Lnet/minecraft/util/EnumFacing;", "isTowerActive", "onEnable", "update", "kisman.cc" })
public final class Class523 extends Class42
{
    private final Class44 Field10210;
    private final Class44 Field10211;
    private final Class1303 Field10212;
    private final Class44 Field10213;
    private double Field10214;
    private String Field10215 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method38() {
        if (Method2394().player == null || Method2394().world == null) {
            this.Method22();
            return;
        }
        this.Field10214 = Method2394().player.posY;
        Method2394().player.jump();
    }
    
    public void Method45() {
        if (Method2394().player == null || Method2394().world == null) {
            return;
        }
        final int currentItem = Method2394().player.inventory.currentItem;
        final EntityPlayerSP player = Method2394().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
        final Block getBlockFromItem = Block.getBlockFromItem(player.getHeldItemOffhand().item);
        Intrinsics.checkExpressionValueIsNotNull((Object)getBlockFromItem, "Block.getBlockFromItem(m\u2026yer.heldItemOffhand.item)");
        final IBlockState getDefaultState = getBlockFromItem.getDefaultState();
        Intrinsics.checkExpressionValueIsNotNull((Object)getDefaultState, "Block.getBlockFromItem(m\u2026ffhand.item).defaultState");
        if (!getDefaultState.isFullBlock()) {
            final EntityPlayerSP player2 = Method2394().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
            final Block getBlockFromItem2 = Block.getBlockFromItem(player2.getHeldItemMainhand().item);
            Intrinsics.checkExpressionValueIsNotNull((Object)getBlockFromItem2, "Block.getBlockFromItem(m\u2026er.heldItemMainhand.item)");
            final IBlockState getDefaultState2 = getBlockFromItem2.getDefaultState();
            Intrinsics.checkExpressionValueIsNotNull((Object)getDefaultState2, "Block.getBlockFromItem(m\u2026inhand.item).defaultState");
            if (!getDefaultState2.isFullBlock()) {
                if (Class9.Method102() == -1) {
                    Class1393.Method5504().Method1886("No blocks! Disabling!");
                    super.Method21(false);
                    return;
                }
            }
        }
        if (this.Method27()) {
            final EntityPlayerSP player3 = Method2394().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player3, "mc.player");
            if (Class1486.Method5948(player3.getPosition().down(), false, true)) {
                final EntityPlayerSP player4 = Method2394().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player4, "mc.player");
                final BlockPos down = player4.getPosition().down();
                final EnumHand main_HAND = EnumHand.MAIN_HAND;
                final boolean b = false;
                final Class44 field10213 = this.Field10213;
                Intrinsics.checkExpressionValueIsNotNull((Object)field10213, "packet");
                Class1036.Method4208(down, main_HAND, b, field10213.Method365());
            }
            if (Method2394().player.onGround) {
                Method2394().player.jump();
                this.Field10214 = Method2394().player.posY;
            }
            else {
                Method2394().player.motionY = Double.longBitsToDouble((long)895269918 ^ 0xBFD1EB852BE4EDF2L);
            }
        }
        else {
            final LinkedList<BlockPos> list = new LinkedList<BlockPos>();
            final BlockPos down2 = new BlockPos(Method2394().player.posX, Method2394().player.posY, Method2394().player.posZ).down();
            final BlockPos down3 = new BlockPos(Method2394().player.posX + Method2394().player.motionX, Method2394().player.posY, Method2394().player.posZ + Method2394().player.motionZ).down();
            final BlockPos blockPos = down2;
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, "oldPos");
            final BlockPos blockPos2 = down3;
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, "playerPos");
            if (!this.Method2391(blockPos, blockPos2)) {
                final Class44 field10214 = this.Field10210;
                Intrinsics.checkExpressionValueIsNotNull((Object)field10214, "debug2");
                if (field10214.Method365()) {
                    this.Method2392(down2, down3, list);
                }
            }
            list.add(down3);
            for (final BlockPos blockPos3 : list) {
                if (!Class1486.Method5948(blockPos3, false, true)) {
                    continue;
                }
                final BlockPos blockPos4 = blockPos3;
                final EnumHand main_HAND2 = EnumHand.MAIN_HAND;
                final boolean b2 = false;
                final Class44 field10215 = this.Field10213;
                Intrinsics.checkExpressionValueIsNotNull((Object)field10215, "packet");
                Class1036.Method4208(blockPos4, main_HAND2, b2, field10215.Method365());
            }
        }
    }
    
    private final boolean Method27() {
        final Class44 field10211 = this.Field10211;
        Intrinsics.checkExpressionValueIsNotNull((Object)field10211, "tower");
        return field10211.Method365() && (int)Method2394().player.posY > this.Field10214;
    }
    
    private final boolean Method2391(final BlockPos blockPos, final BlockPos blockPos2) {
        return CollectionsKt.listOf((Object[])new BlockPos[] { blockPos, blockPos.north(), blockPos.east(), blockPos.south(), blockPos.west() }).contains(blockPos2);
    }
    
    private final void Method2392(final BlockPos blockPos, final BlockPos blockPos2, final Queue queue) {
        final Class574 method2393 = this.Method2393(blockPos, blockPos2);
        final BlockPos offset = blockPos.offset((EnumFacing)method2393.Method2522());
        final BlockPos offset2 = blockPos.offset((EnumFacing)method2393.Method2523());
        final EntityPlayerSP player = Method2394().player;
        final BlockPos blockPos3 = offset;
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, "p1");
        final double getDistanceSq = player.getDistanceSq(blockPos3.getX() + Double.longBitsToDouble(4602678819172646912L), (double)offset.getY(), offset.getZ() + Double.longBitsToDouble((long)2013496954 ^ 0x3FE000007803867AL));
        final EntityPlayerSP player2 = Method2394().player;
        final BlockPos blockPos4 = offset2;
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos4, "p2");
        if (getDistanceSq < player2.getDistanceSq(blockPos4.getX() + Double.longBitsToDouble(4602678819172646912L), (double)offset2.getY(), offset2.getZ() + Double.longBitsToDouble(4602678819172646912L))) {
            queue.add(offset);
        }
        else {
            queue.add(offset2);
        }
        if (blockPos.getY() < blockPos2.getY()) {
            queue.add(blockPos2.down());
        }
    }
    
    private final Class574 Method2393(final BlockPos blockPos, final BlockPos blockPos2) {
        final ArrayList<EnumFacing> list = new ArrayList<EnumFacing>();
        if (blockPos.getX() < blockPos2.getX()) {
            list.add(EnumFacing.EAST);
        }
        else {
            list.add(EnumFacing.WEST);
        }
        if (blockPos.getZ() < blockPos2.getZ()) {
            list.add(EnumFacing.SOUTH);
        }
        else {
            list.add(EnumFacing.NORTH);
        }
        return new Class574(list.get(0), list.get(1));
    }
    
    public Class523() {
        super("ScaffoldRewrite", "ohhhh", Class97.Field8340);
        this.Field10210 = this.Method23(new Class44("Debug2", (Class42)this, true));
        this.Field10211 = this.Method23(new Class44("Tower", (Class42)this, false));
        this.Field10212 = new Class1303("Swap", (Class42)this, (Enum)Class711.Field11028).Method5303();
        this.Field10213 = this.Method23(new Class44("Packet", (Class42)this, false));
    }
    
    public static final Minecraft Method2394() {
        return Class42.Field8052;
    }
    
    public static final void Method2395(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2083 ^ 0x7F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
