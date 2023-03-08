//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraftforge.event.entity.player.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.init.*;
import net.minecraft.network.*;
import net.minecraft.network.play.client.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\n" }, d2 = { "Lcom/kisman/cc/features/module/player/PearlBypass;", "Lcom/kisman/cc/features/module/Module;", "()V", "mode", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "onRightClickBlock", "", "event", "Lnet/minecraftforge/event/entity/player/PlayerInteractEvent$RightClickBlock;", "kisman.cc" })
public final class Class1299 extends Class42
{
    private final Class44 Field13932;
    private String Field13933 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method5267(@NotNull @NotNull final PlayerInteractEvent$RightClickBlock playerInteractEvent$RightClickBlock) {
        Intrinsics.checkParameterIsNotNull((Object)playerInteractEvent$RightClickBlock, "event");
        if (Method5268().player != null && Method5268().world != null && Method5268().player.inventory.getStackInSlot(Method5268().player.inventory.currentItem).getItem() == Items.ENDER_PEARL) {
            final Class44 field13932 = this.Field13932;
            Intrinsics.checkExpressionValueIsNotNull((Object)field13932, "mode");
            if (field13932.Method341() == Class622.Field10650) {
                Method5268().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(playerInteractEvent$RightClickBlock.getHand()));
            }
            else {
                final Class44 field13933 = this.Field13932;
                Intrinsics.checkExpressionValueIsNotNull((Object)field13933, "mode");
                if (field13933.Method341() == Class622.Field10651) {
                    Class721.Method3017(Class721.Method3016());
                    Method5268().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(playerInteractEvent$RightClickBlock.getHand()));
                }
            }
            playerInteractEvent$RightClickBlock.setCanceled(true);
        }
    }
    
    public Class1299() {
        super("PearlBypass", "something like pearl phase bypass", Class97.Field8341);
        this.Field13932 = this.Method23(new Class44("Mode", this, Class622.Field10650));
    }
    
    public static final Minecraft Method5268() {
        return Class42.Field8052;
    }
    
    public static final void Method5269(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xDD6 ^ 0x4B));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
