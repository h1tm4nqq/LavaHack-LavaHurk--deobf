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
import lavahack.client.FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.SLiqswd5ztNgsJq35KC6QtzyZcaQ4fym$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class SLiqswd5ztNgsJq35KC6QtzyZcaQ4fym
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field13282 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, SLiqswd5ztNgsJq35KC6QtzyZcaQ4fym$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12531).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13283 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x55A21D2668A7818DL ^ 0x15B61D2668A7818DL), 1.0, Double.longBitsToDouble((long)1313293163 ^ 0x401800004E47436BL), ((int)1944914155L ^ 0x73ED08EB) != 0);
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field13284 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Swap", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11028).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13285 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1298784097 ^ (long)1298784097));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13286 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1609543020L ^ 0xA0105294) != 0);
    private String Field13287 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public SLiqswd5ztNgsJq35KC6QtzyZcaQ4fym() {
        super("ArrowBlocker", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8341, (boolean)((long)884234028 ^ (long)884234029));
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method4735(TickEvent tickEvent) {
        if (SLiqswd5ztNgsJq35KC6QtzyZcaQ4fym.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (SLiqswd5ztNgsJq35KC6QtzyZcaQ4fym.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Method20();
    }

    private void Method20() {
        Iterator iterator = SLiqswd5ztNgsJq35KC6QtzyZcaQ4fym.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.entityList.iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity == null || !(entity instanceof EntityArrow) || (double)SLiqswd5ztNgsJq35KC6QtzyZcaQ4fym.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(entity) > this.Field13283.Method367()) continue;
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505().Method1886("doing things");
            this.Method4736((EntityArrow)entity);
        }
    }

    private void Method4736(EntityArrow entityArrow) {
        double d;
        double d2;
        double d3 = entityArrow.posX + entityArrow.motionX * Double.longBitsToDouble((long)1033435768 ^ 0x3FEC7AE17A36EE03L);
        BlockPos blockPos = new BlockPos(d3, d2 = entityArrow.posX + entityArrow.motionY * Double.longBitsToDouble(0xC497F351F64ACD64L ^ 0xFB7F5086FC77BDC0L), d = entityArrow.posZ + entityArrow.motionZ * Double.longBitsToDouble((long)315972336 ^ 0x3FEC7AE1557B4E8BL));
        if (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4213(blockPos).isEmpty()) {
            return;
        }
        if (!SLiqswd5ztNgsJq35KC6QtzyZcaQ4fym.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)SLiqswd5ztNgsJq35KC6QtzyZcaQ4fym.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            return;
        }
        int n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127(Blocks.OBSIDIAN);
        if (n == (int)((long)-681493426 ^ (long)681493425)) {
            return;
        }
        int n2 = SLiqswd5ztNgsJq35KC6QtzyZcaQ4fym.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        Object[] objectArray = new Object[(int)((long)2009702695 ^ (long)2009702694) << 1];
        objectArray[(int)-1047116185L ^ 0xC1964667] = n;
        objectArray[(int)((long)1299517623 ^ (long)1299517622)] = ((int)552690396L ^ 0x20F162DC) != 0;
        ((FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field13284.Method341()).Method2972().Method1726(objectArray);
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4208(blockPos, EnumHand.MAIN_HAND, this.Field13285.Method365(), this.Field13286.Method365());
        Object[] objectArray2 = new Object[(int)((long)1457378796 ^ (long)1457378797) << 1];
        objectArray2[(int)((long)-1529160321 ^ (long)-1529160321)] = n2;
        objectArray2[(int)-1225978924L ^ 0xB6ED0BD5] = ((int)857652830L ^ 0x331EBE5F) != 0;
        ((FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field13284.Method341()).Method2972().Method1726(objectArray2);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1707196729L ^ 0x65C1C139;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)2026381726 ^ (long)2026381665);
            int n2 = ((int)524309977L ^ 0x1F4055CC) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)825245722 ^ (long)825248675) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

