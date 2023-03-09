/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package lavahack.client;

import lavahack.client.Class1518;
import lavahack.client.Class1785;
import lavahack.client.Class21;
import lavahack.client.Class684;
import lavahack.client.Class816;
import org.lwjgl.input.Keyboard;

public class Class655 {
    private String Field10802 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static Class21 Method2822(int n) {
        return new Class1785(n);
    }

    public static Class684 Method2823(int n) {
        return new Class1785(n).Method189();
    }

    public static Class816 Method2824(int ... nArray) {
        return new Class1518(nArray);
    }

    public static Class816 Method2825(Class21 ... class21Array) {
        return new Class1518(Class655.Method2828(class21Array));
    }

    public static boolean Method2826(int n) {
        return Class655.Method2827(n);
    }

    private static boolean Method2827(int n) {
        return Keyboard.isKeyDown((int)n);
    }

    private static int[] Method2828(Class21 ... class21Array) {
        int[] nArray = new int[class21Array.length];
        int n = 0;
        while (n < class21Array.length) {
            nArray[n] = class21Array[n].Method188();
            ++n;
        }
        return nArray;
    }

    static boolean Method2829(int n) {
        return Class655.Method2827(n);
    }
}

