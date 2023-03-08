//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.sun.net.httpserver.*;
import java.nio.charset.*;
import java.util.*;
import java.io.*;

final class Class2110 implements HttpHandler
{
    final Class2174 Field17601;
    private String Field17602 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    Class2110(final Class2174 field17601) {
        this.Field17601 = field17601;
    }
    
    @Override
    public void handle(final HttpExchange httpExchange) throws IOException {
        this.Field17601.setState("Processing token...");
        final byte[] bytes = "<html><body><h1>You can close this window now.</h1></body></html>".getBytes(StandardCharsets.UTF_8);
        httpExchange.getResponseHeaders().put("Content-Type", Arrays.asList("text/html; charset=UTF-8"));
        httpExchange.sendResponseHeaders(200, bytes.length);
        final OutputStream responseBody = httpExchange.getResponseBody();
        responseBody.write(bytes);
        responseBody.flush();
        responseBody.close();
        final String query = httpExchange.getRequestURI().getQuery();
        if (query == null) {
            this.Field17601.error("query=null");
        }
        else if (query.startsWith("code=")) {
            Class1546.Method6114(query.replace("code=", ""), this.Field17601);
        }
        else if (query.equals("error=access_denied&error_description=The user has denied access to the scope requested by the client application.")) {
            this.Field17601.error("Authorization cancelled.");
        }
        else {
            this.Field17601.error(query);
        }
        Class1546.Method6105();
    }
    
    private static String Method7650(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x77A9 ^ 0x74));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
