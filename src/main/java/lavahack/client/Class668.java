//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import net.minecraft.util.math.BlockPos;

public enum Class668 {
    Field10833(0, -1, 0),
    Field10834(0, 1, 0),
    Field10835(0, 0, -1),
    Field10836(1, 0, 0),
    Field10837(0, 0, 1),
    Field10838(-1, 0, 0);

    private final int Field10839;
    private final int Field10840;
    private final int Field10841;
    private String Field10843 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class668(int n3) {
        void var5_3;
        void var4_2;
        this.Field10839 = n3;
        this.Field10840 = var4_2;
        this.Field10841 = var5_3;
    }

    public BlockPos Method2846(BlockPos blockPos) {
        return blockPos.add(this.Field10839, this.Field10840, this.Field10841);
    }

    public BlockPos Method2847(BlockPos blockPos, int n) {
        return blockPos.add(this.Field10839 * n, 0, this.Field10841 * n);
    }

    public BlockPos Method2848(BlockPos blockPos, int n) {
        return blockPos.add(-this.Field10839 * n, 0, -this.Field10841 * n);
    }

    public BlockPos Method2849(BlockPos blockPos, int n) {
        return blockPos.add(this.Field10841 * n, 0, -this.Field10839 * n);
    }

    public BlockPos Method2850(BlockPos blockPos, int n) {
        return blockPos.add(-this.Field10841 * n, 0, this.Field10839 * n);
    }

    private static String Method2851(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 88;
            cArray2[n] = (char)(cArray[n] ^ (0x1295 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

