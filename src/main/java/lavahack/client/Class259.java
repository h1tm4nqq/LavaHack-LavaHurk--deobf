//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class259 implements Supplier
{
    final Class991 Field9160;
    private String Field9161 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public Object get() {
        return this.Method1424();
    }
    
    public final boolean Method1424() {
        final Class44 method4013 = this.Field9160.Method4013();
        Intrinsics.checkExpressionValueIsNotNull((Object)method4013, "customY");
        return method4013.Method365();
    }
    
    Class259(final Class991 field9160) {
        this.Field9160 = field9160;
    }
    
    private static String Method1425(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x18BE ^ 0xA9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
