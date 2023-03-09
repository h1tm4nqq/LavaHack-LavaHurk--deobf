/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import com.kisman.cc.event.Class1273;
import com.kisman.cc.event.Class2157;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public class Class1336
extends Class2157 {
    private final BlockPos Field14109;
    private final EnumFacing Field14110;
    private int Field14111;

    public Class1336(BlockPos blockPos, EnumFacing enumFacing, Class1273 class1273) {
        super(class1273, new Object[0]);
        this.Field14109 = blockPos;
        this.Field14110 = enumFacing;
    }

    public BlockPos Method2155() {
        return this.Field14109;
    }

    public EnumFacing Method2156() {
        return this.Field14110;
    }
}

