//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.entity.*;

public class Class748 extends Class42
{
    private String Field11179 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class748() {
        super("MurderFinder", "MurderFinder", Class97.Field8343);
    }
    
    public void Method45() {
        if (Class748.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class748.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Class748.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.stream().filter(Class748::Method3100).filter(Class748::Method3099).forEach(Class748::Method3098);
    }
    
    public void Method39() {
        if (Class748.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class748.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Class748.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.stream().filter(Class748::Method3097).filter(Class748::Method3096).forEach(Class748::Method3095);
    }
    
    public static boolean Method3094(final EntityPlayer entityPlayer) {
        for (int n = 0; entityPlayer.inventory.getStackInSlot(n) == null || !(entityPlayer.inventory.getStackInSlot(n).getItem() instanceof ItemSword) || entityPlayer.inventory.getStackInSlot(n).getItem() instanceof ItemBow || entityPlayer.inventory.getStackInSlot(n).getItem() instanceof ItemMap || entityPlayer.inventory.getStackInSlot(n).getItem() instanceof ItemPotion || entityPlayer.inventory.getStackInSlot(n).getItem() instanceof ItemEmptyMap || entityPlayer.inventory.getStackInSlot(n).getItem() instanceof ItemSnowball || entityPlayer.inventory.getStackInSlot(n).getItem() == null || entityPlayer.inventory.getStackInSlot(n).getItem() == null || entityPlayer.inventory.getStackInSlot(n).getItem() == null; ++n) {}
        return true;
    }
    
    private static void Method3095(final Entity entity) {
        entity.setGlowing(false);
    }
    
    private static boolean Method3096(final Entity entity) {
        return entity != Class748.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
    }
    
    private static boolean Method3097(final Entity entity) {
        return entity.isGlowing();
    }
    
    private static void Method3098(final Entity entity) {
        if (Method3094((EntityPlayer)entity)) {
            entity.setGlowing(true);
        }
    }
    
    private static boolean Method3099(final Entity entity) {
        return entity == Class748.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
    }
    
    private static boolean Method3100(final Entity entity) {
        return entity instanceof EntityPlayer;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x19C5 ^ 0xB9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
