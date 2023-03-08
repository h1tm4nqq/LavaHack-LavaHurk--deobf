//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r?\u0006\u000e" }, d2 = { "Lcom/kisman/cc/features/capes/Capes;", "", "name0", "", "subscription", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getName0", "()Ljava/lang/String;", "getSubscription", "()I", "Release", "Beta", "Developer", "kisman.cc" })
public enum Class1670
{
    Field15771("Release", 0, "release", 1), 
    Field15772("Beta", 1, "beta", 2), 
    Field15773("Developer", 2, "developer", 3);
    
    private static final Class1670[] Field15774;
    @NotNull
    private final String Field15775;
    private final int Field15776;
    private int Field15777;
    
    @NotNull
    @NotNull
    public final String Method6445() {
        return this.Field15775;
    }
    
    public final int Method6446() {
        return this.Field15776;
    }
    
    private Class1670(final String name, final int ordinal, final String field15775, final int field15776) {
        this.Field15775 = field15775;
        this.Field15776 = field15776;
    }
    
    private static String Method6447(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7627 ^ 0xC6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
