//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class2152 implements Supplier
{
    public static final Class2152 Field17847;
    private String Field17848 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public Object get() {
        return this.Method7742();
    }
    
    public final int Method7742() {
        if (Class1831.Field16465 != null) {
            final Class44 field16462 = Class1831.Field16465.Field16462;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16462, "CustomFontModule.instance.customSize");
            if (field16462.Method365()) {
                final Class44 field16463 = Class1831.Field16465.Field16463;
                Intrinsics.checkExpressionValueIsNotNull((Object)field16463, "CustomFontModule.instance.size");
                return (int)field16463.Method371();
            }
        }
        return 18;
    }
    
    static {
        Field17847 = new Class2152();
    }
    
    private static String Method7743(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3BF7 ^ 0xF0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
