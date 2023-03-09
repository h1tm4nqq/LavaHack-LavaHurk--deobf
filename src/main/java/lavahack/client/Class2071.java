//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.item.EntityXPOrb
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketHeldItemChange
 *  net.minecraft.network.play.client.CPacketPlayerDigging
 *  net.minecraft.network.play.client.CPacketPlayerDigging$Action
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.IBlockAccess
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lavahack.client.Class1036;
import lavahack.client.Class411;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class61;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

@Deprecated
public class Class2071
extends Class42 {
    private final Class44 Field17457 = this.Method23(new Class44("EnemyRange", (Class42)this, Double.longBitsToDouble((long)2013395552 ^ 0x402000007801FA60L), Double.longBitsToDouble(0x4000000000000000L), Double.longBitsToDouble(4624633867356078080L), false));
    private final Class44 Field17458 = this.Method23(new Class44("PlaceRange", (Class42)this, Double.longBitsToDouble((long)2085353035 ^ 0x401400007C4BF64BL), 1.0, Double.longBitsToDouble(4618441417868443648L), false));
    private final Class44 Field17459 = this.Method23(new Class44("DoubleDown", (Class42)this, false));
    private final Class44 Field17460 = this.Method23(new Class44("PredictTicks", (Class42)this, 1.0, 0.0, Double.longBitsToDouble(0x4024000000000000L), true));
    private final Class44 Field17461 = this.Method23(new Class44("Rotate", (Class42)this, false));
    private final Class44 Field17462 = this.Method23(new Class44("Packet", (Class42)this, false));
    private final Class44 Field17463 = this.Method23(new Class44("AntiGlitch", (Class42)this, false));
    private final Class411 Field17464 = this.Method54();
    private final Class61 Field17465 = new Class61(this.Field17457::Method367, this::Method7601, this.Field17464.Method2001()::Method365);
    private List Field17466 = new ArrayList();
    BlockPos Field17467;
    EntityPlayer Field17468;
    EntityPlayer Field17469 = null;
    double Field17470;
    boolean Field17471 = false;
    int Field17472;
    private int Field17473;

    public Class2071() {
        super("Flatten", Class97.Field8338);
    }

    @Override
    public void Method45() {
        if (Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        this.Field17466.clear();
        this.Field17472 = Class9.Method127(Blocks.OBSIDIAN);
        if (this.Field17472 == -1) {
            return;
        }
        EntityPlayer entityPlayer = this.Field17465.Method496();
        if (entityPlayer == null) {
            return;
        }
        if (this.Field17469 != entityPlayer || this.Field17471) {
            this.Field17469 = entityPlayer;
            this.Field17470 = entityPlayer.posY - 1.0;
        }
        this.Field17467 = new BlockPos(entityPlayer.posX, this.Field17470 + 1.0, entityPlayer.posZ);
        this.Field17464.Method2005(() -> this.Method7599(entityPlayer));
        int n = Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        this.Method7593(this.Field17472, false);
        Iterator iterator = this.Field17466.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Method7593(n, true);
                Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
                return;
            }
            BlockPos blockPos = (BlockPos)iterator.next();
            this.Method7594(blockPos);
        }
    }

    @Override
    public void Method39() {
        this.Field17468 = null;
        this.Field17469 = null;
        this.Field17471 = false;
        this.Field17464.Method2004();
        this.Field17465.Method498();
    }

    private void Method20() {
        if (Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(this.Field17467.down()).getBlock().isReplaceable((IBlockAccess)Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, this.Field17467.down())) {
            return;
        }
        if (this.Method7592(this.Field17467.north().down())) {
            this.Method7594(this.Field17467.down());
            this.Field17471 = false;
            return;
        }
        if (this.Method7592(this.Field17467.east().down())) {
            this.Field17471 = false;
            this.Method7594(this.Field17467.down());
            return;
        }
        if (this.Method7592(this.Field17467.south().down())) {
            this.Method7594(this.Field17467.down());
            this.Field17471 = false;
            return;
        }
        if (this.Method7592(this.Field17467.west().down())) {
            this.Method7594(this.Field17467.down());
            this.Field17471 = false;
            return;
        }
        if (this.Method7592(this.Field17467.down().down())) {
            this.Method7594(this.Field17467.down());
            this.Field17471 = false;
            return;
        }
        if (!this.Field17459.Method365()) {
            this.Field17471 = true;
            return;
        }
        if (!this.Field17459.Method365()) return;
        if (this.Method7592(this.Field17467.north().down().down())) {
            this.Method7594(this.Field17467.down().down());
            this.Field17471 = false;
            return;
        }
        if (this.Method7592(this.Field17467.east().down().down())) {
            this.Method7594(this.Field17467.down().down());
            this.Field17471 = false;
            return;
        }
        if (this.Method7592(this.Field17467.south().down().down())) {
            this.Method7594(this.Field17467.down().down());
            this.Field17471 = false;
            return;
        }
        if (this.Method7592(this.Field17467.west().down().down())) {
            this.Method7594(this.Field17467.down());
            this.Field17471 = false;
            return;
        }
        if (this.Method7592(this.Field17467.down().down().down())) {
            this.Method7594(this.Field17467.down().down());
            this.Field17471 = false;
            return;
        }
        this.Field17471 = true;
    }

    private boolean Method7592(BlockPos blockPos) {
        Block block = Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock();
        if (block.isReplaceable((IBlockAccess)Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) return false;
        return true;
    }

    private void Method7593(int n, boolean bl) {
        Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
        Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n;
    }

    private void Method7594(BlockPos blockPos) {
        double d = this.Field17458.Method367();
        if (blockPos.distanceSq(Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) > d * d) {
            return;
        }
        int n = Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        Class1036.Method4207(blockPos, EnumHand.MAIN_HAND, this.Field17461.Method365(), this.Field17462.Method365(), false);
        if (!this.Field17463.Method365()) return;
        Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, blockPos, EnumFacing.DOWN));
    }

    private List Method7595(Entity entity) {
        ArrayList arrayList = new ArrayList();
        double d = entity.posX;
        double d2 = entity.posZ;
        double d3 = 0.0;
        double d4 = 0.0;
        int n = 0;
        while (n < this.Field17460.Method335()) {
            this.Method7596(d + (d3 += entity.motionX), this.Field17470, d2 + (d4 += entity.motionZ), arrayList);
            ++n;
        }
        return arrayList;
    }

    private void Method7596(double d, double d2, double d3, List list) {
        BlockPos blockPos = new BlockPos(d + Double.longBitsToDouble(0x3FD3333333333333L), d2, d3 + Double.longBitsToDouble(0x3FD3333333333333L));
        BlockPos blockPos2 = new BlockPos(d + Double.longBitsToDouble((long)212349716 ^ 0x3FD333333F9B0027L), d2, d3 - Double.longBitsToDouble((long)1907018985 ^ 0x3FD333334299FFDAL));
        BlockPos blockPos3 = new BlockPos(d - Double.longBitsToDouble(0x3FD3333333333333L), d2, d3 + Double.longBitsToDouble(0x3FD3333333333333L));
        BlockPos blockPos4 = new BlockPos(d - Double.longBitsToDouble((long)1082681892 ^ 0x3FD3333373BB5917L), d2, d3 - Double.longBitsToDouble(0x3FD3333333333333L));
        if (this.Method7598(blockPos)) {
            this.Method7597(list, blockPos);
        }
        if (this.Method7598(blockPos2)) {
            this.Method7597(list, blockPos2);
        }
        if (this.Method7598(blockPos3)) {
            this.Method7597(list, blockPos3);
        }
        if (!this.Method7598(blockPos4)) return;
        this.Method7597(list, blockPos4);
    }

    private void Method7597(List list, Object object) {
        if (list.contains(object)) return;
        list.add(object);
    }

    private boolean Method7598(BlockPos blockPos) {
        if (!Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            return false;
        }
        Iterator iterator = Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(blockPos)).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity instanceof EntityItem) continue;
            if (!(entity instanceof EntityXPOrb)) return false;
        }
        return true;
    }

    private void Method7599(EntityPlayer entityPlayer) {
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(() -> this.Method7600(entityPlayer));
    }

    private List Method7600(EntityPlayer entityPlayer) throws Exception {
        this.Field17466 = this.Method7595((Entity)entityPlayer);
        return this.Field17466;
    }

    private Long Method7601() {
        return this.Field17464.Method2000().Method369();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 74;
            cArray2[n] = (char)(cArray[n] ^ (0x3A3C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

