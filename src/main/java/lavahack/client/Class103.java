/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.util.math.Vec3d;

public enum Class103 {
    Field8358(new ArrayList<Vec3d>(Arrays.asList(new Vec3d(0.0, Double.longBitsToDouble((long)1873192551 ^ 0xBFF000006FA6A667L), 0.0), new Vec3d(1.0, Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(0.0, Double.longBitsToDouble(-4616189618054758400L), 1.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(0.0, Double.longBitsToDouble((long)1504896560 ^ 0xBFF0000059B2E630L), Double.longBitsToDouble(-4616189618054758400L)), new Vec3d(1.0, 0.0, 0.0), new Vec3d(0.0, 0.0, 1.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), 0.0, 0.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)59043781 ^ 0xBFF000000384EFC5L))))),
    Field8359(new ArrayList<Vec3d>(Arrays.asList(new Vec3d(0.0, Double.longBitsToDouble((long)877206106 ^ 0xBFF0000034491A5AL), 0.0), new Vec3d(1.0, 0.0, 0.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), 0.0, 0.0), new Vec3d(0.0, 0.0, 1.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)459304976 ^ 0xBFF000001B607010L))))),
    Field8360(new ArrayList<Vec3d>(Arrays.asList(new Vec3d(0.0, Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(1.0, 0.0, 0.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), 0.0, 0.0), new Vec3d(0.0, 0.0, 1.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)1647444569 ^ 0xBFF0000062320259L)), new Vec3d(Double.longBitsToDouble(0x4000000000000000L), 0.0, 0.0), new Vec3d(Double.longBitsToDouble(-4611686018427387904L), 0.0, 0.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)951279350 ^ 0x4000000038B35EF6L)), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)741803036 ^ 0xC00000002C37041CL)), new Vec3d(Double.longBitsToDouble((long)1869221786 ^ 0x400800006F6A0F9AL), 0.0, 0.0), new Vec3d(Double.longBitsToDouble((long)1369872541 ^ 0xC008000051A6989DL), 0.0, 0.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)1803446849 ^ 0x400800006B7E6A41L)), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)46732642 ^ 0xC008000002C91562L))))),
    Field8361(new ArrayList<Vec3d>(Arrays.asList(new Vec3d(0.0, Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(1.0, Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(0.0, Double.longBitsToDouble(-4616189618054758400L), 1.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble((long)436277421 ^ 0xBFF000001A0110ADL), 0.0), new Vec3d(0.0, Double.longBitsToDouble(-4616189618054758400L), 1.0), new Vec3d(1.0, 0.0, 0.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), 0.0, 0.0), new Vec3d(0.0, 0.0, 1.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble(-4616189618054758400L)), new Vec3d(Double.longBitsToDouble((long)1029974521 ^ 0x400000003D6429F9L), 0.0, 0.0), new Vec3d(Double.longBitsToDouble((long)1142266043 ^ 0xC0000000441598BBL), 0.0, 0.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble(0x4000000000000000L)), new Vec3d(0.0, 0.0, Double.longBitsToDouble(-4611686018427387904L)), new Vec3d(Double.longBitsToDouble(0x4008000000000000L), 0.0, 0.0), new Vec3d(Double.longBitsToDouble(-4609434218613702656L), 0.0, 0.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble(0x4008000000000000L)), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)1174004679 ^ 0xC008000045F9E3C7L)))));

    private final List Field8362;
    private String Field8364 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class103() {
        void var3_1;
        this.Field8362 = var3_1;
    }

    public List Method815() {
        return this.Field8362;
    }

    static /* bridge */ /* synthetic */ List Method816(Class103 class103) {
        return class103.Field8362;
    }

    private static String Method817(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 186;
            cArray2[n] = (char)(cArray[n] ^ (0x1690 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

