//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.pkFsFgiZykGBET8wx0XXygS5258qy2Bd;
import lavahack.client.x5JRyjT5EQAdZIgzW88ByYDSfJmiCryN;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventRenderBlock;", "kotlin.jvm.PlatformType", "invoke"})
final class x5JRyjT5EQAdZIgzW88ByYDSfJmiCryN$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    public static final x5JRyjT5EQAdZIgzW88ByYDSfJmiCryN$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11637 = new x5JRyjT5EQAdZIgzW88ByYDSfJmiCryN$leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    private String Field11638 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method3647((pkFsFgiZykGBET8wx0XXygS5258qy2Bd)object);
    }

    public final void Method3647(pkFsFgiZykGBET8wx0XXygS5258qy2Bd pkFsFgiZykGBET8wx0XXygS5258qy2Bd2) {
        AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        IBlockState iBlockState = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world.getBlockState(pkFsFgiZykGBET8wx0XXygS5258qy2Bd2.Field17591);
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(it.pos)");
        if (!Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR)) return;
        IBlockState iBlockState2 = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world.getBlockState(pkFsFgiZykGBET8wx0XXygS5258qy2Bd2.Field17591.down());
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState2, (String)"mc.world.getBlockState(it.pos.down())");
        if ((Intrinsics.areEqual((Object)iBlockState2.getBlock(), (Object)Blocks.AIR) ^ (int)((long)-843314160 ^ (long)-843314159)) == 0) return;
        IBlockState iBlockState3 = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world.getBlockState(pkFsFgiZykGBET8wx0XXygS5258qy2Bd2.Field17591.up());
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState3, (String)"mc.world.getBlockState(it.pos.up())");
        if (!Intrinsics.areEqual((Object)iBlockState3.getBlock(), (Object)Blocks.AIR)) return;
        AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2 = ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM.Method7131(pkFsFgiZykGBET8wx0XXygS5258qy2Bd2.Field17591, ((int)-726001667L ^ 0xD4BA17FD) != 0, ((int)-1236812757L ^ 0xB647BC2B) != 0);
        Intrinsics.checkExpressionValueIsNotNull((Object)ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2, (String)"info");
        AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2.Method6959();
        if (ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV == AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field9771) return;
        Map map = x5JRyjT5EQAdZIgzW88ByYDSfJmiCryN.Field8964.Method1273();
        Object object = ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field16564.get((int)-1763100510L ^ 0x96E938A2);
        int n = (int)1934427572L ^ 0x734D05B4;
        Map map2 = map;
        int n2 = (int)((long)529846884 ^ (long)529846884);
        if (map2.containsKey(object)) return;
        if (ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV != AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field9769) return;
        map = x5JRyjT5EQAdZIgzW88ByYDSfJmiCryN.Field8964.Method1273();
        object = ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field16564.get((int)((long)1493352606 ^ (long)1493352607));
        n = (int)67922502L ^ 0x40C6A46;
        map2 = map;
        n2 = (int)577637865L ^ 0x226E0DE9;
        if (map2.containsKey(object)) return;
        map = x5JRyjT5EQAdZIgzW88ByYDSfJmiCryN.Field8964.Method1273();
        BlockPos blockPos = pkFsFgiZykGBET8wx0XXygS5258qy2Bd2.Field17591;
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, (String)"it.pos");
        object = blockPos;
        AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV3 = ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        int n3 = (int)((long)-823090331 ^ (long)-823090331);
        map.put(object, ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV3);
    }

    x5JRyjT5EQAdZIgzW88ByYDSfJmiCryN$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
    }

    private static String Method3648(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1759289545L ^ 0x97235F37;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1138917211L ^ 0xBC1D805A);
            int n2 = (int)((long)-1030079165 ^ (long)-1030079164) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)-403362400L ^ 0xE7F56085 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

