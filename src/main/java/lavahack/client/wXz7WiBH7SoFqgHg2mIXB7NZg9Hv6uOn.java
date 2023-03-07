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

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import com.kisman.cc.util.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import com.mojang.realmsclient.gui.ChatFormatting;
import java.awt.Color;
import java.util.Iterator;
import java.util.Objects;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.XFDKv2nzCgumb6lLxnd2S4gp8mbth6i0;
import lavahack.client.dHW1jZK49fXgBu9AY91BXDMHsTGGza8u;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.lpZWTyPbfPSkdxxNzMqnmbfWu0EWRf6K;
import lavahack.client.qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
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

public class wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn
extends qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2 {
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field13890 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private double Field13891;
    private double Field13892;
    private double Field13893 = Double.longBitsToDouble(0x6B97D42EEF3545DEL ^ 0x2B83D42EEF3545DEL);
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13894 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Astolfo", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)240646107 ^ (long)240646106)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13895 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Theme", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field8138));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field13896 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rewrite", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13897 = this.Method23(this.Field13896.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rewrite Shadow", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-520809370 ^ (long)-520809369)).Method355("Shadow")));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field13898 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Noat", this)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field13899 = this.Method24(this.Field13898.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Colors", this))));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field13900 = this.Method24(this.Field13899.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Sideway", this))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13901 = this.Method23(this.Field13899.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Noat Background Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(((int)1825515372L ^ 0x6CCF2763) << 1, (int)((long)-1377176131 ^ (long)-1377176142) << 1, (int)((long)-1320070473 ^ (long)-1320070472) << 1, (int)((long)-1617147988 ^ (long)-1617147929) << 1)).Method355("Background")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13902 = this.Method23(this.Field13900.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Noat Sideway First Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)-1644698349 ^ (long)-1644698242) << 1, ((int)-1931363265L ^ 0x8CE1BC62) << 1, (int)1028488922L ^ 0x3D4D7E25, (int)-179147853L ^ 0xF5526B4C)).Method355("First")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13903 = this.Method23(this.Field13900.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Noat Sideway Second Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)-1933293877L ^ 0x8CC44634, ((int)1093093938L ^ 0x41274A3F) << 4, (int)114086647L ^ 0x6CCD278, (int)1726804017L ^ 0x66ECF0CE)).Method355("Second")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13904 = this.Method23(this.Field13898.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Noat Font Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14032).Method355("Font Mode")));
    private int Field13905;

    public wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn() {
        super("TargetHud", ((int)30778107L ^ 0x1D5A2FA) != 0);
        this.Method271(Double.longBitsToDouble((long)1598979281 ^ 0x407F40005F4E7CD1L));
        this.Method272(Double.longBitsToDouble(0x74CF43F4DC5256CBL ^ 0x34BD83F4DC5256CBL));
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method5244(RenderGameOverlayEvent.Text text) {
        EntityPlayer entityPlayer = lpZWTyPbfPSkdxxNzMqnmbfWu0EWRf6K.Field15860.Method6505();
        if (entityPlayer == null) {
            return;
        }
        String string = this.Field13895.Method359();
        int n = (int)((long)2044446638 ^ (long)-2044446639);
        switch (string.hashCode()) {
            case -1529165460: {
                if (!string.equals("Rewrite")) return;
                n = (int)952855812L ^ 0x38CB6D04;
                return;
            }
            case -531999850: {
                if (!string.equals("NoRules")) return;
                n = (int)-1263726604L ^ 0xB4AD0FF5;
                return;
            }
            case -1818419758: {
                if (!string.equals("Simple")) return;
                n = ((int)-1264398245L ^ 0xB4A2D05A) << 1;
                return;
            }
            case 961091784: {
                if (!string.equals("Astolfo")) return;
                n = (int)((long)-2034510792 ^ (long)-2034510789);
                return;
            }
            case 2433492: {
                if (!string.equals("Noat")) return;
                n = (int)((long)704942680 ^ (long)704942681) << 2;
                return;
            }
        }
    }

    private void Method5245(EntityPlayer entityPlayer) {
        GlStateManager.pushMatrix();
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH(this.Method267(), this.Method268(), Double.longBitsToDouble(0xC20CF3EAA5535D14L ^ 0x826E33EAA5535D14L), Double.longBitsToDouble((long)1321080767 ^ 0x404900004EBE17BFL), this.Field13901.Method339().Method3626());
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawFace(entityPlayer, (int)this.Method267() + (int)((long)421040323 ^ (long)421040326), (int)this.Method268() + ((int)-1421140589L ^ 0xAB4B1D96), ((int)-1114425916L ^ 0xBD9335C1) << 3, (int)((long)398168938 ^ (long)398168943) << 3);
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawGradientSidewaysWH(this.Method267() + Double.longBitsToDouble(0xD7B5A010D7CAAA25L ^ 0x97FCA010D7CAAA25L), this.Method268() + Double.longBitsToDouble((long)1603633179 ^ 0x404400005F95801BL), entityPlayer.getHealth() * Float.intBitsToFloat((int)((long)1331214010 ^ (long)253832992)), Double.longBitsToDouble(0xA867140C0F8C9DEDL ^ 0xE873140C0F8C9DEDL), this.Field13902.Method339().Method3626(), this.Field13903.Method339().Method3626());
        Object[] objectArray = new Object[(int)((long)-1463614302 ^ (long)-1463614301)];
        objectArray[(int)((long)437766459 ^ (long)437766459)] = Float.valueOf(entityPlayer.getHealth() + entityPlayer.getAbsorptionAmount());
        this.Method5246(((int)-1611818842L ^ 0x9FED98A3) << 1).Method748(String.format("%.1f", objectArray), (int)this.Method267() + ((int)((long)1874262783 ^ (long)1874262758) << 1) + (int)(entityPlayer.getHealth() * Float.intBitsToFloat((int)((long)810203094 ^ (long)1882402380))) + ((int)1197406318L ^ 0x475EF86B), (int)this.Method268() + (((int)161137790L ^ 0x99AC47B) << 3), (int)-395475658L ^ 0x17927AC9);
        this.Method5246(((int)249068134L ^ 0xED87A69) << 1).Method748(entityPlayer.getName(), (int)this.Method267() + (((int)-1552473302L ^ 0xA3772333) << 1), (int)this.Method268() + (int)((long)-1020417602 ^ (long)-1020417605), (int)((long)-974818645 ^ (long)974818644));
        int n = (int)1095266650L ^ 0x4148715A;
        Iterator iterator = entityPlayer.inventory.armorInventory.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                GlStateManager.popMatrix();
                this.Method273(Double.longBitsToDouble(0x12D9A9F5335EC204L ^ 0x52BB69F5335EC204L));
                this.Method274(Double.longBitsToDouble(0x3D09E61126DECCE5L ^ 0x7D40E61126DECCE5L));
                return;
            }
            ItemStack itemStack = (ItemStack)iterator.next();
            ++n;
            if (itemStack.isEmpty()) continue;
            int n2 = (int)(this.Method267() + Double.longBitsToDouble(0x8EDD7E09B3E7860AL ^ 0xCE947E09B3E7860AL) - Double.longBitsToDouble((long)659889046 ^ 0x4056800027551B96L) + (double)((((int)500580662L ^ 0x1DD6413F) - n) * (((int)-1228467342L ^ 0xB6C71377) << 2)) + Double.longBitsToDouble(0x72B13EB702741863L ^ 0x32B13EB702741863L));
            GlStateManager.pushMatrix();
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.Field11203.setZLevel(Float.intBitsToFloat((int)((long)1918236494 ^ (long)824047438)));
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemAndEffectIntoGUI(itemStack, n2, (int)(this.Method268() + Double.longBitsToDouble((long)1512499617 ^ 0x403100005A26E9A1L)));
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.Field11203.setZLevel(0.0f);
            GlStateManager.popMatrix();
        }
    }

    private XFDKv2nzCgumb6lLxnd2S4gp8mbth6i0 Method5246(int n) {
        if (n != (int)((long)-479590528 ^ (long)-479590523) << 1) return this.Method5247(fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Field13320, fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Field13309, fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Field13316);
        return this.Method5247(fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Field13323, fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Field13313, fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Field13319);
    }

    private XFDKv2nzCgumb6lLxnd2S4gp8mbth6i0 Method5247(XFDKv2nzCgumb6lLxnd2S4gp8mbth6i0 xFDKv2nzCgumb6lLxnd2S4gp8mbth6i0, XFDKv2nzCgumb6lLxnd2S4gp8mbth6i0 xFDKv2nzCgumb6lLxnd2S4gp8mbth6i02, XFDKv2nzCgumb6lLxnd2S4gp8mbth6i0 xFDKv2nzCgumb6lLxnd2S4gp8mbth6i03) {
        if (this.Field13904.Method341() == wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14032) {
            return xFDKv2nzCgumb6lLxnd2S4gp8mbth6i0;
        }
        if (this.Field13904.Method341() != wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14033) return xFDKv2nzCgumb6lLxnd2S4gp8mbth6i03;
        return xFDKv2nzCgumb6lLxnd2S4gp8mbth6i02;
    }

    private void Method5248(EntityPlayer entityPlayer) {
        Color color = this.Field13894.Method365() ? zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4711((int)((long)-2090116712 ^ (long)-2090116735) << 2, ((int)2057040669L ^ 0x7A9BF304) << 2) : new Color((int)-847231880L ^ 0xCD804487, (int)((long)1896023409 ^ (long)1896023409), (int)1043196278L ^ 0x3E2DE92F);
        float f = (float)this.Method267();
        float f2 = (float)this.Method268();
        this.Method273(Double.longBitsToDouble((long)879848977 ^ 0x4063600034716E11L));
        this.Method274(Double.longBitsToDouble(0x31EB6302C6A28EAL ^ 0x4350B6302C6A28EAL));
        double d = entityPlayer.getHealth() / entityPlayer.getMaxHealth() * Float.intBitsToFloat((int)((long)280267631 ^ (long)1380223855));
        d = MathHelper.clamp((double)d, (double)0.0, (double)Double.longBitsToDouble((long)1730825908 ^ 0x405E0000672A4EB4L));
        double d2 = entityPlayer.getHealth() < Float.intBitsToFloat((int)((long)1416662246 ^ (long)367037670)) && entityPlayer.getHealth() > 1.0f ? Double.longBitsToDouble(0x3D7E0B79F70EF33BL ^ 0x7D5E0B79F70EF33BL) : 0.0;
        this.Field13891 = UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method1301(d, this.Field13891, Double.longBitsToDouble((long)191640295 ^ 0x3FA9999992F5AB7DL));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH(f, f2, Double.longBitsToDouble((long)2039845727 ^ 0x406360007995935FL), Double.longBitsToDouble(0x1E77C6E024E0C595L ^ 0x5E39C6E024E0C595L), new Color(((int)-197272869L ^ 0xF43DDADE) << 2, (int)((long)-2094418150 ^ (long)-2094418145) << 2, ((int)1383522462L ^ 0x5276E09B) << 2, (int)((long)1157950049 ^ (long)1157950072) << 3).getRGB());
        wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer.drawStringWithShadow(entityPlayer.getName(), f + Float.intBitsToFloat((int)((long)2081027719 ^ (long)1039791751)), f2 + Float.intBitsToFloat((int)226589900L ^ 0x4D017CCC), color.getRGB());
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)f, (float)f2, (float)1.0f);
        GlStateManager.scale((float)Float.intBitsToFloat((int)((long)1382190595 ^ (long)306351619)), (float)Float.intBitsToFloat((int)((long)966309237 ^ (long)2042148213)), (float)Float.intBitsToFloat((int)((long)417342023 ^ (long)1488986695)));
        GlStateManager.translate((float)(-f - Float.intBitsToFloat(0x6304D4FB ^ 0x2344D4FB)), (float)(-f2 - 2.0f), (float)1.0f);
        wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer.drawStringWithShadow(Math.round(entityPlayer.getHealth() / 2.0f) + " \u2764", f + Float.intBitsToFloat((int)((long)1850896235 ^ (long)802320235)), f2 + Float.intBitsToFloat((int)((long)398314095 ^ (long)1453181551)), color.getRGB());
        GlStateManager.popMatrix();
        GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemOverlays(wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer, entityPlayer.getHeldItemOffhand(), (int)f + ((int)1335864865L ^ 0x4F9FAEA8), (int)f2 + (int)((long)-273368264 ^ (long)-273368257));
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemIntoGUI(entityPlayer.getHeldItemOffhand(), (int)f + (int)((long)-940981244 ^ (long)-940981107), (int)f2 + (int)((long)2068445217 ^ (long)2068445216));
        GL11.glEnable((int)((int)((long)1311589580 ^ (long)1311592381)));
        GuiInventory.drawEntityOnScreen((int)((int)f + (((int)1153523708L ^ 0x44C15FFD) << 4)), (int)((int)f2 + ((int)-261945266L ^ 0xF0630879)), (int)((int)((long)-200439849 ^ (long)-200439858)), (float)entityPlayer.rotationYaw, (float)(-entityPlayer.rotationPitch), (EntityLivingBase)entityPlayer);
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH(f + Float.intBitsToFloat((int)53192442L ^ 0x42DBA6FA), f2 + Float.intBitsToFloat((int)((long)1897305651 ^ (long)861312563)), Double.longBitsToDouble((long)102112444 ^ 0x405E000006161CBCL), Double.longBitsToDouble((long)948116671 ^ 0x4020000038831CBFL), color.darker().darker().darker().getRGB());
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH(f + Float.intBitsToFloat((int)335612444L ^ 0x55F10A1C), f2 + Float.intBitsToFloat((int)((long)236559753 ^ (long)1280941449)), (float)(this.Field13891 + d2), Double.longBitsToDouble(0x947CEC2CB673514AL ^ 0xD45CEC2CB673514AL), color.darker().getRGB());
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH(f + Float.intBitsToFloat((int)920571630L ^ 0x772ECEEE), f2 + Float.intBitsToFloat(0x3AB7DDD6 ^ 0x78F7DDD6), (float)d, Double.longBitsToDouble(0x830B5064CDEF91DL ^ 0x4810B5064CDEF91DL), color.getRGB());
    }

    private void Method5249(EntityPlayer entityPlayer) {
        int n = (int)this.Method267();
        int n2 = (int)this.Method268();
        this.Method273(Double.longBitsToDouble(0x273AB7A3327EAA55L ^ 0x6703B7A3327EAA55L) + this.Field13893 * Double.longBitsToDouble(0x9B240E714840562L ^ 0x49B240E714840562L) + (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(entityPlayer.getName()));
        this.Method274(Double.longBitsToDouble(0xF0344A86FC9B174EL ^ 0xB00D4A86FC9B174EL));
        int n3 = (int)this.Method269();
        int n4 = (int)this.Method270();
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect((int)n, (int)n2, (int)(n + n3), (int)(n2 + n4), (int)new Color((int)702173232L ^ 0x29DA5030, (int)-1745951831L ^ 0x97EEE3A9, (int)((long)-1666764190 ^ (long)-1666764190), ((int)1369531833L ^ 0x51A165EC) << 1).getRGB());
        GL11.glPushMatrix();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getTextureManager().bindTexture(Objects.requireNonNull(wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.connection.getPlayerInfo(entityPlayer.getName())).getLocationSkin());
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        Gui.drawScaledCustomSizeModalRect((int)n, (int)n2, (float)Float.intBitsToFloat((int)((long)226434878 ^ (long)1283399486)), (float)Float.intBitsToFloat((int)((long)1749691092 ^ (long)692726484)), (int)((int)((long)1812009162 ^ (long)1812009163) << 3), (int)((int)((long)1677928234 ^ (long)1677928235) << 3), (int)((int)279328212L ^ 0x10A635CD), (int)((int)((long)1536705347 ^ (long)1536705370)), (float)Float.intBitsToFloat((int)((long)265652848 ^ (long)1297451632)), (float)Float.intBitsToFloat((int)((long)1733225995 ^ (long)634318347)));
        GL11.glPopMatrix();
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(entityPlayer.getName(), (double)n + this.Field13893 + Double.longBitsToDouble(0x9EF630AF45396949L ^ 0xDECF30AF45396949L), (double)n2 + this.Field13893, (int)((long)-1434463965 ^ (long)1434463964));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH((double)n + this.Field13893 + Double.longBitsToDouble((long)995970232 ^ 0x403900003B5D4CB8L), (double)(n2 + n4) - this.Field13893 - Double.longBitsToDouble(0x2898223A85BF3E07L ^ 0x6884223A85BF3E07L), entityPlayer.getHealth() / entityPlayer.getMaxHealth() * (float)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(entityPlayer.getName()), Double.longBitsToDouble(0xBD9B7DA79345A82DL ^ 0xFD877DA79345A82DL), (int)-255190090L ^ 0xF35E449);
    }

    private void Method5250(EntityPlayer entityPlayer, double d, double d2, double d3, double d4) {
        this.Method273(d3);
        this.Method274(d4);
        double d5 = (entityPlayer.getHealth() + entityPlayer.getAbsorptionAmount() - 0.0f) / (entityPlayer.getMaxHealth() - 0.0f);
        this.Field13891 += (d5 - this.Field13891) / Double.longBitsToDouble(0xB8A18EFCEE9C8079L ^ 0xF8B18EFCEE9C8079L);
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRoundedRect2(d, d2, d3, d4, Double.longBitsToDouble(0x71D2E91FFE094A53L ^ 0x31CAE91FFE094A53L), new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)-2011987380 ^ (long)-2011987383) << 2, (int)((long)-1510646543 ^ (long)-1510646540) << 2, (int)((long)1149878125 ^ (long)1149878120) << 2, (int)((long)-1145988874 ^ (long)-1145988961) << 1).Method3626());
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRoundedRect2(d + Double.longBitsToDouble((long)1173847299 ^ 0x4000000045F77D03L), d2 + (d4 / Double.longBitsToDouble((long)1845446154 ^ 0x400000006DFF460AL) - Double.longBitsToDouble((long)47703990 ^ 0x4031000002D7E7B6L)) - Double.longBitsToDouble(0x35739DA853D46CEDL ^ 0x757B9DA853D46CEDL), Double.longBitsToDouble((long)145106170 ^ 0x4044000008A624FAL), Double.longBitsToDouble((long)1729942638 ^ 0x40440000671CD46EL), Double.longBitsToDouble(0x1D27596E814A4616L ^ 0x5D3F596E814A4616L), (int)((long)1277141933 ^ (long)1815349382) << 1);
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRoundedRect2(d + Double.longBitsToDouble(0xA6879E87AA45AA0DL ^ 0xE6C11E87AA45AA0DL), d2 + Double.longBitsToDouble((long)1234040221 ^ 0x40100000498DF59DL), d3 - Double.longBitsToDouble((long)1316358200 ^ 0x404880004E760838L), Double.longBitsToDouble((long)381123063 ^ 0x403E000016B779F7L), Double.longBitsToDouble((long)1367488593 ^ 0x4018000051823851L), (int)((long)-119396409 ^ (long)-657879828) << 1);
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745("Name: " + ChatFormatting.GRAY + entityPlayer.getName(), d + Double.longBitsToDouble((long)1738490548 ^ 0x40478000679F42B4L), d2 + Double.longBitsToDouble(0xD2AEC20DF3FF354EL ^ 0x92BEC20DF3FF354EL), (int)111604499L ^ 0xF9590CEC);
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745("Distance: " + ChatFormatting.GRAY + dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2126(wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getDistance((Entity)entityPlayer), ((int)1551038425L ^ 0x5C72F7D8) << 1), d + Double.longBitsToDouble(0xDF3B802474846916L ^ 0x9F7C002474846916L), d2 + Double.longBitsToDouble(0x56A549CD0C1DA3BL ^ 0x4540549CD0C1DA3BL), (int)66347576L ^ 0xFC0B9DC7);
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745("Ping: " + ChatFormatting.GRAY + (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.isSingleplayer() ? (int)((long)-538153384 ^ (long)-538153384) : leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16275.Method7401()) + " ms", d + Double.longBitsToDouble((long)982160197 ^ 0x404780003A8A9345L), d2 + Double.longBitsToDouble((long)1082507476 ^ 0x403680004085C0D4L), (int)((long)1495325165 ^ (long)-1495325166));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRoundedRect2(d + Double.longBitsToDouble(0x60FEE411C4AC9303L ^ 0x20B86411C4AC9303L), d2 + d4 - Double.longBitsToDouble((long)1812662911 ^ 0x403000006C0B0A7FL), d3 - Double.longBitsToDouble(0xD9FAD49A164DB17DL ^ 0x99B2549A164DB17DL), Double.longBitsToDouble(0x9B170CDE08905EEL ^ 0x499570CDE08905EEL), Double.longBitsToDouble(0xA63F06D4F9C866FFL ^ 0xE62706D4F9C866FFL), ((int)-1138898727L ^ 0x9C3663F2) << 1);
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRoundedRect2(d + Double.longBitsToDouble(0x768ED2BBBF28E35BL ^ 0x36C952BBBF28E35BL), d2 + d4 - Double.longBitsToDouble(0x278C90326144B9D5L ^ 0x67A490326144B9D5L), Double.longBitsToDouble((long)291355270 ^ 0x4057C000115DBA86L) * this.Field13891, Double.longBitsToDouble((long)1267335691 ^ 0x400800004B8A020BL), Double.longBitsToDouble((long)728612101 ^ 0x401000002B6DBD05L), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4706(entityPlayer.getHealth() + entityPlayer.getAbsorptionAmount(), entityPlayer.getMaxHealth()).Method3626());
        GL11.glEnable((int)((int)((long)-1540099447 ^ (long)-1540097544)));
        GuiInventory.drawEntityOnScreen((int)((int)d + (int)((long)2129492108 ^ (long)2129492121)), (int)((int)(d2 + Double.longBitsToDouble((long)551582149 ^ 0x4046000020E079C5L))), (int)(((int)1505466929L ^ 0x59BB9A38) << 1), (float)Float.intBitsToFloat((int)677801648L ^ 0xE9966EB0), (float)(-entityPlayer.rotationPitch), (EntityLivingBase)entityPlayer);
    }

    private void Method5251(EntityPlayer entityPlayer) {
        double d = this.Method267();
        double d2 = this.Method268();
        this.Method273(Double.longBitsToDouble(0xBD0D7E22A0560A84L ^ 0xFD537E22A0560A84L));
        double d3 = this.Method269();
        double d4 = d3 - this.Field13893 * Double.longBitsToDouble((long)1839819747 ^ 0x400000006DA96BE3L);
        double d5 = ((int)((long)-2080417265 ^ (long)-2080417266) << 2) + fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() * ((int)((long)-2140638010 ^ (long)-2140638009) << 1);
        this.Method274(this.Field13893 * Double.longBitsToDouble(0x79E42192D88E8597L ^ 0x39F42192D88E8597L) + (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + d5 * Double.longBitsToDouble((long)1564569381 ^ 0x400000005D416F25L) + Double.longBitsToDouble((long)391262972 ^ 0x40280000175232FCL) + Double.longBitsToDouble(0x574100FC9F00C574L ^ 0x177A00FC9F00C574L));
        double d6 = this.Method270();
        int n = (int)410788751L ^ 0x187C238F;
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d + Double.longBitsToDouble(0xF01DE71D3EDF9DF5L ^ 0xB015E71D3EDF9DF5L), d2 + Double.longBitsToDouble((long)1780770720 ^ 0x400800006A2467A0L), d + d3 + Double.longBitsToDouble(0xA28F8EDCFD599E07L ^ 0xE2878EDCFD599E07L), d2 + d6 - Double.longBitsToDouble(0x581BEF9E7660D0AEL ^ 0x1813EF9E7660D0AEL), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)1602934320L ^ 0x5F8AD611, (int)((long)-887682540 ^ (long)-887682507), ((int)39197898L ^ 0x2561CDF) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d + Double.longBitsToDouble(0xC8B5E6902C28818AL ^ 0x88BDE6902C28818AL), d2, d + d3 + Double.longBitsToDouble(0x5097BC63707E5634L ^ 0x109FBC63707E5634L), d2 + d6, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)-1260057990 ^ (long)-1260058021), (int)-1335433438L ^ 0xB066E703, ((int)2128572547L ^ 0x7EDF7096) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d + Double.longBitsToDouble(0x2F7A0EBE1F33DA03L ^ 0x6F7A0EBE1F33DA03L), d2 + Double.longBitsToDouble((long)450439365 ^ 0x400000001AD928C5L), d + d3 + Double.longBitsToDouble(0x8ECDD10EBC86C21EL ^ 0xCECDD10EBC86C21EL), d2 + d6 - Double.longBitsToDouble((long)463348075 ^ 0x400000001B9E216BL), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)1500926564 ^ (long)1500926537), (int)1859485780L ^ 0x6ED58079, (int)-232281549L ^ 0xF227AA04));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d + Double.longBitsToDouble((long)312306114 ^ 0x40000000129D69C2L), d2, d + d3 + Double.longBitsToDouble(0xFE1F14BB3DB3F124L ^ 0xBE1F14BB3DB3F124L), d2 + d6, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)-1144873867 ^ (long)-1144873896), (int)((long)-1868604649 ^ (long)-1868604614), (int)802769052L ^ 0x2FD948AB));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d + 1.0, d2 + 1.0, d + d3 + 1.0, d2 + d6 - 1.0, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718(((int)-1759441100L ^ 0x97210F3B) << 2, (int)((long)-1000575054 ^ (long)-1000575043) << 2, (int)((long)-1289455838 ^ (long)-1289455871) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d + 1.0, d2, d + d3 + 1.0, d2 + d6, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)-1000341069 ^ (long)-1000341060) << 2, (int)((long)-1469138923 ^ (long)-1469138918) << 2, (int)((long)-7487634 ^ (long)-7487667) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - Double.longBitsToDouble((long)962570006 ^ 0x40080000395FA716L), d2 - Double.longBitsToDouble(0xF5F7F9A064FF71A2L ^ 0xB5D7F9A064FF71A2L), d + d3 + Double.longBitsToDouble(0xD4FA4D84BF1AFBADL ^ 0x94F24D84BF1AFBADL), d2 + d6 - Double.longBitsToDouble(0xBB835102DDDF0D87L ^ 0xFB8B5102DDDF0D87L), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)-1216730731L ^ 0xB77A29B4, (int)((long)557610660 ^ (long)557610629), (int)((long)420175331 ^ (long)420175350) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - Double.longBitsToDouble(0x714C3A8839A64C7AL ^ 0x31443A8839A64C7AL), d2, d + d3 + Double.longBitsToDouble((long)1364473303 ^ 0x40080000515435D7L), d2 + d6, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)1846238768L ^ 0x6E0B5E11, (int)995109192L ^ 0x3B502969, ((int)2020080034L ^ 0x7867F9B7) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - Double.longBitsToDouble((long)658434657 ^ 0x40000000273EEA61L), d2 - Double.longBitsToDouble(0x1A12010322A44417L ^ 0x5A0E010322A44417L), d + d3 + Double.longBitsToDouble(0x2E23E7F5DC469AD3L ^ 0x6E23E7F5DC469AD3L), d2 + d6 - Double.longBitsToDouble(0xF34AF511FE8B4D72L ^ 0xB34AF511FE8B4D72L), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)-432886154 ^ (long)-432886181), (int)((long)700601436 ^ (long)700601457), (int)-337576398L ^ 0xEBE0FE05));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - Double.longBitsToDouble(0xD1753C896E337EFL ^ 0x4D1753C896E337EFL), d2, d + d3 + Double.longBitsToDouble((long)1784026446 ^ 0x400000006A56154EL), d2 + d6, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)-280468164 ^ (long)-280468207), (int)((long)-286585399 ^ (long)-286585372), (int)((long)1339795488 ^ (long)1339795479)));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - 1.0, d2 - Double.longBitsToDouble((long)2127033950 ^ 0x401800007EC7F65EL), d + d3 + 1.0, d2 + d6 - 1.0, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718(((int)-1462969341L ^ 0xA8CCDC0C) << 2, (int)((long)653838552 ^ (long)653838551) << 2, ((int)1037055197L ^ 0x3DD034FE) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - 1.0, d2, d + d3 + 1.0, d2 + d6, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)-27785294 ^ (long)-27785283) << 2, (int)((long)-945047647 ^ (long)-945047634) << 2, (int)((long)50556187 ^ (long)50556216) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d, d2 - Double.longBitsToDouble(0x7B6F689F54F93394L ^ 0x3B7B689F54F93394L), d + d3, d2 + d6, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)-419195530 ^ (long)-419195537) << 2, ((int)156508338L ^ 0x95420AB) << 2));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - Double.longBitsToDouble(0xE728AE43D2395BA5L ^ 0xA720AE43D2395BA5L), d2 - 1.0, d + d3 + Double.longBitsToDouble(0x72B9CF5AF6DFC750L ^ 0x32B1CF5AF6DFC750L), d2 + d6 + Double.longBitsToDouble((long)1982770438 ^ 0x40080000762EAD06L), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)134145731L ^ 0x7FEE6E2, (int)-1802727628L ^ 0x948C8F15, ((int)-1132313006L ^ 0xBC824647) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - Double.longBitsToDouble(0x5EC7B55696EF45F4L ^ 0x1EC7B55696EF45F4L), d2 - Double.longBitsToDouble((long)1148510823 ^ 0x400000004474E267L), d + d3 + Double.longBitsToDouble((long)0x166EEE66 ^ 0x40000000166EEE66L), d2 + d6 + Double.longBitsToDouble(0x2A6A6602B486CAB3L ^ 0x6A6A6602B486CAB3L), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)-1287126177 ^ (long)-1287126158), (int)-457021451L ^ 0xE4C267D8, (int)((long)1143848959 ^ (long)1143848904)));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - 1.0, d2 - Double.longBitsToDouble((long)1252626254 ^ 0x400800004AA98F4EL), d + d3 + 1.0, d2 + d6 + 1.0, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)9699266 ^ (long)9699277) << 2, (int)((long)492545579 ^ (long)492545572) << 2, ((int)1526183525L ^ 0x5AF7B646) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d, d2 - Double.longBitsToDouble((long)535068603 ^ 0x401000001FE47FBBL), d + d3, d2 + d6, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)1755892230 ^ (long)1755892247) << 1, (int)((long)1432239194 ^ (long)1432239179) << 1, (int)((long)1281607460 ^ (long)1281607457) << 3));
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4746(entityPlayer.getName(), d + d3 / Double.longBitsToDouble((long)519649620 ^ 0x400000001EF93954L), d2 + this.Field13893, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)-2000677349 ^ (long)-2000677374) << 2, (int)((long)1380795278 ^ (long)1380795287) << 2));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d + this.Field13893, d2 + this.Field13893 * Double.longBitsToDouble(0x54A2EEA5A2D5EBC1L ^ 0x14AAEEA5A2D5EBC1L) + (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748(), d + this.Field13893 + Double.longBitsToDouble((long)15561920 ^ 0x403B000000ED74C0L), d2 + this.Field13893 * Double.longBitsToDouble((long)2084834106 ^ 0x400800007C440B3AL) + (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + Double.longBitsToDouble(0x3D5405DDA3989E1BL ^ 0x7D6F05DDA3989E1BL), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(((int)-703077747L ^ 0xD617E294) << 2, ((int)40888490L ^ 0x26FE8B3) << 2));
        GL11.glPushMatrix();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getTextureManager().bindTexture(leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getConnection().getPlayerInfo(entityPlayer.getName()).getLocationSkin());
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        Gui.drawScaledCustomSizeModalRect((int)((int)(d + this.Field13893 + 1.0)), (int)((int)(d2 + this.Field13893 * Double.longBitsToDouble((long)1990056137 ^ 0x40080000769DD8C9L) + (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + 1.0)), (float)Float.intBitsToFloat(0x30FC6B2B ^ 0x71FC6B2B), (float)Float.intBitsToFloat((int)1839970153L ^ 0x2CABB769), (int)(((int)2033108699L ^ 0x792EC6DA) << 3), (int)(((int)-185340650L ^ 0xF4F3ED17) << 3), (int)((int)1769108295L ^ 0x6972735E), (int)((int)((long)1656969633 ^ (long)1656969656)), (float)Float.intBitsToFloat((int)((long)202820309 ^ (long)1318505173)), (float)Float.intBitsToFloat((int)((long)1256937171 ^ (long)141252307)));
        GL11.glPopMatrix();
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4744("Health: " + (int)entityPlayer.getHealth(), d + this.Field13893 + Double.longBitsToDouble((long)694772145 ^ 0x403B0000296961B1L) + Double.longBitsToDouble(0xE5BC8748E87F80D4L ^ 0xA5AC8748E87F80D4L), d2 + this.Field13893 * Double.longBitsToDouble((long)1387238012 ^ 0x4008000052AF927CL) + (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748(), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(((int)-584507804L ^ 0xDD291E7D) << 2, ((int)1010977807L ^ 0x3C424C16) << 2));
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4744("Distance: " + (int)wXz7WiBH7SoFqgHg2mIXB7NZg9Hv6uOn.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getDistance((Entity)entityPlayer), d + this.Field13893 + Double.longBitsToDouble((long)677547044 ^ 0x403B000028628C24L) + Double.longBitsToDouble((long)45585021 ^ 0x4010000002B7927DL), d2 + this.Field13893 * Double.longBitsToDouble(0xB4CF23A88A285DF8L ^ 0xF4C723A88A285DF8L) + (double)(fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() * ((int)((long)646499353 ^ (long)646499352) << 1)) + Double.longBitsToDouble((long)877723927 ^ 0x4000000034510117L), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(((int)-602801347L ^ 0xDC11FB24) << 2, (int)((long)347097642 ^ (long)347097651) << 2));
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4744("On Ground: " + entityPlayer.onGround, d + this.Field13893 + Double.longBitsToDouble(0xA99AE7463706FEC4L ^ 0xE9A1E7463706FEC4L) + Double.longBitsToDouble(0x6DDF0A40938B5F27L ^ 0x2DCF0A40938B5F27L), d2 + this.Field13893 * Double.longBitsToDouble(0xF78B9A268BA347C3L ^ 0xB7839A268BA347C3L) + (double)(fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() * (int)((long)1630680488 ^ (long)1630680491)) + Double.longBitsToDouble(0xFCCE011094D60A32L ^ 0xBCDE011094D60A32L), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)-1980479584 ^ (long)-1980479559) << 2, (int)((long)-1586982318 ^ (long)-1586982325) << 2));
        double d7 = d + this.Field13893;
        for (ItemStack itemStack : entityPlayer.getArmorInventoryList()) {
            if (itemStack.isEmpty) continue;
            GL11.glPushMatrix();
            GL11.glTranslated((double)d7, (double)(d2 + this.Field13893 * Double.longBitsToDouble((long)1521690082 ^ 0x400800005AB325E2L) + (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + Double.longBitsToDouble(0x13A8965AC2F8B2DEL ^ 0x5393965AC2F8B2DEL) + Double.longBitsToDouble(0x23AA0BD3BF007A34L ^ 0x1C4A0BD3BF007A34L)), (double)0.0);
            GL11.glScaled((double)Double.longBitsToDouble((long)1860159631 ^ 0x3FE99999F7465115L), (double)Double.longBitsToDouble(0xBC77A64C745BB452L ^ 0x839E3FD5EDC22DC8L), (double)Double.longBitsToDouble(0xE426A17AAF5DFBFBL ^ 0xDBCF38E336C46261L));
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemIntoGUI(itemStack, (int)((long)576522574 ^ (long)576522574), (int)((long)832007398 ^ (long)832007398));
            GL11.glPopMatrix();
            d7 += Double.longBitsToDouble(0x3EDB6AF964E04DCL ^ 0x43C5B6AF964E04DCL);
        }
        if (!entityPlayer.getHeldItemMainhand().isEmpty) {
            GL11.glPushMatrix();
            GL11.glTranslated((double)d7, (double)(d2 + this.Field13893 * Double.longBitsToDouble((long)496568014 ^ 0x400800001D9906CEL) + (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + Double.longBitsToDouble(0x1B8AC1BD3938A099L ^ 0x5BB1C1BD3938A099L) + Double.longBitsToDouble(0x3DD196F39B2BE5F6L ^ 0x23196F39B2BE5F6L)), (double)0.0);
            GL11.glScaled((double)Double.longBitsToDouble((long)1436153261 ^ 0x3FE99999CC006C37L), (double)Double.longBitsToDouble((long)328881001 ^ 0x3FE999998A03CAF3L), (double)Double.longBitsToDouble((long)15862397 ^ 0x3FE99999996B93E7L));
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemIntoGUI(entityPlayer.getHeldItemMainhand(), (int)-1763306421L ^ 0x96E6144B, (int)((long)-1002069699 ^ (long)-1002069699));
            GL11.glPopMatrix();
            d7 += Double.longBitsToDouble(0x703A9508319013A4L ^ 0x30129508319013A4L);
        }
        if (!entityPlayer.getHeldItemOffhand().isEmpty) {
            GL11.glPushMatrix();
            GL11.glTranslated((double)d7, (double)(d2 + this.Field13893 * Double.longBitsToDouble((long)1842977999 ^ 0x400800006DD99CCFL) + (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + Double.longBitsToDouble(0x22A3DC2C1C96A9EEL ^ 0x6298DC2C1C96A9EEL) + Double.longBitsToDouble(0x942CA990259B9E37L ^ 0xABCCA990259B9E37L)), (double)0.0);
            GL11.glScaled((double)Double.longBitsToDouble((long)1996697381 ^ 0x3FE99999EE9AB6BFL), (double)Double.longBitsToDouble((long)2138533633 ^ 0x3FE99999E6EEF69BL), (double)Double.longBitsToDouble((long)1297789029 ^ 0x3FE99999D4C329FFL));
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getRenderItem().renderItemIntoGUI(entityPlayer.getHeldItemOffhand(), (int)((long)936569329 ^ (long)936569329), (int)((long)-430527272 ^ (long)-430527272));
            GL11.glPopMatrix();
        }
        double d8 = MathHelper.clamp((double)entityPlayer.getCooledAttackStrength(0.0f), (double)Double.longBitsToDouble((long)22942200 ^ 0x3FB9999998C78862L), (double)1.0);
        this.Field13892 = UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method1301(d8 * d4, this.Field13892, Double.longBitsToDouble((long)1868126548 ^ 0x3FA99999F6C0C0CEL));
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745("Cooldown", d + this.Field13893, d2 + this.Field13893 * Double.longBitsToDouble((long)935782247 ^ 0x4008000037C6E767L) + (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + Double.longBitsToDouble((long)1022576889 ^ 0x403B00003CF348F9L) + Double.longBitsToDouble(0x4261053BC23CD0C9L ^ 0x271053BC23CD0C9L) + Double.longBitsToDouble((long)241748248 ^ 0x402800000E68C918L), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(((int)-1004586221L ^ 0xC41F3B0A) << 2, (int)((long)866696139 ^ (long)866696146) << 2));
        this.Method5252(d + this.Field13893, d2 + this.Field13893 * Double.longBitsToDouble((long)1758041059 ^ 0x4008000068C993E3L) + (double)(fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() * ((int)((long)-639917052 ^ (long)-639917051) << 1)) + Double.longBitsToDouble(0x46FF00D6DA9F4939L ^ 0x6C400D6DA9F4939L) + Double.longBitsToDouble(0xDFF7BA221D7ECF5FL ^ 0x9FEFBA221D7ECF5FL) + Double.longBitsToDouble(0xED32EDF929F46932L ^ 0xAD1AEDF929F46932L), this.Field13892, fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748());
        ++n;
        if (this.Field13890.Method2797(0x58186A0FL & 0x467800FL)) {
            this.Field13891 = UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method1301((double)(entityPlayer.getHealth() / entityPlayer.getMaxHealth()) * d4, this.Field13891, Double.longBitsToDouble((long)1028258047 ^ 0x3FA99999A4D06165L));
            this.Field13890.Method2801();
        }
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745("Health", d + this.Field13893, d2 + this.Field13893 * Double.longBitsToDouble((long)1140496003 ^ 0x4008000043FA9683L) + (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + Double.longBitsToDouble(0x7AB04CDA3C59EF00L ^ 0x3A8B4CDA3C59EF00L) + Double.longBitsToDouble((long)166546024 ^ 0x4010000009ED4A68L) + (double)n * d5 + Double.longBitsToDouble((long)264971255 ^ 0x402800000FCB23F7L), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(((int)614913821L ^ 0x24A6D704) << 2, (int)((long)-478969196 ^ (long)-478969203) << 2));
        this.Method5252(d + this.Field13893, d2 + this.Field13893 * Double.longBitsToDouble((long)438130558 ^ 0x400800001A1D577EL) + (double)(fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() * (((int)-145823197L ^ 0xF74EEA22) << 1)) + Double.longBitsToDouble((long)209086661 ^ 0x403B00000C7668C5L) + Double.longBitsToDouble((long)175337875 ^ 0x401800000A737193L) + (double)n * d5 + Double.longBitsToDouble(0x51299DCB99D40DDFL ^ 0x11019DCB99D40DDFL), this.Field13891, fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748());
    }

    private void Method5252(double d, double d2, double d3, double d4) {
        if (this.Field13897.Method365()) {
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawShadowSliders(d, d2, d3, d4, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)-1810744196 ^ (long)-1810744219) << 2, ((int)1348736954L ^ 0x506417A3) << 2), 1.0);
            return;
        }
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d, d2, d + d3, d2 + d4, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(((int)563644560L ^ 0x21988889) << 2, (int)((long)1029106799 ^ (long)1029106806) << 2));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)264841472L ^ 0xFC92900;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-568867122L ^ 0xDE17C631);
            int n2 = (int)((long)1666986624 ^ (long)1666986645);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)771535631 ^ (long)771523902) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

