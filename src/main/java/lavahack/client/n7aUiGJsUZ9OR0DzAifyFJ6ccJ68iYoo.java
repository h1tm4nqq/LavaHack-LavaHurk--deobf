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
import lavahack.client.BncXhW1Lav2keMHZiuNSuqnTUtKdNWgY;
import lavahack.client.Gba1lqS7LoSOUqCdS9peVOed3ztT9FJZ;
import lavahack.client.JEZoifa70J7iJiTmNKM72JIyDsx8bYre;
import lavahack.client.kJghtDCxhCvT8iJK9CgEXXhi5B7lafPJ;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class n7aUiGJsUZ9OR0DzAifyFJ6ccJ68iYoo {
    private final JEZoifa70J7iJiTmNKM72JIyDsx8bYre Field9458;
    private final BncXhW1Lav2keMHZiuNSuqnTUtKdNWgY Field9459;
    private Gba1lqS7LoSOUqCdS9peVOed3ztT9FJZ Field9460;
    private Gba1lqS7LoSOUqCdS9peVOed3ztT9FJZ Field9461;
    private Gba1lqS7LoSOUqCdS9peVOed3ztT9FJZ Field9462;
    private kJghtDCxhCvT8iJK9CgEXXhi5B7lafPJ Field9463;
    private String Field9464 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public n7aUiGJsUZ9OR0DzAifyFJ6ccJ68iYoo() {
        this(null, null);
    }

    public n7aUiGJsUZ9OR0DzAifyFJ6ccJ68iYoo(JEZoifa70J7iJiTmNKM72JIyDsx8bYre jEZoifa70J7iJiTmNKM72JIyDsx8bYre) {
        this(jEZoifa70J7iJiTmNKM72JIyDsx8bYre, null);
    }

    public n7aUiGJsUZ9OR0DzAifyFJ6ccJ68iYoo(BncXhW1Lav2keMHZiuNSuqnTUtKdNWgY bncXhW1Lav2keMHZiuNSuqnTUtKdNWgY) {
        this(null, bncXhW1Lav2keMHZiuNSuqnTUtKdNWgY);
    }

    public n7aUiGJsUZ9OR0DzAifyFJ6ccJ68iYoo(JEZoifa70J7iJiTmNKM72JIyDsx8bYre jEZoifa70J7iJiTmNKM72JIyDsx8bYre, BncXhW1Lav2keMHZiuNSuqnTUtKdNWgY bncXhW1Lav2keMHZiuNSuqnTUtKdNWgY) {
        this.Field9458 = jEZoifa70J7iJiTmNKM72JIyDsx8bYre;
        this.Field9459 = bncXhW1Lav2keMHZiuNSuqnTUtKdNWgY;
        this.Field9460 = null;
        this.Field9461 = null;
        this.Field9462 = null;
    }

    public n7aUiGJsUZ9OR0DzAifyFJ6ccJ68iYoo Method1779(Gba1lqS7LoSOUqCdS9peVOed3ztT9FJZ gba1lqS7LoSOUqCdS9peVOed3ztT9FJZ) {
        this.Field9460 = gba1lqS7LoSOUqCdS9peVOed3ztT9FJZ;
        return this;
    }

    public n7aUiGJsUZ9OR0DzAifyFJ6ccJ68iYoo Method1780(Gba1lqS7LoSOUqCdS9peVOed3ztT9FJZ gba1lqS7LoSOUqCdS9peVOed3ztT9FJZ) {
        this.Field9461 = gba1lqS7LoSOUqCdS9peVOed3ztT9FJZ;
        return this;
    }

    public n7aUiGJsUZ9OR0DzAifyFJ6ccJ68iYoo Method1781(Gba1lqS7LoSOUqCdS9peVOed3ztT9FJZ gba1lqS7LoSOUqCdS9peVOed3ztT9FJZ) {
        this.Field9462 = gba1lqS7LoSOUqCdS9peVOed3ztT9FJZ;
        return this;
    }

    public n7aUiGJsUZ9OR0DzAifyFJ6ccJ68iYoo Method1782(kJghtDCxhCvT8iJK9CgEXXhi5B7lafPJ kJghtDCxhCvT8iJK9CgEXXhi5B7lafPJ2) {
        this.Field9463 = kJghtDCxhCvT8iJK9CgEXXhi5B7lafPJ2;
        return this;
    }

    public float Method1783(IBlockState iBlockState) {
        if (this.Field9460 == null) return Float.intBitsToFloat(0x3EF5D04D ^ 0x1F5D04D);
        return this.Field9460.Method5534(iBlockState);
    }

    public float Method1784(IBlockState iBlockState) {
        if (this.Field9461 == null) return Float.intBitsToFloat((int)((long)688008219 ^ (long)369241115));
        return this.Field9461.Method5534(iBlockState);
    }

    public float Method1785(IBlockState iBlockState) {
        if (this.Field9462 == null) return Float.intBitsToFloat((int)1758747905L ^ 0x57D45D01);
        return this.Field9462.Method5534(iBlockState);
    }

    public int Method1786(IBlockState iBlockState) {
        if (this.Field9463 == null) return (int)1497647256L ^ 0x59444898;
        return this.Field9463.Method7176(iBlockState);
    }

    public boolean Method1787(IBlockState iBlockState, EntityPlayer entityPlayer, BlockPos blockPos, World world) {
        int n;
        if (this.Field9458 != null && !this.Field9458.Method3488(iBlockState, entityPlayer, blockPos, world)) {
            n = (int)-501590056L ^ 0xE21A57D8;
            return n != 0;
        }
        n = (int)1103340397L ^ 0x41C3A36C;
        return n != 0;
    }

    public List Method1788(List list, IBlockState iBlockState) {
        List list2 = this.Field9459 != null ? this.Field9459.Method6049(list, iBlockState) : new ArrayList(list);
        Iterator iterator = list2.iterator();
        while (iterator.hasNext()) {
            EnumFacing enumFacing = (EnumFacing)iterator.next();
            if (this.Field9461 == null) continue;
            float f = this.Field9461.Method5534(iBlockState);
            if ((double)f < Double.longBitsToDouble(0x316ADA90BBBF361CL ^ 0xE8ADA90BBBF361CL) && enumFacing == EnumFacing.UP) {
                iterator.remove();
                continue;
            }
            if (!((double)f > Double.longBitsToDouble((long)730478755 ^ 0x3FE000002B8A38A3L)) || enumFacing != EnumFacing.DOWN) continue;
            iterator.remove();
        }
        return list2;
    }
}

