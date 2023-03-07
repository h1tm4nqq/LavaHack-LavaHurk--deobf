//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import lavahack.client.EaPO2tejfzeKFPU19fHIJkdD7KPbX6qP;
import lavahack.client.PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import org.lwjgl.opengl.GL11;

public class aogyKtChraqPYPBsVI0iExBGPWaJOvhE
implements Ljc0gDTN8WkwPRHY480HpEkScGALG41A {
    private String Field14985;
    public int Field14986;
    public int Field14987;
    public int Field14988;
    public int Field14989;
    private int Field14990;
    private boolean Field14991;
    private int Field14992;
    private int Field14993;
    private int Field14994;
    private int Field14995;
    private int Field14996;

    public aogyKtChraqPYPBsVI0iExBGPWaJOvhE(String string, int n, int n2, int n3, int n4) {
        this.Field14985 = string;
        this.Field14986 = n;
        this.Field14987 = n2;
        this.Field14988 = n3;
        this.Field14989 = n4;
    }

    public void Method5974(EaPO2tejfzeKFPU19fHIJkdD7KPbX6qP eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP, int n, int n2) {
        if (Minecraft.getMinecraft().player == null) {
            return;
        }
        int n3 = eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP.Method2450(this.Field14985);
        int n4 = n3 / ((int)((long)-422619895 ^ (long)-422619896) << 2);
        this.Field14990 = n4 * ((int)((long)465281064 ^ (long)465281065) << 1) + n3;
        eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP.Method2445(this.Field14986, this.Field14987, this.Field14988, this.Field14989, PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12572);
        eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP.Method2445(this.Field14986, this.Field14987, this.Field14988, this.Field14990, PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12569);
        if (null.Field11786.Method365()) {
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRoundedRect((double)(this.Field14986 / (((int)-2051423198L ^ 0x85B9C423) << 1)), (double)(this.Field14987 / ((int)((long)-1844900168 ^ (long)-1844900167) << 1)), (double)((this.Field14986 + this.Field14988) / (((int)-2004858220L ^ 0x88804A95) << 1)), (double)((this.Field14987 + this.Field14990) / (((int)-1408874554L ^ 0xAC0647C7) << 1)), PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12569, null.Field11788.Method367());
        }
        eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP.Method2448(this.Field14986 + this.Field14988 / ((int)((long)782871872 ^ (long)782871873) << 1) - eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP.Method2449(this.Field14985) / ((int)((long)2087306310 ^ (long)2087306311) << 1), this.Field14987 + n4, this.Field14985, null.Field11804.Method365() ? eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP.Method2456() : PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12573);
        GL11.glEnable((int)((int)((long)385381069 ^ (long)385382844)));
        aogyKtChraqPYPBsVI0iExBGPWaJOvhE.Method5975((this.Field14986 + this.Field14988 / ((int)((long)1770313274 ^ (long)1770313275) << 1)) / ((int)((long)417200197 ^ (long)417200196) << 1), (this.Field14987 + this.Field14989 - ((int)((long)1152050620 ^ (long)1152050617) << 1)) / ((int)((long)1818176480 ^ (long)1818176481) << 1), ((int)920530916L ^ 0x36DE2FEB) << 1, (float)((this.Field14986 + this.Field14988 / (((int)-638475943L ^ 0xD9F1A158) << 1)) / (((int)-999761897L ^ 0xC468D816) << 1)) - (float)this.Field14994, (float)((this.Field14987 + this.Field14989 - ((int)((long)1808755411 ^ (long)1808755414) << 1)) / ((int)((long)1972796847 ^ (long)1972796846) << 1)) - (float)this.Field14995, (EntityLivingBase)aogyKtChraqPYPBsVI0iExBGPWaJOvhE.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player);
        this.Field14994 = n;
        this.Field14995 = n2;
    }

    public static void Method5975(int n, int n2, int n3, float f, float f2, EntityLivingBase entityLivingBase) {
        GlStateManager.enableColorMaterial();
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)n, (float)n2, (float)Float.intBitsToFloat((int)687414770L ^ 0x6AB11DF2));
        GlStateManager.scale((float)(-n3), (float)n3, (float)n3);
        GlStateManager.rotate((float)Float.intBitsToFloat(0x7663B1B2 ^ 0x3557B1B2), (float)0.0f, (float)0.0f, (float)1.0f);
        float f3 = entityLivingBase.renderYawOffset;
        float f4 = entityLivingBase.rotationYaw;
        float f5 = entityLivingBase.rotationPitch;
        float f6 = entityLivingBase.prevRotationYawHead;
        float f7 = entityLivingBase.rotationYawHead;
        GlStateManager.rotate((float)Float.intBitsToFloat((int)((long)1996252775 ^ (long)905668199)), (float)0.0f, (float)1.0f, (float)0.0f);
        RenderHelper.enableStandardItemLighting();
        GlStateManager.rotate((float)Float.intBitsToFloat((int)((long)957955076 ^ (long)-98681852)), (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.rotate((float)(-((float)Math.atan(f2 / Float.intBitsToFloat((int)561717332L ^ 0x635B2054))) * Float.intBitsToFloat(0x10065DBA ^ 0x51A65DBA)), (float)1.0f, (float)0.0f, (float)0.0f);
        entityLivingBase.renderYawOffset = (float)Math.atan(f / Float.intBitsToFloat((int)((long)62022713 ^ (long)1100112953))) * Float.intBitsToFloat((int)((long)2013431822 ^ (long)966952974));
        entityLivingBase.rotationYaw = (float)Math.atan(f / Float.intBitsToFloat((int)((long)616451663 ^ (long)1721650767))) * Float.intBitsToFloat((int)((long)569577965 ^ (long)1674777069));
        entityLivingBase.rotationPitch = -((float)Math.atan(f2 / Float.intBitsToFloat((int)((long)835901 ^ (long)1110229309)))) * Float.intBitsToFloat((int)((long)988438403 ^ (long)2068471683));
        entityLivingBase.rotationYawHead = entityLivingBase.rotationYaw;
        entityLivingBase.prevRotationYawHead = entityLivingBase.rotationYaw;
        GlStateManager.translate((float)0.0f, (float)0.0f, (float)0.0f);
        RenderManager renderManager = ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.getRenderManager();
        renderManager.setPlayerViewY(Float.intBitsToFloat((int)((long)731163916 ^ (long)1755360524)));
        renderManager.setRenderShadow((boolean)((long)757592634 ^ (long)757592634));
        renderManager.renderEntity((Entity)entityLivingBase, 0.0, 0.0, 0.0, 0.0f, 1.0f, (boolean)((long)76265943 ^ (long)76265943));
        renderManager.setRenderShadow(((int)-186049555L ^ 0xF4E91BEC) != 0);
        entityLivingBase.renderYawOffset = f3;
        entityLivingBase.rotationYaw = f4;
        entityLivingBase.rotationPitch = f5;
        entityLivingBase.prevRotationYawHead = f6;
        entityLivingBase.rotationYawHead = f7;
        GlStateManager.popMatrix();
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableRescaleNormal();
        GlStateManager.setActiveTexture((int)OpenGlHelper.lightmapTexUnit);
        GlStateManager.disableTexture2D();
        GlStateManager.setActiveTexture((int)OpenGlHelper.defaultTexUnit);
    }

    public void Method5976(String string) {
        this.Field14985 = string;
    }

    public void Method5977(int n, int n2, int n3) {
        if (n != 0) return;
        if (n2 < this.Field14986) return;
        if (n3 < this.Field14987) return;
        if (n2 > this.Field14986 + this.Field14988) return;
        if (n3 > this.Field14987 + this.Field14990) return;
        this.Field14991 = (int)-1067770655L ^ 0xC05B1CE0;
        this.Field14992 = this.Field14986 - n2;
        this.Field14993 = this.Field14987 - n3;
    }

    private void Method5978(int n, int n2) {
        if (!this.Field14991) return;
        this.Field14986 = n + this.Field14992;
        this.Field14987 = n2 + this.Field14993;
    }

    public void Method5979(int n, int n2, int n3) {
        if (n != 0) return;
        this.Field14991 = (int)((long)-1502825848 ^ (long)-1502825848);
    }

    public void Method5980(int n, int n2) {
        this.Method5978(n, n2);
    }
}

