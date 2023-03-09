//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.InputEvent
 *  net.minecraftforge.fml.common.gameevent.InputEvent$KeyInputEvent
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.Display
 */
package lavahack.client;

import com.kisman.cc.event.Class1561;
import com.kisman.cc.event.Class1817;
import com.kisman.cc.loader.LavaHackInterface;
import java.awt.Desktop;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.HashMap;
import java.util.Iterator;
import lavahack.client.Class1000;
import lavahack.client.Class1013;
import lavahack.client.Class115;
import lavahack.client.Class12;
import lavahack.client.Class1233;
import lavahack.client.Class1239;
import lavahack.client.Class1249;
import lavahack.client.Class1279;
import lavahack.client.Class1338;
import lavahack.client.Class1346;
import lavahack.client.Class1362;
import lavahack.client.Class1393;
import lavahack.client.Class1419;
import lavahack.client.Class1491;
import lavahack.client.Class1604;
import lavahack.client.Class1705;
import lavahack.client.Class1748;
import lavahack.client.Class192;
import lavahack.client.Class1929;
import lavahack.client.Class194;
import lavahack.client.Class1979;
import lavahack.client.Class1993;
import lavahack.client.Class2004;
import lavahack.client.Class2045;
import lavahack.client.Class2047;
import lavahack.client.Class206;
import lavahack.client.Class2060;
import lavahack.client.Class2101;
import lavahack.client.Class2159;
import lavahack.client.Class264;
import lavahack.client.Class273;
import lavahack.client.Class274;
import lavahack.client.Class288;
import lavahack.client.Class354;
import lavahack.client.Class379;
import lavahack.client.Class399;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class49;
import lavahack.client.Class695;
import lavahack.client.Class703;
import lavahack.client.Class726;
import lavahack.client.Class80;
import lavahack.client.Class876;
import lavahack.client.Class884;
import lavahack.client.Class92;
import lavahack.client.Class955;
import lavahack.client.Class985;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import sun.misc.Unsafe;

public class Class1796 {
    public static final String Field16231;
    public static final String Field16232;
    public static final String Field16233;
    public static final String Field16234;
    public static final String Field16235;
    public static final String Field16236;
    public static final String Field16237;
    public static final String Field16238;
    public static final String Field16239;
    public static final boolean Field16240;
    public static final Class1796 Field16241;
    public static final Class80 Field16242;
    public static final Logger Field16243;
    public static final HashMap Field16244;
    public static EntityPlayer Field16245;
    public static final boolean Field16246;
    public static boolean Field16247;
    public static boolean Field16248;
    public static boolean Field16249;
    public static String Field16250;
    public boolean Field16251 = false;
    private static Minecraft Field16252;
    public Class192 Field16253;
    public Class194 Field16254;
    public Class1013 Field16255;
    public Class726 Field16256;
    public Class288 Field16257;
    public Class2047 Field16258;
    public Class274 Field16259;
    public Class2004 Field16260;
    public Class264 Field16261;
    public Class1419 Field16262;
    public Class1748 Field16263;
    public Class1239 Field16264;
    public Class2060 Field16265;
    public Class206 Field16266;
    public Class399 Field16267;
    public Class1279 Field16268;
    public Class1000 Field16269;
    public Class12 Field16270;
    public Class49 Field16271;
    public Class2045 Field16272;
    public Class1491 Field16273;
    public Class1817 Field16274;
    public Class1993 Field16275;
    public Class115 Field16276;
    public Class379 Field16277;
    public Class876 Field16278;
    public Class2159 Field16279;
    public Class703 Field16280;
    public Class1362 Field16281;
    public Class1346 Field16282;
    public Class1705 Field16283;
    public Class985 Field16284;
    public final Class1604 Field16285 = new Class1604();
    public Class884 Field16286;
    public boolean Field16287 = false;
    private String Field16288 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Class1796() {
    }

    public void Method6778() {
        this.Field16285.Method6264();
    }

    public void Method6779() throws IOException, NoSuchFieldException, IllegalAccessException {
        if (this.Field16251) {
            return;
        }
        Field16243.info("Initializing LavaHack b0.1.6.5-9");
        long l = System.currentTimeMillis();
        this.Field16287 = LavaHackInterface.Field17583.Method7644();
        Field16243.info("We " + (this.Field16287 ? "" : "do not ") + "have loader!");
        Class1796.Method6793();
        Class1796.Method6794();
        Class273.Method1451();
        this.Field16286 = new Class884("LavaHack");
        this.Field16279 = new Class2159();
        this.Field16274 = new Class1817();
        this.Field16276 = new Class115();
        this.Field16276.Method835();
        this.Field16256 = new Class726();
        this.Field16258 = new Class2047();
        this.Field16254 = new Class194();
        this.Field16259 = new Class274();
        Class1338.Field14116.Method5390();
        this.Field16257 = new Class288();
        this.Field16286.Method3685();
        this.Field16279.Method7782();
        this.Field16274.Method6842();
        this.Field16254.Method1160();
        this.Field16257.Method1522();
        this.Field16286.Method3686();
        Display.setTitle((String)"LavaHack | b0.1.6.5-9");
        MinecraftForge.EVENT_BUS.register((Object)this);
        Field16252 = Minecraft.getMinecraft();
        this.Field16253 = new Class192();
        this.Field16277 = new Class379();
        this.Field16260 = new Class2004();
        this.Field16261 = new Class264();
        this.Field16272 = new Class2045();
        this.Field16273 = new Class1491();
        this.Field16275 = new Class1993();
        this.Field16285.Method6265();
        Class92.Method782();
        this.Field16280 = new Class703();
        this.Field16280.Method2927();
        this.Field16282 = new Class1346();
        this.Field16283 = new Class1705();
        this.Field16260 = new Class2004();
        this.Field16262 = new Class1419();
        this.Field16263 = new Class1748();
        this.Field16264 = new Class1239();
        this.Field16266 = new Class206();
        this.Field16271 = new Class49();
        this.Field16271.Method432();
        this.Field16267 = new Class399(Class1233.Field13591);
        this.Field16268 = new Class1279();
        this.Field16262.Method1219();
        this.Field16269 = new Class1000(new Class44("Test"), null);
        this.Field16270 = new Class12();
        this.Field16284 = new Class985("config");
        this.Field16284.Method3998().Method1420();
        this.Field16278 = new Class876();
        this.Field16278.Method3670();
        Class1979.Method7320().Method7321();
        Class2101.Field17564.Method7636();
        Field16243.info("Initialized LavaHack b0.1.6.5-9! It took " + (System.currentTimeMillis() - l) + " ms!");
        this.Field16251 = true;
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6780(InputEvent.KeyInputEvent keyInputEvent) {
        if (Class1796.Field16252.world == null) return;
        if (Class1796.Field16252.player == null) {
            return;
        }
        if (!Keyboard.isCreated()) return;
        if (!Keyboard.getEventKeyState()) {
            if (Keyboard.getEventKey() <= 1) return;
            this.Method6782(Keyboard.getEventKey(), false);
            return;
        }
        int n = Keyboard.getEventKey();
        if (n <= 1) {
            return;
        }
        for (Class695 class695 : this.Field16254.Field8854) {
            if (((Class42)class695).Method8() != n || ((Class42)class695).Field8059 != Class955.Field12068) continue;
            ((Class42)class695).Method22();
        }
        for (Class695 class695 : this.Field16257.Field9235) {
            if (((Class42)class695).Method8() != n || ((Class1249)class695).x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk != Class955.Field12068) continue;
            ((Class42)class695).Method22();
        }
        Iterator iterator = this.Field16258.Method7570().iterator();
        block2: while (iterator.hasNext()) {
            Class695 class695;
            class695 = (Class44)iterator.next();
            if (((Class44)class695).Method385()) {
                Iterator iterator2 = ((Class44)class695).Field8115.keySet().iterator();
                while (true) {
                    if (!iterator2.hasNext()) continue block2;
                    String string = (String)iterator2.next();
                    Class1929 class1929 = (Class1929)((Class44)class695).Field8115.get(string);
                    if (class1929.Method8() != n || class1929.Method12() != Class955.Field12068) continue;
                    ((Class44)class695).Method360(string);
                    if (!this.Field16251 || !null.Field11785.Method365()) continue;
                    Class1393.Method5506().Method1882(TextFormatting.GRAY + "Setting " + ((Class44)class695).Method399() + " has been changed to " + string + "!");
                }
            }
            if (((Class44)class695).Method8() != n || ((Class44)class695).Field8082 != Class955.Field12068 || !((Class44)class695).Method386()) continue;
            ((Class44)class695).Method366(!((Class44)class695).Method365());
            if (!this.Field16251 || !null.Field11785.Method365()) continue;
            Class1393.Method5506().Method1882(TextFormatting.GRAY + "Setting " + (((Class44)class695).Method365() ? TextFormatting.GREEN : TextFormatting.RED) + ((Class44)class695).Method399() + TextFormatting.GRAY + " has been " + (((Class44)class695).Method365() ? "enabled" : "disabled") + "!");
        }
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6781(InputEvent inputEvent) {
        if (Class1796.Field16252.world == null) return;
        if (Class1796.Field16252.player == null) {
            return;
        }
        if (!Mouse.isCreated()) return;
        if (!Mouse.getEventButtonState()) {
            if (Mouse.getEventButton() <= 1) return;
            this.Method6782(Mouse.getEventButton(), true);
            return;
        }
        int n = Mouse.getEventButton();
        if (n <= 1) {
            return;
        }
        for (Class695 class695 : this.Field16254.Field8854) {
            if (Class695.Field10935.Method7139(class695) != n || ((Class42)class695).Method12() != Class955.Field12069) continue;
            ((Class42)class695).Method22();
        }
        for (Class695 class695 : this.Field16257.Field9235) {
            if (Class695.Field10935.Method7139(class695) != n || ((Class42)class695).Method12() != Class955.Field12069) continue;
            ((Class42)class695).Method22();
        }
        Iterator iterator = this.Field16258.Method7570().iterator();
        block2: while (iterator.hasNext()) {
            Class695 class695;
            class695 = (Class44)iterator.next();
            if (((Class44)class695).Method385()) {
                Iterator iterator2 = ((Class44)class695).Field8115.keySet().iterator();
                while (true) {
                    if (!iterator2.hasNext()) continue block2;
                    String string = (String)iterator2.next();
                    Class1929 class1929 = (Class1929)((Class44)class695).Field8115.get(string);
                    if (Class695.Field10935.Method7139(class695) != n || class1929.Method12() != Class955.Field12069) continue;
                    ((Class44)class695).Method360(string);
                    if (!this.Field16251 || !null.Field11785.Method365()) continue;
                    Class1393.Method5506().Method1882(TextFormatting.GRAY + "Setting " + ((Class44)class695).Method399() + " has been changed to " + string + "!");
                }
            }
            if (Class695.Field10935.Method7139(class695) != n || ((Class44)class695).Method12() != Class955.Field12069 || !((Class44)class695).Method386()) continue;
            ((Class44)class695).Method366(!((Class44)class695).Method365());
            if (!this.Field16251 || !null.Field11785.Method365()) continue;
            Class1393.Method5506().Method1882(TextFormatting.GRAY + "Setting " + (((Class44)class695).Method365() ? TextFormatting.GREEN : TextFormatting.RED) + ((Class44)class695).Method358().Method40() + "->" + ((Class44)class695).Method356() + TextFormatting.GRAY + " has been " + (((Class44)class695).Method365() ? "enabled" : "disabled") + "!");
        }
    }

    private void Method6782(int n, boolean bl) {
        for (Class695 class695 : this.Field16254.Field8854) {
            if (Class695.Field10935.Method7139(class695) != n || bl && ((Class42)class695).Method12() != Class955.Field12069 || !((Class42)class695).Field8065) continue;
            ((Class42)class695).Method22();
        }
        for (Class695 class695 : this.Field16257.Field9235) {
            if (Class695.Field10935.Method7139(class695) != n || bl && ((Class42)class695).Method12() != Class955.Field12069 || !((Class1249)class695).IBONRcQCNUBg2NBpVpVQf61ykmVfU03E) continue;
            ((Class42)class695).Method22();
        }
        Iterator iterator = this.Field16258.Method7570().iterator();
        while (iterator.hasNext()) {
            Class695 class695;
            class695 = (Class44)iterator.next();
            if (Class695.Field10935.Method7139(class695) != n || ((Class44)class695).Method12() != Class955.Field12069 || !((Class44)class695).Method386()) continue;
            ((Class44)class695).Method366(!((Class44)class695).Method365());
            if (!this.Field16251 || !null.Field11785.Method365()) continue;
            Class1393.Method5506().Method1882(TextFormatting.GRAY + "Setting " + (((Class44)class695).Method365() ? TextFormatting.GREEN : TextFormatting.RED) + ((Class44)class695).Method358().Method40() + "->" + ((Class44)class695).Method356() + TextFormatting.GRAY + " has been " + (((Class44)class695).Method365() ? "enabled" : "disabled") + "!");
        }
    }

    public static String Method6783() {
        return Field16241.Method6784();
    }

    public String Method6784() {
        if (!this.Field16251) return "LavaHack";
        String string = null.Field11780.Method359();
        int n = -1;
        switch (string.hashCode()) {
            case -403234427: {
                if (!string.equals("kismancc")) return "LavaHack";
                return "LavaHack";
            }
            case -1326794175: {
                if (!string.equals("LavaHack")) return "LavaHack";
                return "LavaHack";
            }
            case -1731059230: {
                if (!string.equals("TheKisDevs")) return "LavaHack";
                return "LavaHack";
            }
            case -1131591468: {
                if (!string.equals("kidman")) return "LavaHack";
                return "LavaHack";
            }
            case 826009468: {
                if (!string.equals("TheClient")) return "LavaHack";
                return "LavaHack";
            }
            case -1073073408: {
                if (!string.equals("BloomWare")) return "LavaHack";
                return "LavaHack";
            }
            case -1131591478: {
                if (!string.equals("kidmad")) return "LavaHack";
                return "LavaHack";
            }
            case 85459: {
                if (!string.equals("UwU")) return "LavaHack";
                return "LavaHack";
            }
            case -1390922133: {
                if (!string.equals("EarthHack")) return "LavaHack";
                return "LavaHack";
            }
            case -1349088399: {
                if (!string.equals("custom")) return "LavaHack";
                return "LavaHack";
            }
            case -1199251178: {
                if (!string.equals("ClientName")) return "LavaHack";
                return "LavaHack";
            }
        }
        return "LavaHack";
    }

    public static String Method6785() {
        if (!Class1796.Field16241.Field16251) return "b0.1.6.5-9";
        String string = null.Field11780.Method359();
        int n = -1;
        switch (string.hashCode()) {
            case -1073073408: {
                if (!string.equals("BloomWare")) return "b0.1.6.5-9";
                return "b0.1.6.5-9";
            }
            case -1390922133: {
                if (!string.equals("EarthHack")) return "b0.1.6.5-9";
                return "b0.1.6.5-9";
            }
            case -1199251178: {
                if (!string.equals("ClientName")) return "b0.1.6.5-9";
                return "b0.1.6.5-9";
            }
        }
        return "b0.1.6.5-9";
    }

    public static void Method6786() throws IOException {
        if (!Files.exists(Paths.get("kisman.cc/", new String[0]), new LinkOption[0])) {
            Files.createDirectories(Paths.get("kisman.cc/", new String[0]), new FileAttribute[0]);
            Field16243.info("Root dir created");
        }
        if (!Files.exists(Paths.get("kisman.cc/Images/", new String[0]), new LinkOption[0])) {
            Files.createDirectories(Paths.get("kisman.cc/Images/", new String[0]), new FileAttribute[0]);
            Field16243.info("Images dir created");
        }
        if (!Files.exists(Paths.get("kisman.cc/Lua/", new String[0]), new LinkOption[0])) {
            Files.createDirectories(Paths.get("kisman.cc/Lua/", new String[0]), new FileAttribute[0]);
            Field16243.info("Lua dir created");
        }
        if (!Files.exists(Paths.get("kisman.cc/Mapping/", new String[0]), new LinkOption[0])) {
            Files.createDirectories(Paths.get("kisman.cc/Mapping/", new String[0]), new FileAttribute[0]);
            Field16243.info("Mapping dir created");
        }
        if (Files.exists(Paths.get("kisman.cc/Plugins/", new String[0]), new LinkOption[0])) return;
        Files.createDirectories(Paths.get("kisman.cc/Plugins/", new String[0]), new FileAttribute[0]);
        Field16243.info("Plugins dir created");
    }

    public static void Method6787(String string) {
        Desktop desktop = Desktop.getDesktop();
        if (desktop == null) return;
        if (!desktop.isSupported(Desktop.Action.BROWSE)) return;
        desktop.browse(new URI(string));
    }

    public static void Method6788() {
        if (Class1796.Field16241.Field16262 == null) {
            return;
        }
        boolean bl = false;
        if (Class1796.Field16252.currentScreen instanceof Class1419) {
            Field16252.displayGuiScreen(null);
            bl = true;
        }
        Class1796.Field16241.Field16262.Field14607.forEach(Class354::Method66);
    }

    public static boolean Method6789() {
        return System.getProperty("java.class.path").contains("idea_rt.jar");
    }

    public static boolean Method6790() {
        Minecraft.class.getDeclaredField("world");
        return false;
    }

    public static void Method6791() {
        Unsafe unsafe = null;
        Field field = Unsafe.class.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        unsafe = (Unsafe)field.get(null);
        unsafe.putAddress(0L, 0L);
        unsafe.freeMemory(0L);
    }

    private static void Method6792() {
        Class.forName("ghost.classes.DevelopmentEnvironment");
    }

    public static void Method6793() {
        Class.forName("ghost.classes.DevelopmentEnvironment");
    }

    public static void Method6794() {
        Class.forName("ghost.classes.DevelopmentEnvironment");
    }

    static {
        Field16246 = false;
        Field16240 = false;
        Field16239 = "Plugins/";
        Field16238 = "Images/";
        Field16237 = "Mapping/";
        Field16236 = "Lua/";
        Field16235 = "kisman.cc/";
        Field16234 = "b0.1.6.5-9";
        Field16233 = "kisman";
        Field16232 = "LavaHack";
        Field16231 = RandomStringUtils.random(10, true, true);
        Field16241 = new Class1796();
        Field16242 = new Class1561();
        Field16243 = LogManager.getLogger((String)"LavaHack");
        Field16244 = new HashMap();
        Field16245 = null;
        Field16247 = !Class1796.Method6789() || Class1796.Method6790();
        Field16248 = false;
        Field16249 = false;
        Field16250 = null;
    }

    private static String Method6795(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 208;
            cArray2[n] = (char)(cArray[n] ^ (0xBE8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

