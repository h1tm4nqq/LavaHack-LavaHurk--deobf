//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.nio.*;

public class Class966 extends Class929
{
    public static final int Field12122;
    public static final int Field12123;
    public static final int Field12124;
    public static final int Field12125;
    public static final int Field12126;
    public static final int Field12127;
    public static final int Field12128;
    public static final int Field12129;
    public static final int Field12130;
    public static final int Field12131;
    public static final int Field12132;
    public static final int Field12133;
    public static final int Field12134;
    public static final int Field12135;
    public static final int Field12136;
    public static final int Field12137;
    public static final int Field12138;
    public static final int Field12139;
    private int Field12140;
    private String Field12141;
    private String Field12142 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class966() {
        super(Class927.Field11931);
        this.Method3963("");
        this.Method3962(1000);
    }
    
    public void Method3962(final int field12140) {
        this.Field12140 = field12140;
        if (field12140 == 1015) {
            this.Field12140 = 1005;
            this.Field12141 = "";
        }
        this.Method3967();
    }
    
    public void Method3963(String field12141) {
        if (field12141 == null) {
            field12141 = "";
        }
        this.Field12141 = field12141;
        this.Method3967();
    }
    
    public int Method3964() {
        return this.Field12140;
    }
    
    public String Method3965() {
        return this.Field12141;
    }
    
    public String toString() {
        return super.toString() + "code: " + this.Field12140;
    }
    
    public void Method1620() throws Class23 {
        super.Method1620();
        if (this.Field12140 == 1007 && this.Field12141.isEmpty()) {
            throw new Class23(1007, "Received text is no valid utf8 string!");
        }
        if (this.Field12140 == 1005 && 0 < this.Field12141.length()) {
            throw new Class23(1002, "A close frame must have a closecode if it has a reason");
        }
        if (this.Field12140 > 1015 && this.Field12140 < 3000) {
            throw new Class23(1002, "Trying to send an illegal close code!");
        }
        if (this.Field12140 == 1006 || this.Field12140 == 1015 || this.Field12140 == 1005 || this.Field12140 > 4999 || this.Field12140 < 1000 || this.Field12140 == 1004) {
            throw new Class475("closecode must not be sent over the wire: " + this.Field12140);
        }
    }
    
    public void Method1621(final ByteBuffer byteBuffer) {
        this.Field12140 = 1005;
        this.Field12141 = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.Field12140 = 1000;
        }
        else if (byteBuffer.remaining() == 1) {
            this.Field12140 = 1002;
        }
        else {
            if (byteBuffer.remaining() >= 2) {
                final ByteBuffer allocate = ByteBuffer.allocate(4);
                allocate.position(2);
                allocate.putShort(byteBuffer.getShort());
                allocate.position(0);
                this.Field12140 = allocate.getInt();
            }
            byteBuffer.reset();
            this.Method3966(byteBuffer, byteBuffer.position());
        }
    }
    
    private void Method3966(final ByteBuffer byteBuffer, final int n) throws Class23 {
        byteBuffer.position(byteBuffer.position() + 2);
        this.Field12141 = Class176.Method1099(byteBuffer);
        byteBuffer.position(n);
    }
    
    private void Method3967() {
        final byte[] method1094 = Class176.Method1094(this.Field12141);
        final ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(this.Field12140);
        allocate.position(2);
        final ByteBuffer allocate2 = ByteBuffer.allocate(2 + method1094.length);
        allocate2.put(allocate);
        allocate2.put(method1094);
        allocate2.rewind();
        super.Method1621(allocate2);
    }
    
    public ByteBuffer Method1618() {
        if (this.Field12140 == 1005) {
            return Class1606.Method6269();
        }
        return super.Method1618();
    }
    
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        final Class966 class966 = (Class966)o;
        return this.Field12140 == class966.Field12140 && ((this.Field12141 != null) ? this.Field12141.equals(class966.Field12141) : (class966.Field12141 == null));
    }
    
    public int hashCode() {
        return 31 * (31 * super.hashCode() + this.Field12140) + ((this.Field12141 != null) ? this.Field12141.hashCode() : 0);
    }
    
    static {
        Field12139 = -3;
        Field12138 = -2;
        Field12137 = -1;
        Field12136 = 1015;
        Field12135 = 1014;
        Field12134 = 1013;
        Field12133 = 1012;
        Field12132 = 1011;
        Field12131 = 1010;
        Field12130 = 1009;
        Field12129 = 1008;
        Field12128 = 1007;
        Field12127 = 1006;
        Field12126 = 1005;
        Field12125 = 1003;
        Field12124 = 1002;
        Field12123 = 1001;
        Field12122 = 1000;
    }
    
    private static String Method1628(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2239 ^ 0x33));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
