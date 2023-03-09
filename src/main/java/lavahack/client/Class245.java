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
import lavahack.client.Class1979;

public class Class245
implements ViaBackwardsPlatform {
    private final File Field9074;
    private String Field9075 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class245(File file) {
        this.Field9074 = new File(file, "ViaBackwards");
        this.init(this.Field9074);
    }

    public Logger getLogger() {
        return Class1979.Method7320().Method7322();
    }

    public void disable() {
    }

    public boolean isOutdated() {
        return false;
    }

    public File getDataFolder() {
        return new File(this.Field9074, "config.yml");
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 72;
            cArray2[n] = (char)(cArray[n] ^ (0x2CA5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

