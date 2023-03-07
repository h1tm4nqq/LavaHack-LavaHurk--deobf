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

public class wM07y2BxCt9eVGDtwvMqXydBjA9ENj3q {
    private String Field10239 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method2409(URL uRL, URL uRL2) throws IOException {
        ReadableByteChannel readableByteChannel = Channels.newChannel(uRL.openStream());
        Object var3_3 = null;
        FileOutputStream fileOutputStream = new FileOutputStream(uRL2.getFile());
        Object var5_5 = null;
        fileOutputStream.getChannel().transferFrom(readableByteChannel, 0L, Long.MAX_VALUE & Long.MAX_VALUE);
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
        wM07y2BxCt9eVGDtwvMqXydBjA9ENj3q.Method2411(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static void Method2411(InputStream inputStream, OutputStream outputStream) throws IOException {
        int n;
        byte[] byArray = new byte[((int)-672669513L ^ 0xD7E7E0B6) << 10];
        while ((n = inputStream.read(byArray)) != (int)((long)-1668274883 ^ (long)1668274882)) {
            outputStream.write(byArray, (int)45552224L ^ 0x2B71260, n);
        }
    }
}

