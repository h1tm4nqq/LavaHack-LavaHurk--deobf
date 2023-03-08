//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.concurrent.*;
import java.util.*;

public abstract class Class1920
{
    private static final Map Field16925;
    private final Map Field16926;
    private String Field16927 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Deprecated
    @Deprecated
    public static Class1920 Method2726(final String s) {
        final Class1920 class1920 = Class1920.Field16925.get(s).call();
        class1920.Method2730();
        return class1920;
    }
    
    @Deprecated
    @Deprecated
    public static void Method2727(final String s, final Callable callable) {
        Class1920.Field16925.put(s, callable);
    }
    
    public Class1920() {
        this.Field16926 = new HashMap();
    }
    
    protected final Class44 Method2728(final String s, final Class44 class44) {
        Class1796.Field16241.Field16258.Method7569(class44);
        this.Field16926.put(s, class44);
        return class44;
    }
    
    public Class1920 Method2729() {
        this.Method2730();
        return this;
    }
    
    protected void Method2730() {
    }
    
    public final Class44 Method2731(final String s) {
        return this.Field16926.get(s);
    }
    
    public abstract Class2125 Method2732();
    
    static {
        Field16925 = new HashMap(64);
    }
}
