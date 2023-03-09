//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class1334;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class42;
import lavahack.client.Class618;
import lavahack.client.Class97;

public class Class361
extends Class42 {
    @Class1801
    private final Class618 Field9507 = new Class618(Class361::Method1806, new Predicate[0]);
    private String Field9508 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class361() {
        super("YCorrect", Class97.Field8345);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (Class361.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && Class361.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            Class1796.Field16242.Method705(this);
            return;
        }
        this.Method22();
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method710(this);
    }

    private static void Method1806(Class1334 class1334) {
        if (!(class1334.Field14104 <= Double.longBitsToDouble((long)1350106231 ^ 0xBFB4120592F7A05EL))) return;
        class1334.Field14104 = 0.0;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 219;
            cArray2[n] = (char)(cArray[n] ^ (0x4B07 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

