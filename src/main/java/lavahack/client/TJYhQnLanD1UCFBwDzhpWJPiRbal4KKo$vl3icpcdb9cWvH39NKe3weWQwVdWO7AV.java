//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.network.play.client.CPacketEntityAction
 *  net.minecraft.network.play.client.CPacketEntityAction$Action
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.aF2j6suJbypwgPqlzfwUYzddnS2ZLgmg;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.network.play.client.CPacketEntityAction;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV
implements Runnable {
    final CPacketEntityAction Field10901;
    private String Field10902 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public final void run() {
        if (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player == null) return;
        CPacketEntityAction.Action action = this.Field10901.getAction();
        if (action == null) {
            return;
        }
        switch (aF2j6suJbypwgPqlzfwUYzddnS2ZLgmg.Field17581[action.ordinal()]) {
            case 1: {
                EntityPlayerSP entityPlayerSP = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                entityPlayerSP.setSneaking(((int)-895161957L ^ 0xCAA4E99A) != 0);
                return;
            }
            case 2: {
                EntityPlayerSP entityPlayerSP = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                entityPlayerSP.setSneaking(((int)-1435690533L ^ 0xAA6D19DB) != 0);
                return;
            }
            case 3: {
                EntityPlayerSP entityPlayerSP = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                entityPlayerSP.setSprinting(((int)-280269464L ^ 0xEF4B6D69) != 0);
                return;
            }
            case 4: {
                EntityPlayerSP entityPlayerSP = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                entityPlayerSP.setSprinting((boolean)((long)1709397326 ^ (long)1709397327));
                return;
            }
        }
    }

    TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(CPacketEntityAction cPacketEntityAction) {
        this.Field10901 = cPacketEntityAction;
    }

    private static String Method2896(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1131930611L ^ 0xBC881C0D;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1981680950 ^ (long)-1981681099);
            int n2 = (int)((long)1371152157 ^ (long)1371152158) << 5;
            cArray2[n] = (char)(cArray[n] ^ (((int)510103543L ^ 0x1E679860) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

