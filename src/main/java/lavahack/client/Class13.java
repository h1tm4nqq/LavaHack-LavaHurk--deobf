/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lavahack.client.Class1514;
import lavahack.client.Class1834;
import lavahack.client.Class1997;

public class Class13
implements Class1997 {
    private static final int Field7878;
    private static final int Field7879;
    private int Field7880;
    private int Field7881;
    private String Field7882 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class13(int n, int n2) {
        this.Field7880 = n;
        this.Field7881 = n2;
    }

    public Class13() {
        this(7, 7);
    }

    public int Method151() {
        return this.Field7880;
    }

    public void Method152(int n) {
        this.Field7880 = n;
    }

    public int Method153() {
        return this.Field7881;
    }

    public void Method154(int n) {
        this.Field7881 = n;
    }

    @Override
    public int[] Method149(List list, int n) {
        int n2 = -1;
        int n3 = -1;
        int n4 = this.Field7880;
        int n5 = this.Field7881;
        int n6 = -1;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Class1514 class1514 = (Class1514)iterator.next();
            int n7 = n4 + class1514.Method675() + this.Field7880;
            if (n7 > n) {
                n5 += n6;
                n6 = -1;
                n4 = this.Field7880;
                n7 = n4 + class1514.Method675() + this.Field7880;
            }
            if (class1514.Method677() + this.Field7881 > n6) {
                n6 = class1514.Method677() + this.Field7881;
            }
            n2 = Math.max(n2, n7);
            n3 = Math.max(n3, n5 + class1514.Method677() + this.Field7881);
            n4 = n7;
        }
        return new int[]{n2, n3};
    }

    @Override
    public Class1834 Method150(List list, int n, int n2) {
        HashMap<Class1514, int[]> hashMap = new HashMap<Class1514, int[]>();
        int n3 = this.Field7880;
        int n4 = this.Field7881;
        int n5 = -1;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Class1514 class1514 = (Class1514)iterator.next();
            int n6 = n3 + class1514.Method675() + this.Field7880;
            if (n6 > n) {
                n4 += n5;
                n5 = -1;
                n3 = this.Field7880;
                n6 = n3 + class1514.Method675() + this.Field7880;
            }
            if (class1514.Method677() + this.Field7881 > n5) {
                n5 = class1514.Method677() + this.Field7881;
            }
            hashMap.put(class1514, new int[]{n3, n4});
            n3 = n6;
        }
        return new Class1834(hashMap, hashMap.entrySet().stream().map(Class13::Method156).max(Integer::compareTo).orElse(0), hashMap.entrySet().stream().map(Class13::Method155).max(Integer::compareTo).orElse(0));
    }

    private static Integer Method155(Map.Entry entry) {
        return ((int[])entry.getValue())[0] + ((Class1514)entry.getKey()).Method675();
    }

    private static Integer Method156(Map.Entry entry) {
        return ((int[])entry.getValue())[1] + ((Class1514)entry.getKey()).Method677();
    }

    static {
        Field7879 = 7;
        Field7878 = 7;
    }
}

