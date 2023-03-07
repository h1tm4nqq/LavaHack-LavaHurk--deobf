//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.fml.client.config.GuiUnicodeGlyphButton
 */
package lavahack.client;

import java.io.IOException;
import lavahack.client.CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA;
import lavahack.client.Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo;
import lavahack.client.IdtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE;
import lavahack.client.OP4La13R7rceTBm7QSP7XXXyRxZD1Op3;
import lavahack.client.OP4La13R7rceTBm7QSP7XXXyRxZD1Op3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.QCwR6Uh9k9HCYI7H9ruCMQfjpEziiOA0;
import lavahack.client.QnfEmKWvlwRNiRsFVIMqQU1HcNHc8CBP;
import lavahack.client.T5FD2ee74iGrSuUWIS0OtiFiVnGbordE;
import lavahack.client.YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo;
import lavahack.client.Z5ZmD08b7JN6vOGXwjWIEkZYtXPbG5uF;
import lavahack.client.sYSQwf2xD3nukbcGapT2KmEMESaueLHM;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.client.config.GuiUnicodeGlyphButton;

public class Y7MJXqsFEyMDfjLtI7kgWuxROmcVitch
extends QnfEmKWvlwRNiRsFVIMqQU1HcNHc8CBP {
    private final OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 Field12251;
    private final IdtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE Field12252;
    private int Field12253 = (int)337355807L ^ 0x141BA41F;
    private int Field12254 = (int)((long)-1161071973 ^ (long)-1161071973);
    private T5FD2ee74iGrSuUWIS0OtiFiVnGbordE Field12255 = null;
    private T5FD2ee74iGrSuUWIS0OtiFiVnGbordE Field12256 = null;
    private T5FD2ee74iGrSuUWIS0OtiFiVnGbordE Field12257 = null;
    private GuiButton Field12258 = null;
    private GuiButton Field12259 = null;
    private T5FD2ee74iGrSuUWIS0OtiFiVnGbordE Field12260 = null;
    private GuiButton Field12261 = null;
    private GuiButton Field12262 = null;
    private GuiButton Field12263 = null;
    private GuiButton Field12264 = null;
    private GuiButton Field12265 = null;
    private GuiButton Field12266 = null;
    private GuiButton Field12267 = null;
    private final String Field12268 = I18n.format((String)"schematica.gui.moveschematic", (Object[])new Object[(int)1233041080L ^ 0x497EB6B8]);
    private final String Field12269 = I18n.format((String)"schematica.gui.operations", (Object[])new Object[(int)((long)-1587501204 ^ (long)-1587501204)]);
    private final String Field12270 = I18n.format((String)"schematica.gui.unload", (Object[])new Object[(int)((long)-712900180 ^ (long)-712900180)]);
    private final String Field12271 = I18n.format((String)"schematica.gui.materials", (Object[])new Object[(int)719217898L ^ 0x2ADE64EA]);
    private final String Field12272 = I18n.format((String)"schematica.gui.hide", (Object[])new Object[(int)1474843959L ^ 0x57E85537]);
    private final String Field12273 = I18n.format((String)"schematica.gui.show", (Object[])new Object[(int)1303342078L ^ 0x4DAF6BFE]);
    private final String Field12274 = I18n.format((String)"schematica.gui.x", (Object[])new Object[(int)597240500L ^ 0x23992AB4]);
    private final String Field12275 = I18n.format((String)"schematica.gui.y", (Object[])new Object[(int)630556215L ^ 0x25958637]);
    private final String Field12276 = I18n.format((String)"schematica.gui.z", (Object[])new Object[(int)1439486271L ^ 0x55CCD13F]);
    private final String Field12277 = I18n.format((String)"schematica.gui.on", (Object[])new Object[(int)((long)2010826770 ^ (long)2010826770)]);
    private final String Field12278 = I18n.format((String)"schematica.gui.off", (Object[])new Object[(int)((long)-2062100341 ^ (long)-2062100341)]);
    private String Field12279 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Y7MJXqsFEyMDfjLtI7kgWuxROmcVitch(GuiScreen guiScreen) {
        super(guiScreen);
        this.Field12251 = sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8122;
        this.Field12252 = IdtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE.Field9718;
    }

    @Override
    public void initGui() {
        this.Field12253 = this.width / ((int)((long)1114691285 ^ (long)1114691284) << 1);
        this.Field12254 = this.height / (((int)1517119609L ^ 0x5A6D6878) << 1);
        this.buttonList.clear();
        int n = (int)1859497232L ^ 0x6ED5AD10;
        this.Field12255 = new T5FD2ee74iGrSuUWIS0OtiFiVnGbordE(this.fontRenderer, n++, this.Field12253 - (((int)-119041192L ^ 0xF8E79341) << 1), this.Field12254 - ((int)((long)187720845 ^ (long)187720834) << 1), (int)((long)1748384793 ^ (long)1748384768) << 2, (int)((long)229674680 ^ (long)229674685) << 2);
        this.buttonList.add(this.Field12255);
        this.Field12256 = new T5FD2ee74iGrSuUWIS0OtiFiVnGbordE(this.fontRenderer, n++, this.Field12253 - (((int)-888908624L ^ 0xCB0454A9) << 1), this.Field12254 - ((int)-833665404L ^ 0xCE4F4681), ((int)993446232L ^ 0x3B36C941) << 2, (int)((long)-2123314646 ^ (long)-2123314641) << 2);
        this.buttonList.add(this.Field12256);
        this.Field12257 = new T5FD2ee74iGrSuUWIS0OtiFiVnGbordE(this.fontRenderer, n++, this.Field12253 - (((int)-642494259L ^ 0xD9B450D4) << 1), this.Field12254 + (((int)-1481892135L ^ 0xA7AC1EDC) << 2), (int)((long)761817450 ^ (long)761817459) << 2, ((int)-1247613262L ^ 0xB5A2EEB7) << 2);
        this.buttonList.add(this.Field12257);
        this.Field12258 = new GuiButton(n++, this.width - ((int)((long)-800461604 ^ (long)-800461583) << 1), this.height - ((int)((long)-193667662 ^ (long)-193667669) << 3), ((int)533075228L ^ 0x1FC61519) << 4, ((int)1463913402L ^ 0x57418BBF) << 2, this.Field12270);
        this.buttonList.add(this.Field12258);
        this.Field12259 = new GuiButton(n++, this.width - ((int)((long)2078151987 ^ (long)2078151966) << 1), this.height - (((int)-228431388L ^ 0xF26269AF) << 1) - (int)((long)-1513376713 ^ (long)-1513376722), ((int)-1023368300L ^ 0xC300A391) << 4, (int)((long)1157985760 ^ (long)1157985765) << 2, I18n.format((String)(this.Field12251 != null ? this.Field12251.Field14898 : OP4La13R7rceTBm7QSP7XXXyRxZD1Op3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10633).Field10636, (Object[])new Object[(int)-2045698441L ^ 0x86111E77]));
        this.buttonList.add(this.Field12259);
        this.Field12260 = new T5FD2ee74iGrSuUWIS0OtiFiVnGbordE(this.fontRenderer, n++, this.width - (((int)1482791666L ^ 0x58619ADF) << 1), this.height - ((int)((long)1717037633 ^ (long)1717037578) << 1), ((int)1794242572L ^ 0x6AF1F809) << 4, ((int)-981890111L ^ 0xC5798BC4) << 2);
        this.buttonList.add(this.Field12260);
        this.Field12261 = new GuiButton(n++, this.width - (((int)398451371L ^ 0x17BFE286) << 1), this.height - ((int)-2099245703L ^ 0x82E00D10), ((int)2044634372L ^ 0x79DEA501) << 4, ((int)-1904925243L ^ 0x8E7525C0) << 2, this.Field12251 != null && this.Field12251.Field14897 ? this.Field12272 : this.Field12273);
        this.buttonList.add(this.Field12261);
        this.Field12262 = new GuiButton(n++, this.width - (((int)-1763449307L ^ 0x96E3E608) << 1), this.height - ((int)((long)-990696627 ^ (long)-990696632) << 4), ((int)58764186L ^ 0x380AB9F) << 4, (int)((long)1995292050 ^ (long)1995292055) << 2, I18n.format((String)"schematica.gui.movehere", (Object[])new Object[(int)-2077092809L ^ 0x84321437]));
        this.buttonList.add(this.Field12262);
        this.Field12263 = new GuiButton(n++, this.width - (((int)1619125502L ^ 0x6081E4D3) << 2), this.height - (int)((long)-1140736901 ^ (long)-1140736948), ((int)-751068145L ^ 0xD33B9C0A) << 4, (int)((long)597306208 ^ (long)597306213) << 2, I18n.format((String)("schematica.gui." + sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8127.getName()), (Object[])new Object[(int)((long)-803959703 ^ (long)-803959703)]));
        this.buttonList.add(this.Field12263);
        this.Field12264 = new GuiUnicodeGlyphButton(n++, this.width - ((int)((long)-801809840 ^ (long)-801809795) << 1), this.height - ((int)-1155370053L ^ 0xBB22738C), (int)((long)-231916028 ^ (long)-231916031) << 4, ((int)-1621175798L ^ 0x9F5ED20F) << 2, " " + I18n.format((String)"schematica.gui.flip", (Object[])new Object[(int)-5030878L ^ 0xFFB33C22]), "\u2194", 2.0f);
        this.buttonList.add(this.Field12264);
        this.Field12265 = new GuiButton(n++, this.width - ((int)((long)-405844666 ^ (long)-405844629) << 2), this.height - (((int)-614223777L ^ 0xDB63B050) << 1), (int)((long)-1056683117 ^ (long)-1056683114) << 4, ((int)497488316L ^ 0x1DA711B9) << 2, I18n.format((String)("schematica.gui." + sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8128.getName()), (Object[])new Object[(int)1659101054L ^ 0x62E3DF7E]));
        this.buttonList.add(this.Field12265);
        this.Field12266 = new GuiUnicodeGlyphButton(n++, this.width - ((int)((long)-1831689875 ^ (long)-1831689920) << 1), this.height - (((int)761355523L ^ 0x2D615D0C) << 1), (int)((long)595938238 ^ (long)595938235) << 4, (int)((long)972835044 ^ (long)972835041) << 2, " " + I18n.format((String)"schematica.gui.rotate", (Object[])new Object[(int)1240770614L ^ 0x49F4A836]), "\u21bb", 2.0f);
        this.buttonList.add(this.Field12266);
        this.Field12267 = new GuiButton(n++, ((int)-1990997540L ^ 0x8953C9D9) << 1, this.height - (((int)1797376136L ^ 0x6B21C8AB) << 1), ((int)1283141111L ^ 0x4C7B2DF2) << 4, (int)((long)-1014728370 ^ (long)-1014728373) << 2, this.Field12271);
        this.buttonList.add(this.Field12267);
        this.Field12255.setEnabled((this.Field12251 != null ? (int)-1989116325L ^ 0x89707E5A : (int)-1096713197L ^ 0xBEA17C13) != 0);
        this.Field12256.setEnabled((this.Field12251 != null ? (int)-1221291519L ^ 0xB7349200 : (int)((long)-858740243 ^ (long)-858740243)) != 0);
        this.Field12257.setEnabled((this.Field12251 != null ? (int)((long)-1470954332 ^ (long)-1470954331) : (int)((long)779531091 ^ (long)779531091)) != 0);
        this.Field12258.enabled = this.Field12251 != null ? (int)((long)1729987817 ^ (long)1729987816) : (int)((long)-27270515 ^ (long)-27270515);
        this.Field12259.enabled = this.Field12251 != null ? (int)((long)771384349 ^ (long)771384348) : (int)((long)890522915 ^ (long)890522915);
        this.Field12260.setEnabled((this.Field12251 != null && this.Field12251.Field14898 != OP4La13R7rceTBm7QSP7XXXyRxZD1Op3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10633 ? (int)499036538L ^ 0x1DBEB17B : (int)-416580136L ^ 0xE72B7DD8) != 0);
        this.Field12261.enabled = this.Field12251 != null ? (int)571335989L ^ 0x220DE534 : (int)1578735063L ^ 0x5E1995D7;
        this.Field12262.enabled = this.Field12251 != null ? (int)((long)-666708962 ^ (long)-666708961) : (int)-833790234L ^ 0xCE4D5EE6;
        this.Field12263.enabled = this.Field12251 != null ? (int)-1745093442L ^ 0x97FBFCBF : (int)-13721038L ^ 0xFF2EA232;
        this.Field12264.enabled = this.Field12251 != null ? (int)((long)-1885762127 ^ (long)-1885762128) : (int)1003162834L ^ 0x3BCB0CD2;
        this.Field12265.enabled = this.Field12251 != null ? (int)((long)1108604436 ^ (long)1108604437) : (int)((long)-1712930544 ^ (long)-1712930544);
        this.Field12266.enabled = this.Field12251 != null ? (int)((long)1434309017 ^ (long)1434309016) : (int)((long)-598658605 ^ (long)-598658605);
        this.Field12267.enabled = this.Field12251 != null ? (int)((long)279927722 ^ (long)279927723) : (int)((long)1612171241 ^ (long)1612171241);
        this.Method4017(this.Field12255);
        this.Method4017(this.Field12256);
        this.Method4017(this.Field12257);
        if (this.Field12251 != null) {
            this.Method4018(this.Field12255, this.Field12256, this.Field12257, this.Field12251.Field14896);
        }
        this.Field12260.setMinimum((int)-1519415321L ^ 0xA56F8FE7);
        this.Field12260.setMaximum(this.Field12251 != null ? this.Field12251.getHeight() - ((int)1610802599L ^ 0x6002E5A6) : (int)((long)-592993379 ^ (long)-592993379));
        if (this.Field12251 == null) return;
        this.Field12260.setValue(this.Field12251.Field14899);
    }

    private void Method4017(T5FD2ee74iGrSuUWIS0OtiFiVnGbordE t5FD2ee74iGrSuUWIS0OtiFiVnGbordE) {
        t5FD2ee74iGrSuUWIS0OtiFiVnGbordE.setMinimum((int)-1586947721L ^ 0x5F5F25F7);
        t5FD2ee74iGrSuUWIS0OtiFiVnGbordE.setMaximum(((int)1940706356L ^ 0x73AF47B3) << 7);
    }

    private void Method4018(T5FD2ee74iGrSuUWIS0OtiFiVnGbordE t5FD2ee74iGrSuUWIS0OtiFiVnGbordE, T5FD2ee74iGrSuUWIS0OtiFiVnGbordE t5FD2ee74iGrSuUWIS0OtiFiVnGbordE2, T5FD2ee74iGrSuUWIS0OtiFiVnGbordE t5FD2ee74iGrSuUWIS0OtiFiVnGbordE3, BlockPos blockPos) {
        t5FD2ee74iGrSuUWIS0OtiFiVnGbordE.setValue(blockPos.getX());
        t5FD2ee74iGrSuUWIS0OtiFiVnGbordE2.setValue(blockPos.getY());
        t5FD2ee74iGrSuUWIS0OtiFiVnGbordE3.setValue(blockPos.getZ());
    }

    protected void Method4019(GuiButton guiButton) {
        if (!guiButton.enabled) return;
        if (this.Field12251 == null) {
            return;
        }
        if (guiButton.id == this.Field12255.id) {
            this.Field12251.Field14896.Field7895 = this.Field12255.getValue();
            YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11944.refresh();
            return;
        }
        if (guiButton.id == this.Field12256.id) {
            this.Field12251.Field14896.Field7896 = this.Field12256.getValue();
            YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11944.refresh();
            return;
        }
        if (guiButton.id == this.Field12257.id) {
            this.Field12251.Field14896.Field7897 = this.Field12257.getValue();
            YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11944.refresh();
            return;
        }
        if (guiButton.id == this.Field12258.id) {
            Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo.Field17565.Method414();
            this.mc.displayGuiScreen(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
            return;
        }
        if (guiButton.id == this.Field12259.id) {
            this.Field12251.Field14898 = OP4La13R7rceTBm7QSP7XXXyRxZD1Op3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method1105(this.Field12251.Field14898);
            this.Field12259.displayString = I18n.format((String)this.Field12251.Field14898.Field10636, (Object[])new Object[(int)609971014L ^ 0x245B6B46]);
            this.Field12260.setEnabled((this.Field12251.Field14898 != OP4La13R7rceTBm7QSP7XXXyRxZD1Op3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10633 ? (int)((long)1733129794 ^ (long)1733129795) : (int)-199714494L ^ 0xF4189942) != 0);
            YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11944.refresh();
            return;
        }
        if (guiButton.id == this.Field12260.id) {
            this.Field12251.Field14899 = this.Field12260.getValue();
            YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11944.refresh();
            return;
        }
        if (guiButton.id == this.Field12261.id) {
            this.Field12261.displayString = this.Field12251.toggleRendering() ? this.Field12272 : this.Field12273;
            return;
        }
        if (guiButton.id == this.Field12262.id) {
            sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Method425(this.Field12251);
            YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11944.refresh();
            this.Method4018(this.Field12255, this.Field12256, this.Field12257, this.Field12251.Field14896);
            return;
        }
        if (guiButton.id == this.Field12263.id) {
            EnumFacing[] enumFacingArray = EnumFacing.VALUES;
            sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8127 = enumFacingArray[(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8127.ordinal() + (((int)-2096784316L ^ 0x83059C45) << 1)) % enumFacingArray.length];
            guiButton.displayString = I18n.format((String)("schematica.gui." + sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8127.getName()), (Object[])new Object[(int)((long)-858655539 ^ (long)-858655539)]);
            return;
        }
        if (guiButton.id == this.Field12264.id) {
            if (!QCwR6Uh9k9HCYI7H9ruCMQfjpEziiOA0.Field9447.Method1757(this.Field12251, sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8127, Y7MJXqsFEyMDfjLtI7kgWuxROmcVitch.isShiftKeyDown())) return;
            YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11944.refresh();
            IdtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE.Field9718.Method2017();
            return;
        }
        if (guiButton.id == this.Field12265.id) {
            EnumFacing[] enumFacingArray = EnumFacing.VALUES;
            sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8128 = enumFacingArray[(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8128.ordinal() + ((int)-853820748L ^ 0xCD1BBAB5)) % enumFacingArray.length];
            guiButton.displayString = I18n.format((String)("schematica.gui." + sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8128.getName()), (Object[])new Object[(int)-1230790070L ^ 0xB6A3A24A]);
            return;
        }
        if (guiButton.id == this.Field12266.id) {
            if (!CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA.Field16065.Method6701(this.Field12251, sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8128, Y7MJXqsFEyMDfjLtI7kgWuxROmcVitch.isShiftKeyDown())) return;
            this.Method4018(this.Field12255, this.Field12256, this.Field12257, this.Field12251.Field14896);
            YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo.Field11944.refresh();
            IdtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE.Field9718.Method2017();
            return;
        }
        if (guiButton.id != this.Field12267.id) return;
        this.mc.displayGuiScreen((GuiScreen)new Z5ZmD08b7JN6vOGXwjWIEkZYtXPbG5uF(this));
    }

    public void Method4020() throws IOException {
        super.handleKeyboardInput();
        if (this.Field12264.enabled) {
            this.Field12264.packedFGColour = Y7MJXqsFEyMDfjLtI7kgWuxROmcVitch.isShiftKeyDown() ? (int)((long)1308269946 ^ (long)1308269957) << 16 : (int)((long)-1635728602 ^ (long)-1635728602);
        }
        if (!this.Field12266.enabled) return;
        this.Field12266.packedFGColour = Y7MJXqsFEyMDfjLtI7kgWuxROmcVitch.isShiftKeyDown() ? ((int)-453819935L ^ 0xE4F3411E) << 16 : (int)((long)-1308701851 ^ (long)-1308701851);
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
        this.drawCenteredString(this.fontRenderer, this.Field12268, this.Field12253, this.Field12254 - ((int)1158979682L ^ 0x4514A04F), (int)((long)-686764740 ^ (long)-672189757));
        this.drawCenteredString(this.fontRenderer, this.Field12271, (int)((long)-1193047910 ^ (long)-1193047933) << 1, this.height - ((int)1263344585L ^ 0x4B4D1B9C), (int)-511387086L ^ 0xE17B25CD);
        this.drawCenteredString(this.fontRenderer, this.Field12269, this.width - (((int)1511727376L ^ 0x5A1B2109) << 1), this.height - (((int)1993188420L ^ 0x76CDA44B) << 3), (int)((long)1011255452 ^ (long)1018787683));
        this.drawString(this.fontRenderer, this.Field12274, this.Field12253 - ((int)-1193261836L ^ 0xB8E044B5), this.Field12254 - ((int)((long)1132795931 ^ (long)1132795928) << 3), (int)-2104473062L ^ 0x826FB5E5);
        this.drawString(this.fontRenderer, this.Field12275, this.Field12253 - ((int)720071596L ^ 0x2AEB6BED), this.Field12254 + (int)((long)1431013280 ^ (long)1431013281), (int)-1946178311L ^ 0x8B005306);
        this.drawString(this.fontRenderer, this.Field12276, this.Field12253 - (int)((long)-1254063067 ^ (long)-1254063004), this.Field12254 + ((int)((long)1137917045 ^ (long)1137917048) << 1), (int)((long)-1578122852 ^ (long)-1592770973));
        super.drawScreen(n, n2, f);
    }

    private static String Method4021(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1167684913L ^ 0xBA668ACF;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1809508722L ^ 0x94251671);
            int n2 = (int)-1861646447L ^ 0x9109872E;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1213543355L ^ 0xB7AAC140) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

