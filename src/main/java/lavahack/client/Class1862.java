/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.AxisAlignedBB
 */
package lavahack.client;

import java.util.ArrayList;
import lavahack.client.Class410;
import lavahack.client.Class422;
import net.minecraft.util.math.AxisAlignedBB;

public class Class1862 {
    private Class422 Field16561;
    private Class410 Field16562;
    private AxisAlignedBB Field16563;
    public ArrayList Field16564 = new ArrayList();
    private int Field16565;

    public Class1862() {
        this(Class410.Field9697, Class422.Field9771);
    }

    public Class1862(Class410 class410, Class422 class422) {
        this.Field16561 = class422;
        this.Field16562 = class410;
    }

    public void Method6956(Class422 class422) {
        this.Field16561 = class422;
    }

    public void Method6957(Class410 class410) {
        this.Field16562 = class410;
    }

    public void Method6958(AxisAlignedBB axisAlignedBB) {
        this.Field16563 = axisAlignedBB;
    }

    public Class422 Method6959() {
        return this.Field16561;
    }

    public Class410 Method6960() {
        return this.Field16562;
    }

    public AxisAlignedBB Method6961() {
        return this.Field16563;
    }
}

