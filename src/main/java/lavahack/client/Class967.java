//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.event.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006?\u0006\u0007" }, d2 = { "Lcom/kisman/cc/event/events/client/console/ConsoleMessageEvent;", "Lcom/kisman/cc/event/Event;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "kisman.cc" })
public final class Class967 extends Class2157
{
    @NotNull
    private final String Field12143;
    private int Field12144;
    
    @NotNull
    @NotNull
    public final String Method3968() {
        return this.Field12143;
    }
    
    public Class967(@NotNull @NotNull final String field12143) {
        Intrinsics.checkParameterIsNotNull((Object)field12143, "message");
        super(new Object[0]);
        this.Field12143 = field12143;
    }
    
    private static String Method170(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x714D ^ 0xB8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
