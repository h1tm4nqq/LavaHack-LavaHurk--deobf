/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class351;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class873;
import lavahack.client.Class97;

public class Class1687
extends Class42 {
    public final Class44 Field15837 = this.Method23(new Class44("WaterMark", (Class42)this, true));
    public final Class44 Field15838 = this.Method23(new Class44("Custom Splash Text", (Class42)this, true));
    public final Class44 Field15839 = this.Method23(new Class44("Custom Splash Font", (Class42)this, false).Method313(this::Method6492));
    public final Class44 Field15840 = this.Method23(new Class44("Particles", (Class42)this, false));
    @Class873
    public static Class1687 Field15841;
    private String Field15842 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1687() {
        super("CustomMainMenu", Class97.Field8339);
        super.Method21(true);
    }

    @Override
    public void Method45() {
        Class351.Field9449 = this.Field15837.Method365();
        Class351.Field9450 = this.Field15838.Method365();
        Class351.Field9451 = this.Field15839.Method365();
        Class351.Field9452 = this.Field15840.Method365();
    }

    @Override
    public void Method39() {
        Class351.Field9449 = false;
        Class351.Field9450 = false;
        Class351.Field9451 = false;
        Class351.Field9452 = false;
    }

    private Boolean Method6492() {
        return this.Field15838.Method365();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 115;
            cArray2[n] = (char)(cArray[n] ^ (0x36BB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

