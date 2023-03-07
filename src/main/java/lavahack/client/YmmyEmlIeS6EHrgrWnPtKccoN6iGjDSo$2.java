/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.RenderGlobal
 *  net.minecraft.client.renderer.chunk.RenderChunk
 *  net.minecraft.world.World
 */
package lavahack.client;

import lavahack.client.Tm0kFEbVFI8OLVdDSLk9WkpQRt7DCYBy;
import lavahack.client.YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo;
import lavahack.client.a9CGzjfBsN79tJcFsESk8MLpiTk6Tbrr;
import lavahack.client.aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC;
import lavahack.client.bTTjLUYiJ1rb5LeaazoxNbmwsWrYVk89;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.world.World;

class YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$2
implements a9CGzjfBsN79tJcFsESk8MLpiTk6Tbrr {
    final YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo Field13490;
    private int Field13491;

    YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$2(YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo) {
        this.Field13490 = ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo;
    }

    public RenderChunk Method4875(World world, RenderGlobal renderGlobal, int n) {
        return new bTTjLUYiJ1rb5LeaazoxNbmwsWrYVk89(world, renderGlobal, null, n);
    }

    @Override
    public aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC makeRenderOverlay(World world, RenderGlobal renderGlobal, int n) {
        return new Tm0kFEbVFI8OLVdDSLk9WkpQRt7DCYBy(world, renderGlobal, null, n);
    }
}

