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

public class Class1790 {
    private final Map Field16209;
    private final Map Field16210;
    private final Map Field16211;
    private final Map Field16212;
    private int Field16213;

    public Class1790(Map map, Map map2, Map map3, Map map4) {
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

    public static Class1790 Method6773(String string) throws IOException {
        String string2;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Objects.requireNonNull(Class1790.class.getClassLoader().getResourceAsStream(string))));
        Object var6_6 = null;
        block5: while ((string2 = bufferedReader.readLine()) != null) {
            String[] stringArray = string2.split(",");
            String string3 = stringArray[0];
            int n = -1;
            switch (string3.hashCode()) {
                case 94742904: {
                    if (!string3.equals("class")) continue block5;
                    n = 0;
                    break;
                }
                case 97427706: {
                    if (!string3.equals("field")) continue block5;
                    n = 1;
                    break;
                }
                case 3154628: {
                    if (!string3.equals("func")) continue block5;
                    n = 2;
                    continue block5;
                }
            }
        }
        if (bufferedReader == null) return new Class1790(hashMap2, hashMap3, hashMap, hashMap4);
        if (var6_6 != null) {
            bufferedReader.close();
            return new Class1790(hashMap2, hashMap3, hashMap, hashMap4);
        }
        bufferedReader.close();
        return new Class1790(hashMap2, hashMap3, hashMap, hashMap4);
    }

    private static List Method6774(String string) {
        return new ArrayList(1);
    }

    private static String Method6775(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 254;
            cArray2[n] = (char)(cArray[n] ^ (0x4986 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

