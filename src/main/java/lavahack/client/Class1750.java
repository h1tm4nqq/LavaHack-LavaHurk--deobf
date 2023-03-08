//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.play.server.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "kotlin.jvm.PlatformType", "invoke" })
final class Class1750 implements Class254
{
    public static final Class1750 Field16028;
    private String Field16029 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method979(final Object o) {
        this.Method6674((Class544)o);
    }
    
    public final void Method6674(final Class544 class544) {
        final Class44 method6762 = Class1783.Method6762(Class1783.Field16200);
        Intrinsics.checkExpressionValueIsNotNull((Object)method6762, "time");
        if (method6762.Method365()) {
            Intrinsics.checkExpressionValueIsNotNull((Object)class544, "it");
            if (class544.Method982() instanceof SPacketTimeUpdate) {
                class544.Method158();
            }
        }
    }
    
    static {
        Field16028 = new Class1750();
    }
    
    private static String Method6675(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3F96 ^ 0xAA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
