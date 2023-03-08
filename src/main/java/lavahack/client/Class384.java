//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.util.math.*;
import org.jetbrains.annotations.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/util/math/vectors/xyz/ColorablePos;", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "colour", "Lcom/kisman/cc/util/Colour;", "(Lnet/minecraft/util/math/BlockPos;Lcom/kisman/cc/util/Colour;)V", "getColour", "()Lcom/kisman/cc/util/Colour;", "getPos", "()Lnet/minecraft/util/math/BlockPos;", "kisman.cc" })
public final class Class384
{
    @NotNull
    private final BlockPos Field9611;
    @NotNull
    private final Class2027 Field9612;
    private String Field9613 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final BlockPos Method1858() {
        return this.Field9611;
    }
    
    @NotNull
    @NotNull
    public final Class2027 Method1859() {
        return this.Field9612;
    }
    
    public Class384(@NotNull @NotNull final BlockPos field9611, @NotNull @NotNull final Class2027 field9612) {
        Intrinsics.checkParameterIsNotNull((Object)field9611, "pos");
        Intrinsics.checkParameterIsNotNull((Object)field9612, "colour");
        this.Field9611 = field9611;
        this.Field9612 = field9612;
    }
    
    private static String Method1860(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x549D ^ 0xE3));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
