/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1009;
import lavahack.client.Class1017;
import lavahack.client.Class1063;
import lavahack.client.Class1221;
import lavahack.client.Class1396;
import lavahack.client.Class1790;
import lavahack.client.Class24;
import lavahack.client.Class282;
import org.objectweb.asm.tree.ClassNode;

public class Class1387 {
    private final Class24[] Field14291 = new Class24[5];
    private String Field14292 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1387() {
        this.Field14291[0] = new Class1221();
        this.Field14291[1] = new Class1017();
        this.Field14291[2] = new Class1009();
        this.Field14291[3] = new Class1063();
        this.Field14291[4] = new Class282();
    }

    public byte[] Method5495(byte[] byArray, Class1790 class1790) {
        ClassNode classNode = Class1396.Method5516(byArray, new int[0]);
        Class24[] class24Array = this.Field14291;
        int n = class24Array.length;
        int n2 = 0;
        while (n2 < n) {
            Class24 class24 = class24Array[n2];
            class24.Method193(classNode, class1790);
            ++n2;
        }
        return Class1396.Method5517(classNode, new int[0]);
    }
}

