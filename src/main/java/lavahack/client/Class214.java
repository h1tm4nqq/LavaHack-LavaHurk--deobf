//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraftforge.client.event.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.vertex.*;
import java.awt.*;
import net.minecraft.client.renderer.*;
import net.minecraftforge.fml.common.eventhandler.*;
import com.kisman.cc.util.*;

public class Class214 extends Class42
{
    private final Class44 Field8913;
    private final Class44 Field8914;
    private final Class44 Field8915;
    private final Class44 Field8916;
    private final Class44 Field8917;
    private final Class44 Field8918;
    private final Class44 Field8919;
    private final Class44 Field8920;
    private String Field8921 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class214() {
        super("ScreenTint", Class97.Field8342);
        this.Field8913 = this.Method23(new Class44("RenderMode", this, Class970.Field12162));
        this.Field8914 = this.Method23(new Class44("Speed", this, 1.0, Double.longBitsToDouble((long)809089059 ^ 0x3FD000003039B823L), Double.longBitsToDouble((long)64194282 ^ 0x4014000003D386EAL), false));
        this.Field8915 = this.Method23(new Class44("Saturation", this, Double.longBitsToDouble((long)1201834468 ^ 0x4059000047A289E4L), Double.longBitsToDouble((long)1421162213 ^ 0x4024000054B536E5L), Double.longBitsToDouble(4636737291354636288L), true));
        this.Field8916 = this.Method23(new Class44("Brightness", this, Double.longBitsToDouble(4632233691727265792L), 0.0, Double.longBitsToDouble(4636737291354636288L), true));
        this.Field8917 = this.Method23(new Class44("Color 1", this, new Class2027(255, 255, 255, 0)));
        this.Field8918 = this.Method23(new Class44("Color 2", this, new Class2027(255, 255, 255, 0)).Method313(this::Method1247));
        this.Field8919 = this.Method23(new Class44("Color 3", this, new Class2027(255, 255, 255, 0)).Method313(this::Method1246));
        this.Field8920 = this.Method23(new Class44("Color 4", this, new Class2027(255, 255, 255, 0)).Method313(this::Method1245));
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method1243(final RenderGameOverlayEvent$Pre renderGameOverlayEvent$Pre) {
        if (Class214.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class214.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        final int n = 0;
        final int height = Display.getHeight();
        final int width = Display.getWidth();
        final int n2 = 0;
        final Color[] method1244 = this.Method1244();
        final Color color = method1244[0];
        final Color color2 = method1244[1];
        final Color color3 = method1244[2];
        final Color color4 = method1244[3];
        final Tessellator getInstance = Tessellator.getInstance();
        final BufferBuilder getBuffer = getInstance.getBuffer();
        Class815.Method3433();
        getBuffer.begin(7, DefaultVertexFormats.POSITION_COLOR);
        getBuffer.pos((double)n, (double)n2, 0.0).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        getBuffer.pos((double)width, (double)n2, 0.0).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
        getBuffer.pos((double)width, (double)height, 0.0).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
        getBuffer.pos((double)n, (double)height, 0.0).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha()).endVertex();
        getInstance.draw();
        Class815.Method3434();
    }
    
    private Color[] Method1244() {
        if (this.Field8913.Method341() == Class970.Field12162) {
            return new Color[] { this.Field8917.Method339().Method3625(), this.Field8917.Method339().Method3625(), this.Field8917.Method339().Method3625(), this.Field8917.Method339().Method3625() };
        }
        if (this.Field8913.Method341() == Class970.Field12163) {
            return new Color[] { this.Field8917.Method339().Method3625(), this.Field8917.Method339().Method3625(), this.Field8918.Method339().Method3625(), this.Field8918.Method339().Method3625() };
        }
        if (this.Field8913.Method341() == Class970.Field12164) {
            final Color method3625 = Class845.Method3579(0, this.Field8915.Method335(), this.Field8916.Method335(), this.Field8917.Method339().Method3631(), this.Field8914.Method367()).Method3625();
            return new Color[] { method3625, method3625, method3625, method3625 };
        }
        if (this.Field8913.Method341() == Class970.Field12165) {
            return new Color[] { this.Field8917.Method339().Method3625(), this.Field8918.Method339().Method3625(), this.Field8919.Method339().Method3625(), this.Field8920.Method339().Method3625() };
        }
        if (this.Field8913.Method341() == Class970.Field12166) {
            final long currentTimeMillis = System.currentTimeMillis();
            return new Color[] { Class845.Method3580(currentTimeMillis, 0, this.Field8915.Method335(), this.Field8916.Method335(), this.Field8917.Method339().Method3631(), this.Field8914.Method367()).Method3625(), Class845.Method3580(currentTimeMillis, 90, this.Field8915.Method335(), this.Field8916.Method335(), this.Field8917.Method339().Method3631(), this.Field8914.Method367()).Method3625(), Class845.Method3580(currentTimeMillis, 180, this.Field8915.Method335(), this.Field8916.Method335(), this.Field8917.Method339().Method3631(), this.Field8914.Method367()).Method3625(), Class845.Method3580(currentTimeMillis, 270, this.Field8915.Method335(), this.Field8916.Method335(), this.Field8917.Method339().Method3631(), this.Field8914.Method367()).Method3625() };
        }
        return new Color[] { Class815.Field11486.Method3625(), Class815.Field11486.Method3625(), Class815.Field11486.Method3625(), Class815.Field11486.Method3625() };
    }
    
    private Boolean Method1245() {
        return this.Field8913.Method341() == Class970.Field12165;
    }
    
    private Boolean Method1246() {
        return this.Field8913.Method341() == Class970.Field12165;
    }
    
    private Boolean Method1247() {
        return this.Field8913.Method341() == Class970.Field12163 || this.Field8913.Method341() == Class970.Field12165;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1582 ^ 0xB8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
