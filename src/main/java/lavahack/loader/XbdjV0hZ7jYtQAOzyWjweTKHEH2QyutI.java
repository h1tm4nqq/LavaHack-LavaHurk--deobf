/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import java.nio.ByteBuffer;

public class XbdjV0hZ7jYtQAOzyWjweTKHEH2QyutI {
    private String Field10046 = "TheKisDevs & LavaHack Development owns you";

    private XbdjV0hZ7jYtQAOzyWjweTKHEH2QyutI() {
    }

    public static int Method2279(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int n;
        if (byteBuffer == null) throw new IllegalArgumentException();
        if (byteBuffer2 == null) {
            throw new IllegalArgumentException();
        }
        int n2 = byteBuffer.remaining();
        if (n2 > (n = byteBuffer2.remaining())) {
            int n3 = Math.min(n2, n);
            byteBuffer.limit(n3);
            byteBuffer2.put(byteBuffer);
            return n3;
        }
        byteBuffer2.put(byteBuffer);
        return n2;
    }

    public static ByteBuffer Method2280() {
        return ByteBuffer.allocate((int)-1606680068L ^ 0xA03C01FC);
    }
}

