/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.text.TextFormatting
 */
package lavahack.client;

import lavahack.client.Class1089;
import lavahack.client.Class1295;
import lavahack.client.Class1331;
import lavahack.client.Class158;
import lavahack.client.Class1700;
import lavahack.client.Class1796;
import net.minecraft.util.text.TextFormatting;

public class Class1519
extends Class158 {
    private String Field15111 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1519() {
        super("lua");
    }

    @Override
    public void Method443(String string, String[] stringArray) {
        Class1295 class1295;
        if (stringArray[0].equalsIgnoreCase("info")) {
            this.Method437("Documentation: https://cattyn.gitbook.io/ferret-lua-api/reference/readme.");
            return;
        }
        if (stringArray[0].equalsIgnoreCase("load")) {
            Class1089 class1089;
            Object object = Class1796.Field16241.Field16283.Field15891.iterator();
            do {
                if (object.hasNext()) continue;
                object = new Class1089(stringArray[1], ".lua script");
                ((Class1089)object).Method4453();
                Class1796.Field16241.Field16283.Field15891.add(object);
                Class1796.Method6788();
                this.Method437("[Lua] Successful loaded " + stringArray[1] + " script!");
                return;
            } while (!(class1089 = (Class1089)object.next()).Method40().equalsIgnoreCase(stringArray[1]));
            this.Method438("[Lua] Script " + stringArray[1] + " is already loaded!");
            return;
        }
        if (!stringArray[0].equalsIgnoreCase("get")) return;
        if (!Class1796.Field16241.Field16283.Method6537(stringArray[1])) {
            this.Method438("[Lua] Script " + stringArray[1] + " doesn't exists!");
            return;
        }
        if (stringArray[2].equalsIgnoreCase("state")) {
            boolean bl;
            if (stringArray[3].equalsIgnoreCase("true")) {
                bl = true;
            } else {
                if (!stringArray[3].equalsIgnoreCase("false")) {
                    this.Method438("[Lua] State " + stringArray[3] + " doesn't convert to boolean type!");
                    return;
                }
                bl = false;
            }
            Class1700 class1700 = Class1796.Field16241.Field16283.Method6536(stringArray[1]).Method4452(stringArray[4]);
            if (class1700 != null) {
                class1700.Method21(bl);
                this.Method435(TextFormatting.GRAY + "[Lua] Module " + TextFormatting.RED + stringArray[4] + TextFormatting.GRAY + " has been " + "disabled" + "!");
                return;
            }
            this.Method438("[Lua] Module " + stringArray[4] + " in script " + stringArray[1] + " doesn't exists!");
            return;
        }
        if (!stringArray[2].equalsIgnoreCase("action")) {
            this.Method438("Usage: " + this.Method448());
            return;
        }
        if (stringArray[3].equalsIgnoreCase("unload")) {
            class1295 = Class1295.Field13918;
        } else {
            if (!stringArray[3].equalsIgnoreCase("reload")) {
                this.Method438("[Lua] Action " + stringArray[3] + " doesn't exists!");
                return;
            }
            class1295 = Class1295.Field13919;
        }
        Class1089 class1089 = Class1796.Field16241.Field16283.Method6536(stringArray[1]);
        if (class1089 == null) {
            this.Method438("[Lua] Script " + stringArray[4] + " doesn't exists!");
            return;
        }
        switch (Class1331.Field14097[class1295.ordinal()]) {
            case 1: {
                class1089.Method4454(true);
                this.Method437("[Lua] Script " + class1089.Method40() + " has been unloaded!");
                return;
            }
            case 2: {
                class1089.Method20();
                this.Method437("[Lua] Script " + class1089.Method40() + " has been reloaded!");
                return;
            }
        }
    }

    @Override
    public String Method447() {
        return "catlua";
    }

    @Override
    public String Method448() {
        return "\nlua info\nlua load <script name>\nlua get <script name> <action> <unload/reload>\nlua get <script name> <state> <true/false> <module from script name>";
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 246;
            cArray2[n] = (char)(cArray[n] ^ (0x208F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

