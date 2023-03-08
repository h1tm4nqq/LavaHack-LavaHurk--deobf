//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import net.minecraft.block.*;
import net.minecraft.init.*;

public class Class897
{
    public static final Class897 Field11762;
    private HashMap Field11763;
    private String Field11764 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class897() {
        this.Field11763 = new HashMap();
    }
    
    public void Method3734(final Block key, final Class1123 value) {
        if (key == null || value == null) {
            return;
        }
        this.Field11763.put(key, value);
    }
    
    public Class1123 Method3735(final Block key) {
        return this.Field11763.get(key);
    }
    
    static {
        (Field11762 = new Class897()).Method3734(Blocks.COMMAND_BLOCK, (Class1123)new Class219());
        Class897.Field11762.Method3734(Blocks.STANDING_SIGN, (Class1123)new Class725());
        Class897.Field11762.Method3734(Blocks.WALL_SIGN, (Class1123)new Class725());
    }
}
