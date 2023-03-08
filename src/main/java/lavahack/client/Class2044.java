//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.net.*;
import java.util.*;
import com.mojang.authlib.*;
import java.io.*;

public class Class2044
{
    public static final String Field17381;
    public static final URL Field17382;
    private String Field17383 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static Class1725 Method7553(final String s) {
        return Method7554(s, true);
    }
    
    public static Class1725 Method7554(final String s, final boolean b) {
        final String method7560 = Method7560(s);
        if (method7560 == null) {
            return null;
        }
        return new Class1725(b ? method7560.substring(method7560.indexOf(58) + 2, method7560.indexOf("id") - 3) : s, UUID.fromString(method7560.substring(method7560.indexOf("id") + 5, method7560.lastIndexOf(34))));
    }
    
    public static GameProfile Method7555(final String s) {
        return Method7556(s, true);
    }
    
    public static GameProfile Method7556(final String s, final boolean b) {
        final String method7560 = Method7560(s);
        if (method7560 == null) {
            return null;
        }
        return new GameProfile(UUID.fromString(method7560.substring(method7560.indexOf("id") + 5, method7560.lastIndexOf(34))), b ? method7560.substring(method7560.indexOf(58) + 2, method7560.indexOf("id") - 3) : s);
    }
    
    public static UUID Method7557(final String s) {
        final String method7559 = Method7559(s);
        if (method7559 == null) {
            return null;
        }
        return UUID.fromString(method7559);
    }
    
    public static String Method7558(final String s) {
        final String method7560 = Method7560(s);
        if (method7560 == null) {
            return null;
        }
        return method7560.substring(method7560.indexOf(58) + 2, method7560.indexOf("id") - 3);
    }
    
    public static String Method7559(final String s) {
        final String method7560 = Method7560(s);
        if (method7560 == null) {
            return null;
        }
        return method7560.substring(method7560.indexOf("id") + 5, method7560.lastIndexOf(34));
    }
    
    public static String Method7560(final String s) {
        final byte[] method7561 = Method7561(s);
        if (method7561 == null) {
            return null;
        }
        return new String(method7561);
    }
    
    public static byte[] Method7561(final String str) {
        final InputStream openStream = new URL("https://api.mojang.com/users/profiles/minecraft/" + str).openStream();
        final byte[] b = new byte[1024];
        int n = 0;
        int read;
        while ((read = openStream.read(b)) >= 0) {
            n += read;
        }
        return null;
    }
    
    static {
        Field17381 = "https://api.mojang.com/users/profiles/minecraft/";
        Field17382 = new URL("https://api.mojang.com/users/profiles/minecraft/");
    }
    
    private static String Method7562(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7E3F ^ 0xC4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
