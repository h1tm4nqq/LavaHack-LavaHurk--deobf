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
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.MoverType;
import net.minecraft.world.GameType;
import net.minecraft.world.World;

public class VemwRh6nITcPCuzEh7c8rPCfcBKi5ksS
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13873 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Name", this, "FinLicorice", "FinLicorice", ((int)-1836771979L ^ 0x92851574) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13874 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Move", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1473235158L ^ 0x57CFC8D6) != 0));
    private EntityOtherPlayerMP Field13875 = null;
    private String Field13876 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public VemwRh6nITcPCuzEh7c8rPCfcBKi5ksS() {
        super("FakePlayer", "fake player.", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
        super.Method44(this::Method5233);
    }

    @Override
    public void Method38() {
        if (VemwRh6nITcPCuzEh7c8rPCfcBKi5ksS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && VemwRh6nITcPCuzEh7c8rPCfcBKi5ksS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            this.Field13875 = new EntityOtherPlayerMP((World)VemwRh6nITcPCuzEh7c8rPCfcBKi5ksS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new GameProfile(UUID.fromString("dbc45ea7-e8bd-4a3e-8660-ac064ce58216"), this.Field13873.Method359()));
            this.Field13875.copyLocationAndAnglesFrom((Entity)VemwRh6nITcPCuzEh7c8rPCfcBKi5ksS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
            this.Field13875.rotationYawHead = VemwRh6nITcPCuzEh7c8rPCfcBKi5ksS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYawHead;
            this.Field13875.rotationYaw = VemwRh6nITcPCuzEh7c8rPCfcBKi5ksS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
            this.Field13875.rotationPitch = VemwRh6nITcPCuzEh7c8rPCfcBKi5ksS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch;
            this.Field13875.setGameType(GameType.SURVIVAL);
            this.Field13875.setHealth(Float.intBitsToFloat((int)643564829L ^ 0x67FC051D));
            VemwRh6nITcPCuzEh7c8rPCfcBKi5ksS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.addEntityToWorld((int)-1692280303L ^ 0x64DE20D6, (Entity)this.Field13875);
            this.Field13875.onLivingUpdate();
            return;
        }
        this.Method22();
    }

    @Override
    public void Method45() {
        if (VemwRh6nITcPCuzEh7c8rPCfcBKi5ksS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || VemwRh6nITcPCuzEh7c8rPCfcBKi5ksS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || this.Field13875 == null) {
            super.Method21((boolean)((long)1467359437 ^ (long)1467359437));
        }
        if (!this.Field13874.Method365()) return;
        this.Field13875.moveForward = VemwRh6nITcPCuzEh7c8rPCfcBKi5ksS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveForward + (float)new Random().nextInt((int)((long)-1426443991 ^ (long)-1426443988)) / Float.intBitsToFloat((int)1395990839L ^ 0x12152137);
        this.Field13875.moveStrafing = VemwRh6nITcPCuzEh7c8rPCfcBKi5ksS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveStrafing + (float)new Random().nextInt((int)124332964L ^ 0x7692BA1) / Float.intBitsToFloat((int)((long)295148148 ^ (long)1354209908));
        this.Method5232(this.Field13875.moveStrafing, this.Field13875.moveVertical, this.Field13875.moveForward);
    }

    @Override
    public void Method39() {
        if (VemwRh6nITcPCuzEh7c8rPCfcBKi5ksS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (VemwRh6nITcPCuzEh7c8rPCfcBKi5ksS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (this.Field13875 == null) {
            return;
        }
        VemwRh6nITcPCuzEh7c8rPCfcBKi5ksS.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntityFromWorld((int)((long)842066609 ^ (long)-842067850));
    }

    public void Method5232(float f, float f2, float f3) {
        double d = this.Field13875.posY;
        float f4 = Float.intBitsToFloat(0x74D927B7 ^ 0x4B95EB7A);
        float f5 = Float.intBitsToFloat((int)101976533L ^ 0x3AB7DEDF);
        float f6 = EnchantmentHelper.getDepthStriderModifier((EntityLivingBase)this.Field13875);
        if (f6 > Float.intBitsToFloat((int)263913523L ^ 0x4FFB0033)) {
            f6 = Float.intBitsToFloat(0x3272A3EA ^ 0x7232A3EA);
        }
        if (!this.Field13875.onGround) {
            f6 *= Float.intBitsToFloat((int)((long)1394005550 ^ (long)1813435950));
        }
        if (f6 > 0.0f) {
            f4 += (Float.intBitsToFloat(0x295A18B1 ^ 0x1651DE18) - f4) * f6 / Float.intBitsToFloat((int)((long)984203728 ^ (long)2062139856));
            f5 += (this.Field13875.getAIMoveSpeed() - f5) * f6 / Float.intBitsToFloat((int)377469381L ^ 0x56FFB9C5);
        }
        this.Field13875.moveRelative(f, f2, f3, f5);
        this.Field13875.move(MoverType.SELF, this.Field13875.motionX, this.Field13875.motionY, this.Field13875.motionZ);
        this.Field13875.motionX *= (double)f4;
        this.Field13875.motionY *= Double.longBitsToDouble(0xB2F53E7F9AF799E4L ^ 0x8D1CA7E63AF799E4L);
        this.Field13875.motionZ *= (double)f4;
        if (!this.Field13875.hasNoGravity()) {
            this.Field13875.motionY -= Double.longBitsToDouble(0x6D75300F045D8930L ^ 0x52E14AEE43F39D4BL);
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
        int n = (int)134208290L ^ 0x7FFDB22;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1114910024 ^ (long)-1114910137);
            int n2 = (int)((long)291418260 ^ (long)291418243) << 3;
            cArray2[n] = (char)(cArray[n] ^ (((int)-544682330L ^ 0xDF88CB63) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

