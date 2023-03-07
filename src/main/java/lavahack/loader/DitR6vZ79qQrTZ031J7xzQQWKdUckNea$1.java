/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import java.util.ArrayList;
import java.util.Iterator;
import lavahack.loader.ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy;
import lavahack.loader.DitR6vZ79qQrTZ031J7xzQQWKdUckNea;

class DitR6vZ79qQrTZ031J7xzQQWKdUckNea$1
implements Runnable {
    private ArrayList Field13448;
    final DitR6vZ79qQrTZ031J7xzQQWKdUckNea Field13449;
    private String Field13450 = "TheKisDevs & LavaHack Development owns you";

    DitR6vZ79qQrTZ031J7xzQQWKdUckNea$1(DitR6vZ79qQrTZ031J7xzQQWKdUckNea ditR6vZ79qQrTZ031J7xzQQWKdUckNea) {
        this.Field13449 = ditR6vZ79qQrTZ031J7xzQQWKdUckNea;
        this.Field13448 = new ArrayList();
    }

    @Override
    public void run() {
        this.Field13448.clear();
        this.Field13448.addAll(this.Field13449.Method2681());
        Iterator iterator = DitR6vZ79qQrTZ031J7xzQQWKdUckNea.Method2687(this.Field13449);
        long l = (long)((double)System.nanoTime() - (double)DitR6vZ79qQrTZ031J7xzQQWKdUckNea.Method2688(this.Field13449) * Double.longBitsToDouble(0x1295CA09CE6DA23L ^ 0x3ED15CA09CE6DA23L));
        iterator = this.Field13448.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Field13448.clear();
                return;
            }
            ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy aRQmBQvY5BCKjQHAEtWILloZwAOUZwhy = (ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy)iterator.next();
            DitR6vZ79qQrTZ031J7xzQQWKdUckNea.Method2689(this.Field13449, aRQmBQvY5BCKjQHAEtWILloZwAOUZwhy, l);
        }
    }
}

