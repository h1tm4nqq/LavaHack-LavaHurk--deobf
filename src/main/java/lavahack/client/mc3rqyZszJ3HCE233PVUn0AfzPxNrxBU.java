/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import lavahack.client.DFErp9T9eeNlJpVC6NLojB02MDiAMZoy;
import lavahack.client.YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL;
import lavahack.client.rWOxkXahfy879ZWg1QDRw2hroxYTBucF;

public class mc3rqyZszJ3HCE233PVUn0AfzPxNrxBU {
    private int Field9850;

    private mc3rqyZszJ3HCE233PVUn0AfzPxNrxBU() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean Method2094(ByteBuffer byteBuffer, rWOxkXahfy879ZWg1QDRw2hroxYTBucF rWOxkXahfy879ZWg1QDRw2hroxYTBucF2, ByteChannel byteChannel) throws IOException {
        int n;
        byteBuffer.clear();
        int n2 = byteChannel.read(byteBuffer);
        byteBuffer.flip();
        if (n2 == (int)((long)1918905917 ^ (long)-1918905918)) {
            rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method5283();
            return ((int)1657977522L ^ 0x62D2BAB2) != 0;
        }
        if (n2 != 0) {
            n = (int)((long)215798688 ^ (long)215798689);
            return n != 0;
        }
        n = (int)-1751069339L ^ 0x97A0CD65;
        return n != 0;
    }

    public static boolean Method2095(ByteBuffer byteBuffer, rWOxkXahfy879ZWg1QDRw2hroxYTBucF rWOxkXahfy879ZWg1QDRw2hroxYTBucF2, DFErp9T9eeNlJpVC6NLojB02MDiAMZoy dFErp9T9eeNlJpVC6NLojB02MDiAMZoy) throws IOException {
        byteBuffer.clear();
        int n = dFErp9T9eeNlJpVC6NLojB02MDiAMZoy.Method2485(byteBuffer);
        byteBuffer.flip();
        if (n != ((int)-1869066727L ^ 0x6F67B1E6)) return dFErp9T9eeNlJpVC6NLojB02MDiAMZoy.Method2484();
        rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method5283();
        return (int)((long)-1442714115 ^ (long)-1442714115) != 0;
    }

    public static boolean Method2096(rWOxkXahfy879ZWg1QDRw2hroxYTBucF rWOxkXahfy879ZWg1QDRw2hroxYTBucF2, ByteChannel byteChannel) throws IOException {
        int n;
        if (rWOxkXahfy879ZWg1QDRw2hroxYTBucF2 == null) {
            return (int)((long)2131161404 ^ (long)2131161404) != 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer)rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Field13943.peek();
        DFErp9T9eeNlJpVC6NLojB02MDiAMZoy dFErp9T9eeNlJpVC6NLojB02MDiAMZoy = null;
        if (byteBuffer == null) {
            if (byteChannel instanceof DFErp9T9eeNlJpVC6NLojB02MDiAMZoy && (dFErp9T9eeNlJpVC6NLojB02MDiAMZoy = (DFErp9T9eeNlJpVC6NLojB02MDiAMZoy)byteChannel).Method2482()) {
                dFErp9T9eeNlJpVC6NLojB02MDiAMZoy.Method2483();
            }
        } else {
            do {
                byteChannel.write(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    return (int)((long)-1219449989 ^ (long)-1219449989) != 0;
                }
                rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Field13943.poll();
            } while ((byteBuffer = (ByteBuffer)rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Field13943.peek()) != null);
        }
        if (rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Field13943.isEmpty() && rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method553() && rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method555() != null && rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method555().Method4419() != null && rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method555().Method4419() == YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL.Field11415) {
            rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method5281();
        }
        if (dFErp9T9eeNlJpVC6NLojB02MDiAMZoy != null && ((DFErp9T9eeNlJpVC6NLojB02MDiAMZoy)byteChannel).Method2482()) {
            n = (int)((long)1920724561 ^ (long)1920724561);
            return n != 0;
        }
        n = (int)((long)-447055824 ^ (long)-447055823);
        return n != 0;
    }

    private static String Method2097(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1226833618L ^ 0xB6E0012E;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-245549802L ^ 0xF15D35E9);
            int n2 = (int)968091544L ^ 0x39B3E701;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1710238037 ^ (long)1710238544) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

