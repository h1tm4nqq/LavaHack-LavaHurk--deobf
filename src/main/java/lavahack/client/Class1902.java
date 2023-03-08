//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n?\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "<anonymous>", "", "kotlin.jvm.PlatformType", "it", "applyAsDouble", "(Ljava/lang/Double;)Ljava/lang/Double;" })
final class Class1902 implements ToDoubleFunction
{
    public static final Class1902 Field16754;
    private String Field16755 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public double applyAsDouble(final Object o) {
        return this.Method7047((Double)o);
    }
    
    public final Double Method7047(final Double n) {
        Intrinsics.checkExpressionValueIsNotNull((Object)n, "it");
        return n;
    }
    
    static {
        Field16754 = new Class1902();
    }
    
    private static String Method7048(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4A29 ^ 0x36));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
