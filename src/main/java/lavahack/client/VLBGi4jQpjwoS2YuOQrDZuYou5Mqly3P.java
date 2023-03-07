//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.Regex
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.GuiTextField
 *  org.lwjgl.input.Keyboard
 */
package lavahack.client;

import java.io.IOException;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import lavahack.client.XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.input.Keyboard;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J \u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0014J \u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eH\u0014J\b\u0010\u0019\u001a\u00020\tH\u0016J\b\u0010\u001a\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2={"Lcom/kisman/cc/features/pingbypass/gui/GuiAddPingBypass;", "Lnet/minecraft/client/gui/GuiScreen;", "parentScreenIn", "(Lnet/minecraft/client/gui/GuiScreen;)V", "parentScreen", "serverIPField", "Lnet/minecraft/client/gui/GuiTextField;", "serverPortField", "actionPerformed", "", "button", "Lnet/minecraft/client/gui/GuiButton;", "drawScreen", "mouseX", "", "mouseY", "partialTicks", "", "initGui", "keyTyped", "typedChar", "", "keyCode", "mouseClicked", "mouseButton", "onGuiClosed", "updateScreen", "kisman.cc"})
public final class VLBGi4jQpjwoS2YuOQrDZuYou5Mqly3P
extends GuiScreen {
    private final GuiScreen Field10468;
    private GuiTextField Field10469;
    private GuiTextField Field10470;
    private String Field10471 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void updateScreen() {
        GuiTextField guiTextField = this.Field10470;
        if (guiTextField != null) {
            guiTextField.updateCursorCounter();
        }
        GuiTextField guiTextField2 = this.Field10469;
        if (guiTextField2 == null) return;
        guiTextField2.updateCursorCounter();
    }

    public void initGui() {
        Keyboard.enableRepeatEvents(((int)-376192550L ^ 0xE993C1DB) != 0);
        this.buttonList.clear();
        this.buttonList.add(new GuiButton((int)((long)1066678329 ^ (long)1066678329), this.width / (((int)1057166899L ^ 0x3F031632) << 1) - (((int)-506870301L ^ 0xE1C9C5FA) << 2), this.height / ((int)((long)-1499559129 ^ (long)-1499559130) << 2) + (((int)-504206683L ^ 0xE1F26AA6) << 5) + ((int)((long)-655124549 ^ (long)-655124558) << 1), "Done"));
        this.buttonList.add(new GuiButton((int)((long)-379912569 ^ (long)-379912570), this.width / ((int)((long)-1258856070 ^ (long)-1258856069) << 1) - (((int)-1252335829L ^ 0xB55ADF32) << 2), this.height / (((int)-1486589180L ^ 0xA7647305) << 2) + ((int)((long)-1494897925 ^ (long)-1494897932) << 3) + (((int)698133081L ^ 0x299CAA50) << 1), "Cancel"));
        GuiTextField guiTextField = this.Field10470 = new GuiTextField((int)((long)768550264 ^ (long)768550264), this.fontRenderer, this.width / (((int)-448245252L ^ 0xE54851FD) << 1) - ((int)((long)-177796719 ^ (long)-177796728) << 2), (int)((long)613222936 ^ (long)613222969) << 1, ((int)-1536444471L ^ 0xA46BB7D0) << 3, (int)((long)-1797854142 ^ (long)-1797854137) << 2);
        if (guiTextField == null) {
            Intrinsics.throwNpe();
        }
        guiTextField.setFocused(((int)-1309036782L ^ 0xB1F9AF13) != 0);
        GuiTextField guiTextField2 = this.Field10470;
        if (guiTextField2 == null) {
            Intrinsics.throwNpe();
        }
        guiTextField2.setText(XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Field14381.Method5538());
        GuiTextField guiTextField3 = this.Field10469 = new GuiTextField((int)785678896L ^ 0x2ED48231, this.fontRenderer, this.width / ((int)((long)2071627963 ^ (long)2071627962) << 1) - (((int)-1594532585L ^ 0xA0F55D0E) << 2), ((int)-1074949817L ^ 0xBFED9172) << 1, ((int)-1810262383L ^ 0x94199688) << 3, ((int)465368621L ^ 0x1BBCF628) << 2);
        if (guiTextField3 == null) {
            Intrinsics.throwNpe();
        }
        guiTextField3.setMaxStringLength(((int)-1836536961L ^ 0x9288AB7E) << 7);
        GuiTextField guiTextField4 = this.Field10469;
        if (guiTextField4 == null) {
            Intrinsics.throwNpe();
        }
        guiTextField4.setText(XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Field14381.Method5540());
        GuiButton guiButton = (GuiButton)this.buttonList.get((int)-1145433800L ^ 0xBBBA1138);
        GuiTextField guiTextField5 = this.Field10469;
        if (guiTextField5 == null) {
            Intrinsics.throwNpe();
        }
        String string = guiTextField5.getText();
        Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"serverPortField!!.text");
        CharSequence charSequence = string;
        GuiButton guiButton2 = guiButton;
        int n = (int)((long)-541660158 ^ (long)-541660158);
        int n2 = charSequence.length() > 0 ? (int)((long)-308179877 ^ (long)-308179878) : (int)-1600418831L ^ 0xA09B8BF1;
        guiButton2.enabled = (int)((long)1462486718 ^ (long)1462486718);
    }

    public void onGuiClosed() {
        Keyboard.enableRepeatEvents(((int)-1884716451L ^ 0x8FA9825D) != 0);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void keyTyped(char var1_1, int var2_2) throws IOException {
        v0 = this.Field10470;
        if (v0 != null) {
            v0.textboxKeyTyped(var1_1, var2_2);
        }
        v1 = this.Field10469;
        if (v1 != null) {
            v1.textboxKeyTyped(var1_1, var2_2);
        }
        if (var2_2 == (int)((long)586531545 ^ (long)586531542)) {
            v2 = this.Field10470;
            if (v2 != null) {
                v3 = this.Field10470;
                v4 = v3 != null ? Boolean.valueOf(v3.isFocused()) : null;
                if (v4 == null) {
                    Intrinsics.throwNpe();
                }
                v2.setFocused((boolean)(v4 == false ? (int)-1871871455L ^ -1871871456 : (int)-359082265L ^ -359082265));
            }
            v5 = this.Field10469;
            if (v5 != null) {
                v6 = this.Field10469;
                v7 = v6 != null ? Boolean.valueOf(v6.isFocused()) : null;
                if (v7 == null) {
                    Intrinsics.throwNpe();
                }
                v5.setFocused((boolean)(v7 == false ? (int)((long)-751865915 ^ (long)-751865916) : (int)1532461384L ^ 1532461384));
            }
        }
        if (var2_2 == ((int)307007806L ^ 307007801) << 2 || var2_2 == (int)((long)391107208 ^ (long)391107247) << 2) {
            v8 = this.buttonList.get((int)((long)-1474142137 ^ (long)-1474142137));
            Intrinsics.checkExpressionValueIsNotNull(v8, (String)"buttonList[0]");
            this.actionPerformed((GuiButton)v8);
        }
        if (var2_2 == ((int)-1023177881L ^ -1023177882)) {
            this.mc.displayGuiScreen(this.Field10468);
        }
        v9 = (GuiButton)this.buttonList.get((int)((long)355354169 ^ (long)355354169));
        v10 /* !! */  = this.Field10469;
        if (v10 /* !! */  != null && (v10 /* !! */  = v10 /* !! */ .getText()) != null) {
            var3_3 = (CharSequence)v10 /* !! */ ;
            var10_4 = v9;
            var4_5 = (int)-1095003251L ^ -1095003251;
            var11_7 = var3_3.length() > 0 ? (int)((long)604370960 ^ (long)604370961) : (int)-1529170038L ^ -1529170038;
            v9 = var10_4;
            v11 = (boolean)var11_7;
        } else {
            v11 = null;
        }
        if (v11 == null) {
            Intrinsics.throwNpe();
        }
        if (!v11.booleanValue()) ** GOTO lbl-1000
        v12 = this.Field10469;
        if (v12 == null || (v12 = v12.getText()) == null) ** GOTO lbl-1000
        var3_3 = (CharSequence)v12;
        var4_6 = ":";
        var10_4 = v9;
        var5_9 = (int)1684034992L ^ 1684034992;
        var11_8 = new Regex(var4_6);
        var4_6 = var11_8;
        var5_9 = (int)-1858113664L ^ -1858113664;
        var6_12 = (int)((long)-756184228 ^ (long)-756184228);
        var11_8 = var4_6.split((CharSequence)var3_3, var5_9);
        v9 = var10_4;
        v12 = var11_8;
        if (v12 == null) ** GOTO lbl-1000
        var3_3 = v12;
        var10_4 = v9;
        var4_5 = (int)((long)-2008432173 ^ (long)-2008432173);
        if (!var3_3.isEmpty() && (var5_10 = var3_3.listIterator(var3_3.size())).hasPrevious()) {
            var6_13 = (String)var5_10.previous();
            var7_15 = (int)((long)-610853178 ^ (long)-610853178);
            var8_16 = var6_13;
            var9_17 = (int)1349245312L ^ 1349245312;
            v13 = var8_16.length() == 0 ? (int)-1897709592L ^ -1897709591 : (int)-943971241L ^ -943971241;
            v14 = CollectionsKt.take((Iterable)((Iterable)var3_3), (int)(var5_10.nextIndex() + (int)((long)1175037151 ^ (long)1175037150)));
        } else {
            v14 = CollectionsKt.emptyList();
        }
        var11_8 = v14;
        v9 = var10_4;
        v12 = var11_8;
        if (v12 == null) ** GOTO lbl-1000
        var3_3 = (Collection)v12;
        var10_4 = v9;
        var4_5 = (int)((long)-1141230398 ^ (long)-1141230398);
        var5_11 = var3_3;
        v15 = var5_11.toArray(new String[(int)1942776113L ^ 1942776113]);
        if (v15 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        var11_8 = v15;
        v9 = var10_4;
        v12 = var11_8;
        if (var11_8 != null) {
            var3_3 = v12;
            var10_4 = v9;
            var4_5 = (int)((long)1933494794 ^ (long)1933494794);
            var5_11 = var3_3;
            var6_14 = (int)81876161L ^ 81876161;
            v16 = var5_11.length == 0 ? (int)1868065801L ^ 1868065800 : (int)-5423825L ^ -5423825;
            var11_7 = (int)((long)-1556730341 ^ (long)-1556730342);
            v9 = var10_4;
            v17 = (boolean)var11_7;
        } else lbl-1000:
        // 4 sources

        {
            v17 = null;
        }
        if (v17 == null) {
            Intrinsics.throwNpe();
        }
        if (!v17.booleanValue()) ** GOTO lbl-1000
        v18 /* !! */  = this.Field10470;
        if (v18 /* !! */  != null && (v18 /* !! */  = v18 /* !! */ .getText()) != null) {
            var3_3 = (CharSequence)v18 /* !! */ ;
            var10_4 = v9;
            var4_5 = (int)((long)-865406713 ^ (long)-865406713);
            var11_7 = var3_3.length() > 0 ? (int)((long)1106617648 ^ (long)1106617649) : (int)-909214500L ^ -909214500;
            v9 = var10_4;
            v19 = (boolean)var11_7;
        } else {
            v19 = null;
        }
        if (v19 == null) {
            Intrinsics.throwNpe();
        }
        if (v19.booleanValue()) {
            v20 = (int)((long)738122141 ^ (long)738122140);
        } else lbl-1000:
        // 3 sources

        {
            v20 = (int)((long)2005298412 ^ (long)2005298412);
        }
        v9.enabled = v20;
    }

    protected void actionPerformed(@NotNull @NotNull GuiButton guiButton) throws IOException {
        Intrinsics.checkParameterIsNotNull((Object)guiButton, (String)"button");
        if (!guiButton.enabled) return;
        if (guiButton.id == ((int)1138574865L ^ 0x43DD4610)) {
            this.Field10468.confirmClicked(((int)-1690809980L ^ 0x9B384984) != 0, (int)((long)-2108356456 ^ (long)-2108355167));
            return;
        }
        if (guiButton.id != 0) return;
        GuiTextField guiTextField = this.Field10470;
        String string = guiTextField != null ? guiTextField.getText() : null;
        if (string == null) {
            Intrinsics.throwNpe();
        }
        XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Field14381.Method5539(string);
        GuiTextField guiTextField2 = this.Field10469;
        String string2 = guiTextField2 != null ? guiTextField2.getText() : null;
        if (string2 == null) {
            Intrinsics.throwNpe();
        }
        XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Field14381.Method5541(string2);
        this.Field10468.confirmClicked((boolean)((long)-326683142 ^ (long)-326683141), (int)-1183021306L ^ 0xB97C823F);
    }

    protected void mouseClicked(int n, int n2, int n3) throws IOException {
        super.mouseClicked(n, n2, n3);
        GuiTextField guiTextField = this.Field10469;
        if (guiTextField != null) {
            guiTextField.mouseClicked(n, n2, n3);
        }
        GuiTextField guiTextField2 = this.Field10470;
        if (guiTextField2 == null) return;
        guiTextField2.mouseClicked(n, n2, n3);
    }

    public void drawScreen(int n, int n2, float f) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRenderer, "Edit PingBypass", this.width / (((int)246265495L ^ 0xEADB696) << 1), (int)1882437725L ^ 0x7033B84C, (int)-1564247531L ^ 0xA23C85EA);
        this.drawString(this.fontRenderer, "Proxy-IP", this.width / (((int)-11727313L ^ 0xFF4D0E2E) << 1) - ((int)((long)-1837006508 ^ (long)-1837006515) << 2), (int)-934429491L ^ 0xC84DBCF8, ((int)1507727744L ^ 0x59DB1C85) << 5);
        this.drawString(this.fontRenderer, "Proxy-Port", this.width / ((int)((long)-245019214 ^ (long)-245019213) << 1) - ((int)((long)-1030692173 ^ (long)-1030692182) << 2), (int)((long)-1817030036 ^ (long)-1817030077) << 1, ((int)688587357L ^ 0x290E0758) << 5);
        GuiTextField guiTextField = this.Field10470;
        if (guiTextField != null) {
            guiTextField.drawTextBox();
        }
        GuiTextField guiTextField2 = this.Field10469;
        if (guiTextField2 != null) {
            guiTextField2.drawTextBox();
        }
        super.drawScreen(n, n2, f);
    }

    public VLBGi4jQpjwoS2YuOQrDZuYou5Mqly3P(@NotNull @NotNull GuiScreen guiScreen) {
        Intrinsics.checkParameterIsNotNull((Object)guiScreen, (String)"parentScreenIn");
        this.Field10468 = guiScreen;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1412894451 ^ (long)-1412894451);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1727915747 ^ (long)-1727915550);
            int n2 = (int)((long)-886381061 ^ (long)-886381254);
            cArray2[n] = (char)(cArray[n] ^ (((int)-1144232042L ^ 0xBBCC791B) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

