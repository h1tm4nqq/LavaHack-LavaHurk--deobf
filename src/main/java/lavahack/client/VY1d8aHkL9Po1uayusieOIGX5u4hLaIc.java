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

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

@YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz
public class VY1d8aHkL9Po1uayusieOIGX5u4hLaIc
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private String Field13076 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public VY1d8aHkL9Po1uayusieOIGX5u4hLaIc() {
        super("Tracers2", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method4585(RenderWorldLastEvent renderWorldLastEvent) {
        if (VY1d8aHkL9Po1uayusieOIGX5u4hLaIc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (VY1d8aHkL9Po1uayusieOIGX5u4hLaIc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        Entity entity = VY1d8aHkL9Po1uayusieOIGX5u4hLaIc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.entityList.stream().min(VY1d8aHkL9Po1uayusieOIGX5u4hLaIc::Method4586).orElse(null);
        if (entity == VY1d8aHkL9Po1uayusieOIGX5u4hLaIc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) return;
        if (entity == null) {
            return;
        }
        double d = entity.posX - VY1d8aHkL9Po1uayusieOIGX5u4hLaIc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosX;
        double d2 = entity.posY + entity.boundingBox.maxY / Double.longBitsToDouble(0x4ED19245F420B43FL ^ 0xED19245F420B43FL) - VY1d8aHkL9Po1uayusieOIGX5u4hLaIc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosY;
        double d3 = entity.posZ - VY1d8aHkL9Po1uayusieOIGX5u4hLaIc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosZ;
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3433();
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        GL11.glLineWidth((float)Float.intBitsToFloat((int)1635059238L ^ 0x21350626));
        bufferBuilder.begin((int)((long)-1558130622 ^ (long)-1558130623), DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.pos(0.0, 0.0, 0.0).color((int)1641061349L ^ 0x61D09B1A, (int)2111179441L ^ 0x7DD60A4E, (int)312946900L ^ 0x12A7302B, (int)-1385619353L ^ 0xAD692098).endVertex();
        bufferBuilder.pos(d, d2, d3).color((int)909502655L ^ 0x3635E840, (int)((long)2024344215 ^ (long)2024344168), (int)((long)-26934732 ^ (long)-26934581), (int)-200295261L ^ 0xF40FBC5C).endVertex();
        tessellator.draw();
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3434();
    }

    private static int Method4586(Entity entity, Entity entity2) {
        return Float.compare(VY1d8aHkL9Po1uayusieOIGX5u4hLaIc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(entity), VY1d8aHkL9Po1uayusieOIGX5u4hLaIc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(entity2));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1135669758 ^ (long)1135669758);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-43579514L ^ 0xFD670779);
            int n2 = (int)((long)-1170560870 ^ (long)-1170561005);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-15453095 ^ (long)-15444608) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

