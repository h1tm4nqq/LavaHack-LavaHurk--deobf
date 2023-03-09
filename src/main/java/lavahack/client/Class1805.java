//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Items
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$RightClickBlock
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import lavahack.client.Class42;
import lavahack.client.Class97;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class1805
extends Class42 {
    private int Field16313;

    public Class1805() {
        super("ChorusBypass", Class97.Field8344);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6822(PlayerInteractEvent.RightClickBlock rightClickBlock) {
        if (Class1805.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1805.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (Class1805.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(Class1805.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem).getItem() != Items.CHORUS_FRUIT) return;
        rightClickBlock.setCanceled(true);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 129;
            cArray2[n] = (char)(cArray[n] ^ (0x2091 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

