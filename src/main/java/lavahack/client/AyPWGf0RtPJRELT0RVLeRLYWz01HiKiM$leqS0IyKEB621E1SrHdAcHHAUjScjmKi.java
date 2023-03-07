//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import net.minecraft.util.math.BlockPos;

public final class AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10833 = new AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("DOWN", (int)-606886098L ^ 0xDBD3A72E, (int)((long)1434694030 ^ (long)1434694030), (int)((long)-716888891 ^ (long)716888890), (int)1125209238L ^ 0x43115496);
    public static final /* enum */ AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10834 = new AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("UP", (int)556578869L ^ 0x212CB834, (int)631328763L ^ 0x25A14FFB, (int)1847526007L ^ 0x6E1F0276, (int)710409375L ^ 0x2A57FC9F);
    public static final /* enum */ AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10835 = new AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("NORTH", (int)((long)-905072322 ^ (long)-905072321) << 1, (int)908527618L ^ 0x36270802, (int)((long)-600004032 ^ (long)-600004032), (int)-2024415719L ^ 0x78AA21E6);
    public static final /* enum */ AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10836 = new AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("EAST", (int)1338864851L ^ 0x4FCD74D0, (int)((long)-656549959 ^ (long)-656549960), (int)869050710L ^ 0x33CCA956, (int)((long)1619493656 ^ (long)1619493656));
    public static final /* enum */ AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10837 = new AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("SOUTH", (int)((long)1866672028 ^ (long)1866672029) << 2, (int)874624440L ^ 0x3421B5B8, (int)((long)193332198 ^ (long)193332198), (int)((long)-2047204340 ^ (long)-2047204339));
    public static final /* enum */ AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10838 = new AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("WEST", (int)594940000L ^ 0x23761065, (int)((long)-320142018 ^ (long)320142017), (int)1960009057L ^ 0x74D35D61, (int)1667869341L ^ 0x6369AA9D);
    private final int Field10839;
    private final int Field10840;
    private final int Field10841;
    private static final AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field10842;
    private String Field10843 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field10842.clone();
    }

    public static AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(int n3) {
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
        this.Field10839 = n3;
        this.Field10840 = var4_2;
        this.Field10841 = var5_3;
    }

    public BlockPos Method2846(BlockPos blockPos) {
        return blockPos.add(this.Field10839, this.Field10840, this.Field10841);
    }

    public BlockPos Method2847(BlockPos blockPos, int n) {
        return blockPos.add(this.Field10839 * n, (int)113480024L ^ 0x6C39158, this.Field10841 * n);
    }

    public BlockPos Method2848(BlockPos blockPos, int n) {
        return blockPos.add(-this.Field10839 * n, (int)((long)16691902 ^ (long)16691902), -this.Field10841 * n);
    }

    public BlockPos Method2849(BlockPos blockPos, int n) {
        return blockPos.add(this.Field10841 * n, (int)((long)-397459849 ^ (long)-397459849), -this.Field10839 * n);
    }

    public BlockPos Method2850(BlockPos blockPos, int n) {
        return blockPos.add(-this.Field10841 * n, (int)1672078206L ^ 0x63A9E37E, this.Field10839 * n);
    }

    static {
        AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)-1480965216 ^ (long)-1480965213) << 1];
        ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)1456951864L ^ 0x56D75238] = Field10833;
        ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)486934005L ^ 0x1D0605F4] = Field10834;
        ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)-1472418684L ^ 0xA83CAC85) << 1] = Field10835;
        ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-1077361764L ^ 0xBFC8C39F] = Field10836;
        ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)-1364614093L ^ 0xAEA9A432) << 2] = Field10837;
        ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-1291598616 ^ (long)-1291598611)] = Field10838;
        Field10842 = ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method2851(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)474243550L ^ 0x1C4461DE;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1119125477L ^ 0xBD4B80E4);
            int n2 = (int)((long)-1930979371 ^ (long)-1930979362) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)428031009L ^ 0x19832EB4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

