//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.function.*;
import kotlin.jvm.internal.*;
import com.kisman.cc.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t?\u0006\u0002\u0010\u0011J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0016J\b\u0010 \u001a\u00020\tH\u0016J\b\u0010!\u001a\u00020\tH\u0016J\b\u0010\"\u001a\u00020\tH\u0016J\b\u0010#\u001a\u00020\tH\u0016J\b\u0010$\u001a\u00020\tH\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002J \u0010'\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0016J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u0010\u0010*\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\tH\u0016J\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\tH\u0016J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\tH\u0016J\u0010\u0010/\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u00100\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020&H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e?\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t?\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e?\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007?\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b?\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\tX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e?\u0006\u0002\n\u0000?\u00061" }, d2 = { "Lcom/kisman/cc/gui/halq/components/sub/combobox/OptionElement;", "Lcom/kisman/cc/gui/api/Component;", "combobox", "Lcom/kisman/cc/gui/halq/components/sub/ModeButton;", "binder", "Lcom/kisman/cc/features/Binder;", "name", "", "index", "", "visible", "Ljava/util/function/BooleanSupplier;", "x", "y", "offset", "count", "layer", "(Lcom/kisman/cc/gui/halq/components/sub/ModeButton;Lcom/kisman/cc/features/Binder;Ljava/lang/String;ILjava/util/function/BooleanSupplier;IIIII)V", "getIndex", "()I", "getName", "()Ljava/lang/String;", "getOffset", "setOffset", "(I)V", "getVisible", "()Ljava/util/function/BooleanSupplier;", "width", "drawScreen", "", "mouseX", "mouseY", "getCount", "getHeight", "getLayer", "getX", "getY", "isMouseOnButton", "", "mouseClicked", "button", "setCount", "setLayer", "setOff", "newOff", "setWidth", "setX", "setY", "updateComponent", "kisman.cc" })
public final class Class801 implements Class1520
{
    private int Field11400;
    private final Class502 Field11401;
    private final Class1929 Field11402;
    @NotNull
    private final String Field11403;
    private final int Field11404;
    @NotNull
    private final BooleanSupplier Field11405;
    private int Field11406;
    private int Field11407;
    private int Field11408;
    private int Field11409;
    private int Field11410;
    private int Field11411;
    
    public void Method623(final int n, final int n2) {
        super.Method623(n, n2);
        final double n3 = this.Field11406;
        final double n4 = this.Field11407 + this.Field11408;
        final double n5 = this.Field11400;
        final double n6 = this.Method631();
        final Class2027 field14584 = Class1419.Field14584;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14584, "HalqGui.backgroundColor");
        Class753.drawRectWH(n3, n4, n5, n6, field14584.Method3626());
        Class1419.Method1224(this.Field11403, this.Field11406, this.Field11407 + this.Field11408, this.Field11400, this.Method632());
        if (Class695.Field10935.Method7141((Class695)this.Field11402)) {
            Class1419.Method1226(Class695.Field10935.Method7140((Class695)this.Field11402), this.Field11403, (double)this.Field11406, this.Field11407 + (double)this.Field11408, (double)this.Field11400, (double)this.Method632(), this.Field11409, 3);
        }
    }
    
    public void Method625(final int n, final int n2, final int n3) {
        if (this.Method3381(n, n2) && n3 == 0) {
            final Class44 field10088 = this.Field11401.Field10088;
            Intrinsics.checkExpressionValueIsNotNull((Object)field10088, "combobox.setting");
            field10088.Method353(this.Field11404);
            final Class44 field10089 = this.Field11401.Field10088;
            Intrinsics.checkExpressionValueIsNotNull((Object)field10089, "combobox.setting");
            field10089.Method360(this.Field11403);
            this.Field11401.Field10089 = this;
            this.Field11401.Field10094 = false;
        }
    }
    
    private final boolean Method3381(final int n, final int n2) {
        return n > this.Field11406 && n < this.Field11406 + this.Field11400 && n2 > this.Field11407 + this.Field11408 && n2 < this.Field11407 + this.Field11408 + this.Method632();
    }
    
    public void Method627(final int field11406, final int field11407) {
        this.Field11406 = field11406;
        this.Field11407 = field11407;
    }
    
    public int Method631() {
        return this.Method632();
    }
    
    public void Method634(final int field11400) {
        this.Field11400 = field11400;
    }
    
    public void Method629(final int field11408) {
        this.Field11408 = field11408;
    }
    
    public void Method630(final int field11409) {
        this.Field11409 = field11409;
    }
    
    public int Method633() {
        return this.Field11409;
    }
    
    public void Method635(final int field11406) {
        this.Field11406 = field11406;
    }
    
    public int Method636() {
        return this.Field11406;
    }
    
    public void Method637(final int field11407) {
        this.Field11407 = field11407;
    }
    
    public int Method638() {
        return this.Field11407 + this.Field11408;
    }
    
    public void Method639(final int field11410) {
        this.Field11410 = field11410;
    }
    
    public int Method640() {
        return this.Field11410;
    }
    
    public boolean Method641() {
        return this.Field11405.getAsBoolean() && (Intrinsics.areEqual((Object)this.Field11401.Field10089, (Object)this) ^ true);
    }
    
    @NotNull
    @NotNull
    public final String Method3382() {
        return this.Field11403;
    }
    
    public final int Method3383() {
        return this.Field11404;
    }
    
    @NotNull
    @NotNull
    public final BooleanSupplier Method3384() {
        return this.Field11405;
    }
    
    public final int Method3385() {
        return this.Field11408;
    }
    
    public final void Method3386(final int field11408) {
        this.Field11408 = field11408;
    }
    
    public Class801(@NotNull @NotNull final Class502 field11401, @NotNull @NotNull final Class1929 field11402, @NotNull @NotNull final String field11403, final int field11404, @NotNull @NotNull final BooleanSupplier field11405, final int field11406, final int field11407, final int field11408, final int field11409, final int field11410) {
        Intrinsics.checkParameterIsNotNull((Object)field11401, "combobox");
        Intrinsics.checkParameterIsNotNull((Object)field11402, "binder");
        Intrinsics.checkParameterIsNotNull((Object)field11403, "name");
        Intrinsics.checkParameterIsNotNull((Object)field11405, "visible");
        this.Field11401 = field11401;
        this.Field11402 = field11402;
        this.Field11403 = field11403;
        this.Field11404 = field11404;
        this.Field11405 = field11405;
        this.Field11406 = field11406;
        this.Field11407 = field11407;
        this.Field11408 = field11408;
        this.Field11409 = field11409;
        this.Field11410 = field11410;
        this.Field11400 = Class981.Method3992(this.Field11410, 120);
    }
    
    private static String Method3387(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1057 ^ 0xE5));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
