//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.Pair
 *  kotlin.TuplesKt
 *  kotlin.collections.MapsKt
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.multiplayer.PlayerControllerMP
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.ItemPickaxe
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1416;
import lavahack.client.Class1437;
import lavahack.client.Class1493;
import lavahack.client.Class1612;
import lavahack.client.Class173;
import lavahack.client.Class184;
import lavahack.client.Class1868;
import lavahack.client.Class1887;
import lavahack.client.Class1996;
import lavahack.client.Class256;
import lavahack.client.Class411;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class61;
import lavahack.client.Class721;
import lavahack.client.Class794;
import lavahack.client.Class9;
import lavahack.client.Class97;
import lavahack.client.Class99;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Class794
@Class1887
@Class99
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001@B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010.\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0012\u00104\u001a\u0002002\b\u00105\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u00106\u001a\u000200H\u0016J\u0010\u00107\u001a\u0002002\u0006\u00108\u001a\u000209H\u0007J\u001a\u0010:\u001a\u0004\u0018\u00010\f2\u0006\u0010;\u001a\u00020<2\u0006\u00105\u001a\u00020\u0014H\u0002J\u0010\u0010=\u001a\u0002002\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\n\u0010>\u001a\u0004\u0018\u00010\u001eH\u0002J\b\u0010?\u001a\u000200H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e\u00a2\u0006\b\n\u0000\u0012\u0004\b\u001f\u0010\u0002R\u001e\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010$\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010'\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010(\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010)\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010,\u001a\n \u0005*\u0004\u0018\u00010-0-X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2={"Lcom/kisman/cc/features/module/combat/CityBoss;", "Lcom/kisman/cc/features/module/Module;", "()V", "autorerSync", "Lcom/kisman/cc/settings/types/SettingGroup;", "kotlin.jvm.PlatformType", "autorerTargetSync", "Lcom/kisman/cc/settings/Setting;", "blockRange", "blockRangeCheck", "caseSettings", "", "Lcom/kisman/cc/features/module/combat/cityboss/Cases;", "cases", "clicked", "", "currentFacingColor1", "currentFacingColor2", "currentPosses", "Ljava/util/ArrayList;", "Lnet/minecraft/util/math/BlockPos;", "Lkotlin/collections/ArrayList;", "debug1", "debug2", "down", "lastPos", "leftDiagonalCase", "middleCase", "mineMode", "player", "Lnet/minecraft/entity/player/EntityPlayer;", "player$annotations", "posses", "processingBlock", "processingBlockColor1", "processingBlockColor2", "range", "renderer", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "rightDiagonalCase", "simpleCase1", "simpleCase2", "targets", "Lcom/kisman/cc/util/entity/TargetFinder;", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "canBeBurrowed", "displayInfo", "", "info", "", "isBurrowed", "mineBlock", "pos", "onEnable", "onRenderWorld", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "processFacing", "facing", "Lnet/minecraft/util/EnumFacing;", "processPlayer", "target", "update", "MineMode", "kisman.cc"})
public final class Class1488
extends Class42 {
    private final Class44 Field14939 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble(0x4034000000000000L), 1.0, Double.longBitsToDouble((long)1406642018 ^ 0x403E000053D7A762L), true));
    private final Class44 Field14940 = this.Method23(new Class44("Block Range Check", (Class42)this, false));
    private final Class44 Field14941 = this.Method23(new Class44("Block Range", (Class42)this, Double.longBitsToDouble(0x4014000000000000L), 1.0, Double.longBitsToDouble(4618441417868443648L), false));
    private final Class44 Field14942 = this.Method23(new Class44("Down", (Class42)this, 1.0, 0.0, Double.longBitsToDouble((long)1877411457 ^ 0x400800006FE70681L), true));
    private final Class44 Field14943 = this.Method23(new Class44("Mine Mode", (Class42)this, Class1493.Field14981));
    private final Class1996 Field14944 = this.Method24(new Class1996(new Class44("Cases", this)));
    private final Class44 Field14945 = this.Method23(this.Field14944.Method7405(new Class44("Simple Case 1", (Class42)this, true)));
    private final Class44 Field14946 = this.Method23(this.Field14944.Method7405(new Class44("Simple Case 2", (Class42)this, true)));
    private final Class44 Field14947 = this.Method23(this.Field14944.Method7405(new Class44("Middle Case", (Class42)this, true)));
    private final Class44 Field14948 = this.Method23(this.Field14944.Method7405(new Class44("Left Diagonal", (Class42)this, true)));
    private final Class44 Field14949 = this.Method23(this.Field14944.Method7405(new Class44("Right Diagonal", (Class42)this, true)));
    private final Class44 Field14950 = this.Method23(new Class44("Debug 1", (Class42)this, false));
    private final Class44 Field14951 = this.Method23(new Class44("Debug 2", (Class42)this, false));
    private final Class1996 Field14952 = this.Method24(new Class1996(new Class44("Auto ReR Sync", this)));
    private final Class44 Field14953;
    private final Class1612 Field14954;
    private final Class44 Field14955;
    private final Class44 Field14956;
    private final Class44 Field14957;
    private final Class44 Field14958;
    private final Class411 Field14959;
    private final Class61 Field14960;
    private boolean Field14961;
    private BlockPos Field14962;
    private final ArrayList Field14963;
    private final ArrayList Field14964;
    private BlockPos Field14965;
    private EntityPlayer Field14966;
    private final Map Field14967;
    private int Field14968;

    @Override
    public void Method38() {
        super.Method38();
        this.Field14966 = null;
        this.Field14961 = false;
        this.Field14962 = null;
    }

    private final void Method5956(String string) {
        String string2;
        StringBuilder stringBuilder = new StringBuilder().append('[');
        if (this.Field14966 == null) {
            string2 = string;
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            EntityPlayer entityPlayer = this.Field14966;
            if (entityPlayer == null) {
                Intrinsics.throwNpe();
            }
            string2 = stringBuilder2.append(entityPlayer.getName()).append('|').append(string).toString();
        }
        this.Method43(stringBuilder.append(string2).append(']').toString());
    }

    @Override
    public void Method45() {
        if (Class1488.Method5964().player == null) return;
        if (Class1488.Method5964().world == null) {
            return;
        }
        this.Field14963.clear();
        this.Field14964.clear();
        this.Field14960.Method499();
        this.Field14965 = null;
        this.Field14966 = this.Method5957();
        if (this.Field14966 == null) {
            this.Method5956("no target no fun");
            this.Field14961 = false;
            this.Field14962 = null;
            return;
        }
        EntityPlayer entityPlayer = this.Field14966;
        if (entityPlayer == null) {
            Intrinsics.throwNpe();
        }
        if (this.Method5959(entityPlayer)) {
            Class44 class44 = this.Field14950;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"debug1");
            if (class44.Method365()) {
                this.Method5956("Trapping");
                return;
            }
        }
        EntityPlayer entityPlayer2 = this.Field14966;
        if (entityPlayer2 == null) {
            Intrinsics.throwNpe();
        }
        if (this.Method5960(entityPlayer2)) {
            Class44 class44 = this.Field14951;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"debug2");
            if (class44.Method365()) {
                this.Method5956("Mining burrow block");
                EntityPlayer entityPlayer3 = this.Field14966;
                if (entityPlayer3 == null) {
                    Intrinsics.throwNpe();
                }
                this.Method5958(Class721.Method3015((Entity)entityPlayer3));
                return;
            }
        }
        this.Method5956("Mining surround block");
        EntityPlayer entityPlayer4 = this.Field14966;
        if (entityPlayer4 == null) {
            Intrinsics.throwNpe();
        }
        this.Method5961(entityPlayer4);
    }

    private final EntityPlayer Method5957() {
        EntityPlayer entityPlayer;
        Class44 class44 = this.Field14953;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"autorerTargetSync");
        if (class44.Method365()) {
            entityPlayer = Class1416.Field14558;
            return entityPlayer;
        }
        entityPlayer = this.Field14960.Method496();
        return entityPlayer;
    }

    private final void Method5958(BlockPos blockPos) {
        if (Intrinsics.areEqual((Object)this.Field14962, (Object)blockPos) ^ true) {
            this.Field14961 = false;
        }
        if (blockPos == null) {
            this.Field14962 = null;
            return;
        }
        RayTraceResult rayTraceResult = Class1488.Method5964().world.rayTraceBlocks(new Vec3d(Class1488.Method5964().player.posX, Class1488.Method5964().player.posY + (double)Class1488.Method5964().player.getEyeHeight(), Class1488.Method5964().player.posZ), new Vec3d((double)blockPos.getX() + Double.longBitsToDouble((long)1600373608 ^ 0x3FE000005F63C368L), (double)blockPos.getY() - Double.longBitsToDouble(4602678819172646912L), (double)blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L)));
        Class44 class44 = this.Field14943;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"mineMode");
        if (class44.Method341() == Class1493.Field14981) {
            EntityPlayerSP entityPlayerSP = Class1488.Method5964().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
            if (!(entityPlayerSP.getHeldItemMainhand().getItem() instanceof ItemPickaxe)) {
                int n = Class9.Method132(ItemPickaxe.class, 0, 9);
                if (n == 1) return;
                Class1488.Method5964().player.inventory.currentItem = n;
            }
            PlayerControllerMP playerControllerMP = Class1488.Method5964().playerController;
            RayTraceResult rayTraceResult2 = rayTraceResult;
            if (rayTraceResult2 == null || (rayTraceResult2 = rayTraceResult2.sideHit) == null) {
                rayTraceResult2 = EnumFacing.UP;
            }
            playerControllerMP.onPlayerDamageBlock(blockPos, (EnumFacing)rayTraceResult2);
            Class1488.Method5964().player.swingArm(EnumHand.MAIN_HAND);
        } else if (!this.Field14961) {
            Class44 class442 = this.Field14943;
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"mineMode");
            if (class442.Method341() == Class1493.Field14982) {
                Class1437 class1437 = Class1437.Field14740;
                Intrinsics.checkExpressionValueIsNotNull((Object)class1437, (String)"PacketMine.instance");
                if (!class1437.Method35()) {
                    Class1437 class14372 = Class1437.Field14740;
                    Intrinsics.checkExpressionValueIsNotNull((Object)class14372, (String)"PacketMine.instance");
                    class14372.Method21(true);
                }
                if (Intrinsics.areEqual((Object)Class256.Field9152.Method1369(), (Object)blockPos) ^ true) {
                    RayTraceResult rayTraceResult3 = rayTraceResult;
                    if (rayTraceResult3 == null || (rayTraceResult3 = rayTraceResult3.sideHit) == null) {
                        rayTraceResult3 = EnumFacing.UP;
                    }
                    Class256.Field9152.Method1405(blockPos, (EnumFacing)rayTraceResult3);
                }
                this.Field14961 = true;
            }
        }
        this.Field14962 = blockPos;
    }

    private final boolean Method5959(EntityPlayer entityPlayer) {
        IBlockState iBlockState = Class1488.Method5964().world.getBlockState(Class721.Method3015((Entity)entityPlayer).up().up());
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(e\u2026sition(player).up().up())");
        return Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR);
    }

    private final boolean Method5960(EntityPlayer entityPlayer) {
        IBlockState iBlockState = Class1488.Method5964().world.getBlockState(entityPlayer.getPosition());
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(player.position)");
        return Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR) ^ true;
    }

    private final void Method5961(EntityPlayer entityPlayer) {
        BlockPos blockPos;
        IBlockState iBlockState;
        List list;
        Object object;
        Collection collection;
        List list2;
        BlockPos blockPos2 = Class721.Method3015((Entity)entityPlayer);
        Class1868 class1868 = this.Method5962(EnumFacing.EAST, blockPos2);
        Class1868 class18682 = this.Method5962(EnumFacing.WEST, blockPos2);
        Class1868 class18683 = this.Method5962(EnumFacing.SOUTH, blockPos2);
        Class1868 class18684 = this.Method5962(EnumFacing.NORTH, blockPos2);
        if (class1868 != null) {
            List list3;
            Class44 class44 = this.Field14942;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"down");
            if (class44.Method335() == 0) {
                list3 = class1868.Method942(EnumFacing.EAST);
            } else {
                Class44 class442 = this.Field14942;
                Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"down");
                list3 = class1868.Method949(class442.Method335(), EnumFacing.EAST);
            }
            this.Field14963.addAll(list3);
        }
        if (class18682 != null) {
            List list4;
            Class44 class44 = this.Field14942;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"down");
            if (class44.Method335() == 0) {
                list4 = class18682.Method942(EnumFacing.WEST);
            } else {
                Class44 class443 = this.Field14942;
                Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"down");
                list4 = class18682.Method949(class443.Method335(), EnumFacing.WEST);
            }
            this.Field14963.addAll(list4);
        }
        if (class18683 != null) {
            List list5;
            Class44 class44 = this.Field14942;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"down");
            if (class44.Method335() == 0) {
                list5 = class18683.Method942(EnumFacing.SOUTH);
            } else {
                Class44 class444 = this.Field14942;
                Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"down");
                list5 = class18683.Method949(class444.Method335(), EnumFacing.SOUTH);
            }
            this.Field14963.addAll(list5);
        }
        if (class18684 != null) {
            List list6;
            Class44 class44 = this.Field14942;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"down");
            if (class44.Method335() == 0) {
                list6 = class18684.Method942(EnumFacing.NORTH);
            } else {
                Class44 class445 = this.Field14942;
                Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"down");
                list6 = class18684.Method949(class445.Method335(), EnumFacing.NORTH);
            }
            this.Field14963.addAll(list6);
        }
        if (this.Field14963.isEmpty()) {
            return;
        }
        boolean bl = false;
        Class1868 class18685 = class1868;
        int n = class18685 != null ? class18685.Method943(EnumFacing.EAST, blockPos2) : -1;
        Class1868 class18686 = class18682;
        int n2 = class18686 != null ? class18686.Method943(EnumFacing.WEST, blockPos2) : -1;
        Class1868 class18687 = class18683;
        int n3 = class18687 != null ? class18687.Method943(EnumFacing.SOUTH, blockPos2) : -1;
        Class1868 class18688 = class18684;
        int n4 = class18688 != null ? class18688.Method943(EnumFacing.NORTH, blockPos2) : -1;
        Class1868 class18689 = null;
        EnumFacing enumFacing = null;
        if (class18689 == null) {
            class18689 = Class1868.Field16580;
            enumFacing = Class184.Method1115(blockPos2, Class721.Method3016());
        }
        Class44 class44 = this.Field14942;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"down");
        if (class44.Method335() == 0) {
            EnumFacing enumFacing2 = enumFacing;
            if (enumFacing2 == null) {
                Intrinsics.throwNpe();
            }
            list2 = class18689.Method942(enumFacing2);
        } else {
            Class44 class446 = this.Field14942;
            Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"down");
            int n5 = class446.Method335();
            EnumFacing enumFacing3 = enumFacing;
            if (enumFacing3 == null) {
                Intrinsics.throwNpe();
            }
            list2 = class18689.Method949(n5, enumFacing3);
        }
        this.Field14964.addAll(list2);
        Class44 class447 = this.Field14942;
        Intrinsics.checkExpressionValueIsNotNull((Object)class447, (String)"down");
        if (class447.Method335() > 0) {
            collection = this.Field14963;
            Class44 class448 = this.Field14942;
            Intrinsics.checkExpressionValueIsNotNull((Object)class448, (String)"down");
            object = blockPos2.down(class448.Method335());
            boolean bl2 = false;
            collection.add(object);
            IBlockState iBlockState2 = Class1488.Method5964().world.getBlockState(blockPos2.down());
            Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState2, (String)"mc.world.getBlockState(playerPosition.down())");
            if (Intrinsics.areEqual((Object)iBlockState2.getBlock(), (Object)Blocks.AIR) ^ true) {
                Class44 class449 = this.Field14942;
                Intrinsics.checkExpressionValueIsNotNull((Object)class449, (String)"down");
                this.Field14965 = blockPos2.down(class449.Method335());
                Class44 class4410 = this.Field14942;
                Intrinsics.checkExpressionValueIsNotNull((Object)class4410, (String)"down");
                this.Method5958(blockPos2.down(class4410.Method335()));
                return;
            }
        }
        Class44 class4411 = this.Field14942;
        Intrinsics.checkExpressionValueIsNotNull((Object)class4411, (String)"down");
        if (class4411.Method335() == 0) {
            list = class18689.Method942(enumFacing);
        } else {
            Class44 class4412 = this.Field14942;
            Intrinsics.checkExpressionValueIsNotNull((Object)class4412, (String)"down");
            list = class18689.Method949(class4412.Method335(), enumFacing);
        }
        object = list.iterator();
        do {
            if (!object.hasNext()) {
                this.Field14965 = null;
                return;
            }
            collection = (BlockPos)object.next();
            blockPos = blockPos2.add((Vec3i)collection);
            iBlockState = Class1488.Method5964().world.getBlockState(blockPos);
            Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(finalPos)");
        } while (!(Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR) ^ true));
        this.Field14965 = blockPos;
        this.Method5958(blockPos);
    }

    /*
     * Unable to fully structure code
     */
    private final Class1868 Method5962(EnumFacing var1_1, BlockPos var2_2) {
        var3_3 = 0x7FFFFFFF;
        var4_4 = null;
        var7_5 = Class1868.values();
        var8_6 = var7_5.length;
        var6_7 = 0;
        while (var6_7 < var8_6) {
            block6: {
                block7: {
                    var5_8 = var7_5[var6_7];
                    v0 = this.Field14967.get((Object)var5_8);
                    if (v0 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (!((Class44)v0).Method365()) break block6;
                    v1 = this.Field14942;
                    Intrinsics.checkExpressionValueIsNotNull((Object)v1, (String)"down");
                    if (v1.Method335() != 0) break block7;
                    if (!var5_8.Method947(var1_1, var2_2)) ** GOTO lbl-1000
                    v2 = this.Field14940;
                    Intrinsics.checkExpressionValueIsNotNull((Object)v2, (String)"blockRangeCheck");
                    if (!v2.Method365()) ** GOTO lbl-1000
                    v3 = this.Field14941;
                    Intrinsics.checkExpressionValueIsNotNull((Object)v3, (String)"blockRange");
                    if (var5_8.Method945(var1_1, var2_2, v3.Method367())) lbl-1000:
                    // 2 sources

                    {
                        v4 = true;
                    } else lbl-1000:
                    // 2 sources

                    {
                        v4 = false;
                    }
                    break block6;
                }
                v5 = this.Field14942;
                Intrinsics.checkExpressionValueIsNotNull((Object)v5, (String)"down");
                if (!var5_8.Method948(var1_1, var2_2, v5.Method335())) ** GOTO lbl-1000
                v6 = this.Field14940;
                Intrinsics.checkExpressionValueIsNotNull((Object)v6, (String)"blockRangeCheck");
                if (!v6.Method365()) ** GOTO lbl-1000
                v7 = this.Field14941;
                Intrinsics.checkExpressionValueIsNotNull((Object)v7, (String)"blockRange");
                v8 = v7.Method367();
                v9 = this.Field14942;
                Intrinsics.checkExpressionValueIsNotNull((Object)v9, (String)"down");
                if (var5_8.Method946(var1_1, var2_2, v8, v9.Method335())) lbl-1000:
                // 2 sources

                {
                    v4 = true;
                } else lbl-1000:
                // 2 sources

                {
                    v4 = false;
                }
            }
            ++var6_7;
        }
        return var4_4;
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method5963(@NotNull @NotNull RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, (String)"event");
        if (!this.Field14954.Method3790()) return;
        if (this.Field14966 == null) return;
        Iterator iterator = this.Field14963.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos;
            BlockPos blockPos2 = (BlockPos)iterator.next();
            EntityPlayer entityPlayer = this.Field14966;
            if (entityPlayer == null) {
                Intrinsics.throwNpe();
            }
            if (Intrinsics.areEqual((Object)this.Field14965, (Object)(blockPos = Class721.Method3015((Entity)entityPlayer).add((Vec3i)blockPos2)))) {
                BlockPos blockPos3 = blockPos;
                Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"pos1");
                Class44 class44 = this.Field14957;
                Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"processingBlockColor1");
                Class2027 class2027 = class44.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"processingBlockColor1.colour");
                Class44 class442 = this.Field14958;
                Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"processingBlockColor2");
                Class2027 class20272 = class442.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)class20272, (String)"processingBlockColor2.colour");
                this.Field14954.Method3803(blockPos3, class2027, class20272);
                continue;
            }
            if (this.Field14964.contains(blockPos2)) {
                BlockPos blockPos4 = blockPos;
                Intrinsics.checkExpressionValueIsNotNull((Object)blockPos4, (String)"pos1");
                Class44 class44 = this.Field14955;
                Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"currentFacingColor1");
                Class2027 class2027 = class44.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"currentFacingColor1.colour");
                Class44 class443 = this.Field14956;
                Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"currentFacingColor2");
                Class2027 class20273 = class443.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)class20273, (String)"currentFacingColor2.colour");
                this.Field14954.Method3803(blockPos4, class2027, class20273);
                continue;
            }
            BlockPos blockPos5 = blockPos;
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos5, (String)"pos1");
            this.Field14954.Method3805(blockPos5);
        }
    }

    public Class1488() {
        super("CityBoss", "Breaks surround of nearest player.", Class97.Field8338);
        Class1612 class1612;
        Class44 class44 = new Class44("Auto Rer Target Sync", (Class42)this, false).Method355("Target");
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Setting(\"Auto Rer Target\u2026false).setTitle(\"Target\")");
        this.Field14953 = this.Method23(this.Field14952.Method7405(class44));
        Class1612 class16122 = new Class1612(this);
        Class1996 class1996 = this.Method24(new Class1996(new Class44("Render", this)));
        Intrinsics.checkExpressionValueIsNotNull((Object)class1996, (String)"register(SettingGroup(Setting(\"Render\", this)))");
        Class1612 class16123 = ((Class1612)class16122.Method772(class1996)).Method3788().Method3789();
        Class1488 class1488 = this;
        boolean bl = false;
        boolean bl2 = false;
        Class1612 class16124 = class16123;
        boolean bl3 = false;
        class16124.Method3780().Method355("Other Blocks First");
        class16124.Method3781().Method355("Other Blocks Second");
        class1488.Field14954 = class1612 = class16123;
        this.Field14955 = this.Method23(this.Field14954.Method3778().Method7405(new Class44("Render Color Other Blocks", (Class42)this, "Current Facing First", new Class2027(255, 255, 255, 255))));
        this.Field14956 = this.Method23(this.Field14954.Method3778().Method7405(new Class44("Render Second Color Other Blocks", (Class42)this, "Current Facing Second", new Class2027(255, 255, 255, 255))));
        this.Field14957 = this.Method23(this.Field14954.Method3778().Method7405(new Class44("Render Color Processing Block", (Class42)this, "Processing Block First", new Class2027(0, 255, 0, 255))));
        this.Field14958 = this.Method23(this.Field14954.Method3778().Method7405(new Class44("Render Second Color Processing Block", (Class42)this, "Processing Block Second", new Class2027(0, 255, 0, 255))));
        this.Field14959 = this.Method54();
        Supplier supplier = new Class173(this);
        Class411 class411 = this.Field14959;
        Intrinsics.checkExpressionValueIsNotNull((Object)class411, (String)"threads");
        this.Field14960 = new Class61(supplier, class411);
        this.Field14963 = new ArrayList();
        this.Field14964 = new ArrayList();
        this.Field14967 = MapsKt.mapOf((Pair[])new Pair[]{TuplesKt.to((Object)((Object)Class1868.Field16580), (Object)this.Field14945), TuplesKt.to((Object)((Object)Class1868.Field16581), (Object)this.Field14946), TuplesKt.to((Object)((Object)Class1868.Field16579), (Object)this.Field14947), TuplesKt.to((Object)((Object)Class1868.Field16582), (Object)this.Field14948), TuplesKt.to((Object)((Object)Class1868.Field16583), (Object)this.Field14949)});
    }

    public static final Minecraft Method5964() {
        return Class42.Field8052;
    }

    public static final void Method5965(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    public static final Class44 Method5966(Class1488 class1488) {
        return class1488.Field14939;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 118;
            cArray2[n] = (char)(cArray[n] ^ (0x3D4D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

