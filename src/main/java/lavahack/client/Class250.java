//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.item.EntityEnderCrystal
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.item.EntityItemFrame
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.entity.passive.EntityAnimal
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.tileentity.TileEntityChest
 *  net.minecraft.tileentity.TileEntityComparator
 *  net.minecraft.tileentity.TileEntityDaylightDetector
 *  net.minecraft.tileentity.TileEntityDispenser
 *  net.minecraft.tileentity.TileEntityDropper
 *  net.minecraft.tileentity.TileEntityEnchantmentTable
 *  net.minecraft.tileentity.TileEntityEndGateway
 *  net.minecraft.tileentity.TileEntityEndPortal
 *  net.minecraft.tileentity.TileEntityEnderChest
 *  net.minecraft.tileentity.TileEntityFlowerPot
 *  net.minecraft.tileentity.TileEntityFurnace
 *  net.minecraft.tileentity.TileEntityHopper
 *  net.minecraft.tileentity.TileEntityMobSpawner
 *  net.minecraft.tileentity.TileEntityNote
 *  net.minecraft.tileentity.TileEntityPiston
 *  net.minecraft.tileentity.TileEntityShulkerBox
 *  net.minecraft.tileentity.TileEntitySign
 *  net.minecraft.tileentity.TileEntitySkull
 */
package lavahack.client;

import java.util.ArrayList;
import lavahack.client.Class1067;
import lavahack.client.Class1736;
import lavahack.client.Class1763;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityComparator;
import net.minecraft.tileentity.TileEntityDaylightDetector;
import net.minecraft.tileentity.TileEntityDispenser;
import net.minecraft.tileentity.TileEntityDropper;
import net.minecraft.tileentity.TileEntityEnchantmentTable;
import net.minecraft.tileentity.TileEntityEndGateway;
import net.minecraft.tileentity.TileEntityEndPortal;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.tileentity.TileEntityFlowerPot;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.tileentity.TileEntityHopper;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.tileentity.TileEntityNote;
import net.minecraft.tileentity.TileEntityPiston;
import net.minecraft.tileentity.TileEntityShulkerBox;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.tileentity.TileEntitySkull;

public enum Class250 {
    Field9090(Class1067.Method4330().Method7663(class424 -> {
        Class1067.Method4335().entityRenderer.renderHand(((Float)class424.Method2054(0)).floatValue(), 2);
        return null;
    }), Class1736.Field15967, 0),
    Field9091(Class1067.Method4331().Method7663(class424 -> {
        if (!(class424.Method2054(1) instanceof EntityPlayer)) return null;
        Class1067.Method4334(class424);
        return null;
    }), Class1736.Field15965, 1),
    Field9092(Class1067.Method4331().Method7663(class424 -> {
        if (!(class424.Method2054(1) instanceof EntityEnderCrystal)) return null;
        Class1067.Method4334(class424);
        return null;
    }), Class1736.Field15965, 2),
    Field9093(Class1067.Method4331().Method7663(class424 -> {
        if (!(class424.Method2054(1) instanceof EntityMob)) return null;
        Class1067.Method4334(class424);
        return null;
    }), Class1736.Field15965, 3),
    Field9094(Class1067.Method4331().Method7663(class424 -> {
        if (!(class424.Method2054(1) instanceof EntityAnimal)) return null;
        Class1067.Method4334(class424);
        return null;
    }), Class1736.Field15965, 4),
    Field9095(Class1067.Method4331().Method7663(class424 -> {
        if (!(class424.Method2054(1) instanceof EntityItemFrame)) return null;
        Class1067.Method4334(class424);
        return null;
    }), Class1736.Field15965, 5),
    Field9096(Class1067.Method4331().Method7663(class424 -> {
        if (!(class424.Method2054(1) instanceof EntityItem)) return null;
        Class1067.Method4334(class424);
        return null;
    }), Class1736.Field15965, 6),
    Field9097(Class1067.Method4332().Method7663(class424 -> {
        if (!(class424.Method2054(1) instanceof TileEntityChest)) return null;
        Class1067.Method4333(class424);
        return null;
    }), Class1736.Field15966, 7),
    Field9098(Class1067.Method4332().Method7663(class424 -> {
        if (!(class424.Method2054(1) instanceof TileEntityEnderChest)) return null;
        Class1067.Method4333(class424);
        return null;
    }), Class1736.Field15966, 8),
    Field9099(Class1067.Method4332().Method7663(class424 -> {
        if (!(class424.Method2054(1) instanceof TileEntityFurnace)) return null;
        Class1067.Method4333(class424);
        return null;
    }), Class1736.Field15966, 9),
    Field9100(Class1067.Method4332().Method7663(class424 -> {
        if (!(class424.Method2054(1) instanceof TileEntityEnchantmentTable)) return null;
        Class1067.Method4333(class424);
        return null;
    }), Class1736.Field15966, 10),
    Field9101(Class1067.Method4332().Method7663(class424 -> {
        if (!(class424.Method2054(1) instanceof TileEntityDropper)) return null;
        Class1067.Method4333(class424);
        return null;
    }), Class1736.Field15966, 11),
    Field9102(Class1067.Method4332().Method7663(class424 -> {
        if (!(class424.Method2054(1) instanceof TileEntityDispenser)) return null;
        Class1067.Method4333(class424);
        return null;
    }), Class1736.Field15966, 12),
    Field9103(Class1067.Method4332().Method7663(class424 -> {
        if (!(class424.Method2054(1) instanceof TileEntityHopper)) return null;
        Class1067.Method4333(class424);
        return null;
    }), Class1736.Field15966, 13),
    Field9104(Class1067.Method4332().Method7663(class424 -> {
        if (!(class424.Method2054(1) instanceof TileEntityComparator)) return null;
        Class1067.Method4333(class424);
        return null;
    }), Class1736.Field15966, 14),
    Field9105(Class1067.Method4332().Method7663(class424 -> {
        if (!(class424.Method2054(1) instanceof TileEntityDaylightDetector)) return null;
        Class1067.Method4333(class424);
        return null;
    }), Class1736.Field15966, 15),
    Field9106(Class1067.Method4332().Method7663(class424 -> {
        if (!(class424.Method2054(1) instanceof TileEntityEndGateway)) return null;
        Class1067.Method4333(class424);
        return null;
    }), Class1736.Field15966, 16),
    Field9107(Class1067.Method4332().Method7663(class424 -> {
        if (!(class424.Method2054(1) instanceof TileEntityEndPortal)) return null;
        Class1067.Method4333(class424);
        return null;
    }), Class1736.Field15966, 17),
    Field9108(Class1067.Method4332().Method7663(class424 -> {
        if (!(class424.Method2054(1) instanceof TileEntityFlowerPot)) return null;
        Class1067.Method4333(class424);
        return null;
    }), Class1736.Field15966, 18),
    Field9109(Class1067.Method4332().Method7663(class424 -> {
        if (!(class424.Method2054(1) instanceof TileEntityMobSpawner)) return null;
        Class1067.Method4333(class424);
        return null;
    }), Class1736.Field15966, 19),
    Field9110(Class1067.Method4332().Method7663(class424 -> {
        if (!(class424.Method2054(1) instanceof TileEntityNote)) return null;
        Class1067.Method4333(class424);
        return null;
    }), Class1736.Field15966, 20),
    Field9111(Class1067.Method4332().Method7663(class424 -> {
        if (!(class424.Method2054(1) instanceof TileEntityPiston)) return null;
        Class1067.Method4333(class424);
        return null;
    }), Class1736.Field15966, 21),
    Field9112(Class1067.Method4332().Method7663(class424 -> {
        if (!(class424.Method2054(1) instanceof TileEntityShulkerBox)) return null;
        Class1067.Method4333(class424);
        return null;
    }), Class1736.Field15966, 22),
    Field9113(Class1067.Method4332().Method7663(class424 -> {
        if (!(class424.Method2054(1) instanceof TileEntitySign)) return null;
        Class1067.Method4333(class424);
        return null;
    }), Class1736.Field15966, 23),
    Field9114(Class1067.Method4332().Method7663(class424 -> {
        if (!(class424.Method2054(1) instanceof TileEntitySkull)) return null;
        Class1067.Method4333(class424);
        return null;
    }), Class1736.Field15966, 24);

    private final Class1763 Field9115;
    private final Class1736 Field9116;
    private final int Field9117;
    private String Field9119 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class250(int n) {
        void var5_3;
        void var4_2;
        this.Field9115 = (Class1763)n;
        this.Field9116 = var4_2;
        this.Field9117 = var5_3;
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

    public static ArrayList Method1338(Class1736 class1736) {
        ArrayList<Class250> arrayList = new ArrayList<Class250>();
        Class250[] class250Array = Class250.values();
        int n = class250Array.length;
        int n2 = 0;
        while (n2 < n) {
            Class250 class250 = class250Array[n2];
            if (class250.Method1336() == class1736) {
                arrayList.add(class250);
            }
            ++n2;
        }
        return arrayList;
    }

    private static String Method1364(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 90;
            cArray2[n] = (char)(cArray[n] ^ (0x6C11 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

