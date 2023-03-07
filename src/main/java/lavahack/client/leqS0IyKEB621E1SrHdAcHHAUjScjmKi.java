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

import com.kisman.cc.event.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
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

public class leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
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
    public static final leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field16241;
    public static final zwWWWaEO7zKr7XG54ZhX4c3PejN1DTzJ Field16242;
    public static final Logger Field16243;
    public static final HashMap Field16244;
    public static EntityPlayer Field16245;
    public static final boolean Field16246;
    public static boolean Field16247;
    public static boolean Field16248;
    public static boolean Field16249;
    public static String Field16250;
    public boolean Field16251 = (int)-206215815L ^ 0xF3B56579;
    private static Minecraft Field16252;
    public ZL1odW2XJDzzCmKJR66p1Ynf5DXx2MCL Field16253;
    public ModuleManager Field16254;
    public NSewz7oiMYR6VaaGbKeUqvXMcw4Xz6sx Field16255;
    public n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI Field16256;
    public T3oF5fVXuSTdCee25m9XwZDUOAAChP2d Field16257;
    public eXIEwpfsveJ6FwbLoefTKstatmuKRSOh Field16258;
    public smV5JOluLiBZH5M4QrQHiUUe9Pp73qYA Field16259;
    public qAMntBvpawO7voz5KoEzPRpFPYIb4WHt Field16260;
    public ABhseIFL1PQVX4WAovmpeO8P6T0dQPpk Field16261;
    public zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4 Field16262;
    public sZ6sbQQyFIfme6FINdJ6W9UgWyr1cDwI Field16263;
    public GtuIb5l0zIz019jVBBS0wnsuMmUh61R5 Field16264;
    public JEzSmb0TapOX6uyDJ6tYIsuTNMVeiHLn Field16265;
    public RIWIbms6n7Y2IsCEMifH6pLMJ1SU3mY3 Field16266;
    public SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6 Field16267;
    public I0R0do5HxnbufehLe8qF1yl2lYfOIhr9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field16268;
    public VQmVPKF3m0DBrMztdxzFem3Zcr0lsNQ6 Field16269;
    public qc9FwVpWiqRQho5VXPrDfJ5nrkFdG0Ld Field16270;
    public xfKO2kJY09p7yXG79bTHVSJ9A5NScaFn Field16271;
    public k4TF8hWLqptlwihhISw1ydv1kbHGy2aB Field16272;
    public b5qLioQbaGgDoPggV7tWlvNsnbI4vhm5 Field16273;
    public com.kisman.cc.event.leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field16274;
    public SC8Jf2XX6Bd2wJSWcyrwNRhYFqs5HsH3 Field16275;
    public I7F8iz7oQorkIm5qDcfi8iw0hGUOnlSO Field16276;
    public S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a Field16277;
    public w9yoWrhYfanbmeXFvDRBCxqulYbR2bTN Field16278;
    public lxa1HaXIGXYI9kJNqMVNvUw1GVYkMlLw Field16279;
    public pA7QGCR74zCuCMNttxzQD6TX0owx4gST Field16280;
    public auE3dCySxyIc1tKngAVuALlcvYBWsMni Field16281;
    public xnYyHzhHVK4NHEGxlkwLjS2MiocKlnrv Field16282;
    public G8orPVpz3wasM192bOqg0VxWbq8zayHP Field16283;
    public wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz Field16284;
    public final vz7kvqGxWYJPpEqllRkQWdweComnfxeZ Field16285 = new vz7kvqGxWYJPpEqllRkQWdweComnfxeZ();
    public chvHQJoInyPpoXaeZOwvyRVxSb8GEhWP Field16286;
    public boolean Field16287 = (int)((long)1950919988 ^ (long)1950919988);
    private String Field16288 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
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
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6793();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6794();
        f6aFouCJkCjY6laEAJ3SlVK7O2Sc85SP.Method1451();
        this.Field16286 = new chvHQJoInyPpoXaeZOwvyRVxSb8GEhWP("LavaHack");
        this.Field16279 = new lxa1HaXIGXYI9kJNqMVNvUw1GVYkMlLw();
        this.Field16274 = new com.kisman.cc.event.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
        this.Field16276 = new I7F8iz7oQorkIm5qDcfi8iw0hGUOnlSO();
        this.Field16276.Method835();
        this.Field16256 = new n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI();
        this.Field16258 = new eXIEwpfsveJ6FwbLoefTKstatmuKRSOh();
        this.Field16254 = new ModuleManager();
        this.Field16259 = new smV5JOluLiBZH5M4QrQHiUUe9Pp73qYA();
        uJlc9uxrtKnkTsCaT5ROLyCQup215H6e.Field14116.Method5390();
        this.Field16257 = new T3oF5fVXuSTdCee25m9XwZDUOAAChP2d();
        this.Field16286.Method3685();
        this.Field16279.Method7782();
        this.Field16274.Method6842();
        this.Field16254.Method1160();
        this.Field16257.Method1522();
        this.Field16286.Method3686();
        Display.setTitle((String)"LavaHack | b0.1.6.5-9");
        MinecraftForge.EVENT_BUS.register((Object)this);
        Field16252 = Minecraft.getMinecraft();
        this.Field16253 = new ZL1odW2XJDzzCmKJR66p1Ynf5DXx2MCL();
        this.Field16277 = new S0z2ZRr1sNIcNTIsgUZrkyFm9qkxM99a();
        this.Field16260 = new qAMntBvpawO7voz5KoEzPRpFPYIb4WHt();
        this.Field16261 = new ABhseIFL1PQVX4WAovmpeO8P6T0dQPpk();
        this.Field16272 = new k4TF8hWLqptlwihhISw1ydv1kbHGy2aB();
        this.Field16273 = new b5qLioQbaGgDoPggV7tWlvNsnbI4vhm5();
        this.Field16275 = new SC8Jf2XX6Bd2wJSWcyrwNRhYFqs5HsH3();
        this.Field16285.Method6265();
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Method782();
        this.Field16280 = new pA7QGCR74zCuCMNttxzQD6TX0owx4gST();
        this.Field16280.Method2927();
        this.Field16282 = new xnYyHzhHVK4NHEGxlkwLjS2MiocKlnrv();
        this.Field16283 = new G8orPVpz3wasM192bOqg0VxWbq8zayHP();
        this.Field16260 = new qAMntBvpawO7voz5KoEzPRpFPYIb4WHt();
        this.Field16262 = new zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4();
        this.Field16263 = new sZ6sbQQyFIfme6FINdJ6W9UgWyr1cDwI();
        this.Field16264 = new GtuIb5l0zIz019jVBBS0wnsuMmUh61R5();
        this.Field16266 = new RIWIbms6n7Y2IsCEMifH6pLMJ1SU3mY3();
        this.Field16271 = new xfKO2kJY09p7yXG79bTHVSJ9A5NScaFn();
        this.Field16271.Method432();
        this.Field16267 = new SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6(SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13591);
        this.Field16268 = new I0R0do5HxnbufehLe8qF1yl2lYfOIhr9$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf();
        this.Field16262.Method1219();
        this.Field16269 = new VQmVPKF3m0DBrMztdxzFem3Zcr0lsNQ6(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Test"), null);
        this.Field16270 = new qc9FwVpWiqRQho5VXPrDfJ5nrkFdG0Ld();
        this.Field16284 = new wEMl3HTSYAWS1ZEwLleN64Ds0SjhROrz("config");
        this.Field16284.Method3998().Method1420();
        this.Field16278 = new w9yoWrhYfanbmeXFvDRBCxqulYbR2bTN();
        this.Field16278.Method3670();
        FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D.Method7320().Method7321();
        Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo.Field17564.Method7636();
        Field16243.info("Initialized LavaHack b0.1.6.5-9! It took " + (System.currentTimeMillis() - l) + " ms!");
        this.Field16251 = (int)((long)1120717640 ^ (long)1120717641);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6780(InputEvent.KeyInputEvent keyInputEvent) {
        if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16252.world == null) return;
        if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16252.player == null) {
            return;
        }
        if (!Keyboard.isCreated()) return;
        if (!Keyboard.getEventKeyState()) {
            if (Keyboard.getEventKey() <= ((int)-406211101L ^ 0xE7C9B5E2)) return;
            this.Method6782(Keyboard.getEventKey(), (boolean)((long)-1802016162 ^ (long)-1802016162));
            return;
        }
        int n = Keyboard.getEventKey();
        if (n <= (int)((long)-1252936842 ^ (long)-1252936841)) {
            return;
        }
        for (U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n : this.Field16254.Field8854) {
            if (((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method8() != n || ((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Field8059 != ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12068) continue;
            ((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method22();
        }
        for (U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n : this.Field16257.Field9235) {
            if (((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method8() != n || ((qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk != ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12068) continue;
            ((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method22();
        }
        Iterator iterator = this.Field16258.Method7570().iterator();
        block2: while (iterator.hasNext()) {
            U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n;
            u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n = (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)iterator.next();
            if (((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method385()) {
                Iterator iterator2 = ((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Field8115.keySet().iterator();
                while (true) {
                    if (!iterator2.hasNext()) continue block2;
                    String string = (String)iterator2.next();
                    g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh2 = (g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh)((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Field8115.get(string);
                    if (g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh2.Method8() != n || g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh2.Method12() != ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12068) continue;
                    ((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method360(string);
                    if (!this.Field16251 || !null.Field11785.Method365()) continue;
                    NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5506().Method1882(TextFormatting.GRAY + "Setting " + ((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method399() + " has been changed to " + string + "!");
                }
            }
            if (((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method8() != n || ((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Field8082 != ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12068 || !((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method386()) continue;
            ((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method366((!((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method365() ? (int)-137310185L ^ 0xF7D0D016 : (int)((long)-220476661 ^ (long)-220476661)) != 0);
            if (!this.Field16251 || !null.Field11785.Method365()) continue;
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5506().Method1882(TextFormatting.GRAY + "Setting " + (((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method365() ? TextFormatting.GREEN : TextFormatting.RED) + ((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method399() + TextFormatting.GRAY + " has been " + (((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method365() ? "enabled" : "disabled") + "!");
        }
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6781(InputEvent inputEvent) {
        if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16252.world == null) return;
        if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16252.player == null) {
            return;
        }
        if (!Mouse.isCreated()) return;
        if (!Mouse.getEventButtonState()) {
            if (Mouse.getEventButton() <= (int)((long)-2044259395 ^ (long)-2044259396)) return;
            this.Method6782(Mouse.getEventButton(), ((int)648310202L ^ 0x26A46DBB) != 0);
            return;
        }
        int n = Mouse.getEventButton();
        if (n <= (int)((long)2092633825 ^ (long)2092633824)) {
            return;
        }
        for (U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n : this.Field16254.Field8854) {
            if (U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Field10935.Method7139(u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n) != n || ((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method12() != ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12069) continue;
            ((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method22();
        }
        for (U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n : this.Field16257.Field9235) {
            if (U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Field10935.Method7139(u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n) != n || ((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method12() != ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12069) continue;
            ((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method22();
        }
        Iterator iterator = this.Field16258.Method7570().iterator();
        block2: while (iterator.hasNext()) {
            U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n;
            u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n = (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)iterator.next();
            if (((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method385()) {
                Iterator iterator2 = ((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Field8115.keySet().iterator();
                while (true) {
                    if (!iterator2.hasNext()) continue block2;
                    String string = (String)iterator2.next();
                    g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh2 = (g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh)((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Field8115.get(string);
                    if (U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Field10935.Method7139(u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n) != n || g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh2.Method12() != ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12069) continue;
                    ((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method360(string);
                    if (!this.Field16251 || !null.Field11785.Method365()) continue;
                    NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5506().Method1882(TextFormatting.GRAY + "Setting " + ((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method399() + " has been changed to " + string + "!");
                }
            }
            if (U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Field10935.Method7139(u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n) != n || ((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method12() != ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12069 || !((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method386()) continue;
            ((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method366((!((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method365() ? (int)-2138686880L ^ 0x80863A61 : (int)((long)94111984 ^ (long)94111984)) != 0);
            if (!this.Field16251 || !null.Field11785.Method365()) continue;
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5506().Method1882(TextFormatting.GRAY + "Setting " + (((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method365() ? TextFormatting.GREEN : TextFormatting.RED) + ((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method358().Method40() + "->" + ((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method356() + TextFormatting.GRAY + " has been " + (((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method365() ? "enabled" : "disabled") + "!");
        }
    }

    private void Method6782(int n, boolean bl) {
        for (U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n : this.Field16254.Field8854) {
            if (U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Field10935.Method7139(u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n) != n || bl && ((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method12() != ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12069 || !((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Field8065) continue;
            ((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method22();
        }
        for (U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n : this.Field16257.Field9235) {
            if (U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Field10935.Method7139(u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n) != n || bl && ((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method12() != ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12069 || !((qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).IBONRcQCNUBg2NBpVpVQf61ykmVfU03E) continue;
            ((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method22();
        }
        Iterator iterator = this.Field16258.Method7570().iterator();
        while (iterator.hasNext()) {
            U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n;
            u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n = (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)iterator.next();
            if (U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Field10935.Method7139(u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n) != n || ((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method12() != ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12069 || !((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method386()) continue;
            ((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method366((!((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method365() ? (int)((long)-1902422355 ^ (long)-1902422356) : (int)-2100228739L ^ 0x82D10D7D) != 0);
            if (!this.Field16251 || !null.Field11785.Method365()) continue;
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5506().Method1882(TextFormatting.GRAY + "Setting " + (((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method365() ? TextFormatting.GREEN : TextFormatting.RED) + ((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method358().Method40() + "->" + ((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method356() + TextFormatting.GRAY + " has been " + (((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n).Method365() ? "enabled" : "disabled") + "!");
        }
    }

    public static String Method6783() {
        return Field16241.Method6784();
    }

    public String Method6784() {
        if (!this.Field16251) return "LavaHack";
        String string = null.Field11780.Method359();
        int n = (int)-426354978L ^ 0x1969A921;
        switch (string.hashCode()) {
            case -403234427: {
                if (!string.equals("kismancc")) return "LavaHack";
                n = (int)-1869554606L ^ 0x9090DC52;
                return "LavaHack";
            }
            case -1326794175: {
                if (!string.equals("LavaHack")) return "LavaHack";
                n = (int)1396464035L ^ 0x533C59A2;
                return "LavaHack";
            }
            case -1731059230: {
                if (!string.equals("TheKisDevs")) return "LavaHack";
                n = ((int)-1850724722L ^ 0x91B02E8F) << 1;
                return "LavaHack";
            }
            case -1131591468: {
                if (!string.equals("kidman")) return "LavaHack";
                n = (int)((long)320908301 ^ (long)320908302);
                return "LavaHack";
            }
            case 826009468: {
                if (!string.equals("TheClient")) return "LavaHack";
                n = ((int)-1777035822L ^ 0x961495D3) << 2;
                return "LavaHack";
            }
            case -1073073408: {
                if (!string.equals("BloomWare")) return "LavaHack";
                n = (int)((long)-1842205503 ^ (long)-1842205500);
                return "LavaHack";
            }
            case -1131591478: {
                if (!string.equals("kidmad")) return "LavaHack";
                n = (int)((long)-1706047963 ^ (long)-1706047962) << 1;
                return "LavaHack";
            }
            case 85459: {
                if (!string.equals("UwU")) return "LavaHack";
                n = (int)((long)1452919808 ^ (long)1452919815);
                return "LavaHack";
            }
            case -1390922133: {
                if (!string.equals("EarthHack")) return "LavaHack";
                n = ((int)256354595L ^ 0xF47A922) << 3;
                return "LavaHack";
            }
            case -1349088399: {
                if (!string.equals("custom")) return "LavaHack";
                n = (int)((long)-1891399129 ^ (long)-1891399122);
                return "LavaHack";
            }
            case -1199251178: {
                if (!string.equals("ClientName")) return "LavaHack";
                n = (int)((long)529310645 ^ (long)529310640) << 1;
                return "LavaHack";
            }
        }
        return "LavaHack";
    }

    public static String Method6785() {
        if (!leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16251) return "b0.1.6.5-9";
        String string = null.Field11780.Method359();
        int n = (int)((long)-1984636976 ^ (long)1984636975);
        switch (string.hashCode()) {
            case -1073073408: {
                if (!string.equals("BloomWare")) return "b0.1.6.5-9";
                n = (int)-586870461L ^ 0xDD051143;
                return "b0.1.6.5-9";
            }
            case -1390922133: {
                if (!string.equals("EarthHack")) return "b0.1.6.5-9";
                n = (int)800766997L ^ 0x2FBABC14;
                return "b0.1.6.5-9";
            }
            case -1199251178: {
                if (!string.equals("ClientName")) return "b0.1.6.5-9";
                n = ((int)-188404625L ^ 0xF4C52C6E) << 1;
                return "b0.1.6.5-9";
            }
        }
        return "b0.1.6.5-9";
    }

    public static void Method6786() throws IOException {
        if (!Files.exists(Paths.get("kisman.cc/", new String[(int)-47681668L ^ 0xFD286F7C]), new LinkOption[(int)479871243L ^ 0x1C9A410B])) {
            Files.createDirectories(Paths.get("kisman.cc/", new String[(int)((long)-2108510576 ^ (long)-2108510576)]), new FileAttribute[(int)((long)-851267708 ^ (long)-851267708)]);
            Field16243.info("Root dir created");
        }
        if (!Files.exists(Paths.get("kisman.cc/Images/", new String[(int)433937093L ^ 0x19DD5AC5]), new LinkOption[(int)((long)-527668992 ^ (long)-527668992)])) {
            Files.createDirectories(Paths.get("kisman.cc/Images/", new String[(int)-1159998661L ^ 0xBADBD33B]), new FileAttribute[(int)613434332L ^ 0x249043DC]);
            Field16243.info("Images dir created");
        }
        if (!Files.exists(Paths.get("kisman.cc/Lua/", new String[(int)-1195383614L ^ 0xB8BFE4C2]), new LinkOption[(int)((long)1479534402 ^ (long)1479534402)])) {
            Files.createDirectories(Paths.get("kisman.cc/Lua/", new String[(int)-681866349L ^ 0xD75B8B93]), new FileAttribute[(int)((long)1142276713 ^ (long)1142276713)]);
            Field16243.info("Lua dir created");
        }
        if (!Files.exists(Paths.get("kisman.cc/Mapping/", new String[(int)((long)-931255903 ^ (long)-931255903)]), new LinkOption[(int)-1583503997L ^ 0xA19DA583])) {
            Files.createDirectories(Paths.get("kisman.cc/Mapping/", new String[(int)((long)2099450569 ^ (long)2099450569)]), new FileAttribute[(int)((long)646388625 ^ (long)646388625)]);
            Field16243.info("Mapping dir created");
        }
        if (Files.exists(Paths.get("kisman.cc/Plugins/", new String[(int)((long)2138857859 ^ (long)2138857859)]), new LinkOption[(int)-1315786602L ^ 0xB192B096])) return;
        Files.createDirectories(Paths.get("kisman.cc/Plugins/", new String[(int)-501940431L ^ 0xE214FF31]), new FileAttribute[(int)1572760963L ^ 0x5DBE6D83]);
        Field16243.info("Plugins dir created");
    }

    public static void Method6787(String string) {
        Desktop desktop = Desktop.getDesktop();
        if (desktop == null) return;
        if (!desktop.isSupported(Desktop.Action.BROWSE)) return;
        desktop.browse(new URI(string));
    }

    public static void Method6788() {
        if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16262 == null) {
            return;
        }
        int n = (int)-1892534484L ^ 0x8F32372C;
        if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16252.currentScreen instanceof zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4) {
            Field16252.displayGuiScreen(null);
            n = (int)-1093041763L ^ 0xBED9819C;
        }
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16262.Field14607.forEach(ohP0orxdq2P1v9VESBaGP1easnqKGTCb::Method66);
    }

    public static boolean Method6789() {
        return System.getProperty("java.class.path").contains("idea_rt.jar");
    }

    public static boolean Method6790() {
        Minecraft.class.getDeclaredField("world");
        return ((int)958098629L ^ 0x391B6CC5) != 0;
    }

    public static void Method6791() {
        Unsafe unsafe = null;
        Field field = Unsafe.class.getDeclaredField("theUnsafe");
        field.setAccessible(((int)1774332593L ^ 0x69C22AB0) != 0);
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
        Field16246 = (int)-1030352720L ^ 0xC29610B0;
        Field16240 = (int)((long)663404369 ^ (long)663404369);
        Field16239 = "Plugins/";
        Field16238 = "Images/";
        Field16237 = "Mapping/";
        Field16236 = "Lua/";
        Field16235 = "kisman.cc/";
        Field16234 = "b0.1.6.5-9";
        Field16233 = "kisman";
        Field16232 = "LavaHack";
        Field16231 = RandomStringUtils.random((int)((long)-595984918 ^ (long)-595984913) << 1, (boolean)((long)-809466637 ^ (long)-809466638), ((int)-1847481737L ^ 0x91E1AA76) != 0);
        Field16241 = new leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
        Field16242 = new YlFSugLHQAjzunVBKfamPjSRsvHTy3jf();
        Field16243 = LogManager.getLogger((String)"LavaHack");
        Field16244 = new HashMap();
        Field16245 = null;
        Field16247 = !leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6789() || leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6790() ? (int)((long)-424528676 ^ (long)-424528675) : (int)((long)-341976398 ^ (long)-341976398);
        Field16248 = (int)((long)-2050185841 ^ (long)-2050185841);
        Field16249 = (int)901448451L ^ 0x35BB0303;
        Field16250 = null;
    }

    private static String Method6795(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1922372020 ^ (long)-1922372020);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1484176478 ^ (long)1484176545);
            int n2 = ((int)1081635398L ^ 0x4078724B) << 4;
            cArray2[n] = (char)(cArray[n] ^ (((int)1940144807L ^ 0x73A443DA) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

