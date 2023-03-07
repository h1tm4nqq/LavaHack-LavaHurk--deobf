/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public class Xo6zSw9oFvctokYVI3lrg3XDekGAt6AI
extends RuntimeException {
    private String Field10541 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Xo6zSw9oFvctokYVI3lrg3XDekGAt6AI(String string) {
        super(string);
        this.setStackTrace(new StackTraceElement[(int)((long)902858062 ^ (long)902858062)]);
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
        int n = (int)1040351382L ^ 0x3E028096;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)2071728933 ^ (long)2071729114);
            int n2 = ((int)-1697464103L ^ 0x9AD2C0D4) << 4;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1513740475L ^ 0xA5C614EC) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

