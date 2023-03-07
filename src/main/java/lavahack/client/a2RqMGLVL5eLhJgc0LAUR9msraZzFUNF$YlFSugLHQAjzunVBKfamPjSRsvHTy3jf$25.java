//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y;
import lavahack.client.Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC;
import lavahack.client.a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF;
import lavahack.client.veyf9YVihv33TUGV0DuHJrqb7huCpMgR;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "kotlin.jvm.PlatformType", "arg", "Lorg/cubic/dynamictask/ArgumentFetcher;", "call"})
final class a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$25
implements veyf9YVihv33TUGV0DuHJrqb7huCpMgR {
    public static final a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$25 Field9309 = new a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$25();
    private int Field9310;

    @Override
    public Object Method1564(Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC) {
        return this.Method1578(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC);
    }

    public final float[] Method1578(@NotNull @NotNull Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC) {
        Intrinsics.checkParameterIsNotNull((Object)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC, (String)"arg");
        BlockPos blockPos = (BlockPos)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)1044420299 ^ (long)1044420299));
        EntityPlayerSP entityPlayerSP = a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF.Method5367().player;
        Minecraft minecraft = a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF.Method5367();
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft, (String)"mc");
        Vec3d vec3d = entityPlayerSP.getPositionEyes(minecraft.getRenderPartialTicks());
        BlockPos blockPos2 = blockPos;
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"block");
        return AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6170(vec3d, new Vec3d((double)blockPos2.getX() + Double.longBitsToDouble(0x864659863A6728B0L ^ 0xB9A659863A6728B0L), (double)blockPos.getY(), (double)blockPos.getZ() + Double.longBitsToDouble((long)1734745549 ^ 0x3FE0000067661DCDL)));
    }

    a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$25() {
    }

    private static String Method1579(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-323047161 ^ (long)-323047161);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-310091869L ^ 0xED845F5C);
            int n2 = (int)((long)-785915200 ^ (long)-785915139) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1366483376 ^ (long)-1366483249) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

