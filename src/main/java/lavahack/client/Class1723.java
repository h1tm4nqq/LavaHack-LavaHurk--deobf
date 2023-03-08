//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\f\rB\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J#\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0016?\u0006\u0002\u0010\u000b?\u0006\u000e" }, d2 = { "Lcom/kisman/cc/features/command/commands/TestCommand;", "Lcom/kisman/cc/features/command/Command;", "()V", "getDescription", "", "getSyntax", "runCommand", "", "s", "args", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "SubTestCommand1", "SubTestCommand2", "kisman.cc" })
public final class Class1723 extends Class158
{
    private int Field15922;
    
    public void Method443(@NotNull @NotNull final String s, @NotNull @NotNull final String[] array) {
        Intrinsics.checkParameterIsNotNull((Object)s, "s");
        Intrinsics.checkParameterIsNotNull((Object)array, "args");
        this.Method446(s, array);
    }
    
    @NotNull
    @NotNull
    public String Method447() {
        return "Just a test command";
    }
    
    @NotNull
    @NotNull
    public String Method448() {
        return "test1 test2";
    }
    
    public Class1723() {
        super("test1");
        this.Method445(new Class1368[] { (Class1368)new Class1004((Class158)this), (Class1368)new Class1284((Class158)this) });
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6718 ^ 0xBA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
