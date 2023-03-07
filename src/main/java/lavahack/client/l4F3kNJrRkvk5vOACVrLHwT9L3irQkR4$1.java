/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.Iterator;
import lavahack.client.l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$1$1;
import net.minecraft.util.math.BlockPos;

final class l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$1
implements Iterable {
    final BlockPos Field9897;
    final BlockPos Field9898;
    private int Field9899;

    l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$1(BlockPos blockPos, BlockPos blockPos2) {
        this.Field9897 = blockPos;
        this.Field9898 = blockPos2;
    }

    public Iterator iterator() {
        return new l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$1$1(this);
    }
}

