/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.krTNPXljKWh8NNaZWZXUD3nchZzlBDMg;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua;

public class D0HGrGydMgDaR4J1q0q75UlukIJZBBTF
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15837 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("WaterMark", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)861033835L ^ 0x3352556A) != 0));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15838 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Custom Splash Text", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1794256453L ^ 0x6AF22E44) != 0));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15839 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Custom Splash Font", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-200118897L ^ 0xF4126D8F) != 0).Method313(this::Method6492));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15840 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Particles", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1829198280 ^ (long)1829198280)));
    @tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua
    public static D0HGrGydMgDaR4J1q0q75UlukIJZBBTF Field15841;
    private String Field15842 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public D0HGrGydMgDaR4J1q0q75UlukIJZBBTF() {
        super("CustomMainMenu", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8339);
        super.Method21(((int)-398286021L ^ 0xE842A33A) != 0);
    }

    @Override
    public void Method45() {
        krTNPXljKWh8NNaZWZXUD3nchZzlBDMg.Field9449 = this.Field15837.Method365();
        krTNPXljKWh8NNaZWZXUD3nchZzlBDMg.Field9450 = this.Field15838.Method365();
        krTNPXljKWh8NNaZWZXUD3nchZzlBDMg.Field9451 = this.Field15839.Method365();
        krTNPXljKWh8NNaZWZXUD3nchZzlBDMg.Field9452 = this.Field15840.Method365();
    }

    @Override
    public void Method39() {
        krTNPXljKWh8NNaZWZXUD3nchZzlBDMg.Field9449 = (int)((long)-731349883 ^ (long)-731349883);
        krTNPXljKWh8NNaZWZXUD3nchZzlBDMg.Field9450 = (int)-429252252L ^ 0xE66A2164;
        krTNPXljKWh8NNaZWZXUD3nchZzlBDMg.Field9451 = (int)-1975824188L ^ 0x8A3B50C4;
        krTNPXljKWh8NNaZWZXUD3nchZzlBDMg.Field9452 = (int)((long)868304202 ^ (long)868304202);
    }

    private Boolean Method6492() {
        return this.Field15838.Method365();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1103157513L ^ 0xBE3F26F7;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-314913186 ^ (long)-314913119);
            int n2 = (int)-1562340163L ^ 0xA2E094CE;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)2122150642 ^ (long)2122138697) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

