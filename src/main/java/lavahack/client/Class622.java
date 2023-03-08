//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t?\u0006\n" }, d2 = { "Lcom/kisman/cc/util/enums/PearlBypassModes;", "", "displayName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "toString", "Normal", "CrystalPvPcc", "kisman.cc" })
public enum Class622
{
    Field10650("Normal", 0, "Normal"), 
    Field10651("CrystalPvPcc", 1, "crystalpvp.cc");
    
    private static final Class622[] Field10652;
    @NotNull
    private final String Field10653;
    private int Field10654;
    
    @NotNull
    @NotNull
    @Override
    public String toString() {
        return this.Field10653;
    }
    
    @NotNull
    @NotNull
    public final String Method2657() {
        return this.Field10653;
    }
    
    private Class622(final String name, final int ordinal, final String field10653) {
        this.Field10653 = field10653;
    }
    
    private static String Method2658(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4161 ^ 0x40));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
