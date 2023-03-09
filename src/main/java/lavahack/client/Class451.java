/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1172;
import lavahack.client.Class1996;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class91;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\u0000H\u0016J\b\u0010\f\u001a\u00020\u0000H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2={"Lcom/kisman/cc/settings/util/HudModuleColorPattern;", "Lcom/kisman/cc/settings/util/AbstractPattern;", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "astolfo", "Lcom/kisman/cc/settings/Setting;", "color", "group_", "Lcom/kisman/cc/settings/types/SettingGroup;", "Lcom/kisman/cc/util/Colour;", "init", "preInit", "kisman.cc"})
public final class Class451
extends Class91 {
    private final Class1996 Field9878;
    private final Class44 Field9879;
    private final Class44 Field9880;
    private String Field9881 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public Class451 Method2149() {
        if (this.Method769() == null) return this;
        Class1996 class1996 = this.Method769();
        if (class1996 == null) {
            Intrinsics.throwNpe();
        }
        class1996.Method7406(this.Field9878);
        return this;
    }

    @Override
    public Object Method778() {
        return this.Method2149();
    }

    @NotNull
    @NotNull
    public Class451 Method2150() {
        this.Method780().Method24(this.Field9878);
        this.Method780().Method23(this.Field9879);
        this.Method780().Method23(this.Field9880);
        return this;
    }

    @Override
    public Object Method779() {
        return this.Method2150();
    }

    @NotNull
    @NotNull
    public final Class2027 Method2151() {
        Class2027 class2027;
        if (this.Field9879.Method365()) {
            class2027 = new Class2027(Class1172.Method4709(100, 100));
            return class2027;
        }
        Class2027 class20272 = this.Field9880.Method339();
        class2027 = class20272;
        Intrinsics.checkExpressionValueIsNotNull((Object)class20272, (String)"color.colour");
        return class2027;
    }

    public Class451(@NotNull @NotNull Class42 class42) {
        Intrinsics.checkParameterIsNotNull((Object)class42, (String)"module");
        super(class42);
        this.Field9878 = new Class1996(new Class44("Color", class42));
        this.Field9879 = this.Field9878.Method7405(new Class44("Astolfo", class42, false));
        this.Field9880 = this.Field9878.Method7405(new Class44("Color", class42, new Class2027(255, 0, 0, 255)));
    }

    private static String Method781(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 241;
            cArray2[n] = (char)(cArray[n] ^ (0x22D3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

