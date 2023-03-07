/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package lavahack.client;

import com.mojang.authlib.GameProfile;
import java.io.InputStream;
import java.net.URL;
import java.util.UUID;
import lavahack.client.DHzpocPNzjx2zpZIRy1vsm9XKKGwx1Ac$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;

public class DHzpocPNzjx2zpZIRy1vsm9XKKGwx1Ac {
    public static final String Field17381 = "https://api.mojang.com/users/profiles/minecraft/";
    public static final URL Field17382 = new URL("https://api.mojang.com/users/profiles/minecraft/");
    private String Field17383 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static DHzpocPNzjx2zpZIRy1vsm9XKKGwx1Ac$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Method7553(String string) {
        return DHzpocPNzjx2zpZIRy1vsm9XKKGwx1Ac.Method7554(string, (boolean)((long)-176956380 ^ (long)-176956379));
    }

    public static DHzpocPNzjx2zpZIRy1vsm9XKKGwx1Ac$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Method7554(String string, boolean bl) {
        String string2 = DHzpocPNzjx2zpZIRy1vsm9XKKGwx1Ac.Method7560(string);
        if (string2 == null) {
            return null;
        }
        String string3 = bl ? string2.substring(string2.indexOf((int)((long)869327869 ^ (long)869327840) << 1) + ((int)((long)371656101 ^ (long)371656100) << 1), string2.indexOf("id") - ((int)1082539245L ^ 0x40863CEE)) : string;
        String string4 = string2.substring(string2.indexOf("id") + ((int)-480058914L ^ 0xE362E1DB), string2.lastIndexOf(((int)-1236411708L ^ 0xB64DDAD5) << 1));
        UUID uUID = UUID.fromString(string4);
        return new DHzpocPNzjx2zpZIRy1vsm9XKKGwx1Ac$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(string3, uUID);
    }

    public static GameProfile Method7555(String string) {
        return DHzpocPNzjx2zpZIRy1vsm9XKKGwx1Ac.Method7556(string, ((int)13582243L ^ 0xCF3FA2) != 0);
    }

    public static GameProfile Method7556(String string, boolean bl) {
        String string2 = DHzpocPNzjx2zpZIRy1vsm9XKKGwx1Ac.Method7560(string);
        if (string2 == null) {
            return null;
        }
        String string3 = bl ? string2.substring(string2.indexOf((int)((long)-131901334 ^ (long)-131901321) << 1) + (((int)-930343853L ^ 0xC88C1452) << 1), string2.indexOf("id") - ((int)800929781L ^ 0x2FBD37F6)) : string;
        String string4 = string2.substring(string2.indexOf("id") + (int)((long)592690747 ^ (long)592690750), string2.lastIndexOf((int)((long)-1177691565 ^ (long)-1177691582) << 1));
        UUID uUID = UUID.fromString(string4);
        return new GameProfile(uUID, string3);
    }

    public static UUID Method7557(String string) {
        String string2 = DHzpocPNzjx2zpZIRy1vsm9XKKGwx1Ac.Method7559(string);
        if (string2 != null) return UUID.fromString(string2);
        return null;
    }

    public static String Method7558(String string) {
        String string2 = DHzpocPNzjx2zpZIRy1vsm9XKKGwx1Ac.Method7560(string);
        if (string2 != null) return string2.substring(string2.indexOf(((int)-1869861398L ^ 0x908C2DF7) << 1) + (((int)-81860937L ^ 0xFB1EE6B6) << 1), string2.indexOf("id") - (int)((long)338675213 ^ (long)338675214));
        return null;
    }

    public static String Method7559(String string) {
        String string2 = DHzpocPNzjx2zpZIRy1vsm9XKKGwx1Ac.Method7560(string);
        if (string2 != null) return string2.substring(string2.indexOf("id") + ((int)1262440038L ^ 0x4B3F4E63), string2.lastIndexOf(((int)-1892431474L ^ 0x8F33C99F) << 1));
        return null;
    }

    public static String Method7560(String string) {
        byte[] byArray = DHzpocPNzjx2zpZIRy1vsm9XKKGwx1Ac.Method7561(string);
        if (byArray != null) return new String(byArray);
        return null;
    }

    public static byte[] Method7561(String string) {
        int n;
        URL uRL = new URL("https://api.mojang.com/users/profiles/minecraft/" + string);
        InputStream inputStream = uRL.openStream();
        byte[] byArray = new byte[((int)1882357293L ^ 0x70327E2C) << 10];
        int n2 = (int)((long)-1437937531 ^ (long)-1437937531);
        while ((n = inputStream.read(byArray)) >= 0) {
            n2 += n;
        }
        return null;
    }

    private static String Method7562(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)891078242L ^ 0x351CC662;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-140933004L ^ 0xF799888B);
            int n2 = ((int)-1685407275L ^ 0x9B8AB9E4) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1662380906L ^ 0x9CEA6AA9 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

