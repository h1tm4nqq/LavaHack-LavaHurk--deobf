//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.*;
import net.minecraft.entity.item.*;
import net.minecraft.block.*;
import net.minecraft.util.math.*;
import java.util.*;
import net.minecraft.entity.*;
import net.minecraft.network.*;
import net.minecraft.network.play.client.*;
import net.minecraft.entity.player.*;

public class Class1919 extends Class1629
{
    private final Class44 Field16919;
    private final Class44 Field16920;
    private final Class44 Field16921;
    private final Class44 Field16922;
    private final Class44 Field16923;
    private String Field16924 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1919(final Class1996 class1996) {
        super(class1996, "CrystalPushBlocker", false, false);
        this.Field16919 = this.Method6363(new Class44("YRange", this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, Double.longBitsToDouble((long)998188532 ^ 0x401000003B7F25F4L), 1.0, Double.longBitsToDouble(4618441417868443648L), false));
        this.Field16920 = this.Method6363(new Class44("YDown", this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, false));
        this.Field16921 = this.Method6363(new Class44("Rotate", this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, false));
        this.Field16922 = this.Method6363(new Class44("Packet", this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, true));
        this.Field16923 = this.Method6363(new Class44("ClientSide", this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, Class1932.Field16958));
    }
    
    public void Method6366() {
        if (Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player == null || Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.world == null) {
            return;
        }
        final AxisAlignedBB method7170 = this.Method7170();
        for (final EnumFacing enumFacing : EnumFacing.HORIZONTALS) {
            final AxisAlignedBB offset = method7170.offset(new Vec3d(enumFacing.getDirectionVec()));
            for (final EntityEnderCrystal entityEnderCrystal : Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.world.getEntitiesWithinAABB((Class)EntityEnderCrystal.class, offset)) {
                final BlockPos blockPos = new BlockPos(entityEnderCrystal.posX, entityEnderCrystal.posY, entityEnderCrystal.posZ);
                blockPos.offset(enumFacing);
                if (!(Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.world.getBlockState(blockPos).getBlock() instanceof BlockPistonBase)) {
                    continue;
                }
                if (!offset.intersects(new AxisAlignedBB(entityEnderCrystal.posX + Double.longBitsToDouble((long)1599475707 ^ 0x3FE000005F560FFBL), entityEnderCrystal.posY, entityEnderCrystal.posZ + Double.longBitsToDouble(4602678819172646912L), entityEnderCrystal.posX - Double.longBitsToDouble((long)728156493 ^ 0x3FE000002B66C94DL), entityEnderCrystal.posY + 1.0, entityEnderCrystal.posZ - Double.longBitsToDouble((long)738431615 ^ 0x3FE000002C03927FL)))) {
                    continue;
                }
                this.Method7169(entityEnderCrystal);
            }
        }
    }
    
    private void Method7169(final EntityEnderCrystal entityEnderCrystal) {
        final float[] array = { Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.rotationYaw, Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.rotationPitch };
        final float[] method6179 = Class1568.Method6179((Entity)entityEnderCrystal);
        if (this.Field16921.Method365()) {
            Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.connection.sendPacket((Packet)new CPacketPlayer$Rotation(method6179[0], method6179[1], Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.onGround));
        }
        if (this.Field16922.Method365()) {
            Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.connection.sendPacket((Packet)new CPacketUseEntity((Entity)entityEnderCrystal));
        }
        else {
            Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.playerController.attackEntity((EntityPlayer)Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player, (Entity)entityEnderCrystal);
        }
        switch (Class57.Field8180[((Class1932)this.Field16923.Method341()).ordinal()]) {
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
        if (this.Field16921.Method365()) {
            Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.connection.sendPacket((Packet)new CPacketPlayer$Rotation(array[0], array[1], Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.onGround));
        }
    }
    
    private AxisAlignedBB Method7170() {
        final BlockPos method7171 = this.Method7171();
        return new AxisAlignedBB((double)method7171.getX(), this.Field16920.Method365() ? (method7171.getY() - this.Field16919.Method367()) : ((double)method7171.getY()), (double)method7171.getZ(), (double)(method7171.getX() + 1), method7171.getY() + this.Field16919.Method367(), (double)(method7171.getZ() + 1));
    }
    
    private BlockPos Method7171() {
        return new BlockPos(Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.posX, Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.posY, Class1919.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.player.posZ);
    }
    
    private static String Method7172(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x322A ^ 0x15));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
