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
import lavahack.client.Class1725;

public class Class2044 {
    public static final String Field17381 = "https://api.mojang.com/users/profiles/minecraft/";
    public static final URL Field17382 = new URL("https://api.mojang.com/users/profiles/minecraft/");
    private String Field17383 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static Class1725 Method7553(String string) {
        return Class2044.Method7554(string, true);
    }

    public static Class1725 Method7554(String string, boolean bl) {
        String string2 = Class2044.Method7560(string);
        if (string2 == null) {
            return null;
        }
        String string3 = bl ? string2.substring(string2.indexOf(58) + 2, string2.indexOf("id") - 3) : string;
        String string4 = string2.substring(string2.indexOf("id") + 5, string2.lastIndexOf(34));
        UUID uUID = UUID.fromString(string4);
        return new Class1725(string3, uUID);
    }

    public static GameProfile Method7555(String string) {
        return Class2044.Method7556(string, true);
    }

    public static GameProfile Method7556(String string, boolean bl) {
        String string2 = Class2044.Method7560(string);
        if (string2 == null) {
            return null;
        }
        String string3 = bl ? string2.substring(string2.indexOf(58) + 2, string2.indexOf("id") - 3) : string;
        String string4 = string2.substring(string2.indexOf("id") + 5, string2.lastIndexOf(34));
        UUID uUID = UUID.fromString(string4);
        return new GameProfile(uUID, string3);
    }

    public static UUID Method7557(String string) {
        String string2 = Class2044.Method7559(string);
        if (string2 != null) return UUID.fromString(string2);
        return null;
    }

    public static String Method7558(String string) {
        String string2 = Class2044.Method7560(string);
        if (string2 != null) return string2.substring(string2.indexOf(58) + 2, string2.indexOf("id") - 3);
        return null;
    }

    public static String Method7559(String string) {
        String string2 = Class2044.Method7560(string);
        if (string2 != null) return string2.substring(string2.indexOf("id") + 5, string2.lastIndexOf(34));
        return null;
    }

    public static String Method7560(String string) {
        byte[] byArray = Class2044.Method7561(string);
        if (byArray != null) return new String(byArray);
        return null;
    }

    public static byte[] Method7561(String string) {
        int n;
        URL uRL = new URL("https://api.mojang.com/users/profiles/minecraft/" + string);
        InputStream inputStream = uRL.openStream();
        byte[] byArray = new byte[1024];
        int n2 = 0;
        while ((n = inputStream.read(byArray)) >= 0) {
            n2 += n;
        }
        return null;
    }

    private static String Method7562(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 196;
            cArray2[n] = (char)(cArray[n] ^ (0x7E3F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

