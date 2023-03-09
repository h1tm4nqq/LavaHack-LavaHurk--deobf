/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import lavahack.client.Class1996;
import lavahack.client.Class42;
import lavahack.client.Class44;

public class Class2047 {
    private final ArrayList Field17393 = new ArrayList();
    private String Field17394 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void Method7569(Class44 class44) {
        if (class44 == null) {
            return;
        }
        this.Field17393.add(class44);
    }

    public ArrayList Method7570() {
        return this.Field17393;
    }

    public ArrayList Method7571(Class42 class42) {
        ArrayList<Class44> arrayList = new ArrayList<Class44>();
        Iterator iterator = this.Method7570().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                if (!arrayList.isEmpty()) return arrayList;
                return null;
            }
            Class44 class44 = (Class44)iterator.next();
            if (class44.Method358() != class42) continue;
            arrayList.add(class44);
        }
    }

    public Class44 Method7572(Class42 class42, String string) {
        Class44 class44;
        Iterator iterator = this.Method7570().iterator();
        do {
            if (!iterator.hasNext()) return null;
        } while ((class44 = (Class44)iterator.next()) == null || !class44.Method356().equalsIgnoreCase(string) || class44.Method358() != class42);
        return class44;
    }

    public Class44 Method7573(Class42 class42, String string, boolean bl) {
        Class44 class44;
        Iterator iterator = this.Method7570().iterator();
        do {
            if (!iterator.hasNext()) return null;
        } while ((class44 = (Class44)iterator.next()) == null || bl && (class44.Method382() || class44 instanceof Class1996) || !string.equalsIgnoreCase(class44.Method356()) || class44.Method358() != class42);
        return class44;
    }
}

