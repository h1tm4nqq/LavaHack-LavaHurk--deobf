/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.AxisAlignedBB
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import java.awt.Color;
import lavahack.client.Q5goBrGBdcA85lMImUU3gzDjqGj6w2n5;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import net.minecraft.util.math.AxisAlignedBB;
import org.lwjgl.opengl.GL11;

final class exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$3
extends exalTBqSufwHR1VdwyK23X5QNwSlzh5j$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf {
    private String Field8353 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    void Method809(AxisAlignedBB axisAlignedBB, Color color, Color color2, boolean bl, Object ... objectArray) {
        GL11.glPushMatrix();
        Q5goBrGBdcA85lMImUU3gzDjqGj6w2n5.Method2376(color);
        Q5goBrGBdcA85lMImUU3gzDjqGj6w2n5.Method2371(((Float)objectArray[(int)((long)1903221381 ^ (long)1903221381)]).floatValue());
        this.Method813(axisAlignedBB);
        Q5goBrGBdcA85lMImUU3gzDjqGj6w2n5.Method2372();
        this.Method813(axisAlignedBB);
        Q5goBrGBdcA85lMImUU3gzDjqGj6w2n5.Method2373();
        Q5goBrGBdcA85lMImUU3gzDjqGj6w2n5.Method2374(Color.WHITE.getRGB(), 1.0f);
        Q5goBrGBdcA85lMImUU3gzDjqGj6w2n5.Method2376(bl ? color2 : color);
        this.Method813(axisAlignedBB);
        Q5goBrGBdcA85lMImUU3gzDjqGj6w2n5.Method2375(Float.intBitsToFloat(0x6A8AB4E9 ^ 0xD50AB4E9));
        Q5goBrGBdcA85lMImUU3gzDjqGj6w2n5.Method2376(Color.WHITE);
        GL11.glPopMatrix();
    }

    private void Method813(AxisAlignedBB axisAlignedBB) {
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3456(axisAlignedBB, exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11486.Method3625());
    }
}

