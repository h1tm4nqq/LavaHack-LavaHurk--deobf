//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.common.*;
import net.minecraftforge.client.event.*;
import net.minecraft.entity.*;
import java.util.*;
import java.util.function.*;
import net.minecraft.client.renderer.vertex.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class1021 extends Class42
{
    private String Field12435 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1021() {
        super("TracerTest", Class97.Field8345);
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
    public void Method4138(final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        if (Class1021.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1021.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        final Entity entity = (Entity)Class1021.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.stream().min(Comparator.comparingDouble((ToDoubleFunction<? super T>)Class1021::Method4139)).orElse(null);
        if (entity == null) {
            return;
        }
        Class815.Method3433();
        GL11.glLineWidth(2.0f);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        final Tessellator getInstance = Tessellator.getInstance();
        final BufferBuilder getBuffer = getInstance.getBuffer();
        getBuffer.begin(3, DefaultVertexFormats.POSITION);
        getBuffer.pos(Display.getWidth() / Double.longBitsToDouble((long)400857947 ^ 0x4000000017E49B5BL), Display.getHeight() / Double.longBitsToDouble((long)1472864399 ^ 0x4000000057CA208FL), 0.0).endVertex();
        getBuffer.pos(entity.posX - Class1021.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosX, entity.posY - Class1021.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosY, entity.posZ - Class1021.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosZ);
        getInstance.draw();
        Class815.Method3434();
    }
    
    private static double Method4139(final Entity entity) {
        return Class1021.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(entity);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2680 ^ 0x4C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
