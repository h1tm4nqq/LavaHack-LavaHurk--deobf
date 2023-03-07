//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityBoat
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.MathHelper
 *  org.lwjgl.input.Keyboard
 */
package lavahack.client;

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.o73igJQaa2O9BEYFQNAk42oaxHBow5kd;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.input.Keyboard;

public class LzZg2TqRyULP8xVx0ULpXLHFNOt9hPSZ
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11221 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)49188194 ^ 0x4000000002EE8D62L), 0.0, Double.longBitsToDouble((long)750398485 ^ 0x402400002CBA2C15L), (boolean)((long)-1784782192 ^ (long)-1784782191)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11222 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Vertical Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble((long)642360368 ^ 0x402400002649A430L), (boolean)((long)727615174 ^ (long)727615175)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11223 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Down Key", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (int)((long)1541464815 ^ (long)1541464818)).Method314((this.Field11222.Method335() != 0 ? (int)((long)699801898 ^ (long)699801899) : (int)((long)-1958291469 ^ (long)-1958291469)) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11224 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Glide Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble(0x632096C0BDD2956DL ^ 0xA30496C0BDD2956DL), Double.longBitsToDouble((long)768212119 ^ 0x402400002DC9FC97L), (boolean)((long)855418710 ^ (long)855418711)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11225 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Static Y", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)389985445 ^ (long)389985444)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11226 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Hover", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-504259059 ^ (long)-504259059)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11227 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Bypass", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1938613901L ^ 0x738CE68D) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11228 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Extra Calc", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1741765417L ^ 0x67D13B29) != 0));
    private int Field11229;

    public LzZg2TqRyULP8xVx0ULpXLHFNOt9hPSZ() {
        super("BoatFly", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8340);
    }

    @Override
    public void Method45() {
        if (LzZg2TqRyULP8xVx0ULpXLHFNOt9hPSZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (LzZg2TqRyULP8xVx0ULpXLHFNOt9hPSZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (LzZg2TqRyULP8xVx0ULpXLHFNOt9hPSZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ridingEntity == null) {
            return;
        }
        super.Method43("[" + this.Field11221.Method335() + "]");
        Entity entity = LzZg2TqRyULP8xVx0ULpXLHFNOt9hPSZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ridingEntity;
        if (LzZg2TqRyULP8xVx0ULpXLHFNOt9hPSZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isKeyDown()) {
            entity.motionY = this.Field11222.Method367();
        } else if (!this.Field11223.Method308() && Keyboard.isKeyDown((int)this.Field11223.Method337())) {
            entity.motionY = -this.Field11222.Method367();
        } else if (this.Field11225.Method365()) {
            entity.motionY = 0.0;
        } else {
            double d = entity.motionY = this.Field11226.Method365() && LzZg2TqRyULP8xVx0ULpXLHFNOt9hPSZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % (((int)-1389648851L ^ 0xAD2BA42C) << 1) == 0 ? this.Field11224.Method367() : -this.Field11224.Method367();
        }
        if (o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159()) {
            if (!this.Field11228.Method365()) {
                double[] dArray = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7150(this.Field11221.Method367());
                entity.motionX = dArray[(int)((long)1510323926 ^ (long)1510323926)];
                entity.motionZ = dArray[(int)((long)-274403347 ^ (long)-274403348)];
            } else {
                float f = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7148();
                LzZg2TqRyULP8xVx0ULpXLHFNOt9hPSZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX -= (double)(MathHelper.sin((float)f) * this.Field11221.Method368());
                LzZg2TqRyULP8xVx0ULpXLHFNOt9hPSZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ += (double)(MathHelper.cos((float)f) * this.Field11221.Method368());
            }
        } else {
            entity.motionX = 0.0;
            entity.motionZ = 0.0;
        }
        if (!this.Field11227.Method365()) return;
        if (LzZg2TqRyULP8xVx0ULpXLHFNOt9hPSZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % ((int)((long)-208785082 ^ (long)-208785081) << 2) != 0) return;
        if (!(LzZg2TqRyULP8xVx0ULpXLHFNOt9hPSZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ridingEntity instanceof EntityBoat)) return;
        LzZg2TqRyULP8xVx0ULpXLHFNOt9hPSZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.interactWithEntity((EntityPlayer)LzZg2TqRyULP8xVx0ULpXLHFNOt9hPSZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, LzZg2TqRyULP8xVx0ULpXLHFNOt9hPSZ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ridingEntity, EnumHand.MAIN_HAND);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1006047162L ^ 0x3BF70FBA;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)248368616 ^ (long)248368407);
            int n2 = (int)((long)-1641640775 ^ (long)-1641640888);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)2014818229 ^ (long)2014827004) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

