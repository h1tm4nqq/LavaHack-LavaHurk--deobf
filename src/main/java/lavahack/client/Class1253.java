/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.List;
import lavahack.client.Class1320;
import lavahack.client.Class618;
import lavahack.client.Class672;
import lavahack.client.Class762;
import lavahack.client.Class80;

public class Class1253
extends Class80
implements Class762 {
    private final List Field13683 = new ArrayList();
    private int Field13684;

    @Override
    public void Method705(Class1320 class1320) {
        super.Method705(class1320);
        if (this.Field13683.isEmpty()) return;
        this.Field13683.forEach(arg_0 -> Class1253.Method5060(class1320, arg_0));
    }

    @Override
    public void Method706(Class618 class618) {
        super.Method706(class618);
        if (this.Field13683.isEmpty()) return;
        this.Field13683.forEach(arg_0 -> Class1253.Method5059(class618, arg_0));
    }

    @Override
    public void Method710(Class1320 class1320) {
        super.Method710(class1320);
        if (this.Field13683.isEmpty()) return;
        this.Field13683.forEach(arg_0 -> Class1253.Method5058(class1320, arg_0));
    }

    @Override
    public void Method711(Class618 class618) {
        super.Method711(class618);
        if (this.Field13683.isEmpty()) return;
        this.Field13683.forEach(arg_0 -> Class1253.Method5057(class618, arg_0));
    }

    @Override
    public void Method715(Object object) {
        super.Method715(object);
        if (this.Field13683.isEmpty()) return;
        this.Field13683.forEach(arg_0 -> Class1253.Method5056(object, arg_0));
    }

    @Override
    public void Method3147(Class672 class672) {
        if (this.Field13683.contains(class672)) return;
        this.Field13683.add(class672);
    }

    @Override
    public void Method3148(Class672 class672) {
        this.Field13683.remove(class672);
    }

    private static void Method5056(Object object, Class672 class672) {
        class672.Method715(object);
    }

    private static void Method5057(Class618 class618, Class672 class672) {
        class672.Method711(class618);
    }

    private static void Method5058(Class1320 class1320, Class672 class672) {
        class672.Method710(class1320);
    }

    private static void Method5059(Class618 class618, Class672 class672) {
        class672.Method706(class618);
    }

    private static void Method5060(Class1320 class1320, Class672 class672) {
        class672.Method705(class1320);
    }
}

