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

import com.kisman.cc.util.Class2027;
import com.kisman.cc.util.Class650;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import lavahack.client.Class1887;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

@Class1887
public class Class576
extends Class42 {
    private final Class44 Field10453 = this.Method23(new Class44("Smooth", (Class42)this, false));
    private final Class44 Field10454 = this.Method23(new Class44("LineWidth", (Class42)this, 1.0, Double.longBitsToDouble((long)218735739 ^ 0x3FE000000D09A47BL), Double.longBitsToDouble((long)848115244 ^ 0x40140000328D362CL), false));
    private final Class44 Field10455 = this.Method23(new Class44("FadeOut", (Class42)this, false));
    private final Class44 Field10456 = this.Method23(new Class44("FadeAfterTicks", (Class42)this, Double.longBitsToDouble(4636737291354636288L), 1.0, Double.longBitsToDouble((long)900657753 ^ 0x4079000035AEF259L), true).Method313(this.Field10455::Method311));
    private final Class44 Field10457 = this.Method23(new Class44("FadeOutTicks", (Class42)this, Double.longBitsToDouble((long)1468904361 ^ 0x40240000578DB3A9L), 1.0, Double.longBitsToDouble(0x4034000000000000L), true));
    private final Class44 Field10458 = this.Method23(new Class44("Color", (Class42)this, new Class2027(255, 255, 255, 255)));
    private final Queue Field10459 = new ConcurrentLinkedQueue();
    private final Class650 Field10460 = new Class650();
    private double Field10461 = 0.0;
    private double Field10462 = 0.0;
    private double Field10463 = 0.0;
    private String Field10464 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class576() {
        super("Breadcrumbs", Class97.Field8342);
    }

    @Override
    public void Method45() {
        if (Class576.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null) {
            if (Class576.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) return;
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
        if (!this.Field10460.Method2797(50L)) {
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
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(this.Field10461, this.Field10462, this.Field10463, Class576.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class576.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class576.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        this.Field10459.offer(axisAlignedBB);
        int n = this.Field10458.Method339().Method3634();
        int n2 = this.Field10458.Method339().Method3636();
        int n3 = this.Field10458.Method339().Method3635();
        int n4 = this.Field10458.Method339().Method3631();
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableDepth();
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)0, (int)1);
        GlStateManager.disableTexture2D();
        GlStateManager.depthMask((boolean)false);
        GL11.glEnable((int)2848);
        GL11.glHint((int)3154, (int)4354);
        GL11.glLineWidth((float)this.Field10454.Method368());
        GlStateManager.disableCull();
        GlStateManager.disableAlpha();
        GlStateManager.shadeModel((int)7425);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin(3, DefaultVertexFormats.POSITION_COLOR);
        Iterator iterator = this.Field10459.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                tessellator.draw();
                GlStateManager.enableCull();
                GlStateManager.enableAlpha();
                GlStateManager.shadeModel((int)7424);
                GL11.glDisable((int)2848);
                GlStateManager.depthMask((boolean)true);
                GlStateManager.enableDepth();
                GlStateManager.enableTexture2D();
                GlStateManager.disableBlend();
                GlStateManager.popMatrix();
                this.Field10461 = Class576.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
                this.Field10462 = Class576.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
                this.Field10463 = Class576.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ;
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 253;
            cArray2[n] = (char)(cArray[n] ^ (0x52AA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

