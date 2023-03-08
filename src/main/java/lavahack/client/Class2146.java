//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.play.server.*;
import net.minecraft.network.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "kotlin.jvm.PlatformType", "invoke" })
final class Class2146 implements Class254
{
    public static final Class2146 Field17818;
    private int Field17819;
    
    @Override
    public void Method979(final Object o) {
        this.Method7728((Class544)o);
    }
    
    public final void Method7728(final Class544 class544) {
        Intrinsics.checkExpressionValueIsNotNull((Object)class544, "it");
        final Packet method982 = class544.Method982();
        if (method982 instanceof SPacketKeepAlive && !Class1409.Method5558(Class1409.Field14381) && ((SPacketKeepAlive)method982).getId() > 0L && ((SPacketKeepAlive)method982).getId() < 1000) {
            Class1409.Field14381.Method5546(System.currentTimeMillis() - Class1409.Field14381.Method5545());
            Class1409.Field14381.Method5548((int)((SPacketKeepAlive)method982).getId());
            Class1409.Field14381.Method5550(Class1409.Field14381.Method5545());
            Class1409.Method5559(Class1409.Field14381, true);
            class544.Method158();
        }
    }
    
    static {
        Field17818 = new Class2146();
    }
    
    private static String Method7729(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7E93 ^ 0xCA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
