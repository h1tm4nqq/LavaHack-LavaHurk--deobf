//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class479 implements Supplier
{
    public static final Class479 Field10001;
    private int Field10002;
    
    @Override
    public Object get() {
        return this.Method2230();
    }
    
    public final boolean Method2230() {
        boolean method365;
        if (Class1831.Field16465 != null) {
            final Class44 field16457 = Class1831.Field16465.Field16457;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16457, "CustomFontModule.instance.test");
            method365 = field16457.Method365();
        }
        else {
            method365 = false;
        }
        return method365;
    }
    
    static {
        Field10001 = new Class479();
    }
    
    private static String Method2231(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1FB2 ^ 0x53));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
