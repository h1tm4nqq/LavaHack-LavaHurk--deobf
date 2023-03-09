//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1497;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "o1", "Lnet/minecraft/util/math/BlockPos;", "o2", "compare"})
final class Class1261
implements Comparator {
    public static final Class1261 Field13708 = new Class1261();
    private String Field13709 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public int compare(Object object, Object object2) {
        return this.Method5093((BlockPos)object, (BlockPos)object2);
    }

    public final int Method5093(@NotNull @NotNull BlockPos blockPos, @NotNull @NotNull BlockPos blockPos2) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"o1");
        Intrinsics.checkParameterIsNotNull((Object)blockPos2, (String)"o2");
        double d = blockPos.distanceSq(Class1497.Method6011().player.posX, Class1497.Method6011().player.posY, Class1497.Method6011().player.posZ);
        double d2 = blockPos2.distanceSq(Class1497.Method6011().player.posX, Class1497.Method6011().player.posY, Class1497.Method6011().player.posZ);
        return Double.compare(d, d2);
    }

    Class1261() {
    }

    private static String Method5094(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 169;
            cArray2[n] = (char)(cArray[n] ^ (0x28CB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

