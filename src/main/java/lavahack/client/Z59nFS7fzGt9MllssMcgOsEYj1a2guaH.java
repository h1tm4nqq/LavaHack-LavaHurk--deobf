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
import lavahack.client.Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo;
import lavahack.client.pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Z59nFS7fzGt9MllssMcgOsEYj1a2guaH {
    public static final Z59nFS7fzGt9MllssMcgOsEYj1a2guaH Field7946;
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
        Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Method253();
    }

    public static void Method253() {
        Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Method254();
        Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Method255();
        Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Method256();
        Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Method257();
        Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Method258();
        Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Method263();
        Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo.Field17565.Method410();
        if (!Field7948.hasChanged()) return;
        Field7948.save();
    }

    private static void Method254() {
        Field7997 = Field7948.get("debug", "dumpBlockList", (boolean)((long)1081957762 ^ (long)1081957762), "Dump all block states on startup.");
        Field7997.setLanguageKey("schematica.config.dumpBlockList");
        Field7997.requiresMcRestart();
        Field7973 = Field7997.getBoolean((boolean)((long)-1375759664 ^ (long)-1375759664));
        Field7998 = Field7948.get("debug", "showDebugInfo", ((int)371251906L ^ 0x1620DAC3) != 0, "Display extra information on the debug screen (F3).");
        Field7998.setLanguageKey("schematica.config.showDebugInfo");
        Field7974 = Field7998.getBoolean((boolean)((long)1195217944 ^ (long)1195217945));
    }

    private static void Method255() {
        Field7999 = Field7948.get("render", "alphaEnabled", ((int)1428905198L ^ 0x552B5CEE) != 0, "Enable transparent textures.");
        Field7999.setLanguageKey("schematica.config.alphaEnabled");
        Field7975 = Field7999.getBoolean(((int)-1776123148L ^ 0x962282F4) != 0);
        Field8000 = Field7948.get("render", "alpha", 1.0, "Alpha value used when rendering the schematic (1.0 = opaque, 0.5 = half transparent, 0.0 = transparent).", 0.0, 1.0);
        Field8000.setLanguageKey("schematica.config.alpha");
        Field7976 = (float)Field8000.getDouble(1.0);
        Field8001 = Field7948.get("render", "highlight", (boolean)((long)1830649383 ^ (long)1830649382), "Highlight invalid placed blocks and to be placed blocks.");
        Field8001.setLanguageKey("schematica.config.highlight");
        Field7977 = Field8001.getBoolean(((int)-1351970057L ^ 0xAF6A92F6) != 0);
        Field8002 = Field7948.get("render", "highlightAir", ((int)422130972L ^ 0x1929351D) != 0, "Highlight blocks that should be air.");
        Field8002.setLanguageKey("schematica.config.highlightAir");
        Field7978 = Field8002.getBoolean(((int)-122869751L ^ 0xF8AD2808) != 0);
        Field8003 = Field7948.get("render", "blockDelta", Double.longBitsToDouble((long)2029726179 ^ 0x3F747AE13F553D98L), "Delta value used for highlighting (if you experience z-fighting increase this).", 0.0, Double.longBitsToDouble(0x607300FB710D0096L ^ 0x5FBA9962E894990CL));
        Field8003.setLanguageKey("schematica.config.blockDelta");
        Field7979 = Field8003.getDouble(Double.longBitsToDouble((long)1233755468 ^ 0x3F747AE10E278937L));
        Field8004 = Field7948.get("render", "renderDistance", ((int)-665709848L ^ 0xD85212E9) << 3, "Schematic render distance.", ((int)-428803763L ^ 0xE670F94C) << 1, (int)((long)754774471 ^ (long)754774470) << 4);
        Field8004.setLanguageKey("schematica.config.renderDistance");
        Field7980 = Field8004.getInt(((int)1604362585L ^ 0x5FA0A158) << 3);
    }

    private static void Method256() {
        Field8005 = Field7948.get("printer", "placeDelay", (int)((long)269190598 ^ (long)269190599), "Delay between placement attempts (in ticks).", (int)-1724074675L ^ 0x993CB54D, (int)((long)-907380870 ^ (long)-907380865) << 2);
        Field8005.setLanguageKey("schematica.config.placeDelay");
        Field7981 = Field8005.getInt((int)-12337446L ^ 0xFF43BEDB);
        Field8006 = Field7948.get("printer", "timeout", ((int)-916131749L ^ 0xC964F05E) << 1, "Timeout before re-trying failed blocks.", (int)((long)669030671 ^ (long)669030671), (int)((long)1011161046 ^ (long)1011161039) << 2);
        Field8006.setLanguageKey("schematica.config.timeout");
        Field7982 = Field8006.getInt(((int)-1394406643L ^ 0xACE30B08) << 1);
        Field8007 = Field7948.get("printer", "placeDistance", (int)-183639919L ^ 0xF50DE094, "Maximum placement distance.", (int)-912702371L ^ 0xC999445C, (int)-1329319845L ^ 0xB0C4305E);
        Field8007.setLanguageKey("schematica.config.placeDistance");
        Field7983 = Field8007.getInt((int)-71098728L ^ 0xFBC31E9D);
        Field8008 = Field7948.get("printer", "placeInstantly", ((int)-752491630L ^ 0xD325E392) != 0, "Place all blocks that can be placed in one tick.");
        Field8008.setLanguageKey("schematica.config.placeInstantly");
        Field7984 = Field8008.getBoolean(((int)-1455263270L ^ 0xA94271DA) != 0);
        Field8009 = Field7948.get("printer", "destroyBlocks", (boolean)((long)735988522 ^ (long)735988522), "The printer will destroy blocks (creative mode only).");
        Field8009.setLanguageKey("schematica.config.destroyBlocks");
        Field7985 = Field8009.getBoolean((boolean)((long)2084339541 ^ (long)2084339541));
        Field8010 = Field7948.get("printer", "destroyInstantly", (boolean)((long)1406880029 ^ (long)1406880029), "Destroy all blocks that can be destroyed in one tick.");
        Field8010.setLanguageKey("schematica.config.destroyInstantly");
        Field7986 = Field8010.getBoolean(((int)1945167914L ^ 0x73F0E82A) != 0);
        Field8011 = Field7948.get("printer", "placeAdjacent", ((int)1373684615L ^ 0x51E0C386) != 0, "Place blocks only if there is an adjacent block next to them.");
        Field8011.setLanguageKey("schematica.config.placeAdjacent");
        Field7987 = Field8011.getBoolean((boolean)((long)1297507651 ^ (long)1297507650));
    }

    private static void Method257() {
        Field7989.clear();
        int n = (int)((long)-1218660344 ^ (long)-1218660344);
        while (n < Field7964.length) {
            Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field8012[n] = Field7948.get("printer.swapslots", "swapSlot" + n, Field7964[n], "Allow the printer to use this hotbar slot.");
            Field8012[n].setLanguageKey("schematica.config.swapSlot" + n);
            Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7988[n] = Field8012[n].getBoolean(Field7964[n]);
            if (Field7988[n]) {
                Field7989.offer(n);
            }
            ++n;
        }
    }

    private static void Method258() {
        Field8013 = Field7948.get("general", "schematicDirectory", "./schematics", "Schematic directory.");
        Field8013.setLanguageKey("schematica.config.schematicDirectory");
        Field7990 = Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Method259(Field8013.getString());
        Field8014 = Field7948.get("general", "extraAirBlocks", Field7967, "Extra blocks to consider as air for the schematic renderer.");
        Field8014.setLanguageKey("schematica.config.extraAirBlocks");
        Field7991 = Field8014.getStringList();
        Field8015 = Field7948.get("general", "sortType", "", "Default sort type for the material list.");
        Field8015.setShowInGui((boolean)((long)2145634778 ^ (long)2145634778));
        Field7992 = Field8015.getString();
        Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Method260();
        Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Method262();
    }

    private static File Method259(String string) {
        if (!string.startsWith(".")) return new File(string);
        return Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo.Field17565.Method412(string);
    }

    private static void Method260() {
        Field7990 = Field7990.getCanonicalFile();
        String string = Field7990.getAbsolutePath();
        String string2 = Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo.Field17565.Method411().getAbsolutePath();
        String string3 = Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Method261(string, string2);
        Field8013.set(string3);
        pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.debug("Schematic path: {}", (Object)string);
        pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.debug("Data path: {}", (Object)string2);
        pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.debug("New schematic path: {}", (Object)string3);
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
        int n2 = (int)-1794563964L ^ 0x95092084;
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
        Field8016 = Field7948.get("server", "printerEnabled", (boolean)((long)-1198079691 ^ (long)-1198079692), "Allow players to use the printer.");
        Field8016.setLanguageKey("schematica.config.printerEnabled");
        Field7993 = Field8016.getBoolean((boolean)((long)-1162371638 ^ (long)-1162371637));
        Field8017 = Field7948.get("server", "saveEnabled", (boolean)((long)1199130940 ^ (long)1199130941), "Allow players to save schematics.");
        Field8017.setLanguageKey("schematica.config.saveEnabled");
        Field7994 = Field8017.getBoolean(((int)2088711017L ^ 0x7C7F3368) != 0);
        Field8018 = Field7948.get("server", "loadEnabled", ((int)-1943175022L ^ 0x8C2D8093) != 0, "Allow players to load schematics.");
        Field8018.setLanguageKey("schematica.config.loadEnabled");
        Field7995 = Field8018.getBoolean(((int)-1518859982L ^ 0xA5780933) != 0);
        Field8019 = Field7948.get("server", "playerQuotaKilobytes", (int)((long)-1212767779 ^ (long)-1212767780) << 13, "Amount of storage provided per-player for schematics on the server.");
        Field8019.setLanguageKey("schematica.config.playerQuotaKilobytes");
        Field7996 = Field8019.getInt((int)((long)-432384132 ^ (long)-432384131) << 13);
    }

    private Z59nFS7fzGt9MllssMcgOsEYj1a2guaH() {
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method264(ConfigChangedEvent.OnConfigChangedEvent onConfigChangedEvent) {
        if (!onConfigChangedEvent.getModID().equalsIgnoreCase("schematica")) return;
        Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Method253();
    }

    public static boolean Method265(Block block) {
        return Field8020.contains(block);
    }

    static {
        Field7972 = ((int)741277446L ^ 0x2C2EFF07) << 13;
        Field7971 = (int)((long)548509576 ^ (long)548509577);
        Field7970 = (int)-704465605L ^ 0xD602B53A;
        Field7969 = (int)-1576149336L ^ 0xA20DDEA9;
        Field7968 = "";
        Field7965 = "./schematics";
        Field7963 = (int)1072647658L ^ 0x3FEF4DEB;
        Field7962 = (int)((long)-1226406444 ^ (long)-1226406444);
        Field7961 = (int)-2097348315L ^ 0x82FD0125;
        Field7960 = (int)((long)1855508791 ^ (long)1855508791);
        Field7959 = (int)((long)547630774 ^ (long)547630771);
        Field7958 = ((int)80479214L ^ 0x4CC03EB) << 1;
        Field7957 = (int)1032352630L ^ 0x3D887377;
        Field7956 = ((int)-902290661L ^ 0xCA38231A) << 3;
        Field7955 = 0.0;
        Field7954 = (int)-823935885L ^ 0xCEE3BC72;
        Field7953 = (int)((long)-1492210874 ^ (long)-1492210873);
        Field7952 = 1.0;
        Field7951 = (int)((long)1161796972 ^ (long)1161796972);
        Field7950 = (int)((long)-91880039 ^ (long)-91880040);
        Field7949 = (int)((long)58629449 ^ (long)58629449);
        Field7947 = "1";
        Field7946 = new Z59nFS7fzGt9MllssMcgOsEYj1a2guaH();
        boolean[] blArray = new boolean[(int)((long)2029705489 ^ (long)2029705496)];
        blArray[(int)((long)1592341611 ^ (long)1592341611)] = (int)((long)1168631262 ^ (long)1168631262);
        blArray[(int)-673085924L ^ 0xD7E1861D] = (int)((long)-947259222 ^ (long)-947259222);
        blArray[((int)-1622158494L ^ 0x9F4FD363) << 1] = (int)((long)1458217359 ^ (long)1458217359);
        blArray[(int)292757719L ^ 0x117320D4] = (int)1582731297L ^ 0x5E569021;
        blArray[(int)((long)-949575940 ^ (long)-949575939) << 2] = (int)((long)417240847 ^ (long)417240847);
        blArray[(int)((long)1460366053 ^ (long)1460366048)] = (int)((long)-601318861 ^ (long)-601318862);
        blArray[((int)1498582106L ^ 0x59528C59) << 1] = (int)1046204294L ^ 0x3E5BCF87;
        blArray[(int)757015463L ^ 0x2D1F23A0] = (int)((long)-1641358019 ^ (long)-1641358020);
        blArray[(int)((long)-1008815770 ^ (long)-1008815769) << 3] = (int)-960600332L ^ 0xC6BE66F5;
        Field7964 = blArray;
        Field7966 = new File(Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo.Field17565.Method411(), "./schematics");
        Field7967 = new String[(int)((long)-1244205724 ^ (long)-1244205724)];
        Field7973 = (int)-1457353634L ^ 0xA9228C5E;
        Field7974 = (int)-993434960L ^ 0xC4C962B1;
        Field7975 = (int)1361317701L ^ 0x51240F45;
        Field7976 = 1.0f;
        Field7977 = (int)257628679L ^ 0xF5B1A06;
        Field7978 = (int)574507925L ^ 0x223E4B94;
        Field7979 = Double.longBitsToDouble((long)2050763145 ^ 0x3F747AE13D923DF2L);
        Field7980 = (int)((long)-2128433630 ^ (long)-2128433629) << 3;
        Field7981 = (int)1990366599L ^ 0x76A29586;
        Field7982 = ((int)975726106L ^ 0x3A28661F) << 1;
        Field7983 = (int)((long)-1595674883 ^ (long)-1595674888);
        Field7984 = (int)2022392818L ^ 0x788B43F2;
        Field7985 = (int)((long)960450749 ^ (long)960450749);
        Field7986 = (int)((long)-342237250 ^ (long)-342237250);
        Field7987 = (int)((long)-17122506 ^ (long)-17122505);
        Field7988 = Arrays.copyOf(Field7964, Field7964.length);
        Field7989 = new ArrayDeque();
        Field7990 = Field7966;
        Field7991 = Arrays.copyOf(Field7967, Field7967.length);
        Field7992 = "";
        Field7993 = (int)-1924305776L ^ 0x8D4D6C91;
        Field7994 = (int)((long)-1870409749 ^ (long)-1870409750);
        Field7995 = (int)1610046516L ^ 0x5FF75C35;
        Field7996 = ((int)1826317081L ^ 0x6CDB6318) << 13;
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
        int n = (int)((long)-1785565260 ^ (long)-1785565260);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1012865656L ^ 0x3C5F1A87);
            int n2 = (int)((long)-1461431915 ^ (long)-1461431900) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-919738181L ^ 0xC92DED2E) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

