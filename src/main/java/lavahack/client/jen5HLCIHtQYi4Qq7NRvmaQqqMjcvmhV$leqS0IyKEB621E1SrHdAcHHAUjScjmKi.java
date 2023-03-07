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
import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.awt.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.jen5HLCIHtQYi4Qq7NRvmaQqqMjcvmhV;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n\u00a2\u0006\u0002\b\u0006"}, d2={"<anonymous>", "", "T", "it", "Lcom/kisman/cc/event/events/client/settings/EventSettingChange;", "kotlin.jvm.PlatformType", "invoke"})
final class jen5HLCIHtQYi4Qq7NRvmaQqqMjcvmhV$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    final jen5HLCIHtQYi4Qq7NRvmaQqqMjcvmhV Field11306;
    private String Field11307 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method3271((bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5)object);
    }

    public final void Method3271(bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5 bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO52) {
        if (!Intrinsics.areEqual((Object)bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO52.Field9851, (Object)jen5HLCIHtQYi4Qq7NRvmaQqqMjcvmhV.Method857(this.Field11306))) return;
        Object object = jen5HLCIHtQYi4Qq7NRvmaQqqMjcvmhV.Method858((jen5HLCIHtQYi4Qq7NRvmaQqqMjcvmhV)this.Field11306).value;
        if (object instanceof Boolean) {
            jen5HLCIHtQYi4Qq7NRvmaQqqMjcvmhV.Method858((jen5HLCIHtQYi4Qq7NRvmaQqqMjcvmhV)this.Field11306).value = jen5HLCIHtQYi4Qq7NRvmaQqqMjcvmhV.Method857(this.Field11306).Method365();
            return;
        }
        if (!(object instanceof Float || object instanceof Double || object instanceof Integer)) {
            if (!(object instanceof Color)) return;
            Settings.Setting setting = jen5HLCIHtQYi4Qq7NRvmaQqqMjcvmhV.Method858(this.Field11306);
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = jen5HLCIHtQYi4Qq7NRvmaQqqMjcvmhV.Method857(this.Field11306).Method339();
            Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"lavahackSetting.colour");
            setting.value = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method3625();
            return;
        }
        jen5HLCIHtQYi4Qq7NRvmaQqqMjcvmhV.Method858((jen5HLCIHtQYi4Qq7NRvmaQqqMjcvmhV)this.Field11306).value = jen5HLCIHtQYi4Qq7NRvmaQqqMjcvmhV.Method857(this.Field11306).Method367();
    }

    jen5HLCIHtQYi4Qq7NRvmaQqqMjcvmhV$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(jen5HLCIHtQYi4Qq7NRvmaQqqMjcvmhV jen5HLCIHtQYi4Qq7NRvmaQqqMjcvmhV2) {
        this.Field11306 = jen5HLCIHtQYi4Qq7NRvmaQqqMjcvmhV2;
    }

    private static String Method3272(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1177902282 ^ (long)1177902282);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-17764139L ^ 0xFEF0F02A);
            int n2 = ((int)1439712947L ^ 0x55D046E0) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)1403922359L ^ 0x53AE2C26) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

