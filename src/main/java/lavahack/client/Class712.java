//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "first", "Lcom/kisman/cc/features/hud/modules/BindList$Element;", "second", "compare" })
final class Class712 implements Comparator
{
    public static final Class712 Field11033;
    private String Field11034 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.Method2977((Class392)o, (Class392)o2);
    }
    
    public final int Method2977(@NotNull @NotNull final Class392 class392, @NotNull @NotNull final Class392 class393) {
        Intrinsics.checkParameterIsNotNull((Object)class392, "first");
        Intrinsics.checkParameterIsNotNull((Object)class393, "second");
        final float n = (float)(Class1178.Method4741(class393.Method1910()) - Class1178.Method4741(class392.Method1910()));
        return (n != 0.0f) ? ((int)n) : class393.Method1910().compareTo(class392.Method1910());
    }
    
    static {
        Field11033 = new Class712();
    }
    
    private static String Method2978(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4CC5 ^ 0xBC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
