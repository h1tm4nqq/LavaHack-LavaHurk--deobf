//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n?\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "<anonymous>", "", "kotlin.jvm.PlatformType", "it", "applyAsDouble", "(Ljava/lang/Double;)Ljava/lang/Double;" })
final class Class690 implements ToDoubleFunction
{
    public static final Class690 Field10911;
    private String Field10912 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public double applyAsDouble(final Object o) {
        return this.Method2901((Double)o);
    }
    
    public final Double Method2901(final Double n) {
        Intrinsics.checkExpressionValueIsNotNull((Object)n, "it");
        return n;
    }
    
    static {
        Field10911 = new Class690();
    }
    
    private static String Method2902(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1E5E ^ 0x42));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
