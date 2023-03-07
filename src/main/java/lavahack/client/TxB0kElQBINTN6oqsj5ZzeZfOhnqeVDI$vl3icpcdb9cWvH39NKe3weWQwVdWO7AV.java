/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Vector3f
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.awt.Color;
import javax.vecmath.Vector3f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.NTNHCzPmoJl8G1Q0nyEeA4NVvUvnoqKF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventUpdateLightmap$Post;", "kotlin.jvm.PlatformType", "invoke"})
final class TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    public static final TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field17556 = new TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV();
    private String Field17557 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method7632((NTNHCzPmoJl8G1Q0nyEeA4NVvUvnoqKF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object);
    }

    public final void Method7632(NTNHCzPmoJl8G1Q0nyEeA4NVvUvnoqKF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi nTNHCzPmoJl8G1Q0nyEeA4NVvUvnoqKF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6763(TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Field16200);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"ambience");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return;
        int n = (int)1942289957L ^ 0x73C4FE25;
        int n2 = nTNHCzPmoJl8G1Q0nyEeA4NVvUvnoqKF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method1107().length;
        while (true) {
            Color color;
            if (n >= n2) {
                nTNHCzPmoJl8G1Q0nyEeA4NVvUvnoqKF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method158();
                return;
            }
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6764(TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Field16200);
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"ambienceColor");
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method339();
            Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"ambienceColor.colour");
            Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method3625(), (String)"ambienceColor.colour.color");
            int n3 = color.getAlpha();
            float f = (float)n3 / Float.intBitsToFloat((int)((long)823800865 ^ (long)1919235105));
            int n4 = nTNHCzPmoJl8G1Q0nyEeA4NVvUvnoqKF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method1107()[n];
            int[] nArray = TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6765(TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Field16200, n4);
            Vector3f vector3f = new Vector3f((float)nArray[(int)((long)1930386492 ^ (long)1930386493) << 1] / Float.intBitsToFloat(0x4A90DFF5 ^ 0x9EFDFF5), (float)nArray[(int)((long)593863666 ^ (long)593863667)] / Float.intBitsToFloat((int)1250763026L ^ 0x9F22112), (float)nArray[(int)-678068201L ^ 0xD7958017] / Float.intBitsToFloat((int)((long)620449565 ^ (long)1736724253)));
            Vector3f vector3f2 = new Vector3f((float)color.getRed() / Float.intBitsToFloat((int)1050721292L ^ 0x7DDFBC0C), (float)color.getGreen() / Float.intBitsToFloat((int)((long)1640017269 ^ (long)582987125)), (float)color.getBlue() / Float.intBitsToFloat((int)790633241L ^ 0x6C5F1B19));
            Vector3f vector3f3 = TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6766(TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Field16200, vector3f, vector3f2, f);
            int n5 = (int)(vector3f3.x * Float.intBitsToFloat((int)((long)1159404218 ^ (long)107223738)));
            int n6 = (int)(vector3f3.y * Float.intBitsToFloat((int)((long)1307740401 ^ (long)244156657)));
            int n7 = (int)(vector3f3.z * Float.intBitsToFloat((int)797959056L ^ 0x6CF0E390));
            nTNHCzPmoJl8G1Q0nyEeA4NVvUvnoqKF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method1107()[n] = (int)((long)-1012836351 ^ (long)1017206785) | n5 << (((int)99565599L ^ 0x5EF401E) << 4) | n6 << ((int)((long)1753654602 ^ (long)1753654603) << 3) | n7;
            ++n;
        }
    }

    TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV() {
    }

    private static String Method7633(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)944772906 ^ (long)944772906);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1841467293L ^ 0x923D709C);
            int n2 = (int)670328546L ^ 0x27F46639;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1223104235 ^ (long)1223110176) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

