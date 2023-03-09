//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.common.config.Configuration
 *  net.minecraftforge.common.config.Property
 *  net.minecraftforge.fml.client.event.ConfigChangedEvent$OnConfigChangedEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import lavahack.client.Class2101;
import lavahack.client.Class542;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class32 {
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

    public static void Method252(File file) {
        if (Field7948 != null) return;
        Field7948 = new Configuration(file, "1");
        Class32.Method253();
    }

    public static void Method253() {
        Class32.Method254();
        Class32.Method255();
        Class32.Method256();
        Class32.Method257();
        Class32.Method258();
        Class32.Method263();
        Class2101.Field17565.Method410();
        if (!Field7948.hasChanged()) return;
        Field7948.save();
    }

    private static void Method254() {
        Field7997 = Field7948.get("debug", "dumpBlockList", false, "Dump all block states on startup.");
        Field7997.setLanguageKey("schematica.config.dumpBlockList");
        Field7997.requiresMcRestart();
        Field7973 = Field7997.getBoolean(false);
        Field7998 = Field7948.get("debug", "showDebugInfo", true, "Display extra information on the debug screen (F3).");
        Field7998.setLanguageKey("schematica.config.showDebugInfo");
        Field7974 = Field7998.getBoolean(true);
    }

    private static void Method255() {
        Field7999 = Field7948.get("render", "alphaEnabled", false, "Enable transparent textures.");
        Field7999.setLanguageKey("schematica.config.alphaEnabled");
        Field7975 = Field7999.getBoolean(false);
        Field8000 = Field7948.get("render", "alpha", 1.0, "Alpha value used when rendering the schematic (1.0 = opaque, 0.5 = half transparent, 0.0 = transparent).", 0.0, 1.0);
        Field8000.setLanguageKey("schematica.config.alpha");
        Field7976 = (float)Field8000.getDouble(1.0);
        Field8001 = Field7948.get("render", "highlight", true, "Highlight invalid placed blocks and to be placed blocks.");
        Field8001.setLanguageKey("schematica.config.highlight");
        Field7977 = Field8001.getBoolean(true);
        Field8002 = Field7948.get("render", "highlightAir", true, "Highlight blocks that should be air.");
        Field8002.setLanguageKey("schematica.config.highlightAir");
        Field7978 = Field8002.getBoolean(true);
        Field8003 = Field7948.get("render", "blockDelta", Double.longBitsToDouble((long)2029726179 ^ 0x3F747AE13F553D98L), "Delta value used for highlighting (if you experience z-fighting increase this).", 0.0, Double.longBitsToDouble(4596373779694328218L));
        Field8003.setLanguageKey("schematica.config.blockDelta");
        Field7979 = Field8003.getDouble(Double.longBitsToDouble((long)1233755468 ^ 0x3F747AE10E278937L));
        Field8004 = Field7948.get("render", "renderDistance", 8, "Schematic render distance.", 2, 16);
        Field8004.setLanguageKey("schematica.config.renderDistance");
        Field7980 = Field8004.getInt(8);
    }

    private static void Method256() {
        Field8005 = Field7948.get("printer", "placeDelay", 1, "Delay between placement attempts (in ticks).", 0, 20);
        Field8005.setLanguageKey("schematica.config.placeDelay");
        Field7981 = Field8005.getInt(1);
        Field8006 = Field7948.get("printer", "timeout", 10, "Timeout before re-trying failed blocks.", 0, 100);
        Field8006.setLanguageKey("schematica.config.timeout");
        Field7982 = Field8006.getInt(10);
        Field8007 = Field7948.get("printer", "placeDistance", 5, "Maximum placement distance.", 1, 5);
        Field8007.setLanguageKey("schematica.config.placeDistance");
        Field7983 = Field8007.getInt(5);
        Field8008 = Field7948.get("printer", "placeInstantly", false, "Place all blocks that can be placed in one tick.");
        Field8008.setLanguageKey("schematica.config.placeInstantly");
        Field7984 = Field8008.getBoolean(false);
        Field8009 = Field7948.get("printer", "destroyBlocks", false, "The printer will destroy blocks (creative mode only).");
        Field8009.setLanguageKey("schematica.config.destroyBlocks");
        Field7985 = Field8009.getBoolean(false);
        Field8010 = Field7948.get("printer", "destroyInstantly", false, "Destroy all blocks that can be destroyed in one tick.");
        Field8010.setLanguageKey("schematica.config.destroyInstantly");
        Field7986 = Field8010.getBoolean(false);
        Field8011 = Field7948.get("printer", "placeAdjacent", true, "Place blocks only if there is an adjacent block next to them.");
        Field8011.setLanguageKey("schematica.config.placeAdjacent");
        Field7987 = Field8011.getBoolean(true);
    }

    private static void Method257() {
        Field7989.clear();
        int n = 0;
        while (n < Field7964.length) {
            Class32.Field8012[n] = Field7948.get("printer.swapslots", "swapSlot" + n, Field7964[n], "Allow the printer to use this hotbar slot.");
            Field8012[n].setLanguageKey("schematica.config.swapSlot" + n);
            Class32.Field7988[n] = Field8012[n].getBoolean(Field7964[n]);
            if (Field7988[n]) {
                Field7989.offer(n);
            }
            ++n;
        }
    }

    private static void Method258() {
        Field8013 = Field7948.get("general", "schematicDirectory", "./schematics", "Schematic directory.");
        Field8013.setLanguageKey("schematica.config.schematicDirectory");
        Field7990 = Class32.Method259(Field8013.getString());
        Field8014 = Field7948.get("general", "extraAirBlocks", Field7967, "Extra blocks to consider as air for the schematic renderer.");
        Field8014.setLanguageKey("schematica.config.extraAirBlocks");
        Field7991 = Field8014.getStringList();
        Field8015 = Field7948.get("general", "sortType", "", "Default sort type for the material list.");
        Field8015.setShowInGui(false);
        Field7992 = Field8015.getString();
        Class32.Method260();
        Class32.Method262();
    }

    private static File Method259(String string) {
        if (!string.startsWith(".")) return new File(string);
        return Class2101.Field17565.Method412(string);
    }

    private static void Method260() {
        Field7990 = Field7990.getCanonicalFile();
        String string = Field7990.getAbsolutePath();
        String string2 = Class2101.Field17565.Method411().getAbsolutePath();
        String string3 = Class32.Method261(string, string2);
        Field8013.set(string3);
        Class542.Field10314.debug("Schematic path: {}", (Object)string);
        Class542.Field10314.debug("Data path: {}", (Object)string2);
        Class542.Field10314.debug("New schematic path: {}", (Object)string3);
    }

    private static String Method261(String string, String string2) {
        String string3;
        if (string.startsWith(string2)) {
            string3 = "." + string.substring(string2.length());
            return string3.replace("\\", "/");
        }
        string3 = string;
        return string3.replace("\\", "/");
    }

    private static void Method262() {
        Field8020.clear();
        String[] stringArray = Field7991;
        int n = stringArray.length;
        int n2 = 0;
        while (n2 < n) {
            String string = stringArray[n2];
            Block block = (Block)Block.REGISTRY.getObject((Object)new ResourceLocation(string));
            if (block != Blocks.AIR) {
                Field8020.add(block);
            }
            ++n2;
        }
    }

    private static void Method263() {
        Field8016 = Field7948.get("server", "printerEnabled", true, "Allow players to use the printer.");
        Field8016.setLanguageKey("schematica.config.printerEnabled");
        Field7993 = Field8016.getBoolean(true);
        Field8017 = Field7948.get("server", "saveEnabled", true, "Allow players to save schematics.");
        Field8017.setLanguageKey("schematica.config.saveEnabled");
        Field7994 = Field8017.getBoolean(true);
        Field8018 = Field7948.get("server", "loadEnabled", true, "Allow players to load schematics.");
        Field8018.setLanguageKey("schematica.config.loadEnabled");
        Field7995 = Field8018.getBoolean(true);
        Field8019 = Field7948.get("server", "playerQuotaKilobytes", 8192, "Amount of storage provided per-player for schematics on the server.");
        Field8019.setLanguageKey("schematica.config.playerQuotaKilobytes");
        Field7996 = Field8019.getInt(8192);
    }

    private Class32() {
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method264(ConfigChangedEvent.OnConfigChangedEvent onConfigChangedEvent) {
        if (!onConfigChangedEvent.getModID().equalsIgnoreCase("schematica")) return;
        Class32.Method253();
    }

    public static boolean Method265(Block block) {
        return Field8020.contains(block);
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
        Field7964 = new boolean[]{false, false, false, false, false, true, true, true, true};
        Field7966 = new File(Class2101.Field17565.Method411(), "./schematics");
        Field7967 = new String[0];
        Field7973 = false;
        Field7974 = true;
        Field7975 = false;
        Field7976 = 1.0f;
        Field7977 = true;
        Field7978 = true;
        Field7979 = Double.longBitsToDouble((long)2050763145 ^ 0x3F747AE13D923DF2L);
        Field7980 = 8;
        Field7981 = 1;
        Field7982 = 10;
        Field7983 = 5;
        Field7984 = false;
        Field7985 = false;
        Field7986 = false;
        Field7987 = true;
        Field7988 = Arrays.copyOf(Field7964, Field7964.length);
        Field7989 = new ArrayDeque();
        Field7990 = Field7966;
        Field7991 = Arrays.copyOf(Field7967, Field7967.length);
        Field7992 = "";
        Field7993 = true;
        Field7994 = true;
        Field7995 = true;
        Field7996 = 8192;
        Field7997 = null;
        Field7998 = null;
        Field7999 = null;
        Field8000 = null;
        Field8001 = null;
        Field8002 = null;
        Field8003 = null;
        Field8004 = null;
        Field8005 = null;
        Field8006 = null;
        Field8007 = null;
        Field8008 = null;
        Field8009 = null;
        Field8010 = null;
        Field8011 = null;
        Field8012 = new Property[Field7964.length];
        Field8013 = null;
        Field8014 = null;
        Field8015 = null;
        Field8016 = null;
        Field8017 = null;
        Field8018 = null;
        Field8019 = null;
        Field8020 = new HashSet();
    }

    private static String Method266(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 98;
            cArray2[n] = (char)(cArray[n] ^ (0x2CA8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

