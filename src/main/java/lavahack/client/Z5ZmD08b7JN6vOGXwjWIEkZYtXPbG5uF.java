//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.client.config.GuiUnicodeGlyphButton
 */
package lavahack.client;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Formatter;
import java.util.List;
import lavahack.client.Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo;
import lavahack.client.HyOidlM2EWerWVgxoxaeB4rTjpYDK78s;
import lavahack.client.OP4La13R7rceTBm7QSP7XXXyRxZD1Op3;
import lavahack.client.QnfEmKWvlwRNiRsFVIMqQU1HcNHc8CBP;
import lavahack.client.U9QtH6iFMiJiCFrc8skq3wmPi8s20caF;
import lavahack.client.Z59nFS7fzGt9MllssMcgOsEYj1a2guaH;
import lavahack.client.sYSQwf2xD3nukbcGapT2KmEMESaueLHM;
import lavahack.client.vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7;
import lavahack.client.vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.config.GuiUnicodeGlyphButton;
import org.apache.commons.io.IOUtils;

public class Z5ZmD08b7JN6vOGXwjWIEkZYtXPbG5uF
extends QnfEmKWvlwRNiRsFVIMqQU1HcNHc8CBP {
    private HyOidlM2EWerWVgxoxaeB4rTjpYDK78s Field10146;
    private U9QtH6iFMiJiCFrc8skq3wmPi8s20caF Field10147 = U9QtH6iFMiJiCFrc8skq3wmPi8s20caF.Method4362(Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7992);
    private GuiUnicodeGlyphButton Field10148 = null;
    private GuiButton Field10149 = null;
    private GuiButton Field10150 = null;
    private final String Field10151 = I18n.format((String)"schematica.gui.materialname", (Object[])new Object[(int)((long)1169959361 ^ (long)1169959361)]);
    private final String Field10152 = I18n.format((String)"schematica.gui.materialamount", (Object[])new Object[(int)993108802L ^ 0x3B31A342]);
    protected final List Field10153;
    private int Field10154;

    public Z5ZmD08b7JN6vOGXwjWIEkZYtXPbG5uF(GuiScreen guiScreen) {
        super(guiScreen);
        Minecraft minecraft = Minecraft.getMinecraft();
        OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 = sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8122;
        this.Field10153 = new vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7().Method5398((EntityPlayer)minecraft.player, oP4La13R7rceTBm7QSP7XXXyRxZD1Op3, (World)minecraft.world);
        this.Field10147.Method4360(this.Field10153);
    }

    @Override
    public void initGui() {
        int n = (int)((long)1291819537 ^ (long)1291819537);
        this.Field10148 = new GuiUnicodeGlyphButton(++n, this.width / (((int)-1809161366L ^ 0x942A636B) << 1) - ((int)((long)1680762811 ^ (long)1680762870) << 1), this.height - (((int)81779081L ^ 0x4DFD986) << 1), ((int)507125196L ^ 0x1E3A1DD5) << 2, ((int)1202684839L ^ 0x47AF83A2) << 2, " " + I18n.format((String)("schematica.gui.material" + this.Field10147.Field12825), (Object[])new Object[(int)-2026291713L ^ 0x87393DFF]), this.Field10147.Field12826, 2.0f);
        this.buttonList.add(this.Field10148);
        this.Field10149 = new GuiButton(++n, this.width / ((int)((long)107513764 ^ (long)107513765) << 1) - (((int)-966555421L ^ 0xC66388FA) << 1), this.height - ((int)((long)-2062215598 ^ (long)-2062215587) << 1), (int)((long)-1342114300 ^ (long)-1342114275) << 2, (int)((long)976524766 ^ (long)976524763) << 2, I18n.format((String)"schematica.gui.materialdump", (Object[])new Object[(int)-1714408345L ^ 0x99D03467]));
        this.buttonList.add(this.Field10149);
        this.Field10150 = new GuiButton(++n, this.width / (((int)-724354323L ^ 0xD4D33AEC) << 1) + (((int)-960351302L ^ 0xC6C233A1) << 1), this.height - ((int)((long)-1634181199 ^ (long)-1634181186) << 1), ((int)-1259590635L ^ 0xB4EC2C0C) << 2, ((int)-1010887609L ^ 0xC3BF1442) << 2, I18n.format((String)"schematica.gui.done", (Object[])new Object[(int)-1170569594L ^ 0xBA3A8686]));
        this.buttonList.add(this.Field10150);
        this.Field10146 = new HyOidlM2EWerWVgxoxaeB4rTjpYDK78s(this);
    }

    public void Method2353() throws IOException {
        super.handleMouseInput();
        this.Field10146.handleMouseInput();
    }

    protected void Method2354(GuiButton guiButton) {
        if (!guiButton.enabled) return;
        if (guiButton.id == this.Field10148.id) {
            this.Field10147 = this.Field10147.Method4361();
            this.Field10147.Method4360(this.Field10153);
            this.Field10148.displayString = " " + I18n.format((String)("schematica.gui.material" + this.Field10147.Field12825), (Object[])new Object[(int)1892714741L ^ 0x70D088F5]);
            this.Field10148.glyph = this.Field10147.Field12826;
            Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field8015.set(String.valueOf((Object)this.Field10147));
            Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Method253();
            return;
        }
        if (guiButton.id == this.Field10149.id) {
            this.Method2356(this.Field10153);
            return;
        }
        if (guiButton.id == this.Field10150.id) {
            this.mc.displayGuiScreen(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
            return;
        }
        this.Field10146.actionPerformed(guiButton);
    }

    public void Method2355(ItemStack itemStack, int n, int n2) {
        super.renderToolTip(itemStack, n, n2);
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
        this.Field10146.drawScreen(n, n2, f);
        this.drawString(this.fontRenderer, this.Field10151, this.width / ((int)((long)1345812377 ^ (long)1345812376) << 1) - (((int)543984261L ^ 0x206C8A9E) << 2), ((int)1716871471L ^ 0x6655612E) << 2, (int)2094737486L ^ 0x7C24D7B1);
        this.drawString(this.fontRenderer, this.Field10152, this.width / (((int)1404410844L ^ 0x53B59BDD) << 1) + ((int)((long)-2095954435 ^ (long)-2095954458) << 2) - this.fontRenderer.getStringWidth(this.Field10152), ((int)-1875259269L ^ 0x9039D07A) << 2, (int)-768812459L ^ 0xD2D325AA);
        super.drawScreen(n, n2, f);
    }

    private void Method2356(List list) {
        Object object3;
        Object object22;
        if (list.size() <= 0) {
            return;
        }
        int n = (int)-1912760774L ^ 0x8DFD963A;
        int n2 = (int)((long)1667762978 ^ (long)1667762978);
        for (Object object22 : list) {
            n = Math.max(n, ((vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object22).Method7229().length());
            n2 = Math.max(n2, ((vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object22).Field16999);
        }
        int n3 = String.valueOf(n2).length();
        object22 = "%-" + n + "s";
        String string = "%" + n3 + "d";
        StringBuilder stringBuilder = new StringBuilder((n + (int)((long)-169621855 ^ (long)-169621856) + n3) * list.size());
        Formatter formatter = new Formatter(stringBuilder);
        for (Object object3 : list) {
            Object[] objectArray = new Object[(int)2108234370L ^ 0x7DA91A83];
            objectArray[(int)1237378419L ^ 0x49C0E573] = ((vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object3).Method7229();
            formatter.format((String)object22, objectArray);
            stringBuilder.append(" ");
            Object[] objectArray2 = new Object[(int)-852884227L ^ 0xCD2A04FC];
            objectArray2[(int)((long)601392815 ^ (long)601392815)] = ((vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object3).Field16999;
            formatter.format(string, objectArray2);
            stringBuilder.append(System.lineSeparator());
        }
        File file = Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo.Field17565.Method412("dumps");
        object3 = new FileOutputStream(new File(file, "schematica-materials.txt"));
        Object var11_12 = null;
        IOUtils.write(stringBuilder.toString(), (OutputStream)object3, Charset.forName("utf-8"));
        if (object3 == null) return;
        if (var11_12 != null) {
            ((FileOutputStream)object3).close();
            return;
        }
        ((FileOutputStream)object3).close();
    }

    private static String Method2357(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1686259814 ^ (long)1686259814);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1089623917L ^ 0x40F25792);
            int n2 = (int)((long)1995795541 ^ (long)1995795650);
            cArray2[n] = (char)(cArray[n] ^ (((int)-1394614137L ^ 0xACDFF05E) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

