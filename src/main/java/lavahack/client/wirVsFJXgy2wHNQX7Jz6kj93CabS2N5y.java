//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.util.ResourceLocation
 */
package lavahack.client;

import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class wirVsFJXgy2wHNQX7Jz6kj93CabS2N5y
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
    private String Field10024 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public wirVsFJXgy2wHNQX7Jz6kj93CabS2N5y() {
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
        if (stringArray.length < ((int)695046198L ^ 0x296D9037)) {
            this.Method438(this.Method448());
            return;
        }
        Block block = (Block)Block.REGISTRY.getObject((Object)new ResourceLocation(stringArray[(int)1780578121L ^ 0x6A217749]));
        if (block == null) {
            this.Method438(this.Method448());
            return;
        }
        wirVsFJXgy2wHNQX7Jz6kj93CabS2N5y.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.world.setBlockState(wirVsFJXgy2wHNQX7Jz6kj93CabS2N5y.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.objectMouseOver.getBlockPos().offset(wirVsFJXgy2wHNQX7Jz6kj93CabS2N5y.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.objectMouseOver.sideHit), block.getDefaultState());
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1360425948L ^ 0x511673DC;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)159219122 ^ (long)159219021);
            int n2 = (int)((long)-1958827233 ^ (long)-1958827010);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)849069400 ^ (long)849065535) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

