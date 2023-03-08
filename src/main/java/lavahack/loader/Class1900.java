//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import java.io.*;

public class Class1900 extends FilterOutputStream
{
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
    
    public Class1900(final OutputStream outputStream) {
        this(outputStream, 1);
    }
    
    public Class1900(final OutputStream out, final int field16748) {
        super(out);
        this.Field16745 = ((field16748 & 0x8) != 0x0);
        this.Field16740 = ((field16748 & 0x1) != 0x0);
        this.Field16743 = (this.Field16740 ? 3 : 4);
        this.Field16742 = new byte[this.Field16743];
        this.Field16741 = 0;
        this.Field16744 = 0;
        this.Field16747 = false;
        this.Field16746 = new byte[4];
        this.Field16748 = field16748;
        this.Field16749 = Class636.Method2762(field16748);
    }
    
    @Override
    public void write(final int n) throws IOException {
        if (this.Field16747) {
            this.out.write(n);
            return;
        }
        if (this.Field16740) {
            this.Field16742[this.Field16741++] = (byte)n;
            if (this.Field16741 >= this.Field16743) {
                this.out.write(Class636.Method2763(this.Field16746, this.Field16742, this.Field16743, this.Field16748));
                this.Field16744 += 4;
                if (this.Field16745 && this.Field16744 >= 76) {
                    this.out.write(10);
                    this.Field16744 = 0;
                }
                this.Field16741 = 0;
            }
        }
        else if (this.Field16749[n & 0x7F] > -5) {
            this.Field16742[this.Field16741++] = (byte)n;
            if (this.Field16741 >= this.Field16743) {
                this.out.write(this.Field16746, 0, Class636.Method2764(this.Field16742, 0, this.Field16746, 0, this.Field16748));
                this.Field16741 = 0;
            }
        }
        else if (this.Field16749[n & 0x7F] != -5) {
            throw new IOException("Invalid character in Base64 data.");
        }
    }
    
    @Override
    public void write(final byte[] b, final int off, final int len) throws IOException {
        if (this.Field16747) {
            this.out.write(b, off, len);
            return;
        }
        for (int i = 0; i < len; ++i) {
            this.write(b[off + i]);
        }
    }
    
    public void Method7042() throws IOException {
        if (this.Field16741 > 0) {
            if (!this.Field16740) {
                throw new IOException("Base64 input not properly padded.");
            }
            this.out.write(Class636.Method2763(this.Field16746, this.Field16742, this.Field16741, this.Field16748));
            this.Field16741 = 0;
        }
    }
    
    @Override
    public void close() throws IOException {
        this.Method7042();
        super.close();
        this.Field16742 = null;
        this.out = null;
    }
    
    private static String Method7043(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1AAC ^ 0xF0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
