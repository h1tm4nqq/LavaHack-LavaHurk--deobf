/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 */
package lavahack.loader;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.AccessController;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lavahack.loader.Class1605;
import lavahack.loader.Class161;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u00a8\u0006\u0002"}, d2={"initProvider", "", "kisman.cc"})
public final class Class1007 {
    private String Field12328 = "TheKisDevs & LavaHack Development owns you";

    public static final void Method4052() {
        Field field;
        Class161 class161;
        block4: {
            Method method;
            class161 = new Class161();
            AccessController.doPrivileged(new Class1605(class161));
            Method method2 = method = Class.class.getDeclaredMethod("getDeclaredFields0", Boolean.TYPE);
            Intrinsics.checkExpressionValueIsNotNull((Object)method2, (String)"jvmFields");
            method2.setAccessible(true);
            Object object = method.invoke(System.class, false);
            if (object == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<java.lang.reflect.Field>");
            }
            Field[] fieldArray = (Field[])object;
            int n = fieldArray.length;
            int n2 = 0;
            while (n2 < n) {
                field = fieldArray[n2];
                if (field.getName().equals("security")) {
                    field.setAccessible(true);
                    String string = field.get(null).getClass().getName();
                    Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"field.get(null)::class.java.name");
                    if (StringsKt.startsWith$default((String)string, (String)"net.futureclient.", (boolean)false, (int)2, null)) {
                        return;
                    }
                    break block4;
                }
                ++n2;
            }
            return;
        }
        field.set(null, class161);
    }

    private static String Method4053(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 54;
            cArray2[n] = (char)(cArray[n] ^ (0x35A8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

