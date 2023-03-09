/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.RenderGlobal
 *  net.minecraft.client.renderer.chunk.RenderChunk
 *  net.minecraft.world.World
 */
package lavahack.client;

import lavahack.client.Class1467;
import lavahack.client.Class1688;
import lavahack.client.Class1957;
import lavahack.client.Class290;
import lavahack.client.Class934;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.world.World;

class Class1209
implements Class1688 {
    final Class934 Field13490;
    private int Field13491;

    Class1209(Class934 class934) {
        this.Field13490 = class934;
    }

    public RenderChunk Method4875(World world, RenderGlobal renderGlobal, int n) {
        return new Class290(world, renderGlobal, null, n);
    }

    @Override
    public Class1467 makeRenderOverlay(World world, RenderGlobal renderGlobal, int n) {
        return new Class1957(world, renderGlobal, null, n);
    }
}

