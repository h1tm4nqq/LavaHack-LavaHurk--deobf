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

public class Class1240 {
    private static final Minecraft Field13616 = Minecraft.getMinecraft();
    public double Field13617;
    public double Field13618;
    public double Field13619;
    public double Field13620;
    public double Field13621;
    public double Field13622;
    boolean Field13623 = false;
    private String Field13624 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1240(AxisAlignedBB axisAlignedBB) {
        this.Field13617 = axisAlignedBB.minX;
        this.Field13618 = axisAlignedBB.minY;
        this.Field13619 = axisAlignedBB.minZ;
        this.Field13620 = axisAlignedBB.maxX;
        this.Field13621 = axisAlignedBB.maxY;
        this.Field13622 = axisAlignedBB.maxZ;
    }

    public Class1240(BlockPos blockPos) {
        this(new AxisAlignedBB(blockPos));
    }

    private Class1240(double d, double d2, double d3, double d4, double d5, double d6) {
        this.Field13617 = d;
        this.Field13618 = d2;
        this.Field13619 = d3;
        this.Field13620 = d4;
        this.Field13621 = d5;
        this.Field13622 = d6;
    }

    public Class1240 Method4967(double d) {
        this.Field13617 -= d;
        this.Field13618 -= d;
        this.Field13619 -= d;
        this.Field13620 += d;
        this.Field13621 += d;
        this.Field13622 += d;
        return this;
    }

    public Class1240 Method4968(double d, double d2, double d3) {
        this.Field13617 -= d;
        this.Field13618 -= d2;
        this.Field13619 -= d3;
        this.Field13620 += d;
        this.Field13621 += d2;
        this.Field13622 += d3;
        return this;
    }

    public Class1240 Method4969(double d) {
        this.Field13617 -= d;
        this.Field13620 += d;
        return this;
    }

    public Class1240 Method4970(double d) {
        this.Field13618 -= d;
        this.Field13621 += d;
        return this;
    }

    public Class1240 Method4971(double d) {
        this.Field13619 -= d;
        this.Field13622 -= d;
        return this;
    }

    public Class1240 Method4972(double d, double d2, double d3) {
        double d4 = (this.Field13620 - this.Field13617) * Double.longBitsToDouble((long)700676335 ^ 0x3FE0000029C378EFL);
        double d5 = (this.Field13621 - this.Field13618) * Double.longBitsToDouble(4602678819172646912L);
        double d6 = (this.Field13622 - this.Field13619) * Double.longBitsToDouble(4602678819172646912L);
        this.Field13617 = d - d4;
        this.Field13618 = d2 - d5;
        this.Field13619 = d3 - d6;
        this.Field13620 = d + d4;
        this.Field13621 = d2 + d5;
        this.Field13622 = d3 + d6;
        return this;
    }

    public Class1240 Method4973(Vec3d vec3d) {
        this.Method4972(vec3d.x, vec3d.y, vec3d.z);
        return this;
    }

    public Class1240 Method4974(Class1240 class1240) {
        this.Method4973(class1240.Method4977());
        return this;
    }

    public Class1240 Method4975(AxisAlignedBB axisAlignedBB) {
        this.Method4973(new Class1240(axisAlignedBB).Method4977());
        return this;
    }

    public Class1240 Method4976(BlockPos blockPos) {
        this.Method4973(new Class1240(blockPos).Method4977());
        return this;
    }

    public Vec3d Method4977() {
        double d = (this.Field13620 - this.Field13617) * Double.longBitsToDouble((long)228976620 ^ 0x3FE000000DA5E7ECL);
        double d2 = (this.Field13621 - this.Field13618) * Double.longBitsToDouble(4602678819172646912L);
        double d3 = (this.Field13622 - this.Field13619) * Double.longBitsToDouble(4602678819172646912L);
        return new Vec3d(this.Field13617 + d, this.Field13618 + d2, this.Field13619 + d3);
    }

    public Class1240 Method4978(double d, double d2, double d3) {
        this.Field13617 += d;
        this.Field13618 += d2;
        this.Field13619 += d3;
        this.Field13620 += d;
        this.Field13621 += d2;
        this.Field13622 += d3;
        return this;
    }

    public Class1240 Method4979(Vec3d vec3d) {
        this.Method4978(vec3d.x, vec3d.y, vec3d.z);
        return this;
    }

    public Class1240 Method4980(double d, double d2, double d3) {
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
        this.Method4968(d * Double.longBitsToDouble((long)814813373 ^ 0x3FE00000309110BDL), d2 * Double.longBitsToDouble((long)1347036092 ^ 0x3FE00000504A23BCL), d3 * Double.longBitsToDouble(4602678819172646912L));
        return this;
    }

    public Class1240 Method4981(double d, double d2, double d3) {
        Vec3d vec3d = this.Method4977();
        double d4 = vec3d.x;
        double d5 = vec3d.y;
        double d6 = vec3d.z;
        Class1240 class1240 = new Class1240(d4, d5, d6, d4, d5, d6);
        class1240.Method4968(d * Double.longBitsToDouble(4602678819172646912L), d2 * Double.longBitsToDouble((long)1399903370 ^ 0x3FE000005370D48AL), d3 * Double.longBitsToDouble((long)1187802843 ^ 0x3FE0000046CC6EDBL));
        return class1240;
    }

    public boolean Method4982(Class1240 class1240) {
        return this.Method4989().intersects(class1240.Method4989());
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

    public boolean Method4986(Class1240 class1240) {
        AxisAlignedBB axisAlignedBB = this.Method4989();
        Vec3d vec3d = new Vec3d(class1240.Field13617, class1240.Field13618, class1240.Field13619);
        Vec3d vec3d2 = new Vec3d(class1240.Field13620, class1240.Field13621, class1240.Field13622);
        if (!axisAlignedBB.contains(vec3d)) return false;
        if (!axisAlignedBB.contains(vec3d2)) return false;
        return true;
    }

    public boolean Method4987(AxisAlignedBB axisAlignedBB) {
        AxisAlignedBB axisAlignedBB2 = this.Method4989();
        Vec3d vec3d = new Vec3d(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ);
        Vec3d vec3d2 = new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        if (!axisAlignedBB2.contains(vec3d)) return false;
        if (!axisAlignedBB2.contains(vec3d2)) return false;
        return true;
    }

    public Class1240 Method4988() {
        this.Field13617 -= Class1240.Field13616.renderManager.viewerPosX;
        this.Field13618 -= Class1240.Field13616.renderManager.viewerPosY;
        this.Field13619 -= Class1240.Field13616.renderManager.viewerPosZ;
        this.Field13620 -= Class1240.Field13616.renderManager.viewerPosX;
        this.Field13621 -= Class1240.Field13616.renderManager.viewerPosY;
        this.Field13622 -= Class1240.Field13616.renderManager.viewerPosZ;
        this.Field13623 = true;
        return this;
    }

    public AxisAlignedBB Method4989() {
        return new AxisAlignedBB(this.Field13617, this.Field13618, this.Field13619, this.Field13620, this.Field13621, this.Field13622);
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!(object instanceof Class1240)) {
            return false;
        }
        Class1240 class1240 = (Class1240)object;
        boolean bl = this.Field13617 == class1240.Field13617;
        boolean bl2 = this.Field13618 == class1240.Field13618;
        boolean bl3 = this.Field13619 == class1240.Field13619;
        boolean bl4 = this.Field13620 == class1240.Field13620;
        boolean bl5 = this.Field13621 == class1240.Field13621;
        if (this.Field13622 != class1240.Field13622) return false;
        return false;
    }
}

