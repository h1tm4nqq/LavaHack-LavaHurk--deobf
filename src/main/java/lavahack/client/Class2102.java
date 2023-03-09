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

import com.kisman.cc.util.Class230;
import com.kisman.cc.util.Class650;
import lavahack.client.Class1172;
import lavahack.client.Class1178;
import lavahack.client.Class1249;
import lavahack.client.Class1831;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class753;
import lavahack.client.Class956;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class2102
extends Class1249 {
    private final Class650 Field17568 = new Class650();
    private final int Field17569 = 51;
    private final int Field17570 = 2;
    private final String Field17571 = "Indicators";
    private final String Field17572 = "Cooldown";
    private double Field17573 = 0.0;
    private double Field17574 = 0.0;
    private double Field17575 = 0.0;
    private double Field17576 = 0.0;
    private final double Field17577 = Double.longBitsToDouble(0x4014000000000000L);
    private final Class44 Field17578 = this.Method23(new Class44("Theme", (Class42)this, Class956.Field12073));
    private final Class44 Field17579 = this.Method23(new Class44("Shadow", (Class42)this, true));
    private String Field17580 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class2102() {
        super("Indicators", true);
        this.Method271(Double.longBitsToDouble((long)1921626638 ^ 0x400800007289B20EL));
        this.Method272(Double.longBitsToDouble((long)1227170882 ^ 0x4020000049252442L));
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method7638(RenderGameOverlayEvent.Text text) {
        String string = this.Field17578.Method359();
        int n = -1;
        switch (string.hashCode()) {
            case -1085510111: {
                if (!string.equals("Default")) return;
                return;
            }
            case -1529165460: {
                if (!string.equals("Rewrite")) return;
                return;
            }
        }
    }

    private void Method20() {
        double d = this.Method267();
        double d2 = this.Method268();
        double d3 = this.Method269();
        double d4 = this.Method270();
        double d5 = (double)Class1178.Method4748() + Double.longBitsToDouble(0x4014000000000000L);
        int n = 0;
        double d6 = Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.posX - Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.prevPosX;
        double d7 = Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.posZ - Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.prevPosZ;
        double d8 = Math.sqrt(d6 * d6 + d7 * d7);
        double d9 = d8 * Double.longBitsToDouble(4624834920910847279L) / Double.longBitsToDouble(0x4010000000000000L);
        double d10 = MathHelper.clamp((double)Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getCooledAttackStrength(0.0f), (double)Double.longBitsToDouble((long)488661941 ^ 0x3FB9999984B9FA2FL), (double)1.0);
        this.Field17573 = Class230.Method1301(d10 * (double)Class1178.Method4741("Cooldown"), this.Field17573, Double.longBitsToDouble(4587366580439587226L));
        double d11 = MathHelper.clamp((int)Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.hurtTime, (int)0, (int)1);
        this.Field17574 = Class230.Method1301(d11 * (double)Class1178.Method4741("Cooldown"), this.Field17574, Double.longBitsToDouble(4587366580439587226L));
        if (this.Field17574 < 0.0) {
            this.Field17574 = 0.0;
        }
        double d12 = MathHelper.clamp((double)(d9 / Double.longBitsToDouble(0x4003333333333333L)), (double)Double.longBitsToDouble((long)362378521 ^ 0x3FB999998C00EC83L), (double)1.0);
        this.Field17575 = Class230.Method1301(d12 * (double)Class1178.Method4741("Cooldown"), this.Field17575, Double.longBitsToDouble((long)1090038801 ^ 0x3FA99999D961358BL));
        double d13 = Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getHealth() / Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getMaxHealth();
        if (this.Field17568.Method2797(15L)) {
            this.Field17576 = Class230.Method1301(d13 * (double)Class1178.Method4741("Cooldown"), this.Field17576, Double.longBitsToDouble((long)100949701 ^ 0x3FA999999F9DC75FL));
            this.Field17568.Method2801();
        }
        Class753.drawRect(d + Double.longBitsToDouble((long)1139673597 ^ 0x4008000043EE09FDL), d2 + Double.longBitsToDouble((long)365774627 ^ 0x4008000015CD4723L), d + d3 + Double.longBitsToDouble(0x4008000000000000L), d2 + d4 - Double.longBitsToDouble((long)614272395 ^ 0x40080000249D0D8BL), Class1172.Method4718(33, 33, 42));
        Class753.drawRect(d + Double.longBitsToDouble(0x4008000000000000L), d2, d + d3 + Double.longBitsToDouble((long)973975910 ^ 0x400800003A0DB166L), d2 + d4, Class1172.Method4718(33, 33, 42));
        Class753.drawRect(d + Double.longBitsToDouble(0x4000000000000000L), d2 + Double.longBitsToDouble(0x4000000000000000L), d + d3 + Double.longBitsToDouble((long)300836784 ^ 0x4000000011EE67B0L), d2 + d4 - Double.longBitsToDouble((long)1228645116 ^ 0x40000000493BA2FCL), Class1172.Method4718(45, 45, 55));
        Class753.drawRect(d + Double.longBitsToDouble((long)571790466 ^ 0x400000002214D482L), d2, d + d3 + Double.longBitsToDouble(0x4000000000000000L), d2 + d4, Class1172.Method4718(45, 45, 55));
        Class753.drawRect(d + 1.0, d2 + 1.0, d + d3 + 1.0, d2 + d4 - 1.0, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(d + 1.0, d2, d + d3 + 1.0, d2 + d4, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(d - Double.longBitsToDouble(0x4008000000000000L), d2 - Double.longBitsToDouble(0x4020000000000000L), d + d3 + Double.longBitsToDouble((long)405340468 ^ 0x4008000018290134L), d2 + d4 - Double.longBitsToDouble((long)1838546790 ^ 0x400800006D95FF66L), Class1172.Method4718(33, 33, 42));
        Class753.drawRect(d - Double.longBitsToDouble(0x4008000000000000L), d2, d + d3 + Double.longBitsToDouble(0x4008000000000000L), d2 + d4, Class1172.Method4718(33, 33, 42));
        Class753.drawRect(d - Double.longBitsToDouble((long)1671915232 ^ 0x4000000063A766E0L), d2 - Double.longBitsToDouble(4619567317775286272L), d + d3 + Double.longBitsToDouble((long)433898811 ^ 0x4000000019DCC53BL), d2 + d4 - Double.longBitsToDouble(0x4000000000000000L), Class1172.Method4718(45, 45, 55));
        Class753.drawRect(d - Double.longBitsToDouble((long)8450033 ^ 0x400000000080EFF1L), d2, d + d3 + Double.longBitsToDouble(0x4000000000000000L), d2 + d4, Class1172.Method4718(45, 45, 55));
        Class753.drawRect(d - 1.0, d2 - Double.longBitsToDouble(4618441417868443648L), d + d3 + 1.0, d2 + d4 - 1.0, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(d - 1.0, d2, d + d3 + 1.0, d2 + d4, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(d, d2 - Double.longBitsToDouble((long)1215309794 ^ 0x40140000487027E2L), d + d3, d2 + d4, Class1172.Method4709(100, 100));
        Class753.drawRect(d - Double.longBitsToDouble(0x4008000000000000L), d2 - 1.0, d + d3 + Double.longBitsToDouble((long)1515563159 ^ 0x400800005A55A897L), d2 + d4 + Double.longBitsToDouble(0x4008000000000000L), Class1172.Method4718(33, 33, 42));
        Class753.drawRect(d - Double.longBitsToDouble((long)306676522 ^ 0x400000001247832AL), d2 - Double.longBitsToDouble(0x4000000000000000L), d + d3 + Double.longBitsToDouble((long)1225043461 ^ 0x400000004904AE05L), d2 + d4 + Double.longBitsToDouble((long)606708513 ^ 0x400000002429A321L), Class1172.Method4718(45, 45, 55));
        Class753.drawRect(d - 1.0, d2 - Double.longBitsToDouble((long)1192808413 ^ 0x400800004718CFDDL), d + d3 + 1.0, d2 + d4 + 1.0, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(d, d2 - Double.longBitsToDouble((long)401825090 ^ 0x4010000017F35D42L), d + d3, d2 + d4, Class1172.Method4718(34, 34, 40));
        Class1178.Method4746("Indicators", d + d3 / Double.longBitsToDouble((long)250687629 ^ 0x400000000EF1308DL), d2 + Double.longBitsToDouble((long)796958571 ^ 0x401400002F809F6BL), Class1172.Method4709(100, 100));
        Class1178.Method4745("Cooldown", d + Double.longBitsToDouble(0x4014000000000000L), d2 + Double.longBitsToDouble(4624633867356078080L) + (double)Class1178.Method4748(), Class1172.Method4709(100, 100));
        this.Method7639(d + Double.longBitsToDouble((long)1149622990 ^ 0x402400004485DACEL) + (double)Class1178.Method4741("Cooldown"), d2 + Double.longBitsToDouble(4624633867356078080L) + (double)Class1178.Method4748(), this.Field17573, Class1178.Method4748());
        Class1178.Method4745("HurtTime", d + Double.longBitsToDouble(0x4014000000000000L), d2 + Double.longBitsToDouble((long)813493071 ^ 0x402E0000307CEB4FL) + (double)Class1178.Method4748() + d5 * (double)(++n), Class1172.Method4709(100, 100));
        this.Method7639(d + Double.longBitsToDouble((long)1187551941 ^ 0x4024000046C89AC5L) + (double)Class1178.Method4741("Cooldown"), d2 + Double.longBitsToDouble(4624633867356078080L) + (double)Class1178.Method4748() + d5 * (double)n, this.Field17574, Class1178.Method4748());
        Class1178.Method4745("Speed", d + Double.longBitsToDouble((long)1789922291 ^ 0x401400006AB00BF3L), d2 + Double.longBitsToDouble((long)1746688749 ^ 0x402E0000681C5AEDL) + (double)Class1178.Method4748() + d5 * (double)(++n), Class1172.Method4709(100, 100));
        this.Method7639(d + Double.longBitsToDouble(0x4024000000000000L) + (double)Class1178.Method4741("Cooldown"), d2 + Double.longBitsToDouble((long)102231137 ^ 0x402E00000617EC61L) + (double)Class1178.Method4748() + d5 * (double)n, this.Field17575, Class1178.Method4748());
        Class1178.Method4745("Health", d + Double.longBitsToDouble(0x4014000000000000L), d2 + Double.longBitsToDouble((long)452002334 ^ 0x402E00001AF1021EL) + (double)Class1178.Method4748() + d5 * (double)(++n), Class1172.Method4709(100, 100));
        this.Method7639(d + Double.longBitsToDouble((long)1142245482 ^ 0x402400004415486AL) + (double)Class1178.Method4741("Cooldown"), d2 + Double.longBitsToDouble(4624633867356078080L) + (double)Class1178.Method4748() + d5 * (double)n, this.Field17576, Class1178.Method4748());
    }

    private void Method7639(double d, double d2, double d3, double d4) {
        if (this.Field17579.Method365()) {
            Class753.drawShadowSliders(d, d2, d3, d4, Class1172.Method4709(100, 100), 1.0);
            return;
        }
        Class753.drawRect(d, d2, d + d3, d2 + d4, Class1172.Method4709(100, 100));
    }

    private void Method7640() {
        double d = this.Method267();
        double d2 = this.Method268();
        double d3 = this.Method269();
        double d4 = this.Method270();
        int n = 0;
        int n2 = this.Method7642() + 2 + 3;
        double d5 = Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.posX - Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.prevPosX;
        double d6 = Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.posZ - Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.prevPosZ;
        double d7 = Math.sqrt(d5 * d5 + d6 * d6);
        double d8 = d7 * Double.longBitsToDouble((long)1692048673 ^ 0x402EB6DB096CE00EL) / Double.longBitsToDouble((long)2071917985 ^ 0x401000007B7EF5A1L);
        double d9 = MathHelper.clamp((double)Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getCooledAttackStrength(0.0f), (double)Double.longBitsToDouble((long)1189104447 ^ 0x3FB99999DF79D2A5L), (double)1.0);
        this.Field17573 = Class230.Method1301(d9 * Double.longBitsToDouble(4632374429215621120L), this.Field17573, Double.longBitsToDouble(4587366580439587226L));
        double d10 = MathHelper.clamp((int)Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.hurtTime, (int)0, (int)1);
        this.Field17574 = Class230.Method1301(d10 * Double.longBitsToDouble(4632374429215621120L), this.Field17574, Double.longBitsToDouble((long)533228372 ^ 0x3FA999998651F2CEL));
        if (this.Field17574 < 0.0) {
            this.Field17574 = 0.0;
        }
        double d11 = MathHelper.clamp((double)(d8 / Double.longBitsToDouble((long)49582256 ^ 0x4003333331C7A383L)), (double)Double.longBitsToDouble((long)1080366809 ^ 0x3FB99999D9FC8F43L), (double)1.0);
        this.Field17575 = Class230.Method1301(d11 * Double.longBitsToDouble((long)984024951 ^ 0x404980003AA70777L), this.Field17575, Double.longBitsToDouble(4587366580439587226L));
        double d12 = Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getHealth() / Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getMaxHealth();
        if (this.Field17568.Method2797(15L)) {
            this.Field17576 = Class230.Method1301(d12 * Double.longBitsToDouble((long)71395656 ^ 0x4049800004416948L), this.Field17576, Double.longBitsToDouble(4587366580439587226L));
            this.Field17568.Method2801();
        }
        Class753.drawRect(d + Double.longBitsToDouble(0x4008000000000000L), d2 + Double.longBitsToDouble(0x4008000000000000L), d + d3 + Double.longBitsToDouble((long)1492751131 ^ 0x4008000058F9931BL), d2 + d4 - Double.longBitsToDouble((long)319779423 ^ 0x40080000130F725FL), Class1172.Method4718(33, 33, 42));
        Class753.drawRect(d + Double.longBitsToDouble(0x4008000000000000L), d2, d + d3 + Double.longBitsToDouble(0x4008000000000000L), d2 + d4, Class1172.Method4718(33, 33, 42));
        Class753.drawRect(d + Double.longBitsToDouble((long)2059824910 ^ 0x400000007AC66F0EL), d2 + Double.longBitsToDouble(0x4000000000000000L), d + d3 + Double.longBitsToDouble(0x4000000000000000L), d2 + d4 - Double.longBitsToDouble((long)1279311579 ^ 0x400000004C40BEDBL), Class1172.Method4718(45, 45, 55));
        Class753.drawRect(d + Double.longBitsToDouble(0x4000000000000000L), d2, d + d3 + Double.longBitsToDouble((long)1049656244 ^ 0x400000003E907BB4L), d2 + d4, Class1172.Method4718(45, 45, 55));
        Class753.drawRect(d + 1.0, d2 + 1.0, d + d3 + 1.0, d2 + d4 - 1.0, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(d + 1.0, d2, d + d3 + 1.0, d2 + d4, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(d - Double.longBitsToDouble((long)509716678 ^ 0x400800001E61A8C6L), d2 - Double.longBitsToDouble((long)439924608 ^ 0x402000001A38B780L), d + d3 + Double.longBitsToDouble((long)1836851874 ^ 0x400800006D7C22A2L), d2 + d4 - Double.longBitsToDouble((long)884864122 ^ 0x4008000034BDF47AL), Class1172.Method4718(33, 33, 42));
        Class753.drawRect(d - Double.longBitsToDouble((long)29250000 ^ 0x4008000001BE51D0L), d2, d + d3 + Double.longBitsToDouble((long)854997065 ^ 0x4008000032F63849L), d2 + d4, Class1172.Method4718(33, 33, 42));
        Class753.drawRect(d - Double.longBitsToDouble(0x4000000000000000L), d2 - Double.longBitsToDouble(4619567317775286272L), d + d3 + Double.longBitsToDouble(0x4000000000000000L), d2 + d4 - Double.longBitsToDouble((long)1257430173 ^ 0x400000004AF2DC9DL), Class1172.Method4718(45, 45, 55));
        Class753.drawRect(d - Double.longBitsToDouble(0x4000000000000000L), d2, d + d3 + Double.longBitsToDouble((long)2024094741 ^ 0x4000000078A53C15L), d2 + d4, Class1172.Method4718(45, 45, 55));
        Class753.drawRect(d - 1.0, d2 - Double.longBitsToDouble(4618441417868443648L), d + d3 + 1.0, d2 + d4 - 1.0, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(d - 1.0, d2, d + d3 + 1.0, d2 + d4, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(d, d2 - Double.longBitsToDouble(0x4014000000000000L), d + d3, d2 + d4, Class1172.Method4709(100, 100));
        Class753.drawRect(d - Double.longBitsToDouble((long)46619538 ^ 0x4008000002C75B92L), d2 - 1.0, d + d3 + Double.longBitsToDouble(0x4008000000000000L), d2 + d4 + Double.longBitsToDouble(0x4008000000000000L), Class1172.Method4718(33, 33, 42));
        Class753.drawRect(d - Double.longBitsToDouble(0x4000000000000000L), d2 - Double.longBitsToDouble((long)1758081291 ^ 0x4000000068CA310BL), d + d3 + Double.longBitsToDouble((long)511772792 ^ 0x400000001E810878L), d2 + d4 + Double.longBitsToDouble((long)506006946 ^ 0x400000001E290DA2L), Class1172.Method4718(45, 45, 55));
        Class753.drawRect(d - 1.0, d2 - Double.longBitsToDouble((long)574378222 ^ 0x40080000223C50EEL), d + d3 + 1.0, d2 + d4 + 1.0, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(d, d2 - Double.longBitsToDouble((long)1219160723 ^ 0x4010000048AAEA93L), d + d3, d2 + d4, Class1172.Method4718(34, 34, 40));
        this.Method7641("Indicators", d + (d3 / Double.longBitsToDouble(0x4000000000000000L) - (double)(this.Method7643("Indicators") / 2)), d2 + Double.longBitsToDouble((long)203433394 ^ 0x400000000C2025B2L), Class1172.Method4709(100, 100));
        this.Method7641("Cooldown", d + Double.longBitsToDouble(0x4000000000000000L), d2 + (double)(n += this.Method7642() + 6), Class1172.Method4709(100, 100));
        Class753.drawRect(d + Double.longBitsToDouble((long)74101266 ^ 0x40000000046AB212L), d2 + (double)n + (double)this.Method7642() + 1.0, d + this.Field17573, d2 + (double)n + (double)this.Method7642() + Double.longBitsToDouble(0x4008000000000000L), Class1172.Method4709(100, 100));
        this.Method7641("HurtTime", d + Double.longBitsToDouble(0x4000000000000000L), d2 + (double)(n += n2), Class1172.Method4709(100, 100));
        if (this.Field17574 > 0.0) {
            Class753.drawRect(d + Double.longBitsToDouble((long)1011404818 ^ 0x400000003C48D012L), d2 + (double)n + (double)this.Method7642() + 1.0, d + this.Field17574, d2 + (double)n + (double)this.Method7642() + Double.longBitsToDouble((long)2132557829 ^ 0x400800007F1C4005L), Class1172.Method4709(100, 100));
        }
        this.Method7641("Speed", d + Double.longBitsToDouble(0x4000000000000000L), d2 + (double)(n += n2), Class1172.Method4709(100, 100));
        Class753.drawRect(d + Double.longBitsToDouble(0x4000000000000000L), d2 + (double)n + (double)this.Method7642() + 1.0, d + this.Field17575, d2 + (double)n + (double)this.Method7642() + Double.longBitsToDouble(0x4008000000000000L), Class1172.Method4709(100, 100));
        this.Method7641("Health", d + Double.longBitsToDouble((long)921440374 ^ 0x4000000036EC1076L), d2 + (double)(n += n2), Class1172.Method4709(100, 100));
        Class753.drawRect(d + Double.longBitsToDouble((long)1456085966 ^ 0x4000000056CA1BCEL), d2 + (double)n + (double)this.Method7642() + 1.0, d + this.Field17576, d2 + (double)n + (double)this.Method7642() + Double.longBitsToDouble(0x4008000000000000L), Class1172.Method4709(100, 100));
    }

    private void Method7641(String string, double d, double d2, int n) {
        if (Class1831.Field16464) {
            Class1178.Field13326.Method748(string, (int)d, (int)d2, n);
            return;
        }
        Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer.drawStringWithShadow(string, (float)((int)d), (float)((int)d2), n);
    }

    private int Method7642() {
        if (!Class1831.Field16464) return Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer.FONT_HEIGHT;
        return Class1178.Field13326.Method747();
    }

    private int Method7643(String string) {
        if (!Class1831.Field16464) return Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer.getStringWidth(string);
        return Class1178.Field13326.Method757(string);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 47;
            cArray2[n] = (char)(cArray[n] ^ (0x1FC6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

