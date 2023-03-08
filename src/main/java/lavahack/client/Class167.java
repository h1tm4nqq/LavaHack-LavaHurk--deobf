//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.util.concurrent.*;

@Deprecated
public final class Class167
{
    private final Queue Field8699;
    private final Queue Field8700;
    private ExecutorService Field8701;
    private String Field8702 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class167() {
        this.Field8699 = new LinkedList();
        this.Field8700 = new LinkedList();
        this.Field8701 = new ScheduledThreadPoolExecutor(1);
    }
    
    public void Method1065(final Class1781 class1781) {
        this.Field8699.offer(class1781);
    }
    
    public void Method1066(final Object... array) {
        if (this.Field8699.isEmpty()) {
            return;
        }
        this.Field8700.offer(Class167::Method1068);
        if (!this.Field8701.isShutdown() || !this.Field8701.isTerminated()) {
            return;
        }
        this.Field8701.submit(this::Method1067);
    }
    
    private void Method1067() {
        while (!this.Field8700.isEmpty()) {
            this.Field8700.poll().run();
        }
    }
    
    private static void Method1068(final Class1781 class1781, final Object[] array) {
        class1781.Method6745(array);
    }
}
