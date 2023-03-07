/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.login.client.CPacketLoginStart
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import net.minecraft.network.login.client.CPacketLoginStart;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "kotlin.jvm.PlatformType", "invoke"})
final class XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    public static final XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field14118 = new XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf();
    private String Field14119 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method5394((TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV)object);
    }

    public final void Method5394(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
        Intrinsics.checkExpressionValueIsNotNull((Object)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"it");
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method982() instanceof CPacketLoginStart)) return;
        XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Method5557(XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Field14381);
    }

    XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
    }

    private static String Method5395(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)0xBE2EBBL ^ 0xBE2EBB;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1834153576L ^ 0x6D52F697);
            int n2 = (int)-348947381L ^ 0xEB337CF4;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1977517510L ^ 0x8A2101D3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

