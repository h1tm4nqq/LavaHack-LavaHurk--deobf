//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import kotlin.*;
import java.awt.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\n" }, d2 = { "Lcom/kisman/cc/loader/gui/utils/LoaderFont;", "", "name", "", "font", "Ljava/awt/Font;", "(Ljava/lang/String;Ljava/awt/Font;)V", "getFont", "()Ljava/awt/Font;", "toString", "kisman.cc" })
public final class Class1272
{
    private final String Field13743;
    @NotNull
    private final Font Field13744;
    private String Field13745 = "TheKisDevs & LavaHack Development owns you";
    
    @NotNull
    @NotNull
    @Override
    public String toString() {
        return this.Field13743;
    }
    
    @NotNull
    @NotNull
    public final Font Method5105() {
        return this.Field13744;
    }
    
    public Class1272(@NotNull @NotNull final String field13743, @NotNull @NotNull final Font field13744) {
        Intrinsics.checkParameterIsNotNull((Object)field13743, "name");
        Intrinsics.checkParameterIsNotNull((Object)field13744, "font");
        this.Field13743 = field13743;
        this.Field13744 = field13744;
    }
    
    private static String Method5106(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x8A0 ^ 0x59));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
