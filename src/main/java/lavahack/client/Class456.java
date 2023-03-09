/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.Iterator;
import lavahack.client.Class1827;
import net.minecraft.util.math.BlockPos;

final class Class456
implements Iterable {
    final BlockPos Field9897;
    final BlockPos Field9898;
    private int Field9899;

    Class456(BlockPos blockPos, BlockPos blockPos2) {
        this.Field9897 = blockPos;
        this.Field9898 = blockPos2;
    }

    public Iterator iterator() {
        return new Class1827(this);
    }
}

