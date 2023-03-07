//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.init.Items
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItem
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$RightClickBlock
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.AmrNfv7kGOECFtQRgCWbud2mFPGYrVbK;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.oe1ITGLCYHoWTDuRDY0aGgkZ7Y5hw0lT;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Items;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/features/module/player/PearlBypass;", "Lcom/kisman/cc/features/module/Module;", "()V", "mode", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "onRightClickBlock", "", "event", "Lnet/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickBlock;", "kisman.cc"})
public final class wQDNtDUtZlaU0aW29ud4uePtiNyM5THA
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13932 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, AmrNfv7kGOECFtQRgCWbud2mFPGYrVbK.Field10650));
    private String Field13933 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SubscribeEvent
    @SubscribeEvent
    public final void Method5267(@NotNull @NotNull PlayerInteractEvent.RightClickBlock rightClickBlock) {
        Intrinsics.checkParameterIsNotNull((Object)rightClickBlock, (String)"event");
        if (wQDNtDUtZlaU0aW29ud4uePtiNyM5THA.Method5268().player == null) return;
        if (wQDNtDUtZlaU0aW29ud4uePtiNyM5THA.Method5268().world == null) return;
        if (wQDNtDUtZlaU0aW29ud4uePtiNyM5THA.Method5268().player.inventory.getStackInSlot(wQDNtDUtZlaU0aW29ud4uePtiNyM5THA.Method5268().player.inventory.currentItem).getItem() != Items.ENDER_PEARL) return;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field13932;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"mode");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341() == AmrNfv7kGOECFtQRgCWbud2mFPGYrVbK.Field10650) {
            wQDNtDUtZlaU0aW29ud4uePtiNyM5THA.Method5268().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(rightClickBlock.getHand()));
        } else {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field13932;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"mode");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method341() == AmrNfv7kGOECFtQRgCWbud2mFPGYrVbK.Field10651) {
                oe1ITGLCYHoWTDuRDY0aGgkZ7Y5hw0lT.Method3017(oe1ITGLCYHoWTDuRDY0aGgkZ7Y5hw0lT.Method3016());
                wQDNtDUtZlaU0aW29ud4uePtiNyM5THA.Method5268().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(rightClickBlock.getHand()));
            }
        }
        rightClickBlock.setCanceled((boolean)((long)1980416238 ^ (long)1980416239));
    }

    public wQDNtDUtZlaU0aW29ud4uePtiNyM5THA() {
        super("PearlBypass", "something like pearl phase bypass", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8341);
    }

    public static final Minecraft Method5268() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method5269(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1260062951 ^ (long)-1260062951);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1392926831 ^ (long)1392926864);
            int n2 = (int)-2029533672L ^ 0x8707C653;
            cArray2[n] = (char)(cArray[n] ^ (((int)999927064L ^ 0x3B99ABF3) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

