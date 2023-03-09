/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import lavahack.client.Class1546;
import lavahack.client.Class2174;

final class Class2110
implements HttpHandler {
    final Class2174 Field17601;
    private String Field17602 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    Class2110(Class2174 class2174) {
        this.Field17601 = class2174;
    }

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        this.Field17601.setState("Processing token...");
        byte[] byArray = "<html><body><h1>You can close this window now.</h1></body></html>".getBytes(StandardCharsets.UTF_8);
        httpExchange.getResponseHeaders().put("Content-Type", Arrays.asList("text/html; charset=UTF-8"));
        httpExchange.sendResponseHeaders(200, byArray.length);
        OutputStream outputStream = httpExchange.getResponseBody();
        outputStream.write(byArray);
        outputStream.flush();
        outputStream.close();
        String string = httpExchange.getRequestURI().getQuery();
        if (string == null) {
            this.Field17601.error("query=null");
        } else if (string.startsWith("code=")) {
            Class1546.Method6114(string.replace("code=", ""), this.Field17601);
        } else if (string.equals("error=access_denied&error_description=The user has denied access to the scope requested by the client application.")) {
            this.Field17601.error("Authorization cancelled.");
        } else {
            this.Field17601.error(string);
        }
        Class1546.Method6105();
    }

    private static String Method7650(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 116;
            cArray2[n] = (char)(cArray[n] ^ (0x77A9 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

