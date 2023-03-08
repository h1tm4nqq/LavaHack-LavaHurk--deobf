//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.init.*;
import net.minecraft.network.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.settings.*;
import net.minecraft.block.state.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "kotlin.jvm.PlatformType", "invoke" })
final class Class2117 implements Class254
{
    public static final Class2117 Field17635;
    private String Field17636 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method979(final Object o) {
        this.Method7653((Class805)o);
    }
    
    public final void Method7653(final Class805 class805) {
        Intrinsics.checkExpressionValueIsNotNull((Object)class805, "it");
        final Packet method982 = class805.Method982();
        if (method982 instanceof CPacketPlayerTryUseItemOnBlock) {
            final EntityPlayerSP player = Class1281.Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
            if (!Intrinsics.areEqual((Object)player.getHeldItemMainhand().item, (Object)Items.GOLDEN_APPLE)) {
                final EntityPlayerSP player2 = Class1281.Method5173().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
                if (!Intrinsics.areEqual((Object)player2.getHeldItemMainhand().item, (Object)Items.CHORUS_FRUIT)) {
                    return;
                }
            }
            final KeyBinding keyBindUseItem = Class1281.Method5173().gameSettings.keyBindUseItem;
            Intrinsics.checkExpressionValueIsNotNull((Object)keyBindUseItem, "mc.gameSettings.keyBindUseItem");
            if (keyBindUseItem.isKeyDown()) {
                final IBlockState getBlockState = Class1281.Method5173().world.getBlockState(((CPacketPlayerTryUseItemOnBlock)method982).getPos());
                Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState, "mc.world.getBlockState(packet.pos)");
                if (Intrinsics.areEqual((Object)getBlockState.getBlock(), (Object)Blocks.ENDER_CHEST)) {
                    class805.Method158();
                    Class1281.Method5173().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
                }
            }
        }
    }
    
    static {
        Field17635 = new Class2117();
    }
    
    private static String Method7654(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x74E6 ^ 0x5B));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
