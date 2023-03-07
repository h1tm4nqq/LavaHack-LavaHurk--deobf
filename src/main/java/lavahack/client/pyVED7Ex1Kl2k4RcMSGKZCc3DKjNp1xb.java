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
import lavahack.client.dsGGdHDauaEpIGTENBJZHKgBhLIqd0D5;
import lavahack.client.jiy8wUCfYQGiqw6XfKTNjKakoNWVurIR;
import lavahack.client.xVtO7HyZkwHev7HwfED14nmq9YELnK87;

class pyVED7Ex1Kl2k4RcMSGKZCc3DKjNp1xb
implements xVtO7HyZkwHev7HwfED14nmq9YELnK87 {
    private final Map Field15112 = new ConcurrentHashMap(((int)-1213413164L ^ 0xB7ACC8D5) << 7);
    private final Map Field15113 = new ConcurrentHashMap((int)((long)-691794844 ^ (long)-691794843) << 8);
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
        int n2 = (int)((long)-490401775 ^ (long)-490401775);
        while (n2 < n) {
            Method method = methodArray[n2];
            dsGGdHDauaEpIGTENBJZHKgBhLIqd0D5 dsGGdHDauaEpIGTENBJZHKgBhLIqd0D52 = new dsGGdHDauaEpIGTENBJZHKgBhLIqd0D5(method, object);
            jiy8wUCfYQGiqw6XfKTNjKakoNWVurIR jiy8wUCfYQGiqw6XfKTNjKakoNWVurIR2 = jiy8wUCfYQGiqw6XfKTNjKakoNWVurIR.Method4027(dsGGdHDauaEpIGTENBJZHKgBhLIqd0D52);
            if (jiy8wUCfYQGiqw6XfKTNjKakoNWVurIR2 != null) {
                List list = this.Field15112.computeIfAbsent(jiy8wUCfYQGiqw6XfKTNjKakoNWVurIR2.Method4030(), pyVED7Ex1Kl2k4RcMSGKZCc3DKjNp1xb::Method6054);
                list.add(jiy8wUCfYQGiqw6XfKTNjKakoNWVurIR2);
                list.sort(Comparator.comparingInt(pyVED7Ex1Kl2k4RcMSGKZCc3DKjNp1xb::Method6053));
                this.Field15113.put(dsGGdHDauaEpIGTENBJZHKgBhLIqd0D52, jiy8wUCfYQGiqw6XfKTNjKakoNWVurIR2);
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
        int n2 = (int)-552856954L ^ 0xDF0C1286;
        while (n2 < n) {
            Method method = methodArray[n2];
            dsGGdHDauaEpIGTENBJZHKgBhLIqd0D5 dsGGdHDauaEpIGTENBJZHKgBhLIqd0D52 = new dsGGdHDauaEpIGTENBJZHKgBhLIqd0D5(method, object);
            jiy8wUCfYQGiqw6XfKTNjKakoNWVurIR jiy8wUCfYQGiqw6XfKTNjKakoNWVurIR2 = (jiy8wUCfYQGiqw6XfKTNjKakoNWVurIR)this.Field15113.get(dsGGdHDauaEpIGTENBJZHKgBhLIqd0D52);
            if (jiy8wUCfYQGiqw6XfKTNjKakoNWVurIR2 != null) {
                List list = this.Field15112.computeIfAbsent(jiy8wUCfYQGiqw6XfKTNjKakoNWVurIR2.Method4030(), pyVED7Ex1Kl2k4RcMSGKZCc3DKjNp1xb::Method6052);
                list.remove(jiy8wUCfYQGiqw6XfKTNjKakoNWVurIR2);
                this.Field15113.remove(dsGGdHDauaEpIGTENBJZHKgBhLIqd0D52);
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
            jiy8wUCfYQGiqw6XfKTNjKakoNWVurIR jiy8wUCfYQGiqw6XfKTNjKakoNWVurIR2 = (jiy8wUCfYQGiqw6XfKTNjKakoNWVurIR)iterator.next();
            jiy8wUCfYQGiqw6XfKTNjKakoNWVurIR2.Method4028(object);
        }
    }

    private static List Method6052(Class clazz) {
        return new ArrayList(((int)-1987586895L ^ 0x8987D4B0) << 6);
    }

    private static int Method6053(jiy8wUCfYQGiqw6XfKTNjKakoNWVurIR jiy8wUCfYQGiqw6XfKTNjKakoNWVurIR2) {
        return jiy8wUCfYQGiqw6XfKTNjKakoNWVurIR2.Method4032().Method6767();
    }

    private static List Method6054(Class clazz) {
        return new ArrayList((int)((long)-468971464 ^ (long)-468971463) << 6);
    }
}

