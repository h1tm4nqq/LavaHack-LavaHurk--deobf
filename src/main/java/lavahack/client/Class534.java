//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.item.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraft.init.*;
import net.minecraft.entity.*;
import java.util.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class534 extends Class42
{
    private EntityEnderPearl Field10257;
    private String Field10258 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class534() {
        super("GhostEnderPearl", Class97.Field8343);
        this.Field10257 = null;
    }
    
    public void Method45() {
        if (Class534.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || Class534.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (this.Field10257 == null) {
            return;
        }
        if (this.Field10257.posY <= Class534.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) {
            this.Field10257.noClip = false;
            this.Field10257 = null;
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method2423(final PlayerInteractEvent$RightClickItem playerInteractEvent$RightClickItem) {
        if (Class534.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || Class534.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        if (Class534.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(Class534.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem).getItem() != Items.ENDER_PEARL) {
            return;
        }
        EntityEnderPearl x = null;
        for (final Entity entity : Class534.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.entityList) {
            if (!(entity instanceof EntityEnderPearl)) {
                continue;
            }
            if (x != null && Double.compare(x.getDistanceSq((Entity)Class534.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player), entity.getDistanceSq((Entity)Class534.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player)) < 1) {
                continue;
            }
            x = (EntityEnderPearl)entity;
            System.out.println(x);
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x128F ^ 0xC2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
