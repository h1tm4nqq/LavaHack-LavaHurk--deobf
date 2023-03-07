/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import lavahack.client.GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL;
import lavahack.client.GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$1;

class GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf {
    private final HashMap Field11665;
    final GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL Field11666;
    private String Field11667 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL) {
        this.Field11666 = gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL;
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
        int n = (int)1679497136L ^ 0x641B17B0;
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
            } else if (v instanceof GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) {
                stringBuilder.append(v.toString());
            } else if (v.getClass().isArray()) {
                stringBuilder.append("[");
                int n2 = Array.getLength(v);
                for (int i = (int)-800374206L ^ 0xD04B4242; i < n2; ++i) {
                    stringBuilder.append(Array.get(v, i).toString()).append(i != n2 - (int)((long)176615753 ^ (long)176615752) ? "," : "");
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

    GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL, GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$1 gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$1) {
        this(gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL);
    }

    private static String Method3665(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)104067664L ^ 0x633F250;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1745781369L ^ 0x97F17D78);
            int n2 = ((int)1843191198L ^ 0x6DDCDDE9) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1484881531L ^ 0xA77E8486) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

