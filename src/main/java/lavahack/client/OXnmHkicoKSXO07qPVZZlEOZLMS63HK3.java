/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class OXnmHkicoKSXO07qPVZZlEOZLMS63HK3 {
    private final Map Field16209;
    private final Map Field16210;
    private final Map Field16211;
    private final Map Field16212;
    private int Field16213;

    public OXnmHkicoKSXO07qPVZZlEOZLMS63HK3(Map map, Map map2, Map map3, Map map4) {
        this.Field16209 = map;
        this.Field16210 = map2;
        this.Field16211 = map3;
        this.Field16212 = map4;
    }

    public Map Method6769() {
        return this.Field16209;
    }

    public Map Method6770() {
        return this.Field16210;
    }

    public Map Method6771() {
        return this.Field16211;
    }

    public Map Method6772() {
        return this.Field16212;
    }

    public static OXnmHkicoKSXO07qPVZZlEOZLMS63HK3 Method6773(String string) throws IOException {
        String string2;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Objects.requireNonNull(OXnmHkicoKSXO07qPVZZlEOZLMS63HK3.class.getClassLoader().getResourceAsStream(string))));
        Object var6_6 = null;
        block5: while ((string2 = bufferedReader.readLine()) != null) {
            String[] stringArray = string2.split(",");
            String string3 = stringArray[(int)((long)-1498487158 ^ (long)-1498487158)];
            int n = (int)2133694488L ^ 0x80D267E7;
            switch (string3.hashCode()) {
                case 94742904: {
                    if (!string3.equals("class")) continue block5;
                    n = (int)((long)-1051238754 ^ (long)-1051238754);
                    break;
                }
                case 97427706: {
                    if (!string3.equals("field")) continue block5;
                    n = (int)-1378787607L ^ 0xADD15EE8;
                    break;
                }
                case 3154628: {
                    if (!string3.equals("func")) continue block5;
                    n = (int)((long)1375312984 ^ (long)1375312985) << 1;
                    continue block5;
                }
            }
        }
        if (bufferedReader == null) return new OXnmHkicoKSXO07qPVZZlEOZLMS63HK3(hashMap2, hashMap3, hashMap, hashMap4);
        if (var6_6 != null) {
            bufferedReader.close();
            return new OXnmHkicoKSXO07qPVZZlEOZLMS63HK3(hashMap2, hashMap3, hashMap, hashMap4);
        }
        bufferedReader.close();
        return new OXnmHkicoKSXO07qPVZZlEOZLMS63HK3(hashMap2, hashMap3, hashMap, hashMap4);
    }

    private static List Method6774(String string) {
        return new ArrayList((int)((long)-1255145604 ^ (long)-1255145603));
    }

    private static String Method6775(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1801971361L ^ 0x9498195F;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1505854835 ^ (long)-1505854862);
            int n2 = (int)((long)1688168032 ^ (long)1688167967) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1960698570 ^ (long)1960691209) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

