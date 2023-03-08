//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.nio.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016?\u0006\t" }, d2 = { "Lcom/kisman/cc/loader/websockets/DummyMessageProcessor;", "Lcom/kisman/cc/loader/websockets/IMessageProcessor;", "()V", "processMessage", "", "buff", "Ljava/nio/ByteBuffer;", "message", "", "kisman.cc" })
public final class Class922 implements Class122
{
    private int Field11899;
    
    public void Method852(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "message");
    }
    
    public void Method853(@NotNull @NotNull final ByteBuffer byteBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)byteBuffer, "buff");
    }
    
    private static String Method3843(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x12EE ^ 0x6D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
