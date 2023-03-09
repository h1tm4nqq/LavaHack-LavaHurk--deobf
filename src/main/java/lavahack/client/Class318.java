//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemPickaxe
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayerDigging
 *  net.minecraft.network.play.client.CPacketPlayerDigging$Action
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.input.Keyboard
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import lavahack.client.Class1612;
import lavahack.client.Class1704;
import lavahack.client.Class1862;
import lavahack.client.Class1914;
import lavahack.client.Class1996;
import lavahack.client.Class2155;
import lavahack.client.Class394;
import lavahack.client.Class398;
import lavahack.client.Class410;
import lavahack.client.Class42;
import lavahack.client.Class422;
import lavahack.client.Class44;
import lavahack.client.Class668;
import lavahack.client.Class708;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Keyboard;

public class Class318
extends Class42 {
    private final Class44 Field9338 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble((long)1403559807 ^ 0x4034000053A89F7FL), 1.0, Double.longBitsToDouble((long)1794915693 ^ 0x403E00006AFC3D6DL), true));
    private final Class44 Field9339 = this.Method23(new Class44("Down", (Class42)this, 1.0, 0.0, Double.longBitsToDouble(0x4008000000000000L), true));
    private final Class44 Field9340 = this.Method23(new Class44("Sides", (Class42)this, 1.0, 0.0, Double.longBitsToDouble((long)1798807054 ^ 0x401000006B379E0EL), true));
    private final Class44 Field9341 = this.Method23(new Class44("Depth", (Class42)this, Double.longBitsToDouble(0x4008000000000000L), 0.0, Double.longBitsToDouble(0x4024000000000000L), true));
    private final Class44 Field9342 = this.Method23(new Class44("Min DMG", (Class42)this, Double.longBitsToDouble((long)1393906400 ^ 0x40240000531552E0L), 0.0, Double.longBitsToDouble((long)1208139460 ^ 0x403400004802BEC4L), true));
    private final Class44 Field9343 = this.Method23(new Class44("Max Self DMG", (Class42)this, Double.longBitsToDouble((long)1732929097 ^ 0x401C0000674A6649L), 0.0, Double.longBitsToDouble((long)1746864098 ^ 0x40340000681F07E2L), true));
    private final Class44 Field9344 = this.Method23(new Class44("Ignore Crystals", (Class42)this, true));
    private final Class44 Field9345 = this.Method23(new Class44("Mine", (Class42)this, false));
    private final Class44 Field9346 = this.Method23(new Class44("Mine Key", (Class42)this, 42));
    private final Class44 Field9347 = this.Method23(new Class44("Switch Pick", (Class42)this, true));
    private final Class44 Field9348 = this.Method23(new Class44("Mine Dist", (Class42)this, Double.longBitsToDouble(0x4014000000000000L), 0.0, Double.longBitsToDouble((long)77183793 ^ 0x402400000499BB31L), true));
    private final Class44 Field9349 = this.Method23(new Class44("Mine Mode", (Class42)this, Class708.Field11018));
    private final Class44 Field9350 = this.Method23(new Class44("Target Mode", (Class42)this, Class1704.Field15887));
    private final Class44 Field9351 = this.Method23(new Class44("Select Mode", (Class42)this, Class398.Field9664));
    private final Class1996 Field9352 = this.Method24(new Class1996(new Class44("Renderer", this)));
    private final Class1612 Field9353 = ((Class1612)new Class1612(this).Method772(this.Field9352)).Method3788().Method3789();
    private final HashMap Field9354 = new HashMap();
    private boolean Field9355 = false;
    private BlockPos Field9356 = new BlockPos(-1, -1, -1);
    private int Field9357;

    public Class318() {
        super("CityESP", "CityESP", Class97.Field8342);
    }

    @Override
    public void Method45() {
        if (Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field9354.clear();
        List list = Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities.stream().filter(Class318::Method1611).filter(this::Method1610).filter(Class318::Method1609).collect(Collectors.toList());
        for (Object object : list) {
            Class1862 class1862;
            Object object22;
            List list2 = Class394.Method1951((Entity)object);
            if (list2.size() == 0) continue;
            int n = Integer.MAX_VALUE;
            for (Object object22 : list2) {
                int n2 = object22.getY();
                if (n2 >= n) continue;
                n = n2;
            }
            if (((EntityPlayer)object).posY % 1.0 > Double.longBitsToDouble(4596373779694328218L)) {
                // empty if block
            }
            int n3 = ++n;
            object22 = (list2 = list2.stream().filter(arg_0 -> Class318.Method1608(n3, arg_0)).collect(Collectors.toList())).stream().findAny();
            if (!((Optional)object22).isPresent() || (class1862 = Class1914.Method7131((BlockPos)((Optional)object22).get(), false, true)).Method6959() == Class422.Field9771 || class1862.Method6960() == Class410.Field9697) continue;
            ArrayList arrayList = new ArrayList();
            for (BlockPos blockPos : list2) {
                arrayList.addAll(this.Method1602(blockPos, Class1914.Method7133(blockPos).keySet(), (EntityPlayer)object));
            }
            if (arrayList.size() <= 0) continue;
            this.Field9354.put(object, arrayList);
        }
        if (!this.Field9345.Method365()) return;
        if (this.Field9346.Method337() == 0) return;
        if (!Keyboard.isKeyDown((int)this.Field9346.Method337())) return;
        Iterator<Object> iterator = this.Field9354.values().iterator();
        block3: while (iterator.hasNext()) {
            int n;
            BlockPos blockPos;
            Object object;
            object = (List)iterator.next();
            boolean bl = false;
            Iterator iterator2 = object.iterator();
            do {
                if (!iterator2.hasNext()) continue block3;
            } while (!(Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)(blockPos = (BlockPos)iterator2.next()).getX(), (double)blockPos.getY(), (double)blockPos.getZ()) <= (double)this.Field9348.Method335()));
            bl = true;
            if (this.Field9355 && this.Field9356 == blockPos) continue;
            if (Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() != Items.DIAMOND_PICKAXE && this.Field9347.Method365() && (n = Class9.Method132(ItemPickaxe.class, 0, 9)) != 1) {
                Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n;
            }
            if (this.Field9349.Method359().equals(Class708.Field11018.name())) {
                Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(EnumHand.MAIN_HAND);
                Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, blockPos, EnumFacing.UP));
                Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, blockPos, EnumFacing.UP));
                this.Field9355 = true;
                this.Field9356 = blockPos;
                continue;
            }
            Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(EnumHand.MAIN_HAND);
            Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.onPlayerDamageBlock(blockPos, EnumFacing.UP);
        }
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method1601(RenderWorldLastEvent renderWorldLastEvent) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.Field9354.entrySet().stream().sorted(Class318::Method1607).forEach(arg_0 -> this.Method1606(atomicBoolean, arg_0));
    }

    private List Method1602(BlockPos blockPos, Set set, EntityPlayer entityPlayer) {
        ArrayList arrayList = new ArrayList();
        HashMap<BlockPos, Class668> hashMap = new HashMap<BlockPos, Class668>();
        Iterator iterator = set.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                hashMap.forEach((arg_0, arg_1) -> this.Method1605(entityPlayer, arrayList, arg_0, arg_1));
                return arrayList;
            }
            Class668 class668 = (Class668)((Object)iterator.next());
            BlockPos blockPos2 = class668.Method2846(blockPos);
            if (Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2).getBlock() == Blocks.AIR) continue;
            hashMap.put(blockPos2, class668);
        }
    }

    private void Method1603(List list) {
        String string = this.Field9351.Method359();
        int n = -1;
        switch (string.hashCode()) {
            case -1763776967: {
                if (!string.equals("Closest")) return;
                return;
            }
            case 65921: {
                if (!string.equals("All")) return;
                return;
            }
        }
    }

    private static Double Method1604(BlockPos blockPos) {
        return blockPos.distanceSq((double)((int)Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX), (double)((int)Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY), (double)((int)Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ));
    }

    private void Method1605(EntityPlayer entityPlayer, List list, BlockPos blockPos, Class668 class668) {
        if (class668 == Class668.Field10833) {
            return;
        }
        BlockPos blockPos2 = class668.Method2849(blockPos.down(this.Field9339.Method335()), this.Field9340.Method335());
        BlockPos blockPos3 = class668.Method2847(class668.Method2850(blockPos, this.Field9340.Method335()), this.Field9341.Method335());
        List list2 = Class394.Method1947(blockPos2, blockPos3);
        IBlockState iBlockState = Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
        Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.setBlockToAir(blockPos);
        for (BlockPos blockPos4 : list2) {
            if (!Class2155.Method7771(blockPos4.down(), true, this.Field9344.Method365()) || !(Class2155.Method7759((World)Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, (double)blockPos4.getX() + Double.longBitsToDouble(4602678819172646912L), blockPos4.getY(), (double)blockPos4.getZ() + Double.longBitsToDouble((long)1800769606 ^ 0x3FE000006B559046L), (Entity)entityPlayer, false) >= (float)this.Field9342.Method335())) continue;
            if (!(Class2155.Method7759((World)Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, (double)blockPos4.getX() + Double.longBitsToDouble(4602678819172646912L), blockPos4.getY(), (double)blockPos4.getZ() + Double.longBitsToDouble((long)2067715076 ^ 0x3FE000007B3ED404L), (Entity)Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, false) <= (float)this.Field9343.Method335())) break;
            list.add(blockPos);
            break;
        }
        Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.setBlockState(blockPos, iBlockState);
    }

    private void Method1606(AtomicBoolean atomicBoolean, Map.Entry entry) {
        if (atomicBoolean.get()) {
            return;
        }
        this.Method1603((List)entry.getValue());
        if (!this.Field9350.Method359().equalsIgnoreCase(Class1704.Field15888.name())) return;
        atomicBoolean.set(true);
    }

    private static int Method1607(Map.Entry entry, Map.Entry entry2) {
        return (int)((EntityPlayer)entry.getKey()).getDistanceSq((Entity)entry2.getKey());
    }

    private static boolean Method1608(int n, BlockPos blockPos) {
        if (blockPos.getY() != n) return false;
        return true;
    }

    private static boolean Method1609(EntityPlayer entityPlayer) {
        if (Class394.Method1949((Entity)entityPlayer)) return false;
        return true;
    }

    private boolean Method1610(EntityPlayer entityPlayer) {
        if (!(entityPlayer.getDistanceSq((Entity)Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) <= this.Field9338.Method367() * this.Field9338.Method367())) return false;
        return true;
    }

    private static boolean Method1611(EntityPlayer entityPlayer) {
        if (entityPlayer == Class318.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) return false;
        return true;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 237;
            cArray2[n] = (char)(cArray[n] ^ (0x7D9B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

