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

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU;
import lavahack.client.ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.HgENA9hIACLwL9pxmOjZq1Q6z5yrTsa6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ;
import lavahack.client.caGS9U6h2z9kYOKZkWe3pWCChNHD2KdG;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketChatMessage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000fH\u0007J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0005j\b\u0012\u0004\u0012\u00020\u0002`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2={"Lcom/kisman/cc/features/pingbypass/serializer/friend/FriendSerializer;", "Lcom/kisman/cc/features/pingbypass/serializer/Serializer;", "Lcom/kisman/cc/event/events/client/friend/FriendEvent;", "()V", "changed", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "friendEvent", "Lme/zero/alpine/listener/Listener;", "clear", "", "onClientTick", "event", "Lnet/minecraftforge/fml/common/gameevent/TickEvent$ClientTickEvent;", "onDisconnect", "Lnet/minecraftforge/fml/common/network/FMLNetworkEvent$ClientDisconnectionFromServerEvent;", "pollFriend", "serializeAndSend", "kisman.cc"})
public final class HgENA9hIACLwL9pxmOjZq1Q6z5yrTsa6
implements caGS9U6h2z9kYOKZkWe3pWCChNHD2KdG {
    private final HashSet Field15830 = new HashSet();
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field15831 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)new HgENA9hIACLwL9pxmOjZq1Q6z5yrTsa6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this), new Predicate[(int)-917113227L ^ 0xC955F675]);
    private String Field15832 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SubscribeEvent
    @SubscribeEvent
    public final void Method6483(@NotNull @NotNull TickEvent.ClientTickEvent clientTickEvent) {
        int n;
        Intrinsics.checkParameterIsNotNull((Object)clientTickEvent, (String)"event");
        if (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player == null) return;
        if (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.connection == null) return;
        Collection collection = this.Field15830;
        int n2 = (int)((long)240727689 ^ (long)240727689);
        if (!collection.isEmpty()) {
            n = (int)1001718670L ^ 0x3BB5038F;
            return;
        }
        n = (int)-1792586815L ^ 0x95274BC1;
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method6484(@NotNull @NotNull FMLNetworkEvent.ClientDisconnectionFromServerEvent clientDisconnectionFromServerEvent) {
        Intrinsics.checkParameterIsNotNull((Object)clientDisconnectionFromServerEvent, (String)"event");
        this.Method6485();
    }

    public final void Method6485() {
        HashSet hashSet = this.Field15830;
        int n = (int)((long)1577771624 ^ (long)1577771624);
        int n2 = (int)-1108631372L ^ 0xBDEBA0B4;
        int n3 = (int)-1505810788L ^ 0xA63F269C;
        this.Field15830.clear();
        n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI2 = n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI.Field11086;
        Intrinsics.checkExpressionValueIsNotNull((Object)n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI2, (String)"FriendManager.instance");
        Iterator iterator = n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI2.Method3039().iterator();
        while (true) {
            String string;
            if (!iterator.hasNext()) {
                Unit unit = Unit.INSTANCE;
                return;
            }
            String string2 = string = (String)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)string2, (String)"friend");
            this.Field15830.add(new ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU(string2, ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8334));
        }
    }

    private final ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU Method6486() {
        int n;
        Collection collection = this.Field15830;
        int n2 = (int)((long)-960798620 ^ (long)-960798620);
        if (!collection.isEmpty()) {
            n = (int)((long)607349105 ^ (long)607349104);
            return null;
        }
        n = (int)((long)1560851071 ^ (long)1560851071);
        return null;
    }

    public void Method6487(@NotNull @NotNull ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU) {
        Intrinsics.checkParameterIsNotNull((Object)aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU, (String)"event");
        if (!XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Field14381.Method35()) return;
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.connection.sendPacket((Packet)new CPacketChatMessage("@ServerFriend " + (aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU.Method5919() == ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8334 ? "add" : "remove") + ((int)((long)-2011770454 ^ (long)-2011770453) << 5) + aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU.Method5918()));
    }

    @Override
    public void Method3048(Object object) {
        this.Method6487((ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU)object);
    }

    public HgENA9hIACLwL9pxmOjZq1Q6z5yrTsa6() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field15831);
        MinecraftForge.EVENT_BUS.register((Object)this);
    }

    public static final HashSet Method6488(HgENA9hIACLwL9pxmOjZq1Q6z5yrTsa6 hgENA9hIACLwL9pxmOjZq1Q6z5yrTsa6) {
        return hgENA9hIACLwL9pxmOjZq1Q6z5yrTsa6.Field15830;
    }

    private static String Method6489(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-903832880 ^ (long)-903832880);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-413065489 ^ (long)-413065712);
            int n2 = ((int)-2022954074L ^ 0x876C2BDB) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1574197027 ^ (long)-1574191460) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

