//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.*;
import net.minecraft.util.text.*;
import net.minecraft.entity.item.*;
import net.minecraft.client.*;
import net.minecraft.world.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.entity.*;

public class Class558 extends Class1514
{
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
    
    public Class558(final Class1876 class1876, final int field10378, final int field10379, final Entity field10380) {
        super(class1876);
        this.Field10377 = field10380;
        this.Field10378 = field10378;
        this.Field10379 = field10379;
        this.Method676(field10378);
        this.Method2474();
    }
    
    public Class558(final Class1876 class1876, final Entity entity) {
        this(class1876, 180, 22, entity);
    }
    
    public void Method668() {
        this.Method2474();
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445((double)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (double)this.Method675(), (double)this.Method677(), Class1039.Field12570);
        if (this.Field10380) {
            this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445((double)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (double)this.Method675(), (double)this.Field10379, Class1039.Field12569);
        }
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445((double)(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() - this.Field10379), (double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (double)this.Field10379, (double)this.Method677(), (this.Field10380 || this.Field10381) ? Class1039.Field12570 : Class1039.Field12569);
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2446((double)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (double)this.Method675(), (double)this.Method677(), 1.0f, (this.Field10380 && !this.Field10381) ? Class1039.Field12571 : Class1039.Field12569);
        final String s = (this.Field10377 != null) ? this.Field10377.getName() : (TextFormatting.RED + "ERROR");
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2448(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + 4, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field10379 / 2 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(s) / 2, s, Class1039.Field12573);
        if (this.Field10381) {
            if (this.Field10377 instanceof EntityEnderCrystal) {
                final EntityEnderCrystal entityEnderCrystal = new EntityEnderCrystal((World)Minecraft.getMinecraft().world, Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(9199310854111111807L)) ^ 0x7FAA847B55B02A7FL), Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(9218441781633968077L)) ^ 0x7FEE7BF580E967CDL), Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(9216630605004928090L)) ^ 0x7FE80CB4154FF45AL));
                entityEnderCrystal.setShowBottom(false);
                entityEnderCrystal.rotationYaw = Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(2125398107)) ^ 0x7EAF005B);
                entityEnderCrystal.rotationPitch = Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(2132726619)) ^ 0x7F1ED35B);
                entityEnderCrystal.innerRotation = 0;
                entityEnderCrystal.prevRotationYaw = Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(2137981279)) ^ 0x7F6F015F);
                entityEnderCrystal.prevRotationPitch = Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(2134636325)) ^ 0x7F3BF725);
                GL11.glScalef(Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(1087837307)) ^ 0x7F57147B), Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(1090752513)) ^ 0x7E839001), Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(1090150256)) ^ 0x7F7A5F70));
                this.Method2473((this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() / 2) / 2, (this.Method677() + 2) / 2, 40, 0.0f, 0.0f, (Entity)entityEnderCrystal);
            }
            else {
                this.Method2473(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() / 2, this.Method677() - 2, 40, 0.0f, 0.0f, (Entity)Minecraft.getMinecraft().player);
            }
        }
    }
    
    public void Method669() {
    }
    
    public boolean Method683(final int n, final int n2, final boolean b) {
        this.Method2472(n, n2, b);
        return false;
    }
    
    private void Method2472(final int field10382, final int field10383, final boolean b) {
        this.Field10380 = (!b && field10382 >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && field10383 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && field10382 <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && field10383 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field10379);
        this.Field10382 = field10382;
        this.Field10383 = field10383;
    }
    
    public boolean Method684(final int n, final int n2, final int n3, final boolean b) {
        this.Method2472(n2, n3, b);
        if (n != 0) {
            return false;
        }
        if (this.Field10380) {
            this.Method2475(!this.Field10381);
            this.Method2474();
            return true;
        }
        return false;
    }
    
    public boolean Method682(final int n, final int n2, final int n3, final boolean b) {
        return super.Method682(n, n2, n3, b);
    }
    
    public void Method2473(final int n, final int n2, final int n3, final float n4, final float n5, final Entity entity) {
        GlStateManager.enableColorMaterial();
        GlStateManager.pushMatrix();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.translate((float)n, (float)n2, Float.intBitsToFloat(1112014848));
        GlStateManager.scale((float)(-n3), (float)n3, (float)n3);
        GlStateManager.rotate(Float.intBitsToFloat(1127481344), 0.0f, 0.0f, 1.0f);
        final float rotationYaw = entity.rotationYaw;
        final float rotationPitch = entity.rotationPitch;
        GlStateManager.rotate(Float.intBitsToFloat(1124532224), 0.0f, 1.0f, 0.0f);
        RenderHelper.enableStandardItemLighting();
        GlStateManager.rotate(Float.intBitsToFloat(-1022951424), 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(-(float)Math.atan(n5 / Float.intBitsToFloat(1109393408)) * Float.intBitsToFloat(1101004800), 1.0f, 0.0f, 0.0f);
        entity.setRenderYawOffset((float)Math.atan(n4 / Float.intBitsToFloat(1109393408)) * Float.intBitsToFloat(1101004800));
        entity.rotationYaw = (float)Math.atan(n4 / Float.intBitsToFloat(1109393408)) * Float.intBitsToFloat(1109393408);
        entity.rotationPitch = -(float)Math.atan(n5 / Float.intBitsToFloat(1109393408)) * Float.intBitsToFloat(1101004800);
        entity.setRotationYawHead(entity.rotationYaw);
        entity.prevRotationYaw = entity.rotationYaw;
        GlStateManager.translate(0.0f, 0.0f, 0.0f);
        final RenderManager getRenderManager = Minecraft.getMinecraft().getRenderManager();
        getRenderManager.setPlayerViewY(Float.intBitsToFloat(1127481344));
        getRenderManager.setRenderShadow(false);
        getRenderManager.renderEntity(entity, 0.0, 0.0, 0.0, 0.0f, 1.0f, false);
        getRenderManager.setRenderShadow(true);
        entity.rotationYaw = rotationYaw;
        entity.rotationPitch = rotationPitch;
        GlStateManager.popMatrix();
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableRescaleNormal();
        GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GlStateManager.disableTexture2D();
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
    }
    
    private void Method2474() {
        if (this.Field10381) {
            this.Method678(this.Field10379 + 100);
        }
        else {
            this.Method678(this.Field10379);
        }
    }
    
    public void Method2475(final boolean field10381) {
        this.Field10381 = field10381;
        this.Method2474();
    }
    
    static {
        Field10376 = 22;
        Field10375 = 180;
    }
    
    private static String Method2476(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7BDB ^ 0xB7));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
