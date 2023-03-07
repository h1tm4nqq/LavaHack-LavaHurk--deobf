//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.server.SPacketSpawnObject
 */
package lavahack.client;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq;
import lavahack.client.UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$1;
import lavahack.client.UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$2;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketSpawnObject;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "kotlin.jvm.PlatformType", "invoke"})
final class UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    final UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq Field9582;
    private String Field9583 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method1833((TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV)object);
    }

    public final void Method1833(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (!UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq.Method5406().player.onGround) return;
        TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2 = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        Intrinsics.checkExpressionValueIsNotNull((Object)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2, (String)"it");
        Packet packet = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2.Method982();
        if (!(packet instanceof SPacketSpawnObject)) return;
        if (((SPacketSpawnObject)packet).getType() != (int)((long)-1176606915 ^ (long)-1176606852)) return;
        UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq.Method5406().world.playerEntities.stream().min(Comparator.comparingDouble(new UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$1(packet))).ifPresent(new UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$2(this, packet));
    }

    UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq ukH9T3Xf5upIvEIcsucI0DePBNdOmGsq) {
        this.Field9582 = ukH9T3Xf5upIvEIcsucI0DePBNdOmGsq;
    }

    private static String Method1834(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-2140015853 ^ (long)-2140015853);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)235110077 ^ (long)235109954);
            int n2 = ((int)-1433612426L ^ 0xAA8CCF35) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-349284737 ^ (long)-349280556) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

