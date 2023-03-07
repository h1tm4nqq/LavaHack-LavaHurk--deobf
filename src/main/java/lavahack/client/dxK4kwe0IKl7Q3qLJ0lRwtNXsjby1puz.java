/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import kotlin.Metadata;
import lavahack.client.ohP0orxdq2P1v9VESBaGP1easnqKGTCb;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.x7i7uu6Jdr44uwtQmo4LHxAQ6ZYTcu2Z;
import lavahack.client.zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/gui/hudeditor/HudSettingsFrame;", "Lcom/kisman/cc/gui/halq/Frame;", "x", "", "y", "(II)V", "colorSetting", "Lcom/kisman/cc/settings/Setting;", "getColorSetting", "()Lcom/kisman/cc/settings/Setting;", "kisman.cc"})
public final class dxK4kwe0IKl7Q3qLJ0lRwtNXsjby1puz
extends ohP0orxdq2P1v9VESBaGP1easnqKGTCb {
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14107 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Box Color", null, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)-1109834339 ^ (long)-1109834344) << 1, (int)((long)1370951205 ^ (long)1370951200) << 1, ((int)-1034448257L ^ 0xC257927A) << 1, ((int)-1787449299L ^ 0x9575B078) << 1));
    private String Field14108 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method5387() {
        return this.Field14107;
    }

    public dxK4kwe0IKl7Q3qLJ0lRwtNXsjby1puz(int n, int n2) {
        super(null, n, n2, ((int)1742532110L ^ 0x67DCEE0F) != 0, "Settings");
        int n3 = zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604;
        int n4 = (int)((long)-215081491 ^ (long)-215081491);
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.add(new x7i7uu6Jdr44uwtQmo4LHxAQ6ZYTcu2Z(this.Field14107, n, n2, n3, n4, (int)((long)277962966 ^ (long)277962966)));
        n3 += zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604;
        ++n4;
    }

    private static String Method74(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1006948714 ^ (long)-1006948714);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1294671741L ^ 0x4D2B1F82);
            int n2 = ((int)1721255379L ^ 0x6698459A) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)1163508983L ^ 0x4559B27A) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

