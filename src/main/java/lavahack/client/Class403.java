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
import lavahack.client.Class1254;
import lavahack.client.Class1736;
import lavahack.client.Class2163;
import lavahack.client.Class250;
import lavahack.client.Class44;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2={"Lcom/kisman/cc/settings/ShadersSetting;", "", "setting", "Lcom/kisman/cc/settings/Setting;", "type", "Lcom/kisman/cc/util/enums/ShadersObjectTypes;", "option", "Lcom/kisman/cc/util/enums/dynamic/ShadersObjectsEnum$ShadersObjects;", "shader", "Lcom/kisman/cc/util/enums/ShadersShaders;", "typeS", "Lcom/kisman/cc/util/enums/ShadersSettingTypes;", "shaderUniformIndex", "", "(Lcom/kisman/cc/settings/Setting;Lcom/kisman/cc/util/enums/ShadersObjectTypes;Lcom/kisman/cc/util/enums/dynamic/ShadersObjectsEnum$ShadersObjects;Lcom/kisman/cc/util/enums/ShadersShaders;Lcom/kisman/cc/util/enums/ShadersSettingTypes;I)V", "getOption", "()Lcom/kisman/cc/util/enums/dynamic/ShadersObjectsEnum$ShadersObjects;", "getSetting", "()Lcom/kisman/cc/settings/Setting;", "getShader", "()Lcom/kisman/cc/util/enums/ShadersShaders;", "getShaderUniformIndex", "()I", "getType", "()Lcom/kisman/cc/util/enums/ShadersObjectTypes;", "getTypeS", "()Lcom/kisman/cc/util/enums/ShadersSettingTypes;", "kisman.cc"})
public final class Class403 {
    @NotNull
    private final Class44 Field9679;
    @NotNull
    private final Class1736 Field9680;
    @NotNull
    private final Class250 Field9681;
    @Nullable
    private final Class2163 Field9682;
    @NotNull
    private final Class1254 Field9683;
    private final int Field9684;
    private int Field9685;

    @NotNull
    @NotNull
    public final Class44 Method1984() {
        return this.Field9679;
    }

    @NotNull
    @NotNull
    public final Class1736 Method1985() {
        return this.Field9680;
    }

    @NotNull
    @NotNull
    public final Class250 Method1986() {
        return this.Field9681;
    }

    @Nullable
    @Nullable
    public final Class2163 Method1987() {
        return this.Field9682;
    }

    @NotNull
    @NotNull
    public final Class1254 Method1988() {
        return this.Field9683;
    }

    public final int Method1989() {
        return this.Field9684;
    }

    public Class403(@NotNull @NotNull Class44 class44, @NotNull @NotNull Class1736 class1736, @NotNull @NotNull Class250 class250, @Nullable @Nullable Class2163 class2163, @NotNull @NotNull Class1254 class1254, int n) {
        Intrinsics.checkParameterIsNotNull((Object)class44, (String)"setting");
        Intrinsics.checkParameterIsNotNull((Object)((Object)class1736), (String)"type");
        Intrinsics.checkParameterIsNotNull((Object)((Object)class250), (String)"option");
        Intrinsics.checkParameterIsNotNull((Object)((Object)class1254), (String)"typeS");
        this.Field9679 = class44;
        this.Field9680 = class1736;
        this.Field9681 = class250;
        this.Field9682 = class2163;
        this.Field9683 = class1254;
        this.Field9684 = n;
    }

    private static String Method1990(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 82;
            cArray2[n] = (char)(cArray[n] ^ (0x2CD6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

