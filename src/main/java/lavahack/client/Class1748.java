//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n?\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f?\u0006\u0016" }, d2 = { "Lcom/kisman/cc/gui/hudeditor/HalqHudGui;", "Lcom/kisman/cc/gui/halq/HalqGui;", "()V", "color", "Lcom/kisman/cc/util/Colour;", "getColor", "()Lcom/kisman/cc/util/Colour;", "setColor", "(Lcom/kisman/cc/util/Colour;)V", "settingsFrame", "Lcom/kisman/cc/gui/hudeditor/HudSettingsFrame;", "getSettingsFrame", "()Lcom/kisman/cc/gui/hudeditor/HudSettingsFrame;", "drawScreen", "", "mouseX", "", "mouseY", "partialTicks", "", "gui", "Lcom/kisman/cc/gui/selectionbar/SelectionBar$Guis;", "kisman.cc" })
public final class Class1748 extends Class1419
{
    @NotNull
    private Class2027 Field16024;
    @NotNull
    private final Class1335 Field16025;
    private int Field16026;
    
    @NotNull
    @NotNull
    public final Class2027 Method6671() {
        return this.Field16024;
    }
    
    public final void Method6672(@NotNull @NotNull final Class2027 field16024) {
        Intrinsics.checkParameterIsNotNull((Object)field16024, "<set-?>");
        this.Field16024 = field16024;
    }
    
    @NotNull
    @NotNull
    public final Class1335 Method6673() {
        return this.Field16025;
    }
    
    public void drawScreen(final int n, final int n2, final float n3) {
        final Class2027 method339 = this.Field16025.Method5387().Method339();
        Intrinsics.checkExpressionValueIsNotNull((Object)method339, "settingsFrame.colorSetting.colour");
        this.Field16024 = method339;
        super.drawScreen(n, n2, n3);
    }
    
    @NotNull
    @NotNull
    protected Class1233 Method1220() {
        return Class1233.Field13594;
    }
    
    public Class1748() {
        super(true);
        this.Field16024 = new Class2027(10, 10, 10, 170);
        final int n = 15;
        super.Field14607.add(new Class354(15, 15, "Hud Editor"));
        this.Field16025 = new Class1335(n + 135, 15);
        super.Field14607.add(this.Field16025);
    }
    
    private static String Method1235(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2700 ^ 0x65));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
