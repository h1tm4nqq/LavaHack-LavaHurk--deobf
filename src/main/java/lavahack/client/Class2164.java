/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1249;
import lavahack.client.Class1520;
import lavahack.client.Class1796;
import lavahack.client.Class662;
import lavahack.client.Class753;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0016J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\fH\u0002J \u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0016J \u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010 \u001a\u00020\fH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006!"}, d2={"Lcom/kisman/cc/gui/hudeditor/DraggableBox;", "Lcom/kisman/cc/gui/api/Component;", "module", "Lcom/kisman/cc/features/hud/HudModule;", "(Lcom/kisman/cc/features/hud/HudModule;)V", "drag", "", "getDrag", "()Z", "setDrag", "(Z)V", "dragX", "", "getDragX", "()I", "setDragX", "(I)V", "dragY", "getDragY", "setDragY", "getModule", "()Lcom/kisman/cc/features/hud/HudModule;", "drawScreen", "", "mouseX", "mouseY", "isMouseOnButton", "x", "y", "mouseClicked", "button", "mouseReleased", "mouseButton", "kisman.cc"})
public final class Class2164
implements Class1520 {
    private int Field17896;
    private int Field17897;
    private boolean Field17898;
    @NotNull
    private final Class1249 Field17899;
    private String Field17900 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final int Method7796() {
        return this.Field17896;
    }

    public final void Method7797(int n) {
        this.Field17896 = n;
    }

    public final int Method7798() {
        return this.Field17897;
    }

    public final void Method7799(int n) {
        this.Field17897 = n;
    }

    public final boolean Method7800() {
        return this.Field17898;
    }

    public final void Method7801(boolean bl) {
        this.Field17898 = bl;
    }

    @Override
    public void Method623(int n, int n2) {
        if (!this.Field17899.Method35()) {
            this.Field17898 = false;
            return;
        }
        if (this.Field17898) {
            this.Field17899.Method271(n - this.Field17896);
            this.Field17899.Method272(n2 - this.Field17897);
        }
        Class662.Field10816.Method2466(this.Field17899);
        Class753.drawRectWH(this.Field17899.Method267(), this.Field17899.Method268(), this.Field17899.Method269(), this.Field17899.Method270(), Class1796.Field16241.Field16263.Method6671().Method3626());
    }

    @Override
    public void Method625(int n, int n2, int n3) {
        if (!this.Field17899.Method35()) return;
        this.Field17898 = this.Method7802(n, n2);
        this.Field17896 = (int)((double)n - this.Field17899.Method267());
        this.Field17897 = (int)((double)n2 - this.Field17899.Method268());
    }

    @Override
    public void Method626(int n, int n2, int n3) {
        this.Field17898 = false;
    }

    private final boolean Method7802(int n, int n2) {
        if (!((double)n > this.Field17899.Method267())) return false;
        if (!((double)n < this.Field17899.Method267() + this.Field17899.Method269())) return false;
        if (!((double)n2 > this.Field17899.Method268())) return false;
        if (!((double)n2 < this.Field17899.Method268() + this.Field17899.Method270())) return false;
        return true;
    }

    @NotNull
    @NotNull
    public final Class1249 Method7803() {
        return this.Field17899;
    }

    public Class2164(@NotNull @NotNull Class1249 class1249) {
        Intrinsics.checkParameterIsNotNull((Object)class1249, (String)"module");
        this.Field17899 = class1249;
    }

    private static String Method7804(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 129;
            cArray2[n] = (char)(cArray[n] ^ (0x5526 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

