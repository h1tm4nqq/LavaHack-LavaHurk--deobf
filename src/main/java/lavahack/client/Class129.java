/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class286;

class Class129 {
    Object Field8442 = null;
    Object Field8443 = null;
    private String Field8444 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Class129() {
    }

    private void Method860(Object object) {
        if (this.Field8442 == null) {
            this.Field8442 = object;
            return;
        }
        if (this.Field8443 != null) return;
        if (object == this.Field8442) {
            return;
        }
        this.Field8443 = object;
    }

    private boolean Method861() {
        if (this.Field8442 == null) return false;
        if (this.Field8443 == null) return false;
        return true;
    }

    Class129(Class286 class286) {
        this();
    }

    static boolean Method862(Class129 class129) {
        return class129.Method861();
    }

    static void Method863(Class129 class129, Object object) {
        class129.Method860(object);
    }
}

