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
import lavahack.client.Class42;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class534
extends Class42 {
    private EntityEnderPearl Field10257 = null;
    private String Field10258 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class534() {
        super("GhostEnderPearl", Class97.Field8343);
    }

    @Override
    public void Method45() {
        if (Class534.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (Class534.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (this.Field10257 == null) {
            return;
        }
        if (!(this.Field10257.posY <= Class534.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY)) return;
        this.Field10257.noClip = false;
        this.Field10257 = null;
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2423(PlayerInteractEvent.RightClickItem rightClickItem) {
        if (Class534.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (Class534.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        if (Class534.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(Class534.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem).getItem() != Items.ENDER_PEARL) {
            return;
        }
        EntityEnderPearl entityEnderPearl = null;
        Iterator iterator = Class534.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.entityList.iterator();
        while (iterator.hasNext()) {
            int n;
            Entity entity = (Entity)iterator.next();
            if (!(entity instanceof EntityEnderPearl) || entityEnderPearl != null && (n = Double.compare(entityEnderPearl.getDistanceSq((Entity)Class534.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player), entity.getDistanceSq((Entity)Class534.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player))) < 1) continue;
            entityEnderPearl = (EntityEnderPearl)entity;
            System.out.println(entityEnderPearl);
        }
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 194;
            cArray2[n] = (char)(cArray[n] ^ (0x128F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

