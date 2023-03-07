//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3i
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import lavahack.client.WieLcrIxU3iYF11f2EiUDyi7gNqAZWP8;
import net.minecraft.util.math.Vec3i;
import org.lwjgl.opengl.GL20;

public class k66XEz455befr4KUnTsC9VHjiCV9H5tl
extends WieLcrIxU3iYF11f2EiUDyi7gNqAZWP8 {
    private String Field15605 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Vec3i Method6358() {
        return new Vec3i((int)((long)-1933125506 ^ (long)-1933125506), (int)((long)1317598161 ^ (long)1317598161), (int)1342128287L ^ 0x4FFF409F);
    }

    public k66XEz455befr4KUnTsC9VHjiCV9H5tl Method6359(int n) {
        GL20.glUniform3i((int)n, (int)((Vec3i)this.Method647()).getX(), (int)((Vec3i)this.Method647()).getY(), (int)((Vec3i)this.Method647()).getZ());
        return this;
    }

    @Override
    public Object Method646(int n) {
        return this.Method6359(n);
    }

    @Override
    public Object Method645() {
        return this.Method6358();
    }
}

