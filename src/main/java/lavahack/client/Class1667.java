//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.net.*;
import java.io.*;

final class Class1667 implements Runnable
{
    final String Field15759;
    private String Field15760 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    Class1667(final String field15759) {
        this.Field15759 = field15759;
    }
    
    @Override
    public void run() {
        System.out.println("Attempting to play video with ID " + this.Field15759);
        final String method4170 = Class1028.Method4170("https://www.convertmp3.io/fetch/?format=text&video=https://www.youtube.com/watch?v=" + this.Field15759);
        System.out.println(method4170);
        if (method4170.contains("meta")) {
            System.out.println("Sorry, this video has not yet been converted & cached. It is being converted now, come back later and it will be ready.");
        }
        final URL url = new URL(method4170.split("Link: ")[1]);
        System.out.println("Length: " + method4170.split("Length: ")[1].split(" <br")[0]);
        System.out.println("Successfully got virtual storage location");
        final HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
        httpURLConnection.addRequestProperty(Class1028.Field12517, Class1028.Field12518);
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        final String string = httpURLConnection.getURL().toString();
        System.out.println("Successfully got physical location of song");
        Class1617.Method6297(string);
        System.out.println("Now Playing");
    }
    
    private static String Method6436(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xD85 ^ 0x86));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
