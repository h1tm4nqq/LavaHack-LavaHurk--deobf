/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.net.JarURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import lavahack.client.MqZrBH2iS4e6GpZryYkwhUrXj016iZjX;
import lavahack.client.StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa;
import lavahack.client.TJUzU8djRkpmOOK9KfS8S1jAAz1FSkru;

class S372dDvNZAXzJoTjdJflW0ZV4ssqoYfd
extends MqZrBH2iS4e6GpZryYkwhUrXj016iZjX {
    private final Class Field12433;
    private int Field12434;

    S372dDvNZAXzJoTjdJflW0ZV4ssqoYfd(ClassLoader classLoader, Class clazz, Set set) {
        super(classLoader, set);
        this.Field12433 = clazz;
    }

    @Override
    List Method2962(String string) {
        return this.Method4136(string, (boolean)((long)-1074942219 ^ (long)-1074942219));
    }

    @Override
    List Method2963(String string) {
        return this.Method4136(string, ((int)186668973L ^ 0xB2057AC) != 0);
    }

    private List Method4136(String string, boolean bl) {
        ArrayList arrayList = new ArrayList();
        TJUzU8djRkpmOOK9KfS8S1jAAz1FSkru tJUzU8djRkpmOOK9KfS8S1jAAz1FSkru = (TJUzU8djRkpmOOK9KfS8S1jAAz1FSkru)this.Method2967(string);
        if (tJUzU8djRkpmOOK9KfS8S1jAAz1FSkru == null) {
            return arrayList;
        }
        JarFile jarFile = tJUzU8djRkpmOOK9KfS8S1jAAz1FSkru.Method6502();
        if (jarFile == null) {
            return arrayList;
        }
        this.Method4137(string, jarFile, arrayList, bl);
        return arrayList;
    }

    private void Method4137(String string, JarFile jarFile, List list, boolean bl) {
        Enumeration<JarEntry> enumeration = jarFile.entries();
        while (enumeration.hasMoreElements()) {
            Object object;
            Object object2;
            Class<?> clazz;
            JarEntry jarEntry = enumeration.nextElement();
            if (jarEntry == null) return;
            String string2 = jarEntry.getName();
            if (!string2.endsWith(".class")) continue;
            string2 = string2.replace((char)((long)-396898008 ^ (long)-396898041), ((int)519397104L ^ 0x1EF55EE7) << 1).substring((int)((long)1269002789 ^ (long)1269002789), string2.length() - (((int)-105016941L ^ 0xF9BD9190) << 1));
            if (bl) {
                if (!string2.startsWith(string)) continue;
                clazz = Class.forName(string2);
                if (this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.contains(string2) || !this.Method2961((object2 = this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method3132(clazz)).getClass(), this.Field12433) || !this.Method2960(object = object2)) continue;
                list.add(object);
                continue;
            }
            if (!string2.startsWith(string) || string2.lastIndexOf((int)((long)952831753 ^ (long)952831774) << 1) > string.length()) continue;
            clazz = Class.forName(string2);
            if (this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.contains(string2) || !this.Method2961((object2 = this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method3132(clazz)).getClass(), this.Field12433) || !this.Method2960(object = object2)) continue;
            list.add(object);
        }
    }

    @Override
    StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa Method2964(Class clazz) {
        return this.Method2965(clazz.getName());
    }

    @Override
    StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa Method2965(String string) {
        Class.forName(string, (boolean)((long)106694005 ^ (long)106694005), this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        String string2 = this.Method2953(string);
        URL uRL = this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.getResource(string2);
        if (uRL == null) {
            return null;
        }
        JarURLConnection jarURLConnection = (JarURLConnection)uRL.openConnection();
        return this.Method2956(jarURLConnection);
    }

    @Override
    StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa Method2966(Package package_) {
        return this.Method2967(package_.getName());
    }

    @Override
    StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa Method2967(String string) {
        if (Package.getPackage(string) == null) {
            return null;
        }
        String string2 = this.Method2954(string);
        URL uRL = this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.getResource(string2);
        if (uRL == null) {
            return null;
        }
        JarURLConnection jarURLConnection = (JarURLConnection)uRL.openConnection();
        return this.Method2956(jarURLConnection);
    }

    @Override
    StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa Method2968(String string) {
        URL uRL = this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.getResource(string);
        if (uRL != null) return this.Method2957(string);
        return null;
    }

    private static String Method2969(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1459436229L ^ 0x56FD3AC5;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1616122620 ^ (long)1616122371);
            int n2 = ((int)-315599736L ^ 0xED3054C5) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1400921248 ^ (long)1400915223) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

