/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "kotlin.jvm.PlatformType", "invoke"})
final class UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    final UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq Field15977;
    private String Field15978 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method6616((TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV)object);
    }

    public final void Method6616(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        if (UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq.Method5408(this.Field15977) == (int)((long)576312427 ^ (long)-576312428)) return;
        TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
        Intrinsics.checkExpressionValueIsNotNull((Object)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"it");
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method982() instanceof CPacketPlayer)) return;
        Packet packet = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982();
        if (packet == null) {
            throw new TypeCastException("null cannot be cast to non-null type net.minecraft.network.play.client.CPacketPlayer");
        }
        UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq.Method5410(this.Field15977).add((CPacketPlayer)packet);
        tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method158();
    }

    UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq ukH9T3Xf5upIvEIcsucI0DePBNdOmGsq) {
        this.Field15977 = ukH9T3Xf5upIvEIcsucI0DePBNdOmGsq;
    }

    private static String Method6617(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1740684094L ^ 0x67C0BB3E;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-2106578128L ^ 0x82702BCF);
            int n2 = (int)-490065265L ^ 0xE2CA3260;
            cArray2[n] = (char)(cArray[n] ^ ((int)2084126335L ^ 0x7C394532 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

