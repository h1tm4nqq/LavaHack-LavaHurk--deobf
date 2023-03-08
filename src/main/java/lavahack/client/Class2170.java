//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.vertex.*;
import net.minecraft.client.renderer.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.client.event.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import java.util.function.*;
import java.util.*;
import net.minecraft.init.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import com.kisman.cc.util.*;
import net.minecraft.entity.*;
import net.minecraft.network.play.server.*;

public class Class2170 extends Class42
{
    private final Class1303 Field17918;
    private final Class1303 Field17919;
    private final Class44 Field17920;
    private final Class44 Field17921;
    private final Class44 Field17922;
    private final Class44 Field17923;
    private final Class44 Field17924;
    private final Class44 Field17925;
    private final Class44 Field17926;
    private final Class44 Field17927;
    private final Class44 Field17928;
    private final Class44 Field17929;
    private final Class44 Field17930;
    private final Class44 Field17931;
    private int Field17932;
    private int Field17933;
    private AxisAlignedBB Field17934;
    private float Field17935;
    @Class1801
    private final Class618 Field17936;
    @Class1801
    private final Class618 Field17937;
    private String Field17938 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class2170() {
        super("HoleSnap", Class97.Field8340, true);
        this.Field17918 = new Class1303("Holes", (Class42)this, (Enum)Class557.Field10371).Method5303();
        this.Field17919 = new Class1303("HoleType", (Class42)this, (Enum)Class283.Field9224).Method5303();
        this.Field17920 = this.Method23(new Class44("HoleRange", this, Double.longBitsToDouble((long)717586480 ^ 0x401000002AC58030L), 1.0, Double.longBitsToDouble(4624633867356078080L), false));
        this.Field17921 = this.Method23(new Class44("HoleYRange", this, Double.longBitsToDouble((long)332335877 ^ 0x4010000013CF0B05L), 1.0, Double.longBitsToDouble((long)955124051 ^ 0x4020000038EE0953L), false));
        this.Field17922 = this.Method23(new Class44("Timeout", this, true));
        this.Field17923 = this.Method23(new Class44("TimeoutTicks", this, Double.longBitsToDouble(4626322717216342016L), 0.0, Double.longBitsToDouble((long)52714992 ^ 0x4059000003245DF0L), true));
        this.Field17924 = this.Method23(new Class44("StuckTicks", this, Double.longBitsToDouble((long)1228165964 ^ 0x401400004934534CL), 0.0, Double.longBitsToDouble((long)147648560 ^ 0x4044000008CCF030L), true));
        this.Field17925 = this.Method23(new Class44("Speed", this, Double.longBitsToDouble(4598847156609680094L), Double.longBitsToDouble((long)796706795 ^ 0x3FA99999B6E55E71L), Double.longBitsToDouble((long)342917163 ^ 0x3FE000001470802BL), false));
        this.Field17926 = this.Method23(new Class44("Snap", this, true));
        this.Field17927 = this.Method23(new Class44("Timer", this, false));
        this.Field17928 = this.Method23(new Class44("TimerSpeed", this, Double.longBitsToDouble(4607578735567226012L), 1.0, Double.longBitsToDouble((long)164807849 ^ 0x4014000009D2C4A9L), false));
        this.Field17929 = this.Method23(new Class44("Render", this, true));
        this.Field17930 = this.Method23(new Class44("LineWidth", this, Double.longBitsToDouble((long)705963975 ^ 0x3FF800002A1427C7L), Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble((long)1588305122 ^ 0x401000005EAB9CE2L), false));
        this.Field17931 = this.Method23(new Class44("Color", this, new Class2027(255, 255, 255, 255)));
        this.Field17932 = 0;
        this.Field17933 = 0;
        this.Field17934 = null;
        this.Field17936 = new Class618(this::Method7823, new Predicate[0]);
        this.Field17937 = new Class618(this::Method7822, new Predicate[0]);
    }
    
    @Override
    public void Method38() {
        super.Method38();
        if (Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        this.Field17935 = Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength;
        Class1796.Field16242.Method705((Class1320)this);
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method710((Class1320)this);
        Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = this.Field17935;
        this.Field17932 = 0;
        this.Field17933 = 0;
        this.Field17934 = null;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method7813(final RenderWorldLastEvent renderWorldLastEvent) {
        if (Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        if (this.Field17934 == null) {
            return;
        }
        if (!this.Field17929.Method365()) {
            return;
        }
        final Vec3d method7816 = this.Method7816(this.Field17934);
        final Tessellator getInstance = Tessellator.getInstance();
        final BufferBuilder getBuffer = getInstance.getBuffer();
        Class815.Method3433();
        GL11.glLineWidth(this.Field17930.Method368());
        getBuffer.begin(3, DefaultVertexFormats.POSITION_COLOR);
        getBuffer.pos(Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosX, Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosY, Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosZ).color(this.Field17931.Method322() / Float.intBitsToFloat(1132396544), this.Field17931.Method324() / Float.intBitsToFloat(1132396544), this.Field17931.Method326() / Float.intBitsToFloat(1132396544), this.Field17931.Method328() / Float.intBitsToFloat(1132396544));
        getBuffer.pos(method7816.x - Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosX, method7816.y - Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosY, method7816.z - Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosZ).color(this.Field17931.Method322() / Float.intBitsToFloat(1132396544), this.Field17931.Method324() / Float.intBitsToFloat(1132396544), this.Field17931.Method326() / Float.intBitsToFloat(1132396544), this.Field17931.Method328() / Float.intBitsToFloat(1132396544));
        getInstance.draw();
        Class815.Method3434();
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method7814(final InputUpdateEvent inputUpdateEvent) {
        if (!(inputUpdateEvent.getMovementInput() instanceof MovementInputFromOptions)) {
            return;
        }
        if (this.Field17934 == null) {
            return;
        }
        final MovementInput movementInput = inputUpdateEvent.getMovementInput();
        movementInput.moveForward = 0.0f;
        movementInput.moveStrafe = 0.0f;
        movementInput.forwardKeyDown = false;
        movementInput.backKeyDown = false;
        movementInput.leftKeyDown = false;
        movementInput.rightKeyDown = false;
    }
    
    private boolean Method7815(final AxisAlignedBB axisAlignedBB, final AxisAlignedBB axisAlignedBB2) {
        return false | axisAlignedBB.contains(new Vec3d(axisAlignedBB2.minX, axisAlignedBB2.minY, axisAlignedBB2.minZ)) | axisAlignedBB.contains(new Vec3d(axisAlignedBB2.minX, axisAlignedBB2.minY, axisAlignedBB2.maxZ)) | axisAlignedBB.contains(new Vec3d(axisAlignedBB2.maxX, axisAlignedBB2.minY, axisAlignedBB2.minZ)) | axisAlignedBB.contains(new Vec3d(axisAlignedBB2.maxX, axisAlignedBB2.minY, axisAlignedBB2.maxZ));
    }
    
    private Vec3d Method7816(final AxisAlignedBB axisAlignedBB) {
        return new Vec3d(axisAlignedBB.minX + (axisAlignedBB.maxX - axisAlignedBB.minX) / Double.longBitsToDouble((long)932221853 ^ 0x400000003790939DL), axisAlignedBB.minY, axisAlignedBB.minZ + (axisAlignedBB.maxZ - axisAlignedBB.minZ) / Double.longBitsToDouble((long)777287270 ^ 0x400000002E547666L));
    }
    
    private AxisAlignedBB Method7817() {
        final Set method7818 = this.Method7818();
        final ArrayList<AxisAlignedBB> list = new ArrayList<AxisAlignedBB>();
        final Iterator<BlockPos> iterator = method7818.iterator();
        while (iterator.hasNext()) {
            final Class1862 method7819 = Class1914.Method7131((BlockPos)iterator.next(), false, false);
            final Class422 method7820 = method7819.Method6959();
            final Class410 method7821 = method7819.Method6960();
            if (method7820 == Class422.Field9771) {
                continue;
            }
            if (!((Class557)this.Field17918.Method341()).Method2468(method7821)) {
                continue;
            }
            if (!((Class283)this.Field17919.Method341()).Method1495(method7820)) {
                continue;
            }
            list.add(method7819.Method6961());
        }
        return list.stream().filter((Predicate<? super AxisAlignedBB>)Class2170::Method7821).filter(this::Method7820).min(Comparator.comparingDouble((ToDoubleFunction<? super AxisAlignedBB>)this::Method7819)).orElse(null);
    }
    
    private Set Method7818() {
        final HashSet<BlockPos> set = new HashSet<BlockPos>();
        for (final BlockPos blockPos : Class2155.Method7758(this.Field17920.Method368(), true, false)) {
            if (!Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)Entity.class, new AxisAlignedBB(blockPos)).isEmpty()) {
                continue;
            }
            if (!Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().equals(Blocks.AIR)) {
                continue;
            }
            if (Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, -1, 0)).getBlock().equals(Blocks.AIR)) {
                continue;
            }
            if (!Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 1, 0)).getBlock().equals(Blocks.AIR)) {
                continue;
            }
            if (!Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 2, 0)).getBlock().equals(Blocks.AIR)) {
                continue;
            }
            set.add(blockPos);
        }
        return set;
    }
    
    private double Method7819(final AxisAlignedBB axisAlignedBB) {
        return Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(this.Method7816(axisAlignedBB).x, this.Method7816(axisAlignedBB).y, this.Method7816(axisAlignedBB).z);
    }
    
    private boolean Method7820(final AxisAlignedBB axisAlignedBB) {
        return Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - axisAlignedBB.minY <= this.Field17921.Method367();
    }
    
    private static boolean Method7821(final AxisAlignedBB axisAlignedBB) {
        return axisAlignedBB.minY < Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
    }
    
    private void Method7822(final Class1334 class1334) {
        if (class1334.Field14102 != MoverType.SELF) {
            return;
        }
        if (this.Field17934 == null) {
            this.Field17934 = this.Method7817();
        }
        if (this.Field17934 == null) {
            ++this.Field17932;
        }
        else {
            this.Field17932 = 0;
        }
        if (this.Field17934 == null && this.Field17922.Method365() && this.Field17932 > this.Field17923.Method335()) {
            this.Method22();
            return;
        }
        if (this.Field17934 == null) {
            return;
        }
        final double hypot = Math.hypot(Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX, Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ);
        if (this.Field17933 > this.Field17924.Method335()) {
            this.Method22();
            return;
        }
        final Vec3d method7816 = this.Method7816(this.Field17934);
        if (this.Field17926.Method365() && this.Method7815(this.Field17934, Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityBoundingBox().expand(0.0, Double.longBitsToDouble((long)786191787 ^ 0xBFA99999B745CC31L), 0.0))) {
            Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position(method7816.x, Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, method7816.z, Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
            Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(method7816.x, Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, method7816.z);
            this.Method22();
            return;
        }
        class1334.Method158();
        if (this.Field17927.Method365()) {
            Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = Float.intBitsToFloat(1112014848) / this.Field17928.Method368();
        }
        final Vec3d getPositionVector = Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector();
        final double radians = Math.toRadians(Class1055.Method4303(getPositionVector, method7816)[0]);
        final double hypot2 = Math.hypot(method7816.x - getPositionVector.x, method7816.z - getPositionVector.z);
        if (!this.Field17926.Method365() && hypot2 == 0.0) {
            this.Method22();
            return;
        }
        final double method7817 = Class394.Method1959((EntityLivingBase)Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field17925.Method367());
        final double min = Math.min(Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround ? method7817 : Math.max(hypot + Double.longBitsToDouble((long)2022481171 ^ 0x3F947AE13F228968L), method7817), hypot2);
        Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        class1334.Field14103 = -Math.sin(radians) * min;
        class1334.Field14105 = Math.cos(radians) * min;
        if (Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.collidedHorizontally) {
            ++this.Field17933;
        }
        else {
            this.Field17933 = 0;
        }
    }
    
    private void Method7823(final Class544 class544) {
        if (class544.Method982() instanceof SPacketPlayerPosLook) {
            this.Method22();
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x546A ^ 0x76));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
