/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class OifO3xCDyEtAk5SaOnUnMrBMqBpJ7Coe
extends Enum {
    public static final /* enum */ OifO3xCDyEtAk5SaOnUnMrBMqBpJ7Coe Field10896 = new OifO3xCDyEtAk5SaOnUnMrBMqBpJ7Coe("Pressed", (int)((long)1121255593 ^ (long)1121255593));
    public static final /* enum */ OifO3xCDyEtAk5SaOnUnMrBMqBpJ7Coe Field10897 = new OifO3xCDyEtAk5SaOnUnMrBMqBpJ7Coe("Released", (int)((long)1613218458 ^ (long)1613218459));
    private static final OifO3xCDyEtAk5SaOnUnMrBMqBpJ7Coe[] Field10898;
    private String Field10899 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static OifO3xCDyEtAk5SaOnUnMrBMqBpJ7Coe[] values() {
        return (OifO3xCDyEtAk5SaOnUnMrBMqBpJ7Coe[])Field10898.clone();
    }

    public static OifO3xCDyEtAk5SaOnUnMrBMqBpJ7Coe valueOf(String string) {
        return Enum.valueOf(OifO3xCDyEtAk5SaOnUnMrBMqBpJ7Coe.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private OifO3xCDyEtAk5SaOnUnMrBMqBpJ7Coe() {
        void var2_-1;
        void var1_-1;
    }

    public static OifO3xCDyEtAk5SaOnUnMrBMqBpJ7Coe Method2878(boolean bl) {
        OifO3xCDyEtAk5SaOnUnMrBMqBpJ7Coe oifO3xCDyEtAk5SaOnUnMrBMqBpJ7Coe;
        if (bl) {
            oifO3xCDyEtAk5SaOnUnMrBMqBpJ7Coe = Field10896;
            return oifO3xCDyEtAk5SaOnUnMrBMqBpJ7Coe;
        }
        oifO3xCDyEtAk5SaOnUnMrBMqBpJ7Coe = Field10897;
        return oifO3xCDyEtAk5SaOnUnMrBMqBpJ7Coe;
    }

    static {
        OifO3xCDyEtAk5SaOnUnMrBMqBpJ7Coe[] oifO3xCDyEtAk5SaOnUnMrBMqBpJ7CoeArray = new OifO3xCDyEtAk5SaOnUnMrBMqBpJ7Coe[((int)1878452701L ^ 0x6FF6E9DC) << 1];
        oifO3xCDyEtAk5SaOnUnMrBMqBpJ7CoeArray[(int)((long)420517142 ^ (long)420517142)] = Field10896;
        oifO3xCDyEtAk5SaOnUnMrBMqBpJ7CoeArray[(int)((long)1594473244 ^ (long)1594473245)] = Field10897;
        Field10898 = oifO3xCDyEtAk5SaOnUnMrBMqBpJ7CoeArray;
    }

    private static String Method2879(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1745750142 ^ (long)-1745750142);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1218346905 ^ (long)1218346854);
            int n2 = ((int)-1519778224L ^ 0xA56A065D) << 4;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1483666429L ^ 0xA7911148) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

