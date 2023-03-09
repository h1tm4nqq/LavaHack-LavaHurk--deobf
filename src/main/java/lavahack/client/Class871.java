/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import lavahack.client.Class1073;
import lavahack.client.Class1383;

class Class871 {
    private final HashMap Field11665;
    final Class1073 Field11666;
    private String Field11667 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Class871(Class1073 class1073) {
        this.Field11666 = class1073;
        this.Field11665 = new HashMap();
    }

    void Method3663(String string, Object object) {
        if (object == null) return;
        this.Field11665.put(string, object);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Set set = this.Field11665.entrySet();
        stringBuilder.append("{");
        int n = 0;
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            Object v = entry.getValue();
            stringBuilder.append(this.Method3664((String)entry.getKey())).append(":");
            if (v instanceof String) {
                stringBuilder.append(this.Method3664(String.valueOf(v)));
            } else if (v instanceof Integer) {
                stringBuilder.append(Integer.valueOf(String.valueOf(v)));
            } else if (v instanceof Boolean) {
                stringBuilder.append(v);
            } else if (v instanceof Class871) {
                stringBuilder.append(v.toString());
            } else if (v.getClass().isArray()) {
                stringBuilder.append("[");
                int n2 = Array.getLength(v);
                for (int i = 0; i < n2; ++i) {
                    stringBuilder.append(Array.get(v, i).toString()).append(i != n2 - 1 ? "," : "");
                }
                stringBuilder.append("]");
            }
            stringBuilder.append(++n == set.size() ? "}" : ",");
        }
        return stringBuilder.toString();
    }

    private String Method3664(String string) {
        return "\"" + string + "\"";
    }

    Class871(Class1073 class1073, Class1383 class1383) {
        this(class1073);
    }

    private static String Method3665(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 238;
            cArray2[n] = (char)(cArray[n] ^ (0x2818 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

