/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.Packet
 *  net.minecraftforge.common.MinecraftForge
 */
package lavahack.client;

import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1582;
import lavahack.client.Class1796;
import lavahack.client.Class1895;
import lavahack.client.Class254;
import lavahack.client.Class618;
import net.minecraft.network.Packet;
import net.minecraftforge.common.MinecraftForge;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bJ\u0012\u0010\f\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2={"Lcom/kisman/cc/pingbypass/server/handlers/PacketHandler;", "", "()V", "receive", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "send", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "sendPacketToClient", "", "packet", "Lnet/minecraft/network/Packet;", "sendPacketToServer", "kisman.cc"})
public final class Class1504 {
    private final Class618 Field15049 = new Class618((Class254)Class1895.Field16718, new Predicate[0]);
    private final Class618 Field15050 = new Class618((Class254)new Class1582(this), new Predicate[0]);
    private String Field15051 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method6024(@NotNull @NotNull Packet packet) {
        Intrinsics.checkParameterIsNotNull((Object)packet, (String)"packet");
    }

    public final void Method6025(@NotNull @NotNull Packet packet) {
        Intrinsics.checkParameterIsNotNull((Object)packet, (String)"packet");
    }

    public Class1504() {
        MinecraftForge.EVENT_BUS.register((Object)this);
        Class1796.Field16242.Method706(this.Field15049);
        Class1796.Field16242.Method706(this.Field15050);
    }

    private static String Method6026(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 212;
            cArray2[n] = (char)(cArray[n] ^ (0x2AB5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

