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
import lavahack.client.hMvNpVNolah9lHVSC6HzLOZcg4ariBCk;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "o1", "Lnet/minecraft/util/math/BlockPos;", "o2", "compare"})
final class hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS
implements Comparator {
    public static final hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS Field13708 = new hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS();
    private String Field13709 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public int compare(Object object, Object object2) {
        return this.Method5093((BlockPos)object, (BlockPos)object2);
    }

    public final int Method5093(@NotNull @NotNull BlockPos blockPos, @NotNull @NotNull BlockPos blockPos2) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"o1");
        Intrinsics.checkParameterIsNotNull((Object)blockPos2, (String)"o2");
        double d = blockPos.distanceSq(hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().player.posX, hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().player.posY, hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().player.posZ);
        double d2 = blockPos2.distanceSq(hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().player.posX, hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().player.posY, hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().player.posZ);
        return Double.compare(d, d2);
    }

    hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS() {
    }

    private static String Method5094(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1625458055 ^ (long)-1625458055);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1945735827L ^ 0x73F9926C);
            int n2 = (int)((long)2133445942 ^ (long)2133446047);
            cArray2[n] = (char)(cArray[n] ^ ((int)-2108444593L ^ 0x82539884 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

