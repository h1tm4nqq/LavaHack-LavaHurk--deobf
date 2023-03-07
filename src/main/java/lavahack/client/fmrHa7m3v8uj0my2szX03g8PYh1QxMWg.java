/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC;

public class fmrHa7m3v8uj0my2szX03g8PYh1QxMWg
implements Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC {
    private final Object[] Field17300;
    private final Class[] Field17301;
    private String Field17302 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public fmrHa7m3v8uj0my2szX03g8PYh1QxMWg(Object[] objectArray, Class[] classArray) {
        this.Field17300 = objectArray;
        this.Field17301 = classArray;
    }

    @Override
    public Object Method2054(int n) {
        Class clazz = this.Field17301[n];
        Object object = this.Field17300[n];
        Class<?> clazz2 = object.getClass();
        if (clazz.isAssignableFrom(clazz2)) return clazz.cast(object);
        throw new IllegalArgumentException("Argument types don't match: " + clazz.getName() + " " + clazz2.getName());
    }

    private static String Method7480(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-397327180 ^ (long)-397327180);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)203934736L ^ 0xC27CCEF);
            int n2 = (int)((long)1609667133 ^ (long)1609667146) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)104252375L ^ 0x636DAE2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

