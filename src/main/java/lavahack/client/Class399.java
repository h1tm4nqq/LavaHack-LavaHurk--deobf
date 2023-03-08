//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.*;
import net.minecraft.client.gui.*;
import org.lwjgl.input.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001*B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010J\b\u0010!\u001a\u00020\u0010H\u0002J\u0006\u0010\"\u001a\u00020\u001eJ\u0006\u0010#\u001a\u00020\u0014J\u0016\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0010J\u001e\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010R!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f?\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0086D?\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0004?\u0006+" }, d2 = { "Lcom/kisman/cc/gui/selectionbar/SelectionBar;", "", "defaultSelection", "Lcom/kisman/cc/gui/selectionbar/SelectionBar$Guis;", "(Lcom/kisman/cc/gui/selectionbar/SelectionBar$Guis;)V", "additions", "Ljava/util/ArrayList;", "Lcom/kisman/cc/gui/selectionbar/element/IElement;", "Lkotlin/collections/ArrayList;", "getAdditions", "()Ljava/util/ArrayList;", "backgroundColor", "Lcom/kisman/cc/util/Colour;", "getBackgroundColor", "()Lcom/kisman/cc/util/Colour;", "offset", "", "getOffset", "()I", "reinit", "", "getReinit", "()Z", "setReinit", "(Z)V", "selection", "getSelection", "()Lcom/kisman/cc/gui/selectionbar/SelectionBar$Guis;", "setSelection", "drawScreen", "", "mouseX", "mouseY", "getSelectionBarWidth", "initGui", "isValid", "keyTyped", "char", "", "key", "mouseClicked", "button", "Guis", "kisman.cc" })
public final class Class399
{
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
    
    public final void Method1969(@NotNull @NotNull final Class1233 field9668) {
        Intrinsics.checkParameterIsNotNull((Object)field9668, "<set-?>");
        this.Field9668 = field9668;
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
    
    public final void Method1974(final boolean field9672) {
        this.Field9672 = field9672;
    }
    
    public final void Method1975() {
        this.Field9672 = true;
    }
    
    public final void Method1976(final int n, final int n2) {
        int n3 = new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth() / 2 - this.Method1980() / 2;
        Class753.drawRectWH(n3, 0.0, this.Method1980(), Class1178.Method4748() + this.Field9670 * 2, this.Field9669.Method3626());
        for (final Class1258 class1258 : this.Field9671) {
            if (this.Field9672 && ((List)this.Field9668.Method4962().invoke()).contains(class1258)) {
                class1258.Method5082(n3, 0);
            }
            class1258.Method5083(n3, 0, n, n2);
            n3 += class1258.Method5086();
        }
        this.Field9672 = false;
        for (final Class1233 field9668 : Class1233.values()) {
            Class1178.Method4745(field9668.Method4956(), (double)(n3 + this.Field9670), (double)this.Field9670, (field9668 == this.Field9668) ? Class1172.Method4709(100, 100) : -1);
            if (Mouse.isButtonDown(0) && n >= n3 && n <= n3 + this.Field9670 * 2 + Class1178.Method4741(field9668.Method4956()) && n2 >= 0 && n2 <= this.Field9670 * 2 + Class1178.Method4748()) {
                this.Field9668.Method4960().invoke();
                this.Field9668 = field9668;
                this.Field9668.Method4959().invoke();
                this.Field9672 = true;
            }
            n3 += this.Field9670 * 2 + Class1178.Method4741(field9668.Method4956());
        }
    }
    
    public final boolean Method1977(final int n, final int n2, final int n3) {
        final Iterator<Class1258> iterator = this.Field9671.iterator();
        while (iterator.hasNext()) {
            iterator.next().Method5084(n, n2, n3);
        }
        return true;
    }
    
    public final void Method1978(final char c, final int n) {
        final Iterator<Class1258> iterator = this.Field9671.iterator();
        while (iterator.hasNext()) {
            iterator.next().Method5085(n, c);
        }
    }
    
    public final boolean Method1979() {
        return Intrinsics.areEqual((Object)Minecraft.getMinecraft().currentScreen, (Object)Class1796.Field16241.Field16267.Field9668.Method4955());
    }
    
    private final int Method1980() {
        int n = 0;
        final Iterator<Class1258> iterator = (Iterator<Class1258>)this.Field9671.iterator();
        while (iterator.hasNext()) {
            n += iterator.next().Method5086();
        }
        final Class1233[] values = Class1233.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            n += this.Field9670 * 2 + Class1178.Method4741(values[i].Method4956());
        }
        return n;
    }
    
    public Class399(@NotNull @NotNull final Class1233 field9668) {
        Intrinsics.checkParameterIsNotNull((Object)field9668, "defaultSelection");
        this.Field9669 = new Class2027(20, 20, 20, 200);
        this.Field9671 = new ArrayList();
        this.Field9668 = field9668;
    }
    
    private static String Method1981(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2266 ^ 0x8A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
