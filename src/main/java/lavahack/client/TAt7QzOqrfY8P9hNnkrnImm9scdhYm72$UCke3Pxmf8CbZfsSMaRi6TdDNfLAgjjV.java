/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.Packet
 */
package lavahack.client;

import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.s0rPDdwE1NquahMuvX2Nzyspfm4LkcCG;
import net.minecraft.network.Packet;

public class TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
extends TAt7QzOqrfY8P9hNnkrnImm9scdhYm72 {
    private int Field10319;

    public TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(Packet packet) {
        super(packet);
    }

    @Override
    public String Method163() {
        return "packet_receive";
    }

    public boolean Method2443(String string) {
        int n;
        if (!leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16247) return this.Method982().getClass().getSimpleName().equalsIgnoreCase(string);
        if (s0rPDdwE1NquahMuvX2Nzyspfm4LkcCG.Field12018.containsKey(string) && ((Class)s0rPDdwE1NquahMuvX2Nzyspfm4LkcCG.Field12018.get(string)).getSimpleName().equalsIgnoreCase(this.Method982().getClass().getSimpleName())) {
            n = (int)((long)-272231487 ^ (long)-272231488);
            return n != 0;
        }
        n = (int)1822523050L ^ 0x6CA17EAA;
        return n != 0;
    }

    private static String Method170(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-958968471L ^ 0xC6D74D69;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1026818018L ^ 0x3D33FF1D);
            int n2 = (int)((long)-2042360633 ^ (long)-2042360586);
            cArray2[n] = (char)(cArray[n] ^ ((int)1557872166L ^ 0x5CDB3237 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

