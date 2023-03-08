//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.*;
import net.minecraft.block.*;
import net.minecraft.init.*;
import java.util.concurrent.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;
import net.minecraft.entity.item.*;
import net.minecraft.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.*;
import com.kisman.cc.util.*;
import net.minecraft.client.*;

@Class2012
@Class99
public class Class132 extends Class42
{
    private final Class1996 Field8454;
    private final Class44 Field8455;
    private final Class44 Field8456;
    private final Class44 Field8457;
    private final Class44 Field8458;
    private final Class44 Field8459;
    private final Class44 Field8460;
    private final Class1996 Field8461;
    private final Class44 Field8462;
    private final Class44 Field8463;
    private final Class1996 Field8464;
    private final Class44 Field8465;
    private final Class44 Field8466;
    private final Class44 Field8467;
    private final Class44 Field8468;
    private final Class44 Field8469;
    private final Class44 Field8470;
    private final Class44 Field8471;
    private final Class44 Field8472;
    private final Class44 Field8473;
    private final Class44 Field8474;
    private final Class44 Field8475;
    private final Class44 Field8476;
    private final Class44 Field8477;
    private final Class44 Field8478;
    private final Class44 Field8479;
    private final Class1996 Field8480;
    private final Class1515 Field8481;
    private final Class411 Field8482;
    private final Class61 Field8483;
    private final Class1352 Field8484;
    public static Class132 Field8485;
    private Queue Field8486;
    private final Thread Field8487;
    @Class1274
    public Entity Field8488;
    private double Field8489;
    private BlockPos Field8490;
    private String Field8491 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Block Method870() {
        return (Block)(this.Field8467.Method365() ? Blocks.WEB : ((Class613)this.Field8469.Method341()).Method2630().Method1726(new Object[0]));
    }
    
    public Class132() {
        super("FlattenRewrite", Class97.Field8338);
        this.Field8454 = this.Method24(new Class1996(new Class44("Place", this)));
        this.Field8455 = this.Method23(this.Field8454.Method7405(new Class44("PlaceMode", this, Class590.Field10504).Method355("Mode")));
        this.Field8456 = this.Method23(this.Field8454.Method7405(new Class44("PlaceRange", this, Double.longBitsToDouble(4617315517961601024L), 1.0, Double.longBitsToDouble(4621819117588971520L), false).Method355("Range")));
        this.Field8457 = this.Method23(this.Field8454.Method7405(new Class44("PlaceDelay", this, Class596.Field10536).Method355("Delay Mode")));
        this.Field8458 = this.Method23(this.Field8454.Method7405(new Class44("PlaceDelayMS", this, Double.longBitsToDouble((long)1498291176 ^ 0x40490000594E1BE8L), 0.0, Double.longBitsToDouble((long)1097488200 ^ 0x407F4000416A5748L), Class467.Field9943).Method313(this::Method896).Method355("Delay")));
        this.Field8459 = this.Method23(this.Field8454.Method7405(new Class44("PlaceRetry", this, false).Method355("Retry")));
        this.Field8460 = this.Method23(this.Field8454.Method7405(new Class44("PlaceHeightLimit", this, Double.longBitsToDouble(4643211215818981376L), 0.0, Double.longBitsToDouble(4643211215818981376L), true).Method355("Height Limit")));
        this.Field8461 = this.Method24(new Class1996(new Class44("Swap", this)));
        this.Field8462 = this.Method23(this.Field8461.Method7405(new Class44("SwapMode", this, (Enum)Class1062.Field12686).Method355("Mode")));
        this.Field8463 = this.Method23(this.Field8461.Method7405(new Class44("SwapWhen", this, Class1618.Field15570).Method355("When")));
        this.Field8464 = this.Method24(this.Field8461.Method7406(new Class1996(new Class44("Sync Item", this))));
        this.Field8465 = this.Method23(this.Field8464.Method7405(new Class44("SyncItem", this, false).Method355("Sync")));
        this.Field8466 = this.Method23(this.Field8464.Method7405(new Class44("SyncItemWhen", this, Class77.Field8250).Method313(this.Field8465::Method365).Method355("When")));
        this.Field8467 = this.Method23(this.Field8454.Method7405(new Class44("Web", this, false)));
        this.Field8468 = this.Method23(this.Field8454.Method7405(new Class44("WebOffset", this, false).Method313(this.Field8467::Method365)));
        this.Field8469 = this.Method23(new Class44("Block", this, Class613.Field10609));
        this.Field8470 = this.Method23(new Class44("KeepY", this, true));
        this.Field8471 = this.Method23(new Class44("CheckDown", this, Double.longBitsToDouble(4611686018427387904L), 1.0, Double.longBitsToDouble((long)2045362639 ^ 0x4020000079E9C1CFL), true));
        this.Field8472 = this.Method23(new Class44("AlwaysCheckDown", this, false));
        this.Field8473 = this.Method23(new Class44("EnemyRange", this, Double.longBitsToDouble((long)853324494 ^ 0x4020000032DCB2CEL), 1.0, Double.longBitsToDouble(4624633867356078080L), false));
        this.Field8474 = this.Method23(new Class44("SwapEnemy", this, false));
        this.Field8475 = this.Method23(new Class44("PredictCycles", this, 0.0, 0.0, Double.longBitsToDouble(4621819117588971520L), true).Method313(this::Method895));
        this.Field8476 = this.Method23(new Class44("PredictTicks", this, Double.longBitsToDouble(4611686018427387904L), 0.0, Double.longBitsToDouble(4626322717216342016L), true).Method313(this::Method894));
        this.Field8477 = this.Method23(new Class44("Rotate", this, false));
        this.Field8478 = this.Method23(new Class44("Packet", this, false));
        this.Field8479 = this.Method23(new Class44("ProcessPackets", this, false));
        this.Field8480 = this.Method24(new Class1996(new Class44("Render", this)));
        this.Field8481 = new Class1515(this).Method6046(this.Field8480).Method6042().Method6043();
        this.Field8482 = this.Method54();
        this.Field8483 = new Class61(this.Field8473::Method367, this.Field8482.Method2000()::Method369, this.Field8482.Method2001()::Method365);
        this.Field8484 = new Class1352();
        this.Field8486 = new ConcurrentLinkedQueue();
        this.Field8488 = null;
        this.Field8490 = null;
        Class132.Field8485 = this;
        (this.Field8487 = new Thread(this::Method893)).start();
    }
    
    @Override
    public void Method45() {
        if (Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field8488 == null || this.Field8474.Method365()) {
            this.Field8488 = (Entity)this.Field8483.Method500(this.Field8473.Method368());
            if (this.Field8488 == null) {
                return;
            }
            this.Field8489 = this.Field8488.posY;
            if (!this.Method872(new Vec3d(this.Field8488.posX, this.Field8470.Method365() ? this.Field8489 : this.Field8488.posY, this.Field8488.posZ))) {
                return;
            }
        }
        Vec3d vec3d = new Vec3d(this.Field8488.posX, this.Field8470.Method365() ? (this.Field8489 - 1.0) : (this.Field8488.posY - 1.0), this.Field8488.posZ);
        if (this.Field8467.Method365() && this.Field8468.Method365()) {
            vec3d = new Vec3d(vec3d.x, vec3d.y + 1.0, vec3d.z);
        }
        if (this.Field8472.Method365()) {}
        ((Class590)this.Field8455.Method341()).Method2556().Method1726(vec3d, this.Field8488);
        final int method127 = Class9.Method127(this.Method870());
        final int currentItem = Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        this.Method875(method127, false, Class1618.Field15571);
        if (this.Field8457.Method341() == Class596.Field10536) {
            final ArrayList<BlockPos> list = new ArrayList<BlockPos>(this.Field8486.size());
            for (final BlockPos blockPos : this.Field8486) {
                if (blockPos.getY() > this.Field8460.Method335()) {
                    continue;
                }
                if (this.Method873(blockPos)) {
                    if (this.Field8459.Method365()) {
                        continue;
                    }
                    list.add(blockPos);
                }
                else {
                    this.Method874(blockPos, currentItem, method127);
                    list.add(blockPos);
                }
            }
            this.Field8486.removeAll(list);
        }
        else if (this.Field8486.size() > 0) {
            final BlockPos blockPos2 = this.Field8486.peek();
            if (blockPos2.getY() <= this.Field8460.Method335()) {
                if (!this.Method873(blockPos2) || this.Field8459.Method365()) {
                    this.Method874(blockPos2, currentItem, method127);
                }
                this.Field8486.poll();
            }
        }
        this.Method875(currentItem, true, Class1618.Field15571);
        if (this.Field8479.Method365()) {
            if (Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.getNetworkManager().isChannelOpen()) {
                Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.getNetworkManager().processReceivedPackets();
            }
            else {
                Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.getNetworkManager().handleDisconnection();
            }
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method871(final RenderWorldLastEvent renderWorldLastEvent) {
        if (this.Field8481.Method3790()) {
            this.Field8484.Method2990(this.Field8481, this.Field8490, null);
        }
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
    
    private boolean Method872(final Vec3d vec3d) {
        for (int i = 0; i < this.Field8471.Method335(); ++i) {
            if (Class1036.Method4213(new BlockPos(vec3d.x, vec3d.y - i - 1.0, vec3d.z)).isEmpty()) {}
        }
        return false;
    }
    
    private boolean Method873(final BlockPos blockPos) {
        return !Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)Entity.class, new AxisAlignedBB(blockPos)).isEmpty();
    }
    
    private void Method874(final BlockPos field8490, final int n, final int n2) {
        this.Field8490 = field8490;
        if (Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(field8490.getX() + Double.longBitsToDouble(4602678819172646912L), field8490.getY() + Double.longBitsToDouble(4602678819172646912L), field8490.getZ() + Double.longBitsToDouble(4602678819172646912L)) > this.Field8456.Method367()) {
            return;
        }
        this.Method875(n2, false, Class1618.Field15570);
        Class1036.Method4208(field8490, EnumHand.MAIN_HAND, this.Field8477.Method365(), this.Field8478.Method365());
        this.Method875(n, true, Class1618.Field15570);
    }
    
    private void Method875(final int i, final boolean b, final Class1618 class1618) {
        if (class1618 != this.Field8463.Method341()) {
            return;
        }
        final Class77 class1619 = (Class77)this.Field8466.Method341();
        if (class1619 == Class77.Field8251 || class1619 == Class77.Field8249) {
            Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.syncCurrentPlayItem();
        }
        ((Class1062)this.Field8462.Method341()).Method4316().Method1726(i, b);
        if (class1619 == Class77.Field8251 || class1619 == Class77.Field8250) {
            Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.syncCurrentPlayItem();
        }
    }
    
    private static boolean Method876(final BlockPos blockPos) {
        return Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos);
    }
    
    private static List Method877(final BlockPos blockPos) {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        final BlockPos north = blockPos.north();
        final BlockPos east = blockPos.east();
        final BlockPos south = blockPos.south();
        final BlockPos west = blockPos.west();
        if (Method876(north)) {
            list.add(north);
        }
        if (Method876(east)) {
            list.add(east);
        }
        if (Method876(south)) {
            list.add(south);
        }
        if (Method876(west)) {
            list.add(west);
        }
        return list;
    }
    
    private static List Method878(final BlockPos blockPos) {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        final BlockPos north = blockPos.north();
        final BlockPos east = blockPos.east();
        final BlockPos south = blockPos.south();
        final BlockPos west = blockPos.west();
        final BlockPos west2 = north.west();
        final BlockPos east2 = north.east();
        final BlockPos west3 = south.west();
        final BlockPos east3 = south.east();
        if (Method876(north)) {
            list.add(north);
        }
        if (Method876(east)) {
            list.add(east);
        }
        if (Method876(south)) {
            list.add(south);
        }
        if (Method876(west)) {
            list.add(west);
        }
        if (Method876(west2)) {
            list.add(west2);
        }
        if (Method876(east2)) {
            list.add(east2);
        }
        if (Method876(west3)) {
            list.add(west3);
        }
        if (Method876(east3)) {
            list.add(east3);
        }
        return list;
    }
    
    private static void Method879(final BlockPos blockPos) {
        if (!Method876(blockPos) || Class132.Field8485.Field8486.contains(blockPos)) {
            return;
        }
        Class132.Field8485.Field8486.add(blockPos);
    }
    
    private static void Method880(final List list) {
        for (final BlockPos blockPos : list) {
            if (!Class132.Field8485.Field8486.contains(blockPos)) {
                Class132.Field8485.Field8486.add(blockPos);
            }
        }
    }
    
    private static boolean Method881(final BlockPos blockPos) {
        for (final Entity entity : Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)Entity.class, new AxisAlignedBB(blockPos))) {
            if (!(entity instanceof EntityItem)) {
                if (entity instanceof EntityXPOrb) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
    
    private static BlockPos Method882(final Entity entity, final BlockPos blockPos) {
        return Stream.of(EnumFacing.HORIZONTALS).map((Function<? super EnumFacing, ? extends BlockPos>)blockPos::offset).filter(Class132::Method892).filter(Class132::Method891).min(Comparator.comparingDouble(Class132::Method890)).orElse(null);
    }
    
    private static BlockPos Method883(final Entity entity, final BlockPos blockPos) {
        return Stream.of(EnumFacing.HORIZONTALS).map((Function<? super EnumFacing, ? extends BlockPos>)blockPos::offset).filter(Class132::Method889).filter(Class132::Method888).filter(Class132::Method887).filter(Class132::Method886).filter(Class132::Method885).min(Comparator.comparingDouble(Class132::Method884)).orElse(null);
    }
    
    private static double Method884(final Entity entity, final BlockPos blockPos) {
        return entity.getDistance(blockPos.getX() + Double.longBitsToDouble(4602678819172646912L), (double)(blockPos.getY() + 1), blockPos.getZ() + Double.longBitsToDouble((long)1656751848 ^ 0x3FE0000062C006E8L));
    }
    
    private static boolean Method885(final BlockPos blockPos) {
        return Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.up(2)).getBlock() == Blocks.AIR;
    }
    
    private static boolean Method886(final BlockPos blockPos) {
        return Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.up()).getBlock() == Blocks.AIR;
    }
    
    private static boolean Method887(final Entity entity, final BlockPos blockPos) {
        return !new AxisAlignedBB(blockPos).intersects(entity.getEntityBoundingBox());
    }
    
    private static boolean Method888(final BlockPos blockPos) {
        return !Method881(blockPos);
    }
    
    private static boolean Method889(final BlockPos blockPos) {
        return !Class1036.Method4213(blockPos).isEmpty();
    }
    
    private static double Method890(final Entity entity, final BlockPos blockPos) {
        return entity.getDistance(blockPos.getX() + Double.longBitsToDouble((long)1115619271 ^ 0x3FE00000427EFFC7L), (double)(blockPos.getY() + 1), blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L));
    }
    
    private static boolean Method891(final BlockPos blockPos) {
        return !Method881(blockPos);
    }
    
    private static boolean Method892(final BlockPos blockPos) {
        return !Class1036.Method4213(blockPos).isEmpty();
    }
    
    private void Method893() {
        final Class650 class650 = new Class650();
        boolean b = this.Method35();
        while (b) {
            if (this.Field8457.Method341() != Class596.Field10538) {
                continue;
            }
            if (!class650.Method2797((long)this.Field8458.Method335())) {
                b = this.Method35();
            }
            else {
                final int method127 = Class9.Method127(this.Method870());
                if (method127 == -1) {
                    continue;
                }
                final int currentItem = Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
                if (this.Field8486.size() <= 0) {
                    b = this.Method35();
                }
                else {
                    final BlockPos blockPos = this.Field8486.peek();
                    if (blockPos.getY() <= this.Field8460.Method335()) {
                        if (!this.Method873(blockPos) && this.Field8459.Method365()) {
                            this.Method874(blockPos, currentItem, method127);
                        }
                        this.Field8486.poll();
                    }
                    b = this.Method35();
                }
            }
        }
    }
    
    private Boolean Method894() {
        return ((Class590)this.Field8455.Method341()).Method2555();
    }
    
    private Boolean Method895() {
        return ((Class590)this.Field8455.Method341()).Method2555();
    }
    
    private Boolean Method896() {
        return this.Field8457.Method341() == Class596.Field10538;
    }
    
    static BlockPos Method897(final Entity entity, final BlockPos blockPos) {
        return Method882(entity, blockPos);
    }
    
    static void Method898(final BlockPos blockPos) {
        Method879(blockPos);
    }
    
    static BlockPos Method899(final Entity entity, final BlockPos blockPos) {
        return Method883(entity, blockPos);
    }
    
    static Class44 Method900(final Class132 class132) {
        return class132.Field8475;
    }
    
    static Class44 Method901(final Class132 class132) {
        return class132.Field8476;
    }
    
    static Class44 Method902(final Class132 class132) {
        return class132.Field8470;
    }
    
    static void Method903(final List list) {
        Method880(list);
    }
    
    static List Method904(final BlockPos blockPos) {
        return Method878(blockPos);
    }
    
    static List Method905(final BlockPos blockPos) {
        return Method877(blockPos);
    }
    
    static Minecraft Method906() {
        return Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Minecraft Method907() {
        return Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Minecraft Method908() {
        return Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Minecraft Method909() {
        return Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Minecraft Method910() {
        return Class132.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x42C ^ 0x1F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
