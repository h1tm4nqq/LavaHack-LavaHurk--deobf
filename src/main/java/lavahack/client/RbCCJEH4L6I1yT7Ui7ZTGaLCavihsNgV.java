//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityEnderCrystal
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraft.world.World
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import lavahack.client.EaPO2tejfzeKFPU19fHIJkdD7KPbX6qP;
import lavahack.client.PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo;
import lavahack.client.Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

public class RbCCJEH4L6I1yT7Ui7ZTGaLCavihsNgV
extends Std84MWzLhfFZ8wdKETeFXiMbDdoeIjj {
    private static final int Field10375;
    private static final int Field10376;
    private Entity Field10377;
    private int Field10378;
    private int Field10379;
    private boolean Field10380;
    private boolean Field10381;
    private int Field10382;
    private int Field10383;
    private String Field10384 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public RbCCJEH4L6I1yT7Ui7ZTGaLCavihsNgV(EaPO2tejfzeKFPU19fHIJkdD7KPbX6qP eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP, int n, int n2, Entity entity) {
        super(eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP);
        this.Field10377 = entity;
        this.Field10378 = n;
        this.Field10379 = n2;
        this.Method676(n);
        this.Method2474();
    }

    public RbCCJEH4L6I1yT7Ui7ZTGaLCavihsNgV(EaPO2tejfzeKFPU19fHIJkdD7KPbX6qP eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP, Entity entity) {
        this(eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP, ((int)-684558692L ^ 0xD73276B1) << 2, ((int)-800079244L ^ 0xD04FC27F) << 1, entity);
    }

    @Override
    public void Method668() {
        this.Method2474();
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Method675(), this.Method677(), PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12570);
        if (this.Field10380) {
            this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Method675(), this.Field10379, PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12569);
        }
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() - this.Field10379, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Field10379, this.Method677(), this.Field10380 || this.Field10381 ? PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12570 : PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12569);
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2446(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Method675(), this.Method677(), 1.0f, this.Field10380 && !this.Field10381 ? PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12571 : PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12569);
        String string = this.Field10377 != null ? this.Field10377.getName() : TextFormatting.RED + "ERROR";
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2448(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + (((int)-885570760L ^ 0xCB374339) << 2), this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field10379 / ((int)((long)-928034448 ^ (long)-928034447) << 1) - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(string) / ((int)((long)413634178 ^ (long)413634179) << 1), string, PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12573);
        if (!this.Field10381) return;
        if (this.Field10377 instanceof EntityEnderCrystal) {
            EntityEnderCrystal entityEnderCrystal = new EntityEnderCrystal((World)Minecraft.getMinecraft().world, Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(0x552084D2EC34D42BL ^ 0x2A8A00A9B984FE54L)) ^ 0x7FAA847B55B12A7FL & 0x7FAA847B75B0AF7FL), Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(0x7183A685E09F0625L ^ 0xE6DDD70607661E8L)) ^ 0x7FEE7BF58EEBFFCFL & 0x7FEE7BF580F967CDL), Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(0xBC9DA1BD0F008876L ^ 0xC375AD091A4F7C2CL)) ^ 0x7FE80CB4377FF4FAL & 0x7FE80CB415CFFE5EL));
            entityEnderCrystal.setShowBottom(((int)70296889L ^ 0x430A539) != 0);
            entityEnderCrystal.rotationYaw = Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat((int)1117684704L ^ 0x3C3183BB)) ^ (int)((long)-2116658971 ^ (long)-8824642));
            entityEnderCrystal.rotationPitch = Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(0x62FE2B91 ^ 0x1DE0F8CA)) ^ (int)((long)361149835 ^ (long)1788372688));
            entityEnderCrystal.innerRotation = (int)((long)649849000 ^ (long)649849000);
            entityEnderCrystal.prevRotationYaw = Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(0x28A25A53 ^ 0x57CD5B0C)) ^ ((int)-633456228L ^ 0xA55138C3));
            entityEnderCrystal.prevRotationPitch = Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat((int)((long)1585306502 ^ (long)558247075))) ^ (int)((long)377953005 ^ (long)1773989320));
            GL11.glScalef((float)Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat((int)1079276566L ^ 0x83606D)) ^ ((int)-594829662L ^ 0xA3DC8AD9)), (float)Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat((int)71225596L ^ 0x453D40FD)) ^ (int)((long)-619653724 ^ (long)-1517075035)), (float)Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat((int)903379101L ^ 0x752227ED)) ^ (int)((long)561417962 ^ (long)645999389) << 4));
            this.Method2473((this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() / ((int)((long)-1366135694 ^ (long)-1366135693) << 1)) / ((int)((long)1981075598 ^ (long)1981075599) << 1), (this.Method677() + (((int)146449461L ^ 0x8BAA434) << 1)) / ((int)((long)-1730336414 ^ (long)-1730336413) << 1), (int)((long)-1921004703 ^ (long)-1921004700) << 3, 0.0f, 0.0f, (Entity)entityEnderCrystal);
            return;
        }
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        this.Method2473(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() / ((int)((long)1731496425 ^ (long)1731496424) << 1), this.Method677() - (((int)-1227469508L ^ 0xB6D64D3D) << 1), ((int)1970800958L ^ 0x7578093B) << 3, 0.0f, 0.0f, (Entity)entityPlayerSP);
    }

    @Override
    public void Method669() {
    }

    @Override
    public boolean Method683(int n, int n2, boolean bl) {
        this.Method2472(n, n2, bl);
        return (int)((long)860167485 ^ (long)860167485) != 0;
    }

    private void Method2472(int n, int n2, boolean bl) {
        this.Field10380 = !bl && n >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && n2 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && n <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && n2 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field10379 ? (int)-1084785278L ^ 0xBF577D83 : (int)((long)2030267951 ^ (long)2030267951);
        this.Field10382 = n;
        this.Field10383 = n2;
    }

    @Override
    public boolean Method684(int n, int n2, int n3, boolean bl) {
        this.Method2472(n2, n3, bl);
        if (n != 0) {
            return ((int)-577977579L ^ 0xDD8CC315) != 0;
        }
        if (!this.Field10380) return (int)((long)-1977613047 ^ (long)-1977613047) != 0;
        this.Method2475((!this.Field10381 ? (int)1919330736L ^ 0x7266A9B1 : (int)-786086241L ^ 0xD125469F) != 0);
        this.Method2474();
        return (int)((long)207922702 ^ (long)207922703) != 0;
    }

    @Override
    public boolean Method682(int n, int n2, int n3, boolean bl) {
        return super.Method682(n, n2, n3, bl);
    }

    public void Method2473(int n, int n2, int n3, float f, float f2, Entity entity) {
        GlStateManager.enableColorMaterial();
        GlStateManager.pushMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.translate((float)n, (float)n2, (float)Float.intBitsToFloat((int)((long)1233867577 ^ (long)197350201)));
        GlStateManager.scale((float)(-n3), (float)n3, (float)n3);
        GlStateManager.rotate((float)Float.intBitsToFloat(0x3FDFC085 ^ 0x7CEBC085), (float)0.0f, (float)0.0f, (float)1.0f);
        float f3 = entity.rotationYaw;
        float f4 = entity.rotationPitch;
        GlStateManager.rotate((float)Float.intBitsToFloat((int)((long)639703048 ^ (long)1696995336)), (float)0.0f, (float)1.0f, (float)0.0f);
        RenderHelper.enableStandardItemLighting();
        GlStateManager.rotate((float)Float.intBitsToFloat((int)951296288L ^ 0xFBB4A120), (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.rotate((float)(-((float)Math.atan(f2 / Float.intBitsToFloat((int)2076540688L ^ 0x39E57F10))) * Float.intBitsToFloat((int)((long)350069490 ^ (long)1434297074))), (float)1.0f, (float)0.0f, (float)0.0f);
        entity.setRenderYawOffset((float)Math.atan(f / Float.intBitsToFloat((int)((long)327168663 ^ (long)1369453207))) * Float.intBitsToFloat((int)((long)454082226 ^ (long)1521532594)));
        entity.rotationYaw = (float)Math.atan(f / Float.intBitsToFloat(0x28D509B5 ^ 0x6AF509B5)) * Float.intBitsToFloat((int)((long)1413498056 ^ (long)375407816));
        entity.rotationPitch = -((float)Math.atan(f2 / Float.intBitsToFloat(0x53BB6782 ^ 0x119B6782))) * Float.intBitsToFloat((int)709807364L ^ 0x6BEECD04);
        entity.setRotationYawHead(entity.rotationYaw);
        entity.prevRotationYaw = entity.rotationYaw;
        GlStateManager.translate((float)0.0f, (float)0.0f, (float)0.0f);
        RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
        renderManager.setPlayerViewY(Float.intBitsToFloat(0x51D11CFB ^ 0x12E51CFB));
        renderManager.setRenderShadow((boolean)((long)-88173708 ^ (long)-88173708));
        renderManager.renderEntity(entity, 0.0, 0.0, 0.0, 0.0f, 1.0f, ((int)-1522792786L ^ 0xA53C06AE) != 0);
        renderManager.setRenderShadow((boolean)((long)798779692 ^ (long)798779693));
        entity.rotationYaw = f3;
        entity.rotationPitch = f4;
        GlStateManager.popMatrix();
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableRescaleNormal();
        GlStateManager.setActiveTexture((int)OpenGlHelper.lightmapTexUnit);
        GlStateManager.disableTexture2D();
        GlStateManager.setActiveTexture((int)OpenGlHelper.defaultTexUnit);
    }

    private void Method2474() {
        if (this.Field10381) {
            this.Method678(this.Field10379 + (((int)2090089559L ^ 0x7C943C4E) << 2));
            return;
        }
        this.Method678(this.Field10379);
    }

    public void Method2475(boolean bl) {
        this.Field10381 = bl;
        this.Method2474();
    }

    static {
        Field10376 = ((int)-1459183146L ^ 0xA906A1DD) << 1;
        Field10375 = (int)((long)1164579988 ^ (long)1164580025) << 2;
    }

    private static String Method2476(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1869903308L ^ 0x6F7475CC;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1772729260 ^ (long)1772729171);
            int n2 = (int)-1074812598L ^ 0xBFEFA9FD;
            cArray2[n] = (char)(cArray[n] ^ ((int)1702091326L ^ 0x6573A1E5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

