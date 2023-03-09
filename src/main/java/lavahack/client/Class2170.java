//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.MoverType
 *  net.minecraft.init.Blocks
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.network.play.server.SPacketPlayerPosLook
 *  net.minecraft.util.MovementInput
 *  net.minecraft.util.MovementInputFromOptions
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.client.event.InputUpdateEvent
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.Class1055;
import com.kisman.cc.util.Class2027;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import lavahack.client.Class1303;
import lavahack.client.Class1334;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class1862;
import lavahack.client.Class1914;
import lavahack.client.Class2155;
import lavahack.client.Class283;
import lavahack.client.Class394;
import lavahack.client.Class410;
import lavahack.client.Class42;
import lavahack.client.Class422;
import lavahack.client.Class44;
import lavahack.client.Class544;
import lavahack.client.Class557;
import lavahack.client.Class618;
import lavahack.client.Class815;
import lavahack.client.Class97;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.MoverType;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraft.util.MovementInput;
import net.minecraft.util.MovementInputFromOptions;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.InputUpdateEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class Class2170
extends Class42 {
    private final Class1303 Field17918 = new Class1303("Holes", (Class42)this, Class557.Field10371).Method5303();
    private final Class1303 Field17919 = new Class1303("HoleType", (Class42)this, Class283.Field9224).Method5303();
    private final Class44 Field17920 = this.Method23(new Class44("HoleRange", (Class42)this, Double.longBitsToDouble((long)717586480 ^ 0x401000002AC58030L), 1.0, Double.longBitsToDouble(4624633867356078080L), false));
    private final Class44 Field17921 = this.Method23(new Class44("HoleYRange", (Class42)this, Double.longBitsToDouble((long)332335877 ^ 0x4010000013CF0B05L), 1.0, Double.longBitsToDouble((long)955124051 ^ 0x4020000038EE0953L), false));
    private final Class44 Field17922 = this.Method23(new Class44("Timeout", (Class42)this, true));
    private final Class44 Field17923 = this.Method23(new Class44("TimeoutTicks", (Class42)this, Double.longBitsToDouble(0x4034000000000000L), 0.0, Double.longBitsToDouble((long)52714992 ^ 0x4059000003245DF0L), true));
    private final Class44 Field17924 = this.Method23(new Class44("StuckTicks", (Class42)this, Double.longBitsToDouble((long)1228165964 ^ 0x401400004934534CL), 0.0, Double.longBitsToDouble((long)147648560 ^ 0x4044000008CCF030L), true));
    private final Class44 Field17925 = this.Method23(new Class44("Speed", (Class42)this, Double.longBitsToDouble(4598847156609680094L), Double.longBitsToDouble((long)796706795 ^ 0x3FA99999B6E55E71L), Double.longBitsToDouble((long)342917163 ^ 0x3FE000001470802BL), false));
    private final Class44 Field17926 = this.Method23(new Class44("Snap", (Class42)this, true));
    private final Class44 Field17927 = this.Method23(new Class44("Timer", (Class42)this, false));
    private final Class44 Field17928 = this.Method23(new Class44("TimerSpeed", (Class42)this, Double.longBitsToDouble(4607578735567226012L), 1.0, Double.longBitsToDouble((long)164807849 ^ 0x4014000009D2C4A9L), false));
    private final Class44 Field17929 = this.Method23(new Class44("Render", (Class42)this, true));
    private final Class44 Field17930 = this.Method23(new Class44("LineWidth", (Class42)this, Double.longBitsToDouble((long)705963975 ^ 0x3FF800002A1427C7L), Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble((long)1588305122 ^ 0x401000005EAB9CE2L), false));
    private final Class44 Field17931 = this.Method23(new Class44("Color", (Class42)this, new Class2027(255, 255, 255, 255)));
    private int Field17932 = 0;
    private int Field17933 = 0;
    private AxisAlignedBB Field17934 = null;
    private float Field17935;
    @Class1801
    private final Class618 Field17936 = new Class618(this::Method7823, new Predicate[0]);
    @Class1801
    private final Class618 Field17937 = new Class618(this::Method7822, new Predicate[0]);
    private String Field17938 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class2170() {
        super("HoleSnap", Class97.Field8340, true);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            this.Field17935 = Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength;
            Class1796.Field16242.Method705(this);
            return;
        }
        this.Method22();
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method710(this);
        Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = this.Field17935;
        this.Field17932 = 0;
        this.Field17933 = 0;
        this.Field17934 = null;
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method7813(RenderWorldLastEvent renderWorldLastEvent) {
        if (Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
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
        Vec3d vec3d = this.Method7816(this.Field17934);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        Class815.Method3433();
        GL11.glLineWidth((float)this.Field17930.Method368());
        bufferBuilder.begin(3, DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.pos(Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosX, Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosY, Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosZ).color(this.Field17931.Method322() / Float.intBitsToFloat(1132396544), this.Field17931.Method324() / Float.intBitsToFloat(1132396544), this.Field17931.Method326() / Float.intBitsToFloat(1132396544), this.Field17931.Method328() / Float.intBitsToFloat(1132396544));
        bufferBuilder.pos(vec3d.x - Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosX, vec3d.y - Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosY, vec3d.z - Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosZ).color(this.Field17931.Method322() / Float.intBitsToFloat(1132396544), this.Field17931.Method324() / Float.intBitsToFloat(1132396544), this.Field17931.Method326() / Float.intBitsToFloat(1132396544), this.Field17931.Method328() / Float.intBitsToFloat(1132396544));
        tessellator.draw();
        Class815.Method3434();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method7814(InputUpdateEvent inputUpdateEvent) {
        if (!(inputUpdateEvent.getMovementInput() instanceof MovementInputFromOptions)) {
            return;
        }
        if (this.Field17934 == null) {
            return;
        }
        MovementInput movementInput = inputUpdateEvent.getMovementInput();
        movementInput.moveForward = 0.0f;
        movementInput.moveStrafe = 0.0f;
        movementInput.forwardKeyDown = false;
        movementInput.backKeyDown = false;
        movementInput.leftKeyDown = false;
        movementInput.rightKeyDown = false;
    }

    private boolean Method7815(AxisAlignedBB axisAlignedBB, AxisAlignedBB axisAlignedBB2) {
        boolean bl = false;
        bl |= axisAlignedBB.contains(new Vec3d(axisAlignedBB2.minX, axisAlignedBB2.minY, axisAlignedBB2.minZ));
        bl |= axisAlignedBB.contains(new Vec3d(axisAlignedBB2.minX, axisAlignedBB2.minY, axisAlignedBB2.maxZ));
        bl |= axisAlignedBB.contains(new Vec3d(axisAlignedBB2.maxX, axisAlignedBB2.minY, axisAlignedBB2.minZ));
        return bl |= axisAlignedBB.contains(new Vec3d(axisAlignedBB2.maxX, axisAlignedBB2.minY, axisAlignedBB2.maxZ));
    }

    private Vec3d Method7816(AxisAlignedBB axisAlignedBB) {
        double d = axisAlignedBB.maxX - axisAlignedBB.minX;
        double d2 = axisAlignedBB.maxZ - axisAlignedBB.minZ;
        return new Vec3d(axisAlignedBB.minX + d / Double.longBitsToDouble((long)932221853 ^ 0x400000003790939DL), axisAlignedBB.minY, axisAlignedBB.minZ + d2 / Double.longBitsToDouble((long)777287270 ^ 0x400000002E547666L));
    }

    private AxisAlignedBB Method7817() {
        Set set = this.Method7818();
        ArrayList<AxisAlignedBB> arrayList = new ArrayList<AxisAlignedBB>();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            Class1862 class1862 = Class1914.Method7131(blockPos, false, false);
            Class422 class422 = class1862.Method6959();
            Class410 class410 = class1862.Method6960();
            if (class422 == Class422.Field9771 || !((Class557)this.Field17918.Method341()).Method2468(class410) || !((Class283)this.Field17919.Method341()).Method1495(class422)) continue;
            arrayList.add(class1862.Method6961());
        }
        return arrayList.stream().filter(Class2170::Method7821).filter(this::Method7820).min(Comparator.comparingDouble(this::Method7819)).orElse(null);
    }

    private Set Method7818() {
        HashSet<BlockPos> hashSet = new HashSet<BlockPos>();
        List list = Class2155.Method7758(this.Field17920.Method368(), true, false);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
            if (!Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, axisAlignedBB).isEmpty() || !Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().equals(Blocks.AIR) || Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, -1, 0)).getBlock().equals(Blocks.AIR) || !Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 1, 0)).getBlock().equals(Blocks.AIR) || !Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 2, 0)).getBlock().equals(Blocks.AIR)) continue;
            hashSet.add(blockPos);
        }
        return hashSet;
    }

    private double Method7819(AxisAlignedBB axisAlignedBB) {
        return Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(this.Method7816((AxisAlignedBB)axisAlignedBB).x, this.Method7816((AxisAlignedBB)axisAlignedBB).y, this.Method7816((AxisAlignedBB)axisAlignedBB).z);
    }

    private boolean Method7820(AxisAlignedBB axisAlignedBB) {
        if (!(Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - axisAlignedBB.minY <= this.Field17921.Method367())) return false;
        return true;
    }

    private static boolean Method7821(AxisAlignedBB axisAlignedBB) {
        if (!(axisAlignedBB.minY < Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY)) return false;
        return true;
    }

    private void Method7822(Class1334 class1334) {
        if (class1334.Field14102 != MoverType.SELF) {
            return;
        }
        if (this.Field17934 == null) {
            this.Field17934 = this.Method7817();
        }
        this.Field17932 = this.Field17934 == null ? ++this.Field17932 : 0;
        if (this.Field17934 == null && this.Field17922.Method365() && this.Field17932 > this.Field17923.Method335()) {
            this.Method22();
            return;
        }
        if (this.Field17934 == null) {
            return;
        }
        double d = Math.hypot(Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX, Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ);
        if (this.Field17933 > this.Field17924.Method335()) {
            this.Method22();
            return;
        }
        Vec3d vec3d = this.Method7816(this.Field17934);
        if (this.Field17926.Method365() && this.Method7815(this.Field17934, Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityBoundingBox().expand(0.0, Double.longBitsToDouble((long)786191787 ^ 0xBFA99999B745CC31L), 0.0))) {
            Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(vec3d.x, Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, vec3d.z, Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
            Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(vec3d.x, Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, vec3d.z);
            this.Method22();
            return;
        }
        class1334.Method158();
        if (this.Field17927.Method365()) {
            Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = Float.intBitsToFloat(1112014848) / this.Field17928.Method368();
        }
        Vec3d vec3d2 = Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector();
        double d2 = Math.toRadians(Class1055.Method4303(vec3d2, vec3d)[0]);
        double d3 = Math.hypot(vec3d.x - vec3d2.x, vec3d.z - vec3d2.z);
        if (!this.Field17926.Method365() && d3 == 0.0) {
            this.Method22();
            return;
        }
        double d4 = Class394.Method1959((EntityLivingBase)Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field17925.Method367());
        double d5 = Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround ? d4 : Math.max(d + Double.longBitsToDouble((long)2022481171 ^ 0x3F947AE13F228968L), d4);
        double d6 = Math.min(d5, d3);
        Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        class1334.Field14103 = -Math.sin(d2) * d6;
        class1334.Field14105 = Math.cos(d2) * d6;
        if (Class2170.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.collidedHorizontally) {
            ++this.Field17933;
            return;
        }
        this.Field17933 = 0;
    }

    private void Method7823(Class544 class544) {
        if (!(class544.Method982() instanceof SPacketPlayerPosLook)) return;
        this.Method22();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 118;
            cArray2[n] = (char)(cArray[n] ^ (0x546A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

