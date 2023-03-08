//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.util.math.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "run" })
final class Class543 implements Runnable
{
    final Class461 Field10316;
    final BlockPos Field10317;
    private int Field10318;
    
    @Override
    public final void run() {
        if (Intrinsics.areEqual((Object)Class461.Method2170(this.Field10316).get(this.Field10317), (Object)true) && Class461.Method2171(this.Field10316).Method3790()) {
            final Class1612 method2171 = Class461.Method2171(this.Field10316);
            final Class44 method2172 = Class461.Method2172(this.Field10316);
            Intrinsics.checkExpressionValueIsNotNull((Object)method2172, "safeDown");
            final BlockPos blockPos = method2172.Method365() ? this.Field10317.down() : this.Field10317;
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, "if(safeDown.valBoolean) pos.down() else pos");
            method2171.Method3805(blockPos);
        }
        else if (Class461.Method2173(this.Field10316).Method3790()) {
            final Class1612 method2173 = Class461.Method2173(this.Field10316);
            final Class44 method2174 = Class461.Method2174(this.Field10316);
            Intrinsics.checkExpressionValueIsNotNull((Object)method2174, "unsafeDown");
            final BlockPos blockPos2 = method2174.Method365() ? this.Field10317.down() : this.Field10317;
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, "if(unsafeDown.valBoolean) pos.down() else pos");
            method2173.Method3805(blockPos2);
        }
    }
    
    Class543(final Class461 field10316, final BlockPos field10317) {
        this.Field10316 = field10316;
        this.Field10317 = field10317;
    }
    
    private static String Method2442(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5B32 ^ 0x32));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
