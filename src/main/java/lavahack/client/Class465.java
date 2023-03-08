//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import java.util.function.*;
import java.util.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraft.util.math.*;
import net.minecraft.init.*;
import com.kisman.cc.event.*;

public class Class465 extends Class42
{
    public static Class465 Field9930;
    private final Class44 Field9931;
    private final Class44 Field9932;
    private final Class44 Field9933;
    private final Class44 Field9934;
    private final Class44 Field9935;
    private final Class650 Field9936;
    public Set Field9937;
    private final Vec3d[] Field9938;
    private boolean Field9939;
    @Class1801
    private final Class618 Field9940;
    private String Field9941 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class465() {
        super("AntiTrap", "", Class97.Field8338);
        this.Field9931 = this.Method23(new Class44("Mode", (Class42)this, "MotionTick", (List)Arrays.asList("MotionTick", "ClientTick")));
        this.Field9932 = this.Method23(new Class44("Delay", (Class42)this, Double.longBitsToDouble((long)91924171 ^ 0x40790000057AA6CBL), 0.0, Double.longBitsToDouble(4652007308841189376L), true));
        this.Field9933 = this.Method23(new Class44("SwitchMode", (Class42)this, (Enum)Class432.Field9803));
        this.Field9934 = this.Method23(new Class44("SortY", (Class42)this, true));
        this.Field9935 = this.Method23(new Class44("OnlyInHole", (Class42)this, true));
        this.Field9936 = new Class650();
        this.Field9937 = new HashSet();
        this.Field9938 = new Vec3d[] { new Vec3d(1.0, 0.0, 0.0), new Vec3d(0.0, 0.0, 1.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), 0.0, 0.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble(-4616189618054758400L)), new Vec3d(1.0, 0.0, Double.longBitsToDouble((long)1539705153 ^ 0xBFF000005BC60941L)), new Vec3d(1.0, 0.0, 1.0), new Vec3d(Double.longBitsToDouble((long)1528792970 ^ 0xBFF000005B1F878AL), 0.0, Double.longBitsToDouble((long)1674151981 ^ 0xBFF0000063C9882DL)), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), 0.0, 1.0), new Vec3d(1.0, 1.0, 0.0), new Vec3d(0.0, 1.0, 1.0), new Vec3d(Double.longBitsToDouble((long)1439886290 ^ 0xBFF0000055D2EBD2L), 1.0, 0.0), new Vec3d(0.0, 1.0, Double.longBitsToDouble(-4616189618054758400L)), new Vec3d(1.0, 1.0, Double.longBitsToDouble((long)1698094988 ^ 0xBFF000006536DF8CL)), new Vec3d(1.0, 1.0, 1.0), new Vec3d(Double.longBitsToDouble((long)1808939599 ^ 0xBFF000006BD23A4FL), 1.0, Double.longBitsToDouble(-4616189618054758400L)), new Vec3d(Double.longBitsToDouble((long)1258182371 ^ 0xBFF000004AFE56E3L), 1.0, 1.0) };
        this.Field9939 = false;
        this.Field9940 = new Class618(this::Method2182, new Predicate[0]);
        super.Method44((Supplier)this::Method2183);
        Class465.Field9930 = this;
    }
    
    public void Method38() {
        Class1796.Field16242.Method706(this.Field9940);
        if (Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            super.Method21(false);
        }
    }
    
    public void Method39() {
        Class1796.Field16242.Method711(this.Field9940);
        if (Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Method27();
    }
    
    public void Method45() {
        if (Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null && this.Field9931.Method309("ClientTick")) {
            this.Method20();
        }
    }
    
    private void Method20() {
        if (!this.Field9936.Method2797((long)this.Field9932.Method335())) {
            return;
        }
        this.Field9936.Method2801();
        if (this.Field9935.Method365() && !this.Method2179(Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPosition())) {
            return;
        }
        this.Field9939 = (Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() == Items.END_CRYSTAL);
        if (!this.Field9939 && Class9.Method116(Items.END_CRYSTAL, 0, 9) == -1) {
            return;
        }
        final ArrayList<Object> c = new ArrayList<Object>();
        Collections.addAll(c, Class1036.Method4192(Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector(), this.Field9938));
        if (Class394.Method1924(Float.intBitsToFloat(1084227584)) != null) {
            c.sort((Comparator<? super Object>)Class465::Method2181);
            if (this.Field9934.Method365()) {
                c.sort(Comparator.comparingDouble((ToDoubleFunction<? super Object>)Class465::Method2180));
            }
        }
        final Iterator<Vec3d> iterator = c.iterator();
        while (iterator.hasNext()) {
            final BlockPos blockPos = new BlockPos((Vec3d)iterator.next());
            if (!Class2155.Method7754(blockPos)) {
                continue;
            }
            this.Method2178(blockPos);
            super.Method39();
            break;
        }
    }
    
    private void Method2178(final BlockPos blockPos) {
        final boolean b = Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() == Items.END_CRYSTAL;
        if (!this.Field9939 && !this.Method27()) {
            return;
        }
        final RayTraceResult rayTraceBlocks = Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(new Vec3d(Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEyeHeight(), Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ), new Vec3d(blockPos.getX() + Double.longBitsToDouble(4602678819172646912L), blockPos.getY() - Double.longBitsToDouble((long)1734575111 ^ 0x3FE0000067638407L), blockPos.getZ() + Double.longBitsToDouble((long)626637544 ^ 0x3FE000002559BAE8L)));
        final EnumFacing enumFacing = (rayTraceBlocks == null || rayTraceBlocks.sideHit == null) ? EnumFacing.UP : rayTraceBlocks.sideHit;
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
    
    private boolean Method2179(final BlockPos blockPos) {
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
        return n >= 9;
    }
    
    private static double Method2180(final Vec3d vec3d) {
        return vec3d.y;
    }
    
    private static int Method2181(final Vec3d vec3d, final Vec3d vec3d2) {
        return Double.compare(Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(vec3d2.x, vec3d2.y, vec3d2.z), Class465.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(vec3d.x, vec3d.y, vec3d.z));
    }
    
    private void Method2182(final Class478 class478) {
        if (class478.Method160() == Class1273.Field13746 && this.Field9931.Method309("MotionTick")) {
            this.Method20();
        }
    }
    
    private String Method2183() {
        return "[" + this.Field9931.Method359() + "]";
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4F85 ^ 0x4B));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
