//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.*;
import java.util.*;
import kotlin.*;
import org.lwjgl.input.*;
import java.awt.*;
import java.awt.datatransfer.*;
import com.mojang.realmsclient.gui.*;
import net.minecraft.util.*;
import java.util.function.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002B\u0005?\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u0005H\u0016J \u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0016J\u0016\u0010%\u001a\u00020\u00072\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0'H\u0002J\b\u0010(\u001a\u00020$H\u0016J\b\u0010)\u001a\u00020$H\u0016J\b\u0010*\u001a\u00020$H\u0016J\u0018\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0007H\u0016J \u0010/\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0007H\u0014J \u00101\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007H\u0014J\b\u00103\u001a\u00020\u001eH\u0016J\u0012\u00104\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u00106\u001a\u00020\u001e2\u0006\u00107\u001a\u00020$H\u0016J\u0010\u00108\u001a\u00020\u001e2\u0006\u00109\u001a\u00020$H\u0016J\u0010\u0010:\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020$H\u0016J\u0010\u0010;\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020$H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e?\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e?\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0011j\b\u0012\u0004\u0012\u00020\n`\u0012X\u0082\u0004?\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00148\u0006X\u0087\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u000e?\u0006\u0002\n\u0000?\u0006<" }, d2 = { "Lcom/kisman/cc/gui/console/ConsoleGui;", "Lcom/kisman/cc/gui/KismanGuiScreen;", "Lcom/kisman/cc/gui/api/Draggable;", "()V", "drag", "", "dragX", "", "dragY", "entryString", "", "getEntryString", "()Ljava/lang/String;", "setEntryString", "(Ljava/lang/String;)V", "height1", "history", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "onMessage", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/client/console/ConsoleMessageEvent;", "kotlin.jvm.PlatformType", "getOnMessage", "()Lme/zero/alpine/listener/Listener;", "width1", "x", "y", "doesGuiPauseGame", "drawScreen", "", "mouseX", "mouseY", "partialTicks", "", "getH", "", "getLongestWord", "strings", "", "getW", "getX", "getY", "keyTyped", "typedChar", "", "keyCode", "mouseClicked", "mouseButton", "mouseReleased", "state", "onGuiClosed", "removeLastLetter", "string", "setH", "h", "setW", "w", "setX", "setY", "kisman.cc" })
public final class Class264 extends Class1888 implements Class732
{
    private int Field9171;
    private int Field9172;
    private int Field9173;
    private int Field9174;
    private final ArrayList Field9175;
    @NotNull
    private String Field9176;
    private boolean Field9177;
    private int Field9178;
    private int Field9179;
    @Class1801
    @NotNull
    private final Class618 Field9180;
    private int Field9181;
    
    @NotNull
    @NotNull
    public final String Method1429() {
        return this.Field9176;
    }
    
    public final void Method1430(@NotNull @NotNull final String field9176) {
        Intrinsics.checkParameterIsNotNull((Object)field9176, "<set-?>");
        this.Field9176 = field9176;
    }
    
    @NotNull
    @NotNull
    public final Class618 Method1431() {
        return this.Field9180;
    }
    
    public void drawScreen(final int n, final int n2, final float n3) {
        if (Class1796.Field16241.Field16267.Method1968() != Class1233.Field13596) {
            final Class429 field11206 = Class754.Field11206;
            final Class399 field11207 = Class1796.Field16241.Field16267;
            Intrinsics.checkExpressionValueIsNotNull((Object)field11207, "Kisman.instance.selectionBar");
            field11206.Method2058(field11207);
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
        this.Field9171 = ((this.Method1435(this.Field9175) > 300) ? (this.Method1435(this.Field9175) + 3) : 300);
        GuiScreen.drawRect(this.Field9173, this.Field9174, this.Field9173 + this.Field9171, this.Field9174 + this.Field9172, new Color(0, 0, 0, 175).getRGB());
        final Class44 field11208 = null.Field11803;
        Intrinsics.checkExpressionValueIsNotNull((Object)field11208, "Config.instance.guiOutline");
        if (field11208.Method365()) {
            final int n4 = this.Field9173 - 1;
            final int field11209 = this.Field9174;
            final int n5 = this.Field9173 + this.Field9171;
            final int n6 = this.Field9174 + 1;
            final Color black = Color.BLACK;
            Intrinsics.checkExpressionValueIsNotNull((Object)black, "Color.BLACK");
            GuiScreen.drawRect(n4, field11209, n5, n6, black.getRGB());
            final int n7 = this.Field9173 - 1;
            final int field11210 = this.Field9174;
            final int field11211 = this.Field9173;
            final int field11212 = this.Field9172;
            final Color black2 = Color.BLACK;
            Intrinsics.checkExpressionValueIsNotNull((Object)black2, "Color.BLACK");
            GuiScreen.drawRect(n7, field11210, field11211, field11212, black2.getRGB());
            final int n8 = this.Field9173 - 1 + this.Field9171;
            final int field11213 = this.Field9174;
            final int n9 = this.Field9173 + this.Field9171;
            final int field11214 = this.Field9172;
            final Color black3 = Color.BLACK;
            Intrinsics.checkExpressionValueIsNotNull((Object)black3, "Color.BLACK");
            GuiScreen.drawRect(n8, field11213, n9, field11214, black3.getRGB());
            final int n10 = this.Field9173 - 1;
            final int n11 = this.Field9174 + this.Field9172;
            final int n12 = this.Field9173 + this.Field9171;
            final int n13 = this.Field9174 + this.Field9172 + 1;
            final Color black4 = Color.BLACK;
            Intrinsics.checkExpressionValueIsNotNull((Object)black4, "Color.BLACK");
            GuiScreen.drawRect(n10, n11, n12, n13, black4.getRGB());
        }
        int n14 = 0;
        final Iterator<String> iterator = (Iterator<String>)this.Field9175.iterator();
        while (iterator.hasNext()) {
            Minecraft.getMinecraft().fontRenderer.drawStringWithShadow((String)iterator.next(), (float)(this.Field9173 + 2), (float)(this.Field9174 + 2 + n14), -1);
            n14 += Minecraft.getMinecraft().fontRenderer.FONT_HEIGHT;
        }
        this.fontRenderer.drawStringWithShadow(this.Field9176 + '_', (float)(this.Field9173 + 2), (float)(this.Field9174 + this.Field9172 - this.fontRenderer.FONT_HEIGHT), -1);
        this.drawSelectionBar(n, n2);
    }
    
    protected void mouseClicked(final int n, final int n2, final int n3) {
        if (Mouse.isButtonDown(0) && n >= this.Field9173 && n <= this.Field9173 + this.Field9171 && n2 >= this.Field9174 && n2 <= this.Field9174 + this.Field9172) {
            this.Field9177 = true;
            this.Field9178 = n - this.Field9173;
            this.Field9179 = n2 - this.Field9174;
        }
        super.mouseClicked(n, n2, n3);
    }
    
    protected void Method1432(final int n, final int n2, final int n3) {
        this.Field9177 = false;
    }
    
    public void keyTyped(final char c, final int n) {
        if (n == 1) {
            Minecraft.getMinecraft().displayGuiScreen((GuiScreen)null);
            return;
        }
        switch (n) {
            case 14: {
                this.Field9176 = this.Method1434(this.Field9176);
                break;
            }
            case 28: {
                final String field9176 = this.Field9176;
                if (field9176 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                final String lowerCase = field9176.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull((Object)lowerCase, "(this as java.lang.String).toLowerCase()");
                final String s = lowerCase;
                Label_0237: {
                    switch (s.hashCode()) {
                        case 94746189: {
                            if (s.equals("clear")) {
                                this.Field9175.clear();
                                this.Field9175.add("Cleared console!");
                                break Label_0237;
                            }
                            break;
                        }
                    }
                    if (this.Field9176.length() > 0) {}
                    Class1796.Field16241.Field16272.Method7566('-' + this.Field9176);
                }
                this.Field9176 = "";
                break;
            }
            case 47: {
                if (Keyboard.isKeyDown(29) || Keyboard.isKeyDown(157)) {
                    final StringBuilder append = new StringBuilder().append(this.Field9176);
                    final Toolkit defaultToolkit = Toolkit.getDefaultToolkit();
                    Intrinsics.checkExpressionValueIsNotNull((Object)defaultToolkit, "Toolkit.getDefaultToolkit()");
                    this.Field9176 = append.append(defaultToolkit.getSystemClipboard().getData(DataFlavor.stringFlavor)).toString();
                    break;
                }
                break;
            }
            case 46: {
                if (Keyboard.isKeyDown(29) || Keyboard.isKeyDown(157)) {
                    if (this.Field9176.length() == 0) {}
                    final Toolkit defaultToolkit2 = Toolkit.getDefaultToolkit();
                    Intrinsics.checkExpressionValueIsNotNull((Object)defaultToolkit2, "Toolkit.getDefaultToolkit()");
                    defaultToolkit2.getSystemClipboard().setContents(new StringSelection(this.Field9176), null);
                    this.Field9175.add(ChatFormatting.BOLD + "[Console]" + ChatFormatting.RESET + " Copied text in string box to clipboard.");
                    break;
                }
                break;
            }
        }
        if (ChatAllowedCharacters.isAllowedCharacter(c)) {
            this.Field9176 += c;
            super.keyTyped(c, n);
        }
    }
    
    public boolean Method1433() {
        return false;
    }
    
    private final String Method1434(final String s) {
        final String s2 = "";
        if (s != null) {
            if (s.length() > 0) {}
        }
        return s2;
    }
    
    private final int Method1435(final List list) {
        int getStringWidth = 0;
        for (final String s : list) {
            if (Minecraft.getMinecraft().fontRenderer.getStringWidth(s) > getStringWidth) {
                getStringWidth = Minecraft.getMinecraft().fontRenderer.getStringWidth(s);
            }
        }
        return getStringWidth;
    }
    
    public void Method1436() {
        if (this.mc.player != null && this.mc.world != null) {
            this.mc.entityRenderer.getShaderGroup().deleteShaderGroup();
        }
        super.onGuiClosed();
    }
    
    public double Method267() {
        return this.Field9173;
    }
    
    public double Method268() {
        return this.Field9174;
    }
    
    public double Method269() {
        return this.Field9171;
    }
    
    public double Method270() {
        return this.Field9172;
    }
    
    public void Method271(final double n) {
        this.Field9173 = (int)n;
    }
    
    public void Method272(final double n) {
        this.Field9174 = (int)n;
    }
    
    public void Method273(final double n) {
        this.Field9171 = (int)n;
    }
    
    public void Method274(final double n) {
        this.Field9172 = (int)n;
    }
    
    public Class264() {
        this.Field9171 = 300;
        this.Field9172 = 225;
        this.Field9173 = 25;
        this.Field9174 = 25;
        this.Field9175 = new ArrayList();
        this.Field9176 = "";
        this.Field9180 = new Class618((Class254)new Class1090(this), new Predicate[0]);
        Class1796.Field16242.Method706(this.Field9180);
    }
    
    private static String Method1438(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6D37 ^ 0xFD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
