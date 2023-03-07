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

public class jTWDvfvyD5dbxkT9cYsl23heEKePCaGk
implements ViaInjector {
    private String Field10205 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void inject() {
    }

    public void uninject() {
    }

    public int getServerProtocolVersion() {
        return (int)((long)682787388 ^ (long)682787433) << 2;
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
        int n = (int)((long)997671343 ^ (long)997671343);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-166527652L ^ 0xF612FDA3);
            int n2 = (int)505748404L ^ 0x1E251B91;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)572431921 ^ (long)572432346) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

