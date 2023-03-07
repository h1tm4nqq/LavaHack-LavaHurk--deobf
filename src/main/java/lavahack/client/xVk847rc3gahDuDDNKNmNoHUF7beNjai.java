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

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
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
import lavahack.client.EfXHaWvRZ3sJRgPAk4iWnLScsCeNBnTH;
import lavahack.client.GMX4zGkGCEBL3RzM3pAccbEOC6fgYiKM;
import lavahack.client.IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk;
import lavahack.client.L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN;
import lavahack.client.MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK;
import lavahack.client.Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ;
import lavahack.client.V6J7zszJg3aDVWGVNgIfZR9Z0B2PCHhk;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD;
import lavahack.client.cyLqWrs7Rz1w0lV5rUS0mYXraako9yXI;
import lavahack.client.h0z1yvYP96doPrGLztrdTjS3jHWuMnCN;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.oe1ITGLCYHoWTDuRDY0aGgkZ7Y5hw0lT;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xVk847rc3gahDuDDNKNmNoHUF7beNjai$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.xVk847rc3gahDuDDNKNmNoHUF7beNjai$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
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

@GMX4zGkGCEBL3RzM3pAccbEOC6fgYiKM
@YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz
@EfXHaWvRZ3sJRgPAk4iWnLScsCeNBnTH
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001@B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010.\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0012\u00104\u001a\u0002002\b\u00105\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u00106\u001a\u000200H\u0016J\u0010\u00107\u001a\u0002002\u0006\u00108\u001a\u000209H\u0007J\u001a\u0010:\u001a\u0004\u0018\u00010\f2\u0006\u0010;\u001a\u00020<2\u0006\u00105\u001a\u00020\u0014H\u0002J\u0010\u0010=\u001a\u0002002\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\n\u0010>\u001a\u0004\u0018\u00010\u001eH\u0002J\b\u0010?\u001a\u000200H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e\u00a2\u0006\b\n\u0000\u0012\u0004\b\u001f\u0010\u0002R\u001e\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010$\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010'\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010(\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010)\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010,\u001a\n \u0005*\u0004\u0018\u00010-0-X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2={"Lcom/kisman/cc/features/module/combat/CityBoss;", "Lcom/kisman/cc/features/module/Module;", "()V", "autorerSync", "Lcom/kisman/cc/settings/types/SettingGroup;", "kotlin.jvm.PlatformType", "autorerTargetSync", "Lcom/kisman/cc/settings/Setting;", "blockRange", "blockRangeCheck", "caseSettings", "", "Lcom/kisman/cc/features/module/combat/cityboss/Cases;", "cases", "clicked", "", "currentFacingColor1", "currentFacingColor2", "currentPosses", "Ljava/util/ArrayList;", "Lnet/minecraft/util/math/BlockPos;", "Lkotlin/collections/ArrayList;", "debug1", "debug2", "down", "lastPos", "leftDiagonalCase", "middleCase", "mineMode", "player", "Lnet/minecraft/entity/player/EntityPlayer;", "player$annotations", "posses", "processingBlock", "processingBlockColor1", "processingBlockColor2", "range", "renderer", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "rightDiagonalCase", "simpleCase1", "simpleCase2", "targets", "Lcom/kisman/cc/util/entity/TargetFinder;", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "canBeBurrowed", "displayInfo", "", "info", "", "isBurrowed", "mineBlock", "pos", "onEnable", "onRenderWorld", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "processFacing", "facing", "Lnet/minecraft/util/EnumFacing;", "processPlayer", "target", "update", "MineMode", "kisman.cc"})
public final class xVk847rc3gahDuDDNKNmNoHUF7beNjai
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14939 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x692AB1B27C24DF2DL ^ 0x291EB1B27C24DF2DL), 1.0, Double.longBitsToDouble((long)1406642018 ^ 0x403E000053D7A762L), ((int)-218031162L ^ 0xF3011BC7) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14940 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Block Range Check", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1930011339 ^ (long)-1930011339)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14941 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Block Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x809F18E150AA2D21L ^ 0xC08B18E150AA2D21L), 1.0, Double.longBitsToDouble(0x52AF74FC8DC62625L ^ 0x12B774FC8DC62625L), ((int)-551378512L ^ 0xDF22A1B0) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14942 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Down", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble((long)1877411457 ^ 0x400800006FE70681L), (boolean)((long)1388980533 ^ (long)1388980532)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14943 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mine Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, xVk847rc3gahDuDDNKNmNoHUF7beNjai$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14981));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14944 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Cases", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14945 = this.Method23(this.Field14944.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Simple Case 1", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-125185144 ^ (long)-125185143))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14946 = this.Method23(this.Field14944.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Simple Case 2", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-312091113 ^ (long)-312091114))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14947 = this.Method23(this.Field14944.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Middle Case", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1712130532 ^ (long)-1712130531))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14948 = this.Method23(this.Field14944.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Left Diagonal", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1848491358L ^ 0x91D242A3) != 0)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14949 = this.Method23(this.Field14944.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Right Diagonal", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-98337293L ^ 0xFA237DF2) != 0)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14950 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Debug 1", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)226348004 ^ (long)226348004)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14951 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Debug 2", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)232592123 ^ (long)232592123)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14952 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Auto ReR Sync", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14953;
    private final MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK Field14954;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14955;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14956;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14957;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14958;
    private final Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ Field14959;
    private final IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk Field14960;
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
        this.Field14961 = (int)-759380005L ^ 0xD2BCC7DB;
        this.Field14962 = null;
    }

    private final void Method5956(String string) {
        String string2;
        StringBuilder stringBuilder = new StringBuilder().append((char)((long)1292484536 ^ (long)1292484579));
        if (this.Field14966 == null) {
            string2 = string;
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            EntityPlayer entityPlayer = this.Field14966;
            if (entityPlayer == null) {
                Intrinsics.throwNpe();
            }
            string2 = stringBuilder2.append(entityPlayer.getName()).append(((int)-1973304643L ^ 0x8A61C2A2) << 2).append(string).toString();
        }
        this.Method43(stringBuilder.append(string2).append((char)((long)1727362361 ^ (long)1727362404)).toString());
    }

    @Override
    public void Method45() {
        if (xVk847rc3gahDuDDNKNmNoHUF7beNjai.Method5964().player == null) return;
        if (xVk847rc3gahDuDDNKNmNoHUF7beNjai.Method5964().world == null) {
            return;
        }
        this.Field14963.clear();
        this.Field14964.clear();
        this.Field14960.Method499();
        this.Field14965 = null;
        this.Field14966 = this.Method5957();
        if (this.Field14966 == null) {
            this.Method5956("no target no fun");
            this.Field14961 = (int)((long)-514417616 ^ (long)-514417616);
            this.Field14962 = null;
            return;
        }
        EntityPlayer entityPlayer = this.Field14966;
        if (entityPlayer == null) {
            Intrinsics.throwNpe();
        }
        if (this.Method5959(entityPlayer)) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field14950;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"debug1");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
                this.Method5956("Trapping");
                return;
            }
        }
        EntityPlayer entityPlayer2 = this.Field14966;
        if (entityPlayer2 == null) {
            Intrinsics.throwNpe();
        }
        if (this.Method5960(entityPlayer2)) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field14951;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"debug2");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) {
                this.Method5956("Mining burrow block");
                EntityPlayer entityPlayer3 = this.Field14966;
                if (entityPlayer3 == null) {
                    Intrinsics.throwNpe();
                }
                this.Method5958(oe1ITGLCYHoWTDuRDY0aGgkZ7Y5hw0lT.Method3015((Entity)entityPlayer3));
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
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field14953;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"autorerTargetSync");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            entityPlayer = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Field14558;
            return entityPlayer;
        }
        entityPlayer = this.Field14960.Method496();
        return entityPlayer;
    }

    private final void Method5958(BlockPos blockPos) {
        if ((Intrinsics.areEqual((Object)this.Field14962, (Object)blockPos) ^ (int)((long)-1380624889 ^ (long)-1380624890)) != 0) {
            this.Field14961 = (int)((long)-79846114 ^ (long)-79846114);
        }
        if (blockPos == null) {
            this.Field14962 = null;
            return;
        }
        RayTraceResult rayTraceResult = xVk847rc3gahDuDDNKNmNoHUF7beNjai.Method5964().world.rayTraceBlocks(new Vec3d(xVk847rc3gahDuDDNKNmNoHUF7beNjai.Method5964().player.posX, xVk847rc3gahDuDDNKNmNoHUF7beNjai.Method5964().player.posY + (double)xVk847rc3gahDuDDNKNmNoHUF7beNjai.Method5964().player.getEyeHeight(), xVk847rc3gahDuDDNKNmNoHUF7beNjai.Method5964().player.posZ), new Vec3d((double)blockPos.getX() + Double.longBitsToDouble((long)1600373608 ^ 0x3FE000005F63C368L), (double)blockPos.getY() - Double.longBitsToDouble(0xFCD6BB35D6046175L ^ 0xC336BB35D6046175L), (double)blockPos.getZ() + Double.longBitsToDouble(0x70E7FCBEE8BD5EF5L ^ 0x4F07FCBEE8BD5EF5L)));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field14943;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"mineMode");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341() == xVk847rc3gahDuDDNKNmNoHUF7beNjai$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14981) {
            EntityPlayerSP entityPlayerSP = xVk847rc3gahDuDDNKNmNoHUF7beNjai.Method5964().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
            if (!(entityPlayerSP.getHeldItemMainhand().getItem() instanceof ItemPickaxe)) {
                int n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method132(ItemPickaxe.class, (int)((long)1876970544 ^ (long)1876970544), (int)-179639748L ^ 0xF54AEA35);
                if (n == ((int)89200554L ^ 0x55117AB)) return;
                xVk847rc3gahDuDDNKNmNoHUF7beNjai.Method5964().player.inventory.currentItem = n;
            }
            PlayerControllerMP playerControllerMP = xVk847rc3gahDuDDNKNmNoHUF7beNjai.Method5964().playerController;
            RayTraceResult rayTraceResult2 = rayTraceResult;
            if (rayTraceResult2 == null || (rayTraceResult2 = rayTraceResult2.sideHit) == null) {
                rayTraceResult2 = EnumFacing.UP;
            }
            playerControllerMP.onPlayerDamageBlock(blockPos, (EnumFacing)rayTraceResult2);
            xVk847rc3gahDuDDNKNmNoHUF7beNjai.Method5964().player.swingArm(EnumHand.MAIN_HAND);
        } else if (!this.Field14961) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field14943;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"mineMode");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method341() == xVk847rc3gahDuDDNKNmNoHUF7beNjai$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14982) {
                cyLqWrs7Rz1w0lV5rUS0mYXraako9yXI cyLqWrs7Rz1w0lV5rUS0mYXraako9yXI2 = cyLqWrs7Rz1w0lV5rUS0mYXraako9yXI.Field14740;
                Intrinsics.checkExpressionValueIsNotNull((Object)cyLqWrs7Rz1w0lV5rUS0mYXraako9yXI2, (String)"PacketMine.instance");
                if (!cyLqWrs7Rz1w0lV5rUS0mYXraako9yXI2.Method35()) {
                    cyLqWrs7Rz1w0lV5rUS0mYXraako9yXI cyLqWrs7Rz1w0lV5rUS0mYXraako9yXI3 = cyLqWrs7Rz1w0lV5rUS0mYXraako9yXI.Field14740;
                    Intrinsics.checkExpressionValueIsNotNull((Object)cyLqWrs7Rz1w0lV5rUS0mYXraako9yXI3, (String)"PacketMine.instance");
                    cyLqWrs7Rz1w0lV5rUS0mYXraako9yXI3.Method21((boolean)((long)-1813411083 ^ (long)-1813411084));
                }
                if ((Intrinsics.areEqual((Object)L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1369(), (Object)blockPos) ^ ((int)1988985194L ^ 0x768D816B)) != 0) {
                    RayTraceResult rayTraceResult3 = rayTraceResult;
                    if (rayTraceResult3 == null || (rayTraceResult3 = rayTraceResult3.sideHit) == null) {
                        rayTraceResult3 = EnumFacing.UP;
                    }
                    L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1405(blockPos, (EnumFacing)rayTraceResult3);
                }
                this.Field14961 = (int)-1180548662L ^ 0xB9A241CB;
            }
        }
        this.Field14962 = blockPos;
    }

    private final boolean Method5959(EntityPlayer entityPlayer) {
        IBlockState iBlockState = xVk847rc3gahDuDDNKNmNoHUF7beNjai.Method5964().world.getBlockState(oe1ITGLCYHoWTDuRDY0aGgkZ7Y5hw0lT.Method3015((Entity)entityPlayer).up().up());
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(e\u2026sition(player).up().up())");
        return Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR);
    }

    private final boolean Method5960(EntityPlayer entityPlayer) {
        IBlockState iBlockState = xVk847rc3gahDuDDNKNmNoHUF7beNjai.Method5964().world.getBlockState(entityPlayer.getPosition());
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(player.position)");
        return (Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR) ^ ((int)1193475038L ^ 0x4722FBDF)) != 0;
    }

    private final void Method5961(EntityPlayer entityPlayer) {
        BlockPos blockPos;
        IBlockState iBlockState;
        List list;
        Object object;
        Collection collection;
        List list2;
        BlockPos blockPos2 = oe1ITGLCYHoWTDuRDY0aGgkZ7Y5hw0lT.Method3015((Entity)entityPlayer);
        h0z1yvYP96doPrGLztrdTjS3jHWuMnCN h0z1yvYP96doPrGLztrdTjS3jHWuMnCN2 = this.Method5962(EnumFacing.EAST, blockPos2);
        h0z1yvYP96doPrGLztrdTjS3jHWuMnCN h0z1yvYP96doPrGLztrdTjS3jHWuMnCN3 = this.Method5962(EnumFacing.WEST, blockPos2);
        h0z1yvYP96doPrGLztrdTjS3jHWuMnCN h0z1yvYP96doPrGLztrdTjS3jHWuMnCN4 = this.Method5962(EnumFacing.SOUTH, blockPos2);
        h0z1yvYP96doPrGLztrdTjS3jHWuMnCN h0z1yvYP96doPrGLztrdTjS3jHWuMnCN5 = this.Method5962(EnumFacing.NORTH, blockPos2);
        if (h0z1yvYP96doPrGLztrdTjS3jHWuMnCN2 != null) {
            List list3;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field14942;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"down");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method335() == 0) {
                list3 = h0z1yvYP96doPrGLztrdTjS3jHWuMnCN2.Method942(EnumFacing.EAST);
            } else {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field14942;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"down");
                list3 = h0z1yvYP96doPrGLztrdTjS3jHWuMnCN2.Method949(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method335(), EnumFacing.EAST);
            }
            this.Field14963.addAll(list3);
        }
        if (h0z1yvYP96doPrGLztrdTjS3jHWuMnCN3 != null) {
            List list4;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field14942;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"down");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method335() == 0) {
                list4 = h0z1yvYP96doPrGLztrdTjS3jHWuMnCN3.Method942(EnumFacing.WEST);
            } else {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field14942;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"down");
                list4 = h0z1yvYP96doPrGLztrdTjS3jHWuMnCN3.Method949(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method335(), EnumFacing.WEST);
            }
            this.Field14963.addAll(list4);
        }
        if (h0z1yvYP96doPrGLztrdTjS3jHWuMnCN4 != null) {
            List list5;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = this.Field14942;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"down");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method335() == 0) {
                list5 = h0z1yvYP96doPrGLztrdTjS3jHWuMnCN4.Method942(EnumFacing.SOUTH);
            } else {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = this.Field14942;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"down");
                list5 = h0z1yvYP96doPrGLztrdTjS3jHWuMnCN4.Method949(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7.Method335(), EnumFacing.SOUTH);
            }
            this.Field14963.addAll(list5);
        }
        if (h0z1yvYP96doPrGLztrdTjS3jHWuMnCN5 != null) {
            List list6;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8 = this.Field14942;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8, (String)"down");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8.Method335() == 0) {
                list6 = h0z1yvYP96doPrGLztrdTjS3jHWuMnCN5.Method942(EnumFacing.NORTH);
            } else {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9 = this.Field14942;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9, (String)"down");
                list6 = h0z1yvYP96doPrGLztrdTjS3jHWuMnCN5.Method949(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9.Method335(), EnumFacing.NORTH);
            }
            this.Field14963.addAll(list6);
        }
        if (this.Field14963.isEmpty()) {
            return;
        }
        int n = (int)-1052606133L ^ 0xC142814B;
        h0z1yvYP96doPrGLztrdTjS3jHWuMnCN h0z1yvYP96doPrGLztrdTjS3jHWuMnCN6 = h0z1yvYP96doPrGLztrdTjS3jHWuMnCN2;
        int n2 = h0z1yvYP96doPrGLztrdTjS3jHWuMnCN6 != null ? h0z1yvYP96doPrGLztrdTjS3jHWuMnCN6.Method943(EnumFacing.EAST, blockPos2) : (int)((long)-1589766154 ^ (long)1589766153);
        h0z1yvYP96doPrGLztrdTjS3jHWuMnCN h0z1yvYP96doPrGLztrdTjS3jHWuMnCN7 = h0z1yvYP96doPrGLztrdTjS3jHWuMnCN3;
        int n3 = h0z1yvYP96doPrGLztrdTjS3jHWuMnCN7 != null ? h0z1yvYP96doPrGLztrdTjS3jHWuMnCN7.Method943(EnumFacing.WEST, blockPos2) : (int)-901878114L ^ 0x35C19161;
        h0z1yvYP96doPrGLztrdTjS3jHWuMnCN h0z1yvYP96doPrGLztrdTjS3jHWuMnCN8 = h0z1yvYP96doPrGLztrdTjS3jHWuMnCN4;
        int n4 = h0z1yvYP96doPrGLztrdTjS3jHWuMnCN8 != null ? h0z1yvYP96doPrGLztrdTjS3jHWuMnCN8.Method943(EnumFacing.SOUTH, blockPos2) : (int)247854896L ^ 0xF13A08CF;
        h0z1yvYP96doPrGLztrdTjS3jHWuMnCN h0z1yvYP96doPrGLztrdTjS3jHWuMnCN9 = h0z1yvYP96doPrGLztrdTjS3jHWuMnCN5;
        int n5 = h0z1yvYP96doPrGLztrdTjS3jHWuMnCN9 != null ? h0z1yvYP96doPrGLztrdTjS3jHWuMnCN9.Method943(EnumFacing.NORTH, blockPos2) : (int)((long)-1815836807 ^ (long)1815836806);
        h0z1yvYP96doPrGLztrdTjS3jHWuMnCN h0z1yvYP96doPrGLztrdTjS3jHWuMnCN10 = null;
        EnumFacing enumFacing = null;
        if (h0z1yvYP96doPrGLztrdTjS3jHWuMnCN10 == null) {
            h0z1yvYP96doPrGLztrdTjS3jHWuMnCN10 = h0z1yvYP96doPrGLztrdTjS3jHWuMnCN.Field16580;
            enumFacing = V6J7zszJg3aDVWGVNgIfZR9Z0B2PCHhk.Method1115(blockPos2, oe1ITGLCYHoWTDuRDY0aGgkZ7Y5hw0lT.Method3016());
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10 = this.Field14942;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10, (String)"down");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10.Method335() == 0) {
            EnumFacing enumFacing2 = enumFacing;
            if (enumFacing2 == null) {
                Intrinsics.throwNpe();
            }
            list2 = h0z1yvYP96doPrGLztrdTjS3jHWuMnCN10.Method942(enumFacing2);
        } else {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11 = this.Field14942;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11, (String)"down");
            int n6 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11.Method335();
            EnumFacing enumFacing3 = enumFacing;
            if (enumFacing3 == null) {
                Intrinsics.throwNpe();
            }
            list2 = h0z1yvYP96doPrGLztrdTjS3jHWuMnCN10.Method949(n6, enumFacing3);
        }
        this.Field14964.addAll(list2);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12 = this.Field14942;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12, (String)"down");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12.Method335() > 0) {
            collection = this.Field14963;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13 = this.Field14942;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13, (String)"down");
            object = blockPos2.down(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13.Method335());
            int n7 = (int)((long)1796082253 ^ (long)1796082253);
            collection.add(object);
            IBlockState iBlockState2 = xVk847rc3gahDuDDNKNmNoHUF7beNjai.Method5964().world.getBlockState(blockPos2.down());
            Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState2, (String)"mc.world.getBlockState(playerPosition.down())");
            if ((Intrinsics.areEqual((Object)iBlockState2.getBlock(), (Object)Blocks.AIR) ^ (int)((long)544727134 ^ (long)544727135)) != 0) {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD14 = this.Field14942;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD14, (String)"down");
                this.Field14965 = blockPos2.down(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD14.Method335());
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD15 = this.Field14942;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD15, (String)"down");
                this.Method5958(blockPos2.down(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD15.Method335()));
                return;
            }
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD16 = this.Field14942;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD16, (String)"down");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD16.Method335() == 0) {
            list = h0z1yvYP96doPrGLztrdTjS3jHWuMnCN10.Method942(enumFacing);
        } else {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD17 = this.Field14942;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD17, (String)"down");
            list = h0z1yvYP96doPrGLztrdTjS3jHWuMnCN10.Method949(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD17.Method335(), enumFacing);
        }
        object = list.iterator();
        do {
            if (!object.hasNext()) {
                this.Field14965 = null;
                return;
            }
            collection = (BlockPos)object.next();
            blockPos = blockPos2.add((Vec3i)collection);
            iBlockState = xVk847rc3gahDuDDNKNmNoHUF7beNjai.Method5964().world.getBlockState(blockPos);
            Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(finalPos)");
        } while ((Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR) ^ (int)((long)-1020745152 ^ (long)-1020745151)) == 0);
        this.Field14965 = blockPos;
        this.Method5958(blockPos);
    }

    /*
     * Unable to fully structure code
     */
    private final h0z1yvYP96doPrGLztrdTjS3jHWuMnCN Method5962(EnumFacing var1_1, BlockPos var2_2) {
        var3_3 = 0x7FFFFFFF;
        var4_4 = null;
        var7_5 = h0z1yvYP96doPrGLztrdTjS3jHWuMnCN.values();
        var8_6 = var7_5.length;
        var6_7 = (int)((long)-905747774 ^ (long)-905747774);
        while (var6_7 < var8_6) {
            block6: {
                block7: {
                    var5_8 = var7_5[var6_7];
                    v0 = this.Field14967.get((Object)var5_8);
                    if (v0 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (!((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)v0).Method365()) break block6;
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
                        v4 = (int)((long)1623645384 ^ (long)1623645385);
                    } else lbl-1000:
                    // 2 sources

                    {
                        v4 = (int)1536347046L ^ 1536347046;
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
                    v4 = (int)-219077384L ^ -219077383;
                } else lbl-1000:
                // 2 sources

                {
                    v4 = (int)-1470588843L ^ -1470588843;
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
            if (Intrinsics.areEqual((Object)this.Field14965, (Object)(blockPos = oe1ITGLCYHoWTDuRDY0aGgkZ7Y5hw0lT.Method3015((Entity)entityPlayer).add((Vec3i)blockPos2)))) {
                BlockPos blockPos3 = blockPos;
                Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"pos1");
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field14957;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"processingBlockColor1");
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"processingBlockColor1.colour");
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field14958;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"processingBlockColor2");
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"processingBlockColor2.colour");
                this.Field14954.Method3803(blockPos3, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3);
                continue;
            }
            if (this.Field14964.contains(blockPos2)) {
                BlockPos blockPos4 = blockPos;
                Intrinsics.checkExpressionValueIsNotNull((Object)blockPos4, (String)"pos1");
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field14955;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"currentFacingColor1");
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"currentFacingColor1.colour");
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field14956;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"currentFacingColor2");
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, (String)"currentFacingColor2.colour");
                this.Field14954.Method3803(blockPos4, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5);
                continue;
            }
            BlockPos blockPos5 = blockPos;
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos5, (String)"pos1");
            this.Field14954.Method3805(blockPos5);
        }
    }

    public xVk847rc3gahDuDDNKNmNoHUF7beNjai() {
        super("CityBoss", "Breaks surround of nearest player.", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
        MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Auto Rer Target Sync", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1370102544L ^ 0x51AA1B10) != 0).Method355("Target");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"Setting(\"Auto Rer Target\u2026false).setTitle(\"Target\")");
        this.Field14953 = this.Method23(this.Field14952.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2));
        MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK2 = new MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK(this);
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render", this)));
        Intrinsics.checkExpressionValueIsNotNull((Object)xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2, (String)"register(SettingGroup(Setting(\"Render\", this)))");
        MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK3 = ((MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK)mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK2.Method772(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2)).Method3788().Method3789();
        xVk847rc3gahDuDDNKNmNoHUF7beNjai xVk847rc3gahDuDDNKNmNoHUF7beNjai2 = this;
        int n = (int)((long)-1063945429 ^ (long)-1063945429);
        int n2 = (int)-239074538L ^ 0xF1C00316;
        MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK4 = mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK3;
        int n3 = (int)846263891L ^ 0x3270F653;
        mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK4.Method3780().Method355("Other Blocks First");
        mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK4.Method3781().Method355("Other Blocks Second");
        xVk847rc3gahDuDDNKNmNoHUF7beNjai2.Field14954 = mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK = mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK3;
        this.Field14955 = this.Method23(this.Field14954.Method3778().Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render Color Other Blocks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Current Facing First", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)1585810494 ^ (long)1585810625), (int)((long)-695015529 ^ (long)-695015576), (int)((long)1735924398 ^ (long)1735924305), (int)487949034L ^ 0x1D158215))));
        this.Field14956 = this.Method23(this.Field14954.Method3778().Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render Second Color Other Blocks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Current Facing Second", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)372643319L ^ 0x16361508, (int)((long)1257814915 ^ (long)1257814908), (int)((long)878508619 ^ (long)878508724), (int)((long)-603721922 ^ (long)-603721791)))));
        this.Field14957 = this.Method23(this.Field14954.Method3778().Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render Color Processing Block", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Processing Block First", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)-1503533956 ^ (long)-1503533956), (int)((long)391537386 ^ (long)391537173), (int)((long)683377203 ^ (long)683377203), (int)((long)-1130356928 ^ (long)-1130356801)))));
        this.Field14958 = this.Method23(this.Field14954.Method3778().Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render Second Color Processing Block", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Processing Block Second", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)745898925 ^ (long)745898925), (int)((long)-983595486 ^ (long)-983595299), (int)((long)1686279496 ^ (long)1686279496), (int)((long)1011621197 ^ (long)1011621298)))));
        this.Field14959 = this.Method54();
        Supplier supplier = new xVk847rc3gahDuDDNKNmNoHUF7beNjai$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this);
        Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ = this.Field14959;
        Intrinsics.checkExpressionValueIsNotNull((Object)q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ, (String)"threads");
        this.Field14960 = new IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk(supplier, q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ);
        this.Field14963 = new ArrayList();
        this.Field14964 = new ArrayList();
        Pair[] pairArray = new Pair[(int)((long)-33732130 ^ (long)-33732133)];
        pairArray[(int)((long)-1684253755 ^ (long)-1684253755)] = TuplesKt.to((Object)((Object)h0z1yvYP96doPrGLztrdTjS3jHWuMnCN.Field16580), (Object)this.Field14945);
        pairArray[(int)1566371095L ^ 0x5D5CED16] = TuplesKt.to((Object)((Object)h0z1yvYP96doPrGLztrdTjS3jHWuMnCN.Field16581), (Object)this.Field14946);
        pairArray[(int)((long)594019197 ^ (long)594019196) << 1] = TuplesKt.to((Object)((Object)h0z1yvYP96doPrGLztrdTjS3jHWuMnCN.Field16579), (Object)this.Field14947);
        pairArray[(int)((long)-348583183 ^ (long)-348583182)] = TuplesKt.to((Object)((Object)h0z1yvYP96doPrGLztrdTjS3jHWuMnCN.Field16582), (Object)this.Field14948);
        pairArray[((int)2066606146L ^ 0x7B2DE843) << 2] = TuplesKt.to((Object)((Object)h0z1yvYP96doPrGLztrdTjS3jHWuMnCN.Field16583), (Object)this.Field14949);
        this.Field14967 = MapsKt.mapOf((Pair[])pairArray);
    }

    public static final Minecraft Method5964() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method5965(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method5966(xVk847rc3gahDuDDNKNmNoHUF7beNjai xVk847rc3gahDuDDNKNmNoHUF7beNjai2) {
        return xVk847rc3gahDuDDNKNmNoHUF7beNjai2.Field14939;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1045477159 ^ (long)-1045477159);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)697316305L ^ 0x2990332E);
            int n2 = (int)((long)-960993897 ^ (long)-960993876) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)1472069109L ^ 0x57BDC0B8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

