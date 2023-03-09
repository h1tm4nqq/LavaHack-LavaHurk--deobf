//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockAir
 *  net.minecraft.block.BlockLiquid
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.renderer.culling.Frustum
 *  net.minecraft.client.renderer.culling.ICamera
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketEntityAction
 *  net.minecraft.network.play.client.CPacketEntityAction$Action
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1036;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u001a\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b\u001a\u0006\u0010\u0011\u001a\u00020\u0005\u001a\u0006\u0010\u0012\u001a\u00020\t\u001a\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\t\u001a\u0006\u0010\u0016\u001a\u00020\u0014\u001a\u0016\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0000\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u000b\u001a\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000b\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0018"}, d2={"camera", "Lnet/minecraft/client/renderer/culling/Frustum;", "getCamera", "()Lnet/minecraft/client/renderer/culling/Frustum;", "entityBoxBorderLength", "", "player", "Lnet/minecraft/entity/player/EntityPlayer;", "entityPosition", "Lnet/minecraft/util/math/BlockPos;", "entity", "Lnet/minecraft/entity/Entity;", "isBBVisible", "", "bb", "Lnet/minecraft/util/math/AxisAlignedBB;", "isEntityVisible", "playerBoxBorderLength", "playerPosition", "sendInteractPacket", "", "pos", "updateCamera", "Lnet/minecraft/client/renderer/culling/ICamera;", "kisman.cc"})
public final class Class721 {
    @NotNull
    private static final Frustum Field11078 = new Frustum();
    private String Field11079 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public static final Frustum Method3009() {
        return Field11078;
    }

    public static final boolean Method3010(@NotNull @NotNull Entity entity) {
        Intrinsics.checkParameterIsNotNull((Object)entity, (String)"entity");
        AxisAlignedBB axisAlignedBB = entity.boundingBox;
        Intrinsics.checkExpressionValueIsNotNull((Object)axisAlignedBB, (String)"entity.boundingBox");
        return Class721.Method3011(axisAlignedBB);
    }

    public static final boolean Method3011(@NotNull @NotNull AxisAlignedBB axisAlignedBB) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"bb");
        Class721.Method3012();
        return Field11078.isBoundingBoxInFrustum(axisAlignedBB);
    }

    public static final void Method3012() {
        Entity entity = Class2142.Field17803.renderViewEntity;
        if (entity == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull((Object)entity, (String)"mc.renderViewEntity!!");
        Class721.Method3013(entity);
    }

    public static final void Method3013(@NotNull @NotNull Entity entity) {
        Intrinsics.checkParameterIsNotNull((Object)entity, (String)"entity");
        Class721.Method3014((ICamera)Field11078, entity);
    }

    public static final void Method3014(@NotNull @NotNull ICamera iCamera, @NotNull @NotNull Entity entity) {
        Intrinsics.checkParameterIsNotNull((Object)iCamera, (String)"camera");
        Intrinsics.checkParameterIsNotNull((Object)entity, (String)"entity");
        iCamera.setPosition(entity.posX, entity.posY, entity.posZ);
    }

    @NotNull
    @NotNull
    public static final BlockPos Method3015(@NotNull @NotNull Entity entity) {
        Intrinsics.checkParameterIsNotNull((Object)entity, (String)"entity");
        return new BlockPos(entity.posX, entity.posY, entity.posZ);
    }

    @NotNull
    @NotNull
    public static final BlockPos Method3016() {
        EntityPlayerSP entityPlayerSP = Class2142.Field17803.player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        return Class721.Method3015((Entity)entityPlayerSP);
    }

    public static final void Method3017(@NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        IBlockState iBlockState = Class2142.Field17803.world.getBlockState(blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(pos)");
        Block block = iBlockState.getBlock();
        if (!(block instanceof BlockAir) && !(block instanceof BlockLiquid)) {
            return;
        }
        EnumFacing enumFacing = Class1036.Method4211(blockPos);
        if (enumFacing == null) return;
        EnumFacing enumFacing2 = enumFacing;
        BlockPos blockPos2 = blockPos.offset(enumFacing2);
        EnumFacing enumFacing3 = enumFacing2.getOpposite();
        Vec3d vec3d = new Vec3d((Vec3i)blockPos2).add(Double.longBitsToDouble((long)266238339 ^ 0x3FE000000FDE7983L), Double.longBitsToDouble((long)176268227 ^ 0x3FE000000A81A3C3L), Double.longBitsToDouble(4602678819172646912L));
        EnumFacing enumFacing4 = enumFacing3;
        Intrinsics.checkExpressionValueIsNotNull((Object)enumFacing4, (String)"opposite");
        Vec3d vec3d2 = vec3d.add(new Vec3d(enumFacing4.getDirectionVec()).scale(Double.longBitsToDouble((long)663377521 ^ 0x3FE00000278A5671L)));
        boolean bl = false;
        EntityPlayerSP entityPlayerSP = Class2142.Field17803.player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (!entityPlayerSP.isSneaking()) {
            Class2142.Field17803.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class2142.Field17803.player, CPacketEntityAction.Action.START_SNEAKING));
            EntityPlayerSP entityPlayerSP2 = Class2142.Field17803.player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
            entityPlayerSP2.setSneaking(true);
            bl = true;
        }
        Class1036.Method4201(blockPos2, vec3d2, EnumHand.MAIN_HAND, enumFacing3, true);
        Class2142.Field17803.player.swingArm(EnumHand.MAIN_HAND);
        Class2142.Field17803.rightClickDelayTimer = 4;
    }

    public static final double Method3018(@NotNull @NotNull EntityPlayer entityPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, (String)"player");
        double d = entityPlayer.boundingBox.maxX - entityPlayer.boundingBox.minY;
        return Math.abs(d);
    }

    public static final double Method3019() {
        EntityPlayerSP entityPlayerSP = Class2142.Field17803.player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        return Class721.Method3018((EntityPlayer)entityPlayerSP);
    }

    private static String Method3020(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 152;
            cArray2[n] = (char)(cArray[n] ^ (0x4E5A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

