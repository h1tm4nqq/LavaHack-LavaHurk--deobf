//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import net.minecraft.client.Minecraft;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 {
    private static final Minecraft Field13616 = Minecraft.getMinecraft();
    public double Field13617;
    public double Field13618;
    public double Field13619;
    public double Field13620;
    public double Field13621;
    public double Field13622;
    boolean Field13623;
    private String Field13624 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2(AxisAlignedBB axisAlignedBB) {
        this.Field13623 = (int)((long)17479171 ^ (long)17479171);
        this.Field13617 = axisAlignedBB.minX;
        this.Field13618 = axisAlignedBB.minY;
        this.Field13619 = axisAlignedBB.minZ;
        this.Field13620 = axisAlignedBB.maxX;
        this.Field13621 = axisAlignedBB.maxY;
        this.Field13622 = axisAlignedBB.maxZ;
    }

    public ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2(BlockPos blockPos) {
        this(new AxisAlignedBB(blockPos));
    }

    private ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2(double d, double d2, double d3, double d4, double d5, double d6) {
        this.Field13623 = (int)((long)213877096 ^ (long)213877096);
        this.Field13617 = d;
        this.Field13618 = d2;
        this.Field13619 = d3;
        this.Field13620 = d4;
        this.Field13621 = d5;
        this.Field13622 = d6;
    }

    public ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 Method4967(double d) {
        this.Field13617 -= d;
        this.Field13618 -= d;
        this.Field13619 -= d;
        this.Field13620 += d;
        this.Field13621 += d;
        this.Field13622 += d;
        return this;
    }

    public ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 Method4968(double d, double d2, double d3) {
        this.Field13617 -= d;
        this.Field13618 -= d2;
        this.Field13619 -= d3;
        this.Field13620 += d;
        this.Field13621 += d2;
        this.Field13622 += d3;
        return this;
    }

    public ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 Method4969(double d) {
        this.Field13617 -= d;
        this.Field13620 += d;
        return this;
    }

    public ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 Method4970(double d) {
        this.Field13618 -= d;
        this.Field13621 += d;
        return this;
    }

    public ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 Method4971(double d) {
        this.Field13619 -= d;
        this.Field13622 -= d;
        return this;
    }

    public ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 Method4972(double d, double d2, double d3) {
        double d4 = (this.Field13620 - this.Field13617) * Double.longBitsToDouble((long)700676335 ^ 0x3FE0000029C378EFL);
        double d5 = (this.Field13621 - this.Field13618) * Double.longBitsToDouble(0x90F6E3D5C55D4E9FL ^ 0xAF16E3D5C55D4E9FL);
        double d6 = (this.Field13622 - this.Field13619) * Double.longBitsToDouble(0x3B7452026D371EC3L ^ 0x49452026D371EC3L);
        this.Field13617 = d - d4;
        this.Field13618 = d2 - d5;
        this.Field13619 = d3 - d6;
        this.Field13620 = d + d4;
        this.Field13621 = d2 + d5;
        this.Field13622 = d3 + d6;
        return this;
    }

    public ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 Method4973(Vec3d vec3d) {
        this.Method4972(vec3d.x, vec3d.y, vec3d.z);
        return this;
    }

    public ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 Method4974(ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22) {
        this.Method4973(ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Method4977());
        return this;
    }

    public ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 Method4975(AxisAlignedBB axisAlignedBB) {
        this.Method4973(new ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2(axisAlignedBB).Method4977());
        return this;
    }

    public ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 Method4976(BlockPos blockPos) {
        this.Method4973(new ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2(blockPos).Method4977());
        return this;
    }

    public Vec3d Method4977() {
        double d = (this.Field13620 - this.Field13617) * Double.longBitsToDouble((long)228976620 ^ 0x3FE000000DA5E7ECL);
        double d2 = (this.Field13621 - this.Field13618) * Double.longBitsToDouble(0x3768A66CDA7B0F76L ^ 0x888A66CDA7B0F76L);
        double d3 = (this.Field13622 - this.Field13619) * Double.longBitsToDouble(0xA340F48BC40D8A3AL ^ 0x9CA0F48BC40D8A3AL);
        return new Vec3d(this.Field13617 + d, this.Field13618 + d2, this.Field13619 + d3);
    }

    public ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 Method4978(double d, double d2, double d3) {
        this.Field13617 += d;
        this.Field13618 += d2;
        this.Field13619 += d3;
        this.Field13620 += d;
        this.Field13621 += d2;
        this.Field13622 += d3;
        return this;
    }

    public ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 Method4979(Vec3d vec3d) {
        this.Method4978(vec3d.x, vec3d.y, vec3d.z);
        return this;
    }

    public ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 Method4980(double d, double d2, double d3) {
        Vec3d vec3d = this.Method4977();
        double d4 = vec3d.x;
        double d5 = vec3d.y;
        double d6 = vec3d.z;
        this.Field13617 = d4;
        this.Field13618 = d5;
        this.Field13619 = d6;
        this.Field13620 = d4;
        this.Field13621 = d5;
        this.Field13622 = d6;
        this.Method4968(d * Double.longBitsToDouble((long)814813373 ^ 0x3FE00000309110BDL), d2 * Double.longBitsToDouble((long)1347036092 ^ 0x3FE00000504A23BCL), d3 * Double.longBitsToDouble(0xE484A35008688FFCL ^ 0xDB64A35008688FFCL));
        return this;
    }

    public ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 Method4981(double d, double d2, double d3) {
        Vec3d vec3d = this.Method4977();
        double d4 = vec3d.x;
        double d5 = vec3d.y;
        double d6 = vec3d.z;
        ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22 = new ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2(d4, d5, d6, d4, d5, d6);
        ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Method4968(d * Double.longBitsToDouble(0x70B97A9948510226L ^ 0x4F597A9948510226L), d2 * Double.longBitsToDouble((long)1399903370 ^ 0x3FE000005370D48AL), d3 * Double.longBitsToDouble((long)1187802843 ^ 0x3FE0000046CC6EDBL));
        return ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22;
    }

    public boolean Method4982(ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22) {
        return this.Method4989().intersects(ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Method4989());
    }

    public boolean Method4983(AxisAlignedBB axisAlignedBB) {
        return this.Method4989().intersects(axisAlignedBB);
    }

    public boolean Method4984(double d, double d2, double d3) {
        return this.Method4989().contains(new Vec3d(d, d2, d3));
    }

    public boolean Method4985(Vec3d vec3d) {
        return this.Method4989().contains(vec3d);
    }

    public boolean Method4986(ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22) {
        int n;
        AxisAlignedBB axisAlignedBB = this.Method4989();
        Vec3d vec3d = new Vec3d(ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13617, ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13618, ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13619);
        Vec3d vec3d2 = new Vec3d(ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13620, ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13621, ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13622);
        if (axisAlignedBB.contains(vec3d) && axisAlignedBB.contains(vec3d2)) {
            n = (int)-2052260609L ^ 0x85ACFCFE;
            return n != 0;
        }
        n = (int)((long)-130873860 ^ (long)-130873860);
        return n != 0;
    }

    public boolean Method4987(AxisAlignedBB axisAlignedBB) {
        int n;
        AxisAlignedBB axisAlignedBB2 = this.Method4989();
        Vec3d vec3d = new Vec3d(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ);
        Vec3d vec3d2 = new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        if (axisAlignedBB2.contains(vec3d) && axisAlignedBB2.contains(vec3d2)) {
            n = (int)((long)-584261688 ^ (long)-584261687);
            return n != 0;
        }
        n = (int)-276695018L ^ 0xEF81F816;
        return n != 0;
    }

    public ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 Method4988() {
        this.Field13617 -= ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2.Field13616.renderManager.viewerPosX;
        this.Field13618 -= ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2.Field13616.renderManager.viewerPosY;
        this.Field13619 -= ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2.Field13616.renderManager.viewerPosZ;
        this.Field13620 -= ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2.Field13616.renderManager.viewerPosX;
        this.Field13621 -= ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2.Field13616.renderManager.viewerPosY;
        this.Field13622 -= ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2.Field13616.renderManager.viewerPosZ;
        this.Field13623 = (int)-803295287L ^ 0xD01EAFC8;
        return this;
    }

    public AxisAlignedBB Method4989() {
        return new AxisAlignedBB(this.Field13617, this.Field13618, this.Field13619, this.Field13620, this.Field13621, this.Field13622);
    }

    public boolean equals(Object object) {
        if (object == null) {
            return ((int)-1939670989L ^ 0x8C62F833) != 0;
        }
        if (!(object instanceof ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2)) {
            return (int)((long)1555621487 ^ (long)1555621487) != 0;
        }
        ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2 ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22 = (ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX2)object;
        int n = this.Field13617 == ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13617 ? (int)-509532439L ^ 0xE1A126E8 : (int)((long)1459806027 ^ (long)1459806027);
        int n2 = this.Field13618 == ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13618 ? (int)((long)-577773383 ^ (long)-577773384) : (int)((long)-364504210 ^ (long)-364504210);
        int n3 = this.Field13619 == ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13619 ? (int)((long)-121591285 ^ (long)-121591286) : (int)((long)-1934117993 ^ (long)-1934117993);
        int n4 = this.Field13620 == ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13620 ? (int)((long)-943923202 ^ (long)-943923201) : (int)((long)-723210682 ^ (long)-723210682);
        int n5 = this.Field13621 == ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13621 ? (int)-1971330265L ^ 0x8A7FE326 : (int)30682842L ^ 0x1D42EDA;
        int n6 = this.Field13622 == ugPbuiuGgcYcCu9CxI86jX0HDuJc8OX22.Field13622 ? (int)((long)1005459269 ^ (long)1005459268) : (int)1065802866L ^ 0x3F86DC72;
        return ((int)-874612411L ^ 0xCBDE7945) != 0;
    }
}

