/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL13
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import lavahack.client.Class438;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;

public class Class2035
extends Class438 {
    private String Field17362 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Integer Method7530() {
        return 0;
    }

    public Class2035 Method7531(int n) {
        GL13.glActiveTexture((int)33992);
        GL11.glBindTexture((int)3553, (int)((Integer)this.Method647()));
        GL20.glUniform1i((int)n, (int)8);
        GL13.glActiveTexture((int)33984);
        return this;
    }

    @Override
    public Object Method646(int n) {
        return this.Method7531(n);
    }

    @Override
    public Object Method645() {
        return this.Method7530();
    }
}

