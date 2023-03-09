//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItem
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import com.kisman.cc.util.Class886;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1261;
import lavahack.client.Class1303;
import lavahack.client.Class1393;
import lavahack.client.Class1423;
import lavahack.client.Class1495;
import lavahack.client.Class1862;
import lavahack.client.Class1887;
import lavahack.client.Class1914;
import lavahack.client.Class1917;
import lavahack.client.Class1996;
import lavahack.client.Class2012;
import lavahack.client.Class2115;
import lavahack.client.Class2155;
import lavahack.client.Class314;
import lavahack.client.Class387;
import lavahack.client.Class394;
import lavahack.client.Class411;
import lavahack.client.Class42;
import lavahack.client.Class422;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class577;
import lavahack.client.Class61;
import lavahack.client.Class664;
import lavahack.client.Class724;
import lavahack.client.Class794;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@Class794
@Class2012
@Class1887
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002?@B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020!H\u0002J\b\u0010\b\u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0002J\u0012\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(H\u0002J\u0012\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010*\u001a\u00020\rH\u0002J\u0012\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.H\u0002J \u0010/\u001a\u0012\u0012\u0004\u0012\u00020$00j\b\u0012\u0004\u0012\u00020$`12\u0006\u0010'\u001a\u00020(H\u0002J \u00102\u001a\u0002032\u0006\u00104\u001a\u00020$2\u0006\u00105\u001a\u0002032\u0006\u0010'\u001a\u00020(H\u0002J(\u00106\u001a\u0012\u0012\u0004\u0012\u00020$00j\b\u0012\u0004\u0012\u00020$`12\u0006\u00107\u001a\u00020(2\u0006\u00105\u001a\u000203H\u0002J\u0010\u00108\u001a\u00020!2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u00109\u001a\u00020!2\u0006\u0010:\u001a\u00020,H\u0002J\u0010\u0010;\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010<\u001a\u00020\u0017H\u0002J\b\u0010=\u001a\u00020!H\u0016J\b\u0010>\u001a\u00020!H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2={"Lcom/kisman/cc/features/module/combat/AutoCrystalPvP;", "Lcom/kisman/cc/features/module/Module;", "()V", "autoEat", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "autoEatGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "autoXP", "autoXPArmorPercent", "autoXPGroup", "autoXPMode", "Lcom/kisman/cc/settings/types/SettingEnum;", "Lcom/kisman/cc/features/module/combat/AutoCrystalPvP$AutoXPMode;", "autoXPOldSlot", "", "autoXPSilentDelay", "autoXPSilentTimer", "Lcom/kisman/cc/util/TimerUtils;", "autoXPSmart", "debug1", "debug2", "isEating", "", "lastIsMoving", "moveStateLogic", "targetIsUsingMultiPlace", "targetRange", "targets", "Lcom/kisman/cc/util/entity/TargetFinder;", "terrain", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "", "canPlace", "pos", "Lnet/minecraft/util/math/BlockPos;", "findSpot", "Lcom/kisman/cc/features/module/combat/autocrystalpvp/PlaceInfo;", "target", "Lnet/minecraft/entity/Entity;", "findSpotNew", "getAutoXPMode", "getHandOfItem", "Lnet/minecraft/util/EnumHand;", "item", "Lnet/minecraft/item/Item;", "getHoles", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getMaxTargetDamageFromHole", "", "hole", "range", "getPossibleHoles", "entity", "gotoSafeSpot", "handleAutoEat", "hand", "isBadPos", "isMoving", "onEnable", "update", "AutoXPMode", "MoveStateLogic", "kisman.cc"})
public final class Class1497
extends Class42 {
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
        Field15028.Method2004();
        Field15029.Method498();
        Field15030.Method2801();
        Field15031 = false;
        Field15033 = -1;
        Field15032 = false;
    }

    @Override
    public void Method45() {
        boolean bl;
        String string;
        if (Class1497.Method6011().player == null) return;
        if (Class1497.Method6011().world == null) return;
        if (Class1497.Method6011().player.isDead) {
            return;
        }
        Field15029.Method499();
        Class44 class44 = Field15017;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"debug2");
        if (class44.Method365()) {
            string = "Update 1";
            bl = false;
            System.out.println((Object)string);
        }
        if (Field15029.Method496() == null) return;
        Class44 class442 = Field15017;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"debug2");
        if (class442.Method365()) {
            string = "Update 2";
            bl = false;
            System.out.println((Object)string);
        }
        Field15028.Method2005(Class577.Field10465);
    }

    private final void Method5997() {
        Class44 class44 = Field15027;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"autoEat");
        if (class44.Method365() && !this.Method6001()) {
            Item item = Items.GOLDEN_APPLE;
            Intrinsics.checkExpressionValueIsNotNull((Object)item, (String)"Items.GOLDEN_APPLE");
            EnumHand enumHand = this.Method6002(item);
            if (enumHand == null) {
                int n = Class9.Method116(Items.GOLDEN_APPLE, 0, 9);
                if (n == -1) {
                    return;
                }
                Class1497.Method6011().player.inventory.currentItem = n;
                Item item2 = Items.GOLDEN_APPLE;
                Intrinsics.checkExpressionValueIsNotNull((Object)item2, (String)"Items.GOLDEN_APPLE");
                enumHand = this.Method6002(item2);
                if (enumHand == null) {
                    return;
                }
            }
            this.Method5998(enumHand);
            return;
        }
        Field15032 = false;
    }

    private final void Method5998(EnumHand enumHand) {
        Class1497.Method6011().playerController.processRightClick((EntityPlayer)Class1497.Method6011().player, (World)Class1497.Method6011().world, enumHand);
        Field15032 = true;
    }

    /*
     * Unable to fully structure code
     */
    private final void Method5999() {
        block11: {
            block12: {
                block14: {
                    block13: {
                        v0 = Class1497.Field15021;
                        Intrinsics.checkExpressionValueIsNotNull((Object)v0, (String)"autoXP");
                        if (!v0.Method365()) break block11;
                        v1 = (EntityPlayer)Class1497.Method6011().player;
                        v2 = Class1497.Field15025;
                        Intrinsics.checkExpressionValueIsNotNull((Object)v2, (String)"autoXPArmorPercent");
                        if (!Class9.Method137(v1, v2.Method368())) break block11;
                        if (this.Method6000() != Class314.Field9329) break block12;
                        if (!Class1497.Field15031 || this.Method6001()) break block13;
                        Class1497.Field15033 = Class1497.Method6011().player.inventory.currentItem;
                        var1_1 = Class9.Method116(Items.EXPERIENCE_BOTTLE, 0, 9);
                        if (var1_1 == -1) {
                            v3 = Class1497.Field15016;
                            Intrinsics.checkExpressionValueIsNotNull((Object)v3, (String)"debug1");
                            if (v3.Method365()) {
                                Class1393.Method5508("Initial-AI >> Auto-XP >> No xp in hotbar");
                            }
                        } else {
                            Class1497.Method6011().player.inventory.currentItem = var1_1;
                        }
                        break block14;
                    }
                    if (Class1497.Field15031 || this.Method6001()) ** GOTO lbl-1000
                    v4 = Class1497.Method6011().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)v4, (String)"mc.player");
                    if (Intrinsics.areEqual((Object)v4.getHeldItemMainhand().item, (Object)Items.EXPERIENCE_BOTTLE)) {
                        var1_2 = Class1497.Method6011().player.rotationPitch;
                        Class1497.Method6011().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
                        Class1497.Method6011().player.rotationPitch = var1_2;
                    } else if (!Class1497.Field15031 && this.Method6001() && Class1497.Field15033 != -1) {
                        Class1497.Method6011().player.inventory.currentItem = Class1497.Field15033;
                    }
                }
                Class1497.Field15030.Method2801();
                break block11;
            }
            if (!this.Method6001()) {
                v5 = Class1497.Field15024;
                Intrinsics.checkExpressionValueIsNotNull((Object)v5, (String)"autoXPSilentDelay");
                if (Class1497.Field15030.Method2797(v5.Method369())) {
                    Class1497.Field15030.Method2801();
                    var1_3 = Class9.Method116(Items.EXPERIENCE_BOTTLE, 0, 9);
                    if (var1_3 == -1) {
                        v6 = Class1497.Field15016;
                        Intrinsics.checkExpressionValueIsNotNull((Object)v6, (String)"debug1");
                        if (v6.Method365()) {
                            Class1393.Method5508("Initial-AI >> Auto-XP >> No xp in hotbar");
                        }
                    } else {
                        var2_4 = Class1497.Method6011().player.inventory.currentItem;
                        Class1497.Method6011().player.inventory.currentItem = var1_3;
                        var3_5 = Class1497.Method6011().player.rotationPitch;
                        Class1497.Method6011().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
                        Class1497.Method6011().player.rotationPitch = var3_5;
                        Class1497.Method6011().player.inventory.currentItem = var2_4;
                    }
                }
            }
        }
        Class1497.Field15031 = this.Method6001();
    }

    private final Class314 Method6000() {
        Class314 class314;
        Class44 class44 = Field15022;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"autoXPSmart");
        if (!class44.Method365()) {
            class314 = (Class314)Field15023.Method341();
            return class314;
        }
        if (Field15032) {
            class314 = Class314.Field9330;
            return class314;
        }
        class314 = Class314.Field9329;
        return class314;
    }

    private final boolean Method6001() {
        boolean bl;
        Class44 class44 = Field15018;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"moveStateLogic");
        if (class44.Method341() == Class2115.Field17617) {
            bl = Class1917.Method7159();
            return bl;
        }
        bl = Class1495.Method5990();
        return bl;
    }

    private final EnumHand Method6002(Item item) {
        EnumHand enumHand;
        EntityPlayerSP entityPlayerSP = Class1497.Method6011().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (Intrinsics.areEqual((Object)entityPlayerSP.getHeldItemMainhand().item, (Object)item)) {
            enumHand = EnumHand.MAIN_HAND;
            return enumHand;
        }
        EntityPlayerSP entityPlayerSP2 = Class1497.Method6011().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
        if (!Intrinsics.areEqual((Object)entityPlayerSP2.getHeldItemOffhand().item, (Object)item)) return null;
        enumHand = EnumHand.OFF_HAND;
        return enumHand;
    }

    private final Class387 Method6003(Entity entity) {
        ArrayList<Class387> arrayList = new ArrayList<Class387>();
        Iterator iterator = Class2155.Method7756(entity, Float.intBitsToFloat(0x40C00000), true, false).iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos;
            BlockPos blockPos2 = blockPos = (BlockPos)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos");
            if (!Intrinsics.areEqual((Object)Class886.Method3703(blockPos2).getBlock(), (Object)Blocks.AIR)) continue;
            BlockPos blockPos3 = blockPos.up();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"pos.up()");
            if (!Intrinsics.areEqual((Object)Class886.Method3703(blockPos3).getBlock(), (Object)Blocks.AIR) || blockPos.getY() < 1 || this.Method6005(blockPos)) continue;
            World world = (World)Class1497.Method6011().world;
            double d = (double)blockPos.getX() + Double.longBitsToDouble((long)302001021 ^ 0x3FE0000012002B7DL);
            double d2 = blockPos.getY();
            double d3 = (double)blockPos.getZ() + Double.longBitsToDouble((long)1712011939 ^ 0x3FE00000660B3AA3L);
            Class44 class44 = Field15014;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"terrain");
            arrayList.add(new Class387(entity, blockPos, Class2155.Method7759(world, d, d2, d3, entity, class44.Method365())));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = arrayList;
        Comparator comparator = Comparator.comparingDouble(Class664.Field10819);
        Intrinsics.checkExpressionValueIsNotNull(comparator, (String)"Comparator.comparingDoub\u2026 { it.damage.toDouble() }");
        CollectionsKt.sortWith((List)list, comparator);
        return (Class387)arrayList.get(0);
    }

    private final void Method6004(Entity entity) {
        Object object;
        Class387 class387 = this.Method6007(entity);
        Class44 class44 = Field15017;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"debug2");
        if (class44.Method365()) {
            object = "Spot != null is " + (class387 != null);
            boolean bl = false;
            System.out.println(object);
        }
        if (class387 == null) {
            Class44 class442 = Field15016;
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"debug1");
            if (!class442.Method365()) return;
            Class1393.Method5508("Initial-AI >> No safe spot found.");
            return;
        }
        object = class387.Method1866();
        Class1495.Method5986(object);
        Class44 class443 = Field15016;
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"debug1");
        if (!class443.Method365()) return;
        Class1393.Method5508("Initial-AI >> Going to " + object.getX() + ", " + object.getY() + ", " + object.getZ());
    }

    private final boolean Method6005(BlockPos blockPos) {
        BlockPos blockPos2 = blockPos.north();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos.north()");
        if (this.Method6006(blockPos2)) return true;
        BlockPos blockPos3 = blockPos.east();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"pos.east()");
        if (this.Method6006(blockPos3)) return true;
        BlockPos blockPos4 = blockPos.west();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos4, (String)"pos.west()");
        if (this.Method6006(blockPos4)) return true;
        BlockPos blockPos5 = blockPos.south();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos5, (String)"pos.south()");
        if (this.Method6006(blockPos5)) return true;
        return false;
    }

    private final boolean Method6006(BlockPos blockPos) {
        return Class2155.Method7755(blockPos, true, true, Field15015.Method365(), true);
    }

    private final Class387 Method6007(Entity entity) {
        ArrayList<Class387> arrayList = new ArrayList<Class387>();
        double d = Double.longBitsToDouble((long)2029359978 ^ 0x3FE0000078F5936AL);
        Iterator iterator = this.Method6009(entity).iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos;
            BlockPos blockPos2 = blockPos = (BlockPos)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"hole");
            float f = this.Method6008(blockPos2, Float.intBitsToFloat(0x40C00000), entity);
            if (!((double)f > d)) continue;
            d = f;
            arrayList.add(new Class387(entity, blockPos, f));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = arrayList;
        Comparator comparator = Comparator.comparingDouble(Class724.Field11083);
        Intrinsics.checkExpressionValueIsNotNull(comparator, (String)"Comparator.comparingDoub\u2026 { it.damage.toDouble() }");
        CollectionsKt.sortWith((List)list, comparator);
        return (Class387)arrayList.get(0);
    }

    private final float Method6008(BlockPos blockPos, float f, Entity entity) {
        double d = Double.longBitsToDouble(4602678819172646912L);
        Iterator iterator = Class394.Method1946(blockPos, f, (int)f + 1, false, true, 0).iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos2 = (BlockPos)iterator.next();
            World world = (World)Class1497.Method6011().world;
            BlockPos blockPos3 = blockPos2;
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"pos");
            double d2 = (double)blockPos3.getX() + Double.longBitsToDouble((long)618989735 ^ 0x3FE0000024E508A7L);
            double d3 = blockPos2.getY();
            double d4 = (double)blockPos2.getZ() + Double.longBitsToDouble(4602678819172646912L);
            Class44 class44 = Field15014;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"terrain");
            float f2 = Class2155.Method7759(world, d2, d3, d4, entity, class44.Method365());
            if (!((double)f2 > d)) continue;
            d = f2;
        }
        return (float)d;
    }

    private final ArrayList Method6009(Entity entity) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        Iterator iterator = this.Method6010(entity, Float.intBitsToFloat(0x40C00000)).iterator();
        while (iterator.hasNext()) {
            Class1862 class1862;
            BlockPos blockPos = (BlockPos)iterator.next();
            Class1862 class18622 = class1862 = Class1914.Method7131(blockPos, false, true);
            Intrinsics.checkExpressionValueIsNotNull((Object)class18622, (String)"info");
            if (class18622.Method6959() == Class422.Field9771) continue;
            arrayList.add(blockPos);
        }
        return arrayList;
    }

    private final ArrayList Method6010(Entity entity, float f) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>(64);
        List list = Class394.Method1946(entity.getPosition(), f, (int)f + 1, false, true, 0);
        list = list.stream().sorted(Class1261.Field13708).collect(Collectors.toList());
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            IBlockState iBlockState = Class1497.Method6011().world.getBlockState(blockPos);
            Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(pos)");
            if (Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR) ^ true) continue;
            IBlockState iBlockState2 = Class1497.Method6011().world.getBlockState(blockPos.add(0, -1, 0));
            Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState2, (String)"mc.world.getBlockState(pos.add(0, -1, 0))");
            if (Intrinsics.areEqual((Object)iBlockState2.getBlock(), (Object)Blocks.AIR)) continue;
            IBlockState iBlockState3 = Class1497.Method6011().world.getBlockState(blockPos.add(0, 1, 0));
            Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState3, (String)"mc.world.getBlockState(pos.add(0, 1, 0))");
            if (Intrinsics.areEqual((Object)iBlockState3.getBlock(), (Object)Blocks.AIR) ^ true) continue;
            IBlockState iBlockState4 = Class1497.Method6011().world.getBlockState(blockPos.add(0, 2, 0));
            Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState4, (String)"mc.world.getBlockState(pos.add(0, 2, 0))");
            if (!Intrinsics.areEqual((Object)iBlockState4.getBlock(), (Object)Blocks.AIR)) continue;
            arrayList.add(blockPos);
        }
        return arrayList;
    }

    private Class1497() {
        super("AutoCrystalPvP", "crystal pvp go brr", Class97.Field8338);
    }

    static {
        Class1497 class1497;
        Field15034 = class1497 = new Class1497();
        Field15014 = class1497.Method23(new Class44("Terrain", (Class42)class1497, true));
        Field15015 = new Class44("Target Is Using Multi Place", (Class42)class1497, false);
        Field15016 = class1497.Method23(new Class44("Debug 1", (Class42)class1497, false));
        Field15017 = class1497.Method23(new Class44("Debug 2", (Class42)class1497, false));
        Field15018 = class1497.Method23(new Class44("Move State Logic", (Class42)class1497, Class2115.Field17617));
        Field15019 = class1497.Method23(new Class44("Range", (Class42)class1497, Double.longBitsToDouble((long)1079343196 ^ 0x404900004055785CL), 1.0, Double.longBitsToDouble(4636737291354636288L), true));
        Field15020 = class1497.Method24(new Class1996(new Class44("Auto XP", class1497)));
        Class44 class44 = new Class44("Auto XP", (Class42)class1497, false).Method355("State");
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Setting(\"Auto XP\", this, false).setTitle(\"State\")");
        Field15021 = class1497.Method23(Field15020.Method7405(class44));
        Class44 class442 = new Class44("Auto XP Smart", (Class42)class1497, false).Method355("Smart");
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"Setting(\"Auto XP Smart\",\u2026 false).setTitle(\"Smart\")");
        Field15022 = class1497.Method23(Field15020.Method7405(class442));
        Class1303 class1303 = new Class1303("Auto XP Mode", (Class42)class1497, Class314.Field9329).Method5300("Mode");
        Class1996 class1996 = Field15020;
        Intrinsics.checkExpressionValueIsNotNull((Object)class1996, (String)"autoXPGroup");
        Field15023 = class1303.Method5304(class1996).Method5303();
        Class44 class443 = new Class44("Auto Xp Silent Delay", (Class42)class1497, Double.longBitsToDouble(4636737291354636288L), 0.0, Double.longBitsToDouble((long)1955345823 ^ 0x408F4000748C359FL), Class467.Field9943).Method355("Silent Delay");
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"Setting(\"Auto Xp Silent \u2026.setTitle(\"Silent Delay\")");
        Field15024 = class1497.Method23(Field15020.Method7405(class443));
        Class44 class444 = new Class44("Auto XP Armor Percent", (Class42)class1497, Double.longBitsToDouble(0x4049000000000000L), 0.0, Double.longBitsToDouble((long)1956246685 ^ 0x405900007499F49DL), Class467.Field9942).Method355("Armor Percent");
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"Setting(\"Auto XP Armor P\u2026setTitle(\"Armor Percent\")");
        Field15025 = class1497.Method23(Field15020.Method7405(class444));
        Field15026 = class1497.Method24(new Class1996(new Class44("Auto Eat", class1497)));
        Class44 class445 = new Class44("Auto Eat", (Class42)class1497, false).Method355("State");
        Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"Setting(\"Auto Eat\", this, false).setTitle(\"State\")");
        Field15027 = class1497.Method23(Field15026.Method7405(class445));
        Field15028 = new Class411(class1497).Method2003();
        Class44 class446 = Field15019;
        Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"targetRange");
        Supplier supplier = class446.Method393();
        Intrinsics.checkExpressionValueIsNotNull((Object)supplier, (String)"targetRange.supplierDouble");
        Field15029 = new Class61(supplier, Field15028);
        Field15030 = new Class650();
        Field15033 = -1;
        super.Method44(Class1423.Field14620);
    }

    public static final Minecraft Method6011() {
        return Class42.Field8052;
    }

    public static final void Method6012(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    public static final Class44 Method6013(Class1497 class1497) {
        Class1497 class14972 = class1497;
        return Field15017;
    }

    public static final void Method6014(Class1497 class1497, Entity entity) {
        class1497.Method6004(entity);
    }

    public static final Class61 Method6015(Class1497 class1497) {
        Class1497 class14972 = class1497;
        return Field15029;
    }

    public static final void Method6016(Class1497 class1497) {
        class1497.Method5999();
    }

    public static final void Method6017(Class1497 class1497) {
        class1497.Method5997();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 20;
            cArray2[n] = (char)(cArray[n] ^ (0x11FF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

