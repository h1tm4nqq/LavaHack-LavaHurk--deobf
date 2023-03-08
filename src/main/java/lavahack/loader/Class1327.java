//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import java.nio.*;

public abstract class Class1327 implements Class1926
{
    private boolean Field14077;
    private Class1753 Field14078;
    private ByteBuffer Field14079;
    private boolean Field14080;
    private boolean Field14081;
    private boolean Field14082;
    private boolean Field14083;
    private String Field14084 = "TheKisDevs & LavaHack Development owns you";
    
    public abstract void Method84() throws Class902;
    
    public Class1327(final Class1753 field14078) {
        this.Field14078 = field14078;
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
    public void Method83(final Class1926 class1926) {
        final ByteBuffer method82 = class1926.Method82();
        if (this.Field14079 == null) {
            this.Field14079 = ByteBuffer.allocate(method82.remaining());
            method82.mark();
            this.Field14079.put(method82);
            method82.reset();
        }
        else {
            method82.mark();
            this.Field14079.position(this.Field14079.limit());
            this.Field14079.limit(this.Field14079.capacity());
            if (method82.remaining() > this.Field14079.remaining()) {
                final ByteBuffer allocate = ByteBuffer.allocate(method82.remaining() + this.Field14079.capacity());
                this.Field14079.flip();
                allocate.put(this.Field14079);
                allocate.put(method82);
                this.Field14079 = allocate;
            }
            else {
                this.Field14079.put(method82);
            }
            this.Field14079.rewind();
            method82.reset();
        }
        this.Field14077 = class1926.Method76();
    }
    
    @Override
    public String toString() {
        return "Framedata{ opcode:" + this.Method81() + ", fin:" + this.Method76() + ", rsv1:" + this.Method77() + ", rsv2:" + this.Method78() + ", rsv3:" + this.Method79() + ", payload length:[pos:" + this.Field14079.position() + ", len:" + this.Field14079.remaining() + "], payload:" + ((this.Field14079.remaining() > 1000) ? "(too big to display)" : new String(this.Field14079.array())) + '}';
    }
    
    public void Method85(final ByteBuffer field14079) {
        this.Field14079 = field14079;
    }
    
    public void Method86(final boolean field14077) {
        this.Field14077 = field14077;
    }
    
    public void Method87(final boolean field14081) {
        this.Field14081 = field14081;
    }
    
    public void Method88(final boolean field14082) {
        this.Field14082 = field14082;
    }
    
    public void Method89(final boolean field14083) {
        this.Field14083 = field14083;
    }
    
    public void Method90(final boolean field14080) {
        this.Field14080 = field14080;
    }
    
    public static Class1327 Method91(final Class1753 class1753) {
        if (class1753 == null) {
            throw new IllegalArgumentException("Supplied opcode cannot be null");
        }
        switch (Class1350.Field14138[class1753.ordinal()]) {
            case 1: {
                return new Class1683();
            }
            case 2: {
                return (Class1327)new Class1252();
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
            default: {
                throw new IllegalArgumentException("Supplied opcode is invalid");
            }
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final Class1327 class1327 = (Class1327)o;
        return this.Field14077 == class1327.Field14077 && this.Field14080 == class1327.Field14080 && this.Field14081 == class1327.Field14081 && this.Field14082 == class1327.Field14082 && this.Field14083 == class1327.Field14083 && this.Field14078 == class1327.Field14078 && ((this.Field14079 != null) ? this.Field14079.equals(class1327.Field14079) : (class1327.Field14079 == null));
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * (31 * (31 * (this.Field14077 ? 1 : 0) + this.Field14078.hashCode()) + ((this.Field14079 != null) ? this.Field14079.hashCode() : 0)) + (this.Field14080 ? 1 : 0)) + (this.Field14081 ? 1 : 0)) + (this.Field14082 ? 1 : 0)) + (this.Field14083 ? 1 : 0);
    }
    
    private static String Method92(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5ACC ^ 0xCD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
