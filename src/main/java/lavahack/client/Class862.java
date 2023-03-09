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

import com.kisman.cc.util.Class2142;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1862;
import lavahack.client.Class1914;
import lavahack.client.Class2107;
import lavahack.client.Class223;
import lavahack.client.Class254;
import lavahack.client.Class422;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventRenderBlock;", "kotlin.jvm.PlatformType", "invoke"})
final class Class862
implements Class254 {
    public static final Class862 Field11637 = new Class862();
    private String Field11638 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method3647((Class2107)object);
    }

    public final void Method3647(Class2107 class2107) {
        Class1862 class1862;
        IBlockState iBlockState = Class2142.Field17803.world.getBlockState(class2107.Field17591);
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(it.pos)");
        if (!Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR)) return;
        IBlockState iBlockState2 = Class2142.Field17803.world.getBlockState(class2107.Field17591.down());
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState2, (String)"mc.world.getBlockState(it.pos.down())");
        if (!(Intrinsics.areEqual((Object)iBlockState2.getBlock(), (Object)Blocks.AIR) ^ true)) return;
        IBlockState iBlockState3 = Class2142.Field17803.world.getBlockState(class2107.Field17591.up());
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState3, (String)"mc.world.getBlockState(it.pos.up())");
        if (!Intrinsics.areEqual((Object)iBlockState3.getBlock(), (Object)Blocks.AIR)) return;
        Class1862 class18622 = class1862 = Class1914.Method7131(class2107.Field17591, false, false);
        Intrinsics.checkExpressionValueIsNotNull((Object)class18622, (String)"info");
        Class422 class422 = class18622.Method6959();
        if (class422 == Class422.Field9771) return;
        Map map = Class223.Field8964.Method1273();
        Object object = class1862.Field16564.get(0);
        boolean bl = false;
        Map map2 = map;
        boolean bl2 = false;
        if (map2.containsKey(object)) return;
        if (class422 != Class422.Field9769) return;
        map = Class223.Field8964.Method1273();
        object = class1862.Field16564.get(1);
        bl = false;
        map2 = map;
        bl2 = false;
        if (map2.containsKey(object)) return;
        map = Class223.Field8964.Method1273();
        BlockPos blockPos = class2107.Field17591;
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, (String)"it.pos");
        object = blockPos;
        Class1862 class18623 = class1862;
        boolean bl3 = false;
        map.put(object, class18623);
    }

    Class862() {
    }

    private static String Method3648(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 28;
            cArray2[n] = (char)(cArray[n] ^ (0x4D25 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

