/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lavahack.client.OXnmHkicoKSXO07qPVZZlEOZLMS63HK3;
import lavahack.client.Xj5XEeyk8zXE6L85YKQpB3E2MuPTFL7G;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Type;

public class CtVtyQkWPun0wJTOiNCcP66ptb2oORzD {
    private String Field15921 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static String Method6582(String string, String string2, String string3, OXnmHkicoKSXO07qPVZZlEOZLMS63HK3 oXnmHkicoKSXO07qPVZZlEOZLMS63HK3) {
        String string4;
        String string5 = CtVtyQkWPun0wJTOiNCcP66ptb2oORzD.Method6583(string, string2, string3, oXnmHkicoKSXO07qPVZZlEOZLMS63HK3);
        if (string5 == null) {
            string4 = string2;
            return string4;
        }
        string4 = string5;
        return string4;
    }

    private static String Method6583(String string, String string2, String string3, OXnmHkicoKSXO07qPVZZlEOZLMS63HK3 oXnmHkicoKSXO07qPVZZlEOZLMS63HK3) {
        List list = (List)oXnmHkicoKSXO07qPVZZlEOZLMS63HK3.Method6771().get(string2);
        if (list == null) {
            return null;
        }
        if (list.size() == (int)((long)1665770327 ^ (long)1665770326)) {
            return ((Xj5XEeyk8zXE6L85YKQpB3E2MuPTFL7G)list.get((int)1288132037L ^ 0x4CC755C5)).Method988();
        }
        double d = 0.0;
        Xj5XEeyk8zXE6L85YKQpB3E2MuPTFL7G xj5XEeyk8zXE6L85YKQpB3E2MuPTFL7G = null;
        for (Xj5XEeyk8zXE6L85YKQpB3E2MuPTFL7G xj5XEeyk8zXE6L85YKQpB3E2MuPTFL7G2 : list) {
            double d2 = 0.0;
            if (xj5XEeyk8zXE6L85YKQpB3E2MuPTFL7G2.Method989().equals(string3)) {
                d2 += 1.0;
            }
            if (xj5XEeyk8zXE6L85YKQpB3E2MuPTFL7G2.Method987().equals(string)) {
                d2 += 1.0;
            }
            if (string2.contains("_" + xj5XEeyk8zXE6L85YKQpB3E2MuPTFL7G2.Method988())) {
                d2 += Double.longBitsToDouble(0xD95DE688A325C3E9L ^ 0xE6BDE688A325C3E9L);
            }
            if (xj5XEeyk8zXE6L85YKQpB3E2MuPTFL7G != null) {
                Double.compare(d2, d);
                continue;
            }
            d = d2;
            xj5XEeyk8zXE6L85YKQpB3E2MuPTFL7G = xj5XEeyk8zXE6L85YKQpB3E2MuPTFL7G2;
        }
        if (xj5XEeyk8zXE6L85YKQpB3E2MuPTFL7G == null) {
            return null;
        }
        String string4 = xj5XEeyk8zXE6L85YKQpB3E2MuPTFL7G.Method988();
        return string4;
    }

    public static List Method6584(List list, OXnmHkicoKSXO07qPVZZlEOZLMS63HK3 oXnmHkicoKSXO07qPVZZlEOZLMS63HK3) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            if (object instanceof String) {
                String string = (String)object;
                object = string.startsWith("[") ? CtVtyQkWPun0wJTOiNCcP66ptb2oORzD.Method6589(string, oXnmHkicoKSXO07qPVZZlEOZLMS63HK3) : oXnmHkicoKSXO07qPVZZlEOZLMS63HK3.Method6769().getOrDefault(string, string);
            }
            arrayList.add(object);
        }
        return arrayList;
    }

    public static Handle Method6585(Handle handle, OXnmHkicoKSXO07qPVZZlEOZLMS63HK3 oXnmHkicoKSXO07qPVZZlEOZLMS63HK3) {
        String string;
        String string2 = handle.getName();
        String string3 = handle.getOwner();
        string2 = CtVtyQkWPun0wJTOiNCcP66ptb2oORzD.Method6583(string3, string2, string = handle.getDesc(), oXnmHkicoKSXO07qPVZZlEOZLMS63HK3);
        if (string2 == null) {
            string2 = oXnmHkicoKSXO07qPVZZlEOZLMS63HK3.Method6770().getOrDefault(handle.getName(), handle.getName());
        }
        string3 = oXnmHkicoKSXO07qPVZZlEOZLMS63HK3.Method6769().getOrDefault(string3, string3);
        string = CtVtyQkWPun0wJTOiNCcP66ptb2oORzD.Method6589(string, oXnmHkicoKSXO07qPVZZlEOZLMS63HK3);
        return new Handle(handle.getTag(), string3, string2, string, handle.isInterface());
    }

    public static Type Method6586(Type type, OXnmHkicoKSXO07qPVZZlEOZLMS63HK3 oXnmHkicoKSXO07qPVZZlEOZLMS63HK3) {
        return Type.getType(CtVtyQkWPun0wJTOiNCcP66ptb2oORzD.Method6589(type.getDescriptor(), oXnmHkicoKSXO07qPVZZlEOZLMS63HK3));
    }

    public static String[] Method6587(String string) {
        int n = string.lastIndexOf("/");
        String string2 = string.substring((int)((long)1817975776 ^ (long)1817975776), n);
        String string3 = string.substring(n + (int)((long)-1151172161 ^ (long)-1151172162));
        String[] stringArray = new String[(int)((long)1357879580 ^ (long)1357879581) << 1];
        stringArray[(int)((long)251403824 ^ (long)251403824)] = string2;
        stringArray[(int)((long)252799795 ^ (long)252799794)] = string3;
        return stringArray;
    }

    public static String[] Method6588(String string) {
        String[] stringArray = string.split("(\\()");
        int n = stringArray[(int)((long)-1155541871 ^ (long)-1155541871)].lastIndexOf("/");
        String string2 = stringArray[(int)((long)1511519333 ^ (long)1511519333)].substring((int)-1827402522L ^ 0x93140CE6, n);
        String string3 = stringArray[(int)-1601455578L ^ 0xA08BBA26].substring(n + ((int)75411052L ^ 0x47EAE6D));
        String string4 = "(" + stringArray[(int)((long)122573174 ^ (long)122573175)];
        String[] stringArray2 = new String[(int)((long)-255453706 ^ (long)-255453707)];
        stringArray2[(int)((long)1630848109 ^ (long)1630848109)] = string2;
        stringArray2[(int)825880688L ^ 0x3139F071] = string3;
        stringArray2[(int)((long)-344295641 ^ (long)-344295642) << 1] = string4;
        return stringArray2;
    }

    public static String Method6589(String string, OXnmHkicoKSXO07qPVZZlEOZLMS63HK3 oXnmHkicoKSXO07qPVZZlEOZLMS63HK3) {
        char[] cArray = new char[(int)((long)-693318372 ^ (long)-693318371)];
        cArray[(int)228186676L ^ 0xD99DA34] = (int)-1340485414L ^ 0xB019D0E1;
        Set set = CtVtyQkWPun0wJTOiNCcP66ptb2oORzD.Method6591(string, cArray);
        return CtVtyQkWPun0wJTOiNCcP66ptb2oORzD.Method6592(string, oXnmHkicoKSXO07qPVZZlEOZLMS63HK3, set);
    }

    public static String Method6590(String string, OXnmHkicoKSXO07qPVZZlEOZLMS63HK3 oXnmHkicoKSXO07qPVZZlEOZLMS63HK3) {
        char[] cArray = new char[(int)((long)-2106087763 ^ (long)-2106087764) << 1];
        cArray[(int)-1017364939L ^ 0xC35C3E35] = (int)((long)853805088 ^ (long)853805103) << 2;
        cArray[(int)-1904064534L ^ 0x8E8247EB] = (int)((long)-1334883099 ^ (long)-1334883106);
        Set set = CtVtyQkWPun0wJTOiNCcP66ptb2oORzD.Method6591(string, cArray);
        return CtVtyQkWPun0wJTOiNCcP66ptb2oORzD.Method6592(string, oXnmHkicoKSXO07qPVZZlEOZLMS63HK3, set);
    }

    private static Set Method6591(String string, char ... cArray) {
        int n = (int)((long)390539080 ^ (long)390539080);
        HashSet hashSet = new HashSet();
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = (int)-463666197L ^ 0xE45D03EB;
        while (n2 < string.length()) {
            char c = string.charAt(n2);
            if (c == ((int)1210289205L ^ 0x48238C26) << 2) {
                n = (int)((long)1480838269 ^ (long)1480838268);
            }
            ++n2;
        }
        return hashSet;
    }

    private static String Method6592(String string, OXnmHkicoKSXO07qPVZZlEOZLMS63HK3 oXnmHkicoKSXO07qPVZZlEOZLMS63HK3, Set set) {
        String string2 = string;
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            String string3 = (String)iterator.next();
            String string4 = string3.substring((int)((long)-516717481 ^ (long)-516717481), string3.length() - (int)((long)1905890421 ^ (long)1905890420));
            String string5 = string3.substring(string3.length() - ((int)-389850756L ^ 0xE8C3597D));
            String string6 = (String)oXnmHkicoKSXO07qPVZZlEOZLMS63HK3.Method6769().get(string4);
            if (string6 == null) continue;
            string2 = string2.replace(string3, string6 + string5);
        }
        return string2;
    }

    private static String Method6593(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1537038708L ^ 0x5B9D5974;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)477402974 ^ (long)477403041);
            int n2 = ((int)-941061238L ^ 0xC7E88BC9) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1776295742 ^ (long)-1776307135) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

