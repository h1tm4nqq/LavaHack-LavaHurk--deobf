/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import lavahack.client.GgPix2l2IhOV2YPNehltx3kYgn5Hae5d;
import lavahack.client.J0AgBpF0fbEfiQ22w0wSRAnqCswl7pUP;
import lavahack.client.JrrolQXdSvzfIR6tJeLFww2AqrKCvIOE;
import lavahack.client.QH3uGSQfBc0ruOc2z4SmsFs6BmMxsKDx;
import lavahack.client.RSFg6dFLUSIvw4Aij2xt8JT5ga7mM6T6;
import lavahack.client.UnHOlZyC8x21HqgIfB7ZFiJbO6AiYH2y;
import lavahack.client.VA2stDq1KcAOab9vdgjUTrUWlqRjSFJa;
import lavahack.client.YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL;
import lavahack.client.bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOE;
import lavahack.client.c5C8Nidhqo0zCg0ZubFUIxZ7PBIbYfMx;
import lavahack.client.eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL;
import lavahack.client.iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv;
import lavahack.client.ijTjUYtCZk3zmC6eymm538W8CzZfwpHE;
import lavahack.client.k6qfAI2dl0YQZ6l1TQGutG7w1UXZhj58;
import lavahack.client.kNuY0BY4czM9ovYHzLoYCid0yPUj6xjF;
import lavahack.client.klPBJiYIPRrdqJN2sk9YixrCzUuop5PC;
import lavahack.client.mPNKUHesROKSVtFpAZyhLqRAupt8dodO;
import lavahack.client.rWOxkXahfy879ZWg1QDRw2hroxYTBucF;
import lavahack.client.rumXUXXkGViPNvM3BgPEMGjC3BbdwLpv;
import lavahack.client.vpFCZT43VpbVNYAPEbuutOMSD0jwE5QC;
import lavahack.client.yPdrVYgVLQHAH5qbP97EB6K0a3kc0udr;
import lavahack.client.zXFOJjumKhRpGR2Syhau20e7t9PdKoO2;

public abstract class DkMZhn6HTXSMui7v30mYhxPkVEtejJaC {
    protected YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL Field17682 = null;
    protected mPNKUHesROKSVtFpAZyhLqRAupt8dodO Field17683 = null;
    private String Field17684 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static ByteBuffer Method4392(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(byteBuffer.remaining());
        byte by = (int)((long)-810025495 ^ (long)-810025494) << 4;
        while (true) {
            if (!byteBuffer.hasRemaining()) {
                byteBuffer.position(byteBuffer.position() - byteBuffer2.position());
                return null;
            }
            byte by2 = by;
            by = byteBuffer.get();
            byteBuffer2.put(by);
            int cfr_ignored_0 = (int)((long)401729734 ^ (long)401729739);
        }
    }

    public static String Method4393(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = DkMZhn6HTXSMui7v30mYhxPkVEtejJaC.Method4392(byteBuffer);
        if (byteBuffer2 == null) {
            return null;
        }
        String string = k6qfAI2dl0YQZ6l1TQGutG7w1UXZhj58.Method1097(byteBuffer2.array(), (int)679581391L ^ 0x288196CF, byteBuffer2.limit());
        return string;
    }

    public static zXFOJjumKhRpGR2Syhau20e7t9PdKoO2 Method4394(ByteBuffer byteBuffer, YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL yZ4mfV5LFAyRaH8EvRmw03wALftTjEeL) throws J0AgBpF0fbEfiQ22w0wSRAnqCswl7pUP {
        String string = DkMZhn6HTXSMui7v30mYhxPkVEtejJaC.Method4393(byteBuffer);
        if (string == null) {
            throw new JrrolQXdSvzfIR6tJeLFww2AqrKCvIOE(byteBuffer.capacity() + (((int)1475971953L ^ 0x57F98B70) << 7));
        }
        String[] stringArray = string.split(" ", (int)-1348274323L ^ 0xAFA2F76E);
        if (stringArray.length != ((int)-193611156L ^ 0xF475BA6F)) {
            throw new J0AgBpF0fbEfiQ22w0wSRAnqCswl7pUP();
        }
        zXFOJjumKhRpGR2Syhau20e7t9PdKoO2 zXFOJjumKhRpGR2Syhau20e7t9PdKoO22 = yZ4mfV5LFAyRaH8EvRmw03wALftTjEeL == YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL.Field11414 ? DkMZhn6HTXSMui7v30mYhxPkVEtejJaC.Method4396(stringArray, string) : DkMZhn6HTXSMui7v30mYhxPkVEtejJaC.Method4395(stringArray, string);
        string = DkMZhn6HTXSMui7v30mYhxPkVEtejJaC.Method4393(byteBuffer);
        while (string != null && string.length() > 0) {
            String[] stringArray2 = string.split(":", (int)((long)-747122773 ^ (long)-747122774) << 1);
            if (stringArray2.length != (int)((long)1262278680 ^ (long)1262278681) << 1) {
                throw new J0AgBpF0fbEfiQ22w0wSRAnqCswl7pUP("not an http header");
            }
            if (zXFOJjumKhRpGR2Syhau20e7t9PdKoO22.Method3(stringArray2[(int)-580652673L ^ 0xDD63F17F])) {
                zXFOJjumKhRpGR2Syhau20e7t9PdKoO22.Method6(stringArray2[(int)((long)-1738571889 ^ (long)-1738571889)], zXFOJjumKhRpGR2Syhau20e7t9PdKoO22.Method2(stringArray2[(int)-949194773L ^ 0xC76C6FEB]) + "; " + stringArray2[(int)((long)-1981687734 ^ (long)-1981687733)].replaceFirst("^ +", ""));
            } else {
                zXFOJjumKhRpGR2Syhau20e7t9PdKoO22.Method6(stringArray2[(int)((long)-1581324675 ^ (long)-1581324675)], stringArray2[(int)1954642301L ^ 0x7481797C].replaceFirst("^ +", ""));
            }
            string = DkMZhn6HTXSMui7v30mYhxPkVEtejJaC.Method4393(byteBuffer);
        }
        if (string != null) return zXFOJjumKhRpGR2Syhau20e7t9PdKoO22;
        throw new JrrolQXdSvzfIR6tJeLFww2AqrKCvIOE();
    }

    private static zXFOJjumKhRpGR2Syhau20e7t9PdKoO2 Method4395(String[] stringArray, String string) throws J0AgBpF0fbEfiQ22w0wSRAnqCswl7pUP {
        if (!"GET".equalsIgnoreCase(stringArray[(int)-835502063L ^ 0xCE334011])) {
            Object[] objectArray = new Object[((int)493627124L ^ 0x1D6C26F5) << 1];
            objectArray[(int)((long)-241799639 ^ (long)-241799639)] = stringArray[(int)-1100404855L ^ 0xBE692789];
            objectArray[(int)((long)-1988012071 ^ (long)-1988012072)] = string;
            throw new J0AgBpF0fbEfiQ22w0wSRAnqCswl7pUP(String.format("Invalid request method received: %s Status line: %s", objectArray));
        }
        if (!"HTTP/1.1".equalsIgnoreCase(stringArray[((int)-983572044L ^ 0xC55FE1B5) << 1])) {
            Object[] objectArray = new Object[(int)((long)-118575116 ^ (long)-118575115) << 1];
            objectArray[(int)((long)-2035878650 ^ (long)-2035878650)] = stringArray[((int)899054542L ^ 0x35967BCF) << 1];
            objectArray[(int)((long)916762186 ^ (long)916762187)] = string;
            throw new J0AgBpF0fbEfiQ22w0wSRAnqCswl7pUP(String.format("Invalid status line received: %s Status line: %s", objectArray));
        }
        rumXUXXkGViPNvM3BgPEMGjC3BbdwLpv rumXUXXkGViPNvM3BgPEMGjC3BbdwLpv2 = new rumXUXXkGViPNvM3BgPEMGjC3BbdwLpv();
        rumXUXXkGViPNvM3BgPEMGjC3BbdwLpv2.Method7008(stringArray[(int)((long)449353274 ^ (long)449353275)]);
        return rumXUXXkGViPNvM3BgPEMGjC3BbdwLpv2;
    }

    private static zXFOJjumKhRpGR2Syhau20e7t9PdKoO2 Method4396(String[] stringArray, String string) throws J0AgBpF0fbEfiQ22w0wSRAnqCswl7pUP {
        if (!"101".equals(stringArray[(int)1205981097L ^ 0x47E1CFA8])) {
            Object[] objectArray = new Object[(int)((long)211507259 ^ (long)211507258) << 1];
            objectArray[(int)-1497903396L ^ 0xA6B7CEDC] = stringArray[(int)((long)-282370893 ^ (long)-282370894)];
            objectArray[(int)-270416377L ^ 0xEFE1C606] = string;
            throw new J0AgBpF0fbEfiQ22w0wSRAnqCswl7pUP(String.format("Invalid status code received: %s Status line: %s", objectArray));
        }
        if (!"HTTP/1.1".equalsIgnoreCase(stringArray[(int)((long)-721464766 ^ (long)-721464766)])) {
            Object[] objectArray = new Object[(int)((long)2132529209 ^ (long)2132529208) << 1];
            objectArray[(int)1139918482L ^ 0x43F1C692] = stringArray[(int)((long)-579390640 ^ (long)-579390640)];
            objectArray[(int)((long)1044588386 ^ (long)1044588387)] = string;
            throw new J0AgBpF0fbEfiQ22w0wSRAnqCswl7pUP(String.format("Invalid status line received: %s Status line: %s", objectArray));
        }
        yPdrVYgVLQHAH5qbP97EB6K0a3kc0udr yPdrVYgVLQHAH5qbP97EB6K0a3kc0udr2 = new yPdrVYgVLQHAH5qbP97EB6K0a3kc0udr();
        VA2stDq1KcAOab9vdgjUTrUWlqRjSFJa vA2stDq1KcAOab9vdgjUTrUWlqRjSFJa = yPdrVYgVLQHAH5qbP97EB6K0a3kc0udr2;
        vA2stDq1KcAOab9vdgjUTrUWlqRjSFJa.Method5671(Short.parseShort(stringArray[(int)((long)-1729297141 ^ (long)-1729297142)]));
        vA2stDq1KcAOab9vdgjUTrUWlqRjSFJa.Method5672(stringArray[(int)((long)-1192818993 ^ (long)-1192818994) << 1]);
        return yPdrVYgVLQHAH5qbP97EB6K0a3kc0udr2;
    }

    public abstract bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOE Method4397(QH3uGSQfBc0ruOc2z4SmsFs6BmMxsKDx var1, vpFCZT43VpbVNYAPEbuutOMSD0jwE5QC var2) throws J0AgBpF0fbEfiQ22w0wSRAnqCswl7pUP;

    public abstract bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOE Method4398(QH3uGSQfBc0ruOc2z4SmsFs6BmMxsKDx var1) throws J0AgBpF0fbEfiQ22w0wSRAnqCswl7pUP;

    protected boolean Method4399(iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2) {
        int n;
        if (iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2.Method2("Upgrade").equalsIgnoreCase("websocket") && iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2.Method2("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade")) {
            n = (int)-1146218717L ^ 0xBBAE1722;
            return n != 0;
        }
        n = (int)((long)588376014 ^ (long)588376014);
        return n != 0;
    }

    public abstract ByteBuffer Method4400(GgPix2l2IhOV2YPNehltx3kYgn5Hae5d var1);

    public abstract List Method4401(ByteBuffer var1, boolean var2);

    public abstract List Method4402(String var1, boolean var2);

    public abstract void Method4403(rWOxkXahfy879ZWg1QDRw2hroxYTBucF var1, GgPix2l2IhOV2YPNehltx3kYgn5Hae5d var2) throws eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL;

    public List Method4404(mPNKUHesROKSVtFpAZyhLqRAupt8dodO mPNKUHesROKSVtFpAZyhLqRAupt8dodO2, ByteBuffer byteBuffer, boolean bl) {
        if (mPNKUHesROKSVtFpAZyhLqRAupt8dodO2 != mPNKUHesROKSVtFpAZyhLqRAupt8dodO.Field11928 && mPNKUHesROKSVtFpAZyhLqRAupt8dodO2 != mPNKUHesROKSVtFpAZyhLqRAupt8dodO.Field11927) {
            throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
        }
        c5C8Nidhqo0zCg0ZubFUIxZ7PBIbYfMx c5C8Nidhqo0zCg0ZubFUIxZ7PBIbYfMx2 = null;
        if (this.Field17683 != null) {
            c5C8Nidhqo0zCg0ZubFUIxZ7PBIbYfMx2 = new ijTjUYtCZk3zmC6eymm538W8CzZfwpHE();
        } else {
            this.Field17683 = mPNKUHesROKSVtFpAZyhLqRAupt8dodO2;
            if (mPNKUHesROKSVtFpAZyhLqRAupt8dodO2 == mPNKUHesROKSVtFpAZyhLqRAupt8dodO.Field11928) {
                c5C8Nidhqo0zCg0ZubFUIxZ7PBIbYfMx2 = new UnHOlZyC8x21HqgIfB7ZFiJbO6AiYH2y();
            } else if (mPNKUHesROKSVtFpAZyhLqRAupt8dodO2 == mPNKUHesROKSVtFpAZyhLqRAupt8dodO.Field11927) {
                c5C8Nidhqo0zCg0ZubFUIxZ7PBIbYfMx2 = new RSFg6dFLUSIvw4Aij2xt8JT5ga7mM6T6();
            }
        }
        c5C8Nidhqo0zCg0ZubFUIxZ7PBIbYfMx2.Method1621(byteBuffer);
        c5C8Nidhqo0zCg0ZubFUIxZ7PBIbYfMx2.Method1622(bl);
        c5C8Nidhqo0zCg0ZubFUIxZ7PBIbYfMx2.Method1620();
        if (bl) {
            this.Field17683 = null;
            return Collections.singletonList(c5C8Nidhqo0zCg0ZubFUIxZ7PBIbYfMx2);
        }
        this.Field17683 = mPNKUHesROKSVtFpAZyhLqRAupt8dodO2;
        return Collections.singletonList(c5C8Nidhqo0zCg0ZubFUIxZ7PBIbYfMx2);
    }

    public abstract void Method4405();

    @Deprecated
    @Deprecated
    public List Method4406(iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2, YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL yZ4mfV5LFAyRaH8EvRmw03wALftTjEeL) {
        return this.Method4407(iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2);
    }

    public List Method4407(iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2) {
        return this.Method4409(iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2, ((int)-910658950L ^ 0xC9B8727B) != 0);
    }

    @Deprecated
    @Deprecated
    public List Method4408(iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2, YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL yZ4mfV5LFAyRaH8EvRmw03wALftTjEeL, boolean bl) {
        return this.Method4409(iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2, bl);
    }

    public List Method4409(iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2, boolean bl) {
        Object object;
        Object object2;
        StringBuilder stringBuilder = new StringBuilder(((int)-1693197285L ^ 0x9B13DC02) << 2);
        if (iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2 instanceof QH3uGSQfBc0ruOc2z4SmsFs6BmMxsKDx) {
            stringBuilder.append("GET ").append(((QH3uGSQfBc0ruOc2z4SmsFs6BmMxsKDx)iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2).Method2233()).append(" HTTP/1.1");
        } else {
            if (!(iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2 instanceof vpFCZT43VpbVNYAPEbuutOMSD0jwE5QC)) throw new IllegalArgumentException("unknown role");
            stringBuilder.append("HTTP/1.1 101 ").append(((vpFCZT43VpbVNYAPEbuutOMSD0jwE5QC)iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2).Method2235());
        }
        stringBuilder.append("\r\n");
        Iterator iterator = iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2.Method1();
        while (iterator.hasNext()) {
            object2 = (String)iterator.next();
            object = iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2.Method2((String)object2);
            stringBuilder.append((String)object2);
            stringBuilder.append(": ");
            stringBuilder.append((String)object);
            stringBuilder.append("\r\n");
        }
        stringBuilder.append("\r\n");
        object2 = k6qfAI2dl0YQZ6l1TQGutG7w1UXZhj58.Method1095(stringBuilder.toString());
        object = bl ? iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2.Method4() : null;
        ByteBuffer byteBuffer = ByteBuffer.allocate((object == null ? (int)((long)1130917785 ^ (long)1130917785) : ((Object)object).length) + ((Object)object2).length);
        byteBuffer.put((byte[])object2);
        if (object != null) {
            byteBuffer.put((byte[])object);
        }
        byteBuffer.flip();
        return Collections.singletonList(byteBuffer);
    }

    public abstract klPBJiYIPRrdqJN2sk9YixrCzUuop5PC Method4410(klPBJiYIPRrdqJN2sk9YixrCzUuop5PC var1) throws J0AgBpF0fbEfiQ22w0wSRAnqCswl7pUP;

    public abstract zXFOJjumKhRpGR2Syhau20e7t9PdKoO2 Method4411(QH3uGSQfBc0ruOc2z4SmsFs6BmMxsKDx var1, VA2stDq1KcAOab9vdgjUTrUWlqRjSFJa var2) throws J0AgBpF0fbEfiQ22w0wSRAnqCswl7pUP;

    public abstract List Method4412(ByteBuffer var1) throws eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL;

    public abstract kNuY0BY4czM9ovYHzLoYCid0yPUj6xjF Method4413();

    public abstract DkMZhn6HTXSMui7v30mYhxPkVEtejJaC Method4414();

    public iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv Method4415(ByteBuffer byteBuffer) throws J0AgBpF0fbEfiQ22w0wSRAnqCswl7pUP {
        return DkMZhn6HTXSMui7v30mYhxPkVEtejJaC.Method4394(byteBuffer, this.Field17682);
    }

    public int Method4416(int n) throws eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL {
        if (n >= 0) return n;
        throw new eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL(((int)1912476489L ^ 0x71FE12BC) << 1, "Negative count");
    }

    int Method4417(iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2) {
        String string = iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2.Method2("Sec-WebSocket-Version");
        if (string.length() <= 0) return (int)((long)199448374 ^ (long)-199448375);
        return Integer.parseInt(string.trim());
    }

    public void Method4418(YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL yZ4mfV5LFAyRaH8EvRmw03wALftTjEeL) {
        this.Field17682 = yZ4mfV5LFAyRaH8EvRmw03wALftTjEeL;
    }

    public YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL Method4419() {
        return this.Field17682;
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }

    private static String Method4420(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1032721477L ^ 0xC271EBBB;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)485011470 ^ (long)485011697);
            int n2 = ((int)1085161324L ^ 0x40AE3F6F) << 4;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-948209666 ^ (long)-948228413) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

