/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import lavahack.loader.rRzQ0Vs9QzFUmQhXM0VX1AGIcFg0BHlG;

public class rRzQ0Vs9QzFUmQhXM0VX1AGIcFg0BHlG$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends FilterOutputStream {
    private boolean Field16740;
    private int Field16741;
    private byte[] Field16742;
    private int Field16743;
    private int Field16744;
    private boolean Field16745;
    private byte[] Field16746;
    private boolean Field16747;
    private int Field16748;
    private byte[] Field16749;
    private String Field16750 = "TheKisDevs & LavaHack Development owns you";

    public rRzQ0Vs9QzFUmQhXM0VX1AGIcFg0BHlG$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(OutputStream outputStream) {
        this(outputStream, (int)1579716831L ^ 0x5E2890DE);
    }

    public rRzQ0Vs9QzFUmQhXM0VX1AGIcFg0BHlG$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(OutputStream outputStream, int n) {
        super(outputStream);
        this.Field16745 = (n & (int)((long)-1732096317 ^ (long)-1732096318) << 3) != 0 ? (int)((long)-1726090921 ^ (long)-1726090922) : (int)((long)-1143523394 ^ (long)-1143523394);
        this.Field16740 = (n & ((int)222911182L ^ 0xD495ACF)) != 0 ? (int)((long)1344423463 ^ (long)1344423462) : (int)497486729L ^ 0x1DA70B89;
        this.Field16743 = this.Field16740 ? (int)818268576L ^ 0x30C5C9A3 : ((int)-428689247L ^ 0xE672B8A0) << 2;
        this.Field16742 = new byte[this.Field16743];
        this.Field16741 = (int)1860362296L ^ 0x6EE2E038;
        this.Field16744 = (int)((long)1265950785 ^ (long)1265950785);
        this.Field16747 = (int)((long)1911151555 ^ (long)1911151555);
        this.Field16746 = new byte[((int)1455893658L ^ 0x56C72C9B) << 2];
        this.Field16748 = n;
        this.Field16749 = rRzQ0Vs9QzFUmQhXM0VX1AGIcFg0BHlG.Method2762(n);
    }

    @Override
    public void write(int n) throws IOException {
        if (this.Field16747) {
            this.out.write(n);
            return;
        }
        if (this.Field16740) {
            int n2 = this.Field16741;
            this.Field16741 = n2 + (int)((long)-2087983684 ^ (long)-2087983683);
            this.Field16742[n2] = (byte)n;
            if (this.Field16741 < this.Field16743) return;
            this.out.write(rRzQ0Vs9QzFUmQhXM0VX1AGIcFg0BHlG.Method2763(this.Field16746, this.Field16742, this.Field16743, this.Field16748));
            this.Field16744 += (int)((long)-1965945725 ^ (long)-1965945726) << 2;
            if (this.Field16745 && this.Field16744 >= ((int)-165101400L ^ 0xF628C0BB) << 2) {
                this.out.write((int)((long)1373501172 ^ (long)1373501169) << 1);
                this.Field16744 = (int)((long)-536758321 ^ (long)-536758321);
            }
            this.Field16741 = (int)-979578791L ^ 0xC59CD059;
            return;
        }
        if (this.Field16749[n & ((int)-1652062787L ^ 0x9D8785C2)] > ((int)-1811747268L ^ 0x6BFD11C7)) {
            int n3 = this.Field16741;
            this.Field16741 = n3 + ((int)39290045L ^ 0x25784BC);
            this.Field16742[n3] = (byte)n;
            if (this.Field16741 < this.Field16743) return;
            int n4 = rRzQ0Vs9QzFUmQhXM0VX1AGIcFg0BHlG.Method2764(this.Field16742, (int)((long)-1156011996 ^ (long)-1156011996), this.Field16746, (int)-1435101436L ^ 0xAA761704, this.Field16748);
            this.out.write(this.Field16746, (int)((long)-1270989917 ^ (long)-1270989917), n4);
            this.Field16741 = (int)115422310L ^ 0x6E13466;
            return;
        }
        if (this.Field16749[n & (int)((long)-10529813 ^ (long)-10529900)] == (int)((long)-973608467 ^ (long)973608470)) return;
        throw new IOException("Invalid character in Base64 data.");
    }

    @Override
    public void write(byte[] byArray, int n, int n2) throws IOException {
        if (this.Field16747) {
            this.out.write(byArray, n, n2);
            return;
        }
        int n3 = (int)((long)-1301635513 ^ (long)-1301635513);
        while (n3 < n2) {
            this.write(byArray[n + n3]);
            ++n3;
        }
    }

    public void Method7042() throws IOException {
        if (this.Field16741 <= 0) return;
        if (!this.Field16740) throw new IOException("Base64 input not properly padded.");
        this.out.write(rRzQ0Vs9QzFUmQhXM0VX1AGIcFg0BHlG.Method2763(this.Field16746, this.Field16742, this.Field16741, this.Field16748));
        this.Field16741 = (int)-446231412L ^ 0xE5670C8C;
    }

    @Override
    public void close() throws IOException {
        this.Method7042();
        super.close();
        this.Field16742 = null;
        this.out = null;
    }

    private static String Method7043(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)855231961L ^ 0x32F9CDD9;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)10694014L ^ 0xA32D81);
            int n2 = (int)((long)-1237174441 ^ (long)-1237174440) << 4;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-745242414 ^ (long)-745240967) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

