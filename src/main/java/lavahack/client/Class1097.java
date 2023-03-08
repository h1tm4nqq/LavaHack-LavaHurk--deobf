//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.client.event.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.vertex.*;
import net.minecraft.client.renderer.*;

public class Class1097 extends Class42
{
    private final Class44 Field12942;
    private final Class44 Field12943;
    private final int Field12944;
    private final int Field12945;
    private final int Field12946;
    private int Field12947;
    private boolean Field12948;
    private long Field12949;
    private int Field12950;
    
    public Class1097() {
        super("RectTest", Class97.Field8345);
        this.Field12942 = this.Method23(new Class44("Mode", this, Class1681.Field15821));
        this.Field12943 = this.Method23(new Class44("Speed", this, Double.longBitsToDouble((long)1687986154 ^ 0x40340000649C9FEAL), 1.0, Double.longBitsToDouble(4636737291354636288L), true));
        this.Field12944 = Display.getWidth() - 30;
        this.Field12945 = Display.getHeight() - 30;
        this.Field12946 = Display.getWidth() - 300;
        this.Field12947 = Display.getHeight() - 300;
        this.Field12948 = false;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method4493(final PlayerInteractEvent$LeftClickBlock playerInteractEvent$LeftClickBlock) {
        if (Class1097.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1097.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        this.Field12947 -= 200;
        this.Field12949 = System.currentTimeMillis();
        this.Field12948 = true;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method4494(final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        if (Class1097.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1097.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        final Tessellator getInstance = Tessellator.getInstance();
        final BufferBuilder getBuffer = getInstance.getBuffer();
        Class815.Method3433();
        final boolean glIsEnabled = GL11.glIsEnabled(3089);
        GL11.glEnable(3089);
        this.Method20();
        GlStateManager.color(1.0f, 1.0f, 1.0f, Float.intBitsToFloat(1056964608));
        getBuffer.begin(7, DefaultVertexFormats.POSITION);
        getBuffer.pos((double)this.Field12946, (double)this.Field12947, 0.0);
        getBuffer.pos((double)this.Field12944, (double)this.Field12947, 0.0);
        getBuffer.pos((double)this.Field12944, (double)this.Field12945, 0.0);
        getBuffer.pos((double)this.Field12946, (double)this.Field12945, 0.0);
        getInstance.draw();
        if (!glIsEnabled) {
            GL11.glDisable(3089);
        }
        Class815.Method3434();
    }
    
    private void Method20() {
        if (!this.Field12948) {
            return;
        }
        final double n = (System.currentTimeMillis() - this.Field12949) / (this.Field12943.Method335() * Double.longBitsToDouble((long)1574792704 ^ 0x404900005DDD6E00L));
        if (n > 1.0) {
            this.Field12948 = false;
            return;
        }
        Class1893.Method7009(this.Field12944, this.Field12945, this.Field12946, (int)(this.Field12947 + Double.longBitsToDouble(4641240890982006784L) - n * Double.longBitsToDouble((long)1760736439 ^ 0x4069000068F2B4B7L)));
    }
    
    private double Method4495(final double n) {
        switch (Class925.Field11922[((Class1681)this.Field12942.Method341()).ordinal()]) {
            case 1: {
                return Class447.Method2140(n);
            }
            case 2: {
                return Math.sin(n * Double.longBitsToDouble(4609753056924675352L));
            }
            default: {
                return n;
            }
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xE10 ^ 0x1A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
