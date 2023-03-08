//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import javax.annotation.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.util.zip.*;
import net.minecraft.nbt.*;
import java.io.*;
import java.lang.reflect.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.text.*;
import java.util.*;

public abstract class Class153
{
    public static final Map Field8593;
    public static String Field8594;
    private String Field8595 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public abstract Class686 Method990(final NBTTagCompound p0);
    
    public abstract boolean Method991(final NBTTagCompound p0, final Class686 p1);
    
    public abstract String Method992();
    
    public abstract String Method993();
    
    public static Class686 Method994(final File file) {
        final NBTTagCompound method1526 = Class292.Method1526(file);
        Class153 class153;
        if (method1526.hasKey("Materials")) {
            final String getString = method1526.getString("Materials");
            class153 = Class153.Field8593.get(getString);
            if (class153 == null) {
                throw new Class881(getString);
            }
        }
        else {
            class153 = Class153.Field8593.get("Structure");
        }
        return class153.Method990(method1526);
    }
    
    public static Class686 Method995(final File parent, final String child) {
        return Method994(new File(parent, child));
    }
    
    public static boolean Method996(final File file, @Nullable @Nullable String field8594, final Class686 class686) {
        if (field8594 == null) {
            field8594 = Class153.Field8594;
        }
        if (!Class153.Field8593.containsKey(field8594)) {
            throw new Class881(field8594);
        }
        MinecraftForge.EVENT_BUS.post((Event)new Class666(class686));
        final NBTTagCompound nbtTagCompound = new NBTTagCompound();
        Class153.Field8593.get(field8594).Method991(nbtTagCompound, class686);
        final DataOutputStream dataOutputStream = new DataOutputStream(new GZIPOutputStream(new FileOutputStream(file)));
        final Method declaredMethod = Class.forName("NBTTagCompound").getDeclaredMethod("writeEntry", String.class, NBTBase.class, DataOutput.class);
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(null, "Schematic", nbtTagCompound, dataOutputStream);
        dataOutputStream.close();
        return true;
    }
    
    public static boolean Method997(final File parent, final String child, @Nullable @Nullable final String s, final Class686 class686) {
        return Method996(new File(parent, child), s, class686);
    }
    
    public static void Method998(final File file, @Nullable @Nullable final String s, final Class686 class686, final EntityPlayer entityPlayer) {
        entityPlayer.sendMessage((ITextComponent)new TextComponentTranslation(Method996(file, s, class686) ? "schematica.command.save.saveSucceeded" : "schematica.command.save.saveFailed", new Object[] { file.getName() }));
    }
    
    public static String Method999(final String s) {
        if (!Class153.Field8593.containsKey(s)) {
            Class542.Field10314.warn("No format with id {}; returning invalid for name", (Object)s, (Object)new Class881(s).fillInStackTrace());
            return "schematica.format.invalid";
        }
        return Class153.Field8593.get(s).Method992();
    }
    
    public static String Method1000(@Nullable @Nullable String s) {
        if (s == null) {
            s = Class153.Field8594;
        }
        if (!Class153.Field8593.containsKey(s)) {
            Class542.Field10314.warn("No format with id {}; returning default extension", (Object)s, (Object)new Class881(s).fillInStackTrace());
            s = Class153.Field8594;
        }
        return Class153.Field8593.get(s).Method993();
    }
    
    static {
        (Field8593 = new LinkedHashMap()).put("Alpha", new Class1341());
        Class153.Field8593.put("Structure", new Class797());
        Class153.Field8594 = "Alpha";
    }
    
    private static String Method1001(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x68C8 ^ 0xC5));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
