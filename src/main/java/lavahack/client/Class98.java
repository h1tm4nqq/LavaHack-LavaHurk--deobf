/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.AxisAlignedBB
 */
package lavahack.client;

import java.awt.Color;
import lavahack.client.Class450;
import lavahack.client.Class815;
import net.minecraft.util.math.AxisAlignedBB;

final class Class98
extends Class450 {
    private String Field8351 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    void Method809(AxisAlignedBB axisAlignedBB, Color color, Color color2, boolean bl, Object ... objectArray) {
        if (bl) {
            Class815.Method3460(axisAlignedBB, color, color2);
            return;
        }
        Class815.Method3456(axisAlignedBB, color);
    }
}

