//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e?\u0006\u0010" }, d2 = { "Lcom/kisman/cc/features/module/movement/speed/SpeedModes;", "", "mode", "Lcom/kisman/cc/features/module/movement/speed/ISpeedMode;", "(Ljava/lang/String;ILcom/kisman/cc/features/module/movement/speed/ISpeedMode;)V", "getMode", "()Lcom/kisman/cc/features/module/movement/speed/ISpeedMode;", "Strafe", "YPort", "StrafeNew", "MatrixBhop", "MatrixStrafe", "Bhop", "Strafe2", "Matrix", "Companion", "kisman.cc" })
public enum Class961
{
    Field12092("Strafe", 0, (Class1703)new Class1718()), 
    Field12093("YPort", 1, (Class1703)new Class1719()), 
    Field12094("StrafeNew", 2, (Class1703)new Class1714()), 
    Field12095("MatrixBhop", 3, (Class1703)new Class1717()), 
    Field12096("MatrixStrafe", 4, (Class1703)new Class1710()), 
    Field12097("Bhop", 5, (Class1703)new Class1712()), 
    Field12098("Strafe2", 6, (Class1703)new Class1707()), 
    Field12099("Matrix", 7, (Class1703)new Class1708());
    
    private static final Class961[] Field12100;
    @NotNull
    private final Class1703 Field12101;
    public static final Class1752 Field12102;
    private String Field12103 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    static {
        Field12102 = new Class1752((DefaultConstructorMarker)null);
    }
    
    @NotNull
    @NotNull
    public final Class1703 Method3949() {
        return this.Field12101;
    }
    
    private Class961(final String name, final int ordinal, final Class1703 field12101) {
        this.Field12101 = field12101;
    }
    
    private static String Method3950(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7060 ^ 0x95));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
