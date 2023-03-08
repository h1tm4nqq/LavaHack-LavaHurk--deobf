//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.util.math.*;
import kotlin.jvm.internal.*;
import com.kisman.cc.util.*;
import net.minecraft.item.*;
import org.jetbrains.annotations.*;
import net.minecraft.init.*;
import net.minecraft.network.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.block.state.*;
import net.minecraft.client.network.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.util.function.*;
import net.minecraftforge.common.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\b\u0010M\u001a\u00020\u0004H\u0002J\b\u0010N\u001a\u00020\u0004H\u0002J \u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u001c2\u0006\u0010R\u001a\u00020S2\u0006\u0010<\u001a\u00020=H\u0002J\u0018\u0010T\u001a\u00020\u00042\u0006\u0010U\u001a\u00020\u001c2\b\u0010V\u001a\u0004\u0018\u00010WJ\u0010\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[H\u0007J\u0006\u0010\\\u001a\u00020YR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004?\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0010X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e?\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u0010X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014R\u001a\u0010 \u001a\u00020\u0010X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\rX\u0082\u0004?\u0006\u0002\n\u0000R\u001c\u0010%\u001a\u0004\u0018\u00010\u001cX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010\u001cX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\u001a\u0010-\u001a\u00020\u0010X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u0014R\u001a\u00100\u001a\u00020\u0010X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0012\"\u0004\b2\u0010\u0014R\u001a\u00103\u001a\u00020\u0004X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001a\u00106\u001a\u000207X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020=X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010B\u001a\u00020\u0004X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001a\u0010E\u001a\u00020\u0004X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR\u001a\u0010H\u001a\u00020\u0004X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u000e\u0010K\u001a\u00020LX\u0082\u000e?\u0006\u0002\n\u0000?\u0006]" }, d2 = { "Lcom/kisman/cc/util/providers/PacketMineProvider;", "Lme/zero/alpine/listener/Listenable;", "()V", "autoSwitch", "", "getAutoSwitch", "()Z", "setAutoSwitch", "(Z)V", "checked", "getChecked", "setChecked", "damageBlock", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/EventDamageBlock;", "delay", "", "getDelay", "()I", "setDelay", "(I)V", "instant", "getInstant", "setInstant", "instantAttempts", "getInstantAttempts", "setInstantAttempts", "lastPosToMine", "Lnet/minecraft/util/math/BlockPos;", "oldSlot", "getOldSlot", "setOldSlot", "packetSpam", "getPacketSpam", "setPacketSpam", "playerMove", "Lcom/kisman/cc/event/events/EventPlayerMove;", "posToMine", "getPosToMine", "()Lnet/minecraft/util/math/BlockPos;", "setPosToMine", "(Lnet/minecraft/util/math/BlockPos;)V", "position", "getPosition", "setPosition", "range", "getRange", "setRange", "rebreakCount", "getRebreakCount", "setRebreakCount", "silent", "getSilent", "setSilent", "speed", "", "getSpeed", "()D", "setSpeed", "(D)V", "start", "", "getStart", "()J", "setStart", "(J)V", "strict", "getStrict", "setStrict", "strictCheck", "getStrictCheck", "setStrictCheck", "swap", "getSwap", "setSwap", "swapper", "Lcom/kisman/cc/util/providers/DefaultSwapper;", "active", "blockProgressCheck", "getBlockProgress", "", "blockPos", "stack", "Lnet/minecraft/item/ItemStack;", "handleBlockClick", "pos", "facing", "Lnet/minecraft/util/EnumFacing;", "onClientTick", "", "event", "Lnet/minecraftforge/fml/common/gameevent/TickEvent$ClientTickEvent;", "reset", "kisman.cc" })
public final class Class256 implements Class1320
{
    @Nullable
    private static BlockPos Field9131;
    @Nullable
    private static BlockPos Field9132;
    private static BlockPos Field9133;
    private static Class117 Field9134;
    private static boolean Field9135;
    private static boolean Field9136;
    private static boolean Field9137;
    private static double Field9138;
    private static int Field9139;
    private static boolean Field9140;
    private static int Field9141;
    private static int Field9142;
    private static boolean Field9143;
    private static boolean Field9144;
    private static boolean Field9145;
    private static int Field9146;
    private static long Field9147;
    private static int Field9148;
    private static int Field9149;
    private static final Class618 Field9150;
    private static final Class618 Field9151;
    public static final Class256 Field9152;
    private String Field9153 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Nullable
    @Nullable
    public final BlockPos Method1369() {
        return Class256.Field9131;
    }
    
    public final void Method1370(@Nullable @Nullable final BlockPos field9131) {
        Class256.Field9131 = field9131;
    }
    
    @Nullable
    @Nullable
    public final BlockPos Method1371() {
        return Class256.Field9132;
    }
    
    public final void Method1372(@Nullable @Nullable final BlockPos field9132) {
        Class256.Field9132 = field9132;
    }
    
    public final boolean Method1373() {
        return Class256.Field9135;
    }
    
    public final void Method1374(final boolean field9135) {
        Class256.Field9135 = field9135;
    }
    
    public final boolean Method1375() {
        return Class256.Field9136;
    }
    
    public final void Method1376(final boolean field9136) {
        Class256.Field9136 = field9136;
    }
    
    public final boolean Method1377() {
        return Class256.Field9137;
    }
    
    public final void Method1378(final boolean field9137) {
        Class256.Field9137 = field9137;
    }
    
    public final double Method1379() {
        return Class256.Field9138;
    }
    
    public final void Method1380(final double field9138) {
        Class256.Field9138 = field9138;
    }
    
    public final int Method1381() {
        return Class256.Field9139;
    }
    
    public final void Method1382(final int field9139) {
        Class256.Field9139 = field9139;
    }
    
    public final boolean Method1383() {
        return Class256.Field9140;
    }
    
    public final void Method1384(final boolean field9140) {
        Class256.Field9140 = field9140;
    }
    
    public final int Method1385() {
        return Class256.Field9141;
    }
    
    public final void Method1386(final int field9141) {
        Class256.Field9141 = field9141;
    }
    
    public final int Method1387() {
        return Class256.Field9142;
    }
    
    public final void Method1388(final int field9142) {
        Class256.Field9142 = field9142;
    }
    
    public final boolean Method1389() {
        return Class256.Field9143;
    }
    
    public final void Method1390(final boolean field9143) {
        Class256.Field9143 = field9143;
    }
    
    public final boolean Method1391() {
        return Class256.Field9144;
    }
    
    public final void Method1392(final boolean field9144) {
        Class256.Field9144 = field9144;
    }
    
    public final boolean Method1393() {
        return Class256.Field9145;
    }
    
    public final void Method1394(final boolean field9145) {
        Class256.Field9145 = field9145;
    }
    
    public final int Method1395() {
        return Class256.Field9146;
    }
    
    public final void Method1396(final int field9146) {
        Class256.Field9146 = field9146;
    }
    
    public final long Method1397() {
        return Class256.Field9147;
    }
    
    public final void Method1398(final long field9147) {
        Class256.Field9147 = field9147;
    }
    
    public final int Method1399() {
        return Class256.Field9148;
    }
    
    public final void Method1400(final int field9148) {
        Class256.Field9148 = field9148;
    }
    
    public final int Method1401() {
        return Class256.Field9149;
    }
    
    public final void Method1402(final int field9149) {
        Class256.Field9149 = field9149;
    }
    
    public final void Method1403() {
        Class256.Field9146 = 0;
        Class256.Field9149 = -1;
        Class256.Field9131 = null;
        Class256.Field9148 = 0;
    }
    
    private final boolean Method1404() {
        final BlockPos field9131 = Class256.Field9131;
        if (field9131 == null) {
            Intrinsics.throwNpe();
        }
        final ItemStack getStackInSlot = Class2142.Field17803.player.inventory.getStackInSlot(Class9.Method109(Class256.Field9131));
        Intrinsics.checkExpressionValueIsNotNull((Object)getStackInSlot, "mc.player.inventory.getS\u2026ndBestToolSlot(position))");
        return this.Method1407(field9131, getStackInSlot, Class256.Field9147) <= 1 - Class256.Field9138;
    }
    
    public final boolean Method1405(@NotNull @NotNull final BlockPos field9131, @Nullable @Nullable final EnumFacing enumFacing) {
        Intrinsics.checkParameterIsNotNull((Object)field9131, "pos");
        if (!this.Method1408()) {
            return false;
        }
        if (Class256.Field9143) {
            return true;
        }
        if (Class1036.Method4189(field9131)) {
            if (Class256.Field9131 != null) {
                final long toLong = field9131.toLong();
                final BlockPos field9132 = Class256.Field9131;
                if (field9132 == null) {
                    Intrinsics.throwNpe();
                }
                if (toLong == field9132.toLong()) {
                    if (!Class256.Field9143 && this.Method1404()) {
                        final WorldClient world = Class2142.Field17803.world;
                        final BlockPos field9133 = Class256.Field9131;
                        if (field9133 == null) {
                            Intrinsics.throwNpe();
                        }
                        final IBlockState getBlockState = world.getBlockState(field9133);
                        Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState, "mc.world.getBlockState(position!!)");
                        if (Intrinsics.areEqual((Object)getBlockState.getBlock(), (Object)Blocks.AIR) ^ true) {
                            if (Class256.Field9135) {
                                Class256.Field9134.Method844();
                            }
                            final NetHandlerPlayClient connection = Class2142.Field17803.player.connection;
                            final CPacketPlayerDigging$Action start_DESTROY_BLOCK = CPacketPlayerDigging$Action.START_DESTROY_BLOCK;
                            final BlockPos field9134 = Class256.Field9131;
                            if (field9134 == null) {
                                Intrinsics.throwNpe();
                            }
                            connection.sendPacket((Packet)new CPacketPlayerDigging(start_DESTROY_BLOCK, field9134, EnumFacing.DOWN));
                            return true;
                        }
                    }
                    return false;
                }
                final NetHandlerPlayClient connection2 = Class2142.Field17803.player.connection;
                final CPacketPlayerDigging$Action abort_DESTROY_BLOCK = CPacketPlayerDigging$Action.ABORT_DESTROY_BLOCK;
                final BlockPos field9135 = Class256.Field9131;
                if (field9135 == null) {
                    Intrinsics.throwNpe();
                }
                EnumFacing down;
                if ((down = enumFacing) == null) {
                    down = EnumFacing.DOWN;
                }
                connection2.sendPacket((Packet)new CPacketPlayerDigging(abort_DESTROY_BLOCK, field9135, down));
                Class2142.Field17803.playerController.isHittingBlock = false;
            }
            Class2142.Field17803.player.connection.sendPacket((Packet)new CPacketAnimation(EnumHand.MAIN_HAND));
            int n = 0;
            final int field9136 = Class256.Field9142;
            if (n <= field9136) {
                while (true) {
                    Class2142.Field17803.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging$Action.STOP_DESTROY_BLOCK, field9131, EnumFacing.DOWN));
                    if (n == field9136) {
                        break;
                    }
                    ++n;
                }
            }
            Class2142.Field17803.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging$Action.STOP_DESTROY_BLOCK, field9131, EnumFacing.DOWN));
            Class256.Field9131 = field9131;
            Class256.Field9147 = System.currentTimeMillis();
            return Class256.Field9144 = true;
        }
        return false;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method1406(@NotNull @NotNull final TickEvent$ClientTickEvent tickEvent$ClientTickEvent) {
        Intrinsics.checkParameterIsNotNull((Object)tickEvent$ClientTickEvent, "event");
        if (!this.Method1408() || Class2142.Field17803.player == null || Class2142.Field17803.world == null) {
            Class256.Field9133 = null;
            return;
        }
        if ((Intrinsics.areEqual((Object)Class256.Field9132, (Object)Class256.Field9133) ^ true) && Class256.Field9132 != null) {
            final BlockPos field9132 = Class256.Field9132;
            if (field9132 == null) {
                Intrinsics.throwNpe();
            }
            this.Method1405(field9132, EnumFacing.UP);
        }
        if (Class256.Field9143) {
            final NetHandlerPlayClient connection = Class2142.Field17803.player.connection;
            final CPacketPlayerDigging$Action stop_DESTROY_BLOCK = CPacketPlayerDigging$Action.STOP_DESTROY_BLOCK;
            final BlockPos field9133 = Class256.Field9131;
            if (field9133 == null) {
                Intrinsics.throwNpe();
            }
            connection.sendPacket((Packet)new CPacketPlayerDigging(stop_DESTROY_BLOCK, field9133, EnumFacing.DOWN));
            if (Class256.Field9148 >= 2) {
                Class9.Method110(Class256.Field9149, false);
                Class256.Field9143 = false;
                if (!Class256.Field9136 && Class256.Field9131 != null) {
                    Class256.Field9131 = null;
                }
                Class256.Field9148 = 0;
            }
            Class256.Field9148++;
        }
        Class256.Field9133 = Class256.Field9132;
    }
    
    private final float Method1407(final BlockPos blockPos, final ItemStack itemStack, final long n) {
        return (float)Class447.Method2118(1 - (System.currentTimeMillis() - n) / (double)Class9.Method107(blockPos, itemStack), 0.0, 1.0);
    }
    
    private final boolean Method1408() {
        final Class1437 field14740 = Class1437.Field14740;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14740, "PacketMine.instance");
        return field14740.Method35();
    }
    
    private Class256() {
    }
    
    static {
        final Class256 class256 = Field9152 = new Class256();
        Class256.Field9134 = new Class117();
        Class256.Field9149 = -1;
        Field9150 = new Class618((Class254)Class143.Field8568, new Predicate[0]);
        Field9151 = new Class618((Class254)Class1530.Field15155, new Predicate[0]);
        Class1796.Field16242.Method706(Class256.Field9150);
        Class1796.Field16242.Method706(Class256.Field9151);
        MinecraftForge.EVENT_BUS.register((Object)class256);
    }
    
    public static final boolean Method1409(final Class256 class256) {
        return class256.Method1408();
    }
    
    public static final boolean Method1410(final Class256 class256) {
        return class256.Method1404();
    }
    
    public static final Class117 Method1411(final Class256 class256) {
        return Class256.Field9134;
    }
    
    public static final void Method1412(final Class256 class256, final Class117 field9134) {
        Class256.Field9134 = field9134;
    }
    
    private static String Method1413(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x58E3 ^ 0xFA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
