//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3i
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.h0z1yvYP96doPrGLztrdTjS3jHWuMnCN$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.h0z1yvYP96doPrGLztrdTjS3jHWuMnCN$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.h0z1yvYP96doPrGLztrdTjS3jHWuMnCN$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.h0z1yvYP96doPrGLztrdTjS3jHWuMnCN$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import lavahack.client.h0z1yvYP96doPrGLztrdTjS3jHWuMnCN$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005J\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0007J\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010J&\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0007J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\tH&j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016\u00a8\u0006\u0017"}, d2={"Lcom/kisman/cc/features/module/combat/cityboss/Cases;", "", "(Ljava/lang/String;I)V", "down", "", "Lnet/minecraft/util/math/BlockPos;", "n", "", "facing", "Lnet/minecraft/util/EnumFacing;", "howManyAirs", "pos", "isIt", "", "isItInRange", "range", "", "posses", "MiddleCase", "SimpleCase1", "SimpleCase2", "LeftDiagonalCase", "RightDiagonalCase", "kisman.cc"})
public abstract class h0z1yvYP96doPrGLztrdTjS3jHWuMnCN
extends Enum {
    public static final /* enum */ h0z1yvYP96doPrGLztrdTjS3jHWuMnCN Field16579;
    public static final /* enum */ h0z1yvYP96doPrGLztrdTjS3jHWuMnCN Field16580;
    public static final /* enum */ h0z1yvYP96doPrGLztrdTjS3jHWuMnCN Field16581;
    public static final /* enum */ h0z1yvYP96doPrGLztrdTjS3jHWuMnCN Field16582;
    public static final /* enum */ h0z1yvYP96doPrGLztrdTjS3jHWuMnCN Field16583;
    private static final h0z1yvYP96doPrGLztrdTjS3jHWuMnCN[] Field16584;
    private int Field16585;

    static {
        h0z1yvYP96doPrGLztrdTjS3jHWuMnCN[] h0z1yvYP96doPrGLztrdTjS3jHWuMnCNArray = new h0z1yvYP96doPrGLztrdTjS3jHWuMnCN[(int)-550690329L ^ 0xDF2D21E2];
        h0z1yvYP96doPrGLztrdTjS3jHWuMnCN[] h0z1yvYP96doPrGLztrdTjS3jHWuMnCNArray2 = h0z1yvYP96doPrGLztrdTjS3jHWuMnCNArray;
        h0z1yvYP96doPrGLztrdTjS3jHWuMnCNArray[(int)403773918L ^ 0x181119DE] = Field16579 = new h0z1yvYP96doPrGLztrdTjS3jHWuMnCN$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("MiddleCase", (int)-1752578270L ^ 0x9789C722);
        h0z1yvYP96doPrGLztrdTjS3jHWuMnCNArray[(int)((long)579065793 ^ (long)579065792)] = Field16580 = new h0z1yvYP96doPrGLztrdTjS3jHWuMnCN$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV("SimpleCase1", (int)((long)1537274935 ^ (long)1537274934));
        h0z1yvYP96doPrGLztrdTjS3jHWuMnCNArray[(int)((long)136701475 ^ (long)136701474) << 1] = Field16581 = new h0z1yvYP96doPrGLztrdTjS3jHWuMnCN$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS("SimpleCase2", (int)((long)405911870 ^ (long)405911871) << 1);
        h0z1yvYP96doPrGLztrdTjS3jHWuMnCNArray[(int)((long)-1981453888 ^ (long)-1981453885)] = Field16582 = new h0z1yvYP96doPrGLztrdTjS3jHWuMnCN$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("LeftDiagonalCase", (int)((long)1685545935 ^ (long)1685545932));
        h0z1yvYP96doPrGLztrdTjS3jHWuMnCNArray[((int)-1185118073L ^ 0xB95C8886) << 2] = Field16583 = new h0z1yvYP96doPrGLztrdTjS3jHWuMnCN$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("RightDiagonalCase", (int)((long)-310132858 ^ (long)-310132857) << 2);
        Field16584 = h0z1yvYP96doPrGLztrdTjS3jHWuMnCNArray;
    }

    @NotNull
    @NotNull
    public abstract List Method942(@NotNull @NotNull EnumFacing var1);

    public final int Method943(@NotNull @NotNull EnumFacing enumFacing, @NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, (String)"facing");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        int n = (int)((long)-1912378837 ^ (long)-1912378837);
        Iterator iterator = this.Method942(enumFacing).iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos2 = (BlockPos)iterator.next();
            BlockPos blockPos3 = blockPos.add((Vec3i)blockPos2);
            IBlockState iBlockState = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world.getBlockState(blockPos3);
            Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(pos2)");
            if (!Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR)) continue;
            ++n;
        }
        return n;
    }

    public final int Method944(@NotNull @NotNull EnumFacing enumFacing, @NotNull @NotNull BlockPos blockPos, int n) {
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, (String)"facing");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        int n2 = (int)-1716206150L ^ 0x99B4C5BA;
        Iterator iterator = this.Method949(n, enumFacing).iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos2 = (BlockPos)iterator.next();
            BlockPos blockPos3 = blockPos.add((Vec3i)blockPos2);
            IBlockState iBlockState = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world.getBlockState(blockPos3);
            Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(pos2)");
            if (!Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR)) continue;
            ++n2;
        }
        return n2;
    }

    public final boolean Method945(@NotNull @NotNull EnumFacing enumFacing, @NotNull @NotNull BlockPos blockPos, double d) {
        BlockPos blockPos2;
        BlockPos blockPos3;
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, (String)"facing");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        Iterator iterator = this.Method942(enumFacing).iterator();
        do {
            if (!iterator.hasNext()) return ((int)-1122795122L ^ 0xBD13818F) != 0;
        } while (!(Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.getDistanceSq(blockPos3 = blockPos.add((Vec3i)(blockPos2 = (BlockPos)iterator.next()))) > d * d));
        return ((int)-650234145L ^ 0xD93E36DF) != 0;
    }

    public final boolean Method946(@NotNull @NotNull EnumFacing enumFacing, @NotNull @NotNull BlockPos blockPos, double d, int n) {
        BlockPos blockPos2;
        BlockPos blockPos3;
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, (String)"facing");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        Iterator iterator = this.Method949(n, enumFacing).iterator();
        do {
            if (!iterator.hasNext()) return (int)((long)371378395 ^ (long)371378394) != 0;
        } while (!(Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.getDistanceSq(blockPos3 = blockPos.add((Vec3i)(blockPos2 = (BlockPos)iterator.next()))) > d * d));
        return (int)((long)-660104522 ^ (long)-660104522) != 0;
    }

    public final boolean Method947(@NotNull @NotNull EnumFacing enumFacing, @NotNull @NotNull BlockPos blockPos) {
        BlockPos blockPos2;
        IBlockState iBlockState;
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, (String)"facing");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        Iterator iterator = this.Method942(enumFacing).iterator();
        do {
            if (!iterator.hasNext()) return ((int)873316427L ^ 0x340DC04A) != 0;
            BlockPos blockPos3 = (BlockPos)iterator.next();
            blockPos2 = blockPos.add((Vec3i)blockPos3);
            iBlockState = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world.getBlockState(blockPos2);
            Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(pos2)");
        } while ((Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR) ^ ((int)-1191146803L ^ 0xB9008ACC)) == 0 || h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4189(blockPos2));
        return ((int)102881633L ^ 0x621D961) != 0;
    }

    public final boolean Method948(@NotNull @NotNull EnumFacing enumFacing, @NotNull @NotNull BlockPos blockPos, int n) {
        BlockPos blockPos2;
        IBlockState iBlockState;
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, (String)"facing");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        Iterator iterator = this.Method949(n, enumFacing).iterator();
        do {
            if (!iterator.hasNext()) return ((int)-2008556029L ^ 0x8847DE02) != 0;
            BlockPos blockPos3 = (BlockPos)iterator.next();
            blockPos2 = blockPos.add((Vec3i)blockPos3);
            iBlockState = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world.getBlockState(blockPos2);
            Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(pos2)");
        } while ((Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR) ^ ((int)-1835298071L ^ 0x929B92E8)) == 0 || h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4189(blockPos2));
        return (int)((long)1206794520 ^ (long)1206794520) != 0;
    }

    @NotNull
    @NotNull
    public final List Method949(int n, @NotNull @NotNull EnumFacing enumFacing) {
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, (String)"facing");
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        Iterator iterator = this.Method942(enumFacing).iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            arrayList.add(blockPos.down(n));
        }
        return arrayList;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private h0z1yvYP96doPrGLztrdTjS3jHWuMnCN() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public h0z1yvYP96doPrGLztrdTjS3jHWuMnCN() {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static h0z1yvYP96doPrGLztrdTjS3jHWuMnCN[] values() {
        return (h0z1yvYP96doPrGLztrdTjS3jHWuMnCN[])Field16584.clone();
    }

    public static h0z1yvYP96doPrGLztrdTjS3jHWuMnCN valueOf(String string) {
        return Enum.valueOf(h0z1yvYP96doPrGLztrdTjS3jHWuMnCN.class, string);
    }

    private static String Method950(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)621731968L ^ 0x250EE080;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1156470042L ^ 0x44EE55E5);
            int n2 = (int)((long)-993733873 ^ (long)-993733888) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)481750016L ^ 0x1CB6BEBF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

