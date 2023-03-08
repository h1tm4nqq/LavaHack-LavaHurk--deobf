//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\b\u0010\u0002\u001a\u00020\u0007H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r?\u0006\u000e" }, d2 = { "Lcom/kisman/cc/util/enums/CapeEnum;", "", "location", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getLocation", "()Ljava/lang/String;", "Lnet/minecraft/util/ResourceLocation;", "Gif", "XuluPlus", "Kuro", "Gentle", "Putin", "Gradient", "kisman.cc" })
public enum Class1529
{
    Field15146("Gif", 0), 
    Field15147("XuluPlus", 1, "kismancc:cape/xuluplus/xulupluscape.png"), 
    Field15148("Kuro", 2, "kismancc:cape/kuro/kuro.png"), 
    Field15149("Gentle", 3, "kismancc:cape/gentlemanmc/GentlemanMC.png"), 
    Field15150("Putin", 4, "kismancc:cape/putin/putin.png"), 
    Field15151("Gradient", 5, "kismancc:cape/gradient/gradient.png");
    
    private static final Class1529[] Field15152;
    @NotNull
    private final String Field15153;
    private String Field15154 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public ResourceLocation Method6069() {
        return new ResourceLocation(this.Field15153);
    }
    
    @NotNull
    @NotNull
    public final String Method6070() {
        return this.Field15153;
    }
    
    private Class1529(final String name, final int ordinal, final String field15153) {
        this.Field15153 = field15153;
    }
    
    public Class1529(final String s, final int n, final String s2, final DefaultConstructorMarker defaultConstructorMarker) {
        this(s, n, s2);
    }
    
    private static String Method6071(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7525 ^ 0x2E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
