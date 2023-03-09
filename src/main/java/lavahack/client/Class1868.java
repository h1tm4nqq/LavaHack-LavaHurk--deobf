//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  lavahack.client.h0z1yvYP96doPrGLztrdTjS3jHWuMnCN
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3i
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1011;
import lavahack.client.Class1036;
import lavahack.client.Class138;
import lavahack.client.Class1631;
import lavahack.client.Class200;
import lavahack.client.Class2161;
import lavahack.client.h0z1yvYP96doPrGLztrdTjS3jHWuMnCN;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005J\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0007J\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010J&\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0007J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\tH&j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016\u00a8\u0006\u0017"}, d2={"Lcom/kisman/cc/features/module/combat/cityboss/Cases;", "", "(Ljava/lang/String;I)V", "down", "", "Lnet/minecraft/util/math/BlockPos;", "n", "", "facing", "Lnet/minecraft/util/EnumFacing;", "howManyAirs", "pos", "isIt", "", "isItInRange", "range", "", "posses", "MiddleCase", "SimpleCase1", "SimpleCase2", "LeftDiagonalCase", "RightDiagonalCase", "kisman.cc"})
public abstract class Class1868
extends Enum {
    public static final /* enum */ Class1868 Field16579;
    public static final /* enum */ Class1868 Field16580;
    public static final /* enum */ Class1868 Field16581;
    public static final /* enum */ Class1868 Field16582;
    public static final /* enum */ Class1868 Field16583;
    private static final Class1868[] Field16584;
    private int Field16585;

    static {
        Class1868[] class1868Array = new Class1868[5];
        Class1868[] class1868Array2 = class1868Array;
        class1868Array[0] = Field16579 = new Class200("MiddleCase", 0);
        class1868Array[1] = Field16580 = new Class138("SimpleCase1", 1);
        class1868Array[2] = Field16581 = new Class1011("SimpleCase2", 2);
        class1868Array[3] = Field16582 = new Class1631("LeftDiagonalCase", 3);
        class1868Array[4] = Field16583 = new Class2161("RightDiagonalCase", 4);
        Field16584 = class1868Array;
    }

    @NotNull
    @NotNull
    public abstract List Method942(@NotNull @NotNull EnumFacing var1);

    public final int Method943(@NotNull @NotNull EnumFacing enumFacing, @NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, (String)"facing");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        int n = 0;
        Iterator iterator = this.Method942(enumFacing).iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos2 = (BlockPos)iterator.next();
            BlockPos blockPos3 = blockPos.add((Vec3i)blockPos2);
            IBlockState iBlockState = Class2142.Field17803.world.getBlockState(blockPos3);
            Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(pos2)");
            if (!Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR)) continue;
            ++n;
        }
        return n;
    }

    public final int Method944(@NotNull @NotNull EnumFacing enumFacing, @NotNull @NotNull BlockPos blockPos, int n) {
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, (String)"facing");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        int n2 = 0;
        Iterator iterator = this.Method949(n, enumFacing).iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos2 = (BlockPos)iterator.next();
            BlockPos blockPos3 = blockPos.add((Vec3i)blockPos2);
            IBlockState iBlockState = Class2142.Field17803.world.getBlockState(blockPos3);
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
            if (!iterator.hasNext()) return true;
        } while (!(Class2142.Field17803.player.getDistanceSq(blockPos3 = blockPos.add((Vec3i)(blockPos2 = (BlockPos)iterator.next()))) > d * d));
        return false;
    }

    public final boolean Method946(@NotNull @NotNull EnumFacing enumFacing, @NotNull @NotNull BlockPos blockPos, double d, int n) {
        BlockPos blockPos2;
        BlockPos blockPos3;
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, (String)"facing");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        Iterator iterator = this.Method949(n, enumFacing).iterator();
        do {
            if (!iterator.hasNext()) return true;
        } while (!(Class2142.Field17803.player.getDistanceSq(blockPos3 = blockPos.add((Vec3i)(blockPos2 = (BlockPos)iterator.next()))) > d * d));
        return false;
    }

    public final boolean Method947(@NotNull @NotNull EnumFacing enumFacing, @NotNull @NotNull BlockPos blockPos) {
        BlockPos blockPos2;
        IBlockState iBlockState;
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, (String)"facing");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        Iterator iterator = this.Method942(enumFacing).iterator();
        do {
            if (!iterator.hasNext()) return true;
            BlockPos blockPos3 = (BlockPos)iterator.next();
            blockPos2 = blockPos.add((Vec3i)blockPos3);
            iBlockState = Class2142.Field17803.world.getBlockState(blockPos2);
            Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(pos2)");
        } while (!(Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR) ^ true) || Class1036.Method4189(blockPos2));
        return false;
    }

    public final boolean Method948(@NotNull @NotNull EnumFacing enumFacing, @NotNull @NotNull BlockPos blockPos, int n) {
        BlockPos blockPos2;
        IBlockState iBlockState;
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, (String)"facing");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        Iterator iterator = this.Method949(n, enumFacing).iterator();
        do {
            if (!iterator.hasNext()) return true;
            BlockPos blockPos3 = (BlockPos)iterator.next();
            blockPos2 = blockPos.add((Vec3i)blockPos3);
            iBlockState = Class2142.Field17803.world.getBlockState(blockPos2);
            Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(pos2)");
        } while (!(Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR) ^ true) || Class1036.Method4189(blockPos2));
        return false;
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
    private Class1868() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public Class1868() {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static Class1868[] values() {
        return (h0z1yvYP96doPrGLztrdTjS3jHWuMnCN[])Field16584.clone();
    }

    public static Class1868 valueOf(String string) {
        return Enum.valueOf(Class1868.class, string);
    }

    private static String Method950(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 60;
            cArray2[n] = (char)(cArray[n] ^ (0x52BF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

