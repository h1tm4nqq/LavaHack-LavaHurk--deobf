/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI;

public class ZCPKQ2BMXYar2sFzN1Npi7qNbTNnQsyB
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
    private String Field11886 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public ZCPKQ2BMXYar2sFzN1Npi7qNbTNnQsyB() {
        super("friend");
    }

    @Override
    public void Method443(String string, String[] stringArray) {
        if (stringArray[(int)-23346036L ^ 0xFE9BC48C].equalsIgnoreCase("add")) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16256.Method3040(stringArray[(int)((long)504182169 ^ (long)504182168)]);
            this.Method437(stringArray[(int)((long)1943465231 ^ (long)1943465230)] + " added in friends!");
            return;
        }
        if (stringArray[(int)-841896709L ^ 0xCDD1ACFB].equalsIgnoreCase("remove")) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16256.Method3041(stringArray[(int)1548990332L ^ 0x5C53B77D]);
            this.Method437(stringArray[(int)1590831966L ^ 0x5ED22B5F] + " removed from friends :(");
            return;
        }
        if (!stringArray[(int)-2127048154L ^ 0x8137D226].equalsIgnoreCase("list")) throw new Exception();
        String string2 = "Friends: ";
        int n = (int)1229388384L ^ 0x4946FA60;
        while (true) {
            if (n >= n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI.Field11086.Method3039().size()) {
                this.Method437(string2);
                return;
            }
            string2 = string2 + (String)n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI.Field11086.Method3039().get(n);
            if (n != n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI.Field11086.Method3039().size() - (int)((long)286541434 ^ (long)286541435)) {
                string2 = string2 + ", ";
            }
            ++n;
        }
    }

    @Override
    public String Method447() {
        return "friend's command";
    }

    @Override
    public String Method448() {
        return "friend add/remove <player's name> | friend list";
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1824806670L ^ 0x933BA8F2;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1283527009L ^ 0x4C81119E);
            int n2 = (int)((long)-808976311 ^ (long)-808976278);
            cArray2[n] = (char)(cArray[n] ^ ((int)850600476L ^ 0x32B3535D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

