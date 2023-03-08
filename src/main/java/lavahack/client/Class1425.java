//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.common.*;
import net.minecraft.init.*;
import org.lwjgl.input.*;
import net.minecraft.network.*;
import net.minecraft.entity.*;
import net.minecraft.network.play.client.*;
import net.minecraft.world.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.item.*;
import net.minecraft.util.*;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class Class1425 extends Class42
{
    private final Class1303 Field14625;
    private final Class44 Field14626;
    private final Class1303 Field14627;
    private final Class44 Field14628;
    private final Class44 Field14629;
    private final Class44 Field14630;
    private final Class44 Field14631;
    private final Class44 Field14632;
    private final Class44 Field14633;
    private final Class44 Field14634;
    private final Class44 Field14635;
    private final Class44 Field14636;
    private final Class44 Field14637;
    private final Class44 Field14638;
    private final Class44 Field14639;
    private final Class44 Field14640;
    private final Class44 Field14641;
    private final Class44 Field14642;
    private final Class44 Field14643;
    private final Class44 Field14644;
    private int Field14645;
    private int Field14646;
    private BlockPos Field14647;
    private String Field14648 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1425() {
        super("ScaffoldTest3", Class97.Field8345);
        this.Field14625 = new Class1303("Switch", (Class42)this, (Enum)Class711.Field11028).Method5303();
        this.Field14626 = this.Method23(new Class44("Tower", this, false));
        this.Field14627 = new Class1303("TowerMode", (Class42)this, (Enum)Class892.Field11735).Method5301((Supplier)this.Field14626::Method365).Method5303();
        this.Field14628 = this.Method23(new Class44("TowerTicks", this, 1.0, 1.0, Double.longBitsToDouble((long)406778497 ^ 0x40340000183EF281L), true).Method313(this.Field14626::Method365));
        this.Field14629 = this.Method23(new Class44("TowerStrict", this, false).Method313(this::Method5706));
        this.Field14630 = this.Method23(new Class44("TowerSetBack", this, false).Method313(this::Method5705));
        this.Field14631 = this.Method23(new Class44("TowerUpSpoof", this, false).Method313(this::Method5704));
        this.Field14632 = this.Method23(new Class44("TowerUpSpoofBalance", this, 0.0, 0.0, Double.longBitsToDouble(4621819117588971520L), true).Method313(this::Method5703));
        this.Field14633 = this.Method23(new Class44("TowerUpSpoofStrict", this, false).Method313(this::Method5702));
        this.Field14634 = this.Method23(new Class44("TowerUpSpoofBack", this, true).Method313(this::Method5701));
        this.Field14635 = this.Method23(new Class44("TowerMotion", this, Double.longBitsToDouble(4601237667291888353L), 0.0, 1.0, false).Method313(this::Method5700));
        this.Field14636 = this.Method23(new Class44("TowerGroundSpoof", this, false).Method313(this::Method5699));
        this.Field14637 = this.Method23(new Class44("Restrict", this, true).Method313(this.Field14626::Method365));
        this.Field14638 = this.Method23(new Class44("RestrictTicks", this, Double.longBitsToDouble(4624633867356078080L), 1.0, Double.longBitsToDouble(4630826316843712512L), true).Method313(this.Field14626::Method365));
        this.Field14639 = this.Method23(new Class44("TowerBind", this, 57).Method355("Bind").Method313(this.Field14626::Method365));
        this.Field14640 = this.Method23(new Class44("Down", this, 0));
        this.Field14641 = this.Method23(new Class44("KeeY", this, false));
        this.Field14642 = this.Method23(new Class44("ResetY", this, 0).Method313(this.Field14641::Method365));
        this.Field14643 = this.Method23(new Class44("Rotate", this, false));
        this.Field14644 = this.Method23(new Class44("Packet", this, false));
        this.Field14646 = 0;
        this.Field14647 = null;
    }
    
    @Override
    public void Method38() {
        if (Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        this.Field14645 = (int)Math.floor(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY);
        super.Method38();
        MinecraftForge.EVENT_BUS.register((Object)this);
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
        if (Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        final int method127 = Class9.Method127(Blocks.OBSIDIAN);
        if (method127 == -1) {
            return;
        }
        final BlockPos down = new BlockPos(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, (double)this.Field14645, Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ).down();
        final int field14645 = (int)Math.abs(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY);
        final boolean b = this.Field14647 != null && (this.Field14647.getX() != down.getX() || this.Field14647.getZ() != down.getZ());
        final BlockPos blockPos = down;
        final int n = field14645;
        final int n2 = method127;
        if (Keyboard.isKeyDown(this.Field14640.Method337())) {}
        if (this.Method5691(blockPos, n, n2, false)) {
            return;
        }
        this.Method5692(field14645);
        if (Keyboard.isKeyDown(this.Field14640.Method337())) {}
        this.Field14645 = field14645;
        ++this.Field14646;
    }
    
    private boolean Method5691(final BlockPos blockPos, final int field14645, final int n, final boolean b) {
        if (b) {
            this.Method5693(this.Field14647.down(), n);
        }
        final BlockPos method5695 = this.Method5695(blockPos);
        if (Class1036.Method4213(b ? blockPos.down() : blockPos).isEmpty() && method5695 != null) {
            this.Method5693(b ? method5695.down() : method5695, n);
        }
        this.Method5693(b ? blockPos.down() : blockPos, n);
        if (!this.Field14641.Method365() && !b && field14645 > this.Field14645) {
            this.Method5693(blockPos.up(), n);
        }
        if (this.Field14641.Method365()) {
            if (Keyboard.isKeyDown(this.Field14642.Method337())) {
                this.Field14645 = field14645;
            }
            return true;
        }
        return false;
    }
    
    private void Method5692(final int n) {
        if (this.Field14626.Method365() && Keyboard.isKeyDown(this.Field14639.Method337()) && Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % this.Field14628.Method335() == 0 && (!this.Field14637.Method365() || this.Field14646 >= this.Field14638.Method335())) {
            if (this.Field14627.Method341() == Class892.Field11736) {
                if (this.Field14636.Method365()) {
                    Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer(true));
                }
                else {
                    Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, CPacketEntityAction$Action.START_FALL_FLYING));
                }
                Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = this.Field14635.Method367();
                Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance = 0.0f;
            }
            else if (Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY - Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY / Double.longBitsToDouble((long)951674900 ^ 0x4024000038B96814L) * this.Field14632.Method367()) > Math.ceil(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) && this.Field14631.Method365()) {
                if (this.Field14633.Method365()) {
                    final double n2 = Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY - Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY / Double.longBitsToDouble(4621819117588971520L) * this.Field14632.Method367());
                    Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, n2, Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, false));
                    Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Math.floor(n2), Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, true));
                    Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Math.floor(n2), Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
                    Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
                    if (this.Field14634.Method365()) {
                        Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, n2, Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, false));
                    }
                }
                else {
                    Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Math.ceil(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY), Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, true));
                    Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Math.ceil(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY), Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
                    Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
                    Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Math.ceil(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) + Double.longBitsToDouble(4562254508917369340L), Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, false));
                }
            }
            else if (n > this.Field14645) {
                final double posX = Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
                final double posY = Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
                final double posZ = Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ;
                final boolean onGround = Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround;
                Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, (double)n, Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, true));
                Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, (double)n, Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
                Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
                if (!this.Field14629.Method365()) {
                    Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(posX, posY, posZ, onGround));
                }
                if (this.Field14630.Method365()) {
                    Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(posX, posY, posZ);
                }
            }
        }
    }
    
    private void Method5693(final BlockPos blockPos, final int i) {
        if (!Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos) || this.Method5694(blockPos)) {
            return;
        }
        final int currentItem = Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        ((Class711)this.Field14625.Method341()).Method2972().Method1726(i, false);
        Class1036.Method4208(blockPos, EnumHand.MAIN_HAND, this.Field14643.Method365(), this.Field14644.Method365());
        ((Class711)this.Field14625.Method341()).Method2972().Method1726(currentItem, true);
    }
    
    private boolean Method5694(final BlockPos blockPos) {
        for (final Entity entity : Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)Entity.class, new AxisAlignedBB(blockPos))) {
            if (!(entity instanceof EntityItem)) {
                if (entity instanceof EntityXPOrb) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
    
    private BlockPos Method5695(final BlockPos blockPos) {
        return Stream.of(EnumFacing.HORIZONTALS).map((Function<? super EnumFacing, ? extends BlockPos>)blockPos::offset).filter(Class1425::Method5698).filter(this::Method5697).min(Comparator.comparingDouble((ToDoubleFunction<? super BlockPos>)Class1425::Method5696)).orElse(null);
    }
    
    private static double Method5696(final BlockPos blockPos) {
        return Class1425.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(blockPos.getX() + Double.longBitsToDouble(4602678819172646912L), (double)(blockPos.getY() + 1), blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L));
    }
    
    private boolean Method5697(final BlockPos blockPos) {
        return !this.Method5694(blockPos);
    }
    
    private static boolean Method5698(final BlockPos blockPos) {
        return !Class1036.Method4213(blockPos).isEmpty();
    }
    
    private Boolean Method5699() {
        return this.Field14626.Method365() && this.Field14627.Method341() == Class892.Field11736;
    }
    
    private Boolean Method5700() {
        return this.Field14626.Method365() && this.Field14627.Method341() == Class892.Field11736;
    }
    
    private Boolean Method5701() {
        return this.Field14626.Method365() && this.Field14627.Method341() == Class892.Field11735;
    }
    
    private Boolean Method5702() {
        return this.Field14626.Method365() && this.Field14627.Method341() == Class892.Field11735;
    }
    
    private Boolean Method5703() {
        return this.Field14626.Method365() && this.Field14627.Method341() == Class892.Field11735;
    }
    
    private Boolean Method5704() {
        return this.Field14626.Method365() && this.Field14627.Method341() == Class892.Field11735;
    }
    
    private Boolean Method5705() {
        return this.Field14626.Method365() && this.Field14627.Method341() == Class892.Field11735;
    }
    
    private Boolean Method5706() {
        return this.Field14626.Method365() && this.Field14627.Method341() == Class892.Field11735;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x232D ^ 0xBB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
