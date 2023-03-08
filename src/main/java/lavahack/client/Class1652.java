//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.util.math.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/TurnEvent;", "kotlin.jvm.PlatformType", "invoke" })
final class Class1652 implements Class254
{
    final Class895 Field15676;
    private String Field15677 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method979(final Object o) {
        this.Method6406((Class1867)o);
    }
    
    public final void Method6406(final Class1867 class1867) {
        if (Class895.Method3728(this.Field15676)) {
            Class895.Method3730(this.Field15676, (float)(Class895.Method3729(this.Field15676) + class1867.Field16572 * Double.longBitsToDouble(4594572339843380019L)));
            Class895.Method3732(this.Field15676, (float)(Class895.Method3731(this.Field15676) - class1867.Field16573 * Double.longBitsToDouble((long)1139758977 ^ 0x3FC3333370DC64B2L)));
            final Class44 method3733 = Class895.Method3733(this.Field15676);
            Intrinsics.checkExpressionValueIsNotNull((Object)method3733, "noPitchLimit");
            if (!method3733.Method365()) {
                Class895.Method3732(this.Field15676, MathHelper.clamp(Class895.Method3731(this.Field15676), Float.intBitsToFloat(-1028390912), Float.intBitsToFloat(1119092736)));
            }
            class1867.Method158();
        }
        else {
            final Class44 method3734 = Class895.Method3733(this.Field15676);
            Intrinsics.checkExpressionValueIsNotNull((Object)method3734, "noPitchLimit");
            if (method3734.Method365()) {
                final float field16575 = class1867.Field16575;
                final float field16576 = class1867.Field16574;
                class1867.Field16574 += class1867.Field16572 * Float.intBitsToFloat(1041865114);
                class1867.Field16575 -= class1867.Field16573 * Float.intBitsToFloat(1041865114);
                class1867.Field16576 += class1867.Field16574 - field16575;
                class1867.Field16577 += class1867.Field16575 - field16576;
                class1867.Method158();
            }
        }
    }
    
    Class1652(final Class895 field15676) {
        this.Field15676 = field15676;
    }
    
    private static String Method6407(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2E7E ^ 0x61));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
