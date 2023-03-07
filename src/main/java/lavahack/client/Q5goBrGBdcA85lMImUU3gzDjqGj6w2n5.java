//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.shader.Framebuffer
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import java.awt.Color;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;

public class Q5goBrGBdcA85lMImUU3gzDjqGj6w2n5 {
    private String Field10189 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method2371(float f) {
        Q5goBrGBdcA85lMImUU3gzDjqGj6w2n5.Method2377();
        GL11.glPushAttrib((int)((int)((long)397315931 ^ (long)396456100)));
        GL11.glDisable((int)((int)((long)-1689606085 ^ (long)-1689606124) << 6));
        GL11.glDisable((int)((int)691010610L ^ 0x292FF1D3));
        GL11.glDisable((int)(((int)587698262L ^ 0x230790E3) << 4));
        GL11.glEnable((int)(((int)35642822L ^ 0x21FD837) << 1));
        GL11.glBlendFunc((int)(((int)-1447651288L ^ 0xA9B699A9) << 1), (int)((int)551118167L ^ 0x20D96654));
        GL11.glLineWidth((float)f);
        GL11.glEnable((int)((int)((long)926223681 ^ (long)926223640) << 5));
        GL11.glEnable((int)(((int)-1555411753L ^ 0xA34A4C6E) << 4));
        GL11.glClear((int)((int)((long)-1218315423 ^ (long)-1218315424) << 10));
        GL11.glClearStencil((int)((int)1297390751L ^ 0x4D549C90));
        GL11.glStencilFunc((int)((int)((long)1283330554 ^ (long)1283330555) << 9), (int)((int)((long)544088474 ^ (long)544088475)), (int)((int)-636786336L ^ 0xDA0B696F));
        GL11.glStencilOp((int)((int)((long)1748202651 ^ (long)1748200090)), (int)((int)((long)152453239 ^ (long)152460918)), (int)((int)1314059929L ^ 0x4E52E898));
        GL11.glPolygonMode((int)(((int)-1426822148L ^ 0xAAF46B7D) << 3), (int)((int)-1195140425L ^ 0xB8C381B6));
    }

    public static void Method2372() {
        GL11.glStencilFunc((int)(((int)1310729810L ^ 0x4E202653) << 9), (int)((int)-1849562533L ^ 0x91C1EA5B), (int)((int)((long)-1805871587 ^ (long)-1805871598)));
        GL11.glStencilOp((int)((int)((long)206077035 ^ (long)206070378)), (int)((int)-1050227923L ^ 0xC166D52C), (int)((int)1435898347L ^ 0x55960FEA));
        GL11.glPolygonMode((int)(((int)1672743659L ^ 0x63B40A6A) << 3), (int)((int)((long)-1834990723 ^ (long)-1834987780) << 1));
    }

    public static void Method2373() {
        GL11.glStencilFunc((int)(((int)-955556802L ^ 0xC70B5D3F) << 1), (int)((int)-2134565330L ^ 0x80C51E2F), (int)((int)1328253450L ^ 0x4F2B8A05));
        GL11.glStencilOp((int)((int)((long)1328983645 ^ (long)1328983634) << 9), (int)((int)((long)-2037129621 ^ (long)-2037129628) << 9), (int)((int)((long)-1068523392 ^ (long)-1068523377) << 9));
        GL11.glPolygonMode((int)(((int)1635861735L ^ 0x61814466) << 3), (int)((int)((long)-2030004284 ^ (long)-2030007099)));
    }

    public static void Method2374(int n, float f) {
        Q5goBrGBdcA85lMImUU3gzDjqGj6w2n5.Method2376(new Color(n));
        GL11.glDepthMask((boolean)((long)1206335016 ^ (long)1206335016));
        GL11.glDisable((int)((int)((long)390062233 ^ (long)390065128)));
        GL11.glEnable((int)((int)((long)829574482 ^ (long)829577299) << 1));
        GL11.glPolygonOffset((float)f, (float)Float.intBitsToFloat((int)((long)847848108 ^ (long)-75692372)));
        OpenGlHelper.setLightmapTextureCoords((int)OpenGlHelper.lightmapTexUnit, (float)Float.intBitsToFloat(0x43E9543B ^ 0x99543B), (float)Float.intBitsToFloat((int)((long)1353377392 ^ (long)333112944)));
    }

    public static void Method2375(float f) {
        GL11.glPolygonOffset((float)(-f), (float)Float.intBitsToFloat(0x1A1E27BB ^ 0x53EA03BB));
        GL11.glDisable((int)((int)((long)-2074902671 ^ (long)-2074908048) << 1));
        GL11.glEnable((int)((int)((long)1395930736 ^ (long)1395932417)));
        GL11.glDepthMask((boolean)((long)190565517 ^ (long)190565516));
        GL11.glDisable((int)((int)((long)651233211 ^ (long)651233026) << 4));
        GL11.glDisable((int)((int)((long)-295672237 ^ (long)-295672310) << 5));
        GL11.glHint((int)(((int)787450540L ^ 0x2EEF8C85) << 1), (int)((int)((long)-195004401 ^ (long)-195004386) << 8));
        GL11.glEnable((int)((int)((long)-157580441 ^ (long)-157579626) << 1));
        GL11.glEnable((int)(((int)-934107621L ^ 0xC852A6AE) << 4));
        GL11.glEnable((int)((int)1031069748L ^ 0x3D74EDD5));
        GL11.glEnable((int)(((int)1284185597L ^ 0x4C8B1DD2) << 6));
        GL11.glPopAttrib();
    }

    public static void Method2376(Color color) {
        GL11.glColor4d((double)((float)color.getRed() / Float.intBitsToFloat((int)((long)1673281951 ^ (long)549667231))), (double)((float)color.getGreen() / Float.intBitsToFloat((int)((long)444592131 ^ (long)1493233667))), (double)((float)color.getBlue() / Float.intBitsToFloat((int)((long)1590479380 ^ (long)498321940))), (double)((float)color.getAlpha() / Float.intBitsToFloat((int)1748497350L ^ 0x2B48F3C6)));
    }

    public static void Method2377() {
        Framebuffer framebuffer = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.getFramebuffer();
        if (framebuffer.depthBuffer <= (int)((long)2004150001 ^ (long)-2004150002)) return;
        Q5goBrGBdcA85lMImUU3gzDjqGj6w2n5.Method2378(framebuffer);
        framebuffer.depthBuffer = (int)2046330837L ^ 0x8607782A;
    }

    public static void Method2378(Framebuffer framebuffer) {
        EXTFramebufferObject.glDeleteRenderbuffersEXT((int)framebuffer.depthBuffer);
        int n = EXTFramebufferObject.glGenRenderbuffersEXT();
        EXTFramebufferObject.glBindRenderbufferEXT((int)((int)2134276494L ^ 0x7F36F4CF), (int)n);
        EXTFramebufferObject.glRenderbufferStorageEXT((int)((int)-1594124793L ^ 0xA0FB1B46), (int)((int)-250915839L ^ 0xF10BD0F8), (int)Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.displayWidth, (int)Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.displayHeight);
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)((int)((long)1402281670 ^ (long)1402281203) << 6), (int)(((int)1022813284L ^ 0x3CF6E00D) << 5), (int)((int)((long)-1196238886 ^ (long)-1196270949)), (int)n);
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)((int)((long)1527704568 ^ (long)1527704013) << 6), (int)((int)((long)-599816988 ^ (long)-599817111) << 8), (int)((int)((long)-1276579525 ^ (long)-1276609414)), (int)n);
    }
}

