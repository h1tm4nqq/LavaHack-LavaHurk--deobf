/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.IOException;
import java.nio.ByteBuffer;
import lavahack.client.OGz3PksI7r7P3jgoDOLicddnQgIm4r0W;

class OGz3PksI7r7P3jgoDOLicddnQgIm4r0W$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements Runnable {
    private final OGz3PksI7r7P3jgoDOLicddnQgIm4r0W Field15847;
    final OGz3PksI7r7P3jgoDOLicddnQgIm4r0W Field15848;
    private int Field15849;

    OGz3PksI7r7P3jgoDOLicddnQgIm4r0W$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(OGz3PksI7r7P3jgoDOLicddnQgIm4r0W oGz3PksI7r7P3jgoDOLicddnQgIm4r0W, OGz3PksI7r7P3jgoDOLicddnQgIm4r0W oGz3PksI7r7P3jgoDOLicddnQgIm4r0W2) {
        this.Field15848 = oGz3PksI7r7P3jgoDOLicddnQgIm4r0W;
        this.Field15847 = oGz3PksI7r7P3jgoDOLicddnQgIm4r0W2;
    }

    @Override
    public void run() {
        Thread.currentThread().setName("WebSocketWriteThread-" + Thread.currentThread().getId());
        this.Method6494();
        this.Method6495();
        OGz3PksI7r7P3jgoDOLicddnQgIm4r0W.Method593(this.Field15848, null);
    }

    private void Method6494() throws IOException {
        while (!Thread.interrupted()) {
            ByteBuffer byteBuffer = (ByteBuffer)OGz3PksI7r7P3jgoDOLicddnQgIm4r0W.Method594((OGz3PksI7r7P3jgoDOLicddnQgIm4r0W)this.Field15848).Field13943.take();
            OGz3PksI7r7P3jgoDOLicddnQgIm4r0W.Method595(this.Field15848).write(byteBuffer.array(), (int)((long)234865192 ^ (long)234865192), byteBuffer.limit());
            OGz3PksI7r7P3jgoDOLicddnQgIm4r0W.Method595(this.Field15848).flush();
        }
    }

    private void Method6495() {
        if (OGz3PksI7r7P3jgoDOLicddnQgIm4r0W.Method596(this.Field15848) == null) return;
        OGz3PksI7r7P3jgoDOLicddnQgIm4r0W.Method596(this.Field15848).close();
    }

    private static String Method6496(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-244627988 ^ (long)-244627988);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-88205496 ^ (long)-88205385);
            int n2 = ((int)678435735L ^ 0x28701BEA) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-630659708 ^ (long)-630672357) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

