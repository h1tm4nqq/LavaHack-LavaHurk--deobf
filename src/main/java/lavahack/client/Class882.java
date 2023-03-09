/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import lavahack.client.Class63;

public final class Class882 {
    private String Field11711 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static List Method3681(Class clazz, String string) {
        return new Class63(clazz).Method609(string);
    }

    public static List Method3682(Class clazz, String string) {
        return new Class63(clazz).Method610(string);
    }

    public static void Method3683(List list, Class clazz, String string, Function function) {
        List list2 = new Class63(clazz).Method609(string);
        Iterator iterator = list2.iterator();
        while (iterator.hasNext()) {
            Object e = iterator.next();
            list.add(function.apply(e));
        }
    }

    public static void Method3684(List list, Class clazz, String string, Function function) {
        List list2 = new Class63(clazz).Method610(string);
        Iterator iterator = list2.iterator();
        while (iterator.hasNext()) {
            Object e = iterator.next();
            list.add(function.apply(e));
        }
    }
}

