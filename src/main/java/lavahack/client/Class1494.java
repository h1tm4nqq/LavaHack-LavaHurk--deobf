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

import com.kisman.cc.util.Class2142;
import lavahack.client.Class1039;
import lavahack.client.Class1876;
import lavahack.client.Class753;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import org.lwjgl.opengl.GL11;

public class Class1494
implements Class2142 {
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

    public Class1494(String string, int n, int n2, int n3, int n4) {
        this.Field14985 = string;
        this.Field14986 = n;
        this.Field14987 = n2;
        this.Field14988 = n3;
        this.Field14989 = n4;
    }

    public void Method5974(Class1876 class1876, int n, int n2) {
        if (Minecraft.getMinecraft().player == null) {
            return;
        }
        int n3 = class1876.Method2450(this.Field14985);
        int n4 = n3 / 4;
        this.Field14990 = n4 * 2 + n3;
        class1876.Method2445(this.Field14986, this.Field14987, this.Field14988, this.Field14989, Class1039.Field12572);
        class1876.Method2445(this.Field14986, this.Field14987, this.Field14988, this.Field14990, Class1039.Field12569);
        if (null.Field11786.Method365()) {
            Class753.drawRoundedRect((double)(this.Field14986 / 2), (double)(this.Field14987 / 2), (double)((this.Field14986 + this.Field14988) / 2), (double)((this.Field14987 + this.Field14990) / 2), Class1039.Field12569, null.Field11788.Method367());
        }
        class1876.Method2448(this.Field14986 + this.Field14988 / 2 - class1876.Method2449(this.Field14985) / 2, this.Field14987 + n4, this.Field14985, null.Field11804.Method365() ? class1876.Method2456() : Class1039.Field12573);
        GL11.glEnable((int)2929);
        Class1494.Method5975((this.Field14986 + this.Field14988 / 2) / 2, (this.Field14987 + this.Field14989 - 10) / 2, 30, (float)((this.Field14986 + this.Field14988 / 2) / 2) - (float)this.Field14994, (float)((this.Field14987 + this.Field14989 - 10) / 2) - (float)this.Field14995, (EntityLivingBase)Class1494.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player);
        this.Field14994 = n;
        this.Field14995 = n2;
    }

    public static void Method5975(int n, int n2, int n3, float f, float f2, EntityLivingBase entityLivingBase) {
        GlStateManager.enableColorMaterial();
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)n, (float)n2, (float)Float.intBitsToFloat(1112014848));
        GlStateManager.scale((float)(-n3), (float)n3, (float)n3);
        GlStateManager.rotate((float)Float.intBitsToFloat(0x43340000), (float)0.0f, (float)0.0f, (float)1.0f);
        float f3 = entityLivingBase.renderYawOffset;
        float f4 = entityLivingBase.rotationYaw;
        float f5 = entityLivingBase.rotationPitch;
        float f6 = entityLivingBase.prevRotationYawHead;
        float f7 = entityLivingBase.rotationYawHead;
        GlStateManager.rotate((float)Float.intBitsToFloat(1124532224), (float)0.0f, (float)1.0f, (float)0.0f);
        RenderHelper.enableStandardItemLighting();
        GlStateManager.rotate((float)Float.intBitsToFloat(-1022951424), (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.rotate((float)(-((float)Math.atan(f2 / Float.intBitsToFloat(0x42200000))) * Float.intBitsToFloat(1101004800)), (float)1.0f, (float)0.0f, (float)0.0f);
        entityLivingBase.renderYawOffset = (float)Math.atan(f / Float.intBitsToFloat(0x42200000)) * Float.intBitsToFloat(1101004800);
        entityLivingBase.rotationYaw = (float)Math.atan(f / Float.intBitsToFloat(0x42200000)) * Float.intBitsToFloat(0x42200000);
        entityLivingBase.rotationPitch = -((float)Math.atan(f2 / Float.intBitsToFloat(0x42200000))) * Float.intBitsToFloat(1101004800);
        entityLivingBase.rotationYawHead = entityLivingBase.rotationYaw;
        entityLivingBase.prevRotationYawHead = entityLivingBase.rotationYaw;
        GlStateManager.translate((float)0.0f, (float)0.0f, (float)0.0f);
        RenderManager renderManager = ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.getRenderManager();
        renderManager.setPlayerViewY(Float.intBitsToFloat(0x43340000));
        renderManager.setRenderShadow(false);
        renderManager.renderEntity((Entity)entityLivingBase, 0.0, 0.0, 0.0, 0.0f, 1.0f, false);
        renderManager.setRenderShadow(true);
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
        this.Field14991 = true;
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
        this.Field14991 = false;
    }

    public void Method5980(int n, int n2) {
        this.Method5978(n, n2);
    }
}

