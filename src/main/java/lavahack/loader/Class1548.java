/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import lavahack.loader.Class1230;
import lavahack.loader.Class1236;
import lavahack.loader.Class1252;
import lavahack.loader.Class1333;
import lavahack.loader.Class1683;
import lavahack.loader.Class1926;
import lavahack.loader.Class1966;
import lavahack.loader.Class26;
import lavahack.loader.Class359;
import lavahack.loader.Class902;
import lavahack.loader.Class977;

public abstract class Class1548
implements Class977 {
    private Class1683 Field15225;
    private String Field15226 = "TheKisDevs & LavaHack Development owns you";

    @Override
    public Class1333 Method2659(Class1966 class1966, Class26 class26, Class359 class359) throws Class902 {
        return new Class1230();
    }

    @Override
    public void Method2660(Class1966 class1966, Class359 class359, Class1236 class1236) throws Class902 {
    }

    @Override
    public void Method2661(Class1966 class1966, Class359 class359) throws Class902 {
    }

    @Override
    public void Method2669(Class1966 class1966, Class1926 class1926) {
        class1966.Method3325(new Class1252((Class1683)class1926));
    }

    @Override
    public void Method2671(Class1966 class1966, Class1926 class1926) {
    }

    @Override
    public Class1683 Method2670(Class1966 class1966) {
        if (this.Field15225 != null) return this.Field15225;
        this.Field15225 = new Class1683();
        return this.Field15225;
    }
}

