//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.block.Block
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.item.Item
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1036;
import lavahack.client.Class1303;
import lavahack.client.Class1393;
import lavahack.client.Class1486;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class574;
import lavahack.client.Class711;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2={"Lcom/kisman/cc/features/module/movement/ScaffoldRewrite;", "Lcom/kisman/cc/features/module/Module;", "()V", "debug2", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "lastY", "", "packet", "swap", "Lcom/kisman/cc/settings/types/SettingEnum;", "Lcom/kisman/cc/util/enums/dynamic/SwapEnum2$Swap;", "tower", "addConnectingBlocks", "", "pos1", "Lnet/minecraft/util/math/BlockPos;", "pos2", "queue", "Ljava/util/Queue;", "connected", "", "getPossibleConnectingFacings", "Lcom/kisman/cc/util/collections/Pair;", "Lnet/minecraft/util/EnumFacing;", "isTowerActive", "onEnable", "update", "kisman.cc"})
public final class Class523
extends Class42 {
    private final Class44 Field10210 = this.Method23(new Class44("Debug2", (Class42)this, true));
    private final Class44 Field10211 = this.Method23(new Class44("Tower", (Class42)this, false));
    private final Class1303 Field10212 = new Class1303("Swap", (Class42)this, Class711.Field11028).Method5303();
    private final Class44 Field10213 = this.Method23(new Class44("Packet", (Class42)this, false));
    private double Field10214;
    private String Field10215 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        if (Class523.Method2394().player != null && Class523.Method2394().world != null) {
            this.Field10214 = Class523.Method2394().player.posY;
            Class523.Method2394().player.jump();
            return;
        }
        this.Method22();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void Method45() {
        if (Class523.Method2394().player == null) return;
        if (Class523.Method2394().world == null) {
            return;
        }
        var1_1 = -1;
        var2_2 = Class523.Method2394().player.inventory.currentItem;
        var3_3 = true;
        v0 = Class523.Method2394().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)v0, (String)"mc.player");
        v1 = Block.getBlockFromItem((Item)v0.getHeldItemOffhand().item);
        Intrinsics.checkExpressionValueIsNotNull((Object)v1, (String)"Block.getBlockFromItem(m\u2026yer.heldItemOffhand.item)");
        v2 = v1.getDefaultState();
        Intrinsics.checkExpressionValueIsNotNull((Object)v2, (String)"Block.getBlockFromItem(m\u2026ffhand.item).defaultState");
        if (v2.isFullBlock()) ** GOTO lbl-1000
        v3 = Class523.Method2394().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)v3, (String)"mc.player");
        v4 = Block.getBlockFromItem((Item)v3.getHeldItemMainhand().item);
        Intrinsics.checkExpressionValueIsNotNull((Object)v4, (String)"Block.getBlockFromItem(m\u2026er.heldItemMainhand.item)");
        v5 = v4.getDefaultState();
        Intrinsics.checkExpressionValueIsNotNull((Object)v5, (String)"Block.getBlockFromItem(m\u2026inhand.item).defaultState");
        if (!v5.isFullBlock()) {
            var1_1 = Class9.Method102();
            if (var1_1 == -1) {
                Class1393.Method5504().Method1886("No blocks! Disabling!");
                super.Method21(false);
                return;
            }
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = false;
        }
        if (this.Method27()) {
            v6 = Class523.Method2394().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)v6, (String)"mc.player");
            if (Class1486.Method5948(v6.getPosition().down(), false, true)) {
                v7 = Class523.Method2394().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)v7, (String)"mc.player");
                v8 = v7.getPosition().down();
                v9 = this.Field10213;
                Intrinsics.checkExpressionValueIsNotNull((Object)v9, (String)"packet");
                Class1036.Method4208(v8, EnumHand.MAIN_HAND, false, v9.Method365());
            }
            if (Class523.Method2394().player.onGround) {
                Class523.Method2394().player.jump();
                this.Field10214 = Class523.Method2394().player.posY;
                return;
            }
            Class523.Method2394().player.motionY = Double.longBitsToDouble((long)895269918 ^ -4624656385133187598L);
            return;
        }
        var4_4 = new LinkedList<E>();
        var5_5 = new BlockPos(Class523.Method2394().player.posX, Class523.Method2394().player.posY, Class523.Method2394().player.posZ).down();
        var6_6 = new BlockPos(Class523.Method2394().player.posX + Class523.Method2394().player.motionX, Class523.Method2394().player.posY, Class523.Method2394().player.posZ + Class523.Method2394().player.motionZ).down();
        v10 = var5_5;
        Intrinsics.checkExpressionValueIsNotNull((Object)v10, (String)"oldPos");
        v11 = var6_6;
        Intrinsics.checkExpressionValueIsNotNull((Object)v11, (String)"playerPos");
        if (!this.Method2391(v10, v11)) {
            v12 = this.Field10210;
            Intrinsics.checkExpressionValueIsNotNull((Object)v12, (String)"debug2");
            if (v12.Method365()) {
                this.Method2392(var5_5, var6_6, var4_4);
            }
        }
        var4_4.add(var6_6);
        var8_7 = var4_4.iterator();
        while (var8_7.hasNext() != false) {
            var7_8 = (BlockPos)var8_7.next();
            if (!Class1486.Method5948(var7_8, false, true)) continue;
            v13 = this.Field10213;
            Intrinsics.checkExpressionValueIsNotNull((Object)v13, (String)"packet");
            Class1036.Method4208(var7_8, EnumHand.MAIN_HAND, false, v13.Method365());
        }
    }

    private final boolean Method27() {
        Class44 class44 = this.Field10211;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"tower");
        if (!class44.Method365()) return false;
        if (!((double)((int)Class523.Method2394().player.posY) > this.Field10214)) return false;
        return true;
    }

    private final boolean Method2391(BlockPos blockPos, BlockPos blockPos2) {
        return CollectionsKt.listOf((Object[])new BlockPos[]{blockPos, blockPos.north(), blockPos.east(), blockPos.south(), blockPos.west()}).contains(blockPos2);
    }

    private final void Method2392(BlockPos blockPos, BlockPos blockPos2, Queue queue) {
        Class574 class574 = this.Method2393(blockPos, blockPos2);
        BlockPos blockPos3 = blockPos.offset((EnumFacing)class574.Method2522());
        BlockPos blockPos4 = blockPos.offset((EnumFacing)class574.Method2523());
        EntityPlayerSP entityPlayerSP = Class523.Method2394().player;
        BlockPos blockPos5 = blockPos3;
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos5, (String)"p1");
        double d = entityPlayerSP.getDistanceSq((double)blockPos5.getX() + Double.longBitsToDouble(4602678819172646912L), (double)blockPos3.getY(), (double)blockPos3.getZ() + Double.longBitsToDouble((long)2013496954 ^ 0x3FE000007803867AL));
        EntityPlayerSP entityPlayerSP2 = Class523.Method2394().player;
        BlockPos blockPos6 = blockPos4;
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos6, (String)"p2");
        if (d < entityPlayerSP2.getDistanceSq((double)blockPos6.getX() + Double.longBitsToDouble(4602678819172646912L), (double)blockPos4.getY(), (double)blockPos4.getZ() + Double.longBitsToDouble(4602678819172646912L))) {
            queue.add(blockPos3);
        } else {
            queue.add(blockPos4);
        }
        if (blockPos.getY() >= blockPos2.getY()) return;
        queue.add(blockPos2.down());
    }

    private final Class574 Method2393(BlockPos blockPos, BlockPos blockPos2) {
        List list = new ArrayList();
        if (blockPos.getX() < blockPos2.getX()) {
            list.add(EnumFacing.EAST);
        } else {
            list.add(EnumFacing.WEST);
        }
        if (blockPos.getZ() < blockPos2.getZ()) {
            list.add(EnumFacing.SOUTH);
            return new Class574(list.get(0), list.get(1));
        }
        list.add(EnumFacing.NORTH);
        return new Class574(list.get(0), list.get(1));
    }

    public Class523() {
        super("ScaffoldRewrite", "ohhhh", Class97.Field8340);
    }

    public static final Minecraft Method2394() {
        return Class42.Field8052;
    }

    public static final void Method2395(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 127;
            cArray2[n] = (char)(cArray[n] ^ (0x2083 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

