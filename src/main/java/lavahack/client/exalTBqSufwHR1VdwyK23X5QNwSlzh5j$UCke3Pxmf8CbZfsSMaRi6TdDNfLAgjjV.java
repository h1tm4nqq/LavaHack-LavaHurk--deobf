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

import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;

public class exalTBqSufwHR1VdwyK23X5QNwSlzh5j$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV {
    private String Field14422 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method5584(BlockPos blockPos, String string, int n) {
        if (blockPos == null) return;
        if (string == null) {
            return;
        }
        GlStateManager.pushMatrix();
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method5585((float)blockPos.getX() + Float.intBitsToFloat((int)((long)823851093 ^ (long)236648533)), (float)blockPos.getY() + Float.intBitsToFloat(0x23D73E35 ^ 0x1CD73E35), (float)blockPos.getZ() + Float.intBitsToFloat((int)25578433L ^ 0x3E864BC1), (EntityPlayer)exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3467().player, 1.0f);
        GlStateManager.disableDepth();
        GlStateManager.translate((double)(-((double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(string) / Double.longBitsToDouble((long)1333208118 ^ 0x400000004F772436L))), (double)0.0, (double)0.0);
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(string, 0.0, 0.0, n);
        GlStateManager.popMatrix();
    }

    public static void Method5585(float f, float f2, float f3, EntityPlayer entityPlayer, float f4) {
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method5586(f, f2, f3);
        int n = (int)entityPlayer.getDistance((double)f, (double)f2, (double)f3);
        float f5 = (float)n / 2.0f / (2.0f + (2.0f - f4));
        if (f5 < 1.0f) {
            f5 = 1.0f;
        }
        GlStateManager.scale((float)f5, (float)f5, (float)f5);
    }

    public static void Method5586(float f, float f2, float f3) {
        float f4 = Float.intBitsToFloat(0x42F6E664 ^ 0x7E2C926B);
        GlStateManager.translate((double)((double)f - exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3467().getRenderManager().renderViewEntity.posX), (double)((double)f2 - exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3467().getRenderManager().renderViewEntity.posY), (double)((double)f3 - exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3467().getRenderManager().renderViewEntity.posZ));
        GlStateManager.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.rotate((float)(-exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3467().player.rotationYaw), (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.rotate((float)exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3467().player.rotationPitch, (float)(exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3467().gameSettings.thirdPersonView == ((int)-359731032L ^ 0xEA8EF0A9) << 1 ? Float.intBitsToFloat((int)((long)2079289191 ^ (long)-999329945)) : 1.0f), (float)0.0f, (float)0.0f);
        GlStateManager.scale((float)(-f4), (float)(-f4), (float)f4);
    }
}

