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
import lavahack.client.Class1269;
import lavahack.client.Class1612;
import lavahack.client.Class2007;
import lavahack.client.Class44;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2={"Lcom/kisman/cc/settings/EntityESPSetting;", "", "setting", "Lcom/kisman/cc/settings/Setting;", "pattern", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "typeE", "Lcom/kisman/cc/util/enums/EntityESPTypes;", "typeS", "Lcom/kisman/cc/settings/util/EntityESPRendererPattern$SettingTypes;", "(Lcom/kisman/cc/settings/Setting;Lcom/kisman/cc/settings/util/RenderingRewritePattern;Lcom/kisman/cc/util/enums/EntityESPTypes;Lcom/kisman/cc/settings/util/EntityESPRendererPattern$SettingTypes;)V", "getPattern", "()Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "getSetting", "()Lcom/kisman/cc/settings/Setting;", "getTypeE", "()Lcom/kisman/cc/util/enums/EntityESPTypes;", "getTypeS", "()Lcom/kisman/cc/settings/util/EntityESPRendererPattern$SettingTypes;", "kisman.cc"})
public final class Class2145 {
    @Nullable
    private final Class44 Field17813;
    @Nullable
    private final Class1612 Field17814;
    @NotNull
    private final Class1269 Field17815;
    @NotNull
    private final Class2007 Field17816;
    private int Field17817;

    @Nullable
    @Nullable
    public final Class44 Method7723() {
        return this.Field17813;
    }

    @Nullable
    @Nullable
    public final Class1612 Method7724() {
        return this.Field17814;
    }

    @NotNull
    @NotNull
    public final Class1269 Method7725() {
        return this.Field17815;
    }

    @NotNull
    @NotNull
    public final Class2007 Method7726() {
        return this.Field17816;
    }

    public Class2145(@Nullable @Nullable Class44 class44, @Nullable @Nullable Class1612 class1612, @NotNull @NotNull Class1269 class1269, @NotNull @NotNull Class2007 class2007) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)class1269), (String)"typeE");
        Intrinsics.checkParameterIsNotNull((Object)((Object)class2007), (String)"typeS");
        this.Field17813 = class44;
        this.Field17814 = class1612;
        this.Field17815 = class1269;
        this.Field17816 = class2007;
    }

    private static String Method7727(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 163;
            cArray2[n] = (char)(cArray[n] ^ (0x504D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

