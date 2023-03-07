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

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Ae54RnIwbg7SoWtuZ7PlwALpmfX3oW19$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ;
import lavahack.client.caGS9U6h2z9kYOKZkWe3pWCChNHD2KdG;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketChatMessage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0016H\u0007J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0002H\u0016R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00020\tj\b\u0012\u0004\u0012\u00020\u0002`\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00020\tj\b\u0012\u0004\u0012\u00020\u0002`\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2={"Lcom/kisman/cc/features/pingbypass/serializer/setting/SettingSerializer;", "Lcom/kisman/cc/features/pingbypass/serializer/Serializer;", "Lcom/kisman/cc/settings/Setting;", "modules", "Ljava/util/ArrayList;", "Lcom/kisman/cc/features/module/Module;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "changed", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "settingChange", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/client/settings/EventSettingChange$Any;", "settings", "clear", "", "init", "onClientTick", "event", "Lnet/minecraftforge/fml/common/gameevent/TickEvent$ClientTickEvent;", "onDisconnect", "Lnet/minecraftforge/fml/common/network/FMLNetworkEvent$ClientDisconnectionFromServerEvent;", "pollSettings", "serializeAndSend", "setting", "kisman.cc"})
public final class Ae54RnIwbg7SoWtuZ7PlwALpmfX3oW19
implements caGS9U6h2z9kYOKZkWe3pWCChNHD2KdG {
    private final HashSet Field11101;
    private final HashSet Field11102;
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field11103;
    private final ArrayList Field11104;
    private String Field11105 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SubscribeEvent
    @SubscribeEvent
    public final void Method3049(@NotNull @NotNull TickEvent.ClientTickEvent clientTickEvent) {
        int n;
        Intrinsics.checkParameterIsNotNull((Object)clientTickEvent, (String)"event");
        if (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player == null) return;
        if (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.connection == null) return;
        Collection collection = this.Field11102;
        int n2 = (int)((long)-1133082166 ^ (long)-1133082166);
        if (!collection.isEmpty()) {
            n = (int)((long)-2045139203 ^ (long)-2045139204);
            return;
        }
        n = (int)((long)2112002374 ^ (long)2112002374);
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
            WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J = (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)iterator.next();
            Iterator iterator2 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258.Method7571(wjjBVRrUqJUKhloA7ANknrTEODhuGa0J).iterator();
            while (true) {
                if (!iterator2.hasNext()) continue block0;
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)iterator2.next();
                this.Field11101.add(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2);
            }
            break;
        }
        return;
    }

    public final void Method3052() {
        HashSet hashSet = this.Field11102;
        int n = (int)1942988315L ^ 0x73CFA61B;
        int n2 = (int)752321770L ^ 0x2CD784EA;
        int n3 = (int)-667806854L ^ 0xD832137A;
        this.Field11102.clear();
        n2 = this.Field11102.addAll(this.Field11101) ? 1 : 0;
    }

    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method3053() {
        int n;
        Collection collection = this.Field11102;
        int n2 = (int)((long)-1652798888 ^ (long)-1652798888);
        if (!collection.isEmpty()) {
            n = (int)1734604287L ^ 0x6763F5FE;
            return null;
        }
        n = (int)((long)595094696 ^ (long)595094696);
        return null;
    }

    public void Method3054(@NotNull @NotNull qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2) {
        Intrinsics.checkParameterIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"setting");
        if (!XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Field14381.Method35()) return;
        NetHandlerPlayClient netHandlerPlayClient = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.connection;
        StringBuilder stringBuilder = new StringBuilder().append("@Server");
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Field8085;
        Intrinsics.checkExpressionValueIsNotNull((Object)wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, (String)"setting.parent");
        netHandlerPlayClient.sendPacket((Packet)new CPacketChatMessage(stringBuilder.append(wjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Method40()).append((int)((long)-1817867706 ^ (long)-1817867705) << 5).append(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method356()).append(((int)-1850979328L ^ 0x91AC4C01) << 5).append(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2).toString()));
    }

    @Override
    public void Method3048(Object object) {
        this.Method3054((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)object);
    }

    public Ae54RnIwbg7SoWtuZ7PlwALpmfX3oW19(@NotNull @NotNull ArrayList arrayList) {
        Intrinsics.checkParameterIsNotNull((Object)arrayList, (String)"modules");
        this.Field11104 = arrayList;
        this.Field11101 = new HashSet();
        this.Field11102 = new HashSet();
        this.Field11103 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)new Ae54RnIwbg7SoWtuZ7PlwALpmfX3oW19$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this), new Predicate[(int)((long)-2134389277 ^ (long)-2134389277)]);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field11103);
        MinecraftForge.EVENT_BUS.register((Object)this);
        this.Method3051();
    }

    public static final HashSet Method3055(Ae54RnIwbg7SoWtuZ7PlwALpmfX3oW19 ae54RnIwbg7SoWtuZ7PlwALpmfX3oW19) {
        return ae54RnIwbg7SoWtuZ7PlwALpmfX3oW19.Field11101;
    }

    public static final HashSet Method3056(Ae54RnIwbg7SoWtuZ7PlwALpmfX3oW19 ae54RnIwbg7SoWtuZ7PlwALpmfX3oW19) {
        return ae54RnIwbg7SoWtuZ7PlwALpmfX3oW19.Field11102;
    }

    private static String Method3057(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)123893247 ^ (long)123893247);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-2146677611 ^ (long)-2146677654);
            int n2 = (int)((long)-1048011688 ^ (long)-1048011661) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-262084164L ^ 0xF060EEDF) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

