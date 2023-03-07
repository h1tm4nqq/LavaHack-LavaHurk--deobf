//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Arrays;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

public class TdAeBSYreRMkbdiPSqDIrjOrgARe3yrN
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13886;
    private int Field13887;

    public TdAeBSYreRMkbdiPSqDIrjOrgARe3yrN() {
        super("AirJump", "Allows to jump in air", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8340);
        String[] stringArray = new String[(int)((long)1347634685 ^ (long)1347634686)];
        stringArray[(int)((long)818366859 ^ (long)818366859)] = "Vanilla";
        stringArray[(int)-1443295403L ^ 0xA9F90F54] = "NCP";
        stringArray[(int)((long)1492393147 ^ (long)1492393146) << 1] = "Matrix";
        this.Field13886 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Vanilla", Arrays.asList(stringArray)));
        super.Method44(this::Method5238);
    }

    @Override
    public void Method45() {
        if (TdAeBSYreRMkbdiPSqDIrjOrgARe3yrN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && TdAeBSYreRMkbdiPSqDIrjOrgARe3yrN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field13886.Method359().equalsIgnoreCase("Vanilla") && TdAeBSYreRMkbdiPSqDIrjOrgARe3yrN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isPressed()) {
            TdAeBSYreRMkbdiPSqDIrjOrgARe3yrN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble(0xD8DE8726801601A3L ^ 0xE738E140E67067C5L);
            return;
        }
        if (this.Field13886.Method359().equalsIgnoreCase("NCP")) {
            TdAeBSYreRMkbdiPSqDIrjOrgARe3yrN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround = (int)-408336012L ^ 0xE7A94975;
            TdAeBSYreRMkbdiPSqDIrjOrgARe3yrN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isAirBorne = (int)((long)404477130 ^ (long)404477130);
            return;
        }
        if (!this.Field13886.Method359().equalsIgnoreCase("Matrix")) return;
        if (!TdAeBSYreRMkbdiPSqDIrjOrgARe3yrN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.pressed) return;
        TdAeBSYreRMkbdiPSqDIrjOrgARe3yrN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
        TdAeBSYreRMkbdiPSqDIrjOrgARe3yrN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY -= Double.longBitsToDouble(0xF9DCC750459779DDL ^ 0xC60CC750459779DDL);
        if (!TdAeBSYreRMkbdiPSqDIrjOrgARe3yrN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindForward.pressed) return;
        TdAeBSYreRMkbdiPSqDIrjOrgARe3yrN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.elapsedTicks = (int)((long)-1115964087 ^ (long)-1115964088);
        TdAeBSYreRMkbdiPSqDIrjOrgARe3yrN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX *= Double.longBitsToDouble(0x4BB8F1F15536620EL ^ 0x74496868F536620EL);
        TdAeBSYreRMkbdiPSqDIrjOrgARe3yrN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ *= Double.longBitsToDouble((long)2060591498 ^ 0x3FF19999DAD2218AL);
        TdAeBSYreRMkbdiPSqDIrjOrgARe3yrN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround = (int)1027242261L ^ 0x3D3A7915;
    }

    private String Method5238() {
        return "[" + this.Field13886.Method359() + "]";
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-104245328L ^ 0xF9C957B0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)852720091L ^ 0x32D37924);
            int n2 = (int)((long)-1972708778 ^ (long)-1972708783);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-968261132 ^ (long)-968248533) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

