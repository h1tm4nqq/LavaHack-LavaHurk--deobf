//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004?\u0006\u0002\u0010\u0006?\u0006\u0007" }, d2 = { "Lcom/kisman/cc/features/command/exceptions/SimilarCommandNamesException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "command1", "Lcom/kisman/cc/features/command/ICommand;", "command2", "(Lcom/kisman/cc/features/command/ICommand;Lcom/kisman/cc/features/command/ICommand;)V", "kisman.cc" })
public final class Class222 extends RuntimeException
{
    private String Field8961 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class222(@NotNull @NotNull final Class2080 class2080, @NotNull @NotNull final Class2080 class2081) {
        Intrinsics.checkParameterIsNotNull((Object)class2080, "command1");
        Intrinsics.checkParameterIsNotNull((Object)class2081, "command2");
        super("Similar names of " + class2080.getClass().getName() + " and " + class2081.getClass().getName() + '!');
    }
    
    private static String Method1272(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6290 ^ 0x78));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
