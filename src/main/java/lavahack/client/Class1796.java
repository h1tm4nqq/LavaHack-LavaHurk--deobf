//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.player.*;
import net.minecraft.client.*;
import com.kisman.cc.loader.*;
import org.lwjgl.opengl.*;
import net.minecraftforge.common.*;
import net.minecraft.client.gui.*;
import java.io.*;
import net.minecraft.util.text.*;
import java.util.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.fml.common.gameevent.*;
import org.lwjgl.input.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.awt.*;
import java.net.*;
import java.util.function.*;
import sun.misc.*;
import java.lang.reflect.*;
import org.apache.commons.lang3.*;
import com.kisman.cc.event.*;
import org.apache.logging.log4j.*;

public class Class1796
{
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
    public boolean Field16251;
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
    public final Class1604 Field16285;
    public Class884 Field16286;
    public boolean Field16287;
    private String Field16288 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1796() {
        this.Field16251 = false;
        this.Field16285 = new Class1604();
        this.Field16287 = false;
    }
    
    public void Method6778() {
        this.Field16285.Method6264();
    }
    
    public void Method6779() throws IOException, NoSuchFieldException, IllegalAccessException {
        if (this.Field16251) {
            return;
        }
        Class1796.Field16243.info("Initializing LavaHack b0.1.6.5-9");
        final long currentTimeMillis = System.currentTimeMillis();
        this.Field16287 = LavaHackInterface.Field17583.Method7644();
        Class1796.Field16243.info("We " + (this.Field16287 ? "" : "do not ") + "have loader!");
        Method6793();
        Method6794();
        Class273.Method1451();
        this.Field16286 = new Class884("LavaHack");
        this.Field16279 = new Class2159();
        this.Field16274 = new Class1817();
        (this.Field16276 = new Class115()).Method835();
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
        Display.setTitle("LavaHack | b0.1.6.5-9");
        MinecraftForge.EVENT_BUS.register((Object)this);
        Class1796.Field16252 = Minecraft.getMinecraft();
        this.Field16253 = new Class192();
        this.Field16277 = new Class379();
        this.Field16260 = new Class2004();
        this.Field16261 = new Class264();
        this.Field16272 = new Class2045();
        this.Field16273 = new Class1491();
        this.Field16275 = new Class1993();
        this.Field16285.Method6265();
        Class92.Method782();
        (this.Field16280 = new Class703()).Method2927();
        this.Field16282 = new Class1346();
        this.Field16283 = new Class1705();
        this.Field16260 = new Class2004();
        this.Field16262 = new Class1419();
        this.Field16263 = new Class1748();
        this.Field16264 = new Class1239();
        this.Field16266 = new Class206();
        (this.Field16271 = new Class49()).Method432();
        this.Field16267 = new Class399(Class1233.Field13591);
        this.Field16268 = new Class1279();
        this.Field16262.Method1219();
        this.Field16269 = new Class1000(new Class44("Test"), (GuiScreen)null);
        this.Field16270 = new Class12();
        this.Field16284 = new Class985("config");
        this.Field16284.Method3998().Method1420();
        (this.Field16278 = new Class876()).Method3670();
        Class1979.Method7320().Method7321();
        Class2101.Field17564.Method7636();
        Class1796.Field16243.info("Initialized LavaHack b0.1.6.5-9! It took " + (System.currentTimeMillis() - currentTimeMillis) + " ms!");
        this.Field16251 = true;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method6780(final InputEvent$KeyInputEvent inputEvent$KeyInputEvent) {
        if (Class1796.Field16252.world == null || Class1796.Field16252.player == null) {
            return;
        }
        if (Keyboard.isCreated()) {
            if (Keyboard.getEventKeyState()) {
                final int eventKey = Keyboard.getEventKey();
                if (eventKey <= 1) {
                    return;
                }
                for (final Class42 class42 : this.Field16254.Field8854) {
                    if (class42.Method8() == eventKey && class42.Field8059 == Class955.Field12068) {
                        class42.Method22();
                    }
                }
                for (final Class1249 class43 : this.Field16257.Field9235) {
                    if (class43.Method8() == eventKey && class43.x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk == Class955.Field12068) {
                        class43.Method22();
                    }
                }
                for (final Class44 class44 : this.Field16258.Method7570()) {
                    if (class44.Method385()) {
                        for (final String s : class44.Field8115.keySet()) {
                            final Class1929 class45 = class44.Field8115.get(s);
                            if (class45.Method8() == eventKey && class45.Method12() == Class955.Field12068) {
                                class44.Method360(s);
                                if (!this.Field16251 || !null.Field11785.Method365()) {
                                    continue;
                                }
                                Class1393.Method5506().Method1882(TextFormatting.GRAY + "Setting " + class44.Method399() + " has been changed to " + s + "!");
                            }
                        }
                    }
                    else {
                        if (class44.Method8() != eventKey || class44.Field8082 != Class955.Field12068 || !class44.Method386()) {
                            continue;
                        }
                        class44.Method366(!class44.Method365());
                        if (!this.Field16251 || !null.Field11785.Method365()) {
                            continue;
                        }
                        Class1393.Method5506().Method1882(TextFormatting.GRAY + "Setting " + (class44.Method365() ? TextFormatting.GREEN : TextFormatting.RED) + class44.Method399() + TextFormatting.GRAY + " has been " + (class44.Method365() ? "enabled" : "disabled") + "!");
                    }
                }
            }
            else if (Keyboard.getEventKey() > 1) {
                this.Method6782(Keyboard.getEventKey(), false);
            }
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method6781(final InputEvent inputEvent) {
        if (Class1796.Field16252.world == null || Class1796.Field16252.player == null) {
            return;
        }
        if (Mouse.isCreated()) {
            if (Mouse.getEventButtonState()) {
                final int eventButton = Mouse.getEventButton();
                if (eventButton <= 1) {
                    return;
                }
                for (final Class42 class42 : this.Field16254.Field8854) {
                    if (Class695.Field10935.Method7139(class42) == eventButton && class42.Method12() == Class955.Field12069) {
                        class42.Method22();
                    }
                }
                for (final Class1249 class43 : this.Field16257.Field9235) {
                    if (Class695.Field10935.Method7139((Class695)class43) == eventButton && class43.Method12() == Class955.Field12069) {
                        class43.Method22();
                    }
                }
                for (final Class44 class44 : this.Field16258.Method7570()) {
                    if (class44.Method385()) {
                        for (final String s : class44.Field8115.keySet()) {
                            final Class1929 class45 = class44.Field8115.get(s);
                            if (Class695.Field10935.Method7139(class44) == eventButton && class45.Method12() == Class955.Field12069) {
                                class44.Method360(s);
                                if (!this.Field16251 || !null.Field11785.Method365()) {
                                    continue;
                                }
                                Class1393.Method5506().Method1882(TextFormatting.GRAY + "Setting " + class44.Method399() + " has been changed to " + s + "!");
                            }
                        }
                    }
                    else {
                        if (Class695.Field10935.Method7139(class44) != eventButton || class44.Method12() != Class955.Field12069 || !class44.Method386()) {
                            continue;
                        }
                        class44.Method366(!class44.Method365());
                        if (!this.Field16251 || !null.Field11785.Method365()) {
                            continue;
                        }
                        Class1393.Method5506().Method1882(TextFormatting.GRAY + "Setting " + (class44.Method365() ? TextFormatting.GREEN : TextFormatting.RED) + class44.Method358().Method40() + "->" + class44.Method356() + TextFormatting.GRAY + " has been " + (class44.Method365() ? "enabled" : "disabled") + "!");
                    }
                }
            }
            else if (Mouse.getEventButton() > 1) {
                this.Method6782(Mouse.getEventButton(), true);
            }
        }
    }
    
    private void Method6782(final int n, final boolean b) {
        for (final Class42 class42 : this.Field16254.Field8854) {
            if (Class695.Field10935.Method7139(class42) == n && (!b || class42.Method12() == Class955.Field12069) && class42.Field8065) {
                class42.Method22();
            }
        }
        for (final Class1249 class43 : this.Field16257.Field9235) {
            if (Class695.Field10935.Method7139((Class695)class43) == n && (!b || class43.Method12() == Class955.Field12069) && class43.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E) {
                class43.Method22();
            }
        }
        for (final Class44 class44 : this.Field16258.Method7570()) {
            if (Class695.Field10935.Method7139(class44) == n && class44.Method12() == Class955.Field12069 && class44.Method386()) {
                class44.Method366(!class44.Method365());
                if (!this.Field16251 || !null.Field11785.Method365()) {
                    continue;
                }
                Class1393.Method5506().Method1882(TextFormatting.GRAY + "Setting " + (class44.Method365() ? TextFormatting.GREEN : TextFormatting.RED) + class44.Method358().Method40() + "->" + class44.Method356() + TextFormatting.GRAY + " has been " + (class44.Method365() ? "enabled" : "disabled") + "!");
            }
        }
    }
    
    public static String Method6783() {
        return Class1796.Field16241.Method6784();
    }
    
    public String Method6784() {
        if (this.Field16251) {
            final String method359 = null.Field11780.Method359();
            switch (method359.hashCode()) {
                case -403234427: {
                    if (method359.equals("kismancc")) {
                        break;
                    }
                    break;
                }
                case -1326794175: {
                    if (method359.equals("LavaHack")) {
                        break;
                    }
                    break;
                }
                case -1731059230: {
                    if (method359.equals("TheKisDevs")) {
                        break;
                    }
                    break;
                }
                case -1131591468: {
                    if (method359.equals("kidman")) {
                        break;
                    }
                    break;
                }
                case 826009468: {
                    if (method359.equals("TheClient")) {
                        break;
                    }
                    break;
                }
                case -1073073408: {
                    if (method359.equals("BloomWare")) {
                        break;
                    }
                    break;
                }
                case -1131591478: {
                    if (method359.equals("kidmad")) {
                        break;
                    }
                    break;
                }
                case 85459: {
                    if (method359.equals("UwU")) {
                        break;
                    }
                    break;
                }
                case -1390922133: {
                    if (method359.equals("EarthHack")) {
                        break;
                    }
                    break;
                }
                case -1349088399: {
                    if (method359.equals("custom")) {
                        break;
                    }
                    break;
                }
                case -1199251178: {
                    if (method359.equals("ClientName")) {
                        break;
                    }
                    break;
                }
            }
        }
        return "LavaHack";
    }
    
    public static String Method6785() {
        if (Class1796.Field16241.Field16251) {
            final String method359 = null.Field11780.Method359();
            switch (method359.hashCode()) {
                case -1073073408: {
                    if (method359.equals("BloomWare")) {
                        break;
                    }
                    break;
                }
                case -1390922133: {
                    if (method359.equals("EarthHack")) {
                        break;
                    }
                    break;
                }
                case -1199251178: {
                    if (method359.equals("ClientName")) {
                        break;
                    }
                    break;
                }
            }
            return "b0.1.6.5-9";
        }
        return "b0.1.6.5-9";
    }
    
    public static void Method6786() throws IOException {
        if (!Files.exists(Paths.get("kisman.cc/", new String[0]), new LinkOption[0])) {
            Files.createDirectories(Paths.get("kisman.cc/", new String[0]), (FileAttribute<?>[])new FileAttribute[0]);
            Class1796.Field16243.info("Root dir created");
        }
        if (!Files.exists(Paths.get("kisman.cc/Images/", new String[0]), new LinkOption[0])) {
            Files.createDirectories(Paths.get("kisman.cc/Images/", new String[0]), (FileAttribute<?>[])new FileAttribute[0]);
            Class1796.Field16243.info("Images dir created");
        }
        if (!Files.exists(Paths.get("kisman.cc/Lua/", new String[0]), new LinkOption[0])) {
            Files.createDirectories(Paths.get("kisman.cc/Lua/", new String[0]), (FileAttribute<?>[])new FileAttribute[0]);
            Class1796.Field16243.info("Lua dir created");
        }
        if (!Files.exists(Paths.get("kisman.cc/Mapping/", new String[0]), new LinkOption[0])) {
            Files.createDirectories(Paths.get("kisman.cc/Mapping/", new String[0]), (FileAttribute<?>[])new FileAttribute[0]);
            Class1796.Field16243.info("Mapping dir created");
        }
        if (!Files.exists(Paths.get("kisman.cc/Plugins/", new String[0]), new LinkOption[0])) {
            Files.createDirectories(Paths.get("kisman.cc/Plugins/", new String[0]), (FileAttribute<?>[])new FileAttribute[0]);
            Class1796.Field16243.info("Plugins dir created");
        }
    }
    
    public static void Method6787(final String str) {
        final Desktop desktop = Desktop.getDesktop();
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            desktop.browse(new URI(str));
        }
    }
    
    public static void Method6788() {
        if (Class1796.Field16241.Field16262 == null) {
            return;
        }
        if (Class1796.Field16252.currentScreen instanceof Class1419) {
            Class1796.Field16252.displayGuiScreen((GuiScreen)null);
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
        final Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
        declaredField.setAccessible(true);
        final Unsafe unsafe = (Unsafe)declaredField.get(null);
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
        Field16242 = (Class80)new Class1561();
        Field16243 = LogManager.getLogger("LavaHack");
        Field16244 = new HashMap();
        Class1796.Field16245 = null;
        Class1796.Field16247 = (!Method6789() || Method6790());
        Class1796.Field16248 = false;
        Class1796.Field16249 = false;
        Class1796.Field16250 = null;
    }
    
    private static String Method6795(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xBE8 ^ 0xD0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
