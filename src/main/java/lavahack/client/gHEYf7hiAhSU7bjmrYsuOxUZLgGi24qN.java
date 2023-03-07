//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.block.Block
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.network.NetHandlerPlayClient
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraft.entity.Entity
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayerDigging
 *  net.minecraft.network.play.client.CPacketPlayerDigging$Action
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.RayTraceResult$Type
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$LeftClickBlock
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.RAmrx1XwuYiH2lhbXcpWmBrbN4Wx35PV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$1;
import lavahack.client.gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$2;
import lavahack.client.gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm;
import lavahack.client.gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import lavahack.client.gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG;
import lavahack.client.gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import lavahack.client.gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3;
import lavahack.client.gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
import lavahack.client.gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.vo8JGtFXaeonZQiouVGTbpILJYQDvWk4;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBlock;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020-H\u0002J\b\u0010/\u001a\u00020-H\u0016J\b\u00100\u001a\u00020-H\u0016J\u0010\u00101\u001a\u00020-2\u0006\u00102\u001a\u000203H\u0007J\b\u00104\u001a\u00020-H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u000b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \u000b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n \u000b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010 \u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010$\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010)\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2={"Lcom/kisman/cc/features/module/player/Interaction;", "Lcom/kisman/cc/features/module/Module;", "()V", "blockReachDistance", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/EventBlockReachDistance;", "blocks", "Lcom/kisman/cc/settings/types/SettingGroup;", "entities", "fastBreak", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "fastUse", "fuAll", "fuCrystal", "fuEnderChest", "fuExp", "fuMinecart", "fuObby", "iPacketCrystal", "items", "mousePos", "Lnet/minecraft/util/math/BlockPos;", "multiTask", "nmtPickaxeOnly", "noFriendDamage", "noInteract", "noInteractVal", "noMiningTrace", "ntAnvil", "ntArmorStand", "ntBlocks", "ntChest", "ntCraftingTable", "ntEnderChest", "ntFurnace", "ntReplacePacket", "reach", "reachDistance", "renderGetEntitiesINAABBexcluding", "Lcom/kisman/cc/event/events/EventRenderGetEntitiesINAABBexcluding;", "roofInteract", "send", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "doFastUse", "", "doPacketCrystal", "onDisable", "onEnable", "onLeftClickBlock", "event", "Lnet/minecraftforge/event/entity/player/PlayerInteractEvent$LeftClickBlock;", "update", "kisman.cc"})
public final class gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private static final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16776;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16777;
    private static final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16778;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16779;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16780;
    @JvmField
    @NotNull
    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16781;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16782;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16783;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16784;
    private static final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16785;
    @JvmField
    @NotNull
    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16786;
    @JvmField
    @NotNull
    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16787;
    private static final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16788;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16789;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16790;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16791;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16792;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16793;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16794;
    private static final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16795;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16796;
    private static final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16797;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16798;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16799;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16800;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16801;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16802;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16803;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16804;
    private static BlockPos Field16805;
    private static final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field16806;
    private static final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field16807;
    private static final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field16808;
    public static final gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN Field16809;
    private int Field16810;

    @Override
    public void Method38() {
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(Field16807);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(Field16808);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(Field16806);
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(Field16806);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(Field16808);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(Field16807);
    }

    @Override
    public void Method45() {
        if (gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().player == null) return;
        if (gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().world == null) {
            return;
        }
        this.Method7079();
        this.Method7078();
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method7077(@NotNull @NotNull PlayerInteractEvent.LeftClickBlock leftClickBlock) {
        Intrinsics.checkParameterIsNotNull((Object)leftClickBlock, (String)"event");
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = Field16783;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"fastBreak");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return;
        if (!(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().playerController.curBlockDamageMP + vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Method5947(leftClickBlock.getPos()) >= (float)((int)((long)-650003612 ^ (long)-650003611)))) return;
        gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, leftClickBlock.getPos(), gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().objectMouseOver.sideHit));
    }

    private final void Method7078() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = Field16777;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"iPacketCrystal");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return;
        KeyBinding keyBinding = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().gameSettings.keyBindUseItem;
        Intrinsics.checkExpressionValueIsNotNull((Object)keyBinding, (String)"mc.gameSettings.keyBindUseItem");
        if (!keyBinding.isKeyDown()) return;
        EntityPlayerSP entityPlayerSP = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (!Intrinsics.areEqual((Object)entityPlayerSP.getHeldItemMainhand().item, (Object)Items.END_CRYSTAL)) {
            EntityPlayerSP entityPlayerSP2 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
            if (!Intrinsics.areEqual((Object)entityPlayerSP2.getHeldItemOffhand().item, (Object)Items.END_CRYSTAL)) return;
        }
        RayTraceResult rayTraceResult = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().objectMouseOver;
        if (rayTraceResult == null) return;
        RayTraceResult rayTraceResult2 = rayTraceResult;
        RayTraceResult.Type type = rayTraceResult2.typeOfHit;
        if (type == null) {
            Intrinsics.throwNpe();
        }
        switch (RAmrx1XwuYiH2lhbXcpWmBrbN4Wx35PV.Field12475[type.ordinal()]) {
            case 1: {
                Field16805 = null;
                return;
            }
            case 2: {
                RayTraceResult rayTraceResult3 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().objectMouseOver;
                Intrinsics.checkExpressionValueIsNotNull((Object)rayTraceResult3, (String)"mc.objectMouseOver");
                Field16805 = rayTraceResult3.getBlockPos();
                return;
            }
            case 3: {
                Entity entity = rayTraceResult2.entityHit;
                if (Field16805 == null) return;
                if (entity == null) {
                    return;
                }
                if ((Intrinsics.areEqual((Object)Field16805, (Object)new BlockPos(entity.posX, entity.posY - (double)((int)1424940613L ^ 0x54EEDE44), entity.posZ)) ^ (int)((long)809245062 ^ (long)809245063)) != 0) {
                    return;
                }
                NetHandlerPlayClient netHandlerPlayClient = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().player.connection;
                BlockPos blockPos = Field16805;
                if (blockPos == null) {
                    Intrinsics.throwNpe();
                }
                EntityPlayerSP entityPlayerSP3 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP3, (String)"mc.player");
                netHandlerPlayClient.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos, EnumFacing.DOWN, Intrinsics.areEqual((Object)entityPlayerSP3.getHeldItemOffhand().item, (Object)Items.END_CRYSTAL) ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND, 0.0f, 0.0f, 0.0f));
                return;
            }
        }
    }

    private final void Method7079() {
        block2: {
            block6: {
                block5: {
                    block4: {
                        block3: {
                            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = Field16789;
                            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"fuAll");
                            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) break block2;
                            EntityPlayerSP entityPlayerSP = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().player;
                            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                            if (!Intrinsics.areEqual((Object)entityPlayerSP.getHeldItemMainhand().item, (Object)Items.EXPERIENCE_BOTTLE)) break block3;
                            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = Field16790;
                            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"fuExp");
                            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) break block2;
                        }
                        EntityPlayerSP entityPlayerSP = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().player;
                        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                        if (!Intrinsics.areEqual((Object)entityPlayerSP.getHeldItemMainhand().item, (Object)ItemBlock.getItemFromBlock((Block)Blocks.OBSIDIAN))) break block4;
                        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = Field16791;
                        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"fuObby");
                        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method365()) break block2;
                    }
                    EntityPlayerSP entityPlayerSP = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                    if (!Intrinsics.areEqual((Object)entityPlayerSP.getHeldItemMainhand().item, (Object)ItemBlock.getItemFromBlock((Block)Blocks.ENDER_CHEST))) break block5;
                    qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = Field16792;
                    Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"fuEnderChest");
                    if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method365()) break block2;
                }
                EntityPlayerSP entityPlayerSP = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                if (!Intrinsics.areEqual((Object)entityPlayerSP.getHeldItemMainhand().item, (Object)Items.MINECART)) break block6;
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = Field16793;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"fuMinecart");
                if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method365()) break block2;
            }
            EntityPlayerSP entityPlayerSP = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
            if (!Intrinsics.areEqual((Object)entityPlayerSP.getHeldItemMainhand().item, (Object)Items.END_CRYSTAL)) return;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = Field16794;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"fuCrystal");
            if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7.Method365()) return;
        }
        gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN.Method7080().rightClickDelayTimer = (int)((long)2025368598 ^ (long)2025368598);
    }

    private gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN() {
        super("Interaction", "NoMiningTrace + MultiTask + RoofInteract + FastUse + NoFriendDamage", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8341);
    }

    static {
        gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2;
        Field16809 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2 = new gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN();
        Field16776 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Items", gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2)));
        Field16777 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method23(Field16776.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet Crystal", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2, ((int)789710927L ^ 0x2F12084F) != 0)));
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Blocks", gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2)));
        if (xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingGroup");
        }
        Field16778 = xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method23(Field16778.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("No Mining Trace", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2, ((int)-1739397659L ^ 0x9852E5E5) != 0)));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"register(blocks.add(Sett\u2026ng Trace\", this, false)))");
        Field16779 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("NMT Pickaxe Only", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2, ((int)-145079999L ^ 0xF75A4141) != 0).Method313(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Field14420).Method355("Pickaxe Only");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"Setting(\"NMT Pickaxe Onl\u2026.setTitle(\"Pickaxe Only\")");
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method23(Field16778.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"register(blocks.add(Sett\u2026etTitle(\"Pickaxe Only\")))");
        Field16780 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method23(Field16778.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Multi Task", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2, (boolean)((long)1879064919 ^ (long)1879064919))));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"register(blocks.add(Sett\u2026lti Task\", this, false)))");
        Field16781 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5;
        Field16782 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method23(Field16778.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Roof Interact", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2, (boolean)((long)1050503091 ^ (long)1050503091))));
        Field16783 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method23(Field16778.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Fast Break", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2, (boolean)((long)623777753 ^ (long)623777753))));
        Field16784 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method23(Field16778.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("No Interact", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2, (boolean)((long)-539875486 ^ (long)-539875486))));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("No Interact", gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2).Method313(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Field17121);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"Setting(\"No Interact\", t\u2026oInteractVal.valBoolean }");
        Field16785 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method24(Field16778.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6)));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method23(Field16778.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Reach", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2, ((int)653954810L ^ 0x26FA8EFA) != 0)));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"register(blocks.add(Sett\u2026g(\"Reach\", this, false)))");
        Field16786 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Reach Distance", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2, Double.longBitsToDouble((long)1777280307 ^ 0x4014000069EF2533L), 1.0, Double.longBitsToDouble((long)1373047572 ^ 0x4024000051D70B14L), ((int)942879046L ^ 0x38333147) != 0).Method313(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Field17560);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8, (String)"Setting(\"Reach Distance\"\u2026ible { reach.valBoolean }");
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method23(Field16778.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9, (String)"register(blocks.add(Sett\u2026le { reach.valBoolean }))");
        Field16787 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9;
        Field16788 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Fast Use", gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2)));
        Field16789 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method23(Field16788.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("All", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2, ((int)1600224074L ^ 0x5F617B4A) != 0)));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Exp", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2, (boolean)((long)267216956 ^ (long)267216956)).Method313(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field11440);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10, (String)"Setting(\"Exp\", this, fal\u2026ble { !fuAll.valBoolean }");
        Field16790 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method23(Field16788.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Obby", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2, (boolean)((long)-417815465 ^ (long)-417815465)).Method313(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field12042);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11, (String)"Setting(\"Obby\", this, fa\u2026ble { !fuAll.valBoolean }");
        Field16791 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method23(Field16788.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("EnderChest", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2, (boolean)((long)-351327012 ^ (long)-351327012)).Method313(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field11237);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12, (String)"Setting(\"EnderChest\", th\u2026ble { !fuAll.valBoolean }");
        Field16792 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method23(Field16788.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Minecart", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2, ((int)-803527408L ^ 0xD01B2510) != 0).Method313(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field7830);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13, (String)"Setting(\"Minecart\", this\u2026ble { !fuAll.valBoolean }");
        Field16793 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method23(Field16788.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD14 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Crystal", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2, ((int)908972762L ^ 0x362DD2DA) != 0).Method313(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field16976);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD14, (String)"Setting(\"Crystal\", this,\u2026ble { !fuAll.valBoolean }");
        Field16794 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method23(Field16788.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD14));
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Entities", gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2)));
        if (xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingGroup");
        }
        Field16795 = xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3;
        Field16796 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method23(Field16795.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("No Friend Damage", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2, ((int)-116800413L ^ 0xF909C463) != 0)));
        Field16797 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method24(Field16785.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Blocks", gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2))));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD15 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("NT Ender Chest", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2, ((int)1912393800L ^ 0x71FCD048) != 0).Method355("Ender Chest");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD15, (String)"Setting(\"NT Ender Chest\"\u2026).setTitle(\"Ender Chest\")");
        Field16798 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method23(Field16797.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD15));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD16 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("NT Crafting Table", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2, ((int)2065143859L ^ 0x7B179833) != 0).Method355("Craft");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD16, (String)"Setting(\"NT Crafting Tab\u2026 false).setTitle(\"Craft\")");
        Field16799 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method23(Field16797.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD16));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD17 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("NT Chest", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2, (boolean)((long)58520647 ^ (long)58520647)).Method355("Chest");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD17, (String)"Setting(\"NT Chest\", this, false).setTitle(\"Chest\")");
        Field16800 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method23(Field16797.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD17));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD18 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("NT Furnace", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2, (boolean)((long)1112077211 ^ (long)1112077211)).Method355("Furnace");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD18, (String)"Setting(\"NT Furnace\", th\u2026alse).setTitle(\"Furnace\")");
        Field16801 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method23(Field16797.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD18));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD19 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("NT Anvil", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2, ((int)-835313155L ^ 0xCE3621FD) != 0).Method355("Anvil");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD19, (String)"Setting(\"NT Anvil\", this, false).setTitle(\"Anvil\")");
        Field16802 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method23(Field16797.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD19));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD20 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("NT Armor Stand", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2, ((int)166314500L ^ 0x9E9C204) != 0).Method355("Armor Stand");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD20, (String)"Setting(\"NT Armor Stand\"\u2026).setTitle(\"Armor Stand\")");
        Field16803 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method23(Field16797.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD20));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD21 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("NT Replace Packet", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2, ((int)-835090346L ^ 0xCE398856) != 0).Method355("Replace Packet");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD21, (String)"Setting(\"NT Replace Pack\u2026etTitle(\"Replace Packet\")");
        Field16804 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2.Method23(Field16797.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD21));
        Field16779.Method303(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$1.Field15907);
        Field16786.Method303(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$2.Field15914);
        Field16806 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11304, new Predicate[(int)((long)618416697 ^ (long)618416697)]);
        Field16807 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk.Field15722, new Predicate[(int)((long)-985230134 ^ (long)-985230134)]);
        Field16808 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG.Field11108, new Predicate[(int)((long)-1715281894 ^ (long)-1715281894)]);
    }

    public static final Minecraft Method7080() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method7081(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7082(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2) {
        gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN3 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2;
        return Field16779;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7083(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2) {
        gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN3 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2;
        return Field16784;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7084(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2) {
        gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN3 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2;
        return Field16789;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7085(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2) {
        gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN3 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2;
        return Field16780;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7086(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2) {
        gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN3 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2;
        return Field16803;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7087(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2) {
        gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN3 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2;
        return Field16804;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7088(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2) {
        gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN3 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2;
        return Field16798;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7089(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2) {
        gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN3 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2;
        return Field16799;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7090(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2) {
        gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN3 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2;
        return Field16800;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7091(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2) {
        gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN3 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2;
        return Field16801;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7092(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2) {
        gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN3 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2;
        return Field16802;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7093(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2) {
        gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN3 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2;
        return Field16796;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7094(gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2) {
        gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN3 = gHEYf7hiAhSU7bjmrYsuOxUZLgGi24qN2;
        return Field16782;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1829243478 ^ (long)1829243478);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1700844558L ^ 0x6560D4F1);
            int n2 = (int)-1749500975L ^ 0x97B8BBB2;
            cArray2[n] = (char)(cArray[n] ^ (((int)482433715L ^ 0x1CC16E80) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

