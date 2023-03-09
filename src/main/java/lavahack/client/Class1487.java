//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1025;
import lavahack.client.Class1178;
import lavahack.client.Class1258;
import lavahack.client.Class1796;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\fH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u001a"}, d2={"Lcom/kisman/cc/gui/halq/SearchBar;", "Lcom/kisman/cc/gui/selectionbar/element/IElement;", "()V", "field", "Lcom/kisman/cc/util/render/gui/TextFieldHandler;", "getField", "()Lcom/kisman/cc/util/render/gui/TextFieldHandler;", "setField", "(Lcom/kisman/cc/util/render/gui/TextFieldHandler;)V", "draw", "", "x", "", "y", "mouseX", "mouseY", "height", "init", "key", "char", "", "mouse", "button", "text", "", "width", "kisman.cc"})
public final class Class1487
implements Class1258 {
    @Nullable
    private Class1025 Field14937;
    private String Field14938 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Nullable
    @Nullable
    public final Class1025 Method5952() {
        return this.Field14937;
    }

    public final void Method5953(@Nullable @Nullable Class1025 class1025) {
        this.Field14937 = class1025;
    }

    @Override
    public void Method5082(int n, int n2) {
        this.Field14937 = new Class1025(n + Class1796.Field16241.Field16267.Method1971(), n2 + Class1178.Method4748() / 2, 100, Minecraft.getMinecraft().fontRenderer.FONT_HEIGHT);
    }

    @Override
    public void Method5083(int n, int n2, int n3, int n4) {
        Class1025 class1025 = this.Field14937;
        if (class1025 == null) {
            Intrinsics.throwNpe();
        }
        class1025.drawTextBox();
    }

    @Override
    public void Method5084(int n, int n2, int n3) {
        Class1025 class1025 = this.Field14937;
        if (class1025 == null) {
            Intrinsics.throwNpe();
        }
        class1025.mouseClicked(n2, n3, n);
    }

    @Override
    public void Method5085(int n, char c) {
        Class1025 class1025 = this.Field14937;
        if (class1025 == null) {
            Intrinsics.throwNpe();
        }
        class1025.textboxKeyTyped(c, n);
    }

    @Override
    public int Method5086() {
        return 100 + Class1796.Field16241.Field16267.Method1971() * 2;
    }

    @Override
    public int Method5087() {
        return Class1178.Method4748() + Class1796.Field16241.Field16267.Method1971() * 2;
    }

    @NotNull
    @NotNull
    public final String Method5954() {
        Class1025 class1025 = this.Field14937;
        Object object = class1025;
        if (class1025 == null) return "pon4ik";
        String string = object.getText();
        object = string;
        if (string == null) return "pon4ik";
        return object;
    }

    private static String Method5955(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 102;
            cArray2[n] = (char)(cArray[n] ^ (0x1A11 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

