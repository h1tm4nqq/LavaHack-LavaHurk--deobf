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
import lavahack.client.Kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9;
import lavahack.client.cxNAUtF7AIcjmWREzWR4yVfqeRWAFQn0;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\fH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u001a"}, d2={"Lcom/kisman/cc/gui/halq/SearchBar;", "Lcom/kisman/cc/gui/selectionbar/element/IElement;", "()V", "field", "Lcom/kisman/cc/util/render/gui/TextFieldHandler;", "getField", "()Lcom/kisman/cc/util/render/gui/TextFieldHandler;", "setField", "(Lcom/kisman/cc/util/render/gui/TextFieldHandler;)V", "draw", "", "x", "", "y", "mouseX", "mouseY", "height", "init", "key", "char", "", "mouse", "button", "text", "", "width", "kisman.cc"})
public final class gtfvX1XEbpxsbEkveIG1JDIOAkK6tVQt
implements cxNAUtF7AIcjmWREzWR4yVfqeRWAFQn0 {
    @Nullable
    private Kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 Field14937;
    private String Field14938 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Nullable
    @Nullable
    public final Kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 Method5952() {
        return this.Field14937;
    }

    public final void Method5953(@Nullable @Nullable Kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9) {
        this.Field14937 = kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9;
    }

    @Override
    public void Method5082(int n, int n2) {
        this.Field14937 = new Kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9(n + leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16267.Method1971(), n2 + fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() / (((int)1259677472L ^ 0x4B152721) << 1), (int)((long)1633330303 ^ (long)1633330278) << 2, Minecraft.getMinecraft().fontRenderer.FONT_HEIGHT);
    }

    @Override
    public void Method5083(int n, int n2, int n3, int n4) {
        Kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 = this.Field14937;
        if (kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 == null) {
            Intrinsics.throwNpe();
        }
        kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9.drawTextBox();
    }

    @Override
    public void Method5084(int n, int n2, int n3) {
        Kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 = this.Field14937;
        if (kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 == null) {
            Intrinsics.throwNpe();
        }
        kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9.mouseClicked(n2, n3, n);
    }

    @Override
    public void Method5085(int n, char c) {
        Kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 = this.Field14937;
        if (kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 == null) {
            Intrinsics.throwNpe();
        }
        kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9.textboxKeyTyped(c, n);
    }

    @Override
    public int Method5086() {
        return ((int)((long)47216618 ^ (long)47216627) << 2) + leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16267.Method1971() * ((int)((long)339613879 ^ (long)339613878) << 1);
    }

    @Override
    public int Method5087() {
        return fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16267.Method1971() * (((int)-137087090L ^ 0xF7D4378F) << 1);
    }

    @NotNull
    @NotNull
    public final String Method5954() {
        Kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 = this.Field14937;
        Object object = kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9;
        if (kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 == null) return "pon4ik";
        String string = object.getText();
        object = string;
        if (string == null) return "pon4ik";
        return object;
    }

    private static String Method5955(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-910963322L ^ 0xC9B3CD86;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-236607801 ^ (long)-236607944);
            int n2 = (int)((long)1321233012 ^ (long)1321232967) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1875886286 ^ (long)-1875892957) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

