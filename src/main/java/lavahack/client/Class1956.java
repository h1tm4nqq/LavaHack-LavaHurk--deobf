//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3)
final class Class1956 implements Consumer
{
    private final Function1 Field17023;
    private int Field17024;
    
    Class1956(final Function1 field17023) {
        this.Field17023 = field17023;
    }
    
    @Override
    public final void accept(final Object o) {
        Intrinsics.checkExpressionValueIsNotNull(this.Field17023.invoke(o), "invoke(...)");
    }
    
    private static String Method7270(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x17C5 ^ 0xE9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
