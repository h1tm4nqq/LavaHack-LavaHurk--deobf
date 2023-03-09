/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import com.kisman.cc.event.Class2157;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public class Class2087
extends Class2157 {
    private BlockPos Field17527;
    private EnumFacing Field17528;
    private float Field17529;
    private int Field17530;
    private String Field17531 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class2087(BlockPos blockPos, EnumFacing enumFacing, float f, int n) {
        super(new Object[0]);
        this.Field17527 = blockPos;
        this.Field17528 = enumFacing;
        this.Field17529 = f;
        this.Field17530 = n;
    }

    public Class2087(BlockPos blockPos, EnumFacing enumFacing) {
        this(blockPos, enumFacing, 0.0f, 0);
    }

    public BlockPos Method7625() {
        return this.Field17527;
    }

    public EnumFacing Method7626() {
        return this.Field17528;
    }

    public float Method7627() {
        return this.Field17529;
    }

    public int Method7628() {
        return this.Field17530;
    }
}

