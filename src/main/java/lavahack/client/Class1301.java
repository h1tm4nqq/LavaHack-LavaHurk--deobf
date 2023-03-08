//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.jvm.internal.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "Lcom/kisman/cc/util/enums/FontStyles;", "get" })
final class Class1301 implements Supplier
{
    public static final Class1301 Field13937;
    private String Field13938 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public Object get() {
        return this.Method5270();
    }
    
    @NotNull
    @NotNull
    public final Class1613 Method5270() {
        Class1613 field16457;
        if (Class1831.Field16465 != null) {
            final Class44 field16456 = Class1831.Field16465.Field16456;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16456, "CustomFontModule.instance.style");
            final Enum method341 = field16456.Method341();
            if (method341 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.FontStyles");
            }
            field16457 = (Class1613)method341;
        }
        else {
            field16457 = Class1613.Field15543;
        }
        return field16457;
    }
    
    static {
        Field13937 = new Class1301();
    }
    
    private static String Method5271(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x25AD ^ 0x86));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
