//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.item.EntityXPOrb
 *  net.minecraft.init.Blocks
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.IBlockAccess
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import lavahack.client.Class1036;
import lavahack.client.Class1303;
import lavahack.client.Class1507;
import lavahack.client.Class1832;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class711;
import lavahack.client.Class9;
import lavahack.client.Class97;
import lavahack.client.Class973;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class Class600
extends Class42 {
    private final Class1303 Field10545 = new Class1303("EventMode", (Class42)this, Class1507.Field15059).Method5303();
    private final Class1303 Field10546 = new Class1303("Mode", (Class42)this, Class973.Field12174).Method5303();
    private final Class1303 Field10547 = new Class1303("Switch", (Class42)this, Class711.Field11028);
    private final Class44 Field10548 = this.Method23(new Class44("Smart", (Class42)this, false));
    private final Class44 Field10549 = this.Method23(new Class44("SurroundBlocks", (Class42)this, true));
    private final Class1303 Field10550 = new Class1303("HelpingBlocks", (Class42)this, Class1832.Field16467).Method5303();
    private final Class44 Field10551 = this.Method23(new Class44("Down", (Class42)this, true));
    private final Class44 Field10552 = this.Method23(new Class44("Center", (Class42)this, false));
    private final Class44 Field10553 = this.Method23(new Class44("Rotate", (Class42)this, false));
    private final Class44 Field10554 = this.Method23(new Class44("Packet", (Class42)this, false));
    private final Class44 Field10555 = this.Method23(new Class44("DisableOnComplete", (Class42)this, true));
    private EnumFacing Field10556 = null;
    private String Field10557 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class600() {
        super("SelfTrapRewrite", Class97.Field8338, true);
    }

    @Override
    public void Method38() {
        if (Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        super.Method38();
        if (!this.Field10552.Method365()) {
            return;
        }
        double d = Math.floor(Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble((long)113430872 ^ 0x3FE0000006C2D158L);
        double d2 = Math.floor(Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble(4602678819172646912L);
        Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d, Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, d2, Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
        Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(d, Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, d2);
    }

    @Override
    public void Method39() {
        super.Method39();
        this.Field10556 = null;
    }

    @Override
    public void Method45() {
        if (this.Field10545.Method341() != Class1507.Field15060) {
            return;
        }
        this.Method20();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2583(TickEvent tickEvent) {
        if (this.Field10545.Method341() != Class1507.Field15059) {
            return;
        }
        this.Method20();
    }

    private void Method20() {
        if (Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        List list = this.Method2587();
        list.addAll(0, this.Method2588());
        if (this.Field10551.Method365()) {
            list.add(0, this.Method2589().down());
        }
        if (this.Field10555.Method365() && this.Method2584(list)) {
            this.Field10556 = null;
            this.Method22();
            return;
        }
        this.Method2585(list);
    }

    private boolean Method2584(List list) {
        BlockPos blockPos;
        Iterator iterator = list.iterator();
        do {
            if (!iterator.hasNext()) return true;
        } while (!Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos = (BlockPos)iterator.next()).getBlock().isReplaceable((IBlockAccess)Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos));
        return false;
    }

    private void Method2585(List list) {
        int n = Class9.Method127(Blocks.OBSIDIAN);
        if (n == -1) {
            return;
        }
        int n2 = Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            if (!Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos) || this.Method2586(blockPos)) continue;
            ((Class711)this.Field10547.Method341()).Method2972().Method1726(n, false);
            Class1036.Method4208(blockPos, EnumHand.MAIN_HAND, this.Field10553.Method365(), this.Field10554.Method365());
            ((Class711)this.Field10547.Method341()).Method2972().Method1726(n2, true);
        }
    }

    private boolean Method2586(BlockPos blockPos) {
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
        Iterator iterator = Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, axisAlignedBB).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity instanceof EntityItem) continue;
            if (!(entity instanceof EntityXPOrb)) return true;
        }
        return false;
    }

    private List Method2587() {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        if (this.Field10556 == null) {
            this.Field10556 = Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHorizontalFacing().getOpposite();
        }
        if (this.Field10546.Method341() == Class973.Field12174 || this.Field10549.Method365()) {
            arrayList.addAll(Arrays.stream(EnumFacing.HORIZONTALS).map(this::Method2596).collect(Collectors.toList()));
        } else {
            arrayList.add(this.Method2589().offset(this.Field10556));
        }
        arrayList.addAll(Arrays.stream(EnumFacing.HORIZONTALS).map(this::Method2595).collect(Collectors.toList()));
        if (this.Field10548.Method365()) {
            if (Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(this.Method2589().up(2)).getBlock().isReplaceable((IBlockAccess)Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, this.Method2589().up(2))) {
                arrayList.add(this.Method2589().up(2).offset(this.Field10556));
                arrayList.add(this.Method2589().up(2));
            }
        } else {
            arrayList.add(this.Method2589().up(2).offset(this.Field10556));
            arrayList.add(this.Method2589().up(2));
        }
        if (this.Field10546.Method341() == Class973.Field12174) {
            return arrayList;
        }
        arrayList.removeAll(Arrays.stream(EnumFacing.HORIZONTALS).filter(this::Method2594).map(this::Method2593).collect(Collectors.toList()));
        return arrayList;
    }

    private List Method2588() {
        if (this.Field10550.Method341() == Class1832.Field16467) {
            return Collections.emptyList();
        }
        if (this.Field10550.Method341() != Class1832.Field16468) return Arrays.stream(EnumFacing.HORIZONTALS).map(this::Method2591).filter(Class600::Method2590).collect(Collectors.toList());
        return Arrays.stream(EnumFacing.HORIZONTALS).map(this::Method2592).collect(Collectors.toList());
    }

    private BlockPos Method2589() {
        return new BlockPos(Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class600.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
    }

    private static boolean Method2590(BlockPos blockPos) {
        return Class1036.Method4213(blockPos.up()).isEmpty();
    }

    private BlockPos Method2591(EnumFacing enumFacing) {
        return this.Method2589().down().offset(enumFacing);
    }

    private BlockPos Method2592(EnumFacing enumFacing) {
        return this.Method2589().down().offset(enumFacing);
    }

    private BlockPos Method2593(EnumFacing enumFacing) {
        return this.Method2589().up().offset(enumFacing);
    }

    private boolean Method2594(EnumFacing enumFacing) {
        if (enumFacing == this.Field10556) return false;
        return true;
    }

    private BlockPos Method2595(EnumFacing enumFacing) {
        return this.Method2589().up().offset(enumFacing);
    }

    private BlockPos Method2596(EnumFacing enumFacing) {
        return this.Method2589().offset(enumFacing);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 144;
            cArray2[n] = (char)(cArray[n] ^ (0x3059 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

