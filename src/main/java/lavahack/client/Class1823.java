/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import lavahack.client.Class1260;
import lavahack.client.Class1446;
import lavahack.client.Class1749;
import lavahack.client.Class23;
import lavahack.client.Class475;
import lavahack.client.Class494;
import lavahack.client.Class681;
import lavahack.client.Class799;
import lavahack.client.Class899;
import lavahack.client.Class927;

public class Class1823
extends Class681 {
    private static final String Field16410;
    private static final String Field16411;
    private static final String Field16412;
    private static final String Field16413;
    private static final String Field16414;
    private static final int Field16415;
    private static final int Field16416;
    private static final byte[] Field16417;
    private static final int Field16418;
    private int Field16419 = 1024;
    private boolean Field16420 = true;
    private boolean Field16421 = false;
    private Map Field16422 = new LinkedHashMap();
    private Inflater Field16423 = new Inflater(true);
    private Deflater Field16424 = new Deflater(-1, true);
    private int Field16425;

    public Inflater Method6864() {
        return this.Field16423;
    }

    public void Method6865(Inflater inflater) {
        this.Field16423 = inflater;
    }

    public Deflater Method6866() {
        return this.Field16424;
    }

    public void Method6867(Deflater deflater) {
        this.Field16424 = deflater;
    }

    public int Method6868() {
        return this.Field16419;
    }

    public void Method6869(int n) {
        this.Field16419 = n;
    }

    public boolean Method6870() {
        return this.Field16420;
    }

    public void Method6871(boolean bl) {
        this.Field16420 = bl;
    }

    public boolean Method6872() {
        return this.Field16421;
    }

    public void Method6873(boolean bl) {
        this.Field16421 = bl;
    }

    @Override
    public void Method2866(Class1260 class1260) throws Class23 {
        if (!(class1260 instanceof Class1446)) {
            return;
        }
        if (!class1260.Method1613() && class1260.Method1617() != Class927.Field11926) {
            return;
        }
        if (class1260.Method1617() == Class927.Field11926 && class1260.Method1613()) {
            throw new Class23(1008, "RSV1 bit can only be set for the first frame.");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.Method6874(class1260.Method1618().array(), byteArrayOutputStream);
        if (this.Field16423.getRemaining() > 0) {
            this.Field16423 = new Inflater(true);
            this.Method6874(class1260.Method1618().array(), byteArrayOutputStream);
        }
        if (class1260.Method1612()) {
            this.Method6874(Field16417, byteArrayOutputStream);
            if (this.Field16421) {
                this.Field16423 = new Inflater(true);
            }
        }
        ((Class494)class1260).Method1621(ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size()));
    }

    private void Method6874(byte[] byArray, ByteArrayOutputStream byteArrayOutputStream) throws DataFormatException {
        int n;
        this.Field16423.setInput(byArray);
        byte[] byArray2 = new byte[1024];
        while ((n = this.Field16423.inflate(byArray2)) > 0) {
            byteArrayOutputStream.write(byArray2, 0, n);
        }
    }

    @Override
    public void Method2867(Class1260 class1260) {
        int n;
        if (!(class1260 instanceof Class1446)) {
            return;
        }
        byte[] byArray = class1260.Method1618().array();
        if (byArray.length < this.Field16419) {
            return;
        }
        if (!(class1260 instanceof Class1749)) {
            ((Class1446)class1260).Method1623(true);
        }
        this.Field16424.setInput(byArray);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byArray2 = new byte[1024];
        while ((n = this.Field16424.deflate(byArray2, 0, byArray2.length, 2)) > 0) {
            byteArrayOutputStream.write(byArray2, 0, n);
        }
        byte[] byArray3 = byteArrayOutputStream.toByteArray();
        int n2 = byArray3.length;
        if (class1260.Method1612()) {
            if (Class1823.Method6875(byArray3)) {
                n2 -= Field16417.length;
            }
            if (this.Field16420) {
                this.Field16424.end();
                this.Field16424 = new Deflater(-1, true);
            }
        }
        ((Class494)class1260).Method1621(ByteBuffer.wrap(byArray3, 0, n2));
    }

    private static boolean Method6875(byte[] byArray) {
        if (byArray.length < 4) {
            return false;
        }
        int n = byArray.length;
        int n2 = 0;
        while (n2 < Field16417.length) {
            if (Field16417[n2] != byArray[n - Field16417.length + n2]) {
                return false;
            }
            ++n2;
        }
        return true;
    }

    @Override
    public boolean Method2868(String string) {
        String[] stringArray;
        String[] stringArray2 = stringArray = string.split(",");
        int n = stringArray2.length;
        int n2 = 0;
        while (n2 < n) {
            String string2 = stringArray2[n2];
            Class799 class799 = Class799.Method3314(string2);
            if ("permessage-deflate".equalsIgnoreCase(class799.Method3315())) {
                Map map = class799.Method3316();
                this.Field16422.putAll(map);
                if (!this.Field16422.containsKey("client_no_context_takeover")) return true;
                this.Field16421 = true;
                return true;
            }
            ++n2;
        }
        return false;
    }

    @Override
    public boolean Method2869(String string) {
        String[] stringArray;
        String[] stringArray2 = stringArray = string.split(",");
        int n = stringArray2.length;
        int n2 = 0;
        while (n2 < n) {
            String string2 = stringArray2[n2];
            Class799 class799 = Class799.Method3314(string2);
            if ("permessage-deflate".equalsIgnoreCase(class799.Method3315())) {
                Map map = class799.Method3316();
                return true;
            }
            ++n2;
        }
        return false;
    }

    @Override
    public String Method2871() {
        this.Field16422.put("client_no_context_takeover", "");
        this.Field16422.put("server_no_context_takeover", "");
        return "permessage-deflate; server_no_context_takeover; client_no_context_takeover";
    }

    @Override
    public String Method2872() {
        String string;
        StringBuilder stringBuilder = new StringBuilder().append("permessage-deflate; server_no_context_takeover");
        if (this.Field16421) {
            string = "; client_no_context_takeover";
            return stringBuilder.append(string).toString();
        }
        string = "";
        return stringBuilder.append(string).toString();
    }

    @Override
    public Class899 Method2873() {
        return new Class1823();
    }

    @Override
    public void Method2870(Class1260 class1260) throws Class23 {
        if (class1260 instanceof Class1749) {
            if (class1260.Method1613()) throw new Class475("bad rsv RSV1: " + class1260.Method1613() + " RSV2: " + class1260.Method1614() + " RSV3: " + class1260.Method1615());
            if (class1260.Method1614()) throw new Class475("bad rsv RSV1: " + class1260.Method1613() + " RSV2: " + class1260.Method1614() + " RSV3: " + class1260.Method1615());
            if (class1260.Method1615()) {
                throw new Class475("bad rsv RSV1: " + class1260.Method1613() + " RSV2: " + class1260.Method1614() + " RSV3: " + class1260.Method1615());
            }
        }
        super.Method2870(class1260);
    }

    @Override
    public String toString() {
        return "PerMessageDeflateExtension";
    }

    static {
        Field16418 = 1024;
        Field16416 = 32768;
        Field16415 = 32768;
        Field16414 = "client_max_window_bits";
        Field16413 = "server_max_window_bits";
        Field16412 = "client_no_context_takeover";
        Field16411 = "server_no_context_takeover";
        Field16410 = "permessage-deflate";
        Field16417 = new byte[]{0, 0, -1, -1};
    }

    private static String Method2875(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 59;
            cArray2[n] = (char)(cArray[n] ^ (0x2C81 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

