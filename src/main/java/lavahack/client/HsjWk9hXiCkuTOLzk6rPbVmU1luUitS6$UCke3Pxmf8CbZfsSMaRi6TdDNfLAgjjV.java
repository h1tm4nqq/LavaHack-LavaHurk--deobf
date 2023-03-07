//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.init.Blocks
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.pkFsFgiZykGBET8wx0XXygS5258qy2Bd;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventRenderBlock;", "kotlin.jvm.PlatformType", "invoke"})
final class HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    final HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6 Field16772;
    private String Field16773 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method7056((pkFsFgiZykGBET8wx0XXygS5258qy2Bd)object);
    }

    public final void Method7056(pkFsFgiZykGBET8wx0XXygS5258qy2Bd pkFsFgiZykGBET8wx0XXygS5258qy2Bd2) {
        IBlockState iBlockState = HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6.Method4926().world.getBlockState(pkFsFgiZykGBET8wx0XXygS5258qy2Bd2.Field17591);
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(it.pos)");
        if (!Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.LEVER)) return;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6.Method4929(this.Field16772);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"lever");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return;
        HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6.Method4930(this.Field16772).add(pkFsFgiZykGBET8wx0XXygS5258qy2Bd2.Field17591);
    }

    HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(HsjWk9hXiCkuTOLzk6rPbVmU1luUitS6 hsjWk9hXiCkuTOLzk6rPbVmU1luUitS6) {
        this.Field16772 = hsjWk9hXiCkuTOLzk6rPbVmU1luUitS6;
    }

    private static String Method7057(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-199267966 ^ (long)-199267966);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1670141283L ^ 0x638C559C);
            int n2 = (int)((long)1267626307 ^ (long)1267626304) << 6;
            cArray2[n] = (char)(cArray[n] ^ (((int)-2022363214L ^ 0x87752D49) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

