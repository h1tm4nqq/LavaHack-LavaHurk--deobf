//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.math.AxisAlignedBB
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.util.math.AxisAlignedBB;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e\u00a8\u0006\u0014"}, d2={"Lcom/kisman/cc/util/math/vectors/bb/ColorableSlideBB;", "Lnet/minecraft/util/math/AxisAlignedBB;", "bb", "colour1", "Lcom/kisman/cc/util/Colour;", "colour2", "colour3", "colour4", "colour5", "colour6", "(Lnet/minecraft/util/math/AxisAlignedBB;Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/Colour;)V", "getBb", "()Lnet/minecraft/util/math/AxisAlignedBB;", "getColour1", "()Lcom/kisman/cc/util/Colour;", "getColour2", "getColour3", "getColour4", "getColour5", "getColour6", "kisman.cc"})
public final class Class152
extends AxisAlignedBB {
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

    public Class152(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull Class2027 class2027, @NotNull @NotNull Class2027 class20272, @NotNull @NotNull Class2027 class20273, @NotNull @NotNull Class2027 class20274, @NotNull @NotNull Class2027 class20275, @NotNull @NotNull Class2027 class20276) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"bb");
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"colour1");
        Intrinsics.checkParameterIsNotNull((Object)class20272, (String)"colour2");
        Intrinsics.checkParameterIsNotNull((Object)class20273, (String)"colour3");
        Intrinsics.checkParameterIsNotNull((Object)class20274, (String)"colour4");
        Intrinsics.checkParameterIsNotNull((Object)class20275, (String)"colour5");
        Intrinsics.checkParameterIsNotNull((Object)class20276, (String)"colour6");
        super(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        this.Field8585 = axisAlignedBB;
        this.Field8586 = class2027;
        this.Field8587 = class20272;
        this.Field8588 = class20273;
        this.Field8589 = class20274;
        this.Field8590 = class20275;
        this.Field8591 = class20276;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 170;
            cArray2[n] = (char)(cArray[n] ^ (0x471 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

