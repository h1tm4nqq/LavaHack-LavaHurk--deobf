//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.block.state.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;
import net.minecraft.util.*;
import java.util.*;

public class Class353
{
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
    
    public Class353(final Class820 class820) {
        this(class820, null);
    }
    
    public Class353(final Class1521 class1521) {
        this(null, class1521);
    }
    
    public Class353(final Class820 field9458, final Class1521 field9459) {
        this.Field9458 = field9458;
        this.Field9459 = field9459;
        this.Field9460 = null;
        this.Field9461 = null;
        this.Field9462 = null;
    }
    
    public Class353 Method1779(final Class1403 field9460) {
        this.Field9460 = field9460;
        return this;
    }
    
    public Class353 Method1780(final Class1403 field9461) {
        this.Field9461 = field9461;
        return this;
    }
    
    public Class353 Method1781(final Class1403 field9462) {
        this.Field9462 = field9462;
        return this;
    }
    
    public Class353 Method1782(final Class1924 field9463) {
        this.Field9463 = field9463;
        return this;
    }
    
    public float Method1783(final IBlockState blockState) {
        if (this.Field9460 != null) {
            return this.Field9460.Method5534(blockState);
        }
        return Float.intBitsToFloat(1056964608);
    }
    
    public float Method1784(final IBlockState blockState) {
        if (this.Field9461 != null) {
            return this.Field9461.Method5534(blockState);
        }
        return Float.intBitsToFloat(1056964608);
    }
    
    public float Method1785(final IBlockState blockState) {
        if (this.Field9462 != null) {
            return this.Field9462.Method5534(blockState);
        }
        return Float.intBitsToFloat(1056964608);
    }
    
    public int Method1786(final IBlockState blockState) {
        if (this.Field9463 != null) {
            return this.Field9463.Method7176(blockState);
        }
        return 0;
    }
    
    public boolean Method1787(final IBlockState blockState, final EntityPlayer entityPlayer, final BlockPos blockPos, final World world) {
        return this.Field9458 == null || this.Field9458.Method3488(blockState, entityPlayer, blockPos, world);
    }
    
    public List Method1788(final List c, final IBlockState blockState) {
        final List<EnumFacing> list = (this.Field9459 != null) ? this.Field9459.Method6049(c, blockState) : new ArrayList<EnumFacing>(c);
        final Iterator<EnumFacing> iterator = list.iterator();
        while (iterator.hasNext()) {
            final EnumFacing enumFacing = iterator.next();
            if (this.Field9461 != null) {
                final float method5534 = this.Field9461.Method5534(blockState);
                if (method5534 < Double.longBitsToDouble(4602678819172646912L) && enumFacing == EnumFacing.UP) {
                    iterator.remove();
                }
                else {
                    if (method5534 <= Double.longBitsToDouble((long)730478755 ^ 0x3FE000002B8A38A3L) || enumFacing != EnumFacing.DOWN) {
                        continue;
                    }
                    iterator.remove();
                }
            }
        }
        return list;
    }
}
