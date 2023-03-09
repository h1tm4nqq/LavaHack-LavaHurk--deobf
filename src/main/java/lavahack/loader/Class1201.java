/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import java.util.ArrayList;
import java.util.Iterator;
import lavahack.loader.Class1966;
import lavahack.loader.Class625;

class Class1201
implements Runnable {
    private ArrayList Field13448;
    final Class625 Field13449;
    private String Field13450 = "TheKisDevs & LavaHack Development owns you";

    Class1201(Class625 class625) {
        this.Field13449 = class625;
        this.Field13448 = new ArrayList();
    }

    @Override
    public void run() {
        this.Field13448.clear();
        this.Field13448.addAll(this.Field13449.Method2681());
        Iterator iterator = Class625.Method2687(this.Field13449);
        long l = (long)((double)System.nanoTime() - (double)Class625.Method2688(this.Field13449) * Double.longBitsToDouble(4609434218613702656L));
        iterator = this.Field13448.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Field13448.clear();
                return;
            }
            Class1966 class1966 = (Class1966)iterator.next();
            Class625.Method2689(this.Field13449, class1966, l);
        }
    }
}

