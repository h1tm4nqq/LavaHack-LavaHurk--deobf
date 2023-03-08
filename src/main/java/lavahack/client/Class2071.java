//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.player.*;
import java.util.function.*;
import net.minecraft.init.*;
import java.util.*;
import net.minecraft.world.*;
import net.minecraft.network.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.item.*;
import java.util.concurrent.*;

@Deprecated
public class Class2071 extends Class42
{
    private final Class44 Field17457;
    private final Class44 Field17458;
    private final Class44 Field17459;
    private final Class44 Field17460;
    private final Class44 Field17461;
    private final Class44 Field17462;
    private final Class44 Field17463;
    private final Class411 Field17464;
    private final Class61 Field17465;
    private List Field17466;
    BlockPos Field17467;
    EntityPlayer Field17468;
    EntityPlayer Field17469;
    double Field17470;
    boolean Field17471;
    int Field17472;
    private int Field17473;
    
    public Class2071() {
        super("Flatten", Class97.Field8338);
        this.Field17457 = this.Method23(new Class44("EnemyRange", this, Double.longBitsToDouble((long)2013395552 ^ 0x402000007801FA60L), Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4624633867356078080L), false));
        this.Field17458 = this.Method23(new Class44("PlaceRange", this, Double.longBitsToDouble((long)2085353035 ^ 0x401400007C4BF64BL), 1.0, Double.longBitsToDouble(4618441417868443648L), false));
        this.Field17459 = this.Method23(new Class44("DoubleDown", this, false));
        this.Field17460 = this.Method23(new Class44("PredictTicks", this, 1.0, 0.0, Double.longBitsToDouble(4621819117588971520L), true));
        this.Field17461 = this.Method23(new Class44("Rotate", this, false));
        this.Field17462 = this.Method23(new Class44("Packet", this, false));
        this.Field17463 = this.Method23(new Class44("AntiGlitch", this, false));
        this.Field17464 = this.Method54();
        this.Field17465 = new Class61(this.Field17457::Method367, this::Method7601, this.Field17464.Method2001()::Method365);
        this.Field17466 = new ArrayList();
        this.Field17469 = null;
        this.Field17471 = false;
    }
    
    @Override
    public void Method45() {
        if (Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        this.Field17466.clear();
        this.Field17472 = Class9.Method127(Blocks.OBSIDIAN);
        if (this.Field17472 == -1) {
            return;
        }
        final EntityPlayer method496 = this.Field17465.Method496();
        if (method496 == null) {
            return;
        }
        if (this.Field17469 != method496 || this.Field17471) {
            this.Field17469 = method496;
            this.Field17470 = method496.posY - 1.0;
        }
        this.Field17467 = new BlockPos(method496.posX, this.Field17470 + 1.0, method496.posZ);
        this.Field17464.Method2005(this::Method7599);
        final int currentItem = Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        this.Method7593(this.Field17472, false);
        final Iterator<BlockPos> iterator = (Iterator<BlockPos>)this.Field17466.iterator();
        while (iterator.hasNext()) {
            this.Method7594(iterator.next());
        }
        this.Method7593(currentItem, true);
        Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
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
        }
        else if (this.Method7592(this.Field17467.east().down())) {
            this.Field17471 = false;
            this.Method7594(this.Field17467.down());
        }
        else if (this.Method7592(this.Field17467.south().down())) {
            this.Method7594(this.Field17467.down());
            this.Field17471 = false;
        }
        else if (this.Method7592(this.Field17467.west().down())) {
            this.Method7594(this.Field17467.down());
            this.Field17471 = false;
        }
        else if (this.Method7592(this.Field17467.down().down())) {
            this.Method7594(this.Field17467.down());
            this.Field17471 = false;
        }
        else if (!this.Field17459.Method365()) {
            this.Field17471 = true;
        }
        else if (this.Field17459.Method365()) {
            if (this.Method7592(this.Field17467.north().down().down())) {
                this.Method7594(this.Field17467.down().down());
                this.Field17471 = false;
            }
            else if (this.Method7592(this.Field17467.east().down().down())) {
                this.Method7594(this.Field17467.down().down());
                this.Field17471 = false;
            }
            else if (this.Method7592(this.Field17467.south().down().down())) {
                this.Method7594(this.Field17467.down().down());
                this.Field17471 = false;
            }
            else if (this.Method7592(this.Field17467.west().down().down())) {
                this.Method7594(this.Field17467.down());
                this.Field17471 = false;
            }
            else if (this.Method7592(this.Field17467.down().down().down())) {
                this.Method7594(this.Field17467.down().down());
                this.Field17471 = false;
            }
            else {
                this.Field17471 = true;
            }
        }
    }
    
    private boolean Method7592(final BlockPos blockPos) {
        return !Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos);
    }
    
    private void Method7593(final int currentItem, final boolean b) {
        Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(currentItem));
        Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = currentItem;
    }
    
    private void Method7594(final BlockPos blockPos) {
        final double method367 = this.Field17458.Method367();
        if (blockPos.distanceSq(Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) > method367 * method367) {
            return;
        }
        final int currentItem = Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        Class1036.Method4207(blockPos, EnumHand.MAIN_HAND, this.Field17461.Method365(), this.Field17462.Method365(), false);
        if (this.Field17463.Method365()) {
            Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging$Action.START_DESTROY_BLOCK, blockPos, EnumFacing.DOWN));
        }
    }
    
    private List Method7595(final Entity entity) {
        final ArrayList list = new ArrayList();
        final double posX = entity.posX;
        final double posZ = entity.posZ;
        double n = 0.0;
        double n2 = 0.0;
        for (int i = 0; i < this.Field17460.Method335(); ++i) {
            n += entity.motionX;
            n2 += entity.motionZ;
            this.Method7596(posX + n, this.Field17470, posZ + n2, list);
        }
        return list;
    }
    
    private void Method7596(final double n, final double n2, final double n3, final List list) {
        final BlockPos blockPos = new BlockPos(n + Double.longBitsToDouble(4599075939470750515L), n2, n3 + Double.longBitsToDouble(4599075939470750515L));
        final BlockPos blockPos2 = new BlockPos(n + Double.longBitsToDouble((long)212349716 ^ 0x3FD333333F9B0027L), n2, n3 - Double.longBitsToDouble((long)1907018985 ^ 0x3FD333334299FFDAL));
        final BlockPos blockPos3 = new BlockPos(n - Double.longBitsToDouble(4599075939470750515L), n2, n3 + Double.longBitsToDouble(4599075939470750515L));
        final BlockPos blockPos4 = new BlockPos(n - Double.longBitsToDouble((long)1082681892 ^ 0x3FD3333373BB5917L), n2, n3 - Double.longBitsToDouble(4599075939470750515L));
        if (this.Method7598(blockPos)) {
            this.Method7597(list, blockPos);
        }
        if (this.Method7598(blockPos2)) {
            this.Method7597(list, blockPos2);
        }
        if (this.Method7598(blockPos3)) {
            this.Method7597(list, blockPos3);
        }
        if (this.Method7598(blockPos4)) {
            this.Method7597(list, blockPos4);
        }
    }
    
    private void Method7597(final List list, final Object o) {
        if (!list.contains(o)) {
            list.add(o);
        }
    }
    
    private boolean Method7598(final BlockPos blockPos) {
        if (!Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            return false;
        }
        for (final Entity entity : Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)Entity.class, new AxisAlignedBB(blockPos))) {
            if (!(entity instanceof EntityItem)) {
                if (entity instanceof EntityXPOrb) {
                    continue;
                }
                return false;
            }
        }
        return true;
    }
    
    private void Method7599(final EntityPlayer entityPlayer) {
        Class2071.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask((Callable)this::Method7600);
    }
    
    private List Method7600(final EntityPlayer entityPlayer) throws Exception {
        return this.Field17466 = this.Method7595((Entity)entityPlayer);
    }
    
    private Long Method7601() {
        return this.Field17464.Method2000().Method369();
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3A3C ^ 0x4A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
