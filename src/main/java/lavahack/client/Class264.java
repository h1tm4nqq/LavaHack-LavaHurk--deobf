//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.realmsclient.gui.ChatFormatting
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.util.ChatAllowedCharacters
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
package lavahack.client;

import com.mojang.realmsclient.gui.ChatFormatting;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1090;
import lavahack.client.Class1233;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class1888;
import lavahack.client.Class254;
import lavahack.client.Class399;
import lavahack.client.Class44;
import lavahack.client.Class618;
import lavahack.client.Class662;
import lavahack.client.Class732;
import lavahack.client.Class754;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ChatAllowedCharacters;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u0005H\u0016J \u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0016J\u0016\u0010%\u001a\u00020\u00072\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0'H\u0002J\b\u0010(\u001a\u00020$H\u0016J\b\u0010)\u001a\u00020$H\u0016J\b\u0010*\u001a\u00020$H\u0016J\u0018\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0007H\u0016J \u0010/\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0007H\u0014J \u00101\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007H\u0014J\b\u00103\u001a\u00020\u001eH\u0016J\u0012\u00104\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u00106\u001a\u00020\u001e2\u0006\u00107\u001a\u00020$H\u0016J\u0010\u00108\u001a\u00020\u001e2\u0006\u00109\u001a\u00020$H\u0016J\u0010\u0010:\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020$H\u0016J\u0010\u0010;\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020$H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0011j\b\u0012\u0004\u0012\u00020\n`\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2={"Lcom/kisman/cc/gui/console/ConsoleGui;", "Lcom/kisman/cc/gui/KismanGuiScreen;", "Lcom/kisman/cc/gui/api/Draggable;", "()V", "drag", "", "dragX", "", "dragY", "entryString", "", "getEntryString", "()Ljava/lang/String;", "setEntryString", "(Ljava/lang/String;)V", "height1", "history", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "onMessage", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/client/console/ConsoleMessageEvent;", "kotlin.jvm.PlatformType", "getOnMessage", "()Lme/zero/alpine/listener/Listener;", "width1", "x", "y", "doesGuiPauseGame", "drawScreen", "", "mouseX", "mouseY", "partialTicks", "", "getH", "", "getLongestWord", "strings", "", "getW", "getX", "getY", "keyTyped", "typedChar", "", "keyCode", "mouseClicked", "mouseButton", "mouseReleased", "state", "onGuiClosed", "removeLastLetter", "string", "setH", "h", "setW", "w", "setX", "setY", "kisman.cc"})
public final class Class264
extends Class1888
implements Class732 {
    private int Field9171 = 300;
    private int Field9172 = 225;
    private int Field9173 = 25;
    private int Field9174 = 25;
    private final ArrayList Field9175 = new ArrayList();
    @NotNull
    private String Field9176 = "";
    private boolean Field9177;
    private int Field9178;
    private int Field9179;
    @Class1801
    @NotNull
    private final Class618 Field9180 = new Class618((Class254)new Class1090(this), new Predicate[0]);
    private int Field9181;

    @NotNull
    @NotNull
    public final String Method1429() {
        return this.Field9176;
    }

    public final void Method1430(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"<set-?>");
        this.Field9176 = string;
    }

    @NotNull
    @NotNull
    public final Class618 Method1431() {
        return this.Field9180;
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
        if (Class1796.Field16241.Field16267.Method1968() != Class1233.Field13596) {
            Class399 class399 = Class1796.Field16241.Field16267;
            Intrinsics.checkExpressionValueIsNotNull((Object)class399, (String)"Kisman.instance.selectionBar");
            Class754.Field11206.Method2058(class399);
            return;
        }
        super.drawDefaultBackground();
        Class1796.Field16241.Field16268.Method5122(n, n2);
        if (this.Field9177) {
            this.Field9173 = n - this.Field9178;
            this.Field9174 = n2 - this.Field9179;
        }
        Class662.Field10816.Method2466(this);
        if (this.Field9175.size() >= 25) {
            this.Field9175.remove(0);
        }
        this.Field9171 = this.Method1435(this.Field9175) > 300 ? this.Method1435(this.Field9175) + 3 : 300;
        GuiScreen.drawRect((int)this.Field9173, (int)this.Field9174, (int)(this.Field9173 + this.Field9171), (int)(this.Field9174 + this.Field9172), (int)new Color(0, 0, 0, 175).getRGB());
        Class44 class44 = null.Field11803;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Config.instance.guiOutline");
        if (class44.Method365()) {
            Color color = Color.BLACK;
            Intrinsics.checkExpressionValueIsNotNull((Object)color, (String)"Color.BLACK");
            GuiScreen.drawRect((int)(this.Field9173 - 1), (int)this.Field9174, (int)(this.Field9173 + this.Field9171), (int)(this.Field9174 + 1), (int)color.getRGB());
            Color color2 = Color.BLACK;
            Intrinsics.checkExpressionValueIsNotNull((Object)color2, (String)"Color.BLACK");
            GuiScreen.drawRect((int)(this.Field9173 - 1), (int)this.Field9174, (int)this.Field9173, (int)this.Field9172, (int)color2.getRGB());
            Color color3 = Color.BLACK;
            Intrinsics.checkExpressionValueIsNotNull((Object)color3, (String)"Color.BLACK");
            GuiScreen.drawRect((int)(this.Field9173 - 1 + this.Field9171), (int)this.Field9174, (int)(this.Field9173 + this.Field9171), (int)this.Field9172, (int)color3.getRGB());
            Color color4 = Color.BLACK;
            Intrinsics.checkExpressionValueIsNotNull((Object)color4, (String)"Color.BLACK");
            GuiScreen.drawRect((int)(this.Field9173 - 1), (int)(this.Field9174 + this.Field9172), (int)(this.Field9173 + this.Field9171), (int)(this.Field9174 + this.Field9172 + 1), (int)color4.getRGB());
        }
        int n3 = 0;
        Iterator iterator = this.Field9175.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.fontRenderer.drawStringWithShadow(this.Field9176 + '_', (float)(this.Field9173 + 2), (float)(this.Field9174 + this.Field9172 - this.fontRenderer.FONT_HEIGHT), -1);
                this.drawSelectionBar(n, n2);
                return;
            }
            String string = (String)iterator.next();
            Minecraft.getMinecraft().fontRenderer.drawStringWithShadow(string, (float)(this.Field9173 + 2), (float)(this.Field9174 + 2 + n3), -1);
            n3 += Minecraft.getMinecraft().fontRenderer.FONT_HEIGHT;
        }
    }

    @Override
    protected void mouseClicked(int n, int n2, int n3) {
        if (Mouse.isButtonDown((int)0) && n >= this.Field9173 && n <= this.Field9173 + this.Field9171 && n2 >= this.Field9174 && n2 <= this.Field9174 + this.Field9172) {
            this.Field9177 = true;
            this.Field9178 = n - this.Field9173;
            this.Field9179 = n2 - this.Field9174;
        }
        super.mouseClicked(n, n2, n3);
    }

    protected void Method1432(int n, int n2, int n3) {
        this.Field9177 = false;
    }

    @Override
    public void keyTyped(char c, int n) {
        if (n == 1) {
            Minecraft.getMinecraft().displayGuiScreen(null);
            return;
        }
        switch (n) {
            case 14: {
                this.Field9176 = this.Method1434(this.Field9176);
                break;
            }
            case 28: {
                String string = this.Field9176;
                boolean bl = false;
                String string2 = string;
                if (string2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                String string3 = string2.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull((Object)string3, (String)"(this as java.lang.String).toLowerCase()");
                string = string3;
                switch (string.hashCode()) {
                    case 94746189: {
                        if (string.equals("clear")) {
                            this.Field9175.clear();
                            Collection collection = this.Field9175;
                            String string4 = "Cleared console!";
                            boolean bl2 = false;
                            collection.add(string4);
                            break;
                        }
                    }
                    default: {
                        CharSequence charSequence = this.Field9176;
                        boolean bl3 = false;
                        boolean bl4 = charSequence.length() > 0;
                        Class1796.Field16241.Field16272.Method7566('-' + this.Field9176);
                    }
                }
                this.Field9176 = "";
                break;
            }
            case 47: {
                if (!Keyboard.isKeyDown((int)29)) {
                    if (!Keyboard.isKeyDown((int)157)) break;
                }
                StringBuilder stringBuilder = new StringBuilder().append(this.Field9176);
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                Intrinsics.checkExpressionValueIsNotNull((Object)toolkit, (String)"Toolkit.getDefaultToolkit()");
                this.Field9176 = stringBuilder.append(toolkit.getSystemClipboard().getData(DataFlavor.stringFlavor)).toString();
                break;
            }
            case 46: {
                if (!Keyboard.isKeyDown((int)29) && !Keyboard.isKeyDown((int)157)) break;
                Object object = this.Field9176;
                boolean bl = false;
                boolean bl5 = object.length() == 0;
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                Intrinsics.checkExpressionValueIsNotNull((Object)toolkit, (String)"Toolkit.getDefaultToolkit()");
                toolkit.getSystemClipboard().setContents(new StringSelection(this.Field9176), null);
                object = this.Field9175;
                String string = ChatFormatting.BOLD + "[Console]" + ChatFormatting.RESET + " Copied text in string box to clipboard.";
                boolean bl6 = false;
                object.add(string);
                break;
            }
        }
        if (!ChatAllowedCharacters.isAllowedCharacter((char)c)) return;
        this.Field9176 = this.Field9176 + c;
        super.keyTyped(c, n);
    }

    public boolean Method1433() {
        return false;
    }

    private final String Method1434(String string) {
        boolean bl;
        String string2 = "";
        if (string == null) return string2;
        CharSequence charSequence = string;
        boolean bl2 = false;
        if (charSequence.length() > 0) {
            bl = true;
            return string2;
        }
        bl = false;
        return string2;
    }

    private final int Method1435(List list) {
        int n = 0;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            if (Minecraft.getMinecraft().fontRenderer.getStringWidth(string) <= n) continue;
            n = Minecraft.getMinecraft().fontRenderer.getStringWidth(string);
        }
        return n;
    }

    public void Method1436() {
        if (this.mc.player != null && this.mc.world != null) {
            this.mc.entityRenderer.getShaderGroup().deleteShaderGroup();
        }
        super.onGuiClosed();
    }

    @Override
    public double Method267() {
        return this.Field9173;
    }

    @Override
    public double Method268() {
        return this.Field9174;
    }

    @Override
    public double Method269() {
        return this.Field9171;
    }

    @Override
    public double Method270() {
        return this.Field9172;
    }

    @Override
    public void Method271(double d) {
        this.Field9173 = (int)d;
    }

    @Override
    public void Method272(double d) {
        this.Field9174 = (int)d;
    }

    @Override
    public void Method273(double d) {
        this.Field9171 = (int)d;
    }

    @Override
    public void Method274(double d) {
        this.Field9172 = (int)d;
    }

    public Class264() {
        Class1796.Field16242.Method706(this.Field9180);
    }

    public static final /* bridge */ /* synthetic */ ArrayList Method1437(Class264 class264) {
        return class264.Field9175;
    }

    private static String Method1438(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 253;
            cArray2[n] = (char)(cArray[n] ^ (0x6D37 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

