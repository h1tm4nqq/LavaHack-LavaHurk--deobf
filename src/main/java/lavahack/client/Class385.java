//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import net.minecraft.entity.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class385 implements Supplier
{
    public static final Class385 Field9614;
    private String Field9615 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public Object get() {
        return this.Method1861();
    }
    
    @NotNull
    @NotNull
    public final String Method1861() {
        final StringBuilder append = new StringBuilder().append('[');
        String str;
        if (Class1180.Field13362.Method5349() == null) {
            str = "No targets";
        }
        else {
            final Entity method5349 = Class1180.Field13362.Method5349();
            str = ((method5349 != null) ? method5349.getName() : null);
        }
        return append.append(str).append(']').toString();
    }
    
    static {
        Field9614 = new Class385();
    }
    
    private static String Method1862(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4BD9 ^ 0xEA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
