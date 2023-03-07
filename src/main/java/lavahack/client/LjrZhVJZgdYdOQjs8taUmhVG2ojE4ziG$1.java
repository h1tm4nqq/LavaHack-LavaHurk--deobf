/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import lavahack.client.LjrZhVJZgdYdOQjs8taUmhVG2ojE4ziG;
import lavahack.client.ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA;

class LjrZhVJZgdYdOQjs8taUmhVG2ojE4ziG$1
implements Runnable {
    private ArrayList Field15343;
    final LjrZhVJZgdYdOQjs8taUmhVG2ojE4ziG Field15344;
    private String Field15345 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    LjrZhVJZgdYdOQjs8taUmhVG2ojE4ziG$1(LjrZhVJZgdYdOQjs8taUmhVG2ojE4ziG ljrZhVJZgdYdOQjs8taUmhVG2ojE4ziG) {
        this.Field15344 = ljrZhVJZgdYdOQjs8taUmhVG2ojE4ziG;
        this.Field15343 = new ArrayList();
    }

    @Override
    public void run() {
        this.Field15343.clear();
        this.Field15343.addAll(this.Field15344.Method527());
        Iterator iterator = LjrZhVJZgdYdOQjs8taUmhVG2ojE4ziG.Method533(this.Field15344);
        long l = (long)((double)System.nanoTime() - (double)LjrZhVJZgdYdOQjs8taUmhVG2ojE4ziG.Method534(this.Field15344) * Double.longBitsToDouble(0x472E3241666E40CFL ^ 0x78D63241666E40CFL));
        iterator = this.Field15343.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Field15343.clear();
                return;
            }
            ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA = (ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA)iterator.next();
            LjrZhVJZgdYdOQjs8taUmhVG2ojE4ziG.Method535(this.Field15344, zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, l);
        }
    }
}

