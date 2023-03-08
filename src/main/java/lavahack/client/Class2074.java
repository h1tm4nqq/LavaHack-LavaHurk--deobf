//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n?\u0006\u0002\b\u0003" }, d2 = { "<anonymous>", "", "kotlin.jvm.PlatformType", "get" })
final class Class2074 implements Supplier
{
    public static final Class2074 Field17487;
    private String Field17488 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public Object get() {
        return this.Method7615();
    }
    
    public final String Method7615() {
        return Class415.Field9718.Method2015() ? "Stationary" : "Printing";
    }
    
    static {
        Field17487 = new Class2074();
    }
    
    private static String Method7616(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3C24 ^ 0xE1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
