/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.AxisAlignedBB
 */
package lavahack.client;

import net.minecraft.util.math.AxisAlignedBB;

public class Class1779 {
    public double Field16154;
    public double Field16155;
    public double Field16156;
    public double Field16157;
    public double Field16158;
    public double Field16159;
    private String Field16160 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1779(double d, double d2, double d3, double d4, double d5, double d6) {
        this.Field16154 = d;
        this.Field16155 = d2;
        this.Field16156 = d3;
        this.Field16157 = d4;
        this.Field16158 = d5;
        this.Field16159 = d6;
    }

    public AxisAlignedBB Method6744() {
        return new AxisAlignedBB(this.Field16154, this.Field16155, this.Field16156, this.Field16157, this.Field16158, this.Field16159);
    }
}

