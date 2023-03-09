/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.event.Class2157;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import lavahack.client.Class1320;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class618;
import lavahack.client.Class672;

public class Class80
implements Class672 {
    private final Map Field8263 = new ConcurrentHashMap();
    private final Map Field8264 = new ConcurrentHashMap();
    private String Field8265 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method705(Class1320 class1320) {
        List list = this.Field8263.computeIfAbsent(class1320, Class80::Method724);
        list.forEach(this::Method706);
    }

    @Override
    public void Method706(Class618 class618) {
        int n;
        List list = this.Field8264.computeIfAbsent(class618.Method2651(), Class80::Method723);
        for (n = 0; n < list.size() && class618.Method2652() <= ((Class618)list.get(n)).Method2652(); ++n) {
        }
        list.add(n, class618);
    }

    @Override
    public void Method710(Class1320 class1320) {
        List list = (List)this.Field8263.get(class1320);
        if (list == null) {
            return;
        }
        this.Field8264.values().forEach(arg_0 -> Class80.Method722(list, arg_0));
    }

    @Override
    public void Method711(Class618 class618) {
        ((List)this.Field8264.get(class618.Method2651())).removeIf(arg_0 -> Class80.Method721(class618, arg_0));
    }

    @Override
    public void Method715(Object object) {
        List list;
        if (object instanceof Class2157 && Class1796.Field16241.Field16283 != null && Class1796.Field16241.Field16251) {
            Class1796.Field16241.Field16283.Method6534("events", ((Class2157)object).Method162());
        }
        if ((list = (List)this.Field8264.get(object.getClass())) == null) return;
        list.forEach(arg_0 -> Class80.Method720(object, arg_0));
    }

    private static boolean Method717(Field field) {
        if (!field.isAnnotationPresent(Class1801.class)) return false;
        if (!Class618.class.isAssignableFrom(field.getType())) return false;
        return true;
    }

    private static Class618 Method718(Class1320 class1320, Field field) {
        boolean bl = field.isAccessible();
        field.setAccessible(true);
        Class618 class618 = (Class618)field.get(class1320);
        field.setAccessible(bl);
        if (class618 != null) return class618;
        return null;
    }

    @Override
    public void Method716(Object object) {
        List list;
        if (object instanceof Class2157 && Class1796.Field16241.Field16283 != null && Class1796.Field16241.Field16251) {
            Class1796.Field16241.Field16283.Method6534("events", ((Class2157)object).Method162());
        }
        if ((list = (List)this.Field8264.get(object.getClass())) == null) return;
        Collections.reverse(list);
        list.forEach(arg_0 -> Class80.Method719(object, arg_0));
    }

    private static void Method719(Object object, Class618 class618) {
        class618.Method979(object);
    }

    private static void Method720(Object object, Class618 class618) {
        class618.Method979(object);
    }

    private static boolean Method721(Class618 class618, Class618 class6182) {
        return class6182.equals(class618);
    }

    private static void Method722(List list, List list2) {
        list2.removeIf(list::contains);
    }

    private static List Method723(Class clazz) {
        return new CopyOnWriteArrayList();
    }

    private static List Method724(Class1320 class1320) {
        return Arrays.stream(class1320.getClass().getDeclaredFields()).filter(Class80::Method717).map(arg_0 -> Class80.Method725(class1320, arg_0)).filter(Objects::nonNull).collect(Collectors.toList());
    }

    private static Class618 Method725(Class1320 class1320, Field field) {
        return Class80.Method718(class1320, field);
    }

    private static String Method726(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 18;
            cArray2[n] = (char)(cArray[n] ^ (0xD50 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

