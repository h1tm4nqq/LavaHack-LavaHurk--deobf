//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class659 implements Supplier
{
    final Class943 Field10810;
    private String Field10811 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public Object get() {
        return this.Method2835();
    }
    
    public final boolean Method2835() {
        final Class44 method3897 = Class943.Method3897(this.Field10810);
        Intrinsics.checkExpressionValueIsNotNull((Object)method3897, "sneakSpam");
        return method3897.Method365();
    }
    
    Class659(final Class943 field10810) {
        this.Field10810 = field10810;
    }
    
    private static String Method2836(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6E39 ^ 0x93));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
