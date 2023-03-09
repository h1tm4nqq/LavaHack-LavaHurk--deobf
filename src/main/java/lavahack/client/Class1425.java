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
 *  net.minecraft.network.play.client.CPacketEntityAction
 *  net.minecraft.network.play.client.CPacketEntityAction$Action
 *  net.minecraft.network.play.client.CPacketPlayer
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.IBlockAccess
 *  net.minecraftforge.common.MinecraftForge
 *  org.lwjgl.input.Keyboard
 */
package lavahack.client;

import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Stream;
import lavahack.client.Class1036;
import lavahack.client.Class1303;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class711;
import lavahack.client.Class892;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.MinecraftForge;
import org.lwjgl.input.Keyboard;

public class Class1425
extends Class42 {
    private final Class1303 Field14625 = new Class1303("Switch", (Class42)this, Class711.Field11028).Method5303();
    private final Class44 Field14626 = this.Method23(new Class44("Tower", (Class42)this, false));
    private final Class1303 Field14627 = new Class1303("TowerMode", (Class42)this, Class892.Field11735).Method5301(this.Field14626::Method365).Method5303();
    private final Class44 Field14628 = this.Method23(new Class44("TowerTicks", (Class42)this, 1.0, 1.0, Double.longBitsToDouble((long)406778497 ^ 0x40340000183EF281L), true).Method313(this.Field14626::Method365));
    private final Class44 Field14629 = this.Method23(new Class44("TowerStrict", (Class42)this, false).Method313(this::Method5706));
    private final Class44 Field14630 = this.Method23(new Class44("TowerSetBack", (Class42)this, false).Method313(this::Method5705));
    private final Class44 Field14631 = this.Method23(new Class44("TowerUpSpoof", (Class42)this, false).Method313(this::Method5704));
    private final Class44 Field14632 = this.Method23(new Class44("TowerUpSpoofBalance", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(0x4024000000000000L), true).Method313(this::Method5703));
    private final Class44 Field14633 = this.Method23(new Class44("TowerUpSpoofStrict", (Class42)this, false).Method313(this::Method5702));
    private final Class44 Field14634 = this.Method23(new Class44("TowerUpSpoofBack", (Class42)this, true).Method313(this::Method5701));
    private final Class44 Field14635 = this.Method23(new Class44("TowerMotion", (Class42)this, Double.longBitsToDouble(4601237667291888353L), 0.0, 1.0, false).Method313(this::Method5700));
    private final Class44 Field14636 = this.Method23(new Class44("TowerGroundSpoof", (Class42)this, false).Method313(this::Method5699));
    private final Class44 Field14637 = this.Method23(new Class44("Restrict", (Class42)this, true).Method313(this.Field14626::Method365));
    private final Class44 Field14638 = this.Method23(new Class44("RestrictTicks", (Class42)this, Double.longBitsToDouble(4624633867356078080L), 1.0, Double.longBitsToDouble(0x4044000000000000L), true).Method313(this.Field14626::Method365));
    private final Class44 Field14639 = this.Method23(new Class44("TowerBind", (Class42)this, 57).Method355("Bind").Method313(this.Field14626::Method365));
    private final Class44 Field14640 = this.Method23(new Class44("Down", (Class42)this, 0));
    private final Class44 Field14641 = this.Method23(new Class44("KeeY", (Class42)this, false));
    private final Class44 Field14642 = this.Method23(new Class44("ResetY", (Class42)this, 0).Method313(this.Field14641::Method365));
    private final Class44 Field14643 = this.Method23(new Class44("Rotate", (Class42)this, false));
    private final Class44 Field14644 = this.Method23(new Class44("Packet", (Class42)this, false));
    private int Field14645;
    private int Field14646 = 0;
    private BlockPos Field14647 = null;
    private String Field14648 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1425() {
        super("ScaffoldTest3", Class97.Field8345);
    }

    @Override
    public void Method38() {
        if (Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            this.Field14645 = (int)Math.floor(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY);
            super.Method38();
            MinecraftForge.EVENT_BUS.register((Object)this);
            return;
        }
        this.Method22();
    }

    @Override
    public void Method39() {
        super.Method39();
        MinecraftForge.EVENT_BUS.unregister((Object)this);
        this.Field14645 = 0;
        this.Field14646 = 0;
        this.Field14647 = null;
    }

    @Override
    public void Method45() {
        boolean bl;
        if (Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        int n = Class9.Method127(Blocks.OBSIDIAN);
        if (n == -1) {
            return;
        }
        BlockPos blockPos = new BlockPos(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, (double)this.Field14645, Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ).down();
        int n2 = (int)Math.abs(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY);
        boolean bl2 = bl = this.Field14647 != null && (this.Field14647.getX() != blockPos.getX() || this.Field14647.getZ() != blockPos.getZ());
        if (Keyboard.isKeyDown((int)this.Field14640.Method337())) {
        }
        if (this.Method5691(blockPos, n2, n, false)) {
            return;
        }
        this.Method5692(n2);
        if (Keyboard.isKeyDown((int)this.Field14640.Method337())) {
        }
        this.Field14645 = n2;
        ++this.Field14646;
    }

    private boolean Method5691(BlockPos blockPos, int n, int n2, boolean bl) {
        if (bl) {
            this.Method5693(this.Field14647.down(), n2);
        }
        BlockPos blockPos2 = this.Method5695(blockPos);
        if (Class1036.Method4213(bl ? blockPos.down() : blockPos).isEmpty() && blockPos2 != null) {
            this.Method5693(bl ? blockPos2.down() : blockPos2, n2);
        }
        this.Method5693(bl ? blockPos.down() : blockPos, n2);
        if (!this.Field14641.Method365() && !bl && n > this.Field14645) {
            this.Method5693(blockPos.up(), n2);
        }
        if (!this.Field14641.Method365()) return false;
        if (!Keyboard.isKeyDown((int)this.Field14642.Method337())) return true;
        this.Field14645 = n;
        return true;
    }

    private void Method5692(int n) {
        if (!this.Field14626.Method365()) return;
        if (!Keyboard.isKeyDown((int)this.Field14639.Method337())) return;
        if (Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % this.Field14628.Method335() != 0) return;
        if (this.Field14637.Method365()) {
            if (this.Field14646 < this.Field14638.Method335()) return;
        }
        if (this.Field14627.Method341() == Class892.Field11736) {
            if (this.Field14636.Method365()) {
                Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer(true));
            } else {
                Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, CPacketEntityAction.Action.START_FALL_FLYING));
            }
            Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = this.Field14635.Method367();
            Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance = 0.0f;
            return;
        }
        if (Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY - Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY / Double.longBitsToDouble((long)951674900 ^ 0x4024000038B96814L) * this.Field14632.Method367()) > Math.ceil(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) && this.Field14631.Method365()) {
            if (this.Field14633.Method365()) {
                double d = Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY - Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY / Double.longBitsToDouble(0x4024000000000000L) * this.Field14632.Method367());
                Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, d, Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, false));
                Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Math.floor(d), Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, true));
                Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Math.floor(d), Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
                Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
                if (!this.Field14634.Method365()) return;
                Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, d, Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, false));
                return;
            }
            Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Math.ceil(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY), Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, true));
            Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Math.ceil(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY), Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
            Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
            Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Math.ceil(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) + Double.longBitsToDouble(4562254508917369340L), Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, false));
            return;
        }
        if (n <= this.Field14645) return;
        double d = Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
        double d2 = Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
        double d3 = Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ;
        boolean bl = Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround;
        Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, (double)n, Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, true));
        Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, (double)n, Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
        if (!this.Field14629.Method365()) {
            Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d, d2, d3, bl));
        }
        if (!this.Field14630.Method365()) return;
        Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(d, d2, d3);
    }

    private void Method5693(BlockPos blockPos, int n) {
        if (!Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) return;
        if (this.Method5694(blockPos)) {
            return;
        }
        int n2 = Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        ((Class711)this.Field14625.Method341()).Method2972().Method1726(n, false);
        Class1036.Method4208(blockPos, EnumHand.MAIN_HAND, this.Field14643.Method365(), this.Field14644.Method365());
        ((Class711)this.Field14625.Method341()).Method2972().Method1726(n2, true);
    }

    private boolean Method5694(BlockPos blockPos) {
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
        Iterator iterator = Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, axisAlignedBB).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity instanceof EntityItem) continue;
            if (!(entity instanceof EntityXPOrb)) return true;
        }
        return false;
    }

    private BlockPos Method5695(BlockPos blockPos) {
        return Stream.of(EnumFacing.HORIZONTALS).map(arg_0 -> ((BlockPos)blockPos).offset(arg_0)).filter(Class1425::Method5698).filter(this::Method5697).min(Comparator.comparingDouble(Class1425::Method5696)).orElse(null);
    }

    private static double Method5696(BlockPos blockPos) {
        return Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)blockPos.getX() + Double.longBitsToDouble(4602678819172646912L), (double)(blockPos.getY() + 1), (double)blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L));
    }

    private boolean Method5697(BlockPos blockPos) {
        if (this.Method5694(blockPos)) return false;
        return true;
    }

    private static boolean Method5698(BlockPos blockPos) {
        if (Class1036.Method4213(blockPos).isEmpty()) return false;
        return true;
    }

    private Boolean Method5699() {
        boolean bl;
        if (this.Field14626.Method365() && this.Field14627.Method341() == Class892.Field11736) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method5700() {
        boolean bl;
        if (this.Field14626.Method365() && this.Field14627.Method341() == Class892.Field11736) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method5701() {
        boolean bl;
        if (this.Field14626.Method365() && this.Field14627.Method341() == Class892.Field11735) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method5702() {
        boolean bl;
        if (this.Field14626.Method365() && this.Field14627.Method341() == Class892.Field11735) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method5703() {
        boolean bl;
        if (this.Field14626.Method365() && this.Field14627.Method341() == Class892.Field11735) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method5704() {
        boolean bl;
        if (this.Field14626.Method365() && this.Field14627.Method341() == Class892.Field11735) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method5705() {
        boolean bl;
        if (this.Field14626.Method365() && this.Field14627.Method341() == Class892.Field11735) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method5706() {
        boolean bl;
        if (this.Field14626.Method365() && this.Field14627.Method341() == Class892.Field11735) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 187;
            cArray2[n] = (char)(cArray[n] ^ (0x232D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

