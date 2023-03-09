/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.platform.ViaInjector
 *  com.viaversion.viaversion.libs.gson.JsonObject
 */
package lavahack.client;

import com.viaversion.viaversion.api.platform.ViaInjector;
import com.viaversion.viaversion.libs.gson.JsonObject;

public class Class520
implements ViaInjector {
    private String Field10205 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void inject() {
    }

    public void uninject() {
    }

    public int getServerProtocolVersion() {
        return 340;
    }

    public String getEncoderName() {
        return "via-encoder";
    }

    public String getDecoderName() {
        return "via-decoder";
    }

    public JsonObject getDump() {
        return new JsonObject();
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 37;
            cArray2[n] = (char)(cArray[n] ^ (0xF58 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

