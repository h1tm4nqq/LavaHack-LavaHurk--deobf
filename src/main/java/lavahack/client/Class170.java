//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import java.util.*;
import net.minecraft.network.*;
import java.util.function.*;
import net.minecraft.util.math.*;
import java.util.stream.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.network.play.client.*;
import net.minecraft.client.gui.*;
import net.minecraft.network.play.server.*;
import net.minecraft.entity.*;
import org.lwjgl.input.*;
import java.util.concurrent.*;

public class Class170 extends Class42
{
    @Class873
    public static Class170 Field8725;
    private final Class1303 Field8726;
    private final Class1303 Field8727;
    private final Class44 Field8728;
    private final Class44 Field8729;
    private final Class1303 Field8730;
    private final Class1303 Field8731;
    private final Class1303 Field8732;
    private final Class44 Field8733;
    private final Class44 Field8734;
    private final Class44 Field8735;
    public final Class44 Field8736;
    private final Class1303 Field8737;
    private final Class44 Field8738;
    private final Class44 Field8739;
    private final Class44 Field8740;
    private final Class44 Field8741;
    private final Class44 Field8742;
    private final Class44 Field8743;
    private final Class44 Field8744;
    private final Class44 Field8745;
    private final Class44 Field8746;
    private final Class44 Field8747;
    private final Class44 Field8748;
    private final Class44 Field8749;
    private final Class44 Field8750;
    private final Class44 Field8751;
    private static final Random Field8752;
    private static final double Field8753;
    private int Field8754;
    private CPacketPlayer$Position Field8755;
    private List Field8756;
    private Map Field8757;
    private int Field8758;
    private int Field8759;
    private int Field8760;
    private boolean Field8761;
    private int Field8762;
    private int Field8763;
    private boolean Field8764;
    private int Field8765;
    private double Field8766;
    private double Field8767;
    private double Field8768;
    private int Field8769;
    private final Class650 Field8770;
    @Class1801
    private final Class618 Field8771;
    @Class1801
    private final Class618 Field8772;
    @Class1801
    private final Class618 Field8773;
    @Class1801
    private final Class618 Field8774;
    private String Field8775 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class170() {
        super("PacketFly", Class97.Field8344, true);
        this.Field8726 = new Class1303("Type", (Class42)this, (Enum)Class1356.Field14178).Method5303();
        this.Field8727 = new Class1303("Mode", (Class42)this, (Enum)Class81.Field8270).Method5303();
        this.Field8728 = this.Method23(new Class44("JitterBoundsVertical", this, Double.longBitsToDouble(4626885667169763328L), 0.0, Double.longBitsToDouble(4632233691727265792L), true).Method314(this.Field8727.Method341() == Class81.Field8272));
        this.Field8729 = this.Method23(new Class44("JitterBoundsHorizontal", this, Double.longBitsToDouble(4621819117588971520L), 0.0, Double.longBitsToDouble((long)608360434 ^ 0x404900002442D7F2L), true).Method314(this.Field8727.Method341() == Class81.Field8272));
        this.Field8730 = new Class1303("Limit", (Class42)this, (Enum)Class386.Field9616).Method5303();
        this.Field8731 = new Class1303("Phase", (Class42)this, (Enum)Class1237.Field13608).Method5303();
        this.Field8732 = new Class1303("Logic", (Class42)this, (Enum)Class1829.Field16446).Method5303();
        this.Field8733 = this.Method23(new Class44("MultiAxis", this, false));
        this.Field8734 = this.Method23(new Class44("NoPhaseSlow", this, false));
        this.Field8735 = this.Method23(new Class44("Speed", this, 1.0, 1.0, Double.longBitsToDouble(4621819117588971520L), false));
        this.Field8736 = this.Method23(new Class44("Factor", this, 1.0, 1.0, Double.longBitsToDouble(4621819117588971520L), false).Method313(this::Method1091));
        this.Field8737 = new Class1303("AntiKick", (Class42)this, (Enum)Class717.Field11067).Method5303();
        this.Field8738 = this.Method23(new Class44("Strict", this, false));
        this.Field8739 = this.Method23(new Class44("Bounds", this, true));
        this.Field8740 = this.Method23(new Class44("Confirm", this, false));
        this.Field8741 = this.Method23(new Class44("Constrict", this, false));
        this.Field8742 = this.Method23(new Class44("Conceal", this, false));
        this.Field8743 = this.Method23(new Class44("ForConceal", this, false).Method313(this.Field8742::Method365));
        this.Field8744 = this.Method23(new Class44("ConcealTicks", this, Double.longBitsToDouble((long)780659828 ^ 0x402400002E87EC74L), 1.0, Double.longBitsToDouble(4633641066610819072L), true).Method313(this.Field8742::Method365));
        this.Field8745 = this.Method23(new Class44("Jitter", this, false));
        this.Field8746 = this.Method23(new Class44("JitterTicks", this, Double.longBitsToDouble(4619567317775286272L), Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4624633867356078080L), true).Method313(this.Field8745::Method365));
        this.Field8747 = this.Method23(new Class44("ClearTicks", this, Double.longBitsToDouble((long)1064545555 ^ 0x403400003F73AD13L), Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4632233691727265792L), true));
        this.Field8748 = this.Method23(new Class44("TimerSpeed", this, 1.0, 1.0, Double.longBitsToDouble(4608983858650965606L), false));
        this.Field8749 = this.Method23(new Class44("ShrinkBoundingBox", this, false));
        this.Field8750 = this.Method23(new Class44("Facrotize", this, 0).Method313(this::Method1090));
        this.Field8751 = this.Method23(new Class44("Distance", this, Double.longBitsToDouble(4617315517961601024L), 1.0, Double.longBitsToDouble((long)504282770 ^ 0x403400001E0EBE92L), false).Method313(this::Method1089));
        this.Field8756 = new ArrayList();
        this.Field8757 = new ConcurrentHashMap();
        this.Field8759 = 0;
        this.Field8760 = 0;
        this.Field8761 = false;
        this.Field8762 = 0;
        this.Field8763 = 0;
        this.Field8764 = false;
        this.Field8765 = 0;
        this.Field8766 = 0.0;
        this.Field8767 = 0.0;
        this.Field8768 = 0.0;
        this.Field8769 = 0;
        this.Field8770 = new Class650();
        this.Field8771 = new Class618(this::Method1087, new Predicate[0]);
        this.Field8772 = new Class618(this::Method1086, new Predicate[0]);
        this.Field8773 = new Class618(this::Method1085, new Predicate[0]);
        this.Field8774 = new Class618(this::Method1084, new Predicate[0]);
    }
    
    @Override
    public void Method38() {
        super.Method38();
        if (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        if (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.isSingleplayer()) {
            Class1393.Method5507().Method1886("You are in Singleplayer: toggling off...");
            this.Method22();
            return;
        }
        this.Field8756.clear();
        this.Field8757.clear();
        this.Field8754 = 0;
        this.Field8758 = 0;
        this.Field8759 = 0;
        this.Field8760 = 0;
        this.Field8761 = false;
        this.Field8762 = 0;
        this.Field8763 = 0;
        this.Field8764 = false;
        this.Field8765 = 0;
        this.Field8766 = 0.0;
        this.Field8767 = 0.0;
        this.Field8768 = 0.0;
        this.Field8755 = new CPacketPlayer$Position(this.Method1078(), 1.0, this.Method1078(), Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround);
        this.Field8756.add(this.Field8755);
        Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)this.Field8755);
        Class1796.Field16242.Method705((Class1320)this);
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = Float.intBitsToFloat(1112014848);
        if (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null) {
            Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = 0.0;
            Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
            Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = false;
        }
        Class1796.Field16242.Method710((Class1320)this);
    }
    
    @Override
    public void Method45() {
        if (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = Float.intBitsToFloat(1112014848) / this.Field8748.Method368();
    }
    
    private void Method20() {
        this.Field8757.forEach(this::Method1088);
    }
    
    private void Method1070(final double n, final double n2, final double n3, final boolean b) {
    }
    
    private List Method1071(final Vec3d vec3d) {
        return Stream.of(new BlockPos[] { new BlockPos(vec3d.x + Double.longBitsToDouble((long)519187233 ^ 0x3FD333332DC11812L), vec3d.y, vec3d.z + Double.longBitsToDouble(4599075939470750515L)), new BlockPos(vec3d.x + Double.longBitsToDouble((long)1946323994 ^ 0x3FD333334731BF29L), vec3d.y, vec3d.z - Double.longBitsToDouble((long)1311870771 ^ 0x3FD333337D02BC00L)), new BlockPos(vec3d.x - Double.longBitsToDouble(4599075939470750515L), vec3d.y, vec3d.z + Double.longBitsToDouble((long)349901278 ^ 0x3FD3333327E822EDL)), new BlockPos(vec3d.x - Double.longBitsToDouble(4599075939470750515L), vec3d.y, vec3d.z - Double.longBitsToDouble(4599075939470750515L)) }).distinct().collect((Collector<? super BlockPos, ?, List<? super BlockPos>>)Collectors.toList());
    }
    
    private void Method1072(final double n, final double n2, final double n3, final boolean b) {
        final Vec3d vec3d = new Vec3d(Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + n, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + n2, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + n3);
        final Vec3d method1076 = this.Method1076(n, n2, n3);
        final boolean b2 = this.Field8730.Method341() != Class386.Field9616 && this.Field8762 == 0;
        if (this.Field8732.Method341() == Class1829.Field16446) {
            this.Method1073(vec3d);
            this.Method1074(method1076);
            if (b) {
                this.Method1075(vec3d);
            }
            return;
        }
        this.Method1074(method1076);
        this.Method1073(vec3d);
        if (b) {
            this.Method1075(vec3d);
        }
    }
    
    private void Method1073(final Vec3d vec3d) {
        final CPacketPlayer$Position cPacketPlayer$Position = new CPacketPlayer$Position(vec3d.x, vec3d.y, vec3d.z, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround);
        this.Field8756.add(cPacketPlayer$Position);
        Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)cPacketPlayer$Position);
    }
    
    private void Method1074(final Vec3d vec3d) {
        final CPacketPlayer$Position cPacketPlayer$Position = new CPacketPlayer$Position(vec3d.x, vec3d.y, vec3d.z, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround);
        this.Field8756.add(cPacketPlayer$Position);
        Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)cPacketPlayer$Position);
    }
    
    private void Method1075(final Vec3d vec3d) {
        ++this.Field8754;
        if (this.Field8740.Method365()) {
            Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketConfirmTeleport(this.Field8754 - 1));
        }
        Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketConfirmTeleport(this.Field8754));
        this.Field8757.put(this.Field8754, new Class1621((Object)new Vec3d(vec3d.x, vec3d.y, vec3d.z), (Object)System.currentTimeMillis()));
        if (this.Field8740.Method365()) {
            Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketConfirmTeleport(this.Field8754 + 1));
        }
    }
    
    private Vec3d Method1076(final double n, final double n2, final double n3) {
        switch (Class60.Field8197[((Class81)this.Field8727.Method341()).ordinal()]) {
            case 1: {
                return new Vec3d(Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + n, this.Field8739.Method365() ? ((double)(this.Field8738.Method365() ? 255 : 256)) : (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble((long)2120336853 ^ 0x407A40007E61C5D5L)), Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + n3);
            }
            case 2: {
                return new Vec3d(this.Field8739.Method365() ? (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + this.Method1078()) : this.Method1078(), this.Field8738.Method365() ? Math.max(Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Double.longBitsToDouble(4611686018427387904L)) : Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, this.Field8739.Method365() ? (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + this.Method1078()) : this.Method1078());
            }
            case 3: {
                return new Vec3d(Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + (this.Field8738.Method365() ? n : this.Method1080()), Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + this.Method1079(), Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + (this.Field8738.Method365() ? n3 : this.Method1080()));
            }
            case 4: {
                if (this.Field8739.Method365()) {
                    final double n4 = n2 * Double.longBitsToDouble(4647679631074263040L);
                    return new Vec3d(Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + n, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + ((n4 > ((Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.dimension == -1) ? 127 : 255)) ? (-n4) : ((n4 < 1.0) ? (-n4) : n4)), Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + n3);
                }
                return new Vec3d(Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + ((n == 0.0) ? (Class170.Field8752.nextBoolean() ? -10 : 10) : (n * Double.longBitsToDouble((long)808847241 ^ 0x4043000030360789L))), Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + n2, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + ((n3 == 0.0) ? (Class170.Field8752.nextBoolean() ? -10 : 10) : (n3 * Double.longBitsToDouble((long)452616187 ^ 0x404300001AFA5FFBL))));
            }
            case 5: {
                return new Vec3d(Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + this.Method1078(), Math.max(Double.longBitsToDouble((long)1857884487 ^ 0x3FF800006EBD1147L), Math.min(Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + n2, Double.longBitsToDouble((long)444761157 ^ 0x406FB0001A828445L))), Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + this.Method1078());
            }
            default: {
                return new Vec3d(Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + n, this.Field8739.Method365() ? ((double)(this.Field8738.Method365() ? 1 : 0)) : (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - Double.longBitsToDouble(4653595003631697920L)), Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + n3);
            }
        }
    }
    
    private double[] Method1077(final double[] array) {
        final double n = Math.max(array[0], array[1]) / Class170.Field8753;
        return new double[] { array[0] / n, array[1] / n };
    }
    
    private double Method1078() {
        final int n = Class170.Field8752.nextInt(this.Field8739.Method365() ? 80 : ((this.Field8727.Method341() == Class81.Field8275) ? ((Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % 2 == 0) ? 480 : 100) : 29000000)) + (this.Field8739.Method365() ? 5 : 500);
        return Class170.Field8752.nextBoolean() ? n : ((double)(-n));
    }
    
    private double Method1079() {
        final int n = 70 + Class170.Field8752.nextInt(this.Field8728.Method335());
        return Class170.Field8752.nextBoolean() ? n : ((double)(-n));
    }
    
    private double Method1080() {
        final int nextInt = Class170.Field8752.nextInt(this.Field8729.Method335());
        return Class170.Field8752.nextBoolean() ? nextInt : ((double)(-nextInt));
    }
    
    private boolean Method1081() {
        final double n = this.Field8749.Method365() ? Double.longBitsToDouble((long)1483434472 ^ 0xBFB00000586B69E8L) : 0.0;
        return !Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getCollisionBoxes((Entity)Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityBoundingBox().expand(n, n, n)).isEmpty() || !Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getCollisionBoxes((Entity)Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityBoundingBox().offset(0.0, Double.longBitsToDouble(4611686018427387904L), 0.0).contract(0.0, Double.longBitsToDouble(4611640982431114199L), 0.0)).isEmpty();
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method1082(final PlayerSPPushOutOfBlocksEvent playerSPPushOutOfBlocksEvent) {
        playerSPPushOutOfBlocksEvent.setCanceled(true);
    }
    
    private static double[] Method1083(final double n) {
        float n2 = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward;
        float moveStrafe = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe;
        float n3 = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.prevRotationYaw + (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw - Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.prevRotationYaw) * Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderPartialTicks();
        if (n2 != 0.0f) {
            if (moveStrafe > 0.0f) {
                n3 += ((n2 > 0.0f) ? -45 : 45);
            }
            else if (moveStrafe < 0.0f) {
                n3 += ((n2 > 0.0f) ? 45 : -45);
            }
            moveStrafe = 0.0f;
            if (n2 > 0.0f) {
                n2 = 1.0f;
            }
            else if (n2 < 0.0f) {
                n2 = Float.intBitsToFloat(-1082130432);
            }
        }
        final double sin = Math.sin(Math.toRadians(n3 + Float.intBitsToFloat(1119092736)));
        final double cos = Math.cos(Math.toRadians(n3 + Float.intBitsToFloat(1119092736)));
        return new double[] { n2 * n * cos + moveStrafe * n * sin, n2 * n * sin - moveStrafe * n * cos };
    }
    
    private void Method1084(final Class805 class805) {
        if (class805.Method982() instanceof CPacketPlayer && !(class805.Method982() instanceof CPacketPlayer$Position)) {
            class805.Method158();
        }
        if (class805.Method982() instanceof CPacketPlayer) {
            final CPacketPlayer cPacketPlayer = (CPacketPlayer)class805.Method982();
            if (this.Field8756.contains(cPacketPlayer)) {
                this.Field8756.remove(cPacketPlayer);
                return;
            }
            class805.Method158();
        }
    }
    
    private void Method1085(final Class1334 class1334) {
        if (this.Field8726.Method341() != Class1356.Field14180 && this.Field8754 <= 0) {
            return;
        }
        if (this.Field8726.Method341() != Class1356.Field14179) {
            class1334.Field14103 = this.Field8766;
            class1334.Field14104 = this.Field8767;
            class1334.Field14105 = this.Field8768;
        }
        if ((this.Field8731.Method341() != Class1237.Field13608 && this.Field8731.Method341() == Class1237.Field13609) || this.Method1081()) {
            Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = true;
        }
    }
    
    private void Method1086(final Class544 class544) {
        if (!(class544.Method982() instanceof SPacketPlayerPosLook)) {
            return;
        }
        if (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen instanceof GuiDownloadTerrain) {
            this.Field8754 = 0;
            return;
        }
        final SPacketPlayerPosLook sPacketPlayerPosLook = (SPacketPlayerPosLook)class544.Method982();
        if (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isEntityAlive()) {
            if (this.Field8754 <= 0) {
                this.Field8754 = sPacketPlayerPosLook.getTeleportId();
            }
            else if (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.isBlockLoaded(new BlockPos(Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ), false)) {
                if (this.Field8726.Method341() != Class1356.Field14180) {
                    if (this.Field8726.Method341() == Class1356.Field14182) {
                        this.Field8757.remove(sPacketPlayerPosLook.getTeleportId());
                        class544.Method158();
                        if (this.Field8726.Method341() == Class1356.Field14179) {
                            Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(sPacketPlayerPosLook.getX(), sPacketPlayerPosLook.getY(), sPacketPlayerPosLook.getZ());
                        }
                        return;
                    }
                    if (this.Field8757.containsKey(sPacketPlayerPosLook.getTeleportId())) {
                        final Class1621 class545 = this.Field8757.get(sPacketPlayerPosLook.getTeleportId());
                        if (((Vec3d)class545.Method6307()).x == sPacketPlayerPosLook.getX() && ((Vec3d)class545.Method6307()).y == sPacketPlayerPosLook.getY() && ((Vec3d)class545.Method6307()).z == sPacketPlayerPosLook.getZ()) {
                            this.Field8757.remove(sPacketPlayerPosLook.getTeleportId());
                            class544.Method158();
                            if (this.Field8726.Method341() == Class1356.Field14179) {
                                Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(sPacketPlayerPosLook.getX(), sPacketPlayerPosLook.getY(), sPacketPlayerPosLook.getZ());
                            }
                            return;
                        }
                    }
                }
            }
        }
        sPacketPlayerPosLook.yaw = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
        sPacketPlayerPosLook.pitch = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch;
        sPacketPlayerPosLook.getFlags().remove(SPacketPlayerPosLook$EnumFlags.X_ROT);
        sPacketPlayerPosLook.getFlags().remove(SPacketPlayerPosLook$EnumFlags.Y_ROT);
        this.Field8754 = sPacketPlayerPosLook.getTeleportId();
    }
    
    private void Method1087(final Class2036 class2036) {
        if (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        if (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % this.Field8747.Method335() == 0) {
            this.Method20();
        }
        this.Method43("[" + ((Class1356)this.Field8726.Method341()).name() + "]");
        Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setVelocity(0.0, 0.0, 0.0);
        if (this.Field8754 <= 0 && this.Field8726.Method341() != Class1356.Field14180) {
            this.Field8755 = new CPacketPlayer$Position(this.Method1078(), 1.0, this.Method1078(), Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround);
            this.Field8756.add(this.Field8755);
            Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)this.Field8755);
            return;
        }
        final boolean method1081 = this.Method1081();
        this.Field8766 = 0.0;
        this.Field8767 = 0.0;
        this.Field8768 = 0.0;
        if (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isKeyDown() && (this.Field8760 < 1 || (this.Field8733.Method365() && method1081))) {
            if (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % ((this.Field8726.Method341() == Class1356.Field14180 || this.Field8726.Method341() == Class1356.Field14179 || this.Field8730.Method341() == Class386.Field9617) ? 10 : 20) == 0) {
                this.Field8767 = ((this.Field8737.Method341() != Class717.Field11066) ? Double.longBitsToDouble((long)2069253171 ^ 0xBFA0624DA9A7E5CFL) : Double.longBitsToDouble(4589095962696497496L));
            }
            else {
                this.Field8767 = Double.longBitsToDouble((long)11854331 ^ 0x3FAFBE76C800D8A3L);
            }
            this.Field8758 = 0;
            this.Field8759 = 5;
        }
        else if (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindSneak.isKeyDown() && (this.Field8760 < 1 || (this.Field8733.Method365() && method1081))) {
            this.Field8767 = Double.longBitsToDouble((long)495308835 ^ 0xBFAFBE76D531E97BL);
            this.Field8758 = 0;
            this.Field8759 = 5;
        }
        double[] array = Method1083(((method1081 && this.Field8731.Method341() == Class1237.Field13610) ? (this.Field8734.Method365() ? (this.Field8733.Method365() ? Double.longBitsToDouble((long)1535336834 ^ 0x3FA7CED94D044A80L) : Double.longBitsToDouble(4589095962696497496L)) : Double.longBitsToDouble((long)1128947882 ^ 0x3F9FBE768BFE59F2L)) : Double.longBitsToDouble((long)623299412 ^ 0x3FD0A3D72F1BBBF0L)) * this.Field8735.Method367());
        if ((this.Field8733.Method365() && method1081) || !Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindSneak.isKeyDown() || !Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isKeyDown()) {
            if (Class1744.Method6651((EntityLivingBase)Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) && (array[0] != 0.0 || array[1] != 0.0) && (this.Field8759 < 1 || (this.Field8733.Method365() && method1081))) {
                if (this.Field8742.Method365() && this.Field8765 == this.Field8744.Method335()) {
                    array = this.Method1077(array);
                }
                this.Field8766 = array[0];
                this.Field8768 = array[1];
                this.Field8760 = 5;
            }
            if (this.Field8737.Method341() != Class717.Field11066 && (this.Field8730.Method341() == Class386.Field9616 || this.Field8762 != 0)) {
                if (this.Field8758 < ((this.Field8727.Method341() == Class81.Field8274 && !this.Field8739.Method365()) ? 1 : 3)) {
                    ++this.Field8758;
                }
                else {
                    this.Field8758 = 0;
                    if (this.Field8737.Method341() != Class717.Field11068 || !method1081) {
                        this.Field8767 = ((this.Field8737.Method341() == Class717.Field11069) ? Double.longBitsToDouble(-4632943008668576645L) : Double.longBitsToDouble((long)1510263009 ^ 0xBFA47AE11DAADC9AL));
                    }
                }
            }
        }
        if (method1081 && ((this.Field8731.Method341() == Class1237.Field13610 && Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveForward != 0.0) || (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveStrafing != 0.0 && this.Field8767 != 0.0))) {
            this.Field8767 /= Double.longBitsToDouble((long)1568440689 ^ 0x400400005D7C8171L);
        }
        if (this.Field8730.Method341() != Class386.Field9616) {
            if (this.Field8762 == 0) {
                this.Field8766 = 0.0;
                this.Field8767 = 0.0;
                this.Field8768 = 0.0;
            }
            else if (this.Field8762 == 2 && this.Field8745.Method365()) {
                if (this.Field8764) {
                    this.Field8766 = 0.0;
                    this.Field8767 = 0.0;
                    this.Field8768 = 0.0;
                }
                this.Field8764 = !this.Field8764;
            }
        }
        else if (this.Field8745.Method365() && this.Field8763 == this.Field8746.Method335()) {
            this.Field8766 = 0.0;
            this.Field8767 = 0.0;
            this.Field8768 = 0.0;
        }
        if (this.Field8742.Method365() && this.Field8743.Method365() && this.Field8765 == this.Field8744.Method335()) {
            array = this.Method1077(array);
            this.Field8766 = array[0];
            this.Field8768 = array[1];
        }
        switch (Class60.Field8198[((Class1356)this.Field8726.Method341()).ordinal()]) {
            case 1: {
                this.Method1070(this.Field8766, this.Field8767, this.Field8768, true);
                Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setVelocity(this.Field8766, this.Field8767, this.Field8768);
                this.Method1072(this.Field8766, this.Field8767, this.Field8768, true);
                break;
            }
            case 2: {
                this.Method1070(this.Field8766, this.Field8767, this.Field8768, true);
                this.Method1072(this.Field8766, this.Field8767, this.Field8768, true);
                break;
            }
            case 3: {
                this.Method1070(this.Field8766, this.Field8767, this.Field8768, false);
                Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setVelocity(this.Field8766, this.Field8767, this.Field8768);
                this.Method1072(this.Field8766, this.Field8767, this.Field8768, false);
                break;
            }
            case 4:
            case 5: {
                float n = this.Field8736.Method368();
                if (Keyboard.isKeyDown(this.Field8750.Method337()) && this.Field8770.Method2797(3500L)) {
                    this.Field8770.Method2801();
                    n = this.Field8751.Method368();
                }
                int n2 = (int)Math.floor(n);
                ++this.Field8769;
                if (this.Field8769 > (int)(Double.longBitsToDouble((long)187905868 ^ 0x403400000B33374CL) / ((n - (double)n2) * Double.longBitsToDouble((long)1713091845 ^ 0x40340000661BB505L)))) {
                    ++n2;
                    this.Field8769 = 0;
                }
                for (int i = 1; i <= n2; ++i) {
                    this.Method1070(this.Field8766 * i, this.Field8767 * i, this.Field8768 * i, true);
                    Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setVelocity(this.Field8766 * i, this.Field8767 * i, this.Field8768 * i);
                    this.Method1072(this.Field8766 * i, this.Field8767 * i, this.Field8768 * i, true);
                }
                this.Field8766 = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX;
                this.Field8767 = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY;
                this.Field8768 = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ;
                break;
            }
        }
        --this.Field8759;
        --this.Field8760;
        if (this.Field8742.Method365() && this.Field8743.Method365() && this.Field8765 == this.Field8744.Method335()) {
            this.Field8766 = array[0];
            this.Field8768 = array[1];
        }
        if (this.Field8741.Method365() && (this.Field8730.Method341() == Class386.Field9616 || this.Field8762 > 1)) {
            Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, false));
        }
        ++this.Field8762;
        ++this.Field8763;
        if (!this.Field8742.Method365()) {
            this.Field8765 = 0;
        }
        else {
            ++this.Field8765;
        }
        if (this.Field8762 > ((this.Field8730.Method341() == Class386.Field9617) ? (this.Field8761 ? 1 : 2) : 3)) {
            this.Field8762 = 0;
            this.Field8761 = !this.Field8761;
        }
        if (this.Field8763 > this.Field8746.Method335()) {
            this.Field8763 = 0;
        }
    }
    
    private void Method1088(final Integer n, final Class1621 class1621) {
        if (System.currentTimeMillis() - (long)class1621.Method6308() > TimeUnit.SECONDS.toMillis(30L)) {
            this.Field8757.remove(n);
        }
    }
    
    private Boolean Method1089() {
        return this.Field8726.Method341() == Class1356.Field14181;
    }
    
    private Boolean Method1090() {
        return this.Field8726.Method341() == Class1356.Field14181;
    }
    
    private Boolean Method1091() {
        return this.Field8726.Method341() == Class1356.Field14181 || this.Field8726.Method341() == Class1356.Field14182;
    }
    
    static {
        Field8752 = new Random();
        Field8753 = Double.longBitsToDouble(4603804719079489533L);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xB38 ^ 0x20));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
