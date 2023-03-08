//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n?\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "", "arg", "Lorg/cubic/dynamictask/ArgumentFetcher;", "call" })
final class Class299 implements Class1471
{
    public static final Class299 Field9297;
    private String Field9298 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Object Method1564(final Class424 class424) {
        return this.Method1565(class424);
    }
    
    @Nullable
    @Nullable
    public final Void Method1565(@NotNull @NotNull final Class424 class424) {
        Intrinsics.checkParameterIsNotNull((Object)class424, "arg");
        final Object method2054 = class424.Method2054(1);
        Intrinsics.checkExpressionValueIsNotNull(method2054, "arg.fetch<Boolean>(1)");
        if (method2054) {
            return null;
        }
        Class1325.Method5367().player.rotationYaw = ((float[])class424.Method2054(0))[0];
        Class1325.Method5367().player.rotationPitch = ((float[])class424.Method2054(0))[1];
        return null;
    }
    
    static {
        Field9297 = new Class299();
    }
    
    private static String Method1566(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x271 ^ 0x25));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
