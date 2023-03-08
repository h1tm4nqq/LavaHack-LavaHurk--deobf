//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import java.text.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\f?\u0006\r" }, d2 = { "Lcom/kisman/cc/util/enums/SpeedUnits;", "", "formatter", "Ljava/text/DecimalFormat;", "displayInfo", "", "(Ljava/lang/String;ILjava/text/DecimalFormat;Ljava/lang/String;)V", "getDisplayInfo", "()Ljava/lang/String;", "getFormatter", "()Ljava/text/DecimalFormat;", "BPS", "KMH", "kisman.cc" })
public enum Class1358
{
    Field14186("BPS", 0, new DecimalFormat("#.#"), "b/s"), 
    Field14187("KMH", 1, new DecimalFormat("#.#"), "km/h");
    
    private static final Class1358[] Field14188;
    @NotNull
    private final DecimalFormat Field14189;
    @NotNull
    private final String Field14190;
    private int Field14191;
    
    @NotNull
    @NotNull
    public final DecimalFormat Method5426() {
        return this.Field14189;
    }
    
    @NotNull
    @NotNull
    public final String Method5427() {
        return this.Field14190;
    }
    
    private Class1358(final String name, final int ordinal, final DecimalFormat field14189, final String field14190) {
        this.Field14189 = field14189;
        this.Field14190 = field14190;
    }
    
    private static String Method5428(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5EF4 ^ 0x72));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
