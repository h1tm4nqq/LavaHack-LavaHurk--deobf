/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.File;
import java.net.JarURLConnection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import lavahack.client.ANhbaYSNjMmqZReYoR2FyJK6sitGKrzK;
import lavahack.client.StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa;
import lavahack.client.TJUzU8djRkpmOOK9KfS8S1jAAz1FSkru;
import lavahack.client.wtFAtdZe2hwas5EH21Dva0ZvGLD8qnDG;
import lavahack.client.yKvp82BZOdHqQCAzFKP5SmgMdGOqNxul;

abstract class MqZrBH2iS4e6GpZryYkwhUrXj016iZjX {
    final Set Field16315;
    ClassLoader Field16316;
    Predicate[] Field16317;
    wtFAtdZe2hwas5EH21Dva0ZvGLD8qnDG Field16318;
    private String Field16319 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    MqZrBH2iS4e6GpZryYkwhUrXj016iZjX(ClassLoader classLoader, Set set) {
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
        return string.replace(((int)2111515851L ^ 0x7DDB2CDC) << 1, (char)((long)-806406004 ^ (long)-806405981)) + ".class";
    }

    String Method2954(String string) {
        return string.replace(((int)-1698916480L ^ 0x9ABC9797) << 1, (char)((long)-384284203 ^ (long)-384284166));
    }

    ANhbaYSNjMmqZReYoR2FyJK6sitGKrzK Method2955(File file) {
        return new ANhbaYSNjMmqZReYoR2FyJK6sitGKrzK(file, this.Field16316);
    }

    TJUzU8djRkpmOOK9KfS8S1jAAz1FSkru Method2956(JarURLConnection jarURLConnection) {
        return new TJUzU8djRkpmOOK9KfS8S1jAAz1FSkru(jarURLConnection, this.Field16316);
    }

    yKvp82BZOdHqQCAzFKP5SmgMdGOqNxul Method2957(String string) {
        return new yKvp82BZOdHqQCAzFKP5SmgMdGOqNxul(string, this.Field16316);
    }

    MqZrBH2iS4e6GpZryYkwhUrXj016iZjX Method2958(Predicate[] predicateArray) {
        this.Field16317 = predicateArray;
        return this;
    }

    MqZrBH2iS4e6GpZryYkwhUrXj016iZjX Method2959(wtFAtdZe2hwas5EH21Dva0ZvGLD8qnDG wtFAtdZe2hwas5EH21Dva0ZvGLD8qnDG2) {
        this.Field16318 = wtFAtdZe2hwas5EH21Dva0ZvGLD8qnDG2;
        return this;
    }

    boolean Method2960(Object object) {
        if (this.Field16317.length < ((int)555909413L ^ 0x21228124)) {
            return ((int)273157592L ^ 0x10480DD9) != 0;
        }
        Predicate[] predicateArray = this.Field16317;
        int n = predicateArray.length;
        int n2 = (int)((long)-1616082880 ^ (long)-1616082880);
        while (n2 < n) {
            Predicate predicate = predicateArray[n2];
            if (!predicate.test(object)) {
                return ((int)-772845504L ^ 0xD1EF5040) != 0;
            }
            ++n2;
        }
        return (int)((long)-929687284 ^ (long)-929687283) != 0;
    }

    boolean Method2961(Class clazz, Class clazz2) {
        return clazz2.isAssignableFrom(clazz);
    }

    abstract List Method2962(String var1);

    abstract List Method2963(String var1);

    abstract StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa Method2964(Class var1);

    abstract StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa Method2965(String var1);

    abstract StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa Method2966(Package var1);

    abstract StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa Method2967(String var1);

    abstract StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa Method2968(String var1);

    private static String Method2969(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-608523196L ^ 0xDBBAAC44;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)377047010 ^ (long)377046813);
            int n2 = (int)((long)1810870020 ^ (long)1810870235);
            cArray2[n] = (char)(cArray[n] ^ (((int)-1595048986L ^ 0xA0ED5185) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

