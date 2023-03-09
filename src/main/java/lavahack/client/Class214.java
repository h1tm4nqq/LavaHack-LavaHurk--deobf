//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Pre
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.Display
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import com.kisman.cc.util.Class845;
import java.awt.Color;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class815;
import lavahack.client.Class97;
import lavahack.client.Class970;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.Display;

public class Class214
extends Class42 {
    private final Class44 Field8913 = this.Method23(new Class44("RenderMode", (Class42)this, Class970.Field12162));
    private final Class44 Field8914 = this.Method23(new Class44("Speed", (Class42)this, 1.0, Double.longBitsToDouble((long)809089059 ^ 0x3FD000003039B823L), Double.longBitsToDouble((long)64194282 ^ 0x4014000003D386EAL), false));
    private final Class44 Field8915 = this.Method23(new Class44("Saturation", (Class42)this, Double.longBitsToDouble((long)1201834468 ^ 0x4059000047A289E4L), Double.longBitsToDouble((long)1421162213 ^ 0x4024000054B536E5L), Double.longBitsToDouble(4636737291354636288L), true));
    private final Class44 Field8916 = this.Method23(new Class44("Brightness", (Class42)this, Double.longBitsToDouble(0x4049000000000000L), 0.0, Double.longBitsToDouble(4636737291354636288L), true));
    private final Class44 Field8917 = this.Method23(new Class44("Color 1", (Class42)this, new Class2027(255, 255, 255, 0)));
    private final Class44 Field8918 = this.Method23(new Class44("Color 2", (Class42)this, new Class2027(255, 255, 255, 0)).Method313(this::Method1247));
    private final Class44 Field8919 = this.Method23(new Class44("Color 3", (Class42)this, new Class2027(255, 255, 255, 0)).Method313(this::Method1246));
    private final Class44 Field8920 = this.Method23(new Class44("Color 4", (Class42)this, new Class2027(255, 255, 255, 0)).Method313(this::Method1245));
    private String Field8921 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class214() {
        super("ScreenTint", Class97.Field8342);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method1243(RenderGameOverlayEvent.Pre pre) {
        if (Class214.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class214.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        boolean bl = false;
        int n = Display.getHeight();
        int n2 = Display.getWidth();
        boolean bl2 = false;
        Color[] colorArray = this.Method1244();
        Color color = colorArray[0];
        Color color2 = colorArray[1];
        Color color3 = colorArray[2];
        Color color4 = colorArray[3];
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        Class815.Method3433();
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.pos((double)bl, (double)bl2, 0.0).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos((double)n2, (double)bl2, 0.0).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
        bufferBuilder.pos((double)n2, (double)n, 0.0).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
        bufferBuilder.pos((double)bl, (double)n, 0.0).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha()).endVertex();
        tessellator.draw();
        Class815.Method3434();
    }

    private Color[] Method1244() {
        if (this.Field8913.Method341() == Class970.Field12162) {
            return new Color[]{this.Field8917.Method339().Method3625(), this.Field8917.Method339().Method3625(), this.Field8917.Method339().Method3625(), this.Field8917.Method339().Method3625()};
        }
        if (this.Field8913.Method341() == Class970.Field12163) {
            return new Color[]{this.Field8917.Method339().Method3625(), this.Field8917.Method339().Method3625(), this.Field8918.Method339().Method3625(), this.Field8918.Method339().Method3625()};
        }
        if (this.Field8913.Method341() == Class970.Field12164) {
            Color color = Class845.Method3579(0, this.Field8915.Method335(), this.Field8916.Method335(), this.Field8917.Method339().Method3631(), this.Field8914.Method367()).Method3625();
            return new Color[]{color, color, color, color};
        }
        if (this.Field8913.Method341() == Class970.Field12165) {
            return new Color[]{this.Field8917.Method339().Method3625(), this.Field8918.Method339().Method3625(), this.Field8919.Method339().Method3625(), this.Field8920.Method339().Method3625()};
        }
        if (this.Field8913.Method341() != Class970.Field12166) return new Color[]{Class815.Field11486.Method3625(), Class815.Field11486.Method3625(), Class815.Field11486.Method3625(), Class815.Field11486.Method3625()};
        long l = System.currentTimeMillis();
        Color color = Class845.Method3580(l, 0, this.Field8915.Method335(), this.Field8916.Method335(), this.Field8917.Method339().Method3631(), this.Field8914.Method367()).Method3625();
        Color color2 = Class845.Method3580(l, 90, this.Field8915.Method335(), this.Field8916.Method335(), this.Field8917.Method339().Method3631(), this.Field8914.Method367()).Method3625();
        Color color3 = Class845.Method3580(l, 180, this.Field8915.Method335(), this.Field8916.Method335(), this.Field8917.Method339().Method3631(), this.Field8914.Method367()).Method3625();
        Color color4 = Class845.Method3580(l, 270, this.Field8915.Method335(), this.Field8916.Method335(), this.Field8917.Method339().Method3631(), this.Field8914.Method367()).Method3625();
        return new Color[]{color, color2, color3, color4};
    }

    private Boolean Method1245() {
        boolean bl;
        if (this.Field8913.Method341() == Class970.Field12165) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method1246() {
        boolean bl;
        if (this.Field8913.Method341() == Class970.Field12165) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method1247() {
        boolean bl;
        if (this.Field8913.Method341() != Class970.Field12163 && this.Field8913.Method341() != Class970.Field12165) {
            bl = false;
            return bl;
        }
        bl = true;
        return bl;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 184;
            cArray2[n] = (char)(cArray[n] ^ (0x1582 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

