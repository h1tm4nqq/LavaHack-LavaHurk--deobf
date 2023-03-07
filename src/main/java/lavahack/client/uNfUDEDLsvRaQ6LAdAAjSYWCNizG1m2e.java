//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec2f
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import lavahack.client.WieLcrIxU3iYF11f2EiUDyi7gNqAZWP8;
import net.minecraft.util.math.Vec2f;
import org.lwjgl.opengl.GL20;

public class uNfUDEDLsvRaQ6LAdAAjSYWCNizG1m2e
extends WieLcrIxU3iYF11f2EiUDyi7gNqAZWP8 {
    private String Field14867 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Vec2f Method5913() {
        return new Vec2f(0.0f, 0.0f);
    }

    public uNfUDEDLsvRaQ6LAdAAjSYWCNizG1m2e Method5914(int n) {
        GL20.glUniform2f((int)n, (float)((Vec2f)this.Method647()).x, (float)((Vec2f)this.Method647()).y);
        return this;
    }

    @Override
    public Object Method646(int n) {
        return this.Method5914(n);
    }

    @Override
    public Object Method645() {
        return this.Method5913();
    }
}

