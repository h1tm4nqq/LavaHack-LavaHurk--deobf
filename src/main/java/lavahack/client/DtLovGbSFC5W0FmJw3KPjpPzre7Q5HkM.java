/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL13
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import lavahack.client.WieLcrIxU3iYF11f2EiUDyi7gNqAZWP8;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;

public class DtLovGbSFC5W0FmJw3KPjpPzre7Q5HkM
extends WieLcrIxU3iYF11f2EiUDyi7gNqAZWP8 {
    private String Field17362 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Integer Method7530() {
        return (int)((long)-810084742 ^ (long)-810084742);
    }

    public DtLovGbSFC5W0FmJw3KPjpPzre7Q5HkM Method7531(int n) {
        GL13.glActiveTexture((int)(((int)-1652270505L ^ 0x9D844ACE) << 3));
        GL11.glBindTexture((int)((int)((long)1039526891 ^ (long)1039525386)), (int)((Integer)this.Method647()));
        GL20.glUniform1i((int)n, (int)(((int)1002408672L ^ 0x3BBF8AE1) << 3));
        GL13.glActiveTexture((int)((int)((long)-273628926 ^ (long)-273628399) << 6));
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

