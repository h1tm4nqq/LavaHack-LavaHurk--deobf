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

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
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
public class wW1EkHErwIohTW7pX9up9gwYLutBotqs
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
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

    public wW1EkHErwIohTW7pX9up9gwYLutBotqs() {
        super("TrajectoriesRewrite", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method3157(RenderWorldLastEvent renderWorldLastEvent) {
        EntityPlayerSP entityPlayerSP = wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
        if (entityPlayerSP.inventory.getCurrentItem() == null) return;
        if (!this.Method3160(entityPlayerSP.inventory.getCurrentItem().getItem())) return;
        this.Field11245 = entityPlayerSP.lastTickPosX + (entityPlayerSP.posX - entityPlayerSP.lastTickPosX) * (double)wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks - (double)(MathHelper.cos((float)((float)Math.toRadians(wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw))) * Float.intBitsToFloat((int)1750508586L ^ 0x56757320));
        this.Field11246 = wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastTickPosY + (wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastTickPosY) * (double)wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks + (double)wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEyeHeight() - Double.longBitsToDouble((long)745640762 ^ 0x3FB9A35DB5E839D1L);
        this.Field11247 = wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastTickPosZ + (wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastTickPosZ) * (double)wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks - (double)(MathHelper.sin((float)((float)Math.toRadians(wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw))) * Float.intBitsToFloat((int)((long)80155506 ^ (long)988071032)));
        float f = 1.0f;
        if (!(wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getCurrentItem().getItem() instanceof ItemBow)) {
            f = Float.intBitsToFloat((int)((long)490773131 ^ (long)596399686));
        }
        this.Field11239 = -MathHelper.sin((float)((float)Math.toRadians(wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw))) * MathHelper.cos((float)((float)Math.toRadians(wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch))) * f;
        this.Field11240 = MathHelper.cos((float)((float)Math.toRadians(wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw))) * MathHelper.cos((float)((float)Math.toRadians(wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch))) * f;
        this.Field11241 = -MathHelper.sin((float)((float)Math.toRadians(wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch))) * f;
        double d = Math.sqrt(this.Field11239 * this.Field11239 + this.Field11241 * this.Field11241 + this.Field11240 * this.Field11240);
        this.Field11239 /= d;
        this.Field11241 /= d;
        this.Field11240 /= d;
        if (wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getCurrentItem().getItem() instanceof ItemBow) {
            float f2 = (float)((((int)-366463947L ^ 0xEA283050) << 6) - wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemInUseCount()) / Float.intBitsToFloat(0x74A84F2D ^ 0x35084F2D);
            if ((f2 = (f2 * f2 + f2 * 2.0f) / Float.intBitsToFloat((int)((long)804606229 ^ (long)1874153749))) > 1.0f) {
                f2 = 1.0f;
            }
            if (f2 <= Float.intBitsToFloat((int)((long)1337888317 ^ (long)1920090864))) {
                f2 = 1.0f;
            }
            f2 *= 2.0f;
            this.Field11239 *= (double)(f2 *= Float.intBitsToFloat(0x443FF59A ^ 0x7BFFF59A));
            this.Field11241 *= (double)f2;
            this.Field11240 *= (double)f2;
        } else {
            this.Field11239 *= Double.longBitsToDouble(0x648C077C376E026EL ^ 0x5B74077C376E026EL);
            this.Field11241 *= Double.longBitsToDouble(0x7A2EF75F7381C90BL ^ 0x45D6F75F7381C90BL);
            this.Field11240 *= Double.longBitsToDouble(0x57EFCD9ADA27F31EL ^ 0x6817CD9ADA27F31EL);
        }
        Vec3d vec3d = new Vec3d(wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEyeHeight(), wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        GL11.glPushMatrix();
        this.Method20();
        GL11.glLineWidth((float)Float.intBitsToFloat((int)1008750984L ^ 0x3C637EE));
        GL11.glColor3d((double)this.Field11242, (double)this.Field11243, (double)this.Field11244);
        GL11.glBegin((int)((int)((long)1423873402 ^ (long)1423873401)));
        double d2 = this.Method3159(wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getCurrentItem().getItem());
        int n = (int)((long)-1981753872 ^ (long)-1981753872);
        while (true) {
            int cfr_ignored_0 = (int)((long)-633723612 ^ (long)-633723559) << 3;
            double d3 = this.Field11245 * 1.0 - wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosX;
            double d4 = this.Field11246 * 1.0 - wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosY;
            double d5 = this.Field11247 * 1.0 - wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosZ;
            GL11.glVertex3d((double)d3, (double)d4, (double)d5);
            this.Field11245 += this.Field11239;
            this.Field11246 += this.Field11241;
            this.Field11247 += this.Field11240;
            this.Field11239 *= Double.longBitsToDouble((long)1900998420 ^ 0x3FEFAE140BAFA8BAL);
            this.Field11241 *= Double.longBitsToDouble((long)2120782677 ^ 0x3FEFAE140489D4FBL);
            this.Field11240 *= Double.longBitsToDouble(0xC13F45EB7267DDBDL ^ 0xFED0EBFF08869A13L);
            this.Field11241 -= d2;
            if (wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(vec3d, new Vec3d(this.Field11245, this.Field11246, this.Field11247)) != null) {
                GL11.glEnd();
                GL11.glTranslated((double)(this.Field11245 - wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosX), (double)(this.Field11246 - wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosY), (double)(this.Field11247 - wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosZ));
                GL11.glRotatef((float)wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, (float)0.0f, (float)((float)(this.Field11246 - wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosY)), (float)0.0f);
                GL11.glTranslated((double)(-(this.Field11245 - wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosX)), (double)(-(this.Field11246 - wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosY)), (double)(-(this.Field11247 - wW1EkHErwIohTW7pX9up9gwYLutBotqs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosZ)));
                this.Method3158();
                GL11.glPopMatrix();
                return;
            }
            ++n;
        }
    }

    public void Method20() {
        GL11.glDisable((int)((int)((long)-501178288 ^ (long)-501178139) << 4));
        GL11.glEnable((int)(((int)-2025642855L ^ 0x874324C0) << 5));
        GL11.glBlendFunc((int)((int)((long)-759507792 ^ (long)-759507663) << 1), (int)((int)353984618L ^ 0x15196369));
        GL11.glEnable((int)((int)((long)-2026485218 ^ (long)-2026483729) << 1));
        GL11.glDisable((int)((int)893411304L ^ 0x35405209));
        GL11.glDisable((int)((int)309969469L ^ 0x1279C94C));
        GL11.glEnable((int)((int)((long)-1312798827 ^ (long)-1312766200)));
        GL11.glDepthMask((boolean)((long)1481448848 ^ (long)1481448848));
    }

    public void Method3158() {
        GL11.glDisable((int)(((int)-435163412L ^ 0xE60FEB1D) << 1));
        GL11.glEnable((int)((int)((long)14877935 ^ (long)14878990)));
        GL11.glEnable((int)((int)2087552048L ^ 0x7C6D8F41));
        GL11.glDisable((int)((int)((long)-1582324156 ^ (long)-1582356775)));
        GL11.glDepthMask((boolean)((long)-1910995445 ^ (long)-1910995446));
        GL11.glDisable((int)((int)((long)-1438163069 ^ (long)-1438162982) << 5));
        GL11.glEnable((int)((int)((long)301061569 ^ (long)301061492) << 4));
    }

    private double Method3159(Item item) {
        double d;
        if (item instanceof ItemBow) {
            d = Double.longBitsToDouble(0x523E8CE2BDCDFC8EL ^ 0x6D97157B24546514L);
            return d;
        }
        d = Double.longBitsToDouble(0x89BEDDF84DD444A0L ^ 0xB62065A9A6515A18L);
        return d;
    }

    private boolean Method3160(Item item) {
        int n;
        if (!(item instanceof ItemBow || item instanceof ItemSnowball || item instanceof ItemEgg || item instanceof ItemEnderPearl)) {
            n = (int)206276191L ^ 0xC4B865F;
            return n != 0;
        }
        n = (int)-1484588668L ^ 0xA782F985;
        return n != 0;
    }

    public void Method3161(float f, float f2, float f3, float f4, float f5, float f6) {
        GL11.glVertex3d((double)f, (double)f2, (double)f3);
        GL11.glVertex3d((double)f4, (double)f5, (double)f6);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)842019456L ^ 0x32303280;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-790510545 ^ (long)-790510384);
            int n2 = (int)-2028532944L ^ 0x87170B11;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-2094058354 ^ (long)-2094056239) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

