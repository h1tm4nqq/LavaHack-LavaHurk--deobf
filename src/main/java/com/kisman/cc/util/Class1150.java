//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.util;

import lavahack.client.*;
import java.util.*;
import java.lang.reflect.*;
import com.kisman.cc.mixin.mixins.cubic.*;

public final class Class1150 extends SecurityManager
{
    private static final Class1150 Field13193;
    private static Class[] Field13194;
    private String Field13195 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1150() {
    }
    
    public static Class Method4652() {
        Class1150.Field13194 = Class1150.Field13193.getClassContext();
        if (Class1150.Field13194.length < 3) {
            return null;
        }
        return Class1150.Field13194[2];
    }
    
    public static Class Method4653(final int n) {
        Class1150.Field13194 = Class1150.Field13193.getClassContext();
        if (Class1150.Field13194.length < n + 1) {
            return null;
        }
        return Class1150.Field13194[n];
    }
    
    public static Object Method4654(final Class clazz) {
        return new Class63(clazz).Method611(clazz);
    }
    
    public static Object Method4655(final Class clazz, final Class750 class750) {
        final Class63 class751 = new Class63(clazz);
        class751.Method607(class750);
        return class751.Method611(clazz);
    }
    
    public static List Method4656(final Class clazz, final String s) {
        return new Class63(clazz).Method609(s);
    }
    
    public static List Method4657(final Class clazz, final String s, final Class750 class750) {
        final Class63 class751 = new Class63(clazz);
        class751.Method607(class750);
        return class751.Method609(s);
    }
    
    public static List Method4658(final Class clazz, final String s) {
        return new Class63(clazz).Method610(s);
    }
    
    public static List Method4659(final Class clazz, final String s, final Class750 class750) {
        final Class63 class751 = new Class63(clazz);
        class751.Method607(class750);
        return class751.Method610(s);
    }
    
    public static Object Method4660(final Class clazz, final String name, final Object obj) {
        final Field declaredField = clazz.getDeclaredField(name);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }
    
    public static Object Method4661(final Class clazz, final String name) {
        final Field declaredField = clazz.getDeclaredField(name);
        declaredField.setAccessible(true);
        return declaredField.get(null);
    }
    
    public static Object Method4662(final Class clazz, final Object obj, final String name, final Class[] parameterTypes, final Object... args) {
        final Method declaredMethod = clazz.getDeclaredMethod(name, (Class[])parameterTypes);
        declaredMethod.setAccessible(true);
        return declaredMethod.invoke(obj, args);
    }
    
    public static Object Method4663(final Method method, final Object obj, final Object... args) {
        method.setAccessible(true);
        return method.invoke(obj, args);
    }
    
    public static Method Method4664(final Class clazz, final String name, final Class[] parameterTypes) {
        return clazz.getDeclaredMethod(name, (Class[])parameterTypes);
    }
    
    public static Package Method4665(final ClassLoader classLoader, final String s) {
        return ((AccessorClassLoader)classLoader).Method1456(s);
    }
    
    public static Class Method4666(final ClassLoader classLoader, final String s) {
        return ((AccessorClassLoader)classLoader).Method1455(s);
    }
    
    public static Class Method4667(final ClassLoader classLoader, final String s) throws ClassNotFoundException {
        return ((AccessorClassLoader)classLoader).Method1457(s);
    }
    
    public static Class Method4668(final ClassLoader loader, final String name, final boolean initialize) throws ClassNotFoundException {
        return Class.forName(name, initialize, loader);
    }
    
    static {
        Field13193 = new Class1150();
        Class1150.Field13194 = Class1150.Field13193.getClassContext();
    }
}
