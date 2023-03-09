/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1648;
import lavahack.client.Class1996;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class91;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0000H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0013"}, d2={"Lcom/kisman/cc/settings/util/DamageSyncPattern;", "Lcom/kisman/cc/settings/util/AbstractPattern;", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "damageSync", "Lcom/kisman/cc/settings/Setting;", "damageSyncDelay", "damageSyncMinDamageOffset", "group_", "Lcom/kisman/cc/settings/types/SettingGroup;", "getGroup_", "()Lcom/kisman/cc/settings/types/SettingGroup;", "handler", "Lcom/kisman/cc/util/world/DamageSyncHandler;", "getHandler", "()Lcom/kisman/cc/util/world/DamageSyncHandler;", "init", "preInit", "kisman.cc"})
public final class Class246
extends Class91 {
    @NotNull
    private final Class1996 Field9076;
    private final Class44 Field9077;
    private final Class44 Field9078;
    private final Class44 Field9079;
    @NotNull
    private final Class1648 Field9080;
    private String Field9081 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final Class1996 Method1328() {
        return this.Field9076;
    }

    @NotNull
    @NotNull
    public final Class1648 Method1329() {
        return this.Field9080;
    }

    @NotNull
    @NotNull
    public Class246 Method1330() {
        if (this.Method769() == null) return this;
        Class1996 class1996 = this.Method769();
        if (class1996 == null) return this;
        class1996.Method7406(this.Field9076);
        return this;
    }

    @Override
    public Object Method778() {
        return this.Method1330();
    }

    @NotNull
    @NotNull
    public Class246 Method1331() {
        this.Method780().Method24(this.Field9076);
        this.Method780().Method23(this.Field9077);
        this.Method780().Method23(this.Field9078);
        this.Method780().Method23(this.Field9079);
        return this;
    }

    @Override
    public Object Method779() {
        return this.Method1331();
    }

    public Class246(@NotNull @NotNull Class42 class42) {
        Intrinsics.checkParameterIsNotNull((Object)class42, (String)"module");
        super(class42);
        this.Field9076 = this.Method776(new Class1996(new Class44("Damage Sync", class42)));
        Class44 class44 = new Class44("Damage Sync", class42, false).Method355("State");
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Setting(\"Damage Sync\", m\u2026 false).setTitle(\"State\")");
        this.Field9077 = this.Method775(this.Field9076.Method7405(class44));
        Class44 class442 = new Class44("Damage Sync Delay", class42, Double.longBitsToDouble((long)645728600 ^ 0x407F4000267D0958L), 0.0, Double.longBitsToDouble((long)7074651 ^ 0x409F4000006BF35BL), Class467.Field9943).Method355("Delay");
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"Setting(\"Damage Sync Del\u2026e.TIME).setTitle(\"Delay\")");
        this.Field9078 = this.Method775(this.Field9076.Method7405(class442));
        Class44 class443 = new Class44("Damage Sync Min Damage Offset", class42, Double.longBitsToDouble(0x4014000000000000L), 0.0, Double.longBitsToDouble(4630404104378646528L), true).Method355("Min Offset");
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"Setting(\"Damage Sync Min\u2026e).setTitle(\"Min Offset\")");
        this.Field9079 = this.Method775(this.Field9076.Method7405(class443));
        Supplier supplier = this.Field9077.Method397();
        Intrinsics.checkExpressionValueIsNotNull((Object)supplier, (String)"damageSync.supplierBoolean");
        Supplier supplier2 = this.Field9077.Method395();
        Intrinsics.checkExpressionValueIsNotNull((Object)supplier2, (String)"damageSync.supplierLong");
        Supplier supplier3 = this.Field9077.Method393();
        Intrinsics.checkExpressionValueIsNotNull((Object)supplier3, (String)"damageSync.supplierDouble");
        this.Field9080 = new Class1648(supplier, supplier2, supplier3);
    }

    private static String Method781(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 172;
            cArray2[n] = (char)(cArray[n] ^ (0x30B9 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

