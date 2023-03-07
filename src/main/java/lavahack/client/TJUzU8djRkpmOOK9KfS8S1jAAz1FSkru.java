/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.net.JarURLConnection;
import java.net.URL;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import lavahack.client.StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa;
import lavahack.client.fabBVWkrhk6LvUW1xRV2BacKh5WmC8P2;

public class TJUzU8djRkpmOOK9KfS8S1jAAz1FSkru
extends StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa {
    private final JarURLConnection Field15856;
    private final JarFile Field15857;
    private String Field15858 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public TJUzU8djRkpmOOK9KfS8S1jAAz1FSkru(JarURLConnection jarURLConnection, ClassLoader classLoader) throws fabBVWkrhk6LvUW1xRV2BacKh5WmC8P2 {
        super(jarURLConnection.toString(), jarURLConnection.getURL(), classLoader);
        JarFile jarFile;
        this.Field15856 = jarURLConnection;
        this.Field15857 = jarFile = jarURLConnection.getJarFile();
    }

    public TJUzU8djRkpmOOK9KfS8S1jAAz1FSkru(JarURLConnection jarURLConnection) throws fabBVWkrhk6LvUW1xRV2BacKh5WmC8P2 {
        this(jarURLConnection, null);
    }

    public TJUzU8djRkpmOOK9KfS8S1jAAz1FSkru(URL uRL, ClassLoader classLoader) throws fabBVWkrhk6LvUW1xRV2BacKh5WmC8P2 {
        super(uRL.toString(), uRL, classLoader);
        JarFile jarFile;
        JarURLConnection jarURLConnection;
        this.Field15856 = jarURLConnection = (JarURLConnection)uRL.openConnection();
        if (jarURLConnection == null) {
            this.Field15857 = null;
            return;
        }
        this.Field15857 = jarFile = jarURLConnection.getJarFile();
    }

    public JarURLConnection Method6501() {
        return this.Field15856;
    }

    public JarFile Method6502() {
        return this.Field15857;
    }

    public JarEntry Method6503(String string) {
        return this.Field15857.getJarEntry(string);
    }
}

