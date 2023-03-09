/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package lavahack.client;

import java.util.Iterator;
import lavahack.client.Class158;
import lavahack.client.Class1796;
import lavahack.client.Class42;
import lavahack.client.Class955;
import org.lwjgl.input.Keyboard;

public class Class1490
extends Class158 {
    private String Field14973 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1490() {
        super("bind");
    }

    @Override
    public void Method443(String string, String[] stringArray) {
        String string2 = stringArray[0];
        String string3 = stringArray[0];
        if (stringArray.length == 1 && !string3.equalsIgnoreCase("list")) {
            this.Method438("Usage: " + this.Method448());
            return;
        }
        if (stringArray.length > 2 && string3.equalsIgnoreCase("list")) {
            this.Method438("Usage: " + this.Method448());
            return;
        }
        if (stringArray.length == 1 && string3.equalsIgnoreCase("list")) {
            this.Method435("----------------------------------");
            this.Method435("Bind List:");
            this.Method435("----------------------------------");
            return;
        }
        Iterator iterator = Class1796.Field16241.Field16254.Field8854.iterator();
        while (iterator.hasNext()) {
            Class42 class42 = (Class42)iterator.next();
            if (!class42.Method40().equalsIgnoreCase(stringArray[1])) continue;
            class42.Method13(Class955.Field12068);
            class42.Method9(Keyboard.getKeyIndex((String)string2.toUpperCase()));
            this.Method435(class42.Method40() + " binned to " + Keyboard.getKeyName((int)class42.Method8()));
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 234;
            cArray2[n] = (char)(cArray[n] ^ (0x9F7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

