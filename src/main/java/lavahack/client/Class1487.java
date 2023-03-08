//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.client.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\fH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b?\u0006\u001a" }, d2 = { "Lcom/kisman/cc/gui/halq/SearchBar;", "Lcom/kisman/cc/gui/selectionbar/element/IElement;", "()V", "field", "Lcom/kisman/cc/util/render/gui/TextFieldHandler;", "getField", "()Lcom/kisman/cc/util/render/gui/TextFieldHandler;", "setField", "(Lcom/kisman/cc/util/render/gui/TextFieldHandler;)V", "draw", "", "x", "", "y", "mouseX", "mouseY", "height", "init", "key", "char", "", "mouse", "button", "text", "", "width", "kisman.cc" })
public final class Class1487 implements Class1258
{
    @Nullable
    private Class1025 Field14937;
    private String Field14938 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Nullable
    @Nullable
    public final Class1025 Method5952() {
        return this.Field14937;
    }
    
    public final void Method5953(@Nullable @Nullable final Class1025 field14937) {
        this.Field14937 = field14937;
    }
    
    public void Method5082(final int n, final int n2) {
        this.Field14937 = new Class1025(n + Class1796.Field16241.Field16267.Method1971(), n2 + Class1178.Method4748() / 2, 100, Minecraft.getMinecraft().fontRenderer.FONT_HEIGHT);
    }
    
    public void Method5083(final int n, final int n2, final int n3, final int n4) {
        final Class1025 field14937 = this.Field14937;
        if (field14937 == null) {
            Intrinsics.throwNpe();
        }
        field14937.drawTextBox();
    }
    
    public void Method5084(final int n, final int n2, final int n3) {
        final Class1025 field14937 = this.Field14937;
        if (field14937 == null) {
            Intrinsics.throwNpe();
        }
        field14937.mouseClicked(n2, n3, n);
    }
    
    public void Method5085(final int n, final char c) {
        final Class1025 field14937 = this.Field14937;
        if (field14937 == null) {
            Intrinsics.throwNpe();
        }
        field14937.textboxKeyTyped(c, n);
    }
    
    public int Method5086() {
        return 100 + Class1796.Field16241.Field16267.Method1971() * 2;
    }
    
    public int Method5087() {
        return Class1178.Method4748() + Class1796.Field16241.Field16267.Method1971() * 2;
    }
    
    @NotNull
    @NotNull
    public final String Method5954() {
        final Class1025 field14937 = this.Field14937;
        String getText;
        if (field14937 == null || (getText = field14937.getText()) == null) {
            getText = "pon4ik";
        }
        return getText;
    }
    
    private static String Method5955(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1A11 ^ 0x66));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
