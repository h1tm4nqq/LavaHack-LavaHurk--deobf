//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.event.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003?\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0007\"\u0004\b\t\u0010\n?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/event/events/EventC00Handshake;", "Lcom/kisman/cc/event/Event;", "ip", "", "defaultIp", "(Ljava/lang/String;Ljava/lang/String;)V", "getDefaultIp", "()Ljava/lang/String;", "getIp", "setIp", "(Ljava/lang/String;)V", "kisman.cc" })
public final class Class986 extends Class2157
{
    @NotNull
    private String Field12225;
    @NotNull
    private final String Field12226;
    private String Field12227 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final String Method4009() {
        return this.Field12225;
    }
    
    public final void Method4010(@NotNull @NotNull final String field12225) {
        Intrinsics.checkParameterIsNotNull((Object)field12225, "<set-?>");
        this.Field12225 = field12225;
    }
    
    @NotNull
    @NotNull
    public final String Method4011() {
        return this.Field12226;
    }
    
    public Class986(@NotNull @NotNull final String field12225, @NotNull @NotNull final String field12226) {
        Intrinsics.checkParameterIsNotNull((Object)field12225, "ip");
        Intrinsics.checkParameterIsNotNull((Object)field12226, "defaultIp");
        super(new Object[0]);
        this.Field12225 = field12225;
        this.Field12226 = field12226;
    }
    
    private static String Method170(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x48E1 ^ 0x93));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
