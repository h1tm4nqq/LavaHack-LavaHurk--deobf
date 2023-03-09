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
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class622;
import lavahack.client.Class721;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Items;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/features/module/player/PearlBypass;", "Lcom/kisman/cc/features/module/Module;", "()V", "mode", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "onRightClickBlock", "", "event", "Lnet/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickBlock;", "kisman.cc"})
public final class Class1299
extends Class42 {
    private final Class44 Field13932 = this.Method23(new Class44("Mode", (Class42)this, Class622.Field10650));
    private String Field13933 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SubscribeEvent
    @SubscribeEvent
    public final void Method5267(@NotNull @NotNull PlayerInteractEvent.RightClickBlock rightClickBlock) {
        Intrinsics.checkParameterIsNotNull((Object)rightClickBlock, (String)"event");
        if (Class1299.Method5268().player == null) return;
        if (Class1299.Method5268().world == null) return;
        if (Class1299.Method5268().player.inventory.getStackInSlot(Class1299.Method5268().player.inventory.currentItem).getItem() != Items.ENDER_PEARL) return;
        Class44 class44 = this.Field13932;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"mode");
        if (class44.Method341() == Class622.Field10650) {
            Class1299.Method5268().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(rightClickBlock.getHand()));
        } else {
            Class44 class442 = this.Field13932;
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"mode");
            if (class442.Method341() == Class622.Field10651) {
                Class721.Method3017(Class721.Method3016());
                Class1299.Method5268().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(rightClickBlock.getHand()));
            }
        }
        rightClickBlock.setCanceled(true);
    }

    public Class1299() {
        super("PearlBypass", "something like pearl phase bypass", Class97.Field8341);
    }

    public static final Minecraft Method5268() {
        return Class42.Field8052;
    }

    public static final void Method5269(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 75;
            cArray2[n] = (char)(cArray[n] ^ (0xDD6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

