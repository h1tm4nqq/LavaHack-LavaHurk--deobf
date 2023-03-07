//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.ChunkRenderContainer
 */
package lavahack.client;

import com.google.common.collect.Lists;
import java.util.List;
import lavahack.client.aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC;
import net.minecraft.client.renderer.ChunkRenderContainer;

public abstract class UOp9aIVeGSZJn6Z2lXodUWEdtB61Dcql
extends ChunkRenderContainer {
    protected List Field17502 = Lists.newArrayListWithCapacity(((int)283529651L ^ 0x10E655F2) << 4);
    private String Field17503 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void initialize(double d, double d2, double d3) {
        super.initialize(d, d2, d3);
        this.Field17502.clear();
    }

    public void addRenderOverlay(aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC2) {
        this.Field17502.add(aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC2);
    }

    public abstract void renderOverlay();
}

