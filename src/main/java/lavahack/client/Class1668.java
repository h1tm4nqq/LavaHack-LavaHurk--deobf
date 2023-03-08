//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.net.*;
import java.io.*;

final class Class1668 implements Runnable
{
    final String Field15761;
    final List Field15762;
    private String Field15763 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    Class1668(final String field15761, final List field15762) {
        this.Field15761 = field15761;
        this.Field15762 = field15762;
    }
    
    @Override
    public void run() {
        final HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(this.Field15761).openConnection();
        httpURLConnection.addRequestProperty(Class1028.Field12517, Class1028.Field12518);
        String line;
        while ((line = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream())).readLine()) != null) {
            if (!line.isEmpty() && !line.equals(" ") && !line.equals("   ")) {
                this.Field15762.add(line.contains(" ") ? line.replace(" ", "") : line);
            }
        }
    }
    
    private static String Method6437(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7496 ^ 0x5B));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
