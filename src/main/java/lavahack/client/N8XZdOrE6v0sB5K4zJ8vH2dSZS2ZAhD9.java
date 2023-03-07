/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import lavahack.client.WieLcrIxU3iYF11f2EiUDyi7gNqAZWP8;
import lavahack.client.iKUpnYaBt6HNrs8PJUT3axa8UVzZDz3R;
import org.lwjgl.opengl.GL20;

public class N8XZdOrE6v0sB5K4zJ8vH2dSZS2ZAhD9
extends WieLcrIxU3iYF11f2EiUDyi7gNqAZWP8 {
    private String Field8216 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public iKUpnYaBt6HNrs8PJUT3axa8UVzZDz3R Method649() {
        return new iKUpnYaBt6HNrs8PJUT3axa8UVzZDz3R(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public N8XZdOrE6v0sB5K4zJ8vH2dSZS2ZAhD9 Method650(int n) {
        GL20.glUniform4f((int)n, (float)((iKUpnYaBt6HNrs8PJUT3axa8UVzZDz3R)this.Method647()).Method7460(), (float)((iKUpnYaBt6HNrs8PJUT3axa8UVzZDz3R)this.Method647()).Method7462(), (float)((iKUpnYaBt6HNrs8PJUT3axa8UVzZDz3R)this.Method647()).Method7464(), (float)((iKUpnYaBt6HNrs8PJUT3axa8UVzZDz3R)this.Method647()).Method7466());
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

