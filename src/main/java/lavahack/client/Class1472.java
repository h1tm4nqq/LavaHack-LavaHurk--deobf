//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class1472 implements Supplier
{
    public static final Class1472 Field14874;
    private String Field14875 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public Object get() {
        return this.Method5915();
    }
    
    public final boolean Method5915() {
        final Class44 field14437 = Class1416.Field14544.Field14437;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14437, "AutoRer.instance.multiThreaddedSphereGetter");
        if (!field14437.Method365()) {
            final Class44 field14438 = Class1416.Field14544.Field14438;
            Intrinsics.checkExpressionValueIsNotNull((Object)field14438, "AutoRer.instance.multiThreaddedTargetGetter");
            if (!field14438.Method365()) {
                return false;
            }
        }
        return true;
    }
    
    static {
        Field14874 = new Class1472();
    }
    
    private static String Method5916(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6867 ^ 0x6E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
