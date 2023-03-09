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
import lavahack.client.Class515;
import lavahack.client.Class815;
import net.minecraft.util.math.AxisAlignedBB;
import org.lwjgl.opengl.GL11;

final class Class101
extends Class450 {
    private String Field8353 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    void Method809(AxisAlignedBB axisAlignedBB, Color color, Color color2, boolean bl, Object ... objectArray) {
        GL11.glPushMatrix();
        Class515.Method2376(color);
        Class515.Method2371(((Float)objectArray[0]).floatValue());
        this.Method813(axisAlignedBB);
        Class515.Method2372();
        this.Method813(axisAlignedBB);
        Class515.Method2373();
        Class515.Method2374(Color.WHITE.getRGB(), 1.0f);
        Class515.Method2376(bl ? color2 : color);
        this.Method813(axisAlignedBB);
        Class515.Method2375(Float.intBitsToFloat(-1082130432));
        Class515.Method2376(Color.WHITE);
        GL11.glPopMatrix();
    }

    private void Method813(AxisAlignedBB axisAlignedBB) {
        Class815.Method3456(axisAlignedBB, Class815.Field11486.Method3625());
    }
}

