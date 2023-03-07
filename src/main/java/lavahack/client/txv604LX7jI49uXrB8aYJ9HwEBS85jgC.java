//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.MathHelper
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import com.kisman.cc.util.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import lavahack.client.qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.txv604LX7jI49uXrB8aYJ9HwEBS85jgC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class txv604LX7jI49uXrB8aYJ9HwEBS85jgC
extends qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2 {
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field17568 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private final int Field17569 = (int)((long)586088364 ^ (long)586088351);
    private final int Field17570 = ((int)-1237798643L ^ 0xB638B10C) << 1;
    private final String Field17571 = "Indicators";
    private final String Field17572 = "Cooldown";
    private double Field17573 = 0.0;
    private double Field17574 = 0.0;
    private double Field17575 = 0.0;
    private double Field17576 = 0.0;
    private final double Field17577 = Double.longBitsToDouble(0xFC2B2BB0E41926C1L ^ 0xBC3F2BB0E41926C1L);
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17578 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Theme", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, txv604LX7jI49uXrB8aYJ9HwEBS85jgC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12073));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17579 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Shadow", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1773781928L ^ 0x96463C59) != 0));
    private String Field17580 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public txv604LX7jI49uXrB8aYJ9HwEBS85jgC() {
        super("Indicators", ((int)-742597262L ^ 0xD3BCDD73) != 0);
        this.Method271(Double.longBitsToDouble((long)1921626638 ^ 0x400800007289B20EL));
        this.Method272(Double.longBitsToDouble((long)1227170882 ^ 0x4020000049252442L));
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method7638(RenderGameOverlayEvent.Text text) {
        String string = this.Field17578.Method359();
        int n = (int)-1467748708L ^ 0x577C1163;
        switch (string.hashCode()) {
            case -1085510111: {
                if (!string.equals("Default")) return;
                n = (int)((long)-1184373032 ^ (long)-1184373032);
                return;
            }
            case -1529165460: {
                if (!string.equals("Rewrite")) return;
                n = (int)-1639425248L ^ 0x9E485B21;
                return;
            }
        }
    }

    private void Method20() {
        double d = this.Method267();
        double d2 = this.Method268();
        double d3 = this.Method269();
        double d4 = this.Method270();
        double d5 = (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + Double.longBitsToDouble(0x9985215BF7114FB7L ^ 0xD991215BF7114FB7L);
        int n = (int)((long)-1919247890 ^ (long)-1919247890);
        double d6 = txv604LX7jI49uXrB8aYJ9HwEBS85jgC.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.posX - txv604LX7jI49uXrB8aYJ9HwEBS85jgC.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.prevPosX;
        double d7 = txv604LX7jI49uXrB8aYJ9HwEBS85jgC.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.posZ - txv604LX7jI49uXrB8aYJ9HwEBS85jgC.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.prevPosZ;
        double d8 = Math.sqrt(d6 * d6 + d7 * d7);
        double d9 = d8 * Double.longBitsToDouble(0x649934D3A67C3D3AL ^ 0x24B78208CBCA4015L) / Double.longBitsToDouble(0x3E97893AD0153B5BL ^ 0x7E87893AD0153B5BL);
        double d10 = MathHelper.clamp((double)txv604LX7jI49uXrB8aYJ9HwEBS85jgC.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getCooledAttackStrength(0.0f), (double)Double.longBitsToDouble((long)488661941 ^ 0x3FB9999984B9FA2FL), (double)1.0);
        this.Field17573 = UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method1301(d10 * (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741("Cooldown"), this.Field17573, Double.longBitsToDouble(0x885DEA521F76F34BL ^ 0xB7F473CB86EF6AD1L));
        double d11 = MathHelper.clamp((int)txv604LX7jI49uXrB8aYJ9HwEBS85jgC.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.hurtTime, (int)((int)((long)1337867934 ^ (long)1337867934)), (int)((int)((long)-1814259836 ^ (long)-1814259835)));
        this.Field17574 = UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method1301(d11 * (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741("Cooldown"), this.Field17574, Double.longBitsToDouble(0xCBBEDF7C1212B20EL ^ 0xF41746E58B8B2B94L));
        if (this.Field17574 < 0.0) {
            this.Field17574 = 0.0;
        }
        double d12 = MathHelper.clamp((double)(d9 / Double.longBitsToDouble(0xC1947E2E29F0025BL ^ 0x81974D1D1AC33168L)), (double)Double.longBitsToDouble((long)362378521 ^ 0x3FB999998C00EC83L), (double)1.0);
        this.Field17575 = UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method1301(d12 * (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741("Cooldown"), this.Field17575, Double.longBitsToDouble((long)1090038801 ^ 0x3FA99999D961358BL));
        double d13 = txv604LX7jI49uXrB8aYJ9HwEBS85jgC.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getHealth() / txv604LX7jI49uXrB8aYJ9HwEBS85jgC.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getMaxHealth();
        if (this.Field17568.Method2797(0x4A20746FL & 0x2100009FL)) {
            this.Field17576 = UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method1301(d13 * (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741("Cooldown"), this.Field17576, Double.longBitsToDouble((long)100949701 ^ 0x3FA999999F9DC75FL));
            this.Field17568.Method2801();
        }
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d + Double.longBitsToDouble((long)1139673597 ^ 0x4008000043EE09FDL), d2 + Double.longBitsToDouble((long)365774627 ^ 0x4008000015CD4723L), d + d3 + Double.longBitsToDouble(0x4464AC6B14426613L ^ 0x46CAC6B14426613L), d2 + d4 - Double.longBitsToDouble((long)614272395 ^ 0x40080000249D0D8BL), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)-164059103L ^ 0xF638A800, (int)((long)-962458275 ^ (long)-962458244), (int)((long)1458537573 ^ (long)1458537584) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d + Double.longBitsToDouble(0x3D86B5AEFCC5161CL ^ 0x7D8EB5AEFCC5161CL), d2, d + d3 + Double.longBitsToDouble((long)973975910 ^ 0x400800003A0DB166L), d2 + d4, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)-250166790 ^ (long)-250166821), (int)((long)335141421 ^ (long)335141388), (int)((long)1804732381 ^ (long)1804732360) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d + Double.longBitsToDouble(0xF4CEADC578230L ^ 0x400F4CEADC578230L), d2 + Double.longBitsToDouble(0x2062B38331999C6EL ^ 0x6062B38331999C6EL), d + d3 + Double.longBitsToDouble((long)300836784 ^ 0x4000000011EE67B0L), d2 + d4 - Double.longBitsToDouble((long)1228645116 ^ 0x40000000493BA2FCL), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)1132704723 ^ (long)1132704766), (int)((long)30721045 ^ (long)30721080), (int)-131517401L ^ 0xF8293410));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d + Double.longBitsToDouble((long)571790466 ^ 0x400000002214D482L), d2, d + d3 + Double.longBitsToDouble(0x7D837010C57B5813L ^ 0x3D837010C57B5813L), d2 + d4, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)803712564L ^ 0x2FE7AE19, (int)((long)957813373 ^ (long)957813328), (int)((long)1314053180 ^ (long)1314053131)));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d + 1.0, d2 + 1.0, d + d3 + 1.0, d2 + d4 - 1.0, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718(((int)-1375886692L ^ 0xADFDA293) << 2, (int)((long)1367777160 ^ (long)1367777159) << 2, ((int)-1301978618L ^ 0xB2656225) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d + 1.0, d2, d + d3 + 1.0, d2 + d4, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)-1861446469 ^ (long)-1861446476) << 2, ((int)1269946362L ^ 0x4BB1D7F5) << 2, ((int)-752408508L ^ 0xD3272867) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - Double.longBitsToDouble(0x50C2AA412ADE63E9L ^ 0x10CAAA412ADE63E9L), d2 - Double.longBitsToDouble(0x6D3AD15564BAB132L ^ 0x2D1AD15564BAB132L), d + d3 + Double.longBitsToDouble((long)405340468 ^ 0x4008000018290134L), d2 + d4 - Double.longBitsToDouble((long)1838546790 ^ 0x400800006D95FF66L), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)1706418142 ^ (long)1706418175), (int)((long)2052663229 ^ (long)2052663196), (int)((long)160773981 ^ (long)160773960) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - Double.longBitsToDouble(0x67562E163C27D919L ^ 0x275E2E163C27D919L), d2, d + d3 + Double.longBitsToDouble(0x2F9B004E69C48A37L ^ 0x6F93004E69C48A37L), d2 + d4, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)1594428835 ^ (long)1594428802), (int)-1877981313L ^ 0x9010475E, (int)((long)1693696211 ^ (long)1693696198) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - Double.longBitsToDouble((long)1671915232 ^ 0x4000000063A766E0L), d2 - Double.longBitsToDouble(0x489E40BDB339AF7EL ^ 0x88240BDB339AF7EL), d + d3 + Double.longBitsToDouble((long)433898811 ^ 0x4000000019DCC53BL), d2 + d4 - Double.longBitsToDouble(0x132140B302CB03F9L ^ 0x532140B302CB03F9L), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)-1114680847 ^ (long)-1114680868), (int)-922866736L ^ 0xC8FE2BFD, (int)((long)1472795596 ^ (long)1472795643)));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - Double.longBitsToDouble((long)8450033 ^ 0x400000000080EFF1L), d2, d + d3 + Double.longBitsToDouble(0xDA6A53CB52B1254EL ^ 0x9A6A53CB52B1254EL), d2 + d4, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)392172376 ^ (long)392172405), (int)-774970912L ^ 0xD1CEE1CD, (int)1028440026L ^ 0x3D4CBFED));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - 1.0, d2 - Double.longBitsToDouble(0xBDBC19B64FF39693L ^ 0xFDA419B64FF39693L), d + d3 + 1.0, d2 + d4 - 1.0, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)-687502469 ^ (long)-687502476) << 2, ((int)-133499396L ^ 0xF80AF5F3) << 2, (int)((long)596726230 ^ (long)596726261) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - 1.0, d2, d + d3 + 1.0, d2 + d4, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718(((int)621588741L ^ 0x250CB10A) << 2, ((int)2139282827L ^ 0x7F82DD84) << 2, (int)((long)719350436 ^ (long)719350407) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d, d2 - Double.longBitsToDouble((long)1215309794 ^ 0x40140000487027E2L), d + d3, d2 + d4, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(((int)916478378L ^ 0x36A059B3) << 2, (int)((long)-1043772364 ^ (long)-1043772371) << 2));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - Double.longBitsToDouble(0xFD894F16B43C6845L ^ 0xBD814F16B43C6845L), d2 - 1.0, d + d3 + Double.longBitsToDouble((long)1515563159 ^ 0x400800005A55A897L), d2 + d4 + Double.longBitsToDouble(0xFD0D5850B743EE5CL ^ 0xBD055850B743EE5CL), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)2092155605 ^ (long)2092155636), (int)-112841717L ^ 0xF9462C2A, ((int)-1945838240L ^ 0x8C04DD75) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - Double.longBitsToDouble((long)306676522 ^ 0x400000001247832AL), d2 - Double.longBitsToDouble(0x43782642C4E8FE8EL ^ 0x3782642C4E8FE8EL), d + d3 + Double.longBitsToDouble((long)1225043461 ^ 0x400000004904AE05L), d2 + d4 + Double.longBitsToDouble((long)606708513 ^ 0x400000002429A321L), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)-724181160 ^ (long)-724181131), (int)1702845294L ^ 0x657F5B43, (int)1500606455L ^ 0x59716FC0));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - 1.0, d2 - Double.longBitsToDouble((long)1192808413 ^ 0x400800004718CFDDL), d + d3 + 1.0, d2 + d4 + 1.0, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)1095629747 ^ (long)1095629756) << 2, ((int)382003630L ^ 0x16C4E9A1) << 2, (int)((long)-616084987 ^ (long)-616084954) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d, d2 - Double.longBitsToDouble((long)401825090 ^ 0x4010000017F35D42L), d + d3, d2 + d4, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)-2131545834 ^ (long)-2131545849) << 1, ((int)2068565046L ^ 0x7B4BCC27) << 1, (int)((long)1536379077 ^ (long)1536379072) << 3));
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4746("Indicators", d + d3 / Double.longBitsToDouble((long)250687629 ^ 0x400000000EF1308DL), d2 + Double.longBitsToDouble((long)796958571 ^ 0x401400002F809F6BL), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(((int)358935007L ^ 0x1564E9C6) << 2, ((int)2082010731L ^ 0x7C18F672) << 2));
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745("Cooldown", d + Double.longBitsToDouble(0x854C997C1E279B4AL ^ 0xC558997C1E279B4AL), d2 + Double.longBitsToDouble(0x5FBD46B5E982BCF7L ^ 0x1F9346B5E982BCF7L) + (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748(), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)354341422 ^ (long)354341431) << 2, ((int)-966552822L ^ 0xC6639313) << 2));
        this.Method7639(d + Double.longBitsToDouble((long)1149622990 ^ 0x402400004485DACEL) + (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741("Cooldown"), d2 + Double.longBitsToDouble(0x73B5A409278B990DL ^ 0x339BA409278B990DL) + (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748(), this.Field17573, fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748());
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745("HurtTime", d + Double.longBitsToDouble(0x31104B78DB0137D6L ^ 0x71044B78DB0137D6L), d2 + Double.longBitsToDouble((long)813493071 ^ 0x402E0000307CEB4FL) + (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + d5 * (double)(++n), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(((int)1641454160L ^ 0x61D69A49) << 2, (int)((long)1659935955 ^ (long)1659935946) << 2));
        this.Method7639(d + Double.longBitsToDouble((long)1187551941 ^ 0x4024000046C89AC5L) + (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741("Cooldown"), d2 + Double.longBitsToDouble(0x490A1AC2B47FFFD1L ^ 0x9241AC2B47FFFD1L) + (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + d5 * (double)n, this.Field17574, fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748());
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745("Speed", d + Double.longBitsToDouble((long)1789922291 ^ 0x401400006AB00BF3L), d2 + Double.longBitsToDouble((long)1746688749 ^ 0x402E0000681C5AEDL) + (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + d5 * (double)(++n), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(((int)-244567682L ^ 0xF16C3167) << 2, (int)((long)1957418756 ^ (long)1957418781) << 2));
        this.Method7639(d + Double.longBitsToDouble(0x3FDAFCAC62016E8BL ^ 0x7FFEFCAC62016E8BL) + (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741("Cooldown"), d2 + Double.longBitsToDouble((long)102231137 ^ 0x402E00000617EC61L) + (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + d5 * (double)n, this.Field17575, fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748());
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745("Health", d + Double.longBitsToDouble(0x49D425B0DA9B3643L ^ 0x9C025B0DA9B3643L), d2 + Double.longBitsToDouble((long)452002334 ^ 0x402E00001AF1021EL) + (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + d5 * (double)(++n), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)-941355797 ^ (long)-941355790) << 2, (int)((long)1353527988 ^ (long)1353527981) << 2));
        this.Method7639(d + Double.longBitsToDouble((long)1142245482 ^ 0x402400004415486AL) + (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741("Cooldown"), d2 + Double.longBitsToDouble(0x2DA34FDEE48E3FA3L ^ 0x6D8D4FDEE48E3FA3L) + (double)fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + d5 * (double)n, this.Field17576, fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748());
    }

    private void Method7639(double d, double d2, double d3, double d4) {
        if (this.Field17579.Method365()) {
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawShadowSliders(d, d2, d3, d4, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(((int)1004086384L ^ 0x3BD92469) << 2, ((int)-1161283603L ^ 0xBAC837F4) << 2), 1.0);
            return;
        }
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d, d2, d + d3, d2 + d4, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)517834235 ^ (long)517834210) << 2, ((int)-204202559L ^ 0xF3D41DD8) << 2));
    }

    private void Method7640() {
        double d = this.Method267();
        double d2 = this.Method268();
        double d3 = this.Method269();
        double d4 = this.Method270();
        int n = (int)-506747678L ^ 0xE1CBA4E2;
        int n2 = this.Method7642() + ((int)((long)498692505 ^ (long)498692504) << 1) + ((int)-667285524L ^ 0xD83A07EF);
        double d5 = txv604LX7jI49uXrB8aYJ9HwEBS85jgC.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.posX - txv604LX7jI49uXrB8aYJ9HwEBS85jgC.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.prevPosX;
        double d6 = txv604LX7jI49uXrB8aYJ9HwEBS85jgC.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.posZ - txv604LX7jI49uXrB8aYJ9HwEBS85jgC.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.prevPosZ;
        double d7 = Math.sqrt(d5 * d5 + d6 * d6);
        double d8 = d7 * Double.longBitsToDouble((long)1692048673 ^ 0x402EB6DB096CE00EL) / Double.longBitsToDouble((long)2071917985 ^ 0x401000007B7EF5A1L);
        double d9 = MathHelper.clamp((double)txv604LX7jI49uXrB8aYJ9HwEBS85jgC.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getCooledAttackStrength(0.0f), (double)Double.longBitsToDouble((long)1189104447 ^ 0x3FB99999DF79D2A5L), (double)1.0);
        this.Field17573 = UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method1301(d9 * Double.longBitsToDouble(0xBBCD37A22AF6CD0EL ^ 0xFB84B7A22AF6CD0EL), this.Field17573, Double.longBitsToDouble(0xB975B8AF08BF468L ^ 0x343EC21369126DF2L));
        double d10 = MathHelper.clamp((int)txv604LX7jI49uXrB8aYJ9HwEBS85jgC.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.hurtTime, (int)((int)-1321982319L ^ 0xB1342691), (int)((int)1326528979L ^ 0x4F1139D2));
        this.Field17574 = UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method1301(d10 * Double.longBitsToDouble(0x61C6E9E030E99457L ^ 0x218F69E030E99457L), this.Field17574, Double.longBitsToDouble((long)533228372 ^ 0x3FA999998651F2CEL));
        if (this.Field17574 < 0.0) {
            this.Field17574 = 0.0;
        }
        double d11 = MathHelper.clamp((double)(d8 / Double.longBitsToDouble((long)49582256 ^ 0x4003333331C7A383L)), (double)Double.longBitsToDouble((long)1080366809 ^ 0x3FB99999D9FC8F43L), (double)1.0);
        this.Field17575 = UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method1301(d11 * Double.longBitsToDouble((long)984024951 ^ 0x404980003AA70777L), this.Field17575, Double.longBitsToDouble(0x28FDFF43209E1B24L ^ 0x175466DAB90782BEL));
        double d12 = txv604LX7jI49uXrB8aYJ9HwEBS85jgC.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getHealth() / txv604LX7jI49uXrB8aYJ9HwEBS85jgC.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getMaxHealth();
        if (this.Field17568.Method2797(0x880C02FL & 0x608289FL)) {
            this.Field17576 = UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method1301(d12 * Double.longBitsToDouble((long)71395656 ^ 0x4049800004416948L), this.Field17576, Double.longBitsToDouble(0x3C4D686C57CC28ECL ^ 0x3E4F1F5CE55B176L));
            this.Field17568.Method2801();
        }
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d + Double.longBitsToDouble(0x412B491CAAD2D93L ^ 0x441AB491CAAD2D93L), d2 + Double.longBitsToDouble(0xAD027793F06BED2CL ^ 0xED0A7793F06BED2CL), d + d3 + Double.longBitsToDouble((long)1492751131 ^ 0x4008000058F9931BL), d2 + d4 - Double.longBitsToDouble((long)319779423 ^ 0x40080000130F725FL), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)1193091320L ^ 0x471D20D9, (int)((long)1658209284 ^ (long)1658209317), ((int)-1617149958L ^ 0x9F9C3FEF) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d + Double.longBitsToDouble(0x49D2BE6C056B8B36L ^ 0x9DABE6C056B8B36L), d2, d + d3 + Double.longBitsToDouble(0xDB3F23EEC713F919L ^ 0x9B3723EEC713F919L), d2 + d4, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)177916642 ^ (long)177916611), (int)((long)-575679383 ^ (long)-575679416), (int)((long)1839847485 ^ (long)1839847464) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d + Double.longBitsToDouble((long)2059824910 ^ 0x400000007AC66F0EL), d2 + Double.longBitsToDouble(0xBC204652CB788E84L ^ 0xFC204652CB788E84L), d + d3 + Double.longBitsToDouble(0x612B8BB4B0DF6E83L ^ 0x212B8BB4B0DF6E83L), d2 + d4 - Double.longBitsToDouble((long)1279311579 ^ 0x400000004C40BEDBL), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)-932366555L ^ 0xC86D3708, (int)((long)1158336418 ^ (long)1158336399), (int)-1201490136L ^ 0xB862B71F));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d + Double.longBitsToDouble(0x486081314A763A19L ^ 0x86081314A763A19L), d2, d + d3 + Double.longBitsToDouble((long)1049656244 ^ 0x400000003E907BB4L), d2 + d4, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)-699862005L ^ 0xD648F426, (int)244082021L ^ 0xE8C6548, (int)((long)1150728103 ^ (long)1150728080)));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d + 1.0, d2 + 1.0, d + d3 + 1.0, d2 + d4 - 1.0, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)833280304 ^ (long)833280319) << 2, ((int)-548871209L ^ 0xDF48E3D8) << 2, (int)((long)542854945 ^ (long)542854914) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d + 1.0, d2, d + d3 + 1.0, d2 + d4, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)1807817512 ^ (long)1807817511) << 2, ((int)-50347002L ^ 0xFCFFC409) << 2, ((int)-1058852407L ^ 0xC0E331EA) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - Double.longBitsToDouble((long)509716678 ^ 0x400800001E61A8C6L), d2 - Double.longBitsToDouble((long)439924608 ^ 0x402000001A38B780L), d + d3 + Double.longBitsToDouble((long)1836851874 ^ 0x400800006D7C22A2L), d2 + d4 - Double.longBitsToDouble((long)884864122 ^ 0x4008000034BDF47AL), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)-1516511412 ^ (long)-1516511379), (int)((long)907638379 ^ (long)907638346), ((int)-325209532L ^ 0xEC9DB251) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - Double.longBitsToDouble((long)29250000 ^ 0x4008000001BE51D0L), d2, d + d3 + Double.longBitsToDouble((long)854997065 ^ 0x4008000032F63849L), d2 + d4, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)21665266L ^ 0x14A95D3, (int)((long)1091571643 ^ (long)1091571610), ((int)-1541176275L ^ 0xA4238438) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - Double.longBitsToDouble(0xA0D2444223C1C22CL ^ 0xE0D2444223C1C22CL), d2 - Double.longBitsToDouble(0x7D23BC398E0E32DDL ^ 0x3D3FBC398E0E32DDL), d + d3 + Double.longBitsToDouble(0xA8745F536CEFE8E9L ^ 0xE8745F536CEFE8E9L), d2 + d4 - Double.longBitsToDouble((long)1257430173 ^ 0x400000004AF2DC9DL), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)806652918L ^ 0x30148BDB, (int)((long)-1923889461 ^ (long)-1923889434), (int)-2049775091L ^ 0x85D2EA3A));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - Double.longBitsToDouble(0x7891D917A5293EEEL ^ 0x3891D917A5293EEEL), d2, d + d3 + Double.longBitsToDouble((long)2024094741 ^ 0x4000000078A53C15L), d2 + d4, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)-972386753L ^ 0xC60A8E12, (int)((long)-366612970 ^ (long)-366612933), (int)-85173808L ^ 0xFAEC59E7));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - 1.0, d2 - Double.longBitsToDouble(0x6133C12249447B3BL ^ 0x212BC12249447B3BL), d + d3 + 1.0, d2 + d4 - 1.0, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)1897583046 ^ (long)1897583049) << 2, (int)((long)-978042894 ^ (long)-978042883) << 2, (int)((long)1909687243 ^ (long)1909687272) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - 1.0, d2, d + d3 + 1.0, d2 + d4, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)-977632724 ^ (long)-977632733) << 2, (int)((long)521509421 ^ (long)521509410) << 2, (int)((long)2067301155 ^ (long)2067301120) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d, d2 - Double.longBitsToDouble(0x6C527471C15BC828L ^ 0x2C467471C15BC828L), d + d3, d2 + d4, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)354671598 ^ (long)354671607) << 2, (int)((long)1191544088 ^ (long)1191544065) << 2));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - Double.longBitsToDouble((long)46619538 ^ 0x4008000002C75B92L), d2 - 1.0, d + d3 + Double.longBitsToDouble(0x5741BF43488ADD3L ^ 0x457C1BF43488ADD3L), d2 + d4 + Double.longBitsToDouble(0xF0DA979F3D9F034AL ^ 0xB0D2979F3D9F034AL), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)851799811L ^ 0x32C56F22, (int)((long)194370648 ^ (long)194370681), ((int)-824408716L ^ 0xCEDC8561) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - Double.longBitsToDouble(0xEE733CF4D409C354L ^ 0xAE733CF4D409C354L), d2 - Double.longBitsToDouble((long)1758081291 ^ 0x4000000068CA310BL), d + d3 + Double.longBitsToDouble((long)511772792 ^ 0x400000001E810878L), d2 + d4 + Double.longBitsToDouble((long)506006946 ^ 0x400000001E290DA2L), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)-1850813756 ^ (long)-1850813719), (int)496351799L ^ 0x1D95BA1A, (int)2051494675L ^ 0x7A475324));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d - 1.0, d2 - Double.longBitsToDouble((long)574378222 ^ 0x40080000223C50EEL), d + d3 + 1.0, d2 + d4 + 1.0, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)173211902 ^ (long)173211889) << 2, ((int)-196251783L ^ 0xF44D6F76) << 2, ((int)1604244228L ^ 0x5F9ED327) << 1));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d, d2 - Double.longBitsToDouble((long)1219160723 ^ 0x4010000048AAEA93L), d + d3, d2 + d4, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4718((int)((long)-1713923696 ^ (long)-1713923711) << 1, ((int)-1750412761L ^ 0x97AAD236) << 1, (int)((long)-463648045 ^ (long)-463648042) << 3));
        this.Method7641("Indicators", d + (d3 / Double.longBitsToDouble(0x37AC856C1E938835L ^ 0x77AC856C1E938835L) - (double)(this.Method7643("Indicators") / ((int)((long)-1719126311 ^ (long)-1719126312) << 1))), d2 + Double.longBitsToDouble((long)203433394 ^ 0x400000000C2025B2L), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(((int)1913814513L ^ 0x72127DE8) << 2, (int)((long)-2137730253 ^ (long)-2137730262) << 2));
        this.Method7641("Cooldown", d + Double.longBitsToDouble(0x7B485F86CF2FF449L ^ 0x3B485F86CF2FF449L), d2 + (double)(n += this.Method7642() + (((int)-1602058113L ^ 0xA082887C) << 1)), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(((int)2055102116L ^ 0x7A7E5EBD) << 2, ((int)948696249L ^ 0x388BF4A0) << 2));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d + Double.longBitsToDouble((long)74101266 ^ 0x40000000046AB212L), d2 + (double)n + (double)this.Method7642() + 1.0, d + this.Field17573, d2 + (double)n + (double)this.Method7642() + Double.longBitsToDouble(0xC6176E7107303F73L ^ 0x861F6E7107303F73L), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(((int)-1450695733L ^ 0xA98823D2) << 2, ((int)623968015L ^ 0x2530FF16) << 2));
        this.Method7641("HurtTime", d + Double.longBitsToDouble(0x60AAA98DB0E2A444L ^ 0x20AAA98DB0E2A444L), d2 + (double)(n += n2), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)1476127139 ^ (long)1476127162) << 2, (int)((long)1019025627 ^ (long)1019025602) << 2));
        if (this.Field17574 > 0.0) {
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d + Double.longBitsToDouble((long)1011404818 ^ 0x400000003C48D012L), d2 + (double)n + (double)this.Method7642() + 1.0, d + this.Field17574, d2 + (double)n + (double)this.Method7642() + Double.longBitsToDouble((long)2132557829 ^ 0x400800007F1C4005L), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(((int)-582211005L ^ 0xDD4C2A5A) << 2, ((int)-1113744207L ^ 0xBD9D9CA8) << 2));
        }
        this.Method7641("Speed", d + Double.longBitsToDouble(0xCB3FA5B4EA3CE666L ^ 0x8B3FA5B4EA3CE666L), d2 + (double)(n += n2), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(((int)-696645539L ^ 0xD67A0844) << 2, ((int)-1118385059L ^ 0xBD56CC44) << 2));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d + Double.longBitsToDouble(0x8867F9B98081B435L ^ 0xC867F9B98081B435L), d2 + (double)n + (double)this.Method7642() + 1.0, d + this.Field17575, d2 + (double)n + (double)this.Method7642() + Double.longBitsToDouble(0x2DF1D8C285C808C9L ^ 0x6DF9D8C285C808C9L), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)1988563812 ^ (long)1988563837) << 2, (int)((long)1421452949 ^ (long)1421452940) << 2));
        this.Method7641("Health", d + Double.longBitsToDouble((long)921440374 ^ 0x4000000036EC1076L), d2 + (double)(n += n2), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)-855061193 ^ (long)-855061202) << 2, (int)((long)-2039856846 ^ (long)-2039856853) << 2));
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect(d + Double.longBitsToDouble((long)1456085966 ^ 0x4000000056CA1BCEL), d2 + (double)n + (double)this.Method7642() + 1.0, d + this.Field17576, d2 + (double)n + (double)this.Method7642() + Double.longBitsToDouble(0x19F26593A2F128B1L ^ 0x59FA6593A2F128B1L), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)882658150 ^ (long)882658175) << 2, (int)((long)-1634481718 ^ (long)-1634481709) << 2));
    }

    private void Method7641(String string, double d, double d2, int n) {
        if (aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi.Field16464) {
            fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Field13326.Method748(string, (int)d, (int)d2, n);
            return;
        }
        txv604LX7jI49uXrB8aYJ9HwEBS85jgC.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer.drawStringWithShadow(string, (float)((int)d), (float)((int)d2), n);
    }

    private int Method7642() {
        if (!aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi.Field16464) return txv604LX7jI49uXrB8aYJ9HwEBS85jgC.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer.FONT_HEIGHT;
        return fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Field13326.Method747();
    }

    private int Method7643(String string) {
        if (!aaIDVwbtzp3KxPpHfK7jnkVMYqAV3lzi.Field16464) return txv604LX7jI49uXrB8aYJ9HwEBS85jgC.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer.getStringWidth(string);
        return fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Field13326.Method757(string);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-810035955L ^ 0xCFB7D50D;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-37144871 ^ (long)-37145050);
            int n2 = (int)((long)1132034118 ^ (long)1132034153);
            cArray2[n] = (char)(cArray[n] ^ (((int)-1144008322L ^ 0xBBCFDE9D) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

