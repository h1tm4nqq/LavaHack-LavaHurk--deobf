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

import lavahack.client.Class1917;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.input.Keyboard;

public class Class761
extends Class42 {
    private final Class44 Field11221 = this.Method23(new Class44("Speed", (Class42)this, Double.longBitsToDouble((long)49188194 ^ 0x4000000002EE8D62L), 0.0, Double.longBitsToDouble((long)750398485 ^ 0x402400002CBA2C15L), true));
    private final Class44 Field11222 = this.Method23(new Class44("Vertical Speed", (Class42)this, 1.0, 0.0, Double.longBitsToDouble((long)642360368 ^ 0x402400002649A430L), true));
    private final Class44 Field11223 = this.Method23(new Class44("Down Key", (Class42)this, 29).Method314(this.Field11222.Method335() != 0));
    private final Class44 Field11224 = this.Method23(new Class44("Glide Speed", (Class42)this, 0.0, Double.longBitsToDouble(-4601552919265804288L), Double.longBitsToDouble((long)768212119 ^ 0x402400002DC9FC97L), true));
    private final Class44 Field11225 = this.Method23(new Class44("Static Y", (Class42)this, true));
    private final Class44 Field11226 = this.Method23(new Class44("Hover", (Class42)this, false));
    private final Class44 Field11227 = this.Method23(new Class44("Bypass", (Class42)this, false));
    private final Class44 Field11228 = this.Method23(new Class44("Extra Calc", (Class42)this, false));
    private int Field11229;

    public Class761() {
        super("BoatFly", Class97.Field8340);
    }

    @Override
    public void Method45() {
        if (Class761.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class761.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (Class761.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ridingEntity == null) {
            return;
        }
        super.Method43("[" + this.Field11221.Method335() + "]");
        Entity entity = Class761.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ridingEntity;
        if (Class761.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isKeyDown()) {
            entity.motionY = this.Field11222.Method367();
        } else if (!this.Field11223.Method308() && Keyboard.isKeyDown((int)this.Field11223.Method337())) {
            entity.motionY = -this.Field11222.Method367();
        } else if (this.Field11225.Method365()) {
            entity.motionY = 0.0;
        } else {
            double d = entity.motionY = this.Field11226.Method365() && Class761.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % 2 == 0 ? this.Field11224.Method367() : -this.Field11224.Method367();
        }
        if (Class1917.Method7159()) {
            if (!this.Field11228.Method365()) {
                double[] dArray = Class1917.Method7150(this.Field11221.Method367());
                entity.motionX = dArray[0];
                entity.motionZ = dArray[1];
            } else {
                float f = Class1917.Method7148();
                Class761.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX -= (double)(MathHelper.sin((float)f) * this.Field11221.Method368());
                Class761.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ += (double)(MathHelper.cos((float)f) * this.Field11221.Method368());
            }
        } else {
            entity.motionX = 0.0;
            entity.motionZ = 0.0;
        }
        if (!this.Field11227.Method365()) return;
        if (Class761.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % 4 != 0) return;
        if (!(Class761.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ridingEntity instanceof EntityBoat)) return;
        Class761.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.interactWithEntity((EntityPlayer)Class761.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class761.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ridingEntity, EnumHand.MAIN_HAND);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 241;
            cArray2[n] = (char)(cArray[n] ^ (0x7E49 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

