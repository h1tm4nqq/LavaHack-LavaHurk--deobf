/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import lavahack.client.Class1020;
import lavahack.client.Class1638;
import lavahack.client.Class1655;
import lavahack.client.Class1807;
import lavahack.client.Class710;
import lavahack.client.Class750;
import lavahack.client.Class969;

public final class Class63 {
    private final Set Field8210;
    private ClassLoader Field8211;
    private final Class Field8212;
    private Predicate[] Field8213;
    private Class750 Field8214;
    private String Field8215 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class63(Class clazz) {
        this.Field8211 = Thread.currentThread().getContextClassLoader();
        this.Field8212 = clazz;
        this.Field8210 = new HashSet(32);
        this.Field8213 = new Predicate[0];
        this.Field8214 = Class750.Method3133();
    }

    public Class63(Class clazz, ClassLoader classLoader) {
        this.Field8211 = classLoader;
        this.Field8212 = clazz;
        this.Field8210 = new HashSet(32);
        this.Field8213 = new Predicate[0];
        this.Field8214 = Class750.Method3133();
    }

    @Class1638
    @Class1638
    public Class63(ClassLoader classLoader, Object ... objectArray) {
        this.Field8211 = classLoader;
        this.Field8212 = objectArray.getClass().getComponentType();
        this.Field8210 = new HashSet(32);
        this.Field8213 = new Predicate[0];
        this.Field8214 = Class750.Method3133();
    }

    @Class1638
    @Class1638
    public Class63(Object ... objectArray) {
        this.Field8211 = Thread.currentThread().getContextClassLoader();
        this.Field8212 = objectArray.getClass().getComponentType();
        this.Field8210 = new HashSet(32);
        this.Field8213 = new Predicate[0];
        this.Field8214 = Class750.Method3133();
    }

    Class1807 Method600(URL uRL) {
        if (uRL == null) {
            return new Class969(this.Field8211);
        }
        String string = uRL.getProtocol();
        if (string.equals("file")) {
            return new Class710(this.Field8211, this.Field8212, this.Field8210);
        }
        if (!string.equals("jar")) return new Class969(this.Field8211);
        return new Class1020(this.Field8211, this.Field8212, this.Field8210);
    }

    Class1807 Method601(String string) {
        String string2 = string.replace('.', '/');
        return this.Method600(this.Field8211.getResource(string2));
    }

    Class1807 Method602(String string) {
        String string2 = string.replace('.', '/') + ".class";
        return this.Method600(this.Field8211.getResource(string2));
    }

    Class1807 Method603(String string) {
        return this.Method600(this.Field8211.getResource(string));
    }

    private boolean Method604(String string) {
        Class.forName(string, false, this.Field8211);
        return true;
    }

    public ClassLoader Method605() {
        return this.Field8211;
    }

    public ClassLoader Method606(ClassLoader classLoader) {
        this.Field8211 = classLoader != null ? classLoader : Thread.currentThread().getContextClassLoader();
        return this.Field8211;
    }

    public void Method607(Class750 class750) {
        this.Field8214 = class750;
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

    public Class1655 Method617(Class clazz) {
        return this.Method602(clazz.getName()).Method2964(clazz);
    }

    public Class1655 Method618(String string) {
        return this.Method602(string).Method2965(string);
    }

    public Class1655 Method619(Package package_) {
        return this.Method601(package_.getName()).Method2966(package_);
    }

    public Class1655 Method620(String string) {
        return this.Method601(string).Method2967(string);
    }

    public Class1655 Method621(String string) {
        return this.Method603(string).Method2968(string);
    }

    private static String Method622(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 61;
            cArray2[n] = (char)(cArray[n] ^ (0x5A07 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

