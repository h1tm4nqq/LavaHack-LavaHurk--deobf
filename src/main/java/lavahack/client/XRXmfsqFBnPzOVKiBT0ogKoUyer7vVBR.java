/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.File;
import java.net.URL;
import lavahack.client.XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR$1;
import lavahack.client.paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF;

public class XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR {
    public static paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF Field15563;
    public static boolean Field15564;
    public static boolean Field15565;
    public static boolean Field15566;
    public static boolean Field15567;
    public static String Field15568;
    private int Field15569;

    public static void Method6296() {
        if (Field15563 == null) return;
        Field15563.Method5021();
        Field15564 = (int)((long)-118611905 ^ (long)-118611906);
        Field15565 = (int)1635904729L ^ 0x6181ECD9;
    }

    public static void Method6297(String string) {
        XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR.Method6302();
        Field15568 = string;
        URL uRL = new URL(string);
        Field15563 = new paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF(uRL);
        Field15563.Method5034((boolean)((long)1616033402 ^ (long)1616033402));
        new Thread(XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR::Method6304).start();
    }

    public static void Method6298(File file) {
        XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR.Method6302();
        Field15563 = new paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF(file);
        Field15563.Method5034(((int)2113463028L ^ 0x7DF8E2F4) != 0);
        new XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR$1().start();
    }

    public static void Method6299() {
        if (Field15563 == null) return;
        Field15563.Method5023();
        Field15564 = (int)72949250L ^ 0x4591E02;
        Field15565 = (int)-1277601547L ^ 0xB3D958F4;
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
        Field15564 = (int)((long)-671938581 ^ (long)-671938581);
        Field15565 = (int)994092607L ^ 0x3B40A63F;
    }

    public static void Method6303(float f) {
        if (Field15563 == null) return;
        Field15563.Method5030((int)f);
    }

    private static void Method6304() {
        Field15563.Method5021();
        Field15564 = (int)((long)1046278321 ^ (long)1046278320);
        Field15565 = (int)((long)455696029 ^ (long)455696029);
    }

    static {
        Field15564 = (int)((long)-1369480055 ^ (long)-1369480055);
        Field15566 = (int)-14219374L ^ 0xFF270793;
        Field15568 = null;
    }
}

