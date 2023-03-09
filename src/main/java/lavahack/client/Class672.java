/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Arrays;
import lavahack.client.Class1320;
import lavahack.client.Class618;

public interface Class672 {
    public void Method705(Class1320 var1);

    public void Method706(Class618 var1);

    default public void Method707(Class1320 ... class1320Array) {
        Arrays.stream(class1320Array).forEach(this::Method705);
    }

    default public void Method708(Iterable iterable) {
        iterable.forEach(this::Method705);
    }

    default public void Method709(Class618 ... class618Array) {
        Arrays.stream(class618Array).forEach(this::Method706);
    }

    public void Method710(Class1320 var1);

    public void Method711(Class618 var1);

    default public void Method712(Class1320 ... class1320Array) {
        Arrays.stream(class1320Array).forEach(this::Method710);
    }

    default public void Method713(Iterable iterable) {
        iterable.forEach(this::Method710);
    }

    default public void Method714(Class618 ... class618Array) {
        Arrays.stream(class618Array).forEach(this::Method711);
    }

    public void Method715(Object var1);

    public void Method716(Object var1);
}

