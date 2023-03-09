//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.entity.Entity
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import lavahack.client.Class1887;
import lavahack.client.Class42;
import lavahack.client.Class815;
import lavahack.client.Class97;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

@Class1887
public class Class1125
extends Class42 {
    private String Field13076 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1125() {
        super("Tracers2", Class97.Field8342);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method4585(RenderWorldLastEvent renderWorldLastEvent) {
        if (Class1125.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1125.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        Entity entity = Class1125.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.entityList.stream().min(Class1125::Method4586).orElse(null);
        if (entity == Class1125.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) return;
        if (entity == null) {
            return;
        }
        double d = entity.posX - Class1125.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosX;
        double d2 = entity.posY + entity.boundingBox.maxY / Double.longBitsToDouble(0x4000000000000000L) - Class1125.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosY;
        double d3 = entity.posZ - Class1125.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosZ;
        Class815.Method3433();
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        GL11.glLineWidth((float)Float.intBitsToFloat(0x40400000));
        bufferBuilder.begin(3, DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.pos(0.0, 0.0, 0.0).color(255, 255, 255, 255).endVertex();
        bufferBuilder.pos(d, d2, d3).color(255, 255, 255, 255).endVertex();
        tessellator.draw();
        Class815.Method3434();
    }

    private static int Method4586(Entity entity, Entity entity2) {
        return Float.compare(Class1125.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(entity), Class1125.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(entity2));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 137;
            cArray2[n] = (char)(cArray[n] ^ (0x61D9 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

