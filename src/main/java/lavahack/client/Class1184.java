/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1215;
import lavahack.client.Class1383;

class Class1184 {
    private String Field13369;
    private String Field13370;
    private boolean Field13371;
    final Class1215 Field13372;
    private String Field13373 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Class1184(Class1215 class1215, String string, String string2, boolean bl) {
        this.Field13372 = class1215;
        this.Field13369 = string;
        this.Field13370 = string2;
        this.Field13371 = bl;
    }

    private String Method4766() {
        return this.Field13369;
    }

    private String Method4767() {
        return this.Field13370;
    }

    private boolean Method4768() {
        return this.Field13371;
    }

    static String Method4769(Class1184 class1184) {
        return class1184.Method4766();
    }

    static String Method4770(Class1184 class1184) {
        return class1184.Method4767();
    }

    static boolean Method4771(Class1184 class1184) {
        return class1184.Method4768();
    }

    Class1184(Class1215 class1215, String string, String string2, boolean bl, Class1383 class1383) {
        this(class1215, string, string2, bl);
    }
}

