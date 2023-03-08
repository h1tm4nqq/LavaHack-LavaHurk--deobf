//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.io.*;

public class Class474 extends FilterOutputStream
{
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
    
    public Class474(final OutputStream outputStream) {
        this(outputStream, 1);
    }
    
    public Class474(final OutputStream out, final int field9982) {
        super(out);
        this.Field9979 = ((field9982 & 0x8) != 0x0);
        this.Field9974 = ((field9982 & 0x1) != 0x0);
        this.Field9977 = (this.Field9974 ? 3 : 4);
        this.Field9976 = new byte[this.Field9977];
        this.Field9975 = 0;
        this.Field9978 = 0;
        this.Field9981 = false;
        this.Field9980 = new byte[4];
        this.Field9982 = field9982;
        this.Field9983 = Class705.Method2941(field9982);
    }
    
    @Override
    public void write(final int n) throws IOException {
        if (this.Field9981) {
            this.out.write(n);
            return;
        }
        if (this.Field9974) {
            this.Field9976[this.Field9975++] = (byte)n;
            if (this.Field9975 >= this.Field9977) {
                this.out.write(Class705.Method2942(this.Field9980, this.Field9976, this.Field9977, this.Field9982));
                this.Field9978 += 4;
                if (this.Field9979 && this.Field9978 >= 76) {
                    this.out.write(10);
                    this.Field9978 = 0;
                }
                this.Field9975 = 0;
            }
        }
        else if (this.Field9983[n & 0x7F] > -5) {
            this.Field9976[this.Field9975++] = (byte)n;
            if (this.Field9975 >= this.Field9977) {
                this.out.write(this.Field9980, 0, Class705.Method2943(this.Field9976, 0, this.Field9980, 0, this.Field9982));
                this.Field9975 = 0;
            }
        }
        else if (this.Field9983[n & 0x7F] != -5) {
            throw new IOException("Invalid character in Base64 data.");
        }
    }
    
    @Override
    public void write(final byte[] b, final int off, final int len) throws IOException {
        if (this.Field9981) {
            this.out.write(b, off, len);
            return;
        }
        for (int i = 0; i < len; ++i) {
            this.write(b[off + i]);
        }
    }
    
    public void Method2218() throws IOException {
        if (this.Field9975 > 0) {
            if (!this.Field9974) {
                throw new IOException("Base64 input not properly padded.");
            }
            this.out.write(Class705.Method2942(this.Field9980, this.Field9976, this.Field9975, this.Field9982));
            this.Field9975 = 0;
        }
    }
    
    @Override
    public void close() throws IOException {
        this.Method2218();
        super.close();
        this.Field9976 = null;
        this.out = null;
    }
    
    private static String Method2219(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6438 ^ 0xB1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
