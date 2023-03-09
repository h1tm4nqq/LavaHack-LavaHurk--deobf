/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import lavahack.client.Class438;
import lavahack.client.Class783;
import org.lwjgl.opengl.GL20;

public class Class1372
extends Class438 {
    private String Field14236 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class783 Method5469() {
        return new Class783();
    }

    public Class1372 Method5470(int n) {
        GL20.glUniform2i((int)n, (int)((Class783)this.Method647()).Field11301, (int)((Class783)this.Method647()).Field11302);
        return this;
    }

    @Override
    public Object Method646(int n) {
        return this.Method5470(n);
    }

    @Override
    public Object Method645() {
        return this.Method5469();
    }
}

