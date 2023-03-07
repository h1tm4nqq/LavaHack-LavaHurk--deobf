/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import java.nio.ByteBuffer;
import lavahack.loader.D2A33i4puy3VG87sLGopuKBa7759W0RD;
import lavahack.loader.XbdjV0hZ7jYtQAOzyWjweTKHEH2QyutI;
import lavahack.loader.cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9;
import lavahack.loader.eVUYg1GWgiUOrS8NdVHqZkr5dmjNAgoA;
import lavahack.loader.rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC;
import lavahack.loader.wfvlmGcrJ5jyY54Dj5cZA2ucJ3pFMwQ8;

public class MjqPPsIgrrFE8smKJhGdj08A51foRyqE
extends wfvlmGcrJ5jyY54Dj5cZA2ucJ3pFMwQ8 {
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

    public MjqPPsIgrrFE8smKJhGdj08A51foRyqE() {
        super(D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16038);
        this.Method94("");
        this.Method93((int)((long)656412083 ^ (long)656412110) << 3);
    }

    public void Method93(int n) {
        this.Field7854 = n;
        if (n == (int)((long)-1678642652 ^ (long)-1678642733)) {
            this.Field7854 = (int)-394527686L ^ 0xE87BFFD7;
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
    public void Method84() throws rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC {
        super.Method84();
        if (this.Field7854 == (int)((long)213190109 ^ (long)213190194) && this.Field7855.isEmpty()) {
            throw new rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC((int)((long)904338046 ^ (long)904337809), "Received text is no valid utf8 string!");
        }
        if (this.Field7854 == (int)((long)-1005936259 ^ (long)-1005935984) && ((int)-1662978393L ^ 0x9CE0F6A7) < this.Field7855.length()) {
            throw new rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC(((int)-86503444L ^ 0xFAD80E19) << 1, "A close frame must have a closecode if it has a reason");
        }
        if (this.Field7854 > (int)((long)-772797696 ^ (long)-772798217) && this.Field7854 < (int)((long)30739973 ^ (long)30740338) << 3) {
            throw new rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC(((int)-1222704261L ^ 0xB71F028E) << 1, "Trying to send an illegal close code!");
        }
        if (this.Field7854 == (int)((long)1008606882 ^ (long)1008607061) << 1) throw new cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9("closecode must not be sent over the wire: " + this.Field7854);
        if (this.Field7854 == ((int)-577348323L ^ 0xDD965EEA)) throw new cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9("closecode must not be sent over the wire: " + this.Field7854);
        if (this.Field7854 == ((int)663825751L ^ 0x27912EBA)) throw new cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9("closecode must not be sent over the wire: " + this.Field7854);
        if (this.Field7854 > ((int)-2120912068L ^ 0x819560BB)) throw new cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9("closecode must not be sent over the wire: " + this.Field7854);
        if (this.Field7854 < (int)((long)874796443 ^ (long)874796518) << 3) throw new cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9("closecode must not be sent over the wire: " + this.Field7854);
        if (this.Field7854 != (int)((long)896342381 ^ (long)896342422) << 2) return;
        throw new cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9("closecode must not be sent over the wire: " + this.Field7854);
    }

    @Override
    public void Method85(ByteBuffer byteBuffer) {
        this.Field7854 = (int)((long)718461532 ^ (long)718461361);
        this.Field7855 = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.Field7854 = (int)((long)-1564370925 ^ (long)-1564370834) << 3;
            return;
        }
        if (byteBuffer.remaining() == ((int)719326832L ^ 0x2AE00E71)) {
            this.Field7854 = ((int)899130904L ^ 0x3597A7ED) << 1;
            return;
        }
        if (byteBuffer.remaining() >= (int)((long)641509288 ^ (long)641509289) << 1) {
            ByteBuffer byteBuffer2 = ByteBuffer.allocate(((int)-1259591241L ^ 0xB4EC29B6) << 2);
            byteBuffer2.position(((int)157526585L ^ 0x963AA38) << 1);
            byteBuffer2.putShort(byteBuffer.getShort());
            byteBuffer2.position((int)1460815995L ^ 0x5712487B);
            this.Field7854 = byteBuffer2.getInt();
        }
        byteBuffer.reset();
        int n = byteBuffer.position();
        this.Method97(byteBuffer, n);
    }

    private void Method97(ByteBuffer byteBuffer, int n) throws rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC {
        byteBuffer.position(byteBuffer.position() + (((int)440473921L ^ 0x1A411940) << 1));
        this.Field7855 = eVUYg1GWgiUOrS8NdVHqZkr5dmjNAgoA.Method4530(byteBuffer);
        byteBuffer.position(n);
    }

    private void Method98() {
        byte[] byArray = eVUYg1GWgiUOrS8NdVHqZkr5dmjNAgoA.Method4525(this.Field7855);
        ByteBuffer byteBuffer = ByteBuffer.allocate(((int)-1751463371L ^ 0x979ACA34) << 2);
        byteBuffer.putInt(this.Field7854);
        byteBuffer.position((int)((long)145524668 ^ (long)145524669) << 1);
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(((int)((long)456129846 ^ (long)456129847) << 1) + byArray.length);
        byteBuffer2.put(byteBuffer);
        byteBuffer2.put(byArray);
        byteBuffer2.rewind();
        super.Method85(byteBuffer2);
    }

    @Override
    public ByteBuffer Method82() {
        if (this.Field7854 != (int)((long)-1176307419 ^ (long)-1176307000)) return super.Method82();
        return XbdjV0hZ7jYtQAOzyWjweTKHEH2QyutI.Method2280();
    }

    @Override
    public boolean equals(Object object) {
        int n;
        if (this == object) {
            return (int)((long)1932887407 ^ (long)1932887406) != 0;
        }
        if (object == null) return (int)((long)257806276 ^ (long)257806276) != 0;
        if (this.getClass() != object.getClass()) {
            return (int)((long)257806276 ^ (long)257806276) != 0;
        }
        if (!super.equals(object)) {
            return ((int)1243387888L ^ 0x4A1C97F0) != 0;
        }
        MjqPPsIgrrFE8smKJhGdj08A51foRyqE mjqPPsIgrrFE8smKJhGdj08A51foRyqE = (MjqPPsIgrrFE8smKJhGdj08A51foRyqE)object;
        if (this.Field7854 != mjqPPsIgrrFE8smKJhGdj08A51foRyqE.Field7854) {
            return (int)((long)-1835920424 ^ (long)-1835920424) != 0;
        }
        if (this.Field7855 != null) {
            n = this.Field7855.equals(mjqPPsIgrrFE8smKJhGdj08A51foRyqE.Field7855);
            return n != 0;
        }
        if (mjqPPsIgrrFE8smKJhGdj08A51foRyqE.Field7855 == null) {
            n = (int)((long)-1258794139 ^ (long)-1258794140);
            return n != 0;
        }
        n = (int)((long)-1417733163 ^ (long)-1417733163);
        return n != 0;
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = (int)((long)-1987302632 ^ (long)-1987302649) * n + this.Field7854;
        return (int)((long)-613437567 ^ (long)-613437538) * n + (this.Field7855 != null ? this.Field7855.hashCode() : (int)((long)240900339 ^ (long)240900339));
    }

    static {
        Field7853 = (int)-1279784825L ^ 0x4C47F77A;
        Field7852 = (int)((long)-1236115053 ^ (long)1236115053);
        Field7851 = (int)1404548462L ^ 0xAC484A91;
        Field7850 = (int)869402753L ^ 0x33D20B76;
        Field7849 = (int)((long)-184812087 ^ (long)-184812494) << 1;
        Field7848 = (int)((long)1192362890 ^ (long)1192362111);
        Field7847 = (int)((long)-661449649 ^ (long)-661449550) << 2;
        Field7846 = (int)-1425681350L ^ 0xAB05D7C9;
        Field7845 = ((int)503257667L ^ 0x1DFF1BBA) << 1;
        Field7844 = (int)((long)-790248808 ^ (long)-790249111);
        Field7843 = ((int)-1502379427L ^ 0xA6738262) << 4;
        Field7842 = (int)((long)1621742177 ^ (long)1621741966);
        Field7841 = ((int)-894082691L ^ 0xCAB5608A) << 1;
        Field7840 = (int)((long)279879738 ^ (long)279880663);
        Field7839 = (int)((long)1288571319 ^ (long)1288571484);
        Field7838 = ((int)-583144777L ^ 0xDD3DEB42) << 1;
        Field7837 = (int)((long)-324777473 ^ (long)-324777450);
        Field7836 = (int)((long)1325318235 ^ (long)1325318182) << 3;
    }

    private static String Method92(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-315517775L ^ 0xED3194B1;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-954433758 ^ (long)-954433571);
            int n2 = (int)((long)353415222 ^ (long)353415265) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)718603041 ^ (long)718617572) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

