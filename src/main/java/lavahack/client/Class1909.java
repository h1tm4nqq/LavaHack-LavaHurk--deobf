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
import lavahack.client.Class1023;
import lavahack.client.Class1414;
import lavahack.client.Class1486;
import lavahack.client.Class1659;
import lavahack.client.Class1713;
import lavahack.client.Class1716;
import lavahack.client.Class1796;
import lavahack.client.Class1938;
import lavahack.client.Class1982;
import lavahack.client.Class1996;
import lavahack.client.Class2100;
import lavahack.client.Class254;
import lavahack.client.Class4;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class618;
import lavahack.client.Class733;
import lavahack.client.Class765;
import lavahack.client.Class784;
import lavahack.client.Class806;
import lavahack.client.Class947;
import lavahack.client.Class97;
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
public final class Class1909
extends Class42 {
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
        Class1796.Field16242.Method706(Field16807);
        Class1796.Field16242.Method706(Field16808);
        Class1796.Field16242.Method706(Field16806);
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(Field16806);
        Class1796.Field16242.Method711(Field16808);
        Class1796.Field16242.Method711(Field16807);
    }

    @Override
    public void Method45() {
        if (Class1909.Method7080().player == null) return;
        if (Class1909.Method7080().world == null) {
            return;
        }
        this.Method7079();
        this.Method7078();
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method7077(@NotNull @NotNull PlayerInteractEvent.LeftClickBlock leftClickBlock) {
        Intrinsics.checkParameterIsNotNull((Object)leftClickBlock, (String)"event");
        Class44 class44 = Field16783;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"fastBreak");
        if (!class44.Method365()) return;
        if (!(Class1909.Method7080().playerController.curBlockDamageMP + Class1486.Method5947(leftClickBlock.getPos()) >= 1.0f)) return;
        Class1909.Method7080().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, leftClickBlock.getPos(), Class1909.Method7080().objectMouseOver.sideHit));
    }

    private final void Method7078() {
        Class44 class44 = Field16777;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"iPacketCrystal");
        if (!class44.Method365()) return;
        KeyBinding keyBinding = Class1909.Method7080().gameSettings.keyBindUseItem;
        Intrinsics.checkExpressionValueIsNotNull((Object)keyBinding, (String)"mc.gameSettings.keyBindUseItem");
        if (!keyBinding.isKeyDown()) return;
        EntityPlayerSP entityPlayerSP = Class1909.Method7080().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (!Intrinsics.areEqual((Object)entityPlayerSP.getHeldItemMainhand().item, (Object)Items.END_CRYSTAL)) {
            EntityPlayerSP entityPlayerSP2 = Class1909.Method7080().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
            if (!Intrinsics.areEqual((Object)entityPlayerSP2.getHeldItemOffhand().item, (Object)Items.END_CRYSTAL)) return;
        }
        RayTraceResult rayTraceResult = Class1909.Method7080().objectMouseOver;
        if (rayTraceResult == null) return;
        RayTraceResult rayTraceResult2 = rayTraceResult;
        RayTraceResult.Type type = rayTraceResult2.typeOfHit;
        if (type == null) {
            Intrinsics.throwNpe();
        }
        switch (Class1023.Field12475[type.ordinal()]) {
            case 1: {
                Field16805 = null;
                return;
            }
            case 2: {
                RayTraceResult rayTraceResult3 = Class1909.Method7080().objectMouseOver;
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
                if (Intrinsics.areEqual((Object)Field16805, (Object)new BlockPos(entity.posX, entity.posY - 1.0, entity.posZ)) ^ true) {
                    return;
                }
                NetHandlerPlayClient netHandlerPlayClient = Class1909.Method7080().player.connection;
                BlockPos blockPos = Field16805;
                if (blockPos == null) {
                    Intrinsics.throwNpe();
                }
                EntityPlayerSP entityPlayerSP3 = Class1909.Method7080().player;
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
                            Class44 class44 = Field16789;
                            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"fuAll");
                            if (class44.Method365()) break block2;
                            EntityPlayerSP entityPlayerSP = Class1909.Method7080().player;
                            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                            if (!Intrinsics.areEqual((Object)entityPlayerSP.getHeldItemMainhand().item, (Object)Items.EXPERIENCE_BOTTLE)) break block3;
                            Class44 class442 = Field16790;
                            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"fuExp");
                            if (class442.Method365()) break block2;
                        }
                        EntityPlayerSP entityPlayerSP = Class1909.Method7080().player;
                        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                        if (!Intrinsics.areEqual((Object)entityPlayerSP.getHeldItemMainhand().item, (Object)ItemBlock.getItemFromBlock((Block)Blocks.OBSIDIAN))) break block4;
                        Class44 class44 = Field16791;
                        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"fuObby");
                        if (class44.Method365()) break block2;
                    }
                    EntityPlayerSP entityPlayerSP = Class1909.Method7080().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                    if (!Intrinsics.areEqual((Object)entityPlayerSP.getHeldItemMainhand().item, (Object)ItemBlock.getItemFromBlock((Block)Blocks.ENDER_CHEST))) break block5;
                    Class44 class44 = Field16792;
                    Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"fuEnderChest");
                    if (class44.Method365()) break block2;
                }
                EntityPlayerSP entityPlayerSP = Class1909.Method7080().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                if (!Intrinsics.areEqual((Object)entityPlayerSP.getHeldItemMainhand().item, (Object)Items.MINECART)) break block6;
                Class44 class44 = Field16793;
                Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"fuMinecart");
                if (class44.Method365()) break block2;
            }
            EntityPlayerSP entityPlayerSP = Class1909.Method7080().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
            if (!Intrinsics.areEqual((Object)entityPlayerSP.getHeldItemMainhand().item, (Object)Items.END_CRYSTAL)) return;
            Class44 class44 = Field16794;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"fuCrystal");
            if (!class44.Method365()) return;
        }
        Class1909.Method7080().rightClickDelayTimer = 0;
    }

    private Class1909() {
        super("Interaction", "NoMiningTrace + MultiTask + RoofInteract + FastUse + NoFriendDamage", Class97.Field8341);
    }

    static {
        Class1909 class1909;
        Field16809 = class1909 = new Class1909();
        Field16776 = class1909.Method24(new Class1996(new Class44("Items", class1909)));
        Field16777 = class1909.Method23(Field16776.Method7405(new Class44("Packet Crystal", (Class42)class1909, false)));
        Class1996 class1996 = class1909.Method24(new Class1996(new Class44("Blocks", class1909)));
        if (class1996 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingGroup");
        }
        Field16778 = class1996;
        Class44 class44 = class1909.Method23(Field16778.Method7405(new Class44("No Mining Trace", (Class42)class1909, false)));
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"register(blocks.add(Sett\u2026ng Trace\", this, false)))");
        Field16779 = class44;
        Class44 class442 = new Class44("NMT Pickaxe Only", (Class42)class1909, false).Method313(Class1414.Field14420).Method355("Pickaxe Only");
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"Setting(\"NMT Pickaxe Onl\u2026.setTitle(\"Pickaxe Only\")");
        Class44 class443 = class1909.Method23(Field16778.Method7405(class442));
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"register(blocks.add(Sett\u2026etTitle(\"Pickaxe Only\")))");
        Field16780 = class443;
        Class44 class444 = class1909.Method23(Field16778.Method7405(new Class44("Multi Task", (Class42)class1909, false)));
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"register(blocks.add(Sett\u2026lti Task\", this, false)))");
        Field16781 = class444;
        Field16782 = class1909.Method23(Field16778.Method7405(new Class44("Roof Interact", (Class42)class1909, false)));
        Field16783 = class1909.Method23(Field16778.Method7405(new Class44("Fast Break", (Class42)class1909, false)));
        Field16784 = class1909.Method23(Field16778.Method7405(new Class44("No Interact", (Class42)class1909, false)));
        Class44 class445 = new Class44("No Interact", class1909).Method313(Class1982.Field17121);
        Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"Setting(\"No Interact\", t\u2026oInteractVal.valBoolean }");
        Field16785 = class1909.Method24(Field16778.Method7406(new Class1996(class445)));
        Class44 class446 = class1909.Method23(Field16778.Method7405(new Class44("Reach", (Class42)class1909, false)));
        Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"register(blocks.add(Sett\u2026g(\"Reach\", this, false)))");
        Field16786 = class446;
        Class44 class447 = new Class44("Reach Distance", (Class42)class1909, Double.longBitsToDouble((long)1777280307 ^ 0x4014000069EF2533L), 1.0, Double.longBitsToDouble((long)1373047572 ^ 0x4024000051D70B14L), true).Method313(Class2100.Field17560);
        Intrinsics.checkExpressionValueIsNotNull((Object)class447, (String)"Setting(\"Reach Distance\"\u2026ible { reach.valBoolean }");
        Class44 class448 = class1909.Method23(Field16778.Method7405(class447));
        Intrinsics.checkExpressionValueIsNotNull((Object)class448, (String)"register(blocks.add(Sett\u2026le { reach.valBoolean }))");
        Field16787 = class448;
        Field16788 = class1909.Method24(new Class1996(new Class44("Fast Use", class1909)));
        Field16789 = class1909.Method23(Field16788.Method7405(new Class44("All", (Class42)class1909, false)));
        Class44 class449 = new Class44("Exp", (Class42)class1909, false).Method313(Class806.Field11440);
        Intrinsics.checkExpressionValueIsNotNull((Object)class449, (String)"Setting(\"Exp\", this, fal\u2026ble { !fuAll.valBoolean }");
        Field16790 = class1909.Method23(Field16788.Method7405(class449));
        Class44 class4410 = new Class44("Obby", (Class42)class1909, false).Method313(Class947.Field12042);
        Intrinsics.checkExpressionValueIsNotNull((Object)class4410, (String)"Setting(\"Obby\", this, fa\u2026ble { !fuAll.valBoolean }");
        Field16791 = class1909.Method23(Field16788.Method7405(class4410));
        Class44 class4411 = new Class44("EnderChest", (Class42)class1909, false).Method313(Class765.Field11237);
        Intrinsics.checkExpressionValueIsNotNull((Object)class4411, (String)"Setting(\"EnderChest\", th\u2026ble { !fuAll.valBoolean }");
        Field16792 = class1909.Method23(Field16788.Method7405(class4411));
        Class44 class4412 = new Class44("Minecart", (Class42)class1909, false).Method313(Class4.Field7830);
        Intrinsics.checkExpressionValueIsNotNull((Object)class4412, (String)"Setting(\"Minecart\", this\u2026ble { !fuAll.valBoolean }");
        Field16793 = class1909.Method23(Field16788.Method7405(class4412));
        Class44 class4413 = new Class44("Crystal", (Class42)class1909, false).Method313(Class1938.Field16976);
        Intrinsics.checkExpressionValueIsNotNull((Object)class4413, (String)"Setting(\"Crystal\", this,\u2026ble { !fuAll.valBoolean }");
        Field16794 = class1909.Method23(Field16788.Method7405(class4413));
        Class1996 class19962 = class1909.Method24(new Class1996(new Class44("Entities", class1909)));
        if (class19962 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.types.SettingGroup");
        }
        Field16795 = class19962;
        Field16796 = class1909.Method23(Field16795.Method7405(new Class44("No Friend Damage", (Class42)class1909, false)));
        Field16797 = class1909.Method24(Field16785.Method7406(new Class1996(new Class44("Blocks", class1909))));
        Class44 class4414 = new Class44("NT Ender Chest", (Class42)class1909, false).Method355("Ender Chest");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4414, (String)"Setting(\"NT Ender Chest\"\u2026).setTitle(\"Ender Chest\")");
        Field16798 = class1909.Method23(Field16797.Method7405(class4414));
        Class44 class4415 = new Class44("NT Crafting Table", (Class42)class1909, false).Method355("Craft");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4415, (String)"Setting(\"NT Crafting Tab\u2026 false).setTitle(\"Craft\")");
        Field16799 = class1909.Method23(Field16797.Method7405(class4415));
        Class44 class4416 = new Class44("NT Chest", (Class42)class1909, false).Method355("Chest");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4416, (String)"Setting(\"NT Chest\", this, false).setTitle(\"Chest\")");
        Field16800 = class1909.Method23(Field16797.Method7405(class4416));
        Class44 class4417 = new Class44("NT Furnace", (Class42)class1909, false).Method355("Furnace");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4417, (String)"Setting(\"NT Furnace\", th\u2026alse).setTitle(\"Furnace\")");
        Field16801 = class1909.Method23(Field16797.Method7405(class4417));
        Class44 class4418 = new Class44("NT Anvil", (Class42)class1909, false).Method355("Anvil");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4418, (String)"Setting(\"NT Anvil\", this, false).setTitle(\"Anvil\")");
        Field16802 = class1909.Method23(Field16797.Method7405(class4418));
        Class44 class4419 = new Class44("NT Armor Stand", (Class42)class1909, false).Method355("Armor Stand");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4419, (String)"Setting(\"NT Armor Stand\"\u2026).setTitle(\"Armor Stand\")");
        Field16803 = class1909.Method23(Field16797.Method7405(class4419));
        Class44 class4420 = new Class44("NT Replace Packet", (Class42)class1909, false).Method355("Replace Packet");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4420, (String)"Setting(\"NT Replace Pack\u2026etTitle(\"Replace Packet\")");
        Field16804 = class1909.Method23(Field16797.Method7405(class4420));
        Field16779.Method303(Class1713.Field15907);
        Field16786.Method303(Class1716.Field15914);
        Field16806 = new Class618((Class254)Class784.Field11304, new Predicate[0]);
        Field16807 = new Class618((Class254)Class1659.Field15722, new Predicate[0]);
        Field16808 = new Class618((Class254)Class733.Field11108, new Predicate[0]);
    }

    public static final Minecraft Method7080() {
        return Class42.Field8052;
    }

    public static final void Method7081(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    public static final Class44 Method7082(Class1909 class1909) {
        Class1909 class19092 = class1909;
        return Field16779;
    }

    public static final Class44 Method7083(Class1909 class1909) {
        Class1909 class19092 = class1909;
        return Field16784;
    }

    public static final Class44 Method7084(Class1909 class1909) {
        Class1909 class19092 = class1909;
        return Field16789;
    }

    public static final Class44 Method7085(Class1909 class1909) {
        Class1909 class19092 = class1909;
        return Field16780;
    }

    public static final Class44 Method7086(Class1909 class1909) {
        Class1909 class19092 = class1909;
        return Field16803;
    }

    public static final Class44 Method7087(Class1909 class1909) {
        Class1909 class19092 = class1909;
        return Field16804;
    }

    public static final Class44 Method7088(Class1909 class1909) {
        Class1909 class19092 = class1909;
        return Field16798;
    }

    public static final Class44 Method7089(Class1909 class1909) {
        Class1909 class19092 = class1909;
        return Field16799;
    }

    public static final Class44 Method7090(Class1909 class1909) {
        Class1909 class19092 = class1909;
        return Field16800;
    }

    public static final Class44 Method7091(Class1909 class1909) {
        Class1909 class19092 = class1909;
        return Field16801;
    }

    public static final Class44 Method7092(Class1909 class1909) {
        Class1909 class19092 = class1909;
        return Field16802;
    }

    public static final Class44 Method7093(Class1909 class1909) {
        Class1909 class19092 = class1909;
        return Field16796;
    }

    public static final Class44 Method7094(Class1909 class1909) {
        Class1909 class19092 = class1909;
        return Field16782;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 99;
            cArray2[n] = (char)(cArray[n] ^ (0x6866 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

