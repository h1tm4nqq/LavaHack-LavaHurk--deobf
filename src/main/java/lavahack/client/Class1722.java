/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lavahack.client.Class149;
import lavahack.client.Class1790;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Type;

public class Class1722 {
    private String Field15921 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static String Method6582(String string, String string2, String string3, Class1790 class1790) {
        String string4;
        String string5 = Class1722.Method6583(string, string2, string3, class1790);
        if (string5 == null) {
            string4 = string2;
            return string4;
        }
        string4 = string5;
        return string4;
    }

    private static String Method6583(String string, String string2, String string3, Class1790 class1790) {
        List list = (List)class1790.Method6771().get(string2);
        if (list == null) {
            return null;
        }
        if (list.size() == 1) {
            return ((Class149)list.get(0)).Method988();
        }
        double d = 0.0;
        Class149 class149 = null;
        for (Class149 class1492 : list) {
            double d2 = 0.0;
            if (class1492.Method989().equals(string3)) {
                d2 += 1.0;
            }
            if (class1492.Method987().equals(string)) {
                d2 += 1.0;
            }
            if (string2.contains("_" + class1492.Method988())) {
                d2 += Double.longBitsToDouble(4602678819172646912L);
            }
            if (class149 != null) {
                Double.compare(d2, d);
                continue;
            }
            d = d2;
            class149 = class1492;
        }
        if (class149 == null) {
            return null;
        }
        String string4 = class149.Method988();
        return string4;
    }

    public static List Method6584(List list, Class1790 class1790) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            if (object instanceof String) {
                String string = (String)object;
                object = string.startsWith("[") ? Class1722.Method6589(string, class1790) : class1790.Method6769().getOrDefault(string, string);
            }
            arrayList.add(object);
        }
        return arrayList;
    }

    public static Handle Method6585(Handle handle, Class1790 class1790) {
        String string;
        String string2 = handle.getName();
        String string3 = handle.getOwner();
        string2 = Class1722.Method6583(string3, string2, string = handle.getDesc(), class1790);
        if (string2 == null) {
            string2 = class1790.Method6770().getOrDefault(handle.getName(), handle.getName());
        }
        string3 = class1790.Method6769().getOrDefault(string3, string3);
        string = Class1722.Method6589(string, class1790);
        return new Handle(handle.getTag(), string3, string2, string, handle.isInterface());
    }

    public static Type Method6586(Type type, Class1790 class1790) {
        return Type.getType(Class1722.Method6589(type.getDescriptor(), class1790));
    }

    public static String[] Method6587(String string) {
        int n = string.lastIndexOf("/");
        String string2 = string.substring(0, n);
        String string3 = string.substring(n + 1);
        return new String[]{string2, string3};
    }

    public static String[] Method6588(String string) {
        String[] stringArray = string.split("(\\()");
        int n = stringArray[0].lastIndexOf("/");
        String string2 = stringArray[0].substring(0, n);
        String string3 = stringArray[0].substring(n + 1);
        String string4 = "(" + stringArray[1];
        return new String[]{string2, string3, string4};
    }

    public static String Method6589(String string, Class1790 class1790) {
        Set set = Class1722.Method6591(string, ';');
        return Class1722.Method6592(string, class1790, set);
    }

    public static String Method6590(String string, Class1790 class1790) {
        Set set = Class1722.Method6591(string, '<', ';');
        return Class1722.Method6592(string, class1790, set);
    }

    private static Set Method6591(String string, char ... cArray) {
        boolean bl = false;
        HashSet hashSet = new HashSet();
        StringBuilder stringBuilder = new StringBuilder();
        int n = 0;
        while (n < string.length()) {
            char c = string.charAt(n);
            if (c == 'L') {
                bl = true;
            }
            ++n;
        }
        return hashSet;
    }

    private static String Method6592(String string, Class1790 class1790, Set set) {
        String string2 = string;
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            String string3 = (String)iterator.next();
            String string4 = string3.substring(0, string3.length() - 1);
            String string5 = string3.substring(string3.length() - 1);
            String string6 = (String)class1790.Method6769().get(string4);
            if (string6 == null) continue;
            string2 = string2.replace(string3, string6 + string5);
        }
        return string2;
    }

    private static String Method6593(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 134;
            cArray2[n] = (char)(cArray[n] ^ (0x5483 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

