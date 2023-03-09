/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.RenderGlobal
 *  net.minecraft.client.renderer.chunk.RenderChunk
 *  net.minecraft.world.World
 */
package lavahack.client;

import lavahack.client.Class1438;
import lavahack.client.Class1467;
import lavahack.client.Class1688;
import lavahack.client.Class934;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.world.World;

class Class1208
implements Class1688 {
    final Class934 Field13488;
    private String Field13489 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    Class1208(Class934 class934) {
        this.Field13488 = class934;
    }

    public RenderChunk Method4874(World world, RenderGlobal renderGlobal, int n) {
        return new Class1438(world, renderGlobal, n);
    }

    @Override
    public Class1467 makeRenderOverlay(World world, RenderGlobal renderGlobal, int n) {
        return new Class1467(world, renderGlobal, n);
    }
}

