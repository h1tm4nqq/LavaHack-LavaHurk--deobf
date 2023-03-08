//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/pingbypass/server/features/modules/PingBypassCategory;", "", "category", "Lcom/kisman/cc/features/module/Category;", "(Ljava/lang/String;ILcom/kisman/cc/features/module/Category;)V", "getCategory", "()Lcom/kisman/cc/features/module/Category;", "COMBAT", "CLIENT", "MOVEMENT", "PLAYER", "kisman.cc" })
public enum Class2130
{
    Field17685("COMBAT", 0, Class97.Field8338), 
    Field17686("CLIENT", 1, Class97.Field8339), 
    Field17687("MOVEMENT", 2, Class97.Field8340), 
    Field17688("PLAYER", 3, Class97.Field8341);
    
    private static final Class2130[] Field17689;
    @NotNull
    private final Class97 Field17690;
    private String Field17691 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class97 Method7667() {
        return this.Field17690;
    }
    
    private Class2130(final String name, final int ordinal, final Class97 field17690) {
        this.Field17690 = field17690;
    }
    
    private static String Method7668(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2F51 ^ 0x4F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
