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

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.util.math.AxisAlignedBB;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/util/math/vectors/bb/ColorableBB;", "Lnet/minecraft/util/math/AxisAlignedBB;", "bb", "color", "Lcom/kisman/cc/util/Colour;", "(Lnet/minecraft/util/math/AxisAlignedBB;Lcom/kisman/cc/util/Colour;)V", "getBb", "()Lnet/minecraft/util/math/AxisAlignedBB;", "getColor", "()Lcom/kisman/cc/util/Colour;", "kisman.cc"})
public final class NvnQalk41EB5LEXqvCEjiSC5XBr0gGzj
extends AxisAlignedBB {
    @NotNull
    private final AxisAlignedBB Field16297;
    @NotNull
    private final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field16298;
    private String Field16299 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final AxisAlignedBB getBb() {
        return this.Field16297;
    }

    @NotNull
    @NotNull
    public final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV getColor() {
        return this.Field16298;
    }

    public NvnQalk41EB5LEXqvCEjiSC5XBr0gGzj(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"bb");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"color");
        super(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        this.Field16297 = axisAlignedBB;
        this.Field16298 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-466681588L ^ 0xE42F010C;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1036788131L ^ 0xC233DEA2);
            int n2 = (int)((long)578387554 ^ (long)578387457) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-2132673221L ^ 0x80E1C732) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

