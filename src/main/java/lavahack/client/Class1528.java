/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.lang.reflect.Method;

class Class1528 {
    private final Method Field15143;
    private final Object Field15144;
    private int Field15145;

    public Class1528(Method method, Object object) {
        this.Field15143 = method;
        this.Field15144 = object;
    }

    public Method Method6067() {
        return this.Field15143;
    }

    public Object Method6068() {
        return this.Field15144;
    }

    public boolean equals(Object object) {
        if (!(object instanceof Class1528)) {
            return false;
        }
        Class1528 class1528 = (Class1528)object;
        if (!this.Field15143.equals(class1528.Field15143)) return false;
        if (!this.Field15144.equals(class1528.Field15144)) return false;
        return true;
    }
}

