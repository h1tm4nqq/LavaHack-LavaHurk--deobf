//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0003\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/util/thread/kisman/ThreadManager;", "", "()V", "service", "Lcom/kisman/cc/util/thread/kisman/Service;", "getService", "()Lcom/kisman/cc/util/thread/kisman/Service;", "submit", "", "runnable", "Ljava/lang/Runnable;", "kisman.cc" })
public final class Class274
{
    @NotNull
    private final Class1734 Field9206;
    private String Field9207 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class1734 Method1458() {
        return this.Field9206;
    }
    
    public final void Method1459(@NotNull @NotNull final Runnable e) {
        Intrinsics.checkParameterIsNotNull((Object)e, "runnable");
        Class221.Method1271().add(e);
    }
    
    public Class274() {
        final Class1734 class1734;
        final Class1734 field9206 = class1734 = new Class1734();
        class1734.setName("LavaHack-Thread-Manager");
        class1734.setDaemon(true);
        class1734.start();
        this.Field9206 = field9206;
    }
    
    private static String Method1460(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4B54 ^ 0x51));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
