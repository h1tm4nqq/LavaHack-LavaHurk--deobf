//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import net.minecraft.client.renderer.*;
import net.minecraft.entity.player.*;

public class Class1415
{
    private String Field14422 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static void Method5584(final BlockPos blockPos, final String s, final int n) {
        if (blockPos == null || s == null) {
            return;
        }
        GlStateManager.pushMatrix();
        Method5585(blockPos.getX() + Float.intBitsToFloat(1056964608), blockPos.getY() + Float.intBitsToFloat(1056964608), blockPos.getZ() + Float.intBitsToFloat(1056964608), (EntityPlayer)Class815.Method3467().player, 1.0f);
        GlStateManager.disableDepth();
        GlStateManager.translate(-(Class1178.Method4741(s) / Double.longBitsToDouble((long)1333208118 ^ 0x400000004F772436L)), 0.0, 0.0);
        Class1178.Method4745(s, 0.0, 0.0, n);
        GlStateManager.popMatrix();
    }
    
    public static void Method5585(final float n, final float n2, final float n3, final EntityPlayer entityPlayer, final float n4) {
        Method5586(n, n2, n3);
        float n5 = (int)entityPlayer.getDistance((double)n, (double)n2, (double)n3) / 2.0f / (2.0f + (2.0f - n4));
        if (n5 < 1.0f) {
            n5 = 1.0f;
        }
        GlStateManager.scale(n5, n5, n5);
    }
    
    public static void Method5586(final float n, final float n2, final float n3) {
        final float intBitsToFloat = Float.intBitsToFloat(1020949519);
        GlStateManager.translate(n - Class815.Method3467().getRenderManager().renderViewEntity.posX, n2 - Class815.Method3467().getRenderManager().renderViewEntity.posY, n3 - Class815.Method3467().getRenderManager().renderViewEntity.posZ);
        GlStateManager.glNormal3f(0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(-Class815.Method3467().player.rotationYaw, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(Class815.Method3467().player.rotationPitch, (Class815.Method3467().gameSettings.thirdPersonView == 2) ? Float.intBitsToFloat(-1082130432) : 1.0f, 0.0f, 0.0f);
        GlStateManager.scale(-intBitsToFloat, -intBitsToFloat, intBitsToFloat);
    }
}
