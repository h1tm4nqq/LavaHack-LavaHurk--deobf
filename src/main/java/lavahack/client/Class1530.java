//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.util.math.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventDamageBlock;", "kotlin.jvm.PlatformType", "invoke" })
final class Class1530 implements Class254
{
    public static final Class1530 Field15155;
    private String Field15156 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method979(final Object o) {
        this.Method6072((Class2087)o);
    }
    
    public final void Method6072(final Class2087 class2087) {
        final Class256 field9152 = Class256.Field9152;
        Intrinsics.checkExpressionValueIsNotNull((Object)class2087, "it");
        final BlockPos method7625 = class2087.Method7625();
        Intrinsics.checkExpressionValueIsNotNull((Object)method7625, "it.blockPos");
        if (field9152.Method1405(method7625, class2087.Method7626())) {
            class2087.Method158();
        }
    }
    
    static {
        Field15155 = new Class1530();
    }
    
    private static String Method6073(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5D6 ^ 0x68));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
