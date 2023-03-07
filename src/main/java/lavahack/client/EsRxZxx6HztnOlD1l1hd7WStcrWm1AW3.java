//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityEnderPearl
 *  net.minecraft.init.Items
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$RightClickItem
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.Iterator;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EsRxZxx6HztnOlD1l1hd7WStcrWm1AW3
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private EntityEnderPearl Field10257 = null;
    private String Field10258 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public EsRxZxx6HztnOlD1l1hd7WStcrWm1AW3() {
        super("GhostEnderPearl", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
    }

    @Override
    public void Method45() {
        if (EsRxZxx6HztnOlD1l1hd7WStcrWm1AW3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (EsRxZxx6HztnOlD1l1hd7WStcrWm1AW3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (this.Field10257 == null) {
            return;
        }
        if (!(this.Field10257.posY <= EsRxZxx6HztnOlD1l1hd7WStcrWm1AW3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY)) return;
        this.Field10257.noClip = (int)((long)785002893 ^ (long)785002893);
        this.Field10257 = null;
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2423(PlayerInteractEvent.RightClickItem rightClickItem) {
        if (EsRxZxx6HztnOlD1l1hd7WStcrWm1AW3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (EsRxZxx6HztnOlD1l1hd7WStcrWm1AW3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        if (EsRxZxx6HztnOlD1l1hd7WStcrWm1AW3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(EsRxZxx6HztnOlD1l1hd7WStcrWm1AW3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem).getItem() != Items.ENDER_PEARL) {
            return;
        }
        EntityEnderPearl entityEnderPearl = null;
        Iterator iterator = EsRxZxx6HztnOlD1l1hd7WStcrWm1AW3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.entityList.iterator();
        while (iterator.hasNext()) {
            int n;
            Entity entity = (Entity)iterator.next();
            if (!(entity instanceof EntityEnderPearl) || entityEnderPearl != null && (n = Double.compare(entityEnderPearl.getDistanceSq((Entity)EsRxZxx6HztnOlD1l1hd7WStcrWm1AW3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player), entity.getDistanceSq((Entity)EsRxZxx6HztnOlD1l1hd7WStcrWm1AW3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player))) < ((int)1714575782L ^ 0x663259A7)) continue;
            entityEnderPearl = (EntityEnderPearl)entity;
            System.out.println(entityEnderPearl);
        }
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1193443192 ^ (long)1193443192);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1545534611 ^ (long)1545534572);
            int n2 = (int)((long)-1384691932 ^ (long)-1384691899) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)1577716793L ^ 0x5E0A1EB6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

