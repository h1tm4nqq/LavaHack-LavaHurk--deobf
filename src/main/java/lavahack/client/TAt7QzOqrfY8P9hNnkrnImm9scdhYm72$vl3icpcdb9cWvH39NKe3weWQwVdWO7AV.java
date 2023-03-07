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

public class TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV
extends TAt7QzOqrfY8P9hNnkrnImm9scdhYm72 {
    private int Field11439;

    public TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(Packet packet) {
        super(packet);
    }

    @Override
    public String Method163() {
        return "packet_send";
    }

    public boolean Method3401(String string) {
        int n;
        if (!leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16247) return this.Method982().getClass().getSimpleName().equalsIgnoreCase(string);
        if (s0rPDdwE1NquahMuvX2Nzyspfm4LkcCG.Field12018.containsKey(string) && ((Class)s0rPDdwE1NquahMuvX2Nzyspfm4LkcCG.Field12018.get(string)).getSimpleName().equalsIgnoreCase(this.Method982().getClass().getSimpleName())) {
            n = (int)729218463L ^ 0x2B76FD9E;
            return n != 0;
        }
        n = (int)-235931996L ^ 0xF1EFF6A4;
        return n != 0;
    }

    private static String Method170(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1259504128 ^ (long)-1259504128);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)725831618L ^ 0x2B434F3D);
            int n2 = (int)((long)1711614399 ^ (long)1711614234);
            cArray2[n] = (char)(cArray[n] ^ (((int)-177546771L ^ 0xF56AC918) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

