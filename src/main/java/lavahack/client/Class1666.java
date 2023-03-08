//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.net.*;
import java.io.*;

final class Class1666 implements Runnable
{
    final String Field15756;
    final List Field15757;
    private int Field15758;
    
    Class1666(final String field15756, final List field15757) {
        this.Field15756 = field15756;
        this.Field15757 = field15757;
    }
    
    @Override
    public void run() {
        final HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(this.Field15756).openConnection();
        httpURLConnection.addRequestProperty(Class1028.Field12517, Class1028.Field12518);
        String line;
        while ((line = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream())).readLine()) != null) {
            this.Field15757.add(line);
        }
    }
}
