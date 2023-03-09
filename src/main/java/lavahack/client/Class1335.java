/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import kotlin.Metadata;
import lavahack.client.Class1419;
import lavahack.client.Class294;
import lavahack.client.Class354;
import lavahack.client.Class44;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/gui/hudeditor/HudSettingsFrame;", "Lcom/kisman/cc/gui/halq/Frame;", "x", "", "y", "(II)V", "colorSetting", "Lcom/kisman/cc/settings/Setting;", "getColorSetting", "()Lcom/kisman/cc/settings/Setting;", "kisman.cc"})
public final class Class1335
extends Class354 {
    @NotNull
    private final Class44 Field14107 = new Class44("Box Color", null, new Class2027(10, 10, 10, 170));
    private String Field14108 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final Class44 Method5387() {
        return this.Field14107;
    }

    public Class1335(int n, int n2) {
        super(null, n, n2, true, "Settings");
        int n3 = Class1419.Field14604;
        int n4 = 0;
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.add(new Class294(this.Field14107, n, n2, n3, n4, 0));
        n3 += Class1419.Field14604;
        ++n4;
    }

    private static String Method74(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 146;
            cArray2[n] = (char)(cArray[n] ^ (0x7468 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

