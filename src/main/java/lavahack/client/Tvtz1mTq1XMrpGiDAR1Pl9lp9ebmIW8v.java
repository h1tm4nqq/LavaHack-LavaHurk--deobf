/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;
import lavahack.client.zXFOJjumKhRpGR2Syhau20e7t9PdKoO2;

public class Tvtz1mTq1XMrpGiDAR1Pl9lp9ebmIW8v
implements zXFOJjumKhRpGR2Syhau20e7t9PdKoO2 {
    private byte[] Field7824;
    private TreeMap Field7825 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    private int Field7826;

    @Override
    public Iterator Method1() {
        return Collections.unmodifiableSet(this.Field7825.keySet()).iterator();
    }

    @Override
    public String Method2(String string) {
        String string2 = (String)this.Field7825.get(string);
        if (string2 != null) return string2;
        return "";
    }

    @Override
    public byte[] Method4() {
        return this.Field7824;
    }

    @Override
    public void Method5(byte[] byArray) {
        this.Field7824 = byArray;
    }

    @Override
    public void Method6(String string, String string2) {
        this.Field7825.put(string, string2);
    }

    @Override
    public boolean Method3(String string) {
        return this.Field7825.containsKey(string);
    }

    private static String Method7(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-2121869222L ^ 0x8186D85A;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)689085359L ^ 0x29129B50);
            int n2 = ((int)-1444798312L ^ 0xA9E220EB) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)441055073 ^ (long)441056388) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

