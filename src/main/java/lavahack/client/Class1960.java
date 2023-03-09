/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.AxisAlignedBB
 */
package lavahack.client;

import java.util.List;
import lavahack.client.Class1120;
import lavahack.client.Class792;
import net.minecraft.util.math.AxisAlignedBB;

public class Class1960 {
    private final List Field17030;
    private final AxisAlignedBB Field17031;
    private final Class792 Field17032;
    private final Class1120 Field17033;
    private int Field17034;

    public Class1960(List list, AxisAlignedBB axisAlignedBB, Class792 class792, Class1120 class1120) {
        this.Field17030 = list;
        this.Field17031 = axisAlignedBB;
        this.Field17032 = class792;
        this.Field17033 = class1120;
    }

    public List Method7276() {
        return this.Field17030;
    }

    public AxisAlignedBB Method7277() {
        return this.Field17031;
    }

    public Class792 Method7278() {
        return this.Field17032;
    }

    public Class1120 Method7279() {
        return this.Field17033;
    }
}

