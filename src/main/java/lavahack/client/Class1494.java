//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import net.minecraft.client.*;
import org.lwjgl.opengl.*;
import net.minecraft.entity.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.entity.*;

public class Class1494 implements Class2142
{
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
    
    public Class1494(final String field14985, final int field14986, final int field14987, final int field14988, final int field14989) {
        this.Field14985 = field14985;
        this.Field14986 = field14986;
        this.Field14987 = field14987;
        this.Field14988 = field14988;
        this.Field14989 = field14989;
    }
    
    public void Method5974(final Class1876 class1876, final int field14994, final int field14995) {
        if (Minecraft.getMinecraft().player == null) {
            return;
        }
        final int method2450 = class1876.Method2450(this.Field14985);
        final int n = method2450 / 4;
        this.Field14990 = n * 2 + method2450;
        class1876.Method2445(this.Field14986, this.Field14987, this.Field14988, this.Field14989, Class1039.Field12572);
        class1876.Method2445(this.Field14986, this.Field14987, this.Field14988, this.Field14990, Class1039.Field12569);
        if (null.Field11786.Method365()) {
            Class753.drawRoundedRect(this.Field14986 / 2, this.Field14987 / 2, (this.Field14986 + this.Field14988) / 2, (this.Field14987 + this.Field14990) / 2, Class1039.Field12569, null.Field11788.Method367());
        }
        class1876.Method2448(this.Field14986 + this.Field14988 / 2 - class1876.Method2449(this.Field14985) / 2, this.Field14987 + n, this.Field14985, null.Field11804.Method365() ? class1876.Method2456() : Class1039.Field12573);
        GL11.glEnable(2929);
        Method5975((this.Field14986 + this.Field14988 / 2) / 2, (this.Field14987 + this.Field14989 - 10) / 2, 30, (this.Field14986 + this.Field14988 / 2) / 2 - (float)this.Field14994, (this.Field14987 + this.Field14989 - 10) / 2 - (float)this.Field14995, (EntityLivingBase)Class1494.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player);
        this.Field14994 = field14994;
        this.Field14995 = field14995;
    }
    
    public static void Method5975(final int n, final int n2, final int n3, final float n4, final float n5, final EntityLivingBase entityLivingBase) {
        GlStateManager.enableColorMaterial();
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)n, (float)n2, Float.intBitsToFloat(1112014848));
        GlStateManager.scale((float)(-n3), (float)n3, (float)n3);
        GlStateManager.rotate(Float.intBitsToFloat(1127481344), 0.0f, 0.0f, 1.0f);
        final float renderYawOffset = entityLivingBase.renderYawOffset;
        final float rotationYaw = entityLivingBase.rotationYaw;
        final float rotationPitch = entityLivingBase.rotationPitch;
        final float prevRotationYawHead = entityLivingBase.prevRotationYawHead;
        final float rotationYawHead = entityLivingBase.rotationYawHead;
        GlStateManager.rotate(Float.intBitsToFloat(1124532224), 0.0f, 1.0f, 0.0f);
        RenderHelper.enableStandardItemLighting();
        GlStateManager.rotate(Float.intBitsToFloat(-1022951424), 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(-(float)Math.atan(n5 / Float.intBitsToFloat(1109393408)) * Float.intBitsToFloat(1101004800), 1.0f, 0.0f, 0.0f);
        entityLivingBase.renderYawOffset = (float)Math.atan(n4 / Float.intBitsToFloat(1109393408)) * Float.intBitsToFloat(1101004800);
        entityLivingBase.rotationYaw = (float)Math.atan(n4 / Float.intBitsToFloat(1109393408)) * Float.intBitsToFloat(1109393408);
        entityLivingBase.rotationPitch = -(float)Math.atan(n5 / Float.intBitsToFloat(1109393408)) * Float.intBitsToFloat(1101004800);
        entityLivingBase.rotationYawHead = entityLivingBase.rotationYaw;
        entityLivingBase.prevRotationYawHead = entityLivingBase.rotationYaw;
        GlStateManager.translate(0.0f, 0.0f, 0.0f);
        final RenderManager getRenderManager = Class1494.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.getRenderManager();
        getRenderManager.setPlayerViewY(Float.intBitsToFloat(1127481344));
        getRenderManager.setRenderShadow(false);
        getRenderManager.renderEntity((Entity)entityLivingBase, 0.0, 0.0, 0.0, 0.0f, 1.0f, false);
        getRenderManager.setRenderShadow(true);
        entityLivingBase.renderYawOffset = renderYawOffset;
        entityLivingBase.rotationYaw = rotationYaw;
        entityLivingBase.rotationPitch = rotationPitch;
        entityLivingBase.prevRotationYawHead = prevRotationYawHead;
        entityLivingBase.rotationYawHead = rotationYawHead;
        GlStateManager.popMatrix();
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableRescaleNormal();
        GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GlStateManager.disableTexture2D();
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
    }
    
    public void Method5976(final String field14985) {
        this.Field14985 = field14985;
    }
    
    public void Method5977(final int n, final int n2, final int n3) {
        if (n == 0 && n2 >= this.Field14986 && n3 >= this.Field14987 && n2 <= this.Field14986 + this.Field14988 && n3 <= this.Field14987 + this.Field14990) {
            this.Field14991 = true;
            this.Field14992 = this.Field14986 - n2;
            this.Field14993 = this.Field14987 - n3;
        }
    }
    
    private void Method5978(final int n, final int n2) {
        if (this.Field14991) {
            this.Field14986 = n + this.Field14992;
            this.Field14987 = n2 + this.Field14993;
        }
    }
    
    public void Method5979(final int n, final int n2, final int n3) {
        if (n == 0) {
            this.Field14991 = false;
        }
    }
    
    public void Method5980(final int n, final int n2) {
        this.Method5978(n, n2);
    }
}
