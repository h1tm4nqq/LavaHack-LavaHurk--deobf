/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import lavahack.client.Class1655;
import lavahack.client.Class1807;
import lavahack.client.Class787;

class Class710
extends Class1807 {
    private final Class Field11024;
    private int Field11025;

    Class710(ClassLoader classLoader, Class clazz, Set set) {
        super(classLoader, set);
        this.Field11024 = clazz;
    }

    @Override
    List Method2962(String string) {
        return this.Method2970(string, false);
    }

    @Override
    List Method2963(String string) {
        return this.Method2970(string, true);
    }

    private List Method2970(String string, boolean bl) {
        ArrayList arrayList = new ArrayList();
        Class787 class787 = (Class787)this.Method2967(string);
        this.Method2971(class787.Method3276(), string, arrayList, bl);
        return arrayList;
    }

    private void Method2971(File file, String string, List list, boolean bl) {
        if (!file.exists()) return;
        if (!file.isDirectory()) {
            return;
        }
        String[] stringArray = file.list();
        if (stringArray == null) {
            return;
        }
        String[] stringArray2 = stringArray;
        int n = stringArray2.length;
        int n2 = 0;
        while (n2 < n) {
            String string2 = stringArray2[n2];
            File file2 = new File(file, string2);
            if (bl && file2.isDirectory()) {
                this.Method2971(file2, string + "." + string2, list, true);
            }
            if (string2.endsWith(".class")) {
                Object object;
                Object object2;
                String string3 = string + "." + string2.substring(0, string2.length() - 6);
                Class<?> clazz = Class.forName(string3);
                if (!this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.contains(string3) && this.Method2961((object2 = this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method3132(clazz)).getClass(), this.Field11024) && this.Method2960(object = object2)) {
                    list.add(object);
                }
            }
            ++n2;
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
        File file = new File(uRL.getPath());
        return this.Method2955(file);
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
        File file = new File(uRL.getPath());
        return this.Method2955(file);
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
            int n2 = 41;
            cArray2[n] = (char)(cArray[n] ^ (0x2001 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

