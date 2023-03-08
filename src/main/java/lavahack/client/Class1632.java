//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;
import kotlin.*;
import java.util.*;
import java.nio.charset.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bR\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006?\u0006\f" }, d2 = { "Lcom/kisman/cc/websockets/command/Command;", "Lcom/kisman/cc/websockets/command/ICommand;", "command", "", "(Ljava/lang/String;)V", "getCommand", "()Ljava/lang/String;", "runCommand", "", "line", "args", "", "kisman.cc" })
public abstract class Class1632 implements Class2000
{
    @NotNull
    private final String Field15619;
    private String Field15620 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final void Method1590(@NotNull @NotNull final String s, @NotNull @NotNull final List list) {
        Intrinsics.checkParameterIsNotNull((Object)s, "line");
        Intrinsics.checkParameterIsNotNull((Object)list, "args");
        for (final Class1132 class1132 : this.Method1589(s, list)) {
            if (class1132.Method4624() == Class734.Field11110) {
                final Class1132 class1133 = class1132;
                final StringBuilder append = new StringBuilder().append("true ");
                final Base64.Encoder encoder = Base64.getEncoder();
                final String method4620 = class1132.Method4620();
                byte[] src;
                if (method4620 != null) {
                    final String s2 = method4620;
                    final Charset utf_8 = Charsets.UTF_8;
                    final String s3 = s2;
                    if (s3 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    final byte[] bytes = s3.getBytes(utf_8);
                    Intrinsics.checkExpressionValueIsNotNull((Object)bytes, "(this as java.lang.String).getBytes(charset)");
                    src = bytes;
                }
                else {
                    src = null;
                }
                class1133.Method4621(append.append(encoder.encodeToString(src)).toString());
            }
            Class273.Method1450().Method543(class1132.Method4625());
        }
    }
    
    @NotNull
    @NotNull
    public final String Method1591() {
        return this.Field15619;
    }
    
    public Class1632(@NotNull @NotNull final String field15619) {
        Intrinsics.checkParameterIsNotNull((Object)field15619, "command");
        this.Field15619 = field15619;
    }
    
    private static String Method1592(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x39BE ^ 0xEA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
