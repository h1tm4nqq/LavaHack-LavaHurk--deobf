//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.BlockPistonBase
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityEnderCrystal
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Rotation
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import lavahack.client.Class1568;
import lavahack.client.Class1629;
import lavahack.client.Class1932;
import lavahack.client.Class1996;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class57;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class Class1919
extends Class1629 {
    private final Class44 Field16919;
    private final Class44 Field16920;
    private final Class44 Field16921;
    private final Class44 Field16922;
    private final Class44 Field16923;
    private String Field16924 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1919(Class1996 class1996) {
        super(class1996, "CrystalPushBlocker", false, false);
        this.Field16919 = this.Method6363(new Class44("YRange", (Class42)this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, Double.longBitsToDouble((long)998188532 ^ 0x401000003B7F25F4L), 1.0, Double.longBitsToDouble(4618441417868443648L), false));
        this.Field16920 = this.Method6363(new Class44("YDown", (Class42)this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, false));
        this.Field16921 = this.Method6363(new Class44("Rotate", (Class42)this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, false));
        this.Field16922 = this.Method6363(new Class44("Packet", (Class42)this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, true));
        this.Field16923 = this.Method6363(new Class44("ClientSide", (Class42)this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, Class1932.Field16958));
    }

    @Override
    public void Method6366() {
        if (Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player == null) return;
        if (Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.world == null) {
            return;
        }
        AxisAlignedBB axisAlignedBB = this.Method7170();
        EnumFacing[] enumFacingArray = EnumFacing.HORIZONTALS;
        int n = enumFacingArray.length;
        int n2 = 0;
        while (n2 < n) {
            EnumFacing enumFacing = enumFacingArray[n2];
            AxisAlignedBB axisAlignedBB2 = axisAlignedBB.offset(new Vec3d(enumFacing.getDirectionVec()));
            for (EntityEnderCrystal entityEnderCrystal : Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.world.getEntitiesWithinAABB(EntityEnderCrystal.class, axisAlignedBB2)) {
                AxisAlignedBB axisAlignedBB3;
                BlockPos blockPos = new BlockPos(entityEnderCrystal.posX, entityEnderCrystal.posY, entityEnderCrystal.posZ);
                blockPos.offset(enumFacing);
                IBlockState iBlockState = Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.world.getBlockState(blockPos);
                if (!(iBlockState.getBlock() instanceof BlockPistonBase) || !axisAlignedBB2.intersects(axisAlignedBB3 = new AxisAlignedBB(entityEnderCrystal.posX + Double.longBitsToDouble((long)1599475707 ^ 0x3FE000005F560FFBL), entityEnderCrystal.posY, entityEnderCrystal.posZ + Double.longBitsToDouble(4602678819172646912L), entityEnderCrystal.posX - Double.longBitsToDouble((long)728156493 ^ 0x3FE000002B66C94DL), entityEnderCrystal.posY + 1.0, entityEnderCrystal.posZ - Double.longBitsToDouble((long)738431615 ^ 0x3FE000002C03927FL)))) continue;
                this.Method7169(entityEnderCrystal);
            }
            ++n2;
        }
    }

    private void Method7169(EntityEnderCrystal entityEnderCrystal) {
        float[] fArray = new float[]{Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.rotationYaw, Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.rotationPitch};
        float[] fArray2 = Class1568.Method6179((Entity)entityEnderCrystal);
        if (this.Field16921.Method365()) {
            Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray2[0], fArray2[1], Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.onGround));
        }
        if (this.Field16922.Method365()) {
            Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.connection.sendPacket((Packet)new CPacketUseEntity((Entity)entityEnderCrystal));
        } else {
            Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.playerController.attackEntity((EntityPlayer)Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player, (Entity)entityEnderCrystal);
        }
        switch (Class57.Field8180[((Class1932)this.Field16923.Method341()).ordinal()]) {
            case 1: {
                break;
            }
            case 2: {
                entityEnderCrystal.setDead();
                break;
            }
            case 3: {
                Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.world.removeEntityFromWorld(entityEnderCrystal.entityId);
                break;
            }
            case 4: {
                entityEnderCrystal.setDead();
                Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.world.removeEntityFromWorld(entityEnderCrystal.entityId);
                break;
            }
        }
        if (!this.Field16921.Method365()) return;
        Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray[0], fArray[1], Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.onGround));
    }

    private AxisAlignedBB Method7170() {
        BlockPos blockPos = this.Method7171();
        double d = blockPos.getX();
        double d2 = this.Field16920.Method365() ? (double)blockPos.getY() - this.Field16919.Method367() : (double)blockPos.getY();
        double d3 = blockPos.getZ();
        double d4 = blockPos.getX() + 1;
        double d5 = (double)blockPos.getY() + this.Field16919.Method367();
        double d6 = blockPos.getZ() + 1;
        return new AxisAlignedBB(d, d2, d3, d4, d5, d6);
    }

    private BlockPos Method7171() {
        return new BlockPos(Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.posX, Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.posY, Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.posZ);
    }

    private static String Method7172(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 21;
            cArray2[n] = (char)(cArray[n] ^ (0x322A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

