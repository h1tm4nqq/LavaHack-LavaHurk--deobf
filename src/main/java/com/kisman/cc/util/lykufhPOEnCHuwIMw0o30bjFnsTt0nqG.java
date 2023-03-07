/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package com.kisman.cc.util;

import java.lang.reflect.Field;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000@\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u001a\u001a\u0010\u0007\u001a\u00020\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\t\u001a\u00020\n\u001a1\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\u000f\"\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u0010\u001a \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0015\u001a\u0016\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015\u00a8\u0006\u0018"}, d2={"annotationCheck", "", "option", "", "annotation", "Ljava/lang/Class;", "", "changeEnumEntryName", "enum", "name", "", "getField", "Ljava/lang/reflect/Field;", "clazz", "mappings", "", "(Ljava/lang/Class;[Ljava/lang/String;)Ljava/lang/reflect/Field;", "setFinalField", "", "field", "object", "", "value", "setFinalStaticField", "kisman.cc"})
public final class lykufhPOEnCHuwIMw0o30bjFnsTt0nqG {
    private String Field17012 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static final void Method7236(@NotNull @NotNull Field field, @Nullable @Nullable Object object, @NotNull @NotNull Object object2) throws NoSuchFieldException, IllegalAccessException {
        Field field2;
        Intrinsics.checkParameterIsNotNull((Object)field, (String)"field");
        Intrinsics.checkParameterIsNotNull((Object)object2, (String)"value");
        field.setAccessible((boolean)((long)1536588181 ^ (long)1536588180));
        Field field3 = field2 = Field.class.getDeclaredField("modifiers");
        Intrinsics.checkExpressionValueIsNotNull((Object)field3, (String)"modifiersField");
        field3.setAccessible(((int)685994979L ^ 0x28E373E2) != 0);
        field2.setInt(field, field.getModifiers() & ((int)((long)1781185681 ^ (long)1781185680) << 4 ^ (int)((long)-409399541 ^ (long)409399540)));
        field.set(object, object2);
    }

    public static final void Method7237(@NotNull @NotNull Field field, @NotNull @NotNull Object object) throws NoSuchFieldException, IllegalAccessException {
        Intrinsics.checkParameterIsNotNull((Object)field, (String)"field");
        Intrinsics.checkParameterIsNotNull((Object)object, (String)"value");
        lykufhPOEnCHuwIMw0o30bjFnsTt0nqG.Method7236(field, null, object);
    }

    @Nullable
    @Nullable
    public static final Field Method7238(@NotNull @NotNull Class clazz, String ... stringArray) throws NoSuchFieldException {
        Intrinsics.checkParameterIsNotNull((Object)clazz, (String)"clazz");
        Intrinsics.checkParameterIsNotNull((Object)stringArray, (String)"mappings");
        String[] stringArray2 = stringArray;
        int n = stringArray2.length;
        int n2 = (int)-1451767993L ^ 0xA977C747;
        if (n2 < n) {
            String string = stringArray2[n2];
            return clazz.getDeclaredField(string);
        }
        Object[] objectArray = stringArray;
        StringBuilder stringBuilder = new StringBuilder().append("No Such field: ").append(clazz.getName()).append("-> ");
        n2 = (int)1771222497L ^ 0x6992B5E1;
        String string = Arrays.toString(objectArray);
        Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"java.util.Arrays.toString(this)");
        String string2 = string;
        String string3 = stringBuilder.append(string2).toString();
        throw (Throwable)new NoSuchFieldException(string3);
    }

    public static final boolean Method7239(@NotNull @NotNull Enum enum_, @NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)enum_, (String)"enum");
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        Field field = enum_.getClass().getDeclaredField("name");
        int n = (int)727134191L ^ 0x2B572FEF;
        int n2 = (int)-2043049818L ^ 0x863988A6;
        Field field2 = field;
        int n3 = (int)381607151L ^ 0x16BEDCEF;
        Field field3 = field2;
        Intrinsics.checkExpressionValueIsNotNull((Object)field3, (String)"it");
        field3.setAccessible((boolean)((long)48689703 ^ (long)48689702));
        field2.set(enum_, string);
        return (int)((long)1613389130 ^ (long)1613389131) != 0;
    }

    public static final boolean Method7240(@NotNull @NotNull Enum enum_, @NotNull @NotNull Class clazz) {
        Intrinsics.checkParameterIsNotNull((Object)enum_, (String)"option");
        Intrinsics.checkParameterIsNotNull((Object)clazz, (String)"annotation");
        return enum_.getClass().getField(enum_.name()).isAnnotationPresent(clazz);
    }

    private static String Method7241(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1374172581L ^ 0x51E835A5;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-605644145L ^ 0xDBE69A70);
            int n2 = ((int)484086613L ^ 0x1CDA9348) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)906650304L ^ 0x360A6637) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

