//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import java.awt.*;
import org.lwjgl.opengl.*;

enum Class100
{
    private String Field8352 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    Class100(final String s, final int n) {
    }
    
    @Override
    void Method809(final AxisAlignedBB axisAlignedBB, final Color color, final Color color2, final boolean b, final Object... array) {
        if (b) {
            Class815.Method3461(axisAlignedBB, color, color2, (float)array[0]);
        }
        else {
            GL11.glLineWidth((float)array[0]);
            Class815.Method3458(axisAlignedBB, color);
        }
    }
}
