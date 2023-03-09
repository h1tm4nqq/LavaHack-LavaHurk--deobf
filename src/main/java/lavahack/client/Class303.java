/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import com.kisman.cc.event.Class1273;
import com.kisman.cc.event.Class2157;
import net.minecraft.util.math.BlockPos;

public class Class303
extends Class2157 {
    private BlockPos Field9304;
    public Class1273 Field9305;
    private String Field9306 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class303(Class1273 class1273, BlockPos blockPos) {
        super(new Object[0]);
        this.Field9305 = class1273;
        this.Field9304 = blockPos;
    }

    public BlockPos Method1574() {
        return this.Field9304;
    }

    public void Method1575(BlockPos blockPos) {
        this.Field9304 = blockPos;
    }
}

