//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.util.concurrent.*;
import net.minecraftforge.client.event.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.vertex.*;
import net.minecraft.block.material.*;
import net.minecraft.entity.*;
import net.minecraft.world.*;
import net.minecraft.client.renderer.*;
import net.minecraft.util.math.*;
import net.minecraft.block.state.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.client.entity.*;
import net.minecraft.util.*;
import net.minecraft.item.*;

@Deprecated
public class Class74 extends Class42
{
    private Class44 Field8244;
    private final Queue Field8245;
    private String Field8246 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class74() {
        super("Trajectories", "no salhack pasta!!!", Class97.Field8342);
        this.Field8244 = new Class44("Width", (Class42)this, 1.0, 0.0, Double.longBitsToDouble(4617315517961601024L), false);
        this.Field8245 = new ConcurrentLinkedQueue();
        Class74.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field8244);
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method661(final RenderWorldLastEvent renderWorldLastEvent) {
        final Class452 method662 = this.Method662(Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        if (method662 == Class452.Field9882) {
            return;
        }
        final Class743 class743 = new Class743(this, Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, method662);
        while (!class743.Method3076()) {
            class743.Method3068();
            this.Field8245.offer(new Vec3d(Class743.Method3078(class743).x - Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosX, Class743.Method3078(class743).y - Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosY, Class743.Method3078(class743).z - Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosZ));
        }
        final boolean viewBobbing = Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.viewBobbing;
        Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.viewBobbing = false;
        Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.entityRenderer.setupCameraTransform(renderWorldLastEvent.getPartialTicks(), 0);
        GlStateManager.pushMatrix();
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
        GlStateManager.shadeModel(7425);
        GL11.glLineWidth((float)this.Field8244.Method367());
        GL11.glEnable(2848);
        GL11.glHint(3154, 4354);
        GlStateManager.disableDepth();
        GL11.glEnable(34383);
        final Tessellator getInstance = Tessellator.getInstance();
        final BufferBuilder getBuffer = getInstance.getBuffer();
        while (!this.Field8245.isEmpty()) {
            getBuffer.begin(3, DefaultVertexFormats.POSITION_COLOR);
            final Vec3d vec3d = this.Field8245.poll();
            getBuffer.pos(vec3d.x, vec3d.y, vec3d.z).color(255, 255, 255, 150).endVertex();
            if (this.Field8245.peek() != null) {
                final Vec3d vec3d2 = this.Field8245.peek();
                getBuffer.pos(vec3d2.x, vec3d2.y, vec3d2.z).color(255, 255, 255, 150).endVertex();
            }
            getInstance.draw();
        }
        GlStateManager.shadeModel(7424);
        GL11.glDisable(2848);
        GlStateManager.enableDepth();
        GL11.glDisable(34383);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
        GlStateManager.popMatrix();
        Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.viewBobbing = viewBobbing;
        Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.entityRenderer.setupCameraTransform(renderWorldLastEvent.getPartialTicks(), 0);
        if (Class743.Method3079(class743)) {
            final RayTraceResult method663 = Class743.Method3080(class743);
            AxisAlignedBB offset = null;
            if (method663 == null) {
                return;
            }
            if (method663.typeOfHit == RayTraceResult$Type.BLOCK) {
                final BlockPos getBlockPos = method663.getBlockPos();
                final IBlockState getBlockState = Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(getBlockPos);
                if (getBlockState.getMaterial() != Material.AIR && Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getWorldBorder().contains(getBlockPos)) {
                    final Vec3d method664 = Class447.Method2104((Entity)Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderPartialTicks());
                    offset = getBlockState.getSelectedBoundingBox((World)Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, getBlockPos).grow(Double.longBitsToDouble((long)600347992 ^ 0x3F60624DC3C89558L)).offset(-method664.x, -method664.y, -method664.z);
                }
            }
            else if (method663.typeOfHit == RayTraceResult$Type.ENTITY && method663.entityHit != null) {
                final AxisAlignedBB getEntityBoundingBox = method663.entityHit.getEntityBoundingBox();
                if (getEntityBoundingBox != null) {
                    offset = new AxisAlignedBB(getEntityBoundingBox.minX - Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosX, getEntityBoundingBox.minY - Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosY, getEntityBoundingBox.minZ - Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosZ, getEntityBoundingBox.maxX - Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosX, getEntityBoundingBox.maxY - Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosY, getEntityBoundingBox.maxZ - Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosZ);
                }
            }
            if (offset != null) {}
        }
    }
    
    private Class452 Method662(final EntityPlayerSP entityPlayerSP) {
        if (entityPlayerSP.getHeldItemMainhand() == null) {
            return Class452.Field9882;
        }
        switch (Item.getIdFromItem(entityPlayerSP.getHeldItem(EnumHand.MAIN_HAND).getItem())) {
            case 261: {
                if (entityPlayerSP.isHandActive()) {
                    return Class452.Field9883;
                }
                break;
            }
            case 346: {
                return Class452.Field9886;
            }
            case 438:
            case 441: {
                return Class452.Field9884;
            }
            case 384: {
                return Class452.Field9885;
            }
            case 332:
            case 344:
            case 368: {
                return Class452.Field9887;
            }
        }
        return Class452.Field9882;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x78E6 ^ 0xAA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
