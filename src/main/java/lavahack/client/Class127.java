/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.Settings$Setting
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import baritone.api.Settings;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1796;
import lavahack.client.Class254;
import lavahack.client.Class44;
import lavahack.client.Class618;
import lavahack.client.Class785;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u00000\u0006R\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0018\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u00000\u0006R\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/features/module/client/baritone/BaritoneSetting;", "T", "", "lavahackSetting", "Lcom/kisman/cc/settings/Setting;", "baritoneSetting", "Lbaritone/api/Settings$Setting;", "Lbaritone/api/Settings;", "(Lcom/kisman/cc/settings/Setting;Lbaritone/api/Settings$Setting;)V", "onChange", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/client/settings/EventSettingChange;", "kisman.cc"})
public final class Class127 {
    private final Class618 Field8437;
    private final Class44 Field8438;
    private final Settings.Setting Field8439;
    private String Field8440 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class127(@NotNull @NotNull Class44 class44, @NotNull @NotNull Settings.Setting setting) {
        Intrinsics.checkParameterIsNotNull((Object)class44, (String)"lavahackSetting");
        Intrinsics.checkParameterIsNotNull((Object)setting, (String)"baritoneSetting");
        this.Field8438 = class44;
        this.Field8439 = setting;
        this.Field8437 = new Class618((Class254)new Class785(this), new Predicate[0]);
        Class1796.Field16242.Method706(this.Field8437);
    }

    public static final Class44 Method857(Class127 class127) {
        return class127.Field8438;
    }

    public static final Settings.Setting Method858(Class127 class127) {
        return class127.Field8439;
    }

    private static String Method859(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 225;
            cArray2[n] = (char)(cArray[n] ^ (0x4CF3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

