//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.util;

import kotlin.*;
import java.lang.reflect.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;
import java.lang.annotation.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000@\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u001a\u001a\u0010\u0007\u001a\u00020\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\t\u001a\u00020\n\u001a1\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\u000f\"\u0004\u0018\u00010\n?\u0006\u0002\u0010\u0010\u001a \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0015\u001a\u0016\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015?\u0006\u0018" }, d2 = { "annotationCheck", "", "option", "", "annotation", "Ljava/lang/Class;", "", "changeEnumEntryName", "enum", "name", "", "getField", "Ljava/lang/reflect/Field;", "clazz", "mappings", "", "(Ljava/lang/Class;[Ljava/lang/String;)Ljava/lang/reflect/Field;", "setFinalField", "", "field", "object", "", "value", "setFinalStaticField", "kisman.cc" })
public final class Class1952
{
    private String Field17012 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static final void Method7236(@NotNull @NotNull final Field obj, @Nullable @Nullable final Object obj2, @NotNull @NotNull final Object value) throws NoSuchFieldException, IllegalAccessException {
        Intrinsics.checkParameterIsNotNull((Object)obj, "field");
        Intrinsics.checkParameterIsNotNull(value, "value");
        obj.setAccessible(true);
        final Field declaredField;
        final Field field = declaredField = Field.class.getDeclaredField("modifiers");
        Intrinsics.checkExpressionValueIsNotNull((Object)declaredField, "modifiersField");
        declaredField.setAccessible(true);
        field.setInt(obj, obj.getModifiers() & 0xFFFFFFEF);
        obj.set(obj2, value);
    }
    
    public static final void Method7237(@NotNull @NotNull final Field field, @NotNull @NotNull final Object o) throws NoSuchFieldException, IllegalAccessException {
        Intrinsics.checkParameterIsNotNull((Object)field, "field");
        Intrinsics.checkParameterIsNotNull(o, "value");
        Method7236(field, null, o);
    }
    
    @Nullable
    @Nullable
    public static final Field Method7238(@NotNull @NotNull final Class clazz, @NotNull @NotNull final String... a) throws NoSuchFieldException {
        Intrinsics.checkParameterIsNotNull((Object)clazz, "clazz");
        Intrinsics.checkParameterIsNotNull((Object)a, "mappings");
        final int length = a.length;
        final int n = 0;
        if (n < length) {
            return clazz.getDeclaredField(a[n]);
        }
        final StringBuilder append = new StringBuilder().append("No Such field: ").append(clazz.getName()).append("-> ");
        final String string = Arrays.toString(a);
        Intrinsics.checkExpressionValueIsNotNull((Object)string, "java.util.Arrays.toString(this)");
        throw new NoSuchFieldException(append.append(string).toString());
    }
    
    public static final boolean Method7239(@NotNull @NotNull final Enum obj, @NotNull @NotNull final String value) {
        Intrinsics.checkParameterIsNotNull((Object)obj, "enum");
        Intrinsics.checkParameterIsNotNull((Object)value, "name");
        final Field declaredField;
        final Field field = declaredField = obj.getClass().getDeclaredField("name");
        Intrinsics.checkExpressionValueIsNotNull((Object)declaredField, "it");
        declaredField.setAccessible(true);
        field.set(obj, value);
        return true;
    }
    
    public static final boolean Method7240(@NotNull @NotNull final Enum enum1, @NotNull @NotNull final Class annotationClass) {
        Intrinsics.checkParameterIsNotNull((Object)enum1, "option");
        Intrinsics.checkParameterIsNotNull((Object)annotationClass, "annotation");
        return enum1.getClass().getField(enum1.name()).isAnnotationPresent(annotationClass);
    }
    
    private static String Method7241(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x9EE ^ 0x3A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
