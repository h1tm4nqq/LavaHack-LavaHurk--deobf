/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.ArrayList;
import lavahack.client.Class1127;
import lavahack.client.Class1164;
import lavahack.client.Class1255;
import lavahack.client.Class1393;
import lavahack.client.Class1424;
import lavahack.client.Class158;
import lavahack.client.Class1796;
import lavahack.client.Class1866;
import lavahack.client.Class2099;
import lavahack.client.Class488;
import lavahack.client.Class82;
import org.jetbrains.annotations.NotNull;

public class Class1628
extends Class158 {
    private int Field15607;

    public Class1628() {
        super("macro");
    }

    @Override
    public String Method447() {
        return "";
    }

    @Override
    public String Method448() {
        return "";
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        String string2 = Class1628.Method6360(stringArray);
        String string3 = string2.substring(string2.indexOf(40) + 1, string2.indexOf(41));
        String string4 = string2.substring(string2.indexOf(123) + 1, string2.indexOf(125));
        String[] stringArray2 = string4.split(":");
        String string5 = stringArray2[0].trim();
        String string6 = stringArray2[1].trim();
        Class1866 class1866 = Class1424.Method5688(string5);
        if (class1866 == null) {
            Class1628.Method6361("[MacroCommand] " + string5 + " is an invalid macro");
            return;
        }
        Class1164 class1164 = class1866.Method6962(string6);
        String string7 = string2.substring(string2.indexOf(91) + 1, string2.indexOf(93));
        String[] stringArray3 = string7.split(",");
        ArrayList<Class488> arrayList = new ArrayList<Class488>();
        Object object = stringArray3;
        int n = ((String[])object).length;
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                object = new Class1255(string3, class1164, arrayList);
                ((Class1255)object).Method5065();
                Class82.Method729((Class1255)object);
                return;
            }
            String string8 = object[n2];
            String[] stringArray4 = string8.trim().split(":");
            String string9 = stringArray4[0].trim();
            String string10 = stringArray4[1].trim();
            Class2099 class2099 = Class1127.Method4617(string9);
            if (class2099 == null) {
                Class1628.Method6361("[MacroCommand] " + string9 + " is an invalid activator");
                return;
            }
            arrayList.add(class2099.Method7634(string10, class1164));
            ++n2;
        }
    }

    private static String Method6360(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int n = 0;
        while (n < stringArray.length) {
            stringBuilder.append(stringArray[n]);
            if (n < stringArray.length - 1) {
                stringBuilder.append(' ');
            }
            ++n;
        }
        return stringBuilder.toString();
    }

    private static void Method6361(String string) {
        Class1796.Field16243.error(string);
        Class1393.Method5504().Method1882(string);
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 35;
            cArray2[n] = (char)(cArray[n] ^ (0x7073 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

