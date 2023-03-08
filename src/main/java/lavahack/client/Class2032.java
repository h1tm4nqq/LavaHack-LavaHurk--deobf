//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.entity.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.*;
import net.minecraft.world.*;
import com.mojang.authlib.*;
import net.minecraft.entity.*;
import java.util.*;
import net.minecraft.util.math.*;

public class Class2032 extends EntityOtherPlayerMP
{
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
    
    public Class2032(final World world, final EntityPlayer field17348) {
        super(world, new GameProfile(field17348.getGameProfile().getId(), "MotionPredictor-" + field17348.getName()));
        this.Field17348 = field17348;
        this.setEntityId(field17348.getEntityId() * -2);
        this.copyLocationAndAnglesFrom((Entity)field17348);
    }
    
    private Class2032(final World world) {
        super(world, new GameProfile(UUID.randomUUID(), "MotionPredictor"));
    }
    
    public void resetMotion() {
        this.motionX = 0.0;
        this.motionY = 0.0;
        this.motionZ = 0.0;
    }
    
    public void pushOutOfBlocks() {
        final AxisAlignedBB axisAlignedBB = this.Field17353 ? this.getEntityBoundingBox().expand(Double.longBitsToDouble(-4634204016564240384L), Double.longBitsToDouble((long)1836566057 ^ 0xBFB000006D77C629L), Double.longBitsToDouble((long)840904097 ^ 0xBFB00000321F2DA1L)) : this.getEntityBoundingBox();
        Class1486.Method5941((Entity)this, this.posX - this.width * Double.longBitsToDouble((long)2125075511 ^ 0x3FD6666618CC7251L), axisAlignedBB.minY + Double.longBitsToDouble(4602678819172646912L), this.posZ + this.width * Double.longBitsToDouble((long)185916769 ^ 0x3FD666666D72BB07L));
        Class1486.Method5941((Entity)this, this.posX - this.width * Double.longBitsToDouble((long)1399897751 ^ 0x3FD666663516D8F1L), axisAlignedBB.minY + Double.longBitsToDouble(4602678819172646912L), this.posZ - this.width * Double.longBitsToDouble(4599976659396224614L));
        Class1486.Method5941((Entity)this, this.posX + this.width * Double.longBitsToDouble((long)1120849243 ^ 0x3FD6666624A8AB3DL), axisAlignedBB.minY + Double.longBitsToDouble(4602678819172646912L), this.posZ - this.width * Double.longBitsToDouble((long)978196550 ^ 0x3FD666665C287E20L));
        Class1486.Method5941((Entity)this, this.posX + this.width * Double.longBitsToDouble(4599976659396224614L), axisAlignedBB.minY + Double.longBitsToDouble(4602678819172646912L), this.posZ + this.width * Double.longBitsToDouble((long)2112997913 ^ 0x3FD666661B97AC7FL));
    }
    
    public void detectWasPhasing() {
        this.Field17352 = false;
        if (this.Field17347) {
            this.resetMotion();
            this.pushOutOfBlocks();
            this.Field17352 = (this.motionX != 0.0 || this.motionY != 0.0 || this.motionZ != 0.0);
        }
    }
    
    public void updateFromTrackedEntity() {
        this.motionX = this.Field17348.motionX;
        this.motionY = this.Field17348.motionY;
        this.motionZ = this.Field17348.motionZ;
        this.posX += ((Math.abs(this.motionX) >= Double.longBitsToDouble((long)1357138978 ^ 0x3FB99999C97DD5B8L)) ? this.motionX : 0.0);
        this.posY += ((Math.abs(this.motionY) >= Double.longBitsToDouble((long)1209005755 ^ 0x3FB99999D1966F21L)) ? this.motionY : 0.0);
        this.posZ += ((Math.abs(this.motionZ) >= Double.longBitsToDouble(4591870180066957722L)) ? this.motionZ : 0.0);
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
        this.Field17344 = 0.0;
        this.Field17345 = 0.0;
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
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7C28 ^ 0x45));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
