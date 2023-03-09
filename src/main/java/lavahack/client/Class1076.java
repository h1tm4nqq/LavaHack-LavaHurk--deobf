//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class1334;
import lavahack.client.Class1393;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class42;
import lavahack.client.Class618;
import lavahack.client.Class97;

public class Class1076
extends Class42 {
    @Class1801
    private final Class618 Field12790 = new Class618(Class1076::Method4351, new Predicate[0]);
    private String Field12791 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1076() {
        super("MoveInspector", Class97.Field8345);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (Class1076.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && Class1076.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
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

    private static void Method4351(Class1334 class1334) {
        Class1393.Method5505().Method1886("MoverType: " + class1334.Field14102.toString() + ", x: " + class1334.Field14103 + ", y: " + class1334.Field14104 + ", z: " + class1334.Field14105);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 90;
            cArray2[n] = (char)(cArray[n] ^ (0x42C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

