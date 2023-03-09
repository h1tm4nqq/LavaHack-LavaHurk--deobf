/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.File;
import java.net.URL;
import lavahack.client.Class1655;
import lavahack.client.Class1843;

public class Class787
extends Class1655 {
    private final File Field11326;
    private final String Field11327;
    private int Field11328;

    public Class787(File file, ClassLoader classLoader) throws Class1843 {
        super(file.getPath(), Class787.Method3275(file), classLoader);
        this.Field11326 = file;
        this.Field11327 = file.getAbsolutePath();
    }

    public Class787(String string, ClassLoader classLoader) throws Class1843 {
        this(new File(string), classLoader);
    }

    public Class787(URL uRL, ClassLoader classLoader) throws Class1843 {
        super(uRL.toString(), uRL, classLoader);
        this.Field11326 = new File(uRL.getPath());
        this.Field11327 = this.Field11326.getAbsolutePath();
    }

    private static URL Method3275(File file) throws Class1843 {
        return file.toURI().toURL();
    }

    public File Method3276() {
        return this.Field11326;
    }

    public String Method3277() {
        return this.Field11327;
    }
}

