//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.lwjgl.input.*;
import net.minecraft.client.gui.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;
import kotlin.collections.*;
import kotlin.*;
import java.util.*;
import java.io.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001?\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J \u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0014J \u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eH\u0014J\b\u0010\u0019\u001a\u00020\tH\u0016J\b\u0010\u001a\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004?\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e?\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e?\u0006\u0002\n\u0000?\u0006\u001b" }, d2 = { "Lcom/kisman/cc/features/pingbypass/gui/GuiAddPingBypass;", "Lnet/minecraft/client/gui/GuiScreen;", "parentScreenIn", "(Lnet/minecraft/client/gui/GuiScreen;)V", "parentScreen", "serverIPField", "Lnet/minecraft/client/gui/GuiTextField;", "serverPortField", "actionPerformed", "", "button", "Lnet/minecraft/client/gui/GuiButton;", "drawScreen", "mouseX", "", "mouseY", "partialTicks", "", "initGui", "keyTyped", "typedChar", "", "keyCode", "mouseClicked", "mouseButton", "onGuiClosed", "updateScreen", "kisman.cc" })
public final class Class579 extends GuiScreen
{
    private final GuiScreen Field10468;
    private GuiTextField Field10469;
    private GuiTextField Field10470;
    private String Field10471 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void updateScreen() {
        final GuiTextField field10470 = this.Field10470;
        if (field10470 != null) {
            field10470.updateCursorCounter();
        }
        final GuiTextField field10471 = this.Field10469;
        if (field10471 != null) {
            field10471.updateCursorCounter();
        }
    }
    
    public void initGui() {
        Keyboard.enableRepeatEvents(true);
        this.buttonList.clear();
        this.buttonList.add(new GuiButton(0, this.width / 2 - 100, this.height / 4 + 96 + 18, "Done"));
        this.buttonList.add(new GuiButton(1, this.width / 2 - 100, this.height / 4 + 120 + 18, "Cancel"));
        this.Field10470 = new GuiTextField(0, this.fontRenderer, this.width / 2 - 100, 66, 200, 20);
        final GuiTextField field10470 = this.Field10470;
        if (field10470 == null) {
            Intrinsics.throwNpe();
        }
        field10470.setFocused(true);
        final GuiTextField field10471 = this.Field10470;
        if (field10471 == null) {
            Intrinsics.throwNpe();
        }
        field10471.setText(Class1409.Field14381.Method5538());
        this.Field10469 = new GuiTextField(1, this.fontRenderer, this.width / 2 - 100, 106, 200, 20);
        final GuiTextField field10472 = this.Field10469;
        if (field10472 == null) {
            Intrinsics.throwNpe();
        }
        field10472.setMaxStringLength(128);
        final GuiTextField field10473 = this.Field10469;
        if (field10473 == null) {
            Intrinsics.throwNpe();
        }
        field10473.setText(Class1409.Field14381.Method5540());
        final GuiButton guiButton = this.buttonList.get(0);
        final GuiTextField field10474 = this.Field10469;
        if (field10474 == null) {
            Intrinsics.throwNpe();
        }
        final String getText = field10474.getText();
        Intrinsics.checkExpressionValueIsNotNull((Object)getText, "serverPortField!!.text");
        final String s = getText;
        final GuiButton guiButton2 = guiButton;
        final boolean b = s.length() > 0;
        guiButton2.enabled = false;
    }
    
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents(false);
    }
    
    protected void keyTyped(final char c, final int n) throws IOException {
        final GuiTextField field10470 = this.Field10470;
        if (field10470 != null) {
            field10470.textboxKeyTyped(c, n);
        }
        final GuiTextField field10471 = this.Field10469;
        if (field10471 != null) {
            field10471.textboxKeyTyped(c, n);
        }
        if (n == 15) {
            final GuiTextField field10472 = this.Field10470;
            if (field10472 != null) {
                final GuiTextField field10473 = this.Field10470;
                final Boolean b = (field10473 != null) ? Boolean.valueOf(field10473.isFocused()) : null;
                if (b == null) {
                    Intrinsics.throwNpe();
                }
                field10472.setFocused(!b);
            }
            final GuiTextField field10474 = this.Field10469;
            if (field10474 != null) {
                final GuiTextField field10475 = this.Field10469;
                final Boolean b2 = (field10475 != null) ? Boolean.valueOf(field10475.isFocused()) : null;
                if (b2 == null) {
                    Intrinsics.throwNpe();
                }
                field10474.setFocused(!b2);
            }
        }
        if (n == 28 || n == 156) {
            final GuiButton value = this.buttonList.get(0);
            Intrinsics.checkExpressionValueIsNotNull((Object)value, "buttonList[0]");
            this.actionPerformed(value);
        }
        if (n == 1) {
            this.mc.displayGuiScreen(this.Field10468);
        }
        final GuiButton guiButton = this.buttonList.get(0);
        final GuiTextField field10476 = this.Field10469;
        Boolean value2 = null;
        Boolean b3 = null;
        Label_0263: {
            if (field10476 != null) {
                final String getText = field10476.getText();
                if (getText != null) {
                    b3 = (value2 = (getText.length() > 0));
                    break Label_0263;
                }
            }
            b3 = (value2 = null);
        }
        if (value2 == null) {
            Intrinsics.throwNpe();
        }
        GuiButton guiButton7 = null;
        boolean enabled = false;
        Label_0634: {
            if (b3) {
                final GuiTextField field10477 = this.Field10469;
                Boolean value3 = null;
                Boolean b4 = null;
                Label_0551: {
                    if (field10477 != null) {
                        final String getText2 = field10477.getText();
                        if (getText2 != null) {
                            final String s = getText2;
                            final String s2 = ":";
                            final GuiButton guiButton2 = guiButton;
                            final Regex regex = new Regex(s2);
                            final GuiButton guiButton3 = guiButton2;
                            final Regex regex2 = regex;
                            final GuiButton guiButton4 = guiButton3;
                            final List split = regex2.split((CharSequence)s, 0);
                            final GuiButton guiButton5 = guiButton4;
                            final List list = split;
                            if (list != null) {
                                final List<String> list2 = (List<String>)list;
                                final GuiButton guiButton6 = guiButton5;
                                List list3 = null;
                                Label_0449: {
                                    if (!list2.isEmpty()) {
                                        final ListIterator<String> listIterator = list2.listIterator(list2.size());
                                        if (listIterator.hasPrevious()) {
                                            if (listIterator.previous().length() == 0) {}
                                            list3 = CollectionsKt.take((Iterable)list2, listIterator.nextIndex() + 1);
                                            break Label_0449;
                                        }
                                    }
                                    list3 = CollectionsKt.emptyList();
                                }
                                final List list4 = list3;
                                guiButton7 = guiButton6;
                                final List list5 = list4;
                                if (list5 != null) {
                                    final Object[] array = list5.toArray(new String[0]);
                                    if (array == null) {
                                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                                    }
                                    final String[] array2 = (String[])array;
                                    if (array2 != null) {
                                        if (array2.length == 0) {}
                                        b4 = (value3 = (boolean)(1 != 0));
                                        break Label_0551;
                                    }
                                }
                            }
                        }
                    }
                    b4 = (value3 = null);
                }
                if (value3 == null) {
                    Intrinsics.throwNpe();
                }
                if (b4) {
                    final GuiTextField field10478 = this.Field10470;
                    Boolean value4 = null;
                    Boolean b5 = null;
                    Label_0616: {
                        if (field10478 != null) {
                            final String getText3 = field10478.getText();
                            if (getText3 != null) {
                                b5 = (value4 = (getText3.length() > 0));
                                break Label_0616;
                            }
                        }
                        b5 = (value4 = null);
                    }
                    if (value4 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (b5) {
                        enabled = true;
                        break Label_0634;
                    }
                }
            }
            enabled = false;
        }
        guiButton7.enabled = enabled;
    }
    
    protected void actionPerformed(@NotNull @NotNull final GuiButton guiButton) throws IOException {
        Intrinsics.checkParameterIsNotNull((Object)guiButton, "button");
        if (guiButton.enabled) {
            if (guiButton.id == 1) {
                this.Field10468.confirmClicked(false, 1337);
            }
            else if (guiButton.id == 0) {
                final Class1409 field14381 = Class1409.Field14381;
                final GuiTextField field14382 = this.Field10470;
                final String s = (field14382 != null) ? field14382.getText() : null;
                if (s == null) {
                    Intrinsics.throwNpe();
                }
                field14381.Method5539(s);
                final Class1409 field14383 = Class1409.Field14381;
                final GuiTextField field14384 = this.Field10469;
                final String s2 = (field14384 != null) ? field14384.getText() : null;
                if (s2 == null) {
                    Intrinsics.throwNpe();
                }
                field14383.Method5541(s2);
                this.Field10468.confirmClicked(true, 1337);
            }
        }
    }
    
    protected void mouseClicked(final int n, final int n2, final int n3) throws IOException {
        super.mouseClicked(n, n2, n3);
        final GuiTextField field10469 = this.Field10469;
        if (field10469 != null) {
            field10469.mouseClicked(n, n2, n3);
        }
        final GuiTextField field10470 = this.Field10470;
        if (field10470 != null) {
            field10470.mouseClicked(n, n2, n3);
        }
    }
    
    public void drawScreen(final int n, final int n2, final float n3) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRenderer, "Edit PingBypass", this.width / 2, 17, 16777215);
        this.drawString(this.fontRenderer, "Proxy-IP", this.width / 2 - 100, 53, 10526880);
        this.drawString(this.fontRenderer, "Proxy-Port", this.width / 2 - 100, 94, 10526880);
        final GuiTextField field10470 = this.Field10470;
        if (field10470 != null) {
            field10470.drawTextBox();
        }
        final GuiTextField field10471 = this.Field10469;
        if (field10471 != null) {
            field10471.drawTextBox();
        }
        super.drawScreen(n, n2, n3);
    }
    
    public Class579(@NotNull @NotNull final GuiScreen field10468) {
        Intrinsics.checkParameterIsNotNull((Object)field10468, "parentScreenIn");
        this.Field10468 = field10468;
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7A34 ^ 0xC1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
