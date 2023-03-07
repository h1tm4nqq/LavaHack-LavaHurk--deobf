/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package lavahack.loader;

import java.math.BigInteger;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import lavahack.loader.BrWsHdiLAwYGSB35z3ypQAx8eRulUOBh;
import lavahack.loader.D2A33i4puy3VG87sLGopuKBa7759W0RD;
import lavahack.loader.MjqPPsIgrrFE8smKJhGdj08A51foRyqE;
import lavahack.loader.OvvNFVp1prZcFYv57XGirjG11JCXathw;
import lavahack.loader.QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR;
import lavahack.loader.RwArBzkD03g9aNZ1S3jE82sh05LzjqgM;
import lavahack.loader.VxtGBIxlzwZB81UrEE9PRzCsi9pMS1Ao;
import lavahack.loader.ahJMkUtzzEf7tJjbemx3021mGngs1J3z;
import lavahack.loader.bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5;
import lavahack.loader.cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9;
import lavahack.loader.eVUYg1GWgiUOrS8NdVHqZkr5dmjNAgoA;
import lavahack.loader.fTSdQpXXUsy7b26dtudQpgyKwlcDU58e;
import lavahack.loader.fdljcT89CBPrL7HBEVQFJfXSVaiifxsj;
import lavahack.loader.g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh;
import lavahack.loader.iDprz50yBrPJ6StAk1hDYgq1aL04tvSb;
import lavahack.loader.l6yKOMt7SVcyIzts9W2dZyllrA36dUBL;
import lavahack.loader.lDgX8dul2aWNBQmCTcuuerubKmsg9XQq;
import lavahack.loader.p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.loader.pkFsFgiZykGBET8wx0XXygS5258qy2Bd;
import lavahack.loader.rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC;
import lavahack.loader.rOPHnAqIyTBxKFhFO4Zr2u1PEEPbBVYY;
import lavahack.loader.rRzQ0Vs9QzFUmQhXM0VX1AGIcFg0BHlG;
import lavahack.loader.tO2OP6njCqBlYabOxVE9m4zETwpNmDUZ;
import lavahack.loader.twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl;
import lavahack.loader.uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x;
import lavahack.loader.v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13;
import lavahack.loader.vbUsByat2W2VqvGVC3VWwk5FtcMDE72H;
import lavahack.loader.vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK;
import lavahack.loader.y8U8oQnw0TUDKkVJGZnF579aaraavvia;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5
extends v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13 {
    private static final String Field11180;
    private static final String Field11181;
    private static final String Field11182;
    private static final String Field11183;
    private static final String Field11184;
    private static final String Field11185;
    private final Logger Field11186 = LogManager.getLogger(p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5.class);
    private vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK Field11187 = new RwArBzkD03g9aNZ1S3jE82sh05LzjqgM();
    private vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK Field11188 = new RwArBzkD03g9aNZ1S3jE82sh05LzjqgM();
    private List Field11189;
    private vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK Field11190;
    private iDprz50yBrPJ6StAk1hDYgq1aL04tvSb Field11191;
    private List Field11192;
    private vbUsByat2W2VqvGVC3VWwk5FtcMDE72H Field11193;
    private final List Field11194;
    private ByteBuffer Field11195;
    private final SecureRandom Field11196 = new SecureRandom();
    private int Field11197;
    static final boolean Field11198;
    private String Field11199 = "TheKisDevs & LavaHack Development owns you";

    public p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5() {
        this(Collections.emptyList());
    }

    public p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5(vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK2) {
        this(Collections.singletonList(vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK2));
    }

    public p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5(List list) {
        this(list, Collections.singletonList(new fdljcT89CBPrL7HBEVQFJfXSVaiifxsj("")));
    }

    public p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5(List list, List list2) {
        this(list, list2, Integer.MAX_VALUE);
    }

    public p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5(List list, int n) {
        this(list, Collections.singletonList(new fdljcT89CBPrL7HBEVQFJfXSVaiifxsj("")), n);
    }

    public p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5(List list, List list2, int n) {
        if (list == null) throw new IllegalArgumentException();
        if (list2 == null) throw new IllegalArgumentException();
        if (n < ((int)1760450511L ^ 0x68EE57CE)) {
            throw new IllegalArgumentException();
        }
        this.Field11189 = new ArrayList(list.size());
        this.Field11192 = new ArrayList(list2.size());
        int n2 = (int)((long)-561760342 ^ (long)-561760342);
        this.Field11194 = new ArrayList();
        Iterator iterator = list.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Field11189.addAll(list);
                this.Field11189.add(this.Field11189.size(), this.Field11187);
                this.Field11192.addAll(list2);
                this.Field11197 = n;
                this.Field11190 = null;
                return;
            }
            vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK2 = (vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK)iterator.next();
            if (!vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK2.getClass().equals(RwArBzkD03g9aNZ1S3jE82sh05LzjqgM.class)) continue;
            n2 = (int)((long)276299732 ^ (long)276299733);
        }
    }

    @Override
    public l6yKOMt7SVcyIzts9W2dZyllrA36dUBL Method201(bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5 bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO52) throws fTSdQpXXUsy7b26dtudQpgyKwlcDU58e {
        int n = this.Method220(bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO52);
        if (n != (int)((long)1496018512 ^ (long)1496018525)) {
            this.Field11186.trace("acceptHandshakeAsServer - Wrong websocket version.");
            return l6yKOMt7SVcyIzts9W2dZyllrA36dUBL.Field15234;
        }
        l6yKOMt7SVcyIzts9W2dZyllrA36dUBL l6yKOMt7SVcyIzts9W2dZyllrA36dUBL2 = l6yKOMt7SVcyIzts9W2dZyllrA36dUBL.Field15234;
        String string = bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO52.Method180("Sec-WebSocket-Extensions");
        Object object = this.Field11189.iterator();
        while (object.hasNext()) {
            vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK2 = (vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK)object.next();
            if (!vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK2.Method6573(string)) continue;
            this.Field11187 = vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK2;
            l6yKOMt7SVcyIzts9W2dZyllrA36dUBL2 = l6yKOMt7SVcyIzts9W2dZyllrA36dUBL.Field15233;
            this.Field11186.trace("acceptHandshakeAsServer - Matching extension found: {}", (Object)this.Field11187);
            break;
        }
        if ((object = this.Method3101(bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO52.Method180("Sec-WebSocket-Protocol"))) == l6yKOMt7SVcyIzts9W2dZyllrA36dUBL.Field15233 && l6yKOMt7SVcyIzts9W2dZyllrA36dUBL2 == l6yKOMt7SVcyIzts9W2dZyllrA36dUBL.Field15233) {
            return l6yKOMt7SVcyIzts9W2dZyllrA36dUBL.Field15233;
        }
        this.Field11186.trace("acceptHandshakeAsServer - No matching extension or protocol found.");
        return l6yKOMt7SVcyIzts9W2dZyllrA36dUBL.Field15234;
    }

    private l6yKOMt7SVcyIzts9W2dZyllrA36dUBL Method3101(String string) {
        iDprz50yBrPJ6StAk1hDYgq1aL04tvSb iDprz50yBrPJ6StAk1hDYgq1aL04tvSb2;
        Iterator iterator = this.Field11192.iterator();
        do {
            if (!iterator.hasNext()) return l6yKOMt7SVcyIzts9W2dZyllrA36dUBL.Field15234;
        } while (!(iDprz50yBrPJ6StAk1hDYgq1aL04tvSb2 = (iDprz50yBrPJ6StAk1hDYgq1aL04tvSb)iterator.next()).Method3832(string));
        this.Field11191 = iDprz50yBrPJ6StAk1hDYgq1aL04tvSb2;
        this.Field11186.trace("acceptHandshake - Matching protocol found: {}", (Object)this.Field11191);
        return l6yKOMt7SVcyIzts9W2dZyllrA36dUBL.Field15233;
    }

    @Override
    public l6yKOMt7SVcyIzts9W2dZyllrA36dUBL Method200(bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5 bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO52, BrWsHdiLAwYGSB35z3ypQAx8eRulUOBh brWsHdiLAwYGSB35z3ypQAx8eRulUOBh) throws fTSdQpXXUsy7b26dtudQpgyKwlcDU58e {
        if (!this.Method202(brWsHdiLAwYGSB35z3ypQAx8eRulUOBh)) {
            this.Field11186.trace("acceptHandshakeAsClient - Missing/wrong upgrade or connection in handshake.");
            return l6yKOMt7SVcyIzts9W2dZyllrA36dUBL.Field15234;
        }
        if (!bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO52.Method181("Sec-WebSocket-Key") || !brWsHdiLAwYGSB35z3ypQAx8eRulUOBh.Method181("Sec-WebSocket-Accept")) {
            this.Field11186.trace("acceptHandshakeAsClient - Missing Sec-WebSocket-Key or Sec-WebSocket-Accept");
            return l6yKOMt7SVcyIzts9W2dZyllrA36dUBL.Field15234;
        }
        String string = brWsHdiLAwYGSB35z3ypQAx8eRulUOBh.Method180("Sec-WebSocket-Accept");
        String string2 = bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO52.Method180("Sec-WebSocket-Key");
        if (!(string2 = this.Method3116(string2)).equals(string)) {
            this.Field11186.trace("acceptHandshakeAsClient - Wrong key for Sec-WebSocket-Key.");
            return l6yKOMt7SVcyIzts9W2dZyllrA36dUBL.Field15234;
        }
        l6yKOMt7SVcyIzts9W2dZyllrA36dUBL l6yKOMt7SVcyIzts9W2dZyllrA36dUBL2 = l6yKOMt7SVcyIzts9W2dZyllrA36dUBL.Field15234;
        String string3 = brWsHdiLAwYGSB35z3ypQAx8eRulUOBh.Method180("Sec-WebSocket-Extensions");
        Object object = this.Field11189.iterator();
        while (object.hasNext()) {
            vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK2 = (vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK)object.next();
            if (!vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK2.Method6574(string3)) continue;
            this.Field11187 = vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK2;
            l6yKOMt7SVcyIzts9W2dZyllrA36dUBL2 = l6yKOMt7SVcyIzts9W2dZyllrA36dUBL.Field15233;
            this.Field11186.trace("acceptHandshakeAsClient - Matching extension found: {}", (Object)this.Field11187);
            break;
        }
        if ((object = this.Method3101(brWsHdiLAwYGSB35z3ypQAx8eRulUOBh.Method180("Sec-WebSocket-Protocol"))) == l6yKOMt7SVcyIzts9W2dZyllrA36dUBL.Field15233 && l6yKOMt7SVcyIzts9W2dZyllrA36dUBL2 == l6yKOMt7SVcyIzts9W2dZyllrA36dUBL.Field15233) {
            return l6yKOMt7SVcyIzts9W2dZyllrA36dUBL.Field15233;
        }
        this.Field11186.trace("acceptHandshakeAsClient - No matching extension or protocol found.");
        return l6yKOMt7SVcyIzts9W2dZyllrA36dUBL.Field15234;
    }

    public vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK Method3102() {
        return this.Field11187;
    }

    public List Method3103() {
        return this.Field11189;
    }

    public iDprz50yBrPJ6StAk1hDYgq1aL04tvSb Method3104() {
        return this.Field11191;
    }

    public int Method3105() {
        return this.Field11197;
    }

    public List Method3106() {
        return this.Field11192;
    }

    @Override
    public lDgX8dul2aWNBQmCTcuuerubKmsg9XQq Method213(lDgX8dul2aWNBQmCTcuuerubKmsg9XQq lDgX8dul2aWNBQmCTcuuerubKmsg9XQq2) {
        Object object2;
        lDgX8dul2aWNBQmCTcuuerubKmsg9XQq2.Method184("Upgrade", "websocket");
        lDgX8dul2aWNBQmCTcuuerubKmsg9XQq2.Method184("Connection", "Upgrade");
        byte[] byArray = new byte[((int)1608496720L ^ 0x5FDFB651) << 4];
        this.Field11196.nextBytes(byArray);
        lDgX8dul2aWNBQmCTcuuerubKmsg9XQq2.Method184("Sec-WebSocket-Key", rRzQ0Vs9QzFUmQhXM0VX1AGIcFg0BHlG.Method2758(byArray));
        lDgX8dul2aWNBQmCTcuuerubKmsg9XQq2.Method184("Sec-WebSocket-Version", "13");
        StringBuilder stringBuilder = new StringBuilder();
        for (Object object2 : this.Field11189) {
            if (object2.Method6576() == null || object2.Method6576().length() == 0) continue;
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(object2.Method6576());
        }
        if (stringBuilder.length() != 0) {
            lDgX8dul2aWNBQmCTcuuerubKmsg9XQq2.Method184("Sec-WebSocket-Extensions", stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        object2 = this.Field11192.iterator();
        while (true) {
            if (!object2.hasNext()) {
                if (stringBuilder2.length() == 0) return lDgX8dul2aWNBQmCTcuuerubKmsg9XQq2;
                lDgX8dul2aWNBQmCTcuuerubKmsg9XQq2.Method184("Sec-WebSocket-Protocol", stringBuilder2.toString());
                return lDgX8dul2aWNBQmCTcuuerubKmsg9XQq2;
            }
            iDprz50yBrPJ6StAk1hDYgq1aL04tvSb iDprz50yBrPJ6StAk1hDYgq1aL04tvSb2 = (iDprz50yBrPJ6StAk1hDYgq1aL04tvSb)object2.next();
            if (iDprz50yBrPJ6StAk1hDYgq1aL04tvSb2.Method3833().length() == 0) continue;
            if (stringBuilder2.length() > 0) {
                stringBuilder2.append(", ");
            }
            stringBuilder2.append(iDprz50yBrPJ6StAk1hDYgq1aL04tvSb2.Method3833());
        }
    }

    @Override
    public VxtGBIxlzwZB81UrEE9PRzCsi9pMS1Ao Method214(bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5 bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO52, g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh2) throws fTSdQpXXUsy7b26dtudQpgyKwlcDU58e {
        g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh2.Method184("Upgrade", "websocket");
        g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh2.Method184("Connection", bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO52.Method180("Connection"));
        String string = bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO52.Method180("Sec-WebSocket-Key");
        if (string == null) throw new fTSdQpXXUsy7b26dtudQpgyKwlcDU58e("missing Sec-WebSocket-Key");
        if ("".equals(string)) {
            throw new fTSdQpXXUsy7b26dtudQpgyKwlcDU58e("missing Sec-WebSocket-Key");
        }
        g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh2.Method184("Sec-WebSocket-Accept", this.Method3116(string));
        if (this.Method3102().Method6577().length() != 0) {
            g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh2.Method184("Sec-WebSocket-Extensions", this.Method3102().Method6577());
        }
        if (this.Method3104() != null && this.Method3104().Method3833().length() != 0) {
            g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh2.Method184("Sec-WebSocket-Protocol", this.Method3104().Method3833());
        }
        g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh2.Method4952("Web Socket Protocol Handshake");
        g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh2.Method184("Server", "TooTallNate Java-WebSocket");
        g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh2.Method184("Date", this.Method3115());
        return g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh2;
    }

    @Override
    public v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13 Method217() {
        Object object2;
        ArrayList<vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK> arrayList = new ArrayList<vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK>();
        for (Object object2 : this.Method3103()) {
            arrayList.add(object2.Method6578());
        }
        ArrayList arrayList2 = new ArrayList();
        object2 = this.Method3106().iterator();
        while (object2.hasNext()) {
            iDprz50yBrPJ6StAk1hDYgq1aL04tvSb iDprz50yBrPJ6StAk1hDYgq1aL04tvSb2 = (iDprz50yBrPJ6StAk1hDYgq1aL04tvSb)object2.next();
            arrayList2.add(iDprz50yBrPJ6StAk1hDYgq1aL04tvSb2.Method3834());
        }
        return new p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5(arrayList, arrayList2, this.Field11197);
    }

    @Override
    public ByteBuffer Method203(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2) {
        this.Method3102().Method6572(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2);
        if (!this.Field11186.isTraceEnabled()) return this.Method3107(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2);
        this.Field11186.trace("afterEnconding({}): {}", (Object)vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method82().remaining(), (Object)(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method82().remaining() > (int)((long)1213118918 ^ (long)1213118907) << 3 ? "too big to display" : new String(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method82().array())));
        return this.Method3107(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2);
    }

    private ByteBuffer Method3107(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2) {
        ByteBuffer byteBuffer = vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method82();
        int n = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi == QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR.Field10968 ? (int)1573946183L ^ 0x5DD08346 : (int)-1266160724L ^ 0xB487EBAC;
        int n2 = this.Method3114(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(((int)1137691339L ^ 0x43CFCACA) + (n2 > ((int)-1439577965L ^ 0xAA31C892) ? n2 + (int)((long)-1198635798 ^ (long)-1198635797) : n2) + ((int)1011766620L ^ 0x3C4E555C) + byteBuffer.remaining());
        byte by = this.Method3118(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method81());
        byte by2 = (byte)(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method76() ? (int)((long)1164874422 ^ (long)-1164874442) : (int)((long)614326184 ^ (long)614326184));
        by2 = (byte)(by2 | by);
        if (vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method77()) {
            by2 = (byte)(by2 | this.Method3112((int)798166304L ^ 0x2F930D21));
        }
        if (vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method78()) {
            by2 = (byte)(by2 | this.Method3112((int)((long)527432449 ^ (long)527432448) << 1));
        }
        if (vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method79()) {
            by2 = (byte)(by2 | this.Method3112((int)44474618L ^ 0x2A6A0F9));
        }
        byteBuffer2.put(by2);
        byte[] byArray = this.Method3117(byteBuffer.remaining(), n2);
        if (!Field11198 && byArray.length != n2) {
            throw new AssertionError();
        }
        if (n2 == (int)((long)-889364550 ^ (long)-889364549)) {
            byteBuffer2.put((byte)(byArray[(int)707266885L ^ 0x2A280945] | this.Method3113(n != 0)));
        } else if (n2 == ((int)1751191889L ^ 0x68611150) << 1) {
            byteBuffer2.put((byte)((int)((long)1579368070 ^ (long)1579368121) << 1 | this.Method3113(n != 0)));
            byteBuffer2.put(byArray);
        } else {
            if (n2 != ((int)-597180663L ^ 0xDC67BF08) << 3) throw new IllegalStateException("Size representation not supported/specified");
            byteBuffer2.put((byte)((int)((long)-50587774 ^ (long)-50587651) | this.Method3113(n != 0)));
            byteBuffer2.put(byArray);
        }
        byteBuffer2.put(byteBuffer);
        byteBuffer.flip();
        if (!Field11198 && byteBuffer2.remaining() != 0) {
            throw new AssertionError(byteBuffer2.remaining());
        }
        byteBuffer2.flip();
        return byteBuffer2;
    }

    private vbUsByat2W2VqvGVC3VWwk5FtcMDE72H Method3108(ByteBuffer byteBuffer) throws ahJMkUtzzEf7tJjbemx3021mGngs1J3z, rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC {
        Object object;
        if (byteBuffer == null) {
            throw new IllegalArgumentException();
        }
        int n = byteBuffer.remaining();
        int n2 = (int)((long)-2032122944 ^ (long)-2032122943) << 1;
        this.Method3111(n, n2);
        byte by = byteBuffer.get();
        boolean bl = by >> (((int)1287378744L ^ 0x4CBBD739) << 3) != 0 ? (int)-1701647096L ^ 0x9A92ED09 : (int)((long)327272808 ^ (long)327272808);
        boolean bl2 = (by & ((int)1492031502L ^ 0x58EE980F) << 6) != 0 ? (int)237540734L ^ 0xE28957F : (int)((long)-498821500 ^ (long)-498821500);
        boolean bl3 = (by & ((int)250985925L ^ 0xEF5BDC4) << 5) != 0 ? (int)((long)1180016739 ^ (long)1180016738) : (int)((long)155238566 ^ (long)155238566);
        boolean bl4 = (by & (int)((long)-1992265560 ^ (long)-1992265559) << 4) != 0 ? (int)1358820199L ^ 0x50FDF366 : (int)((long)1855640431 ^ (long)1855640431);
        byte by2 = byteBuffer.get();
        int n3 = (by2 & (int)((long)-339946205 ^ (long)339946147)) != 0 ? (int)((long)1233155779 ^ (long)1233155778) : (int)389981915L ^ 0x173EA6DB;
        int n4 = by2 & (int)((long)1551420497 ^ (long)1551420462);
        D2A33i4puy3VG87sLGopuKBa7759W0RD d2A33i4puy3VG87sLGopuKBa7759W0RD = this.Method3119((byte)(by & (int)((long)-1052631405 ^ (long)-1052631396)));
        if (n4 < 0 || n4 > ((int)1760219204L ^ 0x68EAD039)) {
            object = this.Method3109(byteBuffer, d2A33i4puy3VG87sLGopuKBa7759W0RD, n4, n, n2);
            n4 = p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6262((p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object);
            n2 = p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6263((p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object);
        }
        this.Method3110(n4);
        n2 += (int)1829752837L ^ 0x6D0FD005;
        this.Method3111(n, n2 += n4);
        object = ByteBuffer.allocate(this.Method219(n4));
        ((ByteBuffer)object).put(byteBuffer.array(), byteBuffer.position(), ((Buffer)object).limit());
        byteBuffer.position(byteBuffer.position() + ((Buffer)object).limit());
        twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2 = twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl.Method91(d2A33i4puy3VG87sLGopuKBa7759W0RD);
        twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Method86(bl);
        twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Method87(bl2);
        twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Method88(bl3);
        twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Method89(bl4);
        ((ByteBuffer)object).flip();
        twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Method85((ByteBuffer)object);
        if (twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Method81() != D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16033) {
            this.Field11190 = twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Method77() || twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Method78() || twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Method79() ? this.Method3102() : this.Field11188;
        }
        if (this.Field11190 == null) {
            this.Field11190 = this.Field11188;
        }
        this.Field11190.Method6575(twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2);
        this.Field11190.Method6571(twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2);
        if (this.Field11186.isTraceEnabled()) {
            this.Field11186.trace("afterDecoding({}): {}", (Object)twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Method82().remaining(), (Object)(twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Method82().remaining() > (int)((long)-1021092959 ^ (long)-1021092900) << 3 ? "too big to display" : new String(twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Method82().array())));
        }
        twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Method84();
        return twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2;
    }

    private p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Method3109(ByteBuffer byteBuffer, D2A33i4puy3VG87sLGopuKBa7759W0RD d2A33i4puy3VG87sLGopuKBa7759W0RD, int n, int n2, int n3) throws cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9, ahJMkUtzzEf7tJjbemx3021mGngs1J3z, y8U8oQnw0TUDKkVJGZnF579aaraavvia {
        int n4 = n;
        int n5 = n3;
        if (d2A33i4puy3VG87sLGopuKBa7759W0RD == D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16036 || d2A33i4puy3VG87sLGopuKBa7759W0RD == D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16037 || d2A33i4puy3VG87sLGopuKBa7759W0RD == D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16038) {
            this.Field11186.trace("Invalid frame: more than 125 octets");
            throw new cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9("more than 125 octets");
        }
        if (n4 == ((int)953941472L ^ 0x38DBFDDF) << 1) {
            this.Method3111(n2, n5 += 2);
            byte[] byArray = new byte[(int)((long)-277417905 ^ (long)-277417908)];
            byArray[(int)((long)1128052069 ^ (long)1128052068)] = byteBuffer.get();
            byArray[(int)((long)1800649012 ^ (long)1800649013) << 1] = byteBuffer.get();
            n4 = new BigInteger(byArray).intValue();
            return new p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this, n4, n5);
        }
        this.Method3111(n2, n5 += 8);
        byte[] byArray = new byte[((int)-1654317180L ^ 0x9D651F85) << 3];
        int n6 = (int)((long)816442026 ^ (long)816442026);
        while (true) {
            int cfr_ignored_0 = (int)((long)1001692537 ^ (long)1001692536) << 3;
            byArray[n6] = byteBuffer.get();
            ++n6;
        }
    }

    private void Method3110(long l) throws y8U8oQnw0TUDKkVJGZnF579aaraavvia {
        if (l > (Integer.MAX_VALUE & Integer.MAX_VALUE)) {
            this.Field11186.trace("Limit exedeed: Payloadsize is to big...");
            throw new y8U8oQnw0TUDKkVJGZnF579aaraavvia("Payloadsize is to big...");
        }
        if (l > (long)this.Field11197) {
            this.Field11186.trace("Payload limit reached. Allowed: {} Current: {}", (Object)this.Field11197, (Object)l);
            throw new y8U8oQnw0TUDKkVJGZnF579aaraavvia("Payload limit reached.", this.Field11197);
        }
        if (l >= 0L) return;
        this.Field11186.trace("Limit underflow: Payloadsize is to little...");
        throw new y8U8oQnw0TUDKkVJGZnF579aaraavvia("Payloadsize is to little...");
    }

    private void Method3111(int n, int n2) throws ahJMkUtzzEf7tJjbemx3021mGngs1J3z {
        if (n >= n2) return;
        this.Field11186.trace("Incomplete frame: maxpacketsize < realpacketsize");
        throw new ahJMkUtzzEf7tJjbemx3021mGngs1J3z(n2);
    }

    private byte Method3112(int n) {
        switch (n) {
            case 1: {
                return (int)((long)-1712929361 ^ (long)-1712929362) << 6;
            }
            case 2: {
                return (int)((long)628060500 ^ (long)628060501) << 5;
            }
            case 3: {
                return (int)((long)420958038 ^ (long)420958039) << 4;
            }
        }
        return (byte)((int)((long)1638565520 ^ (long)1638565520));
    }

    private byte Method3113(boolean bl) {
        int n;
        if (bl) {
            n = (int)((long)-1995087762 ^ (long)1995087854);
            return (byte)n;
        }
        n = (int)((long)-631350335 ^ (long)-631350335);
        return (byte)n;
    }

    private int Method3114(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= (int)((long)1463305563 ^ (long)1463305510)) {
            return (int)-1599696606L ^ 0xA0A69123;
        }
        if (byteBuffer.remaining() > ((int)1760279132L ^ 0x68EB45A3)) return ((int)-917966071L ^ 0xC948F308) << 3;
        return (int)((long)-176443456 ^ (long)-176443455) << 1;
    }

    @Override
    public List Method215(ByteBuffer byteBuffer) throws rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC {
        vbUsByat2W2VqvGVC3VWwk5FtcMDE72H vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2;
        LinkedList<vbUsByat2W2VqvGVC3VWwk5FtcMDE72H> linkedList = new LinkedList<vbUsByat2W2VqvGVC3VWwk5FtcMDE72H>();
        if (this.Field11195 != null) {
            byteBuffer.mark();
            int n = byteBuffer.remaining();
            int n2 = this.Field11195.remaining();
            if (n2 > n) {
                this.Field11195.put(byteBuffer.array(), byteBuffer.position(), n);
                byteBuffer.position(byteBuffer.position() + n);
                return Collections.emptyList();
            }
            this.Field11195.put(byteBuffer.array(), byteBuffer.position(), n2);
            byteBuffer.position(byteBuffer.position() + n2);
            vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2 = this.Method3108((ByteBuffer)this.Field11195.duplicate().position((int)((long)305902331 ^ (long)305902331)));
            linkedList.add(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2);
            this.Field11195 = null;
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2 = this.Method3108(byteBuffer);
            linkedList.add(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2);
        }
        return linkedList;
    }

    @Override
    public List Method204(ByteBuffer byteBuffer, boolean bl) {
        rOPHnAqIyTBxKFhFO4Zr2u1PEEPbBVYY rOPHnAqIyTBxKFhFO4Zr2u1PEEPbBVYY2 = new rOPHnAqIyTBxKFhFO4Zr2u1PEEPbBVYY();
        rOPHnAqIyTBxKFhFO4Zr2u1PEEPbBVYY2.Method85(byteBuffer);
        rOPHnAqIyTBxKFhFO4Zr2u1PEEPbBVYY2.Method90(bl);
        rOPHnAqIyTBxKFhFO4Zr2u1PEEPbBVYY2.Method84();
        return Collections.singletonList(rOPHnAqIyTBxKFhFO4Zr2u1PEEPbBVYY2);
    }

    @Override
    public List Method205(String string, boolean bl) {
        tO2OP6njCqBlYabOxVE9m4zETwpNmDUZ tO2OP6njCqBlYabOxVE9m4zETwpNmDUZ2 = new tO2OP6njCqBlYabOxVE9m4zETwpNmDUZ();
        tO2OP6njCqBlYabOxVE9m4zETwpNmDUZ2.Method85(ByteBuffer.wrap(eVUYg1GWgiUOrS8NdVHqZkr5dmjNAgoA.Method4525(string)));
        tO2OP6njCqBlYabOxVE9m4zETwpNmDUZ2.Method90(bl);
        tO2OP6njCqBlYabOxVE9m4zETwpNmDUZ2.Method84();
        return Collections.singletonList(tO2OP6njCqBlYabOxVE9m4zETwpNmDUZ2);
    }

    @Override
    public void Method208() {
        this.Field11195 = null;
        if (this.Field11187 != null) {
            this.Field11187.Method6579();
        }
        this.Field11187 = new RwArBzkD03g9aNZ1S3jE82sh05LzjqgM();
        this.Field11191 = null;
    }

    private String Method3115() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(calendar.getTime());
    }

    private String Method3116(String string) {
        String string2 = string.trim();
        String string3 = string2 + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        return rRzQ0Vs9QzFUmQhXM0VX1AGIcFg0BHlG.Method2758(messageDigest.digest(string3.getBytes()));
    }

    private byte[] Method3117(long l, int n) {
        byte[] byArray = new byte[n];
        int n2 = ((int)((long)912763123 ^ (long)912763122) << 3) * n - ((int)((long)-289321426 ^ (long)-289321425) << 3);
        int n3 = (int)((long)1170342250 ^ (long)1170342250);
        while (n3 < n) {
            byArray[n3] = (byte)(l >>> n2 - (((int)1371283265L ^ 0x51BC1F40) << 3) * n3);
            ++n3;
        }
        return byArray;
    }

    private byte Method3118(D2A33i4puy3VG87sLGopuKBa7759W0RD d2A33i4puy3VG87sLGopuKBa7759W0RD) {
        if (d2A33i4puy3VG87sLGopuKBa7759W0RD == D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16033) {
            return (byte)((int)-1967292875L ^ 0x8ABD7E35);
        }
        if (d2A33i4puy3VG87sLGopuKBa7759W0RD == D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16034) {
            return (byte)((int)((long)-1586661519 ^ (long)-1586661520));
        }
        if (d2A33i4puy3VG87sLGopuKBa7759W0RD == D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16035) {
            return ((int)-295448897L ^ 0xEE63CEBE) << 1;
        }
        if (d2A33i4puy3VG87sLGopuKBa7759W0RD == D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16038) {
            return (int)((long)-68197154 ^ (long)-68197153) << 3;
        }
        if (d2A33i4puy3VG87sLGopuKBa7759W0RD == D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16036) {
            return (byte)((int)((long)2057341954 ^ (long)2057341963));
        }
        if (d2A33i4puy3VG87sLGopuKBa7759W0RD != D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16037) throw new IllegalArgumentException("Don't know how to handle " + d2A33i4puy3VG87sLGopuKBa7759W0RD.toString());
        return ((int)12255112L ^ 0xBAFF8D) << 1;
    }

    private D2A33i4puy3VG87sLGopuKBa7759W0RD Method3119(byte by) throws cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9 {
        switch (by) {
            case 0: {
                return D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16033;
            }
            case 1: {
                return D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16034;
            }
            case 2: {
                return D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16035;
            }
            case 8: {
                return D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16038;
            }
            case 9: {
                return D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16036;
            }
            case 10: {
                return D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16037;
            }
        }
        throw new cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9("Unknown opcode " + (short)by);
    }

    @Override
    public void Method206(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2, vbUsByat2W2VqvGVC3VWwk5FtcMDE72H vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2) throws rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC {
        D2A33i4puy3VG87sLGopuKBa7759W0RD d2A33i4puy3VG87sLGopuKBa7759W0RD = vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method81();
        if (d2A33i4puy3VG87sLGopuKBa7759W0RD == D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16038) {
            this.Method3126(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2, vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2);
            return;
        }
        if (d2A33i4puy3VG87sLGopuKBa7759W0RD == D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16036) {
            uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Method5216().Method2669(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2, vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2);
            return;
        }
        if (d2A33i4puy3VG87sLGopuKBa7759W0RD == D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16037) {
            uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Method5215();
            uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Method5216().Method2671(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2, vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2);
            return;
        }
        if (!vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method76() || d2A33i4puy3VG87sLGopuKBa7759W0RD == D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16033) {
            this.Method3120(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2, vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2, d2A33i4puy3VG87sLGopuKBa7759W0RD);
            return;
        }
        if (this.Field11193 != null) {
            this.Field11186.error("Protocol error: Continuous frame sequence not completed.");
            throw new rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC(((int)-1277122051L ^ 0xB3E0A808) << 1, "Continuous frame sequence not completed.");
        }
        if (d2A33i4puy3VG87sLGopuKBa7759W0RD == D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16034) {
            this.Method3123(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2, vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2);
            return;
        }
        if (d2A33i4puy3VG87sLGopuKBa7759W0RD == D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16035) {
            this.Method3121(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2, vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2);
            return;
        }
        this.Field11186.error("non control or continious frame expected");
        throw new rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC((int)((long)-1506999571 ^ (long)-1506999528) << 1, "non control or continious frame expected");
    }

    private void Method3120(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2, vbUsByat2W2VqvGVC3VWwk5FtcMDE72H vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2, D2A33i4puy3VG87sLGopuKBa7759W0RD d2A33i4puy3VG87sLGopuKBa7759W0RD) throws rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC {
        if (d2A33i4puy3VG87sLGopuKBa7759W0RD != D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16033) {
            this.Method3125(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2);
        } else if (vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method76()) {
            this.Method3124(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2, vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2);
        } else if (this.Field11193 == null) {
            this.Field11186.error("Protocol error: Continuous frame sequence was not started.");
            throw new rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC((int)((long)1113878158 ^ (long)1113878395) << 1, "Continuous frame sequence was not started.");
        }
        if (d2A33i4puy3VG87sLGopuKBa7759W0RD == D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16034 && !eVUYg1GWgiUOrS8NdVHqZkr5dmjNAgoA.Method4532(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method82())) {
            this.Field11186.error("Protocol error: Payload is not UTF8");
            throw new rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC((int)-1223065636L ^ 0xB7197C33);
        }
        if (d2A33i4puy3VG87sLGopuKBa7759W0RD != D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16033) return;
        if (this.Field11193 == null) return;
        this.Method3128(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method82());
    }

    private void Method3121(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2, vbUsByat2W2VqvGVC3VWwk5FtcMDE72H vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2) {
        uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Method5216().Method2663(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2, vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method82());
    }

    private void Method3122(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2, RuntimeException runtimeException) {
        this.Field11186.error("Runtime exception during onWebsocketMessage", (Throwable)runtimeException);
        uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Method5216().Method2668(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2, runtimeException);
    }

    private void Method3123(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2, vbUsByat2W2VqvGVC3VWwk5FtcMDE72H vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2) throws rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC {
        uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Method5216().Method2662(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2, eVUYg1GWgiUOrS8NdVHqZkr5dmjNAgoA.Method4530(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method82()));
    }

    private void Method3124(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2, vbUsByat2W2VqvGVC3VWwk5FtcMDE72H vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2) throws rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC {
        if (this.Field11193 == null) {
            this.Field11186.trace("Protocol error: Previous continuous frame sequence not completed.");
            throw new rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC((int)((long)1924861360 ^ (long)1924860997) << 1, "Continuous frame sequence was not started.");
        }
        this.Method3128(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method82());
        this.Method3129();
        if (this.Field11193.Method81() == D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16034) {
            ((twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl)this.Field11193).Method85(this.Method3130());
            ((twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl)this.Field11193).Method84();
            uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Method5216().Method2662(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2, eVUYg1GWgiUOrS8NdVHqZkr5dmjNAgoA.Method4530(this.Field11193.Method82()));
        } else if (this.Field11193.Method81() == D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16035) {
            ((twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl)this.Field11193).Method85(this.Method3130());
            ((twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl)this.Field11193).Method84();
            uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Method5216().Method2663(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2, this.Field11193.Method82());
        }
        this.Field11193 = null;
        this.Method3127();
    }

    private void Method3125(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2) throws rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC {
        if (this.Field11193 != null) {
            this.Field11186.trace("Protocol error: Previous continuous frame sequence not completed.");
            throw new rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC(((int)-1016488401L ^ 0xC3699FDA) << 1, "Previous continuous frame sequence not completed.");
        }
        this.Field11193 = vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2;
        this.Method3128(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2.Method82());
        this.Method3129();
    }

    private void Method3126(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2, vbUsByat2W2VqvGVC3VWwk5FtcMDE72H vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2) {
        int n = (int)277337812L ^ 0x1087D539;
        String string = "";
        if (vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2 instanceof MjqPPsIgrrFE8smKJhGdj08A51foRyqE) {
            MjqPPsIgrrFE8smKJhGdj08A51foRyqE mjqPPsIgrrFE8smKJhGdj08A51foRyqE = (MjqPPsIgrrFE8smKJhGdj08A51foRyqE)vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2;
            n = mjqPPsIgrrFE8smKJhGdj08A51foRyqE.Method95();
            string = mjqPPsIgrrFE8smKJhGdj08A51foRyqE.Method96();
        }
        if (uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Method3337() == OvvNFVp1prZcFYv57XGirjG11JCXathw.Field11647) {
            uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Method5201(n, string, ((int)-2117749140L ^ 0x81C5B66D) != 0);
            return;
        }
        if (this.Method216() == pkFsFgiZykGBET8wx0XXygS5258qy2Bd.Field13230) {
            uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Method5200(n, string, (boolean)((long)-171276491 ^ (long)-171276492));
            return;
        }
        uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Method5204(n, string, ((int)-1034009026L ^ 0xC25E463E) != 0);
    }

    private void Method3127() {
        List list = this.Field11194;
        this.Field11194.clear();
    }

    private void Method3128(ByteBuffer byteBuffer) {
        List list = this.Field11194;
        this.Field11194.add(byteBuffer);
    }

    private void Method3129() throws y8U8oQnw0TUDKkVJGZnF579aaraavvia {
        long l = this.Method3131();
        if (l <= (long)this.Field11197) return;
        this.Method3127();
        this.Field11186.trace("Payload limit reached. Allowed: {} Current: {}", (Object)this.Field11197, (Object)l);
        throw new y8U8oQnw0TUDKkVJGZnF579aaraavvia(this.Field11197);
    }

    @Override
    public pkFsFgiZykGBET8wx0XXygS5258qy2Bd Method216() {
        return pkFsFgiZykGBET8wx0XXygS5258qy2Bd.Field13230;
    }

    @Override
    public String toString() {
        String string = super.toString();
        if (this.Method3102() != null) {
            string = string + " extension: " + this.Method3102().toString();
        }
        if (this.Method3104() == null) return string + " max frame size: " + this.Field11197;
        string = string + " protocol: " + this.Method3104().toString();
        return string + " max frame size: " + this.Field11197;
    }

    public boolean equals(Object object) {
        int n;
        if (this == object) {
            return ((int)-602359928L ^ 0xDC18B789) != 0;
        }
        if (object == null) return ((int)1399969653L ^ 0x5371D775) != 0;
        if (this.getClass() != object.getClass()) {
            return ((int)1399969653L ^ 0x5371D775) != 0;
        }
        p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5 p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl52 = (p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5)object;
        if (this.Field11197 != p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl52.Method3105()) {
            return ((int)-1965170702L ^ 0x8ADDDFF2) != 0;
        }
        if (this.Field11187 != null ? !this.Field11187.equals(p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl52.Method3102()) : p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl52.Method3102() != null) {
            return ((int)-16717230L ^ 0xFF00EA52) != 0;
        }
        if (this.Field11191 != null) {
            n = this.Field11191.equals(p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl52.Method3104());
            return n != 0;
        }
        if (p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl52.Method3104() == null) {
            n = (int)-1681976205L ^ 0x9BBF1472;
            return n != 0;
        }
        n = (int)((long)-939433994 ^ (long)-939433994);
        return n != 0;
    }

    public int hashCode() {
        int n = this.Field11187 != null ? this.Field11187.hashCode() : (int)((long)2025402024 ^ (long)2025402024);
        n = ((int)55820549L ^ 0x353C11A) * n + (this.Field11191 != null ? this.Field11191.hashCode() : (int)-975960460L ^ 0xC5D40674);
        return (int)((long)380321309 ^ (long)380321282) * n + (this.Field11197 ^ this.Field11197 >>> ((int)((long)-496379081 ^ (long)-496379082) << 5));
    }

    private ByteBuffer Method3130() throws y8U8oQnw0TUDKkVJGZnF579aaraavvia {
        long l = 0L;
        List list = this.Field11194;
        for (ByteBuffer byteBuffer2 : this.Field11194) {
            l += (long)byteBuffer2.limit();
        }
        this.Method3129();
        ByteBuffer byteBuffer = ByteBuffer.allocate((int)l);
        Iterator iterator = this.Field11194.iterator();
        while (true) {
            ByteBuffer byteBuffer2;
            if (!iterator.hasNext()) {
                byteBuffer.flip();
                return byteBuffer;
            }
            byteBuffer2 = (ByteBuffer)iterator.next();
            byteBuffer.put(byteBuffer2);
        }
    }

    private long Method3131() {
        long l = 0L;
        List list = this.Field11194;
        Iterator iterator = this.Field11194.iterator();
        while (iterator.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer)iterator.next();
            l += (long)byteBuffer.limit();
        }
        return l;
    }

    static {
        Field11185 = "Connection";
        Field11184 = "Upgrade";
        Field11183 = "Sec-WebSocket-Accept";
        Field11182 = "Sec-WebSocket-Extensions";
        Field11181 = "Sec-WebSocket-Protocol";
        Field11180 = "Sec-WebSocket-Key";
        Field11198 = !p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5.class.desiredAssertionStatus() ? (int)706198383L ^ 0x2A17BB6E : (int)((long)-533344144 ^ (long)-533344144);
    }

    private static String Method223(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1960023647 ^ (long)1960023647);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1728488083L ^ 0x6706A26C);
            int n2 = (int)((long)-2003041587 ^ (long)-2003041646);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-2048953759 ^ (long)-2048971208) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

