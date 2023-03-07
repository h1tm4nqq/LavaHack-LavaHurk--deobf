/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.RenderGlobal
 *  net.minecraft.client.renderer.chunk.RenderChunk
 *  net.minecraft.world.World
 */
package lavahack.client;

import lavahack.client.GIVMcDkGcwyYIORsbfcyxAitqYclAOVo;
import lavahack.client.YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo;
import lavahack.client.a9CGzjfBsN79tJcFsESk8MLpiTk6Tbrr;
import lavahack.client.aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.world.World;

class YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$1
implements a9CGzjfBsN79tJcFsESk8MLpiTk6Tbrr {
    final YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo Field13488;
    private String Field13489 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo$1(YmmyEmlIeS6EHrgrWnPtKccoN6iGjDSo ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo) {
        this.Field13488 = ymmyEmlIeS6EHrgrWnPtKccoN6iGjDSo;
    }

    public RenderChunk Method4874(World world, RenderGlobal renderGlobal, int n) {
        return new GIVMcDkGcwyYIORsbfcyxAitqYclAOVo(world, renderGlobal, n);
    }

    @Override
    public aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC makeRenderOverlay(World world, RenderGlobal renderGlobal, int n) {
        return new aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC(world, renderGlobal, n);
    }
}

