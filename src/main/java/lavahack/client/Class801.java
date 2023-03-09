/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.util.function.BooleanSupplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1419;
import lavahack.client.Class1520;
import lavahack.client.Class1929;
import lavahack.client.Class44;
import lavahack.client.Class502;
import lavahack.client.Class695;
import lavahack.client.Class753;
import lavahack.client.Class981;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u00a2\u0006\u0002\u0010\u0011J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0016J\b\u0010 \u001a\u00020\tH\u0016J\b\u0010!\u001a\u00020\tH\u0016J\b\u0010\"\u001a\u00020\tH\u0016J\b\u0010#\u001a\u00020\tH\u0016J\b\u0010$\u001a\u00020\tH\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002J \u0010'\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0016J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u0010\u0010*\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\tH\u0016J\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\tH\u0016J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\tH\u0016J\u0010\u0010/\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u00100\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020&H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2={"Lcom/kisman/cc/gui/halq/components/sub/combobox/OptionElement;", "Lcom/kisman/cc/gui/api/Component;", "combobox", "Lcom/kisman/cc/gui/halq/components/sub/ModeButton;", "binder", "Lcom/kisman/cc/features/Binder;", "name", "", "index", "", "visible", "Ljava/util/function/BooleanSupplier;", "x", "y", "offset", "count", "layer", "(Lcom/kisman/cc/gui/halq/components/sub/ModeButton;Lcom/kisman/cc/features/Binder;Ljava/lang/String;ILjava/util/function/BooleanSupplier;IIIII)V", "getIndex", "()I", "getName", "()Ljava/lang/String;", "getOffset", "setOffset", "(I)V", "getVisible", "()Ljava/util/function/BooleanSupplier;", "width", "drawScreen", "", "mouseX", "mouseY", "getCount", "getHeight", "getLayer", "getX", "getY", "isMouseOnButton", "", "mouseClicked", "button", "setCount", "setLayer", "setOff", "newOff", "setWidth", "setX", "setY", "updateComponent", "kisman.cc"})
public final class Class801
implements Class1520 {
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

    @Override
    public void Method623(int n, int n2) {
        Class1520.super.Method623(n, n2);
        double d = this.Field11406;
        double d2 = this.Field11407 + this.Field11408;
        double d3 = this.Field11400;
        double d4 = this.Method631();
        Class2027 class2027 = Class1419.Field14584;
        Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"HalqGui.backgroundColor");
        Class753.drawRectWH(d, d2, d3, d4, class2027.Method3626());
        Class1419.Method1224(this.Field11403, this.Field11406, this.Field11407 + this.Field11408, this.Field11400, this.Method632());
        if (!Class695.Field10935.Method7141(this.Field11402)) return;
        Class1419.Method1226(Class695.Field10935.Method7140(this.Field11402), this.Field11403, this.Field11406, (double)this.Field11407 + (double)this.Field11408, this.Field11400, this.Method632(), this.Field11409, 3);
    }

    @Override
    public void Method625(int n, int n2, int n3) {
        if (!this.Method3381(n, n2)) return;
        if (n3 != 0) return;
        Class44 class44 = this.Field11401.Field10088;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"combobox.setting");
        class44.Method353(this.Field11404);
        Class44 class442 = this.Field11401.Field10088;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"combobox.setting");
        class442.Method360(this.Field11403);
        this.Field11401.Field10089 = this;
        this.Field11401.Field10094 = false;
    }

    private final boolean Method3381(int n, int n2) {
        if (n <= this.Field11406) return false;
        if (n >= this.Field11406 + this.Field11400) return false;
        if (n2 <= this.Field11407 + this.Field11408) return false;
        if (n2 >= this.Field11407 + this.Field11408 + this.Method632()) return false;
        return true;
    }

    @Override
    public void Method627(int n, int n2) {
        this.Field11406 = n;
        this.Field11407 = n2;
    }

    @Override
    public int Method631() {
        return this.Method632();
    }

    @Override
    public void Method634(int n) {
        this.Field11400 = n;
    }

    @Override
    public void Method629(int n) {
        this.Field11408 = n;
    }

    @Override
    public void Method630(int n) {
        this.Field11409 = n;
    }

    @Override
    public int Method633() {
        return this.Field11409;
    }

    @Override
    public void Method635(int n) {
        this.Field11406 = n;
    }

    @Override
    public int Method636() {
        return this.Field11406;
    }

    @Override
    public void Method637(int n) {
        this.Field11407 = n;
    }

    @Override
    public int Method638() {
        return this.Field11407 + this.Field11408;
    }

    @Override
    public void Method639(int n) {
        this.Field11410 = n;
    }

    @Override
    public int Method640() {
        return this.Field11410;
    }

    @Override
    public boolean Method641() {
        if (!this.Field11405.getAsBoolean()) return false;
        if (!(Intrinsics.areEqual((Object)this.Field11401.Field10089, (Object)this) ^ true)) return false;
        return true;
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

    public final void Method3386(int n) {
        this.Field11408 = n;
    }

    public Class801(@NotNull @NotNull Class502 class502, @NotNull @NotNull Class1929 class1929, @NotNull @NotNull String string, int n, @NotNull @NotNull BooleanSupplier booleanSupplier, int n2, int n3, int n4, int n5, int n6) {
        Intrinsics.checkParameterIsNotNull((Object)class502, (String)"combobox");
        Intrinsics.checkParameterIsNotNull((Object)class1929, (String)"binder");
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        Intrinsics.checkParameterIsNotNull((Object)booleanSupplier, (String)"visible");
        this.Field11401 = class502;
        this.Field11402 = class1929;
        this.Field11403 = string;
        this.Field11404 = n;
        this.Field11405 = booleanSupplier;
        this.Field11406 = n2;
        this.Field11407 = n3;
        this.Field11408 = n4;
        this.Field11409 = n5;
        this.Field11410 = n6;
        this.Field11400 = Class981.Method3992(this.Field11410, 120);
    }

    private static String Method3387(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 229;
            cArray2[n] = (char)(cArray[n] ^ (0x1057 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

