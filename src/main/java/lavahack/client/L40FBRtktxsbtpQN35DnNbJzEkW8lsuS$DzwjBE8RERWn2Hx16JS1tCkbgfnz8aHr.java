//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.play.server.SPacketPlayerPosLook
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import net.minecraft.network.play.server.SPacketPlayerPosLook;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "kotlin.jvm.PlatformType", "invoke"})
final class L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$DzwjBE8RERWn2Hx16JS1tCkbgfnz8aHr
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    final L40FBRtktxsbtpQN35DnNbJzEkW8lsuS Field14383;
    private String Field14384 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method5563((TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV)object);
    }

    public final void Method5563(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2 = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        Intrinsics.checkExpressionValueIsNotNull((Object)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2, (String)"it");
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2.Method982() instanceof SPacketPlayerPosLook)) return;
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindSneak.pressed = (int)((long)-1333983309 ^ (long)-1333983310);
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5193(this.Field14383, ((int)-905746967L ^ 0xCA0365E8) != 0);
    }

    L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$DzwjBE8RERWn2Hx16JS1tCkbgfnz8aHr(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS) {
        this.Field14383 = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS;
    }

    private static String Method5564(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-559808981 ^ (long)-559808981);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)2043807535L ^ 0x79D207D0);
            int n2 = (int)((long)-1796532423 ^ (long)-1796532458) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1623312867L ^ 0x9F3E6A30 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

