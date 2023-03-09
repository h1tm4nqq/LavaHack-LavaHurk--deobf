/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.MoverType
 */
package lavahack.client;

import com.kisman.cc.event.Class2157;
import net.minecraft.entity.MoverType;

public class Class1334
extends Class2157 {
    public MoverType Field14102;
    public double Field14103;
    public double Field14104;
    public double Field14105;
    private String Field14106 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1334(MoverType moverType, double d, double d2, double d3) {
        super(new Object[0]);
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 35;
            cArray2[n] = (char)(cArray[n] ^ (0x78F7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

