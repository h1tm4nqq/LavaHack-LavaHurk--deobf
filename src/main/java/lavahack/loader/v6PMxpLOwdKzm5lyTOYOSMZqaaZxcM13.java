/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import lavahack.loader.BrWsHdiLAwYGSB35z3ypQAx8eRulUOBh;
import lavahack.loader.D2A33i4puy3VG87sLGopuKBa7759W0RD;
import lavahack.loader.ERDZZaC7E7qEsEwC2UFlE3xI88227PAM;
import lavahack.loader.PDe8wUioaRupOBTjFWgfiViCqtqJbEVR;
import lavahack.loader.QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR;
import lavahack.loader.VxtGBIxlzwZB81UrEE9PRzCsi9pMS1Ao;
import lavahack.loader.bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5;
import lavahack.loader.cfXsTmRX3i7ZkEX7R02s03MD6XEp5rqr;
import lavahack.loader.eVUYg1GWgiUOrS8NdVHqZkr5dmjNAgoA;
import lavahack.loader.fTSdQpXXUsy7b26dtudQpgyKwlcDU58e;
import lavahack.loader.g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh;
import lavahack.loader.l6yKOMt7SVcyIzts9W2dZyllrA36dUBL;
import lavahack.loader.lDgX8dul2aWNBQmCTcuuerubKmsg9XQq;
import lavahack.loader.pkFsFgiZykGBET8wx0XXygS5258qy2Bd;
import lavahack.loader.rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC;
import lavahack.loader.rOPHnAqIyTBxKFhFO4Zr2u1PEEPbBVYY;
import lavahack.loader.tO2OP6njCqBlYabOxVE9m4zETwpNmDUZ;
import lavahack.loader.u5CRioThdnglBh9lVJeSNzNoUAZImAg0;
import lavahack.loader.uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x;
import lavahack.loader.vbUsByat2W2VqvGVC3VWwk5FtcMDE72H;
import lavahack.loader.wdVAVdi2F3QG9A2uLasB8qn6W19QJIbV;
import lavahack.loader.zsqTSDg6cRzyFIjIJ0gsVaemPQdSwDx6;

public abstract class v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13 {
    protected QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR Field7916 = null;
    protected D2A33i4puy3VG87sLGopuKBa7759W0RD Field7917 = null;
    private String Field7918 = "TheKisDevs & LavaHack Development owns you";

    public static ByteBuffer Method195(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(byteBuffer.remaining());
        int by = ((int)1429793945L ^ 0x5538EC9A) << 4;
        while (true) {
            byte by2;
            if (!byteBuffer.hasRemaining()) {
                byteBuffer.position(byteBuffer.position() - byteBuffer2.position());
                return null;
            }
            void var2_4 = by2;
            by2 = byteBuffer.get();
            byteBuffer2.put(by2);
            int cfr_ignored_0 = (int)((long)-1962138086 ^ (long)-1962138089);
        }
    }

    public static String Method196(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13.Method195(byteBuffer);
        if (byteBuffer2 == null) {
            return null;
        }
        String string = eVUYg1GWgiUOrS8NdVHqZkr5dmjNAgoA.Method4528(byteBuffer2.array(), (int)((long)968204914 ^ (long)968204914), byteBuffer2.limit());
        return string;
    }

    public static VxtGBIxlzwZB81UrEE9PRzCsi9pMS1Ao Method197(ByteBuffer byteBuffer, QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR qmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR) throws fTSdQpXXUsy7b26dtudQpgyKwlcDU58e {
        String string = v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13.Method196(byteBuffer);
        if (string == null) {
            throw new PDe8wUioaRupOBTjFWgfiViCqtqJbEVR(byteBuffer.capacity() + ((int)((long)-282669885 ^ (long)-282669886) << 7));
        }
        String[] stringArray = string.split(" ", (int)28158574L ^ 0x1ADAA6D);
        if (stringArray.length != (int)((long)-1212340267 ^ (long)-1212340266)) {
            throw new fTSdQpXXUsy7b26dtudQpgyKwlcDU58e();
        }
        VxtGBIxlzwZB81UrEE9PRzCsi9pMS1Ao vxtGBIxlzwZB81UrEE9PRzCsi9pMS1Ao = qmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR == QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR.Field10968 ? v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13.Method199(stringArray, string) : v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13.Method198(stringArray, string);
        string = v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13.Method196(byteBuffer);
        while (string != null && string.length() > 0) {
            String[] stringArray2 = string.split(":", (int)((long)-233116619 ^ (long)-233116620) << 1);
            if (stringArray2.length != ((int)1661502871L ^ 0x63088596) << 1) {
                throw new fTSdQpXXUsy7b26dtudQpgyKwlcDU58e("not an http header");
            }
            if (vxtGBIxlzwZB81UrEE9PRzCsi9pMS1Ao.Method181(stringArray2[(int)((long)-1668735391 ^ (long)-1668735391)])) {
                vxtGBIxlzwZB81UrEE9PRzCsi9pMS1Ao.Method184(stringArray2[(int)((long)-1563378366 ^ (long)-1563378366)], vxtGBIxlzwZB81UrEE9PRzCsi9pMS1Ao.Method180(stringArray2[(int)-2058538539L ^ 0x854D31D5]) + "; " + stringArray2[(int)((long)2143366765 ^ (long)2143366764)].replaceFirst("^ +", ""));
            } else {
                vxtGBIxlzwZB81UrEE9PRzCsi9pMS1Ao.Method184(stringArray2[(int)611779798L ^ 0x247704D6], stringArray2[(int)1846338823L ^ 0x6E0CE506].replaceFirst("^ +", ""));
            }
            string = v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13.Method196(byteBuffer);
        }
        if (string != null) return vxtGBIxlzwZB81UrEE9PRzCsi9pMS1Ao;
        throw new PDe8wUioaRupOBTjFWgfiViCqtqJbEVR();
    }

    private static VxtGBIxlzwZB81UrEE9PRzCsi9pMS1Ao Method198(String[] stringArray, String string) throws fTSdQpXXUsy7b26dtudQpgyKwlcDU58e {
        if (!"GET".equalsIgnoreCase(stringArray[(int)((long)655421050 ^ (long)655421050)])) {
            Object[] objectArray = new Object[((int)-445850904L ^ 0xE56CDAE9) << 1];
            objectArray[(int)((long)-1161916560 ^ (long)-1161916560)] = stringArray[(int)1435583297L ^ 0x55914341];
            objectArray[(int)((long)-714497179 ^ (long)-714497180)] = string;
            throw new fTSdQpXXUsy7b26dtudQpgyKwlcDU58e(String.format("Invalid request method received: %s Status line: %s", objectArray));
        }
        if (!"HTTP/1.1".equalsIgnoreCase(stringArray[(int)((long)389961266 ^ (long)389961267) << 1])) {
            Object[] objectArray = new Object[(int)((long)-796017037 ^ (long)-796017038) << 1];
            objectArray[(int)((long)-1155440151 ^ (long)-1155440151)] = stringArray[((int)106734529L ^ 0x65CA3C0) << 1];
            objectArray[(int)((long)1233809489 ^ (long)1233809488)] = string;
            throw new fTSdQpXXUsy7b26dtudQpgyKwlcDU58e(String.format("Invalid status line received: %s Status line: %s", objectArray));
        }
        zsqTSDg6cRzyFIjIJ0gsVaemPQdSwDx6 zsqTSDg6cRzyFIjIJ0gsVaemPQdSwDx62 = new zsqTSDg6cRzyFIjIJ0gsVaemPQdSwDx6();
        zsqTSDg6cRzyFIjIJ0gsVaemPQdSwDx62.Method187(stringArray[(int)((long)-672914036 ^ (long)-672914035)]);
        return zsqTSDg6cRzyFIjIJ0gsVaemPQdSwDx62;
    }

    private static VxtGBIxlzwZB81UrEE9PRzCsi9pMS1Ao Method199(String[] stringArray, String string) throws fTSdQpXXUsy7b26dtudQpgyKwlcDU58e {
        if (!"101".equals(stringArray[(int)-1271040249L ^ 0xB43D7706])) {
            Object[] objectArray = new Object[((int)-705444567L ^ 0xD5F3C528) << 1];
            objectArray[(int)-1628206982L ^ 0x9EF3887A] = stringArray[(int)1067735186L ^ 0x3FA45893];
            objectArray[(int)((long)-997003811 ^ (long)-997003812)] = string;
            throw new fTSdQpXXUsy7b26dtudQpgyKwlcDU58e(String.format("Invalid status code received: %s Status line: %s", objectArray));
        }
        if (!"HTTP/1.1".equalsIgnoreCase(stringArray[(int)266748720L ^ 0xFE64330])) {
            Object[] objectArray = new Object[(int)((long)1641110888 ^ (long)1641110889) << 1];
            objectArray[(int)((long)-89771459 ^ (long)-89771459)] = stringArray[(int)-730712632L ^ 0xD47235C8];
            objectArray[(int)105636643L ^ 0x64BE322] = string;
            throw new fTSdQpXXUsy7b26dtudQpgyKwlcDU58e(String.format("Invalid status line received: %s Status line: %s", objectArray));
        }
        wdVAVdi2F3QG9A2uLasB8qn6W19QJIbV wdVAVdi2F3QG9A2uLasB8qn6W19QJIbV2 = new wdVAVdi2F3QG9A2uLasB8qn6W19QJIbV();
        g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh2 = wdVAVdi2F3QG9A2uLasB8qn6W19QJIbV2;
        g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh2.Method4951(Short.parseShort(stringArray[(int)731937723L ^ 0x2BA07BBA]));
        g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh2.Method4952(stringArray[(int)((long)-1345074557 ^ (long)-1345074558) << 1]);
        return wdVAVdi2F3QG9A2uLasB8qn6W19QJIbV2;
    }

    public abstract l6yKOMt7SVcyIzts9W2dZyllrA36dUBL Method200(bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5 var1, BrWsHdiLAwYGSB35z3ypQAx8eRulUOBh var2) throws fTSdQpXXUsy7b26dtudQpgyKwlcDU58e;

    public abstract l6yKOMt7SVcyIzts9W2dZyllrA36dUBL Method201(bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5 var1) throws fTSdQpXXUsy7b26dtudQpgyKwlcDU58e;

    protected boolean Method202(u5CRioThdnglBh9lVJeSNzNoUAZImAg0 u5CRioThdnglBh9lVJeSNzNoUAZImAg02) {
        int n;
        if (u5CRioThdnglBh9lVJeSNzNoUAZImAg02.Method180("Upgrade").equalsIgnoreCase("websocket") && u5CRioThdnglBh9lVJeSNzNoUAZImAg02.Method180("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade")) {
            n = (int)-1168284025L ^ 0xBA5D6686;
            return n != 0;
        }
        n = (int)((long)-1680507632 ^ (long)-1680507632);
        return n != 0;
    }

    public abstract ByteBuffer Method203(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H var1);

    public abstract List Method204(ByteBuffer var1, boolean var2);

    public abstract List Method205(String var1, boolean var2);

    public abstract void Method206(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x var1, vbUsByat2W2VqvGVC3VWwk5FtcMDE72H var2) throws rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC;

    public List Method207(D2A33i4puy3VG87sLGopuKBa7759W0RD d2A33i4puy3VG87sLGopuKBa7759W0RD, ByteBuffer byteBuffer, boolean bl) {
        if (d2A33i4puy3VG87sLGopuKBa7759W0RD != D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16035 && d2A33i4puy3VG87sLGopuKBa7759W0RD != D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16034) {
            throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
        }
        ERDZZaC7E7qEsEwC2UFlE3xI88227PAM eRDZZaC7E7qEsEwC2UFlE3xI88227PAM = null;
        if (this.Field7917 != null) {
            eRDZZaC7E7qEsEwC2UFlE3xI88227PAM = new cfXsTmRX3i7ZkEX7R02s03MD6XEp5rqr();
        } else {
            this.Field7917 = d2A33i4puy3VG87sLGopuKBa7759W0RD;
            if (d2A33i4puy3VG87sLGopuKBa7759W0RD == D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16035) {
                eRDZZaC7E7qEsEwC2UFlE3xI88227PAM = new rOPHnAqIyTBxKFhFO4Zr2u1PEEPbBVYY();
            } else if (d2A33i4puy3VG87sLGopuKBa7759W0RD == D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16034) {
                eRDZZaC7E7qEsEwC2UFlE3xI88227PAM = new tO2OP6njCqBlYabOxVE9m4zETwpNmDUZ();
            }
        }
        eRDZZaC7E7qEsEwC2UFlE3xI88227PAM.Method85(byteBuffer);
        eRDZZaC7E7qEsEwC2UFlE3xI88227PAM.Method86(bl);
        eRDZZaC7E7qEsEwC2UFlE3xI88227PAM.Method84();
        if (bl) {
            this.Field7917 = null;
            return Collections.singletonList(eRDZZaC7E7qEsEwC2UFlE3xI88227PAM);
        }
        this.Field7917 = d2A33i4puy3VG87sLGopuKBa7759W0RD;
        return Collections.singletonList(eRDZZaC7E7qEsEwC2UFlE3xI88227PAM);
    }

    public abstract void Method208();

    @Deprecated
    @Deprecated
    public List Method209(u5CRioThdnglBh9lVJeSNzNoUAZImAg0 u5CRioThdnglBh9lVJeSNzNoUAZImAg02, QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR qmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR) {
        return this.Method210(u5CRioThdnglBh9lVJeSNzNoUAZImAg02);
    }

    public List Method210(u5CRioThdnglBh9lVJeSNzNoUAZImAg0 u5CRioThdnglBh9lVJeSNzNoUAZImAg02) {
        return this.Method212(u5CRioThdnglBh9lVJeSNzNoUAZImAg02, (boolean)((long)-1198682051 ^ (long)-1198682052));
    }

    @Deprecated
    @Deprecated
    public List Method211(u5CRioThdnglBh9lVJeSNzNoUAZImAg0 u5CRioThdnglBh9lVJeSNzNoUAZImAg02, QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR qmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR, boolean bl) {
        return this.Method212(u5CRioThdnglBh9lVJeSNzNoUAZImAg02, bl);
    }

    public List Method212(u5CRioThdnglBh9lVJeSNzNoUAZImAg0 u5CRioThdnglBh9lVJeSNzNoUAZImAg02, boolean bl) {
        Object object;
        Object object2;
        StringBuilder stringBuilder = new StringBuilder(((int)715799308L ^ 0x2AAA3B15) << 2);
        if (u5CRioThdnglBh9lVJeSNzNoUAZImAg02 instanceof bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5) {
            stringBuilder.append("GET ").append(((bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5)u5CRioThdnglBh9lVJeSNzNoUAZImAg02).Method186()).append(" HTTP/1.1");
        } else {
            if (!(u5CRioThdnglBh9lVJeSNzNoUAZImAg02 instanceof BrWsHdiLAwYGSB35z3ypQAx8eRulUOBh)) throw new IllegalArgumentException("unknown role");
            stringBuilder.append("HTTP/1.1 101 ").append(((BrWsHdiLAwYGSB35z3ypQAx8eRulUOBh)u5CRioThdnglBh9lVJeSNzNoUAZImAg02).Method4950());
        }
        stringBuilder.append("\r\n");
        Iterator iterator = u5CRioThdnglBh9lVJeSNzNoUAZImAg02.Method179();
        while (iterator.hasNext()) {
            object2 = (String)iterator.next();
            object = u5CRioThdnglBh9lVJeSNzNoUAZImAg02.Method180((String)object2);
            stringBuilder.append((String)object2);
            stringBuilder.append(": ");
            stringBuilder.append((String)object);
            stringBuilder.append("\r\n");
        }
        stringBuilder.append("\r\n");
        object2 = eVUYg1GWgiUOrS8NdVHqZkr5dmjNAgoA.Method4526(stringBuilder.toString());
        object = bl ? u5CRioThdnglBh9lVJeSNzNoUAZImAg02.Method182() : null;
        ByteBuffer byteBuffer = ByteBuffer.allocate((object == null ? (int)((long)1910567093 ^ (long)1910567093) : ((Object)object).length) + ((Object)object2).length);
        byteBuffer.put((byte[])object2);
        if (object != null) {
            byteBuffer.put((byte[])object);
        }
        byteBuffer.flip();
        return Collections.singletonList(byteBuffer);
    }

    public abstract lDgX8dul2aWNBQmCTcuuerubKmsg9XQq Method213(lDgX8dul2aWNBQmCTcuuerubKmsg9XQq var1) throws fTSdQpXXUsy7b26dtudQpgyKwlcDU58e;

    public abstract VxtGBIxlzwZB81UrEE9PRzCsi9pMS1Ao Method214(bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5 var1, g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh var2) throws fTSdQpXXUsy7b26dtudQpgyKwlcDU58e;

    public abstract List Method215(ByteBuffer var1) throws rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC;

    public abstract pkFsFgiZykGBET8wx0XXygS5258qy2Bd Method216();

    public abstract v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13 Method217();

    public u5CRioThdnglBh9lVJeSNzNoUAZImAg0 Method218(ByteBuffer byteBuffer) throws fTSdQpXXUsy7b26dtudQpgyKwlcDU58e {
        return v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13.Method197(byteBuffer, this.Field7916);
    }

    public int Method219(int n) throws rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC {
        if (n >= 0) return n;
        throw new rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC(((int)-569462718L ^ 0xDE0EB1B7) << 1, "Negative count");
    }

    int Method220(u5CRioThdnglBh9lVJeSNzNoUAZImAg0 u5CRioThdnglBh9lVJeSNzNoUAZImAg02) {
        String string = u5CRioThdnglBh9lVJeSNzNoUAZImAg02.Method180("Sec-WebSocket-Version");
        if (string.length() <= 0) return (int)-129107542L ^ 0x7B20655;
        return Integer.parseInt(string.trim());
    }

    public void Method221(QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR qmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR) {
        this.Field7916 = qmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR;
    }

    public QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR Method222() {
        return this.Field7916;
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }

    private static String Method223(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-672957360 ^ (long)-672957360);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-40343417 ^ (long)-40343432);
            int n2 = ((int)100005836L ^ 0x5F5F7CB) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1690031785 ^ (long)1690032576) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

