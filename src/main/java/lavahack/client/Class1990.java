//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.text.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0007" }, d2 = { "floatingPointNumber", "Lkotlin/text/Regex;", "parseNumber", "", "value", "", "oldValue", "kisman.cc" })
public final class Class1990
{
    private static final Regex Field17154;
    private int Field17155;
    
    public static final double Method7392(@NotNull @NotNull final String s, final double n) {
        Intrinsics.checkParameterIsNotNull((Object)s, "value");
        return Class1990.Field17154.matches((CharSequence)s) ? Double.parseDouble(s) : n;
    }
    
    static {
        Field17154 = new Regex("^[+-]?([0-9]+([.][0-9]*)?|[.][0-9]+)$");
    }
    
    private static String Method7393(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1D8A ^ 0xEA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
