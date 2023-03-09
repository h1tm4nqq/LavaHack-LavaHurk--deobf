/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.File;
import java.net.URL;
import lavahack.client.Class1091;
import lavahack.client.Class1251;

public class Class1617 {
    public static Class1251 Field15563;
    public static boolean Field15564;
    public static boolean Field15565;
    public static boolean Field15566;
    public static boolean Field15567;
    public static String Field15568;
    private int Field15569;

    public static void Method6296() {
        if (Field15563 == null) return;
        Field15563.Method5021();
        Field15564 = true;
        Field15565 = false;
    }

    public static void Method6297(String string) {
        Class1617.Method6302();
        Field15568 = string;
        URL uRL = new URL(string);
        Field15563 = new Class1251(uRL);
        Field15563.Method5034(false);
        new Thread(Class1617::Method6304).start();
    }

    public static void Method6298(File file) {
        Class1617.Method6302();
        Field15563 = new Class1251(file);
        Field15563.Method5034(false);
        new Class1091().start();
    }

    public static void Method6299() {
        if (Field15563 == null) return;
        Field15563.Method5023();
        Field15564 = false;
        Field15565 = true;
    }

    public static boolean Method6300() {
        return Field15567;
    }

    public static boolean Method6301() {
        return Field15566;
    }

    public static void Method6302() {
        if (Field15563 == null) return;
        Field15563.Method5025();
        Field15563 = null;
        Field15568 = null;
        Field15564 = false;
        Field15565 = false;
    }

    public static void Method6303(float f) {
        if (Field15563 == null) return;
        Field15563.Method5030((int)f);
    }

    private static void Method6304() {
        Field15563.Method5021();
        Field15564 = true;
        Field15565 = false;
    }

    static {
        Field15564 = false;
        Field15566 = true;
        Field15568 = null;
    }
}

