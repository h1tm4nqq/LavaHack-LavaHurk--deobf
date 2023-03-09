/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3i
 */
package lavahack.client;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.minecraft.util.math.Vec3i;

public enum Class1404 {
    Field14352(Collections.singletonList(new Vec3i(0, 2, 0))),
    Field14353(Arrays.asList(new Vec3i(1, 2, 0), new Vec3i(-1, 2, 0), new Vec3i(0, 2, 1), new Vec3i(0, 2, -1), new Vec3i(1, 2, 1), new Vec3i(-1, 2, -1), new Vec3i(1, 2, -1), new Vec3i(-1, 2, 1)));

    public final List Field14354;
    private int Field14356;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1404() {
        void var3_1;
        this.Field14354 = var3_1;
    }

    private static String Method5535(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 119;
            cArray2[n] = (char)(cArray[n] ^ (0x1D03 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

