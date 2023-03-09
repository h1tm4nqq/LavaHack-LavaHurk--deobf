//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 */
package lavahack.client;

import lavahack.client.Class1568;
import lavahack.client.Class1796;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class Class2165
extends Class42 {
    private Class44 Field17901 = this.Method23(new Class44("Radius", (Class42)this, Double.longBitsToDouble(0x400CCCCCC0000000L), Double.longBitsToDouble(4591870180174331904L), Double.longBitsToDouble(4619567317775286272L), false));
    private Class44 Field17902 = this.Method23(new Class44("Speed", (Class42)this, Double.longBitsToDouble(4614365660205673349L), Double.longBitsToDouble((long)1121852626 ^ 0x3FC3333302DE1CD2L), Double.longBitsToDouble(0x4049000000000000L), false));
    private Class44 Field17903 = this.Method23(new Class44("Auto Jump", (Class42)this, false));
    private int Field17904;
    private String Field17905 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class2165() {
        super("TargetStrafe", "TargetStrafe", Class97.Field8340);
    }

    @Override
    public void Method45() {
        if (Class2165.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class2165.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (!Class1796.Field16241.Field16254.Method1162("KillAuraRewrite").Method35()) {
            return;
        }
        EntityPlayer entityPlayer = Class394.Method1924(Float.intBitsToFloat(0x40C00000));
        if (entityPlayer == null) {
            super.Method43("[Radius: " + this.Field17901.Method335() + " | Speed: " + this.Field17902.Method335() + "]");
            return;
        }
        super.Method43("[" + entityPlayer.getName() + " | Radius: " + this.Field17901.Method335() + " | Speed: " + this.Field17902.Method335() + "]");
        if (Class2165.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.collidedHorizontally) {
            this.Field17904 = -this.Field17904;
        }
        if (this.Field17903.Method365() && Class2165.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
            Class2165.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
        }
        if (Class2165.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindLeft.isKeyDown()) {
            this.Field17904 = 1;
        }
        if (Class2165.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindRight.isKeyDown()) {
            this.Field17904 = -1;
        }
        Class2165.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward = 0.0f;
        if ((double)Class2165.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((Entity)entityPlayer) <= this.Field17901.Method367()) {
            this.Method7805((double)this.Field17902.Method335() - (Double.longBitsToDouble(4596373779694328218L) - this.Field17902.Method367() / Double.longBitsToDouble((long)1501061020 ^ 0x4059000059785F9CL)), Class1568.Method6183((Entity)entityPlayer)[0], this.Field17904, 0.0);
            return;
        }
        this.Method7805((double)this.Field17902.Method335() - (Double.longBitsToDouble((long)1616962302 ^ 0x3FC99999F9F97B64L) - this.Field17902.Method367() / Double.longBitsToDouble((long)393502091 ^ 0x4059000017745D8BL)), Class1568.Method6183((Entity)entityPlayer)[0], this.Field17904, 1.0);
    }

    private void Method7805(double d, float f, double d2, double d3) {
        double d4 = d3;
        double d5 = d2;
        float f2 = f;
        if (d4 == 0.0 && d5 == 0.0) {
            Class2165.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
            Class2165.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            return;
        }
        if (d4 != 0.0) {
            if (d5 > 0.0) {
                f2 += (float)(d4 > 0.0 ? -45 : 45);
            } else if (d5 < 0.0) {
                f2 += (float)(d4 > 0.0 ? 45 : -45);
            }
            d5 = 0.0;
            if (d4 > 0.0) {
                d4 = 1.0;
            } else if (d4 < 0.0) {
                d4 = Double.longBitsToDouble(-4616189618054758400L);
            }
        }
        double d6 = Math.cos(Math.toRadians(f2 + Float.intBitsToFloat(1119092736)));
        double d7 = Math.sin(Math.toRadians(f2 + Float.intBitsToFloat(1119092736)));
        Class2165.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = d4 * d * d6 + d5 * d * d7;
        Class2165.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = d4 * d * d7 - d5 * d * d6;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 180;
            cArray2[n] = (char)(cArray[n] ^ (0x51BB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

