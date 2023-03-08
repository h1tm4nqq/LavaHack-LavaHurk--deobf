//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.lwjgl.input.*;
import net.minecraft.client.entity.*;

public class Class869 extends Class42
{
    public Class44 Field11658;
    public Class44 Field11659;
    public Class44 Field11660;
    private int Field11661;
    
    public Class869() {
        super("NoWeb", "", Class97.Field8340);
        this.Field11658 = this.Method23(new Class44("OnGround", (Class42)this, true));
        this.Field11659 = this.Method23(new Class44("MotionX", (Class42)this, Double.longBitsToDouble((long)1469232291 ^ 0x3FEAE147F986CE42L), Double.longBitsToDouble((long)1688348852 ^ 0xBFF0000064A228B4L), Double.longBitsToDouble((long)1170941996 ^ 0x4014000045CB282CL), false));
        this.Field11660 = this.Method23(new Class44("MotionY", (Class42)this, 1.0, 0.0, Double.longBitsToDouble(4626322717216342016L), false));
    }
    
    public void Method45() {
        if (Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWeb) {
            if (Keyboard.isKeyDown(Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindSneak.getKeyCode())) {
                Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWeb = true;
                final EntityPlayerSP player = Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
                player.motionY *= this.Field11660.Method367();
            }
            else if (this.Field11658.Method365()) {
                Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround = false;
            }
            if (Keyboard.isKeyDown(Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindForward.keyCode) || Keyboard.isKeyDown(Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindBack.keyCode) || Keyboard.isKeyDown(Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindLeft.keyCode) || Keyboard.isKeyDown(Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindRight.keyCode)) {
                Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWeb = false;
                final EntityPlayerSP player2 = Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
                player2.motionX *= this.Field11659.Method367();
                final EntityPlayerSP player3 = Class869.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
                player3.motionZ *= this.Field11659.Method367();
            }
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2894 ^ 0xC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
