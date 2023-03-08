//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.init.*;
import net.minecraft.block.state.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventRenderBlock;", "kotlin.jvm.PlatformType", "invoke" })
final class Class1907 implements Class254
{
    final Class1224 Field16772;
    private String Field16773 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method979(final Object o) {
        this.Method7056((Class2107)o);
    }
    
    public final void Method7056(final Class2107 class2107) {
        final IBlockState getBlockState = Class1224.Method4926().world.getBlockState(class2107.Field17591);
        Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState, "mc.world.getBlockState(it.pos)");
        if (Intrinsics.areEqual((Object)getBlockState.getBlock(), (Object)Blocks.LEVER)) {
            final Class44 method4929 = Class1224.Method4929(this.Field16772);
            Intrinsics.checkExpressionValueIsNotNull((Object)method4929, "lever");
            if (method4929.Method365()) {
                Class1224.Method4930(this.Field16772).add(class2107.Field17591);
            }
        }
    }
    
    Class1907(final Class1224 field16772) {
        this.Field16772 = field16772;
    }
    
    private static String Method7057(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2FB0 ^ 0xC0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
