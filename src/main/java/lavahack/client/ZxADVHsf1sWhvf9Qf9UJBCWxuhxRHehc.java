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

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ZxADVHsf1sWhvf9Qf9UJBCWxuhxRHehc
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private int Field16313;

    public ZxADVHsf1sWhvf9Qf9UJBCWxuhxRHehc() {
        super("ChorusBypass", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6822(PlayerInteractEvent.RightClickBlock rightClickBlock) {
        if (ZxADVHsf1sWhvf9Qf9UJBCWxuhxRHehc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (ZxADVHsf1sWhvf9Qf9UJBCWxuhxRHehc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (ZxADVHsf1sWhvf9Qf9UJBCWxuhxRHehc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(ZxADVHsf1sWhvf9Qf9UJBCWxuhxRHehc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem).getItem() != Items.CHORUS_FRUIT) return;
        rightClickBlock.setCanceled(((int)1357742022L ^ 0x50ED7FC7) != 0);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1673546664L ^ 0x9C3FB458;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1826113673 ^ (long)-1826113656);
            int n2 = (int)((long)1438995086 ^ (long)1438994959);
            cArray2[n] = (char)(cArray[n] ^ ((int)-340106377L ^ 0xEBBA43E6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

