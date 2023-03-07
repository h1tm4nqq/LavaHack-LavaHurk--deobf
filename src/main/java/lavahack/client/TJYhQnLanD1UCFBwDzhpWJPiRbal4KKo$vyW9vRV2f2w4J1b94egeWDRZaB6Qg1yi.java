//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import kotlin.Metadata;
import lavahack.client.TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo;
import lavahack.client.i4NTggiPxsRdpMk1kMpsoBEq4PdFbDgG;
import lavahack.client.xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi
implements Runnable {
    final TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo Field17553;
    final CPacketPlayer Field17554;
    private String Field17555 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public final void run() {
        if (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player == null) return;
        i4NTggiPxsRdpMk1kMpsoBEq4PdFbDgG i4NTggiPxsRdpMk1kMpsoBEq4PdFbDgG2 = xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG.Field8954.Method1258();
        if (i4NTggiPxsRdpMk1kMpsoBEq4PdFbDgG2 != null && i4NTggiPxsRdpMk1kMpsoBEq4PdFbDgG2.Method742(this.Field17554)) {
            double d = this.Field17554.getX(Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.posX);
            double d2 = this.Field17554.getX(Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.posY);
            double d3 = this.Field17554.getX(Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.posZ);
            float f = this.Field17554.getYaw(Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.rotationYaw);
            float f2 = this.Field17554.getPitch(Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.rotationPitch);
            boolean bl = this.Field17554.isOnGround();
            return;
        }
        this.Field17553.handle((Packet)this.Field17554);
    }

    TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi(TJYhQnLanD1UCFBwDzhpWJPiRbal4KKo tJYhQnLanD1UCFBwDzhpWJPiRbal4KKo, CPacketPlayer cPacketPlayer) {
        this.Field17553 = tJYhQnLanD1UCFBwDzhpWJPiRbal4KKo;
        this.Field17554 = cPacketPlayer;
    }
}

