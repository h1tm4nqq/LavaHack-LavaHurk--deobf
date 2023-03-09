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
import lavahack.client.Class1224;
import lavahack.client.Class2107;
import lavahack.client.Class254;
import lavahack.client.Class44;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventRenderBlock;", "kotlin.jvm.PlatformType", "invoke"})
final class Class1907
implements Class254 {
    final Class1224 Field16772;
    private String Field16773 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method7056((Class2107)object);
    }

    public final void Method7056(Class2107 class2107) {
        IBlockState iBlockState = Class1224.Method4926().world.getBlockState(class2107.Field17591);
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(it.pos)");
        if (!Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.LEVER)) return;
        Class44 class44 = Class1224.Method4929(this.Field16772);
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"lever");
        if (!class44.Method365()) return;
        Class1224.Method4930(this.Field16772).add(class2107.Field17591);
    }

    Class1907(Class1224 class1224) {
        this.Field16772 = class1224;
    }

    private static String Method7057(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 192;
            cArray2[n] = (char)(cArray[n] ^ (0x2FB0 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

