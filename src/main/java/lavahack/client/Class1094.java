//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.play.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "kotlin.jvm.PlatformType", "invoke" })
final class Class1094 implements Class254
{
    final Class198 Field12930;
    private int Field12931;
    
    @Override
    public void Method979(final Object o) {
        this.Method4484((Class805)o);
    }
    
    public final void Method4484(final Class805 class805) {
        Intrinsics.checkExpressionValueIsNotNull((Object)class805, "it");
        if (class805.Method982() instanceof CPacketConfirmTeleport) {
            final Class44 method1183 = Class198.Method1183(this.Field12930);
            Intrinsics.checkExpressionValueIsNotNull((Object)method1183, "godMode");
            if (method1183.Method365()) {
                class805.Method158();
            }
        }
    }
    
    Class1094(final Class198 field12930) {
        this.Field12930 = field12930;
    }
    
    private static String Method4485(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5E6E ^ 0xC0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
