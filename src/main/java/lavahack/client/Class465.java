//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import com.kisman.cc.event.Class1273;
import com.kisman.cc.util.Class650;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;
import lavahack.client.Class1036;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class2155;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class432;
import lavahack.client.Class44;
import lavahack.client.Class478;
import lavahack.client.Class618;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

public class Class465
extends Class42 {
    public static Class465 Field9930;
    private final Class44 Field9931 = this.Method23(new Class44("Mode", (Class42)this, "MotionTick", Arrays.asList("MotionTick", "ClientTick")));
    private final Class44 Field9932 = this.Method23(new Class44("Delay", (Class42)this, Double.longBitsToDouble((long)91924171 ^ 0x40790000057AA6CBL), 0.0, Double.longBitsToDouble(4652007308841189376L), true));
    private final Class44 Field9933 = this.Method23(new Class44("SwitchMode", (Class42)this, Class432.Field9803));
    private final Class44 Field9934 = this.Method23(new Class44("SortY", (Class42)this, true));
    private final Class44 Field9935 = this.Method23(new Class44("OnlyInHole", (Class42)this, true));
    private final Class650 Field9936 = new Class650();
    public Set Field9937 = new HashSet();
    private final Vec3d[] Field9938 = new Vec3d[]{new Vec3d(1.0, 0.0, 0.0), new Vec3d(0.0, 0.0, 1.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), 0.0, 0.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble(-4616189618054758400L)), new Vec3d(1.0, 0.0, Double.longBitsToDouble((long)1539705153 ^ 0xBFF000005BC60941L)), new Vec3d(1.0, 0.0, 1.0), new Vec3d(Double.longBitsToDouble((long)1528792970 ^ 0xBFF000005B1F878AL), 0.0, Double.longBitsToDouble((long)1674151981 ^ 0xBFF0000063C9882DL)), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), 0.0, 1.0), new Vec3d(1.0, 1.0, 0.0), new Vec3d(0.0, 1.0, 1.0), new Vec3d(Double.longBitsToDouble((long)1439886290 ^ 0xBFF0000055D2EBD2L), 1.0, 0.0), new Vec3d(0.0, 1.0, Double.longBitsToDouble(-4616189618054758400L)), new Vec3d(1.0, 1.0, Double.longBitsToDouble((long)1698094988 ^ 0xBFF000006536DF8CL)), new Vec3d(1.0, 1.0, 1.0), new Vec3d(Double.longBitsToDouble((long)1808939599 ^ 0xBFF000006BD23A4FL), 1.0, Double.longBitsToDouble(-4616189618054758400L)), new Vec3d(Double.longBitsToDouble((long)1258182371 ^ 0xBFF000004AFE56E3L), 1.0, 1.0)};
    private boolean Field9939 = false;
    @Class1801
    private final Class618 Field9940 = new Class618(this::Method2182, new Predicate[0]);
    private String Field9941 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class465() {
        super("AntiTrap", "", Class97.Field8338);
        super.Method44(this::Method2183);
        Field9930 = this;
    }

    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field9940);
        if (Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null) return;
        if (Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) return;
        super.Method21(false);
    }

    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field9940);
        if (Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Method27();
    }

    @Override
    public void Method45() {
        if (Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (!this.Field9931.Method309("ClientTick")) return;
        this.Method20();
    }

    private void Method20() {
        Vec3d vec3d;
        BlockPos blockPos;
        if (!this.Field9936.Method2797(this.Field9932.Method335())) return;
        this.Field9936.Method2801();
        if (this.Field9935.Method365() && !this.Method2179(Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPosition())) {
            return;
        }
        boolean bl = this.Field9939 = Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() == Items.END_CRYSTAL;
        if (!this.Field9939 && Class9.Method116(Items.END_CRYSTAL, 0, 9) == -1) {
            return;
        }
        ArrayList<Vec3d> arrayList = new ArrayList<Vec3d>();
        Collections.addAll(arrayList, Class1036.Method4192(Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector(), this.Field9938));
        EntityPlayer entityPlayer = Class394.Method1924(Float.intBitsToFloat(0x40A00000));
        if (entityPlayer != null) {
            arrayList.sort(Class465::Method2181);
            if (this.Field9934.Method365()) {
                arrayList.sort(Comparator.comparingDouble(Class465::Method2180));
            }
        }
        Iterator iterator = arrayList.iterator();
        do {
            if (!iterator.hasNext()) return;
        } while (!Class2155.Method7754(blockPos = new BlockPos(vec3d = (Vec3d)iterator.next())));
        this.Method2178(blockPos);
        super.Method39();
    }

    private void Method2178(BlockPos blockPos) {
        boolean bl = Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() == Items.END_CRYSTAL;
        if (!this.Field9939 && !this.Method27()) {
            return;
        }
        RayTraceResult rayTraceResult = Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(new Vec3d(Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEyeHeight(), Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ), new Vec3d((double)blockPos.getX() + Double.longBitsToDouble(4602678819172646912L), (double)blockPos.getY() - Double.longBitsToDouble((long)1734575111 ^ 0x3FE0000067638407L), (double)blockPos.getZ() + Double.longBitsToDouble((long)626637544 ^ 0x3FE000002559BAE8L)));
        EnumFacing enumFacing = rayTraceResult == null || rayTraceResult.sideHit == null ? EnumFacing.UP : rayTraceResult.sideHit;
        this.Field9937.add(blockPos);
        Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos, enumFacing, this.Field9939 ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND, 0.0f, 0.0f, 0.0f));
        Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(EnumHand.MAIN_HAND);
        this.Field9936.Method2801();
    }

    private boolean Method27() {
        if (this.Field9939) {
            return true;
        }
        Class9.Method110(Class9.Method116(Items.END_CRYSTAL, 0, 9), this.Field9933.Method359().equals("Silent"));
        return true;
    }

    private boolean Method2179(BlockPos blockPos) {
        int n = 0;
        if (Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 3, 0)).getBlock() == Blocks.AIR) {
            ++n;
        }
        if (Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 2, 0)).getBlock() == Blocks.AIR) {
            ++n;
        }
        if (Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 1, 0)).getBlock() == Blocks.AIR) {
            ++n;
        }
        if (Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 0, 0)).getBlock() == Blocks.AIR) {
            ++n;
        }
        if (Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, -1, 0)).getBlock() == Blocks.OBSIDIAN || Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, -1, 0)).getBlock() == Blocks.BEDROCK || Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, -1, 0)).getBlock() == Blocks.ENDER_CHEST) {
            ++n;
        }
        if (Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(1, 0, 0)).getBlock() == Blocks.OBSIDIAN || Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(1, 0, 0)).getBlock() == Blocks.BEDROCK || Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(1, 0, 0)).getBlock() == Blocks.ENDER_CHEST) {
            ++n;
        }
        if (Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(-1, 0, 0)).getBlock() == Blocks.OBSIDIAN || Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(-1, 0, 0)).getBlock() == Blocks.BEDROCK || Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(-1, 0, 0)).getBlock() == Blocks.ENDER_CHEST) {
            ++n;
        }
        if (Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 0, 1)).getBlock() == Blocks.OBSIDIAN || Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 0, 1)).getBlock() == Blocks.BEDROCK || Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 0, 1)).getBlock() == Blocks.ENDER_CHEST) {
            ++n;
        }
        if (Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 0, -1)).getBlock() == Blocks.OBSIDIAN || Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 0, -1)).getBlock() == Blocks.BEDROCK || Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 0, -1)).getBlock() == Blocks.ENDER_CHEST) {
            ++n;
        }
        if (n < 9) return false;
        return true;
    }

    private static double Method2180(Vec3d vec3d) {
        return vec3d.y;
    }

    private static int Method2181(Vec3d vec3d, Vec3d vec3d2) {
        return Double.compare(Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(vec3d2.x, vec3d2.y, vec3d2.z), Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(vec3d.x, vec3d.y, vec3d.z));
    }

    private void Method2182(Class478 class478) {
        if (class478.Method160() != Class1273.Field13746) return;
        if (!this.Field9931.Method309("MotionTick")) return;
        this.Method20();
    }

    private String Method2183() {
        return "[" + this.Field9931.Method359() + "]";
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 75;
            cArray2[n] = (char)(cArray[n] ^ (0x4F85 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

