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

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/util/math/vectors/bb/ColorableBB;", "Lnet/minecraft/util/math/AxisAlignedBB;", "bb", "color", "Lcom/kisman/cc/util/Colour;", "(Lnet/minecraft/util/math/AxisAlignedBB;Lcom/kisman/cc/util/Colour;)V", "getBb", "()Lnet/minecraft/util/math/AxisAlignedBB;", "getColor", "()Lcom/kisman/cc/util/Colour;", "kisman.cc"})
public final class Class1799
extends AxisAlignedBB {
    @NotNull
    private final AxisAlignedBB Field16297;
    @NotNull
    private final Class2027 Field16298;
    private String Field16299 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final AxisAlignedBB getBb() {
        return this.Field16297;
    }

    @NotNull
    @NotNull
    public final Class2027 getColor() {
        return this.Field16298;
    }

    public Class1799(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull Class2027 class2027) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"bb");
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"color");
        super(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        this.Field16297 = axisAlignedBB;
        this.Field16298 = class2027;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 198;
            cArray2[n] = (char)(cArray[n] ^ (0x7412 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

