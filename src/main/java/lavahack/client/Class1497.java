//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraft.network.*;
import net.minecraft.network.play.client.*;
import net.minecraft.client.entity.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import com.kisman.cc.util.*;
import net.minecraft.init.*;
import kotlin.collections.*;
import java.util.*;
import java.util.stream.*;
import net.minecraft.block.state.*;
import java.util.function.*;
import net.minecraft.client.*;

@Class794
@Class2012
@Class1887
@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002?@B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020!H\u0002J\b\u0010\b\u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0002J\u0012\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(H\u0002J\u0012\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010*\u001a\u00020\rH\u0002J\u0012\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.H\u0002J \u0010/\u001a\u0012\u0012\u0004\u0012\u00020$00j\b\u0012\u0004\u0012\u00020$`12\u0006\u0010'\u001a\u00020(H\u0002J \u00102\u001a\u0002032\u0006\u00104\u001a\u00020$2\u0006\u00105\u001a\u0002032\u0006\u0010'\u001a\u00020(H\u0002J(\u00106\u001a\u0012\u0012\u0004\u0012\u00020$00j\b\u0012\u0004\u0012\u00020$`12\u0006\u00107\u001a\u00020(2\u0006\u00105\u001a\u000203H\u0002J\u0010\u00108\u001a\u00020!2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u00109\u001a\u00020!2\u0006\u0010:\u001a\u00020,H\u0002J\u0010\u0010;\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010<\u001a\u00020\u0017H\u0002J\b\u0010=\u001a\u00020!H\u0016J\b\u0010>\u001a\u00020!H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004?\u0006\u0002\n\u0000?\u0006A" }, d2 = { "Lcom/kisman/cc/features/module/combat/AutoCrystalPvP;", "Lcom/kisman/cc/features/module/Module;", "()V", "autoEat", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "autoEatGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "autoXP", "autoXPArmorPercent", "autoXPGroup", "autoXPMode", "Lcom/kisman/cc/settings/types/SettingEnum;", "Lcom/kisman/cc/features/module/combat/AutoCrystalPvP$AutoXPMode;", "autoXPOldSlot", "", "autoXPSilentDelay", "autoXPSilentTimer", "Lcom/kisman/cc/util/TimerUtils;", "autoXPSmart", "debug1", "debug2", "isEating", "", "lastIsMoving", "moveStateLogic", "targetIsUsingMultiPlace", "targetRange", "targets", "Lcom/kisman/cc/util/entity/TargetFinder;", "terrain", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "", "canPlace", "pos", "Lnet/minecraft/util/math/BlockPos;", "findSpot", "Lcom/kisman/cc/features/module/combat/autocrystalpvp/PlaceInfo;", "target", "Lnet/minecraft/entity/Entity;", "findSpotNew", "getAutoXPMode", "getHandOfItem", "Lnet/minecraft/util/EnumHand;", "item", "Lnet/minecraft/item/Item;", "getHoles", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getMaxTargetDamageFromHole", "", "hole", "range", "getPossibleHoles", "entity", "gotoSafeSpot", "handleAutoEat", "hand", "isBadPos", "isMoving", "onEnable", "update", "AutoXPMode", "MoveStateLogic", "kisman.cc" })
public final class Class1497 extends Class42
{
    private static final Class44 Field15014;
    private static final Class44 Field15015;
    private static final Class44 Field15016;
    private static final Class44 Field15017;
    private static final Class44 Field15018;
    private static final Class44 Field15019;
    private static final Class1996 Field15020;
    private static final Class44 Field15021;
    private static final Class44 Field15022;
    private static final Class1303 Field15023;
    private static final Class44 Field15024;
    private static final Class44 Field15025;
    private static final Class1996 Field15026;
    private static final Class44 Field15027;
    private static final Class411 Field15028;
    private static final Class61 Field15029;
    private static final Class650 Field15030;
    private static boolean Field15031;
    private static boolean Field15032;
    private static int Field15033;
    public static final Class1497 Field15034;
    private String Field15035 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method38() {
        super.Method38();
        Class1497.Field15028.Method2004();
        Class1497.Field15029.Method498();
        Class1497.Field15030.Method2801();
        Class1497.Field15031 = false;
        Class1497.Field15033 = -1;
        Class1497.Field15032 = false;
    }
    
    @Override
    public void Method45() {
        if (Method6011().player == null || Method6011().world == null || Method6011().player.isDead) {
            return;
        }
        Class1497.Field15029.Method499();
        final Class44 field15017 = Class1497.Field15017;
        Intrinsics.checkExpressionValueIsNotNull((Object)field15017, "debug2");
        if (field15017.Method365()) {
            System.out.println((Object)"Update 1");
        }
        if (Class1497.Field15029.Method496() != null) {
            final Class44 field15018 = Class1497.Field15017;
            Intrinsics.checkExpressionValueIsNotNull((Object)field15018, "debug2");
            if (field15018.Method365()) {
                System.out.println((Object)"Update 2");
            }
            Class1497.Field15028.Method2005(Class577.Field10465);
        }
    }
    
    private final void Method5997() {
        final Class44 field15027 = Class1497.Field15027;
        Intrinsics.checkExpressionValueIsNotNull((Object)field15027, "autoEat");
        if (field15027.Method365() && !this.Method6001()) {
            final Item GOLDEN_APPLE = Items.GOLDEN_APPLE;
            Intrinsics.checkExpressionValueIsNotNull((Object)GOLDEN_APPLE, "Items.GOLDEN_APPLE");
            EnumHand enumHand = this.Method6002(GOLDEN_APPLE);
            if (enumHand == null) {
                final int method116 = Class9.Method116(Items.GOLDEN_APPLE, 0, 9);
                if (method116 == -1) {
                    return;
                }
                Method6011().player.inventory.currentItem = method116;
                final Item GOLDEN_APPLE2 = Items.GOLDEN_APPLE;
                Intrinsics.checkExpressionValueIsNotNull((Object)GOLDEN_APPLE2, "Items.GOLDEN_APPLE");
                enumHand = this.Method6002(GOLDEN_APPLE2);
                if (enumHand == null) {
                    return;
                }
            }
            this.Method5998(enumHand);
        }
        else {
            Class1497.Field15032 = false;
        }
    }
    
    private final void Method5998(final EnumHand enumHand) {
        Method6011().playerController.processRightClick((EntityPlayer)Method6011().player, (World)Method6011().world, enumHand);
        Class1497.Field15032 = true;
    }
    
    private final void Method5999() {
        final Class44 field15021 = Class1497.Field15021;
        Intrinsics.checkExpressionValueIsNotNull((Object)field15021, "autoXP");
        if (field15021.Method365()) {
            final EntityPlayer entityPlayer = (EntityPlayer)Method6011().player;
            final Class44 field15022 = Class1497.Field15025;
            Intrinsics.checkExpressionValueIsNotNull((Object)field15022, "autoXPArmorPercent");
            if (Class9.Method137(entityPlayer, field15022.Method368())) {
                if (this.Method6000() == Class314.Field9329) {
                    Label_0262: {
                        if (Class1497.Field15031 && !this.Method6001()) {
                            Class1497.Field15033 = Method6011().player.inventory.currentItem;
                            final int method116 = Class9.Method116(Items.EXPERIENCE_BOTTLE, 0, 9);
                            if (method116 == -1) {
                                final Class44 field15023 = Class1497.Field15016;
                                Intrinsics.checkExpressionValueIsNotNull((Object)field15023, "debug1");
                                if (field15023.Method365()) {
                                    Class1393.Method5508("Initial-AI >> Auto-XP >> No xp in hotbar");
                                }
                            }
                            else {
                                Method6011().player.inventory.currentItem = method116;
                            }
                        }
                        else {
                            if (!Class1497.Field15031 && !this.Method6001()) {
                                final EntityPlayerSP player = Method6011().player;
                                Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
                                if (Intrinsics.areEqual((Object)player.getHeldItemMainhand().item, (Object)Items.EXPERIENCE_BOTTLE)) {
                                    final float rotationPitch = Method6011().player.rotationPitch;
                                    Method6011().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
                                    Method6011().player.rotationPitch = rotationPitch;
                                    break Label_0262;
                                }
                            }
                            if (!Class1497.Field15031 && this.Method6001() && Class1497.Field15033 != -1) {
                                Method6011().player.inventory.currentItem = Class1497.Field15033;
                            }
                        }
                    }
                    Class1497.Field15030.Method2801();
                }
                else if (!this.Method6001()) {
                    final Class650 field15024 = Class1497.Field15030;
                    final Class44 field15025 = Class1497.Field15024;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field15025, "autoXPSilentDelay");
                    if (field15024.Method2797(field15025.Method369())) {
                        Class1497.Field15030.Method2801();
                        final int method117 = Class9.Method116(Items.EXPERIENCE_BOTTLE, 0, 9);
                        if (method117 == -1) {
                            final Class44 field15026 = Class1497.Field15016;
                            Intrinsics.checkExpressionValueIsNotNull((Object)field15026, "debug1");
                            if (field15026.Method365()) {
                                Class1393.Method5508("Initial-AI >> Auto-XP >> No xp in hotbar");
                            }
                        }
                        else {
                            final int currentItem = Method6011().player.inventory.currentItem;
                            Method6011().player.inventory.currentItem = method117;
                            final float rotationPitch2 = Method6011().player.rotationPitch;
                            Method6011().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
                            Method6011().player.rotationPitch = rotationPitch2;
                            Method6011().player.inventory.currentItem = currentItem;
                        }
                    }
                }
            }
        }
        Class1497.Field15031 = this.Method6001();
    }
    
    private final Class314 Method6000() {
        final Class44 field15022 = Class1497.Field15022;
        Intrinsics.checkExpressionValueIsNotNull((Object)field15022, "autoXPSmart");
        return (Class314)(field15022.Method365() ? (Class1497.Field15032 ? Class314.Field9330 : Class314.Field9329) : Class1497.Field15023.Method341());
    }
    
    private final boolean Method6001() {
        final Class44 field15018 = Class1497.Field15018;
        Intrinsics.checkExpressionValueIsNotNull((Object)field15018, "moveStateLogic");
        return (field15018.Method341() == Class2115.Field17617) ? Class1917.Method7159() : Class1495.Method5990();
    }
    
    private final EnumHand Method6002(final Item item) {
        final EntityPlayerSP player = Method6011().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
        EnumHand main_HAND;
        if (Intrinsics.areEqual((Object)player.getHeldItemMainhand().item, (Object)item)) {
            main_HAND = EnumHand.MAIN_HAND;
        }
        else {
            final EntityPlayerSP player2 = Method6011().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
            main_HAND = (Intrinsics.areEqual((Object)player2.getHeldItemOffhand().item, (Object)item) ? EnumHand.OFF_HAND : null);
        }
        return main_HAND;
    }
    
    private final Class387 Method6003(final Entity entity) {
        final ArrayList<Class387> list = new ArrayList<Class387>();
        for (final BlockPos blockPos2 : Class2155.Method7756(entity, Float.intBitsToFloat(1086324736), true, false)) {
            final BlockPos blockPos = blockPos2;
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, "pos");
            if (Intrinsics.areEqual((Object)Class886.Method3703(blockPos2).getBlock(), (Object)Blocks.AIR)) {
                final BlockPos up = blockPos.up();
                Intrinsics.checkExpressionValueIsNotNull((Object)up, "pos.up()");
                if (!Intrinsics.areEqual((Object)Class886.Method3703(up).getBlock(), (Object)Blocks.AIR) || blockPos.getY() < 1 || this.Method6005(blockPos)) {
                    continue;
                }
                final ArrayList<Class387> list2 = list;
                final BlockPos blockPos3 = blockPos;
                final World world = (World)Method6011().world;
                final double n = blockPos.getX() + Double.longBitsToDouble((long)302001021 ^ 0x3FE0000012002B7DL);
                final double n2 = blockPos.getY();
                final double n3 = blockPos.getZ() + Double.longBitsToDouble((long)1712011939 ^ 0x3FE00000660B3AA3L);
                final Class44 field15014 = Class1497.Field15014;
                Intrinsics.checkExpressionValueIsNotNull((Object)field15014, "terrain");
                list2.add(new Class387(entity, blockPos3, Class2155.Method7759(world, n, n2, n3, entity, field15014.Method365())));
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        final ArrayList<Class387> list3 = list;
        final Comparator<Object> comparingDouble = Comparator.comparingDouble(Class664.Field10819);
        Intrinsics.checkExpressionValueIsNotNull((Object)comparingDouble, "Comparator.comparingDoub\u2026 { it.damage.toDouble() }");
        CollectionsKt.sortWith((List)list3, (Comparator)comparingDouble);
        return list.get(0);
    }
    
    private final void Method6004(final Entity entity) {
        final Class387 method6007 = this.Method6007(entity);
        final Class44 field15017 = Class1497.Field15017;
        Intrinsics.checkExpressionValueIsNotNull((Object)field15017, "debug2");
        if (field15017.Method365()) {
            System.out.println((Object)("Spot != null is " + (method6007 != null)));
        }
        if (method6007 == null) {
            final Class44 field15018 = Class1497.Field15016;
            Intrinsics.checkExpressionValueIsNotNull((Object)field15018, "debug1");
            if (field15018.Method365()) {
                Class1393.Method5508("Initial-AI >> No safe spot found.");
            }
        }
        else {
            final BlockPos method6008 = method6007.Method1866();
            Class1495.Method5986(method6008);
            final Class44 field15019 = Class1497.Field15016;
            Intrinsics.checkExpressionValueIsNotNull((Object)field15019, "debug1");
            if (field15019.Method365()) {
                Class1393.Method5508("Initial-AI >> Going to " + method6008.getX() + ", " + method6008.getY() + ", " + method6008.getZ());
            }
        }
    }
    
    private final boolean Method6005(final BlockPos blockPos) {
        final BlockPos north = blockPos.north();
        Intrinsics.checkExpressionValueIsNotNull((Object)north, "pos.north()");
        if (!this.Method6006(north)) {
            final BlockPos east = blockPos.east();
            Intrinsics.checkExpressionValueIsNotNull((Object)east, "pos.east()");
            if (!this.Method6006(east)) {
                final BlockPos west = blockPos.west();
                Intrinsics.checkExpressionValueIsNotNull((Object)west, "pos.west()");
                if (!this.Method6006(west)) {
                    final BlockPos south = blockPos.south();
                    Intrinsics.checkExpressionValueIsNotNull((Object)south, "pos.south()");
                    if (!this.Method6006(south)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    private final boolean Method6006(final BlockPos blockPos) {
        return Class2155.Method7755(blockPos, true, true, Class1497.Field15015.Method365(), true);
    }
    
    private final Class387 Method6007(final Entity entity) {
        final ArrayList<Class387> list = new ArrayList<Class387>();
        double longBitsToDouble = Double.longBitsToDouble((long)2029359978 ^ 0x3FE0000078F5936AL);
        for (final BlockPos blockPos2 : this.Method6009(entity)) {
            final BlockPos blockPos = blockPos2;
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, "hole");
            final float method6008 = this.Method6008(blockPos2, Float.intBitsToFloat(1086324736), entity);
            if (method6008 > longBitsToDouble) {
                longBitsToDouble = method6008;
                list.add(new Class387(entity, blockPos, method6008));
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        final ArrayList<Class387> list2 = list;
        final Comparator<Object> comparingDouble = Comparator.comparingDouble(Class724.Field11083);
        Intrinsics.checkExpressionValueIsNotNull((Object)comparingDouble, "Comparator.comparingDoub\u2026 { it.damage.toDouble() }");
        CollectionsKt.sortWith((List)list2, (Comparator)comparingDouble);
        return list.get(0);
    }
    
    private final float Method6008(final BlockPos blockPos, final float n, final Entity entity) {
        double longBitsToDouble = Double.longBitsToDouble(4602678819172646912L);
        for (final BlockPos blockPos2 : Class394.Method1946(blockPos, n, (int)n + 1, false, true, 0)) {
            final World world = (World)Method6011().world;
            final BlockPos blockPos3 = blockPos2;
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, "pos");
            final double n2 = blockPos3.getX() + Double.longBitsToDouble((long)618989735 ^ 0x3FE0000024E508A7L);
            final double n3 = blockPos2.getY();
            final double n4 = blockPos2.getZ() + Double.longBitsToDouble(4602678819172646912L);
            final Class44 field15014 = Class1497.Field15014;
            Intrinsics.checkExpressionValueIsNotNull((Object)field15014, "terrain");
            final float method7759 = Class2155.Method7759(world, n2, n3, n4, entity, field15014.Method365());
            if (method7759 > longBitsToDouble) {
                longBitsToDouble = method7759;
            }
        }
        return (float)longBitsToDouble;
    }
    
    private final ArrayList Method6009(final Entity entity) {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        for (final BlockPos e : this.Method6010(entity, Float.intBitsToFloat(1086324736))) {
            final Class1862 method7131 = Class1914.Method7131(e, false, true);
            Intrinsics.checkExpressionValueIsNotNull((Object)method7131, "info");
            if (method7131.Method6959() == Class422.Field9771) {
                continue;
            }
            list.add(e);
        }
        return list;
    }
    
    private final ArrayList Method6010(final Entity entity, final float n) {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>(64);
        for (final BlockPos e : (List<Object>)Class394.Method1946(entity.getPosition(), n, (int)n + 1, false, true, 0).stream().sorted((Comparator)Class1261.Field13708).collect(Collectors.toList())) {
            final IBlockState getBlockState = Method6011().world.getBlockState(e);
            Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState, "mc.world.getBlockState(pos)");
            if (Intrinsics.areEqual((Object)getBlockState.getBlock(), (Object)Blocks.AIR) ^ true) {
                continue;
            }
            final IBlockState getBlockState2 = Method6011().world.getBlockState(e.add(0, -1, 0));
            Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState2, "mc.world.getBlockState(pos.add(0, -1, 0))");
            if (Intrinsics.areEqual((Object)getBlockState2.getBlock(), (Object)Blocks.AIR)) {
                continue;
            }
            final IBlockState getBlockState3 = Method6011().world.getBlockState(e.add(0, 1, 0));
            Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState3, "mc.world.getBlockState(pos.add(0, 1, 0))");
            if (Intrinsics.areEqual((Object)getBlockState3.getBlock(), (Object)Blocks.AIR) ^ true) {
                continue;
            }
            final IBlockState getBlockState4 = Method6011().world.getBlockState(e.add(0, 2, 0));
            Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState4, "mc.world.getBlockState(pos.add(0, 2, 0))");
            if (!Intrinsics.areEqual((Object)getBlockState4.getBlock(), (Object)Blocks.AIR)) {
                continue;
            }
            list.add(e);
        }
        return list;
    }
    
    private Class1497() {
        super("AutoCrystalPvP", "crystal pvp go brr", Class97.Field8338);
    }
    
    static {
        final Class1497 class1497 = Field15034 = new Class1497();
        Field15014 = class1497.Method23(new Class44("Terrain", class1497, true));
        Field15015 = new Class44("Target Is Using Multi Place", class1497, false);
        Field15016 = class1497.Method23(new Class44("Debug 1", class1497, false));
        Field15017 = class1497.Method23(new Class44("Debug 2", class1497, false));
        Field15018 = class1497.Method23(new Class44("Move State Logic", class1497, Class2115.Field17617));
        Field15019 = class1497.Method23(new Class44("Range", class1497, Double.longBitsToDouble((long)1079343196 ^ 0x404900004055785CL), 1.0, Double.longBitsToDouble(4636737291354636288L), true));
        Field15020 = class1497.Method24(new Class1996(new Class44("Auto XP", class1497)));
        final Class1497 class1498 = class1497;
        final Class1996 field15020 = Class1497.Field15020;
        final Class44 method355 = new Class44("Auto XP", class1497, false).Method355("State");
        Intrinsics.checkExpressionValueIsNotNull((Object)method355, "Setting(\"Auto XP\", this, false).setTitle(\"State\")");
        Field15021 = class1498.Method23(field15020.Method7405(method355));
        final Class1497 class1499 = class1497;
        final Class1996 field15021 = Class1497.Field15020;
        final Class44 method356 = new Class44("Auto XP Smart", class1497, false).Method355("Smart");
        Intrinsics.checkExpressionValueIsNotNull((Object)method356, "Setting(\"Auto XP Smart\",\u2026 false).setTitle(\"Smart\")");
        Field15022 = class1499.Method23(field15021.Method7405(method356));
        final Class1303 method357 = new Class1303("Auto XP Mode", (Class42)class1497, (Enum)Class314.Field9329).Method5300("Mode");
        final Class1996 field15022 = Class1497.Field15020;
        Intrinsics.checkExpressionValueIsNotNull((Object)field15022, "autoXPGroup");
        Field15023 = method357.Method5304(field15022).Method5303();
        final Class1497 class1500 = class1497;
        final Class1996 field15023 = Class1497.Field15020;
        final Class44 method358 = new Class44("Auto Xp Silent Delay", class1497, Double.longBitsToDouble(4636737291354636288L), 0.0, Double.longBitsToDouble((long)1955345823 ^ 0x408F4000748C359FL), Class467.Field9943).Method355("Silent Delay");
        Intrinsics.checkExpressionValueIsNotNull((Object)method358, "Setting(\"Auto Xp Silent \u2026.setTitle(\"Silent Delay\")");
        Field15024 = class1500.Method23(field15023.Method7405(method358));
        final Class1497 class1501 = class1497;
        final Class1996 field15024 = Class1497.Field15020;
        final Class44 method359 = new Class44("Auto XP Armor Percent", class1497, Double.longBitsToDouble(4632233691727265792L), 0.0, Double.longBitsToDouble((long)1956246685 ^ 0x405900007499F49DL), Class467.Field9942).Method355("Armor Percent");
        Intrinsics.checkExpressionValueIsNotNull((Object)method359, "Setting(\"Auto XP Armor P\u2026setTitle(\"Armor Percent\")");
        Field15025 = class1501.Method23(field15024.Method7405(method359));
        Field15026 = class1497.Method24(new Class1996(new Class44("Auto Eat", class1497)));
        final Class1497 class1502 = class1497;
        final Class1996 field15025 = Class1497.Field15026;
        final Class44 method360 = new Class44("Auto Eat", class1497, false).Method355("State");
        Intrinsics.checkExpressionValueIsNotNull((Object)method360, "Setting(\"Auto Eat\", this, false).setTitle(\"State\")");
        Field15027 = class1502.Method23(field15025.Method7405(method360));
        Field15028 = new Class411(class1497).Method2003();
        final Class44 field15026 = Class1497.Field15019;
        Intrinsics.checkExpressionValueIsNotNull((Object)field15026, "targetRange");
        final Supplier method361 = field15026.Method393();
        Intrinsics.checkExpressionValueIsNotNull((Object)method361, "targetRange.supplierDouble");
        Field15029 = new Class61(method361, Class1497.Field15028);
        Field15030 = new Class650();
        Class1497.Field15033 = -1;
        class1497.Method44((Supplier)Class1423.Field14620);
    }
    
    public static final Minecraft Method6011() {
        return Class42.Field8052;
    }
    
    public static final void Method6012(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    public static final Class44 Method6013(final Class1497 class1497) {
        return Class1497.Field15017;
    }
    
    public static final void Method6014(final Class1497 class1497, final Entity entity) {
        class1497.Method6004(entity);
    }
    
    public static final Class61 Method6015(final Class1497 class1497) {
        return Class1497.Field15029;
    }
    
    public static final void Method6016(final Class1497 class1497) {
        class1497.Method5999();
    }
    
    public static final void Method6017(final Class1497 class1497) {
        class1497.Method5997();
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x11FF ^ 0x14));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
