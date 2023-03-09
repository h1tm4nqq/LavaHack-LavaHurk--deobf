/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1544;
import lavahack.client.Class1545;
import lavahack.client.Class269;
import lavahack.client.Class424;
import lavahack.client.Class584;
import lavahack.client.Class798;

public abstract class Class1505 {
    private final Class[] Field15052;
    private Class798 Field15053;
    private String Field15054 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1505(Class ... classArray) {
        this.Field15052 = classArray;
    }

    public Class798 Method3848() {
        return this.Field15053;
    }

    public void Method3849(Class798 class798) {
        this.Field15053 = class798;
    }

    protected abstract Object Method3850(Class424 var1);

    public final Object Method3851(Object ... objectArray) {
        Class424 class424 = this.Field15053.Method3313(objectArray, this.Field15052);
        return this.Method3850(class424);
    }

    public static Class269 Method3852(Class clazz, Class ... classArray) {
        return new Class269(classArray);
    }

    public static Class269 Method3853(Class ... classArray) {
        return new Class269(classArray);
    }

    public static Class1505 Method3854(Class clazz, Object object) {
        return new Class1545(new Class[0], object);
    }

    public static Class1505 Method3855(Class clazz, Class584 class584) {
        return new Class1544(new Class[0], class584);
    }
}

