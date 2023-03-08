//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import java.awt.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class758 implements Supplier
{
    final Font Field11212;
    private String Field11213 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public Object get() {
        return this.Method3139();
    }
    
    public final int Method3139() {
        if (Class1831.Field16465 != null) {
            final Class44 field16462 = Class1831.Field16465.Field16462;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16462, "CustomFontModule.instance.customSize");
            if (field16462.Method365()) {
                final Class44 field16463 = Class1831.Field16465.Field16463;
                Intrinsics.checkExpressionValueIsNotNull((Object)field16463, "CustomFontModule.instance.size");
                return field16463.Method335();
            }
        }
        return this.Field11212.getSize();
    }
    
    Class758(final Font field11212) {
        this.Field11212 = field11212;
    }
    
    private static String Method3140(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xE17 ^ 0x6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
