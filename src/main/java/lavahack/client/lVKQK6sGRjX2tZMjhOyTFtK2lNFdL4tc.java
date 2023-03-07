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
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.dHW1jZK49fXgBu9AY91BXDMHsTGGza8u;
import lavahack.client.lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
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
public class lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8244 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Width", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble(0x752A7D1DADC61813L ^ 0x353E7D1DADC61813L), ((int)-145755763L ^ 0xF74FF18D) != 0);
    private final Queue Field8245 = new ConcurrentLinkedQueue();
    private String Field8246 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc() {
        super("Trajectories", "no salhack pasta!!!", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field8244);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method661(RenderWorldLastEvent renderWorldLastEvent) {
        AxisAlignedBB axisAlignedBB;
        Vec3d vec3d;
        Vec3d vec3d2;
        lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = this.Method662(lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        if (lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf == lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9882) {
            return;
        }
        lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = new lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this, lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        while (!lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method3076()) {
            lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method3068();
            this.Field8245.offer(new Vec3d(lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method3078((lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi).x - lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosX, lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method3078((lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi).y - lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosY, lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method3078((lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi).z - lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosZ));
        }
        boolean bl = lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.viewBobbing;
        lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.viewBobbing = (int)-2126329339L ^ 0x8142CA05;
        lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.entityRenderer.setupCameraTransform(renderWorldLastEvent.getPartialTicks(), (int)-745426472L ^ 0xD391B1D8);
        GlStateManager.pushMatrix();
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.tryBlendFuncSeparate((int)(((int)469592765L ^ 0x1BFD6B3C) << 1), (int)((int)-572246576L ^ 0xDDE436D3), (int)((int)((long)1225071649 ^ (long)1225071648)), (int)((int)((long)145748390 ^ (long)145748390)));
        GlStateManager.shadeModel((int)((int)-1554831081L ^ 0xA3533416));
        GL11.glLineWidth((float)((float)this.Field8244.Method367()));
        GL11.glEnable((int)((int)((long)-243246233 ^ (long)-243246274) << 5));
        GL11.glHint((int)((int)((long)-579720411 ^ (long)-579719924) << 1), (int)((int)((long)1685967364 ^ (long)1685969541) << 1));
        GlStateManager.disableDepth();
        GL11.glEnable((int)((int)((long)-785303380 ^ (long)-785269021)));
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        while (!this.Field8245.isEmpty()) {
            bufferBuilder.begin((int)-235011812L ^ 0xF1FE011F, DefaultVertexFormats.POSITION_COLOR);
            vec3d2 = (Vec3d)this.Field8245.poll();
            bufferBuilder.pos(vec3d2.x, vec3d2.y, vec3d2.z).color((int)((long)-1520439735 ^ (long)-1520439626), (int)958358877L ^ 0x391F65A2, (int)((long)-303788529 ^ (long)-303788304), (int)((long)-621177365 ^ (long)-621177440) << 1).endVertex();
            if (this.Field8245.peek() != null) {
                vec3d = (Vec3d)this.Field8245.peek();
                bufferBuilder.pos(vec3d.x, vec3d.y, vec3d.z).color((int)-230739953L ^ 0xF23F30F0, (int)2128355413L ^ 0x7EDC20AA, (int)((long)2068172456 ^ (long)2068172375), (int)((long)-2108088813 ^ (long)-2108088744) << 1).endVertex();
            }
            tessellator.draw();
        }
        GlStateManager.shadeModel((int)((int)((long)-646982417 ^ (long)-646982414) << 8));
        GL11.glDisable((int)(((int)-2066935611L ^ 0x84CD109C) << 5));
        GlStateManager.enableDepth();
        GL11.glDisable((int)((int)223278256L ^ 0xD4E72FF));
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
        GlStateManager.popMatrix();
        lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.viewBobbing = bl;
        lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.entityRenderer.setupCameraTransform(renderWorldLastEvent.getPartialTicks(), (int)1542486522L ^ 0x5BF079FA);
        if (!lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method3079(lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)) return;
        vec3d2 = lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method3080(lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
        vec3d = null;
        if (vec3d2 == null) {
            return;
        }
        if (vec3d2.typeOfHit == RayTraceResult.Type.BLOCK) {
            BlockPos blockPos = vec3d2.getBlockPos();
            IBlockState iBlockState = lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
            if (iBlockState.getMaterial() != Material.AIR && lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getWorldBorder().contains(blockPos)) {
                Vec3d vec3d3 = dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2104((Entity)lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderPartialTicks());
                vec3d = iBlockState.getSelectedBoundingBox((World)lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos).grow(Double.longBitsToDouble((long)600347992 ^ 0x3F60624DC3C89558L)).offset(-vec3d3.x, -vec3d3.y, -vec3d3.z);
            }
        } else if (vec3d2.typeOfHit == RayTraceResult.Type.ENTITY && vec3d2.entityHit != null && (axisAlignedBB = vec3d2.entityHit.getEntityBoundingBox()) != null) {
            vec3d = new AxisAlignedBB(axisAlignedBB.minX - lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosX, axisAlignedBB.minY - lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosY, axisAlignedBB.minZ - lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosZ, axisAlignedBB.maxX - lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosX, axisAlignedBB.maxY - lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosY, axisAlignedBB.maxZ - lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosZ);
        }
        if (vec3d == null) return;
    }

    private lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Method662(EntityPlayerSP entityPlayerSP) {
        if (entityPlayerSP.getHeldItemMainhand() == null) {
            return lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9882;
        }
        ItemStack itemStack = entityPlayerSP.getHeldItem(EnumHand.MAIN_HAND);
        switch (Item.getIdFromItem((Item)itemStack.getItem())) {
            case 261: {
                if (!entityPlayerSP.isHandActive()) return lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9882;
                return lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9883;
            }
            case 346: {
                return lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9886;
            }
            case 438: 
            case 441: {
                return lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9884;
            }
            case 384: {
                return lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9885;
            }
            case 332: 
            case 344: 
            case 368: {
                return lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9887;
            }
        }
        return lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9882;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1502234935 ^ (long)-1502234935);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)487980169 ^ (long)487980150);
            int n2 = ((int)-1184884651L ^ 0xB9601800) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)766761831L ^ 0x2DB3E714) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

