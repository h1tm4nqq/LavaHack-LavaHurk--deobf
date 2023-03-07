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

import lavahack.client.AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y;
import lavahack.client.PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$1;
import lavahack.client.PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import lavahack.client.z8jqWjC6qe83En2OBrLpROsiqSx1KUxr;
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

public class PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL
extends z8jqWjC6qe83En2OBrLpROsiqSx1KUxr {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16919;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16920;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16921;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16922;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16923;
    private String Field16924 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2) {
        super(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2, "CrystalPushBlocker", (boolean)((long)1324438995 ^ (long)1324438995), (boolean)((long)-1310807551 ^ (long)-1310807551));
        this.Field16919 = this.Method6363(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("YRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, Double.longBitsToDouble((long)998188532 ^ 0x401000003B7F25F4L), 1.0, Double.longBitsToDouble(0x8C07E55A9168D43FL ^ 0xCC1FE55A9168D43FL), (boolean)((long)415036862 ^ (long)415036862)));
        this.Field16920 = this.Method6363(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("YDown", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, ((int)1739220371L ^ 0x67AA6593) != 0));
        this.Field16921 = this.Method6363(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, ((int)1494806447L ^ 0x5918EFAF) != 0));
        this.Field16922 = this.Method6363(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, ((int)1875281691L ^ 0x6FC6871A) != 0));
        this.Field16923 = this.Method6363(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ClientSide", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16958));
    }

    @Override
    public void Method6366() {
        if (PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player == null) return;
        if (PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.world == null) {
            return;
        }
        AxisAlignedBB axisAlignedBB = this.Method7170();
        EnumFacing[] enumFacingArray = EnumFacing.HORIZONTALS;
        int n = enumFacingArray.length;
        int n2 = (int)((long)-1132397992 ^ (long)-1132397992);
        while (n2 < n) {
            EnumFacing enumFacing = enumFacingArray[n2];
            AxisAlignedBB axisAlignedBB2 = axisAlignedBB.offset(new Vec3d(enumFacing.getDirectionVec()));
            for (EntityEnderCrystal entityEnderCrystal : PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.world.getEntitiesWithinAABB(EntityEnderCrystal.class, axisAlignedBB2)) {
                AxisAlignedBB axisAlignedBB3;
                BlockPos blockPos = new BlockPos(entityEnderCrystal.posX, entityEnderCrystal.posY, entityEnderCrystal.posZ);
                blockPos.offset(enumFacing);
                IBlockState iBlockState = PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.world.getBlockState(blockPos);
                if (!(iBlockState.getBlock() instanceof BlockPistonBase) || !axisAlignedBB2.intersects(axisAlignedBB3 = new AxisAlignedBB(entityEnderCrystal.posX + Double.longBitsToDouble((long)1599475707 ^ 0x3FE000005F560FFBL), entityEnderCrystal.posY, entityEnderCrystal.posZ + Double.longBitsToDouble(0x30BC797B9E7C83B9L ^ 0xF5C797B9E7C83B9L), entityEnderCrystal.posX - Double.longBitsToDouble((long)728156493 ^ 0x3FE000002B66C94DL), entityEnderCrystal.posY + 1.0, entityEnderCrystal.posZ - Double.longBitsToDouble((long)738431615 ^ 0x3FE000002C03927FL)))) continue;
                this.Method7169(entityEnderCrystal);
            }
            ++n2;
        }
    }

    private void Method7169(EntityEnderCrystal entityEnderCrystal) {
        float[] fArray = new float[(int)((long)-960087636 ^ (long)-960087635) << 1];
        fArray[(int)((long)-1580005632 ^ (long)-1580005632)] = PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.rotationYaw;
        fArray[(int)975576259L ^ 0x3A261CC2] = PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.rotationPitch;
        float[] fArray2 = fArray;
        float[] fArray3 = AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6179((Entity)entityEnderCrystal);
        if (this.Field16921.Method365()) {
            PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray3[(int)((long)-1402997498 ^ (long)-1402997498)], fArray3[(int)((long)-193419881 ^ (long)-193419882)], PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.onGround));
        }
        if (this.Field16922.Method365()) {
            PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.connection.sendPacket((Packet)new CPacketUseEntity((Entity)entityEnderCrystal));
        } else {
            PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.playerController.attackEntity((EntityPlayer)PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player, (Entity)entityEnderCrystal);
        }
        switch (PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$1.Field8180[((PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field16923.Method341()).ordinal()]) {
            case 1: {
                break;
            }
            case 2: {
                entityEnderCrystal.setDead();
                break;
            }
            case 3: {
                PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.world.removeEntityFromWorld(entityEnderCrystal.entityId);
                break;
            }
            case 4: {
                entityEnderCrystal.setDead();
                PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.world.removeEntityFromWorld(entityEnderCrystal.entityId);
                break;
            }
        }
        if (!this.Field16921.Method365()) return;
        PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray2[(int)-1955425222L ^ 0x8B72943A], fArray2[(int)((long)900487451 ^ (long)900487450)], PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.onGround));
    }

    private AxisAlignedBB Method7170() {
        BlockPos blockPos = this.Method7171();
        double d = blockPos.getX();
        double d2 = this.Field16920.Method365() ? (double)blockPos.getY() - this.Field16919.Method367() : (double)blockPos.getY();
        double d3 = blockPos.getZ();
        double d4 = blockPos.getX() + (int)((long)1321025416 ^ (long)1321025417);
        double d5 = (double)blockPos.getY() + this.Field16919.Method367();
        double d6 = blockPos.getZ() + ((int)1352876317L ^ 0x50A3411C);
        return new AxisAlignedBB(d, d2, d3, d4, d5, d6);
    }

    private BlockPos Method7171() {
        return new BlockPos(PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.posX, PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.posY, PTKCmUGf1iS8BG2RbxeAKbuRBDi8gDqL.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.posZ);
    }

    private static String Method7172(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1735079321 ^ (long)-1735079321);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1500012277 ^ (long)1500012042);
            int n2 = (int)-218676336L ^ 0xF2F74385;
            cArray2[n] = (char)(cArray[n] ^ (((int)-649773730L ^ 0xD945244B) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

