//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUt;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz
extends qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2 {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12404 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Astolfo", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1905873924 ^ (long)-1905873923)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12405 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)-1252527241L ^ 0xB557F388, (int)((long)425595643 ^ (long)425595396), (int)1620447007L ^ 0x60960FE0, (int)1175801576L ^ 0x46154E17)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12406 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field17535));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12407 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Image Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14093).Method313(this::Method4126));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12408 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Bold", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1483345008L ^ 0xA795F390) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12409 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Glow", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1781905544L ^ 0x6A35B888) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12410 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Glow Offset", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x264FDB37D619D810L ^ 0x665BDB37D619D810L), 0.0, Double.longBitsToDouble(0xAB3F0D0AAF649185L ^ 0xEB0B0D0AAF649185L), (boolean)((long)1519719963 ^ (long)1519719962)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12411 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("CSGO Version", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-814748934L ^ 0xCF6FEAFA) != 0));
    private int Field12412;

    public XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz() {
        super("Logo", "lava-hack on top");
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method4125(RenderGameOverlayEvent.Text text) {
        String string = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6783();
        String string2 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6785();
        if (this.Field12406.Method309("Simple")) {
            int n;
            int n2 = n = this.Field12404.Method365() ? zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)-385950255 ^ (long)-385950264) << 2, (int)((long)1457483082 ^ (long)1457483091) << 2) : this.Field12405.Method339().Method3626();
            if (this.Field12409.Method365()) {
                int n3 = this.Field12410.Method335();
                hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawGlow(((int)850271968L ^ 0x32AE1EE1) - n3, (int)((long)-1076615184 ^ (long)-1076615183) - n3, (int)((long)396766874 ^ (long)396766875) + fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(string + string2) + n3, ((int)-832727907L ^ 0xCE5D949C) + fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + n3, n);
            }
            fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745((this.Field12408.Method365() ? TextFormatting.BOLD : "") + string + " " + TextFormatting.GRAY + string2, 1.0, 1.0, n);
            return;
        }
        if (this.Field12406.Method309("CSGO")) {
            String string3 = string + (this.Field12411.Method365() ? TextFormatting.GRAY + " | " + TextFormatting.RESET + leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6785() : "") + TextFormatting.GRAY + " | " + TextFormatting.RESET + XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getName() + TextFormatting.GRAY + " | " + TextFormatting.RESET + (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.isSingleplayer() ? (int)1133611059L ^ 0x43918833 : leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16275.Method7401()) + " ms" + TextFormatting.GRAY + " | " + TextFormatting.RESET + "FPS " + Minecraft.getDebugFPS();
            int n = this.Field12404.Method365() ? zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)1127077311 ^ (long)1127077286) << 2, ((int)-746174408L ^ 0xD3864821) << 2) : this.Field12405.Method339().Method3626();
            int n4 = (int)1443517163L ^ 0x560A52E8;
            int n5 = (int)((long)1072318633 ^ (long)1072318632) << 3;
            int n6 = (((int)-1654432884L ^ 0x9D635B8D) << 2) + fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(string3);
            int n7 = ((int)((long)-2031352406 ^ (long)-2031352405) << 2) + fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748();
            Gui.drawRect((int)(n4 + ((int)421177565L ^ 0x191AA8DE)), (int)(n5 + ((int)-1854628695L ^ 0x91749CAA)), (int)(n4 + n6 + ((int)-17409304L ^ 0xFEF65AEB)), (int)(n5 + n7 - (int)((long)111854434 ^ (long)111854433)), (int)zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)-940386749 ^ (long)-940386718), (int)((long)2112324724 ^ (long)2112324693), (int)((long)1401325742 ^ (long)1401325755) << 1));
            Gui.drawRect((int)(n4 + (int)((long)-1127733994 ^ (long)-1127733995)), (int)n5, (int)(n4 + n6 + ((int)-2071891163L ^ 0x84817326)), (int)(n5 + n7), (int)zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)1905413795 ^ (long)1905413762), (int)-1605627080L ^ 0xA04C1319, (int)((long)764187058 ^ (long)764187047) << 1));
            Gui.drawRect((int)(n4 + ((int)((long)1016113912 ^ (long)1016113913) << 1)), (int)(n5 + ((int)((long)-1190046046 ^ (long)-1190046045) << 1)), (int)(n4 + n6 + (((int)211236277L ^ 0xC9735B4) << 1)), (int)(n5 + n7 - ((int)((long)1267421531 ^ (long)1267421530) << 1)), (int)zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)-724501072L ^ 0xD4D0FD9D, (int)-606862330L ^ 0xDBD4042B, (int)-1399645936L ^ 0xAC931927));
            Gui.drawRect((int)(n4 + ((int)((long)-1187622576 ^ (long)-1187622575) << 1)), (int)n5, (int)(n4 + n6 + ((int)((long)1693494047 ^ (long)1693494046) << 1)), (int)(n5 + n7), (int)zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)477160676 ^ (long)477160649), (int)-814344382L ^ 0xCF76176F, (int)((long)-1857362050 ^ (long)-1857362103)));
            Gui.drawRect((int)(n4 + (int)((long)621211947 ^ (long)621211946)), (int)(n5 + (int)((long)-19699727 ^ (long)-19699728)), (int)(n4 + n6 + ((int)984692539L ^ 0x3AB1373A)), (int)(n5 + n7 - (int)((long)-2090460585 ^ (long)-2090460586)), (int)zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)375516682 ^ (long)375516677) << 2, ((int)-1017166432L ^ 0xC35F45AF) << 2, (int)((long)-1194108915 ^ (long)-1194108882) << 1));
            Gui.drawRect((int)(n4 + (int)((long)-574626303 ^ (long)-574626304)), (int)n5, (int)(n4 + n6 + ((int)-1859425142L ^ 0x912B6C8B)), (int)(n5 + n7), (int)zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)2087460126 ^ (long)2087460113) << 2, ((int)-1721141903L ^ 0x9969757E) << 2, (int)((long)-1506994222 ^ (long)-1506994191) << 1));
            Gui.drawRect((int)(n4 - (int)((long)1067958462 ^ (long)1067958461)), (int)(n5 - (((int)-567504771L ^ 0xDE2C907C) << 3)), (int)(n4 + n6 + ((int)1136068229L ^ 0x43B70686)), (int)(n5 + n7 - (int)((long)-1310164920 ^ (long)-1310164917)), (int)zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)920131067 ^ (long)920131034), (int)((long)743936735 ^ (long)743936766), (int)((long)-1531134344 ^ (long)-1531134355) << 1));
            Gui.drawRect((int)(n4 - (int)((long)-1396023016 ^ (long)-1396023013)), (int)n5, (int)(n4 + n6 + ((int)2068602063L ^ 0x7B4C5CCC)), (int)(n5 + n7), (int)zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)2071583680L ^ 0x7B79DBE1, (int)((long)-2127393161 ^ (long)-2127393194), (int)((long)-1461658047 ^ (long)-1461658028) << 1));
            Gui.drawRect((int)(n4 - (((int)-1254784361L ^ 0xB5358296) << 1)), (int)(n5 - (int)((long)-2113745723 ^ (long)-2113745726)), (int)(n4 + n6 + ((int)((long)585900055 ^ (long)585900054) << 1)), (int)(n5 + n7 - ((int)((long)1470046197 ^ (long)1470046196) << 1)), (int)zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)1835995851L ^ 0x6D6F12E6, (int)-1159701156L ^ 0xBAE05D71, (int)-1655440838L ^ 0x9D53FA0D));
            Gui.drawRect((int)(n4 - ((int)((long)-870228299 ^ (long)-870228300) << 1)), (int)n5, (int)(n4 + n6 + (((int)1762645665L ^ 0x690FD6A0) << 1)), (int)(n5 + n7), (int)zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)483555639L ^ 0x1CD2791A, (int)417531494L ^ 0x18E3064B, (int)((long)-509890478 ^ (long)-509890459)));
            Gui.drawRect((int)(n4 - (int)((long)-1314602082 ^ (long)-1314602081)), (int)(n5 - ((int)((long)276813658 ^ (long)276813657) << 1)), (int)(n4 + n6 + (int)((long)-689171355 ^ (long)-689171356)), (int)(n5 + n7 - ((int)-1339509760L ^ 0xB028B401)), (int)zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)114797607 ^ (long)114797608) << 2, ((int)-1175655553L ^ 0xB9ECEB70) << 2, ((int)-1768010019L ^ 0x969E4EFE) << 1));
            Gui.drawRect((int)(n4 - ((int)-79636716L ^ 0xFB40D715)), (int)n5, (int)(n4 + n6 + (int)((long)-825948368 ^ (long)-825948367)), (int)(n5 + n7), (int)zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718(((int)1683882853L ^ 0x645E036A) << 2, ((int)934689576L ^ 0x37B63B27) << 2, ((int)-1773842502L ^ 0x96454F99) << 1));
            Gui.drawRect((int)n4, (int)(n5 - (int)((long)1779352914 ^ (long)1779352919)), (int)(n4 + n6), (int)(n5 + n7), (int)n);
            Gui.drawRect((int)(n4 - (int)((long)-1782041106 ^ (long)-1782041107)), (int)(n5 - ((int)-635143249L ^ 0xDA247BAE)), (int)(n4 + n6 + (int)((long)-550808247 ^ (long)-550808246)), (int)(n5 + n7 + (int)((long)-542682585 ^ (long)-542682588)), (int)zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)980589247 ^ (long)980589214), (int)((long)-1626827289 ^ (long)-1626827322), ((int)-2086242624L ^ 0x83A676D5) << 1));
            Gui.drawRect((int)(n4 - ((int)((long)1713712482 ^ (long)1713712483) << 1)), (int)(n5 - (((int)-1168389990L ^ 0xBA5BC89B) << 1)), (int)(n4 + n6 + ((int)((long)-1019304193 ^ (long)-1019304194) << 1)), (int)(n5 + n7 + (((int)1115320881L ^ 0x427A7230) << 1)), (int)zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)-511857488 ^ (long)-511857507), (int)((long)727307414 ^ (long)727307451), (int)-335954045L ^ 0xEBF9BFB4));
            Gui.drawRect((int)(n4 - ((int)566348207L ^ 0x21C1C9AE)), (int)(n5 - (int)((long)-650871248 ^ (long)-650871245)), (int)(n4 + n6 + ((int)-2085257629L ^ 0x83B57E62)), (int)(n5 + n7 + ((int)-1589794893L ^ 0xA13DA7B2)), (int)zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)1736636733 ^ (long)1736636722) << 2, ((int)2135000702L ^ 0x7F418671) << 2, (int)((long)940830015 ^ (long)940829980) << 1));
            Gui.drawRect((int)n4, (int)(n5 - ((int)((long)-1482773745 ^ (long)-1482773746) << 2)), (int)(n4 + n6), (int)(n5 + n7), (int)zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718(((int)-1000525864L ^ 0xC45D2FC9) << 1, (int)((long)1005226329 ^ (long)1005226312) << 1, ((int)-1118038740L ^ 0xBD5C1529) << 3));
            fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745((this.Field12408.Method365() ? TextFormatting.BOLD : "") + string3, n4 + (((int)-1656019775L ^ 0x9D4B24C0) << 1), n5 + (((int)855080527L ^ 0x32F77E4E) << 1), n);
            return;
        }
        if (this.Field12406.Method309("GishCode")) {
            int n = this.Field12404.Method365() ? zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)-1438343891 ^ (long)-1438343884) << 2, ((int)-1564856298L ^ 0xA2BA300F) << 2) : this.Field12405.Method339().Method3626();
            GL11.glPushMatrix();
            GL11.glScaled((double)Double.longBitsToDouble((long)1021547323 ^ 0x3FF800003CE3933BL), (double)Double.longBitsToDouble((long)61784917 ^ 0x3FF8000003AEC355L), (double)Double.longBitsToDouble(0x9277F47DF5FA1BA3L ^ 0xAD8FF47DF5FA1BA3L));
            XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer.drawStringWithShadow("LavaHack", Float.intBitsToFloat((int)((long)418005989 ^ (long)1483359205)), Float.intBitsToFloat((int)((long)684548644 ^ (long)1749901860)), n);
            GL11.glScaled((double)Double.longBitsToDouble(0xD72D343499CD98E3L ^ 0xE8CE0707AAFEABD0L), (double)Double.longBitsToDouble((long)1241847491 ^ 0x3FE33333793625F0L), (double)Double.longBitsToDouble(0x1D420A59B9DE0805L ^ 0x22A1396A8AED3B36L));
            XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer.drawStringWithShadow(TextFormatting.GRAY + leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6785(), Float.intBitsToFloat(0x6B07C975 ^ 0x29AFC975), Float.intBitsToFloat((int)((long)1751983694 ^ (long)686630478)), (int)1948985204L ^ 0x8BD4D88B);
            XVHfC2Z9UkTbIqrCdFAG82UX2Wxse5Oz.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer.drawStringWithShadow(TextFormatting.GRAY + "1.12.2", Float.intBitsToFloat(0x35092918 ^ 0x77A12918), Float.intBitsToFloat((int)((long)1420050000 ^ (long)365182544)), (int)530949761L ^ 0xE05A597E);
            GL11.glPopMatrix();
            return;
        }
        if (this.Field12407.Method309("Old")) {
            yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUt.Field11995.Method3868(0.0, 0.0, Double.longBitsToDouble((long)65804782 ^ 0x4049000003EC19EEL), Double.longBitsToDouble(0xC9EEEE4AF8A7AC23L ^ 0x89A7EE4AF8A7AC23L));
            return;
        }
        if (!this.Field12407.Method309("New")) return;
        yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUt.Field11996.Method3869(0.0, 0.0, Double.longBitsToDouble(0x3896DBBEEAA9C475L ^ 0x78C2DBBEEAA9C475L), Double.longBitsToDouble((long)1344895920 ^ 0x4054000050297BB0L), new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)-735786528 ^ (long)-735786503) << 2, ((int)-990632130L ^ 0xC4F42727) << 2)));
    }

    private Boolean Method4126() {
        return this.Field12406.Method309("Image");
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-30644157L ^ 0xFE2C6843;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)651783279 ^ (long)651783312);
            int n2 = (int)790470526L ^ 0x2F1D9FE7;
            cArray2[n] = (char)(cArray[n] ^ (((int)1451107768L ^ 0x567E31D9) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

