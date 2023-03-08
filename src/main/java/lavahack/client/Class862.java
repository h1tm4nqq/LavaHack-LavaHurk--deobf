//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;
import net.minecraft.init.*;
import java.util.*;
import net.minecraft.block.state.*;
import net.minecraft.util.math.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventRenderBlock;", "kotlin.jvm.PlatformType", "invoke" })
final class Class862 implements Class254
{
    public static final Class862 Field11637;
    private String Field11638 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method979(final Object o) {
        this.Method3647((Class2107)o);
    }
    
    public final void Method3647(final Class2107 class2107) {
        final IBlockState getBlockState = Class2142.Field17803.world.getBlockState(class2107.Field17591);
        Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState, "mc.world.getBlockState(it.pos)");
        if (Intrinsics.areEqual((Object)getBlockState.getBlock(), (Object)Blocks.AIR)) {
            final IBlockState getBlockState2 = Class2142.Field17803.world.getBlockState(class2107.Field17591.down());
            Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState2, "mc.world.getBlockState(it.pos.down())");
            if (Intrinsics.areEqual((Object)getBlockState2.getBlock(), (Object)Blocks.AIR) ^ true) {
                final IBlockState getBlockState3 = Class2142.Field17803.world.getBlockState(class2107.Field17591.up());
                Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState3, "mc.world.getBlockState(it.pos.up())");
                if (Intrinsics.areEqual((Object)getBlockState3.getBlock(), (Object)Blocks.AIR)) {
                    final Class1862 method7131;
                    final Class1862 class2108 = method7131 = Class1914.Method7131(class2107.Field17591, (boolean)(0 != 0), (boolean)(0 != 0));
                    Intrinsics.checkExpressionValueIsNotNull((Object)method7131, "info");
                    final Class422 method7132 = method7131.Method6959();
                    if (method7132 != Class422.Field9771 && !Class223.Field8964.Method1273().containsKey(class2108.Field16564.get(0)) && method7132 == Class422.Field9769 && !Class223.Field8964.Method1273().containsKey(class2108.Field16564.get(1))) {
                        final HashMap hashMap = Class223.Field8964.Method1273();
                        final BlockPos field17591 = class2107.Field17591;
                        Intrinsics.checkExpressionValueIsNotNull((Object)field17591, "it.pos");
                        hashMap.put(field17591, class2108);
                    }
                }
            }
        }
    }
    
    static {
        Field11637 = new Class862();
    }
    
    private static String Method3648(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4D25 ^ 0x1C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
