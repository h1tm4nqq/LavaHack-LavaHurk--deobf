//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.play.server.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "kotlin.jvm.PlatformType", "invoke" })
final class Class1410 implements Class254
{
    final Class1281 Field14383;
    private String Field14384 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method979(final Object o) {
        this.Method5563((Class544)o);
    }
    
    public final void Method5563(final Class544 class544) {
        Intrinsics.checkExpressionValueIsNotNull((Object)class544, "it");
        if (class544.Method982() instanceof SPacketPlayerPosLook) {
            Class1281.Method5173().gameSettings.keyBindSneak.pressed = true;
            Class1281.Method5193(this.Field14383, true);
        }
    }
    
    Class1410(final Class1281 field14383) {
        this.Field14383 = field14383;
    }
    
    private static String Method5564(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5C2D ^ 0xBC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
