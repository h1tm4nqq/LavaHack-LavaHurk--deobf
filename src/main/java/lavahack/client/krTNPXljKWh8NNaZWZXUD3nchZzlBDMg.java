/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Random;

public class krTNPXljKWh8NNaZWZXUD3nchZzlBDMg {
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
            n = n2 - ((int)1748640325L ^ 0x683A2244);
            return Field9453[n];
        }
        n = n2;
        return Field9453[n];
    }

    static {
        String[] stringArray = new String[((int)-1955302161L ^ 0x8B7474E4) << 2];
        stringArray[(int)((long)1844907440 ^ (long)1844907440)] = "TheKisDevs on tope";
        stringArray[(int)701258059L ^ 0x29CC594A] = "meowubic";
        stringArray[(int)((long)-1870082227 ^ (long)-1870082228) << 1] = "kisman.cc";
        stringArray[(int)((long)-598439942 ^ (long)-598439943)] = "Fuck you, Muffin.";
        stringArray[((int)1525301134L ^ 0x5AEA3F8F) << 2] = "kisman.cc+";
        stringArray[(int)-2063565416L ^ 0x85007D9D] = "kidman.club";
        stringArray[(int)((long)1917091471 ^ (long)1917091468) << 1] = "kisman.cc b0.1.6.1";
        stringArray[(int)((long)1363001398 ^ (long)1363001393)] = "best haked client";
        stringArray[((int)-1386930667L ^ 0xAD551E14) << 3] = "TheKisDevs inc";
        stringArray[(int)((long)-1800701505 ^ (long)-1800701514)] = "lava_hack";
        stringArray[(int)((long)-912763548 ^ (long)-912763551) << 1] = "Get Good. Get BloomWare.";
        stringArray[(int)((long)1767171165 ^ (long)1767171158)] = "water??";
        stringArray[(int)((long)-1583594520 ^ (long)-1583594517) << 2] = "kidman own everyone";
        stringArray[(int)1515891838L ^ 0x5A5AAC73] = "ez rat";
        stringArray[((int)2044585861L ^ 0x79DDE782) << 1] = "sus user";
        stringArray[(int)159241489L ^ 0x97DD51E] = "kisman > you";
        stringArray[((int)-351757445L ^ 0xEB089B7A) << 4] = "kidmad.sex";
        stringArray[(int)-191994576L ^ 0xF48E6521] = "ddev moment";
        stringArray[(int)((long)-123457235 ^ (long)-123457244) << 1] = "made by _kisman_#5039";
        stringArray[(int)((long)-637072030 ^ (long)-637072015)] = "Where XuluPlus shaders??";
        stringArray[((int)1329211467L ^ 0x4F3A284E) << 2] = "Future? No.";
        stringArray[(int)-1234093405L ^ 0xB6713AB6] = "meow";
        stringArray[((int)1378565329L ^ 0x522B3CDA) << 1] = "Lavahake";
        stringArray[(int)((long)-1317335503 ^ (long)-1317335514)] = "Dallas got skidded";
        stringArray[((int)1782234447L ^ 0x6A3ABD4C) << 3] = "lavhak";
        stringArray[(int)((long)-1490722880 ^ (long)-1490722855)] = "cubic > you";
        stringArray[(int)((long)-205168706 ^ (long)-205168717) << 1] = ":^)";
        stringArray[(int)((long)-1852860795 ^ (long)-1852860770)] = "ratted by cattyn";
        stringArray[((int)302103863L ^ 0x1201BD30) << 2] = "ratted by TheKisDevs";
        stringArray[(int)((long)1277438959 ^ (long)1277438962)] = "ty for downloading and using this rat";
        stringArray[(int)((long)-171298794 ^ (long)-171298791) << 1] = "https://github.com/kisman2000/lava_hack";
        stringArray[(int)1181479355L ^ 0x466BF1A4] = "https://github.com/TheKisDevs/LavaHack";
        stringArray[(int)((long)286230180 ^ (long)286230181) << 5] = "https://github.com/TheKisDevs/LavaHack-Public";
        stringArray[(int)((long)499486466 ^ (long)499486499)] = "kisman left LavaHack Development";
        stringArray[((int)493031358L ^ 0x1D630FAF) << 1] = "earthhack skid fr";
        stringArray[(int)-1884411684L ^ 0x8FAE28FF] = "fr";
        stringArray[((int)-783139692L ^ 0xD1523C9D) << 2] = "auto crystsa pp v??/?";
        stringArray[(int)-1551275796L ^ 0xA38968C9] = "owned by catdog.cc";
        stringArray[(int)((long)-996120134 ^ (long)-996120151) << 1] = "bruh";
        stringArray[(int)-736726515L ^ 0xD416722A] = "made by Cubic#1411";
        stringArray[((int)-1552249158L ^ 0xA37A8EBF) << 3] = "zenov is still crying";
        stringArray[(int)((long)-298980381 ^ (long)-298980406)] = "hitmanqq lost his mum";
        stringArray[(int)((long)274039111 ^ (long)274039122) << 1] = "NOpig is mad";
        stringArray[(int)1404314308L ^ 0x53B422EF] = "_fastol_ pls leave crystal pvp";
        Field9453 = stringArray;
    }

    private static String Method1765(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1299442409 ^ (long)-1299442409);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1965105744L ^ 0x8ADEDD4F);
            int n2 = (int)((long)-377602545 ^ (long)-377602414);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)491673689 ^ (long)491669902) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

