/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.Packet
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.Y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG;
import net.minecraft.network.Packet;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "kotlin.jvm.PlatformType", "invoke"})
final class Y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    public static final Y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field10489 = new Y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf();
    private String Field10490 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method2548((TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV)object);
    }

    public final void Method2548(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
        Intrinsics.checkExpressionValueIsNotNull((Object)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"it");
        Packet packet = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method982();
        Intrinsics.checkExpressionValueIsNotNull((Object)packet, (String)"it.packet");
        if (!Y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4.Field9212.Method1462(packet)) return;
        if (!xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG.Field8954.Method1254()) return;
        if (!Y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4.Method1466(Y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4.Field9212).contains(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982().getClass())) return;
        if (!Y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4.Field9212.Method1463()) return;
        tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method158();
    }

    Y0CkzZc0Ei2GcmwmuNzBmsDz5vTj8Tx4$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
    }

    private static String Method2549(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)441312179L ^ 0x1A4DE3B3;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1253208412 ^ (long)-1253208485);
            int n2 = (int)-1158369221L ^ 0xBAF4B05E;
            cArray2[n] = (char)(cArray[n] ^ (((int)-412101295L ^ 0xE76FF4BA) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

