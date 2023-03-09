/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public class Class597
extends RuntimeException {
    private String Field10541 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class597(String string) {
        super(string);
        this.setStackTrace(new StackTraceElement[0]);
    }

    @Override
    public String toString() {
        return "URLReaderException error! Please create ticket in TheDiscord about the crash!";
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }

    private static String Method2581(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 208;
            cArray2[n] = (char)(cArray[n] ^ (0x6752 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

