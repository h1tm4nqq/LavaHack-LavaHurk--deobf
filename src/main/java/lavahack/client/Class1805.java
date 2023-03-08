//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.event.entity.player.*;
import net.minecraft.init.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class1805 extends Class42
{
    private int Field16313;
    
    public Class1805() {
        super("ChorusBypass", Class97.Field8344);
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method6822(final PlayerInteractEvent$RightClickBlock playerInteractEvent$RightClickBlock) {
        if (Class1805.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1805.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (Class1805.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(Class1805.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem).getItem() == Items.CHORUS_FRUIT) {
            playerInteractEvent$RightClickBlock.setCanceled(true);
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2091 ^ 0x81));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
