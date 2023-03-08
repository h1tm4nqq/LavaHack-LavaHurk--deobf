//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import kotlin.*;
import kotlin.jvm.internal.*;
import com.kisman.cc.loader.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "run" })
final class Class1532 implements Runnable
{
    final String Field15159;
    final String Field15160;
    private String Field15161 = "TheKisDevs & LavaHack Development owns you";
    
    @Override
    public final void run() {
        final String method4892 = Class1214.Method4892(this.Field15159);
        Intrinsics.checkExpressionValueIsNotNull((Object)method4892, "Utility.cleaner(key)");
        final String s = "2.0";
        final String method4893 = Class1214.Method4887();
        Intrinsics.checkExpressionValueIsNotNull((Object)method4893, "Utility.properties()");
        final String value = String.valueOf(Runtime.getRuntime().availableProcessors());
        final String method4894 = Class1214.Method4889((Object)this.Field15160);
        Intrinsics.checkExpressionValueIsNotNull((Object)method4894, "Utility.stringFixer(version)");
        Class1204.Method4855(method4892, s, method4893, value, method4894);
    }
    
    Class1532(final String field15159, final String field15160) {
        this.Field15159 = field15159;
        this.Field15160 = field15160;
    }
    
    private static String Method6074(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2B62 ^ 0x37));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
