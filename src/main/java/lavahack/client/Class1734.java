//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import com.kisman.cc.util.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016?\u0006\u0005" }, d2 = { "Lcom/kisman/cc/util/thread/kisman/Service;", "Ljava/lang/Thread;", "()V", "run", "", "kisman.cc" })
public final class Class1734 extends Thread
{
    private int Field15959;
    
    @Override
    public void run() {
        while (true) {
            final Thread currentThread = Thread.currentThread();
            Intrinsics.checkExpressionValueIsNotNull((Object)currentThread, "currentThread()");
            if (currentThread.isInterrupted()) {
                break;
            }
            if (Class886.Method3712()) {
                if (!Class221.Method1271().isEmpty()) {}
                for (final Class42 class43 : Class1796.Field16241.Field16254.Field8854) {
                    final Class42 class42 = class43;
                    Intrinsics.checkExpressionValueIsNotNull((Object)class43, "module");
                    if (class43.Method35()) {
                        class42.Method46();
                    }
                }
            }
            else {
                Thread.yield();
            }
        }
    }
    
    private static String Method6605(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xFE5 ^ 0x84));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
