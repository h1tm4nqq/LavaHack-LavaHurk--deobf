//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "run" })
final class Class1948 implements Runnable
{
    final Class1136 Field17002;
    private String Field17003 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public final void run() {
        final Class61 field13148 = this.Field17002.Field13148;
        final Class61 field13149 = this.Field17002.Field13148;
        final double doubleValue = Class61.Method503(this.Field17002.Field13148).get().doubleValue();
        final Number value = Class61.Method503(this.Field17002.Field13148).get();
        Intrinsics.checkExpressionValueIsNotNull((Object)value, "range.get()");
        field13148.Method497(field13149.Method500((float)(doubleValue * value.doubleValue())));
    }
    
    Class1948(final Class1136 field17002) {
        this.Field17002 = field17002;
    }
    
    private static String Method7234(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x29E3 ^ 0x74));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
