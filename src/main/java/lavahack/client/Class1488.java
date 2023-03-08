//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.player.*;
import kotlin.jvm.internal.*;
import net.minecraft.entity.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.init.*;
import net.minecraft.block.state.*;
import net.minecraft.util.math.*;
import java.util.*;
import net.minecraftforge.client.event.*;
import org.jetbrains.annotations.*;
import com.kisman.cc.util.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.util.function.*;
import kotlin.*;
import kotlin.collections.*;
import net.minecraft.client.*;

@Class794
@Class1887
@Class99
@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001@B\u0005?\u0006\u0002\u0010\u0002J\u0010\u0010.\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0012\u00104\u001a\u0002002\b\u00105\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u00106\u001a\u000200H\u0016J\u0010\u00107\u001a\u0002002\u0006\u00108\u001a\u000209H\u0007J\u001a\u0010:\u001a\u0004\u0018\u00010\f2\u0006\u0010;\u001a\u00020<2\u0006\u00105\u001a\u00020\u0014H\u0002J\u0010\u0010=\u001a\u0002002\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\n\u0010>\u001a\u0004\u0018\u00010\u001eH\u0002J\b\u0010?\u001a\u000200H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0014X\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e?\u0006\b\n\u0000\u0012\u0004\b\u001f\u0010\u0002R\u001e\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u0082\u0004?\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u0014X\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010$\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010'\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010(\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010)\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010,\u001a\n \u0005*\u0004\u0018\u00010-0-X\u0082\u0004?\u0006\u0002\n\u0000?\u0006A" }, d2 = { "Lcom/kisman/cc/features/module/combat/CityBoss;", "Lcom/kisman/cc/features/module/Module;", "()V", "autorerSync", "Lcom/kisman/cc/settings/types/SettingGroup;", "kotlin.jvm.PlatformType", "autorerTargetSync", "Lcom/kisman/cc/settings/Setting;", "blockRange", "blockRangeCheck", "caseSettings", "", "Lcom/kisman/cc/features/module/combat/cityboss/Cases;", "cases", "clicked", "", "currentFacingColor1", "currentFacingColor2", "currentPosses", "Ljava/util/ArrayList;", "Lnet/minecraft/util/math/BlockPos;", "Lkotlin/collections/ArrayList;", "debug1", "debug2", "down", "lastPos", "leftDiagonalCase", "middleCase", "mineMode", "player", "Lnet/minecraft/entity/player/EntityPlayer;", "player$annotations", "posses", "processingBlock", "processingBlockColor1", "processingBlockColor2", "range", "renderer", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "rightDiagonalCase", "simpleCase1", "simpleCase2", "targets", "Lcom/kisman/cc/util/entity/TargetFinder;", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "canBeBurrowed", "displayInfo", "", "info", "", "isBurrowed", "mineBlock", "pos", "onEnable", "onRenderWorld", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "processFacing", "facing", "Lnet/minecraft/util/EnumFacing;", "processPlayer", "target", "update", "MineMode", "kisman.cc" })
public final class Class1488 extends Class42
{
    private final Class44 Field14939;
    private final Class44 Field14940;
    private final Class44 Field14941;
    private final Class44 Field14942;
    private final Class44 Field14943;
    private final Class1996 Field14944;
    private final Class44 Field14945;
    private final Class44 Field14946;
    private final Class44 Field14947;
    private final Class44 Field14948;
    private final Class44 Field14949;
    private final Class44 Field14950;
    private final Class44 Field14951;
    private final Class1996 Field14952;
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
    
    private final void Method5956(final String str) {
        final StringBuilder append = new StringBuilder().append('[');
        String string;
        if (this.Field14966 == null) {
            string = str;
        }
        else {
            final StringBuilder sb = new StringBuilder();
            final EntityPlayer field14966 = this.Field14966;
            if (field14966 == null) {
                Intrinsics.throwNpe();
            }
            string = sb.append(field14966.getName()).append('|').append(str).toString();
        }
        this.Method43(append.append(string).append(']').toString());
    }
    
    @Override
    public void Method45() {
        if (Method5964().player == null || Method5964().world == null) {
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
        final EntityPlayer field14966 = this.Field14966;
        if (field14966 == null) {
            Intrinsics.throwNpe();
        }
        if (this.Method5959(field14966)) {
            final Class44 field14967 = this.Field14950;
            Intrinsics.checkExpressionValueIsNotNull((Object)field14967, "debug1");
            if (field14967.Method365()) {
                this.Method5956("Trapping");
                return;
            }
        }
        final EntityPlayer field14968 = this.Field14966;
        if (field14968 == null) {
            Intrinsics.throwNpe();
        }
        if (this.Method5960(field14968)) {
            final Class44 field14969 = this.Field14951;
            Intrinsics.checkExpressionValueIsNotNull((Object)field14969, "debug2");
            if (field14969.Method365()) {
                this.Method5956("Mining burrow block");
                final EntityPlayer field14970 = this.Field14966;
                if (field14970 == null) {
                    Intrinsics.throwNpe();
                }
                this.Method5958(Class721.Method3015((Entity)field14970));
                return;
            }
        }
        this.Method5956("Mining surround block");
        final EntityPlayer field14971 = this.Field14966;
        if (field14971 == null) {
            Intrinsics.throwNpe();
        }
        this.Method5961(field14971);
    }
    
    private final EntityPlayer Method5957() {
        final Class44 field14953 = this.Field14953;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14953, "autorerTargetSync");
        return field14953.Method365() ? Class1416.Field14558 : this.Field14960.Method496();
    }
    
    private final void Method5958(final BlockPos field14962) {
        if (Intrinsics.areEqual((Object)this.Field14962, (Object)field14962) ^ true) {
            this.Field14961 = false;
        }
        if (field14962 == null) {
            this.Field14962 = null;
            return;
        }
        final RayTraceResult rayTraceBlocks = Method5964().world.rayTraceBlocks(new Vec3d(Method5964().player.posX, Method5964().player.posY + Method5964().player.getEyeHeight(), Method5964().player.posZ), new Vec3d(field14962.getX() + Double.longBitsToDouble((long)1600373608 ^ 0x3FE000005F63C368L), field14962.getY() - Double.longBitsToDouble(4602678819172646912L), field14962.getZ() + Double.longBitsToDouble(4602678819172646912L)));
        final Class44 field14963 = this.Field14943;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14963, "mineMode");
        if (field14963.Method341() == Class1493.Field14981) {
            final EntityPlayerSP player = Method5964().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
            if (!(player.getHeldItemMainhand().getItem() instanceof ItemPickaxe)) {
                final int method132 = Class9.Method132(ItemPickaxe.class, 0, 9);
                if (method132 == 1) {
                    return;
                }
                Method5964().player.inventory.currentItem = method132;
            }
            final PlayerControllerMP playerController = Method5964().playerController;
            final RayTraceResult rayTraceResult = rayTraceBlocks;
            EnumFacing enumFacing;
            if (rayTraceResult == null || (enumFacing = rayTraceResult.sideHit) == null) {
                enumFacing = EnumFacing.UP;
            }
            playerController.onPlayerDamageBlock(field14962, enumFacing);
            Method5964().player.swingArm(EnumHand.MAIN_HAND);
        }
        else if (!this.Field14961) {
            final Class44 field14964 = this.Field14943;
            Intrinsics.checkExpressionValueIsNotNull((Object)field14964, "mineMode");
            if (field14964.Method341() == Class1493.Field14982) {
                final Class1437 field14965 = Class1437.Field14740;
                Intrinsics.checkExpressionValueIsNotNull((Object)field14965, "PacketMine.instance");
                if (!field14965.Method35()) {
                    final Class1437 field14966 = Class1437.Field14740;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field14966, "PacketMine.instance");
                    field14966.Method21(true);
                }
                if (Intrinsics.areEqual((Object)Class256.Field9152.Method1369(), (Object)field14962) ^ true) {
                    final Class256 field14967 = Class256.Field9152;
                    final RayTraceResult rayTraceResult2 = rayTraceBlocks;
                    EnumFacing enumFacing2;
                    if (rayTraceResult2 == null || (enumFacing2 = rayTraceResult2.sideHit) == null) {
                        enumFacing2 = EnumFacing.UP;
                    }
                    field14967.Method1405(field14962, enumFacing2);
                }
                this.Field14961 = true;
            }
        }
        this.Field14962 = field14962;
    }
    
    private final boolean Method5959(final EntityPlayer entityPlayer) {
        final IBlockState getBlockState = Method5964().world.getBlockState(Class721.Method3015((Entity)entityPlayer).up().up());
        Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState, "mc.world.getBlockState(e\u2026sition(player).up().up())");
        return Intrinsics.areEqual((Object)getBlockState.getBlock(), (Object)Blocks.AIR);
    }
    
    private final boolean Method5960(final EntityPlayer entityPlayer) {
        final IBlockState getBlockState = Method5964().world.getBlockState(entityPlayer.getPosition());
        Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState, "mc.world.getBlockState(player.position)");
        return Intrinsics.areEqual((Object)getBlockState.getBlock(), (Object)Blocks.AIR) ^ true;
    }
    
    private final void Method5961(final EntityPlayer entityPlayer) {
        final BlockPos method3015 = Class721.Method3015((Entity)entityPlayer);
        final Class1868 method3016 = this.Method5962(EnumFacing.EAST, method3015);
        final Class1868 method3017 = this.Method5962(EnumFacing.WEST, method3015);
        final Class1868 method3018 = this.Method5962(EnumFacing.SOUTH, method3015);
        final Class1868 method3019 = this.Method5962(EnumFacing.NORTH, method3015);
        if (method3016 != null) {
            final ArrayList field14963 = this.Field14963;
            final Class44 field14964 = this.Field14942;
            Intrinsics.checkExpressionValueIsNotNull((Object)field14964, "down");
            List list;
            if (field14964.Method335() == 0) {
                list = method3016.Method942(EnumFacing.EAST);
            }
            else {
                final Class1868 class1868 = method3016;
                final Class44 field14965 = this.Field14942;
                Intrinsics.checkExpressionValueIsNotNull((Object)field14965, "down");
                list = class1868.Method949(field14965.Method335(), EnumFacing.EAST);
            }
            field14963.addAll(list);
        }
        if (method3017 != null) {
            final ArrayList field14966 = this.Field14963;
            final Class44 field14967 = this.Field14942;
            Intrinsics.checkExpressionValueIsNotNull((Object)field14967, "down");
            List list2;
            if (field14967.Method335() == 0) {
                list2 = method3017.Method942(EnumFacing.WEST);
            }
            else {
                final Class1868 class1869 = method3017;
                final Class44 field14968 = this.Field14942;
                Intrinsics.checkExpressionValueIsNotNull((Object)field14968, "down");
                list2 = class1869.Method949(field14968.Method335(), EnumFacing.WEST);
            }
            field14966.addAll(list2);
        }
        if (method3018 != null) {
            final ArrayList field14969 = this.Field14963;
            final Class44 field14970 = this.Field14942;
            Intrinsics.checkExpressionValueIsNotNull((Object)field14970, "down");
            List list3;
            if (field14970.Method335() == 0) {
                list3 = method3018.Method942(EnumFacing.SOUTH);
            }
            else {
                final Class1868 class1870 = method3018;
                final Class44 field14971 = this.Field14942;
                Intrinsics.checkExpressionValueIsNotNull((Object)field14971, "down");
                list3 = class1870.Method949(field14971.Method335(), EnumFacing.SOUTH);
            }
            field14969.addAll(list3);
        }
        if (method3019 != null) {
            final ArrayList field14972 = this.Field14963;
            final Class44 field14973 = this.Field14942;
            Intrinsics.checkExpressionValueIsNotNull((Object)field14973, "down");
            List list4;
            if (field14973.Method335() == 0) {
                list4 = method3019.Method942(EnumFacing.NORTH);
            }
            else {
                final Class1868 class1871 = method3019;
                final Class44 field14974 = this.Field14942;
                Intrinsics.checkExpressionValueIsNotNull((Object)field14974, "down");
                list4 = class1871.Method949(field14974.Method335(), EnumFacing.NORTH);
            }
            field14972.addAll(list4);
        }
        if (this.Field14963.isEmpty()) {
            return;
        }
        final Class1868 class1872 = method3016;
        final int n = (class1872 != null) ? class1872.Method943(EnumFacing.EAST, method3015) : -1;
        final Class1868 class1873 = method3017;
        final int n2 = (class1873 != null) ? class1873.Method943(EnumFacing.WEST, method3015) : -1;
        final Class1868 class1874 = method3018;
        final int n3 = (class1874 != null) ? class1874.Method943(EnumFacing.SOUTH, method3015) : -1;
        final Class1868 class1875 = method3019;
        final int n4 = (class1875 != null) ? class1875.Method943(EnumFacing.NORTH, method3015) : -1;
        Class1868 field14975 = null;
        EnumFacing method3020 = null;
        if (field14975 == null) {
            field14975 = Class1868.Field16580;
            method3020 = Class184.Method1115(method3015, Class721.Method3016());
        }
        final ArrayList field14976 = this.Field14964;
        final Class44 field14977 = this.Field14942;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14977, "down");
        List list5;
        if (field14977.Method335() == 0) {
            final Class1868 class1876 = field14975;
            final EnumFacing enumFacing = method3020;
            if (enumFacing == null) {
                Intrinsics.throwNpe();
            }
            list5 = class1876.Method942(enumFacing);
        }
        else {
            final Class1868 class1877 = field14975;
            final Class44 field14978 = this.Field14942;
            Intrinsics.checkExpressionValueIsNotNull((Object)field14978, "down");
            final int method3021 = field14978.Method335();
            final EnumFacing enumFacing2 = method3020;
            if (enumFacing2 == null) {
                Intrinsics.throwNpe();
            }
            list5 = class1877.Method949(method3021, enumFacing2);
        }
        field14976.addAll(list5);
        final Class44 field14979 = this.Field14942;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14979, "down");
        if (field14979.Method335() > 0) {
            final ArrayList list6 = this.Field14963;
            final BlockPos blockPos = method3015;
            final Class44 field14980 = this.Field14942;
            Intrinsics.checkExpressionValueIsNotNull((Object)field14980, "down");
            list6.add(blockPos.down(field14980.Method335()));
            final IBlockState getBlockState = Method5964().world.getBlockState(method3015.down());
            Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState, "mc.world.getBlockState(playerPosition.down())");
            if (Intrinsics.areEqual((Object)getBlockState.getBlock(), (Object)Blocks.AIR) ^ true) {
                final BlockPos blockPos2 = method3015;
                final Class44 field14981 = this.Field14942;
                Intrinsics.checkExpressionValueIsNotNull((Object)field14981, "down");
                this.Field14965 = blockPos2.down(field14981.Method335());
                final BlockPos blockPos3 = method3015;
                final Class44 field14982 = this.Field14942;
                Intrinsics.checkExpressionValueIsNotNull((Object)field14982, "down");
                this.Method5958(blockPos3.down(field14982.Method335()));
                return;
            }
        }
        final Class44 field14983 = this.Field14942;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14983, "down");
        List list7;
        if (field14983.Method335() == 0) {
            list7 = field14975.Method942(method3020);
        }
        else {
            final Class1868 class1878 = field14975;
            final Class44 field14984 = this.Field14942;
            Intrinsics.checkExpressionValueIsNotNull((Object)field14984, "down");
            list7 = class1878.Method949(field14984.Method335(), method3020);
        }
        final Iterator<BlockPos> iterator = list7.iterator();
        while (iterator.hasNext()) {
            final BlockPos add = method3015.add((Vec3i)iterator.next());
            final IBlockState getBlockState2 = Method5964().world.getBlockState(add);
            Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState2, "mc.world.getBlockState(finalPos)");
            if (Intrinsics.areEqual((Object)getBlockState2.getBlock(), (Object)Blocks.AIR) ^ true) {
                this.Method5958(this.Field14965 = add);
                return;
            }
        }
        this.Field14965 = null;
    }
    
    private final Class1868 Method5962(final EnumFacing enumFacing, final BlockPos blockPos) {
        final Class1868 class1868 = null;
        for (final Class1868 class1869 : Class1868.values()) {
            final Object value = this.Field14967.get(class1869);
            if (value == null) {
                Intrinsics.throwNpe();
            }
            if (((Class44)value).Method365()) {
                final Class44 field14942 = this.Field14942;
                Intrinsics.checkExpressionValueIsNotNull((Object)field14942, "down");
                if (field14942.Method335() == 0) {
                    if (class1869.Method947(enumFacing, blockPos)) {
                        final Class44 field14943 = this.Field14940;
                        Intrinsics.checkExpressionValueIsNotNull((Object)field14943, "blockRangeCheck");
                        if (field14943.Method365()) {
                            final Class1868 class1870 = class1869;
                            final Class44 field14944 = this.Field14941;
                            Intrinsics.checkExpressionValueIsNotNull((Object)field14944, "blockRange");
                            if (class1870.Method945(enumFacing, blockPos, field14944.Method367())) {}
                        }
                    }
                }
                else {
                    final Class1868 class1871 = class1869;
                    final Class44 field14945 = this.Field14942;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field14945, "down");
                    if (class1871.Method948(enumFacing, blockPos, field14945.Method335())) {
                        final Class44 field14946 = this.Field14940;
                        Intrinsics.checkExpressionValueIsNotNull((Object)field14946, "blockRangeCheck");
                        if (field14946.Method365()) {
                            final Class1868 class1872 = class1869;
                            final Class44 field14947 = this.Field14941;
                            Intrinsics.checkExpressionValueIsNotNull((Object)field14947, "blockRange");
                            final double method367 = field14947.Method367();
                            final Class44 field14948 = this.Field14942;
                            Intrinsics.checkExpressionValueIsNotNull((Object)field14948, "down");
                            if (class1872.Method946(enumFacing, blockPos, method367, field14948.Method335())) {}
                        }
                    }
                }
            }
        }
        return class1868;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method5963(@NotNull @NotNull final RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, "event");
        if (this.Field14954.Method3790() && this.Field14966 != null) {
            for (final BlockPos o : this.Field14963) {
                final EntityPlayer field14966 = this.Field14966;
                if (field14966 == null) {
                    Intrinsics.throwNpe();
                }
                final BlockPos add = Class721.Method3015((Entity)field14966).add((Vec3i)o);
                if (Intrinsics.areEqual((Object)this.Field14965, (Object)add)) {
                    final Class1612 field14967 = this.Field14954;
                    final BlockPos blockPos = add;
                    Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, "pos1");
                    final Class44 field14968 = this.Field14957;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field14968, "processingBlockColor1");
                    final Class2027 method339 = field14968.Method339();
                    Intrinsics.checkExpressionValueIsNotNull((Object)method339, "processingBlockColor1.colour");
                    final Class44 field14969 = this.Field14958;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field14969, "processingBlockColor2");
                    final Class2027 method340 = field14969.Method339();
                    Intrinsics.checkExpressionValueIsNotNull((Object)method340, "processingBlockColor2.colour");
                    field14967.Method3803(blockPos, method339, method340);
                }
                else if (this.Field14964.contains(o)) {
                    final Class1612 field14970 = this.Field14954;
                    final BlockPos blockPos2 = add;
                    Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, "pos1");
                    final Class44 field14971 = this.Field14955;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field14971, "currentFacingColor1");
                    final Class2027 method341 = field14971.Method339();
                    Intrinsics.checkExpressionValueIsNotNull((Object)method341, "currentFacingColor1.colour");
                    final Class44 field14972 = this.Field14956;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field14972, "currentFacingColor2");
                    final Class2027 method342 = field14972.Method339();
                    Intrinsics.checkExpressionValueIsNotNull((Object)method342, "currentFacingColor2.colour");
                    field14970.Method3803(blockPos2, method341, method342);
                }
                else {
                    final Class1612 field14973 = this.Field14954;
                    final BlockPos blockPos3 = add;
                    Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, "pos1");
                    field14973.Method3805(blockPos3);
                }
            }
        }
    }
    
    public Class1488() {
        super("CityBoss", "Breaks surround of nearest player.", Class97.Field8338);
        this.Field14939 = this.Method23(new Class44("Range", this, Double.longBitsToDouble(4626322717216342016L), 1.0, Double.longBitsToDouble((long)1406642018 ^ 0x403E000053D7A762L), true));
        this.Field14940 = this.Method23(new Class44("Block Range Check", this, false));
        this.Field14941 = this.Method23(new Class44("Block Range", this, Double.longBitsToDouble(4617315517961601024L), 1.0, Double.longBitsToDouble(4618441417868443648L), false));
        this.Field14942 = this.Method23(new Class44("Down", this, 1.0, 0.0, Double.longBitsToDouble((long)1877411457 ^ 0x400800006FE70681L), true));
        this.Field14943 = this.Method23(new Class44("Mine Mode", this, Class1493.Field14981));
        this.Field14944 = this.Method24(new Class1996(new Class44("Cases", this)));
        this.Field14945 = this.Method23(this.Field14944.Method7405(new Class44("Simple Case 1", this, true)));
        this.Field14946 = this.Method23(this.Field14944.Method7405(new Class44("Simple Case 2", this, true)));
        this.Field14947 = this.Method23(this.Field14944.Method7405(new Class44("Middle Case", this, true)));
        this.Field14948 = this.Method23(this.Field14944.Method7405(new Class44("Left Diagonal", this, true)));
        this.Field14949 = this.Method23(this.Field14944.Method7405(new Class44("Right Diagonal", this, true)));
        this.Field14950 = this.Method23(new Class44("Debug 1", this, false));
        this.Field14951 = this.Method23(new Class44("Debug 2", this, false));
        this.Field14952 = this.Method24(new Class1996(new Class44("Auto ReR Sync", this)));
        final Class1996 field14952 = this.Field14952;
        final Class44 method355 = new Class44("Auto Rer Target Sync", this, false).Method355("Target");
        Intrinsics.checkExpressionValueIsNotNull((Object)method355, "Setting(\"Auto Rer Target\u2026false).setTitle(\"Target\")");
        this.Field14953 = this.Method23(field14952.Method7405(method355));
        final Class1612 class1612 = new Class1612(this);
        final Class1996 method356 = this.Method24(new Class1996(new Class44("Render", this)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method356, "register(SettingGroup(Setting(\"Render\", this)))");
        final Class1612 method357;
        final Class1612 field14953 = method357 = ((Class1612)class1612.Method772(method356)).Method3788().Method3789();
        method357.Method3780().Method355("Other Blocks First");
        method357.Method3781().Method355("Other Blocks Second");
        this.Field14954 = field14953;
        this.Field14955 = this.Method23(this.Field14954.Method3778().Method7405(new Class44("Render Color Other Blocks", this, "Current Facing First", new Class2027(255, 255, 255, 255))));
        this.Field14956 = this.Method23(this.Field14954.Method3778().Method7405(new Class44("Render Second Color Other Blocks", this, "Current Facing Second", new Class2027(255, 255, 255, 255))));
        this.Field14957 = this.Method23(this.Field14954.Method3778().Method7405(new Class44("Render Color Processing Block", this, "Processing Block First", new Class2027(0, 255, 0, 255))));
        this.Field14958 = this.Method23(this.Field14954.Method3778().Method7405(new Class44("Render Second Color Processing Block", this, "Processing Block Second", new Class2027(0, 255, 0, 255))));
        this.Field14959 = this.Method54();
        final Class173 class1613 = new Class173(this);
        final Class411 field14954 = this.Field14959;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14954, "threads");
        this.Field14960 = new Class61(class1613, field14954);
        this.Field14963 = new ArrayList();
        this.Field14964 = new ArrayList();
        this.Field14967 = MapsKt.mapOf(new Pair[] { TuplesKt.to((Object)Class1868.Field16580, (Object)this.Field14945), TuplesKt.to((Object)Class1868.Field16581, (Object)this.Field14946), TuplesKt.to((Object)Class1868.Field16579, (Object)this.Field14947), TuplesKt.to((Object)Class1868.Field16582, (Object)this.Field14948), TuplesKt.to((Object)Class1868.Field16583, (Object)this.Field14949) });
    }
    
    public static final Minecraft Method5964() {
        return Class42.Field8052;
    }
    
    public static final void Method5965(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    public static final Class44 Method5966(final Class1488 class1488) {
        return class1488.Field14939;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3D4D ^ 0x76));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
