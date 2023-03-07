//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package lavahack.client;

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import org.lwjgl.input.Keyboard;

public class glqLB5HCaLYB5BKA4455YUpmIK185eWR
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11658 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("OnGround", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)482856269L ^ 0x1CC7CD4C) != 0));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11659 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("MotionX", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1469232291 ^ 0x3FEAE147F986CE42L), Double.longBitsToDouble((long)1688348852 ^ 0xBFF0000064A228B4L), Double.longBitsToDouble((long)1170941996 ^ 0x4014000045CB282CL), ((int)735913331L ^ 0x2BDD2573) != 0));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11660 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("MotionY", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble(0xAEB4E3FB0E3B2B95L ^ 0xEE80E3FB0E3B2B95L), ((int)-389348327L ^ 0xE8CB0419) != 0));
    private int Field11661;

    public glqLB5HCaLYB5BKA4455YUpmIK185eWR() {
        super("NoWeb", "", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8340);
    }

    @Override
    public void Method45() {
        if (glqLB5HCaLYB5BKA4455YUpmIK185eWR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (glqLB5HCaLYB5BKA4455YUpmIK185eWR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!glqLB5HCaLYB5BKA4455YUpmIK185eWR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWeb) return;
        if (Keyboard.isKeyDown((int)glqLB5HCaLYB5BKA4455YUpmIK185eWR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindSneak.getKeyCode())) {
            glqLB5HCaLYB5BKA4455YUpmIK185eWR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWeb = (int)((long)607284152 ^ (long)607284153);
            glqLB5HCaLYB5BKA4455YUpmIK185eWR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY *= this.Field11660.Method367();
        } else if (this.Field11658.Method365()) {
            glqLB5HCaLYB5BKA4455YUpmIK185eWR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround = (int)((long)-1002578443 ^ (long)-1002578443);
        }
        if (!(Keyboard.isKeyDown((int)glqLB5HCaLYB5BKA4455YUpmIK185eWR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindForward.keyCode) || Keyboard.isKeyDown((int)glqLB5HCaLYB5BKA4455YUpmIK185eWR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindBack.keyCode) || Keyboard.isKeyDown((int)glqLB5HCaLYB5BKA4455YUpmIK185eWR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindLeft.keyCode))) {
            if (!Keyboard.isKeyDown((int)glqLB5HCaLYB5BKA4455YUpmIK185eWR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindRight.keyCode)) return;
        }
        glqLB5HCaLYB5BKA4455YUpmIK185eWR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWeb = (int)-1245966096L ^ 0xB5BC10F0;
        glqLB5HCaLYB5BKA4455YUpmIK185eWR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX *= this.Field11659.Method367();
        glqLB5HCaLYB5BKA4455YUpmIK185eWR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ *= this.Field11659.Method367();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)436005768L ^ 0x19FCEB88;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)47669529L ^ 0x2D761E6);
            int n2 = ((int)-493920684L ^ 0xE28F5E57) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1676445175 ^ (long)-1676447700) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

