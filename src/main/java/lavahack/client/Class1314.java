/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.chunk.RenderChunk
 *  net.minecraft.util.EnumFacing
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package lavahack.client;

import java.util.EnumSet;
import java.util.Set;
import lavahack.client.Class1467;
import lavahack.client.Class934;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(value=Side.CLIENT)
class Class1314 {
    final RenderChunk Field14045;
    final Class1467 Field14046;
    final EnumFacing Field14047;
    final Set Field14048;
    final int Field14049;
    final Class934 Field14050;
    private String Field14051 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    Class1314(Class934 class934, RenderChunk renderChunk, Class1467 class1467, EnumFacing enumFacing, int n) {
        this.Field14050 = class934;
        this.Field14048 = EnumSet.noneOf(EnumFacing.class);
        this.Field14045 = renderChunk;
        this.Field14046 = class1467;
        this.Field14047 = enumFacing;
        this.Field14049 = n;
    }
}

