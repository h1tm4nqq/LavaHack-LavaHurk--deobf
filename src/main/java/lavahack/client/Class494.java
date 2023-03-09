/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.nio.ByteBuffer;
import lavahack.client.Class1030;
import lavahack.client.Class1260;
import lavahack.client.Class1275;
import lavahack.client.Class1418;
import lavahack.client.Class1606;
import lavahack.client.Class1749;
import lavahack.client.Class23;
import lavahack.client.Class319;
import lavahack.client.Class370;
import lavahack.client.Class927;
import lavahack.client.Class966;

public abstract class Class494
implements Class1260 {
    private boolean Field10050;
    private Class927 Field10051;
    private ByteBuffer Field10052;
    private boolean Field10053;
    private boolean Field10054;
    private boolean Field10055;
    private boolean Field10056;
    private String Field10057 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public abstract void Method1620() throws Class23;

    public Class494(Class927 class927) {
        this.Field10051 = class927;
        this.Field10052 = Class1606.Method6269();
        this.Field10050 = true;
        this.Field10053 = false;
        this.Field10054 = false;
        this.Field10055 = false;
        this.Field10056 = false;
    }

    @Override
    public boolean Method1613() {
        return this.Field10054;
    }

    @Override
    public boolean Method1614() {
        return this.Field10055;
    }

    @Override
    public boolean Method1615() {
        return this.Field10056;
    }

    @Override
    public boolean Method1612() {
        return this.Field10050;
    }

    @Override
    public Class927 Method1617() {
        return this.Field10051;
    }

    @Override
    public boolean Method1616() {
        return this.Field10053;
    }

    @Override
    public ByteBuffer Method1618() {
        return this.Field10052;
    }

    @Override
    public void Method1619(Class1260 class1260) {
        ByteBuffer byteBuffer = class1260.Method1618();
        if (this.Field10052 == null) {
            this.Field10052 = ByteBuffer.allocate(byteBuffer.remaining());
            byteBuffer.mark();
            this.Field10052.put(byteBuffer);
            byteBuffer.reset();
        } else {
            byteBuffer.mark();
            this.Field10052.position(this.Field10052.limit());
            this.Field10052.limit(this.Field10052.capacity());
            if (byteBuffer.remaining() > this.Field10052.remaining()) {
                ByteBuffer byteBuffer2 = ByteBuffer.allocate(byteBuffer.remaining() + this.Field10052.capacity());
                this.Field10052.flip();
                byteBuffer2.put(this.Field10052);
                byteBuffer2.put(byteBuffer);
                this.Field10052 = byteBuffer2;
            } else {
                this.Field10052.put(byteBuffer);
            }
            this.Field10052.rewind();
            byteBuffer.reset();
        }
        this.Field10050 = class1260.Method1612();
    }

    public String toString() {
        String string;
        StringBuilder stringBuilder = new StringBuilder().append("Framedata{ opcode:").append((Object)this.Method1617()).append(", fin:").append(this.Method1612()).append(", rsv1:").append(this.Method1613()).append(", rsv2:").append(this.Method1614()).append(", rsv3:").append(this.Method1615()).append(", payload length:[pos:").append(this.Field10052.position()).append(", len:").append(this.Field10052.remaining()).append("], payload:");
        if (this.Field10052.remaining() > 1000) {
            string = "(too big to display)";
            return stringBuilder.append(string).append('}').toString();
        }
        string = new String(this.Field10052.array());
        return stringBuilder.append(string).append('}').toString();
    }

    public void Method1621(ByteBuffer byteBuffer) {
        this.Field10052 = byteBuffer;
    }

    public void Method1622(boolean bl) {
        this.Field10050 = bl;
    }

    public void Method1623(boolean bl) {
        this.Field10054 = bl;
    }

    public void Method1624(boolean bl) {
        this.Field10055 = bl;
    }

    public void Method1625(boolean bl) {
        this.Field10056 = bl;
    }

    public void Method1626(boolean bl) {
        this.Field10053 = bl;
    }

    public static Class494 Method1627(Class927 class927) {
        if (class927 == null) {
            throw new IllegalArgumentException("Supplied opcode cannot be null");
        }
        switch (Class1030.Field12521[class927.ordinal()]) {
            case 1: {
                return new Class1418();
            }
            case 2: {
                return new Class319();
            }
            case 3: {
                return new Class370();
            }
            case 4: {
                return new Class1275();
            }
            case 5: {
                return new Class966();
            }
            case 6: {
                return new Class1749();
            }
        }
        throw new IllegalArgumentException("Supplied opcode is invalid");
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) return false;
        if (this.getClass() != object.getClass()) {
            return false;
        }
        Class494 class494 = (Class494)object;
        if (this.Field10050 != class494.Field10050) {
            return false;
        }
        if (this.Field10053 != class494.Field10053) {
            return false;
        }
        if (this.Field10054 != class494.Field10054) {
            return false;
        }
        if (this.Field10055 != class494.Field10055) {
            return false;
        }
        if (this.Field10056 != class494.Field10056) {
            return false;
        }
        if (this.Field10051 != class494.Field10051) {
            return false;
        }
        if (this.Field10052 != null) {
            boolean bl = this.Field10052.equals(class494.Field10052);
            return bl;
        }
        if (class494.Field10052 != null) return false;
        return true;
    }

    public int hashCode() {
        int n = this.Field10050 ? 1 : 0;
        n = 31 * n + this.Field10051.hashCode();
        n = 31 * n + (this.Field10052 != null ? this.Field10052.hashCode() : 0);
        n = 31 * n + (this.Field10053 ? 1 : 0);
        n = 31 * n + (this.Field10054 ? 1 : 0);
        n = 31 * n + (this.Field10055 ? 1 : 0);
        return 31 * n + (this.Field10056 ? 1 : 0);
    }

    private static String Method1628(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 138;
            cArray2[n] = (char)(cArray[n] ^ (0x6FDA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

