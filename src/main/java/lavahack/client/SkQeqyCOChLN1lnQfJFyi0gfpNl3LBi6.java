//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.ScaledResolution
 *  org.lwjgl.input.Mouse
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.cxNAUtF7AIcjmWREzWR4yVfqeRWAFQn0;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.input.Mouse;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001*B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010J\b\u0010!\u001a\u00020\u0010H\u0002J\u0006\u0010\"\u001a\u00020\u001eJ\u0006\u0010#\u001a\u00020\u0014J\u0016\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0010J\u001e\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010R!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0004\u00a8\u0006+"}, d2={"Lcom/kisman/cc/gui/selectionbar/SelectionBar;", "", "defaultSelection", "Lcom/kisman/cc/gui/selectionbar/SelectionBar$Guis;", "(Lcom/kisman/cc/gui/selectionbar/SelectionBar$Guis;)V", "additions", "Ljava/util/ArrayList;", "Lcom/kisman/cc/gui/selectionbar/element/IElement;", "Lkotlin/collections/ArrayList;", "getAdditions", "()Ljava/util/ArrayList;", "backgroundColor", "Lcom/kisman/cc/util/Colour;", "getBackgroundColor", "()Lcom/kisman/cc/util/Colour;", "offset", "", "getOffset", "()I", "reinit", "", "getReinit", "()Z", "setReinit", "(Z)V", "selection", "getSelection", "()Lcom/kisman/cc/gui/selectionbar/SelectionBar$Guis;", "setSelection", "drawScreen", "", "mouseX", "mouseY", "getSelectionBarWidth", "initGui", "isValid", "keyTyped", "char", "", "key", "mouseClicked", "button", "Guis", "kisman.cc"})
public final class SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6 {
    @NotNull
    private SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9668;
    @NotNull
    private final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field9669;
    private final int Field9670 = 5;
    @NotNull
    private final ArrayList Field9671;
    private boolean Field9672;
    private String Field9673 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Method1968() {
        return this.Field9668;
    }

    public final void Method1969(@NotNull @NotNull SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi skQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)skQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi), (String)"<set-?>");
        this.Field9668 = skQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
    }

    @NotNull
    @NotNull
    public final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method1970() {
        return this.Field9669;
    }

    public final int Method1971() {
        return this.Field9670;
    }

    @NotNull
    @NotNull
    public final ArrayList Method1972() {
        return this.Field9671;
    }

    public final boolean Method1973() {
        return this.Field9672;
    }

    public final void Method1974(boolean bl) {
        this.Field9672 = bl;
    }

    public final void Method1975() {
        this.Field9672 = (int)((long)1713931447 ^ (long)1713931446);
    }

    public final void Method1976(int n, int n2) {
        int n3 = new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth() / ((int)((long)-52566247 ^ (long)-52566248) << 1) - this.Method1980() / ((int)((long)-1345733485 ^ (long)-1345733486) << 1);
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH(n3, 0.0, this.Method1980(), fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748() + this.Field9670 * ((int)((long)-1704615750 ^ (long)-1704615749) << 1), this.Field9669.Method3626());
        for (Object object : this.Field9671) {
            if (this.Field9672 && ((List)this.Field9668.Method4962().invoke()).contains(object)) {
                object.Method5082(n3, (int)120744493L ^ 0x7326A2D);
            }
            object.Method5083(n3, (int)0x3333CD3L ^ 0x3333CD3, n, n2);
            n3 += object.Method5086();
        }
        this.Field9672 = (int)750961999L ^ 0x2CC2C54F;
        SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] skQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.values();
        int n4 = skQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray.length;
        int n5 = (int)((long)-74772681 ^ (long)-74772681);
        while (n5 < n4) {
            Object object;
            object = skQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[n5];
            fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(((SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)((Object)object)).Method4956(), n3 + this.Field9670, this.Field9670, object == this.Field9668 ? zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(((int)168068015L ^ 0xA0483B6) << 2, ((int)1816767851L ^ 0x6C49AD72) << 2) : (int)146909436L ^ 0xF73E5703);
            if (Mouse.isButtonDown((int)((int)1715538294L ^ 0x66410976)) && n >= n3 && n <= n3 + this.Field9670 * ((int)((long)1040267911 ^ (long)1040267910) << 1) + fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(((SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)((Object)object)).Method4956()) && n2 >= 0 && n2 <= this.Field9670 * ((int)((long)1846286587 ^ (long)1846286586) << 1) + fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748()) {
                this.Field9668.Method4960().invoke();
                this.Field9668 = object;
                this.Field9668.Method4959().invoke();
                this.Field9672 = (int)((long)1922424595 ^ (long)1922424594);
            }
            n3 += this.Field9670 * (((int)812076726L ^ 0x30674EB7) << 1) + fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(((SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)((Object)object)).Method4956());
            ++n5;
        }
    }

    public final boolean Method1977(int n, int n2, int n3) {
        Iterator iterator = this.Field9671.iterator();
        while (iterator.hasNext()) {
            cxNAUtF7AIcjmWREzWR4yVfqeRWAFQn0 cxNAUtF7AIcjmWREzWR4yVfqeRWAFQn02 = (cxNAUtF7AIcjmWREzWR4yVfqeRWAFQn0)iterator.next();
            cxNAUtF7AIcjmWREzWR4yVfqeRWAFQn02.Method5084(n, n2, n3);
        }
        return ((int)1476702453L ^ 0x5804B0F4) != 0;
    }

    public final void Method1978(char c, int n) {
        Iterator iterator = this.Field9671.iterator();
        while (iterator.hasNext()) {
            cxNAUtF7AIcjmWREzWR4yVfqeRWAFQn0 cxNAUtF7AIcjmWREzWR4yVfqeRWAFQn02 = (cxNAUtF7AIcjmWREzWR4yVfqeRWAFQn0)iterator.next();
            cxNAUtF7AIcjmWREzWR4yVfqeRWAFQn02.Method5085(n, c);
        }
    }

    public final boolean Method1979() {
        return Intrinsics.areEqual((Object)Minecraft.getMinecraft().currentScreen, (Object)leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16267.Field9668.Method4955());
    }

    private final int Method1980() {
        int n = (int)-1867221476L ^ 0x90B4761C;
        for (Object object : this.Field9671) {
            n += object.Method5086();
        }
        SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] skQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.values();
        int n2 = skQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray.length;
        int n3 = (int)((long)8715902 ^ (long)8715902);
        while (n3 < n2) {
            Object object;
            object = skQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[n3];
            n += this.Field9670 * (((int)-475466307L ^ 0xE3A8F5BC) << 1) + fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(((SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)((Object)object)).Method4956());
            ++n3;
        }
        return n;
    }

    public SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6(@NotNull @NotNull SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi skQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)skQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi), (String)"defaultSelection");
        this.Field9669 = new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(((int)258057611L ^ 0xF61A58E) << 2, ((int)-749242576L ^ 0xD3577735) << 2, (int)((long)-1474180700 ^ (long)-1474180703) << 2, (int)((long)803808324 ^ (long)803808349) << 3);
        this.Field9670 = (int)((long)-618169981 ^ (long)-618169978);
        this.Field9671 = new ArrayList();
        this.Field9668 = skQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
    }

    private static String Method1981(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1124972422 ^ (long)-1124972422);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-679671952 ^ (long)-679671921);
            int n2 = ((int)1899617048L ^ 0x7139DB5D) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-297420572 ^ (long)-297424425) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

