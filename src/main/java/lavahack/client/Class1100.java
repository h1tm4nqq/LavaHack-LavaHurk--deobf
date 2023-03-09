//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.event.Class2157;
import com.kisman.cc.util.Class2142;

public class Class1100
extends Class2157 {
    public boolean Field12956 = false;
    private String Field12957 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1100() {
        this(false);
    }

    public Class1100(boolean bl) {
        super(new Object[0]);
        this.Field12956 = bl;
    }

    @Override
    public String Method163() {
        return "tick";
    }

    public boolean Method4497() {
        if (Class2142.Field17803.player == null) return false;
        if (Class2142.Field17803.world == null) return false;
        return true;
    }

    private static String Method170(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 161;
            cArray2[n] = (char)(cArray[n] ^ (0x4940 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

