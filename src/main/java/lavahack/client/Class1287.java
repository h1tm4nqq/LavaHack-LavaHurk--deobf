//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.entity.*;
import java.util.function.*;
import com.mojang.authlib.*;
import net.minecraft.world.*;
import java.util.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.*;

public class Class1287 extends Class42
{
    private final Class44 Field13873;
    private final Class44 Field13874;
    private EntityOtherPlayerMP Field13875;
    private String Field13876 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1287() {
        super("FakePlayer", "fake player.", Class97.Field8343);
        this.Field13873 = this.Method23(new Class44("Name", this, "FinLicorice", "FinLicorice", true));
        this.Field13874 = this.Method23(new Class44("Move", this, false));
        this.Field13875 = null;
        super.Method44(this::Method5233);
    }
    
    @Override
    public void Method38() {
        if (Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        (this.Field13875 = new EntityOtherPlayerMP((World)Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new GameProfile(UUID.fromString("dbc45ea7-e8bd-4a3e-8660-ac064ce58216"), this.Field13873.Method359()))).copyLocationAndAnglesFrom((Entity)Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        this.Field13875.rotationYawHead = Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYawHead;
        this.Field13875.rotationYaw = Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
        this.Field13875.rotationPitch = Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch;
        this.Field13875.setGameType(GameType.SURVIVAL);
        this.Field13875.setHealth(Float.intBitsToFloat(1101004800));
        Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.addEntityToWorld(-1337, (Entity)this.Field13875);
        this.Field13875.onLivingUpdate();
    }
    
    @Override
    public void Method45() {
        if (Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || this.Field13875 == null) {
            super.Method21(false);
        }
        if (this.Field13874.Method365()) {
            this.Field13875.moveForward = Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveForward + new Random().nextInt(5) / Float.intBitsToFloat(1092616192);
            this.Method5232(this.Field13875.moveStrafing = Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveStrafing + new Random().nextInt(5) / Float.intBitsToFloat(1092616192), this.Field13875.moveVertical, this.Field13875.moveForward);
        }
    }
    
    @Override
    public void Method39() {
        if (Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || this.Field13875 == null) {
            return;
        }
        Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntityFromWorld(-1337);
    }
    
    public void Method5232(final float n, final float n2, final float n3) {
        final double posY = this.Field13875.posY;
        float intBitsToFloat = Float.intBitsToFloat(1061997773);
        float intBitsToFloat2 = Float.intBitsToFloat(1017370378);
        float intBitsToFloat3 = (float)EnchantmentHelper.getDepthStriderModifier((EntityLivingBase)this.Field13875);
        if (intBitsToFloat3 > Float.intBitsToFloat(1077936128)) {
            intBitsToFloat3 = Float.intBitsToFloat(1077936128);
        }
        if (!this.Field13875.onGround) {
            intBitsToFloat3 *= Float.intBitsToFloat(1056964608);
        }
        if (intBitsToFloat3 > 0.0f) {
            intBitsToFloat += (Float.intBitsToFloat(1057736361) - intBitsToFloat) * intBitsToFloat3 / Float.intBitsToFloat(1077936128);
            intBitsToFloat2 += (this.Field13875.getAIMoveSpeed() - intBitsToFloat2) * intBitsToFloat3 / Float.intBitsToFloat(1082130432);
        }
        this.Field13875.moveRelative(n, n2, n3, intBitsToFloat2);
        this.Field13875.move(MoverType.SELF, this.Field13875.motionX, this.Field13875.motionY, this.Field13875.motionZ);
        final EntityOtherPlayerMP field13875 = this.Field13875;
        field13875.motionX *= intBitsToFloat;
        final EntityOtherPlayerMP field13876 = this.Field13875;
        field13876.motionY *= Double.longBitsToDouble(4605380979056443392L);
        final EntityOtherPlayerMP field13877 = this.Field13875;
        field13877.motionZ *= intBitsToFloat;
        if (!this.Field13875.hasNoGravity()) {
            final EntityOtherPlayerMP field13878 = this.Field13875;
            field13878.motionY -= Double.longBitsToDouble(4581421828931458171L);
        }
        if (this.Field13875.collidedHorizontally && this.Field13875.isOffsetPositionInLiquid(this.Field13875.motionX, this.Field13875.motionY + Double.longBitsToDouble((long)572861113 ^ 0x3FE3333362252AB9L) - this.Field13875.posY + posY, this.Field13875.motionZ)) {
            this.Field13875.motionY = Double.longBitsToDouble((long)1186058955 ^ 0x3FD3333306B1D2CBL);
        }
    }
    
    private String Method5233() {
        return "[" + this.Field13873.Method359() + "]";
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5C50 ^ 0xB8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
