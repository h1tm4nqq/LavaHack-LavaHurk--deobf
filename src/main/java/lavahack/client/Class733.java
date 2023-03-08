//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.entity.item.*;
import net.minecraft.network.*;
import net.minecraft.init.*;
import net.minecraft.network.play.client.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.block.state.*;
import net.minecraft.block.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "kotlin.jvm.PlatformType", "invoke" })
final class Class733 implements Class254
{
    public static final Class733 Field11108;
    private int Field11109;
    
    public void Method979(final Object o) {
        this.Method3058((Class805)o);
    }
    
    public final void Method3058(final Class805 class805) {
        Intrinsics.checkExpressionValueIsNotNull((Object)class805, "it");
        final Packet method982 = class805.Method982();
        if (method982 instanceof CPacketPlayerTryUseItemOnBlock && Class1909.Method7080().objectMouseOver != null) {
            final Class44 method983 = Class1909.Method7083(Class1909.Field16809);
            Intrinsics.checkExpressionValueIsNotNull((Object)method983, "noInteractVal");
            if (method983.Method365()) {
                final RayTraceResult$Type typeOfHit = Class1909.Method7080().objectMouseOver.typeOfHit;
                if (typeOfHit == null) {
                    Intrinsics.throwNpe();
                }
                switch (Class1023.Field12476[typeOfHit.ordinal()]) {
                    case 1: {
                        final Class44 method984 = Class1909.Method7086(Class1909.Field16809);
                        Intrinsics.checkExpressionValueIsNotNull((Object)method984, "ntArmorStand");
                        if (method984.Method365() && Class1909.Method7080().objectMouseOver.entityHit instanceof EntityArmorStand) {
                            final Class44 method985 = Class1909.Method7087(Class1909.Field16809);
                            Intrinsics.checkExpressionValueIsNotNull((Object)method985, "ntReplacePacket");
                            if (method985.Method365()) {
                                Class1909.Method7080().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(((CPacketPlayerTryUseItemOnBlock)method982).hand));
                            }
                            class805.Method158();
                            break;
                        }
                        break;
                    }
                    case 2: {
                        final WorldClient world = Class1909.Method7080().world;
                        final RayTraceResult objectMouseOver = Class1909.Method7080().objectMouseOver;
                        Intrinsics.checkExpressionValueIsNotNull((Object)objectMouseOver, "mc.objectMouseOver");
                        final IBlockState getBlockState = world.getBlockState(objectMouseOver.getBlockPos());
                        Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState, "mc.world.getBlockState(m\u2026objectMouseOver.blockPos)");
                        final Block getBlock = getBlockState.getBlock();
                        Label_0359: {
                            if (Intrinsics.areEqual((Object)getBlock, (Object)Blocks.ENDER_CHEST)) {
                                final Class44 method986 = Class1909.Method7088(Class1909.Field16809);
                                Intrinsics.checkExpressionValueIsNotNull((Object)method986, "ntEnderChest");
                                if (method986.Method365()) {
                                    break Label_0359;
                                }
                            }
                            if (Intrinsics.areEqual((Object)getBlock, (Object)Blocks.CRAFTING_TABLE)) {
                                final Class44 method987 = Class1909.Method7089(Class1909.Field16809);
                                Intrinsics.checkExpressionValueIsNotNull((Object)method987, "ntCraftingTable");
                                if (method987.Method365()) {
                                    break Label_0359;
                                }
                            }
                            if (Intrinsics.areEqual((Object)getBlock, (Object)Blocks.CHEST)) {
                                final Class44 method988 = Class1909.Method7090(Class1909.Field16809);
                                Intrinsics.checkExpressionValueIsNotNull((Object)method988, "ntChest");
                                if (method988.Method365()) {
                                    break Label_0359;
                                }
                            }
                            if (Intrinsics.areEqual((Object)getBlock, (Object)Blocks.FURNACE)) {
                                final Class44 method989 = Class1909.Method7091(Class1909.Field16809);
                                Intrinsics.checkExpressionValueIsNotNull((Object)method989, "ntFurnace");
                                if (method989.Method365()) {
                                    break Label_0359;
                                }
                            }
                            if (!Intrinsics.areEqual((Object)getBlock, (Object)Blocks.ANVIL)) {
                                break;
                            }
                            final Class44 method990 = Class1909.Method7092(Class1909.Field16809);
                            Intrinsics.checkExpressionValueIsNotNull((Object)method990, "ntAnvil");
                            if (!method990.Method365()) {
                                break;
                            }
                        }
                        final Class44 method991 = Class1909.Method7087(Class1909.Field16809);
                        Intrinsics.checkExpressionValueIsNotNull((Object)method991, "ntReplacePacket");
                        if (method991.Method365()) {
                            Class1909.Method7080().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(((CPacketPlayerTryUseItemOnBlock)method982).hand));
                        }
                        class805.Method158();
                        break;
                    }
                }
            }
        }
        if (method982 instanceof CPacketUseEntity) {
            final Class44 method992 = Class1909.Method7093(Class1909.Field16809);
            Intrinsics.checkExpressionValueIsNotNull((Object)method992, "noFriendDamage");
            if (method992.Method365()) {
                final Entity getEntityFromWorld = ((CPacketUseEntity)method982).getEntityFromWorld((World)Class1909.Method7080().world);
                if (getEntityFromWorld instanceof EntityPlayer && Class726.Field11086.Method3043(((EntityPlayer)getEntityFromWorld).getName())) {
                    class805.Method158();
                    return;
                }
            }
        }
        if (method982 instanceof CPacketPlayerTryUseItemOnBlock) {
            final Class44 method993 = Class1909.Method7094(Class1909.Field16809);
            Intrinsics.checkExpressionValueIsNotNull((Object)method993, "roofInteract");
            if (method993.Method365()) {
                final BlockPos getPos = ((CPacketPlayerTryUseItemOnBlock)method982).getPos();
                Intrinsics.checkExpressionValueIsNotNull((Object)getPos, "packet.pos");
                if (getPos.getY() >= 255 && ((CPacketPlayerTryUseItemOnBlock)method982).getDirection() == EnumFacing.UP) {
                    Class1909.Method7080().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(((CPacketPlayerTryUseItemOnBlock)method982).getPos(), EnumFacing.DOWN, ((CPacketPlayerTryUseItemOnBlock)method982).hand, ((CPacketPlayerTryUseItemOnBlock)method982).facingX, ((CPacketPlayerTryUseItemOnBlock)method982).facingY, ((CPacketPlayerTryUseItemOnBlock)method982).facingZ));
                }
            }
        }
    }
    
    static {
        Field11108 = new Class733();
    }
    
    private static String Method3059(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3969 ^ 0x57));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
