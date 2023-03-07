/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.nio.ByteBuffer;
import lavahack.client.EO7yi2sgQnEOS60nFFpUHqHVI7TIUHND;
import lavahack.client.GgPix2l2IhOV2YPNehltx3kYgn5Hae5d;
import lavahack.client.RSFg6dFLUSIvw4Aij2xt8JT5ga7mM6T6;
import lavahack.client.UnHOlZyC8x21HqgIfB7ZFiJbO6AiYH2y;
import lavahack.client.eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL;
import lavahack.client.ijTjUYtCZk3zmC6eymm538W8CzZfwpHE;
import lavahack.client.ikFh2tmmaEajuvVhfN5Stlzrrra2EacP$1;
import lavahack.client.kz9yBy5IcUjlF6qU5Go6qNMG7DtYXetX;
import lavahack.client.mPNKUHesROKSVtFpAZyhLqRAupt8dodO;
import lavahack.client.mS1YzPN2WkRcDNTD0pk5CFFQfS7K85mZ;
import lavahack.client.wVrpt4geN1bZiIzz3Cg8ao4ARNJY2Ej1;

public abstract class ikFh2tmmaEajuvVhfN5Stlzrrra2EacP
implements GgPix2l2IhOV2YPNehltx3kYgn5Hae5d {
    private boolean Field10050;
    private mPNKUHesROKSVtFpAZyhLqRAupt8dodO Field10051;
    private ByteBuffer Field10052;
    private boolean Field10053;
    private boolean Field10054;
    private boolean Field10055;
    private boolean Field10056;
    private String Field10057 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public abstract void Method1620() throws eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL;

    public ikFh2tmmaEajuvVhfN5Stlzrrra2EacP(mPNKUHesROKSVtFpAZyhLqRAupt8dodO mPNKUHesROKSVtFpAZyhLqRAupt8dodO2) {
        this.Field10051 = mPNKUHesROKSVtFpAZyhLqRAupt8dodO2;
        this.Field10052 = mS1YzPN2WkRcDNTD0pk5CFFQfS7K85mZ.Method6269();
        this.Field10050 = (int)((long)-644299249 ^ (long)-644299250);
        this.Field10053 = (int)((long)1424642868 ^ (long)1424642868);
        this.Field10054 = (int)((long)-959358832 ^ (long)-959358832);
        this.Field10055 = (int)((long)-832255819 ^ (long)-832255819);
        this.Field10056 = (int)((long)-399771947 ^ (long)-399771947);
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
    public mPNKUHesROKSVtFpAZyhLqRAupt8dodO Method1617() {
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
    public void Method1619(GgPix2l2IhOV2YPNehltx3kYgn5Hae5d ggPix2l2IhOV2YPNehltx3kYgn5Hae5d) {
        ByteBuffer byteBuffer = ggPix2l2IhOV2YPNehltx3kYgn5Hae5d.Method1618();
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
        this.Field10050 = ggPix2l2IhOV2YPNehltx3kYgn5Hae5d.Method1612();
    }

    public String toString() {
        String string;
        StringBuilder stringBuilder = new StringBuilder().append("Framedata{ opcode:").append((Object)this.Method1617()).append(", fin:").append(this.Method1612()).append(", rsv1:").append(this.Method1613()).append(", rsv2:").append(this.Method1614()).append(", rsv3:").append(this.Method1615()).append(", payload length:[pos:").append(this.Field10052.position()).append(", len:").append(this.Field10052.remaining()).append("], payload:");
        if (this.Field10052.remaining() > (int)((long)-1583015867 ^ (long)-1583015880) << 3) {
            string = "(too big to display)";
            return stringBuilder.append(string).append((char)((long)-1551595830 ^ (long)-1551595849)).toString();
        }
        string = new String(this.Field10052.array());
        return stringBuilder.append(string).append((char)((long)-1551595830 ^ (long)-1551595849)).toString();
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

    public static ikFh2tmmaEajuvVhfN5Stlzrrra2EacP Method1627(mPNKUHesROKSVtFpAZyhLqRAupt8dodO mPNKUHesROKSVtFpAZyhLqRAupt8dodO2) {
        if (mPNKUHesROKSVtFpAZyhLqRAupt8dodO2 == null) {
            throw new IllegalArgumentException("Supplied opcode cannot be null");
        }
        switch (ikFh2tmmaEajuvVhfN5Stlzrrra2EacP$1.Field12521[mPNKUHesROKSVtFpAZyhLqRAupt8dodO2.ordinal()]) {
            case 1: {
                return new wVrpt4geN1bZiIzz3Cg8ao4ARNJY2Ej1();
            }
            case 2: {
                return new EO7yi2sgQnEOS60nFFpUHqHVI7TIUHND();
            }
            case 3: {
                return new RSFg6dFLUSIvw4Aij2xt8JT5ga7mM6T6();
            }
            case 4: {
                return new UnHOlZyC8x21HqgIfB7ZFiJbO6AiYH2y();
            }
            case 5: {
                return new kz9yBy5IcUjlF6qU5Go6qNMG7DtYXetX();
            }
            case 6: {
                return new ijTjUYtCZk3zmC6eymm538W8CzZfwpHE();
            }
        }
        throw new IllegalArgumentException("Supplied opcode is invalid");
    }

    public boolean equals(Object object) {
        int n;
        if (this == object) {
            return ((int)-1531362219L ^ 0xA4B94454) != 0;
        }
        if (object == null) return ((int)-1088056607L ^ 0xBF2592E1) != 0;
        if (this.getClass() != object.getClass()) {
            return ((int)-1088056607L ^ 0xBF2592E1) != 0;
        }
        ikFh2tmmaEajuvVhfN5Stlzrrra2EacP ikFh2tmmaEajuvVhfN5Stlzrrra2EacP2 = (ikFh2tmmaEajuvVhfN5Stlzrrra2EacP)object;
        if (this.Field10050 != ikFh2tmmaEajuvVhfN5Stlzrrra2EacP2.Field10050) {
            return (int)((long)-710422718 ^ (long)-710422718) != 0;
        }
        if (this.Field10053 != ikFh2tmmaEajuvVhfN5Stlzrrra2EacP2.Field10053) {
            return (int)((long)2137711881 ^ (long)2137711881) != 0;
        }
        if (this.Field10054 != ikFh2tmmaEajuvVhfN5Stlzrrra2EacP2.Field10054) {
            return ((int)-322379079L ^ 0xECC8E2B9) != 0;
        }
        if (this.Field10055 != ikFh2tmmaEajuvVhfN5Stlzrrra2EacP2.Field10055) {
            return ((int)-874086991L ^ 0xCBE67DB1) != 0;
        }
        if (this.Field10056 != ikFh2tmmaEajuvVhfN5Stlzrrra2EacP2.Field10056) {
            return ((int)1259154421L ^ 0x4B0D2BF5) != 0;
        }
        if (this.Field10051 != ikFh2tmmaEajuvVhfN5Stlzrrra2EacP2.Field10051) {
            return (int)((long)-869243473 ^ (long)-869243473) != 0;
        }
        if (this.Field10052 != null) {
            n = this.Field10052.equals(ikFh2tmmaEajuvVhfN5Stlzrrra2EacP2.Field10052);
            return n != 0;
        }
        if (ikFh2tmmaEajuvVhfN5Stlzrrra2EacP2.Field10052 == null) {
            n = (int)((long)-239487255 ^ (long)-239487256);
            return n != 0;
        }
        n = (int)((long)-2123409307 ^ (long)-2123409307);
        return n != 0;
    }

    public int hashCode() {
        int n = this.Field10050 ? (int)-649825447L ^ 0xD9447358 : (int)((long)-1972113123 ^ (long)-1972113123);
        n = (int)((long)-609328010 ^ (long)-609328023) * n + this.Field10051.hashCode();
        n = (int)((long)-2059258213 ^ (long)-2059258236) * n + (this.Field10052 != null ? this.Field10052.hashCode() : (int)210012618L ^ 0xC8489CA);
        n = ((int)1192910281L ^ 0x471A5DD6) * n + (this.Field10053 ? (int)((long)-226287005 ^ (long)-226287006) : (int)501394067L ^ 0x1DE2AA93);
        n = (int)((long)-63907431 ^ (long)-63907450) * n + (this.Field10054 ? (int)457194584L ^ 0x1B403C59 : (int)-1481112294L ^ 0xA7B8051A);
        n = ((int)862625533L ^ 0x336A9EE2) * n + (this.Field10055 ? (int)((long)1879334921 ^ (long)1879334920) : (int)999082679L ^ 0x3B8CCAB7);
        return ((int)-1251766888L ^ 0xB5638D87) * n + (this.Field10056 ? (int)-957370544L ^ 0xC6EFAF51 : (int)((long)-1582190293 ^ (long)-1582190293));
    }

    private static String Method1628(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1236476461L ^ 0xB64CDDD3;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1699159563L ^ 0x65471EF4);
            int n2 = ((int)-103760908L ^ 0xF9D0BBB1) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)399307538 ^ (long)399295743) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

