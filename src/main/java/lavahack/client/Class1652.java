//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.math.MathHelper
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1867;
import lavahack.client.Class254;
import lavahack.client.Class44;
import lavahack.client.Class895;
import net.minecraft.util.math.MathHelper;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/TurnEvent;", "kotlin.jvm.PlatformType", "invoke"})
final class Class1652
implements Class254 {
    final Class895 Field15676;
    private String Field15677 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method6406((Class1867)object);
    }

    public final void Method6406(Class1867 class1867) {
        if (!Class895.Method3728(this.Field15676)) {
            Class44 class44 = Class895.Method3733(this.Field15676);
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"noPitchLimit");
            if (!class44.Method365()) return;
            float f = class1867.Field16575;
            float f2 = class1867.Field16574;
            class1867.Field16574 += class1867.Field16572 * Float.intBitsToFloat(1041865114);
            class1867.Field16575 -= class1867.Field16573 * Float.intBitsToFloat(1041865114);
            class1867.Field16576 += class1867.Field16574 - f;
            class1867.Field16577 += class1867.Field16575 - f2;
            class1867.Method158();
            return;
        }
        Class895.Method3730(this.Field15676, (float)((double)Class895.Method3729(this.Field15676) + (double)class1867.Field16572 * Double.longBitsToDouble(0x3FC3333333333333L)));
        Class895.Method3732(this.Field15676, (float)((double)Class895.Method3731(this.Field15676) - (double)class1867.Field16573 * Double.longBitsToDouble((long)1139758977 ^ 0x3FC3333370DC64B2L)));
        Class44 class44 = Class895.Method3733(this.Field15676);
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"noPitchLimit");
        if (!class44.Method365()) {
            Class895.Method3732(this.Field15676, MathHelper.clamp((float)Class895.Method3731(this.Field15676), (float)Float.intBitsToFloat(-1028390912), (float)Float.intBitsToFloat(1119092736)));
        }
        class1867.Method158();
    }

    Class1652(Class895 class895) {
        this.Field15676 = class895;
    }

    private static String Method6407(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 97;
            cArray2[n] = (char)(cArray[n] ^ (0x2E7E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

