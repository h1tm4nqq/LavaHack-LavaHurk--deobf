//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.entity.player.*;
import net.minecraft.client.renderer.*;
import net.minecraft.item.*;
import java.awt.*;
import net.minecraft.util.math.*;
import com.kisman.cc.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.client.network.*;
import java.util.*;
import net.minecraft.client.gui.*;
import com.mojang.realmsclient.gui.*;
import net.minecraft.entity.*;

public class Class1292 extends Class1249
{
    private final Class650 Field13890;
    private double Field13891;
    private double Field13892;
    private double Field13893;
    private final Class44 Field13894;
    private final Class44 Field13895;
    private final Class1996 Field13896;
    private final Class44 Field13897;
    private final Class1996 Field13898;
    private final Class1996 Field13899;
    private final Class1996 Field13900;
    private final Class44 Field13901;
    private final Class44 Field13902;
    private final Class44 Field13903;
    private final Class44 Field13904;
    private int Field13905;
    
    public Class1292() {
        super("TargetHud", true);
        this.Field13890 = new Class650();
        this.Field13893 = Double.longBitsToDouble(4617315517961601024L);
        this.Field13894 = this.Method23(new Class44("Astolfo", (Class42)this, true));
        this.Field13895 = this.Method23(new Class44("Theme", (Class42)this, Class48.Field8138));
        this.Field13896 = this.Method24(new Class1996(new Class44("Rewrite", (Class42)this)));
        this.Field13897 = this.Method23(this.Field13896.Method7405(new Class44("Rewrite Shadow", (Class42)this, true).Method355("Shadow")));
        this.Field13898 = this.Method24(new Class1996(new Class44("Noat", (Class42)this)));
        this.Field13899 = this.Method24(this.Field13898.Method7406(new Class1996(new Class44("Colors", (Class42)this))));
        this.Field13900 = this.Method24(this.Field13899.Method7406(new Class1996(new Class44("Sideway", (Class42)this))));
        this.Field13901 = this.Method23(this.Field13899.Method7405(new Class44("Noat Background Color", (Class42)this, new Class2027(30, 30, 30, 150)).Method355("Background")));
        this.Field13902 = this.Method23(this.Field13900.Method7405(new Class44("Noat Sideway First Color", (Class42)this, new Class2027(218, 186, 255, 255)).Method355("First")));
        this.Field13903 = this.Method23(this.Field13900.Method7405(new Class44("Noat Sideway Second Color", (Class42)this, new Class2027(255, 208, 143, 255)).Method355("Second")));
        this.Field13904 = this.Method23(this.Field13898.Method7405(new Class44("Noat Font Mode", (Class42)this, Class1311.Field14032).Method355("Font Mode")));
        this.Method271(Double.longBitsToDouble((long)1598979281 ^ 0x407F40005F4E7CD1L));
        this.Method272(Double.longBitsToDouble(4643985272004935680L));
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method5244(final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        if (Class1696.Field15860.Method6505() == null) {
            return;
        }
        final String method359 = this.Field13895.Method359();
        switch (method359.hashCode()) {
            case -1529165460: {
                if (method359.equals("Rewrite")) {
                    break;
                }
                break;
            }
            case -531999850: {
                if (method359.equals("NoRules")) {
                    break;
                }
                break;
            }
            case -1818419758: {
                if (method359.equals("Simple")) {
                    break;
                }
                break;
            }
            case 961091784: {
                if (method359.equals("Astolfo")) {
                    break;
                }
                break;
            }
            case 2433492: {
                if (method359.equals("Noat")) {
                    break;
                }
                break;
            }
        }
    }
    
    private void Method5245(final EntityPlayer entityPlayer) {
        GlStateManager.pushMatrix();
        Class753.drawRectWH(this.Method267(), this.Method268(), Double.longBitsToDouble(4639481672377565184L), Double.longBitsToDouble((long)1321080767 ^ 0x404900004EBE17BFL), this.Field13901.Method339().Method3626());
        Class753.drawFace(entityPlayer, (int)this.Method267() + 5, (int)this.Method268() + 5, 40, 40);
        Class753.drawGradientSidewaysWH(this.Method267() + Double.longBitsToDouble(4632233691727265792L), this.Method268() + Double.longBitsToDouble((long)1603633179 ^ 0x404400005F95801BL), entityPlayer.getHealth() * Float.intBitsToFloat(1081711002), Double.longBitsToDouble(4617315517961601024L), this.Field13902.Method339().Method3626(), this.Field13903.Method339().Method3626());
        this.Method5246(10).Method748(String.format("%.1f", entityPlayer.getHealth() + entityPlayer.getAbsorptionAmount()), (int)this.Method267() + 50 + (int)(entityPlayer.getHealth() * Float.intBitsToFloat(1081711002)) + 5, (int)this.Method268() + 40, -1);
        this.Method5246(30).Method748(entityPlayer.getName(), (int)this.Method267() + 50, (int)this.Method268() + 5, -1);
        int n = 0;
        for (final ItemStack itemStack : entityPlayer.inventory.armorInventory) {
            ++n;
            if (itemStack.isEmpty()) {
                continue;
            }
            final int n2 = (int)(this.Method267() + Double.longBitsToDouble(4632233691727265792L) - Double.longBitsToDouble((long)659889046 ^ 0x4056800027551B96L) + (9 - n) * 20 + Double.longBitsToDouble(4611686018427387904L));
            GlStateManager.pushMatrix();
            Class753.Field11203.setZLevel(Float.intBitsToFloat(1128792064));
            Class1292.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(itemStack, n2, (int)(this.Method268() + Double.longBitsToDouble((long)1512499617 ^ 0x403100005A26E9A1L)));
            Class753.Field11203.setZLevel(0.0f);
            GlStateManager.popMatrix();
        }
        GlStateManager.popMatrix();
        this.Method273(Double.longBitsToDouble(4639481672377565184L));
        this.Method274(Double.longBitsToDouble(4632233691727265792L));
    }
    
    private Class88 Method5246(final int n) {
        if (n == 10) {
            return this.Method5247(Class1178.Field13323, Class1178.Field13313, Class1178.Field13319);
        }
        return this.Method5247(Class1178.Field13320, Class1178.Field13309, Class1178.Field13316);
    }
    
    private Class88 Method5247(final Class88 class88, final Class88 class89, final Class88 class90) {
        if (this.Field13904.Method341() == Class1311.Field14032) {
            return class88;
        }
        if (this.Field13904.Method341() == Class1311.Field14033) {
            return class89;
        }
        return class90;
    }
    
    private void Method5248(final EntityPlayer entityPlayer) {
        final Color color = this.Field13894.Method365() ? Class1172.Method4711(100, 100) : new Color(255, 0, 89);
        final float n = (float)this.Method267();
        final float n2 = (float)this.Method268();
        this.Method273(Double.longBitsToDouble((long)879848977 ^ 0x4063600034716E11L));
        this.Method274(Double.longBitsToDouble(4633641066610819072L));
        final double clamp = MathHelper.clamp((double)(entityPlayer.getHealth() / entityPlayer.getMaxHealth() * Float.intBitsToFloat(1123024896)), 0.0, Double.longBitsToDouble((long)1730825908 ^ 0x405E0000672A4EB4L));
        final double n3 = (entityPlayer.getHealth() < Float.intBitsToFloat(1099956224) && entityPlayer.getHealth() > 1.0f) ? Double.longBitsToDouble(4620693217682128896L) : 0.0;
        this.Field13891 = Class230.Method1301(clamp, this.Field13891, Double.longBitsToDouble((long)191640295 ^ 0x3FA9999992F5AB7DL));
        Class753.drawRectWH(n, n2, Double.longBitsToDouble((long)2039845727 ^ 0x406360007995935FL), Double.longBitsToDouble(4633641066610819072L), new Color(20, 20, 20, 200).getRGB());
        Class1292.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer.drawStringWithShadow(entityPlayer.getName(), n + Float.intBitsToFloat(1106247680), n2 + Float.intBitsToFloat(1082130432), color.getRGB());
        GlStateManager.pushMatrix();
        GlStateManager.translate(n, n2, 1.0f);
        GlStateManager.scale(Float.intBitsToFloat(1075838976), Float.intBitsToFloat(1075838976), Float.intBitsToFloat(1075838976));
        GlStateManager.translate(-n - Float.intBitsToFloat(1077936128), -n2 - 2.0f, 1.0f);
        Class1292.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer.drawStringWithShadow(Math.round(entityPlayer.getHealth() / 2.0f) + " \u2764", n + Float.intBitsToFloat(1098907648), n2 + Float.intBitsToFloat(1092616192), color.getRGB());
        GlStateManager.popMatrix();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        Class1292.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemOverlays(Class1292.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer, entityPlayer.getHeldItemOffhand(), (int)n + 137, (int)n2 + 7);
        Class1292.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemIntoGUI(entityPlayer.getHeldItemOffhand(), (int)n + 137, (int)n2 + 1);
        GL11.glEnable(2929);
        GuiInventory.drawEntityOnScreen((int)n + 16, (int)n2 + 55, 25, entityPlayer.rotationYaw, -entityPlayer.rotationPitch, (EntityLivingBase)entityPlayer);
        Class753.drawRectWH(n + Float.intBitsToFloat(1106247680), n2 + Float.intBitsToFloat(1111490560), Double.longBitsToDouble((long)102112444 ^ 0x405E000006161CBCL), Double.longBitsToDouble((long)948116671 ^ 0x4020000038831CBFL), color.darker().darker().darker().getRGB());
        Class753.drawRectWH(n + Float.intBitsToFloat(1106247680), n2 + Float.intBitsToFloat(1111490560), (float)(this.Field13891 + n3), Double.longBitsToDouble(4620693217682128896L), color.darker().getRGB());
        Class753.drawRectWH(n + Float.intBitsToFloat(1106247680), n2 + Float.intBitsToFloat(1111490560), (float)clamp, Double.longBitsToDouble(4620693217682128896L), color.getRGB());
    }
    
    private void Method5249(final EntityPlayer entityPlayer) {
        final int n = (int)this.Method267();
        final int n2 = (int)this.Method268();
        this.Method273(Double.longBitsToDouble(4627730092099895296L) + this.Field13893 * Double.longBitsToDouble(4611686018427387904L) + Class1178.Method4741(entityPlayer.getName()));
        this.Method274(Double.longBitsToDouble(4627730092099895296L));
        final int n3 = (int)this.Method269();
        final int n4 = (int)this.Method270();
        Class753.drawRect(n, n2, n + n3, n2 + n4, new Color(0, 0, 0, 170).getRGB());
        GL11.glPushMatrix();
        Class1292.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getTextureManager().bindTexture(Objects.requireNonNull(Class1292.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.connection.getPlayerInfo(entityPlayer.getName())).getLocationSkin());
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        Gui.drawScaledCustomSizeModalRect(n, n2, Float.intBitsToFloat(1090519040), Float.intBitsToFloat(1090519040), 8, 8, 25, 25, Float.intBitsToFloat(1115684864), Float.intBitsToFloat(1115684864));
        GL11.glPopMatrix();
        Class1178.Method4745(entityPlayer.getName(), n + this.Field13893 + Double.longBitsToDouble(4627730092099895296L), n2 + this.Field13893, -1);
        Class753.drawRectWH(n + this.Field13893 + Double.longBitsToDouble((long)995970232 ^ 0x403900003B5D4CB8L), n2 + n4 - this.Field13893 - Double.longBitsToDouble(4619567317775286272L), entityPlayer.getHealth() / entityPlayer.getMaxHealth() * Class1178.Method4741(entityPlayer.getName()), Double.longBitsToDouble(4619567317775286272L), -1);
    }
    
    private void Method5250(final EntityPlayer entityPlayer, final double n, final double n2, final double n3, final double n4) {
        this.Method273(n3);
        this.Method274(n4);
        this.Field13891 += ((entityPlayer.getHealth() + entityPlayer.getAbsorptionAmount() - 0.0f) / (entityPlayer.getMaxHealth() - 0.0f) - this.Field13891) / Double.longBitsToDouble(4616189618054758400L);
        Class753.drawRoundedRect2(n, n2, n3, n4, Double.longBitsToDouble(4618441417868443648L), new Class2027(20, 20, 20, 210).Method3626());
        Class753.drawRoundedRect2(n + Double.longBitsToDouble((long)1173847299 ^ 0x4000000045F77D03L), n2 + (n4 / Double.longBitsToDouble((long)1845446154 ^ 0x400000006DFF460AL) - Double.longBitsToDouble((long)47703990 ^ 0x4031000002D7E7B6L)) - Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble((long)145106170 ^ 0x4044000008A624FAL), Double.longBitsToDouble((long)1729942638 ^ 0x40440000671CD46EL), Double.longBitsToDouble(4618441417868443648L), 1079465558);
        Class753.drawRoundedRect2(n + Double.longBitsToDouble(4631530004285489152L), n2 + Double.longBitsToDouble((long)1234040221 ^ 0x40100000498DF59DL), n3 - Double.longBitsToDouble((long)1316358200 ^ 0x404880004E760838L), Double.longBitsToDouble((long)381123063 ^ 0x403E000016B779F7L), Double.longBitsToDouble((long)1367488593 ^ 0x4018000051823851L), 1079465558);
        Class1178.Method4745("Name: " + ChatFormatting.GRAY + entityPlayer.getName(), n + Double.longBitsToDouble((long)1738490548 ^ 0x40478000679F42B4L), n2 + Double.longBitsToDouble(4616189618054758400L), -1);
        Class1178.Method4745("Distance: " + ChatFormatting.GRAY + Class447.Method2126(Class1292.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getDistance((Entity)entityPlayer), 2), n + Double.longBitsToDouble(4631811479262199808L), n2 + Double.longBitsToDouble(4623507967449235456L), -1);
        Class1178.Method4745("Ping: " + ChatFormatting.GRAY + (Class1292.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.isSingleplayer() ? 0 : Class1796.Field16241.Field16275.Method7401()) + " ms", n + Double.longBitsToDouble((long)982160197 ^ 0x404780003A8A9345L), n2 + Double.longBitsToDouble((long)1082507476 ^ 0x403680004085C0D4L), -1);
        Class753.drawRoundedRect2(n + Double.longBitsToDouble(4631530004285489152L), n2 + n4 - Double.longBitsToDouble((long)1812662911 ^ 0x403000006C0B0A7FL), n3 - Double.longBitsToDouble(4632092954238910464L), Double.longBitsToDouble(4621819117588971520L), Double.longBitsToDouble(4618441417868443648L), 1079465558);
        Class753.drawRoundedRect2(n + Double.longBitsToDouble(4631811479262199808L), n2 + n4 - Double.longBitsToDouble(4622945017495814144L), Double.longBitsToDouble((long)291355270 ^ 0x4057C000115DBA86L) * this.Field13891, Double.longBitsToDouble((long)1267335691 ^ 0x400800004B8A020BL), Double.longBitsToDouble((long)728612101 ^ 0x401000002B6DBD05L), Class1172.Method4706(entityPlayer.getHealth() + entityPlayer.getAbsorptionAmount(), entityPlayer.getMaxHealth()).Method3626());
        GL11.glEnable(2929);
        GuiInventory.drawEntityOnScreen((int)n + 21, (int)(n2 + Double.longBitsToDouble((long)551582149 ^ 0x4046000020E079C5L)), 18, Float.intBitsToFloat(-1041235968), -entityPlayer.rotationPitch, (EntityLivingBase)entityPlayer);
    }
    
    private void Method5251(final EntityPlayer entityPlayer) {
        final double method267 = this.Method267();
        final double method268 = this.Method268();
        this.Method273(Double.longBitsToDouble(4638144666238189568L));
        final double method269 = this.Method269();
        final double n = method269 - this.Field13893 * Double.longBitsToDouble((long)1839819747 ^ 0x400000006DA96BE3L);
        final double n2 = 4 + Class1178.Method4748() * 2;
        this.Method274(this.Field13893 * Double.longBitsToDouble(4616189618054758400L) + Class1178.Method4748() + n2 * Double.longBitsToDouble((long)1564569381 ^ 0x400000005D416F25L) + Double.longBitsToDouble((long)391262972 ^ 0x40280000175232FCL) + Double.longBitsToDouble(4628293042053316608L));
        final double method270 = this.Method270();
        int n3 = 0;
        Class753.drawRect(method267 + Double.longBitsToDouble(4613937818241073152L), method268 + Double.longBitsToDouble((long)1780770720 ^ 0x400800006A2467A0L), method267 + method269 + Double.longBitsToDouble(4613937818241073152L), method268 + method270 - Double.longBitsToDouble(4613937818241073152L), Class1172.Method4718(33, 33, 42));
        Class753.drawRect(method267 + Double.longBitsToDouble(4613937818241073152L), method268, method267 + method269 + Double.longBitsToDouble(4613937818241073152L), method268 + method270, Class1172.Method4718(33, 33, 42));
        Class753.drawRect(method267 + Double.longBitsToDouble(4611686018427387904L), method268 + Double.longBitsToDouble((long)450439365 ^ 0x400000001AD928C5L), method267 + method269 + Double.longBitsToDouble(4611686018427387904L), method268 + method270 - Double.longBitsToDouble((long)463348075 ^ 0x400000001B9E216BL), Class1172.Method4718(45, 45, 55));
        Class753.drawRect(method267 + Double.longBitsToDouble((long)312306114 ^ 0x40000000129D69C2L), method268, method267 + method269 + Double.longBitsToDouble(4611686018427387904L), method268 + method270, Class1172.Method4718(45, 45, 55));
        Class753.drawRect(method267 + 1.0, method268 + 1.0, method267 + method269 + 1.0, method268 + method270 - 1.0, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(method267 + 1.0, method268, method267 + method269 + 1.0, method268 + method270, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(method267 - Double.longBitsToDouble((long)962570006 ^ 0x40080000395FA716L), method268 - Double.longBitsToDouble(4620693217682128896L), method267 + method269 + Double.longBitsToDouble(4613937818241073152L), method268 + method270 - Double.longBitsToDouble(4613937818241073152L), Class1172.Method4718(33, 33, 42));
        Class753.drawRect(method267 - Double.longBitsToDouble(4613937818241073152L), method268, method267 + method269 + Double.longBitsToDouble((long)1364473303 ^ 0x40080000515435D7L), method268 + method270, Class1172.Method4718(33, 33, 42));
        Class753.drawRect(method267 - Double.longBitsToDouble((long)658434657 ^ 0x40000000273EEA61L), method268 - Double.longBitsToDouble(4619567317775286272L), method267 + method269 + Double.longBitsToDouble(4611686018427387904L), method268 + method270 - Double.longBitsToDouble(4611686018427387904L), Class1172.Method4718(45, 45, 55));
        Class753.drawRect(method267 - Double.longBitsToDouble(4611686018427387904L), method268, method267 + method269 + Double.longBitsToDouble((long)1784026446 ^ 0x400000006A56154EL), method268 + method270, Class1172.Method4718(45, 45, 55));
        Class753.drawRect(method267 - 1.0, method268 - Double.longBitsToDouble((long)2127033950 ^ 0x401800007EC7F65EL), method267 + method269 + 1.0, method268 + method270 - 1.0, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(method267 - 1.0, method268, method267 + method269 + 1.0, method268 + method270, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(method267, method268 - Double.longBitsToDouble(4617315517961601024L), method267 + method269, method268 + method270, Class1172.Method4709(100, 100));
        Class753.drawRect(method267 - Double.longBitsToDouble(4613937818241073152L), method268 - 1.0, method267 + method269 + Double.longBitsToDouble(4613937818241073152L), method268 + method270 + Double.longBitsToDouble((long)1982770438 ^ 0x40080000762EAD06L), Class1172.Method4718(33, 33, 42));
        Class753.drawRect(method267 - Double.longBitsToDouble(4611686018427387904L), method268 - Double.longBitsToDouble((long)1148510823 ^ 0x400000004474E267L), method267 + method269 + Double.longBitsToDouble((long)376368742 ^ 0x40000000166EEE66L), method268 + method270 + Double.longBitsToDouble(4611686018427387904L), Class1172.Method4718(45, 45, 55));
        Class753.drawRect(method267 - 1.0, method268 - Double.longBitsToDouble((long)1252626254 ^ 0x400800004AA98F4EL), method267 + method269 + 1.0, method268 + method270 + 1.0, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(method267, method268 - Double.longBitsToDouble((long)535068603 ^ 0x401000001FE47FBBL), method267 + method269, method268 + method270, Class1172.Method4718(34, 34, 40));
        Class1178.Method4746(entityPlayer.getName(), method267 + method269 / Double.longBitsToDouble((long)519649620 ^ 0x400000001EF93954L), method268 + this.Field13893, Class1172.Method4709(100, 100));
        Class753.drawRect(method267 + this.Field13893, method268 + this.Field13893 * Double.longBitsToDouble(4613937818241073152L) + Class1178.Method4748(), method267 + this.Field13893 + Double.longBitsToDouble((long)15561920 ^ 0x403B000000ED74C0L), method268 + this.Field13893 * Double.longBitsToDouble((long)2084834106 ^ 0x400800007C440B3AL) + Class1178.Method4748() + Double.longBitsToDouble(4628293042053316608L), Class1172.Method4709(100, 100));
        GL11.glPushMatrix();
        Class1292.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getTextureManager().bindTexture(Class1292.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getConnection().getPlayerInfo(entityPlayer.getName()).getLocationSkin());
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        Gui.drawScaledCustomSizeModalRect((int)(method267 + this.Field13893 + 1.0), (int)(method268 + this.Field13893 * Double.longBitsToDouble((long)1990056137 ^ 0x40080000769DD8C9L) + Class1178.Method4748() + 1.0), Float.intBitsToFloat(1090519040), Float.intBitsToFloat(1090519040), 8, 8, 25, 25, Float.intBitsToFloat(1115684864), Float.intBitsToFloat(1115684864));
        GL11.glPopMatrix();
        Class1178.Method4744("Health: " + (int)entityPlayer.getHealth(), method267 + this.Field13893 + Double.longBitsToDouble((long)694772145 ^ 0x403B0000296961B1L) + Double.longBitsToDouble(4616189618054758400L), method268 + this.Field13893 * Double.longBitsToDouble((long)1387238012 ^ 0x4008000052AF927CL) + Class1178.Method4748(), Class1172.Method4709(100, 100));
        Class1178.Method4744("Distance: " + (int)Class1292.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getDistance((Entity)entityPlayer), method267 + this.Field13893 + Double.longBitsToDouble((long)677547044 ^ 0x403B000028628C24L) + Double.longBitsToDouble((long)45585021 ^ 0x4010000002B7927DL), method268 + this.Field13893 * Double.longBitsToDouble(4613937818241073152L) + Class1178.Method4748() * 2 + Double.longBitsToDouble((long)877723927 ^ 0x4000000034510117L), Class1172.Method4709(100, 100));
        Class1178.Method4744("On Ground: " + entityPlayer.onGround, method267 + this.Field13893 + Double.longBitsToDouble(4628293042053316608L) + Double.longBitsToDouble(4616189618054758400L), method268 + this.Field13893 * Double.longBitsToDouble(4613937818241073152L) + Class1178.Method4748() * 3 + Double.longBitsToDouble(4616189618054758400L), Class1172.Method4709(100, 100));
        double n4 = method267 + this.Field13893;
        for (final ItemStack itemStack : entityPlayer.getArmorInventoryList()) {
            if (itemStack.isEmpty) {
                continue;
            }
            GL11.glPushMatrix();
            GL11.glTranslated(n4, method268 + this.Field13893 * Double.longBitsToDouble((long)1521690082 ^ 0x400800005AB325E2L) + Class1178.Method4748() + Double.longBitsToDouble(4628293042053316608L) + Double.longBitsToDouble(4602678819172646912L), 0.0);
            GL11.glScaled(Double.longBitsToDouble((long)1860159631 ^ 0x3FE99999F7465115L), Double.longBitsToDouble(4605380978949069210L), Double.longBitsToDouble(4605380978949069210L));
            Class1292.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemIntoGUI(itemStack, 0, 0);
            GL11.glPopMatrix();
            n4 += Double.longBitsToDouble(4622945017495814144L);
        }
        if (!entityPlayer.getHeldItemMainhand().isEmpty) {
            GL11.glPushMatrix();
            GL11.glTranslated(n4, method268 + this.Field13893 * Double.longBitsToDouble((long)496568014 ^ 0x400800001D9906CEL) + Class1178.Method4748() + Double.longBitsToDouble(4628293042053316608L) + Double.longBitsToDouble(4602678819172646912L), 0.0);
            GL11.glScaled(Double.longBitsToDouble((long)1436153261 ^ 0x3FE99999CC006C37L), Double.longBitsToDouble((long)328881001 ^ 0x3FE999998A03CAF3L), Double.longBitsToDouble((long)15862397 ^ 0x3FE99999996B93E7L));
            Class1292.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemIntoGUI(entityPlayer.getHeldItemMainhand(), 0, 0);
            GL11.glPopMatrix();
            n4 += Double.longBitsToDouble(4622945017495814144L);
        }
        if (!entityPlayer.getHeldItemOffhand().isEmpty) {
            GL11.glPushMatrix();
            GL11.glTranslated(n4, method268 + this.Field13893 * Double.longBitsToDouble((long)1842977999 ^ 0x400800006DD99CCFL) + Class1178.Method4748() + Double.longBitsToDouble(4628293042053316608L) + Double.longBitsToDouble(4602678819172646912L), 0.0);
            GL11.glScaled(Double.longBitsToDouble((long)1996697381 ^ 0x3FE99999EE9AB6BFL), Double.longBitsToDouble((long)2138533633 ^ 0x3FE99999E6EEF69BL), Double.longBitsToDouble((long)1297789029 ^ 0x3FE99999D4C329FFL));
            Class1292.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemIntoGUI(entityPlayer.getHeldItemOffhand(), 0, 0);
            GL11.glPopMatrix();
        }
        this.Field13892 = Class230.Method1301(MathHelper.clamp((double)entityPlayer.getCooledAttackStrength(0.0f), Double.longBitsToDouble((long)22942200 ^ 0x3FB9999998C78862L), 1.0) * n, this.Field13892, Double.longBitsToDouble((long)1868126548 ^ 0x3FA99999F6C0C0CEL));
        Class1178.Method4745("Cooldown", method267 + this.Field13893, method268 + this.Field13893 * Double.longBitsToDouble((long)935782247 ^ 0x4008000037C6E767L) + Class1178.Method4748() + Double.longBitsToDouble((long)1022576889 ^ 0x403B00003CF348F9L) + Double.longBitsToDouble(4616189618054758400L) + Double.longBitsToDouble((long)241748248 ^ 0x402800000E68C918L), Class1172.Method4709(100, 100));
        this.Method5252(method267 + this.Field13893, method268 + this.Field13893 * Double.longBitsToDouble((long)1758041059 ^ 0x4008000068C993E3L) + Class1178.Method4748() * 2 + Double.longBitsToDouble(4628293042053316608L) + Double.longBitsToDouble(4618441417868443648L) + Double.longBitsToDouble(4622945017495814144L), this.Field13892, Class1178.Method4748());
        ++n3;
        if (this.Field13890.Method2797(15L)) {
            this.Field13891 = Class230.Method1301(entityPlayer.getHealth() / entityPlayer.getMaxHealth() * n, this.Field13891, Double.longBitsToDouble((long)1028258047 ^ 0x3FA99999A4D06165L));
            this.Field13890.Method2801();
        }
        Class1178.Method4745("Health", method267 + this.Field13893, method268 + this.Field13893 * Double.longBitsToDouble((long)1140496003 ^ 0x4008000043FA9683L) + Class1178.Method4748() + Double.longBitsToDouble(4628293042053316608L) + Double.longBitsToDouble((long)166546024 ^ 0x4010000009ED4A68L) + n3 * n2 + Double.longBitsToDouble((long)264971255 ^ 0x402800000FCB23F7L), Class1172.Method4709(100, 100));
        this.Method5252(method267 + this.Field13893, method268 + this.Field13893 * Double.longBitsToDouble((long)438130558 ^ 0x400800001A1D577EL) + Class1178.Method4748() * 2 + Double.longBitsToDouble((long)209086661 ^ 0x403B00000C7668C5L) + Double.longBitsToDouble((long)175337875 ^ 0x401800000A737193L) + n3 * n2 + Double.longBitsToDouble(4622945017495814144L), this.Field13891, Class1178.Method4748());
    }
    
    private void Method5252(final double n, final double n2, final double n3, final double n4) {
        if (this.Field13897.Method365()) {
            Class753.drawShadowSliders(n, n2, n3, n4, Class1172.Method4709(100, 100), 1.0);
        }
        else {
            Class753.drawRect(n, n2, n + n3, n2 + n4, Class1172.Method4709(100, 100));
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3631 ^ 0x15));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
