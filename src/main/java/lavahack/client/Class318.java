//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import java.util.stream.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import org.lwjgl.input.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraftforge.client.event.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.init.*;
import net.minecraft.world.*;
import net.minecraft.block.state.*;
import java.util.*;

public class Class318 extends Class42
{
    private final Class44 Field9338;
    private final Class44 Field9339;
    private final Class44 Field9340;
    private final Class44 Field9341;
    private final Class44 Field9342;
    private final Class44 Field9343;
    private final Class44 Field9344;
    private final Class44 Field9345;
    private final Class44 Field9346;
    private final Class44 Field9347;
    private final Class44 Field9348;
    private final Class44 Field9349;
    private final Class44 Field9350;
    private final Class44 Field9351;
    private final Class1996 Field9352;
    private final Class1612 Field9353;
    private final HashMap Field9354;
    private boolean Field9355;
    private BlockPos Field9356;
    private int Field9357;
    
    public Class318() {
        super("CityESP", "CityESP", Class97.Field8342);
        this.Field9338 = this.Method23(new Class44("Range", this, Double.longBitsToDouble((long)1403559807 ^ 0x4034000053A89F7FL), 1.0, Double.longBitsToDouble((long)1794915693 ^ 0x403E00006AFC3D6DL), true));
        this.Field9339 = this.Method23(new Class44("Down", this, 1.0, 0.0, Double.longBitsToDouble(4613937818241073152L), true));
        this.Field9340 = this.Method23(new Class44("Sides", this, 1.0, 0.0, Double.longBitsToDouble((long)1798807054 ^ 0x401000006B379E0EL), true));
        this.Field9341 = this.Method23(new Class44("Depth", this, Double.longBitsToDouble(4613937818241073152L), 0.0, Double.longBitsToDouble(4621819117588971520L), true));
        this.Field9342 = this.Method23(new Class44("Min DMG", this, Double.longBitsToDouble((long)1393906400 ^ 0x40240000531552E0L), 0.0, Double.longBitsToDouble((long)1208139460 ^ 0x403400004802BEC4L), true));
        this.Field9343 = this.Method23(new Class44("Max Self DMG", this, Double.longBitsToDouble((long)1732929097 ^ 0x401C0000674A6649L), 0.0, Double.longBitsToDouble((long)1746864098 ^ 0x40340000681F07E2L), true));
        this.Field9344 = this.Method23(new Class44("Ignore Crystals", this, true));
        this.Field9345 = this.Method23(new Class44("Mine", this, false));
        this.Field9346 = this.Method23(new Class44("Mine Key", this, 42));
        this.Field9347 = this.Method23(new Class44("Switch Pick", this, true));
        this.Field9348 = this.Method23(new Class44("Mine Dist", this, Double.longBitsToDouble(4617315517961601024L), 0.0, Double.longBitsToDouble((long)77183793 ^ 0x402400000499BB31L), true));
        this.Field9349 = this.Method23(new Class44("Mine Mode", this, Class708.Field11018));
        this.Field9350 = this.Method23(new Class44("Target Mode", this, (Enum)Class1704.Field15887));
        this.Field9351 = this.Method23(new Class44("Select Mode", this, Class398.Field9664));
        this.Field9352 = this.Method24(new Class1996(new Class44("Renderer", this)));
        this.Field9353 = ((Class1612)new Class1612((Class42)this).Method772(this.Field9352)).Method3788().Method3789();
        this.Field9354 = new HashMap();
        this.Field9355 = false;
        this.Field9356 = new BlockPos(-1, -1, -1);
    }
    
    @Override
    public void Method45() {
        if (Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field9354.clear();
        for (final EntityPlayer key : (List)Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities.stream().filter(Class318::Method1611).filter(this::Method1610).filter(Class318::Method1609).collect(Collectors.toList())) {
            final List method1951 = Class394.Method1951((Entity)key);
            if (method1951.size() == 0) {
                continue;
            }
            int n = Integer.MAX_VALUE;
            final Iterator<BlockPos> iterator2 = method1951.iterator();
            while (iterator2.hasNext()) {
                final int getY = iterator2.next().getY();
                if (getY < n) {
                    n = getY;
                }
            }
            if (key.posY % 1.0 > Double.longBitsToDouble(4596373779694328218L)) {
                ++n;
            }
            final List<? super Object> list = method1951.stream().filter(Class318::Method1608).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList());
            final Optional<BlockPos> any = list.stream().findAny();
            if (!any.isPresent()) {
                continue;
            }
            final Class1862 method1952 = Class1914.Method7131((BlockPos)any.get(), false, true);
            if (method1952.Method6959() == Class422.Field9771) {
                continue;
            }
            if (method1952.Method6960() == Class410.Field9697) {
                continue;
            }
            final ArrayList value = new ArrayList();
            for (final BlockPos blockPos : list) {
                value.addAll(this.Method1602(blockPos, Class1914.Method7133(blockPos).keySet(), key));
            }
            if (value.size() <= 0) {
                continue;
            }
            this.Field9354.put(key, value);
        }
        if (this.Field9345.Method365() && this.Field9346.Method337() != 0 && Keyboard.isKeyDown(this.Field9346.Method337())) {
            final Iterator<List<BlockPos>> iterator4 = this.Field9354.values().iterator();
            while (iterator4.hasNext()) {
                for (final BlockPos field9356 : iterator4.next()) {
                    if (Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)field9356.getX(), (double)field9356.getY(), (double)field9356.getZ()) <= this.Field9348.Method335()) {
                        if (this.Field9355 && this.Field9356 == field9356) {
                            break;
                        }
                        if (Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() != Items.DIAMOND_PICKAXE && this.Field9347.Method365()) {
                            final int method1953 = Class9.Method132(ItemPickaxe.class, 0, 9);
                            if (method1953 != 1) {
                                Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = method1953;
                            }
                        }
                        if (this.Field9349.Method359().equals(Class708.Field11018.name())) {
                            Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(EnumHand.MAIN_HAND);
                            Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging$Action.START_DESTROY_BLOCK, field9356, EnumFacing.UP));
                            Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging$Action.STOP_DESTROY_BLOCK, field9356, EnumFacing.UP));
                            this.Field9355 = true;
                            this.Field9356 = field9356;
                            break;
                        }
                        Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(EnumHand.MAIN_HAND);
                        Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.onPlayerDamageBlock(field9356, EnumFacing.UP);
                        break;
                    }
                }
            }
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method1601(final RenderWorldLastEvent renderWorldLastEvent) {
        this.Field9354.entrySet().stream().sorted(Class318::Method1607).forEach(this::Method1606);
    }
    
    private List Method1602(final BlockPos blockPos, final Set set, final EntityPlayer entityPlayer) {
        final ArrayList list = new ArrayList();
        final HashMap<BlockPos, Class668> hashMap = new HashMap<BlockPos, Class668>();
        for (final Class668 value : set) {
            final BlockPos method2846 = value.Method2846(blockPos);
            if (Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(method2846).getBlock() != Blocks.AIR) {
                hashMap.put(method2846, value);
            }
        }
        hashMap.forEach(this::Method1605);
        return list;
    }
    
    private void Method1603(final List list) {
        final String method359 = this.Field9351.Method359();
        switch (method359.hashCode()) {
            case -1763776967: {
                if (method359.equals("Closest")) {
                    break;
                }
                break;
            }
            case 65921: {
                if (method359.equals("All")) {
                    break;
                }
                break;
            }
        }
    }
    
    private static Double Method1604(final BlockPos blockPos) {
        return blockPos.distanceSq((double)(int)Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, (double)(int)Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, (double)(int)Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
    }
    
    private void Method1605(final EntityPlayer entityPlayer, final List list, final BlockPos blockPos, final Class668 class668) {
        if (class668 == Class668.Field10833) {
            return;
        }
        final List method1947 = Class394.Method1947(class668.Method2849(blockPos.down(this.Field9339.Method335()), this.Field9340.Method335()), class668.Method2847(class668.Method2850(blockPos, this.Field9340.Method335()), this.Field9341.Method335()));
        final IBlockState getBlockState = Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
        Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.setBlockToAir(blockPos);
        for (final BlockPos blockPos2 : method1947) {
            if (Class2155.Method7771(blockPos2.down(), true, this.Field9344.Method365()) && Class2155.Method7759((World)Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos2.getX() + Double.longBitsToDouble(4602678819172646912L), (double)blockPos2.getY(), blockPos2.getZ() + Double.longBitsToDouble((long)1800769606 ^ 0x3FE000006B559046L), (Entity)entityPlayer, false) >= this.Field9342.Method335()) {
                if (Class2155.Method7759((World)Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos2.getX() + Double.longBitsToDouble(4602678819172646912L), (double)blockPos2.getY(), blockPos2.getZ() + Double.longBitsToDouble((long)2067715076 ^ 0x3FE000007B3ED404L), (Entity)Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, false) <= this.Field9343.Method335()) {
                    list.add(blockPos);
                    break;
                }
                break;
            }
        }
        Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.setBlockState(blockPos, getBlockState);
    }
    
    private void Method1606(final AtomicBoolean atomicBoolean, final Map.Entry entry) {
        if (atomicBoolean.get()) {
            return;
        }
        this.Method1603(entry.getValue());
        if (this.Field9350.Method359().equalsIgnoreCase(Class1704.Field15888.name())) {
            atomicBoolean.set(true);
        }
    }
    
    private static int Method1607(final Map.Entry entry, final Map.Entry entry2) {
        return (int)entry.getKey().getDistanceSq((Entity)entry2.getKey());
    }
    
    private static boolean Method1608(final int n, final BlockPos blockPos) {
        return blockPos.getY() == n;
    }
    
    private static boolean Method1609(final EntityPlayer entityPlayer) {
        return !Class394.Method1949((Entity)entityPlayer);
    }
    
    private boolean Method1610(final EntityPlayer entityPlayer) {
        return entityPlayer.getDistanceSq((Entity)Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) <= this.Field9338.Method367() * this.Field9338.Method367();
    }
    
    private static boolean Method1611(final EntityPlayer entityPlayer) {
        return entityPlayer != Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7D9B ^ 0xED));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
