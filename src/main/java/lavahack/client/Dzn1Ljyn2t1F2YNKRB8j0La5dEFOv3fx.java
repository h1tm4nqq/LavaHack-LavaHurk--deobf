/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public class Dzn1Ljyn2t1F2YNKRB8j0La5dEFOv3fx
extends Exception {
    private String Field11710 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Dzn1Ljyn2t1F2YNKRB8j0La5dEFOv3fx(String string) {
        Object[] objectArray = new Object[(int)-544556687L ^ 0xDF8AB970];
        objectArray[(int)((long)1895388754 ^ (long)1895388754)] = string;
        super(String.format("Unsupported format: %s", objectArray));
    }

    private static String Method3680(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1159189993L ^ 0xBAE82A17;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1755599509L ^ 0x68A4526A);
            int n2 = (int)-1126693961L ^ 0xBCD803A2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-798455462 ^ (long)-798435461) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

