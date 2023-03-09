/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Iterator;
import lavahack.client.Class1255;
import lavahack.client.Class158;
import lavahack.client.Class1796;
import lavahack.client.Class42;
import lavahack.client.Class82;
import org.jetbrains.annotations.NotNull;

public class Class440
extends Class158 {
    private String Field9840 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class440() {
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
        for (Object object : Class1796.Field16241.Field16254.Method1165()) {
            ((Class42)object).Method21(false);
        }
        for (Object object : Class1796.Field16241.Field16257.Field9235) {
            if (!((Class42)object).Method35()) continue;
            ((Class42)object).Method21(false);
        }
        Iterator<Object> iterator = Class82.Method733().values().iterator();
        while (iterator.hasNext()) {
            Object object;
            object = (Class1255)iterator.next();
            if (!((Class1255)object).Method5069()) continue;
            ((Class1255)object).Method5066();
        }
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 150;
            cArray2[n] = (char)(cArray[n] ^ (0x4C72 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

