/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import java.nio.ByteBuffer;
import lavahack.loader.Class1252;
import lavahack.loader.Class1350;
import lavahack.loader.Class1462;
import lavahack.loader.Class1683;
import lavahack.loader.Class1753;
import lavahack.loader.Class1864;
import lavahack.loader.Class1926;
import lavahack.loader.Class213;
import lavahack.loader.Class492;
import lavahack.loader.Class7;
import lavahack.loader.Class902;

public abstract class Class1327
implements Class1926 {
    private boolean Field14077;
    private Class1753 Field14078;
    private ByteBuffer Field14079;
    private boolean Field14080;
    private boolean Field14081;
    private boolean Field14082;
    private boolean Field14083;
    private String Field14084 = "TheKisDevs & LavaHack Development owns you";

    public abstract void Method84() throws Class902;

    public Class1327(Class1753 class1753) {
        this.Field14078 = class1753;
        this.Field14079 = Class492.Method2280();
        this.Field14077 = true;
        this.Field14080 = false;
        this.Field14081 = false;
        this.Field14082 = false;
        this.Field14083 = false;
    }

    @Override
    public boolean Method77() {
        return this.Field14081;
    }

    @Override
    public boolean Method78() {
        return this.Field14082;
    }

    @Override
    public boolean Method79() {
        return this.Field14083;
    }

    @Override
    public boolean Method76() {
        return this.Field14077;
    }

    @Override
    public Class1753 Method81() {
        return this.Field14078;
    }

    @Override
    public boolean Method80() {
        return this.Field14080;
    }

    @Override
    public ByteBuffer Method82() {
        return this.Field14079;
    }

    @Override
    public void Method83(Class1926 class1926) {
        ByteBuffer byteBuffer = class1926.Method82();
        if (this.Field14079 == null) {
            this.Field14079 = ByteBuffer.allocate(byteBuffer.remaining());
            byteBuffer.mark();
            this.Field14079.put(byteBuffer);
            byteBuffer.reset();
        } else {
            byteBuffer.mark();
            this.Field14079.position(this.Field14079.limit());
            this.Field14079.limit(this.Field14079.capacity());
            if (byteBuffer.remaining() > this.Field14079.remaining()) {
                ByteBuffer byteBuffer2 = ByteBuffer.allocate(byteBuffer.remaining() + this.Field14079.capacity());
                this.Field14079.flip();
                byteBuffer2.put(this.Field14079);
                byteBuffer2.put(byteBuffer);
                this.Field14079 = byteBuffer2;
            } else {
                this.Field14079.put(byteBuffer);
            }
            this.Field14079.rewind();
            byteBuffer.reset();
        }
        this.Field14077 = class1926.Method76();
    }

    public String toString() {
        String string;
        StringBuilder stringBuilder = new StringBuilder().append("Framedata{ opcode:").append((Object)this.Method81()).append(", fin:").append(this.Method76()).append(", rsv1:").append(this.Method77()).append(", rsv2:").append(this.Method78()).append(", rsv3:").append(this.Method79()).append(", payload length:[pos:").append(this.Field14079.position()).append(", len:").append(this.Field14079.remaining()).append("], payload:");
        if (this.Field14079.remaining() > 1000) {
            string = "(too big to display)";
            return stringBuilder.append(string).append('}').toString();
        }
        string = new String(this.Field14079.array());
        return stringBuilder.append(string).append('}').toString();
    }

    public void Method85(ByteBuffer byteBuffer) {
        this.Field14079 = byteBuffer;
    }

    public void Method86(boolean bl) {
        this.Field14077 = bl;
    }

    public void Method87(boolean bl) {
        this.Field14081 = bl;
    }

    public void Method88(boolean bl) {
        this.Field14082 = bl;
    }

    public void Method89(boolean bl) {
        this.Field14083 = bl;
    }

    public void Method90(boolean bl) {
        this.Field14080 = bl;
    }

    public static Class1327 Method91(Class1753 class1753) {
        if (class1753 == null) {
            throw new IllegalArgumentException("Supplied opcode cannot be null");
        }
        switch (Class1350.Field14138[class1753.ordinal()]) {
            case 1: {
                return new Class1683();
            }
            case 2: {
                return new Class1252();
            }
            case 3: {
                return new Class213();
            }
            case 4: {
                return new Class1864();
            }
            case 5: {
                return new Class7();
            }
            case 6: {
                return new Class1462();
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
        Class1327 class1327 = (Class1327)object;
        if (this.Field14077 != class1327.Field14077) {
            return false;
        }
        if (this.Field14080 != class1327.Field14080) {
            return false;
        }
        if (this.Field14081 != class1327.Field14081) {
            return false;
        }
        if (this.Field14082 != class1327.Field14082) {
            return false;
        }
        if (this.Field14083 != class1327.Field14083) {
            return false;
        }
        if (this.Field14078 != class1327.Field14078) {
            return false;
        }
        if (this.Field14079 != null) {
            boolean bl = this.Field14079.equals(class1327.Field14079);
            return bl;
        }
        if (class1327.Field14079 != null) return false;
        return true;
    }

    public int hashCode() {
        int n = this.Field14077 ? 1 : 0;
        n = 31 * n + this.Field14078.hashCode();
        n = 31 * n + (this.Field14079 != null ? this.Field14079.hashCode() : 0);
        n = 31 * n + (this.Field14080 ? 1 : 0);
        n = 31 * n + (this.Field14081 ? 1 : 0);
        n = 31 * n + (this.Field14082 ? 1 : 0);
        return 31 * n + (this.Field14083 ? 1 : 0);
    }

    private static String Method92(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 205;
            cArray2[n] = (char)(cArray[n] ^ (0x5ACC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

