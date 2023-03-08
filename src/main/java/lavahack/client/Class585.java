//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.concurrent.*;

public class Class585 implements Runnable
{
    private final transient Class1189 Field10485;
    private transient boolean Field10486;
    private transient boolean Field10487;
    private int Field10488;
    
    private Class585(final Class1189 field10485) {
        this.Field10485 = field10485;
    }
    
    @Override
    public void run() {
        if (this.Field10486) {
            throw new IllegalStateException("Already running");
        }
        this.Field10486 = true;
        this.Field10485.Field13385.start();
    }
    
    public Class585 Method2535() {
        if (this.Field10486) {
            throw new IllegalStateException("Already running");
        }
        this.Field10486 = true;
        this.Field10485.Field13385.start();
        return this;
    }
    
    public Class31 Method2536() {
        if (!this.Field10486 || this.Field10487) {
            return new Class31((Object)null, true);
        }
        if (!this.Field10485.Field13387) {
            this.Field10485.Field13385.stop();
            this.Field10486 = false;
            return new Class31((Object)null, true);
        }
        this.Field10486 = false;
        return new Class31(this.Field10485.Field13386, false);
    }
    
    public void Method2537() {
        if (this.Field10487) {
            throw new IllegalStateException("Already paused");
        }
        this.Field10487 = true;
        this.Field10485.Field13385.suspend();
    }
    
    public void Method2538() {
        if (!this.Field10487) {
            throw new IllegalStateException("Not paused");
        }
        this.Field10487 = false;
        this.Field10485.Field13385.resume();
    }
    
    public Object Method2539() {
        if (!this.Field10486 || this.Field10487) {
            throw new IllegalStateException("No running");
        }
        Method2546(this.Field10485.Field13385::join);
        this.Field10486 = false;
        return this.Field10485.Field13386;
    }
    
    public Object Method2540() {
        if (!this.Field10486 || this.Field10487) {
            throw new IllegalStateException("No running");
        }
        while (!this.Field10485.Field13387) {}
        this.Field10486 = false;
        return this.Field10485.Field13386;
    }
    
    public boolean Method2541() {
        return this.Field10485.Field13387;
    }
    
    public boolean Method2542() {
        return this.Field10486;
    }
    
    public boolean Method2543() {
        return this.Field10487;
    }
    
    public static Class585 Method2544(final Callable callable) {
        return new Class585(new Class1189(callable));
    }
    
    private static Object Method2545(final Callable callable) {
        callable.call();
        return null;
    }
    
    private static void Method2546(final Class1984 class1984) {
        class1984.Method7342();
    }
    
    private static String Method2547(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xDBA ^ 0xB7));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
