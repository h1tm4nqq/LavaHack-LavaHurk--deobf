/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import java.nio.ByteBuffer;
import lavahack.loader.Class1105;
import lavahack.loader.Class1679;
import lavahack.loader.Class1753;
import lavahack.loader.Class492;
import lavahack.loader.Class902;
import lavahack.loader.Class939;

public class Class7
extends Class1679 {
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

    public void Method93(int n) {
        this.Field7854 = n;
        if (n == 1015) {
            this.Field7854 = 1005;
            this.Field7855 = "";
        }
        this.Method98();
    }

    public void Method94(String string) {
        if (string == null) {
            string = "";
        }
        this.Field7855 = string;
        this.Method98();
    }

    public int Method95() {
        return this.Field7854;
    }

    public String Method96() {
        return this.Field7855;
    }

    @Override
    public String toString() {
        return super.toString() + "code: " + this.Field7854;
    }

    @Override
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
        if (this.Field7854 == 1006) throw new Class939("closecode must not be sent over the wire: " + this.Field7854);
        if (this.Field7854 == 1015) throw new Class939("closecode must not be sent over the wire: " + this.Field7854);
        if (this.Field7854 == 1005) throw new Class939("closecode must not be sent over the wire: " + this.Field7854);
        if (this.Field7854 > 4999) throw new Class939("closecode must not be sent over the wire: " + this.Field7854);
        if (this.Field7854 < 1000) throw new Class939("closecode must not be sent over the wire: " + this.Field7854);
        if (this.Field7854 != 1004) return;
        throw new Class939("closecode must not be sent over the wire: " + this.Field7854);
    }

    @Override
    public void Method85(ByteBuffer byteBuffer) {
        this.Field7854 = 1005;
        this.Field7855 = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.Field7854 = 1000;
            return;
        }
        if (byteBuffer.remaining() == 1) {
            this.Field7854 = 1002;
            return;
        }
        if (byteBuffer.remaining() >= 2) {
            ByteBuffer byteBuffer2 = ByteBuffer.allocate(4);
            byteBuffer2.position(2);
            byteBuffer2.putShort(byteBuffer.getShort());
            byteBuffer2.position(0);
            this.Field7854 = byteBuffer2.getInt();
        }
        byteBuffer.reset();
        int n = byteBuffer.position();
        this.Method97(byteBuffer, n);
    }

    private void Method97(ByteBuffer byteBuffer, int n) throws Class902 {
        byteBuffer.position(byteBuffer.position() + 2);
        this.Field7855 = Class1105.Method4530(byteBuffer);
        byteBuffer.position(n);
    }

    private void Method98() {
        byte[] byArray = Class1105.Method4525(this.Field7855);
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.Field7854);
        byteBuffer.position(2);
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(2 + byArray.length);
        byteBuffer2.put(byteBuffer);
        byteBuffer2.put(byArray);
        byteBuffer2.rewind();
        super.Method85(byteBuffer2);
    }

    @Override
    public ByteBuffer Method82() {
        if (this.Field7854 != 1005) return super.Method82();
        return Class492.Method2280();
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
        Class7 class7 = (Class7)object;
        if (this.Field7854 != class7.Field7854) {
            return false;
        }
        if (this.Field7855 != null) {
            boolean bl = this.Field7855.equals(class7.Field7855);
            return bl;
        }
        if (class7.Field7855 != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + this.Field7854;
        return 31 * n + (this.Field7855 != null ? this.Field7855.hashCode() : 0);
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

    private static String Method92(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 174;
            cArray2[n] = (char)(cArray[n] ^ (0x718A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

