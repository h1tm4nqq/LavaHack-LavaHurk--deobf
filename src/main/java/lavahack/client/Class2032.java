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
import lavahack.client.Class1486;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MovementInput;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

public class Class2032
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

    public Class2032(World world, EntityPlayer entityPlayer) {
        super(world, new GameProfile(entityPlayer.getGameProfile().getId(), "MotionPredictor-" + entityPlayer.getName()));
        this.Field17348 = entityPlayer;
        this.setEntityId(entityPlayer.getEntityId() * -2);
        this.copyLocationAndAnglesFrom((Entity)entityPlayer);
    }

    private Class2032(World world) {
        super(world, new GameProfile(UUID.randomUUID(), "MotionPredictor"));
    }

    public void resetMotion() {
        this.motionX = 0.0;
        this.motionY = 0.0;
        this.motionZ = 0.0;
    }

    public void pushOutOfBlocks() {
        AxisAlignedBB axisAlignedBB = this.Field17353 ? this.getEntityBoundingBox().expand(Double.longBitsToDouble(-4634204016564240384L), Double.longBitsToDouble((long)1836566057 ^ 0xBFB000006D77C629L), Double.longBitsToDouble((long)840904097 ^ 0xBFB00000321F2DA1L)) : this.getEntityBoundingBox();
        Class1486.Method5941((Entity)this, this.posX - (double)this.width * Double.longBitsToDouble((long)2125075511 ^ 0x3FD6666618CC7251L), axisAlignedBB.minY + Double.longBitsToDouble(4602678819172646912L), this.posZ + (double)this.width * Double.longBitsToDouble((long)185916769 ^ 0x3FD666666D72BB07L));
        Class1486.Method5941((Entity)this, this.posX - (double)this.width * Double.longBitsToDouble((long)1399897751 ^ 0x3FD666663516D8F1L), axisAlignedBB.minY + Double.longBitsToDouble(4602678819172646912L), this.posZ - (double)this.width * Double.longBitsToDouble(4599976659396224614L));
        Class1486.Method5941((Entity)this, this.posX + (double)this.width * Double.longBitsToDouble((long)1120849243 ^ 0x3FD6666624A8AB3DL), axisAlignedBB.minY + Double.longBitsToDouble(4602678819172646912L), this.posZ - (double)this.width * Double.longBitsToDouble((long)978196550 ^ 0x3FD666665C287E20L));
        Class1486.Method5941((Entity)this, this.posX + (double)this.width * Double.longBitsToDouble(4599976659396224614L), axisAlignedBB.minY + Double.longBitsToDouble(4602678819172646912L), this.posZ + (double)this.width * Double.longBitsToDouble((long)2112997913 ^ 0x3FD666661B97AC7FL));
    }

    public void detectWasPhasing() {
        this.Field17352 = false;
        if (!this.Field17347) return;
        this.resetMotion();
        this.pushOutOfBlocks();
        this.Field17352 = this.motionX != 0.0 || this.motionY != 0.0 || this.motionZ != 0.0;
    }

    public void updateFromTrackedEntity() {
        this.motionX = this.Field17348.motionX;
        this.motionY = this.Field17348.motionY;
        this.motionZ = this.Field17348.motionZ;
        this.posX += Math.abs(this.motionX) >= Double.longBitsToDouble((long)1357138978 ^ 0x3FB99999C97DD5B8L) ? this.motionX : 0.0;
        this.posY += Math.abs(this.motionY) >= Double.longBitsToDouble((long)1209005755 ^ 0x3FB99999D1966F21L) ? this.motionY : 0.0;
        this.posZ += Math.abs(this.motionZ) >= Double.longBitsToDouble(4591870180066957722L) ? this.motionZ : 0.0;
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
        Class2032 class2032 = this;
        this.Field17344 = 0.0;
        Class2032 class20322 = this;
        this.Field17345 = 0.0;
        Class2032 class20323 = this;
        this.Field17346 = 0.0;
    }

    public void onUpdate() {
    }

    public void onLivingUpdate() {
    }

    public void setDead() {
        this.isDead = true;
        this.dead = true;
    }

    public boolean isSpectator() {
        return false;
    }

    public boolean isCreative() {
        return false;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 69;
            cArray2[n] = (char)(cArray[n] ^ (0x7C28 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

