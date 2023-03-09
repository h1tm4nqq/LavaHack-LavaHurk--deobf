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
import lavahack.client.Class1655;
import lavahack.client.Class1695;
import lavahack.client.Class1807;

class Class1020
extends Class1807 {
    private final Class Field12433;
    private int Field12434;

    Class1020(ClassLoader classLoader, Class clazz, Set set) {
        super(classLoader, set);
        this.Field12433 = clazz;
    }

    @Override
    List Method2962(String string) {
        return this.Method4136(string, false);
    }

    @Override
    List Method2963(String string) {
        return this.Method4136(string, true);
    }

    private List Method4136(String string, boolean bl) {
        ArrayList arrayList = new ArrayList();
        Class1695 class1695 = (Class1695)this.Method2967(string);
        if (class1695 == null) {
            return arrayList;
        }
        JarFile jarFile = class1695.Method6502();
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
            string2 = string2.replace('/', '.').substring(0, string2.length() - 6);
            if (bl) {
                if (!string2.startsWith(string)) continue;
                clazz = Class.forName(string2);
                if (this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.contains(string2) || !this.Method2961((object2 = this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method3132(clazz)).getClass(), this.Field12433) || !this.Method2960(object = object2)) continue;
                list.add(object);
                continue;
            }
            if (!string2.startsWith(string) || string2.lastIndexOf(46) > string.length()) continue;
            clazz = Class.forName(string2);
            if (this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.contains(string2) || !this.Method2961((object2 = this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method3132(clazz)).getClass(), this.Field12433) || !this.Method2960(object = object2)) continue;
            list.add(object);
        }
    }

    @Override
    Class1655 Method2964(Class clazz) {
        return this.Method2965(clazz.getName());
    }

    @Override
    Class1655 Method2965(String string) {
        Class.forName(string, false, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        String string2 = this.Method2953(string);
        URL uRL = this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.getResource(string2);
        if (uRL == null) {
            return null;
        }
        JarURLConnection jarURLConnection = (JarURLConnection)uRL.openConnection();
        return this.Method2956(jarURLConnection);
    }

    @Override
    Class1655 Method2966(Package package_) {
        return this.Method2967(package_.getName());
    }

    @Override
    Class1655 Method2967(String string) {
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
    Class1655 Method2968(String string) {
        URL uRL = this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.getResource(string);
        if (uRL != null) return this.Method2957(string);
        return null;
    }

    private static String Method2969(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 154;
            cArray2[n] = (char)(cArray[n] ^ (0x19B7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

