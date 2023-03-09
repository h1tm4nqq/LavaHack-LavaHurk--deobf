/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import lavahack.client.Class438;
import lavahack.client.Class594;
import org.lwjgl.opengl.GL20;

public class Class860
extends Class438 {
    private String Field11634 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class594 Method3643() {
        return new Class594(0, 0, 0, 0);
    }

    public Class860 Method3644(int n) {
        GL20.glUniform4i((int)n, (int)((Class594)this.Method647()).Method2572(), (int)((Class594)this.Method647()).Method2574(), (int)((Class594)this.Method647()).Method2576(), (int)((Class594)this.Method647()).Method2578());
        return this;
    }

    @Override
    public Object Method646(int n) {
        return this.Method3644(n);
    }

    @Override
    public Object Method645() {
        return this.Method3643();
    }
}

