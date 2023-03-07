/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import lavahack.client.WieLcrIxU3iYF11f2EiUDyi7gNqAZWP8;
import org.lwjgl.opengl.GL20;

public class tbVaBIES7426XFKhjsNa3Vjv17G7SCLB
extends WieLcrIxU3iYF11f2EiUDyi7gNqAZWP8 {
    private int Field17029;

    public Integer Method7274() {
        return (int)-2039435394L ^ 0x8670AF7E;
    }

    public tbVaBIES7426XFKhjsNa3Vjv17G7SCLB Method7275(int n) {
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

