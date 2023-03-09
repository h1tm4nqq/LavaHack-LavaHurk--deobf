//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Arrays;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;

public class Class1289
extends Class42 {
    private final Class44 Field13886 = this.Method23(new Class44("Mode", (Class42)this, "Vanilla", Arrays.asList("Vanilla", "NCP", "Matrix")));
    private int Field13887;

    public Class1289() {
        super("AirJump", "Allows to jump in air", Class97.Field8340);
        super.Method44(this::Method5238);
    }

    @Override
    public void Method45() {
        if (Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field13886.Method359().equalsIgnoreCase("Vanilla") && Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isPressed()) {
            Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble(4604480259023595110L);
            return;
        }
        if (this.Field13886.Method359().equalsIgnoreCase("NCP")) {
            Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround = true;
            Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isAirBorne = false;
            return;
        }
        if (!this.Field13886.Method359().equalsIgnoreCase("Matrix")) return;
        if (!Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.pressed) return;
        Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
        Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY -= Double.longBitsToDouble(4598175219545276416L);
        if (!Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindForward.pressed) return;
        Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.elapsedTicks = 1;
        Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX *= Double.longBitsToDouble(4607632778870128640L);
        Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ *= Double.longBitsToDouble((long)2060591498 ^ 0x3FF19999DAD2218AL);
        Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround = false;
    }

    private String Method5238() {
        return "[" + this.Field13886.Method359() + "]";
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 7;
            cArray2[n] = (char)(cArray[n] ^ (0x32DF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

