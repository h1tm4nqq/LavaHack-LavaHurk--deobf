/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import lavahack.client.Class705;

public class Class474
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

    public Class474(OutputStream outputStream) {
        this(outputStream, 1);
    }

    public Class474(OutputStream outputStream, int n) {
        super(outputStream);
        this.Field9979 = (n & 8) != 0;
        this.Field9974 = (n & 1) != 0;
        this.Field9977 = this.Field9974 ? 3 : 4;
        this.Field9976 = new byte[this.Field9977];
        this.Field9975 = 0;
        this.Field9978 = 0;
        this.Field9981 = false;
        this.Field9980 = new byte[4];
        this.Field9982 = n;
        this.Field9983 = Class705.Method2941(n);
    }

    @Override
    public void write(int n) throws IOException {
        if (this.Field9981) {
            this.out.write(n);
            return;
        }
        if (this.Field9974) {
            this.Field9976[this.Field9975++] = (byte)n;
            if (this.Field9975 < this.Field9977) return;
            this.out.write(Class705.Method2942(this.Field9980, this.Field9976, this.Field9977, this.Field9982));
            this.Field9978 += 4;
            if (this.Field9979 && this.Field9978 >= 76) {
                this.out.write(10);
                this.Field9978 = 0;
            }
            this.Field9975 = 0;
            return;
        }
        if (this.Field9983[n & 0x7F] > -5) {
            this.Field9976[this.Field9975++] = (byte)n;
            if (this.Field9975 < this.Field9977) return;
            int n2 = Class705.Method2943(this.Field9976, 0, this.Field9980, 0, this.Field9982);
            this.out.write(this.Field9980, 0, n2);
            this.Field9975 = 0;
            return;
        }
        if (this.Field9983[n & 0x7F] == -5) return;
        throw new IOException("Invalid character in Base64 data.");
    }

    @Override
    public void write(byte[] byArray, int n, int n2) throws IOException {
        if (this.Field9981) {
            this.out.write(byArray, n, n2);
            return;
        }
        int n3 = 0;
        while (n3 < n2) {
            this.write(byArray[n + n3]);
            ++n3;
        }
    }

    public void Method2218() throws IOException {
        if (this.Field9975 <= 0) return;
        if (!this.Field9974) throw new IOException("Base64 input not properly padded.");
        this.out.write(Class705.Method2942(this.Field9980, this.Field9976, this.Field9975, this.Field9982));
        this.Field9975 = 0;
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 177;
            cArray2[n] = (char)(cArray[n] ^ (0x6438 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

