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
import lavahack.client.KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl;
import net.minecraft.util.math.MathHelper;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/TurnEvent;", "kotlin.jvm.PlatformType", "invoke"})
final class KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    final KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB Field15676;
    private String Field15677 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method6406((twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl)object);
    }

    public final void Method6406(twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2) {
        if (!KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB.Method3728(this.Field15676)) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB.Method3733(this.Field15676);
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"noPitchLimit");
            if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return;
            float f = twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Field16575;
            float f2 = twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Field16574;
            twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Field16574 += twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Field16572 * Float.intBitsToFloat((int)690889836L ^ 0x1737BDF6);
            twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Field16575 -= twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Field16573 * Float.intBitsToFloat(0x248D110E ^ 0x1A948894);
            twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Field16576 += twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Field16574 - f;
            twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Field16577 += twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Field16575 - f2;
            twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Method158();
            return;
        }
        KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB.Method3730(this.Field15676, (float)((double)KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB.Method3729(this.Field15676) + (double)twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Field16572 * Double.longBitsToDouble(0xA3D462F9621F9440L ^ 0x9C1751CA512CA773L)));
        KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB.Method3732(this.Field15676, (float)((double)KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB.Method3731(this.Field15676) - (double)twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Field16573 * Double.longBitsToDouble((long)1139758977 ^ 0x3FC3333370DC64B2L)));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB.Method3733(this.Field15676);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"noPitchLimit");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) {
            KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB.Method3732(this.Field15676, MathHelper.clamp((float)KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB.Method3731(this.Field15676), (float)Float.intBitsToFloat((int)1336307424L ^ 0x8D126EE0), (float)Float.intBitsToFloat((int)548596999L ^ 0x6206ED07)));
        }
        twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl2.Method158();
    }

    KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB krUlxB7kSlaSztDZ1cjzonAZlBRMRMCB) {
        this.Field15676 = krUlxB7kSlaSztDZ1cjzonAZlBRMRMCB;
    }

    private static String Method6407(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-16730716 ^ (long)-16730716);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)2012080898 ^ (long)2012081149);
            int n2 = (int)((long)149516934 ^ (long)149517031);
            cArray2[n] = (char)(cArray[n] ^ (((int)-1331851221L ^ 0xB09D8714) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

