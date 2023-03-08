//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u0000 \n2\u00060\u0001j\u0002`\u0002:\u0001\nB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004?\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007?\u0006\u0002\u0010\bB\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007?\u0006\u0002\u0010\t?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/websockets/api/exceptions/NotSendableException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "s", "", "(Ljava/lang/String;)V", "t", "", "(Ljava/lang/Throwable;)V", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Companion", "kisman.cc" })
public final class Class249 extends RuntimeException
{
    private static final long Field9087;
    public static final Class976 Field9088;
    private int Field9089;
    
    public Class249(@NotNull @NotNull final String message) {
        Intrinsics.checkParameterIsNotNull((Object)message, "s");
        super(message);
    }
    
    public Class249(@NotNull @NotNull final Throwable cause) {
        Intrinsics.checkParameterIsNotNull((Object)cause, "t");
        super(cause);
    }
    
    public Class249(@NotNull @NotNull final String message, @NotNull @NotNull final Throwable cause) {
        Intrinsics.checkParameterIsNotNull((Object)message, "s");
        Intrinsics.checkParameterIsNotNull((Object)cause, "t");
        super(message, cause);
    }
    
    static {
        Field9087 = -6468967874576651628L;
        Field9088 = new Class976(null);
    }
    
    private static String Method1334(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x74C4 ^ 0x83));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
