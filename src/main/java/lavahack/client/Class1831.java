/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Arrays;
import lavahack.client.Class1303;
import lavahack.client.Class1427;
import lavahack.client.Class1613;
import lavahack.client.Class2167;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;

public class Class1831
extends Class42 {
    public final Class1303 Field16453 = new Class1303("Mode", (Class42)this, Class1427.Field14654).Method5303();
    private final Class44 Field16454 = this.Method23(new Class44("Anti Alias", (Class42)this, true));
    private final Class44 Field16455 = this.Method23(new Class44("Fraction Metrics", (Class42)this, true));
    public final Class44 Field16456 = this.Method23(new Class44("Style", (Class42)this, Class1613.Field15543));
    public final Class44 Field16457 = this.Method23(new Class44("Test", (Class42)this, false));
    public final Class44 Field16458 = this.Method23(new Class44("Test 2", (Class42)this, false));
    public final Class44 Field16459 = this.Method23(new Class44("Multi Line Offset", (Class42)this, Double.longBitsToDouble(0x4000000000000000L), 0.0, Double.longBitsToDouble(4624633867356078080L), true));
    public final Class44 Field16460 = new Class44("Fallback Font", (Class42)this, false);
    public final Class44 Field16461 = new Class44("Fallback Mode", (Class42)this, "Futura", Arrays.asList("Verdana", "Comfortaa", "Comfortaa Light", "Comfortaa Bold", "Consolas", "LexendDeca", "Futura", "SfUi", "Century"));
    public final Class44 Field16462 = this.Method23(new Class44("Custom Size", (Class42)this, false));
    public final Class44 Field16463 = this.Method23(new Class44("Size", (Class42)this, Double.longBitsToDouble(4625759767262920704L), Double.longBitsToDouble((long)1374408160 ^ 0x4014000051EBCDE0L), Double.longBitsToDouble(4629137466983448576L), true).Method313(this.Field16462::Method365));
    public static boolean Field16464 = false;
    public static Class1831 Field16465 = new Class1831();
    private String Field16466 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Class1831() {
        super("CustomFont", "custom font", Class97.Field8339);
        super.Method44(this::Method6899);
        Field16465 = this;
    }

    @Override
    public void Method45() {
        Field16464 = true;
        if (Class2167.Field17910.Method3261() != this.Field16454.Method365()) {
            Class2167.Field17910.Method3259(this.Field16454.Method365());
        }
        if (Class2167.Field17910.Method3262() != this.Field16455.Method365()) {
            Class2167.Field17910.Method3260(this.Field16455.Method365());
            Class2167.Field17910.Method3259(this.Field16454.Method365());
        }
        Class2167.Field17910.Method3265(this.Field16459.Method335());
    }

    @Override
    public void Method39() {
        Field16464 = false;
    }

    private String Method6899() {
        String string;
        StringBuilder stringBuilder = new StringBuilder().append("[").append(this.Field16453.Method359());
        if (this.Field16460.Method365()) {
            string = " | " + this.Field16461.Method359();
            return stringBuilder.append(string).append("]").toString();
        }
        string = "";
        return stringBuilder.append(string).append("]").toString();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 75;
            cArray2[n] = (char)(cArray[n] ^ (0x3B21 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

