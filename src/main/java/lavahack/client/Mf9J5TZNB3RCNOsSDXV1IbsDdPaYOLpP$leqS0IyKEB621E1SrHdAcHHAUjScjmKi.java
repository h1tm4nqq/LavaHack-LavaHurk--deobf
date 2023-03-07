/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.Packet
 */
package lavahack.client;

import java.lang.reflect.Field;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.network.Packet;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "kotlin.jvm.PlatformType", "invoke"})
final class Mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    final Mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP Field12431;
    private String Field12432 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method4134((TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV)object);
    }

    public final void Method4134(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = Mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP.Method225(this.Field12431);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"cancellerState");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            HashMap hashMap = Mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP.Method226(this.Field12431);
            TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2 = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
            Intrinsics.checkExpressionValueIsNotNull((Object)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2, (String)"it");
            if (hashMap.containsKey(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2.Method982().getClass())) {
                Object v = Mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP.Method226(this.Field12431).get(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982().getClass());
                if (v == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(v, (String)"cancellerPacketsMap[it.packet::class.java]!!");
                if (((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)v).Method365()) {
                    tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method158();
                }
            }
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = Mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP.Method227(this.Field12431);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"loggerState");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) return;
        HashMap hashMap = Mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP.Method228(this.Field12431);
        TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV3 = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        Intrinsics.checkExpressionValueIsNotNull((Object)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV3, (String)"it");
        if (!hashMap.containsKey(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV3.Method982().getClass())) return;
        Object v = Mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP.Method228(this.Field12431).get(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982().getClass());
        if (v == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(v, (String)"loggerPacketsMap[it.packet::class.java]!!");
        if (!((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)v).Method365()) return;
        String string = "---------------------";
        string = string + tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982().getClass().getSimpleName();
        Field[] fieldArray = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982().getClass().getFields();
        int n = fieldArray.length;
        for (int i = (int)-1982367385L ^ 0x89D77967; i < n; ++i) {
            Field field = fieldArray[i];
            StringBuilder stringBuilder = new StringBuilder().append(string).append("\n\t");
            Packet packet = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982();
            Intrinsics.checkExpressionValueIsNotNull((Object)packet, (String)"it.packet");
            Field field2 = field;
            Intrinsics.checkExpressionValueIsNotNull((Object)field2, (String)"field");
            string = stringBuilder.append(Mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP.Method229(this.Field12431, packet, field2)).toString();
        }
        if (tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.cancelled) {
            string = string + "\n\tCancelled";
        }
        string = string + "---------------------";
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5508(string);
    }

    Mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(Mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP) {
        this.Field12431 = mf9J5TZNB3RCNOsSDXV1IbsDdPaYOLpP;
    }

    private static String Method4135(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-588215309 ^ (long)-588215309);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-2104316357 ^ (long)-2104316220);
            int n2 = (int)((long)-1310101030 ^ (long)-1310101035);
            cArray2[n] = (char)(cArray[n] ^ (((int)-1238671933L ^ 0xB62B5D0C) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

