/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import lavahack.loader.Class636;

public class Class1900
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

    public Class1900(OutputStream outputStream) {
        this(outputStream, 1);
    }

    public Class1900(OutputStream outputStream, int n) {
        super(outputStream);
        this.Field16745 = (n & 8) != 0;
        this.Field16740 = (n & 1) != 0;
        this.Field16743 = this.Field16740 ? 3 : 4;
        this.Field16742 = new byte[this.Field16743];
        this.Field16741 = 0;
        this.Field16744 = 0;
        this.Field16747 = false;
        this.Field16746 = new byte[4];
        this.Field16748 = n;
        this.Field16749 = Class636.Method2762(n);
    }

    @Override
    public void write(int n) throws IOException {
        if (this.Field16747) {
            this.out.write(n);
            return;
        }
        if (this.Field16740) {
            this.Field16742[this.Field16741++] = (byte)n;
            if (this.Field16741 < this.Field16743) return;
            this.out.write(Class636.Method2763(this.Field16746, this.Field16742, this.Field16743, this.Field16748));
            this.Field16744 += 4;
            if (this.Field16745 && this.Field16744 >= 76) {
                this.out.write(10);
                this.Field16744 = 0;
            }
            this.Field16741 = 0;
            return;
        }
        if (this.Field16749[n & 0x7F] > -5) {
            this.Field16742[this.Field16741++] = (byte)n;
            if (this.Field16741 < this.Field16743) return;
            int n2 = Class636.Method2764(this.Field16742, 0, this.Field16746, 0, this.Field16748);
            this.out.write(this.Field16746, 0, n2);
            this.Field16741 = 0;
            return;
        }
        if (this.Field16749[n & 0x7F] == -5) return;
        throw new IOException("Invalid character in Base64 data.");
    }

    @Override
    public void write(byte[] byArray, int n, int n2) throws IOException {
        if (this.Field16747) {
            this.out.write(byArray, n, n2);
            return;
        }
        int n3 = 0;
        while (n3 < n2) {
            this.write(byArray[n + n3]);
            ++n3;
        }
    }

    public void Method7042() throws IOException {
        if (this.Field16741 <= 0) return;
        if (!this.Field16740) throw new IOException("Base64 input not properly padded.");
        this.out.write(Class636.Method2763(this.Field16746, this.Field16742, this.Field16741, this.Field16748));
        this.Field16741 = 0;
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 240;
            cArray2[n] = (char)(cArray[n] ^ (0x1AAC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

