/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.LinkedHashMap;
import java.util.Map;

public class mcvoWEeKlyBdMLF0IogD6WQBUVysm7gq {
    public static final String Field11391 = "";
    private Map Field11392 = new LinkedHashMap();
    private String Field11393;
    private String Field11394 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private mcvoWEeKlyBdMLF0IogD6WQBUVysm7gq() {
    }

    public static mcvoWEeKlyBdMLF0IogD6WQBUVysm7gq Method3314(String string) {
        mcvoWEeKlyBdMLF0IogD6WQBUVysm7gq mcvoWEeKlyBdMLF0IogD6WQBUVysm7gq2 = new mcvoWEeKlyBdMLF0IogD6WQBUVysm7gq();
        String[] stringArray = string.split(";");
        mcvoWEeKlyBdMLF0IogD6WQBUVysm7gq2.Field11393 = stringArray[(int)((long)1385009402 ^ (long)1385009402)].trim();
        int n = (int)788224238L ^ 0x2EFB58EF;
        while (n < stringArray.length) {
            String[] stringArray2 = stringArray[n].split("=");
            String string2 = "";
            if (stringArray2.length > (int)((long)-290586005 ^ (long)-290586006)) {
                String string3 = stringArray2[(int)((long)-1330735370 ^ (long)-1330735369)].trim();
                if (string3.startsWith("\"") && string3.endsWith("\"") || string3.startsWith("'") && string3.endsWith("'") && string3.length() > (int)((long)-971087798 ^ (long)-971087797) << 1) {
                    string3 = string3.substring((int)((long)-610095181 ^ (long)-610095182), string3.length() - (int)((long)-461180348 ^ (long)-461180347));
                }
                string2 = string3;
            }
            mcvoWEeKlyBdMLF0IogD6WQBUVysm7gq2.Field11392.put(stringArray2[(int)-2131686812L ^ 0x80F10A64].trim(), string2);
            ++n;
        }
        return mcvoWEeKlyBdMLF0IogD6WQBUVysm7gq2;
    }

    public String Method3315() {
        return this.Field11393;
    }

    public Map Method3316() {
        return this.Field11392;
    }

    private static String Method3317(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-270231751 ^ (long)-270231751);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)596968274 ^ (long)596968365);
            int n2 = ((int)-339839154L ^ 0xEBBE770D) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)840210679 ^ (long)840210260) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

