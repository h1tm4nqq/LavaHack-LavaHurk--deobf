/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import net.minecraft.util.math.BlockPos;

class Class1651 {
    private final BlockPos Field15672;
    private final double Field15673;
    private final double Field15674;
    private int Field15675;

    public Class1651(BlockPos blockPos, double d, double d2) {
        this.Field15672 = blockPos;
        this.Field15673 = d;
        this.Field15674 = d2;
    }

    public BlockPos Method6401() {
        return this.Field15672;
    }

    public double Method6402() {
        return this.Field15673;
    }

    public double Method6403() {
        return this.Field15674;
    }

    public Class1651 Method6404(Class1651 class1651) {
        Class1651 class16512;
        if (class1651.Field15673 > this.Field15673) {
            class16512 = class1651;
            return class16512;
        }
        class16512 = this;
        return class16512;
    }

    static double Method6405(Class1651 class1651) {
        return class1651.Field15673;
    }
}

