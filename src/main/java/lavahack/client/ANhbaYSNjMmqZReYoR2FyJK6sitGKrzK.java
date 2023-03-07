/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.File;
import java.net.URL;
import lavahack.client.StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa;
import lavahack.client.fabBVWkrhk6LvUW1xRV2BacKh5WmC8P2;

public class ANhbaYSNjMmqZReYoR2FyJK6sitGKrzK
extends StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa {
    private final File Field11326;
    private final String Field11327;
    private int Field11328;

    public ANhbaYSNjMmqZReYoR2FyJK6sitGKrzK(File file, ClassLoader classLoader) throws fabBVWkrhk6LvUW1xRV2BacKh5WmC8P2 {
        super(file.getPath(), ANhbaYSNjMmqZReYoR2FyJK6sitGKrzK.Method3275(file), classLoader);
        this.Field11326 = file;
        this.Field11327 = file.getAbsolutePath();
    }

    public ANhbaYSNjMmqZReYoR2FyJK6sitGKrzK(String string, ClassLoader classLoader) throws fabBVWkrhk6LvUW1xRV2BacKh5WmC8P2 {
        this(new File(string), classLoader);
    }

    public ANhbaYSNjMmqZReYoR2FyJK6sitGKrzK(URL uRL, ClassLoader classLoader) throws fabBVWkrhk6LvUW1xRV2BacKh5WmC8P2 {
        super(uRL.toString(), uRL, classLoader);
        this.Field11326 = new File(uRL.getPath());
        this.Field11327 = this.Field11326.getAbsolutePath();
    }

    private static URL Method3275(File file) throws fabBVWkrhk6LvUW1xRV2BacKh5WmC8P2 {
        return file.toURI().toURL();
    }

    public File Method3276() {
        return this.Field11326;
    }

    public String Method3277() {
        return this.Field11327;
    }
}

