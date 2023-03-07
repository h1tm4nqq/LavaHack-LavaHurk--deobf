//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiPageButtonList$GuiResponder
 *  net.minecraft.client.gui.GuiSlider
 *  net.minecraft.client.gui.GuiSlider$FormatHelper
 *  net.minecraft.client.gui.GuiTextField
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.FlWarLswISJXvRsmaDcTKPG06y93n6g0;
import lavahack.client.I0R0do5HxnbufehLe8qF1yl2lYfOIhr9;
import lavahack.client.SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6;
import lavahack.client.SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qc9FwVpWiqRQho5VXPrDfJ5nrkFdG0Ld$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.qc9FwVpWiqRQho5VXPrDfJ5nrkFdG0Ld$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiPageButtonList;
import net.minecraft.client.gui.GuiSlider;
import net.minecraft.client.gui.GuiTextField;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002*+B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0002J \u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0019H\u0016J\u0018\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u000eH\u0014J \u0010(\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000eH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2={"Lcom/kisman/cc/gui/other/music/MusicGui;", "Lcom/kisman/cc/gui/KismanGuiScreen;", "()V", "currentSong", "", "field", "Lnet/minecraft/client/gui/GuiTextField;", "getField", "()Lnet/minecraft/client/gui/GuiTextField;", "setField", "(Lnet/minecraft/client/gui/GuiTextField;)V", "formatter", "Lcom/kisman/cc/gui/other/music/MusicGui$VolumeFormatter;", "offset", "", "getOffset", "()I", "setOffset", "(I)V", "responder", "Lcom/kisman/cc/gui/other/music/MusicGui$VolumeResponder;", "title", "width_", "y_", "actionPerformed", "", "button", "Lnet/minecraft/client/gui/GuiButton;", "addButtons", "y", "drawScreen", "mouseX", "mouseY", "ticks", "", "initGui", "keyTyped", "typedChar", "", "keyCode", "mouseClicked", "mouseButton", "VolumeFormatter", "VolumeResponder", "kisman.cc"})
public final class qc9FwVpWiqRQho5VXPrDfJ5nrkFdG0Ld
extends FlWarLswISJXvRsmaDcTKPG06y93n6g0 {
    private int Field7869 = ((int)-1581441881L ^ 0xA1BD1CBE) << 2;
    private int Field7870 = this.height / ((int)((long)-205378867 ^ (long)-205378866) << 1) + (((int)-2112979593L ^ 0x820E7D74) << 4) - ((int)((long)-1661627216 ^ (long)-1661627213) << 1);
    @NotNull
    private GuiTextField Field7871;
    private int Field7872;
    private final qc9FwVpWiqRQho5VXPrDfJ5nrkFdG0Ld$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field7873;
    private final qc9FwVpWiqRQho5VXPrDfJ5nrkFdG0Ld$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field7874;
    private String Field7875;
    private String Field7876;
    private String Field7877 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final GuiTextField Method142() {
        return this.Field7871;
    }

    public final void Method143(@NotNull @NotNull GuiTextField guiTextField) {
        Intrinsics.checkParameterIsNotNull((Object)guiTextField, (String)"<set-?>");
        this.Field7871 = guiTextField;
    }

    public final int Method144() {
        return this.Field7872;
    }

    public final void Method145(int n) {
        this.Field7872 = n;
    }

    private final void Method146(int n, int n2) {
        int n3 = this.width / (((int)-1257090839L ^ 0xB51250E8) << 1) - this.Field7869;
        this.Field7871.x = this.width / (((int)550468779L ^ 0x20CF7CAA) << 1) - this.Field7869;
        this.Field7871.setMaxStringLength((int)((long)740098597 ^ (long)740098648) << 2);
        this.Field7871.width = ((int)-1626085285L ^ 0x9F13E842) << 3;
        this.buttonList.add(new GuiButton((int)((long)78065003 ^ (long)78065002), n3, n + n2 * (((int)-433745520L ^ 0xE6259191) << 1), "Play/Stop"));
        this.buttonList.add(new GuiButton((int)((long)-1485159417 ^ (long)-1485159418) << 1, n3, n + n2 * ((int)1592412582L ^ 0x5EEA49A5), "Pause/Resume"));
        this.buttonList.add(new GuiSlider((GuiPageButtonList.GuiResponder)this.Field7873, (int)((long)-1455639230 ^ (long)-1455639231), n3, n + n2 * (((int)1380171338L ^ 0x5243BE4B) << 2), "Volume", 0.0f, Float.intBitsToFloat(0x65181720 ^ 0x27D01720), Float.intBitsToFloat((int)((long)1789011070 ^ (long)686433406)), (GuiSlider.FormatHelper)this.Field7874));
    }

    @Override
    public void initGui() {
        super.initGui();
        this.Method146(this.Field7870, this.Field7872);
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
        if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16267.Method1968() != SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13595) {
            SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6 skQeqyCOChLN1lnQfJFyi0gfpNl3LBi6 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16267;
            Intrinsics.checkExpressionValueIsNotNull((Object)skQeqyCOChLN1lnQfJFyi0gfpNl3LBi6, (String)"Kisman.instance.selectionBar");
            I0R0do5HxnbufehLe8qF1yl2lYfOIhr9.Field11206.Method2058(skQeqyCOChLN1lnQfJFyi0gfpNl3LBi6);
            return;
        }
        this.drawDefaultBackground();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16268.Method5122(n, n2);
        super.drawScreen(n, n2, f);
        this.Field7871.drawTextBox();
        GL11.glPushMatrix();
        GL11.glScaled((double)Double.longBitsToDouble(0xFDBE74144B0C91ABL ^ 0xBDBE74144B0C91ABL), (double)Double.longBitsToDouble(0x66D20A1FEA94C48EL ^ 0x26D20A1FEA94C48EL), (double)Double.longBitsToDouble(0x60EE68FC5CC2596DL ^ 0x20EE68FC5CC2596DL));
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4746("Music", (double)this.width / Double.longBitsToDouble(0x73996B0D7A5E8C78L ^ 0x33896B0D7A5E8C78L), Double.longBitsToDouble(0x750F37190BF26DEL ^ 0x4748F37190BF26DEL), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)-1863296287 ^ (long)-1863296264) << 2, (int)((long)-994339259 ^ (long)-994339236) << 2));
        GL11.glPopMatrix();
        this.Field7875 = this.Field7876 == null ? (String)null : "Playing " + this.Field7876;
        if (this.Field7875 != null) {
            FontRenderer fontRenderer = this.mc.fontRenderer;
            String string = this.Field7875;
            if (string == null) {
                Intrinsics.throwNpe();
            }
            int n3 = this.width / ((int)((long)1947153838 ^ (long)1947153839) << 1);
            FontRenderer fontRenderer2 = this.mc.fontRenderer;
            String string2 = this.Field7875;
            if (string2 == null) {
                Intrinsics.throwNpe();
            }
            fontRenderer.drawStringWithShadow(string, (float)(n3 - fontRenderer2.getStringWidth(string2) / (((int)1812123070L ^ 0x6C02CDBF) << 1)), (float)((((int)1027596816L ^ 0x3D3FE213) << 1) + this.mc.fontRenderer.FONT_HEIGHT * ((int)((long)496603761 ^ (long)496603760) << 1) + ((int)((long)-844253001 ^ (long)-844253004) << 1)), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(((int)-1720717490L ^ 0x996FEF57) << 2, ((int)1282437709L ^ 0x4C707254) << 2));
        }
        XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR.Method6303(this.Field7873.getVolume());
    }

    @Override
    protected void mouseClicked(int n, int n2, int n3) {
        super.mouseClicked(n, n2, n3);
        this.Field7871.mouseClicked(n, n2, n3);
    }

    @Override
    protected void keyTyped(char c, int n) {
        super.keyTyped(c, n);
        this.Field7871.textboxKeyTyped(c, n);
    }

    protected void Method147(@NotNull @NotNull GuiButton guiButton) {
        Intrinsics.checkParameterIsNotNull((Object)guiButton, (String)"button");
        super.actionPerformed(guiButton);
        switch (guiButton.id) {
            case 1: {
                if (XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR.Field15564) {
                    XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR.Method6302();
                    this.Field7876 = null;
                    return;
                }
                XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR.Method6297(this.Field7871.getText());
                this.Field7876 = this.Field7871.getText();
                return;
            }
            case 2: {
                if (XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR.Field15564) {
                    XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR.Method6299();
                    return;
                }
                XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR.Method6296();
                return;
            }
        }
    }

    public qc9FwVpWiqRQho5VXPrDfJ5nrkFdG0Ld() {
        this.Field7871 = new GuiTextField((int)((long)-1600270985 ^ (long)-1600271084), Minecraft.getMinecraft().fontRenderer, this.width / ((int)((long)1402258206 ^ (long)1402258207) << 1) - this.Field7869, this.Field7870, (int)((long)-1917591908 ^ (long)-1917591931) << 3, (int)((long)533706062 ^ (long)533706059) << 2);
        this.Field7872 = (int)((long)2034572516 ^ (long)2034572519) << 3;
        this.Field7873 = new qc9FwVpWiqRQho5VXPrDfJ5nrkFdG0Ld$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf();
        this.Field7874 = new qc9FwVpWiqRQho5VXPrDfJ5nrkFdG0Ld$leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    }

    private static String Method148(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)616189460L ^ 0x24BA4E14;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)279851124 ^ (long)279851147);
            int n2 = (int)((long)-86316721 ^ (long)-86316750) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)1226897599L ^ 0x4920BE3A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

