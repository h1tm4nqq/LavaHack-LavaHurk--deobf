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
import lavahack.client.Class1409;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.input.Keyboard;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J \u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0014J \u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eH\u0014J\b\u0010\u0019\u001a\u00020\tH\u0016J\b\u0010\u001a\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2={"Lcom/kisman/cc/features/pingbypass/gui/GuiAddPingBypass;", "Lnet/minecraft/client/gui/GuiScreen;", "parentScreenIn", "(Lnet/minecraft/client/gui/GuiScreen;)V", "parentScreen", "serverIPField", "Lnet/minecraft/client/gui/GuiTextField;", "serverPortField", "actionPerformed", "", "button", "Lnet/minecraft/client/gui/GuiButton;", "drawScreen", "mouseX", "", "mouseY", "partialTicks", "", "initGui", "keyTyped", "typedChar", "", "keyCode", "mouseClicked", "mouseButton", "onGuiClosed", "updateScreen", "kisman.cc"})
public final class Class579
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
        Keyboard.enableRepeatEvents((boolean)true);
        this.buttonList.clear();
        this.buttonList.add(new GuiButton(0, this.width / 2 - 100, this.height / 4 + 96 + 18, "Done"));
        this.buttonList.add(new GuiButton(1, this.width / 2 - 100, this.height / 4 + 120 + 18, "Cancel"));
        GuiTextField guiTextField = this.Field10470 = new GuiTextField(0, this.fontRenderer, this.width / 2 - 100, 66, 200, 20);
        if (guiTextField == null) {
            Intrinsics.throwNpe();
        }
        guiTextField.setFocused(true);
        GuiTextField guiTextField2 = this.Field10470;
        if (guiTextField2 == null) {
            Intrinsics.throwNpe();
        }
        guiTextField2.setText(Class1409.Field14381.Method5538());
        GuiTextField guiTextField3 = this.Field10469 = new GuiTextField(1, this.fontRenderer, this.width / 2 - 100, 106, 200, 20);
        if (guiTextField3 == null) {
            Intrinsics.throwNpe();
        }
        guiTextField3.setMaxStringLength(128);
        GuiTextField guiTextField4 = this.Field10469;
        if (guiTextField4 == null) {
            Intrinsics.throwNpe();
        }
        guiTextField4.setText(Class1409.Field14381.Method5540());
        GuiButton guiButton = (GuiButton)this.buttonList.get(0);
        GuiTextField guiTextField5 = this.Field10469;
        if (guiTextField5 == null) {
            Intrinsics.throwNpe();
        }
        String string = guiTextField5.getText();
        Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"serverPortField!!.text");
        CharSequence charSequence = string;
        GuiButton guiButton2 = guiButton;
        boolean bl = false;
        boolean bl2 = charSequence.length() > 0;
        guiButton2.enabled = false;
    }

    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)false);
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
        if (var2_2 == 15) {
            v2 = this.Field10470;
            if (v2 != null) {
                v3 = this.Field10470;
                v4 = v3 != null ? Boolean.valueOf(v3.isFocused()) : null;
                if (v4 == null) {
                    Intrinsics.throwNpe();
                }
                v2.setFocused(v4 == false);
            }
            v5 = this.Field10469;
            if (v5 != null) {
                v6 = this.Field10469;
                v7 = v6 != null ? Boolean.valueOf(v6.isFocused()) : null;
                if (v7 == null) {
                    Intrinsics.throwNpe();
                }
                v5.setFocused(v7 == false);
            }
        }
        if (var2_2 == 28 || var2_2 == 156) {
            v8 = this.buttonList.get(0);
            Intrinsics.checkExpressionValueIsNotNull(v8, (String)"buttonList[0]");
            this.actionPerformed((GuiButton)v8);
        }
        if (var2_2 == 1) {
            this.mc.displayGuiScreen(this.Field10468);
        }
        v9 = (GuiButton)this.buttonList.get(0);
        v10 /* !! */  = this.Field10469;
        if (v10 /* !! */  != null && (v10 /* !! */  = v10 /* !! */ .getText()) != null) {
            var3_3 = (CharSequence)v10 /* !! */ ;
            var10_4 = v9;
            var4_5 = false;
            var11_7 = var3_3.length() > 0;
            v9 = var10_4;
            v11 = var11_7;
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
        var5_9 = 0;
        var11_8 = new Regex(var4_6);
        var4_6 = var11_8;
        var5_9 = 0;
        var6_12 = false;
        var11_8 = var4_6.split((CharSequence)var3_3, var5_9);
        v9 = var10_4;
        v12 = var11_8;
        if (v12 == null) ** GOTO lbl-1000
        var3_3 = v12;
        var10_4 = v9;
        var4_5 = false;
        if (!var3_3.isEmpty() && (var5_10 = var3_3.listIterator(var3_3.size())).hasPrevious()) {
            var6_13 = (String)var5_10.previous();
            var7_15 = false;
            var8_16 = var6_13;
            var9_17 = false;
            v13 = var8_16.length() == 0;
            v14 = CollectionsKt.take((Iterable)((Iterable)var3_3), (int)(var5_10.nextIndex() + 1));
        } else {
            v14 = CollectionsKt.emptyList();
        }
        var11_8 = v14;
        v9 = var10_4;
        v12 = var11_8;
        if (v12 == null) ** GOTO lbl-1000
        var3_3 = (Collection)v12;
        var10_4 = v9;
        var4_5 = false;
        var5_11 = var3_3;
        v15 = var5_11.toArray(new String[0]);
        if (v15 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        var11_8 = v15;
        v9 = var10_4;
        v12 = var11_8;
        if (var11_8 != null) {
            var3_3 = v12;
            var10_4 = v9;
            var4_5 = false;
            var5_11 = var3_3;
            var6_14 = false;
            v16 = var5_11.length == 0;
            var11_7 = true;
            v9 = var10_4;
            v17 = var11_7;
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
            var4_5 = false;
            var11_7 = var3_3.length() > 0;
            v9 = var10_4;
            v19 = var11_7;
        } else {
            v19 = null;
        }
        if (v19 == null) {
            Intrinsics.throwNpe();
        }
        if (v19.booleanValue()) {
            v20 = true;
        } else lbl-1000:
        // 3 sources

        {
            v20 = false;
        }
        v9.enabled = v20;
    }

    protected void actionPerformed(@NotNull @NotNull GuiButton guiButton) throws IOException {
        Intrinsics.checkParameterIsNotNull((Object)guiButton, (String)"button");
        if (!guiButton.enabled) return;
        if (guiButton.id == 1) {
            this.Field10468.confirmClicked(false, 1337);
            return;
        }
        if (guiButton.id != 0) return;
        GuiTextField guiTextField = this.Field10470;
        String string = guiTextField != null ? guiTextField.getText() : null;
        if (string == null) {
            Intrinsics.throwNpe();
        }
        Class1409.Field14381.Method5539(string);
        GuiTextField guiTextField2 = this.Field10469;
        String string2 = guiTextField2 != null ? guiTextField2.getText() : null;
        if (string2 == null) {
            Intrinsics.throwNpe();
        }
        Class1409.Field14381.Method5541(string2);
        this.Field10468.confirmClicked(true, 1337);
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
        this.drawCenteredString(this.fontRenderer, "Edit PingBypass", this.width / 2, 17, 0xFFFFFF);
        this.drawString(this.fontRenderer, "Proxy-IP", this.width / 2 - 100, 53, 0xA0A0A0);
        this.drawString(this.fontRenderer, "Proxy-Port", this.width / 2 - 100, 94, 0xA0A0A0);
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

    public Class579(@NotNull @NotNull GuiScreen guiScreen) {
        Intrinsics.checkParameterIsNotNull((Object)guiScreen, (String)"parentScreenIn");
        this.Field10468 = guiScreen;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 193;
            cArray2[n] = (char)(cArray[n] ^ (0x7A34 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

