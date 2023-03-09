/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import lavahack.client.Class438;
import org.lwjgl.opengl.GL20;

public class Class277
extends Class438 {
    private int Field9215;

    public Float Method1468() {
        return Float.valueOf(0.0f);
    }

    public Class277 Method1469(int n) {
        GL20.glUniform1f((int)n, (float)((Float)this.Method647()).floatValue());
        return this;
    }

    @Override
    public Object Method646(int n) {
        return this.Method1469(n);
    }

    @Override
    public Object Method645() {
        return this.Method1468();
    }
}

