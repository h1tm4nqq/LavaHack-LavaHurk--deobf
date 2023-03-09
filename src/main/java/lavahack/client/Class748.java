//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemBow
 *  net.minecraft.item.ItemEmptyMap
 *  net.minecraft.item.ItemMap
 *  net.minecraft.item.ItemPotion
 *  net.minecraft.item.ItemSnowball
 *  net.minecraft.item.ItemSword
 */
package lavahack.client;

import lavahack.client.Class42;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemEmptyMap;
import net.minecraft.item.ItemMap;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemSnowball;
import net.minecraft.item.ItemSword;

public class Class748
extends Class42 {
    private String Field11179 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class748() {
        super("MurderFinder", "MurderFinder", Class97.Field8343);
    }

    @Override
    public void Method45() {
        if (Class748.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class748.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Class748.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.stream().filter(Class748::Method3100).filter(Class748::Method3099).forEach(Class748::Method3098);
    }

    @Override
    public void Method39() {
        if (Class748.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class748.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Class748.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.stream().filter(Class748::Method3097).filter(Class748::Method3096).forEach(Class748::Method3095);
    }

    public static boolean Method3094(EntityPlayer entityPlayer) {
        int n = 0;
        while (entityPlayer.inventory.getStackInSlot(n) == null || !(entityPlayer.inventory.getStackInSlot(n).getItem() instanceof ItemSword) || entityPlayer.inventory.getStackInSlot(n).getItem() instanceof ItemBow || entityPlayer.inventory.getStackInSlot(n).getItem() instanceof ItemMap || entityPlayer.inventory.getStackInSlot(n).getItem() instanceof ItemPotion || entityPlayer.inventory.getStackInSlot(n).getItem() instanceof ItemEmptyMap || entityPlayer.inventory.getStackInSlot(n).getItem() instanceof ItemSnowball || entityPlayer.inventory.getStackInSlot(n).getItem() == null || entityPlayer.inventory.getStackInSlot(n).getItem() == null || entityPlayer.inventory.getStackInSlot(n).getItem() == null) {
            ++n;
        }
        return true;
    }

    private static void Method3095(Entity entity) {
        entity.setGlowing(false);
    }

    private static boolean Method3096(Entity entity) {
        if (entity == Class748.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) return false;
        return true;
    }

    private static boolean Method3097(Entity entity) {
        return entity.isGlowing();
    }

    private static void Method3098(Entity entity) {
        if (!Class748.Method3094((EntityPlayer)entity)) return;
        entity.setGlowing(true);
    }

    private static boolean Method3099(Entity entity) {
        if (entity != Class748.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) return false;
        return true;
    }

    private static boolean Method3100(Entity entity) {
        return entity instanceof EntityPlayer;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 185;
            cArray2[n] = (char)(cArray[n] ^ (0x19C5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

