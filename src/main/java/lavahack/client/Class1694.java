/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import lavahack.client.Class438;
import lavahack.client.Class824;
import org.lwjgl.opengl.GL20;

public class Class1694
extends Class438 {
    private String Field15855 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class824 Method6499() {
        return new Class824(0.0f, 0.0f, 0.0f);
    }

    public Class1694 Method6500(int n) {
        GL20.glUniform3f((int)n, (float)((Class824)this.Method647()).Method3521(), (float)((Class824)this.Method647()).Method3523(), (float)((Class824)this.Method647()).Method3525());
        return this;
    }

    @Override
    public Object Method646(int n) {
        return this.Method6500(n);
    }

    @Override
    public Object Method645() {
        return this.Method6499();
    }
}

