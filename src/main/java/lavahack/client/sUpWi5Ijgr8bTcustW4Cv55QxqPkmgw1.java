//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

@YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz
public class sUpWi5Ijgr8bTcustW4Cv55QxqPkmgw1
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10453 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Smooth", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1387473719L ^ 0x52B32B37) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10454 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("LineWidth", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble((long)218735739 ^ 0x3FE000000D09A47BL), Double.longBitsToDouble((long)848115244 ^ 0x40140000328D362CL), ((int)-332502127L ^ 0xEC2E6B91) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10455 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("FadeOut", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-868276414 ^ (long)-868276414)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10456 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("FadeAfterTicks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xF65CE8D1B6FC6400L ^ 0xB605E8D1B6FC6400L), 1.0, Double.longBitsToDouble((long)900657753 ^ 0x4079000035AEF259L), (boolean)((long)-1750640069 ^ (long)-1750640070)).Method313(this.Field10455::Method311));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10457 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("FadeOutTicks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1468904361 ^ 0x40240000578DB3A9L), 1.0, Double.longBitsToDouble(0x3EACC95D1FD87EC3L ^ 0x7E98C95D1FD87EC3L), (boolean)((long)-767071046 ^ (long)-767071045)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10458 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)-933838628L ^ 0xC856C023, (int)((long)1830180754 ^ (long)1830180717), (int)((long)-370027252 ^ (long)-370027021), (int)148520028L ^ 0x8DA3CA3)));
    private final Queue Field10459 = new ConcurrentLinkedQueue();
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field10460 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private double Field10461 = 0.0;
    private double Field10462 = 0.0;
    private double Field10463 = 0.0;
    private String Field10464 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public sUpWi5Ijgr8bTcustW4Cv55QxqPkmgw1() {
        super("Breadcrumbs", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
    }

    @Override
    public void Method45() {
        if (sUpWi5Ijgr8bTcustW4Cv55QxqPkmgw1.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null) {
            if (sUpWi5Ijgr8bTcustW4Cv55QxqPkmgw1.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) return;
        }
        this.Field10460.Method2801();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2527(RenderWorldLastEvent renderWorldLastEvent) {
        if (!this.Field10453.Method365()) {
            this.Method2528(renderWorldLastEvent.getPartialTicks());
            return;
        }
        if (!this.Field10460.Method2797(0x81C3FL & 0x64408072L)) {
            return;
        }
        this.Field10460.Method2801();
        this.Method20();
    }

    @Override
    public void Method38() {
        super.Method38();
        this.Field10460.Method2801();
    }

    private void Method20() {
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(this.Field10461, this.Field10462, this.Field10463, sUpWi5Ijgr8bTcustW4Cv55QxqPkmgw1.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, sUpWi5Ijgr8bTcustW4Cv55QxqPkmgw1.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, sUpWi5Ijgr8bTcustW4Cv55QxqPkmgw1.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        this.Field10459.offer(axisAlignedBB);
        int n = this.Field10458.Method339().Method3634();
        int n2 = this.Field10458.Method339().Method3636();
        int n3 = this.Field10458.Method339().Method3635();
        int n4 = this.Field10458.Method339().Method3631();
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableDepth();
        GlStateManager.tryBlendFuncSeparate((int)((int)((long)395279197 ^ (long)395279068) << 1), (int)((int)((long)-112490779 ^ (long)-112491034)), (int)((int)-659489005L ^ 0xD8B0FF13), (int)((int)-581567943L ^ 0xDD55FA38));
        GlStateManager.disableTexture2D();
        GlStateManager.depthMask(((int)-1097893098L ^ 0xBE8F7B16) != 0);
        GL11.glEnable((int)((int)((long)-1430405526 ^ (long)-1430405581) << 5));
        GL11.glHint((int)(((int)-367937633L ^ 0xEA11B1B6) << 1), (int)(((int)1539376500L ^ 0x5BC10DF5) << 1));
        GL11.glLineWidth((float)this.Field10454.Method368());
        GlStateManager.disableCull();
        GlStateManager.disableAlpha();
        GlStateManager.shadeModel((int)((int)1052122880L ^ 0x3EB60201));
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin((int)2061740050L ^ 0x7AE3A811, DefaultVertexFormats.POSITION_COLOR);
        Iterator iterator = this.Field10459.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                tessellator.draw();
                GlStateManager.enableCull();
                GlStateManager.enableAlpha();
                GlStateManager.shadeModel((int)((int)((long)1903667699 ^ (long)1903667694) << 8));
                GL11.glDisable((int)(((int)1808507879L ^ 0x6BCBA3BE) << 5));
                GlStateManager.depthMask((boolean)((long)-410367098 ^ (long)-410367097));
                GlStateManager.enableDepth();
                GlStateManager.enableTexture2D();
                GlStateManager.disableBlend();
                GlStateManager.popMatrix();
                this.Field10461 = sUpWi5Ijgr8bTcustW4Cv55QxqPkmgw1.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
                this.Field10462 = sUpWi5Ijgr8bTcustW4Cv55QxqPkmgw1.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
                this.Field10463 = sUpWi5Ijgr8bTcustW4Cv55QxqPkmgw1.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ;
                return;
            }
            AxisAlignedBB axisAlignedBB2 = (AxisAlignedBB)iterator.next();
            bufferBuilder.pos(axisAlignedBB2.minX, axisAlignedBB2.minY, axisAlignedBB2.minZ).color(n, n2, n3, n4).endVertex();
            bufferBuilder.pos(axisAlignedBB2.maxX, axisAlignedBB2.maxY, axisAlignedBB2.maxZ).color(n, n2, n3, n4).endVertex();
        }
    }

    private void Method2528(float f) {
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-731721452 ^ (long)-731721452);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-2084569613 ^ (long)-2084569844);
            int n2 = (int)((long)-1843532362 ^ (long)-1843532469);
            cArray2[n] = (char)(cArray[n] ^ (((int)-1762308259L ^ 0x96F56608) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

