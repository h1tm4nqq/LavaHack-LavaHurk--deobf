//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006?\u0006\u0007" }, d2 = { "Lcom/kisman/cc/features/module/render/CharmsRewrite;", "Lcom/kisman/cc/features/module/Module;", "()V", "pattern", "Lcom/kisman/cc/settings/util/CharmsRewriteRendererPattern;", "getPattern", "()Lcom/kisman/cc/settings/util/CharmsRewriteRendererPattern;", "kisman.cc" })
public final class Class1337 extends Class42
{
    @NotNull
    private static final Class1186 Field14112;
    public static final Class1337 Field14113;
    private String Field14114 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class1186 Method5388() {
        return Class1337.Field14112;
    }
    
    private Class1337() {
        super("CharmsRewrite", "Modify entity renderer.", Class97.Field8342);
    }
    
    static {
        (Field14112 = new Class1186((Class42)(Field14113 = new Class1337()))).Method4772();
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x12EF ^ 0xE0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
