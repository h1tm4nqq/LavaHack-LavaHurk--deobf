/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class162;
import lavahack.client.Class362;
import lavahack.client.Class44;
import lavahack.client.Class549;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2={"Lcom/kisman/cc/settings/CharmsRewriteSetting;", "", "setting", "Lcom/kisman/cc/settings/Setting;", "typeE", "Lcom/kisman/cc/util/enums/CharmsRewriteEntityTypes;", "typeS", "Lcom/kisman/cc/util/enums/CharmsRewriteTypes;", "(Lcom/kisman/cc/settings/Setting;Lcom/kisman/cc/util/enums/CharmsRewriteEntityTypes;Lcom/kisman/cc/util/enums/CharmsRewriteTypes;)V", "option", "Lcom/kisman/cc/util/enums/dynamic/CharmsRewriteOptionsEnum$CharmsRewriteOptions;", "(Lcom/kisman/cc/settings/Setting;Lcom/kisman/cc/util/enums/CharmsRewriteEntityTypes;Lcom/kisman/cc/util/enums/CharmsRewriteTypes;Lcom/kisman/cc/util/enums/dynamic/CharmsRewriteOptionsEnum$CharmsRewriteOptions;)V", "getOption", "()Lcom/kisman/cc/util/enums/dynamic/CharmsRewriteOptionsEnum$CharmsRewriteOptions;", "getSetting", "()Lcom/kisman/cc/settings/Setting;", "getTypeE", "()Lcom/kisman/cc/util/enums/CharmsRewriteEntityTypes;", "getTypeS", "()Lcom/kisman/cc/util/enums/CharmsRewriteTypes;", "kisman.cc"})
public final class Class1580 {
    @NotNull
    private final Class44 Field15402;
    @NotNull
    private final Class549 Field15403;
    @NotNull
    private final Class162 Field15404;
    @Nullable
    private final Class362 Field15405;
    private String Field15406 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final Class44 Method6219() {
        return this.Field15402;
    }

    @NotNull
    @NotNull
    public final Class549 Method6220() {
        return this.Field15403;
    }

    @NotNull
    @NotNull
    public final Class162 Method6221() {
        return this.Field15404;
    }

    @Nullable
    @Nullable
    public final Class362 Method6222() {
        return this.Field15405;
    }

    public Class1580(@NotNull @NotNull Class44 class44, @NotNull @NotNull Class549 class549, @NotNull @NotNull Class162 class162, @Nullable @Nullable Class362 class362) {
        Intrinsics.checkParameterIsNotNull((Object)class44, (String)"setting");
        Intrinsics.checkParameterIsNotNull((Object)((Object)class549), (String)"typeE");
        Intrinsics.checkParameterIsNotNull((Object)((Object)class162), (String)"typeS");
        this.Field15402 = class44;
        this.Field15403 = class549;
        this.Field15404 = class162;
        this.Field15405 = class362;
    }

    public Class1580(@NotNull @NotNull Class44 class44, @NotNull @NotNull Class549 class549, @NotNull @NotNull Class162 class162) {
        Intrinsics.checkParameterIsNotNull((Object)class44, (String)"setting");
        Intrinsics.checkParameterIsNotNull((Object)((Object)class549), (String)"typeE");
        Intrinsics.checkParameterIsNotNull((Object)((Object)class162), (String)"typeS");
        this(class44, class549, class162, null);
    }

    private static String Method6223(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 157;
            cArray2[n] = (char)(cArray[n] ^ (0x37 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

