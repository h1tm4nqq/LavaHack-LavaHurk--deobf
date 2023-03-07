/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import com.kisman.cc.event.Event;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public class t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r
extends Event {
    private BlockPos Field17527;
    private EnumFacing Field17528;
    private float Field17529;
    private int Field17530;
    private String Field17531 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r(BlockPos blockPos, EnumFacing enumFacing, float f, int n) {
        super(new Object[(int)1481687978L ^ 0x5850C3AA]);
        this.Field17527 = blockPos;
        this.Field17528 = enumFacing;
        this.Field17529 = f;
        this.Field17530 = n;
    }

    public t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r(BlockPos blockPos, EnumFacing enumFacing) {
        this(blockPos, enumFacing, 0.0f, (int)-721059333L ^ 0xD50581FB);
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

