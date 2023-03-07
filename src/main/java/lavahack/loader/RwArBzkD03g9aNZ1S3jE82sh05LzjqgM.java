/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import lavahack.loader.cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9;
import lavahack.loader.rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC;
import lavahack.loader.vbUsByat2W2VqvGVC3VWwk5FtcMDE72H;
import lavahack.loader.vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK;

public class RwArBzkD03g9aNZ1S3jE82sh05LzjqgM
implements vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK {
    private int Field15928;

    @Override
    public void Method6571(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2) throws rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC {
    }

    @Override
    public void Method6572(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2) {
    }

    @Override
    public boolean Method6573(String string) {
        return ((int)-1604247060L ^ 0xA06121ED) != 0;
    }

    @Override
    public boolean Method6574(String string) {
        return ((int)1397051761L ^ 0x53455170) != 0;
    }

    @Override
    public void Method6575(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2) throws rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC {
        if (vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method77()) throw new cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9("bad rsv RSV1: " + vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method77() + " RSV2: " + vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method78() + " RSV3: " + vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method79());
        if (vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method78()) throw new cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9("bad rsv RSV1: " + vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method77() + " RSV2: " + vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method78() + " RSV3: " + vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method79());
        if (!vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method79()) return;
        throw new cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9("bad rsv RSV1: " + vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method77() + " RSV2: " + vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method78() + " RSV3: " + vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method79());
    }

    @Override
    public String Method6576() {
        return "";
    }

    @Override
    public String Method6577() {
        return "";
    }

    @Override
    public vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK Method6578() {
        return new RwArBzkD03g9aNZ1S3jE82sh05LzjqgM();
    }

    @Override
    public void Method6579() {
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    public int hashCode() {
        return this.getClass().hashCode();
    }

    public boolean equals(Object object) {
        boolean bl;
        if (this == object || object != null && this.getClass() == object.getClass()) {
            bl = (int)-971948610L ^ 0xC6113DBF;
            return bl;
        }
        bl = (int)-910378589L ^ 0xC9BCB9A3;
        return bl;
    }

    private static String Method6597(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1479487748L ^ 0xA7D0CEFC;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)2036733270 ^ (long)2036733353);
            int n2 = (int)1055515439L ^ 0x3EE9E390;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1770027105 ^ (long)1770024744) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

