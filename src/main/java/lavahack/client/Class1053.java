/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Class1053 {
    public HttpURLConnection Field12665;
    private String Field12666 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1053(String string) throws Exception {
        this.Field12665 = (HttpURLConnection)new URL(string).openConnection();
        this.Field12665.setRequestMethod("GET");
    }

    public Class1053 Method4294(String string, String string2) {
        this.Field12665.addRequestProperty(string, string2);
        return this;
    }

    public void Method4295() throws IOException {
        this.Field12665.connect();
    }

    public int Method4296() throws IOException {
        return this.Field12665.getResponseCode();
    }

    public String Method4297() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        InputStreamReader inputStreamReader = new InputStreamReader(this.Field12665.getInputStream(), StandardCharsets.UTF_8);
        while (true) {
            int n;
            if ((n = ((Reader)inputStreamReader).read()) < 0) {
                ((Reader)inputStreamReader).close();
                return stringBuilder.toString();
            }
            stringBuilder.append((char)n);
        }
    }

    private static String Method4298(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 133;
            cArray2[n] = (char)(cArray[n] ^ (0x6E8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

