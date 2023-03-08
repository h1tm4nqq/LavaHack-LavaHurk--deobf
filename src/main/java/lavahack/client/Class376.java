//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.play.server.*;
import java.util.*;
import java.util.function.*;
import net.minecraft.network.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "kotlin.jvm.PlatformType", "invoke" })
final class Class376 implements Class254
{
    final Class1347 Field9582;
    private String Field9583 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method979(final Object o) {
        this.Method1833((Class544)o);
    }
    
    public final void Method1833(final Class544 class544) {
        if (Class1347.Method5406().player.onGround) {
            Intrinsics.checkExpressionValueIsNotNull((Object)class544, "it");
            final Packet method982 = class544.Method982();
            if (method982 instanceof SPacketSpawnObject && ((SPacketSpawnObject)method982).getType() == 65) {
                Class1347.Method5406().world.playerEntities.stream().min(Comparator.comparingDouble((ToDoubleFunction<? super Object>)new Class35(method982))).ifPresent((Consumer)new Class30(this, method982));
            }
        }
    }
    
    Class376(final Class1347 field9582) {
        this.Field9582 = field9582;
    }
    
    private static String Method1834(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6156 ^ 0x86));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
