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

import com.kisman.cc.util.Class2027;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1172;
import lavahack.client.Class1178;
import lavahack.client.Class1233;
import lavahack.client.Class1258;
import lavahack.client.Class1796;
import lavahack.client.Class753;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.input.Mouse;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001*B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010J\b\u0010!\u001a\u00020\u0010H\u0002J\u0006\u0010\"\u001a\u00020\u001eJ\u0006\u0010#\u001a\u00020\u0014J\u0016\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0010J\u001e\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010R!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0004\u00a8\u0006+"}, d2={"Lcom/kisman/cc/gui/selectionbar/SelectionBar;", "", "defaultSelection", "Lcom/kisman/cc/gui/selectionbar/SelectionBar$Guis;", "(Lcom/kisman/cc/gui/selectionbar/SelectionBar$Guis;)V", "additions", "Ljava/util/ArrayList;", "Lcom/kisman/cc/gui/selectionbar/element/IElement;", "Lkotlin/collections/ArrayList;", "getAdditions", "()Ljava/util/ArrayList;", "backgroundColor", "Lcom/kisman/cc/util/Colour;", "getBackgroundColor", "()Lcom/kisman/cc/util/Colour;", "offset", "", "getOffset", "()I", "reinit", "", "getReinit", "()Z", "setReinit", "(Z)V", "selection", "getSelection", "()Lcom/kisman/cc/gui/selectionbar/SelectionBar$Guis;", "setSelection", "drawScreen", "", "mouseX", "mouseY", "getSelectionBarWidth", "initGui", "isValid", "keyTyped", "char", "", "key", "mouseClicked", "button", "Guis", "kisman.cc"})
public final class Class399 {
    @NotNull
    private Class1233 Field9668;
    @NotNull
    private final Class2027 Field9669;
    private final int Field9670 = 5;
    @NotNull
    private final ArrayList Field9671;
    private boolean Field9672;
    private String Field9673 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final Class1233 Method1968() {
        return this.Field9668;
    }

    public final void Method1969(@NotNull @NotNull Class1233 class1233) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)class1233), (String)"<set-?>");
        this.Field9668 = class1233;
    }

    @NotNull
    @NotNull
    public final Class2027 Method1970() {
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
        this.Field9672 = true;
    }

    public final void Method1976(int n, int n2) {
        int n3 = new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth() / 2 - this.Method1980() / 2;
        Class753.drawRectWH(n3, 0.0, this.Method1980(), Class1178.Method4748() + this.Field9670 * 2, this.Field9669.Method3626());
        for (Object object : this.Field9671) {
            if (this.Field9672 && ((List)this.Field9668.Method4962().invoke()).contains(object)) {
                object.Method5082(n3, 0);
            }
            object.Method5083(n3, 0, n, n2);
            n3 += object.Method5086();
        }
        this.Field9672 = false;
        Class1233[] class1233Array = Class1233.values();
        int n4 = class1233Array.length;
        int n5 = 0;
        while (n5 < n4) {
            Object object;
            object = class1233Array[n5];
            Class1178.Method4745(((Class1233)((Object)object)).Method4956(), n3 + this.Field9670, this.Field9670, object == this.Field9668 ? Class1172.Method4709(100, 100) : -1);
            if (Mouse.isButtonDown((int)0) && n >= n3 && n <= n3 + this.Field9670 * 2 + Class1178.Method4741(((Class1233)((Object)object)).Method4956()) && n2 >= 0 && n2 <= this.Field9670 * 2 + Class1178.Method4748()) {
                this.Field9668.Method4960().invoke();
                this.Field9668 = object;
                this.Field9668.Method4959().invoke();
                this.Field9672 = true;
            }
            n3 += this.Field9670 * 2 + Class1178.Method4741(((Class1233)((Object)object)).Method4956());
            ++n5;
        }
    }

    public final boolean Method1977(int n, int n2, int n3) {
        Iterator iterator = this.Field9671.iterator();
        while (iterator.hasNext()) {
            Class1258 class1258 = (Class1258)iterator.next();
            class1258.Method5084(n, n2, n3);
        }
        return true;
    }

    public final void Method1978(char c, int n) {
        Iterator iterator = this.Field9671.iterator();
        while (iterator.hasNext()) {
            Class1258 class1258 = (Class1258)iterator.next();
            class1258.Method5085(n, c);
        }
    }

    public final boolean Method1979() {
        return Intrinsics.areEqual((Object)Minecraft.getMinecraft().currentScreen, (Object)Class1796.Field16241.Field16267.Field9668.Method4955());
    }

    private final int Method1980() {
        int n = 0;
        for (Object object : this.Field9671) {
            n += object.Method5086();
        }
        Class1233[] class1233Array = Class1233.values();
        int n2 = class1233Array.length;
        int n3 = 0;
        while (n3 < n2) {
            Object object;
            object = class1233Array[n3];
            n += this.Field9670 * 2 + Class1178.Method4741(((Class1233)((Object)object)).Method4956());
            ++n3;
        }
        return n;
    }

    public Class399(@NotNull @NotNull Class1233 class1233) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)class1233), (String)"defaultSelection");
        this.Field9669 = new Class2027(20, 20, 20, 200);
        this.Field9670 = 5;
        this.Field9671 = new ArrayList();
        this.Field9668 = class1233;
    }

    private static String Method1981(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 138;
            cArray2[n] = (char)(cArray[n] ^ (0x2266 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

