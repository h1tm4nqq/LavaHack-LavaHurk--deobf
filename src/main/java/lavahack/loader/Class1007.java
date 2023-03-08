//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import java.security.*;
import kotlin.jvm.internal.*;
import kotlin.*;
import kotlin.text.*;
import java.lang.reflect.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001?\u0006\u0002" }, d2 = { "initProvider", "", "kisman.cc" })
public final class Class1007
{
    private String Field12328 = "TheKisDevs & LavaHack Development owns you";
    
    public static final void Method4052() {
        final Class161 value = new Class161();
        AccessController.doPrivileged((PrivilegedAction<Object>)new Class1605(value));
        final Method declaredMethod;
        final Method method = declaredMethod = Class.class.getDeclaredMethod("getDeclaredFields0", Boolean.TYPE);
        Intrinsics.checkExpressionValueIsNotNull((Object)declaredMethod, "jvmFields");
        declaredMethod.setAccessible(true);
        final Object invoke = method.invoke(System.class, false);
        if (invoke == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<java.lang.reflect.Field>");
        }
        final Field[] array = (Field[])invoke;
        final int length = array.length;
        int i = 0;
        while (i < length) {
            final Field field = array[i];
            if (field.getName().equals("security")) {
                field.setAccessible(true);
                final String name = field.get(null).getClass().getName();
                Intrinsics.checkExpressionValueIsNotNull((Object)name, "field.get(null)::class.java.name");
                if (StringsKt.startsWith$default(name, "net.futureclient.", false, 2, (Object)null)) {
                    break;
                }
                field.set(null, value);
                break;
            }
            else {
                ++i;
            }
        }
    }
    
    private static String Method4053(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x35A8 ^ 0x36));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
