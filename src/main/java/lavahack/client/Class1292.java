//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.realmsclient.gui.ChatFormatting
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.gui.inventory.GuiInventory
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.math.MathHelper
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import com.kisman.cc.util.Class230;
import com.kisman.cc.util.Class650;
import com.mojang.realmsclient.gui.ChatFormatting;
import java.awt.Color;
import java.util.Iterator;
import java.util.Objects;
import lavahack.client.Class1172;
import lavahack.client.Class1178;
import lavahack.client.Class1249;
import lavahack.client.Class1311;
import lavahack.client.Class1696;
import lavahack.client.Class1796;
import lavahack.client.Class1996;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class447;
import lavahack.client.Class48;
import lavahack.client.Class753;
import lavahack.client.Class88;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class Class1292
extends Class1249 {
    private final Class650 Field13890 = new Class650();
    private double Field13891;
    private double Field13892;
    private double Field13893 = Double.longBitsToDouble(0x4014000000000000L);
    private final Class44 Field13894 = this.Method23(new Class44("Astolfo", (Class42)this, true));
    private final Class44 Field13895 = this.Method23(new Class44("Theme", (Class42)this, Class48.Field8138));
    private final Class1996 Field13896 = this.Method24(new Class1996(new Class44("Rewrite", this)));
    private final Class44 Field13897 = this.Method23(this.Field13896.Method7405(new Class44("Rewrite Shadow", (Class42)this, true).Method355("Shadow")));
    private final Class1996 Field13898 = this.Method24(new Class1996(new Class44("Noat", this)));
    private final Class1996 Field13899 = this.Method24(this.Field13898.Method7406(new Class1996(new Class44("Colors", this))));
    private final Class1996 Field13900 = this.Method24(this.Field13899.Method7406(new Class1996(new Class44("Sideway", this))));
    private final Class44 Field13901 = this.Method23(this.Field13899.Method7405(new Class44("Noat Background Color", (Class42)this, new Class2027(30, 30, 30, 150)).Method355("Background")));
    private final Class44 Field13902 = this.Method23(this.Field13900.Method7405(new Class44("Noat Sideway First Color", (Class42)this, new Class2027(218, 186, 255, 255)).Method355("First")));
    private final Class44 Field13903 = this.Method23(this.Field13900.Method7405(new Class44("Noat Sideway Second Color", (Class42)this, new Class2027(255, 208, 143, 255)).Method355("Second")));
    private final Class44 Field13904 = this.Method23(this.Field13898.Method7405(new Class44("Noat Font Mode", (Class42)this, Class1311.Field14032).Method355("Font Mode")));
    private int Field13905;

    public Class1292() {
        super("TargetHud", true);
        this.Method271(Double.longBitsToDouble((long)1598979281 ^ 0x407F40005F4E7CD1L));
        this.Method272(Double.longBitsToDouble(4643985272004935680L));
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method5244(RenderGameOverlayEvent.Text text) {
        EntityPlayer entityPlayer = Class1696.Field15860.Method6505();
        if (entityPlayer == null) {
            return;
        }
        String string = this.Field13895.Method359();
        int n = -1;
        switch (string.hashCode()) {
            case -1529165460: {
                if (!string.equals("Rewrite")) return;
                return;
            }
            case -531999850: {
                if (!string.equals("NoRules")) return;
                return;
            }
            case -1818419758: {
                if (!string.equals("Simple")) return;
                return;
            }
            case 961091784: {
                if (!string.equals("Astolfo")) return;
                return;
            }
            case 2433492: {
                if (!string.equals("Noat")) return;
                return;
            }
        }
    }

    private void Method5245(EntityPlayer entityPlayer) {
        GlStateManager.pushMatrix();
        Class753.drawRectWH(this.Method267(), this.Method268(), Double.longBitsToDouble(4639481672377565184L), Double.longBitsToDouble((long)1321080767 ^ 0x404900004EBE17BFL), this.Field13901.Method339().Method3626());
        Class753.drawFace(entityPlayer, (int)this.Method267() + 5, (int)this.Method268() + 5, 40, 40);
        Class753.drawGradientSidewaysWH(this.Method267() + Double.longBitsToDouble(0x4049000000000000L), this.Method268() + Double.longBitsToDouble((long)1603633179 ^ 0x404400005F95801BL), entityPlayer.getHealth() * Float.intBitsToFloat(1081711002), Double.longBitsToDouble(0x4014000000000000L), this.Field13902.Method339().Method3626(), this.Field13903.Method339().Method3626());
        this.Method5246(10).Method748(String.format("%.1f", Float.valueOf(entityPlayer.getHealth() + entityPlayer.getAbsorptionAmount())), (int)this.Method267() + 50 + (int)(entityPlayer.getHealth() * Float.intBitsToFloat(1081711002)) + 5, (int)this.Method268() + 40, -1);
        this.Method5246(30).Method748(entityPlayer.getName(), (int)this.Method267() + 50, (int)this.Method268() + 5, -1);
        int n = 0;
        Iterator iterator = entityPlayer.inventory.armorInventory.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                GlStateManager.popMatrix();
                this.Method273(Double.longBitsToDouble(4639481672377565184L));
                this.Method274(Double.longBitsToDouble(0x4049000000000000L));
                return;
            }
            ItemStack itemStack = (ItemStack)iterator.next();
            ++n;
            if (itemStack.isEmpty()) continue;
            int n2 = (int)(this.Method267() + Double.longBitsToDouble(0x4049000000000000L) - Double.longBitsToDouble((long)659889046 ^ 0x4056800027551B96L) + (double)((9 - n) * 20) + Double.longBitsToDouble(0x4000000000000000L));
            GlStateManager.pushMatrix();
            Class753.Field11203.setZLevel(Float.intBitsToFloat(1128792064));
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(itemStack, n2, (int)(this.Method268() + Double.longBitsToDouble((long)1512499617 ^ 0x403100005A26E9A1L)));
            Class753.Field11203.setZLevel(0.0f);
            GlStateManager.popMatrix();
        }
    }

    private Class88 Method5246(int n) {
        if (n != 10) return this.Method5247(Class1178.Field13320, Class1178.Field13309, Class1178.Field13316);
        return this.Method5247(Class1178.Field13323, Class1178.Field13313, Class1178.Field13319);
    }

    private Class88 Method5247(Class88 class88, Class88 class882, Class88 class883) {
        if (this.Field13904.Method341() == Class1311.Field14032) {
            return class88;
        }
        if (this.Field13904.Method341() != Class1311.Field14033) return class883;
        return class882;
    }

    private void Method5248(EntityPlayer entityPlayer) {
        Color color = this.Field13894.Method365() ? Class1172.Method4711(100, 100) : new Color(255, 0, 89);
        float f = (float)this.Method267();
        float f2 = (float)this.Method268();
        this.Method273(Double.longBitsToDouble((long)879848977 ^ 0x4063600034716E11L));
        this.Method274(Double.longBitsToDouble(0x404E000000000000L));
        double d = entityPlayer.getHealth() / entityPlayer.getMaxHealth() * Float.intBitsToFloat(1123024896);
        d = MathHelper.clamp((double)d, (double)0.0, (double)Double.longBitsToDouble((long)1730825908 ^ 0x405E0000672A4EB4L));
        double d2 = entityPlayer.getHealth() < Float.intBitsToFloat(1099956224) && entityPlayer.getHealth() > 1.0f ? Double.longBitsToDouble(0x4020000000000000L) : 0.0;
        this.Field13891 = Class230.Method1301(d, this.Field13891, Double.longBitsToDouble((long)191640295 ^ 0x3FA9999992F5AB7DL));
        Class753.drawRectWH(f, f2, Double.longBitsToDouble((long)2039845727 ^ 0x406360007995935FL), Double.longBitsToDouble(0x404E000000000000L), new Color(20, 20, 20, 200).getRGB());
        Class1292.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer.drawStringWithShadow(entityPlayer.getName(), f + Float.intBitsToFloat(1106247680), f2 + Float.intBitsToFloat(0x40800000), color.getRGB());
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)f, (float)f2, (float)1.0f);
        GlStateManager.scale((float)Float.intBitsToFloat(0x40200000), (float)Float.intBitsToFloat(0x40200000), (float)Float.intBitsToFloat(0x40200000));
        GlStateManager.translate((float)(-f - Float.intBitsToFloat(0x40400000)), (float)(-f2 - 2.0f), (float)1.0f);
        Class1292.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer.drawStringWithShadow(Math.round(entityPlayer.getHealth() / 2.0f) + " \u2764", f + Float.intBitsToFloat(1098907648), f2 + Float.intBitsToFloat(1092616192), color.getRGB());
        GlStateManager.popMatrix();
        GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemOverlays(Class1292.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer, entityPlayer.getHeldItemOffhand(), (int)f + 137, (int)f2 + 7);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemIntoGUI(entityPlayer.getHeldItemOffhand(), (int)f + 137, (int)f2 + 1);
        GL11.glEnable((int)2929);
        GuiInventory.drawEntityOnScreen((int)((int)f + 16), (int)((int)f2 + 55), (int)25, (float)entityPlayer.rotationYaw, (float)(-entityPlayer.rotationPitch), (EntityLivingBase)entityPlayer);
        Class753.drawRectWH(f + Float.intBitsToFloat(1106247680), f2 + Float.intBitsToFloat(0x42400000), Double.longBitsToDouble((long)102112444 ^ 0x405E000006161CBCL), Double.longBitsToDouble((long)948116671 ^ 0x4020000038831CBFL), color.darker().darker().darker().getRGB());
        Class753.drawRectWH(f + Float.intBitsToFloat(1106247680), f2 + Float.intBitsToFloat(0x42400000), (float)(this.Field13891 + d2), Double.longBitsToDouble(0x4020000000000000L), color.darker().getRGB());
        Class753.drawRectWH(f + Float.intBitsToFloat(1106247680), f2 + Float.intBitsToFloat(0x42400000), (float)d, Double.longBitsToDouble(0x4020000000000000L), color.getRGB());
    }

    private void Method5249(EntityPlayer entityPlayer) {
        int n = (int)this.Method267();
        int n2 = (int)this.Method268();
        this.Method273(Double.longBitsToDouble(4627730092099895296L) + this.Field13893 * Double.longBitsToDouble(0x4000000000000000L) + (double)Class1178.Method4741(entityPlayer.getName()));
        this.Method274(Double.longBitsToDouble(4627730092099895296L));
        int n3 = (int)this.Method269();
        int n4 = (int)this.Method270();
        Class753.drawRect((int)n, (int)n2, (int)(n + n3), (int)(n2 + n4), (int)new Color(0, 0, 0, 170).getRGB());
        GL11.glPushMatrix();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getTextureManager().bindTexture(Objects.requireNonNull(Class1292.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.connection.getPlayerInfo(entityPlayer.getName())).getLocationSkin());
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        Gui.drawScaledCustomSizeModalRect((int)n, (int)n2, (float)Float.intBitsToFloat(0x41000000), (float)Float.intBitsToFloat(0x41000000), (int)8, (int)8, (int)25, (int)25, (float)Float.intBitsToFloat(1115684864), (float)Float.intBitsToFloat(1115684864));
        GL11.glPopMatrix();
        Class1178.Method4745(entityPlayer.getName(), (double)n + this.Field13893 + Double.longBitsToDouble(4627730092099895296L), (double)n2 + this.Field13893, -1);
        Class753.drawRectWH((double)n + this.Field13893 + Double.longBitsToDouble((long)995970232 ^ 0x403900003B5D4CB8L), (double)(n2 + n4) - this.Field13893 - Double.longBitsToDouble(4619567317775286272L), entityPlayer.getHealth() / entityPlayer.getMaxHealth() * (float)Class1178.Method4741(entityPlayer.getName()), Double.longBitsToDouble(4619567317775286272L), -1);
    }

    private void Method5250(EntityPlayer entityPlayer, double d, double d2, double d3, double d4) {
        this.Method273(d3);
        this.Method274(d4);
        double d5 = (entityPlayer.getHealth() + entityPlayer.getAbsorptionAmount() - 0.0f) / (entityPlayer.getMaxHealth() - 0.0f);
        this.Field13891 += (d5 - this.Field13891) / Double.longBitsToDouble(0x4010000000000000L);
        Class753.drawRoundedRect2(d, d2, d3, d4, Double.longBitsToDouble(4618441417868443648L), new Class2027(20, 20, 20, 210).Method3626());
        Class753.drawRoundedRect2(d + Double.longBitsToDouble((long)1173847299 ^ 0x4000000045F77D03L), d2 + (d4 / Double.longBitsToDouble((long)1845446154 ^ 0x400000006DFF460AL) - Double.longBitsToDouble((long)47703990 ^ 0x4031000002D7E7B6L)) - Double.longBitsToDouble(0x4008000000000000L), Double.longBitsToDouble((long)145106170 ^ 0x4044000008A624FAL), Double.longBitsToDouble((long)1729942638 ^ 0x40440000671CD46EL), Double.longBitsToDouble(4618441417868443648L), 1079465558);
        Class753.drawRoundedRect2(d + Double.longBitsToDouble(4631530004285489152L), d2 + Double.longBitsToDouble((long)1234040221 ^ 0x40100000498DF59DL), d3 - Double.longBitsToDouble((long)1316358200 ^ 0x404880004E760838L), Double.longBitsToDouble((long)381123063 ^ 0x403E000016B779F7L), Double.longBitsToDouble((long)1367488593 ^ 0x4018000051823851L), 1079465558);
        Class1178.Method4745("Name: " + ChatFormatting.GRAY + entityPlayer.getName(), d + Double.longBitsToDouble((long)1738490548 ^ 0x40478000679F42B4L), d2 + Double.longBitsToDouble(0x4010000000000000L), -1);
        Class1178.Method4745("Distance: " + ChatFormatting.GRAY + Class447.Method2126(Class1292.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getDistance((Entity)entityPlayer), 2), d + Double.longBitsToDouble(4631811479262199808L), d2 + Double.longBitsToDouble(4623507967449235456L), -1);
        Class1178.Method4745("Ping: " + ChatFormatting.GRAY + (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.isSingleplayer() ? 0 : Class1796.Field16241.Field16275.Method7401()) + " ms", d + Double.longBitsToDouble((long)982160197 ^ 0x404780003A8A9345L), d2 + Double.longBitsToDouble((long)1082507476 ^ 0x403680004085C0D4L), -1);
        Class753.drawRoundedRect2(d + Double.longBitsToDouble(4631530004285489152L), d2 + d4 - Double.longBitsToDouble((long)1812662911 ^ 0x403000006C0B0A7FL), d3 - Double.longBitsToDouble(0x4048800000000000L), Double.longBitsToDouble(0x4024000000000000L), Double.longBitsToDouble(4618441417868443648L), 1079465558);
        Class753.drawRoundedRect2(d + Double.longBitsToDouble(4631811479262199808L), d2 + d4 - Double.longBitsToDouble(4622945017495814144L), Double.longBitsToDouble((long)291355270 ^ 0x4057C000115DBA86L) * this.Field13891, Double.longBitsToDouble((long)1267335691 ^ 0x400800004B8A020BL), Double.longBitsToDouble((long)728612101 ^ 0x401000002B6DBD05L), Class1172.Method4706(entityPlayer.getHealth() + entityPlayer.getAbsorptionAmount(), entityPlayer.getMaxHealth()).Method3626());
        GL11.glEnable((int)2929);
        GuiInventory.drawEntityOnScreen((int)((int)d + 21), (int)((int)(d2 + Double.longBitsToDouble((long)551582149 ^ 0x4046000020E079C5L))), (int)18, (float)Float.intBitsToFloat(-1041235968), (float)(-entityPlayer.rotationPitch), (EntityLivingBase)entityPlayer);
    }

    private void Method5251(EntityPlayer entityPlayer) {
        double d = this.Method267();
        double d2 = this.Method268();
        this.Method273(Double.longBitsToDouble(4638144666238189568L));
        double d3 = this.Method269();
        double d4 = d3 - this.Field13893 * Double.longBitsToDouble((long)1839819747 ^ 0x400000006DA96BE3L);
        double d5 = 4 + Class1178.Method4748() * 2;
        this.Method274(this.Field13893 * Double.longBitsToDouble(0x4010000000000000L) + (double)Class1178.Method4748() + d5 * Double.longBitsToDouble((long)1564569381 ^ 0x400000005D416F25L) + Double.longBitsToDouble((long)391262972 ^ 0x40280000175232FCL) + Double.longBitsToDouble(4628293042053316608L));
        double d6 = this.Method270();
        int n = 0;
        Class753.drawRect(d + Double.longBitsToDouble(0x4008000000000000L), d2 + Double.longBitsToDouble((long)1780770720 ^ 0x400800006A2467A0L), d + d3 + Double.longBitsToDouble(0x4008000000000000L), d2 + d6 - Double.longBitsToDouble(0x4008000000000000L), Class1172.Method4718(33, 33, 42));
        Class753.drawRect(d + Double.longBitsToDouble(0x4008000000000000L), d2, d + d3 + Double.longBitsToDouble(0x4008000000000000L), d2 + d6, Class1172.Method4718(33, 33, 42));
        Class753.drawRect(d + Double.longBitsToDouble(0x4000000000000000L), d2 + Double.longBitsToDouble((long)450439365 ^ 0x400000001AD928C5L), d + d3 + Double.longBitsToDouble(0x4000000000000000L), d2 + d6 - Double.longBitsToDouble((long)463348075 ^ 0x400000001B9E216BL), Class1172.Method4718(45, 45, 55));
        Class753.drawRect(d + Double.longBitsToDouble((long)312306114 ^ 0x40000000129D69C2L), d2, d + d3 + Double.longBitsToDouble(0x4000000000000000L), d2 + d6, Class1172.Method4718(45, 45, 55));
        Class753.drawRect(d + 1.0, d2 + 1.0, d + d3 + 1.0, d2 + d6 - 1.0, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(d + 1.0, d2, d + d3 + 1.0, d2 + d6, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(d - Double.longBitsToDouble((long)962570006 ^ 0x40080000395FA716L), d2 - Double.longBitsToDouble(0x4020000000000000L), d + d3 + Double.longBitsToDouble(0x4008000000000000L), d2 + d6 - Double.longBitsToDouble(0x4008000000000000L), Class1172.Method4718(33, 33, 42));
        Class753.drawRect(d - Double.longBitsToDouble(0x4008000000000000L), d2, d + d3 + Double.longBitsToDouble((long)1364473303 ^ 0x40080000515435D7L), d2 + d6, Class1172.Method4718(33, 33, 42));
        Class753.drawRect(d - Double.longBitsToDouble((long)658434657 ^ 0x40000000273EEA61L), d2 - Double.longBitsToDouble(4619567317775286272L), d + d3 + Double.longBitsToDouble(0x4000000000000000L), d2 + d6 - Double.longBitsToDouble(0x4000000000000000L), Class1172.Method4718(45, 45, 55));
        Class753.drawRect(d - Double.longBitsToDouble(0x4000000000000000L), d2, d + d3 + Double.longBitsToDouble((long)1784026446 ^ 0x400000006A56154EL), d2 + d6, Class1172.Method4718(45, 45, 55));
        Class753.drawRect(d - 1.0, d2 - Double.longBitsToDouble((long)2127033950 ^ 0x401800007EC7F65EL), d + d3 + 1.0, d2 + d6 - 1.0, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(d - 1.0, d2, d + d3 + 1.0, d2 + d6, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(d, d2 - Double.longBitsToDouble(0x4014000000000000L), d + d3, d2 + d6, Class1172.Method4709(100, 100));
        Class753.drawRect(d - Double.longBitsToDouble(0x4008000000000000L), d2 - 1.0, d + d3 + Double.longBitsToDouble(0x4008000000000000L), d2 + d6 + Double.longBitsToDouble((long)1982770438 ^ 0x40080000762EAD06L), Class1172.Method4718(33, 33, 42));
        Class753.drawRect(d - Double.longBitsToDouble(0x4000000000000000L), d2 - Double.longBitsToDouble((long)1148510823 ^ 0x400000004474E267L), d + d3 + Double.longBitsToDouble((long)0x166EEE66 ^ 0x40000000166EEE66L), d2 + d6 + Double.longBitsToDouble(0x4000000000000000L), Class1172.Method4718(45, 45, 55));
        Class753.drawRect(d - 1.0, d2 - Double.longBitsToDouble((long)1252626254 ^ 0x400800004AA98F4EL), d + d3 + 1.0, d2 + d6 + 1.0, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(d, d2 - Double.longBitsToDouble((long)535068603 ^ 0x401000001FE47FBBL), d + d3, d2 + d6, Class1172.Method4718(34, 34, 40));
        Class1178.Method4746(entityPlayer.getName(), d + d3 / Double.longBitsToDouble((long)519649620 ^ 0x400000001EF93954L), d2 + this.Field13893, Class1172.Method4709(100, 100));
        Class753.drawRect(d + this.Field13893, d2 + this.Field13893 * Double.longBitsToDouble(0x4008000000000000L) + (double)Class1178.Method4748(), d + this.Field13893 + Double.longBitsToDouble((long)15561920 ^ 0x403B000000ED74C0L), d2 + this.Field13893 * Double.longBitsToDouble((long)2084834106 ^ 0x400800007C440B3AL) + (double)Class1178.Method4748() + Double.longBitsToDouble(4628293042053316608L), Class1172.Method4709(100, 100));
        GL11.glPushMatrix();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getTextureManager().bindTexture(leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getConnection().getPlayerInfo(entityPlayer.getName()).getLocationSkin());
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        Gui.drawScaledCustomSizeModalRect((int)((int)(d + this.Field13893 + 1.0)), (int)((int)(d2 + this.Field13893 * Double.longBitsToDouble((long)1990056137 ^ 0x40080000769DD8C9L) + (double)Class1178.Method4748() + 1.0)), (float)Float.intBitsToFloat(0x41000000), (float)Float.intBitsToFloat(0x41000000), (int)8, (int)8, (int)25, (int)25, (float)Float.intBitsToFloat(1115684864), (float)Float.intBitsToFloat(1115684864));
        GL11.glPopMatrix();
        Class1178.Method4744("Health: " + (int)entityPlayer.getHealth(), d + this.Field13893 + Double.longBitsToDouble((long)694772145 ^ 0x403B0000296961B1L) + Double.longBitsToDouble(0x4010000000000000L), d2 + this.Field13893 * Double.longBitsToDouble((long)1387238012 ^ 0x4008000052AF927CL) + (double)Class1178.Method4748(), Class1172.Method4709(100, 100));
        Class1178.Method4744("Distance: " + (int)Class1292.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getDistance((Entity)entityPlayer), d + this.Field13893 + Double.longBitsToDouble((long)677547044 ^ 0x403B000028628C24L) + Double.longBitsToDouble((long)45585021 ^ 0x4010000002B7927DL), d2 + this.Field13893 * Double.longBitsToDouble(0x4008000000000000L) + (double)(Class1178.Method4748() * 2) + Double.longBitsToDouble((long)877723927 ^ 0x4000000034510117L), Class1172.Method4709(100, 100));
        Class1178.Method4744("On Ground: " + entityPlayer.onGround, d + this.Field13893 + Double.longBitsToDouble(4628293042053316608L) + Double.longBitsToDouble(0x4010000000000000L), d2 + this.Field13893 * Double.longBitsToDouble(0x4008000000000000L) + (double)(Class1178.Method4748() * 3) + Double.longBitsToDouble(0x4010000000000000L), Class1172.Method4709(100, 100));
        double d7 = d + this.Field13893;
        for (ItemStack itemStack : entityPlayer.getArmorInventoryList()) {
            if (itemStack.isEmpty) continue;
            GL11.glPushMatrix();
            GL11.glTranslated((double)d7, (double)(d2 + this.Field13893 * Double.longBitsToDouble((long)1521690082 ^ 0x400800005AB325E2L) + (double)Class1178.Method4748() + Double.longBitsToDouble(4628293042053316608L) + Double.longBitsToDouble(4602678819172646912L)), (double)0.0);
            GL11.glScaled((double)Double.longBitsToDouble((long)1860159631 ^ 0x3FE99999F7465115L), (double)Double.longBitsToDouble(4605380978949069210L), (double)Double.longBitsToDouble(4605380978949069210L));
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemIntoGUI(itemStack, 0, 0);
            GL11.glPopMatrix();
            d7 += Double.longBitsToDouble(4622945017495814144L);
        }
        if (!entityPlayer.getHeldItemMainhand().isEmpty) {
            GL11.glPushMatrix();
            GL11.glTranslated((double)d7, (double)(d2 + this.Field13893 * Double.longBitsToDouble((long)496568014 ^ 0x400800001D9906CEL) + (double)Class1178.Method4748() + Double.longBitsToDouble(4628293042053316608L) + Double.longBitsToDouble(4602678819172646912L)), (double)0.0);
            GL11.glScaled((double)Double.longBitsToDouble((long)1436153261 ^ 0x3FE99999CC006C37L), (double)Double.longBitsToDouble((long)328881001 ^ 0x3FE999998A03CAF3L), (double)Double.longBitsToDouble((long)15862397 ^ 0x3FE99999996B93E7L));
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemIntoGUI(entityPlayer.getHeldItemMainhand(), 0, 0);
            GL11.glPopMatrix();
            d7 += Double.longBitsToDouble(4622945017495814144L);
        }
        if (!entityPlayer.getHeldItemOffhand().isEmpty) {
            GL11.glPushMatrix();
            GL11.glTranslated((double)d7, (double)(d2 + this.Field13893 * Double.longBitsToDouble((long)1842977999 ^ 0x400800006DD99CCFL) + (double)Class1178.Method4748() + Double.longBitsToDouble(4628293042053316608L) + Double.longBitsToDouble(4602678819172646912L)), (double)0.0);
            GL11.glScaled((double)Double.longBitsToDouble((long)1996697381 ^ 0x3FE99999EE9AB6BFL), (double)Double.longBitsToDouble((long)2138533633 ^ 0x3FE99999E6EEF69BL), (double)Double.longBitsToDouble((long)1297789029 ^ 0x3FE99999D4C329FFL));
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemIntoGUI(entityPlayer.getHeldItemOffhand(), 0, 0);
            GL11.glPopMatrix();
        }
        double d8 = MathHelper.clamp((double)entityPlayer.getCooledAttackStrength(0.0f), (double)Double.longBitsToDouble((long)22942200 ^ 0x3FB9999998C78862L), (double)1.0);
        this.Field13892 = Class230.Method1301(d8 * d4, this.Field13892, Double.longBitsToDouble((long)1868126548 ^ 0x3FA99999F6C0C0CEL));
        Class1178.Method4745("Cooldown", d + this.Field13893, d2 + this.Field13893 * Double.longBitsToDouble((long)935782247 ^ 0x4008000037C6E767L) + (double)Class1178.Method4748() + Double.longBitsToDouble((long)1022576889 ^ 0x403B00003CF348F9L) + Double.longBitsToDouble(0x4010000000000000L) + Double.longBitsToDouble((long)241748248 ^ 0x402800000E68C918L), Class1172.Method4709(100, 100));
        this.Method5252(d + this.Field13893, d2 + this.Field13893 * Double.longBitsToDouble((long)1758041059 ^ 0x4008000068C993E3L) + (double)(Class1178.Method4748() * 2) + Double.longBitsToDouble(4628293042053316608L) + Double.longBitsToDouble(4618441417868443648L) + Double.longBitsToDouble(4622945017495814144L), this.Field13892, Class1178.Method4748());
        ++n;
        if (this.Field13890.Method2797(15L)) {
            this.Field13891 = Class230.Method1301((double)(entityPlayer.getHealth() / entityPlayer.getMaxHealth()) * d4, this.Field13891, Double.longBitsToDouble((long)1028258047 ^ 0x3FA99999A4D06165L));
            this.Field13890.Method2801();
        }
        Class1178.Method4745("Health", d + this.Field13893, d2 + this.Field13893 * Double.longBitsToDouble((long)1140496003 ^ 0x4008000043FA9683L) + (double)Class1178.Method4748() + Double.longBitsToDouble(4628293042053316608L) + Double.longBitsToDouble((long)166546024 ^ 0x4010000009ED4A68L) + (double)n * d5 + Double.longBitsToDouble((long)264971255 ^ 0x402800000FCB23F7L), Class1172.Method4709(100, 100));
        this.Method5252(d + this.Field13893, d2 + this.Field13893 * Double.longBitsToDouble((long)438130558 ^ 0x400800001A1D577EL) + (double)(Class1178.Method4748() * 2) + Double.longBitsToDouble((long)209086661 ^ 0x403B00000C7668C5L) + Double.longBitsToDouble((long)175337875 ^ 0x401800000A737193L) + (double)n * d5 + Double.longBitsToDouble(4622945017495814144L), this.Field13891, Class1178.Method4748());
    }

    private void Method5252(double d, double d2, double d3, double d4) {
        if (this.Field13897.Method365()) {
            Class753.drawShadowSliders(d, d2, d3, d4, Class1172.Method4709(100, 100), 1.0);
            return;
        }
        Class753.drawRect(d, d2, d + d3, d2 + d4, Class1172.Method4709(100, 100));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 21;
            cArray2[n] = (char)(cArray[n] ^ (0x3631 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

