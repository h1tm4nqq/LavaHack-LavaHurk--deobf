//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.entity.Entity
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import java.util.Comparator;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class nwPgxzToZOGMuXNNfdB7INmKX8QYDZ50
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private String Field12435 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public nwPgxzToZOGMuXNNfdB7INmKX8QYDZ50() {
        super("TracerTest", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    @Override
    public void Method38() {
        MinecraftForge.EVENT_BUS.register((Object)this);
    }

    @Override
    public void Method39() {
        MinecraftForge.EVENT_BUS.unregister((Object)this);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method4138(RenderGameOverlayEvent.Text text) {
        if (nwPgxzToZOGMuXNNfdB7INmKX8QYDZ50.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (nwPgxzToZOGMuXNNfdB7INmKX8QYDZ50.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        Entity entity = nwPgxzToZOGMuXNNfdB7INmKX8QYDZ50.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.stream().min(Comparator.comparingDouble(nwPgxzToZOGMuXNNfdB7INmKX8QYDZ50::Method4139)).orElse(null);
        if (entity == null) {
            return;
        }
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3433();
        GL11.glLineWidth((float)2.0f);
        GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin((int)-1240578102L ^ 0xB60E47C9, DefaultVertexFormats.POSITION);
        bufferBuilder.pos((double)Display.getWidth() / Double.longBitsToDouble((long)400857947 ^ 0x4000000017E49B5BL), (double)Display.getHeight() / Double.longBitsToDouble((long)1472864399 ^ 0x4000000057CA208FL), 0.0).endVertex();
        bufferBuilder.pos(entity.posX - nwPgxzToZOGMuXNNfdB7INmKX8QYDZ50.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosX, entity.posY - nwPgxzToZOGMuXNNfdB7INmKX8QYDZ50.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosY, entity.posZ - nwPgxzToZOGMuXNNfdB7INmKX8QYDZ50.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosZ);
        tessellator.draw();
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3434();
    }

    private static double Method4139(Entity entity) {
        return nwPgxzToZOGMuXNNfdB7INmKX8QYDZ50.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(entity);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)106210107L ^ 0x654A33B;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)143968151 ^ (long)143968104);
            int n2 = ((int)-635509359L ^ 0xDA1EE582) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1578822130 ^ (long)1578822079) << 7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

