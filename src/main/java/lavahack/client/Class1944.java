//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.util.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b?\u0006\t" }, d2 = { "Lcom/kisman/cc/util/enums/HandModes;", "", "hand", "Lnet/minecraft/util/EnumHand;", "(Ljava/lang/String;ILnet/minecraft/util/EnumHand;)V", "getHand", "()Lnet/minecraft/util/EnumHand;", "MainHand", "OffHand", "kisman.cc" })
public enum Class1944
{
    Field16988("MainHand", 0, EnumHand.MAIN_HAND), 
    Field16989("OffHand", 1, EnumHand.OFF_HAND);
    
    private static final Class1944[] Field16990;
    @NotNull
    private final EnumHand Field16991;
    private String Field16992 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final EnumHand Method7226() {
        return this.Field16991;
    }
    
    private Class1944(final String name, final int ordinal, final EnumHand field16991) {
        this.Field16991 = field16991;
    }
    
    private static String Method7227(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6B5C ^ 0xEF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
