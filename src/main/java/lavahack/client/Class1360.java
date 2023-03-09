/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import lavahack.client.Class438;
import org.lwjgl.opengl.GL20;

public class Class1360
extends Class438 {
    private String Field14194 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Boolean Method5429() {
        return false;
    }

    public Class1360 Method5430(int n) {
        GL20.glUniform1i((int)n, (int)((Boolean)this.Method647() != false ? 1 : 0));
        return this;
    }

    @Override
    public Object Method646(int n) {
        return this.Method5430(n);
    }

    @Override
    public Object Method645() {
        return this.Method5429();
    }
}

