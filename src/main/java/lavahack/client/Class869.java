//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package lavahack.client;

import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import org.lwjgl.input.Keyboard;

public class Class869
extends Class42 {
    public Class44 Field11658 = this.Method23(new Class44("OnGround", (Class42)this, true));
    public Class44 Field11659 = this.Method23(new Class44("MotionX", (Class42)this, Double.longBitsToDouble((long)1469232291 ^ 0x3FEAE147F986CE42L), Double.longBitsToDouble((long)1688348852 ^ 0xBFF0000064A228B4L), Double.longBitsToDouble((long)1170941996 ^ 0x4014000045CB282CL), false));
    public Class44 Field11660 = this.Method23(new Class44("MotionY", (Class42)this, 1.0, 0.0, Double.longBitsToDouble(0x4034000000000000L), false));
    private int Field11661;

    public Class869() {
        super("NoWeb", "", Class97.Field8340);
    }

    @Override
    public void Method45() {
        if (Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWeb) return;
        if (Keyboard.isKeyDown((int)Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindSneak.getKeyCode())) {
            Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWeb = true;
            Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY *= this.Field11660.Method367();
        } else if (this.Field11658.Method365()) {
            Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround = false;
        }
        if (!(Keyboard.isKeyDown((int)Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindForward.keyCode) || Keyboard.isKeyDown((int)Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindBack.keyCode) || Keyboard.isKeyDown((int)Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindLeft.keyCode))) {
            if (!Keyboard.isKeyDown((int)Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindRight.keyCode)) return;
        }
        Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWeb = false;
        Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX *= this.Field11659.Method367();
        Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ *= this.Field11659.Method367();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 12;
            cArray2[n] = (char)(cArray[n] ^ (0x2894 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

