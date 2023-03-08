//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.network.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.function.*;
import net.minecraftforge.common.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bJ\u0012\u0010\f\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\r" }, d2 = { "Lcom/kisman/cc/pingbypass/server/handlers/PacketHandler;", "", "()V", "receive", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "send", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "sendPacketToClient", "", "packet", "Lnet/minecraft/network/Packet;", "sendPacketToServer", "kisman.cc" })
public final class Class1504
{
    private final Class618 Field15049;
    private final Class618 Field15050;
    private String Field15051 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final void Method6024(@NotNull @NotNull final Packet packet) {
        Intrinsics.checkParameterIsNotNull((Object)packet, "packet");
    }
    
    public final void Method6025(@NotNull @NotNull final Packet packet) {
        Intrinsics.checkParameterIsNotNull((Object)packet, "packet");
    }
    
    public Class1504() {
        this.Field15049 = new Class618(Class1895.Field16718, new Predicate[0]);
        this.Field15050 = new Class618(new Class1582(this), new Predicate[0]);
        MinecraftForge.EVENT_BUS.register((Object)this);
        Class1796.Field16242.Method706(this.Field15049);
        Class1796.Field16242.Method706(this.Field15050);
    }
    
    private static String Method6026(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2AB5 ^ 0xD4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
