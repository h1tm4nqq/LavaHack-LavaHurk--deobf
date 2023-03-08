//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.fml.common.gameevent.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import com.kisman.cc.util.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.fml.common.network.*;
import kotlin.*;
import java.util.*;
import net.minecraft.network.*;
import net.minecraft.network.play.client.*;
import java.util.function.*;
import net.minecraftforge.common.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005?\u0006\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000fH\u0007J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0005j\b\u0012\u0004\u0012\u00020\u0002`\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bX\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0012" }, d2 = { "Lcom/kisman/cc/features/pingbypass/serializer/friend/FriendSerializer;", "Lcom/kisman/cc/features/pingbypass/serializer/Serializer;", "Lcom/kisman/cc/event/events/client/friend/FriendEvent;", "()V", "changed", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "friendEvent", "Lme/zero/alpine/listener/Listener;", "clear", "", "onClientTick", "event", "Lnet/minecraftforge/fml/common/gameevent/TickEvent$ClientTickEvent;", "onDisconnect", "Lnet/minecraftforge/fml/common/network/FMLNetworkEvent$ClientDisconnectionFromServerEvent;", "pollFriend", "serializeAndSend", "kisman.cc" })
public final class Class1685 implements Class1397
{
    private final HashSet Field15830;
    private final Class618 Field15831;
    private String Field15832 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method6483(@NotNull @NotNull final TickEvent$ClientTickEvent tickEvent$ClientTickEvent) {
        Intrinsics.checkParameterIsNotNull((Object)tickEvent$ClientTickEvent, "event");
        if (Class2142.Field17803.player != null && Class2142.Field17803.player.connection != null) {
            if (!this.Field15830.isEmpty()) {}
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method6484(@NotNull @NotNull final FMLNetworkEvent$ClientDisconnectionFromServerEvent fmlNetworkEvent$ClientDisconnectionFromServerEvent) {
        Intrinsics.checkParameterIsNotNull((Object)fmlNetworkEvent$ClientDisconnectionFromServerEvent, "event");
        this.Method6485();
    }
    
    public final void Method6485() {
        final HashSet field15830 = this.Field15830;
        this.Field15830.clear();
        final Class726 field15831 = Class726.Field11086;
        Intrinsics.checkExpressionValueIsNotNull((Object)field15831, "FriendManager.instance");
        for (final String s : field15831.Method3039()) {
            final HashSet field15832 = this.Field15830;
            final String s2 = s;
            Intrinsics.checkExpressionValueIsNotNull((Object)s2, "friend");
            field15832.add(new Class1477(s2, Class96.Field8334));
        }
        final Unit instance = Unit.INSTANCE;
    }
    
    private final Class1477 Method6486() {
        if (!this.Field15830.isEmpty()) {}
        return null;
    }
    
    public void Method6487(@NotNull @NotNull final Class1477 class1477) {
        Intrinsics.checkParameterIsNotNull((Object)class1477, "event");
        if (Class1409.Field14381.Method35()) {
            Class2142.Field17803.player.connection.sendPacket((Packet)new CPacketChatMessage("@ServerFriend " + ((class1477.Method5919() == Class96.Field8334) ? "add" : "remove") + ' ' + class1477.Method5918()));
        }
    }
    
    public void Method3048(final Object o) {
        this.Method6487((Class1477)o);
    }
    
    public Class1685() {
        this.Field15830 = new HashSet();
        this.Field15831 = new Class618(new Class1845(this), new Predicate[0]);
        Class1796.Field16242.Method706(this.Field15831);
        MinecraftForge.EVENT_BUS.register((Object)this);
    }
    
    public static final HashSet Method6488(final Class1685 class1685) {
        return class1685.Field15830;
    }
    
    private static String Method6489(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1641 ^ 0xFA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
