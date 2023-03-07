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
import lavahack.client.CRmTJ9b7iiDsQDBDX5gE3ONuLh5eWRHr;
import lavahack.client.GgPix2l2IhOV2YPNehltx3kYgn5Hae5d;
import lavahack.client.IMlppUDpZQ26r9KWqHfvhtVaFArUHbNP;
import lavahack.client.W9pvwMpMwIyQgVZYa8Y2nrn3H9pb0ufu;
import lavahack.client.c5C8Nidhqo0zCg0ZubFUIxZ7PBIbYfMx;
import lavahack.client.eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL;
import lavahack.client.ijTjUYtCZk3zmC6eymm538W8CzZfwpHE;
import lavahack.client.ikFh2tmmaEajuvVhfN5Stlzrrra2EacP;
import lavahack.client.mPNKUHesROKSVtFpAZyhLqRAupt8dodO;
import lavahack.client.mcvoWEeKlyBdMLF0IogD6WQBUVysm7gq;

public class XvJxxqnlXJxXOQomdK5bNtsJRYwAjDwH
extends W9pvwMpMwIyQgVZYa8Y2nrn3H9pb0ufu {
    private static final String Field16410;
    private static final String Field16411;
    private static final String Field16412;
    private static final String Field16413;
    private static final String Field16414;
    private static final int Field16415;
    private static final int Field16416;
    private static final byte[] Field16417;
    private static final int Field16418;
    private int Field16419 = (int)((long)-1500994352 ^ (long)-1500994351) << 10;
    private boolean Field16420 = (int)((long)-1532388825 ^ (long)-1532388826);
    private boolean Field16421 = (int)1970205485L ^ 0x756EF32D;
    private Map Field16422 = new LinkedHashMap();
    private Inflater Field16423 = new Inflater(((int)-494661645L ^ 0xE2840FF2) != 0);
    private Deflater Field16424 = new Deflater((int)-453300289L ^ 0x1B04D040, ((int)-1212475312L ^ 0xB7BB1851) != 0);
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
    public void Method2866(GgPix2l2IhOV2YPNehltx3kYgn5Hae5d ggPix2l2IhOV2YPNehltx3kYgn5Hae5d) throws eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL {
        if (!(ggPix2l2IhOV2YPNehltx3kYgn5Hae5d instanceof c5C8Nidhqo0zCg0ZubFUIxZ7PBIbYfMx)) {
            return;
        }
        if (!ggPix2l2IhOV2YPNehltx3kYgn5Hae5d.Method1613() && ggPix2l2IhOV2YPNehltx3kYgn5Hae5d.Method1617() != mPNKUHesROKSVtFpAZyhLqRAupt8dodO.Field11926) {
            return;
        }
        if (ggPix2l2IhOV2YPNehltx3kYgn5Hae5d.Method1617() == mPNKUHesROKSVtFpAZyhLqRAupt8dodO.Field11926 && ggPix2l2IhOV2YPNehltx3kYgn5Hae5d.Method1613()) {
            throw new eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL(((int)1087511815L ^ 0x40D21D38) << 4, "RSV1 bit can only be set for the first frame.");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.Method6874(ggPix2l2IhOV2YPNehltx3kYgn5Hae5d.Method1618().array(), byteArrayOutputStream);
        if (this.Field16423.getRemaining() > 0) {
            this.Field16423 = new Inflater(((int)703115897L ^ 0x29E8B278) != 0);
            this.Method6874(ggPix2l2IhOV2YPNehltx3kYgn5Hae5d.Method1618().array(), byteArrayOutputStream);
        }
        if (ggPix2l2IhOV2YPNehltx3kYgn5Hae5d.Method1612()) {
            this.Method6874(Field16417, byteArrayOutputStream);
            if (this.Field16421) {
                this.Field16423 = new Inflater(((int)578699633L ^ 0x227E4170) != 0);
            }
        }
        ((ikFh2tmmaEajuvVhfN5Stlzrrra2EacP)ggPix2l2IhOV2YPNehltx3kYgn5Hae5d).Method1621(ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), (int)-2106530015L ^ 0x8270E721, byteArrayOutputStream.size()));
    }

    private void Method6874(byte[] byArray, ByteArrayOutputStream byteArrayOutputStream) throws DataFormatException {
        int n;
        this.Field16423.setInput(byArray);
        byte[] byArray2 = new byte[(int)((long)-1077776447 ^ (long)-1077776448) << 10];
        while ((n = this.Field16423.inflate(byArray2)) > 0) {
            byteArrayOutputStream.write(byArray2, (int)((long)1899025764 ^ (long)1899025764), n);
        }
    }

    @Override
    public void Method2867(GgPix2l2IhOV2YPNehltx3kYgn5Hae5d ggPix2l2IhOV2YPNehltx3kYgn5Hae5d) {
        int n;
        if (!(ggPix2l2IhOV2YPNehltx3kYgn5Hae5d instanceof c5C8Nidhqo0zCg0ZubFUIxZ7PBIbYfMx)) {
            return;
        }
        byte[] byArray = ggPix2l2IhOV2YPNehltx3kYgn5Hae5d.Method1618().array();
        if (byArray.length < this.Field16419) {
            return;
        }
        if (!(ggPix2l2IhOV2YPNehltx3kYgn5Hae5d instanceof ijTjUYtCZk3zmC6eymm538W8CzZfwpHE)) {
            ((c5C8Nidhqo0zCg0ZubFUIxZ7PBIbYfMx)ggPix2l2IhOV2YPNehltx3kYgn5Hae5d).Method1623(((int)-975260292L ^ 0xC5DEB57D) != 0);
        }
        this.Field16424.setInput(byArray);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byArray2 = new byte[((int)1696173240L ^ 0x65198CB9) << 10];
        while ((n = this.Field16424.deflate(byArray2, (int)((long)-1304337514 ^ (long)-1304337514), byArray2.length, ((int)-2116066654L ^ 0x81DF62A3) << 1)) > 0) {
            byteArrayOutputStream.write(byArray2, (int)((long)1713249895 ^ (long)1713249895), n);
        }
        byte[] byArray3 = byteArrayOutputStream.toByteArray();
        int n2 = byArray3.length;
        if (ggPix2l2IhOV2YPNehltx3kYgn5Hae5d.Method1612()) {
            if (XvJxxqnlXJxXOQomdK5bNtsJRYwAjDwH.Method6875(byArray3)) {
                n2 -= Field16417.length;
            }
            if (this.Field16420) {
                this.Field16424.end();
                this.Field16424 = new Deflater((int)72705066L ^ 0xFBAA9BD5, ((int)805952399L ^ 0x3009DB8E) != 0);
            }
        }
        ((ikFh2tmmaEajuvVhfN5Stlzrrra2EacP)ggPix2l2IhOV2YPNehltx3kYgn5Hae5d).Method1621(ByteBuffer.wrap(byArray3, (int)357754258L ^ 0x1552E592, n2));
    }

    private static boolean Method6875(byte[] byArray) {
        if (byArray.length < ((int)1016658339L ^ 0x3C98F9A2) << 2) {
            return ((int)-226480010L ^ 0xF2803076) != 0;
        }
        int n = byArray.length;
        int n2 = (int)1373419986L ^ 0x51DCB9D2;
        while (n2 < Field16417.length) {
            if (Field16417[n2] != byArray[n - Field16417.length + n2]) {
                return ((int)391574542L ^ 0x1756F40E) != 0;
            }
            ++n2;
        }
        return (int)((long)1055605035 ^ (long)1055605034) != 0;
    }

    @Override
    public boolean Method2868(String string) {
        String[] stringArray;
        String[] stringArray2 = stringArray = string.split(",");
        int n = stringArray2.length;
        int n2 = (int)((long)1822178066 ^ (long)1822178066);
        while (n2 < n) {
            String string2 = stringArray2[n2];
            mcvoWEeKlyBdMLF0IogD6WQBUVysm7gq mcvoWEeKlyBdMLF0IogD6WQBUVysm7gq2 = mcvoWEeKlyBdMLF0IogD6WQBUVysm7gq.Method3314(string2);
            if ("permessage-deflate".equalsIgnoreCase(mcvoWEeKlyBdMLF0IogD6WQBUVysm7gq2.Method3315())) {
                Map map = mcvoWEeKlyBdMLF0IogD6WQBUVysm7gq2.Method3316();
                this.Field16422.putAll(map);
                if (!this.Field16422.containsKey("client_no_context_takeover")) return ((int)295957585L ^ 0x11A3F450) != 0;
                this.Field16421 = (int)((long)981958394 ^ (long)981958395);
                return ((int)295957585L ^ 0x11A3F450) != 0;
            }
            ++n2;
        }
        return (int)((long)-626931082 ^ (long)-626931082) != 0;
    }

    @Override
    public boolean Method2869(String string) {
        String[] stringArray;
        String[] stringArray2 = stringArray = string.split(",");
        int n = stringArray2.length;
        int n2 = (int)((long)-1828064782 ^ (long)-1828064782);
        while (n2 < n) {
            String string2 = stringArray2[n2];
            mcvoWEeKlyBdMLF0IogD6WQBUVysm7gq mcvoWEeKlyBdMLF0IogD6WQBUVysm7gq2 = mcvoWEeKlyBdMLF0IogD6WQBUVysm7gq.Method3314(string2);
            if ("permessage-deflate".equalsIgnoreCase(mcvoWEeKlyBdMLF0IogD6WQBUVysm7gq2.Method3315())) {
                Map map = mcvoWEeKlyBdMLF0IogD6WQBUVysm7gq2.Method3316();
                return ((int)103311010L ^ 0x62866A3) != 0;
            }
            ++n2;
        }
        return (int)((long)1325821292 ^ (long)1325821292) != 0;
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
    public CRmTJ9b7iiDsQDBDX5gE3ONuLh5eWRHr Method2873() {
        return new XvJxxqnlXJxXOQomdK5bNtsJRYwAjDwH();
    }

    @Override
    public void Method2870(GgPix2l2IhOV2YPNehltx3kYgn5Hae5d ggPix2l2IhOV2YPNehltx3kYgn5Hae5d) throws eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL {
        if (ggPix2l2IhOV2YPNehltx3kYgn5Hae5d instanceof ijTjUYtCZk3zmC6eymm538W8CzZfwpHE) {
            if (ggPix2l2IhOV2YPNehltx3kYgn5Hae5d.Method1613()) throw new IMlppUDpZQ26r9KWqHfvhtVaFArUHbNP("bad rsv RSV1: " + ggPix2l2IhOV2YPNehltx3kYgn5Hae5d.Method1613() + " RSV2: " + ggPix2l2IhOV2YPNehltx3kYgn5Hae5d.Method1614() + " RSV3: " + ggPix2l2IhOV2YPNehltx3kYgn5Hae5d.Method1615());
            if (ggPix2l2IhOV2YPNehltx3kYgn5Hae5d.Method1614()) throw new IMlppUDpZQ26r9KWqHfvhtVaFArUHbNP("bad rsv RSV1: " + ggPix2l2IhOV2YPNehltx3kYgn5Hae5d.Method1613() + " RSV2: " + ggPix2l2IhOV2YPNehltx3kYgn5Hae5d.Method1614() + " RSV3: " + ggPix2l2IhOV2YPNehltx3kYgn5Hae5d.Method1615());
            if (ggPix2l2IhOV2YPNehltx3kYgn5Hae5d.Method1615()) {
                throw new IMlppUDpZQ26r9KWqHfvhtVaFArUHbNP("bad rsv RSV1: " + ggPix2l2IhOV2YPNehltx3kYgn5Hae5d.Method1613() + " RSV2: " + ggPix2l2IhOV2YPNehltx3kYgn5Hae5d.Method1614() + " RSV3: " + ggPix2l2IhOV2YPNehltx3kYgn5Hae5d.Method1615());
            }
        }
        super.Method2870(ggPix2l2IhOV2YPNehltx3kYgn5Hae5d);
    }

    @Override
    public String toString() {
        return "PerMessageDeflateExtension";
    }

    static {
        Field16418 = (int)((long)-1591130476 ^ (long)-1591130475) << 10;
        Field16416 = ((int)-818847641L ^ 0xCF316066) << 15;
        Field16415 = (int)((long)-142025362 ^ (long)-142025361) << 15;
        Field16414 = "client_max_window_bits";
        Field16413 = "server_max_window_bits";
        Field16412 = "client_no_context_takeover";
        Field16411 = "server_no_context_takeover";
        Field16410 = "permessage-deflate";
        byte[] byArray = new byte[(int)((long)-1453932767 ^ (long)-1453932768) << 2];
        byArray[(int)((long)-1330852161 ^ (long)-1330852161)] = (int)-169045754L ^ 0xF5EC9106;
        byArray[(int)((long)577678652 ^ (long)577678653)] = (int)-1491455998L ^ 0xA71A3002;
        byArray[(int)((long)1208627711 ^ (long)1208627710) << 1] = (int)-1738231194L ^ 0x679B4D99;
        byArray[(int)2090758722L ^ 0x7C9E7241] = (int)-1637123582L ^ 0x619485FD;
        Field16417 = byArray;
    }

    private static String Method2875(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)2124076301 ^ (long)2124076301);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-797558701L ^ 0xD07638AC);
            int n2 = (int)((long)1383920494 ^ (long)1383920469);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1912893222 ^ (long)-1912882085) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

