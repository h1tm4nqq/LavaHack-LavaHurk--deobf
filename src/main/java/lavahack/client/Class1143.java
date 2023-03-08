//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n?\u0006\u0002\b\u0003" }, d2 = { "<anonymous>", "Lcom/kisman/cc/gui/hudeditor/HalqHudGui;", "kotlin.jvm.PlatformType", "invoke" })
final class Class1143 extends Lambda implements Function0
{
    public static final Class1143 Field13164;
    private int Field13165;
    
    public Object invoke() {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    }
    
    public final Class1748 leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        final Class1748 field16263 = Class1796.Field16241.Field16263;
        Intrinsics.checkExpressionValueIsNotNull((Object)field16263, "Kisman.instance.halqHudGui");
        return field16263;
    }
    
    Class1143() {
        super(0);
    }
    
    static {
        Field13164 = new Class1143();
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x459F ^ 0x3B));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
