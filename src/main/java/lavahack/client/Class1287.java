//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.client.entity.EntityOtherPlayerMP
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.MoverType
 *  net.minecraft.world.GameType
 *  net.minecraft.world.World
 */
package lavahack.client;

import com.mojang.authlib.GameProfile;
import java.util.Random;
import java.util.UUID;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.MoverType;
import net.minecraft.world.GameType;
import net.minecraft.world.World;

public class Class1287
extends Class42 {
    private final Class44 Field13873 = this.Method23(new Class44("Name", this, "FinLicorice", "FinLicorice", true));
    private final Class44 Field13874 = this.Method23(new Class44("Move", (Class42)this, false));
    private EntityOtherPlayerMP Field13875 = null;
    private String Field13876 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1287() {
        super("FakePlayer", "fake player.", Class97.Field8343);
        super.Method44(this::Method5233);
    }

    @Override
    public void Method38() {
        if (Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            this.Field13875 = new EntityOtherPlayerMP((World)Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new GameProfile(UUID.fromString("dbc45ea7-e8bd-4a3e-8660-ac064ce58216"), this.Field13873.Method359()));
            this.Field13875.copyLocationAndAnglesFrom((Entity)Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
            this.Field13875.rotationYawHead = Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYawHead;
            this.Field13875.rotationYaw = Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
            this.Field13875.rotationPitch = Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch;
            this.Field13875.setGameType(GameType.SURVIVAL);
            this.Field13875.setHealth(Float.intBitsToFloat(1101004800));
            Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.addEntityToWorld(-1337, (Entity)this.Field13875);
            this.Field13875.onLivingUpdate();
            return;
        }
        this.Method22();
    }

    @Override
    public void Method45() {
        if (Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || this.Field13875 == null) {
            super.Method21(false);
        }
        if (!this.Field13874.Method365()) return;
        this.Field13875.moveForward = Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveForward + (float)new Random().nextInt(5) / Float.intBitsToFloat(1092616192);
        this.Field13875.moveStrafing = Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveStrafing + (float)new Random().nextInt(5) / Float.intBitsToFloat(1092616192);
        this.Method5232(this.Field13875.moveStrafing, this.Field13875.moveVertical, this.Field13875.moveForward);
    }

    @Override
    public void Method39() {
        if (Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (this.Field13875 == null) {
            return;
        }
        Class1287.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntityFromWorld(-1337);
    }

    public void Method5232(float f, float f2, float f3) {
        double d = this.Field13875.posY;
        float f4 = Float.intBitsToFloat(1061997773);
        float f5 = Float.intBitsToFloat(1017370378);
        float f6 = EnchantmentHelper.getDepthStriderModifier((EntityLivingBase)this.Field13875);
        if (f6 > Float.intBitsToFloat(0x40400000)) {
            f6 = Float.intBitsToFloat(0x40400000);
        }
        if (!this.Field13875.onGround) {
            f6 *= Float.intBitsToFloat(0x3F000000);
        }
        if (f6 > 0.0f) {
            f4 += (Float.intBitsToFloat(1057736361) - f4) * f6 / Float.intBitsToFloat(0x40400000);
            f5 += (this.Field13875.getAIMoveSpeed() - f5) * f6 / Float.intBitsToFloat(0x40800000);
        }
        this.Field13875.moveRelative(f, f2, f3, f5);
        this.Field13875.move(MoverType.SELF, this.Field13875.motionX, this.Field13875.motionY, this.Field13875.motionZ);
        this.Field13875.motionX *= (double)f4;
        this.Field13875.motionY *= Double.longBitsToDouble(4605380979056443392L);
        this.Field13875.motionZ *= (double)f4;
        if (!this.Field13875.hasNoGravity()) {
            this.Field13875.motionY -= Double.longBitsToDouble(4581421828931458171L);
        }
        if (!this.Field13875.collidedHorizontally) return;
        if (!this.Field13875.isOffsetPositionInLiquid(this.Field13875.motionX, this.Field13875.motionY + Double.longBitsToDouble((long)572861113 ^ 0x3FE3333362252AB9L) - this.Field13875.posY + d, this.Field13875.motionZ)) return;
        this.Field13875.motionY = Double.longBitsToDouble((long)1186058955 ^ 0x3FD3333306B1D2CBL);
    }

    private String Method5233() {
        return "[" + this.Field13873.Method359() + "]";
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 184;
            cArray2[n] = (char)(cArray[n] ^ (0x5C50 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

