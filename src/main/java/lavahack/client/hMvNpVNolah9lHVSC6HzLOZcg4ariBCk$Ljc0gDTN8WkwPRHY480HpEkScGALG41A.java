/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.hMvNpVNolah9lHVSC6HzLOZcg4ariBCk;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$Ljc0gDTN8WkwPRHY480HpEkScGALG41A
implements Runnable {
    public static final hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$Ljc0gDTN8WkwPRHY480HpEkScGALG41A Field10465 = new hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$Ljc0gDTN8WkwPRHY480HpEkScGALG41A();
    private String Field10466 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public final void run() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6013(hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Field15034);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"debug2");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            String string = "Update 3";
            int n = (int)((long)1071444833 ^ (long)1071444833);
            System.out.println((Object)string);
        }
        EntityPlayer entityPlayer = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6015(hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Field15034).Method496();
        if (entityPlayer == null) {
            Intrinsics.throwNpe();
        }
        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6014(hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Field15034, (Entity)entityPlayer);
        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6016(hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Field15034);
        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6017(hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Field15034);
    }

    hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$Ljc0gDTN8WkwPRHY480HpEkScGALG41A() {
    }

    private static String Method2529(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1155463921L ^ 0x44DEFAF1;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-130044405 ^ (long)-130044172);
            int n2 = (int)-550067748L ^ 0xDF36A1E9;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-463498017 ^ (long)-463481588) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

