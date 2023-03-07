//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 */
package lavahack.client;

import lavahack.client.AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class GYxpDSBalO8wxYE45zbYJtVc15JEIdKv
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17901 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Radius", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x8AF83993184C8EAAL ^ 0xCAF4F55FD84C8EAAL), Double.longBitsToDouble(0xAB1BAB91EFC80AEAL ^ 0x94A232084FC80AEAL), Double.longBitsToDouble(0x7724AB965591CCA0L ^ 0x3738AB965591CCA0L), ((int)-248747385L ^ 0xF12C6A87) != 0));
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17902 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x34520625662B5846L ^ 0x745B833BDE7AB3C3L), Double.longBitsToDouble((long)1121852626 ^ 0x3FC3333302DE1CD2L), Double.longBitsToDouble(0x671913884C8FD2BAL ^ 0x275013884C8FD2BAL), ((int)1984451044L ^ 0x764851E4) != 0));
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17903 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Auto Jump", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1393531044 ^ (long)1393531044)));
    private int Field17904;
    private String Field17905 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public GYxpDSBalO8wxYE45zbYJtVc15JEIdKv() {
        super("TargetStrafe", "TargetStrafe", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8340);
    }

    @Override
    public void Method45() {
        if (GYxpDSBalO8wxYE45zbYJtVc15JEIdKv.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (GYxpDSBalO8wxYE45zbYJtVc15JEIdKv.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (!leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1162("KillAuraRewrite").Method35()) {
            return;
        }
        EntityPlayer entityPlayer = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1924(Float.intBitsToFloat((int)((long)989705116 ^ (long)2050864028)));
        if (entityPlayer == null) {
            super.Method43("[Radius: " + this.Field17901.Method335() + " | Speed: " + this.Field17902.Method335() + "]");
            return;
        }
        super.Method43("[" + entityPlayer.getName() + " | Radius: " + this.Field17901.Method335() + " | Speed: " + this.Field17902.Method335() + "]");
        if (GYxpDSBalO8wxYE45zbYJtVc15JEIdKv.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.collidedHorizontally) {
            this.Field17904 = -this.Field17904;
        }
        if (this.Field17903.Method365() && GYxpDSBalO8wxYE45zbYJtVc15JEIdKv.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
            GYxpDSBalO8wxYE45zbYJtVc15JEIdKv.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
        }
        if (GYxpDSBalO8wxYE45zbYJtVc15JEIdKv.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindLeft.isKeyDown()) {
            this.Field17904 = (int)773157027L ^ 0x2E1570A2;
        }
        if (GYxpDSBalO8wxYE45zbYJtVc15JEIdKv.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindRight.isKeyDown()) {
            this.Field17904 = (int)-1737441105L ^ 0x678F3F50;
        }
        GYxpDSBalO8wxYE45zbYJtVc15JEIdKv.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward = 0.0f;
        if ((double)GYxpDSBalO8wxYE45zbYJtVc15JEIdKv.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((Entity)entityPlayer) <= this.Field17901.Method367()) {
            this.Method7805((double)this.Field17902.Method335() - (Double.longBitsToDouble(0xA68F5D94EC57218BL ^ 0x9946C40D75CEB811L) - this.Field17902.Method367() / Double.longBitsToDouble((long)1501061020 ^ 0x4059000059785F9CL)), AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6183((Entity)entityPlayer)[(int)-1043362277L ^ 0xC1CF8E1B], this.Field17904, 0.0);
            return;
        }
        this.Method7805((double)this.Field17902.Method335() - (Double.longBitsToDouble((long)1616962302 ^ 0x3FC99999F9F97B64L) - this.Field17902.Method367() / Double.longBitsToDouble((long)393502091 ^ 0x4059000017745D8BL)), AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6183((Entity)entityPlayer)[(int)-1063977995L ^ 0xC094FBF5], this.Field17904, 1.0);
    }

    private void Method7805(double d, float f, double d2, double d3) {
        double d4 = d3;
        double d5 = d2;
        float f2 = f;
        if (d4 == 0.0 && d5 == 0.0) {
            GYxpDSBalO8wxYE45zbYJtVc15JEIdKv.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
            GYxpDSBalO8wxYE45zbYJtVc15JEIdKv.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            return;
        }
        if (d4 != 0.0) {
            if (d5 > 0.0) {
                f2 += (float)(d4 > 0.0 ? (int)((long)-1179793518 ^ (long)1179793473) : (int)((long)1181154642 ^ (long)1181154687));
            } else if (d5 < 0.0) {
                f2 += (float)(d4 > 0.0 ? (int)1577370534L ^ 0x5E04C38B : (int)-651975606L ^ 0x26DC5B99);
            }
            d5 = 0.0;
            if (d4 > 0.0) {
                d4 = 1.0;
            } else if (d4 < 0.0) {
                d4 = Double.longBitsToDouble(0x1164F92F7DBE44F3L ^ 0xAE94F92F7DBE44F3L);
            }
        }
        double d6 = Math.cos(Math.toRadians(f2 + Float.intBitsToFloat((int)((long)76409680 ^ (long)1178200912))));
        double d7 = Math.sin(Math.toRadians(f2 + Float.intBitsToFloat((int)1653062097L ^ 0x2033B9D1)));
        GYxpDSBalO8wxYE45zbYJtVc15JEIdKv.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = d4 * d * d6 + d5 * d * d7;
        GYxpDSBalO8wxYE45zbYJtVc15JEIdKv.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = d4 * d * d7 - d5 * d * d6;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1494481123 ^ (long)-1494481123);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)494864766 ^ (long)494864769);
            int n2 = ((int)1366275764L ^ 0x516FB699) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)527162857L ^ 0x1F6B8C52 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

