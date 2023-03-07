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
import lavahack.client.IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk;
import lavahack.client.Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
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
public class FUXelihKbFJKhcEbIo20kHV7GCe5LsC7
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17457 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("EnemyRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)2013395552 ^ 0x402000007801FA60L), Double.longBitsToDouble(0xE7337523DF26A54EL ^ 0xA7337523DF26A54EL), Double.longBitsToDouble(0x496BF9AAAD71B02EL ^ 0x945F9AAAD71B02EL), (boolean)((long)1574924151 ^ (long)1574924151)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17458 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PlaceRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)2085353035 ^ 0x401400007C4BF64BL), 1.0, Double.longBitsToDouble(0xCD7271007D1FA3ECL ^ 0x8D6A71007D1FA3ECL), ((int)-47486029L ^ 0xFD2B6BB3) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17459 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("DoubleDown", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1011844817L ^ 0xC3B0792F) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17460 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PredictTicks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble(0xBAE70D6573B7773L ^ 0x4B8A70D6573B7773L), ((int)-1646188948L ^ 0x9DE1266D) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17461 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1620750162L ^ 0x9F6550AE) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17462 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-483924226L ^ 0xE327E6FE) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17463 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("AntiGlitch", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-422855513 ^ (long)-422855513)));
    private final Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ Field17464 = this.Method54();
    private final IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk Field17465 = new IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk(this.Field17457::Method367, this::Method7601, this.Field17464.Method2001()::Method365);
    private List Field17466 = new ArrayList();
    BlockPos Field17467;
    EntityPlayer Field17468;
    EntityPlayer Field17469 = null;
    double Field17470;
    boolean Field17471 = (int)-459847256L ^ 0xE49749A8;
    int Field17472;
    private int Field17473;

    public FUXelihKbFJKhcEbIo20kHV7GCe5LsC7() {
        super("Flatten", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
    }

    @Override
    public void Method45() {
        if (FUXelihKbFJKhcEbIo20kHV7GCe5LsC7.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (FUXelihKbFJKhcEbIo20kHV7GCe5LsC7.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        this.Field17466.clear();
        this.Field17472 = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127(Blocks.OBSIDIAN);
        if (this.Field17472 == ((int)2075018899L ^ 0x8451B96C)) {
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
        int n = FUXelihKbFJKhcEbIo20kHV7GCe5LsC7.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        this.Method7593(this.Field17472, ((int)1119693455L ^ 0x42BD2A8F) != 0);
        Iterator iterator = this.Field17466.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Method7593(n, (boolean)((long)2079696337 ^ (long)2079696336));
                FUXelihKbFJKhcEbIo20kHV7GCe5LsC7.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
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
        this.Field17471 = (int)-1470058202L ^ 0xA860B126;
        this.Field17464.Method2004();
        this.Field17465.Method498();
    }

    private void Method20() {
        if (FUXelihKbFJKhcEbIo20kHV7GCe5LsC7.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(this.Field17467.down()).getBlock().isReplaceable((IBlockAccess)FUXelihKbFJKhcEbIo20kHV7GCe5LsC7.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, this.Field17467.down())) {
            return;
        }
        if (this.Method7592(this.Field17467.north().down())) {
            this.Method7594(this.Field17467.down());
            this.Field17471 = (int)((long)137078277 ^ (long)137078277);
            return;
        }
        if (this.Method7592(this.Field17467.east().down())) {
            this.Field17471 = (int)((long)24038126 ^ (long)24038126);
            this.Method7594(this.Field17467.down());
            return;
        }
        if (this.Method7592(this.Field17467.south().down())) {
            this.Method7594(this.Field17467.down());
            this.Field17471 = (int)-838704729L ^ 0xCE0261A7;
            return;
        }
        if (this.Method7592(this.Field17467.west().down())) {
            this.Method7594(this.Field17467.down());
            this.Field17471 = (int)1343557734L ^ 0x50151066;
            return;
        }
        if (this.Method7592(this.Field17467.down().down())) {
            this.Method7594(this.Field17467.down());
            this.Field17471 = (int)((long)-1881638766 ^ (long)-1881638766);
            return;
        }
        if (!this.Field17459.Method365()) {
            this.Field17471 = (int)-378306231L ^ 0xE9738148;
            return;
        }
        if (!this.Field17459.Method365()) return;
        if (this.Method7592(this.Field17467.north().down().down())) {
            this.Method7594(this.Field17467.down().down());
            this.Field17471 = (int)2107738595L ^ 0x7DA189E3;
            return;
        }
        if (this.Method7592(this.Field17467.east().down().down())) {
            this.Method7594(this.Field17467.down().down());
            this.Field17471 = (int)1301630703L ^ 0x4D954EEF;
            return;
        }
        if (this.Method7592(this.Field17467.south().down().down())) {
            this.Method7594(this.Field17467.down().down());
            this.Field17471 = (int)((long)-1751172659 ^ (long)-1751172659);
            return;
        }
        if (this.Method7592(this.Field17467.west().down().down())) {
            this.Method7594(this.Field17467.down());
            this.Field17471 = (int)1700711682L ^ 0x655ECD02;
            return;
        }
        if (this.Method7592(this.Field17467.down().down().down())) {
            this.Method7594(this.Field17467.down().down());
            this.Field17471 = (int)((long)-1315970855 ^ (long)-1315970855);
            return;
        }
        this.Field17471 = (int)((long)2041648668 ^ (long)2041648669);
    }

    private boolean Method7592(BlockPos blockPos) {
        int n;
        Block block = FUXelihKbFJKhcEbIo20kHV7GCe5LsC7.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock();
        if (!block.isReplaceable((IBlockAccess)FUXelihKbFJKhcEbIo20kHV7GCe5LsC7.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            n = (int)((long)1009444409 ^ (long)1009444408);
            return n != 0;
        }
        n = (int)1173141494L ^ 0x45ECB7F6;
        return n != 0;
    }

    private void Method7593(int n, boolean bl) {
        FUXelihKbFJKhcEbIo20kHV7GCe5LsC7.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
        FUXelihKbFJKhcEbIo20kHV7GCe5LsC7.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n;
    }

    private void Method7594(BlockPos blockPos) {
        double d = this.Field17458.Method367();
        if (blockPos.distanceSq(FUXelihKbFJKhcEbIo20kHV7GCe5LsC7.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, FUXelihKbFJKhcEbIo20kHV7GCe5LsC7.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, FUXelihKbFJKhcEbIo20kHV7GCe5LsC7.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) > d * d) {
            return;
        }
        int n = FUXelihKbFJKhcEbIo20kHV7GCe5LsC7.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4207(blockPos, EnumHand.MAIN_HAND, this.Field17461.Method365(), this.Field17462.Method365(), ((int)-2011475549L ^ 0x881B51A3) != 0);
        if (!this.Field17463.Method365()) return;
        FUXelihKbFJKhcEbIo20kHV7GCe5LsC7.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, blockPos, EnumFacing.DOWN));
    }

    private List Method7595(Entity entity) {
        ArrayList arrayList = new ArrayList();
        double d = entity.posX;
        double d2 = entity.posZ;
        double d3 = 0.0;
        double d4 = 0.0;
        int n = (int)((long)593399023 ^ (long)593399023);
        while (n < this.Field17460.Method335()) {
            this.Method7596(d + (d3 += entity.motionX), this.Field17470, d2 + (d4 += entity.motionZ), arrayList);
            ++n;
        }
        return arrayList;
    }

    private void Method7596(double d, double d2, double d3, List list) {
        BlockPos blockPos = new BlockPos(d + Double.longBitsToDouble(0x877153F47FBAE5AL ^ 0x37A4260C74C89D69L), d2, d3 + Double.longBitsToDouble(0x9322530A647E76A5L ^ 0xACF16039574D4596L));
        BlockPos blockPos2 = new BlockPos(d + Double.longBitsToDouble((long)212349716 ^ 0x3FD333333F9B0027L), d2, d3 - Double.longBitsToDouble((long)1907018985 ^ 0x3FD333334299FFDAL));
        BlockPos blockPos3 = new BlockPos(d - Double.longBitsToDouble(0x886CCAB9D474855AL ^ 0xB7BFF98AE747B669L), d2, d3 + Double.longBitsToDouble(0x1DFDD717374C2A38L ^ 0x222EE424047F190BL));
        BlockPos blockPos4 = new BlockPos(d - Double.longBitsToDouble((long)1082681892 ^ 0x3FD3333373BB5917L), d2, d3 - Double.longBitsToDouble(0x8CA5B9FC7359E79CL ^ 0xB3768ACF406AD4AFL));
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
        if (!FUXelihKbFJKhcEbIo20kHV7GCe5LsC7.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)FUXelihKbFJKhcEbIo20kHV7GCe5LsC7.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            return ((int)-72051744L ^ 0xFBB493E0) != 0;
        }
        Iterator iterator = FUXelihKbFJKhcEbIo20kHV7GCe5LsC7.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(blockPos)).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity instanceof EntityItem) continue;
            if (!(entity instanceof EntityXPOrb)) return (int)((long)-1948233188 ^ (long)-1948233188) != 0;
        }
        return ((int)-1090271638L ^ 0xBF03C66B) != 0;
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
        int n = (int)((long)690764539 ^ (long)690764539);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1178051934L ^ 0xB9C85A5D);
            int n2 = ((int)434642372L ^ 0x19E81DE1) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1172718540L ^ 0xBA19B2BB) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

