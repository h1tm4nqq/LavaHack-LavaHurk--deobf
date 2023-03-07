/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.MoverType
 */
package lavahack.client;

import com.kisman.cc.event.Event;
import net.minecraft.entity.MoverType;

public class uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x
extends Event {
    public MoverType Field14102;
    public double Field14103;
    public double Field14104;
    public double Field14105;
    private String Field14106 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x(MoverType moverType, double d, double d2, double d3) {
        super(new Object[(int)-1492451085L ^ 0xA70B00F3]);
        this.Field14102 = moverType;
        this.Field14103 = d;
        this.Field14104 = d2;
        this.Field14105 = d3;
    }

    @Override
    public String Method163() {
        return "player_move";
    }

    private static String Method170(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-25471179 ^ (long)-25471179);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1281910367L ^ 0xB397995E);
            int n2 = (int)25490834L ^ 0x184F5B1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1898163835L ^ 0x8EDC2972 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

