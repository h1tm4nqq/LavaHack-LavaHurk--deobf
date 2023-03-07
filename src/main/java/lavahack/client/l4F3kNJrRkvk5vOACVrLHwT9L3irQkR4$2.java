/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.Iterator;
import lavahack.client.l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$2$1;
import net.minecraft.util.math.BlockPos;

final class l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$2
implements Iterable {
    final BlockPos Field9903;
    final BlockPos Field9904;
    private String Field9905 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$2(BlockPos blockPos, BlockPos blockPos2) {
        this.Field9903 = blockPos;
        this.Field9904 = blockPos2;
    }

    public Iterator iterator() {
        return new l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4$2$1(this);
    }
}

