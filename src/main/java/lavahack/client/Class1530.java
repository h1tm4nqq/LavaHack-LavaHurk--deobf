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
import lavahack.client.Class2087;
import lavahack.client.Class254;
import lavahack.client.Class256;
import net.minecraft.util.math.BlockPos;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventDamageBlock;", "kotlin.jvm.PlatformType", "invoke"})
final class Class1530
implements Class254 {
    public static final Class1530 Field15155 = new Class1530();
    private String Field15156 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method6072((Class2087)object);
    }

    public final void Method6072(Class2087 class2087) {
        Class2087 class20872 = class2087;
        Intrinsics.checkExpressionValueIsNotNull((Object)class20872, (String)"it");
        BlockPos blockPos = class20872.Method7625();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, (String)"it.blockPos");
        if (!Class256.Field9152.Method1405(blockPos, class2087.Method7626())) return;
        class2087.Method158();
    }

    Class1530() {
    }

    private static String Method6073(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 104;
            cArray2[n] = (char)(cArray[n] ^ (0x5D6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

