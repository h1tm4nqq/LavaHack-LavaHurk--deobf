/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3i
 */
package lavahack.client;

import net.minecraft.util.math.Vec3i;

public final class rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP
extends Enum {
    public static final /* enum */ rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP Field16665 = new rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP("NORTH", (int)407699647L ^ 0x184D00BF, new Vec3i((int)((long)-1644028744 ^ (long)-1644028744), (int)((long)11349527 ^ (long)11349527), (int)((long)-1337055386 ^ (long)1337055385)));
    public static final /* enum */ rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP Field16666 = new rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP("WEST", (int)2100580071L ^ 0x7D344EE6, new Vec3i((int)-1700412L ^ 0x19F23B, (int)((long)1989219191 ^ (long)1989219191), (int)((long)-333856654 ^ (long)-333856654)));
    public static final /* enum */ rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP Field16667 = new rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP("SOUTH", (int)((long)331766703 ^ (long)331766702) << 1, new Vec3i((int)-1371373527L ^ 0xAE428029, (int)((long)522951323 ^ (long)522951323), (int)785939381L ^ 0x2ED87BB4));
    public static final /* enum */ rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP Field16668 = new rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP("EAST", (int)((long)1751096033 ^ (long)1751096034), new Vec3i((int)((long)-258625115 ^ (long)-258625116), (int)((long)2009772422 ^ (long)2009772422), (int)((long)633095293 ^ (long)633095293)));
    public Vec3i Field16669;
    private static final rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP[] Field16670;
    private int Field16671;

    public static rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP[] values() {
        return (rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP[])Field16670.clone();
    }

    public static rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP valueOf(String string) {
        return Enum.valueOf(rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field16669 = var3_1;
    }

    static {
        rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP[] rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyPArray = new rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP[((int)587489114L ^ 0x23045F5B) << 2];
        rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyPArray[(int)((long)-14526316 ^ (long)-14526316)] = Field16665;
        rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyPArray[(int)-1886699890L ^ 0x8F8B3E8F] = Field16666;
        rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyPArray[(int)((long)-1333589668 ^ (long)-1333589667) << 1] = Field16667;
        rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyPArray[(int)((long)-289966688 ^ (long)-289966685)] = Field16668;
        Field16670 = rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyPArray;
    }

    private static String Method6974(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1724702860 ^ (long)1724702860);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)915330289 ^ (long)915330062);
            int n2 = (int)-24552568L ^ 0xFE895BC5;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1562356862 ^ (long)-1562356905) << 6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

