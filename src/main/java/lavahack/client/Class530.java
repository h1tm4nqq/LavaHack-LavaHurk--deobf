/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Class530 {
    private String Field10239 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method2409(URL uRL, URL uRL2) throws IOException {
        ReadableByteChannel readableByteChannel = Channels.newChannel(uRL.openStream());
        Object var3_3 = null;
        FileOutputStream fileOutputStream = new FileOutputStream(uRL2.getFile());
        Object var5_5 = null;
        fileOutputStream.getChannel().transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
        if (fileOutputStream != null) {
            if (var5_5 != null) {
                fileOutputStream.close();
            } else {
                fileOutputStream.close();
            }
        }
        if (readableByteChannel == null) return;
        if (var3_3 != null) {
            readableByteChannel.close();
            return;
        }
        readableByteChannel.close();
    }

    public static byte[] Method2410(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Class530.Method2411(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static void Method2411(InputStream inputStream, OutputStream outputStream) throws IOException {
        int n;
        byte[] byArray = new byte[1024];
        while ((n = inputStream.read(byArray)) != -1) {
            outputStream.write(byArray, 0, n);
        }
    }
}

