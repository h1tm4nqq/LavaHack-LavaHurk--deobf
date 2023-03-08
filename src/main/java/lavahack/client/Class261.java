//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/util/enums/GradientModes$Companion;", "", "()V", "getColor", "", "gradient", "Lcom/kisman/cc/util/enums/GradientModes;", "color", "Lcom/kisman/cc/util/Colour;", "diff", "", "kisman.cc" })
public final class Class261
{
    private String Field9163 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final void Method1426(@NotNull @NotNull final Class2075 class2075, @NotNull @NotNull final Class2027 class2076, final int n) {
        Intrinsics.checkParameterIsNotNull((Object)class2075, "gradient");
        Intrinsics.checkParameterIsNotNull((Object)class2076, "color");
    }
    
    private Class261() {
    }
    
    public Class261(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
    
    private static String Method1427(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1C5A ^ 0x9C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
