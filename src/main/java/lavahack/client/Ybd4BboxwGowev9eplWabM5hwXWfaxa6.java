/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import lavahack.client.ANhbaYSNjMmqZReYoR2FyJK6sitGKrzK;
import lavahack.client.MqZrBH2iS4e6GpZryYkwhUrXj016iZjX;
import lavahack.client.StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa;

class Ybd4BboxwGowev9eplWabM5hwXWfaxa6
extends MqZrBH2iS4e6GpZryYkwhUrXj016iZjX {
    private final Class Field11024;
    private int Field11025;

    Ybd4BboxwGowev9eplWabM5hwXWfaxa6(ClassLoader classLoader, Class clazz, Set set) {
        super(classLoader, set);
        this.Field11024 = clazz;
    }

    @Override
    List Method2962(String string) {
        return this.Method2970(string, (boolean)((long)-46836741 ^ (long)-46836741));
    }

    @Override
    List Method2963(String string) {
        return this.Method2970(string, ((int)384578374L ^ 0x16EC3347) != 0);
    }

    private List Method2970(String string, boolean bl) {
        ArrayList arrayList = new ArrayList();
        ANhbaYSNjMmqZReYoR2FyJK6sitGKrzK aNhbaYSNjMmqZReYoR2FyJK6sitGKrzK = (ANhbaYSNjMmqZReYoR2FyJK6sitGKrzK)this.Method2967(string);
        this.Method2971(aNhbaYSNjMmqZReYoR2FyJK6sitGKrzK.Method3276(), string, arrayList, bl);
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
        int n2 = (int)((long)2093669974 ^ (long)2093669974);
        while (n2 < n) {
            String string2 = stringArray2[n2];
            File file2 = new File(file, string2);
            if (bl && file2.isDirectory()) {
                this.Method2971(file2, string + "." + string2, list, (boolean)((long)1480745403 ^ (long)1480745402));
            }
            if (string2.endsWith(".class")) {
                Object object;
                Object object2;
                String string3 = string + "." + string2.substring((int)((long)-1006925471 ^ (long)-1006925471), string2.length() - ((int)((long)983892738 ^ (long)983892737) << 1));
                Class<?> clazz = Class.forName(string3);
                if (!this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.contains(string3) && this.Method2961((object2 = this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method3132(clazz)).getClass(), this.Field11024) && this.Method2960(object = object2)) {
                    list.add(object);
                }
            }
            ++n2;
        }
    }

    @Override
    StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa Method2964(Class clazz) {
        return this.Method2965(clazz.getName());
    }

    @Override
    StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa Method2965(String string) {
        Class.forName(string, (boolean)((long)1032987110 ^ (long)1032987110), this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        String string2 = this.Method2953(string);
        URL uRL = this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.getResource(string2);
        if (uRL == null) {
            return null;
        }
        File file = new File(uRL.getPath());
        return this.Method2955(file);
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
        File file = new File(uRL.getPath());
        return this.Method2955(file);
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
        int n = (int)-610727063L ^ 0xDB990B69;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1624979383 ^ (long)-1624979274);
            int n2 = (int)976833045L ^ 0x3A394A3C;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1721760250 ^ (long)-1721752057) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

