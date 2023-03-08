//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.util.math.*;
import org.jetbrains.annotations.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e?\u0006\u000f" }, d2 = { "Lcom/kisman/cc/util/math/vectors/xyz/Vec3dColored;", "", "vec", "Lnet/minecraft/util/math/Vec3d;", "color", "Lcom/kisman/cc/util/Colour;", "(Lnet/minecraft/util/math/Vec3d;Lcom/kisman/cc/util/Colour;)V", "getColor", "()Lcom/kisman/cc/util/Colour;", "setColor", "(Lcom/kisman/cc/util/Colour;)V", "getVec", "()Lnet/minecraft/util/math/Vec3d;", "setVec", "(Lnet/minecraft/util/math/Vec3d;)V", "kisman.cc" })
public final class Class814
{
    @NotNull
    private Vec3d Field11480;
    @NotNull
    private Class2027 Field11481;
    private int Field11482;
    
    @NotNull
    @NotNull
    public final Vec3d Method3427() {
        return this.Field11480;
    }
    
    public final void Method3428(@NotNull @NotNull final Vec3d field11480) {
        Intrinsics.checkParameterIsNotNull((Object)field11480, "<set-?>");
        this.Field11480 = field11480;
    }
    
    @NotNull
    @NotNull
    public final Class2027 Method3429() {
        return this.Field11481;
    }
    
    public final void Method3430(@NotNull @NotNull final Class2027 field11481) {
        Intrinsics.checkParameterIsNotNull((Object)field11481, "<set-?>");
        this.Field11481 = field11481;
    }
    
    public Class814(@NotNull @NotNull final Vec3d field11480, @NotNull @NotNull final Class2027 field11481) {
        Intrinsics.checkParameterIsNotNull((Object)field11480, "vec");
        Intrinsics.checkParameterIsNotNull((Object)field11481, "color");
        this.Field11480 = field11480;
        this.Field11481 = field11481;
    }
    
    private static String Method3431(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7DA3 ^ 0x69));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
