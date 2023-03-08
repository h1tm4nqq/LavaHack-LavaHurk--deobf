//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n?\u0006\f" }, d2 = { "Lcom/kisman/cc/event/events/client/friend/FriendEvent;", "", "name", "", "type", "Lcom/kisman/cc/event/events/client/friend/FriendEvent$Type;", "(Ljava/lang/String;Lcom/kisman/cc/event/events/client/friend/FriendEvent$Type;)V", "getName", "()Ljava/lang/String;", "getType", "()Lcom/kisman/cc/event/events/client/friend/FriendEvent$Type;", "Type", "kisman.cc" })
public final class Class1477
{
    @NotNull
    private final String Field14887;
    @NotNull
    private final Class96 Field14888;
    private String Field14889 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final String Method5918() {
        return this.Field14887;
    }
    
    @NotNull
    @NotNull
    public final Class96 Method5919() {
        return this.Field14888;
    }
    
    public Class1477(@NotNull @NotNull final String field14887, @NotNull @NotNull final Class96 field14888) {
        Intrinsics.checkParameterIsNotNull((Object)field14887, "name");
        Intrinsics.checkParameterIsNotNull((Object)field14888, "type");
        this.Field14887 = field14887;
        this.Field14888 = field14888;
    }
    
    private static String Method5920(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x786C ^ 0xC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
