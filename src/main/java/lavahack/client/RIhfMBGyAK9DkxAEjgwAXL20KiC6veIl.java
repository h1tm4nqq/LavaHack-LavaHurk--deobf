//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.client.entity.EntityOtherPlayerMP
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.MovementInput
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.world.World
 */
package lavahack.client;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import lavahack.client.vo8JGtFXaeonZQiouVGTbpILJYQDvWk4;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MovementInput;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

public class RIhfMBGyAK9DkxAEjgwAXL20KiC6veIl
extends EntityOtherPlayerMP {
    public double Field17341;
    public double Field17342;
    public double Field17343;
    public double Field17344;
    public double Field17345;
    public double Field17346;
    public boolean Field17347;
    public EntityPlayer Field17348;
    public MovementInput Field17349;
    public boolean Field17350;
    public boolean Field17351;
    public boolean Field17352;
    public boolean Field17353;
    private int Field17354;

    public RIhfMBGyAK9DkxAEjgwAXL20KiC6veIl(World world, EntityPlayer entityPlayer) {
        super(world, new GameProfile(entityPlayer.getGameProfile().getId(), "MotionPredictor-" + entityPlayer.getName()));
        this.Field17348 = entityPlayer;
        this.setEntityId(entityPlayer.getEntityId() * (int)((long)-183922184 ^ (long)183922182));
        this.copyLocationAndAnglesFrom((Entity)entityPlayer);
    }

    private RIhfMBGyAK9DkxAEjgwAXL20KiC6veIl(World world) {
        super(world, new GameProfile(UUID.randomUUID(), "MotionPredictor"));
    }

    public void resetMotion() {
        this.motionX = 0.0;
        this.motionY = 0.0;
        this.motionZ = 0.0;
    }

    public void pushOutOfBlocks() {
        AxisAlignedBB axisAlignedBB = this.Field17353 ? this.getEntityBoundingBox().expand(Double.longBitsToDouble(0xCE9B8D07CF9FE25DL ^ 0x712B8D07CF9FE25DL), Double.longBitsToDouble((long)1836566057 ^ 0xBFB000006D77C629L), Double.longBitsToDouble((long)840904097 ^ 0xBFB00000321F2DA1L)) : this.getEntityBoundingBox();
        vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Method5941((Entity)this, this.posX - (double)this.width * Double.longBitsToDouble((long)2125075511 ^ 0x3FD6666618CC7251L), axisAlignedBB.minY + Double.longBitsToDouble(0x4EB78A3C52C7FC1CL ^ 0x71578A3C52C7FC1CL), this.posZ + (double)this.width * Double.longBitsToDouble((long)185916769 ^ 0x3FD666666D72BB07L));
        vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Method5941((Entity)this, this.posX - (double)this.width * Double.longBitsToDouble((long)1399897751 ^ 0x3FD666663516D8F1L), axisAlignedBB.minY + Double.longBitsToDouble(0x3CB54AAA253E3B58L ^ 0x3554AAA253E3B58L), this.posZ - (double)this.width * Double.longBitsToDouble(0xFBD6AF036C86A960L ^ 0xC400C9650AE0CF06L));
        vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Method5941((Entity)this, this.posX + (double)this.width * Double.longBitsToDouble((long)1120849243 ^ 0x3FD6666624A8AB3DL), axisAlignedBB.minY + Double.longBitsToDouble(0x1B8138C0C0B3373DL ^ 0x246138C0C0B3373DL), this.posZ - (double)this.width * Double.longBitsToDouble((long)978196550 ^ 0x3FD666665C287E20L));
        vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Method5941((Entity)this, this.posX + (double)this.width * Double.longBitsToDouble(0xAEC698EE606AAB64L ^ 0x9110FE88060CCD02L), axisAlignedBB.minY + Double.longBitsToDouble(0xB3654905905954A1L ^ 0x8C854905905954A1L), this.posZ + (double)this.width * Double.longBitsToDouble((long)2112997913 ^ 0x3FD666661B97AC7FL));
    }

    public void detectWasPhasing() {
        this.Field17352 = (int)-1262515477L ^ 0xB4BF8AEB;
        if (!this.Field17347) return;
        this.resetMotion();
        this.pushOutOfBlocks();
        this.Field17352 = this.motionX != 0.0 || this.motionY != 0.0 || this.motionZ != 0.0 ? (int)((long)-1227320749 ^ (long)-1227320750) : (int)((long)1151400951 ^ (long)1151400951);
    }

    public void updateFromTrackedEntity() {
        this.motionX = this.Field17348.motionX;
        this.motionY = this.Field17348.motionY;
        this.motionZ = this.Field17348.motionZ;
        this.posX += Math.abs(this.motionX) >= Double.longBitsToDouble((long)1357138978 ^ 0x3FB99999C97DD5B8L) ? this.motionX : 0.0;
        this.posY += Math.abs(this.motionY) >= Double.longBitsToDouble((long)1209005755 ^ 0x3FB99999D1966F21L) ? this.motionY : 0.0;
        this.posZ += Math.abs(this.motionZ) >= Double.longBitsToDouble(0x39DC076686B02483L ^ 0x6659EFF1F29BD19L) ? this.motionZ : 0.0;
        this.setPosition(this.posX, this.posY, this.posZ);
        if (this.Field17347 && !this.Field17352) {
            this.resetMotion();
            this.pushOutOfBlocks();
            this.posX += this.motionX;
            this.posY += this.motionY;
            this.posZ += this.motionZ;
            this.motionX = this.Field17348.motionX;
            this.motionY = this.Field17348.motionY;
            this.motionZ = this.Field17348.motionZ;
            this.setPosition(this.posX, this.posY, this.posZ);
        }
        this.onGround = this.Field17348.onGround;
        this.prevPosX = this.Field17348.prevPosX;
        this.prevPosY = this.Field17348.prevPosY;
        this.prevPosZ = this.Field17348.prevPosZ;
        this.collided = this.Field17348.collided;
        this.collidedHorizontally = this.Field17348.collidedHorizontally;
        this.collidedVertically = this.Field17348.collidedVertically;
        this.moveForward = this.Field17348.moveForward;
        this.moveStrafing = this.Field17348.moveStrafing;
        this.moveVertical = this.Field17348.moveVertical;
        this.lastTickPosX = this.posX;
        this.lastTickPosY = this.posY;
        this.lastTickPosZ = this.posZ;
        RIhfMBGyAK9DkxAEjgwAXL20KiC6veIl rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl = this;
        this.Field17344 = 0.0;
        RIhfMBGyAK9DkxAEjgwAXL20KiC6veIl rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl2 = this;
        this.Field17345 = 0.0;
        RIhfMBGyAK9DkxAEjgwAXL20KiC6veIl rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl3 = this;
        this.Field17346 = 0.0;
    }

    public void onUpdate() {
    }

    public void onLivingUpdate() {
    }

    public void setDead() {
        this.isDead = (int)988741790L ^ 0x3AEF009F;
        this.dead = (int)1976721615L ^ 0x75D260CE;
    }

    public boolean isSpectator() {
        return ((int)2048586468L ^ 0x7A1AF2E4) != 0;
    }

    public boolean isCreative() {
        return (int)((long)-1234237049 ^ (long)-1234237049) != 0;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-83678829L ^ 0xFB032993;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-34283570L ^ 0xFDF4DF31);
            int n2 = (int)-910630874L ^ 0xC9B8E063;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)857162724 ^ (long)857164897) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

