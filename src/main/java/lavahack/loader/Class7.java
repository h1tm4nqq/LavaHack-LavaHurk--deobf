//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import java.nio.*;

public class Class7 extends Class1679
{
    public static final int Field7836;
    public static final int Field7837;
    public static final int Field7838;
    public static final int Field7839;
    public static final int Field7840;
    public static final int Field7841;
    public static final int Field7842;
    public static final int Field7843;
    public static final int Field7844;
    public static final int Field7845;
    public static final int Field7846;
    public static final int Field7847;
    public static final int Field7848;
    public static final int Field7849;
    public static final int Field7850;
    public static final int Field7851;
    public static final int Field7852;
    public static final int Field7853;
    private int Field7854;
    private String Field7855;
    private String Field7856 = "TheKisDevs & LavaHack Development owns you";
    
    public Class7() {
        super(Class1753.Field16038);
        this.Method94("");
        this.Method93(1000);
    }
    
    public void Method93(final int field7854) {
        this.Field7854 = field7854;
        if (field7854 == 1015) {
            this.Field7854 = 1005;
            this.Field7855 = "";
        }
        this.Method98();
    }
    
    public void Method94(String field7855) {
        if (field7855 == null) {
            field7855 = "";
        }
        this.Field7855 = field7855;
        this.Method98();
    }
    
    public int Method95() {
        return this.Field7854;
    }
    
    public String Method96() {
        return this.Field7855;
    }
    
    public String toString() {
        return super.toString() + "code: " + this.Field7854;
    }
    
    public void Method84() throws Class902 {
        super.Method84();
        if (this.Field7854 == 1007 && this.Field7855.isEmpty()) {
            throw new Class902(1007, "Received text is no valid utf8 string!");
        }
        if (this.Field7854 == 1005 && 0 < this.Field7855.length()) {
            throw new Class902(1002, "A close frame must have a closecode if it has a reason");
        }
        if (this.Field7854 > 1015 && this.Field7854 < 3000) {
            throw new Class902(1002, "Trying to send an illegal close code!");
        }
        if (this.Field7854 == 1006 || this.Field7854 == 1015 || this.Field7854 == 1005 || this.Field7854 > 4999 || this.Field7854 < 1000 || this.Field7854 == 1004) {
            throw new Class939("closecode must not be sent over the wire: " + this.Field7854);
        }
    }
    
    public void Method85(final ByteBuffer byteBuffer) {
        this.Field7854 = 1005;
        this.Field7855 = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.Field7854 = 1000;
        }
        else if (byteBuffer.remaining() == 1) {
            this.Field7854 = 1002;
        }
        else {
            if (byteBuffer.remaining() >= 2) {
                final ByteBuffer allocate = ByteBuffer.allocate(4);
                allocate.position(2);
                allocate.putShort(byteBuffer.getShort());
                allocate.position(0);
                this.Field7854 = allocate.getInt();
            }
            byteBuffer.reset();
            this.Method97(byteBuffer, byteBuffer.position());
        }
    }
    
    private void Method97(final ByteBuffer byteBuffer, final int n) throws Class902 {
        byteBuffer.position(byteBuffer.position() + 2);
        this.Field7855 = Class1105.Method4530(byteBuffer);
        byteBuffer.position(n);
    }
    
    private void Method98() {
        final byte[] method4525 = Class1105.Method4525(this.Field7855);
        final ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(this.Field7854);
        allocate.position(2);
        final ByteBuffer allocate2 = ByteBuffer.allocate(2 + method4525.length);
        allocate2.put(allocate);
        allocate2.put(method4525);
        allocate2.rewind();
        super.Method85(allocate2);
    }
    
    public ByteBuffer Method82() {
        if (this.Field7854 == 1005) {
            return Class492.Method2280();
        }
        return super.Method82();
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
        final Class7 class7 = (Class7)o;
        return this.Field7854 == class7.Field7854 && ((this.Field7855 != null) ? this.Field7855.equals(class7.Field7855) : (class7.Field7855 == null));
    }
    
    public int hashCode() {
        return 31 * (31 * super.hashCode() + this.Field7854) + ((this.Field7855 != null) ? this.Field7855.hashCode() : 0);
    }
    
    static {
        Field7853 = -3;
        Field7852 = -2;
        Field7851 = -1;
        Field7850 = 1015;
        Field7849 = 1014;
        Field7848 = 1013;
        Field7847 = 1012;
        Field7846 = 1011;
        Field7845 = 1010;
        Field7844 = 1009;
        Field7843 = 1008;
        Field7842 = 1007;
        Field7841 = 1006;
        Field7840 = 1005;
        Field7839 = 1003;
        Field7838 = 1002;
        Field7837 = 1001;
        Field7836 = 1000;
    }
    
    private static String Method92(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x718A ^ 0xAE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
