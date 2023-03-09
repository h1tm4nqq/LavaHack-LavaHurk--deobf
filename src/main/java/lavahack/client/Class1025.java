//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiTextField
 *  org.lwjgl.input.Keyboard
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class744;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiTextField;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.input.Keyboard;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007B5\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012\u00a8\u0006\u001a"}, d2={"Lcom/kisman/cc/util/render/gui/TextFieldHandler;", "Lnet/minecraft/client/gui/GuiTextField;", "x", "", "y", "w", "h", "(IIII)V", "font", "Lnet/minecraft/client/gui/FontRenderer;", "focused_", "", "(Lnet/minecraft/client/gui/FontRenderer;IIIIZ)V", "getFocused_", "()Z", "getFont", "()Lnet/minecraft/client/gui/FontRenderer;", "getH", "()I", "getW", "getX", "getY", "clone", "", "init", "Companion", "kisman.cc"})
public final class Class1025
extends GuiTextField {
    @NotNull
    private final FontRenderer Field12503;
    private final int Field12504;
    private final int Field12505;
    private final int Field12506;
    private final int Field12507;
    private final boolean Field12508;
    private static int Field12509;
    public static final Class744 Field12510;
    private String Field12511 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void init() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.setMaxStringLength(256);
        this.setEnableBackgroundDrawing(false);
        this.setFocused(this.Field12508);
        this.setText("");
        this.setCanLoseFocus(false);
    }

    public final void clone() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @NotNull
    @NotNull
    public final FontRenderer getFont() {
        return this.Field12503;
    }

    public final int getX() {
        return this.Field12504;
    }

    public final int getY() {
        return this.Field12505;
    }

    public final int getW() {
        return this.Field12506;
    }

    public final int getH() {
        return this.Field12507;
    }

    public final boolean getFocused_() {
        return this.Field12508;
    }

    public Class1025(@NotNull @NotNull FontRenderer fontRenderer, int n, int n2, int n3, int n4, boolean bl) {
        Intrinsics.checkParameterIsNotNull((Object)fontRenderer, (String)"font");
        super(Field12510.Method3081(), fontRenderer, n, n2, n3, n4);
        this.Field12503 = fontRenderer;
        this.Field12504 = n;
        this.Field12505 = n2;
        this.Field12506 = n3;
        this.Field12507 = n4;
        this.Field12508 = bl;
    }

    public Class1025(int n, int n2, int n3, int n4) {
        FontRenderer fontRenderer = Minecraft.getMinecraft().fontRenderer;
        Intrinsics.checkExpressionValueIsNotNull((Object)fontRenderer, (String)"Minecraft.getMinecraft().fontRenderer");
        this(fontRenderer, n, n2, n3, n4, false);
    }

    static {
        Field12510 = new Class744(null);
        Field12509 = 1000;
    }

    public static final /* bridge */ /* synthetic */ int access$getINDEX$cp() {
        return Field12509;
    }

    public static final /* bridge */ /* synthetic */ void access$setINDEX$cp(int n) {
        Field12509 = n;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 20;
            cArray2[n] = (char)(cArray[n] ^ (0xF9D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

