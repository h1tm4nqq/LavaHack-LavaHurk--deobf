//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.projectile.EntityArrow
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.IBlockAccess
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent
 */
package lavahack.client;

import java.util.Iterator;
import lavahack.client.Class1033;
import lavahack.client.Class1036;
import lavahack.client.Class1303;
import lavahack.client.Class1393;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class711;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class Class1175
extends Class42 {
    private final Class1303 Field13282 = new Class1303("Mode", (Class42)this, Class1033.Field12531).Method5303();
    private final Class44 Field13283 = new Class44("Range", (Class42)this, Double.longBitsToDouble(0x4014000000000000L), 1.0, Double.longBitsToDouble((long)1313293163 ^ 0x401800004E47436BL), false);
    private final Class1303 Field13284 = new Class1303("Swap", (Class42)this, Class711.Field11028).Method5303();
    private final Class44 Field13285 = new Class44("Rotate", (Class42)this, false);
    private final Class44 Field13286 = new Class44("Packet", (Class42)this, false);
    private String Field13287 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1175() {
        super("ArrowBlocker", Class97.Field8341, true);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method4735(TickEvent tickEvent) {
        if (Class1175.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1175.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Method20();
    }

    private void Method20() {
        Iterator iterator = Class1175.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.entityList.iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity == null || !(entity instanceof EntityArrow) || (double)Class1175.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(entity) > this.Field13283.Method367()) continue;
            Class1393.Method5505().Method1886("doing things");
            this.Method4736((EntityArrow)entity);
        }
    }

    private void Method4736(EntityArrow entityArrow) {
        double d;
        double d2;
        double d3 = entityArrow.posX + entityArrow.motionX * Double.longBitsToDouble((long)1033435768 ^ 0x3FEC7AE17A36EE03L);
        BlockPos blockPos = new BlockPos(d3, d2 = entityArrow.posX + entityArrow.motionY * Double.longBitsToDouble(4605110762971426980L), d = entityArrow.posZ + entityArrow.motionZ * Double.longBitsToDouble((long)315972336 ^ 0x3FEC7AE1557B4E8BL));
        if (Class1036.Method4213(blockPos).isEmpty()) {
            return;
        }
        if (!Class1175.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class1175.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            return;
        }
        int n = Class9.Method127(Blocks.OBSIDIAN);
        if (n == -1) {
            return;
        }
        int n2 = Class1175.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        ((Class711)this.Field13284.Method341()).Method2972().Method1726(n, false);
        Class1036.Method4208(blockPos, EnumHand.MAIN_HAND, this.Field13285.Method365(), this.Field13286.Method365());
        ((Class711)this.Field13284.Method341()).Method2972().Method1726(n2, true);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 84;
            cArray2[n] = (char)(cArray[n] ^ (0x1772 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

