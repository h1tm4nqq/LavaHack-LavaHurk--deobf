//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import net.minecraft.entity.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.item.*;
import net.minecraft.network.*;
import net.minecraft.network.play.client.*;
import net.minecraft.world.*;
import java.util.*;
import net.minecraft.util.*;

public class Class1411 extends Class42
{
    private Class44 Field14385;
    private Class44 Field14386;
    private Class44 Field14387;
    private Class44 Field14388;
    private Class44 Field14389;
    private Class44 Field14390;
    private Class44 Field14391;
    private Class44 Field14392;
    private Class44 Field14393;
    private final Class44 Field14394;
    private Class44 Field14395;
    private Class44 Field14396;
    private Class44 Field14397;
    private Class44 Field14398;
    private Class44 Field14399;
    private Class44 Field14400;
    private Class44 Field14401;
    private Class44 Field14402;
    private Class44 Field14403;
    private Class44 Field14404;
    public static Class1411 Field14405;
    private int Field14406;
    private int Field14407;
    private int Field14408;
    private int Field14409;
    private int Field14410;
    private BlockPos Field14411;
    private BlockPos Field14412;
    private Class650 Field14413;
    private ArrayList Field14414;
    private String Field14415 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1411() {
        super("Surround", "Surround", Class97.Field8338);
        this.Field14385 = new Class44("SurroundVec", this, (Enum)Class103.Field8358);
        this.Field14386 = new Class44("Completion", this, Class1523.Field15115);
        this.Field14387 = new Class44("Center", this, Class699.Field10963);
        this.Field14388 = new Class44("Switch", this, Class1765.Field16072);
        this.Field14389 = new Class44("Hand", this, Class1517.Field15103);
        this.Field14390 = new Class44("BlocksPerTick", this, Double.longBitsToDouble((long)1069413959 ^ 0x401000003FBDF647L), 0.0, Double.longBitsToDouble(4621819117588971520L), true);
        this.Field14391 = new Class44("RayTrace", this, false);
        this.Field14392 = new Class44("Packet", this, false);
        this.Field14393 = new Class44("Confirm", this, false);
        this.Field14394 = new Class44("No Interact", this, false);
        this.Field14395 = new Class44("Rewrite", this, false);
        this.Field14396 = new Class44("Rewrite Dynamic", this, false);
        this.Field14397 = new Class44("Rewrite Support", this, Class1595.Field15462);
        this.Field14398 = new Class44("Rewrite Retries", this, Double.longBitsToDouble(4617315517961601024L), 0.0, Double.longBitsToDouble(4626322717216342016L), true);
        this.Field14399 = new Class44("Rewrite Protect Retries", this, Double.longBitsToDouble(4617315517961601024L), 0.0, Double.longBitsToDouble((long)301170471 ^ 0x4034000011F37F27L), true);
        this.Field14400 = new Class44("Rewrite Rotate", this, Class1735.Field15962);
        this.Field14401 = new Class44("Rewrite Crystal Breaker", this, true);
        this.Field14402 = new Class44("Rewrite Break Delay", this, Double.longBitsToDouble(4621819117588971520L), 0.0, Double.longBitsToDouble(4636737291354636288L), Class467.Field9943);
        this.Field14403 = new Class44("Rewrite Break Range", this, Double.longBitsToDouble((long)243272149 ^ 0x401400000E8009D5L), 1.0, Double.longBitsToDouble((long)95850504 ^ 0x4018000005B69008L), false);
        this.Field14404 = new Class44("Rewrite Protect Vec", this, false);
        this.Field14406 = -1;
        this.Field14410 = 0;
        this.Field14411 = BlockPos.ORIGIN;
        this.Field14412 = BlockPos.ORIGIN;
        this.Field14413 = new Class650();
        this.Field14414 = new ArrayList();
        Class1411.Field14405 = this;
        Class1411.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14385);
        Class1411.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14386);
        Class1411.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14387);
        Class1411.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14388);
        Class1411.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14389);
        Class1411.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14390);
        Class1411.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14391);
        Class1411.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14392);
        Class1411.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14393);
        Class1411.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14394);
        Class1411.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14395);
        Class1411.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14396);
        Class1411.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14397);
        Class1411.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14398);
        Class1411.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14399);
        Class1411.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14400);
        Class1411.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14401);
        Class1411.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14402);
        Class1411.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14403);
        Class1411.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field14404);
    }
    
    @Override
    public void Method38() {
        this.Field14411 = new BlockPos(new Vec3d((double)Class447.Method2112(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector().x, 0), (double)Class447.Method2112(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector().y, 0), (double)Class447.Method2112(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector().z, 0)));
        final String method359 = this.Field14387.Method359();
        switch (method359.hashCode()) {
            case -577575125: {
                if (method359.equals("TELEPORT")) {
                    break;
                }
                break;
            }
            case -2014989386: {
                if (method359.equals("MOTION")) {
                    break;
                }
                break;
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
        final String method359 = this.Field14386.Method359();
        switch (method359.hashCode()) {
            case 1367557153: {
                if (method359.equals("ToggleAfterComplete")) {
                    break;
                }
                break;
            }
            case 64810: {
                if (method359.equals("AIR")) {
                    break;
                }
                break;
            }
            case 839452253: {
                if (method359.equals("SURROUNDED")) {
                    break;
                }
                break;
            }
        }
        this.Method20();
    }
    
    private Class103 Method5565(final String s) {
        switch (s.hashCode()) {
            case 2031313: {
                if (s.equals("BASE")) {
                    break;
                }
                break;
            }
            case 2095255245: {
                if (s.equals("STANDART")) {
                    break;
                }
                break;
            }
            case 408969903: {
                if (s.equals("PROTECT")) {
                    break;
                }
                break;
            }
            case 1463156937: {
                if (s.equals("PROTECTplus")) {
                    break;
                }
                break;
            }
        }
        return Class103.Field8358;
    }
    
    public void Method20() {
        this.Field14406 = Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        if (!Method5569((Entity)Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) && !this.Field14395.Method365()) {
            Class9.Method110(Class9.Method116(Item.getItemFromBlock(Blocks.OBSIDIAN), 0, 9), this.Field14388.Method359().equals("Silent"));
            this.Method5566();
            if (this.Field14388.Method359().equals("Silent")) {
                Class9.Method110(this.Field14406, true);
            }
        }
        else if (this.Field14395.Method365()) {
            this.Method5566();
        }
    }
    
    public void Method5566() {
        if (!this.Field14395.Method365()) {
            for (final Vec3d vec3d : Class103.Method816(this.Method5565(this.Field14385.Method359()))) {
                if (Objects.equals(Class1036.Method4218(new BlockPos(vec3d.add(new Vec3d(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, (double)Math.round(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY), Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)))), Class1010.Field12390) && this.Field14410 <= this.Field14390.Method367()) {
                    this.Field14412 = new BlockPos(vec3d.add(new Vec3d(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, (double)Math.round(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY), Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)));
                    for (final Entity entity : Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList) {
                        if (entity instanceof EntityItem && ((EntityItem)entity).getItem().getItem().equals(Item.getItemFromBlock(Blocks.OBSIDIAN))) {
                            entity.setDead();
                            Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntityFromWorld(entity.getEntityId());
                        }
                    }
                    final boolean isSneaking = Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSneaking();
                    if (this.Field14394.Method365()) {
                        Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSneaking(true);
                    }
                    Class1036.Method4214(new BlockPos(vec3d.add(new Vec3d(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, (double)Math.round(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY), Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ))), this.Field14392.Method365(), this.Field14393.Method365());
                    if (this.Field14394.Method365()) {
                        Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSneaking(isSneaking);
                    }
                    Class1744.Method6632((Class1517)this.Field14389.Method341());
                    ++this.Field14410;
                }
            }
        }
        else {
            if (!this.Method5572().isEmpty()) {
                int n;
                if (Class9.Method120(Blocks.OBSIDIAN, 0, 9) != -1) {
                    n = Class9.Method120(Blocks.OBSIDIAN, 0, 9);
                }
                else {
                    if (Class9.Method120(Blocks.ENDER_CHEST, 0, 9) == -1) {
                        return;
                    }
                    n = Class9.Method120(Blocks.OBSIDIAN, 0, 9);
                }
                Class9.Method110(n, this.Field14388.Method359().equals("Silent"));
                final float[] array = { Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch };
                for (final BlockPos blockPos : this.Method5572()) {
                    if (!this.Field14400.Method359().equalsIgnoreCase(Class1735.Field15960.name())) {
                        final float[] method6176 = Class1568.Method6176(blockPos);
                        Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = method6176[0];
                        Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = method6176[1];
                    }
                    if (!this.Field14397.Method359().equalsIgnoreCase(Class1595.Field15462.name()) && (Class1036.Method4215(blockPos) == null || (this.Field14397.Method359().equalsIgnoreCase(Class1595.Field15464.name()) && Class1486.Method5948(blockPos, true, true)))) {
                        if (this.Field14401.Method365()) {
                            this.Method5567(blockPos.down());
                        }
                        this.Method5568(blockPos.down());
                    }
                    if (!Class1486.Method5951(blockPos, true, true, this.Field14408 <= this.Field14398.Method335())) {
                        continue;
                    }
                    if (this.Field14401.Method365()) {
                        this.Method5567(blockPos);
                    }
                    this.Method5568(blockPos);
                    ++this.Field14408;
                }
                if (!this.Field14414.isEmpty()) {
                    if (this.Field14404.Method365()) {
                        for (final BlockPos blockPos2 : this.Field14414) {
                            if (!Class1486.Method5951(blockPos2, true, true, this.Field14409 <= this.Field14399.Method335())) {
                                continue;
                            }
                            if (this.Field14401.Method365()) {
                                this.Method5567(blockPos2);
                            }
                            this.Method5568(blockPos2);
                        }
                    }
                }
                if (this.Field14388.Method359().equals("Silent")) {
                    Class9.Method110(this.Field14406, true);
                }
                if (this.Field14400.Method359().equalsIgnoreCase(Class1735.Field15962.name())) {
                    Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = array[0];
                    Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = array[1];
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
            if (this.Field14386.Method359().equalsIgnoreCase(Class1523.Field15118.name())) {
                this.Method21(false);
            }
        }
    }
    
    private void Method5567(final BlockPos blockPos) {
        for (final Entity entity : Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABBExcludingEntity((Entity)null, new AxisAlignedBB(blockPos))) {
            if (entity instanceof EntityEnderCrystal) {
                if (!this.Field14400.Method359().equalsIgnoreCase(Class1735.Field15960.name())) {
                    final float[] method6176 = Class1568.Method6176(blockPos);
                    Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = method6176[0];
                    Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = method6176[1];
                }
                Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketUseEntity(entity));
                Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketAnimation(EnumHand.MAIN_HAND));
            }
        }
    }
    
    private void Method5568(final BlockPos blockPos) {
        if (this.Field14407 < this.Field14390.Method335()) {
            final boolean isSneaking = Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSneaking();
            if (this.Field14394.Method365()) {
                Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSneaking(true);
            }
            Class1486.Method5949(blockPos, EnumHand.MAIN_HAND, this.Field14392.Method365());
            if (this.Field14394.Method365()) {
                Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSneaking(isSneaking);
            }
            ++this.Field14407;
        }
    }
    
    public static boolean Method5569(final Entity entity) {
        return Method5570(new BlockPos(entity.posX, (double)Math.round(entity.posY), entity.posZ)) || Method5571(new BlockPos(entity.posX, (double)Math.round(entity.posY), entity.posZ));
    }
    
    public static boolean Method5570(final BlockPos blockPos) {
        return Class1036.Method4218(blockPos.add(0, 1, 0)) == Class1010.Field12390 && !Method5571(blockPos) && Class1036.Method4218(blockPos.add(0, 0, 0)) == Class1010.Field12390 && Class1036.Method4218(blockPos.add(0, 2, 0)) == Class1010.Field12390 && (Class1036.Method4218(blockPos.add(0, 0, -1)) == Class1010.Field12392 || Class1036.Method4218(blockPos.add(0, 0, -1)) == Class1010.Field12393) && (Class1036.Method4218(blockPos.add(1, 0, 0)) == Class1010.Field12392 || Class1036.Method4218(blockPos.add(1, 0, 0)) == Class1010.Field12393) && (Class1036.Method4218(blockPos.add(-1, 0, 0)) == Class1010.Field12392 || Class1036.Method4218(blockPos.add(-1, 0, 0)) == Class1010.Field12393) && (Class1036.Method4218(blockPos.add(0, 0, 1)) == Class1010.Field12392 || Class1036.Method4218(blockPos.add(0, 0, 1)) == Class1010.Field12393) && Class1036.Method4218(blockPos.add(Double.longBitsToDouble((long)831616464 ^ 0x3FE00000319175D0L), Double.longBitsToDouble((long)2017402461 ^ 0x3FE00000783F1E5DL), Double.longBitsToDouble((long)1530061920 ^ 0x3FE000005B32E460L))) == Class1010.Field12390 && (Class1036.Method4218(blockPos.add(0, -1, 0)) == Class1010.Field12392 || Class1036.Method4218(blockPos.add(0, -1, 0)) == Class1010.Field12393);
    }
    
    public static boolean Method5571(final BlockPos blockPos) {
        return Class1036.Method4218(blockPos.add(0, 1, 0)) == Class1010.Field12390 && Class1036.Method4218(blockPos.add(0, 0, 0)) == Class1010.Field12390 && Class1036.Method4218(blockPos.add(0, 2, 0)) == Class1010.Field12390 && Class1036.Method4218(blockPos.add(0, 0, -1)) == Class1010.Field12393 && Class1036.Method4218(blockPos.add(1, 0, 0)) == Class1010.Field12393 && Class1036.Method4218(blockPos.add(-1, 0, 0)) == Class1010.Field12393 && Class1036.Method4218(blockPos.add(0, 0, 1)) == Class1010.Field12393 && Class1036.Method4218(blockPos.add(Double.longBitsToDouble((long)914460024 ^ 0x3FE0000036818D78L), Double.longBitsToDouble((long)691895546 ^ 0x3FE00000293D7CFAL), Double.longBitsToDouble((long)831109537 ^ 0x3FE000003189B9A1L))) == Class1010.Field12390 && Class1036.Method4218(blockPos.add(0, -1, 0)) == Class1010.Field12393;
    }
    
    private List Method5572() {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        for (final BlockPos e : this.Method5574()) {
            if (this.Method5573(e)) {
                continue;
            }
            list.add(e);
        }
        return list;
    }
    
    private boolean Method5573(final BlockPos blockPos) {
        return !Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos);
    }
    
    private List Method5574() {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        this.Field14414.clear();
        if (this.Field14396.Method365()) {
            final double n = Math.abs(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) - Math.floor(Math.abs(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX));
            final double n2 = Math.abs(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) - Math.floor(Math.abs(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ));
            final int method5578 = this.Method5578(n, false);
            final int method5579 = this.Method5578(n, true);
            final int method5580 = this.Method5578(n2, false);
            final int method5581 = this.Method5578(n2, true);
            final ArrayList<BlockPos> c = new ArrayList<BlockPos>();
            list.addAll(this.Method5576());
            for (int i = 1; i < method5578 + 1; ++i) {
                c.add(this.Method5579(this.Method5575(), i, 1 + method5580));
                c.add(this.Method5579(this.Method5575(), i, -(1 + method5581)));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), i, 1 + method5580), i, 2 + method5580));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), i, 1 + method5580), i, 3 + method5580));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), i, -(1 + method5581)), i, -(2 + method5581)));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), i, -(1 + method5581)), i, -(3 + method5581)));
            }
            for (int j = 0; j <= method5579; ++j) {
                c.add(this.Method5579(this.Method5575(), -j, 1 + method5580));
                c.add(this.Method5579(this.Method5575(), -j, -(1 + method5581)));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), -j, 1 + method5580), -j, 2 + method5580));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), -j, 1 + method5580), -j, 3 + method5580));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), -j, -(1 + method5581)), -j, -(2 + method5581)));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), -j, -(1 + method5581)), -j, -(3 + method5581)));
            }
            for (int k = 1; k < method5580 + 1; ++k) {
                c.add(this.Method5579(this.Method5575(), 1 + method5578, k));
                c.add(this.Method5579(this.Method5575(), -(1 + method5579), k));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), 1 + method5578, k), 2 + method5578, k));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), 1 + method5578, k), 3 + method5578, k));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), -(1 + method5579), k), -(2 + method5579), k));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), -(1 + method5579), k), -(3 + method5579), k));
            }
            for (int l = 0; l <= method5581; ++l) {
                c.add(this.Method5579(this.Method5575(), 1 + method5578, -l));
                c.add(this.Method5579(this.Method5575(), -(1 + method5579), -l));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), 1 + method5578, l), 2 + method5578, -l));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), 1 + method5578, l), 3 + method5578, l));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), -(1 + method5579), -l), -(2 + method5579), -l));
                this.Field14414.add(this.Method5579(this.Method5579(this.Method5575(), -(1 + method5579), -l), -(3 + method5579), -l));
            }
            list.addAll(c);
        }
        else {
            for (final EnumFacing enumFacing : EnumFacing.HORIZONTALS) {
                list.add(this.Method5575().add(enumFacing.getXOffset(), 0, enumFacing.getZOffset()));
            }
        }
        return list;
    }
    
    private BlockPos Method5575() {
        return new BlockPos(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, (Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - Math.floor(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) > Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)619283039 ^ 0x403364B8234E92A8L)) ^ 0x7FDAFD219E3E896DL)) ? (Math.floor(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) + Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4617211115437597968L)) ^ 0x7FE3A10BE4A4A510L)) : Math.floor(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY), Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
    }
    
    private List Method5576() {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        final int method5577 = this.Method5577(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Math.floor(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX));
        final int method5578 = this.Method5577(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Math.floor(Class1411.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ));
        list.add(this.Method5575());
        for (int i = 0; i <= Math.abs(method5577); ++i) {
            for (int j = 0; j <= Math.abs(method5578); ++j) {
                list.add(this.Method5575().add(i * method5577, -1, j * method5578));
            }
        }
        return list;
    }
    
    private int Method5577(final double n) {
        return (n >= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4626940857062532511L)) ^ 0x7FD05457839243F9L)) ? 1 : ((n <= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4619607385899014120L)) ^ 0x7FCF1742257B24DBL)) ? -1 : 0);
    }
    
    private int Method5578(final double n, final boolean b) {
        if (b) {
            return (n <= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)847006289 ^ 0x403E8FD0A92AC17EL)) ^ 0x7FEDBCE3A865B81CL)) ? 1 : 0;
        }
        return (n >= Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4626984327357715003L)) ^ 0x7FD03FDD7B12B45DL)) ? 1 : 0;
    }
    
    private BlockPos Method5579(final BlockPos blockPos, double n, double n2) {
        if (blockPos.getX() < 0) {
            n = -n;
        }
        if (blockPos.getZ() < 0) {
            n2 = -n2;
        }
        return blockPos.add(n, Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)671686526 ^ 0x7FEA775983EEE8BFL)) ^ 0x7FEA7759ABE7F7C1L), n2);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4E29 ^ 0xC6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
