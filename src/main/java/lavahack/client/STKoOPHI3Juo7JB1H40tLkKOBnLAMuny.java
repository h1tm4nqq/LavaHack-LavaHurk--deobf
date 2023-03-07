/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Iterator;
import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.MUU5rY7bYKphpPNPTaXWkJXha4Qjva9q;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.g9ACcWJQzdXB5LBLWDC3b7mU2TcuKMwK;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import org.jetbrains.annotations.NotNull;

public class STKoOPHI3Juo7JB1H40tLkKOBnLAMuny
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
    private String Field9840 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public STKoOPHI3Juo7JB1H40tLkKOBnLAMuny() {
        super("panic");
    }

    @Override
    public String Method447() {
        return "turns off all module";
    }

    @Override
    public String Method448() {
        return "panic";
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        for (Object object : leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1165()) {
            ((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)object).Method21((boolean)((long)567225039 ^ (long)567225039));
        }
        for (Object object : leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16257.Field9235) {
            if (!((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)object).Method35()) continue;
            ((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)object).Method21((boolean)((long)-991625214 ^ (long)-991625214));
        }
        Iterator<Object> iterator = g9ACcWJQzdXB5LBLWDC3b7mU2TcuKMwK.Method733().values().iterator();
        while (iterator.hasNext()) {
            Object object;
            object = (MUU5rY7bYKphpPNPTaXWkJXha4Qjva9q)iterator.next();
            if (!((MUU5rY7bYKphpPNPTaXWkJXha4Qjva9q)object).Method5069()) continue;
            ((MUU5rY7bYKphpPNPTaXWkJXha4Qjva9q)object).Method5066();
        }
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)238979752 ^ (long)238979752);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1120018003 ^ (long)1120018092);
            int n2 = (int)((long)1610421165 ^ (long)1610421222) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)1252657415L ^ 0x4AAA2F3E) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

