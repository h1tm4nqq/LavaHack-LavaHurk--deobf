//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.fml.common.gameevent.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.entity.*;
import net.minecraft.entity.projectile.*;
import java.util.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;
import net.minecraft.init.*;
import net.minecraft.util.*;

public class Class1175 extends Class42
{
    private final Class1303 Field13282;
    private final Class44 Field13283;
    private final Class1303 Field13284;
    private final Class44 Field13285;
    private final Class44 Field13286;
    private String Field13287 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1175() {
        super("ArrowBlocker", Class97.Field8341, true);
        this.Field13282 = new Class1303("Mode", this, (Enum)Class1033.Field12531).Method5303();
        this.Field13283 = new Class44("Range", this, Double.longBitsToDouble(4617315517961601024L), 1.0, Double.longBitsToDouble((long)1313293163 ^ 0x401800004E47436BL), false);
        this.Field13284 = new Class1303("Swap", this, Class711.Field11028).Method5303();
        this.Field13285 = new Class44("Rotate", this, false);
        this.Field13286 = new Class44("Packet", this, false);
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method4735(final TickEvent tickEvent) {
        if (Class1175.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1175.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Method20();
    }
    
    private void Method20() {
        for (final Entity entity : Class1175.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.entityList) {
            if (entity == null) {
                continue;
            }
            if (!(entity instanceof EntityArrow)) {
                continue;
            }
            if (Class1175.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(entity) > this.Field13283.Method367()) {
                continue;
            }
            Class1393.Method5505().Method1886("doing things");
            this.Method4736((EntityArrow)entity);
        }
    }
    
    private void Method4736(final EntityArrow entityArrow) {
        final BlockPos blockPos = new BlockPos(entityArrow.posX + entityArrow.motionX * Double.longBitsToDouble((long)1033435768 ^ 0x3FEC7AE17A36EE03L), entityArrow.posX + entityArrow.motionY * Double.longBitsToDouble(4605110762971426980L), entityArrow.posZ + entityArrow.motionZ * Double.longBitsToDouble((long)315972336 ^ 0x3FEC7AE1557B4E8BL));
        if (Class1036.Method4213(blockPos).isEmpty()) {
            return;
        }
        if (!Class1175.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class1175.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            return;
        }
        final int method127 = Class9.Method127(Blocks.OBSIDIAN);
        if (method127 == -1) {
            return;
        }
        final int currentItem = Class1175.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        ((Class711)this.Field13284.Method341()).Method2972().Method1726(method127, false);
        Class1036.Method4208(blockPos, EnumHand.MAIN_HAND, this.Field13285.Method365(), this.Field13286.Method365());
        ((Class711)this.Field13284.Method341()).Method2972().Method1726(currentItem, true);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1772 ^ 0x54));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
