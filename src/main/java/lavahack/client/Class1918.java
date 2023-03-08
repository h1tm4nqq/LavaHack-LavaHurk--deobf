//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;
import net.minecraft.util.math.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004?\u0006\u0002\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\b\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\t\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0001?\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013?\u0006\u0014" }, d2 = { "Lcom/kisman/cc/util/math/vectors/xyz/ColorableSlidePos;", "Lnet/minecraft/util/math/BlockPos;", "pos", "colour1", "Lcom/kisman/cc/util/Colour;", "colour2", "colour3", "colour4", "colour5", "colour6", "(Lnet/minecraft/util/math/BlockPos;Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/Colour;)V", "getColour1", "()Lcom/kisman/cc/util/Colour;", "getColour2", "getColour3", "getColour4", "getColour5", "getColour6", "getPos", "()Lnet/minecraft/util/math/BlockPos;", "kisman.cc" })
public final class Class1918 extends BlockPos
{
    @NotNull
    private final BlockPos Field16911;
    @NotNull
    private final Class2027 Field16912;
    @NotNull
    private final Class2027 Field16913;
    @NotNull
    private final Class2027 Field16914;
    @NotNull
    private final Class2027 Field16915;
    @NotNull
    private final Class2027 Field16916;
    @NotNull
    private final Class2027 Field16917;
    private int Field16918;
    
    @NotNull
    @NotNull
    public final BlockPos getPos() {
        return this.Field16911;
    }
    
    @NotNull
    @NotNull
    public final Class2027 getColour1() {
        return this.Field16912;
    }
    
    @NotNull
    @NotNull
    public final Class2027 getColour2() {
        return this.Field16913;
    }
    
    @NotNull
    @NotNull
    public final Class2027 getColour3() {
        return this.Field16914;
    }
    
    @NotNull
    @NotNull
    public final Class2027 getColour4() {
        return this.Field16915;
    }
    
    @NotNull
    @NotNull
    public final Class2027 getColour5() {
        return this.Field16916;
    }
    
    @NotNull
    @NotNull
    public final Class2027 getColour6() {
        return this.Field16917;
    }
    
    public Class1918(@NotNull @NotNull final BlockPos field16911, @NotNull @NotNull final Class2027 field16912, @NotNull @NotNull final Class2027 field16913, @NotNull @NotNull final Class2027 field16914, @NotNull @NotNull final Class2027 field16915, @NotNull @NotNull final Class2027 field16916, @NotNull @NotNull final Class2027 field16917) {
        Intrinsics.checkParameterIsNotNull((Object)field16911, "pos");
        Intrinsics.checkParameterIsNotNull((Object)field16912, "colour1");
        Intrinsics.checkParameterIsNotNull((Object)field16913, "colour2");
        Intrinsics.checkParameterIsNotNull((Object)field16914, "colour3");
        Intrinsics.checkParameterIsNotNull((Object)field16915, "colour4");
        Intrinsics.checkParameterIsNotNull((Object)field16916, "colour5");
        Intrinsics.checkParameterIsNotNull((Object)field16917, "colour6");
        super((Vec3i)field16911);
        this.Field16911 = field16911;
        this.Field16912 = field16912;
        this.Field16913 = field16913;
        this.Field16914 = field16914;
        this.Field16915 = field16915;
        this.Field16916 = field16916;
        this.Field16917 = field16917;
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x777 ^ 0xD0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
