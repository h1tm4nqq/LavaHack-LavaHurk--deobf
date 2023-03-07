/*
 * Decompiled with CFR 0.152.
 */
package com.kisman.cc.util;

import com.kisman.cc.mixin.mixins.cubic.AccessorClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import lavahack.client.Mfn6q4CSghImbSHHc8QWwi8xpUP1CObE;
import lavahack.client.wtFAtdZe2hwas5EH21Dva0ZvGLD8qnDG;

public final class x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk
extends SecurityManager {
    private static final x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk Field13193 = new x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk();
    private static Class[] Field13194 = Field13193.getClassContext();
    private String Field13195 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk() {
    }

    public static Class Method4652() {
        Field13194 = Field13193.getClassContext();
        if (Field13194.length >= ((int)-450439306L ^ 0xE526D775)) return Field13194[((int)770357096L ^ 0x2DEAB769) << 1];
        return null;
    }

    public static Class Method4653(int n) {
        Field13194 = Field13193.getClassContext();
        if (Field13194.length >= n + ((int)-546269205L ^ 0xDF7097EA)) return Field13194[n];
        return null;
    }

    public static Object Method4654(Class clazz) {
        return new Mfn6q4CSghImbSHHc8QWwi8xpUP1CObE(clazz).Method611(clazz);
    }

    public static Object Method4655(Class clazz, wtFAtdZe2hwas5EH21Dva0ZvGLD8qnDG wtFAtdZe2hwas5EH21Dva0ZvGLD8qnDG2) {
        Mfn6q4CSghImbSHHc8QWwi8xpUP1CObE mfn6q4CSghImbSHHc8QWwi8xpUP1CObE = new Mfn6q4CSghImbSHHc8QWwi8xpUP1CObE(clazz);
        mfn6q4CSghImbSHHc8QWwi8xpUP1CObE.Method607(wtFAtdZe2hwas5EH21Dva0ZvGLD8qnDG2);
        return mfn6q4CSghImbSHHc8QWwi8xpUP1CObE.Method611(clazz);
    }

    public static List Method4656(Class clazz, String string) {
        return new Mfn6q4CSghImbSHHc8QWwi8xpUP1CObE(clazz).Method609(string);
    }

    public static List Method4657(Class clazz, String string, wtFAtdZe2hwas5EH21Dva0ZvGLD8qnDG wtFAtdZe2hwas5EH21Dva0ZvGLD8qnDG2) {
        Mfn6q4CSghImbSHHc8QWwi8xpUP1CObE mfn6q4CSghImbSHHc8QWwi8xpUP1CObE = new Mfn6q4CSghImbSHHc8QWwi8xpUP1CObE(clazz);
        mfn6q4CSghImbSHHc8QWwi8xpUP1CObE.Method607(wtFAtdZe2hwas5EH21Dva0ZvGLD8qnDG2);
        return mfn6q4CSghImbSHHc8QWwi8xpUP1CObE.Method609(string);
    }

    public static List Method4658(Class clazz, String string) {
        return new Mfn6q4CSghImbSHHc8QWwi8xpUP1CObE(clazz).Method610(string);
    }

    public static List Method4659(Class clazz, String string, wtFAtdZe2hwas5EH21Dva0ZvGLD8qnDG wtFAtdZe2hwas5EH21Dva0ZvGLD8qnDG2) {
        Mfn6q4CSghImbSHHc8QWwi8xpUP1CObE mfn6q4CSghImbSHHc8QWwi8xpUP1CObE = new Mfn6q4CSghImbSHHc8QWwi8xpUP1CObE(clazz);
        mfn6q4CSghImbSHHc8QWwi8xpUP1CObE.Method607(wtFAtdZe2hwas5EH21Dva0ZvGLD8qnDG2);
        return mfn6q4CSghImbSHHc8QWwi8xpUP1CObE.Method610(string);
    }

    public static Object Method4660(Class clazz, String string, Object object) {
        Field field = clazz.getDeclaredField(string);
        field.setAccessible((boolean)((long)-889198594 ^ (long)-889198593));
        return field.get(object);
    }

    public static Object Method4661(Class clazz, String string) {
        Field field = clazz.getDeclaredField(string);
        field.setAccessible(((int)2080120361L ^ 0x7BFC1E28) != 0);
        return field.get(null);
    }

    public static Object Method4662(Class clazz, Object object, String string, Class[] classArray, Object ... objectArray) {
        Method method = clazz.getDeclaredMethod(string, classArray);
        method.setAccessible(((int)182687008L ^ 0xAE39521) != 0);
        return method.invoke(object, objectArray);
    }

    public static Object Method4663(Method method, Object object, Object ... objectArray) {
        method.setAccessible(((int)1679978446L ^ 0x64226FCF) != 0);
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

