/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import lavahack.client.Class750;

public class Class1760
implements Class750 {
    private String Field16056 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public Object Method3132(Class clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor constructor = clazz.getDeclaredConstructor(new Class[0]);
        if (constructor.isAccessible()) return constructor.newInstance(new Object[0]);
        constructor.setAccessible(true);
        return constructor.newInstance(new Object[0]);
    }
}

