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
import lavahack.client.Class1123;
import lavahack.client.Class219;
import lavahack.client.Class725;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class Class897 {
    public static final Class897 Field11762 = new Class897();
    private HashMap Field11763 = new HashMap();
    private String Field11764 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void Method3734(Block block, Class1123 class1123) {
        if (block == null) return;
        if (class1123 == null) {
            return;
        }
        this.Field11763.put(block, class1123);
    }

    public Class1123 Method3735(Block block) {
        return (Class1123)this.Field11763.get(block);
    }

    static {
        Field11762.Method3734(Blocks.COMMAND_BLOCK, new Class219());
        Field11762.Method3734(Blocks.STANDING_SIGN, new Class725());
        Field11762.Method3734(Blocks.WALL_SIGN, new Class725());
    }
}

