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
import lavahack.client.fngsl4SpoGimKET7ObTK86S7LE0HvbxZ;
import lavahack.client.hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs;
import lavahack.client.mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV;
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

public final class fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9090 = new fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Hands", (int)((long)-106077229 ^ (long)-106077229), fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4330().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4335().entityRenderer.renderHand(((Float)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)-1291967779L ^ 0xB2FE22DD)).floatValue(), (int)((long)-1912238447 ^ (long)-1912238448) << 1);
        return null;
    }), mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV.Field15967, (int)-1844019508L ^ 0x92167ECC);
    public static final /* enum */ fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9091 = new fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Players", (int)((long)185702378 ^ (long)185702379), fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4331().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        if (!(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)-1167593966L ^ 0xBA67EE13) instanceof EntityPlayer)) return null;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4334(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
        return null;
    }), mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV.Field15965, (int)463028090L ^ 0x1B993F7B);
    public static final /* enum */ fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9092 = new fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Crystals", ((int)720671877L ^ 0x2AF49484) << 1, fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4331().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        if (!(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)975736009L ^ 0x3A288CC8) instanceof EntityEnderCrystal)) return null;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4334(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
        return null;
    }), mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV.Field15965, ((int)665362437L ^ 0x27A8A004) << 1);
    public static final /* enum */ fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9093 = new fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Monsters", (int)((long)-903960787 ^ (long)-903960786), fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4331().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        if (!(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)-495101151 ^ (long)-495101152)) instanceof EntityMob)) return null;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4334(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
        return null;
    }), mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV.Field15965, (int)-306926586L ^ 0xEDB4AC05);
    public static final /* enum */ fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9094 = new fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Animals", (int)((long)1467017316 ^ (long)1467017317) << 2, fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4331().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        if (!(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)359571084 ^ (long)359571085)) instanceof EntityAnimal)) return null;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4334(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
        return null;
    }), mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV.Field15965, ((int)-131347058L ^ 0xF82BCD8F) << 2);
    public static final /* enum */ fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9095 = new fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Frames", (int)672854727L ^ 0x281AF2C2, fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4331().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        if (!(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)110221890L ^ 0x691DA43) instanceof EntityItemFrame)) return null;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4334(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
        return null;
    }), mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV.Field15965, (int)-1179664414L ^ 0xB9AFBFE7);
    public static final /* enum */ fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9096 = new fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Items", (int)((long)500408670 ^ (long)500408669) << 1, fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4331().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        if (!(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)-3284931L ^ 0xFFCDE03C) instanceof EntityItem)) return null;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4334(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
        return null;
    }), mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV.Field15965, ((int)156909733L ^ 0x95A40A6) << 1);
    public static final /* enum */ fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9097 = new fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Chests", (int)((long)-911606941 ^ (long)-911606940), fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4332().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        if (!(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)-917217798L ^ 0xC9545DFB) instanceof TileEntityChest)) return null;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4333(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
        return null;
    }), mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV.Field15966, (int)407390651L ^ 0x184849BC);
    public static final /* enum */ fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9098 = new fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("EnderChests", ((int)859420942L ^ 0x3339B90F) << 3, fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4332().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        if (!(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)-511917786 ^ (long)-511917785)) instanceof TileEntityEnderChest)) return null;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4333(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
        return null;
    }), mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV.Field15966, (int)((long)1866132302 ^ (long)1866132303) << 3);
    public static final /* enum */ fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9099 = new fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Furnaces", (int)1610676744L ^ 0x6000FA01, fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4332().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        if (!(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)170251528 ^ (long)170251529)) instanceof TileEntityFurnace)) return null;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4333(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
        return null;
    }), mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV.Field15966, (int)((long)-607898411 ^ (long)-607898404));
    public static final /* enum */ fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9100 = new fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("EnchantmentTables", ((int)-147523167L ^ 0xF734F9A4) << 1, fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4332().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        if (!(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)-843855807 ^ (long)-843855808)) instanceof TileEntityEnchantmentTable)) return null;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4333(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
        return null;
    }), mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV.Field15966, (int)((long)-1760983799 ^ (long)-1760983796) << 1);
    public static final /* enum */ fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9101 = new fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Droppers", (int)-1654455894L ^ 0x9D6301A1, fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4332().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        if (!(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)-222755629L ^ 0xF2B904D2) instanceof TileEntityDropper)) return null;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4333(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
        return null;
    }), mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV.Field15966, (int)((long)-850196891 ^ (long)-850196882));
    public static final /* enum */ fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9102 = new fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Dispensers", ((int)-1478264035L ^ 0xA7E37B1E) << 2, fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4332().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        if (!(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)-517710462L ^ 0xE1245D83) instanceof TileEntityDispenser)) return null;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4333(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
        return null;
    }), mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV.Field15966, (int)((long)1510189007 ^ (long)1510189004) << 2);
    public static final /* enum */ fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9103 = new fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Hoppers", (int)862222874L ^ 0x33647A17, fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4332().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        if (!(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)-414160707L ^ 0xE75068BC) instanceof TileEntityHopper)) return null;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4333(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
        return null;
    }), mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV.Field15966, (int)523836916L ^ 0x1F391DF9);
    public static final /* enum */ fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9104 = new fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Comparators", ((int)-1187372069L ^ 0xB93A23DC) << 1, fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4332().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        if (!(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)898359251 ^ (long)898359250)) instanceof TileEntityComparator)) return null;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4333(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
        return null;
    }), mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV.Field15966, ((int)-1725609946L ^ 0x99254821) << 1);
    public static final /* enum */ fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9105 = new fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("DaylightDetectors", (int)566218192L ^ 0x21BFCDDF, fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4332().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        if (!(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)2141730566L ^ 0x7FA83707) instanceof TileEntityDaylightDetector)) return null;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4333(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
        return null;
    }), mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV.Field15966, (int)413200317L ^ 0x18A0EFB2);
    public static final /* enum */ fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9106 = new fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("EndGateway", ((int)-635448695L ^ 0xDA1FD288) << 4, fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4332().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        if (!(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)1549508526 ^ (long)1549508527)) instanceof TileEntityEndGateway)) return null;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4333(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
        return null;
    }), mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV.Field15966, (int)((long)887075444 ^ (long)887075445) << 4);
    public static final /* enum */ fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9107 = new fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("EndPortals", (int)729686955L ^ 0x2B7E23BA, fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4332().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        if (!(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)-535689740L ^ 0xE01205F5) instanceof TileEntityEndPortal)) return null;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4333(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
        return null;
    }), mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV.Field15966, (int)601907256L ^ 0x23E06029);
    public static final /* enum */ fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9108 = new fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("FlowerPots", (int)((long)-1764052325 ^ (long)-1764052334) << 1, fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4332().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        if (!(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)1531709175 ^ (long)1531709174)) instanceof TileEntityFlowerPot)) return null;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4333(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
        return null;
    }), mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV.Field15966, ((int)717325699L ^ 0x2AC1858A) << 1);
    public static final /* enum */ fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9109 = new fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Spawners", (int)((long)-1203784457 ^ (long)-1203784476), fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4332().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        if (!(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)144538278 ^ (long)144538279)) instanceof TileEntityMobSpawner)) return null;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4333(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
        return null;
    }), mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV.Field15966, (int)1793901125L ^ 0x6AECC256);
    public static final /* enum */ fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9110 = new fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("NoteBlocks", (int)((long)-1117630429 ^ (long)-1117630426) << 2, fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4332().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        if (!(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)-344413086 ^ (long)-344413085)) instanceof TileEntityNote)) return null;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4333(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
        return null;
    }), mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV.Field15966, ((int)-1599970298L ^ 0xA0A26403) << 2);
    public static final /* enum */ fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9111 = new fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Pistons", (int)((long)33666668 ^ (long)33666681), fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4332().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        if (!(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)-1515481377 ^ (long)-1515481378)) instanceof TileEntityPiston)) return null;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4333(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
        return null;
    }), mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV.Field15966, (int)761060953L ^ 0x2D5CDE4C);
    public static final /* enum */ fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9112 = new fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Shulkers", ((int)626551780L ^ 0x25586BEF) << 1, fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4332().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        if (!(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)-1562104210 ^ (long)-1562104209)) instanceof TileEntityShulkerBox)) return null;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4333(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
        return null;
    }), mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV.Field15966, ((int)780075796L ^ 0x2E7F031F) << 1);
    public static final /* enum */ fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9113 = new fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Signs", (int)((long)617598531 ^ (long)617598548), fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4332().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        if (!(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)-1716217141L ^ 0x99B49ACA) instanceof TileEntitySign)) return null;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4333(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
        return null;
    }), mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV.Field15966, (int)((long)-1229529033 ^ (long)-1229529056));
    public static final /* enum */ fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9114 = new fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Skull", ((int)-2074860944L ^ 0x84542273) << 3, fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4332().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        if (!(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)1229948655L ^ 0x494F86EE) instanceof TileEntitySkull)) return null;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ.Method4333(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
        return null;
    }), mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV.Field15966, ((int)595974955L ^ 0x2385DB28) << 3);
    private final hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs Field9115;
    private final mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV Field9116;
    private final int Field9117;
    private static final fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field9118;
    private String Field9119 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field9118.clone();
    }

    public static fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(int n) {
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
        this.Field9115 = (hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs)n;
        this.Field9116 = var4_2;
        this.Field9117 = var5_3;
    }

    public hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs Method1335() {
        return this.Field9115;
    }

    public mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV Method1336() {
        return this.Field9116;
    }

    public int Method1337() {
        return this.Field9117;
    }

    public static ArrayList Method1338(mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV2) {
        ArrayList<fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi> arrayList = new ArrayList<fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi>();
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.values();
        int n = fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray.length;
        int n2 = (int)((long)-1425119258 ^ (long)-1425119258);
        while (n2 < n) {
            fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[n2];
            if (fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method1336() == mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV2) {
                arrayList.add(fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
            }
            ++n2;
        }
        return arrayList;
    }

    static {
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)447345614L ^ 0x1AA9F3D7];
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)381332154 ^ (long)381332154)] = Field9090;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-1377209548 ^ (long)-1377209547)] = Field9091;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)-1455912105L ^ 0xA9388B56) << 1] = Field9092;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-408200392 ^ (long)-408200389)] = Field9093;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)1470547314L ^ 0x57A6C573) << 2] = Field9094;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-1931943176 ^ (long)-1931943171)] = Field9095;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)-501814365L ^ 0xE216EBA0) << 1] = Field9096;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-297818530L ^ 0xEE3FA659] = Field9097;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-1465427950 ^ (long)-1465427949) << 3] = Field9098;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)351743527L ^ 0x14F72E2E] = Field9099;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)-708247311L ^ 0xD5C900F4) << 1] = Field9100;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)2057359809L ^ 0x7AA0D1CA] = Field9101;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)-435051365L ^ 0xE611A498) << 2] = Field9102;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)1306538673 ^ (long)1306538684)] = Field9103;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-547817867 ^ (long)-547817870) << 1] = Field9104;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-756262233L ^ 0xD2EC5AA8] = Field9105;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)2026764789 ^ (long)2026764788) << 4] = Field9106;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-440558272L ^ 0xE5BD9D51] = Field9107;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)1517390688 ^ (long)1517390697) << 1] = Field9108;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-542970682L ^ 0xDFA2ECD5] = Field9109;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)1398225879L ^ 0x53573BD2) << 2] = Field9110;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-77402408 ^ (long)-77402419)] = Field9111;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-764752343 ^ (long)-764752350) << 1] = Field9112;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)1928339011 ^ (long)1928339028)] = Field9113;
        fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)422699077 ^ (long)422699078) << 3] = Field9114;
        Field9118 = fngsl4SpoGimKET7ObTK86S7LE0HvbxZ$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method1364(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1978976219 ^ (long)-1978976219);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-852611487L ^ 0xCD2E2E9E);
            int n2 = (int)((long)-1456157219 ^ (long)-1456157200) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)276244273 ^ (long)276253472) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

