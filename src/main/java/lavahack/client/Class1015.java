//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import java.util.function.*;
import net.minecraftforge.client.event.*;
import net.minecraft.util.text.*;
import net.minecraft.client.*;
import net.minecraft.client.gui.*;
import org.lwjgl.opengl.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class1015 extends Class1249
{
    private final Class44 Field12404;
    private final Class44 Field12405;
    private final Class44 Field12406;
    private final Class44 Field12407;
    private final Class44 Field12408;
    private final Class44 Field12409;
    private final Class44 Field12410;
    private final Class44 Field12411;
    private int Field12412;
    
    public Class1015() {
        super("Logo", "lava-hack on top");
        this.Field12404 = this.Method23(new Class44("Astolfo", this, true));
        this.Field12405 = this.Method23(new Class44("Color", this, new Class2027(255, 255, 255, 255)));
        this.Field12406 = this.Method23(new Class44("Mode", this, Class2089.Field17535));
        this.Field12407 = this.Method23(new Class44("Image Mode", this, Class1330.Field14093).Method313(this::Method4126));
        this.Field12408 = this.Method23(new Class44("Bold", this, false));
        this.Field12409 = this.Method23(new Class44("Glow", this, false));
        this.Field12410 = this.Method23(new Class44("Glow Offset", this, Double.longBitsToDouble(4617315517961601024L), 0.0, Double.longBitsToDouble(4626322717216342016L), true));
        this.Field12411 = this.Method23(new Class44("CSGO Version", this, false));
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method4125(final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        final String method6783 = Class1796.Method6783();
        final String method6784 = Class1796.Method6785();
        if (this.Field12406.Method309("Simple")) {
            final int n = this.Field12404.Method365() ? Class1172.Method4709(100, 100) : this.Field12405.Method339().Method3626();
            if (this.Field12409.Method365()) {
                final int method6785 = this.Field12410.Method335();
                Class753.drawGlow(1 - method6785, 1 - method6785, 1 + Class1178.Method4741(method6783 + method6784) + method6785, 1 + Class1178.Method4748() + method6785, n);
            }
            Class1178.Method4745((this.Field12408.Method365() ? TextFormatting.BOLD : "") + method6783 + " " + TextFormatting.GRAY + method6784, 1.0, 1.0, n);
        }
        else if (this.Field12406.Method309("CSGO")) {
            final String string = method6783 + (this.Field12411.Method365() ? (TextFormatting.GRAY + " | " + TextFormatting.RESET + Class1796.Method6785()) : "") + TextFormatting.GRAY + " | " + TextFormatting.RESET + Class1015.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getName() + TextFormatting.GRAY + " | " + TextFormatting.RESET + (Class1015.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.isSingleplayer() ? 0 : Class1796.Field16241.Field16275.Method7401()) + " ms" + TextFormatting.GRAY + " | " + TextFormatting.RESET + "FPS " + Minecraft.getDebugFPS();
            final int n2 = this.Field12404.Method365() ? Class1172.Method4709(100, 100) : this.Field12405.Method339().Method3626();
            final int n3 = 3;
            final int n4 = 8;
            final int n5 = 4 + Class1178.Method4741(string);
            final int n6 = 4 + Class1178.Method4748();
            Gui.drawRect(n3 + 3, n4 + 3, n3 + n5 + 3, n4 + n6 - 3, Class1172.Method4718(33, 33, 42));
            Gui.drawRect(n3 + 3, n4, n3 + n5 + 3, n4 + n6, Class1172.Method4718(33, 33, 42));
            Gui.drawRect(n3 + 2, n4 + 2, n3 + n5 + 2, n4 + n6 - 2, Class1172.Method4718(45, 45, 55));
            Gui.drawRect(n3 + 2, n4, n3 + n5 + 2, n4 + n6, Class1172.Method4718(45, 45, 55));
            Gui.drawRect(n3 + 1, n4 + 1, n3 + n5 + 1, n4 + n6 - 1, Class1172.Method4718(60, 60, 70));
            Gui.drawRect(n3 + 1, n4, n3 + n5 + 1, n4 + n6, Class1172.Method4718(60, 60, 70));
            Gui.drawRect(n3 - 3, n4 - 8, n3 + n5 + 3, n4 + n6 - 3, Class1172.Method4718(33, 33, 42));
            Gui.drawRect(n3 - 3, n4, n3 + n5 + 3, n4 + n6, Class1172.Method4718(33, 33, 42));
            Gui.drawRect(n3 - 2, n4 - 7, n3 + n5 + 2, n4 + n6 - 2, Class1172.Method4718(45, 45, 55));
            Gui.drawRect(n3 - 2, n4, n3 + n5 + 2, n4 + n6, Class1172.Method4718(45, 45, 55));
            Gui.drawRect(n3 - 1, n4 - 6, n3 + n5 + 1, n4 + n6 - 1, Class1172.Method4718(60, 60, 70));
            Gui.drawRect(n3 - 1, n4, n3 + n5 + 1, n4 + n6, Class1172.Method4718(60, 60, 70));
            Gui.drawRect(n3, n4 - 5, n3 + n5, n4 + n6, n2);
            Gui.drawRect(n3 - 3, n4 - 1, n3 + n5 + 3, n4 + n6 + 3, Class1172.Method4718(33, 33, 42));
            Gui.drawRect(n3 - 2, n4 - 2, n3 + n5 + 2, n4 + n6 + 2, Class1172.Method4718(45, 45, 55));
            Gui.drawRect(n3 - 1, n4 - 3, n3 + n5 + 1, n4 + n6 + 1, Class1172.Method4718(60, 60, 70));
            Gui.drawRect(n3, n4 - 4, n3 + n5, n4 + n6, Class1172.Method4718(34, 34, 40));
            Class1178.Method4745((this.Field12408.Method365() ? TextFormatting.BOLD : "") + string, n3 + 2, n4 + 2, n2);
        }
        else if (this.Field12406.Method309("GishCode")) {
            final int n7 = this.Field12404.Method365() ? Class1172.Method4709(100, 100) : this.Field12405.Method339().Method3626();
            GL11.glPushMatrix();
            GL11.glScaled(Double.longBitsToDouble((long)1021547323 ^ 0x3FF800003CE3933BL), Double.longBitsToDouble((long)61784917 ^ 0x3FF8000003AEC355L), Double.longBitsToDouble(4609434218613702656L));
            Class1015.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer.drawStringWithShadow("LavaHack", Float.intBitsToFloat(1082130432), Float.intBitsToFloat(1082130432), n7);
            GL11.glScaled(Double.longBitsToDouble(4603579539098121011L), Double.longBitsToDouble((long)1241847491 ^ 0x3FE33333793625F0L), Double.longBitsToDouble(4603579539098121011L));
            Class1015.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer.drawStringWithShadow(TextFormatting.GRAY + Class1796.Method6785(), Float.intBitsToFloat(1118306304), Float.intBitsToFloat(1082130432), -1);
            Class1015.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer.drawStringWithShadow(TextFormatting.GRAY + "1.12.2", Float.intBitsToFloat(1118306304), Float.intBitsToFloat(1096810496), -1);
            GL11.glPopMatrix();
        }
        else if (this.Field12407.Method309("Old")) {
            Class936.Field11995.Method3868(0.0, 0.0, Double.longBitsToDouble((long)65804782 ^ 0x4049000003EC19EEL), Double.longBitsToDouble(4632233691727265792L));
        }
        else if (this.Field12407.Method309("New")) {
            Class936.Field11996.Method3869(0.0, 0.0, Double.longBitsToDouble(4635329916471083008L), Double.longBitsToDouble((long)1344895920 ^ 0x4054000050297BB0L), new Class2027(Class1172.Method4709(100, 100)));
        }
    }
    
    private Boolean Method4126() {
        return this.Field12406.Method309("Image");
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5184 ^ 0x99));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
