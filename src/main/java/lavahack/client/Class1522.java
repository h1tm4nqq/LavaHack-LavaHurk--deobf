/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lavahack.client.Class1528;
import lavahack.client.Class323;
import lavahack.client.Class996;

class Class1522
implements Class323 {
    private final Map Field15112 = new ConcurrentHashMap(128);
    private final Map Field15113 = new ConcurrentHashMap(256);
    private int Field15114;

    @Override
    public void Method1633(Class clazz) {
        this.Method6050(clazz, null);
    }

    @Override
    public void Method1634(Object object) {
        this.Method6050(object.getClass(), object);
    }

    private void Method6050(Class clazz, Object object) {
        Method[] methodArray = clazz.getDeclaredMethods();
        int n = methodArray.length;
        int n2 = 0;
        while (n2 < n) {
            Method method = methodArray[n2];
            Class1528 class1528 = new Class1528(method, object);
            Class996 class996 = Class996.Method4027(class1528);
            if (class996 != null) {
                List list = this.Field15112.computeIfAbsent(class996.Method4030(), Class1522::Method6054);
                list.add(class996);
                list.sort(Comparator.comparingInt(Class1522::Method6053));
                this.Field15113.put(class1528, class996);
            }
            ++n2;
        }
    }

    @Override
    public void Method1635(Class clazz) {
        this.Method6051(clazz, null);
    }

    @Override
    public void Method1636(Object object) {
        this.Method6051(object.getClass(), object);
    }

    private void Method6051(Class clazz, Object object) {
        Method[] methodArray = clazz.getDeclaredMethods();
        int n = methodArray.length;
        int n2 = 0;
        while (n2 < n) {
            Method method = methodArray[n2];
            Class1528 class1528 = new Class1528(method, object);
            Class996 class996 = (Class996)this.Field15113.get(class1528);
            if (class996 != null) {
                List list = this.Field15112.computeIfAbsent(class996.Method4030(), Class1522::Method6052);
                list.remove(class996);
                this.Field15113.remove(class1528);
            }
            ++n2;
        }
    }

    @Override
    public void Method1637(Object object) {
        List list = (List)this.Field15112.get(object.getClass());
        if (list == null) {
            return;
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Class996 class996 = (Class996)iterator.next();
            class996.Method4028(object);
        }
    }

    private static List Method6052(Class clazz) {
        return new ArrayList(64);
    }

    private static int Method6053(Class996 class996) {
        return class996.Method4032().Method6767();
    }

    private static List Method6054(Class clazz) {
        return new ArrayList(64);
    }
}

