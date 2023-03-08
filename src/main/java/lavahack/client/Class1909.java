//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.*;
import org.jetbrains.annotations.*;
import net.minecraftforge.event.entity.player.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.client.settings.*;
import net.minecraft.client.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.*;
import net.minecraft.client.network.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import kotlin.*;
import java.util.function.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\b\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020-H\u0002J\b\u0010/\u001a\u00020-H\u0016J\b\u00100\u001a\u00020-H\u0016J\u0010\u00101\u001a\u00020-2\u0006\u00102\u001a\u000203H\u0007J\b\u00104\u001a\u00020-H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u000b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e?\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u00020\n8\u0006X\u0087\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \u000b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n \u000b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010 \u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010$\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u00020\n8\u0006X\u0087\u0004?\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u00020\n8\u0006X\u0087\u0004?\u0006\u0002\n\u0000R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010)\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u00065" }, d2 = { "Lcom/kisman/cc/features/module/player/Interaction;", "Lcom/kisman/cc/features/module/Module;", "()V", "blockReachDistance", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/EventBlockReachDistance;", "blocks", "Lcom/kisman/cc/settings/types/SettingGroup;", "entities", "fastBreak", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "fastUse", "fuAll", "fuCrystal", "fuEnderChest", "fuExp", "fuMinecart", "fuObby", "iPacketCrystal", "items", "mousePos", "Lnet/minecraft/util/math/BlockPos;", "multiTask", "nmtPickaxeOnly", "noFriendDamage", "noInteract", "noInteractVal", "noMiningTrace", "ntAnvil", "ntArmorStand", "ntBlocks", "ntChest", "ntCraftingTable", "ntEnderChest", "ntFurnace", "ntReplacePacket", "reach", "reachDistance", "renderGetEntitiesINAABBexcluding", "Lcom/kisman/cc/event/events/EventRenderGetEntitiesINAABBexcluding;", "roofInteract", "send", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "doFastUse", "", "doPacketCrystal", "onDisable", "onEnable", "onLeftClickBlock", "event", "Lnet/minecraftforge/event/entity/player/PlayerInteractEvent$LeftClickBlock;", "update", "kisman.cc" })
public final class Class1909 extends Class42
{
    private static final Class1996 Field16776;
    private static final Class44 Field16777;
    private static final Class1996 Field16778;
    private static final Class44 Field16779;
    private static final Class44 Field16780;
    @JvmField
    @NotNull
    public static final Class44 Field16781;
    private static final Class44 Field16782;
    private static final Class44 Field16783;
    private static final Class44 Field16784;
    private static final Class1996 Field16785;
    @JvmField
    @NotNull
    public static final Class44 Field16786;
    @JvmField
    @NotNull
    public static final Class44 Field16787;
    private static final Class1996 Field16788;
    private static final Class44 Field16789;
    private static final Class44 Field16790;
    private static final Class44 Field16791;
    private static final Class44 Field16792;
    private static final Class44 Field16793;
    private static final Class44 Field16794;
    private static final Class1996 Field16795;
    private static final Class44 Field16796;
    private static final Class1996 Field16797;
    private static final Class44 Field16798;
    private static final Class44 Field16799;
    private static final Class44 Field16800;
    private static final Class44 Field16801;
    private static final Class44 Field16802;
    private static final Class44 Field16803;
    private static final Class44 Field16804;
    private static BlockPos Field16805;
    private static final Class618 Field16806;
    private static final Class618 Field16807;
    private static final Class618 Field16808;
    public static final Class1909 Field16809;
    private int Field16810;
    
    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(Class1909.Field16807);
        Class1796.Field16242.Method706(Class1909.Field16808);
        Class1796.Field16242.Method706(Class1909.Field16806);
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(Class1909.Field16806);
        Class1796.Field16242.Method711(Class1909.Field16808);
        Class1796.Field16242.Method711(Class1909.Field16807);
    }
    
    @Override
    public void Method45() {
        if (Method7080().player == null || Method7080().world == null) {
            return;
        }
        this.Method7079();
        this.Method7078();
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method7077(@NotNull @NotNull final PlayerInteractEvent$LeftClickBlock playerInteractEvent$LeftClickBlock) {
        Intrinsics.checkParameterIsNotNull((Object)playerInteractEvent$LeftClickBlock, "event");
        final Class44 field16783 = Class1909.Field16783;
        Intrinsics.checkExpressionValueIsNotNull((Object)field16783, "fastBreak");
        if (field16783.Method365() && Method7080().playerController.curBlockDamageMP + Class1486.Method5947(playerInteractEvent$LeftClickBlock.getPos()) >= 1) {
            Method7080().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging$Action.STOP_DESTROY_BLOCK, playerInteractEvent$LeftClickBlock.getPos(), Method7080().objectMouseOver.sideHit));
        }
    }
    
    private final void Method7078() {
        final Class44 field16777 = Class1909.Field16777;
        Intrinsics.checkExpressionValueIsNotNull((Object)field16777, "iPacketCrystal");
        if (field16777.Method365()) {
            final KeyBinding keyBindUseItem = Method7080().gameSettings.keyBindUseItem;
            Intrinsics.checkExpressionValueIsNotNull((Object)keyBindUseItem, "mc.gameSettings.keyBindUseItem");
            if (keyBindUseItem.isKeyDown()) {
                final EntityPlayerSP player = Method7080().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
                if (!Intrinsics.areEqual((Object)player.getHeldItemMainhand().item, (Object)Items.END_CRYSTAL)) {
                    final EntityPlayerSP player2 = Method7080().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
                    if (!Intrinsics.areEqual((Object)player2.getHeldItemOffhand().item, (Object)Items.END_CRYSTAL)) {
                        return;
                    }
                }
                final RayTraceResult objectMouseOver = Method7080().objectMouseOver;
                if (objectMouseOver == null) {
                    return;
                }
                final RayTraceResult rayTraceResult = objectMouseOver;
                final RayTraceResult$Type typeOfHit = rayTraceResult.typeOfHit;
                if (typeOfHit == null) {
                    Intrinsics.throwNpe();
                }
                switch (Class1023.Field12475[typeOfHit.ordinal()]) {
                    case 1: {
                        Class1909.Field16805 = null;
                        break;
                    }
                    case 2: {
                        final RayTraceResult objectMouseOver2 = Method7080().objectMouseOver;
                        Intrinsics.checkExpressionValueIsNotNull((Object)objectMouseOver2, "mc.objectMouseOver");
                        Class1909.Field16805 = objectMouseOver2.getBlockPos();
                        break;
                    }
                    case 3: {
                        final Entity entityHit = rayTraceResult.entityHit;
                        if (Class1909.Field16805 == null || entityHit == null) {
                            return;
                        }
                        if (Intrinsics.areEqual((Object)Class1909.Field16805, (Object)new BlockPos(entityHit.posX, entityHit.posY - 1, entityHit.posZ)) ^ true) {
                            return;
                        }
                        final NetHandlerPlayClient connection = Method7080().player.connection;
                        final BlockPos field16778 = Class1909.Field16805;
                        if (field16778 == null) {
                            Intrinsics.throwNpe();
                        }
                        final EnumFacing down = EnumFacing.DOWN;
                        final EntityPlayerSP player3 = Method7080().player;
                        Intrinsics.checkExpressionValueIsNotNull((Object)player3, "mc.player");
                        connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(field16778, down, Intrinsics.areEqual((Object)player3.getHeldItemOffhand().item, (Object)Items.END_CRYSTAL) ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND, 0.0f, 0.0f, 0.0f));
                        break;
                    }
                }
            }
        }
    }
    
    private final void Method7079() {
        final Class44 field16789 = Class1909.Field16789;
        Intrinsics.checkExpressionValueIsNotNull((Object)field16789, "fuAll");
        Label_0243: {
            if (!field16789.Method365()) {
                final EntityPlayerSP player = Method7080().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
                if (Intrinsics.areEqual((Object)player.getHeldItemMainhand().item, (Object)Items.EXPERIENCE_BOTTLE)) {
                    final Class44 field16790 = Class1909.Field16790;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field16790, "fuExp");
                    if (field16790.Method365()) {
                        break Label_0243;
                    }
                }
                final EntityPlayerSP player2 = Method7080().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
                if (Intrinsics.areEqual((Object)player2.getHeldItemMainhand().item, (Object)ItemBlock.getItemFromBlock(Blocks.OBSIDIAN))) {
                    final Class44 field16791 = Class1909.Field16791;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field16791, "fuObby");
                    if (field16791.Method365()) {
                        break Label_0243;
                    }
                }
                final EntityPlayerSP player3 = Method7080().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player3, "mc.player");
                if (Intrinsics.areEqual((Object)player3.getHeldItemMainhand().item, (Object)ItemBlock.getItemFromBlock(Blocks.ENDER_CHEST))) {
                    final Class44 field16792 = Class1909.Field16792;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field16792, "fuEnderChest");
                    if (field16792.Method365()) {
                        break Label_0243;
                    }
                }
                final EntityPlayerSP player4 = Method7080().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player4, "mc.player");
                if (Intrinsics.areEqual((Object)player4.getHeldItemMainhand().item, (Object)Items.MINECART)) {
                    final Class44 field16793 = Class1909.Field16793;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field16793, "fuMinecart");
                    if (field16793.Method365()) {
                        break Label_0243;
                    }
                }
                final EntityPlayerSP player5 = Method7080().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player5, "mc.player");
                if (!Intrinsics.areEqual((Object)player5.getHeldItemMainhand().item, (Object)Items.END_CRYSTAL)) {
                    return;
                }
                final Class44 field16794 = Class1909.Field16794;
                Intrinsics.checkExpressionValueIsNotNull((Object)field16794, "fuCrystal");
                if (!field16794.Method365()) {
                    return;
                }
            }
        }
        Method7080().rightClickDelayTimer = 0;
    }
    
    private Class1909() {
        super("Interaction", "NoMiningTrace + MultiTask + RoofInteract + FastUse + NoFriendDamage", Class97.Field8341);
    }
    
    static {
        final Class1909 class1909 = Field16809 = new Class1909();
        Field16776 = class1909.Method24(new Class1996(new Class44("Items", class1909)));
        Field16777 = class1909.Method23(Class1909.Field16776.Method7405(new Class44("Packet Crystal", class1909, false)));
        final Class1996 method24 = class1909.Method24(new Class1996(new Class44("Blocks", class1909)));
        if (method24 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingGroup");
        }
        Field16778 = method24;
        final Class44 method25 = class1909.Method23(Class1909.Field16778.Method7405(new Class44("No Mining Trace", class1909, false)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method25, "register(blocks.add(Sett\u2026ng Trace\", this, false)))");
        Field16779 = method25;
        final Class1909 class1910 = class1909;
        final Class1996 field16778 = Class1909.Field16778;
        final Class44 method26 = new Class44("NMT Pickaxe Only", class1909, false).Method313((Supplier)Class1414.Field14420).Method355("Pickaxe Only");
        Intrinsics.checkExpressionValueIsNotNull((Object)method26, "Setting(\"NMT Pickaxe Onl\u2026.setTitle(\"Pickaxe Only\")");
        final Class44 method27 = class1910.Method23(field16778.Method7405(method26));
        Intrinsics.checkExpressionValueIsNotNull((Object)method27, "register(blocks.add(Sett\u2026etTitle(\"Pickaxe Only\")))");
        Field16780 = method27;
        final Class44 method28 = class1909.Method23(Class1909.Field16778.Method7405(new Class44("Multi Task", class1909, false)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method28, "register(blocks.add(Sett\u2026lti Task\", this, false)))");
        Field16781 = method28;
        Field16782 = class1909.Method23(Class1909.Field16778.Method7405(new Class44("Roof Interact", class1909, false)));
        Field16783 = class1909.Method23(Class1909.Field16778.Method7405(new Class44("Fast Break", class1909, false)));
        Field16784 = class1909.Method23(Class1909.Field16778.Method7405(new Class44("No Interact", class1909, false)));
        final Class1909 class1911 = class1909;
        final Class1996 field16779 = Class1909.Field16778;
        final Class44 method29 = new Class44("No Interact", class1909).Method313(Class1982.Field17121);
        Intrinsics.checkExpressionValueIsNotNull((Object)method29, "Setting(\"No Interact\", t\u2026oInteractVal.valBoolean }");
        Field16785 = class1911.Method24(field16779.Method7406(new Class1996(method29)));
        final Class44 method30 = class1909.Method23(Class1909.Field16778.Method7405(new Class44("Reach", class1909, false)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method30, "register(blocks.add(Sett\u2026g(\"Reach\", this, false)))");
        Field16786 = method30;
        final Class1909 class1912 = class1909;
        final Class1996 field16780 = Class1909.Field16778;
        final Class44 method31 = new Class44("Reach Distance", class1909, Double.longBitsToDouble((long)1777280307 ^ 0x4014000069EF2533L), 1.0, Double.longBitsToDouble((long)1373047572 ^ 0x4024000051D70B14L), true).Method313(Class2100.Field17560);
        Intrinsics.checkExpressionValueIsNotNull((Object)method31, "Setting(\"Reach Distance\"\u2026ible { reach.valBoolean }");
        final Class44 method32 = class1912.Method23(field16780.Method7405(method31));
        Intrinsics.checkExpressionValueIsNotNull((Object)method32, "register(blocks.add(Sett\u2026le { reach.valBoolean }))");
        Field16787 = method32;
        Field16788 = class1909.Method24(new Class1996(new Class44("Fast Use", class1909)));
        Field16789 = class1909.Method23(Class1909.Field16788.Method7405(new Class44("All", class1909, false)));
        final Class1909 class1913 = class1909;
        final Class1996 field16781 = Class1909.Field16788;
        final Class44 method33 = new Class44("Exp", class1909, false).Method313(Class806.Field11440);
        Intrinsics.checkExpressionValueIsNotNull((Object)method33, "Setting(\"Exp\", this, fal\u2026ble { !fuAll.valBoolean }");
        Field16790 = class1913.Method23(field16781.Method7405(method33));
        final Class1909 class1914 = class1909;
        final Class1996 field16782 = Class1909.Field16788;
        final Class44 method34 = new Class44("Obby", class1909, false).Method313(Class947.Field12042);
        Intrinsics.checkExpressionValueIsNotNull((Object)method34, "Setting(\"Obby\", this, fa\u2026ble { !fuAll.valBoolean }");
        Field16791 = class1914.Method23(field16782.Method7405(method34));
        final Class1909 class1915 = class1909;
        final Class1996 field16783 = Class1909.Field16788;
        final Class44 method35 = new Class44("EnderChest", class1909, false).Method313(Class765.Field11237);
        Intrinsics.checkExpressionValueIsNotNull((Object)method35, "Setting(\"EnderChest\", th\u2026ble { !fuAll.valBoolean }");
        Field16792 = class1915.Method23(field16783.Method7405(method35));
        final Class1909 class1916 = class1909;
        final Class1996 field16784 = Class1909.Field16788;
        final Class44 method36 = new Class44("Minecart", class1909, false).Method313(Class4.Field7830);
        Intrinsics.checkExpressionValueIsNotNull((Object)method36, "Setting(\"Minecart\", this\u2026ble { !fuAll.valBoolean }");
        Field16793 = class1916.Method23(field16784.Method7405(method36));
        final Class1909 class1917 = class1909;
        final Class1996 field16785 = Class1909.Field16788;
        final Class44 method37 = new Class44("Crystal", class1909, false).Method313(Class1938.Field16976);
        Intrinsics.checkExpressionValueIsNotNull((Object)method37, "Setting(\"Crystal\", this,\u2026ble { !fuAll.valBoolean }");
        Field16794 = class1917.Method23(field16785.Method7405(method37));
        final Class1996 method38 = class1909.Method24(new Class1996(new Class44("Entities", class1909)));
        if (method38 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingGroup");
        }
        Field16795 = method38;
        Field16796 = class1909.Method23(Class1909.Field16795.Method7405(new Class44("No Friend Damage", class1909, false)));
        Field16797 = class1909.Method24(Class1909.Field16785.Method7406(new Class1996(new Class44("Blocks", class1909))));
        final Class1909 class1918 = class1909;
        final Class1996 field16786 = Class1909.Field16797;
        final Class44 method39 = new Class44("NT Ender Chest", class1909, false).Method355("Ender Chest");
        Intrinsics.checkExpressionValueIsNotNull((Object)method39, "Setting(\"NT Ender Chest\"\u2026).setTitle(\"Ender Chest\")");
        Field16798 = class1918.Method23(field16786.Method7405(method39));
        final Class1909 class1919 = class1909;
        final Class1996 field16787 = Class1909.Field16797;
        final Class44 method40 = new Class44("NT Crafting Table", class1909, false).Method355("Craft");
        Intrinsics.checkExpressionValueIsNotNull((Object)method40, "Setting(\"NT Crafting Tab\u2026 false).setTitle(\"Craft\")");
        Field16799 = class1919.Method23(field16787.Method7405(method40));
        final Class1909 class1920 = class1909;
        final Class1996 field16788 = Class1909.Field16797;
        final Class44 method41 = new Class44("NT Chest", class1909, false).Method355("Chest");
        Intrinsics.checkExpressionValueIsNotNull((Object)method41, "Setting(\"NT Chest\", this, false).setTitle(\"Chest\")");
        Field16800 = class1920.Method23(field16788.Method7405(method41));
        final Class1909 class1921 = class1909;
        final Class1996 field16789 = Class1909.Field16797;
        final Class44 method42 = new Class44("NT Furnace", class1909, false).Method355("Furnace");
        Intrinsics.checkExpressionValueIsNotNull((Object)method42, "Setting(\"NT Furnace\", th\u2026alse).setTitle(\"Furnace\")");
        Field16801 = class1921.Method23(field16789.Method7405(method42));
        final Class1909 class1922 = class1909;
        final Class1996 field16790 = Class1909.Field16797;
        final Class44 method43 = new Class44("NT Anvil", class1909, false).Method355("Anvil");
        Intrinsics.checkExpressionValueIsNotNull((Object)method43, "Setting(\"NT Anvil\", this, false).setTitle(\"Anvil\")");
        Field16802 = class1922.Method23(field16790.Method7405(method43));
        final Class1909 class1923 = class1909;
        final Class1996 field16791 = Class1909.Field16797;
        final Class44 method44 = new Class44("NT Armor Stand", class1909, false).Method355("Armor Stand");
        Intrinsics.checkExpressionValueIsNotNull((Object)method44, "Setting(\"NT Armor Stand\"\u2026).setTitle(\"Armor Stand\")");
        Field16803 = class1923.Method23(field16791.Method7405(method44));
        final Class1909 class1924 = class1909;
        final Class1996 field16792 = Class1909.Field16797;
        final Class44 method45 = new Class44("NT Replace Packet", class1909, false).Method355("Replace Packet");
        Intrinsics.checkExpressionValueIsNotNull((Object)method45, "Setting(\"NT Replace Pack\u2026etTitle(\"Replace Packet\")");
        Field16804 = class1924.Method23(field16792.Method7405(method45));
        Class1909.Field16779.Method303((Supplier)Class1713.Field15907);
        Class1909.Field16786.Method303((Supplier)Class1716.Field15914);
        Field16806 = new Class618(Class784.Field11304, new Predicate[0]);
        Field16807 = new Class618((Class254)Class1659.Field15722, new Predicate[0]);
        Field16808 = new Class618(Class733.Field11108, new Predicate[0]);
    }
    
    public static final Minecraft Method7080() {
        return Class42.Field8052;
    }
    
    public static final void Method7081(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    public static final Class44 Method7082(final Class1909 class1909) {
        return Class1909.Field16779;
    }
    
    public static final Class44 Method7083(final Class1909 class1909) {
        return Class1909.Field16784;
    }
    
    public static final Class44 Method7084(final Class1909 class1909) {
        return Class1909.Field16789;
    }
    
    public static final Class44 Method7085(final Class1909 class1909) {
        return Class1909.Field16780;
    }
    
    public static final Class44 Method7086(final Class1909 class1909) {
        return Class1909.Field16803;
    }
    
    public static final Class44 Method7087(final Class1909 class1909) {
        return Class1909.Field16804;
    }
    
    public static final Class44 Method7088(final Class1909 class1909) {
        return Class1909.Field16798;
    }
    
    public static final Class44 Method7089(final Class1909 class1909) {
        return Class1909.Field16799;
    }
    
    public static final Class44 Method7090(final Class1909 class1909) {
        return Class1909.Field16800;
    }
    
    public static final Class44 Method7091(final Class1909 class1909) {
        return Class1909.Field16801;
    }
    
    public static final Class44 Method7092(final Class1909 class1909) {
        return Class1909.Field16802;
    }
    
    public static final Class44 Method7093(final Class1909 class1909) {
        return Class1909.Field16796;
    }
    
    public static final Class44 Method7094(final Class1909 class1909) {
        return Class1909.Field16782;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6866 ^ 0x63));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
