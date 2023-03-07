//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.network.NetHandlerPlayClient
 *  net.minecraft.network.Packet
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.Packet;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
implements Runnable {
    final TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo Field16589;
    final Packet Field16590;
    private String Field16591 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public final void run() {
        Minecraft minecraft = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803;
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft, (String)"mc");
        if (minecraft.getConnection() == null) return;
        Minecraft minecraft2 = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803;
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft2, (String)"mc");
        NetHandlerPlayClient netHandlerPlayClient = minecraft2.getConnection();
        if (netHandlerPlayClient == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull((Object)netHandlerPlayClient, (String)"mc.connection!!");
        TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo.Method3063(this.Field16589, this.Field16590, netHandlerPlayClient);
    }

    TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo tJYhQnLanD1UCFBwDzhpWJPiRbal4KKo, Packet packet) {
        this.Field16589 = tJYhQnLanD1UCFBwDzhpWJPiRbal4KKo;
        this.Field16590 = packet;
    }

    private static String Method6968(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-249178748 ^ (long)-249178748);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-852124628L ^ 0xCD359CD3);
            int n2 = (int)((long)-1391981648 ^ (long)-1391981643) << 5;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1289425510L ^ 0xB324DEC1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

