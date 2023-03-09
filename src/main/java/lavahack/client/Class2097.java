/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Vector3f
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.awt.Color;
import javax.vecmath.Vector3f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1783;
import lavahack.client.Class180;
import lavahack.client.Class254;
import lavahack.client.Class44;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventUpdateLightmap$Post;", "kotlin.jvm.PlatformType", "invoke"})
final class Class2097
implements Class254 {
    public static final Class2097 Field17556 = new Class2097();
    private String Field17557 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method7632((Class180)object);
    }

    public final void Method7632(Class180 class180) {
        Class44 class44 = Class1783.Method6763(Class1783.Field16200);
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"ambience");
        if (!class44.Method365()) return;
        int n = 0;
        int n2 = class180.Method1107().length;
        while (true) {
            Color color;
            if (n >= n2) {
                class180.Method158();
                return;
            }
            Class44 class442 = Class1783.Method6764(Class1783.Field16200);
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"ambienceColor");
            Class2027 class2027 = class442.Method339();
            Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"ambienceColor.colour");
            Intrinsics.checkExpressionValueIsNotNull((Object)class2027.Method3625(), (String)"ambienceColor.colour.color");
            int n3 = color.getAlpha();
            float f = (float)n3 / Float.intBitsToFloat(1132396544);
            int n4 = class180.Method1107()[n];
            int[] nArray = Class1783.Method6765(Class1783.Field16200, n4);
            Vector3f vector3f = new Vector3f((float)nArray[2] / Float.intBitsToFloat(1132396544), (float)nArray[1] / Float.intBitsToFloat(1132396544), (float)nArray[0] / Float.intBitsToFloat(1132396544));
            Vector3f vector3f2 = new Vector3f((float)color.getRed() / Float.intBitsToFloat(1132396544), (float)color.getGreen() / Float.intBitsToFloat(1132396544), (float)color.getBlue() / Float.intBitsToFloat(1132396544));
            Vector3f vector3f3 = Class1783.Method6766(Class1783.Field16200, vector3f, vector3f2, f);
            int n5 = (int)(vector3f3.x * Float.intBitsToFloat(1132396544));
            int n6 = (int)(vector3f3.y * Float.intBitsToFloat(1132396544));
            int n7 = (int)(vector3f3.z * Float.intBitsToFloat(1132396544));
            class180.Method1107()[n] = 0xFF000000 | n5 << 16 | n6 << 8 | n7;
            ++n;
        }
    }

    Class2097() {
    }

    private static String Method7633(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 219;
            cArray2[n] = (char)(cArray[n] ^ (0x38CB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

