//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0016?\u0006\u0002\u0010\u000b?\u0006\f" }, d2 = { "Lcom/kisman/cc/features/command/commands/TestCommand$SubTestCommand2;", "Lcom/kisman/cc/features/command/SubCommand;", "instance", "Lcom/kisman/cc/features/command/Command;", "(Lcom/kisman/cc/features/command/Command;)V", "runCommand", "", "s", "", "args", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "kisman.cc" })
final class Class1284 extends Class1368
{
    private String Field13856 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method443(@NotNull @NotNull final String s, @NotNull @NotNull final String[] array) {
        Intrinsics.checkParameterIsNotNull((Object)s, "s");
        Intrinsics.checkParameterIsNotNull((Object)array, "args");
        this.Method438("Error(((");
    }
    
    public Class1284(@NotNull @NotNull final Class158 class158) {
        Intrinsics.checkParameterIsNotNull((Object)class158, "instance");
        super("test3", class158);
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x606F ^ 0x1D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
