/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.awt.Color;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua;

public class qCjATt5pHVCmSQECehNpwU2XG9jgy37X
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10025 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Shadow", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-298960375 ^ (long)-298960375)));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10026 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)2061947111 ^ (long)2061946904), (int)-213265289L ^ 0xF349D488, (int)-1464246438L ^ 0xA8B95FA5, (int)((long)-711535937 ^ (long)-711535956) << 3)).Method313(this.Field10025::Method365));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10027 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Offhand", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1773638815 ^ (long)1773638814)).Method313(this.Field10025::Method365));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10028 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Offhand Gradient", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1141603102L ^ 0x440B7B1E) != 0).Method313(this::Method2248));
    @tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua
    public static qCjATt5pHVCmSQECehNpwU2XG9jgy37X Field10029;
    private String Field10030 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public qCjATt5pHVCmSQECehNpwU2XG9jgy37X() {
        super("HotbarModifier", "Extra features of your hotbar!", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
    }

    public static Color Method2247() {
        return null.Field10026.Method339().Method3625();
    }

    private Boolean Method2248() {
        int n;
        if (this.Field10027.Method365() && this.Field10025.Method365()) {
            n = (int)((long)1964928922 ^ (long)1964928923);
            return n != 0;
        }
        n = (int)((long)1362769871 ^ (long)1362769871);
        return n != 0;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1519841285L ^ 0x5A96F005;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1547305547 ^ (long)1547305652);
            int n2 = (int)((long)-1699028354 ^ (long)-1699028465);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1291935761 ^ (long)1291937008) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

