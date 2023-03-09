//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.network.NetHandlerPlayClient
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketChatMessage
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 *  net.minecraftforge.fml.common.network.FMLNetworkEvent$ClientDisconnectionFromServerEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1397;
import lavahack.client.Class1409;
import lavahack.client.Class1796;
import lavahack.client.Class254;
import lavahack.client.Class287;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class618;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketChatMessage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0016H\u0007J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0002H\u0016R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00020\tj\b\u0012\u0004\u0012\u00020\u0002`\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00020\tj\b\u0012\u0004\u0012\u00020\u0002`\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2={"Lcom/kisman/cc/features/pingbypass/serializer/setting/SettingSerializer;", "Lcom/kisman/cc/features/pingbypass/serializer/Serializer;", "Lcom/kisman/cc/settings/Setting;", "modules", "Ljava/util/ArrayList;", "Lcom/kisman/cc/features/module/Module;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "changed", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "settingChange", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/client/settings/EventSettingChange$Any;", "settings", "clear", "", "init", "onClientTick", "event", "Lnet/minecraftforge/fml/common/gameevent/TickEvent$ClientTickEvent;", "onDisconnect", "Lnet/minecraftforge/fml/common/network/FMLNetworkEvent$ClientDisconnectionFromServerEvent;", "pollSettings", "serializeAndSend", "setting", "kisman.cc"})
public final class Class730
implements Class1397 {
    private final HashSet Field11101;
    private final HashSet Field11102;
    private final Class618 Field11103;
    private final ArrayList Field11104;
    private String Field11105 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SubscribeEvent
    @SubscribeEvent
    public final void Method3049(@NotNull @NotNull TickEvent.ClientTickEvent clientTickEvent) {
        Intrinsics.checkParameterIsNotNull((Object)clientTickEvent, (String)"event");
        if (Class2142.Field17803.player == null) return;
        if (Class2142.Field17803.player.connection == null) return;
        Collection collection = this.Field11102;
        boolean bl = false;
        if (collection.isEmpty()) return;
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method3050(@NotNull @NotNull FMLNetworkEvent.ClientDisconnectionFromServerEvent clientDisconnectionFromServerEvent) {
        Intrinsics.checkParameterIsNotNull((Object)clientDisconnectionFromServerEvent, (String)"event");
        this.Method3052();
    }

    public final void Method3051() {
        Iterator iterator = this.Field11104.iterator();
        block0: while (iterator.hasNext()) {
            Class42 class42 = (Class42)iterator.next();
            Iterator iterator2 = Class1796.Field16241.Field16258.Method7571(class42).iterator();
            while (true) {
                if (!iterator2.hasNext()) continue block0;
                Class44 class44 = (Class44)iterator2.next();
                this.Field11101.add(class44);
            }
            break;
        }
        return;
    }

    public final void Method3052() {
        HashSet hashSet = this.Field11102;
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        this.Field11102.clear();
        bl2 = this.Field11102.addAll(this.Field11101);
    }

    private final Class44 Method3053() {
        Collection collection = this.Field11102;
        boolean bl = false;
        if (collection.isEmpty()) return null;
        return null;
    }

    public void Method3054(@NotNull @NotNull Class44 class44) {
        Intrinsics.checkParameterIsNotNull((Object)class44, (String)"setting");
        if (!Class1409.Field14381.Method35()) return;
        NetHandlerPlayClient netHandlerPlayClient = Class2142.Field17803.player.connection;
        StringBuilder stringBuilder = new StringBuilder().append("@Server");
        Class42 class42 = class44.Field8085;
        Intrinsics.checkExpressionValueIsNotNull((Object)class42, (String)"setting.parent");
        netHandlerPlayClient.sendPacket((Packet)new CPacketChatMessage(stringBuilder.append(class42.Method40()).append(' ').append(class44.Method356()).append(' ').append(class44).toString()));
    }

    @Override
    public void Method3048(Object object) {
        this.Method3054((Class44)object);
    }

    public Class730(@NotNull @NotNull ArrayList arrayList) {
        Intrinsics.checkParameterIsNotNull((Object)arrayList, (String)"modules");
        this.Field11104 = arrayList;
        this.Field11101 = new HashSet();
        this.Field11102 = new HashSet();
        this.Field11103 = new Class618((Class254)new Class287(this), new Predicate[0]);
        Class1796.Field16242.Method706(this.Field11103);
        MinecraftForge.EVENT_BUS.register((Object)this);
        this.Method3051();
    }

    public static final HashSet Method3055(Class730 class730) {
        return class730.Field11101;
    }

    public static final HashSet Method3056(Class730 class730) {
        return class730.Field11102;
    }

    private static String Method3057(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 86;
            cArray2[n] = (char)(cArray[n] ^ (0xEC6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

