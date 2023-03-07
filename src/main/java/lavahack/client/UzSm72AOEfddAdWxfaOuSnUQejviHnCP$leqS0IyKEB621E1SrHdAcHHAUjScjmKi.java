/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class UzSm72AOEfddAdWxfaOuSnUQejviHnCP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ UzSm72AOEfddAdWxfaOuSnUQejviHnCP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11496 = new UzSm72AOEfddAdWxfaOuSnUQejviHnCP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Exp", (int)184895498L ^ 0xB05480A);
    public static final /* enum */ UzSm72AOEfddAdWxfaOuSnUQejviHnCP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11497 = new UzSm72AOEfddAdWxfaOuSnUQejviHnCP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Pearl", (int)910355398L ^ 0x3642EBC7);
    public static final /* enum */ UzSm72AOEfddAdWxfaOuSnUQejviHnCP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11498 = new UzSm72AOEfddAdWxfaOuSnUQejviHnCP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Obby", (int)((long)1330479665 ^ (long)1330479664) << 1);
    private static final UzSm72AOEfddAdWxfaOuSnUQejviHnCP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field11499;
    private String Field11500 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static UzSm72AOEfddAdWxfaOuSnUQejviHnCP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (UzSm72AOEfddAdWxfaOuSnUQejviHnCP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field11499.clone();
    }

    public static UzSm72AOEfddAdWxfaOuSnUQejviHnCP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(UzSm72AOEfddAdWxfaOuSnUQejviHnCP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private UzSm72AOEfddAdWxfaOuSnUQejviHnCP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        UzSm72AOEfddAdWxfaOuSnUQejviHnCP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] uzSm72AOEfddAdWxfaOuSnUQejviHnCP$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new UzSm72AOEfddAdWxfaOuSnUQejviHnCP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)775712958L ^ 0x2E3C70BD];
        uzSm72AOEfddAdWxfaOuSnUQejviHnCP$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-449918481 ^ (long)-449918481)] = Field11496;
        uzSm72AOEfddAdWxfaOuSnUQejviHnCP$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)675039177L ^ 0x283C47C8] = Field11497;
        uzSm72AOEfddAdWxfaOuSnUQejviHnCP$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)1265978672 ^ (long)1265978673) << 1] = Field11498;
        Field11499 = uzSm72AOEfddAdWxfaOuSnUQejviHnCP$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method3487(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1211662274L ^ 0xB7C7803E;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)721892687 ^ (long)721892784);
            int n2 = (int)-252986912L ^ 0xF0EBB9CD;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-296033876 ^ (long)-296033377) << 5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

