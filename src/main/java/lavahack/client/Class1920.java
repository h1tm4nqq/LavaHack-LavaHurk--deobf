/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import lavahack.client.Class1796;
import lavahack.client.Class2125;
import lavahack.client.Class44;

public abstract class Class1920 {
    private static final Map Field16925 = new HashMap(64);
    private final Map Field16926 = new HashMap();
    private String Field16927 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Deprecated
    @Deprecated
    public static Class1920 Method2726(String string) {
        Class1920 class1920 = (Class1920)((Callable)Field16925.get(string)).call();
        class1920.Method2730();
        return class1920;
    }

    @Deprecated
    @Deprecated
    public static void Method2727(String string, Callable callable) {
        Field16925.put(string, callable);
    }

    protected final Class44 Method2728(String string, Class44 class44) {
        Class1796.Field16241.Field16258.Method7569(class44);
        this.Field16926.put(string, class44);
        return class44;
    }

    public Class1920 Method2729() {
        this.Method2730();
        return this;
    }

    protected void Method2730() {
    }

    public final Class44 Method2731(String string) {
        return (Class44)this.Field16926.get(string);
    }

    public abstract Class2125 Method2732();
}

