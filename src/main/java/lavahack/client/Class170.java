//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiDownloadTerrain
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketConfirmTeleport
 *  net.minecraft.network.play.client.CPacketPlayer
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.network.play.server.SPacketPlayerPosLook
 *  net.minecraft.network.play.server.SPacketPlayerPosLook$EnumFlags
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.client.event.PlayerSPPushOutOfBlocksEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.input.Keyboard
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lavahack.client.Class1237;
import lavahack.client.Class1303;
import lavahack.client.Class1334;
import lavahack.client.Class1356;
import lavahack.client.Class1393;
import lavahack.client.Class1621;
import lavahack.client.Class1744;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class1829;
import lavahack.client.Class2036;
import lavahack.client.Class386;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class544;
import lavahack.client.Class60;
import lavahack.client.Class618;
import lavahack.client.Class717;
import lavahack.client.Class805;
import lavahack.client.Class81;
import lavahack.client.Class873;
import lavahack.client.Class97;
import net.minecraft.client.gui.GuiDownloadTerrain;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketConfirmTeleport;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.PlayerSPPushOutOfBlocksEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Keyboard;

public class Class170
extends Class42 {
    @Class873
    public static Class170 Field8725;
    private final Class1303 Field8726 = new Class1303("Type", (Class42)this, Class1356.Field14178).Method5303();
    private final Class1303 Field8727 = new Class1303("Mode", (Class42)this, Class81.Field8270).Method5303();
    private final Class44 Field8728 = this.Method23(new Class44("JitterBoundsVertical", (Class42)this, Double.longBitsToDouble(4626885667169763328L), 0.0, Double.longBitsToDouble(0x4049000000000000L), true).Method314(this.Field8727.Method341() == Class81.Field8272));
    private final Class44 Field8729 = this.Method23(new Class44("JitterBoundsHorizontal", (Class42)this, Double.longBitsToDouble(0x4024000000000000L), 0.0, Double.longBitsToDouble((long)608360434 ^ 0x404900002442D7F2L), true).Method314(this.Field8727.Method341() == Class81.Field8272));
    private final Class1303 Field8730 = new Class1303("Limit", (Class42)this, Class386.Field9616).Method5303();
    private final Class1303 Field8731 = new Class1303("Phase", (Class42)this, Class1237.Field13608).Method5303();
    private final Class1303 Field8732 = new Class1303("Logic", (Class42)this, Class1829.Field16446).Method5303();
    private final Class44 Field8733 = this.Method23(new Class44("MultiAxis", (Class42)this, false));
    private final Class44 Field8734 = this.Method23(new Class44("NoPhaseSlow", (Class42)this, false));
    private final Class44 Field8735 = this.Method23(new Class44("Speed", (Class42)this, 1.0, 1.0, Double.longBitsToDouble(0x4024000000000000L), false));
    public final Class44 Field8736 = this.Method23(new Class44("Factor", (Class42)this, 1.0, 1.0, Double.longBitsToDouble(0x4024000000000000L), false).Method313(this::Method1091));
    private final Class1303 Field8737 = new Class1303("AntiKick", (Class42)this, Class717.Field11067).Method5303();
    private final Class44 Field8738 = this.Method23(new Class44("Strict", (Class42)this, false));
    private final Class44 Field8739 = this.Method23(new Class44("Bounds", (Class42)this, true));
    private final Class44 Field8740 = this.Method23(new Class44("Confirm", (Class42)this, false));
    private final Class44 Field8741 = this.Method23(new Class44("Constrict", (Class42)this, false));
    private final Class44 Field8742 = this.Method23(new Class44("Conceal", (Class42)this, false));
    private final Class44 Field8743 = this.Method23(new Class44("ForConceal", (Class42)this, false).Method313(this.Field8742::Method365));
    private final Class44 Field8744 = this.Method23(new Class44("ConcealTicks", (Class42)this, Double.longBitsToDouble((long)780659828 ^ 0x402400002E87EC74L), 1.0, Double.longBitsToDouble(0x404E000000000000L), true).Method313(this.Field8742::Method365));
    private final Class44 Field8745 = this.Method23(new Class44("Jitter", (Class42)this, false));
    private final Class44 Field8746 = this.Method23(new Class44("JitterTicks", (Class42)this, Double.longBitsToDouble(4619567317775286272L), Double.longBitsToDouble(0x4000000000000000L), Double.longBitsToDouble(4624633867356078080L), true).Method313(this.Field8745::Method365));
    private final Class44 Field8747 = this.Method23(new Class44("ClearTicks", (Class42)this, Double.longBitsToDouble((long)1064545555 ^ 0x403400003F73AD13L), Double.longBitsToDouble(0x4000000000000000L), Double.longBitsToDouble(0x4049000000000000L), true));
    private final Class44 Field8748 = this.Method23(new Class44("TimerSpeed", (Class42)this, 1.0, 1.0, Double.longBitsToDouble(0x3FF6666666666666L), false));
    private final Class44 Field8749 = this.Method23(new Class44("ShrinkBoundingBox", (Class42)this, false));
    private final Class44 Field8750 = this.Method23(new Class44("Facrotize", (Class42)this, 0).Method313(this::Method1090));
    private final Class44 Field8751 = this.Method23(new Class44("Distance", (Class42)this, Double.longBitsToDouble(0x4014000000000000L), 1.0, Double.longBitsToDouble((long)504282770 ^ 0x403400001E0EBE92L), false).Method313(this::Method1089));
    private static final Random Field8752;
    private static final double Field8753;
    private int Field8754;
    private CPacketPlayer.Position Field8755;
    private List Field8756 = new ArrayList();
    private Map Field8757 = new ConcurrentHashMap();
    private int Field8758;
    private int Field8759 = 0;
    private int Field8760 = 0;
    private boolean Field8761 = false;
    private int Field8762 = 0;
    private int Field8763 = 0;
    private boolean Field8764 = false;
    private int Field8765 = 0;
    private double Field8766 = 0.0;
    private double Field8767 = 0.0;
    private double Field8768 = 0.0;
    private int Field8769 = 0;
    private final Class650 Field8770 = new Class650();
    @Class1801
    private final Class618 Field8771 = new Class618(this::Method1087, new Predicate[0]);
    @Class1801
    private final Class618 Field8772 = new Class618(this::Method1086, new Predicate[0]);
    @Class1801
    private final Class618 Field8773 = new Class618(this::Method1085, new Predicate[0]);
    @Class1801
    private final Class618 Field8774 = new Class618(this::Method1084, new Predicate[0]);
    private String Field8775 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class170() {
        super("PacketFly", Class97.Field8344, true);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        if (vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.isSingleplayer()) {
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
        this.Field8755 = new CPacketPlayer.Position(this.Method1078(), 1.0, this.Method1078(), Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround);
        this.Field8756.add(this.Field8755);
        Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)this.Field8755);
        Class1796.Field16242.Method705(this);
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
        Class1796.Field16242.Method710(this);
    }

    @Override
    public void Method45() {
        if (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = Float.intBitsToFloat(1112014848) / this.Field8748.Method368();
            return;
        }
        this.Method22();
    }

    private void Method20() {
        this.Field8757.forEach(this::Method1088);
    }

    private void Method1070(double d, double d2, double d3, boolean bl) {
    }

    private List Method1071(Vec3d vec3d) {
        return Stream.of(new BlockPos(vec3d.x + Double.longBitsToDouble((long)519187233 ^ 0x3FD333332DC11812L), vec3d.y, vec3d.z + Double.longBitsToDouble(0x3FD3333333333333L)), new BlockPos(vec3d.x + Double.longBitsToDouble((long)1946323994 ^ 0x3FD333334731BF29L), vec3d.y, vec3d.z - Double.longBitsToDouble((long)1311870771 ^ 0x3FD333337D02BC00L)), new BlockPos(vec3d.x - Double.longBitsToDouble(0x3FD3333333333333L), vec3d.y, vec3d.z + Double.longBitsToDouble((long)349901278 ^ 0x3FD3333327E822EDL)), new BlockPos(vec3d.x - Double.longBitsToDouble(0x3FD3333333333333L), vec3d.y, vec3d.z - Double.longBitsToDouble(0x3FD3333333333333L))).distinct().collect(Collectors.toList());
    }

    private void Method1072(double d, double d2, double d3, boolean bl) {
        boolean bl2;
        Vec3d vec3d = new Vec3d(Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + d, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + d2, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + d3);
        Vec3d vec3d2 = this.Method1076(d, d2, d3);
        boolean bl3 = bl2 = this.Field8730.Method341() != Class386.Field9616 && this.Field8762 == 0;
        if (this.Field8732.Method341() == Class1829.Field16446) {
            this.Method1073(vec3d);
            this.Method1074(vec3d2);
            if (!bl) return;
            this.Method1075(vec3d);
            return;
        }
        this.Method1074(vec3d2);
        this.Method1073(vec3d);
        if (!bl) return;
        this.Method1075(vec3d);
    }

    private void Method1073(Vec3d vec3d) {
        CPacketPlayer.Position position = new CPacketPlayer.Position(vec3d.x, vec3d.y, vec3d.z, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround);
        this.Field8756.add(position);
        Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)position);
    }

    private void Method1074(Vec3d vec3d) {
        CPacketPlayer.Position position = new CPacketPlayer.Position(vec3d.x, vec3d.y, vec3d.z, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround);
        this.Field8756.add(position);
        Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)position);
    }

    private void Method1075(Vec3d vec3d) {
        ++this.Field8754;
        if (this.Field8740.Method365()) {
            Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketConfirmTeleport(this.Field8754 - 1));
        }
        Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketConfirmTeleport(this.Field8754));
        this.Field8757.put(this.Field8754, new Class1621(new Vec3d(vec3d.x, vec3d.y, vec3d.z), System.currentTimeMillis()));
        if (!this.Field8740.Method365()) return;
        Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketConfirmTeleport(this.Field8754 + 1));
    }

    private Vec3d Method1076(double d, double d2, double d3) {
        double d4;
        switch (Class60.Field8197[((Class81)this.Field8727.Method341()).ordinal()]) {
            case 1: {
                double d5;
                double d6 = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + d;
                if (!this.Field8739.Method365()) {
                    d5 = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble((long)2120336853 ^ 0x407A40007E61C5D5L);
                    return new Vec3d(d6, d5, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + d3);
                }
                d5 = this.Field8738.Method365() ? 255 : 256;
                return new Vec3d(d6, d5, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + d3);
            }
            case 2: {
                double d7;
                double d8 = this.Field8739.Method365() ? Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + this.Method1078() : this.Method1078();
                double d9 = this.Field8738.Method365() ? Math.max(Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Double.longBitsToDouble(0x4000000000000000L)) : Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
                if (this.Field8739.Method365()) {
                    d7 = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + this.Method1078();
                    return new Vec3d(d8, d9, d7);
                }
                d7 = this.Method1078();
                return new Vec3d(d8, d9, d7);
            }
            case 3: {
                double d10;
                double d11 = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + (this.Field8738.Method365() ? d : this.Method1080());
                double d12 = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + this.Method1079();
                double d13 = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ;
                if (this.Field8738.Method365()) {
                    d10 = d3;
                    return new Vec3d(d11, d12, d13 + d10);
                }
                d10 = this.Method1080();
                return new Vec3d(d11, d12, d13 + d10);
            }
            case 4: {
                double d14;
                if (this.Field8739.Method365()) {
                    double d15;
                    double d16 = d2 * Double.longBitsToDouble(4647679631074263040L);
                    double d17 = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + d;
                    double d18 = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
                    int n = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.dimension == -1 ? 127 : 255;
                    if (d16 > (double)n) {
                        d15 = -d16;
                        return new Vec3d(d17, d18 + d15, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + d3);
                    }
                    if (d16 < 1.0) {
                        d15 = -d16;
                        return new Vec3d(d17, d18 + d15, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + d3);
                    }
                    d15 = d16;
                    return new Vec3d(d17, d18 + d15, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + d3);
                }
                double d19 = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + (d == 0.0 ? (double)(Field8752.nextBoolean() ? -10 : 10) : d * Double.longBitsToDouble((long)808847241 ^ 0x4043000030360789L));
                double d20 = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + d2;
                double d21 = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
                if (d3 != 0.0) {
                    d14 = d3 * Double.longBitsToDouble((long)452616187 ^ 0x404300001AFA5FFBL);
                    return new Vec3d(d19, d20, d21 + d14);
                }
                d14 = Field8752.nextBoolean() ? -10 : 10;
                return new Vec3d(d19, d20, d21 + d14);
            }
            case 5: {
                return new Vec3d(Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + this.Method1078(), Math.max(Double.longBitsToDouble((long)1857884487 ^ 0x3FF800006EBD1147L), Math.min(Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + d2, Double.longBitsToDouble((long)444761157 ^ 0x406FB0001A828445L))), Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + this.Method1078());
            }
        }
        double d22 = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + d;
        if (!this.Field8739.Method365()) {
            d4 = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - Double.longBitsToDouble(4653595003631697920L);
            return new Vec3d(d22, d4, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + d3);
        }
        d4 = this.Field8738.Method365() ? 1 : 0;
        return new Vec3d(d22, d4, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + d3);
    }

    private double[] Method1077(double[] dArray) {
        double d = Math.max(dArray[0], dArray[1]) / Field8753;
        return new double[]{dArray[0] / d, dArray[1] / d};
    }

    private double Method1078() {
        double d;
        int n = Field8752.nextInt(this.Field8739.Method365() ? 80 : (this.Field8727.Method341() == Class81.Field8275 ? (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % 2 == 0 ? 480 : 100) : 29000000)) + (this.Field8739.Method365() ? 5 : 500);
        if (Field8752.nextBoolean()) {
            d = n;
            return d;
        }
        d = -n;
        return d;
    }

    private double Method1079() {
        double d;
        int n = 70 + Field8752.nextInt(this.Field8728.Method335());
        if (Field8752.nextBoolean()) {
            d = n;
            return d;
        }
        d = -n;
        return d;
    }

    private double Method1080() {
        double d;
        int n = Field8752.nextInt(this.Field8729.Method335());
        if (Field8752.nextBoolean()) {
            d = n;
            return d;
        }
        d = -n;
        return d;
    }

    private boolean Method1081() {
        double d;
        double d2 = d = this.Field8749.Method365() ? Double.longBitsToDouble((long)1483434472 ^ 0xBFB00000586B69E8L) : 0.0;
        if (!Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getCollisionBoxes((Entity)Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityBoundingBox().expand(d, d, d)).isEmpty()) {
            return true;
        }
        if (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getCollisionBoxes((Entity)Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityBoundingBox().offset(0.0, Double.longBitsToDouble(0x4000000000000000L), 0.0).contract(0.0, Double.longBitsToDouble(4611640982431114199L), 0.0)).isEmpty()) return false;
        return true;
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method1082(PlayerSPPushOutOfBlocksEvent playerSPPushOutOfBlocksEvent) {
        playerSPPushOutOfBlocksEvent.setCanceled(true);
    }

    private static double[] Method1083(double d) {
        float f = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward;
        float f2 = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe;
        float f3 = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.prevRotationYaw + (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw - Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.prevRotationYaw) * vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderPartialTicks();
        if (f != 0.0f) {
            if (f2 > 0.0f) {
                f3 += (float)(f > 0.0f ? -45 : 45);
            } else if (f2 < 0.0f) {
                f3 += (float)(f > 0.0f ? 45 : -45);
            }
            f2 = 0.0f;
            if (f > 0.0f) {
                f = 1.0f;
            } else if (f < 0.0f) {
                f = Float.intBitsToFloat(-1082130432);
            }
        }
        double d2 = Math.sin(Math.toRadians(f3 + Float.intBitsToFloat(1119092736)));
        double d3 = Math.cos(Math.toRadians(f3 + Float.intBitsToFloat(1119092736)));
        double d4 = (double)f * d * d3 + (double)f2 * d * d2;
        double d5 = (double)f * d * d2 - (double)f2 * d * d3;
        return new double[]{d4, d5};
    }

    private void Method1084(Class805 class805) {
        if (class805.Method982() instanceof CPacketPlayer && !(class805.Method982() instanceof CPacketPlayer.Position)) {
            class805.Method158();
        }
        if (!(class805.Method982() instanceof CPacketPlayer)) return;
        CPacketPlayer cPacketPlayer = (CPacketPlayer)class805.Method982();
        if (this.Field8756.contains(cPacketPlayer)) {
            this.Field8756.remove(cPacketPlayer);
            return;
        }
        class805.Method158();
    }

    private void Method1085(Class1334 class1334) {
        if (this.Field8726.Method341() != Class1356.Field14180 && this.Field8754 <= 0) {
            return;
        }
        if (this.Field8726.Method341() != Class1356.Field14179) {
            class1334.Field14103 = this.Field8766;
            class1334.Field14104 = this.Field8767;
            class1334.Field14105 = this.Field8768;
        }
        if (this.Field8731.Method341() == Class1237.Field13608 || this.Field8731.Method341() != Class1237.Field13609) {
            if (!this.Method1081()) return;
        }
        Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = true;
    }

    private void Method1086(Class544 class544) {
        if (!(class544.Method982() instanceof SPacketPlayerPosLook)) {
            return;
        }
        if (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen instanceof GuiDownloadTerrain) {
            this.Field8754 = 0;
            return;
        }
        SPacketPlayerPosLook sPacketPlayerPosLook = (SPacketPlayerPosLook)class544.Method982();
        if (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isEntityAlive()) {
            if (this.Field8754 <= 0) {
                this.Field8754 = sPacketPlayerPosLook.getTeleportId();
            } else if (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.isBlockLoaded(new BlockPos(Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ), false) && this.Field8726.Method341() != Class1356.Field14180) {
                if (this.Field8726.Method341() == Class1356.Field14182) {
                    this.Field8757.remove(sPacketPlayerPosLook.getTeleportId());
                    class544.Method158();
                    if (this.Field8726.Method341() != Class1356.Field14179) return;
                    Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(sPacketPlayerPosLook.getX(), sPacketPlayerPosLook.getY(), sPacketPlayerPosLook.getZ());
                    return;
                }
                if (this.Field8757.containsKey(sPacketPlayerPosLook.getTeleportId())) {
                    Class1621 class1621 = (Class1621)this.Field8757.get(sPacketPlayerPosLook.getTeleportId());
                    if (((Vec3d)class1621.Method6307()).x == sPacketPlayerPosLook.getX() && ((Vec3d)class1621.Method6307()).y == sPacketPlayerPosLook.getY() && ((Vec3d)class1621.Method6307()).z == sPacketPlayerPosLook.getZ()) {
                        this.Field8757.remove(sPacketPlayerPosLook.getTeleportId());
                        class544.Method158();
                        if (this.Field8726.Method341() != Class1356.Field14179) return;
                        Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(sPacketPlayerPosLook.getX(), sPacketPlayerPosLook.getY(), sPacketPlayerPosLook.getZ());
                        return;
                    }
                }
            }
        }
        sPacketPlayerPosLook.yaw = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
        sPacketPlayerPosLook.pitch = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch;
        sPacketPlayerPosLook.getFlags().remove(SPacketPlayerPosLook.EnumFlags.X_ROT);
        sPacketPlayerPosLook.getFlags().remove(SPacketPlayerPosLook.EnumFlags.Y_ROT);
        this.Field8754 = sPacketPlayerPosLook.getTeleportId();
    }

    private void Method1087(Class2036 class2036) {
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
            this.Field8755 = new CPacketPlayer.Position(this.Method1078(), 1.0, this.Method1078(), Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround);
            this.Field8756.add(this.Field8755);
            Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)this.Field8755);
            return;
        }
        boolean bl = this.Method1081();
        this.Field8766 = 0.0;
        this.Field8767 = 0.0;
        this.Field8768 = 0.0;
        if (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isKeyDown() && (this.Field8760 < 1 || this.Field8733.Method365() && bl)) {
            this.Field8767 = Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % (this.Field8726.Method341() == Class1356.Field14180 || this.Field8726.Method341() == Class1356.Field14179 || this.Field8730.Method341() == Class386.Field9617 ? 10 : 20) == 0 ? (this.Field8737.Method341() != Class717.Field11066 ? Double.longBitsToDouble((long)2069253171 ^ 0xBFA0624DA9A7E5CFL) : Double.longBitsToDouble(4589095962696497496L)) : Double.longBitsToDouble((long)11854331 ^ 0x3FAFBE76C800D8A3L);
            this.Field8758 = 0;
            this.Field8759 = 5;
        } else if (Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindSneak.isKeyDown() && (this.Field8760 < 1 || this.Field8733.Method365() && bl)) {
            this.Field8767 = Double.longBitsToDouble((long)495308835 ^ 0xBFAFBE76D531E97BL);
            this.Field8758 = 0;
            this.Field8759 = 5;
        }
        boolean bl2 = false;
        double[] dArray = Class170.Method1083((bl && this.Field8731.Method341() == Class1237.Field13610 ? (this.Field8734.Method365() ? (this.Field8733.Method365() ? Double.longBitsToDouble((long)1535336834 ^ 0x3FA7CED94D044A80L) : Double.longBitsToDouble(4589095962696497496L)) : Double.longBitsToDouble((long)1128947882 ^ 0x3F9FBE768BFE59F2L)) : Double.longBitsToDouble((long)623299412 ^ 0x3FD0A3D72F1BBBF0L)) * this.Field8735.Method367());
        if (this.Field8733.Method365() && bl || !Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindSneak.isKeyDown() || !Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isKeyDown()) {
            if (Class1744.Method6651((EntityLivingBase)Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) && (dArray[0] != 0.0 || dArray[1] != 0.0) && (this.Field8759 < 1 || this.Field8733.Method365() && bl)) {
                if (this.Field8742.Method365() && this.Field8765 == this.Field8744.Method335()) {
                    dArray = this.Method1077(dArray);
                    bl2 = true;
                }
                this.Field8766 = dArray[0];
                this.Field8768 = dArray[1];
                this.Field8760 = 5;
            }
            if (this.Field8737.Method341() != Class717.Field11066 && (this.Field8730.Method341() == Class386.Field9616 || this.Field8762 != 0)) {
                if (this.Field8758 < (this.Field8727.Method341() == Class81.Field8274 && !this.Field8739.Method365() ? 1 : 3)) {
                    ++this.Field8758;
                } else {
                    this.Field8758 = 0;
                    if (this.Field8737.Method341() != Class717.Field11068 || !bl) {
                        double d = this.Field8767 = this.Field8737.Method341() == Class717.Field11069 ? Double.longBitsToDouble(-4632943008668576645L) : Double.longBitsToDouble((long)1510263009 ^ 0xBFA47AE11DAADC9AL);
                    }
                }
            }
        }
        if (bl && (this.Field8731.Method341() == Class1237.Field13610 && (double)Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveForward != 0.0 || (double)Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveStrafing != 0.0 && this.Field8767 != 0.0)) {
            this.Field8767 /= Double.longBitsToDouble((long)1568440689 ^ 0x400400005D7C8171L);
        }
        if (this.Field8730.Method341() != Class386.Field9616) {
            if (this.Field8762 == 0) {
                this.Field8766 = 0.0;
                this.Field8767 = 0.0;
                this.Field8768 = 0.0;
            } else if (this.Field8762 == 2 && this.Field8745.Method365()) {
                if (this.Field8764) {
                    this.Field8766 = 0.0;
                    this.Field8767 = 0.0;
                    this.Field8768 = 0.0;
                }
                this.Field8764 = !this.Field8764;
            }
        } else if (this.Field8745.Method365() && this.Field8763 == this.Field8746.Method335()) {
            this.Field8766 = 0.0;
            this.Field8767 = 0.0;
            this.Field8768 = 0.0;
        }
        if (this.Field8742.Method365() && this.Field8743.Method365() && this.Field8765 == this.Field8744.Method335()) {
            dArray = this.Method1077(dArray);
            this.Field8766 = dArray[0];
            this.Field8768 = dArray[1];
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
                float f = this.Field8736.Method368();
                if (Keyboard.isKeyDown((int)this.Field8750.Method337()) && this.Field8770.Method2797(3500L)) {
                    this.Field8770.Method2801();
                    f = this.Field8751.Method368();
                }
                int n = (int)Math.floor(f);
                ++this.Field8769;
                if (this.Field8769 > (int)(Double.longBitsToDouble((long)187905868 ^ 0x403400000B33374CL) / (((double)f - (double)n) * Double.longBitsToDouble((long)1713091845 ^ 0x40340000661BB505L)))) {
                    ++n;
                    this.Field8769 = 0;
                }
                for (int i = 1; i <= n; ++i) {
                    this.Method1070(this.Field8766 * (double)i, this.Field8767 * (double)i, this.Field8768 * (double)i, true);
                    Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setVelocity(this.Field8766 * (double)i, this.Field8767 * (double)i, this.Field8768 * (double)i);
                    this.Method1072(this.Field8766 * (double)i, this.Field8767 * (double)i, this.Field8768 * (double)i, true);
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
            this.Field8766 = dArray[0];
            this.Field8768 = dArray[1];
            bl2 = true;
        }
        if (this.Field8741.Method365() && (this.Field8730.Method341() == Class386.Field9616 || this.Field8762 > 1)) {
            Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, false));
        }
        ++this.Field8762;
        ++this.Field8763;
        this.Field8765 = !this.Field8742.Method365() ? 0 : ++this.Field8765;
        if (this.Field8762 > (this.Field8730.Method341() == Class386.Field9617 ? (this.Field8761 ? 1 : 2) : 3)) {
            this.Field8762 = 0;
            this.Field8761 = !this.Field8761;
        }
        if (this.Field8763 <= this.Field8746.Method335()) return;
        this.Field8763 = 0;
    }

    private void Method1088(Integer n, Class1621 class1621) {
        if (System.currentTimeMillis() - (Long)class1621.Method6308() <= TimeUnit.SECONDS.toMillis(30L)) return;
        this.Field8757.remove(n);
    }

    private Boolean Method1089() {
        boolean bl;
        if (this.Field8726.Method341() == Class1356.Field14181) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method1090() {
        boolean bl;
        if (this.Field8726.Method341() == Class1356.Field14181) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method1091() {
        boolean bl;
        if (this.Field8726.Method341() != Class1356.Field14181 && this.Field8726.Method341() != Class1356.Field14182) {
            bl = false;
            return bl;
        }
        bl = true;
        return bl;
    }

    static {
        Field8752 = new Random();
        Field8753 = Double.longBitsToDouble(4603804719079489533L);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 32;
            cArray2[n] = (char)(cArray[n] ^ (0xB38 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

