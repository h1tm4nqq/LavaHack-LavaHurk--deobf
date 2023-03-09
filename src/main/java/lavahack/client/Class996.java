/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.lang.reflect.Method;
import lavahack.client.Class1528;
import lavahack.client.Class1786;

class Class996 {
    private final Method Field12283;
    private final Class Field12284;
    private final Class Field12285;
    private final Object Field12286;
    private final Class1786 Field12287;
    private String Field12288 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Class996(Method method, Object object, Class1786 class1786) {
        method.setAccessible(true);
        Class<?>[] classArray = method.getParameterTypes();
        this.Field12283 = method;
        this.Field12284 = method.getDeclaringClass();
        this.Field12285 = classArray[0];
        this.Field12286 = object;
        this.Field12287 = class1786;
    }

    public static Class996 Method4027(Class1528 class1528) {
        Method method = class1528.Method6067();
        Object object = class1528.Method6068();
        if (Class996.Method4033(method)) return new Class996(method, object, method.getAnnotation(Class1786.class));
        return null;
    }

    public void Method4028(Object object) {
        this.Field12283.invoke(this.Field12286, object);
    }

    public Class Method4029() {
        return this.Field12284;
    }

    public Class Method4030() {
        return this.Field12285;
    }

    public Object Method4031() {
        return this.Field12286;
    }

    public Class1786 Method4032() {
        return this.Field12287;
    }

    public static boolean Method4033(Method method) {
        Class<?>[] classArray = method.getParameterTypes();
        if (classArray.length != 1) return false;
        if (method.getAnnotation(Class1786.class) == null) return false;
        return true;
    }
}

