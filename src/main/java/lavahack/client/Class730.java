//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraftforge.fml.common.gameevent.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import com.kisman.cc.util.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.fml.common.network.*;
import java.util.*;
import net.minecraft.network.*;
import net.minecraft.network.play.client.*;
import net.minecraft.client.network.*;
import java.util.function.*;
import net.minecraftforge.common.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006?\u0006\u0002\u0010\u0007J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0016H\u0007J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0002H\u0016R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00020\tj\b\u0012\u0004\u0012\u00020\u0002`\nX\u0082\u0004?\u0006\u0002\n\u0000R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004?\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00020\tj\b\u0012\u0004\u0012\u00020\u0002`\nX\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u001a" }, d2 = { "Lcom/kisman/cc/features/pingbypass/serializer/setting/SettingSerializer;", "Lcom/kisman/cc/features/pingbypass/serializer/Serializer;", "Lcom/kisman/cc/settings/Setting;", "modules", "Ljava/util/ArrayList;", "Lcom/kisman/cc/features/module/Module;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "changed", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "settingChange", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/client/settings/EventSettingChange$Any;", "settings", "clear", "", "init", "onClientTick", "event", "Lnet/minecraftforge/fml/common/gameevent/TickEvent$ClientTickEvent;", "onDisconnect", "Lnet/minecraftforge/fml/common/network/FMLNetworkEvent$ClientDisconnectionFromServerEvent;", "pollSettings", "serializeAndSend", "setting", "kisman.cc" })
public final class Class730 implements Class1397
{
    private final HashSet Field11101;
    private final HashSet Field11102;
    private final Class618 Field11103;
    private final ArrayList Field11104;
    private String Field11105 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method3049(@NotNull @NotNull final TickEvent$ClientTickEvent tickEvent$ClientTickEvent) {
        Intrinsics.checkParameterIsNotNull((Object)tickEvent$ClientTickEvent, "event");
        if (Class2142.Field17803.player != null && Class2142.Field17803.player.connection != null) {
            if (!this.Field11102.isEmpty()) {}
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method3050(@NotNull @NotNull final FMLNetworkEvent$ClientDisconnectionFromServerEvent fmlNetworkEvent$ClientDisconnectionFromServerEvent) {
        Intrinsics.checkParameterIsNotNull((Object)fmlNetworkEvent$ClientDisconnectionFromServerEvent, "event");
        this.Method3052();
    }
    
    public final void Method3051() {
        final Iterator<Class42> iterator = this.Field11104.iterator();
        while (iterator.hasNext()) {
            final Iterator iterator2 = Class1796.Field16241.Field16258.Method7571((Class42)iterator.next()).iterator();
            while (iterator2.hasNext()) {
                this.Field11101.add(iterator2.next());
            }
        }
    }
    
    public final void Method3052() {
        final HashSet field11102 = this.Field11102;
        this.Field11102.clear();
        this.Field11102.addAll(this.Field11101);
    }
    
    private final Class44 Method3053() {
        if (!this.Field11102.isEmpty()) {}
        return null;
    }
    
    public void Method3054(@NotNull @NotNull final Class44 obj) {
        Intrinsics.checkParameterIsNotNull((Object)obj, "setting");
        if (Class1409.Field14381.Method35()) {
            final NetHandlerPlayClient connection = Class2142.Field17803.player.connection;
            final StringBuilder append = new StringBuilder().append("@Server");
            final Class42 field8085 = obj.Field8085;
            Intrinsics.checkExpressionValueIsNotNull((Object)field8085, "setting.parent");
            connection.sendPacket((Packet)new CPacketChatMessage(append.append(field8085.Method40()).append(' ').append(obj.Method356()).append(' ').append(obj).toString()));
        }
    }
    
    public void Method3048(final Object o) {
        this.Method3054((Class44)o);
    }
    
    public Class730(@NotNull @NotNull final ArrayList field11104) {
        Intrinsics.checkParameterIsNotNull((Object)field11104, "modules");
        this.Field11104 = field11104;
        this.Field11101 = new HashSet();
        this.Field11102 = new HashSet();
        this.Field11103 = new Class618((Class254)new Class287(this), new Predicate[0]);
        Class1796.Field16242.Method706(this.Field11103);
        MinecraftForge.EVENT_BUS.register((Object)this);
        this.Method3051();
    }
    
    public static final HashSet Method3055(final Class730 class730) {
        return class730.Field11101;
    }
    
    public static final HashSet Method3056(final Class730 class730) {
        return class730.Field11102;
    }
    
    private static String Method3057(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xEC6 ^ 0x56));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
