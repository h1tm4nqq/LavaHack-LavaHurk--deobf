/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Iterator;
import java.util.List;
import lavahack.client.HOKNToKSLv8ndFpMwlqBYSsOzF8pxGqY;
import lavahack.client.TDrOJYGYE6GxbjOEblLxwsKQtY1HZZvO;
import lavahack.client.dxECsBiCCQZR3sg44LtDW8kcY6zewFx8;
import lavahack.client.nNkPle7w34lMi0rtTNBkV7SXBXo02JDb;

public class MUU5rY7bYKphpPNPTaXWkJXha4Qjva9q {
    private final TDrOJYGYE6GxbjOEblLxwsKQtY1HZZvO Field13690;
    private final List Field13691;
    private final String Field13692;
    private String Field13693 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public MUU5rY7bYKphpPNPTaXWkJXha4Qjva9q(String string, TDrOJYGYE6GxbjOEblLxwsKQtY1HZZvO tDrOJYGYE6GxbjOEblLxwsKQtY1HZZvO, List list) {
        this.Field13690 = tDrOJYGYE6GxbjOEblLxwsKQtY1HZZvO;
        this.Field13691 = list;
        this.Field13692 = string;
    }

    public String Method5062() {
        return this.Field13692;
    }

    public TDrOJYGYE6GxbjOEblLxwsKQtY1HZZvO Method5063() {
        return this.Field13690;
    }

    public List Method5064() {
        return this.Field13691;
    }

    public void Method5065() {
        this.Field13691.forEach(dxECsBiCCQZR3sg44LtDW8kcY6zewFx8::Method2262);
    }

    public void Method5066() {
        this.Field13691.forEach(dxECsBiCCQZR3sg44LtDW8kcY6zewFx8::Method2263);
    }

    public void Method5067(String string, String string2, boolean bl) {
        nNkPle7w34lMi0rtTNBkV7SXBXo02JDb nNkPle7w34lMi0rtTNBkV7SXBXo02JDb2 = HOKNToKSLv8ndFpMwlqBYSsOzF8pxGqY.Method4617(string);
        if (nNkPle7w34lMi0rtTNBkV7SXBXo02JDb2 == null) {
            return;
        }
        dxECsBiCCQZR3sg44LtDW8kcY6zewFx8 dxECsBiCCQZR3sg44LtDW8kcY6zewFx82 = nNkPle7w34lMi0rtTNBkV7SXBXo02JDb2.Method7634(string2, this.Field13690);
        if (bl) {
            dxECsBiCCQZR3sg44LtDW8kcY6zewFx82.Method2262();
        }
        this.Field13691.add(dxECsBiCCQZR3sg44LtDW8kcY6zewFx82);
    }

    public void Method5068(Class clazz, String string, boolean bl) {
        nNkPle7w34lMi0rtTNBkV7SXBXo02JDb nNkPle7w34lMi0rtTNBkV7SXBXo02JDb2 = HOKNToKSLv8ndFpMwlqBYSsOzF8pxGqY.Method4618(clazz);
        if (nNkPle7w34lMi0rtTNBkV7SXBXo02JDb2 == null) {
            return;
        }
        dxECsBiCCQZR3sg44LtDW8kcY6zewFx8 dxECsBiCCQZR3sg44LtDW8kcY6zewFx82 = nNkPle7w34lMi0rtTNBkV7SXBXo02JDb2.Method7634(string, this.Field13690);
        if (bl) {
            dxECsBiCCQZR3sg44LtDW8kcY6zewFx82.Method2262();
        }
        this.Field13691.add(dxECsBiCCQZR3sg44LtDW8kcY6zewFx82);
    }

    public boolean Method5069() {
        dxECsBiCCQZR3sg44LtDW8kcY6zewFx8 dxECsBiCCQZR3sg44LtDW8kcY6zewFx82;
        Iterator iterator = this.Field13691.iterator();
        do {
            if (!iterator.hasNext()) return (int)((long)796982335 ^ (long)796982335) != 0;
        } while (!(dxECsBiCCQZR3sg44LtDW8kcY6zewFx82 = (dxECsBiCCQZR3sg44LtDW8kcY6zewFx8)iterator.next()).Method2264());
        return ((int)-1263043246L ^ 0xB4B77D53) != 0;
    }
}

