/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.File;
import java.net.JarURLConnection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import lavahack.client.Class1655;
import lavahack.client.Class1695;
import lavahack.client.Class18;
import lavahack.client.Class750;
import lavahack.client.Class787;

abstract class Class1807 {
    final Set Field16315;
    ClassLoader Field16316;
    Predicate[] Field16317;
    Class750 Field16318;
    private String Field16319 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    Class1807(ClassLoader classLoader, Set set) {
        this.Field16316 = classLoader != null ? classLoader : this.Method2952();
        this.Field16315 = set;
    }

    final ClassLoader Method2950() {
        return this.Field16316;
    }

    final void Method2951(ClassLoader classLoader) {
        this.Field16316 = classLoader != null ? classLoader : this.Method2952();
    }

    ClassLoader Method2952() {
        return Thread.currentThread().getContextClassLoader();
    }

    String Method2953(String string) {
        return string.replace('.', '/') + ".class";
    }

    String Method2954(String string) {
        return string.replace('.', '/');
    }

    Class787 Method2955(File file) {
        return new Class787(file, this.Field16316);
    }

    Class1695 Method2956(JarURLConnection jarURLConnection) {
        return new Class1695(jarURLConnection, this.Field16316);
    }

    Class18 Method2957(String string) {
        return new Class18(string, this.Field16316);
    }

    Class1807 Method2958(Predicate[] predicateArray) {
        this.Field16317 = predicateArray;
        return this;
    }

    Class1807 Method2959(Class750 class750) {
        this.Field16318 = class750;
        return this;
    }

    boolean Method2960(Object object) {
        if (this.Field16317.length < 1) {
            return true;
        }
        Predicate[] predicateArray = this.Field16317;
        int n = predicateArray.length;
        int n2 = 0;
        while (n2 < n) {
            Predicate predicate = predicateArray[n2];
            if (!predicate.test(object)) {
                return false;
            }
            ++n2;
        }
        return true;
    }

    boolean Method2961(Class clazz, Class clazz2) {
        return clazz2.isAssignableFrom(clazz);
    }

    abstract List Method2962(String var1);

    abstract List Method2963(String var1);

    abstract Class1655 Method2964(Class var1);

    abstract Class1655 Method2965(String var1);

    abstract Class1655 Method2966(Package var1);

    abstract Class1655 Method2967(String var1);

    abstract Class1655 Method2968(String var1);

    private static String Method2969(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 223;
            cArray2[n] = (char)(cArray[n] ^ (0x54C6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

