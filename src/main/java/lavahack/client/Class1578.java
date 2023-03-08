//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.jvm.internal.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class1578 implements Supplier
{
    final Class2141 Field15398;
    private String Field15399 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public Object get() {
        return this.Method6217();
    }
    
    @NotNull
    @NotNull
    public final String Method6217() {
        final StringBuilder append = new StringBuilder().append('[');
        final Class44 method7716 = Class2141.Method7716(this.Field15398);
        Intrinsics.checkExpressionValueIsNotNull((Object)method7716, "speedUnit");
        final Enum method7717 = method7716.Method341();
        if (method7717 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.SpeedUnits");
        }
        return append.append(((Class1358)method7717).Method5427()).append(']').toString();
    }
    
    Class1578(final Class2141 field15398) {
        this.Field15398 = field15398;
    }
    
    private static String Method6218(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x67EB ^ 0x9D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
