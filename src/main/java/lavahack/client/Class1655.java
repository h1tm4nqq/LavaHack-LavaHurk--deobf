/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.net.URL;
import java.net.URLConnection;
import lavahack.client.Class1843;

public abstract class Class1655 {
    protected final String Field15703;
    protected final URL Field15704;
    protected final String Field15705;
    protected final String Field15706;
    protected final URLConnection Field15707;
    protected final ClassLoader Field15708;
    private int Field15709;

    public Class1655(String string, ClassLoader classLoader) throws Class1843 {
        URLConnection uRLConnection;
        this.Field15708 = classLoader != null ? classLoader : Thread.currentThread().getContextClassLoader();
        URL uRL = this.Field15708.getResource(string);
        if (uRL == null) {
            throw new Class1843();
        }
        this.Field15703 = string;
        this.Field15704 = uRL;
        this.Field15705 = uRL.getProtocol();
        this.Field15706 = uRL.getPath();
        this.Field15707 = uRLConnection = uRL.openConnection();
    }

    public Class1655(String string) throws Class1843 {
        this(string, Thread.currentThread().getContextClassLoader());
    }

    protected Class1655(String string, URL uRL, ClassLoader classLoader) throws Class1843 {
        URLConnection uRLConnection;
        ClassLoader classLoader2 = this.Field15708 = classLoader != null ? classLoader : Thread.currentThread().getContextClassLoader();
        if (uRL == null) {
            throw new Class1843();
        }
        this.Field15703 = string;
        this.Field15704 = uRL;
        this.Field15705 = uRL.getProtocol();
        this.Field15706 = uRL.getPath();
        this.Field15707 = uRLConnection = uRL.openConnection();
    }

    protected Class1655(String string, URL uRL) throws Class1843 {
        this(string, uRL, null);
    }

    protected Class1655(String string, URL uRL, URLConnection uRLConnection, ClassLoader classLoader) {
        this.Field15703 = string;
        this.Field15704 = uRL;
        this.Field15705 = uRL.getProtocol();
        this.Field15706 = uRL.getProtocol();
        this.Field15707 = uRLConnection;
        this.Field15708 = classLoader;
    }

    protected Class1655(String string, URL uRL, String string2, String string3, URLConnection uRLConnection, ClassLoader classLoader) {
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 132;
            cArray2[n] = (char)(cArray[n] ^ (0x31F0 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

