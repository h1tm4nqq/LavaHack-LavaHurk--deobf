//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.event.Event;
import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;

public class VxtGBIxlzwZB81UrEE9PRzCsi9pMS1Ao
extends Event {
    public boolean Field12956 = (int)1556669404L ^ 0x5CC8E3DC;
    private String Field12957 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public VxtGBIxlzwZB81UrEE9PRzCsi9pMS1Ao() {
        this((boolean)((long)-1163311251 ^ (long)-1163311251));
    }

    public VxtGBIxlzwZB81UrEE9PRzCsi9pMS1Ao(boolean bl) {
        super(new Object[(int)1267416051L ^ 0x4B8B3BF3]);
        this.Field12956 = bl;
    }

    @Override
    public String Method163() {
        return "tick";
    }

    public boolean Method4497() {
        int n;
        if (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player != null && Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world != null) {
            n = (int)((long)-1539824344 ^ (long)-1539824343);
            return n != 0;
        }
        n = (int)((long)1489069057 ^ (long)1489069057);
        return n != 0;
    }

    private static String Method170(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)495234419 ^ (long)495234419);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)615230371 ^ (long)615230300);
            int n2 = (int)-124504853L ^ 0xF894344A;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1153559797 ^ (long)-1153560018) << 6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

