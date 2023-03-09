/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lavahack.client.Class1514;
import lavahack.client.Class1834;
import lavahack.client.Class1876;
import lavahack.client.Class1997;

public class Class1803
extends Class1514 {
    protected List Field16306 = new ArrayList();
    protected Map Field16307 = new HashMap();
    protected Class1834 Field16308;
    private final Class1997 Field16309;
    private String Field16310 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1803(Class1876 class1876, Class1997 class1997) {
        super(class1876);
        this.Field16309 = class1997;
    }

    @Override
    public void Method668() {
        if (this.Method679()) {
            this.Method6813();
            this.Method6811();
        }
        this.Method6812();
        Iterator iterator = this.Field16306.iterator();
        while (iterator.hasNext()) {
            Class1514 class1514 = (Class1514)iterator.next();
            class1514.Method668();
        }
    }

    @Override
    public void Method669() {
        Iterator iterator = this.Field16306.iterator();
        while (iterator.hasNext()) {
            Class1514 class1514 = (Class1514)iterator.next();
            class1514.Method669();
        }
    }

    @Override
    public boolean Method679() {
        Class1514 class1514;
        Iterator iterator = this.Field16306.iterator();
        do {
            if (!iterator.hasNext()) return super.Method679();
        } while (!(class1514 = (Class1514)iterator.next()).Method679());
        return true;
    }

    private void Method6811() {
        Iterator iterator = this.Field16306.iterator();
        while (iterator.hasNext()) {
            Class1514 class1514 = (Class1514)iterator.next();
            class1514.Method680(false);
        }
    }

    protected void Method6812() {
        Iterator iterator = this.Field16306.iterator();
        while (iterator.hasNext()) {
            Class1514 class1514 = (Class1514)iterator.next();
            int[] nArray = (int[])this.Field16307.get(class1514);
            if (nArray == null) {
                this.Method6813();
                this.Method6812();
                return;
            }
            class1514.Method672(this.Method671() + nArray[0]);
            class1514.Method674(this.Method673() + nArray[1]);
        }
    }

    public void Method6813() {
        this.Method6814(this.Method675(), this.Method677(), true);
    }

    protected void Method6814(int n, int n2, boolean bl) {
        this.Field16308 = this.Field16309.Method150(this.Field16306, n, n2);
        this.Field16307 = this.Field16308.Method6901();
        if (!bl) return;
        this.Method678(this.Field16308.Method6903());
    }

    public void Method6815(Class1514 class1514) {
        this.Field16306.add(class1514);
        this.Method6814(super.Method675(), super.Method677(), true);
    }

    @Override
    public boolean Method683(int n, int n2, boolean bl) {
        boolean[] blArray = new boolean[]{false};
        this.Field16306.stream().sorted(Comparator.comparingInt(Class1514::Method670)).forEach(arg_0 -> Class1803.Method6821(blArray, n, n2, bl, arg_0));
        return blArray[0];
    }

    @Override
    public boolean Method684(int n, int n2, int n3, boolean bl) {
        boolean[] blArray = new boolean[]{false};
        this.Field16306.stream().sorted(Comparator.comparingInt(Class1514::Method670)).forEach(arg_0 -> Class1803.Method6820(blArray, n, n2, n3, bl, arg_0));
        return blArray[0];
    }

    @Override
    public boolean Method682(int n, int n2, int n3, boolean bl) {
        boolean[] blArray = new boolean[]{false};
        this.Field16306.stream().sorted(Comparator.comparingInt(Class1514::Method670)).forEach(arg_0 -> Class1803.Method6819(blArray, n, n2, n3, bl, arg_0));
        return blArray[0];
    }

    @Override
    public boolean Method681(int n, char c) {
        boolean[] blArray = new boolean[]{false};
        this.Field16306.stream().sorted(Comparator.comparingInt(Class1514::Method670)).forEach(arg_0 -> Class1803.Method6818(blArray, n, c, arg_0));
        return blArray[0];
    }

    @Override
    public int Method675() {
        if (super.Method675() > 0) return super.Method675();
        this.Method6816();
        return super.Method675();
    }

    @Override
    public int Method677() {
        if (super.Method677() > 0) return super.Method677();
        this.Method6816();
        return super.Method677();
    }

    private void Method6816() {
        for (Class1514 class1514 : this.Field16306) {
            if (!(class1514 instanceof Class1803)) continue;
            ((Class1803)class1514).Method6816();
        }
        Object object = this.Field16309.Method149(this.Field16306, Integer.MAX_VALUE);
        if (super.Method675() <= 0) {
            this.Method676((int)object[0]);
        }
        if (super.Method677() > 0) return;
        this.Method678((int)object[1]);
    }

    public void Method6817() {
        this.Field16306.clear();
        this.Method6814(super.Method675(), super.Method677(), true);
    }

    private static void Method6818(boolean[] blArray, int n, char c, Class1514 class1514) {
        if (blArray[0]) return;
        if (!class1514.Method681(n, c)) return;
        blArray[0] = true;
    }

    private static void Method6819(boolean[] blArray, int n, int n2, int n3, boolean bl, Class1514 class1514) {
        if (blArray[0]) return;
        if (!class1514.Method682(n, n2, n3, bl)) return;
        blArray[0] = true;
    }

    private static void Method6820(boolean[] blArray, int n, int n2, int n3, boolean bl, Class1514 class1514) {
        if (blArray[0]) return;
        if (!class1514.Method684(n, n2, n3, bl)) return;
        blArray[0] = true;
    }

    private static void Method6821(boolean[] blArray, int n, int n2, boolean bl, Class1514 class1514) {
        if (blArray[0]) return;
        if (!class1514.Method683(n, n2, bl)) return;
        blArray[0] = true;
    }
}

