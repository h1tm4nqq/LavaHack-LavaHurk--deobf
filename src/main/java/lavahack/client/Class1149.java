//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n?\u0006\u0002\b\u0003" }, d2 = { "<anonymous>", "Lcom/kisman/cc/gui/console/ConsoleGui;", "kotlin.jvm.PlatformType", "invoke" })
final class Class1149 extends Lambda implements Function0
{
    public static final Class1149 Field13191;
    private String Field13192 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Object invoke() {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    }
    
    public final Class264 leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        final Class264 field16261 = Class1796.Field16241.Field16261;
        Intrinsics.checkExpressionValueIsNotNull((Object)field16261, "Kisman.instance.consoleGui");
        return field16261;
    }
    
    Class1149() {
        super(0);
    }
    
    static {
        Field13191 = new Class1149();
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7307 ^ 0x6A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
