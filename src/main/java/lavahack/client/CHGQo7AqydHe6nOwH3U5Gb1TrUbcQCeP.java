/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.WkowkMIYywGBZ1LvpVpVCHmyCihJiruH;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;

public class CHGQo7AqydHe6nOwH3U5Gb1TrUbcQCeP
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public static CHGQo7AqydHe6nOwH3U5Gb1TrUbcQCeP Field16075;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field16076 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(WkowkMIYywGBZ1LvpVpVCHmyCihJiruH::Method158, new Predicate[(int)-334130545L ^ 0xEC15928F]);
    private String Field16077 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public CHGQo7AqydHe6nOwH3U5Gb1TrUbcQCeP() {
        super("SkylightFix", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
        Field16075 = this;
    }

    @Override
    public void Method38() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field16076);
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field16076);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)739860725L ^ 0x2C1960F5;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-97235274L ^ 0xFA344E49);
            int n2 = (int)171202984L ^ 0xA345957;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1490648476L ^ 0xA726BA6F) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

