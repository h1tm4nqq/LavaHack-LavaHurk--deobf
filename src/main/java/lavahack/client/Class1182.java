/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import lavahack.client.Class1135;
import lavahack.client.Class1393;
import lavahack.client.Class42;
import lavahack.client.Class44;

class Class1182 {
    private final Class42 Field13364;
    private final ArrayList Field13365;
    private int Field13366;

    public Class1182(Class42 class42, ArrayList arrayList) {
        this.Field13364 = class42;
        this.Field13365 = arrayList;
    }

    public void Method4764(String string, String[] stringArray) {
    }

    public void Method4765(String string, String[] stringArray) {
        Iterator iterator = this.Field13365.iterator();
        while (iterator.hasNext()) {
            Class44 class44 = (Class44)iterator.next();
            Class1135 class1135 = Class1135.valueOf(class44.Field8087.toUpperCase());
            Class1393.Method5506().Method1882((String)class1135.Method4629().Method1726(new Object[0]));
        }
    }
}

