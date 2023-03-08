//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import com.kisman.cc.event.*;
import java.lang.reflect.*;
import java.lang.annotation.*;
import java.util.concurrent.*;
import java.util.*;
import java.util.stream.*;

public class Class80 implements Class672
{
    private final Map Field8263;
    private final Map Field8264;
    private String Field8265 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class80() {
        this.Field8263 = new ConcurrentHashMap();
        this.Field8264 = new ConcurrentHashMap();
    }
    
    public void Method705(final Class1320 key) {
        this.Field8263.computeIfAbsent(key, Class80::Method724).forEach(this::Method706);
    }
    
    public void Method706(final Class618 class618) {
        List<Class618> list;
        int n;
        for (list = this.Field8264.computeIfAbsent(class618.Method2651(), Class80::Method723), n = 0; n < list.size() && class618.Method2652() <= list.get(n).Method2652(); ++n) {}
        list.add(n, class618);
    }
    
    public void Method710(final Class1320 class1320) {
        final List list = this.Field8263.get(class1320);
        if (list == null) {
            return;
        }
        this.Field8264.values().forEach(Class80::Method722);
    }
    
    public void Method711(final Class618 class618) {
        this.Field8264.get(class618.Method2651()).removeIf(Class80::Method721);
    }
    
    public void Method715(final Object o) {
        if (o instanceof Class2157 && Class1796.Field16241.Field16283 != null && Class1796.Field16241.Field16251) {
            Class1796.Field16241.Field16283.Method6534("events", ((Class2157)o).Method162());
        }
        final List list = this.Field8264.get(o.getClass());
        if (list != null) {
            list.forEach(Class80::Method720);
        }
    }
    
    private static boolean Method717(final Field field) {
        return field.isAnnotationPresent((Class<? extends Annotation>)Class1801.class) && Class618.class.isAssignableFrom(field.getType());
    }
    
    private static Class618 Method718(final Class1320 obj, final Field field) {
        final boolean accessible = field.isAccessible();
        field.setAccessible(true);
        final Class618 class618 = (Class618)field.get(obj);
        field.setAccessible(accessible);
        if (class618 == null) {
            return null;
        }
        return class618;
    }
    
    public void Method716(final Object o) {
        if (o instanceof Class2157 && Class1796.Field16241.Field16283 != null && Class1796.Field16241.Field16251) {
            Class1796.Field16241.Field16283.Method6534("events", ((Class2157)o).Method162());
        }
        final List<?> list = this.Field8264.get(o.getClass());
        if (list != null) {
            Collections.reverse(list);
            list.forEach(Class80::Method719);
        }
    }
    
    private static void Method719(final Object o, final Class618 class618) {
        class618.Method979(o);
    }
    
    private static void Method720(final Object o, final Class618 class618) {
        class618.Method979(o);
    }
    
    private static boolean Method721(final Class618 obj, final Class618 class618) {
        return class618.equals(obj);
    }
    
    private static void Method722(final List list, final List list2) {
        list2.removeIf(list::contains);
    }
    
    private static List Method723(final Class clazz) {
        return new CopyOnWriteArrayList();
    }
    
    private static List Method724(final Class1320 class1320) {
        return Arrays.stream(class1320.getClass().getDeclaredFields()).filter(Class80::Method717).map((Function<? super Field, ?>)Class80::Method725).filter(Objects::nonNull).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList());
    }
    
    private static Class618 Method725(final Class1320 class1320, final Field field) {
        return Method718(class1320, field);
    }
    
    private static String Method726(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xD50 ^ 0x12));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
