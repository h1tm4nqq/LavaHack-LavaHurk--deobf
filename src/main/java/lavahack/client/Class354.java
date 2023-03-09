/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import lavahack.client.Class1096;
import lavahack.client.Class1249;
import lavahack.client.Class1419;
import lavahack.client.Class1429;
import lavahack.client.Class1459;
import lavahack.client.Class1520;
import lavahack.client.Class1796;
import lavahack.client.Class2070;
import lavahack.client.Class337;
import lavahack.client.Class366;
import lavahack.client.Class42;
import lavahack.client.Class753;
import lavahack.client.Class97;

public class Class354 {
    public final ArrayList Field9465 = new ArrayList();
    public final Class97 Field9466;
    public final boolean Field9467;
    public final String Field9468;
    public int Field9469;
    public int Field9470;
    public int Field9471 = 0;
    public boolean Field9472 = false;
    public boolean Field9473;
    public boolean Field9474 = true;
    public int Field9475;
    public int Field9476;
    private final Class1520 Field9477 = new Class366(this);
    private int Field9478;

    public Class354(Class97 class97, int n, int n2, boolean bl) {
        this.Field9466 = class97;
        this.Field9467 = false;
        this.Field9468 = "";
        this.Field9469 = n;
        this.Field9470 = n2;
    }

    public Class354(Class97 class97, int n, int n2, boolean bl, String string) {
        this.Field9466 = class97;
        this.Field9467 = true;
        this.Field9468 = string;
        this.Field9469 = n;
        this.Field9470 = n2;
    }

    public Class354(int n, int n2, String string) {
        this.Field9466 = null;
        this.Field9467 = true;
        this.Field9468 = string;
        this.Field9469 = n;
        this.Field9470 = n2;
        int n3 = Class1419.Field14604;
        int n4 = 0;
        Iterator iterator = Class1796.Field16241.Field16257.Field9235.iterator();
        while (iterator.hasNext()) {
            Class1249 class1249 = (Class1249)iterator.next();
            this.Field9465.add(new Class1429(class1249, n, n2, n3, n4++));
            n3 += Class1419.Field14604;
        }
    }

    public Class354(Class97 class97, int n, int n2) {
        this.Field9467 = false;
        this.Field9468 = "";
        int n3 = Class1419.Field14604;
        int n4 = 0;
        if (!class97.equals((Object)Class97.Field8347)) {
            for (Class42 class42 : Class1796.Field16241.Field16254.Method1164(class97)) {
                this.Field9465.add(new Class1429(class42, n, n2, n3, n4++));
                n3 += Class1419.Field14604;
            }
        } else {
            if (!Class1796.Field16241.Field16283.Field15891.isEmpty()) {
                for (Class42 class42 : Class1796.Field16241.Field16283.Field15891) {
                    this.Field9465.add(new Class1429(class42, n, n2, n3, n4++));
                    n3 += Class1419.Field14604;
                }
            }
            for (Class42 class42 : Class1796.Field16241.Field16254.Method1164(class97)) {
                if (!(class42 instanceof Class1096)) continue;
                this.Field9465.add(new Class1429(class42, n, n2, n3, n4++));
                n3 += Class1419.Field14604;
            }
        }
        this.Field9466 = class97;
        this.Field9469 = n;
        this.Field9470 = n2;
    }

    public void Method66() {
        this.Field9472 = true;
        this.Field9465.clear();
        int n = Class1419.Field14604;
        int n2 = 0;
        if (this.Field9467) {
            for (Class1249 class1249 : Class1796.Field16241.Field16257.Field9235) {
                this.Field9465.add(new Class1429(class1249, this.Field9469, this.Field9470, n, n2++));
                n += Class1419.Field14604;
            }
        } else if (!this.Field9466.equals((Object)Class97.Field8347)) {
            for (Class42 class42 : Class1796.Field16241.Field16254.Method1164(this.Field9466)) {
                this.Field9465.add(new Class1429(class42, this.Field9469, this.Field9470, n, n2++));
                n += Class1419.Field14604;
            }
        } else {
            for (Class42 class42 : Class1796.Field16241.Field16283.Field15891) {
                this.Field9465.add(new Class1429(class42, this.Field9469, this.Field9470, n, n2++));
                n += Class1419.Field14604;
            }
        }
        this.Field9472 = false;
    }

    public void Method67(int n, int n2) {
        if (this.Field9473) {
            this.Field9469 = n - this.Field9475;
            this.Field9470 = n2 - this.Field9476;
        }
        if (Class1419.Field14593) {
            Class2070 class2070 = new Class2070(this.Field9469, this.Field9470, this.Field9469 + 120, this.Field9470 + Class1419.Field14604, Class1419.Method1228(this.Field9471), Class1419.Method1228(this.Field9471).Method3633(0), Double.longBitsToDouble(0x4014000000000000L), Collections.singletonList(Class1459.Field14826));
            class2070.Method7585();
        } else {
            Class753.drawRectWH(this.Field9469, this.Field9470, Double.longBitsToDouble(4638144666238189568L), Class1419.Field14604, Class1419.Method1228(this.Field9471).Method3626());
        }
        Class1419.Method1224(this.Field9467 ? this.Field9468 : this.Field9466.Method807(), this.Field9469, this.Field9470, 120, Class1419.Field14604);
        if (!null.Field11805.Method365()) return;
        Class1419.Method1225("[" + this.Field9465.size() + "]", this.Field9467 ? this.Field9468 : this.Field9466.Method807(), this.Field9469, this.Field9470, Double.longBitsToDouble((long)1280049382 ^ 0x405E00004C4C00E6L), Class1419.Field14604, new Class2027(255, 255, 255, 255), 2);
    }

    private void Method68(Class1520 class1520, int n, int n2) {
        class1520.Method624(n, n2);
        if (!(class1520 instanceof Class337)) return;
        Class337 class337 = (Class337)class1520;
        if (!class337.Method1668()) return;
        Iterator iterator = class337.Method1669().iterator();
        while (iterator.hasNext()) {
            Class1520 class15202 = (Class1520)iterator.next();
            if (!class15202.Method641()) continue;
            this.Method68(class15202, n, n2);
        }
    }

    public void Method69(int n, int n2) {
        if (Class1419.Field14598) {
            Class1419.Method1232(this.Field9477, false, !Class1419.Field14597, Class1419.Field14597);
        }
        if (!this.Field9474) return;
        Iterator iterator = this.Field9465.iterator();
        while (iterator.hasNext()) {
            Class1520 class1520 = (Class1520)iterator.next();
            if (!class1520.Method641()) continue;
            this.Method68(class1520, n, n2);
        }
    }

    public void Method70(int n, int n2) {
        if (!this.Field9474) return;
        if (!null.Field11789.Method365()) return;
        Iterator iterator = this.Field9465.iterator();
        while (iterator.hasNext()) {
            Class1520 class1520 = (Class1520)iterator.next();
            if (!class1520.Method641() || !(class1520 instanceof Class1429) || !((Class1429)class1520).Method5715(n, n2) || ((Class1429)class1520).Field14673.Field14052.isEmpty()) continue;
            ((Class1429)class1520).Field14673.Method623(n, n2);
        }
    }

    private int[] Method71(ArrayList arrayList, int[] nArray) {
        int n = nArray[0];
        int n2 = nArray[1];
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Class337 class337;
            Class1520 class1520 = (Class1520)iterator.next();
            if (!class1520.Method641()) continue;
            class1520.Method629(n);
            class1520.Method630(n2);
            n += class1520.Method631();
            ++n2;
            if (!(class1520 instanceof Class337) || !(class337 = (Class337)class1520).Method1668()) continue;
            int[] nArray2 = this.Method71(class337.Method1669(), new int[]{n, n2});
            n = nArray2[0];
            n2 = nArray2[1];
        }
        return new int[]{n, n2};
    }

    public void Method72() {
        int n = Class1419.Field14604;
        int n2 = this.Field9471 + 1;
        Iterator iterator = this.Field9465.iterator();
        while (iterator.hasNext()) {
            Class337 class337;
            Class1520 class1520 = (Class1520)iterator.next();
            if (!class1520.Method641()) continue;
            class1520.Method629(n);
            class1520.Method630(n2);
            n += Class1419.Field14604;
            ++n2;
            if (!(class1520 instanceof Class337) || !(class337 = (Class337)class1520).Method1668()) continue;
            int[] nArray = this.Method71(class337.Method1669(), new int[]{n, n2});
            n = nArray[0];
            n2 = nArray[1];
        }
    }

    public boolean Method73(int n, int n2) {
        if (n <= this.Field9469) return false;
        if (n >= this.Field9469 + 120) return false;
        if (n2 <= this.Field9470) return false;
        if (n2 >= this.Field9470 + Class1419.Field14604) return false;
        return true;
    }

    private static String Method74(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 236;
            cArray2[n] = (char)(cArray[n] ^ (0x11B8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

