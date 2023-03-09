//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$LeftClickBlock
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import lavahack.client.Class1681;
import lavahack.client.Class1893;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class447;
import lavahack.client.Class815;
import lavahack.client.Class925;
import lavahack.client.Class97;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class Class1097
extends Class42 {
    private final Class44 Field12942 = this.Method23(new Class44("Mode", (Class42)this, Class1681.Field15821));
    private final Class44 Field12943 = this.Method23(new Class44("Speed", (Class42)this, Double.longBitsToDouble((long)1687986154 ^ 0x40340000649C9FEAL), 1.0, Double.longBitsToDouble(4636737291354636288L), true));
    private final int Field12944 = Display.getWidth() - 30;
    private final int Field12945 = Display.getHeight() - 30;
    private final int Field12946 = Display.getWidth() - 300;
    private int Field12947 = Display.getHeight() - 300;
    private boolean Field12948 = false;
    private long Field12949;
    private int Field12950;

    public Class1097() {
        super("RectTest", Class97.Field8345);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method4493(PlayerInteractEvent.LeftClickBlock leftClickBlock) {
        if (Class1097.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1097.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
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
    public void Method4494(RenderGameOverlayEvent.Text text) {
        if (Class1097.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1097.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        Class815.Method3433();
        boolean bl = GL11.glIsEnabled((int)3089);
        GL11.glEnable((int)3089);
        this.Method20();
        GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)Float.intBitsToFloat(0x3F000000));
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION);
        bufferBuilder.pos((double)this.Field12946, (double)this.Field12947, 0.0);
        bufferBuilder.pos((double)this.Field12944, (double)this.Field12947, 0.0);
        bufferBuilder.pos((double)this.Field12944, (double)this.Field12945, 0.0);
        bufferBuilder.pos((double)this.Field12946, (double)this.Field12945, 0.0);
        tessellator.draw();
        if (!bl) {
            GL11.glDisable((int)3089);
        }
        Class815.Method3434();
    }

    private void Method20() {
        if (!this.Field12948) {
            return;
        }
        double d = System.currentTimeMillis() - this.Field12949;
        double d2 = d / ((double)this.Field12943.Method335() * Double.longBitsToDouble((long)1574792704 ^ 0x404900005DDD6E00L));
        if (d2 > 1.0) {
            this.Field12948 = false;
            return;
        }
        Class1893.Method7009(this.Field12944, this.Field12945, this.Field12946, (int)((double)this.Field12947 + Double.longBitsToDouble(4641240890982006784L) - d2 * Double.longBitsToDouble((long)1760736439 ^ 0x4069000068F2B4B7L)));
    }

    private double Method4495(double d) {
        switch (Class925.Field11922[((Class1681)this.Field12942.Method341()).ordinal()]) {
            case 1: {
                return Class447.Method2140(d);
            }
            case 2: {
                return Math.sin(d * Double.longBitsToDouble(4609753056924675352L));
            }
        }
        return d;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 26;
            cArray2[n] = (char)(cArray[n] ^ (0xE10 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

