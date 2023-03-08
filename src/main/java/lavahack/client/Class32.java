//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.io.*;
import net.minecraftforge.common.config.*;
import net.minecraft.block.*;
import net.minecraft.util.*;
import net.minecraft.init.*;
import net.minecraftforge.fml.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.util.*;

public class Class32
{
    public static final Class32 Field7946;
    public static final String Field7947;
    public static Configuration Field7948;
    public static final boolean Field7949;
    public static final boolean Field7950;
    public static final boolean Field7951;
    public static final double Field7952;
    public static final boolean Field7953;
    public static final boolean Field7954;
    public static final double Field7955;
    public static final int Field7956;
    public static final int Field7957;
    public static final int Field7958;
    public static final int Field7959;
    public static final boolean Field7960;
    public static final boolean Field7961;
    public static final boolean Field7962;
    public static final boolean Field7963;
    public static final boolean[] Field7964;
    public static final String Field7965;
    public static final File Field7966;
    public static final String[] Field7967;
    public static final String Field7968;
    public static final boolean Field7969;
    public static final boolean Field7970;
    public static final boolean Field7971;
    public static final int Field7972;
    public static boolean Field7973;
    public static boolean Field7974;
    public static boolean Field7975;
    public static float Field7976;
    public static boolean Field7977;
    public static boolean Field7978;
    public static double Field7979;
    public static int Field7980;
    public static int Field7981;
    public static int Field7982;
    public static int Field7983;
    public static boolean Field7984;
    public static boolean Field7985;
    public static boolean Field7986;
    public static boolean Field7987;
    public static boolean[] Field7988;
    public static final Queue Field7989;
    public static File Field7990;
    public static String[] Field7991;
    public static String Field7992;
    public static boolean Field7993;
    public static boolean Field7994;
    public static boolean Field7995;
    public static int Field7996;
    public static Property Field7997;
    public static Property Field7998;
    public static Property Field7999;
    public static Property Field8000;
    public static Property Field8001;
    public static Property Field8002;
    public static Property Field8003;
    public static Property Field8004;
    public static Property Field8005;
    public static Property Field8006;
    public static Property Field8007;
    public static Property Field8008;
    public static Property Field8009;
    public static Property Field8010;
    public static Property Field8011;
    public static Property[] Field8012;
    public static Property Field8013;
    public static Property Field8014;
    public static Property Field8015;
    public static Property Field8016;
    public static Property Field8017;
    public static Property Field8018;
    public static Property Field8019;
    private static final Set Field8020;
    private int Field8021;
    
    public static void Method252(final File file) {
        if (Class32.Field7948 == null) {
            Class32.Field7948 = new Configuration(file, "1");
            Method253();
        }
    }
    
    public static void Method253() {
        Method254();
        Method255();
        Method256();
        Method257();
        Method258();
        Method263();
        Class2101.Field17565.Method410();
        if (Class32.Field7948.hasChanged()) {
            Class32.Field7948.save();
        }
    }
    
    private static void Method254() {
        (Class32.Field7997 = Class32.Field7948.get("debug", "dumpBlockList", false, "Dump all block states on startup.")).setLanguageKey("schematica.config.dumpBlockList");
        Class32.Field7997.requiresMcRestart();
        Class32.Field7973 = Class32.Field7997.getBoolean(false);
        (Class32.Field7998 = Class32.Field7948.get("debug", "showDebugInfo", true, "Display extra information on the debug screen (F3).")).setLanguageKey("schematica.config.showDebugInfo");
        Class32.Field7974 = Class32.Field7998.getBoolean(true);
    }
    
    private static void Method255() {
        (Class32.Field7999 = Class32.Field7948.get("render", "alphaEnabled", false, "Enable transparent textures.")).setLanguageKey("schematica.config.alphaEnabled");
        Class32.Field7975 = Class32.Field7999.getBoolean(false);
        (Class32.Field8000 = Class32.Field7948.get("render", "alpha", 1.0, "Alpha value used when rendering the schematic (1.0 = opaque, 0.5 = half transparent, 0.0 = transparent).", 0.0, 1.0)).setLanguageKey("schematica.config.alpha");
        Class32.Field7976 = (float)Class32.Field8000.getDouble(1.0);
        (Class32.Field8001 = Class32.Field7948.get("render", "highlight", true, "Highlight invalid placed blocks and to be placed blocks.")).setLanguageKey("schematica.config.highlight");
        Class32.Field7977 = Class32.Field8001.getBoolean(true);
        (Class32.Field8002 = Class32.Field7948.get("render", "highlightAir", true, "Highlight blocks that should be air.")).setLanguageKey("schematica.config.highlightAir");
        Class32.Field7978 = Class32.Field8002.getBoolean(true);
        (Class32.Field8003 = Class32.Field7948.get("render", "blockDelta", Double.longBitsToDouble((long)2029726179 ^ 0x3F747AE13F553D98L), "Delta value used for highlighting (if you experience z-fighting increase this).", 0.0, Double.longBitsToDouble(4596373779694328218L))).setLanguageKey("schematica.config.blockDelta");
        Class32.Field7979 = Class32.Field8003.getDouble(Double.longBitsToDouble((long)1233755468 ^ 0x3F747AE10E278937L));
        (Class32.Field8004 = Class32.Field7948.get("render", "renderDistance", 8, "Schematic render distance.", 2, 16)).setLanguageKey("schematica.config.renderDistance");
        Class32.Field7980 = Class32.Field8004.getInt(8);
    }
    
    private static void Method256() {
        (Class32.Field8005 = Class32.Field7948.get("printer", "placeDelay", 1, "Delay between placement attempts (in ticks).", 0, 20)).setLanguageKey("schematica.config.placeDelay");
        Class32.Field7981 = Class32.Field8005.getInt(1);
        (Class32.Field8006 = Class32.Field7948.get("printer", "timeout", 10, "Timeout before re-trying failed blocks.", 0, 100)).setLanguageKey("schematica.config.timeout");
        Class32.Field7982 = Class32.Field8006.getInt(10);
        (Class32.Field8007 = Class32.Field7948.get("printer", "placeDistance", 5, "Maximum placement distance.", 1, 5)).setLanguageKey("schematica.config.placeDistance");
        Class32.Field7983 = Class32.Field8007.getInt(5);
        (Class32.Field8008 = Class32.Field7948.get("printer", "placeInstantly", false, "Place all blocks that can be placed in one tick.")).setLanguageKey("schematica.config.placeInstantly");
        Class32.Field7984 = Class32.Field8008.getBoolean(false);
        (Class32.Field8009 = Class32.Field7948.get("printer", "destroyBlocks", false, "The printer will destroy blocks (creative mode only).")).setLanguageKey("schematica.config.destroyBlocks");
        Class32.Field7985 = Class32.Field8009.getBoolean(false);
        (Class32.Field8010 = Class32.Field7948.get("printer", "destroyInstantly", false, "Destroy all blocks that can be destroyed in one tick.")).setLanguageKey("schematica.config.destroyInstantly");
        Class32.Field7986 = Class32.Field8010.getBoolean(false);
        (Class32.Field8011 = Class32.Field7948.get("printer", "placeAdjacent", true, "Place blocks only if there is an adjacent block next to them.")).setLanguageKey("schematica.config.placeAdjacent");
        Class32.Field7987 = Class32.Field8011.getBoolean(true);
    }
    
    private static void Method257() {
        Class32.Field7989.clear();
        for (int i = 0; i < Class32.Field7964.length; ++i) {
            (Class32.Field8012[i] = Class32.Field7948.get("printer.swapslots", "swapSlot" + i, Class32.Field7964[i], "Allow the printer to use this hotbar slot.")).setLanguageKey("schematica.config.swapSlot" + i);
            Class32.Field7988[i] = Class32.Field8012[i].getBoolean(Class32.Field7964[i]);
            if (Class32.Field7988[i]) {
                Class32.Field7989.offer(i);
            }
        }
    }
    
    private static void Method258() {
        (Class32.Field8013 = Class32.Field7948.get("general", "schematicDirectory", "./schematics", "Schematic directory.")).setLanguageKey("schematica.config.schematicDirectory");
        Class32.Field7990 = Method259(Class32.Field8013.getString());
        (Class32.Field8014 = Class32.Field7948.get("general", "extraAirBlocks", Class32.Field7967, "Extra blocks to consider as air for the schematic renderer.")).setLanguageKey("schematica.config.extraAirBlocks");
        Class32.Field7991 = Class32.Field8014.getStringList();
        (Class32.Field8015 = Class32.Field7948.get("general", "sortType", "", "Default sort type for the material list.")).setShowInGui(false);
        Class32.Field7992 = Class32.Field8015.getString();
        Method260();
        Method262();
    }
    
    private static File Method259(final String pathname) {
        if (pathname.startsWith(".")) {
            return Class2101.Field17565.Method412(pathname);
        }
        return new File(pathname);
    }
    
    private static void Method260() {
        Class32.Field7990 = Class32.Field7990.getCanonicalFile();
        final String absolutePath = Class32.Field7990.getAbsolutePath();
        final String absolutePath2 = Class2101.Field17565.Method411().getAbsolutePath();
        final String method261 = Method261(absolutePath, absolutePath2);
        Class32.Field8013.set(method261);
        Class542.Field10314.debug("Schematic path: {}", (Object)absolutePath);
        Class542.Field10314.debug("Data path: {}", (Object)absolutePath2);
        Class542.Field10314.debug("New schematic path: {}", (Object)method261);
    }
    
    private static String Method261(final String s, final String prefix) {
        String string;
        if (s.startsWith(prefix)) {
            string = "." + s.substring(prefix.length());
        }
        else {
            string = s;
        }
        return string.replace("\\", "/");
    }
    
    private static void Method262() {
        Class32.Field8020.clear();
        final String[] field7991 = Class32.Field7991;
        for (int length = field7991.length, i = 0; i < length; ++i) {
            final Block block = (Block)Block.REGISTRY.getObject((Object)new ResourceLocation(field7991[i]));
            if (block != Blocks.AIR) {
                Class32.Field8020.add(block);
            }
        }
    }
    
    private static void Method263() {
        (Class32.Field8016 = Class32.Field7948.get("server", "printerEnabled", true, "Allow players to use the printer.")).setLanguageKey("schematica.config.printerEnabled");
        Class32.Field7993 = Class32.Field8016.getBoolean(true);
        (Class32.Field8017 = Class32.Field7948.get("server", "saveEnabled", true, "Allow players to save schematics.")).setLanguageKey("schematica.config.saveEnabled");
        Class32.Field7994 = Class32.Field8017.getBoolean(true);
        (Class32.Field8018 = Class32.Field7948.get("server", "loadEnabled", true, "Allow players to load schematics.")).setLanguageKey("schematica.config.loadEnabled");
        Class32.Field7995 = Class32.Field8018.getBoolean(true);
        (Class32.Field8019 = Class32.Field7948.get("server", "playerQuotaKilobytes", 8192, "Amount of storage provided per-player for schematics on the server.")).setLanguageKey("schematica.config.playerQuotaKilobytes");
        Class32.Field7996 = Class32.Field8019.getInt(8192);
    }
    
    private Class32() {
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method264(final ConfigChangedEvent$OnConfigChangedEvent configChangedEvent$OnConfigChangedEvent) {
        if (configChangedEvent$OnConfigChangedEvent.getModID().equalsIgnoreCase("schematica")) {
            Method253();
        }
    }
    
    public static boolean Method265(final Block block) {
        return Class32.Field8020.contains(block);
    }
    
    static {
        Field7972 = 8192;
        Field7971 = true;
        Field7970 = true;
        Field7969 = true;
        Field7968 = "";
        Field7965 = "./schematics";
        Field7963 = true;
        Field7962 = false;
        Field7961 = false;
        Field7960 = false;
        Field7959 = 5;
        Field7958 = 10;
        Field7957 = 1;
        Field7956 = 8;
        Field7955 = 0.0;
        Field7954 = true;
        Field7953 = true;
        Field7952 = 1.0;
        Field7951 = false;
        Field7950 = true;
        Field7949 = false;
        Field7947 = "1";
        Field7946 = new Class32();
        Field7964 = new boolean[] { false, false, false, false, false, true, true, true, true };
        Field7966 = new File(Class2101.Field17565.Method411(), "./schematics");
        Field7967 = new String[0];
        Class32.Field7973 = false;
        Class32.Field7974 = true;
        Class32.Field7975 = false;
        Class32.Field7976 = 1.0f;
        Class32.Field7977 = true;
        Class32.Field7978 = true;
        Class32.Field7979 = Double.longBitsToDouble((long)2050763145 ^ 0x3F747AE13D923DF2L);
        Class32.Field7980 = 8;
        Class32.Field7981 = 1;
        Class32.Field7982 = 10;
        Class32.Field7983 = 5;
        Class32.Field7984 = false;
        Class32.Field7985 = false;
        Class32.Field7986 = false;
        Class32.Field7987 = true;
        Class32.Field7988 = Arrays.copyOf(Class32.Field7964, Class32.Field7964.length);
        Field7989 = new ArrayDeque();
        Class32.Field7990 = Class32.Field7966;
        Class32.Field7991 = Arrays.copyOf(Class32.Field7967, Class32.Field7967.length);
        Class32.Field7992 = "";
        Class32.Field7993 = true;
        Class32.Field7994 = true;
        Class32.Field7995 = true;
        Class32.Field7996 = 8192;
        Class32.Field7997 = null;
        Class32.Field7998 = null;
        Class32.Field7999 = null;
        Class32.Field8000 = null;
        Class32.Field8001 = null;
        Class32.Field8002 = null;
        Class32.Field8003 = null;
        Class32.Field8004 = null;
        Class32.Field8005 = null;
        Class32.Field8006 = null;
        Class32.Field8007 = null;
        Class32.Field8008 = null;
        Class32.Field8009 = null;
        Class32.Field8010 = null;
        Class32.Field8011 = null;
        Class32.Field8012 = new Property[Class32.Field7964.length];
        Class32.Field8013 = null;
        Class32.Field8014 = null;
        Class32.Field8015 = null;
        Class32.Field8016 = null;
        Class32.Field8017 = null;
        Class32.Field8018 = null;
        Class32.Field8019 = null;
        Field8020 = new HashSet();
    }
    
    private static String Method266(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2CA8 ^ 0x62));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
