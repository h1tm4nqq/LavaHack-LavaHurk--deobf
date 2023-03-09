//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketChatMessage
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 *  net.minecraftforge.fml.common.network.FMLNetworkEvent$ClientDisconnectionFromServerEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1397;
import lavahack.client.Class1409;
import lavahack.client.Class1477;
import lavahack.client.Class1796;
import lavahack.client.Class1845;
import lavahack.client.Class254;
import lavahack.client.Class618;
import lavahack.client.Class726;
import lavahack.client.Class96;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketChatMessage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000fH\u0007J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0005j\b\u0012\u0004\u0012\u00020\u0002`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2={"Lcom/kisman/cc/features/pingbypass/serializer/friend/FriendSerializer;", "Lcom/kisman/cc/features/pingbypass/serializer/Serializer;", "Lcom/kisman/cc/event/events/client/friend/FriendEvent;", "()V", "changed", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "friendEvent", "Lme/zero/alpine/listener/Listener;", "clear", "", "onClientTick", "event", "Lnet/minecraftforge/fml/common/gameevent/TickEvent$ClientTickEvent;", "onDisconnect", "Lnet/minecraftforge/fml/common/network/FMLNetworkEvent$ClientDisconnectionFromServerEvent;", "pollFriend", "serializeAndSend", "kisman.cc"})
public final class Class1685
implements Class1397 {
    private final HashSet Field15830 = new HashSet();
    private final Class618 Field15831 = new Class618((Class254)new Class1845(this), new Predicate[0]);
    private String Field15832 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SubscribeEvent
    @SubscribeEvent
    public final void Method6483(@NotNull @NotNull TickEvent.ClientTickEvent clientTickEvent) {
        Intrinsics.checkParameterIsNotNull((Object)clientTickEvent, (String)"event");
        if (Class2142.Field17803.player == null) return;
        if (Class2142.Field17803.player.connection == null) return;
        Collection collection = this.Field15830;
        boolean bl = false;
        if (collection.isEmpty()) return;
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method6484(@NotNull @NotNull FMLNetworkEvent.ClientDisconnectionFromServerEvent clientDisconnectionFromServerEvent) {
        Intrinsics.checkParameterIsNotNull((Object)clientDisconnectionFromServerEvent, (String)"event");
        this.Method6485();
    }

    public final void Method6485() {
        HashSet hashSet = this.Field15830;
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        this.Field15830.clear();
        Class726 class726 = Class726.Field11086;
        Intrinsics.checkExpressionValueIsNotNull((Object)class726, (String)"FriendManager.instance");
        Iterator iterator = class726.Method3039().iterator();
        while (true) {
            String string;
            if (!iterator.hasNext()) {
                Unit unit = Unit.INSTANCE;
                return;
            }
            String string2 = string = (String)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)string2, (String)"friend");
            this.Field15830.add(new Class1477(string2, Class96.Field8334));
        }
    }

    private final Class1477 Method6486() {
        Collection collection = this.Field15830;
        boolean bl = false;
        if (collection.isEmpty()) return null;
        return null;
    }

    public void Method6487(@NotNull @NotNull Class1477 class1477) {
        Intrinsics.checkParameterIsNotNull((Object)class1477, (String)"event");
        if (!Class1409.Field14381.Method35()) return;
        Class2142.Field17803.player.connection.sendPacket((Packet)new CPacketChatMessage("@ServerFriend " + (class1477.Method5919() == Class96.Field8334 ? "add" : "remove") + ' ' + class1477.Method5918()));
    }

    @Override
    public void Method3048(Object object) {
        this.Method6487((Class1477)object);
    }

    public Class1685() {
        Class1796.Field16242.Method706(this.Field15831);
        MinecraftForge.EVENT_BUS.register((Object)this);
    }

    public static final HashSet Method6488(Class1685 class1685) {
        return class1685.Field15830;
    }

    private static String Method6489(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 250;
            cArray2[n] = (char)(cArray[n] ^ (0x1641 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

