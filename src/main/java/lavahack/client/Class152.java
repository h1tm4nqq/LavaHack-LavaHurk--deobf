//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004?\u0006\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0001?\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e?\u0006\u0014" }, d2 = { "Lcom/kisman/cc/util/math/vectors/bb/ColorableSlideBB;", "Lnet/minecraft/util/math/AxisAlignedBB;", "bb", "colour1", "Lcom/kisman/cc/util/Colour;", "colour2", "colour3", "colour4", "colour5", "colour6", "(Lnet/minecraft/util/math/AxisAlignedBB;Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/Colour;)V", "getBb", "()Lnet/minecraft/util/math/AxisAlignedBB;", "getColour1", "()Lcom/kisman/cc/util/Colour;", "getColour2", "getColour3", "getColour4", "getColour5", "getColour6", "kisman.cc" })
public final class Class152 extends AxisAlignedBB
{
    @NotNull
    private final AxisAlignedBB Field8585;
    @NotNull
    private final Class2027 Field8586;
    @NotNull
    private final Class2027 Field8587;
    @NotNull
    private final Class2027 Field8588;
    @NotNull
    private final Class2027 Field8589;
    @NotNull
    private final Class2027 Field8590;
    @NotNull
    private final Class2027 Field8591;
    private String Field8592 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final AxisAlignedBB getBb() {
        return this.Field8585;
    }
    
    @NotNull
    @NotNull
    public final Class2027 getColour1() {
        return this.Field8586;
    }
    
    @NotNull
    @NotNull
    public final Class2027 getColour2() {
        return this.Field8587;
    }
    
    @NotNull
    @NotNull
    public final Class2027 getColour3() {
        return this.Field8588;
    }
    
    @NotNull
    @NotNull
    public final Class2027 getColour4() {
        return this.Field8589;
    }
    
    @NotNull
    @NotNull
    public final Class2027 getColour5() {
        return this.Field8590;
    }
    
    @NotNull
    @NotNull
    public final Class2027 getColour6() {
        return this.Field8591;
    }
    
    public Class152(@NotNull @NotNull final AxisAlignedBB field8585, @NotNull @NotNull final Class2027 field8586, @NotNull @NotNull final Class2027 field8587, @NotNull @NotNull final Class2027 field8588, @NotNull @NotNull final Class2027 field8589, @NotNull @NotNull final Class2027 field8590, @NotNull @NotNull final Class2027 field8591) {
        Intrinsics.checkParameterIsNotNull((Object)field8585, "bb");
        Intrinsics.checkParameterIsNotNull((Object)field8586, "colour1");
        Intrinsics.checkParameterIsNotNull((Object)field8587, "colour2");
        Intrinsics.checkParameterIsNotNull((Object)field8588, "colour3");
        Intrinsics.checkParameterIsNotNull((Object)field8589, "colour4");
        Intrinsics.checkParameterIsNotNull((Object)field8590, "colour5");
        Intrinsics.checkParameterIsNotNull((Object)field8591, "colour6");
        super(field8585.minX, field8585.minY, field8585.minZ, field8585.maxX, field8585.maxY, field8585.maxZ);
        this.Field8585 = field8585;
        this.Field8586 = field8586;
        this.Field8587 = field8587;
        this.Field8588 = field8588;
        this.Field8589 = field8589;
        this.Field8590 = field8590;
        this.Field8591 = field8591;
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x471 ^ 0xAA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
