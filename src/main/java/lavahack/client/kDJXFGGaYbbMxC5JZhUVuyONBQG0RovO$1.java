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
import lavahack.client.j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR;
import lavahack.client.kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO;

final class kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO$1
implements HttpHandler {
    final j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR Field17601;
    private String Field17602 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO$1(j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR2) {
        this.Field17601 = j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR2;
    }

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        this.Field17601.setState("Processing token...");
        byte[] byArray = "<html><body><h1>You can close this window now.</h1></body></html>".getBytes(StandardCharsets.UTF_8);
        String[] stringArray = new String[(int)((long)-1243955150 ^ (long)-1243955149)];
        stringArray[(int)1791268822L ^ 0x6AC497D6] = "text/html; charset=UTF-8";
        httpExchange.getResponseHeaders().put("Content-Type", Arrays.asList(stringArray));
        httpExchange.sendResponseHeaders((int)((long)-490498517 ^ (long)-490498510) << 3, byArray.length);
        OutputStream outputStream = httpExchange.getResponseBody();
        outputStream.write(byArray);
        outputStream.flush();
        outputStream.close();
        String string = httpExchange.getRequestURI().getQuery();
        if (string == null) {
            this.Field17601.error("query=null");
        } else if (string.startsWith("code=")) {
            kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO.Method6114(string.replace("code=", ""), this.Field17601);
        } else if (string.equals("error=access_denied&error_description=The user has denied access to the scope requested by the client application.")) {
            this.Field17601.error("Authorization cancelled.");
        } else {
            this.Field17601.error(string);
        }
        kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO.Method6105();
    }

    private static String Method7650(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-736679673 ^ (long)-736679673);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1226771464L ^ 0x491F0CF7);
            int n2 = ((int)1709284835L ^ 0x65E19DFE) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)-866526155L ^ 0xCC59AB9C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

