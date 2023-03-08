//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import net.minecraft.entity.*;
import java.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.vertex.*;
import net.minecraft.client.renderer.*;
import net.minecraftforge.fml.common.eventhandler.*;

@Class1887
public class Class1125 extends Class42
{
    private String Field13076 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1125() {
        super("Tracers2", Class97.Field8342);
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method4585(final RenderWorldLastEvent renderWorldLastEvent) {
        if (Class1125.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1125.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        final Entity entity = (Entity)Class1125.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.entityList.stream().min(Class1125::Method4586).orElse(null);
        if (entity == Class1125.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player || entity == null) {
            return;
        }
        final double n = entity.posX - Class1125.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosX;
        final double n2 = entity.posY + entity.boundingBox.maxY / Double.longBitsToDouble(4611686018427387904L) - Class1125.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosY;
        final double n3 = entity.posZ - Class1125.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosZ;
        Class815.Method3433();
        final Tessellator getInstance = Tessellator.getInstance();
        final BufferBuilder getBuffer = getInstance.getBuffer();
        GL11.glLineWidth(Float.intBitsToFloat(1077936128));
        getBuffer.begin(3, DefaultVertexFormats.POSITION_COLOR);
        getBuffer.pos(0.0, 0.0, 0.0).color(255, 255, 255, 255).endVertex();
        getBuffer.pos(n, n2, n3).color(255, 255, 255, 255).endVertex();
        getInstance.draw();
        Class815.Method3434();
    }
    
    private static int Method4586(final Entity entity, final Entity entity2) {
        return Float.compare(Class1125.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(entity), Class1125.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(entity2));
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x61D9 ^ 0x89));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
