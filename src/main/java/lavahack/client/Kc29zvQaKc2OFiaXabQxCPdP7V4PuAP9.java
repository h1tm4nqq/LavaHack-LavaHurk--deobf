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
import lavahack.client.Kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiTextField;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.input.Keyboard;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007B5\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012\u00a8\u0006\u001a"}, d2={"Lcom/kisman/cc/util/render/gui/TextFieldHandler;", "Lnet/minecraft/client/gui/GuiTextField;", "x", "", "y", "w", "h", "(IIII)V", "font", "Lnet/minecraft/client/gui/FontRenderer;", "focused_", "", "(Lnet/minecraft/client/gui/FontRenderer;IIIIZ)V", "getFocused_", "()Z", "getFont", "()Lnet/minecraft/client/gui/FontRenderer;", "getH", "()I", "getW", "getX", "getY", "clone", "", "init", "Companion", "kisman.cc"})
public final class Kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9
extends GuiTextField {
    @NotNull
    private final FontRenderer Field12503;
    private final int Field12504;
    private final int Field12505;
    private final int Field12506;
    private final int Field12507;
    private final boolean Field12508;
    private static int Field12509;
    public static final Kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12510;
    private String Field12511 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void init() {
        Keyboard.enableRepeatEvents((boolean)((long)-1694846947 ^ (long)-1694846948));
        this.setMaxStringLength((int)((long)-2036782982 ^ (long)-2036782981) << 8);
        this.setEnableBackgroundDrawing((boolean)((long)-1996989125 ^ (long)-1996989125));
        this.setFocused(this.Field12508);
        this.setText("");
        this.setCanLoseFocus((boolean)((long)-1466036796 ^ (long)-1466036796));
    }

    public final void clone() {
        Keyboard.enableRepeatEvents(((int)275849393L ^ 0x107120B1) != 0);
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

    public Kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9(@NotNull @NotNull FontRenderer fontRenderer, int n, int n2, int n3, int n4, boolean bl) {
        Intrinsics.checkParameterIsNotNull((Object)fontRenderer, (String)"font");
        super(Field12510.Method3081(), fontRenderer, n, n2, n3, n4);
        this.Field12503 = fontRenderer;
        this.Field12504 = n;
        this.Field12505 = n2;
        this.Field12506 = n3;
        this.Field12507 = n4;
        this.Field12508 = bl;
    }

    public Kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9(int n, int n2, int n3, int n4) {
        FontRenderer fontRenderer = Minecraft.getMinecraft().fontRenderer;
        Intrinsics.checkExpressionValueIsNotNull((Object)fontRenderer, (String)"Minecraft.getMinecraft().fontRenderer");
        this(fontRenderer, n, n2, n3, n4, (boolean)((long)507280409 ^ (long)507280409));
    }

    static {
        Field12510 = new Kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(null);
        Field12509 = ((int)1756877779L ^ 0x68B7D3AE) << 3;
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
        int n = (int)((long)-1732638480 ^ (long)-1732638480);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1044959725 ^ (long)1044959506);
            int n2 = ((int)1282862611L ^ 0x4C76EE16) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1353651235 ^ (long)1353653182) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

