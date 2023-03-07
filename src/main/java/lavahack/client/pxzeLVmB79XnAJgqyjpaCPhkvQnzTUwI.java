//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x;

public class pxzeLVmB79XnAJgqyjpaCPhkvQnzTUwI
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field9507 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(pxzeLVmB79XnAJgqyjpaCPhkvQnzTUwI::Method1806, new Predicate[(int)((long)-1622048074 ^ (long)-1622048074)]);
    private String Field9508 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public pxzeLVmB79XnAJgqyjpaCPhkvQnzTUwI() {
        super("YCorrect", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (pxzeLVmB79XnAJgqyjpaCPhkvQnzTUwI.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && pxzeLVmB79XnAJgqyjpaCPhkvQnzTUwI.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method705(this);
            return;
        }
        this.Method22();
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method710(this);
    }

    private static void Method1806(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2) {
        if (!(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Field14104 <= Double.longBitsToDouble((long)1350106231 ^ 0xBFB4120592F7A05EL))) return;
        uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Field14104 = 0.0;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1446450797L ^ 0x5637166D;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)239938010 ^ (long)239937829);
            int n2 = (int)((long)1120478395 ^ (long)1120478304);
            cArray2[n] = (char)(cArray[n] ^ ((int)-1017260976L ^ 0xC35D9F57 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

