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
import lavahack.client.Class1325;
import lavahack.client.Class1471;
import lavahack.client.Class1568;
import lavahack.client.Class424;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "kotlin.jvm.PlatformType", "arg", "Lorg/cubic/dynamictask/ArgumentFetcher;", "call"})
final class Class305
implements Class1471 {
    public static final Class305 Field9309 = new Class305();
    private int Field9310;

    @Override
    public Object Method1564(Class424 class424) {
        return this.Method1578(class424);
    }

    public final float[] Method1578(@NotNull @NotNull Class424 class424) {
        Intrinsics.checkParameterIsNotNull((Object)class424, (String)"arg");
        BlockPos blockPos = (BlockPos)class424.Method2054(0);
        EntityPlayerSP entityPlayerSP = Class1325.Method5367().player;
        Minecraft minecraft = Class1325.Method5367();
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft, (String)"mc");
        Vec3d vec3d = entityPlayerSP.getPositionEyes(minecraft.getRenderPartialTicks());
        BlockPos blockPos2 = blockPos;
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"block");
        return Class1568.Method6170(vec3d, new Vec3d((double)blockPos2.getX() + Double.longBitsToDouble(4602678819172646912L), (double)blockPos.getY(), (double)blockPos.getZ() + Double.longBitsToDouble((long)1734745549 ^ 0x3FE0000067661DCDL)));
    }

    Class305() {
    }

    private static String Method1579(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 122;
            cArray2[n] = (char)(cArray[n] ^ (0x27C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

