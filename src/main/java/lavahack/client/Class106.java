/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1215;
import lavahack.client.Class1383;

class Class106 {
    private String Field8372;
    private String Field8373;
    final Class1215 Field8374;
    private String Field8375 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Class106(Class1215 class1215, String string, String string2) {
        this.Field8374 = class1215;
        this.Field8372 = string;
        this.Field8373 = string2;
    }

    private String Method820() {
        return this.Field8372;
    }

    private String Method821() {
        return this.Field8373;
    }

    static String Method822(Class106 class106) {
        return class106.Method820();
    }

    static String Method823(Class106 class106) {
        return class106.Method821();
    }

    Class106(Class1215 class1215, String string, String string2, Class1383 class1383) {
        this(class1215, string, string2);
    }
}

