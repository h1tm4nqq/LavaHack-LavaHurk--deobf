/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.lang.reflect.Field;
import java.util.Arrays;
import lavahack.client.Class1796;
import lavahack.client.Class2002;
import lavahack.client.Class44;
import lavahack.client.Class614;

public class Class1571 {
    private String Field15326 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method6196(Object object) {
        if (object.getClass().getAnnotation(Class614.class) == null) {
            return;
        }
        Arrays.stream(object.getClass().getDeclaredFields()).filter(Class1571::Method6199).filter(Class1571::Method6198).forEach(arg_0 -> Class1571.Method6197(object, arg_0));
    }

    private static void Method6197(Object object, Field field) {
        field.setAccessible(true);
        Class1796.Field16241.Field16258.Method7569((Class44)field.get(object));
    }

    private static boolean Method6198(Field field) {
        return Class44.class.isAssignableFrom(field.getType());
    }

    private static boolean Method6199(Field field) {
        if (field.isAnnotationPresent(Class2002.class)) return false;
        return true;
    }
}

