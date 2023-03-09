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
import lavahack.client.Class2143;
import lavahack.client.Class258;
import lavahack.client.Class759;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0003!\"#B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0003X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0003X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0003X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0017\u001a\u00020\u0003X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0007R\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u0003X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0007R\u0014\u0010\u001f\u001a\u00020\u0003X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0007\u00a8\u0006$"}, d2={"Lcom/kisman/cc/util/manager/file/ConfigManager;", "", "name", "", "(Ljava/lang/String;)V", "friendsPrefix", "getFriendsPrefix", "()Ljava/lang/String;", "hudEditorPrefix", "getHudEditorPrefix", "hudModulesPrefix", "getHudModulesPrefix", "loader", "Lcom/kisman/cc/util/manager/file/ConfigManager$Load;", "getLoader", "()Lcom/kisman/cc/util/manager/file/ConfigManager$Load;", "moduleSaver", "Lcom/kisman/cc/util/manager/file/ConfigManager$ModuleSave;", "getModuleSaver", "()Lcom/kisman/cc/util/manager/file/ConfigManager$ModuleSave;", "modulesPrefix", "getModulesPrefix", "getName", "path", "getPath", "saver", "Lcom/kisman/cc/util/manager/file/ConfigManager$Save;", "getSaver", "()Lcom/kisman/cc/util/manager/file/ConfigManager$Save;", "settingsPrefix", "getSettingsPrefix", "suffix", "getSuffix", "Load", "ModuleSave", "Save", "kisman.cc"})
public final class Class985 {
    @NotNull
    private final Class2143 Field12213;
    @NotNull
    private final Class258 Field12214;
    @NotNull
    private final Class759 Field12215;
    @NotNull
    private final String Field12216 = ".kis";
    @NotNull
    private final String Field12217 = "kisman.cc/";
    @NotNull
    private final String Field12218 = "module";
    @NotNull
    private final String Field12219 = "setting";
    @NotNull
    private final String Field12220 = "hud_module";
    @NotNull
    private final String Field12221 = "hud_editor";
    @NotNull
    private final String Field12222 = "friend";
    @NotNull
    private final String Field12223;
    private int Field12224;

    @NotNull
    @NotNull
    public final Class2143 Method3997() {
        return this.Field12213;
    }

    @NotNull
    @NotNull
    public final Class258 Method3998() {
        return this.Field12214;
    }

    @NotNull
    @NotNull
    public final Class759 Method3999() {
        return this.Field12215;
    }

    @NotNull
    @NotNull
    public final String Method4000() {
        return this.Field12216;
    }

    @NotNull
    @NotNull
    public final String Method4001() {
        return this.Field12217;
    }

    @NotNull
    @NotNull
    public final String Method4002() {
        return this.Field12218;
    }

    @NotNull
    @NotNull
    public final String Method4003() {
        return this.Field12219;
    }

    @NotNull
    @NotNull
    public final String Method4004() {
        return this.Field12220;
    }

    @NotNull
    @NotNull
    public final String Method4005() {
        return this.Field12221;
    }

    @NotNull
    @NotNull
    public final String Method4006() {
        return this.Field12222;
    }

    @NotNull
    @NotNull
    public final String Method4007() {
        return this.Field12223;
    }

    public Class985(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        this.Field12223 = string;
        this.Field12213 = new Class2143(this);
        this.Field12214 = new Class258(this);
        this.Field12215 = new Class759(this);
        this.Field12216 = ".kis";
        this.Field12217 = "kisman.cc/";
        this.Field12218 = "module";
        this.Field12219 = "setting";
        this.Field12220 = "hud_module";
        this.Field12221 = "hud_editor";
        this.Field12222 = "friend";
    }

    private static String Method4008(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 33;
            cArray2[n] = (char)(cArray[n] ^ (0x35B8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

