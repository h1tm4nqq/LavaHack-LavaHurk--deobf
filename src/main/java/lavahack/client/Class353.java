/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lavahack.client.Class1403;
import lavahack.client.Class1521;
import lavahack.client.Class1924;
import lavahack.client.Class820;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class353 {
    private final Class820 Field9458;
    private final Class1521 Field9459;
    private Class1403 Field9460;
    private Class1403 Field9461;
    private Class1403 Field9462;
    private Class1924 Field9463;
    private String Field9464 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class353() {
        this(null, null);
    }

    public Class353(Class820 class820) {
        this(class820, null);
    }

    public Class353(Class1521 class1521) {
        this(null, class1521);
    }

    public Class353(Class820 class820, Class1521 class1521) {
        this.Field9458 = class820;
        this.Field9459 = class1521;
        this.Field9460 = null;
        this.Field9461 = null;
        this.Field9462 = null;
    }

    public Class353 Method1779(Class1403 class1403) {
        this.Field9460 = class1403;
        return this;
    }

    public Class353 Method1780(Class1403 class1403) {
        this.Field9461 = class1403;
        return this;
    }

    public Class353 Method1781(Class1403 class1403) {
        this.Field9462 = class1403;
        return this;
    }

    public Class353 Method1782(Class1924 class1924) {
        this.Field9463 = class1924;
        return this;
    }

    public float Method1783(IBlockState iBlockState) {
        if (this.Field9460 == null) return Float.intBitsToFloat(0x3F000000);
        return this.Field9460.Method5534(iBlockState);
    }

    public float Method1784(IBlockState iBlockState) {
        if (this.Field9461 == null) return Float.intBitsToFloat(0x3F000000);
        return this.Field9461.Method5534(iBlockState);
    }

    public float Method1785(IBlockState iBlockState) {
        if (this.Field9462 == null) return Float.intBitsToFloat(0x3F000000);
        return this.Field9462.Method5534(iBlockState);
    }

    public int Method1786(IBlockState iBlockState) {
        if (this.Field9463 == null) return 0;
        return this.Field9463.Method7176(iBlockState);
    }

    public boolean Method1787(IBlockState iBlockState, EntityPlayer entityPlayer, BlockPos blockPos, World world) {
        if (this.Field9458 == null) return true;
        if (this.Field9458.Method3488(iBlockState, entityPlayer, blockPos, world)) return true;
        return false;
    }

    public List Method1788(List list, IBlockState iBlockState) {
        List list2 = this.Field9459 != null ? this.Field9459.Method6049(list, iBlockState) : new ArrayList(list);
        Iterator iterator = list2.iterator();
        while (iterator.hasNext()) {
            EnumFacing enumFacing = (EnumFacing)iterator.next();
            if (this.Field9461 == null) continue;
            float f = this.Field9461.Method5534(iBlockState);
            if ((double)f < Double.longBitsToDouble(4602678819172646912L) && enumFacing == EnumFacing.UP) {
                iterator.remove();
                continue;
            }
            if (!((double)f > Double.longBitsToDouble((long)730478755 ^ 0x3FE000002B8A38A3L)) || enumFacing != EnumFacing.DOWN) continue;
            iterator.remove();
        }
        return list2;
    }
}

