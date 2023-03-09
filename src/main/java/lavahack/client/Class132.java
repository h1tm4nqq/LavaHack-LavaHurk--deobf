//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.item.EntityXPOrb
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.IBlockAccess
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Stream;
import lavahack.client.Class1036;
import lavahack.client.Class1062;
import lavahack.client.Class1274;
import lavahack.client.Class1352;
import lavahack.client.Class1515;
import lavahack.client.Class1618;
import lavahack.client.Class1996;
import lavahack.client.Class2012;
import lavahack.client.Class411;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class590;
import lavahack.client.Class596;
import lavahack.client.Class61;
import lavahack.client.Class613;
import lavahack.client.Class77;
import lavahack.client.Class9;
import lavahack.client.Class97;
import lavahack.client.Class99;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Class2012
@Class99
public class Class132
extends Class42 {
    private final Class1996 Field8454 = this.Method24(new Class1996(new Class44("Place", this)));
    private final Class44 Field8455 = this.Method23(this.Field8454.Method7405(new Class44("PlaceMode", (Class42)this, Class590.Field10504).Method355("Mode")));
    private final Class44 Field8456 = this.Method23(this.Field8454.Method7405(new Class44("PlaceRange", (Class42)this, Double.longBitsToDouble(0x4014000000000000L), 1.0, Double.longBitsToDouble(0x4024000000000000L), false).Method355("Range")));
    private final Class44 Field8457 = this.Method23(this.Field8454.Method7405(new Class44("PlaceDelay", (Class42)this, Class596.Field10536).Method355("Delay Mode")));
    private final Class44 Field8458 = this.Method23(this.Field8454.Method7405(new Class44("PlaceDelayMS", (Class42)this, Double.longBitsToDouble((long)1498291176 ^ 0x40490000594E1BE8L), 0.0, Double.longBitsToDouble((long)1097488200 ^ 0x407F4000416A5748L), Class467.Field9943).Method313(this::Method896).Method355("Delay")));
    private final Class44 Field8459 = this.Method23(this.Field8454.Method7405(new Class44("PlaceRetry", (Class42)this, false).Method355("Retry")));
    private final Class44 Field8460 = this.Method23(this.Field8454.Method7405(new Class44("PlaceHeightLimit", (Class42)this, Double.longBitsToDouble(0x4070000000000000L), 0.0, Double.longBitsToDouble(0x4070000000000000L), true).Method355("Height Limit")));
    private final Class1996 Field8461 = this.Method24(new Class1996(new Class44("Swap", this)));
    private final Class44 Field8462 = this.Method23(this.Field8461.Method7405(new Class44("SwapMode", (Class42)this, Class1062.Field12686).Method355("Mode")));
    private final Class44 Field8463 = this.Method23(this.Field8461.Method7405(new Class44("SwapWhen", (Class42)this, Class1618.Field15570).Method355("When")));
    private final Class1996 Field8464 = this.Method24(this.Field8461.Method7406(new Class1996(new Class44("Sync Item", this))));
    private final Class44 Field8465 = this.Method23(this.Field8464.Method7405(new Class44("SyncItem", (Class42)this, false).Method355("Sync")));
    private final Class44 Field8466 = this.Method23(this.Field8464.Method7405(new Class44("SyncItemWhen", (Class42)this, Class77.Field8250).Method313(this.Field8465::Method365).Method355("When")));
    private final Class44 Field8467 = this.Method23(this.Field8454.Method7405(new Class44("Web", (Class42)this, false)));
    private final Class44 Field8468 = this.Method23(this.Field8454.Method7405(new Class44("WebOffset", (Class42)this, false).Method313(this.Field8467::Method365)));
    private final Class44 Field8469 = this.Method23(new Class44("Block", (Class42)this, Class613.Field10609));
    private final Class44 Field8470 = this.Method23(new Class44("KeepY", (Class42)this, true));
    private final Class44 Field8471 = this.Method23(new Class44("CheckDown", (Class42)this, Double.longBitsToDouble(0x4000000000000000L), 1.0, Double.longBitsToDouble((long)2045362639 ^ 0x4020000079E9C1CFL), true));
    private final Class44 Field8472 = this.Method23(new Class44("AlwaysCheckDown", (Class42)this, false));
    private final Class44 Field8473 = this.Method23(new Class44("EnemyRange", (Class42)this, Double.longBitsToDouble((long)853324494 ^ 0x4020000032DCB2CEL), 1.0, Double.longBitsToDouble(4624633867356078080L), false));
    private final Class44 Field8474 = this.Method23(new Class44("SwapEnemy", (Class42)this, false));
    private final Class44 Field8475 = this.Method23(new Class44("PredictCycles", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(0x4024000000000000L), true).Method313(this::Method895));
    private final Class44 Field8476 = this.Method23(new Class44("PredictTicks", (Class42)this, Double.longBitsToDouble(0x4000000000000000L), 0.0, Double.longBitsToDouble(0x4034000000000000L), true).Method313(this::Method894));
    private final Class44 Field8477 = this.Method23(new Class44("Rotate", (Class42)this, false));
    private final Class44 Field8478 = this.Method23(new Class44("Packet", (Class42)this, false));
    private final Class44 Field8479 = this.Method23(new Class44("ProcessPackets", (Class42)this, false));
    private final Class1996 Field8480 = this.Method24(new Class1996(new Class44("Render", this)));
    private final Class1515 Field8481 = new Class1515(this).Method6046(this.Field8480).Method6042().Method6043();
    private final Class411 Field8482 = this.Method54();
    private final Class61 Field8483 = new Class61(this.Field8473::Method367, this.Field8482.Method2000()::Method369, this.Field8482.Method2001()::Method365);
    private final Class1352 Field8484 = new Class1352();
    public static Class132 Field8485;
    private Queue Field8486 = new ConcurrentLinkedQueue();
    private final Thread Field8487;
    @Class1274
    public Entity Field8488 = null;
    private double Field8489;
    private BlockPos Field8490 = null;
    private String Field8491 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Block Method870() {
        Block block;
        if (this.Field8467.Method365()) {
            block = Blocks.WEB;
            return block;
        }
        block = (Block)((Class613)this.Field8469.Method341()).Method2630().Method1726(new Object[0]);
        return block;
    }

    public Class132() {
        super("FlattenRewrite", Class97.Field8338);
        Field8485 = this;
        this.Field8487 = new Thread(this::Method893);
        this.Field8487.start();
    }

    @Override
    public void Method45() {
        if (Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        boolean bl = false;
        if (this.Field8488 == null || this.Field8474.Method365()) {
            this.Field8488 = this.Field8483.Method500(this.Field8473.Method368());
            if (this.Field8488 == null) {
                return;
            }
            this.Field8489 = this.Field8488.posY;
            if (!this.Method872(new Vec3d(this.Field8488.posX, this.Field8470.Method365() ? this.Field8489 : this.Field8488.posY, this.Field8488.posZ))) {
                return;
            }
            bl = true;
        }
        Vec3d vec3d = new Vec3d(this.Field8488.posX, this.Field8470.Method365() ? this.Field8489 - 1.0 : this.Field8488.posY - 1.0, this.Field8488.posZ);
        if (this.Field8467.Method365() && this.Field8468.Method365()) {
            vec3d = new Vec3d(vec3d.x, vec3d.y + 1.0, vec3d.z);
        }
        if (this.Field8472.Method365()) {
        }
        ((Class590)this.Field8455.Method341()).Method2556().Method1726(vec3d, this.Field8488);
        int n = Class9.Method127(this.Method870());
        int n2 = Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        this.Method875(n, false, Class1618.Field15571);
        if (this.Field8457.Method341() != Class596.Field10536) {
            BlockPos blockPos;
            if (this.Field8486.size() > 0 && (blockPos = (BlockPos)this.Field8486.peek()).getY() <= this.Field8460.Method335()) {
                if (!this.Method873(blockPos) || this.Field8459.Method365()) {
                    this.Method874(blockPos, n2, n);
                }
                this.Field8486.poll();
            }
        } else {
            ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>(this.Field8486.size());
            for (BlockPos blockPos : this.Field8486) {
                if (blockPos.getY() > this.Field8460.Method335()) continue;
                if (this.Method873(blockPos)) {
                    if (this.Field8459.Method365()) continue;
                    arrayList.add(blockPos);
                    continue;
                }
                this.Method874(blockPos, n2, n);
                arrayList.add(blockPos);
            }
            this.Field8486.removeAll(arrayList);
        }
        this.Method875(n2, true, Class1618.Field15571);
        if (!this.Field8479.Method365()) return;
        if (Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.getNetworkManager().isChannelOpen()) {
            Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.getNetworkManager().processReceivedPackets();
            return;
        }
        Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.getNetworkManager().handleDisconnection();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method871(RenderWorldLastEvent renderWorldLastEvent) {
        if (!this.Field8481.Method3790()) return;
        this.Field8484.Method2990(this.Field8481, this.Field8490, null);
    }

    @Override
    public void Method38() {
        super.Method38();
        this.Field8486 = new ConcurrentLinkedQueue();
        this.Field8490 = null;
        this.Field8488 = null;
        this.Field8489 = 0.0;
        this.Field8483.Method498();
        this.Field8482.Method2004();
        this.Field8484.Method2988();
    }

    private boolean Method872(Vec3d vec3d) {
        int n = -1;
        int n2 = 0;
        while (n2 < this.Field8471.Method335()) {
            BlockPos blockPos = new BlockPos(vec3d.x, vec3d.y - (double)n2 - 1.0, vec3d.z);
            if (!Class1036.Method4213(blockPos).isEmpty()) {
                n = n2 + 1;
            }
            ++n2;
        }
        return false;
    }

    private boolean Method873(BlockPos blockPos) {
        if (Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(blockPos)).isEmpty()) return false;
        return true;
    }

    private void Method874(BlockPos blockPos, int n, int n2) {
        this.Field8490 = blockPos;
        if (Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)blockPos.getX() + Double.longBitsToDouble(4602678819172646912L), (double)blockPos.getY() + Double.longBitsToDouble(4602678819172646912L), (double)blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L)) > this.Field8456.Method367()) {
            return;
        }
        this.Method875(n2, false, Class1618.Field15570);
        Class1036.Method4208(blockPos, EnumHand.MAIN_HAND, this.Field8477.Method365(), this.Field8478.Method365());
        this.Method875(n, true, Class1618.Field15570);
    }

    private void Method875(int n, boolean bl, Class1618 class1618) {
        if (class1618 != this.Field8463.Method341()) {
            return;
        }
        Class77 class77 = (Class77)this.Field8466.Method341();
        if (class77 == Class77.Field8251 || class77 == Class77.Field8249) {
            Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.syncCurrentPlayItem();
        }
        ((Class1062)this.Field8462.Method341()).Method4316().Method1726(n, bl);
        if (class77 != Class77.Field8251) {
            if (class77 != Class77.Field8250) return;
        }
        Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.syncCurrentPlayItem();
    }

    private static boolean Method876(BlockPos blockPos) {
        return Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos);
    }

    private static List Method877(BlockPos blockPos) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        BlockPos blockPos2 = blockPos.north();
        BlockPos blockPos3 = blockPos.east();
        BlockPos blockPos4 = blockPos.south();
        BlockPos blockPos5 = blockPos.west();
        if (Class132.Method876(blockPos2)) {
            arrayList.add(blockPos2);
        }
        if (Class132.Method876(blockPos3)) {
            arrayList.add(blockPos3);
        }
        if (Class132.Method876(blockPos4)) {
            arrayList.add(blockPos4);
        }
        if (!Class132.Method876(blockPos5)) return arrayList;
        arrayList.add(blockPos5);
        return arrayList;
    }

    private static List Method878(BlockPos blockPos) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        BlockPos blockPos2 = blockPos.north();
        BlockPos blockPos3 = blockPos.east();
        BlockPos blockPos4 = blockPos.south();
        BlockPos blockPos5 = blockPos.west();
        BlockPos blockPos6 = blockPos2.west();
        BlockPos blockPos7 = blockPos2.east();
        BlockPos blockPos8 = blockPos4.west();
        BlockPos blockPos9 = blockPos4.east();
        if (Class132.Method876(blockPos2)) {
            arrayList.add(blockPos2);
        }
        if (Class132.Method876(blockPos3)) {
            arrayList.add(blockPos3);
        }
        if (Class132.Method876(blockPos4)) {
            arrayList.add(blockPos4);
        }
        if (Class132.Method876(blockPos5)) {
            arrayList.add(blockPos5);
        }
        if (Class132.Method876(blockPos6)) {
            arrayList.add(blockPos6);
        }
        if (Class132.Method876(blockPos7)) {
            arrayList.add(blockPos7);
        }
        if (Class132.Method876(blockPos8)) {
            arrayList.add(blockPos8);
        }
        if (!Class132.Method876(blockPos9)) return arrayList;
        arrayList.add(blockPos9);
        return arrayList;
    }

    private static void Method879(BlockPos blockPos) {
        if (!Class132.Method876(blockPos)) return;
        if (Class132.Field8485.Field8486.contains(blockPos)) {
            return;
        }
        Class132.Field8485.Field8486.add(blockPos);
    }

    private static void Method880(List list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            if (Class132.Field8485.Field8486.contains(blockPos)) continue;
            Class132.Field8485.Field8486.add(blockPos);
        }
    }

    private static boolean Method881(BlockPos blockPos) {
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
        Iterator iterator = Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, axisAlignedBB).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity instanceof EntityItem) continue;
            if (!(entity instanceof EntityXPOrb)) return true;
        }
        return false;
    }

    private static BlockPos Method882(Entity entity, BlockPos blockPos) {
        return Stream.of(EnumFacing.HORIZONTALS).map(arg_0 -> ((BlockPos)blockPos).offset(arg_0)).filter(Class132::Method892).filter(Class132::Method891).min(Comparator.comparingDouble(arg_0 -> Class132.Method890(entity, arg_0))).orElse(null);
    }

    private static BlockPos Method883(Entity entity, BlockPos blockPos) {
        return Stream.of(EnumFacing.HORIZONTALS).map(arg_0 -> ((BlockPos)blockPos).offset(arg_0)).filter(Class132::Method889).filter(Class132::Method888).filter(arg_0 -> Class132.Method887(entity, arg_0)).filter(Class132::Method886).filter(Class132::Method885).min(Comparator.comparingDouble(arg_0 -> Class132.Method884(entity, arg_0))).orElse(null);
    }

    private static double Method884(Entity entity, BlockPos blockPos) {
        return entity.getDistance((double)blockPos.getX() + Double.longBitsToDouble(4602678819172646912L), (double)(blockPos.getY() + 1), (double)blockPos.getZ() + Double.longBitsToDouble((long)1656751848 ^ 0x3FE0000062C006E8L));
    }

    private static boolean Method885(BlockPos blockPos) {
        if (Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.up(2)).getBlock() != Blocks.AIR) return false;
        return true;
    }

    private static boolean Method886(BlockPos blockPos) {
        if (Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.up()).getBlock() != Blocks.AIR) return false;
        return true;
    }

    private static boolean Method887(Entity entity, BlockPos blockPos) {
        if (new AxisAlignedBB(blockPos).intersects(entity.getEntityBoundingBox())) return false;
        return true;
    }

    private static boolean Method888(BlockPos blockPos) {
        if (Class132.Method881(blockPos)) return false;
        return true;
    }

    private static boolean Method889(BlockPos blockPos) {
        if (Class1036.Method4213(blockPos).isEmpty()) return false;
        return true;
    }

    private static double Method890(Entity entity, BlockPos blockPos) {
        return entity.getDistance((double)blockPos.getX() + Double.longBitsToDouble((long)1115619271 ^ 0x3FE00000427EFFC7L), (double)(blockPos.getY() + 1), (double)blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L));
    }

    private static boolean Method891(BlockPos blockPos) {
        if (Class132.Method881(blockPos)) return false;
        return true;
    }

    private static boolean Method892(BlockPos blockPos) {
        if (Class1036.Method4213(blockPos).isEmpty()) return false;
        return true;
    }

    private void Method893() {
        Class650 class650 = new Class650();
        boolean bl = this.Method35();
        while (bl) {
            if (this.Field8457.Method341() != Class596.Field10538) continue;
            if (!class650.Method2797(this.Field8458.Method335())) {
                bl = this.Method35();
                continue;
            }
            int n = Class9.Method127(this.Method870());
            if (n == -1) continue;
            int n2 = Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
            if (this.Field8486.size() <= 0) {
                bl = this.Method35();
                continue;
            }
            BlockPos blockPos = (BlockPos)this.Field8486.peek();
            if (blockPos.getY() <= this.Field8460.Method335()) {
                if (!this.Method873(blockPos) && this.Field8459.Method365()) {
                    this.Method874(blockPos, n2, n);
                }
                this.Field8486.poll();
            }
            bl = this.Method35();
        }
    }

    private Boolean Method894() {
        return ((Class590)this.Field8455.Method341()).Method2555();
    }

    private Boolean Method895() {
        return ((Class590)this.Field8455.Method341()).Method2555();
    }

    private Boolean Method896() {
        boolean bl;
        if (this.Field8457.Method341() == Class596.Field10538) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    static BlockPos Method897(Entity entity, BlockPos blockPos) {
        return Class132.Method882(entity, blockPos);
    }

    static void Method898(BlockPos blockPos) {
        Class132.Method879(blockPos);
    }

    static BlockPos Method899(Entity entity, BlockPos blockPos) {
        return Class132.Method883(entity, blockPos);
    }

    static Class44 Method900(Class132 class132) {
        return class132.Field8475;
    }

    static Class44 Method901(Class132 class132) {
        return class132.Field8476;
    }

    static Class44 Method902(Class132 class132) {
        return class132.Field8470;
    }

    static void Method903(List list) {
        Class132.Method880(list);
    }

    static List Method904(BlockPos blockPos) {
        return Class132.Method878(blockPos);
    }

    static List Method905(BlockPos blockPos) {
        return Class132.Method877(blockPos);
    }

    static Minecraft Method906() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method907() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method908() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method909() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method910() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 31;
            cArray2[n] = (char)(cArray[n] ^ (0x42C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

