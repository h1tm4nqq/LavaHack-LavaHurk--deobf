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

import com.kisman.cc.util.JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm;
import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.awt.Color;
import lavahack.client.MEO6UV3sauu7Tacc2djO4XHQodlqJcCT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.Display;

public class MEO6UV3sauu7Tacc2djO4XHQodlqJcCT
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8913 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RenderMode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, MEO6UV3sauu7Tacc2djO4XHQodlqJcCT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12162));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8914 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble((long)809089059 ^ 0x3FD000003039B823L), Double.longBitsToDouble((long)64194282 ^ 0x4014000003D386EAL), (boolean)((long)1039672635 ^ (long)1039672635)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8915 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Saturation", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1201834468 ^ 0x4059000047A289E4L), Double.longBitsToDouble((long)1421162213 ^ 0x4024000054B536E5L), Double.longBitsToDouble(0x21518ABD93CEB9D8L ^ 0x61088ABD93CEB9D8L), ((int)-1240545492L ^ 0xB60EC72D) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8916 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Brightness", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x11017D58663E9142L ^ 0x51487D58663E9142L), 0.0, Double.longBitsToDouble(0x7A50E92336F53144L ^ 0x3A09E92336F53144L), (boolean)((long)97796945 ^ (long)97796944)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8917 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color 1", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)21937927L ^ 0x14EBFF8, (int)((long)562681061 ^ (long)562680858), (int)((long)-1540032457 ^ (long)-1540032312), (int)((long)351984773 ^ (long)351984773))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8918 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color 2", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)1362822561 ^ (long)1362822494), (int)((long)200806379 ^ (long)200806164), (int)-2132408729L ^ 0x80E60698, (int)-1046233209L ^ 0xC1A3BF87)).Method313(this::Method1247));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8919 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color 3", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)1338509386 ^ (long)1338509493), (int)((long)-1895018467 ^ (long)-1895018270), (int)1926058280L ^ 0x72CD51D7, (int)((long)-221674712 ^ (long)-221674712))).Method313(this::Method1246));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8920 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color 4", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)1612676997 ^ (long)1612676986), (int)1045287420L ^ 0x3E4DD103, (int)1176753809L ^ 0x4623D66E, (int)((long)431435431 ^ (long)431435431))).Method313(this::Method1245));
    private String Field8921 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public MEO6UV3sauu7Tacc2djO4XHQodlqJcCT() {
        super("ScreenTint", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method1243(RenderGameOverlayEvent.Pre pre) {
        if (MEO6UV3sauu7Tacc2djO4XHQodlqJcCT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (MEO6UV3sauu7Tacc2djO4XHQodlqJcCT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        int n = (int)1620144113L ^ 0x60916FF1;
        int n2 = Display.getHeight();
        int n3 = Display.getWidth();
        int n4 = (int)((long)-890497038 ^ (long)-890497038);
        Color[] colorArray = this.Method1244();
        Color color = colorArray[(int)((long)714583091 ^ (long)714583091)];
        Color color2 = colorArray[(int)((long)74198169 ^ (long)74198168)];
        Color color3 = colorArray[((int)1493333267L ^ 0x59027512) << 1];
        Color color4 = colorArray[(int)-97097769L ^ 0xFA3667D4];
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3433();
        bufferBuilder.begin((int)((long)-1018641 ^ (long)-1018648), DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.pos((double)n, (double)n4, 0.0).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).endVertex();
        bufferBuilder.pos((double)n3, (double)n4, 0.0).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).endVertex();
        bufferBuilder.pos((double)n3, (double)n2, 0.0).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).endVertex();
        bufferBuilder.pos((double)n, (double)n2, 0.0).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha()).endVertex();
        tessellator.draw();
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3434();
    }

    private Color[] Method1244() {
        if (this.Field8913.Method341() == MEO6UV3sauu7Tacc2djO4XHQodlqJcCT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12162) {
            Color[] colorArray = new Color[(int)((long)873070975 ^ (long)873070974) << 2];
            colorArray[(int)77506755L ^ 0x49EA8C3] = this.Field8917.Method339().Method3625();
            colorArray[(int)((long)637453175 ^ (long)637453174)] = this.Field8917.Method339().Method3625();
            colorArray[(int)((long)1395159289 ^ (long)1395159288) << 1] = this.Field8917.Method339().Method3625();
            colorArray[(int)((long)96025834 ^ (long)96025833)] = this.Field8917.Method339().Method3625();
            return colorArray;
        }
        if (this.Field8913.Method341() == MEO6UV3sauu7Tacc2djO4XHQodlqJcCT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12163) {
            Color[] colorArray = new Color[(int)((long)-236091712 ^ (long)-236091711) << 2];
            colorArray[(int)((long)-1876609021 ^ (long)-1876609021)] = this.Field8917.Method339().Method3625();
            colorArray[(int)((long)1769936333 ^ (long)1769936332)] = this.Field8917.Method339().Method3625();
            colorArray[((int)1311555538L ^ 0x4E2CBFD3) << 1] = this.Field8918.Method339().Method3625();
            colorArray[(int)-1143356636L ^ 0xBBD9C327] = this.Field8918.Method339().Method3625();
            return colorArray;
        }
        if (this.Field8913.Method341() == MEO6UV3sauu7Tacc2djO4XHQodlqJcCT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12164) {
            Color color = JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Method3579((int)918410953L ^ 0x36BDD6C9, this.Field8915.Method335(), this.Field8916.Method335(), this.Field8917.Method339().Method3631(), this.Field8914.Method367()).Method3625();
            Color[] colorArray = new Color[(int)((long)849283606 ^ (long)849283607) << 2];
            colorArray[(int)1158302588L ^ 0x450A4B7C] = color;
            colorArray[(int)711133003L ^ 0x2A63074A] = color;
            colorArray[(int)((long)707230715 ^ (long)707230714) << 1] = color;
            colorArray[(int)((long)347738553 ^ (long)347738554)] = color;
            return colorArray;
        }
        if (this.Field8913.Method341() == MEO6UV3sauu7Tacc2djO4XHQodlqJcCT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12165) {
            Color[] colorArray = new Color[(int)((long)-382449766 ^ (long)-382449765) << 2];
            colorArray[(int)1325325696L ^ 0x4EFEDD80] = this.Field8917.Method339().Method3625();
            colorArray[(int)((long)-717590039 ^ (long)-717590040)] = this.Field8918.Method339().Method3625();
            colorArray[(int)((long)-103082097 ^ (long)-103082098) << 1] = this.Field8919.Method339().Method3625();
            colorArray[(int)592599906L ^ 0x23525B61] = this.Field8920.Method339().Method3625();
            return colorArray;
        }
        if (this.Field8913.Method341() == MEO6UV3sauu7Tacc2djO4XHQodlqJcCT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12166) {
            long l = System.currentTimeMillis();
            Color color = JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Method3580(l, (int)((long)-324273754 ^ (long)-324273754), this.Field8915.Method335(), this.Field8916.Method335(), this.Field8917.Method339().Method3631(), this.Field8914.Method367()).Method3625();
            Color color2 = JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Method3580(l, ((int)1544084122L ^ 0x5C08DAB7) << 1, this.Field8915.Method335(), this.Field8916.Method335(), this.Field8917.Method339().Method3631(), this.Field8914.Method367()).Method3625();
            Color color3 = JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Method3580(l, ((int)-1500462558L ^ 0xA690C20F) << 2, this.Field8915.Method335(), this.Field8916.Method335(), this.Field8917.Method339().Method3631(), this.Field8914.Method367()).Method3625();
            Color color4 = JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Method3580(l, ((int)-655310387L ^ 0xD8F0C14A) << 1, this.Field8915.Method335(), this.Field8916.Method335(), this.Field8917.Method339().Method3631(), this.Field8914.Method367()).Method3625();
            Color[] colorArray = new Color[((int)725276092L ^ 0x2B3AD5BD) << 2];
            colorArray[(int)((long)-1409090710 ^ (long)-1409090710)] = color;
            colorArray[(int)23287808L ^ 0x1635801] = color2;
            colorArray[(int)((long)-503444904 ^ (long)-503444903) << 1] = color3;
            colorArray[(int)1952378975L ^ 0x745EF05C] = color4;
            return colorArray;
        }
        Color[] colorArray = new Color[(int)((long)1585917731 ^ (long)1585917730) << 2];
        colorArray[(int)((long)971925224 ^ (long)971925224)] = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11486.Method3625();
        colorArray[(int)1292169140L ^ 0x4D04EFB5] = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11486.Method3625();
        colorArray[(int)((long)1505273407 ^ (long)1505273406) << 1] = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11486.Method3625();
        colorArray[(int)((long)-2042307415 ^ (long)-2042307414)] = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11486.Method3625();
        return colorArray;
    }

    private Boolean Method1245() {
        int n;
        if (this.Field8913.Method341() == MEO6UV3sauu7Tacc2djO4XHQodlqJcCT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12165) {
            n = (int)1585790329L ^ 0x5E853D78;
            return n != 0;
        }
        n = (int)((long)520704582 ^ (long)520704582);
        return n != 0;
    }

    private Boolean Method1246() {
        int n;
        if (this.Field8913.Method341() == MEO6UV3sauu7Tacc2djO4XHQodlqJcCT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12165) {
            n = (int)((long)-1330684338 ^ (long)-1330684337);
            return n != 0;
        }
        n = (int)((long)1439223335 ^ (long)1439223335);
        return n != 0;
    }

    private Boolean Method1247() {
        int n;
        if (this.Field8913.Method341() != MEO6UV3sauu7Tacc2djO4XHQodlqJcCT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12163 && this.Field8913.Method341() != MEO6UV3sauu7Tacc2djO4XHQodlqJcCT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12165) {
            n = (int)((long)-119897711 ^ (long)-119897711);
            return n != 0;
        }
        n = (int)((long)1604957975 ^ (long)1604957974);
        return n != 0;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1543489809 ^ (long)1543489809);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1765541658L ^ 0x96C3F819);
            int n2 = ((int)660847671L ^ 0x2763BC20) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-796536480 ^ (long)-796533855) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

