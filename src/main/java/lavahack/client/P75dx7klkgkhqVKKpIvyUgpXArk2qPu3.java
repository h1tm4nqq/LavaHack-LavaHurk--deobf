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
import lavahack.client.FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.Ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.vo8JGtFXaeonZQiouVGTbpILJYQDvWk4;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2={"Lcom/kisman/cc/features/module/movement/ScaffoldRewrite;", "Lcom/kisman/cc/features/module/Module;", "()V", "debug2", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "lastY", "", "packet", "swap", "Lcom/kisman/cc/settings/types/SettingEnum;", "Lcom/kisman/cc/util/enums/dynamic/SwapEnum2$Swap;", "tower", "addConnectingBlocks", "", "pos1", "Lnet/minecraft/util/math/BlockPos;", "pos2", "queue", "Ljava/util/Queue;", "connected", "", "getPossibleConnectingFacings", "Lcom/kisman/cc/util/collections/Pair;", "Lnet/minecraft/util/EnumFacing;", "isTowerActive", "onEnable", "update", "kisman.cc"})
public final class P75dx7klkgkhqVKKpIvyUgpXArk2qPu3
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10210 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Debug2", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1298130379 ^ (long)-1298130380)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10211 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Tower", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-212751755 ^ (long)-212751755)));
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field10212 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Swap", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11028).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10213 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1496214618L ^ 0x592E6C5A) != 0));
    private double Field10214;
    private String Field10215 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        if (P75dx7klkgkhqVKKpIvyUgpXArk2qPu3.Method2394().player != null && P75dx7klkgkhqVKKpIvyUgpXArk2qPu3.Method2394().world != null) {
            this.Field10214 = P75dx7klkgkhqVKKpIvyUgpXArk2qPu3.Method2394().player.posY;
            P75dx7klkgkhqVKKpIvyUgpXArk2qPu3.Method2394().player.jump();
            return;
        }
        this.Method22();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void Method45() {
        if (P75dx7klkgkhqVKKpIvyUgpXArk2qPu3.Method2394().player == null) return;
        if (P75dx7klkgkhqVKKpIvyUgpXArk2qPu3.Method2394().world == null) {
            return;
        }
        var1_1 = (int)((long)1871280225 ^ (long)-1871280226);
        var2_2 = P75dx7klkgkhqVKKpIvyUgpXArk2qPu3.Method2394().player.inventory.currentItem;
        var3_3 = (int)((long)-1019986438 ^ (long)-1019986437);
        v0 = P75dx7klkgkhqVKKpIvyUgpXArk2qPu3.Method2394().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)v0, (String)"mc.player");
        v1 = Block.getBlockFromItem((Item)v0.getHeldItemOffhand().item);
        Intrinsics.checkExpressionValueIsNotNull((Object)v1, (String)"Block.getBlockFromItem(m\u2026yer.heldItemOffhand.item)");
        v2 = v1.getDefaultState();
        Intrinsics.checkExpressionValueIsNotNull((Object)v2, (String)"Block.getBlockFromItem(m\u2026ffhand.item).defaultState");
        if (v2.isFullBlock()) ** GOTO lbl-1000
        v3 = P75dx7klkgkhqVKKpIvyUgpXArk2qPu3.Method2394().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)v3, (String)"mc.player");
        v4 = Block.getBlockFromItem((Item)v3.getHeldItemMainhand().item);
        Intrinsics.checkExpressionValueIsNotNull((Object)v4, (String)"Block.getBlockFromItem(m\u2026er.heldItemMainhand.item)");
        v5 = v4.getDefaultState();
        Intrinsics.checkExpressionValueIsNotNull((Object)v5, (String)"Block.getBlockFromItem(m\u2026inhand.item).defaultState");
        if (!v5.isFullBlock()) {
            var1_1 = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method102();
            if (var1_1 == ((int)983574884L ^ -983574885)) {
                NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5504().Method1886("No blocks! Disabling!");
                super.Method21((boolean)((long)155153677 ^ (long)155153677));
                return;
            }
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = (int)-1592546604L ^ -1592546604;
        }
        if (this.Method27()) {
            v6 = P75dx7klkgkhqVKKpIvyUgpXArk2qPu3.Method2394().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)v6, (String)"mc.player");
            if (vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Method5948(v6.getPosition().down(), (boolean)((long)1633742550 ^ (long)1633742550), (boolean)((int)-1238194633L ^ -1238194634))) {
                v7 = P75dx7klkgkhqVKKpIvyUgpXArk2qPu3.Method2394().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)v7, (String)"mc.player");
                v8 = v7.getPosition().down();
                v9 = (int)185528293L ^ 185528293;
                v10 = this.Field10213;
                Intrinsics.checkExpressionValueIsNotNull((Object)v10, (String)"packet");
                h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4208(v8, EnumHand.MAIN_HAND, v9, v10.Method365());
            }
            if (P75dx7klkgkhqVKKpIvyUgpXArk2qPu3.Method2394().player.onGround) {
                P75dx7klkgkhqVKKpIvyUgpXArk2qPu3.Method2394().player.jump();
                this.Field10214 = P75dx7klkgkhqVKKpIvyUgpXArk2qPu3.Method2394().player.posY;
                return;
            }
            P75dx7klkgkhqVKKpIvyUgpXArk2qPu3.Method2394().player.motionY = Double.longBitsToDouble((long)895269918 ^ -4624656385133187598L);
            return;
        }
        var4_4 = new LinkedList<E>();
        var5_5 = new BlockPos(P75dx7klkgkhqVKKpIvyUgpXArk2qPu3.Method2394().player.posX, P75dx7klkgkhqVKKpIvyUgpXArk2qPu3.Method2394().player.posY, P75dx7klkgkhqVKKpIvyUgpXArk2qPu3.Method2394().player.posZ).down();
        var6_6 = new BlockPos(P75dx7klkgkhqVKKpIvyUgpXArk2qPu3.Method2394().player.posX + P75dx7klkgkhqVKKpIvyUgpXArk2qPu3.Method2394().player.motionX, P75dx7klkgkhqVKKpIvyUgpXArk2qPu3.Method2394().player.posY, P75dx7klkgkhqVKKpIvyUgpXArk2qPu3.Method2394().player.posZ + P75dx7klkgkhqVKKpIvyUgpXArk2qPu3.Method2394().player.motionZ).down();
        v11 = var5_5;
        Intrinsics.checkExpressionValueIsNotNull((Object)v11, (String)"oldPos");
        v12 = var6_6;
        Intrinsics.checkExpressionValueIsNotNull((Object)v12, (String)"playerPos");
        if (!this.Method2391(v11, v12)) {
            v13 = this.Field10210;
            Intrinsics.checkExpressionValueIsNotNull((Object)v13, (String)"debug2");
            if (v13.Method365()) {
                this.Method2392(var5_5, var6_6, var4_4);
            }
        }
        var4_4.add(var6_6);
        var8_7 = var4_4.iterator();
        while (var8_7.hasNext() != false) {
            var7_8 = (BlockPos)var8_7.next();
            if (!vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Method5948(var7_8, (boolean)((long)1391903446 ^ (long)1391903446), (boolean)((long)-1858824521 ^ (long)-1858824522))) continue;
            v14 = (int)((long)2083963202 ^ (long)2083963202);
            v15 = this.Field10213;
            Intrinsics.checkExpressionValueIsNotNull((Object)v15, (String)"packet");
            h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4208(var7_8, EnumHand.MAIN_HAND, (boolean)v14, v15.Method365());
        }
    }

    private final boolean Method27() {
        int n;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field10211;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"tower");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365() && (double)((int)P75dx7klkgkhqVKKpIvyUgpXArk2qPu3.Method2394().player.posY) > this.Field10214) {
            n = (int)1104664133L ^ 0x41D7D644;
            return n != 0;
        }
        n = (int)1909704650L ^ 0x71D3C7CA;
        return n != 0;
    }

    private final boolean Method2391(BlockPos blockPos, BlockPos blockPos2) {
        Object[] objectArray = new BlockPos[(int)1504993842L ^ 0x59B46237];
        objectArray[(int)1941356107L ^ 0x73B6BE4B] = blockPos;
        objectArray[(int)((long)244302147 ^ (long)244302146)] = blockPos.north();
        objectArray[(int)((long)165238649 ^ (long)165238648) << 1] = blockPos.east();
        objectArray[(int)((long)1333376057 ^ (long)1333376058)] = blockPos.south();
        objectArray[((int)-933093661L ^ 0xC8621EE2) << 2] = blockPos.west();
        return CollectionsKt.listOf((Object[])objectArray).contains(blockPos2);
    }

    private final void Method2392(BlockPos blockPos, BlockPos blockPos2, Queue queue) {
        Ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq = this.Method2393(blockPos, blockPos2);
        BlockPos blockPos3 = blockPos.offset((EnumFacing)ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq.Method2522());
        BlockPos blockPos4 = blockPos.offset((EnumFacing)ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq.Method2523());
        EntityPlayerSP entityPlayerSP = P75dx7klkgkhqVKKpIvyUgpXArk2qPu3.Method2394().player;
        BlockPos blockPos5 = blockPos3;
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos5, (String)"p1");
        double d = entityPlayerSP.getDistanceSq((double)blockPos5.getX() + Double.longBitsToDouble(0x907CC8124F160865L ^ 0xAF9CC8124F160865L), (double)blockPos3.getY(), (double)blockPos3.getZ() + Double.longBitsToDouble((long)2013496954 ^ 0x3FE000007803867AL));
        EntityPlayerSP entityPlayerSP2 = P75dx7klkgkhqVKKpIvyUgpXArk2qPu3.Method2394().player;
        BlockPos blockPos6 = blockPos4;
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos6, (String)"p2");
        if (d < entityPlayerSP2.getDistanceSq((double)blockPos6.getX() + Double.longBitsToDouble(0x4618083FFEFA308L ^ 0x3B818083FFEFA308L), (double)blockPos4.getY(), (double)blockPos4.getZ() + Double.longBitsToDouble(0x2A4D0A6884B1BC3DL ^ 0x15AD0A6884B1BC3DL))) {
            queue.add(blockPos3);
        } else {
            queue.add(blockPos4);
        }
        if (blockPos.getY() >= blockPos2.getY()) return;
        queue.add(blockPos2.down());
    }

    private final Ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq Method2393(BlockPos blockPos, BlockPos blockPos2) {
        List list = new ArrayList();
        if (blockPos.getX() < blockPos2.getX()) {
            list.add(EnumFacing.EAST);
        } else {
            list.add(EnumFacing.WEST);
        }
        if (blockPos.getZ() < blockPos2.getZ()) {
            list.add(EnumFacing.SOUTH);
            return new Ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq(list.get((int)((long)-1610315343 ^ (long)-1610315343)), list.get((int)((long)-82611199 ^ (long)-82611200)));
        }
        list.add(EnumFacing.NORTH);
        return new Ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq(list.get((int)((long)-1610315343 ^ (long)-1610315343)), list.get((int)((long)-82611199 ^ (long)-82611200)));
    }

    public P75dx7klkgkhqVKKpIvyUgpXArk2qPu3() {
        super("ScaffoldRewrite", "ohhhh", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8340);
    }

    public static final Minecraft Method2394() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method2395(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)660106496 ^ (long)660106496);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1980279141 ^ (long)1980279194);
            int n2 = (int)358440770L ^ 0x155D5F3D;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1628904495 ^ (long)-1628912814) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

