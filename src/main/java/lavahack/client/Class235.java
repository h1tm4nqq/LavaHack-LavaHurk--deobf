//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b?\u0006\f" }, d2 = { "Lcom/kisman/cc/util/enums/RPCImages;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "Default", "LavaHake", "New", "Rc", "Null", "kisman.cc" })
public enum Class235
{
    Field9024("Default", 0, "logo"), 
    Field9025("LavaHake", 1, "lavahake"), 
    Field9026("New", 2, "new"), 
    Field9027("Rc", 3, "rc"), 
    Field9028("Null", 4, "small");
    
    private static final Class235[] Field9029;
    @NotNull
    private final String Field9030;
    private int Field9031;
    
    @NotNull
    @NotNull
    public final String Method1303() {
        return this.Field9030;
    }
    
    private Class235(final String name, final int ordinal, final String field9030) {
        this.Field9030 = field9030;
    }
    
    private static String Method1304(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1AD7 ^ 0x9C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
