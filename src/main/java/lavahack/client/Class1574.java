/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import lavahack.client.Class1728;
import lavahack.client.Class641;

class Class1574
implements Runnable {
    private ArrayList Field15343;
    final Class641 Field15344;
    private String Field15345 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    Class1574(Class641 class641) {
        this.Field15344 = class641;
        this.Field15343 = new ArrayList();
    }

    @Override
    public void run() {
        this.Field15343.clear();
        this.Field15343.addAll(this.Field15344.Method527());
        Iterator iterator = Class641.Method533(this.Field15344);
        long l = (long)((double)System.nanoTime() - (double)Class641.Method534(this.Field15344) * Double.longBitsToDouble(4609434218613702656L));
        iterator = this.Field15343.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Field15343.clear();
                return;
            }
            Class1728 class1728 = (Class1728)iterator.next();
            Class641.Method535(this.Field15344, class1728, l);
        }
    }
}

