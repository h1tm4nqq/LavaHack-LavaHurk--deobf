//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import net.minecraft.block.*;
import net.minecraft.util.*;

public class Class485 extends Class158
{
    private String Field10024 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class485() {
        super("gb");
    }
    
    public String Method447() {
        return "DON'T USE THIS PLEASE";
    }
    
    public String Method448() {
        return "kek i said don't use it";
    }
    
    public void Method443(@NotNull @NotNull final String s, @NotNull @NotNull final String[] array) {
        if (array.length < 1) {
            this.Method438(this.Method448());
            return;
        }
        final Block block = (Block)Block.REGISTRY.getObject((Object)new ResourceLocation(array[0]));
        if (block == null) {
            this.Method438(this.Method448());
            return;
        }
        Class485.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.world.setBlockState(Class485.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.objectMouseOver.getBlockPos().offset(Class485.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.objectMouseOver.sideHit), block.getDefaultState());
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7367 ^ 0xE1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
