//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.network.NetHandlerPlayClient
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketAnimation
 *  net.minecraft.network.play.client.CPacketPlayerDigging
 *  net.minecraft.network.play.client.CPacketPlayerDigging$Action
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.G4rlvdq3ffaWKhUJ9QOqsMSrc8mptBF8;
import lavahack.client.GAy9jV5JLrUCU1UxQkzXttscRqZTYALl;
import lavahack.client.L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.cyLqWrs7Rz1w0lV5rUS0mYXraako9yXI;
import lavahack.client.dHW1jZK49fXgBu9AY91BXDMHsTGGza8u;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010M\u001a\u00020\u0004H\u0002J\b\u0010N\u001a\u00020\u0004H\u0002J \u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u001c2\u0006\u0010R\u001a\u00020S2\u0006\u0010<\u001a\u00020=H\u0002J\u0018\u0010T\u001a\u00020\u00042\u0006\u0010U\u001a\u00020\u001c2\b\u0010V\u001a\u0004\u0018\u00010WJ\u0010\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[H\u0007J\u0006\u0010\\\u001a\u00020YR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014R\u001a\u0010 \u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010%\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\u001a\u0010-\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u0014R\u001a\u00100\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0012\"\u0004\b2\u0010\u0014R\u001a\u00103\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001a\u00106\u001a\u000207X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020=X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010B\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001a\u0010E\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR\u001a\u0010H\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u000e\u0010K\u001a\u00020LX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006]"}, d2={"Lcom/kisman/cc/util/providers/PacketMineProvider;", "Lme/zero/alpine/listener/Listenable;", "()V", "autoSwitch", "", "getAutoSwitch", "()Z", "setAutoSwitch", "(Z)V", "checked", "getChecked", "setChecked", "damageBlock", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/EventDamageBlock;", "delay", "", "getDelay", "()I", "setDelay", "(I)V", "instant", "getInstant", "setInstant", "instantAttempts", "getInstantAttempts", "setInstantAttempts", "lastPosToMine", "Lnet/minecraft/util/math/BlockPos;", "oldSlot", "getOldSlot", "setOldSlot", "packetSpam", "getPacketSpam", "setPacketSpam", "playerMove", "Lcom/kisman/cc/event/events/EventPlayerMove;", "posToMine", "getPosToMine", "()Lnet/minecraft/util/math/BlockPos;", "setPosToMine", "(Lnet/minecraft/util/math/BlockPos;)V", "position", "getPosition", "setPosition", "range", "getRange", "setRange", "rebreakCount", "getRebreakCount", "setRebreakCount", "silent", "getSilent", "setSilent", "speed", "", "getSpeed", "()D", "setSpeed", "(D)V", "start", "", "getStart", "()J", "setStart", "(J)V", "strict", "getStrict", "setStrict", "strictCheck", "getStrictCheck", "setStrictCheck", "swap", "getSwap", "setSwap", "swapper", "Lcom/kisman/cc/util/providers/DefaultSwapper;", "active", "blockProgressCheck", "getBlockProgress", "", "blockPos", "stack", "Lnet/minecraft/item/ItemStack;", "handleBlockClick", "pos", "facing", "Lnet/minecraft/util/EnumFacing;", "onClientTick", "", "event", "Lnet/minecraftforge/fml/common/gameevent/TickEvent$ClientTickEvent;", "reset", "kisman.cc"})
public final class L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN
implements GAy9jV5JLrUCU1UxQkzXttscRqZTYALl {
    @Nullable
    private static BlockPos Field9131;
    @Nullable
    private static BlockPos Field9132;
    private static BlockPos Field9133;
    private static G4rlvdq3ffaWKhUJ9QOqsMSrc8mptBF8 Field9134;
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
    private static final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field9150;
    private static final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field9151;
    public static final L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN Field9152;
    private String Field9153 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Nullable
    @Nullable
    public final BlockPos Method1369() {
        return Field9131;
    }

    public final void Method1370(@Nullable @Nullable BlockPos blockPos) {
        Field9131 = blockPos;
    }

    @Nullable
    @Nullable
    public final BlockPos Method1371() {
        return Field9132;
    }

    public final void Method1372(@Nullable @Nullable BlockPos blockPos) {
        Field9132 = blockPos;
    }

    public final boolean Method1373() {
        return Field9135;
    }

    public final void Method1374(boolean bl) {
        Field9135 = bl;
    }

    public final boolean Method1375() {
        return Field9136;
    }

    public final void Method1376(boolean bl) {
        Field9136 = bl;
    }

    public final boolean Method1377() {
        return Field9137;
    }

    public final void Method1378(boolean bl) {
        Field9137 = bl;
    }

    public final double Method1379() {
        return Field9138;
    }

    public final void Method1380(double d) {
        Field9138 = d;
    }

    public final int Method1381() {
        return Field9139;
    }

    public final void Method1382(int n) {
        Field9139 = n;
    }

    public final boolean Method1383() {
        return Field9140;
    }

    public final void Method1384(boolean bl) {
        Field9140 = bl;
    }

    public final int Method1385() {
        return Field9141;
    }

    public final void Method1386(int n) {
        Field9141 = n;
    }

    public final int Method1387() {
        return Field9142;
    }

    public final void Method1388(int n) {
        Field9142 = n;
    }

    public final boolean Method1389() {
        return Field9143;
    }

    public final void Method1390(boolean bl) {
        Field9143 = bl;
    }

    public final boolean Method1391() {
        return Field9144;
    }

    public final void Method1392(boolean bl) {
        Field9144 = bl;
    }

    public final boolean Method1393() {
        return Field9145;
    }

    public final void Method1394(boolean bl) {
        Field9145 = bl;
    }

    public final int Method1395() {
        return Field9146;
    }

    public final void Method1396(int n) {
        Field9146 = n;
    }

    public final long Method1397() {
        return Field9147;
    }

    public final void Method1398(long l) {
        Field9147 = l;
    }

    public final int Method1399() {
        return Field9148;
    }

    public final void Method1400(int n) {
        Field9148 = n;
    }

    public final int Method1401() {
        return Field9149;
    }

    public final void Method1402(int n) {
        Field9149 = n;
    }

    public final void Method1403() {
        Field9146 = (int)((long)-1406881807 ^ (long)-1406881807);
        Field9149 = (int)((long)-1638146576 ^ (long)1638146575);
        Field9131 = null;
        Field9148 = (int)2012362899L ^ 0x77F23893;
    }

    private final boolean Method1404() {
        int n;
        BlockPos blockPos = Field9131;
        if (blockPos == null) {
            Intrinsics.throwNpe();
        }
        ItemStack itemStack = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.inventory.getStackInSlot(lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method109(Field9131));
        Intrinsics.checkExpressionValueIsNotNull((Object)itemStack, (String)"mc.player.inventory.getS\u2026ndBestToolSlot(position))");
        if ((double)this.Method1407(blockPos, itemStack, Field9147) <= (double)((int)((long)-2118372116 ^ (long)-2118372115)) - Field9138) {
            n = (int)((long)-1711416584 ^ (long)-1711416583);
            return n != 0;
        }
        n = (int)((long)-499751821 ^ (long)-499751821);
        return n != 0;
    }

    public final boolean Method1405(@NotNull @NotNull BlockPos blockPos, @Nullable @Nullable EnumFacing enumFacing) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        if (!this.Method1408()) {
            return (int)((long)31406333 ^ (long)31406333) != 0;
        }
        if (Field9143) {
            return (int)((long)517669256 ^ (long)517669257) != 0;
        }
        if (!h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4189(blockPos)) return (int)((long)-1421895072 ^ (long)-1421895072) != 0;
        if (Field9131 != null) {
            EnumFacing enumFacing2;
            long l = blockPos.toLong();
            BlockPos blockPos2 = Field9131;
            if (blockPos2 == null) {
                Intrinsics.throwNpe();
            }
            if (l == blockPos2.toLong()) {
                if (Field9143) return (int)((long)2019034017 ^ (long)2019034017) != 0;
                if (!this.Method1404()) return (int)((long)2019034017 ^ (long)2019034017) != 0;
                WorldClient worldClient = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world;
                BlockPos blockPos3 = Field9131;
                if (blockPos3 == null) {
                    Intrinsics.throwNpe();
                }
                IBlockState iBlockState = worldClient.getBlockState(blockPos3);
                Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(position!!)");
                if ((Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR) ^ ((int)52184304L ^ 0x31C44F1)) == 0) return (int)((long)2019034017 ^ (long)2019034017) != 0;
                if (Field9135) {
                    Field9134.Method844();
                }
                NetHandlerPlayClient netHandlerPlayClient = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.connection;
                BlockPos blockPos4 = Field9131;
                if (blockPos4 == null) {
                    Intrinsics.throwNpe();
                }
                netHandlerPlayClient.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, blockPos4, EnumFacing.DOWN));
                return ((int)-1255765928L ^ 0xB5268859) != 0;
            }
            NetHandlerPlayClient netHandlerPlayClient = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.connection;
            BlockPos blockPos5 = Field9131;
            if (blockPos5 == null) {
                Intrinsics.throwNpe();
            }
            if ((enumFacing2 = enumFacing) == null) {
                enumFacing2 = EnumFacing.DOWN;
            }
            netHandlerPlayClient.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.ABORT_DESTROY_BLOCK, blockPos5, enumFacing2));
            Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.playerController.isHittingBlock = (int)((long)-175105951 ^ (long)-175105951);
        }
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.connection.sendPacket((Packet)new CPacketAnimation(EnumHand.MAIN_HAND));
        int n = (int)((long)293848650 ^ (long)293848650);
        int n2 = Field9142;
        if (n <= n2) {
            while (true) {
                Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, blockPos, EnumFacing.DOWN));
                if (n == n2) break;
                ++n;
            }
        }
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, blockPos, EnumFacing.DOWN));
        Field9131 = blockPos;
        Field9147 = System.currentTimeMillis();
        Field9144 = (int)((long)1618559092 ^ (long)1618559093);
        return (int)((long)-645483710 ^ (long)-645483709) != 0;
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method1406(@NotNull @NotNull TickEvent.ClientTickEvent clientTickEvent) {
        Intrinsics.checkParameterIsNotNull((Object)clientTickEvent, (String)"event");
        if (!this.Method1408() || Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player == null || Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world == null) {
            Field9133 = null;
            return;
        }
        if ((Intrinsics.areEqual((Object)Field9132, (Object)Field9133) ^ (int)((long)-2040397264 ^ (long)-2040397263)) != 0 && Field9132 != null) {
            BlockPos blockPos = Field9132;
            if (blockPos == null) {
                Intrinsics.throwNpe();
            }
            this.Method1405(blockPos, EnumFacing.UP);
        }
        if (Field9143) {
            NetHandlerPlayClient netHandlerPlayClient = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.connection;
            BlockPos blockPos = Field9131;
            if (blockPos == null) {
                Intrinsics.throwNpe();
            }
            netHandlerPlayClient.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, blockPos, EnumFacing.DOWN));
            if (Field9148 >= (int)((long)-376067381 ^ (long)-376067382) << 1) {
                lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method110(Field9149, (boolean)((long)1405317692 ^ (long)1405317692));
                Field9143 = (int)((long)-303517744 ^ (long)-303517744);
                if (!Field9136 && Field9131 != null) {
                    Field9131 = null;
                }
                Field9148 = (int)((long)71176611 ^ (long)71176611);
            }
            int n = Field9148;
            Field9148 = n + ((int)-923621284L ^ 0xC8F2A85D);
        }
        Field9133 = Field9132;
    }

    private final float Method1407(BlockPos blockPos, ItemStack itemStack, long l) {
        return (float)dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2118((double)((int)((long)-1953097006 ^ (long)-1953097005)) - (double)(System.currentTimeMillis() - l) / (double)lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method107(blockPos, itemStack), 0.0, 1.0);
    }

    private final boolean Method1408() {
        cyLqWrs7Rz1w0lV5rUS0mYXraako9yXI cyLqWrs7Rz1w0lV5rUS0mYXraako9yXI2 = cyLqWrs7Rz1w0lV5rUS0mYXraako9yXI.Field14740;
        Intrinsics.checkExpressionValueIsNotNull((Object)cyLqWrs7Rz1w0lV5rUS0mYXraako9yXI2, (String)"PacketMine.instance");
        return cyLqWrs7Rz1w0lV5rUS0mYXraako9yXI2.Method35();
    }

    private L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN() {
    }

    static {
        L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN l2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN;
        Field9152 = l2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN = new L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN();
        Field9134 = new G4rlvdq3ffaWKhUJ9QOqsMSrc8mptBF8();
        Field9149 = (int)((long)1501076494 ^ (long)-1501076495);
        Field9150 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field8568, new Predicate[(int)-116328093L ^ 0xF910F963]);
        Field9151 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field15155, new Predicate[(int)((long)-625963437 ^ (long)-625963437)]);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(Field9150);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(Field9151);
        MinecraftForge.EVENT_BUS.register((Object)l2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN);
    }

    public static final boolean Method1409(L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN l2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN) {
        return l2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Method1408();
    }

    public static final boolean Method1410(L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN l2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN) {
        return l2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Method1404();
    }

    public static final G4rlvdq3ffaWKhUJ9QOqsMSrc8mptBF8 Method1411(L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN l2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN) {
        L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN l2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN2 = l2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN;
        return Field9134;
    }

    public static final void Method1412(L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN l2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN, G4rlvdq3ffaWKhUJ9QOqsMSrc8mptBF8 g4rlvdq3ffaWKhUJ9QOqsMSrc8mptBF8) {
        L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN l2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN2 = l2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN;
        Field9134 = g4rlvdq3ffaWKhUJ9QOqsMSrc8mptBF8;
    }

    private static String Method1413(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1402158209 ^ (long)-1402158209);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-2058462329 ^ (long)-2058462344);
            int n2 = (int)((long)-1137061201 ^ (long)-1137061166) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1151900763 ^ (long)-1151911098) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

