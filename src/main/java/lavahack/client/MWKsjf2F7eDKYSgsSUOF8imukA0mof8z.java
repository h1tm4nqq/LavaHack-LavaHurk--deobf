//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.nbt.NBTBase
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentTranslation
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.Event
 */
package lavahack.client;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.annotation.Nullable;
import lavahack.client.Dzn1Ljyn2t1F2YNKRB8j0La5dEFOv3fx;
import lavahack.client.ERJdAz6LKm7eRk405jGUw5Zgd2TsWrHB;
import lavahack.client.FnMnQEZeYkCv2h9xVsbXfLr1gewxdJzx;
import lavahack.client.aqV9H7eKQHMBYcZ6cWIeUDB2bTxp64KF;
import lavahack.client.kQ72jH1kluusFFUnlWwOgQ64UIYIqb8r;
import lavahack.client.meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU;
import lavahack.client.pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.Event;

public abstract class MWKsjf2F7eDKYSgsSUOF8imukA0mof8z {
    public static final Map Field8593 = new LinkedHashMap();
    public static String Field8594;
    private String Field8595 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public abstract meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU Method990(NBTTagCompound var1);

    public abstract boolean Method991(NBTTagCompound var1, meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU var2);

    public abstract String Method992();

    public abstract String Method993();

    public static meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU Method994(File file) {
        MWKsjf2F7eDKYSgsSUOF8imukA0mof8z mWKsjf2F7eDKYSgsSUOF8imukA0mof8z;
        NBTTagCompound nBTTagCompound = kQ72jH1kluusFFUnlWwOgQ64UIYIqb8r.Method1526(file);
        if (nBTTagCompound.hasKey("Materials")) {
            String string = nBTTagCompound.getString("Materials");
            mWKsjf2F7eDKYSgsSUOF8imukA0mof8z = (MWKsjf2F7eDKYSgsSUOF8imukA0mof8z)Field8593.get(string);
            if (mWKsjf2F7eDKYSgsSUOF8imukA0mof8z != null) return mWKsjf2F7eDKYSgsSUOF8imukA0mof8z.Method990(nBTTagCompound);
            throw new Dzn1Ljyn2t1F2YNKRB8j0La5dEFOv3fx(string);
        }
        mWKsjf2F7eDKYSgsSUOF8imukA0mof8z = (MWKsjf2F7eDKYSgsSUOF8imukA0mof8z)Field8593.get("Structure");
        return mWKsjf2F7eDKYSgsSUOF8imukA0mof8z.Method990(nBTTagCompound);
    }

    public static meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU Method995(File file, String string) {
        return MWKsjf2F7eDKYSgsSUOF8imukA0mof8z.Method994(new File(file, string));
    }

    public static boolean Method996(File file, @Nullable @Nullable String string, meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2) {
        if (string == null) {
            string = Field8594;
        }
        if (!Field8593.containsKey(string)) {
            throw new Dzn1Ljyn2t1F2YNKRB8j0La5dEFOv3fx(string);
        }
        ERJdAz6LKm7eRk405jGUw5Zgd2TsWrHB eRJdAz6LKm7eRk405jGUw5Zgd2TsWrHB = new ERJdAz6LKm7eRk405jGUw5Zgd2TsWrHB(meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2);
        MinecraftForge.EVENT_BUS.post((Event)eRJdAz6LKm7eRk405jGUw5Zgd2TsWrHB);
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        ((MWKsjf2F7eDKYSgsSUOF8imukA0mof8z)Field8593.get(string)).Method991(nBTTagCompound, meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2);
        DataOutputStream dataOutputStream = new DataOutputStream(new GZIPOutputStream(new FileOutputStream(file)));
        Class[] classArray = new Class[(int)-433588802L ^ 0xE627F5BD];
        classArray[(int)((long)979524237 ^ (long)979524237)] = String.class;
        classArray[(int)((long)2124476012 ^ (long)2124476013)] = NBTBase.class;
        classArray[(int)((long)307691978 ^ (long)307691979) << 1] = DataOutput.class;
        Method method = Class.forName("NBTTagCompound").getDeclaredMethod("writeEntry", classArray);
        method.setAccessible(((int)1686782963L ^ 0x648A43F2) != 0);
        Object[] objectArray = new Object[(int)-18925201L ^ 0xFEDF396C];
        objectArray[(int)((long)1619838707 ^ (long)1619838707)] = "Schematic";
        objectArray[(int)((long)-255221687 ^ (long)-255221688)] = nBTTagCompound;
        objectArray[(int)((long)-1613249501 ^ (long)-1613249502) << 1] = dataOutputStream;
        method.invoke(null, objectArray);
        dataOutputStream.close();
        return (int)((long)-1136049553 ^ (long)-1136049554) != 0;
    }

    public static boolean Method997(File file, String string, @Nullable @Nullable String string2, meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2) {
        return MWKsjf2F7eDKYSgsSUOF8imukA0mof8z.Method996(new File(file, string), string2, meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2);
    }

    public static void Method998(File file, @Nullable @Nullable String string, meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2, EntityPlayer entityPlayer) {
        boolean bl = MWKsjf2F7eDKYSgsSUOF8imukA0mof8z.Method996(file, string, meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2);
        String string2 = bl ? "schematica.command.save.saveSucceeded" : "schematica.command.save.saveFailed";
        Object[] objectArray = new Object[(int)((long)-1508863619 ^ (long)-1508863620)];
        objectArray[(int)((long)1302902836 ^ (long)1302902836)] = file.getName();
        entityPlayer.sendMessage((ITextComponent)new TextComponentTranslation(string2, objectArray));
    }

    public static String Method999(String string) {
        if (Field8593.containsKey(string)) return ((MWKsjf2F7eDKYSgsSUOF8imukA0mof8z)Field8593.get(string)).Method992();
        pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.warn("No format with id {}; returning invalid for name", (Object)string, (Object)new Dzn1Ljyn2t1F2YNKRB8j0La5dEFOv3fx(string).fillInStackTrace());
        return "schematica.format.invalid";
    }

    public static String Method1000(@Nullable @Nullable String string) {
        if (string == null) {
            string = Field8594;
        }
        if (Field8593.containsKey(string)) return ((MWKsjf2F7eDKYSgsSUOF8imukA0mof8z)Field8593.get(string)).Method993();
        pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.warn("No format with id {}; returning default extension", (Object)string, (Object)new Dzn1Ljyn2t1F2YNKRB8j0La5dEFOv3fx(string).fillInStackTrace());
        string = Field8594;
        return ((MWKsjf2F7eDKYSgsSUOF8imukA0mof8z)Field8593.get(string)).Method993();
    }

    static {
        Field8593.put("Alpha", new FnMnQEZeYkCv2h9xVsbXfLr1gewxdJzx());
        Field8593.put("Structure", new aqV9H7eKQHMBYcZ6cWIeUDB2bTxp64KF());
        Field8594 = "Alpha";
    }

    private static String Method1001(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1110497116L ^ 0x4230D75C;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)164901401 ^ (long)164901606);
            int n2 = (int)-224781116L ^ 0xF29A1C01;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1159742211 ^ (long)-1159745052) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

