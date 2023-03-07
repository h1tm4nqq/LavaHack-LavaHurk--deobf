/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.StringJoiner;

public class q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ9 {
    public HttpURLConnection Field8398;
    private String Field8399 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ9(String string) throws Exception {
        this.Field8398 = (HttpURLConnection)new URL(string).openConnection();
        this.Field8398.setRequestMethod("POST");
        this.Field8398.setDoOutput(((int)797260953L ^ 0x2F853C98) != 0);
        this.Field8398.setDoInput(((int)1130963145L ^ 0x436920C8) != 0);
    }

    public q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ9 Method829(String string, String string2) {
        this.Field8398.setRequestProperty(string, string2);
        return this;
    }

    public void Method830(String string) throws IOException {
        byte[] byArray = string.getBytes(StandardCharsets.UTF_8);
        this.Field8398.connect();
        OutputStream outputStream = this.Field8398.getOutputStream();
        outputStream.write(byArray);
        outputStream.flush();
        outputStream.close();
    }

    public void Method831(Map map) throws Exception {
        StringJoiner stringJoiner = new StringJoiner("&");
        Iterator iterator = map.entrySet().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Method830(stringJoiner.toString());
                return;
            }
            Map.Entry entry = iterator.next();
            stringJoiner.add(URLEncoder.encode(entry.getKey().toString(), "UTF-8") + "=" + URLEncoder.encode(entry.getValue().toString(), "UTF-8"));
        }
    }

    public int Method832() throws IOException {
        return this.Field8398.getResponseCode();
    }

    public String Method833() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        InputStreamReader inputStreamReader = new InputStreamReader(this.Field8398.getInputStream(), StandardCharsets.UTF_8);
        while (true) {
            int n;
            if ((n = ((Reader)inputStreamReader).read()) < 0) {
                ((Reader)inputStreamReader).close();
                return stringBuilder.toString();
            }
            stringBuilder.append((char)n);
        }
    }

    private static String Method834(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1345339719L ^ 0xAFCFBEB9;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1138987091 ^ (long)1138987180);
            int n2 = ((int)1958459268L ^ 0x74BBB7C7) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)410463735L ^ 0x18775D2E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

