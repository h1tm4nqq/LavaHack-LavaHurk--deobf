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
import lavahack.client.Class1612;
import lavahack.client.Class44;
import lavahack.client.Class461;
import net.minecraft.util.math.BlockPos;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class Class543
implements Runnable {
    final Class461 Field10316;
    final BlockPos Field10317;
    private int Field10318;

    @Override
    public final void run() {
        if (Intrinsics.areEqual((Object)((Boolean)Class461.Method2170(this.Field10316).get(this.Field10317)), (Object)true) && Class461.Method2171(this.Field10316).Method3790()) {
            Class1612 class1612 = Class461.Method2171(this.Field10316);
            Class44 class44 = Class461.Method2172(this.Field10316);
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"safeDown");
            BlockPos blockPos = class44.Method365() ? this.Field10317.down() : this.Field10317;
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, (String)"if(safeDown.valBoolean) pos.down() else pos");
            class1612.Method3805(blockPos);
            return;
        }
        if (!Class461.Method2173(this.Field10316).Method3790()) return;
        Class1612 class1612 = Class461.Method2173(this.Field10316);
        Class44 class44 = Class461.Method2174(this.Field10316);
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"unsafeDown");
        BlockPos blockPos = class44.Method365() ? this.Field10317.down() : this.Field10317;
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, (String)"if(unsafeDown.valBoolean) pos.down() else pos");
        class1612.Method3805(blockPos);
    }

    Class543(Class461 class461, BlockPos blockPos) {
        this.Field10316 = class461;
        this.Field10317 = blockPos;
    }

    private static String Method2442(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 50;
            cArray2[n] = (char)(cArray[n] ^ (0x5B32 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

