/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.util.function.BooleanSupplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.H22WL6t5MR2Pqcu834tlbrobCumxlu0J;
import lavahack.client.QPlUy5UX00sJeOo267en2L4h1DlaeWfq;
import lavahack.client.U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n;
import lavahack.client.g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4;
import lavahack.client.zbns26JiHwo42IcUVKanfTHCxfIoRHEN;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u00a2\u0006\u0002\u0010\u0011J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0016J\b\u0010 \u001a\u00020\tH\u0016J\b\u0010!\u001a\u00020\tH\u0016J\b\u0010\"\u001a\u00020\tH\u0016J\b\u0010#\u001a\u00020\tH\u0016J\b\u0010$\u001a\u00020\tH\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002J \u0010'\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0016J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u0010\u0010*\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\tH\u0016J\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\tH\u0016J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\tH\u0016J\u0010\u0010/\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u00100\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020&H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2={"Lcom/kisman/cc/gui/halq/components/sub/combobox/OptionElement;", "Lcom/kisman/cc/gui/api/Component;", "combobox", "Lcom/kisman/cc/gui/halq/components/sub/ModeButton;", "binder", "Lcom/kisman/cc/features/Binder;", "name", "", "index", "", "visible", "Ljava/util/function/BooleanSupplier;", "x", "y", "offset", "count", "layer", "(Lcom/kisman/cc/gui/halq/components/sub/ModeButton;Lcom/kisman/cc/features/Binder;Ljava/lang/String;ILjava/util/function/BooleanSupplier;IIIII)V", "getIndex", "()I", "getName", "()Ljava/lang/String;", "getOffset", "setOffset", "(I)V", "getVisible", "()Ljava/util/function/BooleanSupplier;", "width", "drawScreen", "", "mouseX", "mouseY", "getCount", "getHeight", "getLayer", "getX", "getY", "isMouseOnButton", "", "mouseClicked", "button", "setCount", "setLayer", "setOff", "newOff", "setWidth", "setX", "setY", "updateComponent", "kisman.cc"})
public final class xP8niJiNqGbbrUdaOEE4PhpL2LG3Z4yk
implements QPlUy5UX00sJeOo267en2L4h1DlaeWfq {
    private int Field11400;
    private final H22WL6t5MR2Pqcu834tlbrobCumxlu0J Field11401;
    private final g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh Field11402;
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
        QPlUy5UX00sJeOo267en2L4h1DlaeWfq.super.Method623(n, n2);
        double d = this.Field11406;
        double d2 = this.Field11407 + this.Field11408;
        double d3 = this.Field11400;
        double d4 = this.Method631();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14584;
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"HalqGui.backgroundColor");
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH(d, d2, d3, d4, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method3626());
        zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Method1224(this.Field11403, this.Field11406, this.Field11407 + this.Field11408, this.Field11400, this.Method632());
        if (!U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Field10935.Method7141(this.Field11402)) return;
        zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Method1226(U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Field10935.Method7140(this.Field11402), this.Field11403, this.Field11406, (double)this.Field11407 + (double)this.Field11408, this.Field11400, this.Method632(), this.Field11409, (int)1591633261L ^ 0x5EDE656E);
    }

    @Override
    public void Method625(int n, int n2, int n3) {
        if (!this.Method3381(n, n2)) return;
        if (n3 != 0) return;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field11401.Field10088;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"combobox.setting");
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method353(this.Field11404);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field11401.Field10088;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"combobox.setting");
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method360(this.Field11403);
        this.Field11401.Field10089 = this;
        this.Field11401.Field10094 = (int)((long)-1952668770 ^ (long)-1952668770);
    }

    private final boolean Method3381(int n, int n2) {
        int n3;
        if (n > this.Field11406 && n < this.Field11406 + this.Field11400 && n2 > this.Field11407 + this.Field11408 && n2 < this.Field11407 + this.Field11408 + this.Method632()) {
            n3 = (int)((long)244880772 ^ (long)244880773);
            return n3 != 0;
        }
        n3 = (int)((long)1877067760 ^ (long)1877067760);
        return n3 != 0;
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
        int n;
        if (this.Field11405.getAsBoolean() && (Intrinsics.areEqual((Object)this.Field11401.Field10089, (Object)this) ^ (int)((long)580740523 ^ (long)580740522)) != 0) {
            n = (int)((long)1994887224 ^ (long)1994887225);
            return n != 0;
        }
        n = (int)((long)2056188283 ^ (long)2056188283);
        return n != 0;
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

    public xP8niJiNqGbbrUdaOEE4PhpL2LG3Z4yk(@NotNull @NotNull H22WL6t5MR2Pqcu834tlbrobCumxlu0J h22WL6t5MR2Pqcu834tlbrobCumxlu0J, @NotNull @NotNull g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh2, @NotNull @NotNull String string, int n, @NotNull @NotNull BooleanSupplier booleanSupplier, int n2, int n3, int n4, int n5, int n6) {
        Intrinsics.checkParameterIsNotNull((Object)h22WL6t5MR2Pqcu834tlbrobCumxlu0J, (String)"combobox");
        Intrinsics.checkParameterIsNotNull((Object)g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh2, (String)"binder");
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        Intrinsics.checkParameterIsNotNull((Object)booleanSupplier, (String)"visible");
        this.Field11401 = h22WL6t5MR2Pqcu834tlbrobCumxlu0J;
        this.Field11402 = g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh2;
        this.Field11403 = string;
        this.Field11404 = n;
        this.Field11405 = booleanSupplier;
        this.Field11406 = n2;
        this.Field11407 = n3;
        this.Field11408 = n4;
        this.Field11409 = n5;
        this.Field11410 = n6;
        this.Field11400 = zbns26JiHwo42IcUVKanfTHCxfIoRHEN.Method3992(this.Field11410, ((int)1515165689L ^ 0x5A4F97F6) << 3);
    }

    private static String Method3387(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1376944443 ^ (long)-1376944443);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)460905280L ^ 0x1B78DBBF);
            int n2 = (int)((long)88050030 ^ (long)88050059);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1251263741 ^ (long)-1251267756) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

