/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Iterator;
import java.util.List;
import lavahack.client.Class1127;
import lavahack.client.Class1164;
import lavahack.client.Class2099;
import lavahack.client.Class488;

public class Class1255 {
    private final Class1164 Field13690;
    private final List Field13691;
    private final String Field13692;
    private String Field13693 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1255(String string, Class1164 class1164, List list) {
        this.Field13690 = class1164;
        this.Field13691 = list;
        this.Field13692 = string;
    }

    public String Method5062() {
        return this.Field13692;
    }

    public Class1164 Method5063() {
        return this.Field13690;
    }

    public List Method5064() {
        return this.Field13691;
    }

    public void Method5065() {
        this.Field13691.forEach(Class488::Method2262);
    }

    public void Method5066() {
        this.Field13691.forEach(Class488::Method2263);
    }

    public void Method5067(String string, String string2, boolean bl) {
        Class2099 class2099 = Class1127.Method4617(string);
        if (class2099 == null) {
            return;
        }
        Class488 class488 = class2099.Method7634(string2, this.Field13690);
        if (bl) {
            class488.Method2262();
        }
        this.Field13691.add(class488);
    }

    public void Method5068(Class clazz, String string, boolean bl) {
        Class2099 class2099 = Class1127.Method4618(clazz);
        if (class2099 == null) {
            return;
        }
        Class488 class488 = class2099.Method7634(string, this.Field13690);
        if (bl) {
            class488.Method2262();
        }
        this.Field13691.add(class488);
    }

    public boolean Method5069() {
        Class488 class488;
        Iterator iterator = this.Field13691.iterator();
        do {
            if (!iterator.hasNext()) return false;
        } while (!(class488 = (Class488)iterator.next()).Method2264());
        return true;
    }
}

