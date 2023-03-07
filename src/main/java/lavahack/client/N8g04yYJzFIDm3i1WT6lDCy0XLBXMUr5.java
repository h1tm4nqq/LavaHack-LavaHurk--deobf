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

import lavahack.client.N8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5$1;
import lavahack.client.N8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.XOu74v224lqSTQs7rEivUfpfdaXI1IJR;
import lavahack.client.dHW1jZK49fXgBu9AY91BXDMHsTGGza8u;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class N8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12942 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, N8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field15821));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12943 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1687986154 ^ 0x40340000649C9FEAL), 1.0, Double.longBitsToDouble(0xB63258099FF67812L ^ 0xF66B58099FF67812L), ((int)-1266296049L ^ 0xB485DB0E) != 0));
    private final int Field12944 = Display.getWidth() - ((int)((long)1999490176 ^ (long)1999490191) << 1);
    private final int Field12945 = Display.getHeight() - ((int)((long)472648460 ^ (long)472648451) << 1);
    private final int Field12946 = Display.getWidth() - (((int)440949238L ^ 0x1A4859BD) << 2);
    private int Field12947 = Display.getHeight() - (((int)-451315216L ^ 0xE51979BB) << 2);
    private boolean Field12948 = (int)-1751756228L ^ 0x9796523C;
    private long Field12949;
    private int Field12950;

    public N8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5() {
        super("RectTest", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method4493(PlayerInteractEvent.LeftClickBlock leftClickBlock) {
        if (N8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (N8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        this.Field12947 -= ((int)-1652108752L ^ 0x9D86D229) << 3;
        this.Field12949 = System.currentTimeMillis();
        this.Field12948 = (int)1117084152L ^ 0x429559F9;
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method4494(RenderGameOverlayEvent.Text text) {
        if (N8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (N8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3433();
        boolean bl = GL11.glIsEnabled((int)((int)-225399780L ^ 0xF290A00D));
        GL11.glEnable((int)((int)((long)235913777 ^ (long)235916832)));
        this.Method20();
        GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)Float.intBitsToFloat((int)((long)1412023249 ^ (long)1797899217)));
        bufferBuilder.begin((int)((long)-593340885 ^ (long)-593340884), DefaultVertexFormats.POSITION);
        bufferBuilder.pos((double)this.Field12946, (double)this.Field12947, 0.0);
        bufferBuilder.pos((double)this.Field12944, (double)this.Field12947, 0.0);
        bufferBuilder.pos((double)this.Field12944, (double)this.Field12945, 0.0);
        bufferBuilder.pos((double)this.Field12946, (double)this.Field12945, 0.0);
        tessellator.draw();
        if (!bl) {
            GL11.glDisable((int)((int)((long)1070367685 ^ (long)1070370772)));
        }
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3434();
    }

    private void Method20() {
        if (!this.Field12948) {
            return;
        }
        double d = System.currentTimeMillis() - this.Field12949;
        double d2 = d / ((double)this.Field12943.Method335() * Double.longBitsToDouble((long)1574792704 ^ 0x404900005DDD6E00L));
        if (d2 > 1.0) {
            this.Field12948 = (int)-1328211506L ^ 0xB0D519CE;
            return;
        }
        XOu74v224lqSTQs7rEivUfpfdaXI1IJR.Method7009(this.Field12944, this.Field12945, this.Field12946, (int)((double)this.Field12947 + Double.longBitsToDouble(0xAAD4325D8B8E6F1EL ^ 0xEABD325D8B8E6F1EL) - d2 * Double.longBitsToDouble((long)1760736439 ^ 0x4069000068F2B4B7L)));
    }

    private double Method4495(double d) {
        switch (N8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5$1.Field11922[((N8g04yYJzFIDm3i1WT6lDCy0XLBXMUr5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field12942.Method341()).ordinal()]) {
            case 1: {
                return dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2140(d);
            }
            case 2: {
                return Math.sin(d * Double.longBitsToDouble(0x1562A48D1593AD0AL ^ 0x2A9B857641D78012L));
            }
        }
        return d;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)843874504 ^ (long)843874504);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-545098002 ^ (long)-545098223);
            int n2 = (int)((long)941712357 ^ (long)941712360) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1668081227 ^ (long)-1668081324) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

