//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import java.awt.*;
import org.lwjgl.opengl.*;

enum Class101
{
    private String Field8353 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    Class101(final String s, final int n) {
    }
    
    @Override
    void Method809(final AxisAlignedBB axisAlignedBB, final Color color, final Color color2, final boolean b, final Object... array) {
        GL11.glPushMatrix();
        Class515.Method2376(color);
        Class515.Method2371((float)array[0]);
        this.Method813(axisAlignedBB);
        Class515.Method2372();
        this.Method813(axisAlignedBB);
        Class515.Method2373();
        Class515.Method2374(Color.WHITE.getRGB(), 1.0f);
        Class515.Method2376(b ? color2 : color);
        this.Method813(axisAlignedBB);
        Class515.Method2375(Float.intBitsToFloat(-1082130432));
        Class515.Method2376(Color.WHITE);
        GL11.glPopMatrix();
    }
    
    private void Method813(final AxisAlignedBB axisAlignedBB) {
        Class815.Method3456(axisAlignedBB, Class815.Field11486.Method3625());
    }
}
