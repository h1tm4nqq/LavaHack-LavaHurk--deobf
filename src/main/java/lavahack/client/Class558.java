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

import lavahack.client.Class1039;
import lavahack.client.Class1514;
import lavahack.client.Class1876;
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

public class Class558
extends Class1514 {
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

    public Class558(Class1876 class1876, int n, int n2, Entity entity) {
        super(class1876);
        this.Field10377 = entity;
        this.Field10378 = n;
        this.Field10379 = n2;
        this.Method676(n);
        this.Method2474();
    }

    public Class558(Class1876 class1876, Entity entity) {
        this(class1876, 180, 22, entity);
    }

    @Override
    public void Method668() {
        this.Method2474();
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Method675(), this.Method677(), Class1039.Field12570);
        if (this.Field10380) {
            this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Method675(), this.Field10379, Class1039.Field12569);
        }
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() - this.Field10379, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Field10379, this.Method677(), this.Field10380 || this.Field10381 ? Class1039.Field12570 : Class1039.Field12569);
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2446(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, this.Method675(), this.Method677(), 1.0f, this.Field10380 && !this.Field10381 ? Class1039.Field12571 : Class1039.Field12569);
        String string = this.Field10377 != null ? this.Field10377.getName() : TextFormatting.RED + "ERROR";
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2448(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + 4, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field10379 / 2 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(string) / 2, string, Class1039.Field12573);
        if (!this.Field10381) return;
        if (this.Field10377 instanceof EntityEnderCrystal) {
            EntityEnderCrystal entityEnderCrystal = new EntityEnderCrystal((World)Minecraft.getMinecraft().world, Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(9199310854111111807L)) ^ 0x7FAA847B55B02A7FL), Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(9218441781633968077L)) ^ 0x7FEE7BF580E967CDL), Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(9216630605004928090L)) ^ 0x7FE80CB4154FF45AL));
            entityEnderCrystal.setShowBottom(false);
            entityEnderCrystal.rotationYaw = Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(2125398107)) ^ 0x7EAF005B);
            entityEnderCrystal.rotationPitch = Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(2132726619)) ^ 0x7F1ED35B);
            entityEnderCrystal.innerRotation = 0;
            entityEnderCrystal.prevRotationYaw = Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(2137981279)) ^ 0x7F6F015F);
            entityEnderCrystal.prevRotationPitch = Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(2134636325)) ^ 0x7F3BF725);
            GL11.glScalef((float)Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(1087837307)) ^ 0x7F57147B), (float)Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(1090752513)) ^ 0x7E839001), (float)Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(1090150256)) ^ 0x7F7A5F70));
            this.Method2473((this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() / 2) / 2, (this.Method677() + 2) / 2, 40, 0.0f, 0.0f, (Entity)entityEnderCrystal);
            return;
        }
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        this.Method2473(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() / 2, this.Method677() - 2, 40, 0.0f, 0.0f, (Entity)entityPlayerSP);
    }

    @Override
    public void Method669() {
    }

    @Override
    public boolean Method683(int n, int n2, boolean bl) {
        this.Method2472(n, n2, bl);
        return false;
    }

    private void Method2472(int n, int n2, boolean bl) {
        this.Field10380 = !bl && n >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && n2 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && n <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && n2 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field10379;
        this.Field10382 = n;
        this.Field10383 = n2;
    }

    @Override
    public boolean Method684(int n, int n2, int n3, boolean bl) {
        this.Method2472(n2, n3, bl);
        if (n != 0) {
            return false;
        }
        if (!this.Field10380) return false;
        this.Method2475(!this.Field10381);
        this.Method2474();
        return true;
    }

    @Override
    public boolean Method682(int n, int n2, int n3, boolean bl) {
        return super.Method682(n, n2, n3, bl);
    }

    public void Method2473(int n, int n2, int n3, float f, float f2, Entity entity) {
        GlStateManager.enableColorMaterial();
        GlStateManager.pushMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.translate((float)n, (float)n2, (float)Float.intBitsToFloat(1112014848));
        GlStateManager.scale((float)(-n3), (float)n3, (float)n3);
        GlStateManager.rotate((float)Float.intBitsToFloat(0x43340000), (float)0.0f, (float)0.0f, (float)1.0f);
        float f3 = entity.rotationYaw;
        float f4 = entity.rotationPitch;
        GlStateManager.rotate((float)Float.intBitsToFloat(1124532224), (float)0.0f, (float)1.0f, (float)0.0f);
        RenderHelper.enableStandardItemLighting();
        GlStateManager.rotate((float)Float.intBitsToFloat(-1022951424), (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.rotate((float)(-((float)Math.atan(f2 / Float.intBitsToFloat(0x42200000))) * Float.intBitsToFloat(1101004800)), (float)1.0f, (float)0.0f, (float)0.0f);
        entity.setRenderYawOffset((float)Math.atan(f / Float.intBitsToFloat(0x42200000)) * Float.intBitsToFloat(1101004800));
        entity.rotationYaw = (float)Math.atan(f / Float.intBitsToFloat(0x42200000)) * Float.intBitsToFloat(0x42200000);
        entity.rotationPitch = -((float)Math.atan(f2 / Float.intBitsToFloat(0x42200000))) * Float.intBitsToFloat(1101004800);
        entity.setRotationYawHead(entity.rotationYaw);
        entity.prevRotationYaw = entity.rotationYaw;
        GlStateManager.translate((float)0.0f, (float)0.0f, (float)0.0f);
        RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
        renderManager.setPlayerViewY(Float.intBitsToFloat(0x43340000));
        renderManager.setRenderShadow(false);
        renderManager.renderEntity(entity, 0.0, 0.0, 0.0, 0.0f, 1.0f, false);
        renderManager.setRenderShadow(true);
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
            this.Method678(this.Field10379 + 100);
            return;
        }
        this.Method678(this.Field10379);
    }

    public void Method2475(boolean bl) {
        this.Field10381 = bl;
        this.Method2474();
    }

    static {
        Field10376 = 22;
        Field10375 = 180;
    }

    private static String Method2476(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 183;
            cArray2[n] = (char)(cArray[n] ^ (0x7BDB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

