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
import com.kisman.cc.util.Class2027;
import java.awt.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class127;
import lavahack.client.Class254;
import lavahack.client.Class445;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n\u00a2\u0006\u0002\b\u0006"}, d2={"<anonymous>", "", "T", "it", "Lcom/kisman/cc/event/events/client/settings/EventSettingChange;", "kotlin.jvm.PlatformType", "invoke"})
final class Class785
implements Class254 {
    final Class127 Field11306;
    private String Field11307 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method3271((Class445)object);
    }

    public final void Method3271(Class445 class445) {
        if (!Intrinsics.areEqual((Object)class445.Field9851, (Object)Class127.Method857(this.Field11306))) return;
        Object object = Class127.Method858((Class127)this.Field11306).value;
        if (object instanceof Boolean) {
            Class127.Method858((Class127)this.Field11306).value = Class127.Method857(this.Field11306).Method365();
            return;
        }
        if (!(object instanceof Float || object instanceof Double || object instanceof Integer)) {
            if (!(object instanceof Color)) return;
            Settings.Setting setting = Class127.Method858(this.Field11306);
            Class2027 class2027 = Class127.Method857(this.Field11306).Method339();
            Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"lavahackSetting.colour");
            setting.value = class2027.Method3625();
            return;
        }
        Class127.Method858((Class127)this.Field11306).value = Class127.Method857(this.Field11306).Method367();
    }

    Class785(Class127 class127) {
        this.Field11306 = class127;
    }

    private static String Method3272(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 166;
            cArray2[n] = (char)(cArray[n] ^ (0x5C88 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

