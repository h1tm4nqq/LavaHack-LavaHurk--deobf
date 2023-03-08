//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.net.*;
import java.nio.channels.*;
import java.io.*;

public class Class530
{
    private String Field10239 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static void Method2409(final URL url, final URL url2) throws IOException {
        final ReadableByteChannel channel = Channels.newChannel(url.openStream());
        final Object o = null;
        final FileOutputStream fileOutputStream = new FileOutputStream(url2.getFile());
        final Object o2 = null;
        fileOutputStream.getChannel().transferFrom(channel, 0L, Long.MAX_VALUE);
        if (fileOutputStream != null) {
            if (o2 != null) {
                fileOutputStream.close();
            }
            else {
                fileOutputStream.close();
            }
        }
        if (channel != null) {
            if (o != null) {
                channel.close();
            }
            else {
                channel.close();
            }
        }
    }
    
    public static byte[] Method2410(final InputStream inputStream) throws IOException {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Method2411(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
    
    public static void Method2411(final InputStream inputStream, final OutputStream outputStream) throws IOException {
        final byte[] array = new byte[1024];
        int read;
        while ((read = inputStream.read(array)) != -1) {
            outputStream.write(array, 0, read);
        }
    }
}
