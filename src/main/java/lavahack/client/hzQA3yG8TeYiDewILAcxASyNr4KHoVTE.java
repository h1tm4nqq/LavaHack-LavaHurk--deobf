/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

public class hzQA3yG8TeYiDewILAcxASyNr4KHoVTE
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17417 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("MainHandX", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble((long)540246078 ^ 0xBFF000002033803EL), 1.0, (boolean)((long)-1458876712 ^ (long)-1458876712)));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17418 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("MainHandY", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble((long)2147402397 ^ 0xBFF000007FFEC29DL), 1.0, ((int)-217224265L ^ 0xF30D6BB7) != 0));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17419 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("OffHandX", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble((long)741351957 ^ 0xBFF000002C302215L), 1.0, (boolean)((long)-73327609 ^ (long)-73327609)));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17420 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("OffHandY", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble(0xEBD7D70DEB47C92AL ^ 0x5427D70DEB47C92AL), 1.0, (boolean)((long)1695570510 ^ (long)1695570510)));
    public static hzQA3yG8TeYiDewILAcxASyNr4KHoVTE Field17421;
    private int Field17422;

    public hzQA3yG8TeYiDewILAcxASyNr4KHoVTE() {
        super("SmallShield", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
        Field17421 = this;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)605081711 ^ (long)605081711);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-729354298 ^ (long)-729354439);
            int n2 = (int)((long)-1863558483 ^ (long)-1863558440);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1303335732 ^ (long)-1303338911) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

