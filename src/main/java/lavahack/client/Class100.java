/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.AxisAlignedBB
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import java.awt.Color;
import lavahack.client.Class450;
import lavahack.client.Class815;
import net.minecraft.util.math.AxisAlignedBB;
import org.lwjgl.opengl.GL11;

final class Class100
extends Class450 {
    private String Field8352 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    void Method809(AxisAlignedBB axisAlignedBB, Color color, Color color2, boolean bl, Object ... objectArray) {
        if (bl) {
            Class815.Method3461(axisAlignedBB, color, color2, ((Float)objectArray[0]).floatValue());
            return;
        }
        GL11.glLineWidth((float)((Float)objectArray[0]).floatValue());
        Class815.Method3458(axisAlignedBB, color);
    }
}

