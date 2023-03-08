//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.nio.*;

public abstract class Class494 implements Class1260
{
    private boolean Field10050;
    private Class927 Field10051;
    private ByteBuffer Field10052;
    private boolean Field10053;
    private boolean Field10054;
    private boolean Field10055;
    private boolean Field10056;
    private String Field10057 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public abstract void Method1620() throws Class23;
    
    public Class494(final Class927 field10051) {
        this.Field10051 = field10051;
        this.Field10052 = Class1606.Method6269();
        this.Field10050 = true;
        this.Field10053 = false;
        this.Field10054 = false;
        this.Field10055 = false;
        this.Field10056 = false;
    }
    
    public boolean Method1613() {
        return this.Field10054;
    }
    
    public boolean Method1614() {
        return this.Field10055;
    }
    
    public boolean Method1615() {
        return this.Field10056;
    }
    
    public boolean Method1612() {
        return this.Field10050;
    }
    
    public Class927 Method1617() {
        return this.Field10051;
    }
    
    public boolean Method1616() {
        return this.Field10053;
    }
    
    public ByteBuffer Method1618() {
        return this.Field10052;
    }
    
    public void Method1619(final Class1260 class1260) {
        final ByteBuffer method1618 = class1260.Method1618();
        if (this.Field10052 == null) {
            this.Field10052 = ByteBuffer.allocate(method1618.remaining());
            method1618.mark();
            this.Field10052.put(method1618);
            method1618.reset();
        }
        else {
            method1618.mark();
            this.Field10052.position(this.Field10052.limit());
            this.Field10052.limit(this.Field10052.capacity());
            if (method1618.remaining() > this.Field10052.remaining()) {
                final ByteBuffer allocate = ByteBuffer.allocate(method1618.remaining() + this.Field10052.capacity());
                this.Field10052.flip();
                allocate.put(this.Field10052);
                allocate.put(method1618);
                this.Field10052 = allocate;
            }
            else {
                this.Field10052.put(method1618);
            }
            this.Field10052.rewind();
            method1618.reset();
        }
        this.Field10050 = class1260.Method1612();
    }
    
    @Override
    public String toString() {
        return "Framedata{ opcode:" + this.Method1617() + ", fin:" + this.Method1612() + ", rsv1:" + this.Method1613() + ", rsv2:" + this.Method1614() + ", rsv3:" + this.Method1615() + ", payload length:[pos:" + this.Field10052.position() + ", len:" + this.Field10052.remaining() + "], payload:" + ((this.Field10052.remaining() > 1000) ? "(too big to display)" : new String(this.Field10052.array())) + '}';
    }
    
    public void Method1621(final ByteBuffer field10052) {
        this.Field10052 = field10052;
    }
    
    public void Method1622(final boolean field10050) {
        this.Field10050 = field10050;
    }
    
    public void Method1623(final boolean field10054) {
        this.Field10054 = field10054;
    }
    
    public void Method1624(final boolean field10055) {
        this.Field10055 = field10055;
    }
    
    public void Method1625(final boolean field10056) {
        this.Field10056 = field10056;
    }
    
    public void Method1626(final boolean field10053) {
        this.Field10053 = field10053;
    }
    
    public static Class494 Method1627(final Class927 class927) {
        if (class927 == null) {
            throw new IllegalArgumentException("Supplied opcode cannot be null");
        }
        switch (Class1030.Field12521[class927.ordinal()]) {
            case 1: {
                return (Class494)new Class1418();
            }
            case 2: {
                return (Class494)new Class319();
            }
            case 3: {
                return (Class494)new Class370();
            }
            case 4: {
                return (Class494)new Class1275();
            }
            case 5: {
                return new Class966();
            }
            case 6: {
                return (Class494)new Class1749();
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
        final Class494 class494 = (Class494)o;
        return this.Field10050 == class494.Field10050 && this.Field10053 == class494.Field10053 && this.Field10054 == class494.Field10054 && this.Field10055 == class494.Field10055 && this.Field10056 == class494.Field10056 && this.Field10051 == class494.Field10051 && ((this.Field10052 != null) ? this.Field10052.equals(class494.Field10052) : (class494.Field10052 == null));
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * (31 * (31 * (this.Field10050 ? 1 : 0) + this.Field10051.hashCode()) + ((this.Field10052 != null) ? this.Field10052.hashCode() : 0)) + (this.Field10053 ? 1 : 0)) + (this.Field10054 ? 1 : 0)) + (this.Field10055 ? 1 : 0)) + (this.Field10056 ? 1 : 0);
    }
    
    private static String Method1628(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6FDA ^ 0x8A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
