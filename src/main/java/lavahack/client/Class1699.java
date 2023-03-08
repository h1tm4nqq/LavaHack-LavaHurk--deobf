//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.item.*;
import net.minecraft.network.*;
import net.minecraft.init.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraft.entity.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class1699 extends Class42
{
    private final Class44 Field15864;
    private final Class44 Field15865;
    private final Class44 Field15866;
    private int Field15867;
    
    public Class1699() {
        super("PacketEat", Class97.Field8344);
        this.Field15864 = this.Method23(new Class44("Mode", this, Class536.Field10262));
        this.Field15865 = this.Method23(new Class44("Health", this, Double.longBitsToDouble(4628574517030027264L), 0.0, Double.longBitsToDouble((long)961344123 ^ 0x40420000394CF27BL), false));
        this.Field15866 = this.Method23(new Class44("Packet Iteration", this, Double.longBitsToDouble(4626322717216342016L), 0.0, Double.longBitsToDouble((long)1011838889 ^ 0x404400003C4F6FA9L), false));
    }
    
    @Override
    public boolean Method52() {
        return true;
    }
    
    @Override
    public void Method45() {
        if (Class1699.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (Class1699.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive() && Class1699.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemAppleGold && (this.Field15864.Method341() == Class536.Field10262 || this.Field15864.Method341() == Class536.Field10264)) {
            for (int i = 0; i < this.Field15866.Method335(); ++i) {
                Class1699.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer());
            }
            Class1699.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.stopActiveHand();
        }
        if (this.Field15864.Method341() == Class536.Field10264 && Class1744.Method6647() <= this.Field15865.Method335()) {
            Class9.Method123(Class9.Method126(Items.GOLDEN_APPLE));
            Class1699.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
        }
        super.Method45();
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method6509(final PlayerInteractEvent$RightClickItem playerInteractEvent$RightClickItem) {
        if (playerInteractEvent$RightClickItem.getItemStack().getItem().equals(Items.GOLDEN_APPLE) && this.Field15864.Method341() == Class536.Field10263) {
            playerInteractEvent$RightClickItem.getItemStack().getItem().onItemUseFinish(playerInteractEvent$RightClickItem.getItemStack(), playerInteractEvent$RightClickItem.getWorld(), (EntityLivingBase)playerInteractEvent$RightClickItem.getEntityPlayer());
            playerInteractEvent$RightClickItem.setCanceled(true);
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1D54 ^ 0xD8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
