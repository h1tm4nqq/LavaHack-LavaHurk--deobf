/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;

public class eXIEwpfsveJ6FwbLoefTKstatmuKRSOh {
    private final ArrayList Field17393 = new ArrayList();
    private String Field17394 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void Method7569(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2) {
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 == null) {
            return;
        }
        this.Field17393.add(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2);
    }

    public ArrayList Method7570() {
        return this.Field17393;
    }

    public ArrayList Method7571(WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        ArrayList<qdws5c2TrWCYwByZ0oQUUWIrq72gJscD> arrayList = new ArrayList<qdws5c2TrWCYwByZ0oQUUWIrq72gJscD>();
        Iterator iterator = this.Method7570().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                if (!arrayList.isEmpty()) return arrayList;
                return null;
            }
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)iterator.next();
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method358() != wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) continue;
            arrayList.add(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2);
        }
    }

    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7572(WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, String string) {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2;
        Iterator iterator = this.Method7570().iterator();
        do {
            if (!iterator.hasNext()) return null;
        } while ((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)iterator.next()) == null || !qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method356().equalsIgnoreCase(string) || qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method358() != wjjBVRrUqJUKhloA7ANknrTEODhuGa0J);
        return qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2;
    }

    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7573(WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, String string, boolean bl) {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2;
        Iterator iterator = this.Method7570().iterator();
        do {
            if (!iterator.hasNext()) return null;
        } while ((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)iterator.next()) == null || bl && (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method382() || qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 instanceof xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl) || !string.equalsIgnoreCase(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method356()) || qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method358() != wjjBVRrUqJUKhloA7ANknrTEODhuGa0J);
        return qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2;
    }
}

