//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.init.Blocks
 */
package lavahack.client;

import java.util.HashMap;
import lavahack.client.RXDPheW5VxeXoDuGBTdlLOcCZ38ra0JI;
import lavahack.client.ZBq6CEZnP4fRvdpQagwRm8pwTK9DfXIq;
import lavahack.client.lXpyibl8VybzmWxCSwwAPlkssmoQc3SE;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class VHIZhlnrB3zAeyoJuUVherdYJSCQT213 {
    public static final VHIZhlnrB3zAeyoJuUVherdYJSCQT213 Field11762 = new VHIZhlnrB3zAeyoJuUVherdYJSCQT213();
    private HashMap Field11763 = new HashMap();
    private String Field11764 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void Method3734(Block block, ZBq6CEZnP4fRvdpQagwRm8pwTK9DfXIq zBq6CEZnP4fRvdpQagwRm8pwTK9DfXIq) {
        if (block == null) return;
        if (zBq6CEZnP4fRvdpQagwRm8pwTK9DfXIq == null) {
            return;
        }
        this.Field11763.put(block, zBq6CEZnP4fRvdpQagwRm8pwTK9DfXIq);
    }

    public ZBq6CEZnP4fRvdpQagwRm8pwTK9DfXIq Method3735(Block block) {
        return (ZBq6CEZnP4fRvdpQagwRm8pwTK9DfXIq)this.Field11763.get(block);
    }

    static {
        Field11762.Method3734(Blocks.COMMAND_BLOCK, new RXDPheW5VxeXoDuGBTdlLOcCZ38ra0JI());
        Field11762.Method3734(Blocks.STANDING_SIGN, new lXpyibl8VybzmWxCSwwAPlkssmoQc3SE());
        Field11762.Method3734(Blocks.WALL_SIGN, new lXpyibl8VybzmWxCSwwAPlkssmoQc3SE());
    }
}

