/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import lavahack.client.OZNE8a27gApnnviXRcPhL79iAG2aJFq1;

public class OZNE8a27gApnnviXRcPhL79iAG2aJFq1$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends FilterOutputStream {
    private boolean Field9974;
    private int Field9975;
    private byte[] Field9976;
    private int Field9977;
    private int Field9978;
    private boolean Field9979;
    private byte[] Field9980;
    private boolean Field9981;
    private int Field9982;
    private byte[] Field9983;
    private String Field9984 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public OZNE8a27gApnnviXRcPhL79iAG2aJFq1$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(OutputStream outputStream) {
        this(outputStream, (int)-1106593816L ^ 0xBE0AB7E9);
    }

    public OZNE8a27gApnnviXRcPhL79iAG2aJFq1$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(OutputStream outputStream, int n) {
        super(outputStream);
        this.Field9979 = (n & (int)((long)1072515953 ^ (long)1072515952) << 3) != 0 ? (int)270599162L ^ 0x102103FB : (int)361695221L ^ 0x158F07F5;
        this.Field9974 = (n & ((int)-1599113064L ^ 0xA0AF7899)) != 0 ? (int)((long)-1687023886 ^ (long)-1687023885) : (int)-116524601L ^ 0xF90DF9C7;
        this.Field9977 = this.Field9974 ? (int)-116168711L ^ 0xF91367FA : (int)((long)548367635 ^ (long)548367634) << 2;
        this.Field9976 = new byte[this.Field9977];
        this.Field9975 = (int)((long)403404290 ^ (long)403404290);
        this.Field9978 = (int)1907298346L ^ 0x71AF102A;
        this.Field9981 = (int)-803540007L ^ 0xD01AF3D9;
        this.Field9980 = new byte[((int)605140988L ^ 0x2411B7FD) << 2];
        this.Field9982 = n;
        this.Field9983 = OZNE8a27gApnnviXRcPhL79iAG2aJFq1.Method2941(n);
    }

    @Override
    public void write(int n) throws IOException {
        if (this.Field9981) {
            this.out.write(n);
            return;
        }
        if (this.Field9974) {
            int n2 = this.Field9975;
            this.Field9975 = n2 + (int)((long)-1117162348 ^ (long)-1117162347);
            this.Field9976[n2] = (byte)n;
            if (this.Field9975 < this.Field9977) return;
            this.out.write(OZNE8a27gApnnviXRcPhL79iAG2aJFq1.Method2942(this.Field9980, this.Field9976, this.Field9977, this.Field9982));
            this.Field9978 += ((int)653819825L ^ 0x26F87FB0) << 2;
            if (this.Field9979 && this.Field9978 >= (int)((long)-673217582 ^ (long)-673217599) << 2) {
                this.out.write((int)((long)620641187 ^ (long)620641190) << 1);
                this.Field9978 = (int)-546404873L ^ 0xDF6E85F7;
            }
            this.Field9975 = (int)((long)16796573 ^ (long)16796573);
            return;
        }
        if (this.Field9983[n & (int)((long)1758189753 ^ (long)1758189766)] > ((int)1242725861L ^ 0xB5ED821E)) {
            int n3 = this.Field9975;
            this.Field9975 = n3 + ((int)-514111512L ^ 0xE15B47E9);
            this.Field9976[n3] = (byte)n;
            if (this.Field9975 < this.Field9977) return;
            int n4 = OZNE8a27gApnnviXRcPhL79iAG2aJFq1.Method2943(this.Field9976, (int)((long)-881091234 ^ (long)-881091234), this.Field9980, (int)((long)-1738030630 ^ (long)-1738030630), this.Field9982);
            this.out.write(this.Field9980, (int)-1179930300L ^ 0xB9ABB144, n4);
            this.Field9975 = (int)((long)1364688260 ^ (long)1364688260);
            return;
        }
        if (this.Field9983[n & (int)((long)-938227290 ^ (long)-938227239)] == ((int)1728273835L ^ 0x98FCA250)) return;
        throw new IOException("Invalid character in Base64 data.");
    }

    @Override
    public void write(byte[] byArray, int n, int n2) throws IOException {
        if (this.Field9981) {
            this.out.write(byArray, n, n2);
            return;
        }
        int n3 = (int)((long)-947267329 ^ (long)-947267329);
        while (n3 < n2) {
            this.write(byArray[n + n3]);
            ++n3;
        }
    }

    public void Method2218() throws IOException {
        if (this.Field9975 <= 0) return;
        if (!this.Field9974) throw new IOException("Base64 input not properly padded.");
        this.out.write(OZNE8a27gApnnviXRcPhL79iAG2aJFq1.Method2942(this.Field9980, this.Field9976, this.Field9975, this.Field9982));
        this.Field9975 = (int)((long)107346949 ^ (long)107346949);
    }

    @Override
    public void close() throws IOException {
        this.Method2218();
        super.close();
        this.Field9976 = null;
        this.out = null;
    }

    private static String Method2219(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-409195513 ^ (long)-409195513);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)860184483 ^ (long)860184412);
            int n2 = (int)1388690981L ^ 0x52C5BE94;
            cArray2[n] = (char)(cArray[n] ^ (((int)-648142082L ^ 0xD95E2E79) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

