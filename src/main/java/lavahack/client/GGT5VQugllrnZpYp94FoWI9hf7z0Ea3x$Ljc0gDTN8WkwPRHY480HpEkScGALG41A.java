//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.network.play.client.CPacketPlayer
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.o73igJQaa2O9BEYFQNAk42oaxHBow5kd;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.network.play.client.CPacketPlayer;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "kotlin.jvm.PlatformType", "invoke"})
final class GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$Ljc0gDTN8WkwPRHY480HpEkScGALG41A
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    final GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x Field13276;
    private String Field13277 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method4697((TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV)object);
    }

    public final void Method4697(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        if (GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player == null) return;
        EntityPlayerSP entityPlayerSP = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (!entityPlayerSP.isOnLadder()) return;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7123(this.Field13276);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"fastLadder");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return;
        if (!o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159()) return;
        TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
        Intrinsics.checkExpressionValueIsNotNull((Object)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"it");
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method982() instanceof CPacketPlayer)) return;
        if (tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() == null) {
            throw new TypeCastException("null cannot be cast to non-null type net.minecraft.network.play.client.CPacketPlayer");
        }
        ((CPacketPlayer)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982()).onGround = (int)-1796740810L ^ 0x94E7E937;
    }

    GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$Ljc0gDTN8WkwPRHY480HpEkScGALG41A(GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x) {
        this.Field13276 = gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x;
    }

    private static String Method4698(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1062850069 ^ (long)-1062850069);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1085861814 ^ (long)-1085861707);
            int n2 = (int)((long)-954423284 ^ (long)-954423095);
            cArray2[n] = (char)(cArray[n] ^ (((int)-1881285343L ^ 0x8FDDDC32) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

