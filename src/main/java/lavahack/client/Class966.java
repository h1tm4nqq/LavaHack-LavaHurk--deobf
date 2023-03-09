/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.nio.ByteBuffer;
import lavahack.client.Class1606;
import lavahack.client.Class176;
import lavahack.client.Class23;
import lavahack.client.Class475;
import lavahack.client.Class927;
import lavahack.client.Class929;

public class Class966
extends Class929 {
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

    public void Method3962(int n) {
        this.Field12140 = n;
        if (n == 1015) {
            this.Field12140 = 1005;
            this.Field12141 = "";
        }
        this.Method3967();
    }

    public void Method3963(String string) {
        if (string == null) {
            string = "";
        }
        this.Field12141 = string;
        this.Method3967();
    }

    public int Method3964() {
        return this.Field12140;
    }

    public String Method3965() {
        return this.Field12141;
    }

    @Override
    public String toString() {
        return super.toString() + "code: " + this.Field12140;
    }

    @Override
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
        if (this.Field12140 == 1006) throw new Class475("closecode must not be sent over the wire: " + this.Field12140);
        if (this.Field12140 == 1015) throw new Class475("closecode must not be sent over the wire: " + this.Field12140);
        if (this.Field12140 == 1005) throw new Class475("closecode must not be sent over the wire: " + this.Field12140);
        if (this.Field12140 > 4999) throw new Class475("closecode must not be sent over the wire: " + this.Field12140);
        if (this.Field12140 < 1000) throw new Class475("closecode must not be sent over the wire: " + this.Field12140);
        if (this.Field12140 != 1004) return;
        throw new Class475("closecode must not be sent over the wire: " + this.Field12140);
    }

    @Override
    public void Method1621(ByteBuffer byteBuffer) {
        this.Field12140 = 1005;
        this.Field12141 = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.Field12140 = 1000;
            return;
        }
        if (byteBuffer.remaining() == 1) {
            this.Field12140 = 1002;
            return;
        }
        if (byteBuffer.remaining() >= 2) {
            ByteBuffer byteBuffer2 = ByteBuffer.allocate(4);
            byteBuffer2.position(2);
            byteBuffer2.putShort(byteBuffer.getShort());
            byteBuffer2.position(0);
            this.Field12140 = byteBuffer2.getInt();
        }
        byteBuffer.reset();
        int n = byteBuffer.position();
        this.Method3966(byteBuffer, n);
    }

    private void Method3966(ByteBuffer byteBuffer, int n) throws Class23 {
        byteBuffer.position(byteBuffer.position() + 2);
        this.Field12141 = Class176.Method1099(byteBuffer);
        byteBuffer.position(n);
    }

    private void Method3967() {
        byte[] byArray = Class176.Method1094(this.Field12141);
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.Field12140);
        byteBuffer.position(2);
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(2 + byArray.length);
        byteBuffer2.put(byteBuffer);
        byteBuffer2.put(byArray);
        byteBuffer2.rewind();
        super.Method1621(byteBuffer2);
    }

    @Override
    public ByteBuffer Method1618() {
        if (this.Field12140 != 1005) return super.Method1618();
        return Class1606.Method6269();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) return false;
        if (this.getClass() != object.getClass()) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        Class966 class966 = (Class966)object;
        if (this.Field12140 != class966.Field12140) {
            return false;
        }
        if (this.Field12141 != null) {
            boolean bl = this.Field12141.equals(class966.Field12141);
            return bl;
        }
        if (class966.Field12141 != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + this.Field12140;
        return 31 * n + (this.Field12141 != null ? this.Field12141.hashCode() : 0);
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

    private static String Method1628(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 51;
            cArray2[n] = (char)(cArray[n] ^ (0x2239 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

