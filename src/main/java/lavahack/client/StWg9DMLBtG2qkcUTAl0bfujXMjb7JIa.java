/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.net.URL;
import java.net.URLConnection;
import lavahack.client.fabBVWkrhk6LvUW1xRV2BacKh5WmC8P2;

public abstract class StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa {
    protected final String Field15703;
    protected final URL Field15704;
    protected final String Field15705;
    protected final String Field15706;
    protected final URLConnection Field15707;
    protected final ClassLoader Field15708;
    private int Field15709;

    public StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa(String string, ClassLoader classLoader) throws fabBVWkrhk6LvUW1xRV2BacKh5WmC8P2 {
        URLConnection uRLConnection;
        this.Field15708 = classLoader != null ? classLoader : Thread.currentThread().getContextClassLoader();
        URL uRL = this.Field15708.getResource(string);
        if (uRL == null) {
            throw new fabBVWkrhk6LvUW1xRV2BacKh5WmC8P2();
        }
        this.Field15703 = string;
        this.Field15704 = uRL;
        this.Field15705 = uRL.getProtocol();
        this.Field15706 = uRL.getPath();
        this.Field15707 = uRLConnection = uRL.openConnection();
    }

    public StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa(String string) throws fabBVWkrhk6LvUW1xRV2BacKh5WmC8P2 {
        this(string, Thread.currentThread().getContextClassLoader());
    }

    protected StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa(String string, URL uRL, ClassLoader classLoader) throws fabBVWkrhk6LvUW1xRV2BacKh5WmC8P2 {
        URLConnection uRLConnection;
        ClassLoader classLoader2 = this.Field15708 = classLoader != null ? classLoader : Thread.currentThread().getContextClassLoader();
        if (uRL == null) {
            throw new fabBVWkrhk6LvUW1xRV2BacKh5WmC8P2();
        }
        this.Field15703 = string;
        this.Field15704 = uRL;
        this.Field15705 = uRL.getProtocol();
        this.Field15706 = uRL.getPath();
        this.Field15707 = uRLConnection = uRL.openConnection();
    }

    protected StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa(String string, URL uRL) throws fabBVWkrhk6LvUW1xRV2BacKh5WmC8P2 {
        this(string, uRL, null);
    }

    protected StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa(String string, URL uRL, URLConnection uRLConnection, ClassLoader classLoader) {
        this.Field15703 = string;
        this.Field15704 = uRL;
        this.Field15705 = uRL.getProtocol();
        this.Field15706 = uRL.getProtocol();
        this.Field15707 = uRLConnection;
        this.Field15708 = classLoader;
    }

    protected StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa(String string, URL uRL, String string2, String string3, URLConnection uRLConnection, ClassLoader classLoader) {
        this.Field15703 = string;
        this.Field15704 = uRL;
        this.Field15705 = string2;
        this.Field15706 = string3;
        this.Field15707 = uRLConnection;
        this.Field15708 = classLoader;
    }

    public String Method172() {
        return this.Field15703;
    }

    public URL Method173() {
        return this.Field15704;
    }

    public String Method174() {
        return this.Field15705;
    }

    public String Method175() {
        return this.Field15706;
    }

    public URLConnection Method176() {
        return this.Field15707;
    }

    public ClassLoader Method177() {
        return this.Field15708;
    }

    public String toString() {
        return this.getClass().getName() + ":" + this.Field15704.toString() + ":" + this.Field15708.getClass().getName();
    }

    private static String Method178(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)2122245313 ^ (long)2122245313);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)905702037L ^ 0x35FBEA6A);
            int n2 = ((int)-1538158916L ^ 0xA4518E9D) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)340541573 ^ (long)340542362) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

