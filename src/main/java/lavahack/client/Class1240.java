//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraft.util.math.*;

public class Class1240
{
    private static final Minecraft Field13616;
    public double Field13617;
    public double Field13618;
    public double Field13619;
    public double Field13620;
    public double Field13621;
    public double Field13622;
    boolean Field13623;
    private String Field13624 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1240(final AxisAlignedBB axisAlignedBB) {
        this.Field13623 = false;
        this.Field13617 = axisAlignedBB.minX;
        this.Field13618 = axisAlignedBB.minY;
        this.Field13619 = axisAlignedBB.minZ;
        this.Field13620 = axisAlignedBB.maxX;
        this.Field13621 = axisAlignedBB.maxY;
        this.Field13622 = axisAlignedBB.maxZ;
    }
    
    public Class1240(final BlockPos blockPos) {
        this(new AxisAlignedBB(blockPos));
    }
    
    private Class1240(final double field13617, final double field13618, final double field13619, final double field13620, final double field13621, final double field13622) {
        this.Field13623 = false;
        this.Field13617 = field13617;
        this.Field13618 = field13618;
        this.Field13619 = field13619;
        this.Field13620 = field13620;
        this.Field13621 = field13621;
        this.Field13622 = field13622;
    }
    
    public Class1240 Method4967(final double n) {
        this.Field13617 -= n;
        this.Field13618 -= n;
        this.Field13619 -= n;
        this.Field13620 += n;
        this.Field13621 += n;
        this.Field13622 += n;
        return this;
    }
    
    public Class1240 Method4968(final double n, final double n2, final double n3) {
        this.Field13617 -= n;
        this.Field13618 -= n2;
        this.Field13619 -= n3;
        this.Field13620 += n;
        this.Field13621 += n2;
        this.Field13622 += n3;
        return this;
    }
    
    public Class1240 Method4969(final double n) {
        this.Field13617 -= n;
        this.Field13620 += n;
        return this;
    }
    
    public Class1240 Method4970(final double n) {
        this.Field13618 -= n;
        this.Field13621 += n;
        return this;
    }
    
    public Class1240 Method4971(final double n) {
        this.Field13619 -= n;
        this.Field13622 -= n;
        return this;
    }
    
    public Class1240 Method4972(final double n, final double n2, final double n3) {
        final double n4 = (this.Field13620 - this.Field13617) * Double.longBitsToDouble((long)700676335 ^ 0x3FE0000029C378EFL);
        final double n5 = (this.Field13621 - this.Field13618) * Double.longBitsToDouble(4602678819172646912L);
        final double n6 = (this.Field13622 - this.Field13619) * Double.longBitsToDouble(4602678819172646912L);
        this.Field13617 = n - n4;
        this.Field13618 = n2 - n5;
        this.Field13619 = n3 - n6;
        this.Field13620 = n + n4;
        this.Field13621 = n2 + n5;
        this.Field13622 = n3 + n6;
        return this;
    }
    
    public Class1240 Method4973(final Vec3d vec3d) {
        this.Method4972(vec3d.x, vec3d.y, vec3d.z);
        return this;
    }
    
    public Class1240 Method4974(final Class1240 class1240) {
        this.Method4973(class1240.Method4977());
        return this;
    }
    
    public Class1240 Method4975(final AxisAlignedBB axisAlignedBB) {
        this.Method4973(new Class1240(axisAlignedBB).Method4977());
        return this;
    }
    
    public Class1240 Method4976(final BlockPos blockPos) {
        this.Method4973(new Class1240(blockPos).Method4977());
        return this;
    }
    
    public Vec3d Method4977() {
        return new Vec3d(this.Field13617 + (this.Field13620 - this.Field13617) * Double.longBitsToDouble((long)228976620 ^ 0x3FE000000DA5E7ECL), this.Field13618 + (this.Field13621 - this.Field13618) * Double.longBitsToDouble(4602678819172646912L), this.Field13619 + (this.Field13622 - this.Field13619) * Double.longBitsToDouble(4602678819172646912L));
    }
    
    public Class1240 Method4978(final double n, final double n2, final double n3) {
        this.Field13617 += n;
        this.Field13618 += n2;
        this.Field13619 += n3;
        this.Field13620 += n;
        this.Field13621 += n2;
        this.Field13622 += n3;
        return this;
    }
    
    public Class1240 Method4979(final Vec3d vec3d) {
        this.Method4978(vec3d.x, vec3d.y, vec3d.z);
        return this;
    }
    
    public Class1240 Method4980(final double n, final double n2, final double n3) {
        final Vec3d method4977 = this.Method4977();
        final double x = method4977.x;
        final double y = method4977.y;
        final double z = method4977.z;
        this.Field13617 = x;
        this.Field13618 = y;
        this.Field13619 = z;
        this.Field13620 = x;
        this.Field13621 = y;
        this.Field13622 = z;
        this.Method4968(n * Double.longBitsToDouble((long)814813373 ^ 0x3FE00000309110BDL), n2 * Double.longBitsToDouble((long)1347036092 ^ 0x3FE00000504A23BCL), n3 * Double.longBitsToDouble(4602678819172646912L));
        return this;
    }
    
    public Class1240 Method4981(final double n, final double n2, final double n3) {
        final Vec3d method4977 = this.Method4977();
        final double x = method4977.x;
        final double y = method4977.y;
        final double z = method4977.z;
        final Class1240 class1240 = new Class1240(x, y, z, x, y, z);
        class1240.Method4968(n * Double.longBitsToDouble(4602678819172646912L), n2 * Double.longBitsToDouble((long)1399903370 ^ 0x3FE000005370D48AL), n3 * Double.longBitsToDouble((long)1187802843 ^ 0x3FE0000046CC6EDBL));
        return class1240;
    }
    
    public boolean Method4982(final Class1240 class1240) {
        return this.Method4989().intersects(class1240.Method4989());
    }
    
    public boolean Method4983(final AxisAlignedBB axisAlignedBB) {
        return this.Method4989().intersects(axisAlignedBB);
    }
    
    public boolean Method4984(final double n, final double n2, final double n3) {
        return this.Method4989().contains(new Vec3d(n, n2, n3));
    }
    
    public boolean Method4985(final Vec3d vec3d) {
        return this.Method4989().contains(vec3d);
    }
    
    public boolean Method4986(final Class1240 class1240) {
        final AxisAlignedBB method4989 = this.Method4989();
        final Vec3d vec3d = new Vec3d(class1240.Field13617, class1240.Field13618, class1240.Field13619);
        final Vec3d vec3d2 = new Vec3d(class1240.Field13620, class1240.Field13621, class1240.Field13622);
        return method4989.contains(vec3d) && method4989.contains(vec3d2);
    }
    
    public boolean Method4987(final AxisAlignedBB axisAlignedBB) {
        final AxisAlignedBB method4989 = this.Method4989();
        final Vec3d vec3d = new Vec3d(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ);
        final Vec3d vec3d2 = new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        return method4989.contains(vec3d) && method4989.contains(vec3d2);
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
    
    @Override
    public boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Class1240)) {
            return false;
        }
        final Class1240 class1240 = (Class1240)o;
        final boolean b = this.Field13617 == class1240.Field13617;
        final boolean b2 = this.Field13618 == class1240.Field13618;
        final boolean b3 = this.Field13619 == class1240.Field13619;
        final boolean b4 = this.Field13620 == class1240.Field13620;
        final boolean b5 = this.Field13621 == class1240.Field13621;
        final boolean b6 = this.Field13622 == class1240.Field13622;
        return false;
    }
    
    static {
        Field13616 = Minecraft.getMinecraft();
    }
}
