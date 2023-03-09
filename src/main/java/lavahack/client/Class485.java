//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.util.ResourceLocation
 */
package lavahack.client;

import lavahack.client.Class158;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class Class485
extends Class158 {
    private String Field10024 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class485() {
        super("gb");
    }

    @Override
    public String Method447() {
        return "DON'T USE THIS PLEASE";
    }

    @Override
    public String Method448() {
        return "kek i said don't use it";
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        if (stringArray.length < 1) {
            this.Method438(this.Method448());
            return;
        }
        Block block = (Block)Block.REGISTRY.getObject((Object)new ResourceLocation(stringArray[0]));
        if (block == null) {
            this.Method438(this.Method448());
            return;
        }
        Class485.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.world.setBlockState(Class485.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.objectMouseOver.getBlockPos().offset(Class485.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.objectMouseOver.sideHit), block.getDefaultState());
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 225;
            cArray2[n] = (char)(cArray[n] ^ (0x7367 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

