//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import com.kisman.cc.util.*;
import java.util.concurrent.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.util.math.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.vertex.*;
import net.minecraft.client.renderer.*;
import java.util.*;

@Class1887
public class Class576 extends Class42
{
    private final Class44 Field10453;
    private final Class44 Field10454;
    private final Class44 Field10455;
    private final Class44 Field10456;
    private final Class44 Field10457;
    private final Class44 Field10458;
    private final Queue Field10459;
    private final Class650 Field10460;
    private double Field10461;
    private double Field10462;
    private double Field10463;
    private String Field10464 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class576() {
        super("Breadcrumbs", Class97.Field8342);
        this.Field10453 = this.Method23(new Class44("Smooth", (Class42)this, false));
        this.Field10454 = this.Method23(new Class44("LineWidth", (Class42)this, 1.0, Double.longBitsToDouble((long)218735739 ^ 0x3FE000000D09A47BL), Double.longBitsToDouble((long)848115244 ^ 0x40140000328D362CL), false));
        this.Field10455 = this.Method23(new Class44("FadeOut", (Class42)this, false));
        this.Field10456 = this.Method23(new Class44("FadeAfterTicks", (Class42)this, Double.longBitsToDouble(4636737291354636288L), 1.0, Double.longBitsToDouble((long)900657753 ^ 0x4079000035AEF259L), true).Method313((Supplier)this.Field10455::Method311));
        this.Field10457 = this.Method23(new Class44("FadeOutTicks", (Class42)this, Double.longBitsToDouble((long)1468904361 ^ 0x40240000578DB3A9L), 1.0, Double.longBitsToDouble(4626322717216342016L), true));
        this.Field10458 = this.Method23(new Class44("Color", (Class42)this, new Class2027(255, 255, 255, 255)));
        this.Field10459 = new ConcurrentLinkedQueue();
        this.Field10460 = new Class650();
        this.Field10461 = 0.0;
        this.Field10462 = 0.0;
        this.Field10463 = 0.0;
    }
    
    public void Method45() {
        if (Class576.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class576.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Field10460.Method2801();
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method2527(final RenderWorldLastEvent renderWorldLastEvent) {
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
    
    public void Method38() {
        super.Method38();
        this.Field10460.Method2801();
    }
    
    private void Method20() {
        this.Field10459.offer(new AxisAlignedBB(this.Field10461, this.Field10462, this.Field10463, Class576.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class576.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class576.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ));
        final int method3634 = this.Field10458.Method339().Method3634();
        final int method3635 = this.Field10458.Method339().Method3636();
        final int method3636 = this.Field10458.Method339().Method3635();
        final int method3637 = this.Field10458.Method339().Method3631();
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableDepth();
        GlStateManager.tryBlendFuncSeparate(770, 771, 0, 1);
        GlStateManager.disableTexture2D();
        GlStateManager.depthMask(false);
        GL11.glEnable(2848);
        GL11.glHint(3154, 4354);
        GL11.glLineWidth(this.Field10454.Method368());
        GlStateManager.disableCull();
        GlStateManager.disableAlpha();
        GlStateManager.shadeModel(7425);
        final Tessellator getInstance = Tessellator.getInstance();
        final BufferBuilder getBuffer = getInstance.getBuffer();
        getBuffer.begin(3, DefaultVertexFormats.POSITION_COLOR);
        for (final AxisAlignedBB axisAlignedBB : this.Field10459) {
            getBuffer.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).color(method3634, method3635, method3636, method3637).endVertex();
            getBuffer.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).color(method3634, method3635, method3636, method3637).endVertex();
        }
        getInstance.draw();
        GlStateManager.enableCull();
        GlStateManager.enableAlpha();
        GlStateManager.shadeModel(7424);
        GL11.glDisable(2848);
        GlStateManager.depthMask(true);
        GlStateManager.enableDepth();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
        this.Field10461 = Class576.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
        this.Field10462 = Class576.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
        this.Field10463 = Class576.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ;
    }
    
    private void Method2528(final float n) {
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x52AA ^ 0xFD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
