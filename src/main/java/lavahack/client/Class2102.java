//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.util.math.*;
import com.kisman.cc.util.*;

public class Class2102 extends Class1249
{
    private final Class650 Field17568;
    private final int Field17569 = 51;
    private final int Field17570 = 2;
    private final String Field17571 = "Indicators";
    private final String Field17572 = "Cooldown";
    private double Field17573;
    private double Field17574;
    private double Field17575;
    private double Field17576;
    private final double Field17577 = 5.0;
    private final Class44 Field17578;
    private final Class44 Field17579;
    private String Field17580 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class2102() {
        super("Indicators", true);
        this.Field17568 = new Class650();
        this.Field17573 = 0.0;
        this.Field17574 = 0.0;
        this.Field17575 = 0.0;
        this.Field17576 = 0.0;
        this.Field17578 = this.Method23(new Class44("Theme", (Class42)this, Class956.Field12073));
        this.Field17579 = this.Method23(new Class44("Shadow", (Class42)this, true));
        this.Method271(Double.longBitsToDouble((long)1921626638 ^ 0x400800007289B20EL));
        this.Method272(Double.longBitsToDouble((long)1227170882 ^ 0x4020000049252442L));
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method7638(final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        final String method359 = this.Field17578.Method359();
        switch (method359.hashCode()) {
            case -1085510111: {
                if (method359.equals("Default")) {
                    break;
                }
                break;
            }
            case -1529165460: {
                if (method359.equals("Rewrite")) {
                    break;
                }
                break;
            }
        }
    }
    
    private void Method20() {
        final double method267 = this.Method267();
        final double method268 = this.Method268();
        final double method269 = this.Method269();
        final double method270 = this.Method270();
        final double n = Class1178.Method4748() + Double.longBitsToDouble(4617315517961601024L);
        int n2 = 0;
        final double n3 = Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.posX - Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.prevPosX;
        final double n4 = Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.posZ - Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.prevPosZ;
        final double n5 = Math.sqrt(n3 * n3 + n4 * n4) * Double.longBitsToDouble(4624834920910847279L) / Double.longBitsToDouble(4616189618054758400L);
        this.Field17573 = Class230.Method1301(MathHelper.clamp((double)Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getCooledAttackStrength(0.0f), Double.longBitsToDouble((long)488661941 ^ 0x3FB9999984B9FA2FL), 1.0) * Class1178.Method4741("Cooldown"), this.Field17573, Double.longBitsToDouble(4587366580439587226L));
        this.Field17574 = Class230.Method1301(MathHelper.clamp(Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.hurtTime, 0, 1) * (double)Class1178.Method4741("Cooldown"), this.Field17574, Double.longBitsToDouble(4587366580439587226L));
        if (this.Field17574 < 0.0) {
            this.Field17574 = 0.0;
        }
        this.Field17575 = Class230.Method1301(MathHelper.clamp(n5 / Double.longBitsToDouble(4612586738352862003L), Double.longBitsToDouble((long)362378521 ^ 0x3FB999998C00EC83L), 1.0) * Class1178.Method4741("Cooldown"), this.Field17575, Double.longBitsToDouble((long)1090038801 ^ 0x3FA99999D961358BL));
        final double n6 = Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getHealth() / Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getMaxHealth();
        if (this.Field17568.Method2797(15L)) {
            this.Field17576 = Class230.Method1301(n6 * Class1178.Method4741("Cooldown"), this.Field17576, Double.longBitsToDouble((long)100949701 ^ 0x3FA999999F9DC75FL));
            this.Field17568.Method2801();
        }
        Class753.drawRect(method267 + Double.longBitsToDouble((long)1139673597 ^ 0x4008000043EE09FDL), method268 + Double.longBitsToDouble((long)365774627 ^ 0x4008000015CD4723L), method267 + method269 + Double.longBitsToDouble(4613937818241073152L), method268 + method270 - Double.longBitsToDouble((long)614272395 ^ 0x40080000249D0D8BL), Class1172.Method4718(33, 33, 42));
        Class753.drawRect(method267 + Double.longBitsToDouble(4613937818241073152L), method268, method267 + method269 + Double.longBitsToDouble((long)973975910 ^ 0x400800003A0DB166L), method268 + method270, Class1172.Method4718(33, 33, 42));
        Class753.drawRect(method267 + Double.longBitsToDouble(4611686018427387904L), method268 + Double.longBitsToDouble(4611686018427387904L), method267 + method269 + Double.longBitsToDouble((long)300836784 ^ 0x4000000011EE67B0L), method268 + method270 - Double.longBitsToDouble((long)1228645116 ^ 0x40000000493BA2FCL), Class1172.Method4718(45, 45, 55));
        Class753.drawRect(method267 + Double.longBitsToDouble((long)571790466 ^ 0x400000002214D482L), method268, method267 + method269 + Double.longBitsToDouble(4611686018427387904L), method268 + method270, Class1172.Method4718(45, 45, 55));
        Class753.drawRect(method267 + 1.0, method268 + 1.0, method267 + method269 + 1.0, method268 + method270 - 1.0, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(method267 + 1.0, method268, method267 + method269 + 1.0, method268 + method270, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(method267 - Double.longBitsToDouble(4613937818241073152L), method268 - Double.longBitsToDouble(4620693217682128896L), method267 + method269 + Double.longBitsToDouble((long)405340468 ^ 0x4008000018290134L), method268 + method270 - Double.longBitsToDouble((long)1838546790 ^ 0x400800006D95FF66L), Class1172.Method4718(33, 33, 42));
        Class753.drawRect(method267 - Double.longBitsToDouble(4613937818241073152L), method268, method267 + method269 + Double.longBitsToDouble(4613937818241073152L), method268 + method270, Class1172.Method4718(33, 33, 42));
        Class753.drawRect(method267 - Double.longBitsToDouble((long)1671915232 ^ 0x4000000063A766E0L), method268 - Double.longBitsToDouble(4619567317775286272L), method267 + method269 + Double.longBitsToDouble((long)433898811 ^ 0x4000000019DCC53BL), method268 + method270 - Double.longBitsToDouble(4611686018427387904L), Class1172.Method4718(45, 45, 55));
        Class753.drawRect(method267 - Double.longBitsToDouble((long)8450033 ^ 0x400000000080EFF1L), method268, method267 + method269 + Double.longBitsToDouble(4611686018427387904L), method268 + method270, Class1172.Method4718(45, 45, 55));
        Class753.drawRect(method267 - 1.0, method268 - Double.longBitsToDouble(4618441417868443648L), method267 + method269 + 1.0, method268 + method270 - 1.0, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(method267 - 1.0, method268, method267 + method269 + 1.0, method268 + method270, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(method267, method268 - Double.longBitsToDouble((long)1215309794 ^ 0x40140000487027E2L), method267 + method269, method268 + method270, Class1172.Method4709(100, 100));
        Class753.drawRect(method267 - Double.longBitsToDouble(4613937818241073152L), method268 - 1.0, method267 + method269 + Double.longBitsToDouble((long)1515563159 ^ 0x400800005A55A897L), method268 + method270 + Double.longBitsToDouble(4613937818241073152L), Class1172.Method4718(33, 33, 42));
        Class753.drawRect(method267 - Double.longBitsToDouble((long)306676522 ^ 0x400000001247832AL), method268 - Double.longBitsToDouble(4611686018427387904L), method267 + method269 + Double.longBitsToDouble((long)1225043461 ^ 0x400000004904AE05L), method268 + method270 + Double.longBitsToDouble((long)606708513 ^ 0x400000002429A321L), Class1172.Method4718(45, 45, 55));
        Class753.drawRect(method267 - 1.0, method268 - Double.longBitsToDouble((long)1192808413 ^ 0x400800004718CFDDL), method267 + method269 + 1.0, method268 + method270 + 1.0, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(method267, method268 - Double.longBitsToDouble((long)401825090 ^ 0x4010000017F35D42L), method267 + method269, method268 + method270, Class1172.Method4718(34, 34, 40));
        Class1178.Method4746("Indicators", method267 + method269 / Double.longBitsToDouble((long)250687629 ^ 0x400000000EF1308DL), method268 + Double.longBitsToDouble((long)796958571 ^ 0x401400002F809F6BL), Class1172.Method4709(100, 100));
        Class1178.Method4745("Cooldown", method267 + Double.longBitsToDouble(4617315517961601024L), method268 + Double.longBitsToDouble(4624633867356078080L) + Class1178.Method4748(), Class1172.Method4709(100, 100));
        this.Method7639(method267 + Double.longBitsToDouble((long)1149622990 ^ 0x402400004485DACEL) + Class1178.Method4741("Cooldown"), method268 + Double.longBitsToDouble(4624633867356078080L) + Class1178.Method4748(), this.Field17573, Class1178.Method4748());
        ++n2;
        Class1178.Method4745("HurtTime", method267 + Double.longBitsToDouble(4617315517961601024L), method268 + Double.longBitsToDouble((long)813493071 ^ 0x402E0000307CEB4FL) + Class1178.Method4748() + n * n2, Class1172.Method4709(100, 100));
        this.Method7639(method267 + Double.longBitsToDouble((long)1187551941 ^ 0x4024000046C89AC5L) + Class1178.Method4741("Cooldown"), method268 + Double.longBitsToDouble(4624633867356078080L) + Class1178.Method4748() + n * n2, this.Field17574, Class1178.Method4748());
        ++n2;
        Class1178.Method4745("Speed", method267 + Double.longBitsToDouble((long)1789922291 ^ 0x401400006AB00BF3L), method268 + Double.longBitsToDouble((long)1746688749 ^ 0x402E0000681C5AEDL) + Class1178.Method4748() + n * n2, Class1172.Method4709(100, 100));
        this.Method7639(method267 + Double.longBitsToDouble(4621819117588971520L) + Class1178.Method4741("Cooldown"), method268 + Double.longBitsToDouble((long)102231137 ^ 0x402E00000617EC61L) + Class1178.Method4748() + n * n2, this.Field17575, Class1178.Method4748());
        ++n2;
        Class1178.Method4745("Health", method267 + Double.longBitsToDouble(4617315517961601024L), method268 + Double.longBitsToDouble((long)452002334 ^ 0x402E00001AF1021EL) + Class1178.Method4748() + n * n2, Class1172.Method4709(100, 100));
        this.Method7639(method267 + Double.longBitsToDouble((long)1142245482 ^ 0x402400004415486AL) + Class1178.Method4741("Cooldown"), method268 + Double.longBitsToDouble(4624633867356078080L) + Class1178.Method4748() + n * n2, this.Field17576, Class1178.Method4748());
    }
    
    private void Method7639(final double n, final double n2, final double n3, final double n4) {
        if (this.Field17579.Method365()) {
            Class753.drawShadowSliders(n, n2, n3, n4, Class1172.Method4709(100, 100), 1.0);
        }
        else {
            Class753.drawRect(n, n2, n + n3, n2 + n4, Class1172.Method4709(100, 100));
        }
    }
    
    private void Method7640() {
        final double method267 = this.Method267();
        final double method268 = this.Method268();
        final double method269 = this.Method269();
        final double method270 = this.Method270();
        final int n = 0;
        final int n2 = this.Method7642() + 2 + 3;
        final double n3 = Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.posX - Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.prevPosX;
        final double n4 = Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.posZ - Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.prevPosZ;
        final double n5 = Math.sqrt(n3 * n3 + n4 * n4) * Double.longBitsToDouble((long)1692048673 ^ 0x402EB6DB096CE00EL) / Double.longBitsToDouble((long)2071917985 ^ 0x401000007B7EF5A1L);
        this.Field17573 = Class230.Method1301(MathHelper.clamp((double)Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getCooledAttackStrength(0.0f), Double.longBitsToDouble((long)1189104447 ^ 0x3FB99999DF79D2A5L), 1.0) * Double.longBitsToDouble(4632374429215621120L), this.Field17573, Double.longBitsToDouble(4587366580439587226L));
        this.Field17574 = Class230.Method1301(MathHelper.clamp(Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.hurtTime, 0, 1) * Double.longBitsToDouble(4632374429215621120L), this.Field17574, Double.longBitsToDouble((long)533228372 ^ 0x3FA999998651F2CEL));
        if (this.Field17574 < 0.0) {
            this.Field17574 = 0.0;
        }
        this.Field17575 = Class230.Method1301(MathHelper.clamp(n5 / Double.longBitsToDouble((long)49582256 ^ 0x4003333331C7A383L), Double.longBitsToDouble((long)1080366809 ^ 0x3FB99999D9FC8F43L), 1.0) * Double.longBitsToDouble((long)984024951 ^ 0x404980003AA70777L), this.Field17575, Double.longBitsToDouble(4587366580439587226L));
        final double n6 = Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getHealth() / Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getMaxHealth();
        if (this.Field17568.Method2797(15L)) {
            this.Field17576 = Class230.Method1301(n6 * Double.longBitsToDouble((long)71395656 ^ 0x4049800004416948L), this.Field17576, Double.longBitsToDouble(4587366580439587226L));
            this.Field17568.Method2801();
        }
        Class753.drawRect(method267 + Double.longBitsToDouble(4613937818241073152L), method268 + Double.longBitsToDouble(4613937818241073152L), method267 + method269 + Double.longBitsToDouble((long)1492751131 ^ 0x4008000058F9931BL), method268 + method270 - Double.longBitsToDouble((long)319779423 ^ 0x40080000130F725FL), Class1172.Method4718(33, 33, 42));
        Class753.drawRect(method267 + Double.longBitsToDouble(4613937818241073152L), method268, method267 + method269 + Double.longBitsToDouble(4613937818241073152L), method268 + method270, Class1172.Method4718(33, 33, 42));
        Class753.drawRect(method267 + Double.longBitsToDouble((long)2059824910 ^ 0x400000007AC66F0EL), method268 + Double.longBitsToDouble(4611686018427387904L), method267 + method269 + Double.longBitsToDouble(4611686018427387904L), method268 + method270 - Double.longBitsToDouble((long)1279311579 ^ 0x400000004C40BEDBL), Class1172.Method4718(45, 45, 55));
        Class753.drawRect(method267 + Double.longBitsToDouble(4611686018427387904L), method268, method267 + method269 + Double.longBitsToDouble((long)1049656244 ^ 0x400000003E907BB4L), method268 + method270, Class1172.Method4718(45, 45, 55));
        Class753.drawRect(method267 + 1.0, method268 + 1.0, method267 + method269 + 1.0, method268 + method270 - 1.0, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(method267 + 1.0, method268, method267 + method269 + 1.0, method268 + method270, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(method267 - Double.longBitsToDouble((long)509716678 ^ 0x400800001E61A8C6L), method268 - Double.longBitsToDouble((long)439924608 ^ 0x402000001A38B780L), method267 + method269 + Double.longBitsToDouble((long)1836851874 ^ 0x400800006D7C22A2L), method268 + method270 - Double.longBitsToDouble((long)884864122 ^ 0x4008000034BDF47AL), Class1172.Method4718(33, 33, 42));
        Class753.drawRect(method267 - Double.longBitsToDouble((long)29250000 ^ 0x4008000001BE51D0L), method268, method267 + method269 + Double.longBitsToDouble((long)854997065 ^ 0x4008000032F63849L), method268 + method270, Class1172.Method4718(33, 33, 42));
        Class753.drawRect(method267 - Double.longBitsToDouble(4611686018427387904L), method268 - Double.longBitsToDouble(4619567317775286272L), method267 + method269 + Double.longBitsToDouble(4611686018427387904L), method268 + method270 - Double.longBitsToDouble((long)1257430173 ^ 0x400000004AF2DC9DL), Class1172.Method4718(45, 45, 55));
        Class753.drawRect(method267 - Double.longBitsToDouble(4611686018427387904L), method268, method267 + method269 + Double.longBitsToDouble((long)2024094741 ^ 0x4000000078A53C15L), method268 + method270, Class1172.Method4718(45, 45, 55));
        Class753.drawRect(method267 - 1.0, method268 - Double.longBitsToDouble(4618441417868443648L), method267 + method269 + 1.0, method268 + method270 - 1.0, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(method267 - 1.0, method268, method267 + method269 + 1.0, method268 + method270, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(method267, method268 - Double.longBitsToDouble(4617315517961601024L), method267 + method269, method268 + method270, Class1172.Method4709(100, 100));
        Class753.drawRect(method267 - Double.longBitsToDouble((long)46619538 ^ 0x4008000002C75B92L), method268 - 1.0, method267 + method269 + Double.longBitsToDouble(4613937818241073152L), method268 + method270 + Double.longBitsToDouble(4613937818241073152L), Class1172.Method4718(33, 33, 42));
        Class753.drawRect(method267 - Double.longBitsToDouble(4611686018427387904L), method268 - Double.longBitsToDouble((long)1758081291 ^ 0x4000000068CA310BL), method267 + method269 + Double.longBitsToDouble((long)511772792 ^ 0x400000001E810878L), method268 + method270 + Double.longBitsToDouble((long)506006946 ^ 0x400000001E290DA2L), Class1172.Method4718(45, 45, 55));
        Class753.drawRect(method267 - 1.0, method268 - Double.longBitsToDouble((long)574378222 ^ 0x40080000223C50EEL), method267 + method269 + 1.0, method268 + method270 + 1.0, Class1172.Method4718(60, 60, 70));
        Class753.drawRect(method267, method268 - Double.longBitsToDouble((long)1219160723 ^ 0x4010000048AAEA93L), method267 + method269, method268 + method270, Class1172.Method4718(34, 34, 40));
        this.Method7641("Indicators", method267 + (method269 / Double.longBitsToDouble(4611686018427387904L) - this.Method7643("Indicators") / 2), method268 + Double.longBitsToDouble((long)203433394 ^ 0x400000000C2025B2L), Class1172.Method4709(100, 100));
        final int n7 = n + (this.Method7642() + 6);
        this.Method7641("Cooldown", method267 + Double.longBitsToDouble(4611686018427387904L), method268 + n7, Class1172.Method4709(100, 100));
        Class753.drawRect(method267 + Double.longBitsToDouble((long)74101266 ^ 0x40000000046AB212L), method268 + n7 + this.Method7642() + 1.0, method267 + this.Field17573, method268 + n7 + this.Method7642() + Double.longBitsToDouble(4613937818241073152L), Class1172.Method4709(100, 100));
        final int n8 = n7 + n2;
        this.Method7641("HurtTime", method267 + Double.longBitsToDouble(4611686018427387904L), method268 + n8, Class1172.Method4709(100, 100));
        if (this.Field17574 > 0.0) {
            Class753.drawRect(method267 + Double.longBitsToDouble((long)1011404818 ^ 0x400000003C48D012L), method268 + n8 + this.Method7642() + 1.0, method267 + this.Field17574, method268 + n8 + this.Method7642() + Double.longBitsToDouble((long)2132557829 ^ 0x400800007F1C4005L), Class1172.Method4709(100, 100));
        }
        final int n9 = n8 + n2;
        this.Method7641("Speed", method267 + Double.longBitsToDouble(4611686018427387904L), method268 + n9, Class1172.Method4709(100, 100));
        Class753.drawRect(method267 + Double.longBitsToDouble(4611686018427387904L), method268 + n9 + this.Method7642() + 1.0, method267 + this.Field17575, method268 + n9 + this.Method7642() + Double.longBitsToDouble(4613937818241073152L), Class1172.Method4709(100, 100));
        final int n10 = n9 + n2;
        this.Method7641("Health", method267 + Double.longBitsToDouble((long)921440374 ^ 0x4000000036EC1076L), method268 + n10, Class1172.Method4709(100, 100));
        Class753.drawRect(method267 + Double.longBitsToDouble((long)1456085966 ^ 0x4000000056CA1BCEL), method268 + n10 + this.Method7642() + 1.0, method267 + this.Field17576, method268 + n10 + this.Method7642() + Double.longBitsToDouble(4613937818241073152L), Class1172.Method4709(100, 100));
    }
    
    private void Method7641(final String s, final double n, final double n2, final int n3) {
        if (Class1831.Field16464) {
            Class1178.Field13326.Method748(s, (int)n, (int)n2, n3);
        }
        else {
            Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer.drawStringWithShadow(s, (float)(int)n, (float)(int)n2, n3);
        }
    }
    
    private int Method7642() {
        if (Class1831.Field16464) {
            return Class1178.Field13326.Method747();
        }
        return Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer.FONT_HEIGHT;
    }
    
    private int Method7643(final String s) {
        if (Class1831.Field16464) {
            return Class1178.Field13326.Method757(s);
        }
        return Class2102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.fontRenderer.getStringWidth(s);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1FC6 ^ 0x2F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
