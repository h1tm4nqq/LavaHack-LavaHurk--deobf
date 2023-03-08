//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.nio.charset.*;
import java.net.*;
import java.util.*;
import java.io.*;

public class Class114
{
    public HttpURLConnection Field8398;
    private String Field8399 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class114(final String spec) throws Exception {
        (this.Field8398 = (HttpURLConnection)new URL(spec).openConnection()).setRequestMethod("POST");
        this.Field8398.setDoOutput(true);
        this.Field8398.setDoInput(true);
    }
    
    public Class114 Method829(final String key, final String value) {
        this.Field8398.setRequestProperty(key, value);
        return this;
    }
    
    public void Method830(final String s) throws IOException {
        final byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        this.Field8398.connect();
        final OutputStream outputStream = this.Field8398.getOutputStream();
        outputStream.write(bytes);
        outputStream.flush();
        outputStream.close();
    }
    
    public void Method831(final Map map) throws Exception {
        final StringJoiner stringJoiner = new StringJoiner("&");
        for (final Map.Entry<Object, V> entry : map.entrySet()) {
            stringJoiner.add(URLEncoder.encode(entry.getKey().toString(), "UTF-8") + "=" + URLEncoder.encode(entry.getValue().toString(), "UTF-8"));
        }
        this.Method830(stringJoiner.toString());
    }
    
    public int Method832() throws IOException {
        return this.Field8398.getResponseCode();
    }
    
    public String Method833() throws IOException {
        final StringBuilder sb = new StringBuilder();
        final InputStreamReader inputStreamReader = new InputStreamReader(this.Field8398.getInputStream(), StandardCharsets.UTF_8);
        int read;
        while ((read = inputStreamReader.read()) >= 0) {
            sb.append((char)read);
        }
        inputStreamReader.close();
        return sb.toString();
    }
    
    private static String Method834(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x70D9 ^ 0x86));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
