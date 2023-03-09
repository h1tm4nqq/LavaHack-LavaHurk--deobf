/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import lavahack.client.Class438;
import org.lwjgl.opengl.GL20;

public class Class1959
extends Class438 {
    private int Field17029;

    public Integer Method7274() {
        return 0;
    }

    public Class1959 Method7275(int n) {
        GL20.glUniform1i((int)n, (int)((Integer)this.Method647()));
        return this;
    }

    @Override
    public Object Method646(int n) {
        return this.Method7275(n);
    }

    @Override
    public Object Method645() {
        return this.Method7274();
    }
}

