//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import lavahack.client.Class1178;
import lavahack.client.Class815;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;

public class Class1415 {
    private String Field14422 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method5584(BlockPos blockPos, String string, int n) {
        if (blockPos == null) return;
        if (string == null) {
            return;
        }
        GlStateManager.pushMatrix();
        Class1415.Method5585((float)blockPos.getX() + Float.intBitsToFloat(0x3F000000), (float)blockPos.getY() + Float.intBitsToFloat(0x3F000000), (float)blockPos.getZ() + Float.intBitsToFloat(0x3F000000), (EntityPlayer)Class815.Method3467().player, 1.0f);
        GlStateManager.disableDepth();
        GlStateManager.translate((double)(-((double)Class1178.Method4741(string) / Double.longBitsToDouble((long)1333208118 ^ 0x400000004F772436L))), (double)0.0, (double)0.0);
        Class1178.Method4745(string, 0.0, 0.0, n);
        GlStateManager.popMatrix();
    }

    public static void Method5585(float f, float f2, float f3, EntityPlayer entityPlayer, float f4) {
        Class1415.Method5586(f, f2, f3);
        int n = (int)entityPlayer.getDistance((double)f, (double)f2, (double)f3);
        float f5 = (float)n / 2.0f / (2.0f + (2.0f - f4));
        if (f5 < 1.0f) {
            f5 = 1.0f;
        }
        GlStateManager.scale((float)f5, (float)f5, (float)f5);
    }

    public static void Method5586(float f, float f2, float f3) {
        float f4 = Float.intBitsToFloat(1020949519);
        GlStateManager.translate((double)((double)f - Class815.Method3467().getRenderManager().renderViewEntity.posX), (double)((double)f2 - Class815.Method3467().getRenderManager().renderViewEntity.posY), (double)((double)f3 - Class815.Method3467().getRenderManager().renderViewEntity.posZ));
        GlStateManager.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.rotate((float)(-Class815.Method3467().player.rotationYaw), (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.rotate((float)Class815.Method3467().player.rotationPitch, (float)(Class815.Method3467().gameSettings.thirdPersonView == 2 ? Float.intBitsToFloat(-1082130432) : 1.0f), (float)0.0f, (float)0.0f);
        GlStateManager.scale((float)(-f4), (float)(-f4), (float)f4);
    }
}

