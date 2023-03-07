//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import net.minecraft.util.math.BlockPos;

public class zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    public BlockPos Field8234;
    public float Field8235;
    public float Field8236;
    private String Field8237 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public zhtO2WlQkcPTQcPmkV0rKiawkpKiDvam$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(BlockPos blockPos, float f, float f2) {
        this.Field8234 = blockPos;
        this.Field8235 = f;
        this.Field8236 = f2;
    }

    public BlockPos Method656() {
        if (this.Field8234 != null) return this.Field8234.down();
        return BlockPos.ORIGIN;
    }
}

