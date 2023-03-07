/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import com.kisman.cc.event.Event;
import com.kisman.cc.event.Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public class ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy
extends Event {
    private final BlockPos Field14109;
    private final EnumFacing Field14110;
    private int Field14111;

    public ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy(BlockPos blockPos, EnumFacing enumFacing, Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        super(event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, new Object[(int)-1146008181L ^ 0xBBB14D8B]);
        this.Field14109 = blockPos;
        this.Field14110 = enumFacing;
    }

    public BlockPos Method2155() {
        return this.Field14109;
    }

    public EnumFacing Method2156() {
        return this.Field14110;
    }
}

