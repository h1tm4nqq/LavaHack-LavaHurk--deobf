//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005?\u0006\u0002\u0010\u0002?\u0006\u0004" }, d2 = { "Lcom/kisman/cc/util/manager/file/FileManager;", "", "()V", "Companion", "kisman.cc" })
public final class Class933
{
    @NotNull
    public static final String Field11941;
    public static final Class658 Field11942;
    private String Field11943 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    static {
        Field11941 = "image";
        Field11942 = new Class658((DefaultConstructorMarker)null);
    }
    
    private static String Method3866(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1529 ^ 0xAE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
