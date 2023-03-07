//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.GuiTextField
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package lavahack.client;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import lavahack.client.Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo;
import lavahack.client.MWKsjf2F7eDKYSgsSUOF8imukA0mof8z;
import lavahack.client.QnfEmKWvlwRNiRsFVIMqQU1HcNHc8CBP;
import lavahack.client.T5FD2ee74iGrSuUWIS0OtiFiVnGbordE;
import lavahack.client.Z59nFS7fzGt9MllssMcgOsEYj1a2guaH;
import lavahack.client.sYSQwf2xD3nukbcGapT2KmEMESaueLHM;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class wTT69buSmsUGMaHe8NhIqgZr7Hb6tunb
extends QnfEmKWvlwRNiRsFVIMqQU1HcNHc8CBP {
    private int Field14700 = (int)1861657385L ^ 0x6EF6A329;
    private int Field14701 = (int)((long)1547327878 ^ (long)1547327878);
    private GuiButton Field14702 = null;
    private T5FD2ee74iGrSuUWIS0OtiFiVnGbordE Field14703 = null;
    private T5FD2ee74iGrSuUWIS0OtiFiVnGbordE Field14704 = null;
    private T5FD2ee74iGrSuUWIS0OtiFiVnGbordE Field14705 = null;
    private GuiButton Field14706 = null;
    private T5FD2ee74iGrSuUWIS0OtiFiVnGbordE Field14707 = null;
    private T5FD2ee74iGrSuUWIS0OtiFiVnGbordE Field14708 = null;
    private T5FD2ee74iGrSuUWIS0OtiFiVnGbordE Field14709 = null;
    private GuiButton Field14710 = null;
    private GuiButton Field14711 = null;
    private GuiButton Field14712 = null;
    private GuiTextField Field14713 = null;
    private String Field14714 = "";
    private String Field14715;
    private Iterator Field14716 = null;
    private final String Field14717 = I18n.format((String)"schematica.gui.saveselection", (Object[])new Object[(int)-1919600726L ^ 0x8D9537AA]);
    private final String Field14718 = I18n.format((String)"schematica.gui.x", (Object[])new Object[(int)((long)611625547 ^ (long)611625547)]);
    private final String Field14719 = I18n.format((String)"schematica.gui.y", (Object[])new Object[(int)((long)519829278 ^ (long)519829278)]);
    private final String Field14720 = I18n.format((String)"schematica.gui.z", (Object[])new Object[(int)((long)2129550998 ^ (long)2129550998)]);
    private final String Field14721 = I18n.format((String)"schematica.gui.on", (Object[])new Object[(int)-808982614L ^ 0xCFC7E7AA]);
    private final String Field14722 = I18n.format((String)"schematica.gui.off", (Object[])new Object[(int)((long)-2005435783 ^ (long)-2005435783)]);
    static final boolean Field14723 = !wTT69buSmsUGMaHe8NhIqgZr7Hb6tunb.class.desiredAssertionStatus() ? (int)1009576951L ^ 0x3C2CEBF6 : (int)((long)-481524504 ^ (long)-481524504);
    private String Field14724 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public wTT69buSmsUGMaHe8NhIqgZr7Hb6tunb(GuiScreen guiScreen) {
        super(guiScreen);
        this.Field14715 = this.Method5742();
    }

    @Override
    public void initGui() {
        this.Field14700 = this.width / (((int)420721326L ^ 0x1913B2AF) << 1);
        this.Field14701 = this.height / ((int)((long)-249337006 ^ (long)-249337005) << 1);
        this.buttonList.clear();
        int n = (int)127485968L ^ 0x7994810;
        this.Field14702 = new GuiButton(n++, this.Field14700 - ((int)((long)-1634756824 ^ (long)-1634756759) << 1), this.Field14701 - (int)((long)-417326447 ^ (long)-417326426), (int)((long)1428102038 ^ (long)1428102031) << 2, (int)((long)433743171 ^ (long)433743174) << 2, I18n.format((String)"schematica.gui.point.red", (Object[])new Object[(int)((long)1677013624 ^ (long)1677013624)]));
        this.buttonList.add(this.Field14702);
        this.Field14703 = new T5FD2ee74iGrSuUWIS0OtiFiVnGbordE(this.fontRenderer, n++, this.Field14700 - (((int)-1338788015L ^ 0xB033B710) << 1), this.Field14701 - ((int)((long)1044465270 ^ (long)1044465273) << 1));
        this.buttonList.add(this.Field14703);
        this.Field14704 = new T5FD2ee74iGrSuUWIS0OtiFiVnGbordE(this.fontRenderer, n++, this.Field14700 - ((int)((long)274084683 ^ (long)274084618) << 1), this.Field14701 - ((int)-189885949L ^ 0xF4AE9206));
        this.buttonList.add(this.Field14704);
        this.Field14705 = new T5FD2ee74iGrSuUWIS0OtiFiVnGbordE(this.fontRenderer, n++, this.Field14700 - ((int)((long)-933579783 ^ (long)-933579848) << 1), this.Field14701 + (((int)-492040584L ^ 0xE2AC0E7D) << 2));
        this.buttonList.add(this.Field14705);
        this.Field14706 = new GuiButton(n++, this.Field14700 + (((int)1926543800L ^ 0x72D4B9B7) << 1), this.Field14701 - (int)((long)-1054323665 ^ (long)-1054323688), (int)((long)-1879218454 ^ (long)-1879218445) << 2, ((int)-795879009L ^ 0xD08FD99A) << 2, I18n.format((String)"schematica.gui.point.blue", (Object[])new Object[(int)((long)1025417743 ^ (long)1025417743)]));
        this.buttonList.add(this.Field14706);
        this.Field14707 = new T5FD2ee74iGrSuUWIS0OtiFiVnGbordE(this.fontRenderer, n++, this.Field14700 + (((int)1198905484L ^ 0x4775D883) << 1), this.Field14701 - (((int)-475332827L ^ 0xE3AAFF2A) << 1));
        this.buttonList.add(this.Field14707);
        this.Field14708 = new T5FD2ee74iGrSuUWIS0OtiFiVnGbordE(this.fontRenderer, n++, this.Field14700 + ((int)((long)589323 ^ (long)589316) << 1), this.Field14701 - (int)((long)-444965824 ^ (long)-444965819));
        this.buttonList.add(this.Field14708);
        this.Field14709 = new T5FD2ee74iGrSuUWIS0OtiFiVnGbordE(this.fontRenderer, n++, this.Field14700 + (((int)597584724L ^ 0x239E6B5B) << 1), this.Field14701 + ((int)((long)390458288 ^ (long)390458293) << 2));
        this.buttonList.add(this.Field14709);
        this.Field14710 = new GuiButton(n++, this.width - (((int)838487862L ^ 0x31FA4F5F) << 1), this.height - ((int)2064608022L ^ 0x7B0F6B21), ((int)-1883875078L ^ 0x8FB658E3) << 1, ((int)-1922727632L ^ 0x8D658135) << 2, sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8117 && Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo.Field17565.Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro ? this.Field14721 : this.Field14722);
        this.buttonList.add(this.Field14710);
        this.Field14713 = new GuiTextField(n++, this.fontRenderer, this.width - ((int)-19682168L ^ 0xFED3AC59), this.height - ((int)-424901621L ^ 0xE6AC8416), (int)-408194205L ^ 0xE7AB73FA, (int)((long)806801518 ^ (long)806801511) << 1);
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.add(this.Field14713);
        this.Field14712 = new GuiButton(n++, this.width - ((int)((long)1049435651 ^ (long)1049435674) << 1), this.height - (((int)404077817L ^ 0x1815BCF6) << 1), (int)((long)-1126730573 ^ (long)-1126730570) << 3, ((int)-1292737904L ^ 0xB2F26295) << 2, I18n.format((String)"schematica.gui.save", (Object[])new Object[(int)((long)329724924 ^ (long)329724924)]));
        this.Field14712.enabled = sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8117 && Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo.Field17565.Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro || sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8122 != null ? (int)1465280035L ^ 0x57566622 : (int)602385054L ^ 0x23E7AA9E;
        this.buttonList.add(this.Field14712);
        int n2 = n++;
        Object[] objectArray = new Object[(int)((long)-537235222 ^ (long)-537235221)];
        objectArray[(int)((long)-790046313 ^ (long)-790046313)] = I18n.format((String)MWKsjf2F7eDKYSgsSUOF8imukA0mof8z.Method999(this.Field14715), (Object[])new Object[(int)-478239063L ^ 0xE37EA6A9]);
        this.Field14711 = new GuiButton(n2, this.width - ((int)2055150206L ^ 0x7A7F1AE5), this.height - ((int)-1910603707L ^ 0x8E1E8072), (int)((long)-68502915 ^ (long)-68502804), ((int)-1408820504L ^ 0xAC071AED) << 2, I18n.format((String)"schematica.gui.format", (Object[])objectArray));
        this.Field14711.enabled = sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8117 && Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo.Field17565.Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro || sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8122 != null ? (int)1834868664L ^ 0x6D5DDFB9 : (int)930127850L ^ 0x37709FEA;
        this.buttonList.add(this.Field14711);
        this.Field14713.setMaxStringLength((int)((long)525770949 ^ (long)525770948) << 10);
        this.Field14713.setText(this.Field14714);
        this.Method5739(this.Field14703);
        this.Method5739(this.Field14704);
        this.Method5739(this.Field14705);
        this.Method5739(this.Field14707);
        this.Method5739(this.Field14708);
        this.Method5739(this.Field14709);
        this.Method5740(this.Field14703, this.Field14704, this.Field14705, sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8123);
        this.Method5740(this.Field14707, this.Field14708, this.Field14709, sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8124);
    }

    private void Method5739(T5FD2ee74iGrSuUWIS0OtiFiVnGbordE t5FD2ee74iGrSuUWIS0OtiFiVnGbordE) {
        t5FD2ee74iGrSuUWIS0OtiFiVnGbordE.setMinimum((int)-464036592L ^ 0x1A616190);
        t5FD2ee74iGrSuUWIS0OtiFiVnGbordE.setMaximum(((int)2136636009L ^ 0x7F59E9EE) << 7);
    }

    private void Method5740(T5FD2ee74iGrSuUWIS0OtiFiVnGbordE t5FD2ee74iGrSuUWIS0OtiFiVnGbordE, T5FD2ee74iGrSuUWIS0OtiFiVnGbordE t5FD2ee74iGrSuUWIS0OtiFiVnGbordE2, T5FD2ee74iGrSuUWIS0OtiFiVnGbordE t5FD2ee74iGrSuUWIS0OtiFiVnGbordE3, BlockPos blockPos) {
        t5FD2ee74iGrSuUWIS0OtiFiVnGbordE.setValue(blockPos.getX());
        t5FD2ee74iGrSuUWIS0OtiFiVnGbordE2.setValue(blockPos.getY());
        t5FD2ee74iGrSuUWIS0OtiFiVnGbordE3.setValue(blockPos.getZ());
    }

    protected void Method5741(GuiButton guiButton) {
        if (!guiButton.enabled) return;
        if (guiButton.id == this.Field14702.id) {
            sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Method424(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8123);
            sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Method423();
            this.Method5740(this.Field14703, this.Field14704, this.Field14705, sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8123);
            return;
        }
        if (guiButton.id == this.Field14703.id) {
            sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8123.Field7895 = this.Field14703.getValue();
            sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Method423();
            return;
        }
        if (guiButton.id == this.Field14704.id) {
            sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8123.Field7896 = this.Field14704.getValue();
            sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Method423();
            return;
        }
        if (guiButton.id == this.Field14705.id) {
            sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8123.Field7897 = this.Field14705.getValue();
            sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Method423();
            return;
        }
        if (guiButton.id == this.Field14706.id) {
            sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Method424(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8124);
            sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Method423();
            this.Method5740(this.Field14707, this.Field14708, this.Field14709, sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8124);
            return;
        }
        if (guiButton.id == this.Field14707.id) {
            sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8124.Field7895 = this.Field14707.getValue();
            sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Method423();
            return;
        }
        if (guiButton.id == this.Field14708.id) {
            sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8124.Field7896 = this.Field14708.getValue();
            sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Method423();
            return;
        }
        if (guiButton.id == this.Field14709.id) {
            sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8124.Field7897 = this.Field14709.getValue();
            sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Method423();
            return;
        }
        if (guiButton.id == this.Field14710.id) {
            sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8117 = !sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8117 && Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo.Field17565.Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro ? (int)((long)653797292 ^ (long)653797293) : (int)1909851244L ^ 0x71D6046C;
            this.Field14710.displayString = sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8117 ? this.Field14721 : this.Field14722;
            this.Field14712.enabled = sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8117 || sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8122 != null ? (int)((long)-1043673511 ^ (long)-1043673512) : (int)1965272054L ^ 0x7523ABF6;
            this.Field14711.enabled = sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8117 || sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8122 != null ? (int)-1937623618L ^ 0x8C8235BF : (int)((long)455542187 ^ (long)455542187);
            return;
        }
        if (guiButton.id == this.Field14711.id) {
            this.Field14715 = this.Method5742();
            Object[] objectArray = new Object[(int)((long)-2146615812 ^ (long)-2146615811)];
            objectArray[(int)((long)-1405542681 ^ (long)-1405542681)] = I18n.format((String)MWKsjf2F7eDKYSgsSUOF8imukA0mof8z.Method999(this.Field14715), (Object[])new Object[(int)((long)2089315201 ^ (long)2089315201)]);
            this.Field14711.displayString = I18n.format((String)"schematica.gui.format", (Object[])objectArray);
            return;
        }
        if (guiButton.id != this.Field14712.id) return;
        String string = this.Field14713.getText() + MWKsjf2F7eDKYSgsSUOF8imukA0mof8z.Method1000(this.Field14715);
        if (sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8117) {
            if (!Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo.Field17565.Method416((EntityPlayer)this.mc.player, Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7990, string, (World)this.mc.world, this.Field14715, sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8125, sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8126)) return;
            this.Field14714 = "";
            this.Field14713.setText(this.Field14714);
            return;
        }
        MWKsjf2F7eDKYSgsSUOF8imukA0mof8z.Method998(new File(Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7990, string), this.Field14715, sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8122.getSchematic(), (EntityPlayer)this.mc.player);
    }

    @Override
    protected void keyTyped(char c, int n) throws IOException {
        super.keyTyped(c, n);
        this.Field14714 = this.Field14713.getText();
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
        this.drawString(this.fontRenderer, this.Field14717, this.width - ((int)-470803296L ^ 0xE3F01C6D), this.height - (((int)2034813056L ^ 0x7948C8A3) << 1), (int)674787787L ^ 0x28C78E34);
        this.drawString(this.fontRenderer, this.Field14718, this.Field14700 - (int)((long)-798941927 ^ (long)-798941816), this.Field14701 - (((int)482807582L ^ 0x1CC70F1D) << 3), (int)((long)1663648652 ^ (long)1675017331));
        this.drawString(this.fontRenderer, Integer.toString(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8123.Field7895), this.Field14700 - ((int)-637908479L ^ 0xD9FA4A18), this.Field14701 - ((int)((long)-1434936841 ^ (long)-1434936844) << 3), (int)273018587L ^ 0x10BA1124);
        this.drawString(this.fontRenderer, this.Field14719, this.Field14700 - (int)((long)-1588663358 ^ (long)-1588663469), this.Field14701 + ((int)-1856020064L ^ 0x915F61A1), (int)1440166803L ^ 0x5528CC6C);
        this.drawString(this.fontRenderer, Integer.toString(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8123.Field7896), this.Field14700 - ((int)916185738L ^ 0x369BE293), this.Field14701 + ((int)-41753392L ^ 0xFD82E4D1), (int)((long)-992900559 ^ (long)-1003588146));
        this.drawString(this.fontRenderer, this.Field14720, this.Field14700 - (int)((long)592070963 ^ (long)592071074), this.Field14701 + ((int)((long)2017271425 ^ (long)2017271436) << 1), (int)((long)1830049065 ^ (long)1844161238));
        this.drawString(this.fontRenderer, Integer.toString(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8123.Field7897), this.Field14700 - (int)((long)405043570 ^ (long)405043563), this.Field14701 + (((int)2041373428L ^ 0x79ACE2F9) << 1), (int)-1473887158L ^ 0xA8D9BBB5);
        this.drawString(this.fontRenderer, this.Field14718, this.Field14700 + ((int)1750216286L ^ 0x68522E51), this.Field14701 - ((int)((long)-789324158 ^ (long)-789324159) << 3), (int)((long)1658376505 ^ (long)1646735046));
        this.drawString(this.fontRenderer, Integer.toString(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8124.Field7895), this.Field14700 + ((int)-1610081011L ^ 0xA0081D8A), this.Field14701 - ((int)((long)-1756577576 ^ (long)-1756577573) << 3), (int)((long)-855809171 ^ (long)-872244078));
        this.drawString(this.fontRenderer, this.Field14719, this.Field14700 + (int)((long)109487310 ^ (long)109487297), this.Field14701 + (int)((long)704161628 ^ (long)704161629), (int)((long)-1236526390 ^ (long)-1229724363));
        this.drawString(this.fontRenderer, Integer.toString(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8124.Field7896), this.Field14700 + (int)((long)-1351522063 ^ (long)-1351522186), this.Field14701 + ((int)43448622L ^ 0x296F92F), (int)((long)335131325 ^ (long)319180098));
        this.drawString(this.fontRenderer, this.Field14720, this.Field14700 + ((int)1781741810L ^ 0x6A3338FD), this.Field14701 + ((int)((long)1138562032 ^ (long)1138562045) << 1), (int)((long)-924985905 ^ (long)-937285072));
        this.drawString(this.fontRenderer, Integer.toString(sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8124.Field7897), this.Field14700 + (int)((long)-802071413 ^ (long)-802071540), this.Field14701 + ((int)((long)858130416 ^ (long)858130429) << 1), (int)((long)318351175 ^ (long)302405816));
        super.drawScreen(n, n2, f);
    }

    private String Method5742() {
        if (this.Field14716 != null) {
            if (this.Field14716.hasNext()) return (String)this.Field14716.next();
            this.Field14716 = MWKsjf2F7eDKYSgsSUOF8imukA0mof8z.Field8593.keySet().iterator();
            return (String)this.Field14716.next();
        }
        if (!Field14723 && MWKsjf2F7eDKYSgsSUOF8imukA0mof8z.Field8593.size() <= 0) {
            throw new AssertionError((Object)"No formats are defined!");
        }
        if (!Field14723 && !MWKsjf2F7eDKYSgsSUOF8imukA0mof8z.Field8593.containsKey(MWKsjf2F7eDKYSgsSUOF8imukA0mof8z.Field8594)) {
            throw new AssertionError((Object)"The default format does not exist!");
        }
        this.Field14716 = MWKsjf2F7eDKYSgsSUOF8imukA0mof8z.Field8593.keySet().iterator();
        while (!((String)this.Field14716.next()).equals(MWKsjf2F7eDKYSgsSUOF8imukA0mof8z.Field8594)) {
        }
        return MWKsjf2F7eDKYSgsSUOF8imukA0mof8z.Field8594;
    }

    private static String Method5743(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-2079627634 ^ (long)-2079627634);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1539843038 ^ (long)-1539842851);
            int n2 = (int)1568038155L ^ 0x5D765D36;
            cArray2[n] = (char)(cArray[n] ^ ((int)2096501239L ^ 0x7CF6699E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

