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

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemEmptyMap;
import net.minecraft.item.ItemMap;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemSnowball;
import net.minecraft.item.ItemSword;

public class AildzGKArcqvdih2wea1Jj3tKdt0V7pc
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private String Field11179 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public AildzGKArcqvdih2wea1Jj3tKdt0V7pc() {
        super("MurderFinder", "MurderFinder", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
    }

    @Override
    public void Method45() {
        if (AildzGKArcqvdih2wea1Jj3tKdt0V7pc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && AildzGKArcqvdih2wea1Jj3tKdt0V7pc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        AildzGKArcqvdih2wea1Jj3tKdt0V7pc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.stream().filter(AildzGKArcqvdih2wea1Jj3tKdt0V7pc::Method3100).filter(AildzGKArcqvdih2wea1Jj3tKdt0V7pc::Method3099).forEach(AildzGKArcqvdih2wea1Jj3tKdt0V7pc::Method3098);
    }

    @Override
    public void Method39() {
        if (AildzGKArcqvdih2wea1Jj3tKdt0V7pc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && AildzGKArcqvdih2wea1Jj3tKdt0V7pc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        AildzGKArcqvdih2wea1Jj3tKdt0V7pc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.stream().filter(AildzGKArcqvdih2wea1Jj3tKdt0V7pc::Method3097).filter(AildzGKArcqvdih2wea1Jj3tKdt0V7pc::Method3096).forEach(AildzGKArcqvdih2wea1Jj3tKdt0V7pc::Method3095);
    }

    public static boolean Method3094(EntityPlayer entityPlayer) {
        int n = (int)-1846836518L ^ 0x91EB82DA;
        while (true) {
            int cfr_ignored_0 = (int)-99761023L ^ 0xFA0DC488;
            if (!(entityPlayer.inventory.getStackInSlot(n) == null || !(entityPlayer.inventory.getStackInSlot(n).getItem() instanceof ItemSword) || entityPlayer.inventory.getStackInSlot(n).getItem() instanceof ItemBow || entityPlayer.inventory.getStackInSlot(n).getItem() instanceof ItemMap || entityPlayer.inventory.getStackInSlot(n).getItem() instanceof ItemPotion || entityPlayer.inventory.getStackInSlot(n).getItem() instanceof ItemEmptyMap || entityPlayer.inventory.getStackInSlot(n).getItem() instanceof ItemSnowball || entityPlayer.inventory.getStackInSlot(n).getItem() == null || entityPlayer.inventory.getStackInSlot(n).getItem() == null || entityPlayer.inventory.getStackInSlot(n).getItem() == null)) {
                return (int)((long)1699794171 ^ (long)1699794170) != 0;
            }
            ++n;
        }
    }

    private static void Method3095(Entity entity) {
        entity.setGlowing(((int)-1736967478L ^ 0x9877FACA) != 0);
    }

    private static boolean Method3096(Entity entity) {
        boolean bl;
        if (entity != AildzGKArcqvdih2wea1Jj3tKdt0V7pc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) {
            bl = (int)1792212080L ^ 0x6AD2FC71;
            return bl;
        }
        bl = (int)-2075866119L ^ 0x8444CBF9;
        return bl;
    }

    private static boolean Method3097(Entity entity) {
        return entity.isGlowing();
    }

    private static void Method3098(Entity entity) {
        if (!AildzGKArcqvdih2wea1Jj3tKdt0V7pc.Method3094((EntityPlayer)entity)) return;
        entity.setGlowing((boolean)((long)1002986119 ^ (long)1002986118));
    }

    private static boolean Method3099(Entity entity) {
        int n;
        if (entity == AildzGKArcqvdih2wea1Jj3tKdt0V7pc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) {
            n = (int)((long)-640294135 ^ (long)-640294136);
            return n != 0;
        }
        n = (int)-1027617473L ^ 0xC2BFCD3F;
        return n != 0;
    }

    private static boolean Method3100(Entity entity) {
        return entity instanceof EntityPlayer;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)312919918L ^ 0x12A6C76E;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)171026116L ^ 0xA31A63B);
            int n2 = (int)-1601129954L ^ 0xA090B2A7;
            cArray2[n] = (char)(cArray[n] ^ ((int)2004437146L ^ 0x7779515F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

