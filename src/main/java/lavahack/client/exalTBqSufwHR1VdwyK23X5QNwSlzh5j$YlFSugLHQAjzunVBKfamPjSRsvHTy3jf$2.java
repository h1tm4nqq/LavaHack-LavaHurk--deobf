/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.AxisAlignedBB
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import java.awt.Color;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import net.minecraft.util.math.AxisAlignedBB;
import org.lwjgl.opengl.GL11;

final class exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$2
extends exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf {
    private String Field8352 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    void Method809(AxisAlignedBB axisAlignedBB, Color color, Color color2, boolean bl, Object ... objectArray) {
        if (bl) {
            exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3461(axisAlignedBB, color, color2, ((Float)objectArray[(int)-1748405L ^ 0xFFE5524B]).floatValue());
            return;
        }
        GL11.glLineWidth((float)((Float)objectArray[(int)-1604151926L ^ 0xA062958A]).floatValue());
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3458(axisAlignedBB, color);
    }
}

