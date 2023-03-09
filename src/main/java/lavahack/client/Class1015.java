//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import lavahack.client.Class1172;
import lavahack.client.Class1178;
import lavahack.client.Class1249;
import lavahack.client.Class1330;
import lavahack.client.Class1796;
import lavahack.client.Class2089;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class753;
import lavahack.client.Class936;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class Class1015
extends Class1249 {
    private final Class44 Field12404 = this.Method23(new Class44("Astolfo", (Class42)this, true));
    private final Class44 Field12405 = this.Method23(new Class44("Color", (Class42)this, new Class2027(255, 255, 255, 255)));
    private final Class44 Field12406 = this.Method23(new Class44("Mode", (Class42)this, Class2089.Field17535));
    private final Class44 Field12407 = this.Method23(new Class44("Image Mode", (Class42)this, Class1330.Field14093).Method313(this::Method4126));
    private final Class44 Field12408 = this.Method23(new Class44("Bold", (Class42)this, false));
    private final Class44 Field12409 = this.Method23(new Class44("Glow", (Class42)this, false));
    private final Class44 Field12410 = this.Method23(new Class44("Glow Offset", (Class42)this, Double.longBitsToDouble(0x4014000000000000L), 0.0, Double.longBitsToDouble(0x4034000000000000L), true));
    private final Class44 Field12411 = this.Method23(new Class44("CSGO Version", (Class42)this, false));
    private int Field12412;

    public Class1015() {
        super("Logo", "lava-hack on top");
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method4125(RenderGameOverlayEvent.Text text) {
        String string = Class1796.Method6783();
        String string2 = Class1796.Method6785();
        if (this.Field12406.Method309("Simple")) {
            int n;
            int n2 = n = this.Field12404.Method365() ? Class1172.Method4709(100, 100) : this.Field12405.Method339().Method3626();
            if (this.Field12409.Method365()) {
                int n3 = this.Field12410.Method335();
                Class753.drawGlow(1 - n3, 1 - n3, 1 + Class1178.Method4741(string + string2) + n3, 1 + Class1178.Method4748() + n3, n);
            }
            Class1178.Method4745((this.Field12408.Method365() ? TextFormatting.BOLD : "") + string + " " + TextFormatting.GRAY + string2, 1.0, 1.0, n);
            return;
        }
        if (this.Field12406.Method309("CSGO")) {
            String string3 = string + (this.Field12411.Method365() ? TextFormatting.GRAY + " | " + TextFormatting.RESET + Class1796.Method6785() : "") + TextFormatting.GRAY + " | " + TextFormatting.RESET + Class1015.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getName() + TextFormatting.GRAY + " | " + TextFormatting.RESET + (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.isSingleplayer() ? 0 : Class1796.Field16241.Field16275.Method7401()) + " ms" + TextFormatting.GRAY + " | " + TextFormatting.RESET + "FPS " + Minecraft.getDebugFPS();
            int n = this.Field12404.Method365() ? Class1172.Method4709(100, 100) : this.Field12405.Method339().Method3626();
            int n4 = 3;
            int n5 = 8;
            int n6 = 4 + Class1178.Method4741(string3);
            int n7 = 4 + Class1178.Method4748();
            Gui.drawRect((int)(n4 + 3), (int)(n5 + 3), (int)(n4 + n6 + 3), (int)(n5 + n7 - 3), (int)Class1172.Method4718(33, 33, 42));
            Gui.drawRect((int)(n4 + 3), (int)n5, (int)(n4 + n6 + 3), (int)(n5 + n7), (int)Class1172.Method4718(33, 33, 42));
            Gui.drawRect((int)(n4 + 2), (int)(n5 + 2), (int)(n4 + n6 + 2), (int)(n5 + n7 - 2), (int)Class1172.Method4718(45, 45, 55));
            Gui.drawRect((int)(n4 + 2), (int)n5, (int)(n4 + n6 + 2), (int)(n5 + n7), (int)Class1172.Method4718(45, 45, 55));
            Gui.drawRect((int)(n4 + 1), (int)(n5 + 1), (int)(n4 + n6 + 1), (int)(n5 + n7 - 1), (int)Class1172.Method4718(60, 60, 70));
            Gui.drawRect((int)(n4 + 1), (int)n5, (int)(n4 + n6 + 1), (int)(n5 + n7), (int)Class1172.Method4718(60, 60, 70));
            Gui.drawRect((int)(n4 - 3), (int)(n5 - 8), (int)(n4 + n6 + 3), (int)(n5 + n7 - 3), (int)Class1172.Method4718(33, 33, 42));
            Gui.drawRect((int)(n4 - 3), (int)n5, (int)(n4 + n6 + 3), (int)(n5 + n7), (int)Class1172.Method4718(33, 33, 42));
            Gui.drawRect((int)(n4 - 2), (int)(n5 - 7), (int)(n4 + n6 + 2), (int)(n5 + n7 - 2), (int)Class1172.Method4718(45, 45, 55));
            Gui.drawRect((int)(n4 - 2), (int)n5, (int)(n4 + n6 + 2), (int)(n5 + n7), (int)Class1172.Method4718(45, 45, 55));
            Gui.drawRect((int)(n4 - 1), (int)(n5 - 6), (int)(n4 + n6 + 1), (int)(n5 + n7 - 1), (int)Class1172.Method4718(60, 60, 70));
            Gui.drawRect((int)(n4 - 1), (int)n5, (int)(n4 + n6 + 1), (int)(n5 + n7), (int)Class1172.Method4718(60, 60, 70));
            Gui.drawRect((int)n4, (int)(n5 - 5), (int)(n4 + n6), (int)(n5 + n7), (int)n);
            Gui.drawRect((int)(n4 - 3), (int)(n5 - 1), (int)(n4 + n6 + 3), (int)(n5 + n7 + 3), (int)Class1172.Method4718(33, 33, 42));
            Gui.drawRect((int)(n4 - 2), (int)(n5 - 2), (int)(n4 + n6 + 2), (int)(n5 + n7 + 2), (int)Class1172.Method4718(45, 45, 55));
            Gui.drawRect((int)(n4 - 1), (int)(n5 - 3), (int)(n4 + n6 + 1), (int)(n5 + n7 + 1), (int)Class1172.Method4718(60, 60, 70));
            Gui.drawRect((int)n4, (int)(n5 - 4), (int)(n4 + n6), (int)(n5 + n7), (int)Class1172.Method4718(34, 34, 40));
            Class1178.Method4745((this.Field12408.Method365() ? TextFormatting.BOLD : "") + string3, n4 + 2, n5 + 2, n);
            return;
        }
        if (this.Field12406.Method309("GishCode")) {
            int n = this.Field12404.Method365() ? Class1172.Method4709(100, 100) : this.Field12405.Method339().Method3626();
            GL11.glPushMatrix();
            GL11.glScaled((double)Double.longBitsToDouble((long)1021547323 ^ 0x3FF800003CE3933BL), (double)Double.longBitsToDouble((long)61784917 ^ 0x3FF8000003AEC355L), (double)Double.longBitsToDouble(4609434218613702656L));
            Class1015.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer.drawStringWithShadow("LavaHack", Float.intBitsToFloat(0x40800000), Float.intBitsToFloat(0x40800000), n);
            GL11.glScaled((double)Double.longBitsToDouble(0x3FE3333333333333L), (double)Double.longBitsToDouble((long)1241847491 ^ 0x3FE33333793625F0L), (double)Double.longBitsToDouble(0x3FE3333333333333L));
            Class1015.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer.drawStringWithShadow(TextFormatting.GRAY + Class1796.Method6785(), Float.intBitsToFloat(1118306304), Float.intBitsToFloat(0x40800000), -1);
            Class1015.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer.drawStringWithShadow(TextFormatting.GRAY + "1.12.2", Float.intBitsToFloat(1118306304), Float.intBitsToFloat(1096810496), -1);
            GL11.glPopMatrix();
            return;
        }
        if (this.Field12407.Method309("Old")) {
            Class936.Field11995.Method3868(0.0, 0.0, Double.longBitsToDouble((long)65804782 ^ 0x4049000003EC19EEL), Double.longBitsToDouble(0x4049000000000000L));
            return;
        }
        if (!this.Field12407.Method309("New")) return;
        Class936.Field11996.Method3869(0.0, 0.0, Double.longBitsToDouble(0x4054000000000000L), Double.longBitsToDouble((long)1344895920 ^ 0x4054000050297BB0L), new Class2027(Class1172.Method4709(100, 100)));
    }

    private Boolean Method4126() {
        return this.Field12406.Method309("Image");
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 153;
            cArray2[n] = (char)(cArray[n] ^ (0x5184 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

