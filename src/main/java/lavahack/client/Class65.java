/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import lavahack.client.Class2011;
import lavahack.client.Class438;
import org.lwjgl.opengl.GL20;

public class Class65
extends Class438 {
    private String Field8216 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class2011 Method649() {
        return new Class2011(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Class65 Method650(int n) {
        GL20.glUniform4f((int)n, (float)((Class2011)this.Method647()).Method7460(), (float)((Class2011)this.Method647()).Method7462(), (float)((Class2011)this.Method647()).Method7464(), (float)((Class2011)this.Method647()).Method7466());
        return this;
    }

    @Override
    public Object Method646(int n) {
        return this.Method650(n);
    }

    @Override
    public Object Method645() {
        return this.Method649();
    }
}

