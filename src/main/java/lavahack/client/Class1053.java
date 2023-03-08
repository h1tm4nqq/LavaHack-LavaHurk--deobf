//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.net.*;
import java.nio.charset.*;
import java.io.*;

public class Class1053
{
    public HttpURLConnection Field12665;
    private String Field12666 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1053(final String spec) throws Exception {
        (this.Field12665 = (HttpURLConnection)new URL(spec).openConnection()).setRequestMethod("GET");
    }
    
    public Class1053 Method4294(final String key, final String value) {
        this.Field12665.addRequestProperty(key, value);
        return this;
    }
    
    public void Method4295() throws IOException {
        this.Field12665.connect();
    }
    
    public int Method4296() throws IOException {
        return this.Field12665.getResponseCode();
    }
    
    public String Method4297() throws IOException {
        final StringBuilder sb = new StringBuilder();
        final InputStreamReader inputStreamReader = new InputStreamReader(this.Field12665.getInputStream(), StandardCharsets.UTF_8);
        int read;
        while ((read = inputStreamReader.read()) >= 0) {
            sb.append((char)read);
        }
        inputStreamReader.close();
        return sb.toString();
    }
    
    private static String Method4298(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6E8 ^ 0x85));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
