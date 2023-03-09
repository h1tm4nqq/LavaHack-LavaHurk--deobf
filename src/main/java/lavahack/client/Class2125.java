/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.awt.Color;
import lavahack.client.Class1240;
import lavahack.client.Class2008;
import lavahack.client.Class815;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

public class Class2125 {
    protected Class1240 Field17667 = null;
    protected Color Field17668 = Class815.Field11486.Method3625();
    protected Color Field17669 = Class815.Field11486.Method3625();
    protected float Field17670 = 1.0f;
    protected Class2008 Field17671 = null;
    private int Field17672;

    protected Class2125() {
    }

    public static Class2125 Method7307() {
        return new Class2125();
    }

    public Class2125 Method7308(Class1240 class1240) {
        this.Field17667 = class1240;
        return this;
    }

    public Class2125 Method7309(AxisAlignedBB axisAlignedBB) {
        this.Field17667 = new Class1240(axisAlignedBB);
        return this;
    }

    public Class2125 Method7310(BlockPos blockPos) {
        this.Field17667 = new Class1240(blockPos);
        return this;
    }

    public Class2125 Method7311(Color color) {
        this.Field17668 = color;
        return this;
    }

    public Class2125 Method7312(Class2027 class2027) {
        this.Field17668 = class2027.Method3625();
        return this;
    }

    public Class2125 Method7313(Color color, Color color2) {
        this.Field17668 = color;
        this.Field17669 = color2;
        return this;
    }

    public Class2125 Method7314(Class2027 class2027, Class2027 class20272) {
        this.Field17668 = class2027.Method3625();
        this.Field17669 = class20272.Method3625();
        return this;
    }

    public Class2125 Method7315(float f) {
        this.Field17670 = f;
        return this;
    }

    public Class2125 Method7316(Class2008 class2008) {
        this.Field17671 = class2008;
        return this;
    }

    public void Method7317() {
        if (this.Field17667 == null) return;
        if (this.Field17671 == null) {
            return;
        }
        AxisAlignedBB axisAlignedBB = Class815.Method3447(this.Field17667.Method4989());
        Class815.Method3446(axisAlignedBB, this.Field17670, new Class2027(this.Field17668), new Class2027(this.Field17669), this.Field17671);
    }
}

