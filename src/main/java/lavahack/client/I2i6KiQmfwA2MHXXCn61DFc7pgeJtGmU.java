/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.ViaBackwardsPlatform
 */
package lavahack.client;

import com.viaversion.viabackwards.api.ViaBackwardsPlatform;
import java.io.File;
import java.util.logging.Logger;
import lavahack.client.FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D;

public class I2i6KiQmfwA2MHXXCn61DFc7pgeJtGmU
implements ViaBackwardsPlatform {
    private final File Field9074;
    private String Field9075 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public I2i6KiQmfwA2MHXXCn61DFc7pgeJtGmU(File file) {
        this.Field9074 = new File(file, "ViaBackwards");
        this.init(this.Field9074);
    }

    public Logger getLogger() {
        return FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D.Method7320().Method7322();
    }

    public void disable() {
    }

    public boolean isOutdated() {
        return ((int)1172778292L ^ 0x45E72D34) != 0;
    }

    public File getDataFolder() {
        return new File(this.Field9074, "config.yml");
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)597294261L ^ 0x2399FCB5;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)525115968 ^ (long)525116095);
            int n2 = (int)((long)-1914364604 ^ (long)-1914364595) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1856466674 ^ (long)-1856455253) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

