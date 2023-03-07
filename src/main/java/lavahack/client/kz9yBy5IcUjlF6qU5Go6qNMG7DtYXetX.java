/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.nio.ByteBuffer;
import lavahack.client.IMlppUDpZQ26r9KWqHfvhtVaFArUHbNP;
import lavahack.client.eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL;
import lavahack.client.k6qfAI2dl0YQZ6l1TQGutG7w1UXZhj58;
import lavahack.client.mPNKUHesROKSVtFpAZyhLqRAupt8dodO;
import lavahack.client.mS1YzPN2WkRcDNTD0pk5CFFQfS7K85mZ;
import lavahack.client.pfsG8JbTXjnFvZbRhJLzfGBjgbBi78oW;

public class kz9yBy5IcUjlF6qU5Go6qNMG7DtYXetX
extends pfsG8JbTXjnFvZbRhJLzfGBjgbBi78oW {
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

    public kz9yBy5IcUjlF6qU5Go6qNMG7DtYXetX() {
        super(mPNKUHesROKSVtFpAZyhLqRAupt8dodO.Field11931);
        this.Method3963("");
        this.Method3962(((int)-652211229L ^ 0xD9200B9E) << 3);
    }

    public void Method3962(int n) {
        this.Field12140 = n;
        if (n == ((int)1045140175L ^ 0x3E4B9138)) {
            this.Field12140 = (int)991904686L ^ 0x3B1F4043;
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
    public void Method1620() throws eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL {
        super.Method1620();
        if (this.Field12140 == ((int)-2051737954L ^ 0x85B4F571) && this.Field12141.isEmpty()) {
            throw new eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL((int)((long)1987614814 ^ (long)1987615665), "Received text is no valid utf8 string!");
        }
        if (this.Field12140 == ((int)639965424L ^ 0x26251B1D) && (int)((long)2146271065 ^ (long)2146271065) < this.Field12141.length()) {
            throw new eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL((int)((long)-2034843614 ^ (long)-2034843177) << 1, "A close frame must have a closecode if it has a reason");
        }
        if (this.Field12140 > ((int)-363521529L ^ 0xEA5519F0) && this.Field12140 < ((int)546485880L ^ 0x2092B70F) << 3) {
            throw new eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL((int)((long)-273403806 ^ (long)-273403497) << 1, "Trying to send an illegal close code!");
        }
        if (this.Field12140 == (int)((long)222050431 ^ (long)222050696) << 1) throw new IMlppUDpZQ26r9KWqHfvhtVaFArUHbNP("closecode must not be sent over the wire: " + this.Field12140);
        if (this.Field12140 == (int)((long)-263968935 ^ (long)-263969618)) throw new IMlppUDpZQ26r9KWqHfvhtVaFArUHbNP("closecode must not be sent over the wire: " + this.Field12140);
        if (this.Field12140 == (int)((long)513109261 ^ (long)513109728)) throw new IMlppUDpZQ26r9KWqHfvhtVaFArUHbNP("closecode must not be sent over the wire: " + this.Field12140);
        if (this.Field12140 > ((int)1174025760L ^ 0x45FA25A7)) throw new IMlppUDpZQ26r9KWqHfvhtVaFArUHbNP("closecode must not be sent over the wire: " + this.Field12140);
        if (this.Field12140 < (int)((long)171675685 ^ (long)171675736) << 3) throw new IMlppUDpZQ26r9KWqHfvhtVaFArUHbNP("closecode must not be sent over the wire: " + this.Field12140);
        if (this.Field12140 != (int)((long)278901612 ^ (long)278901655) << 2) return;
        throw new IMlppUDpZQ26r9KWqHfvhtVaFArUHbNP("closecode must not be sent over the wire: " + this.Field12140);
    }

    @Override
    public void Method1621(ByteBuffer byteBuffer) {
        this.Field12140 = (int)((long)1934348469 ^ (long)1934349144);
        this.Field12141 = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.Field12140 = ((int)-795339223L ^ 0xD0981654) << 3;
            return;
        }
        if (byteBuffer.remaining() == (int)((long)685891295 ^ (long)685891294)) {
            this.Field12140 = ((int)1472723517L ^ 0x57C7FBC8) << 1;
            return;
        }
        if (byteBuffer.remaining() >= (int)((long)1875356216 ^ (long)1875356217) << 1) {
            ByteBuffer byteBuffer2 = ByteBuffer.allocate((int)((long)-1979253089 ^ (long)-1979253090) << 2);
            byteBuffer2.position((int)((long)-1609937631 ^ (long)-1609937632) << 1);
            byteBuffer2.putShort(byteBuffer.getShort());
            byteBuffer2.position((int)((long)-1719033586 ^ (long)-1719033586));
            this.Field12140 = byteBuffer2.getInt();
        }
        byteBuffer.reset();
        int n = byteBuffer.position();
        this.Method3966(byteBuffer, n);
    }

    private void Method3966(ByteBuffer byteBuffer, int n) throws eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL {
        byteBuffer.position(byteBuffer.position() + (((int)-97568186L ^ 0xFA2F3A47) << 1));
        this.Field12141 = k6qfAI2dl0YQZ6l1TQGutG7w1UXZhj58.Method1099(byteBuffer);
        byteBuffer.position(n);
    }

    private void Method3967() {
        byte[] byArray = k6qfAI2dl0YQZ6l1TQGutG7w1UXZhj58.Method1094(this.Field12141);
        ByteBuffer byteBuffer = ByteBuffer.allocate(((int)474245861L ^ 0x1C446AE4) << 2);
        byteBuffer.putInt(this.Field12140);
        byteBuffer.position(((int)1329095215L ^ 0x4F38622E) << 1);
        ByteBuffer byteBuffer2 = ByteBuffer.allocate((((int)-1275362537L ^ 0xB3FB8316) << 1) + byArray.length);
        byteBuffer2.put(byteBuffer);
        byteBuffer2.put(byArray);
        byteBuffer2.rewind();
        super.Method1621(byteBuffer2);
    }

    @Override
    public ByteBuffer Method1618() {
        if (this.Field12140 != ((int)214716822L ^ 0xCCC527B)) return super.Method1618();
        return mS1YzPN2WkRcDNTD0pk5CFFQfS7K85mZ.Method6269();
    }

    @Override
    public boolean equals(Object object) {
        int n;
        if (this == object) {
            return (int)((long)1776907393 ^ (long)1776907392) != 0;
        }
        if (object == null) return ((int)-1492189997L ^ 0xA70EFCD3) != 0;
        if (this.getClass() != object.getClass()) {
            return ((int)-1492189997L ^ 0xA70EFCD3) != 0;
        }
        if (!super.equals(object)) {
            return (int)((long)-463634924 ^ (long)-463634924) != 0;
        }
        kz9yBy5IcUjlF6qU5Go6qNMG7DtYXetX kz9yBy5IcUjlF6qU5Go6qNMG7DtYXetX2 = (kz9yBy5IcUjlF6qU5Go6qNMG7DtYXetX)object;
        if (this.Field12140 != kz9yBy5IcUjlF6qU5Go6qNMG7DtYXetX2.Field12140) {
            return ((int)-2060164366L ^ 0x853462F2) != 0;
        }
        if (this.Field12141 != null) {
            n = this.Field12141.equals(kz9yBy5IcUjlF6qU5Go6qNMG7DtYXetX2.Field12141);
            return n != 0;
        }
        if (kz9yBy5IcUjlF6qU5Go6qNMG7DtYXetX2.Field12141 == null) {
            n = (int)-175118086L ^ 0xF58FE8FB;
            return n != 0;
        }
        n = (int)-1446920270L ^ 0xA9C1BFB2;
        return n != 0;
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = (int)((long)-1910926481 ^ (long)-1910926480) * n + this.Field12140;
        return (int)((long)-1201097828 ^ (long)-1201097853) * n + (this.Field12141 != null ? this.Field12141.hashCode() : (int)-883018787L ^ 0xCB5E33DD);
    }

    static {
        Field12139 = (int)-945250832L ^ 0x3857620D;
        Field12138 = (int)((long)400228656 ^ (long)-400228658);
        Field12137 = (int)158392341L ^ 0xF68F1FEA;
        Field12136 = (int)-370347556L ^ 0xE9ECF22B;
        Field12135 = (int)((long)1990447614 ^ (long)1990447109) << 1;
        Field12134 = (int)((long)53565489 ^ (long)53566404);
        Field12133 = ((int)2016143357L ^ 0x782BE700) << 2;
        Field12132 = (int)-697046696L ^ 0xD673EAAB;
        Field12131 = (int)((long)916480649 ^ (long)916480880) << 1;
        Field12130 = (int)1188640692L ^ 0x46D93445;
        Field12129 = (int)((long)847494748 ^ (long)847494755) << 4;
        Field12128 = (int)((long)472491030 ^ (long)472492025);
        Field12127 = ((int)2076866961L ^ 0x7BCA7866) << 1;
        Field12126 = (int)((long)-1502182645 ^ (long)-1502183194);
        Field12125 = (int)((long)-190162071 ^ (long)-190162814);
        Field12124 = (int)((long)-371138096 ^ (long)-371138523) << 1;
        Field12123 = (int)((long)1743900261 ^ (long)1743900044);
        Field12122 = (int)((long)-512215297 ^ (long)-512215422) << 3;
    }

    private static String Method1628(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)914973750 ^ (long)914973750);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)975132812 ^ (long)975132787);
            int n2 = (int)((long)-609861328 ^ (long)-609861373);
            cArray2[n] = (char)(cArray[n] ^ ((int)1760989893L ^ 0x68F6B0FC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

