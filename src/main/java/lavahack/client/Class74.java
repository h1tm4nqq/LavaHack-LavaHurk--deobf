//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.entity.Entity
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult$Type
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class447;
import lavahack.client.Class452;
import lavahack.client.Class743;
import lavahack.client.Class97;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

@Deprecated
public class Class74
extends Class42 {
    private Class44 Field8244 = new Class44("Width", (Class42)this, 1.0, 0.0, Double.longBitsToDouble(0x4014000000000000L), false);
    private final Queue Field8245 = new ConcurrentLinkedQueue();
    private String Field8246 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class74() {
        super("Trajectories", "no salhack pasta!!!", Class97.Field8342);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field8244);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method661(RenderWorldLastEvent renderWorldLastEvent) {
        AxisAlignedBB axisAlignedBB;
        Vec3d vec3d;
        Vec3d vec3d2;
        Class452 class452 = this.Method662(Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        if (class452 == Class452.Field9882) {
            return;
        }
        Class743 class743 = new Class743(this, Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, class452);
        while (!class743.Method3076()) {
            class743.Method3068();
            this.Field8245.offer(new Vec3d(Class743.Method3078((Class743)class743).x - Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosX, Class743.Method3078((Class743)class743).y - Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosY, Class743.Method3078((Class743)class743).z - Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosZ));
        }
        boolean bl = Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.viewBobbing;
        Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.viewBobbing = false;
        Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.entityRenderer.setupCameraTransform(renderWorldLastEvent.getPartialTicks(), 0);
        GlStateManager.pushMatrix();
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
        GlStateManager.shadeModel((int)7425);
        GL11.glLineWidth((float)((float)this.Field8244.Method367()));
        GL11.glEnable((int)2848);
        GL11.glHint((int)3154, (int)4354);
        GlStateManager.disableDepth();
        GL11.glEnable((int)34383);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        while (!this.Field8245.isEmpty()) {
            bufferBuilder.begin(3, DefaultVertexFormats.POSITION_COLOR);
            vec3d2 = (Vec3d)this.Field8245.poll();
            bufferBuilder.pos(vec3d2.x, vec3d2.y, vec3d2.z).color(255, 255, 255, 150).endVertex();
            if (this.Field8245.peek() != null) {
                vec3d = (Vec3d)this.Field8245.peek();
                bufferBuilder.pos(vec3d.x, vec3d.y, vec3d.z).color(255, 255, 255, 150).endVertex();
            }
            tessellator.draw();
        }
        GlStateManager.shadeModel((int)7424);
        GL11.glDisable((int)2848);
        GlStateManager.enableDepth();
        GL11.glDisable((int)34383);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
        GlStateManager.popMatrix();
        Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.viewBobbing = bl;
        Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.entityRenderer.setupCameraTransform(renderWorldLastEvent.getPartialTicks(), 0);
        if (!Class743.Method3079(class743)) return;
        vec3d2 = Class743.Method3080(class743);
        vec3d = null;
        if (vec3d2 == null) {
            return;
        }
        if (vec3d2.typeOfHit == RayTraceResult.Type.BLOCK) {
            BlockPos blockPos = vec3d2.getBlockPos();
            IBlockState iBlockState = Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
            if (iBlockState.getMaterial() != Material.AIR && Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getWorldBorder().contains(blockPos)) {
                Vec3d vec3d3 = Class447.Method2104((Entity)Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderPartialTicks());
                vec3d = iBlockState.getSelectedBoundingBox((World)Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos).grow(Double.longBitsToDouble((long)600347992 ^ 0x3F60624DC3C89558L)).offset(-vec3d3.x, -vec3d3.y, -vec3d3.z);
            }
        } else if (vec3d2.typeOfHit == RayTraceResult.Type.ENTITY && vec3d2.entityHit != null && (axisAlignedBB = vec3d2.entityHit.getEntityBoundingBox()) != null) {
            vec3d = new AxisAlignedBB(axisAlignedBB.minX - Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosX, axisAlignedBB.minY - Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosY, axisAlignedBB.minZ - Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosZ, axisAlignedBB.maxX - Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosX, axisAlignedBB.maxY - Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosY, axisAlignedBB.maxZ - Class74.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosZ);
        }
        if (vec3d == null) return;
    }

    private Class452 Method662(EntityPlayerSP entityPlayerSP) {
        if (entityPlayerSP.getHeldItemMainhand() == null) {
            return Class452.Field9882;
        }
        ItemStack itemStack = entityPlayerSP.getHeldItem(EnumHand.MAIN_HAND);
        switch (Item.getIdFromItem((Item)itemStack.getItem())) {
            case 261: {
                if (!entityPlayerSP.isHandActive()) return Class452.Field9882;
                return Class452.Field9883;
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

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 170;
            cArray2[n] = (char)(cArray[n] ^ (0x78E6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

