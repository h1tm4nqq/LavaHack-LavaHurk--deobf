//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0006\u0010\u0003\u001a\u00020\u0001?\u0006\u0004" }, d2 = { "fragment", "", "name", "vertex", "kisman.cc" })
public final class Class3
{
    private String Field7829 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public static final String Method61() {
        return "/assets/kismancc/shader/vertex.vert";
    }
    
    @NotNull
    @NotNull
    public static final String Method62(@NotNull @NotNull final String str) {
        Intrinsics.checkParameterIsNotNull((Object)str, "name");
        return "/assets/kismancc/shader/fragment/" + str;
    }
    
    private static String Method63(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x14BF ^ 0x56));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
