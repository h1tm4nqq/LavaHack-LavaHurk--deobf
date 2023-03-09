/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.awt.Color;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class873;
import lavahack.client.Class97;

public class Class486
extends Class42 {
    public final Class44 Field10025 = this.Method23(new Class44("Shadow", (Class42)this, false));
    public final Class44 Field10026 = this.Method23(new Class44("Color", (Class42)this, new Class2027(255, 255, 255, 152)).Method313(this.Field10025::Method365));
    public final Class44 Field10027 = this.Method23(new Class44("Offhand", (Class42)this, true).Method313(this.Field10025::Method365));
    public final Class44 Field10028 = this.Method23(new Class44("Offhand Gradient", (Class42)this, false).Method313(this::Method2248));
    @Class873
    public static Class486 Field10029;
    private String Field10030 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class486() {
        super("HotbarModifier", "Extra features of your hotbar!", Class97.Field8342);
    }

    public static Color Method2247() {
        return null.Field10026.Method339().Method3625();
    }

    private Boolean Method2248() {
        boolean bl;
        if (this.Field10027.Method365() && this.Field10025.Method365()) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 113;
            cArray2[n] = (char)(cArray[n] ^ (0x1384 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

