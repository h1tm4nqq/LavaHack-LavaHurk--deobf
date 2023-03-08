//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.entity.*;
import kotlin.jvm.internal.*;
import com.kisman.cc.util.*;
import net.minecraft.client.renderer.culling.*;
import net.minecraft.client.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.network.*;
import net.minecraft.network.play.client.*;
import net.minecraft.block.state.*;
import net.minecraft.block.*;
import net.minecraft.util.*;
import net.minecraft.entity.player.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u001a\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b\u001a\u0006\u0010\u0011\u001a\u00020\u0005\u001a\u0006\u0010\u0012\u001a\u00020\t\u001a\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\t\u001a\u0006\u0010\u0016\u001a\u00020\u0014\u001a\u0016\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0000\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u000b\u001a\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000b\"\u0011\u0010\u0000\u001a\u00020\u0001?\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003?\u0006\u0018" }, d2 = { "camera", "Lnet/minecraft/client/renderer/culling/Frustum;", "getCamera", "()Lnet/minecraft/client/renderer/culling/Frustum;", "entityBoxBorderLength", "", "player", "Lnet/minecraft/entity/player/EntityPlayer;", "entityPosition", "Lnet/minecraft/util/math/BlockPos;", "entity", "Lnet/minecraft/entity/Entity;", "isBBVisible", "", "bb", "Lnet/minecraft/util/math/AxisAlignedBB;", "isEntityVisible", "playerBoxBorderLength", "playerPosition", "sendInteractPacket", "", "pos", "updateCamera", "Lnet/minecraft/client/renderer/culling/ICamera;", "kisman.cc" })
public final class Class721
{
    @NotNull
    private static final Frustum Field11078;
    private String Field11079 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public static final Frustum Method3009() {
        return Class721.Field11078;
    }
    
    public static final boolean Method3010(@NotNull @NotNull final Entity entity) {
        Intrinsics.checkParameterIsNotNull((Object)entity, "entity");
        final AxisAlignedBB boundingBox = entity.boundingBox;
        Intrinsics.checkExpressionValueIsNotNull((Object)boundingBox, "entity.boundingBox");
        return Method3011(boundingBox);
    }
    
    public static final boolean Method3011(@NotNull @NotNull final AxisAlignedBB axisAlignedBB) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, "bb");
        Method3012();
        return Class721.Field11078.isBoundingBoxInFrustum(axisAlignedBB);
    }
    
    public static final void Method3012() {
        final Entity renderViewEntity = Class2142.Field17803.renderViewEntity;
        if (renderViewEntity == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull((Object)renderViewEntity, "mc.renderViewEntity!!");
        Method3013(renderViewEntity);
    }
    
    public static final void Method3013(@NotNull @NotNull final Entity entity) {
        Intrinsics.checkParameterIsNotNull((Object)entity, "entity");
        Method3014((ICamera)Class721.Field11078, entity);
    }
    
    public static final void Method3014(@NotNull @NotNull final ICamera camera, @NotNull @NotNull final Entity entity) {
        Intrinsics.checkParameterIsNotNull((Object)camera, "camera");
        Intrinsics.checkParameterIsNotNull((Object)entity, "entity");
        camera.setPosition(entity.posX, entity.posY, entity.posZ);
    }
    
    @NotNull
    @NotNull
    public static final BlockPos Method3015(@NotNull @NotNull final Entity entity) {
        Intrinsics.checkParameterIsNotNull((Object)entity, "entity");
        return new BlockPos(entity.posX, entity.posY, entity.posZ);
    }
    
    @NotNull
    @NotNull
    public static final BlockPos Method3016() {
        final EntityPlayerSP player = Class2142.Field17803.player;
        Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
        return Method3015((Entity)player);
    }
    
    public static final void Method3017(@NotNull @NotNull final BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos");
        final IBlockState getBlockState = Class2142.Field17803.world.getBlockState(blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState, "mc.world.getBlockState(pos)");
        final Block getBlock = getBlockState.getBlock();
        if (!(getBlock instanceof BlockAir) && !(getBlock instanceof BlockLiquid)) {
            return;
        }
        final EnumFacing method4211 = Class1036.Method4211(blockPos);
        if (method4211 != null) {
            final EnumFacing enumFacing = method4211;
            final BlockPos offset = blockPos.offset(enumFacing);
            final EnumFacing getOpposite = enumFacing.getOpposite();
            final Vec3d add = new Vec3d((Vec3i)offset).add(Double.longBitsToDouble((long)266238339 ^ 0x3FE000000FDE7983L), Double.longBitsToDouble((long)176268227 ^ 0x3FE000000A81A3C3L), Double.longBitsToDouble(4602678819172646912L));
            final EnumFacing enumFacing2 = getOpposite;
            Intrinsics.checkExpressionValueIsNotNull((Object)enumFacing2, "opposite");
            final Vec3d add = add.add(new Vec3d(enumFacing2.getDirectionVec()).scale(Double.longBitsToDouble((long)663377521 ^ 0x3FE00000278A5671L)));
            final EntityPlayerSP player = Class2142.Field17803.player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
            if (!player.isSneaking()) {
                Class2142.Field17803.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class2142.Field17803.player, CPacketEntityAction$Action.START_SNEAKING));
                final EntityPlayerSP player2 = Class2142.Field17803.player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
                player2.setSneaking(true);
            }
            Class1036.Method4201(offset, add, EnumHand.MAIN_HAND, getOpposite, true);
            Class2142.Field17803.player.swingArm(EnumHand.MAIN_HAND);
            Class2142.Field17803.rightClickDelayTimer = 4;
        }
    }
    
    public static final double Method3018(@NotNull @NotNull final EntityPlayer entityPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, "player");
        return Math.abs(entityPlayer.boundingBox.maxX - entityPlayer.boundingBox.minY);
    }
    
    public static final double Method3019() {
        final EntityPlayerSP player = Class2142.Field17803.player;
        Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
        return Method3018((EntityPlayer)player);
    }
    
    static {
        Field11078 = new Frustum();
    }
    
    private static String Method3020(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4E5A ^ 0x98));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
