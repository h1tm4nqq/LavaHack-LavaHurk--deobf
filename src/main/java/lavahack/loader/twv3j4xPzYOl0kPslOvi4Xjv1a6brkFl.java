/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import java.nio.ByteBuffer;
import lavahack.loader.ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU;
import lavahack.loader.D2A33i4puy3VG87sLGopuKBa7759W0RD;
import lavahack.loader.MjqPPsIgrrFE8smKJhGdj08A51foRyqE;
import lavahack.loader.XbdjV0hZ7jYtQAOzyWjweTKHEH2QyutI;
import lavahack.loader.cZ4bypSRWV3YzaQMwmpKCiS4RsRbKd08;
import lavahack.loader.cfXsTmRX3i7ZkEX7R02s03MD6XEp5rqr;
import lavahack.loader.rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC;
import lavahack.loader.rOPHnAqIyTBxKFhFO4Zr2u1PEEPbBVYY;
import lavahack.loader.tO2OP6njCqBlYabOxVE9m4zETwpNmDUZ;
import lavahack.loader.twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl$1;
import lavahack.loader.vbUsByat2W2VqvGVC3VWwk5FtcMDE72H;

public abstract class twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl
implements vbUsByat2W2VqvGVC3VWwk5FtcMDE72H {
    private boolean Field14077;
    private D2A33i4puy3VG87sLGopuKBa7759W0RD Field14078;
    private ByteBuffer Field14079;
    private boolean Field14080;
    private boolean Field14081;
    private boolean Field14082;
    private boolean Field14083;
    private String Field14084 = "TheKisDevs & LavaHack Development owns you";

    public abstract void Method84() throws rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC;

    public twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl(D2A33i4puy3VG87sLGopuKBa7759W0RD d2A33i4puy3VG87sLGopuKBa7759W0RD) {
        this.Field14078 = d2A33i4puy3VG87sLGopuKBa7759W0RD;
        this.Field14079 = XbdjV0hZ7jYtQAOzyWjweTKHEH2QyutI.Method2280();
        this.Field14077 = (int)-735784202L ^ 0xD424D2F7;
        this.Field14080 = (int)1224199914L ^ 0x48F7CEEA;
        this.Field14081 = (int)((long)199966935 ^ (long)199966935);
        this.Field14082 = (int)((long)-243295889 ^ (long)-243295889);
        this.Field14083 = (int)((long)1574086372 ^ (long)1574086372);
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
    public D2A33i4puy3VG87sLGopuKBa7759W0RD Method81() {
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
    public void Method83(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2) {
        ByteBuffer byteBuffer = vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method82();
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
        this.Field14077 = vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method76();
    }

    public String toString() {
        String string;
        StringBuilder stringBuilder = new StringBuilder().append("Framedata{ opcode:").append((Object)this.Method81()).append(", fin:").append(this.Method76()).append(", rsv1:").append(this.Method77()).append(", rsv2:").append(this.Method78()).append(", rsv3:").append(this.Method79()).append(", payload length:[pos:").append(this.Field14079.position()).append(", len:").append(this.Field14079.remaining()).append("], payload:");
        if (this.Field14079.remaining() > ((int)-872579338L ^ 0xCBFD7E8B) << 3) {
            string = "(too big to display)";
            return stringBuilder.append(string).append((char)((int)953794131L ^ 0x38D9BE2E)).toString();
        }
        string = new String(this.Field14079.array());
        return stringBuilder.append(string).append((char)((int)953794131L ^ 0x38D9BE2E)).toString();
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

    public static twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl Method91(D2A33i4puy3VG87sLGopuKBa7759W0RD d2A33i4puy3VG87sLGopuKBa7759W0RD) {
        if (d2A33i4puy3VG87sLGopuKBa7759W0RD == null) {
            throw new IllegalArgumentException("Supplied opcode cannot be null");
        }
        switch (twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl$1.Field14138[d2A33i4puy3VG87sLGopuKBa7759W0RD.ordinal()]) {
            case 1: {
                return new cZ4bypSRWV3YzaQMwmpKCiS4RsRbKd08();
            }
            case 2: {
                return new ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU();
            }
            case 3: {
                return new tO2OP6njCqBlYabOxVE9m4zETwpNmDUZ();
            }
            case 4: {
                return new rOPHnAqIyTBxKFhFO4Zr2u1PEEPbBVYY();
            }
            case 5: {
                return new MjqPPsIgrrFE8smKJhGdj08A51foRyqE();
            }
            case 6: {
                return new cfXsTmRX3i7ZkEX7R02s03MD6XEp5rqr();
            }
        }
        throw new IllegalArgumentException("Supplied opcode is invalid");
    }

    public boolean equals(Object object) {
        int n;
        if (this == object) {
            return (int)((long)-887374326 ^ (long)-887374325) != 0;
        }
        if (object == null) return (int)((long)1960885218 ^ (long)1960885218) != 0;
        if (this.getClass() != object.getClass()) {
            return (int)((long)1960885218 ^ (long)1960885218) != 0;
        }
        twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2 = (twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl)object;
        if (this.Field14077 != twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Field14077) {
            return (int)((long)-1877265776 ^ (long)-1877265776) != 0;
        }
        if (this.Field14080 != twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Field14080) {
            return ((int)1594358944L ^ 0x5F07FCA0) != 0;
        }
        if (this.Field14081 != twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Field14081) {
            return ((int)-2100542522L ^ 0x82CC43C6) != 0;
        }
        if (this.Field14082 != twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Field14082) {
            return ((int)-1030884794L ^ 0xC28DF246) != 0;
        }
        if (this.Field14083 != twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Field14083) {
            return (int)((long)-1926183346 ^ (long)-1926183346) != 0;
        }
        if (this.Field14078 != twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Field14078) {
            return ((int)2110527407L ^ 0x7DCC17AF) != 0;
        }
        if (this.Field14079 != null) {
            n = this.Field14079.equals(twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Field14079);
            return n != 0;
        }
        if (twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Field14079 == null) {
            n = (int)((long)15593772 ^ (long)15593773);
            return n != 0;
        }
        n = (int)-238007810L ^ 0xF1D049FE;
        return n != 0;
    }

    public int hashCode() {
        int n = this.Field14077 ? (int)-1641801554L ^ 0x9E2418AF : (int)((long)-826873693 ^ (long)-826873693);
        n = ((int)-569130938L ^ 0xDE13C059) * n + this.Field14078.hashCode();
        n = ((int)348314196L ^ 0x14C2DA4B) * n + (this.Field14079 != null ? this.Field14079.hashCode() : (int)((long)1256640907 ^ (long)1256640907));
        n = ((int)1911543256L ^ 0x71EFD5C7) * n + (this.Field14080 ? (int)55523559L ^ 0x34F38E6 : (int)((long)-551084251 ^ (long)-551084251));
        n = ((int)-146045318L ^ 0xF74B8665) * n + (this.Field14081 ? (int)471366270L ^ 0x1C187A7F : (int)((long)-1636277104 ^ (long)-1636277104));
        n = ((int)1534098926L ^ 0x5B707DF1) * n + (this.Field14082 ? (int)((long)42806400 ^ (long)42806401) : (int)((long)-116069669 ^ (long)-116069669));
        return (int)((long)497032896 ^ (long)497032927) * n + (this.Field14083 ? (int)-1977740191L ^ 0x8A1E1460 : (int)((long)1157345187 ^ (long)1157345187));
    }

    private static String Method92(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1759968033L ^ 0x68E6FB21;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)19949274L ^ 0x1306625);
            int n2 = (int)929351918L ^ 0x3764C823;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1804575976 ^ (long)1804579419) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

