//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.util.*;
import org.jetbrains.annotations.*;
import com.kisman.cc.util.*;
import net.minecraft.util.math.*;
import net.minecraft.init.*;
import net.minecraft.block.state.*;
import java.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005J\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0007J\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010J&\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0007J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\tH&j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016?\u0006\u0017" }, d2 = { "Lcom/kisman/cc/features/module/combat/cityboss/Cases;", "", "(Ljava/lang/String;I)V", "down", "", "Lnet/minecraft/util/math/BlockPos;", "n", "", "facing", "Lnet/minecraft/util/EnumFacing;", "howManyAirs", "pos", "isIt", "", "isItInRange", "range", "", "posses", "MiddleCase", "SimpleCase1", "SimpleCase2", "LeftDiagonalCase", "RightDiagonalCase", "kisman.cc" })
public enum Class1868
{
    Field16579("MiddleCase", 0), 
    Field16580("SimpleCase1", 1), 
    Field16581("SimpleCase2", 2), 
    Field16582("LeftDiagonalCase", 3), 
    Field16583("RightDiagonalCase", 4);
    
    private static final Class1868[] Field16584;
    private int Field16585;
    
    @NotNull
    @NotNull
    public abstract List Method942(@NotNull @NotNull final EnumFacing p0);
    
    public final int Method943(@NotNull @NotNull final EnumFacing enumFacing, @NotNull @NotNull final BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, "facing");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos");
        int n = 0;
        final Iterator<BlockPos> iterator = (Iterator<BlockPos>)this.Method942(enumFacing).iterator();
        while (iterator.hasNext()) {
            final IBlockState getBlockState = Class2142.Field17803.world.getBlockState(blockPos.add((Vec3i)iterator.next()));
            Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState, "mc.world.getBlockState(pos2)");
            if (Intrinsics.areEqual((Object)getBlockState.getBlock(), (Object)Blocks.AIR)) {
                ++n;
            }
        }
        return n;
    }
    
    public final int Method944(@NotNull @NotNull final EnumFacing enumFacing, @NotNull @NotNull final BlockPos blockPos, final int n) {
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, "facing");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos");
        int n2 = 0;
        final Iterator<BlockPos> iterator = (Iterator<BlockPos>)this.Method949(n, enumFacing).iterator();
        while (iterator.hasNext()) {
            final IBlockState getBlockState = Class2142.Field17803.world.getBlockState(blockPos.add((Vec3i)iterator.next()));
            Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState, "mc.world.getBlockState(pos2)");
            if (Intrinsics.areEqual((Object)getBlockState.getBlock(), (Object)Blocks.AIR)) {
                ++n2;
            }
        }
        return n2;
    }
    
    public final boolean Method945(@NotNull @NotNull final EnumFacing enumFacing, @NotNull @NotNull final BlockPos blockPos, final double n) {
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, "facing");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos");
        final Iterator<BlockPos> iterator = this.Method942(enumFacing).iterator();
        while (iterator.hasNext()) {
            if (Class2142.Field17803.player.getDistanceSq(blockPos.add((Vec3i)iterator.next())) > n * n) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean Method946(@NotNull @NotNull final EnumFacing enumFacing, @NotNull @NotNull final BlockPos blockPos, final double n, final int n2) {
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, "facing");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos");
        final Iterator<BlockPos> iterator = this.Method949(n2, enumFacing).iterator();
        while (iterator.hasNext()) {
            if (Class2142.Field17803.player.getDistanceSq(blockPos.add((Vec3i)iterator.next())) > n * n) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean Method947(@NotNull @NotNull final EnumFacing enumFacing, @NotNull @NotNull final BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, "facing");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos");
        final Iterator<BlockPos> iterator = (Iterator<BlockPos>)this.Method942(enumFacing).iterator();
        while (iterator.hasNext()) {
            final BlockPos add = blockPos.add((Vec3i)iterator.next());
            final IBlockState getBlockState = Class2142.Field17803.world.getBlockState(add);
            Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState, "mc.world.getBlockState(pos2)");
            if ((Intrinsics.areEqual((Object)getBlockState.getBlock(), (Object)Blocks.AIR) ^ true) && !Class1036.Method4189(add)) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean Method948(@NotNull @NotNull final EnumFacing enumFacing, @NotNull @NotNull final BlockPos blockPos, final int n) {
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, "facing");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos");
        final Iterator<BlockPos> iterator = (Iterator<BlockPos>)this.Method949(n, enumFacing).iterator();
        while (iterator.hasNext()) {
            final BlockPos add = blockPos.add((Vec3i)iterator.next());
            final IBlockState getBlockState = Class2142.Field17803.world.getBlockState(add);
            Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState, "mc.world.getBlockState(pos2)");
            if ((Intrinsics.areEqual((Object)getBlockState.getBlock(), (Object)Blocks.AIR) ^ true) && !Class1036.Method4189(add)) {
                return false;
            }
        }
        return true;
    }
    
    @NotNull
    @NotNull
    public final List Method949(final int n, @NotNull @NotNull final EnumFacing enumFacing) {
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, "facing");
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        final Iterator<BlockPos> iterator = this.Method942(enumFacing).iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().down(n));
        }
        return list;
    }
    
    private Class1868(final String name, final int ordinal) {
    }
    
    public Class1868(final String s, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        this(s, n);
    }
    
    private static String Method950(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x52BF ^ 0x3C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
