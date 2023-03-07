/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package lavahack.client;

import java.util.Iterator;
import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K;
import org.lwjgl.input.Keyboard;

public class Oa8OmXGY4rswgTcXqMYIT4uplD41igXw
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
    private String Field14973 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Oa8OmXGY4rswgTcXqMYIT4uplD41igXw() {
        super("bind");
    }

    @Override
    public void Method443(String string, String[] stringArray) {
        String string2 = stringArray[(int)-1914561328L ^ 0x8DE21CD0];
        String string3 = stringArray[(int)960502769L ^ 0x39401BF1];
        if (stringArray.length == ((int)188294915L ^ 0xB392702) && !string3.equalsIgnoreCase("list")) {
            this.Method438("Usage: " + this.Method448());
            return;
        }
        if (stringArray.length > ((int)-67552585L ^ 0xFBF93AB6) << 1 && string3.equalsIgnoreCase("list")) {
            this.Method438("Usage: " + this.Method448());
            return;
        }
        if (stringArray.length == ((int)1186492653L ^ 0x46B870EC) && string3.equalsIgnoreCase("list")) {
            this.Method435("----------------------------------");
            this.Method435("Bind List:");
            this.Method435("----------------------------------");
            return;
        }
        Iterator iterator = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Field8854.iterator();
        while (iterator.hasNext()) {
            WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J = (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)iterator.next();
            if (!wjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Method40().equalsIgnoreCase(stringArray[(int)1627236172L ^ 0x60FDA74D])) continue;
            wjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Method13(ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12068);
            wjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Method9(Keyboard.getKeyIndex((String)string2.toUpperCase()));
            this.Method435(wjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Method40() + " binned to " + Keyboard.getKeyName((int)wjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Method8()));
        }
    }

    @Override
    public String Method447() {
        return "Changes key for modules/commands. | Shows your bind list";
    }

    @Override
    public String Method448() {
        return "bind <key> <command/module> or bind list";
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-66319280 ^ (long)-66319280);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1715965909 ^ (long)-1715965740);
            int n2 = (int)((long)821095010 ^ (long)821094935) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-839699065 ^ (long)-839697296) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

