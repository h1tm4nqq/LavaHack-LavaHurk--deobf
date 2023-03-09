/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1996;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class91;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u0000H\u0016J\b\u0010\u000b\u001a\u00020\u0000H\u0016R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/settings/util/MovableRendererPattern;", "Lcom/kisman/cc/settings/util/AbstractPattern;", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "fadeLength", "Lcom/kisman/cc/settings/Setting;", "lengthsGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "movingLength", "init", "preInit", "kisman.cc"})
public final class Class1883
extends Class91 {
    private final Class1996 Field16680;
    @JvmField
    @NotNull
    public final Class44 Field16681;
    @JvmField
    @NotNull
    public final Class44 Field16682;
    private String Field16683 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public Class1883 Method6986() {
        if (this.Method769() == null) return this;
        Class1996 class1996 = this.Method769();
        if (class1996 == null) return this;
        class1996.Method7406(this.Field16680);
        return this;
    }

    @Override
    public Object Method778() {
        return this.Method6986();
    }

    @NotNull
    @NotNull
    public Class1883 Method6987() {
        this.Method780().Method24(this.Field16680);
        this.Method780().Method23(this.Field16681);
        this.Method780().Method23(this.Field16682);
        return this;
    }

    @Override
    public Object Method779() {
        return this.Method6987();
    }

    public Class1883(@NotNull @NotNull Class42 class42) {
        Intrinsics.checkParameterIsNotNull((Object)class42, (String)"module");
        super(class42);
        this.Field16680 = this.Method776(new Class1996(new Class44("Lengths", class42)));
        Class44 class44 = new Class44("Moving Length", class42, Double.longBitsToDouble((long)1308049592 ^ 0x407900004DF740B8L), 0.0, Double.longBitsToDouble(4652007308841189376L), Class467.Field9943).Method355("Moving");
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Setting(\"Moving Length\",\u2026.TIME).setTitle(\"Moving\")");
        this.Field16681 = this.Method775(this.Field16680.Method7405(class44));
        Class44 class442 = new Class44("Fade Length", class42, Double.longBitsToDouble(4641240890982006784L), 0.0, Double.longBitsToDouble((long)699789580 ^ 0x408F400029B5F10CL), Class467.Field9943).Method355("Fade");
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"Setting(\"Fade Length\", m\u2026pe.TIME).setTitle(\"Fade\")");
        this.Field16682 = this.Method775(this.Field16680.Method7405(class442));
    }

    private static String Method781(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 54;
            cArray2[n] = (char)(cArray[n] ^ (0xD1E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

