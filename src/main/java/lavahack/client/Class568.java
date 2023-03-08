//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class568 implements Supplier
{
    public static final Class568 Field10420;
    private int Field10421;
    
    @Override
    public Object get() {
        return this.Method2511();
    }
    
    public final int Method2511() {
        if (Class1831.Field16465 != null) {
            final Class44 field16462 = Class1831.Field16465.Field16462;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16462, "CustomFontModule.instance.customSize");
            if (field16462.Method365()) {
                final Class44 field16463 = Class1831.Field16465.Field16463;
                Intrinsics.checkExpressionValueIsNotNull((Object)field16463, "CustomFontModule.instance.size");
                return (int)field16463.Method372();
            }
        }
        return 18;
    }
    
    static {
        Field10420 = new Class568();
    }
    
    private static String Method2512(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7E1F ^ 0x8C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
