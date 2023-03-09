/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1820;
import lavahack.client.Class1822;
import lavahack.client.Class2021;
import lavahack.client.Class2124;
import lavahack.client.Class424;
import lavahack.client.Class735;

public abstract class Class1763 {
    private final Class[] Field16063;
    private String Field16064 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1763(Class ... classArray) {
        this.Field16063 = classArray;
    }

    protected abstract Object Method1725(Class424 var1);

    public final Object Method1726(Object ... objectArray) {
        Class2021 class2021 = new Class2021(objectArray, this.Field16063);
        return this.Method1725(class2021);
    }

    public static Class2124 Method1727(Class clazz, Class ... classArray) {
        return new Class2124(classArray);
    }

    public static Class2124 Method1728(Class ... classArray) {
        return new Class2124(classArray);
    }

    public static Class1763 Method1729(Class clazz, Object object) {
        return new Class1820(new Class[0], object);
    }

    public static Class1763 Method1730(Class clazz, Class735 class735) {
        return new Class1822(new Class[0], class735);
    }
}

