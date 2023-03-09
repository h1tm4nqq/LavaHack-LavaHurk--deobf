//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBow
 *  net.minecraft.item.ItemEgg
 *  net.minecraft.item.ItemEnderPearl
 *  net.minecraft.item.ItemSnowball
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import lavahack.client.Class42;
import lavahack.client.Class97;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemEgg;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemSnowball;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

@Deprecated
public class Class766
extends Class42 {
    private double Field11239;
    private double Field11240;
    private double Field11241;
    private double Field11242 = 0.0;
    private double Field11243 = 1.0;
    private double Field11244 = 0.0;
    private double Field11245;
    private double Field11246;
    private double Field11247;
    private String Field11248 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class766() {
        super("TrajectoriesRewrite", Class97.Field8342);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method3157(RenderWorldLastEvent renderWorldLastEvent) {
        EntityPlayerSP entityPlayerSP = Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
        if (entityPlayerSP.inventory.getCurrentItem() == null) return;
        if (!this.Method3160(entityPlayerSP.inventory.getCurrentItem().getItem())) return;
        this.Field11245 = entityPlayerSP.lastTickPosX + (entityPlayerSP.posX - entityPlayerSP.lastTickPosX) * (double)Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks - (double)(MathHelper.cos((float)((float)Math.toRadians(Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw))) * Float.intBitsToFloat(1042536202));
        this.Field11246 = Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastTickPosY + (Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastTickPosY) * (double)Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks + (double)Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEyeHeight() - Double.longBitsToDouble((long)745640762 ^ 0x3FB9A35DB5E839D1L);
        this.Field11247 = Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastTickPosZ + (Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastTickPosZ) * (double)Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks - (double)(MathHelper.sin((float)((float)Math.toRadians(Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw))) * Float.intBitsToFloat(1042536202));
        float f = 1.0f;
        if (!(Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getCurrentItem().getItem() instanceof ItemBow)) {
            f = Float.intBitsToFloat(1053609165);
        }
        this.Field11239 = -MathHelper.sin((float)((float)Math.toRadians(Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw))) * MathHelper.cos((float)((float)Math.toRadians(Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch))) * f;
        this.Field11240 = MathHelper.cos((float)((float)Math.toRadians(Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw))) * MathHelper.cos((float)((float)Math.toRadians(Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch))) * f;
        this.Field11241 = -MathHelper.sin((float)((float)Math.toRadians(Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch))) * f;
        double d = Math.sqrt(this.Field11239 * this.Field11239 + this.Field11241 * this.Field11241 + this.Field11240 * this.Field11240);
        this.Field11239 /= d;
        this.Field11241 /= d;
        this.Field11240 /= d;
        if (Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getCurrentItem().getItem() instanceof ItemBow) {
            float f2 = (float)(72000 - Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemInUseCount()) / Float.intBitsToFloat(1101004800);
            if ((f2 = (f2 * f2 + f2 * 2.0f) / Float.intBitsToFloat(0x40400000)) > 1.0f) {
                f2 = 1.0f;
            }
            if (f2 <= Float.intBitsToFloat(0x3DCCCCCD)) {
                f2 = 1.0f;
            }
            f2 *= 2.0f;
            this.Field11239 *= (double)(f2 *= Float.intBitsToFloat(1069547520));
            this.Field11241 *= (double)f2;
            this.Field11240 *= (double)f2;
        } else {
            this.Field11239 *= Double.longBitsToDouble(4609434218613702656L);
            this.Field11241 *= Double.longBitsToDouble(4609434218613702656L);
            this.Field11240 *= Double.longBitsToDouble(4609434218613702656L);
        }
        Vec3d vec3d = new Vec3d(Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEyeHeight(), Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        GL11.glPushMatrix();
        this.Method20();
        GL11.glLineWidth((float)Float.intBitsToFloat(1072064102));
        GL11.glColor3d((double)this.Field11242, (double)this.Field11243, (double)this.Field11244);
        GL11.glBegin((int)3);
        double d2 = this.Method3159(Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getCurrentItem().getItem());
        int n = 0;
        while (true) {
            double d3 = this.Field11245 * 1.0 - Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosX;
            double d4 = this.Field11246 * 1.0 - Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosY;
            double d5 = this.Field11247 * 1.0 - Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosZ;
            GL11.glVertex3d((double)d3, (double)d4, (double)d5);
            this.Field11245 += this.Field11239;
            this.Field11246 += this.Field11241;
            this.Field11247 += this.Field11240;
            this.Field11239 *= Double.longBitsToDouble((long)1900998420 ^ 0x3FEFAE140BAFA8BAL);
            this.Field11241 *= Double.longBitsToDouble((long)2120782677 ^ 0x3FEFAE140489D4FBL);
            this.Field11240 *= Double.longBitsToDouble(4607092346807469998L);
            this.Field11241 -= d2;
            if (Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(vec3d, new Vec3d(this.Field11245, this.Field11246, this.Field11247)) != null) {
                GL11.glEnd();
                GL11.glTranslated((double)(this.Field11245 - Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosX), (double)(this.Field11246 - Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosY), (double)(this.Field11247 - Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosZ));
                GL11.glRotatef((float)Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, (float)0.0f, (float)((float)(this.Field11246 - Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosY)), (float)0.0f);
                GL11.glTranslated((double)(-(this.Field11245 - Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosX)), (double)(-(this.Field11246 - Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosY)), (double)(-(this.Field11247 - Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosZ)));
                this.Method3158();
                GL11.glPopMatrix();
                return;
            }
            ++n;
        }
    }

    public void Method20() {
        GL11.glDisable((int)2896);
        GL11.glEnable((int)2848);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glEnable((int)32925);
        GL11.glDepthMask((boolean)false);
    }

    public void Method3158() {
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDisable((int)32925);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)2848);
        GL11.glEnable((int)2896);
    }

    private double Method3159(Item item) {
        double d;
        if (item instanceof ItemBow) {
            d = Double.longBitsToDouble(4587366580439587226L);
            return d;
        }
        d = Double.longBitsToDouble(4584304132692975288L);
        return d;
    }

    private boolean Method3160(Item item) {
        if (item instanceof ItemBow) return true;
        if (item instanceof ItemSnowball) return true;
        if (item instanceof ItemEgg) return true;
        if (item instanceof ItemEnderPearl) return true;
        return false;
    }

    public void Method3161(float f, float f2, float f3, float f4, float f5, float f6) {
        GL11.glVertex3d((double)f, (double)f2, (double)f3);
        GL11.glVertex3d((double)f4, (double)f5, (double)f6);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 33;
            cArray2[n] = (char)(cArray[n] ^ (0x42F8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

