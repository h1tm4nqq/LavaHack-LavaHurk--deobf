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
import lavahack.client.Class1467;
import net.minecraft.client.renderer.ChunkRenderContainer;

public abstract class Class2078
extends ChunkRenderContainer {
    protected List Field17502 = Lists.newArrayListWithCapacity(17424);
    private String Field17503 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void initialize(double d, double d2, double d3) {
        super.initialize(d, d2, d3);
        this.Field17502.clear();
    }

    public void addRenderOverlay(Class1467 class1467) {
        this.Field17502.add(class1467);
    }

    public abstract void renderOverlay();
}

