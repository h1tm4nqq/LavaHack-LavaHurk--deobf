/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
 */
package lavahack.client;

import com.kisman.cc.event.Class2157;
import net.minecraft.block.state.IBlockState;

public class Class395
extends Class2157 {
    private final IBlockState Field9657;
    private final boolean Field9658;
    private String Field9659 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class395(IBlockState iBlockState, boolean bl) {
        super(new Object[0]);
        this.Field9657 = iBlockState;
        this.Field9658 = bl;
    }

    public IBlockState Method1962() {
        return this.Field9657;
    }

    public boolean Method1963() {
        return this.Field9658;
    }
}

