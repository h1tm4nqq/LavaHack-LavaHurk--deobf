//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006?\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/features/command/SubCommand;", "Lcom/kisman/cc/features/command/ICommand;", "Lcom/kisman/cc/util/chat/ChatHandler;", "command", "", "instance", "Lcom/kisman/cc/features/command/Command;", "(Ljava/lang/String;Lcom/kisman/cc/features/command/Command;)V", "getInstance", "()Lcom/kisman/cc/features/command/Command;", "getCommand", "kisman.cc" })
public abstract class Class1368 extends Class1563 implements Class2080
{
    private final String Field14225;
    @NotNull
    private final Class158 Field14226;
    private int Field14227;
    
    @NotNull
    @NotNull
    @Override
    public String Method442() {
        return this.Field14225;
    }
    
    @NotNull
    @NotNull
    public final Class158 Method2057() {
        return this.Field14226;
    }
    
    public Class1368(@NotNull @NotNull final String field14225, @NotNull @NotNull final Class158 field14226) {
        Intrinsics.checkParameterIsNotNull((Object)field14225, "command");
        Intrinsics.checkParameterIsNotNull((Object)field14226, "instance");
        this.Field14225 = field14225;
        this.Field14226 = field14226;
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xD94 ^ 0x69));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
