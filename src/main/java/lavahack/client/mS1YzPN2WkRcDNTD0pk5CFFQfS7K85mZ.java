/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.nio.ByteBuffer;

public class mS1YzPN2WkRcDNTD0pk5CFFQfS7K85mZ {
    private String Field15506 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private mS1YzPN2WkRcDNTD0pk5CFFQfS7K85mZ() {
    }

    public static int Method6268(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
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

    public static ByteBuffer Method6269() {
        return ByteBuffer.allocate((int)-925815579L ^ 0xC8D12CE5);
    }
}

