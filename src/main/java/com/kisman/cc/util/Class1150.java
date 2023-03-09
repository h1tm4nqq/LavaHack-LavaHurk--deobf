/*
 * Decompiled with CFR 0.152.
 */
package com.kisman.cc.util;

import com.kisman.cc.mixin.mixins.cubic.AccessorClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import lavahack.client.Class63;
import lavahack.client.Class750;

public final class Class1150
extends SecurityManager {
    private static final Class1150 Field13193 = new Class1150();
    private static Class[] Field13194 = Field13193.getClassContext();
    private String Field13195 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Class1150() {
    }

    public static Class Method4652() {
        Field13194 = Field13193.getClassContext();
        if (Field13194.length >= 3) return Field13194[2];
        return null;
    }

    public static Class Method4653(int n) {
        Field13194 = Field13193.getClassContext();
        if (Field13194.length >= n + 1) return Field13194[n];
        return null;
    }

    public static Object Method4654(Class clazz) {
        return new Class63(clazz).Method611(clazz);
    }

    public static Object Method4655(Class clazz, Class750 class750) {
        Class63 class63 = new Class63(clazz);
        class63.Method607(class750);
        return class63.Method611(clazz);
    }

    public static List Method4656(Class clazz, String string) {
        return new Class63(clazz).Method609(string);
    }

    public static List Method4657(Class clazz, String string, Class750 class750) {
        Class63 class63 = new Class63(clazz);
        class63.Method607(class750);
        return class63.Method609(string);
    }

    public static List Method4658(Class clazz, String string) {
        return new Class63(clazz).Method610(string);
    }

    public static List Method4659(Class clazz, String string, Class750 class750) {
        Class63 class63 = new Class63(clazz);
        class63.Method607(class750);
        return class63.Method610(string);
    }

    public static Object Method4660(Class clazz, String string, Object object) {
        Field field = clazz.getDeclaredField(string);
        field.setAccessible(true);
        return field.get(object);
    }

    public static Object Method4661(Class clazz, String string) {
        Field field = clazz.getDeclaredField(string);
        field.setAccessible(true);
        return field.get(null);
    }

    public static Object Method4662(Class clazz, Object object, String string, Class[] classArray, Object ... objectArray) {
        Method method = clazz.getDeclaredMethod(string, classArray);
        method.setAccessible(true);
        return method.invoke(object, objectArray);
    }

    public static Object Method4663(Method method, Object object, Object ... objectArray) {
        method.setAccessible(true);
        return method.invoke(object, objectArray);
    }

    public static Method Method4664(Class clazz, String string, Class[] classArray) {
        return clazz.getDeclaredMethod(string, classArray);
    }

    public static Package Method4665(ClassLoader classLoader, String string) {
        return ((AccessorClassLoader)((Object)classLoader)).Method1456(string);
    }

    public static Class Method4666(ClassLoader classLoader, String string) {
        return ((AccessorClassLoader)((Object)classLoader)).Method1455(string);
    }

    public static Class Method4667(ClassLoader classLoader, String string) throws ClassNotFoundException {
        return ((AccessorClassLoader)((Object)classLoader)).Method1457(string);
    }

    public static Class Method4668(ClassLoader classLoader, String string, boolean bl) throws ClassNotFoundException {
        return Class.forName(string, bl, classLoader);
    }
}

