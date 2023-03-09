/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.Packet
 */
package lavahack.client;

import lavahack.client.Class145;
import lavahack.client.Class1796;
import lavahack.client.Class942;
import net.minecraft.network.Packet;

public class Class544
extends Class145 {
    private int Field10319;

    public Class544(Packet packet) {
        super(packet);
    }

    @Override
    public String Method163() {
        return "packet_receive";
    }

    public boolean Method2443(String string) {
        if (!Class1796.Field16247) return this.Method982().getClass().getSimpleName().equalsIgnoreCase(string);
        if (!Class942.Field12018.containsKey(string)) return false;
        if (!((Class)Class942.Field12018.get(string)).getSimpleName().equalsIgnoreCase(this.Method982().getClass().getSimpleName())) return false;
        return true;
    }

    private static String Method170(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 49;
            cArray2[n] = (char)(cArray[n] ^ (0xC11 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

