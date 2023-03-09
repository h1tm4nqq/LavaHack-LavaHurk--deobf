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
import lavahack.client.Class1341;
import lavahack.client.Class292;
import lavahack.client.Class542;
import lavahack.client.Class666;
import lavahack.client.Class686;
import lavahack.client.Class797;
import lavahack.client.Class881;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.Event;

public abstract class Class153 {
    public static final Map Field8593 = new LinkedHashMap();
    public static String Field8594;
    private String Field8595 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public abstract Class686 Method990(NBTTagCompound var1);

    public abstract boolean Method991(NBTTagCompound var1, Class686 var2);

    public abstract String Method992();

    public abstract String Method993();

    public static Class686 Method994(File file) {
        Class153 class153;
        NBTTagCompound nBTTagCompound = Class292.Method1526(file);
        if (nBTTagCompound.hasKey("Materials")) {
            String string = nBTTagCompound.getString("Materials");
            class153 = (Class153)Field8593.get(string);
            if (class153 != null) return class153.Method990(nBTTagCompound);
            throw new Class881(string);
        }
        class153 = (Class153)Field8593.get("Structure");
        return class153.Method990(nBTTagCompound);
    }

    public static Class686 Method995(File file, String string) {
        return Class153.Method994(new File(file, string));
    }

    public static boolean Method996(File file, @Nullable @Nullable String string, Class686 class686) {
        if (string == null) {
            string = Field8594;
        }
        if (!Field8593.containsKey(string)) {
            throw new Class881(string);
        }
        Class666 class666 = new Class666(class686);
        MinecraftForge.EVENT_BUS.post((Event)class666);
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        ((Class153)Field8593.get(string)).Method991(nBTTagCompound, class686);
        DataOutputStream dataOutputStream = new DataOutputStream(new GZIPOutputStream(new FileOutputStream(file)));
        Method method = Class.forName("NBTTagCompound").getDeclaredMethod("writeEntry", String.class, NBTBase.class, DataOutput.class);
        method.setAccessible(true);
        method.invoke(null, "Schematic", nBTTagCompound, dataOutputStream);
        dataOutputStream.close();
        return true;
    }

    public static boolean Method997(File file, String string, @Nullable @Nullable String string2, Class686 class686) {
        return Class153.Method996(new File(file, string), string2, class686);
    }

    public static void Method998(File file, @Nullable @Nullable String string, Class686 class686, EntityPlayer entityPlayer) {
        boolean bl = Class153.Method996(file, string, class686);
        String string2 = bl ? "schematica.command.save.saveSucceeded" : "schematica.command.save.saveFailed";
        entityPlayer.sendMessage((ITextComponent)new TextComponentTranslation(string2, new Object[]{file.getName()}));
    }

    public static String Method999(String string) {
        if (Field8593.containsKey(string)) return ((Class153)Field8593.get(string)).Method992();
        Class542.Field10314.warn("No format with id {}; returning invalid for name", (Object)string, (Object)new Class881(string).fillInStackTrace());
        return "schematica.format.invalid";
    }

    public static String Method1000(@Nullable @Nullable String string) {
        if (string == null) {
            string = Field8594;
        }
        if (Field8593.containsKey(string)) return ((Class153)Field8593.get(string)).Method993();
        Class542.Field10314.warn("No format with id {}; returning default extension", (Object)string, (Object)new Class881(string).fillInStackTrace());
        string = Field8594;
        return ((Class153)Field8593.get(string)).Method993();
    }

    static {
        Field8593.put("Alpha", new Class1341());
        Field8593.put("Structure", new Class797());
        Field8594 = "Alpha";
    }

    private static String Method1001(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 197;
            cArray2[n] = (char)(cArray[n] ^ (0x68C8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

