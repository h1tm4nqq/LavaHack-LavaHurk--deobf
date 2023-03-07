/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import lavahack.client.FYguNf8GXiROcl60qOTVxJfS9gqPHoxw;
import lavahack.client.MqZrBH2iS4e6GpZryYkwhUrXj016iZjX;
import lavahack.client.S372dDvNZAXzJoTjdJflW0ZV4ssqoYfd;
import lavahack.client.StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa;
import lavahack.client.Ybd4BboxwGowev9eplWabM5hwXWfaxa6;
import lavahack.client.k8x0OekqicywRnf5rXzCHwvBIpQWtk9G;
import lavahack.client.wtFAtdZe2hwas5EH21Dva0ZvGLD8qnDG;

public final class Mfn6q4CSghImbSHHc8QWwi8xpUP1CObE {
    private final Set Field8210;
    private ClassLoader Field8211;
    private final Class Field8212;
    private Predicate[] Field8213;
    private wtFAtdZe2hwas5EH21Dva0ZvGLD8qnDG Field8214;
    private String Field8215 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Mfn6q4CSghImbSHHc8QWwi8xpUP1CObE(Class clazz) {
        this.Field8211 = Thread.currentThread().getContextClassLoader();
        this.Field8212 = clazz;
        this.Field8210 = new HashSet((int)((long)1042947173 ^ (long)1042947172) << 5);
        this.Field8213 = new Predicate[(int)1452922110L ^ 0x5699D4FE];
        this.Field8214 = wtFAtdZe2hwas5EH21Dva0ZvGLD8qnDG.Method3133();
    }

    public Mfn6q4CSghImbSHHc8QWwi8xpUP1CObE(Class clazz, ClassLoader classLoader) {
        this.Field8211 = classLoader;
        this.Field8212 = clazz;
        this.Field8210 = new HashSet((int)((long)-451395768 ^ (long)-451395767) << 5);
        this.Field8213 = new Predicate[(int)((long)-166197275 ^ (long)-166197275)];
        this.Field8214 = wtFAtdZe2hwas5EH21Dva0ZvGLD8qnDG.Method3133();
    }

    @FYguNf8GXiROcl60qOTVxJfS9gqPHoxw
    @FYguNf8GXiROcl60qOTVxJfS9gqPHoxw
    public Mfn6q4CSghImbSHHc8QWwi8xpUP1CObE(ClassLoader classLoader, Object ... objectArray) {
        this.Field8211 = classLoader;
        this.Field8212 = objectArray.getClass().getComponentType();
        this.Field8210 = new HashSet((int)((long)-1149010852 ^ (long)-1149010851) << 5);
        this.Field8213 = new Predicate[(int)((long)-1376745093 ^ (long)-1376745093)];
        this.Field8214 = wtFAtdZe2hwas5EH21Dva0ZvGLD8qnDG.Method3133();
    }

    @FYguNf8GXiROcl60qOTVxJfS9gqPHoxw
    @FYguNf8GXiROcl60qOTVxJfS9gqPHoxw
    public Mfn6q4CSghImbSHHc8QWwi8xpUP1CObE(Object ... objectArray) {
        this.Field8211 = Thread.currentThread().getContextClassLoader();
        this.Field8212 = objectArray.getClass().getComponentType();
        this.Field8210 = new HashSet((int)((long)1338802763 ^ (long)1338802762) << 5);
        this.Field8213 = new Predicate[(int)((long)1087337178 ^ (long)1087337178)];
        this.Field8214 = wtFAtdZe2hwas5EH21Dva0ZvGLD8qnDG.Method3133();
    }

    MqZrBH2iS4e6GpZryYkwhUrXj016iZjX Method600(URL uRL) {
        if (uRL == null) {
            return new k8x0OekqicywRnf5rXzCHwvBIpQWtk9G(this.Field8211);
        }
        String string = uRL.getProtocol();
        if (string.equals("file")) {
            return new Ybd4BboxwGowev9eplWabM5hwXWfaxa6(this.Field8211, this.Field8212, this.Field8210);
        }
        if (!string.equals("jar")) return new k8x0OekqicywRnf5rXzCHwvBIpQWtk9G(this.Field8211);
        return new S372dDvNZAXzJoTjdJflW0ZV4ssqoYfd(this.Field8211, this.Field8212, this.Field8210);
    }

    MqZrBH2iS4e6GpZryYkwhUrXj016iZjX Method601(String string) {
        String string2 = string.replace((int)((long)1404011510 ^ (long)1404011489) << 1, (char)((int)-1939807348L ^ 0x8C60E3A3));
        return this.Method600(this.Field8211.getResource(string2));
    }

    MqZrBH2iS4e6GpZryYkwhUrXj016iZjX Method602(String string) {
        String string2 = string.replace((int)((long)-823525315 ^ (long)-823525334) << 1, (char)((long)15460930 ^ (long)15460973)) + ".class";
        return this.Method600(this.Field8211.getResource(string2));
    }

    MqZrBH2iS4e6GpZryYkwhUrXj016iZjX Method603(String string) {
        return this.Method600(this.Field8211.getResource(string));
    }

    private boolean Method604(String string) {
        Class.forName(string, (boolean)((long)1446755400 ^ (long)1446755400), this.Field8211);
        return ((int)447970113L ^ 0x1AB37B40) != 0;
    }

    public ClassLoader Method605() {
        return this.Field8211;
    }

    public ClassLoader Method606(ClassLoader classLoader) {
        this.Field8211 = classLoader != null ? classLoader : Thread.currentThread().getContextClassLoader();
        return this.Field8211;
    }

    public void Method607(wtFAtdZe2hwas5EH21Dva0ZvGLD8qnDG wtFAtdZe2hwas5EH21Dva0ZvGLD8qnDG2) {
        this.Field8214 = wtFAtdZe2hwas5EH21Dva0ZvGLD8qnDG2;
    }

    @SafeVarargs
    @SafeVarargs
    public final void Method608(Predicate ... predicateArray) {
        this.Field8213 = predicateArray;
    }

    public List Method609(String string) {
        return this.Method601(string).Method2958(this.Field8213).Method2959(this.Field8214).Method2962(string);
    }

    public List Method610(String string) {
        return this.Method601(string).Method2958(this.Field8213).Method2959(this.Field8214).Method2963(string);
    }

    public Object Method611(Class clazz) {
        Object object = this.Field8214.Method3132(clazz);
        if (!this.Field8212.isAssignableFrom(object.getClass())) return null;
        return object;
    }

    public Object Method612(String string) {
        Class<?> clazz = Class.forName(string);
        Object object = this.Field8214.Method3132(clazz);
        if (!this.Field8212.isAssignableFrom(object.getClass())) return null;
        return object;
    }

    public void Method613(Class clazz) {
        this.Field8210.add(clazz.getName());
    }

    public void Method614(String string) {
        if (!this.Method604(string)) {
            return;
        }
        this.Field8210.add(string);
    }

    public void Method615(Class clazz) {
        this.Field8210.remove(clazz.getName());
    }

    public void Method616(String string) {
        if (!this.Method604(string)) {
            return;
        }
        this.Field8210.remove(string);
    }

    public StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa Method617(Class clazz) {
        return this.Method602(clazz.getName()).Method2964(clazz);
    }

    public StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa Method618(String string) {
        return this.Method602(string).Method2965(string);
    }

    public StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa Method619(Package package_) {
        return this.Method601(package_.getName()).Method2966(package_);
    }

    public StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa Method620(String string) {
        return this.Method601(string).Method2967(string);
    }

    public StWg9DMLBtG2qkcUTAl0bfujXMjb7JIa Method621(String string) {
        return this.Method603(string).Method2968(string);
    }

    private static String Method622(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-723263261 ^ (long)-723263261);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-896390619 ^ (long)-896390438);
            int n2 = (int)((long)-523571175 ^ (long)-523571164);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1305479491 ^ (long)-1305498438) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

