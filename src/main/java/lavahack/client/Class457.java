/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.Iterator;
import lavahack.client.Class675;
import net.minecraft.util.math.BlockPos;

final class Class457
implements Iterable {
    final BlockPos Field9900;
    final BlockPos Field9901;
    private String Field9902 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    Class457(BlockPos blockPos, BlockPos blockPos2) {
        this.Field9900 = blockPos;
        this.Field9901 = blockPos2;
    }

    public Iterator iterator() {
        return new Class675(this);
    }
}

