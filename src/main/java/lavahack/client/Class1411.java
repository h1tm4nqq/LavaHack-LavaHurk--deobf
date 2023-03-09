//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityEnderCrystal
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.Item
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketAnimation
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.IBlockAccess
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import lavahack.client.Class1010;
import lavahack.client.Class103;
import lavahack.client.Class1036;
import lavahack.client.Class1486;
import lavahack.client.Class1517;
import lavahack.client.Class1523;
import lavahack.client.Class1568;
import lavahack.client.Class1595;
import lavahack.client.Class1735;
import lavahack.client.Class1744;
import lavahack.client.Class1765;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class447;
import lavahack.client.Class467;
import lavahack.client.Class699;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;

public class Class1411
extends Class42 {
    private Class44 Field14385 = new Class44("SurroundVec", (Class42)this, Class103.Field8358);
    private Class44 Field14386 = new Class44("Completion", (Class42)this, Class1523.Field15115);
    private Class44 Field14387 = new Class44("Center", (Class42)this, Class699.Field10963);
    private Class44 Field14388 = new Class44("Switch", (Class42)this, Class1765.Field16072);
    private Class44 Field14389 = new Class44("Hand", (Class42)this, Class1517.Field15103);
    private Class44 Field14390 = new Class44("BlocksPerTick", (Class42)this, Double.longBitsToDouble((long)1069413959 ^ 0x401000003FBDF647L), 0.0, Double.longBitsToDouble(0x4024000000000000L), true);
    private Class44 Field14391 = new Class44("RayTrace", (Class42)this, false);
    private Class44 Field14392 = new Class44("Packet", (Class42)this, false);
    private Class44 Field14393 = new Class44("Confirm", (Class42)this, false);
    private final Class44 Field14394 = new Class44("No Interact", (Class42)this, false);
    private Class44 Field14395 = new Class44("Rewrite", (Class42)this, false);
    private Class44 Field14396 = new Class44("Rewrite Dynamic", (Class42)this, false);
    private Class44 Field14397 = new Class44("Rewrite Support", (Class42)this, Class1595.Field15462);
    private Class44 Field14398 = new Class44("Rewrite Retries", (Class42)this, Double.longBitsToDouble(0x4014000000000000L), 0.0, Double.longBitsToDouble(0x4034000000000000L), true);
    private Class44 Field14399 = new Class44("Rewrite Protect Retries", (Class42)this, Double.longBitsToDouble(0x4014000000000000L), 0.0, Double.longBitsToDouble((long)301170471 ^ 0x4034000011F37F27L), true);
    private Class44 Field14400 = new Class44("Rewrite Rotate", (Class42)this, Class1735.Field15962);
    private Class44 Field14401 = new Class44("Rewrite Crystal Breaker", (Class42)this, true);
    private Class44 Field14402 = new Class44("Rewrite Break Delay", (Class42)this, Double.longBitsToDouble(0x4024000000000000L), 0.0, Double.longBitsToDouble(4636737291354636288L), Class467.Field9943);
    private Class44 Field14403 = new Class44("Rewrite Break Range", (Class42)this, Double.longBitsToDouble((long)243272149 ^ 0x401400000E8009D5L), 1.0, Double.longBitsToDouble((long)95850504 ^ 0x4018000005B69008L), false);
    private Class44 Field14404 = new Class44("Rewrite Protect Vec", (Class42)this, false);
    public static Class1411 Field14405;
    private int Field14406 = -1;
    private int Field14407;
    private int Field14408;
    private int Field14409;
    private int Field14410 = 0;
    private BlockPos Field14411 = BlockPos.ORIGIN;
    private BlockPos Field14412 = BlockPos.ORIGIN;
    private Class650 Field14413 = new Class650();
    private ArrayList Field14414 = new ArrayList();
    private String Field14415 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1411() {
        super("Surround", "Surround", Class97.Field8338);
        Field14405 = this;
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14385);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14386);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14387);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14388);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14389);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14390);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14391);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14392);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14393);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14394);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14395);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14396);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14397);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14398);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14399);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14400);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14401);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14402);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14403);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14404);
    }

    @Override
    public void Method38() {
        this.Field14411 = new BlockPos(new Vec3d((double)Class447.Method2112(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector().x, 0), (double)Class447.Method2112(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector().y, 0), (double)Class447.Method2112(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector().z, 0)));
        String string = this.Field14387.Method359();
        int n = -1;
        switch (string.hashCode()) {
            case -577575125: {
                if (!string.equals("TELEPORT")) return;
                return;
            }
            case -2014989386: {
                if (!string.equals("MOTION")) return;
                return;
            }
        }
    }

    @Override
    public void Method45() {
        if (Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        super.Method43("[" + (this.Field14395.Method365() ? (this.Field14396.Method365() ? "Dynamic" : "Rewrite") : this.Field14385.Method359()) + "]");
        this.Field14410 = 0;
        String string = this.Field14386.Method359();
        int n = -1;
        switch (string.hashCode()) {
            case 1367557153: {
                if (string.equals("ToggleAfterComplete")) {
                    n = 0;
                }
                break;
            }
            case 64810: {
                if (string.equals("AIR")) {
                    n = 1;
                }
                break;
            }
            case 839452253: {
                if (string.equals("SURROUNDED")) {
                    n = 2;
                }
                break;
            }
        }
        this.Method20();
    }

    private Class103 Method5565(String string) {
        String string2 = string;
        int n = -1;
        switch (string2.hashCode()) {
            case 2031313: {
                if (!string2.equals("BASE")) return Class103.Field8358;
                n = 0;
                return Class103.Field8358;
            }
            case 2095255245: {
                if (!string2.equals("STANDART")) return Class103.Field8358;
                n = 1;
                return Class103.Field8358;
            }
            case 408969903: {
                if (!string2.equals("PROTECT")) return Class103.Field8358;
                n = 2;
                return Class103.Field8358;
            }
            case 1463156937: {
                if (!string2.equals("PROTECTplus")) return Class103.Field8358;
                n = 3;
                return Class103.Field8358;
            }
        }
        return Class103.Field8358;
    }

    public void Method20() {
        this.Field14406 = Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        if (!Class1411.Method5569((Entity)Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) && !this.Field14395.Method365()) {
            Class9.Method110(Class9.Method116(Item.getItemFromBlock((Block)Blocks.OBSIDIAN), 0, 9), this.Field14388.Method359().equals("Silent"));
            this.Method5566();
            if (!this.Field14388.Method359().equals("Silent")) return;
            Class9.Method110(this.Field14406, true);
            return;
        }
        if (!this.Field14395.Method365()) return;
        this.Method5566();
    }

    public void Method5566() {
        block19: {
            Iterator iterator;
            float[] fArray;
            block20: {
                block18: {
                    int n;
                    if (!this.Field14395.Method365()) break block18;
                    if (this.Method5572().isEmpty()) break block19;
                    if (Class9.Method120(Blocks.OBSIDIAN, 0, 9) != -1) {
                        n = Class9.Method120(Blocks.OBSIDIAN, 0, 9);
                    } else {
                        if (Class9.Method120(Blocks.ENDER_CHEST, 0, 9) == -1) return;
                        n = Class9.Method120(Blocks.OBSIDIAN, 0, 9);
                    }
                    Class9.Method110(n, this.Field14388.Method359().equals("Silent"));
                    fArray = new float[]{Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch};
                    iterator = this.Method5572().iterator();
                    break block20;
                }
                Iterator iterator2 = Class103.Method816(this.Method5565(this.Field14385.Method359())).iterator();
                while (iterator2.hasNext()) {
                    Vec3d vec3d = (Vec3d)iterator2.next();
                    if (!Objects.equals((Object)Class1036.Method4218(new BlockPos(vec3d.add(new Vec3d(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, (double)Math.round(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY), Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)))), (Object)Class1010.Field12390) || !((double)this.Field14410 <= this.Field14390.Method367())) continue;
                    this.Field14412 = new BlockPos(vec3d.add(new Vec3d(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, (double)Math.round(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY), Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)));
                    for (Entity entity : Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList) {
                        if (!(entity instanceof EntityItem) || !((EntityItem)entity).getItem().getItem().equals(Item.getItemFromBlock((Block)Blocks.OBSIDIAN))) continue;
                        entity.setDead();
                        Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntityFromWorld(entity.getEntityId());
                    }
                    boolean bl = Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSneaking();
                    if (this.Field14394.Method365()) {
                        Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSneaking(true);
                    }
                    Class1036.Method4214(new BlockPos(vec3d.add(new Vec3d(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, (double)Math.round(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY), Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ))), this.Field14392.Method365(), this.Field14393.Method365());
                    if (this.Field14394.Method365()) {
                        Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSneaking(bl);
                    }
                    Class1744.Method6632((Class1517)this.Field14389.Method341());
                    ++this.Field14410;
                }
                return;
            }
            while (iterator.hasNext()) {
                BlockPos blockPos = (BlockPos)iterator.next();
                if (!this.Field14400.Method359().equalsIgnoreCase(Class1735.Field15960.name())) {
                    float[] fArray2 = Class1568.Method6176(blockPos);
                    Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = fArray2[0];
                    Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = fArray2[1];
                }
                if (!this.Field14397.Method359().equalsIgnoreCase(Class1595.Field15462.name()) && (Class1036.Method4215(blockPos) == null || this.Field14397.Method359().equalsIgnoreCase(Class1595.Field15464.name()) && Class1486.Method5948(blockPos, true, true))) {
                    if (this.Field14401.Method365()) {
                        this.Method5567(blockPos.down());
                    }
                    this.Method5568(blockPos.down());
                }
                if (!Class1486.Method5951(blockPos, true, true, this.Field14408 <= this.Field14398.Method335())) continue;
                if (this.Field14401.Method365()) {
                    this.Method5567(blockPos);
                }
                this.Method5568(blockPos);
                ++this.Field14408;
            }
            if (!this.Field14414.isEmpty() && this.Field14404.Method365()) {
                for (BlockPos blockPos : this.Field14414) {
                    if (!Class1486.Method5951(blockPos, true, true, this.Field14409 <= this.Field14399.Method335())) continue;
                    if (this.Field14401.Method365()) {
                        this.Method5567(blockPos);
                    }
                    this.Method5568(blockPos);
                }
            }
            if (this.Field14388.Method359().equals("Silent")) {
                Class9.Method110(this.Field14406, true);
            }
            if (this.Field14400.Method359().equalsIgnoreCase(Class1735.Field15962.name())) {
                Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = fArray[0];
                Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = fArray[1];
            }
        }
        this.Field14407 = 0;
        if (!this.Method5572().isEmpty()) {
            return;
        }
        if (this.Field14414.isEmpty()) {
            this.Field14409 = 0;
        }
        this.Field14408 = 0;
        if (!this.Field14386.Method359().equalsIgnoreCase(Class1523.Field15118.name())) return;
        this.Method21(false);
    }

    private void Method5567(BlockPos blockPos) {
        Iterator iterator = Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABBExcludingEntity(null, new AxisAlignedBB(blockPos)).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (!(entity instanceof EntityEnderCrystal)) continue;
            if (!this.Field14400.Method359().equalsIgnoreCase(Class1735.Field15960.name())) {
                float[] fArray = Class1568.Method6176(blockPos);
                Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = fArray[0];
                Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = fArray[1];
            }
            Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketUseEntity(entity));
            Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketAnimation(EnumHand.MAIN_HAND));
        }
    }

    private void Method5568(BlockPos blockPos) {
        if (this.Field14407 >= this.Field14390.Method335()) return;
        boolean bl = Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSneaking();
        if (this.Field14394.Method365()) {
            Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSneaking(true);
        }
        Class1486.Method5949(blockPos, EnumHand.MAIN_HAND, this.Field14392.Method365());
        if (this.Field14394.Method365()) {
            Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSneaking(bl);
        }
        ++this.Field14407;
    }

    public static boolean Method5569(Entity entity) {
        if (Class1411.Method5570(new BlockPos(entity.posX, (double)Math.round(entity.posY), entity.posZ))) return true;
        if (Class1411.Method5571(new BlockPos(entity.posX, (double)Math.round(entity.posY), entity.posZ))) return true;
        return false;
    }

    public static boolean Method5570(BlockPos blockPos) {
        if (Class1036.Method4218(blockPos.add(0, 1, 0)) != Class1010.Field12390) return false;
        if (Class1411.Method5571(blockPos)) return false;
        if (Class1036.Method4218(blockPos.add(0, 0, 0)) != Class1010.Field12390) return false;
        if (Class1036.Method4218(blockPos.add(0, 2, 0)) != Class1010.Field12390) return false;
        if (Class1036.Method4218(blockPos.add(0, 0, -1)) != Class1010.Field12392) {
            if (Class1036.Method4218(blockPos.add(0, 0, -1)) != Class1010.Field12393) return false;
        }
        if (Class1036.Method4218(blockPos.add(1, 0, 0)) != Class1010.Field12392) {
            if (Class1036.Method4218(blockPos.add(1, 0, 0)) != Class1010.Field12393) return false;
        }
        if (Class1036.Method4218(blockPos.add(-1, 0, 0)) != Class1010.Field12392) {
            if (Class1036.Method4218(blockPos.add(-1, 0, 0)) != Class1010.Field12393) return false;
        }
        if (Class1036.Method4218(blockPos.add(0, 0, 1)) != Class1010.Field12392) {
            if (Class1036.Method4218(blockPos.add(0, 0, 1)) != Class1010.Field12393) return false;
        }
        if (Class1036.Method4218(blockPos.add(Double.longBitsToDouble((long)831616464 ^ 0x3FE00000319175D0L), Double.longBitsToDouble((long)2017402461 ^ 0x3FE00000783F1E5DL), Double.longBitsToDouble((long)1530061920 ^ 0x3FE000005B32E460L))) != Class1010.Field12390) return false;
        if (Class1036.Method4218(blockPos.add(0, -1, 0)) == Class1010.Field12392) return true;
        if (Class1036.Method4218(blockPos.add(0, -1, 0)) != Class1010.Field12393) return false;
        return true;
    }

    public static boolean Method5571(BlockPos blockPos) {
        if (Class1036.Method4218(blockPos.add(0, 1, 0)) != Class1010.Field12390) return false;
        if (Class1036.Method4218(blockPos.add(0, 0, 0)) != Class1010.Field12390) return false;
        if (Class1036.Method4218(blockPos.add(0, 2, 0)) != Class1010.Field12390) return false;
        if (Class1036.Method4218(blockPos.add(0, 0, -1)) != Class1010.Field12393) return false;
        if (Class1036.Method4218(blockPos.add(1, 0, 0)) != Class1010.Field12393) return false;
        if (Class1036.Method4218(blockPos.add(-1, 0, 0)) != Class1010.Field12393) return false;
        if (Class1036.Method4218(blockPos.add(0, 0, 1)) != Class1010.Field12393) return false;
        if (Class1036.Method4218(blockPos.add(Double.longBitsToDouble((long)914460024 ^ 0x3FE0000036818D78L), Double.longBitsToDouble((long)691895546 ^ 0x3FE00000293D7CFAL), Double.longBitsToDouble((long)831109537 ^ 0x3FE000003189B9A1L))) != Class1010.Field12390) return false;
        if (Class1036.Method4218(blockPos.add(0, -1, 0)) != Class1010.Field12393) return false;
        return true;
    }

    private List Method5572() {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        Iterator iterator = this.Method5574().iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            if (this.Method5573(blockPos)) continue;
            arrayList.add(blockPos);
        }
        return arrayList;
    }

    private boolean Method5573(BlockPos blockPos) {
        if (Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) return false;
        return true;
    }

    private List Method5574() {
        ArrayList arrayList = new ArrayList();
        this.Field14414.clear();
        if (this.Field14396.Method365()) {
            int n;
            int n2;
            double d = Math.abs(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) - Math.floor(Math.abs(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX));
            double d2 = Math.abs(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) - Math.floor(Math.abs(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ));
            int n3 = this.Method5578(d, false);
            int n4 = this.Method5578(d, true);
            int n5 = this.Method5578(d2, false);
            int n6 = this.Method5578(d2, true);
            ArrayList<BlockPos> arrayList2 = new ArrayList<BlockPos>();
            arrayList.addAll(this.Method5576());
            for (n2 = 1; n2 < n3 + 1; ++n2) {
                arrayList2.add(this.Method5579(this.Method5575(), n2, 1 + n5));
                arrayList2.add(this.Method5579(this.Method5575(), n2, -(1 + n6)));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), n2, 1 + n5), n2, 2 + n5));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), n2, 1 + n5), n2, 3 + n5));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), n2, -(1 + n6)), n2, -(2 + n6)));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), n2, -(1 + n6)), n2, -(3 + n6)));
            }
            for (n2 = 0; n2 <= n4; ++n2) {
                arrayList2.add(this.Method5579(this.Method5575(), -n2, 1 + n5));
                arrayList2.add(this.Method5579(this.Method5575(), -n2, -(1 + n6)));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), -n2, 1 + n5), -n2, 2 + n5));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), -n2, 1 + n5), -n2, 3 + n5));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), -n2, -(1 + n6)), -n2, -(2 + n6)));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), -n2, -(1 + n6)), -n2, -(3 + n6)));
            }
            for (n = 1; n < n5 + 1; ++n) {
                arrayList2.add(this.Method5579(this.Method5575(), 1 + n3, n));
                arrayList2.add(this.Method5579(this.Method5575(), -(1 + n4), n));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), 1 + n3, n), 2 + n3, n));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), 1 + n3, n), 3 + n3, n));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), -(1 + n4), n), -(2 + n4), n));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), -(1 + n4), n), -(3 + n4), n));
            }
            n = 0;
            while (true) {
                if (n > n6) {
                    arrayList.addAll(arrayList2);
                    return arrayList;
                }
                arrayList2.add(this.Method5579(this.Method5575(), 1 + n3, -n));
                arrayList2.add(this.Method5579(this.Method5575(), -(1 + n4), -n));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), 1 + n3, n), 2 + n3, -n));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), 1 + n3, n), 3 + n3, n));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), -(1 + n4), -n), -(2 + n4), -n));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), -(1 + n4), -n), -(3 + n4), -n));
                ++n;
            }
        }
        EnumFacing[] enumFacingArray = EnumFacing.HORIZONTALS;
        int n = enumFacingArray.length;
        int n7 = 0;
        while (n7 < n) {
            EnumFacing enumFacing = enumFacingArray[n7];
            arrayList.add(this.Method5575().add(enumFacing.getXOffset(), 0, enumFacing.getZOffset()));
            ++n7;
        }
        return arrayList;
    }

    private BlockPos Method5575() {
        double d;
        double d2 = Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
        if (Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - Math.floor(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) > Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)619283039 ^ 0x403364B8234E92A8L)) ^ 0x7FDAFD219E3E896DL)) {
            d = Math.floor(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) + Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4617211115437597968L)) ^ 0x7FE3A10BE4A4A510L);
            return new BlockPos(d2, d, Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        }
        d = Math.floor(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY);
        return new BlockPos(d2, d, Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
    }

    private List Method5576() {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        int n = this.Method5577(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Math.floor(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX));
        int n2 = this.Method5577(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Math.floor(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ));
        arrayList.add(this.Method5575());
        int n3 = 0;
        while (n3 <= Math.abs(n)) {
            for (int i = 0; i <= Math.abs(n2); ++i) {
                int n4 = n3 * n;
                int n5 = i * n2;
                arrayList.add(this.Method5575().add(n4, -1, n5));
            }
            ++n3;
        }
        return arrayList;
    }

    private int Method5577(double d) {
        if (d >= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4626940857062532511L)) ^ 0x7FD05457839243F9L)) {
            return 1;
        }
        if (!(d <= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4619607385899014120L)) ^ 0x7FCF1742257B24DBL))) return 0;
        return -1;
    }

    private int Method5578(double d, boolean bl) {
        if (bl) {
            if (!(d <= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)847006289 ^ 0x403E8FD0A92AC17EL)) ^ 0x7FEDBCE3A865B81CL))) return 0;
            return 1;
        }
        if (!(d >= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4626984327357715003L)) ^ 0x7FD03FDD7B12B45DL))) return 0;
        return 1;
    }

    private BlockPos Method5579(BlockPos blockPos, double d, double d2) {
        if (blockPos.getX() < 0) {
            d = -d;
        }
        if (blockPos.getZ() >= 0) {
            return blockPos.add(d, Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)671686526 ^ 0x7FEA775983EEE8BFL)) ^ 0x7FEA7759ABE7F7C1L), d2);
        }
        d2 = -d2;
        return blockPos.add(d, Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)671686526 ^ 0x7FEA775983EEE8BFL)) ^ 0x7FEA7759ABE7F7C1L), d2);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 198;
            cArray2[n] = (char)(cArray[n] ^ (0x4E29 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

