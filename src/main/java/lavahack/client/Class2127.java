//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.client.gui.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0014J \u0010\u0018\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH\u0014J \u0010\u001a\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0014R\u0011\u0010\u0003\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006?\u0006\u001c" }, d2 = { "Lcom/kisman/cc/features/module/Debug/TextFieldTest$TestGui;", "Lnet/minecraft/client/gui/GuiScreen;", "()V", "field", "Lcom/kisman/cc/util/render/gui/TextFieldHandler;", "getField", "()Lcom/kisman/cc/util/render/gui/TextFieldHandler;", "actionPerformed", "", "button", "Lnet/minecraft/client/gui/GuiButton;", "doesGuiPauseGame", "", "drawScreen", "mouseX", "", "mouseY", "partialTicks", "", "initGui", "keyTyped", "typedChar", "", "keyCode", "mouseClicked", "mouseButton", "mouseReleased", "state", "kisman.cc" })
public final class Class2127 extends GuiScreen
{
    @NotNull
    private final Class1025 Field17678;
    private int Field17679;
    
    @NotNull
    @NotNull
    public final Class1025 getField() {
        return this.Field17678;
    }
    
    public void drawScreen(final int n, final int n2, final float n3) {
        this.drawDefaultBackground();
        this.Field17678.drawTextBox();
    }
    
    protected void mouseClicked(final int n, final int n2, final int n3) {
        this.Field17678.mouseClicked(n, n2, n3);
    }
    
    protected void mouseReleased(final int n, final int n2, final int n3) {
    }
    
    protected void actionPerformed(@NotNull @NotNull final GuiButton guiButton) {
        Intrinsics.checkParameterIsNotNull((Object)guiButton, "button");
        super.actionPerformed(guiButton);
    }
    
    public void initGui() {
        this.Field17678.init();
    }
    
    public boolean doesGuiPauseGame() {
        return true;
    }
    
    protected void keyTyped(final char c, final int n) {
        if (n == 1) {
            this.mc.currentScreen = null;
        }
    }
    
    public Class2127() {
        this.Field17678 = new Class1025(100, 100, 22, 200);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2E19 ^ 0xF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
