//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class1656 implements Supplier
{
    final Class1194 Field15710;
    private String Field15711 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public Object get() {
        return this.Method6409();
    }
    
    public final boolean Method6409() {
        final Class44 method4809 = Class1194.Method4809(this.Field15710);
        Intrinsics.checkExpressionValueIsNotNull((Object)method4809, "crystalInfo");
        return method4809.Method365();
    }
    
    Class1656(final Class1194 field15710) {
        this.Field15710 = field15710;
    }
    
    private static String Method6410(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x10A3 ^ 0x62));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
