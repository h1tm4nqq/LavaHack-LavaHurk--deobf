//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.client.gui.*;
import org.jetbrains.annotations.*;
import org.lwjgl.input.*;
import net.minecraft.client.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003?\u0006\u0002\u0010\u0007B5\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b?\u0006\u0002\u0010\fJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017R\u0011\u0010\n\u001a\u00020\u000b?\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t?\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012?\u0006\u001a" }, d2 = { "Lcom/kisman/cc/util/render/gui/TextFieldHandler;", "Lnet/minecraft/client/gui/GuiTextField;", "x", "", "y", "w", "h", "(IIII)V", "font", "Lnet/minecraft/client/gui/FontRenderer;", "focused_", "", "(Lnet/minecraft/client/gui/FontRenderer;IIIIZ)V", "getFocused_", "()Z", "getFont", "()Lnet/minecraft/client/gui/FontRenderer;", "getH", "()I", "getW", "getX", "getY", "clone", "", "init", "Companion", "kisman.cc" })
public final class Class1025 extends GuiTextField
{
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
        Keyboard.enableRepeatEvents(true);
        this.setMaxStringLength(256);
        this.setEnableBackgroundDrawing(false);
        this.setFocused(this.Field12508);
        this.setText("");
        this.setCanLoseFocus(false);
    }
    
    public final void clone() {
        Keyboard.enableRepeatEvents(false);
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
    
    public Class1025(@NotNull @NotNull final FontRenderer field12503, final int field12504, final int field12505, final int field12506, final int field12507, final boolean field12508) {
        Intrinsics.checkParameterIsNotNull((Object)field12503, "font");
        super(Class1025.Field12510.Method3081(), field12503, field12504, field12505, field12506, field12507);
        this.Field12503 = field12503;
        this.Field12504 = field12504;
        this.Field12505 = field12505;
        this.Field12506 = field12506;
        this.Field12507 = field12507;
        this.Field12508 = field12508;
    }
    
    public Class1025(final int n, final int n2, final int n3, final int n4) {
        final FontRenderer fontRenderer = Minecraft.getMinecraft().fontRenderer;
        Intrinsics.checkExpressionValueIsNotNull((Object)fontRenderer, "Minecraft.getMinecraft().fontRenderer");
        this(fontRenderer, n, n2, n3, n4, false);
    }
    
    static {
        Field12510 = new Class744(null);
        Class1025.Field12509 = 1000;
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xF9D ^ 0x14));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
