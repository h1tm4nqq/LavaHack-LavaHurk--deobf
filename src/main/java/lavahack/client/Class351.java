/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Random;

public class Class351 {
    public static boolean Field9449;
    public static boolean Field9450;
    public static boolean Field9451;
    public static boolean Field9452;
    public static final String[] Field9453;
    private int Field9454;

    public static String Method1764() {
        int n;
        int n2 = (int)((float)Field9453.length * new Random().nextFloat());
        if (n2 == Field9453.length) {
            n = n2 - 1;
            return Field9453[n];
        }
        n = n2;
        return Field9453[n];
    }

    static {
        Field9453 = new String[]{"TheKisDevs on tope", "meowubic", "kisman.cc", "Fuck you, Muffin.", "kisman.cc+", "kidman.club", "kisman.cc b0.1.6.1", "best haked client", "TheKisDevs inc", "lava_hack", "Get Good. Get BloomWare.", "water??", "kidman own everyone", "ez rat", "sus user", "kisman > you", "kidmad.sex", "ddev moment", "made by _kisman_#5039", "Where XuluPlus shaders??", "Future? No.", "meow", "Lavahake", "Dallas got skidded", "lavhak", "cubic > you", ":^)", "ratted by cattyn", "ratted by TheKisDevs", "ty for downloading and using this rat", "https://github.com/kisman2000/lava_hack", "https://github.com/TheKisDevs/LavaHack", "https://github.com/TheKisDevs/LavaHack-Public", "kisman left LavaHack Development", "earthhack skid fr", "fr", "auto crystsa pp v??/?", "owned by catdog.cc", "bruh", "made by Cubic#1411", "zenov is still crying", "hitmanqq lost his mum", "NOpig is mad", "_fastol_ pls leave crystal pvp"};
    }

    private static String Method1765(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 157;
            cArray2[n] = (char)(cArray[n] ^ (0x11D7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

