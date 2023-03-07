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

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.vEDPjUN99gqqDwx3awCorwivrUWEVu13;
import net.minecraft.util.math.BlockPos;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class vEDPjUN99gqqDwx3awCorwivrUWEVu13$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements Runnable {
    final vEDPjUN99gqqDwx3awCorwivrUWEVu13 Field10316;
    final BlockPos Field10317;
    private int Field10318;

    @Override
    public final void run() {
        if (Intrinsics.areEqual((Object)((Boolean)vEDPjUN99gqqDwx3awCorwivrUWEVu13.Method2170(this.Field10316).get(this.Field10317)), (Object)((boolean)((long)-1494271791 ^ (long)-1494271792))) && vEDPjUN99gqqDwx3awCorwivrUWEVu13.Method2171(this.Field10316).Method3790()) {
            MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK = vEDPjUN99gqqDwx3awCorwivrUWEVu13.Method2171(this.Field10316);
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = vEDPjUN99gqqDwx3awCorwivrUWEVu13.Method2172(this.Field10316);
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"safeDown");
            BlockPos blockPos = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365() ? this.Field10317.down() : this.Field10317;
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, (String)"if(safeDown.valBoolean) pos.down() else pos");
            mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method3805(blockPos);
            return;
        }
        if (!vEDPjUN99gqqDwx3awCorwivrUWEVu13.Method2173(this.Field10316).Method3790()) return;
        MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK = vEDPjUN99gqqDwx3awCorwivrUWEVu13.Method2173(this.Field10316);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = vEDPjUN99gqqDwx3awCorwivrUWEVu13.Method2174(this.Field10316);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"unsafeDown");
        BlockPos blockPos = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365() ? this.Field10317.down() : this.Field10317;
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, (String)"if(unsafeDown.valBoolean) pos.down() else pos");
        mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method3805(blockPos);
    }

    vEDPjUN99gqqDwx3awCorwivrUWEVu13$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(vEDPjUN99gqqDwx3awCorwivrUWEVu13 vEDPjUN99gqqDwx3awCorwivrUWEVu132, BlockPos blockPos) {
        this.Field10316 = vEDPjUN99gqqDwx3awCorwivrUWEVu132;
        this.Field10317 = blockPos;
    }

    private static String Method2442(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)712839008 ^ (long)712839008);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1477581968L ^ 0xA7EDE38F);
            int n2 = (int)((long)-1905849605 ^ (long)-1905849630) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)228198175 ^ (long)228207238) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

