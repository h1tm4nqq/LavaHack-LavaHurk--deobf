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
import lavahack.client.Class1042;
import lavahack.client.Class1172;
import lavahack.client.Class1178;
import lavahack.client.Class1233;
import lavahack.client.Class1617;
import lavahack.client.Class1796;
import lavahack.client.Class1888;
import lavahack.client.Class217;
import lavahack.client.Class399;
import lavahack.client.Class754;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiPageButtonList;
import net.minecraft.client.gui.GuiSlider;
import net.minecraft.client.gui.GuiTextField;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002*+B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0002J \u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0019H\u0016J\u0018\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u000eH\u0014J \u0010(\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000eH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2={"Lcom/kisman/cc/gui/other/music/MusicGui;", "Lcom/kisman/cc/gui/KismanGuiScreen;", "()V", "currentSong", "", "field", "Lnet/minecraft/client/gui/GuiTextField;", "getField", "()Lnet/minecraft/client/gui/GuiTextField;", "setField", "(Lnet/minecraft/client/gui/GuiTextField;)V", "formatter", "Lcom/kisman/cc/gui/other/music/MusicGui$VolumeFormatter;", "offset", "", "getOffset", "()I", "setOffset", "(I)V", "responder", "Lcom/kisman/cc/gui/other/music/MusicGui$VolumeResponder;", "title", "width_", "y_", "actionPerformed", "", "button", "Lnet/minecraft/client/gui/GuiButton;", "addButtons", "y", "drawScreen", "mouseX", "mouseY", "ticks", "", "initGui", "keyTyped", "typedChar", "", "keyCode", "mouseClicked", "mouseButton", "VolumeFormatter", "VolumeResponder", "kisman.cc"})
public final class Class12
extends Class1888 {
    private int Field7869 = 100;
    private int Field7870 = this.height / 6 + 48 - 6;
    @NotNull
    private GuiTextField Field7871;
    private int Field7872;
    private final Class1042 Field7873;
    private final Class217 Field7874;
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
        int n3 = this.width / 2 - this.Field7869;
        this.Field7871.x = this.width / 2 - this.Field7869;
        this.Field7871.setMaxStringLength(500);
        this.Field7871.width = 200;
        this.buttonList.add(new GuiButton(1, n3, n + n2 * 2, "Play/Stop"));
        this.buttonList.add(new GuiButton(2, n3, n + n2 * 3, "Pause/Resume"));
        this.buttonList.add(new GuiSlider((GuiPageButtonList.GuiResponder)this.Field7873, 3, n3, n + n2 * 4, "Volume", 0.0f, Float.intBitsToFloat(1120403456), Float.intBitsToFloat(1112014848), (GuiSlider.FormatHelper)this.Field7874));
    }

    @Override
    public void initGui() {
        super.initGui();
        this.Method146(this.Field7870, this.Field7872);
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
        if (Class1796.Field16241.Field16267.Method1968() != Class1233.Field13595) {
            Class399 class399 = Class1796.Field16241.Field16267;
            Intrinsics.checkExpressionValueIsNotNull((Object)class399, (String)"Kisman.instance.selectionBar");
            Class754.Field11206.Method2058(class399);
            return;
        }
        this.drawDefaultBackground();
        Class1796.Field16241.Field16268.Method5122(n, n2);
        super.drawScreen(n, n2, f);
        this.Field7871.drawTextBox();
        GL11.glPushMatrix();
        GL11.glScaled((double)Double.longBitsToDouble(0x4000000000000000L), (double)Double.longBitsToDouble(0x4000000000000000L), (double)Double.longBitsToDouble(0x4000000000000000L));
        Class1178.Method4746("Music", (double)this.width / Double.longBitsToDouble(0x4010000000000000L), Double.longBitsToDouble(4618441417868443648L), Class1172.Method4709(100, 100));
        GL11.glPopMatrix();
        this.Field7875 = this.Field7876 == null ? (String)null : "Playing " + this.Field7876;
        if (this.Field7875 != null) {
            FontRenderer fontRenderer = this.mc.fontRenderer;
            String string = this.Field7875;
            if (string == null) {
                Intrinsics.throwNpe();
            }
            int n3 = this.width / 2;
            FontRenderer fontRenderer2 = this.mc.fontRenderer;
            String string2 = this.Field7875;
            if (string2 == null) {
                Intrinsics.throwNpe();
            }
            fontRenderer.drawStringWithShadow(string, (float)(n3 - fontRenderer2.getStringWidth(string2) / 2), (float)(6 + this.mc.fontRenderer.FONT_HEIGHT * 2 + 6), Class1172.Method4709(100, 100));
        }
        Class1617.Method6303(this.Field7873.getVolume());
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
                if (Class1617.Field15564) {
                    Class1617.Method6302();
                    this.Field7876 = null;
                    return;
                }
                Class1617.Method6297(this.Field7871.getText());
                this.Field7876 = this.Field7871.getText();
                return;
            }
            case 2: {
                if (Class1617.Field15564) {
                    Class1617.Method6299();
                    return;
                }
                Class1617.Method6296();
                return;
            }
        }
    }

    public Class12() {
        this.Field7871 = new GuiTextField(99, Minecraft.getMinecraft().fontRenderer, this.width / 2 - this.Field7869, this.Field7870, 200, 20);
        this.Field7872 = 24;
        this.Field7873 = new Class1042();
        this.Field7874 = new Class217();
    }

    private static String Method148(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 250;
            cArray2[n] = (char)(cArray[n] ^ (0x4685 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

