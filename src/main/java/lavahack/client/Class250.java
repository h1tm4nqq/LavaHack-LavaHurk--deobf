//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import net.minecraft.tileentity.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.player.*;

public enum Class250
{
    Field9090("Hands", 0, Class1067.Method4330().Method7663(class424 -> {
        Class1067.Method4335().entityRenderer.renderHand((float)class424.Method2054(0), 2);
        return null;
    }), Class1736.Field15967, 0), 
    Field9091("Players", 1, Class1067.Method4331().Method7663(class424 -> {
        if (class424.Method2054(1) instanceof EntityPlayer) {
            Class1067.Method4334(class424);
        }
        return null;
    }), Class1736.Field15965, 1), 
    Field9092("Crystals", 2, Class1067.Method4331().Method7663(class424 -> {
        if (class424.Method2054(1) instanceof EntityEnderCrystal) {
            Class1067.Method4334(class424);
        }
        return null;
    }), Class1736.Field15965, 2), 
    Field9093("Monsters", 3, Class1067.Method4331().Method7663(class424 -> {
        if (class424.Method2054(1) instanceof EntityMob) {
            Class1067.Method4334(class424);
        }
        return null;
    }), Class1736.Field15965, 3), 
    Field9094("Animals", 4, Class1067.Method4331().Method7663(class424 -> {
        if (class424.Method2054(1) instanceof EntityAnimal) {
            Class1067.Method4334(class424);
        }
        return null;
    }), Class1736.Field15965, 4), 
    Field9095("Frames", 5, Class1067.Method4331().Method7663(class424 -> {
        if (class424.Method2054(1) instanceof EntityItemFrame) {
            Class1067.Method4334(class424);
        }
        return null;
    }), Class1736.Field15965, 5), 
    Field9096("Items", 6, Class1067.Method4331().Method7663(class424 -> {
        if (class424.Method2054(1) instanceof EntityItem) {
            Class1067.Method4334(class424);
        }
        return null;
    }), Class1736.Field15965, 6), 
    Field9097("Chests", 7, Class1067.Method4332().Method7663(class424 -> {
        if (class424.Method2054(1) instanceof TileEntityChest) {
            Class1067.Method4333(class424);
        }
        return null;
    }), Class1736.Field15966, 7), 
    Field9098("EnderChests", 8, Class1067.Method4332().Method7663(class424 -> {
        if (class424.Method2054(1) instanceof TileEntityEnderChest) {
            Class1067.Method4333(class424);
        }
        return null;
    }), Class1736.Field15966, 8), 
    Field9099("Furnaces", 9, Class1067.Method4332().Method7663(class424 -> {
        if (class424.Method2054(1) instanceof TileEntityFurnace) {
            Class1067.Method4333(class424);
        }
        return null;
    }), Class1736.Field15966, 9), 
    Field9100("EnchantmentTables", 10, Class1067.Method4332().Method7663(class424 -> {
        if (class424.Method2054(1) instanceof TileEntityEnchantmentTable) {
            Class1067.Method4333(class424);
        }
        return null;
    }), Class1736.Field15966, 10), 
    Field9101("Droppers", 11, Class1067.Method4332().Method7663(class424 -> {
        if (class424.Method2054(1) instanceof TileEntityDropper) {
            Class1067.Method4333(class424);
        }
        return null;
    }), Class1736.Field15966, 11), 
    Field9102("Dispensers", 12, Class1067.Method4332().Method7663(class424 -> {
        if (class424.Method2054(1) instanceof TileEntityDispenser) {
            Class1067.Method4333(class424);
        }
        return null;
    }), Class1736.Field15966, 12), 
    Field9103("Hoppers", 13, Class1067.Method4332().Method7663(class424 -> {
        if (class424.Method2054(1) instanceof TileEntityHopper) {
            Class1067.Method4333(class424);
        }
        return null;
    }), Class1736.Field15966, 13), 
    Field9104("Comparators", 14, Class1067.Method4332().Method7663(class424 -> {
        if (class424.Method2054(1) instanceof TileEntityComparator) {
            Class1067.Method4333(class424);
        }
        return null;
    }), Class1736.Field15966, 14), 
    Field9105("DaylightDetectors", 15, Class1067.Method4332().Method7663(class424 -> {
        if (class424.Method2054(1) instanceof TileEntityDaylightDetector) {
            Class1067.Method4333(class424);
        }
        return null;
    }), Class1736.Field15966, 15), 
    Field9106("EndGateway", 16, Class1067.Method4332().Method7663(class424 -> {
        if (class424.Method2054(1) instanceof TileEntityEndGateway) {
            Class1067.Method4333(class424);
        }
        return null;
    }), Class1736.Field15966, 16), 
    Field9107("EndPortals", 17, Class1067.Method4332().Method7663(class424 -> {
        if (class424.Method2054(1) instanceof TileEntityEndPortal) {
            Class1067.Method4333(class424);
        }
        return null;
    }), Class1736.Field15966, 17), 
    Field9108("FlowerPots", 18, Class1067.Method4332().Method7663(class424 -> {
        if (class424.Method2054(1) instanceof TileEntityFlowerPot) {
            Class1067.Method4333(class424);
        }
        return null;
    }), Class1736.Field15966, 18), 
    Field9109("Spawners", 19, Class1067.Method4332().Method7663(class424 -> {
        if (class424.Method2054(1) instanceof TileEntityMobSpawner) {
            Class1067.Method4333(class424);
        }
        return null;
    }), Class1736.Field15966, 19), 
    Field9110("NoteBlocks", 20, Class1067.Method4332().Method7663(class424 -> {
        if (class424.Method2054(1) instanceof TileEntityNote) {
            Class1067.Method4333(class424);
        }
        return null;
    }), Class1736.Field15966, 20), 
    Field9111("Pistons", 21, Class1067.Method4332().Method7663(class424 -> {
        if (class424.Method2054(1) instanceof TileEntityPiston) {
            Class1067.Method4333(class424);
        }
        return null;
    }), Class1736.Field15966, 21), 
    Field9112("Shulkers", 22, Class1067.Method4332().Method7663(class424 -> {
        if (class424.Method2054(1) instanceof TileEntityShulkerBox) {
            Class1067.Method4333(class424);
        }
        return null;
    }), Class1736.Field15966, 22), 
    Field9113("Signs", 23, Class1067.Method4332().Method7663(class424 -> {
        if (class424.Method2054(1) instanceof TileEntitySign) {
            Class1067.Method4333(class424);
        }
        return null;
    }), Class1736.Field15966, 23), 
    Field9114("Skull", 24, Class1067.Method4332().Method7663(class424 -> {
        if (class424.Method2054(1) instanceof TileEntitySkull) {
            Class1067.Method4333(class424);
        }
        return null;
    }), Class1736.Field15966, 24);
    
    private final Class1763 Field9115;
    private final Class1736 Field9116;
    private final int Field9117;
    private static final Class250[] Field9118;
    private String Field9119 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class250(final String name, final int ordinal, final Class1763 field9115, final Class1736 field9116, final int field9117) {
        this.Field9115 = field9115;
        this.Field9116 = field9116;
        this.Field9117 = field9117;
    }
    
    public Class1763 Method1335() {
        return this.Field9115;
    }
    
    public Class1736 Method1336() {
        return this.Field9116;
    }
    
    public int Method1337() {
        return this.Field9117;
    }
    
    public static ArrayList Method1338(final Class1736 class1736) {
        final ArrayList<Class250> list = new ArrayList<Class250>();
        for (final Class250 e : values()) {
            if (e.Method1336() == class1736) {
                list.add(e);
            }
        }
        return list;
    }
    
    static {
        Field9118 = new Class250[] { Class250.Field9090, Class250.Field9091, Class250.Field9092, Class250.Field9093, Class250.Field9094, Class250.Field9095, Class250.Field9096, Class250.Field9097, Class250.Field9098, Class250.Field9099, Class250.Field9100, Class250.Field9101, Class250.Field9102, Class250.Field9103, Class250.Field9104, Class250.Field9105, Class250.Field9106, Class250.Field9107, Class250.Field9108, Class250.Field9109, Class250.Field9110, Class250.Field9111, Class250.Field9112, Class250.Field9113, Class250.Field9114 };
    }
    
    private static String Method1364(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6C11 ^ 0x5A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
