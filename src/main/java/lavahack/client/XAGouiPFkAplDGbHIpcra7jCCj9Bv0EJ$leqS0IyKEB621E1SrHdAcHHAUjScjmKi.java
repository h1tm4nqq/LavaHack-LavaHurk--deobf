//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.server.SPacketKeepAlive
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketKeepAlive;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "kotlin.jvm.PlatformType", "invoke"})
final class XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    public static final XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field17818 = new XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    private int Field17819;

    @Override
    public void Method979(Object object) {
        this.Method7728((TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV)object);
    }

    public final void Method7728(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2 = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        Intrinsics.checkExpressionValueIsNotNull((Object)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2, (String)"it");
        Packet packet = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2.Method982();
        if (!(packet instanceof SPacketKeepAlive)) return;
        if (XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Method5558(XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Field14381)) return;
        if (((SPacketKeepAlive)packet).getId() <= 0L) return;
        if (((SPacketKeepAlive)packet).getId() >= (long)(((int)1329891270L ^ 0x4F4487BB) << 3)) return;
        XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Field14381.Method5546(System.currentTimeMillis() - XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Field14381.Method5545());
        XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Field14381.Method5548((int)((SPacketKeepAlive)packet).getId());
        XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Field14381.Method5550(XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Field14381.Method5545());
        XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Method5559(XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Field14381, ((int)-1569616762L ^ 0xA2718C87) != 0);
        tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method158();
    }

    XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
    }

    private static String Method7729(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)683737217L ^ 0x28C10081;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1113029589 ^ (long)1113029418);
            int n2 = (int)((long)-279366673 ^ (long)-279366774) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-413789496 ^ (long)-413766565) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

