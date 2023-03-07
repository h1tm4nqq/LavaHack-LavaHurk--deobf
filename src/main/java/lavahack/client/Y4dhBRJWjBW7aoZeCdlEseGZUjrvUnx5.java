//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x;

public class Y4dhBRJWjBW7aoZeCdlEseGZUjrvUnx5
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field12790 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(Y4dhBRJWjBW7aoZeCdlEseGZUjrvUnx5::Method4351, new Predicate[(int)((long)1742084375 ^ (long)1742084375)]);
    private String Field12791 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Y4dhBRJWjBW7aoZeCdlEseGZUjrvUnx5() {
        super("MoveInspector", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (Y4dhBRJWjBW7aoZeCdlEseGZUjrvUnx5.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && Y4dhBRJWjBW7aoZeCdlEseGZUjrvUnx5.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
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

    private static void Method4351(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2) {
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505().Method1886("MoverType: " + uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Field14102.toString() + ", x: " + uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Field14103 + ", y: " + uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Field14104 + ", z: " + uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Field14105);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-2063193732 ^ (long)-2063193732);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)510938714 ^ (long)510938789);
            int n2 = (int)((long)-1936807076 ^ (long)-1936807055) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1113844028L ^ 0xBD9C17CF) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

