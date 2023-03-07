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

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import com.kisman.cc.util.agYEaptPUW8OPC6jB7DK1WZuIoCKRIex;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.GMX4zGkGCEBL3RzM3pAccbEOC6fgYiKM;
import lavahack.client.IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy;
import lavahack.client.apMkTOYFgLbmdcA1wMUKdveSwIHOH1BJ;
import lavahack.client.hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$1;
import lavahack.client.hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import lavahack.client.hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import lavahack.client.hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.jD2gtZTnCH19EGvbKbXGsOxMql8GByzW;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.o73igJQaa2O9BEYFQNAk42oaxHBow5kd;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
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

@GMX4zGkGCEBL3RzM3pAccbEOC6fgYiKM
@ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy
@YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002?@B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020!H\u0002J\b\u0010\b\u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0002J\u0012\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(H\u0002J\u0012\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010*\u001a\u00020\rH\u0002J\u0012\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.H\u0002J \u0010/\u001a\u0012\u0012\u0004\u0012\u00020$00j\b\u0012\u0004\u0012\u00020$`12\u0006\u0010'\u001a\u00020(H\u0002J \u00102\u001a\u0002032\u0006\u00104\u001a\u00020$2\u0006\u00105\u001a\u0002032\u0006\u0010'\u001a\u00020(H\u0002J(\u00106\u001a\u0012\u0012\u0004\u0012\u00020$00j\b\u0012\u0004\u0012\u00020$`12\u0006\u00107\u001a\u00020(2\u0006\u00105\u001a\u000203H\u0002J\u0010\u00108\u001a\u00020!2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u00109\u001a\u00020!2\u0006\u0010:\u001a\u00020,H\u0002J\u0010\u0010;\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010<\u001a\u00020\u0017H\u0002J\b\u0010=\u001a\u00020!H\u0016J\b\u0010>\u001a\u00020!H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2={"Lcom/kisman/cc/features/module/combat/AutoCrystalPvP;", "Lcom/kisman/cc/features/module/Module;", "()V", "autoEat", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "autoEatGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "autoXP", "autoXPArmorPercent", "autoXPGroup", "autoXPMode", "Lcom/kisman/cc/settings/types/SettingEnum;", "Lcom/kisman/cc/features/module/combat/AutoCrystalPvP$AutoXPMode;", "autoXPOldSlot", "", "autoXPSilentDelay", "autoXPSilentTimer", "Lcom/kisman/cc/util/TimerUtils;", "autoXPSmart", "debug1", "debug2", "isEating", "", "lastIsMoving", "moveStateLogic", "targetIsUsingMultiPlace", "targetRange", "targets", "Lcom/kisman/cc/util/entity/TargetFinder;", "terrain", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "", "canPlace", "pos", "Lnet/minecraft/util/math/BlockPos;", "findSpot", "Lcom/kisman/cc/features/module/combat/autocrystalpvp/PlaceInfo;", "target", "Lnet/minecraft/entity/Entity;", "findSpotNew", "getAutoXPMode", "getHandOfItem", "Lnet/minecraft/util/EnumHand;", "item", "Lnet/minecraft/item/Item;", "getHoles", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getMaxTargetDamageFromHole", "", "hole", "range", "getPossibleHoles", "entity", "gotoSafeSpot", "handleAutoEat", "hand", "isBadPos", "isMoving", "onEnable", "update", "AutoXPMode", "MoveStateLogic", "kisman.cc"})
public final class hMvNpVNolah9lHVSC6HzLOZcg4ariBCk
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15014;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15015;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15016;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15017;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15018;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15019;
    private static final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field15020;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15021;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15022;
    private static final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field15023;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15024;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15025;
    private static final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field15026;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15027;
    private static final Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ Field15028;
    private static final IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk Field15029;
    private static final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field15030;
    private static boolean Field15031;
    private static boolean Field15032;
    private static int Field15033;
    public static final hMvNpVNolah9lHVSC6HzLOZcg4ariBCk Field15034;
    private String Field15035 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        Field15028.Method2004();
        Field15029.Method498();
        Field15030.Method2801();
        Field15031 = (int)-656182591L ^ 0xD8E372C1;
        Field15033 = (int)((long)1822611321 ^ (long)-1822611322);
        Field15032 = (int)1938154908L ^ 0x7385E59C;
    }

    @Override
    public void Method45() {
        int n;
        String string;
        if (hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().player == null) return;
        if (hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().world == null) return;
        if (hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().player.isDead) {
            return;
        }
        Field15029.Method499();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = Field15017;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"debug2");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            string = "Update 1";
            n = (int)91048818L ^ 0x56D4B72;
            System.out.println((Object)string);
        }
        if (Field15029.Method496() == null) return;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = Field15017;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"debug2");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) {
            string = "Update 2";
            n = (int)789790265L ^ 0x2F133E39;
            System.out.println((Object)string);
        }
        Field15028.Method2005(hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field10465);
    }

    private final void Method5997() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = Field15027;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"autoEat");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365() && !this.Method6001()) {
            Item item = Items.GOLDEN_APPLE;
            Intrinsics.checkExpressionValueIsNotNull((Object)item, (String)"Items.GOLDEN_APPLE");
            EnumHand enumHand = this.Method6002(item);
            if (enumHand == null) {
                int n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method116(Items.GOLDEN_APPLE, (int)140663559L ^ 0x8625B07, (int)1295175589L ^ 0x4D32CFAC);
                if (n == (int)((long)2028569883 ^ (long)-2028569884)) {
                    return;
                }
                hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().player.inventory.currentItem = n;
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
        Field15032 = (int)((long)-973249530 ^ (long)-973249530);
    }

    private final void Method5998(EnumHand enumHand) {
        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().playerController.processRightClick((EntityPlayer)hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().player, (World)hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().world, enumHand);
        Field15032 = (int)76004642L ^ 0x487BD23;
    }

    /*
     * Unable to fully structure code
     */
    private final void Method5999() {
        block11: {
            block12: {
                block14: {
                    block13: {
                        v0 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Field15021;
                        Intrinsics.checkExpressionValueIsNotNull((Object)v0, (String)"autoXP");
                        if (!v0.Method365()) break block11;
                        v1 = (EntityPlayer)hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().player;
                        v2 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Field15025;
                        Intrinsics.checkExpressionValueIsNotNull((Object)v2, (String)"autoXPArmorPercent");
                        if (!lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method137(v1, v2.Method368())) break block11;
                        if (this.Method6000() != hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field9329) break block12;
                        if (!hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Field15031 || this.Method6001()) break block13;
                        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Field15033 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().player.inventory.currentItem;
                        var1_1 = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method116(Items.EXPERIENCE_BOTTLE, (int)((long)1501209244 ^ (long)1501209244), (int)((long)-1473649060 ^ (long)-1473649067));
                        if (var1_1 == ((int)-1742336391L ^ 1742336390)) {
                            v3 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Field15016;
                            Intrinsics.checkExpressionValueIsNotNull((Object)v3, (String)"debug1");
                            if (v3.Method365()) {
                                NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5508("Initial-AI >> Auto-XP >> No xp in hotbar");
                            }
                        } else {
                            hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().player.inventory.currentItem = var1_1;
                        }
                        break block14;
                    }
                    if (hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Field15031 || this.Method6001()) ** GOTO lbl-1000
                    v4 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)v4, (String)"mc.player");
                    if (Intrinsics.areEqual((Object)v4.getHeldItemMainhand().item, (Object)Items.EXPERIENCE_BOTTLE)) {
                        var1_2 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().player.rotationPitch;
                        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
                        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().player.rotationPitch = var1_2;
                    } else if (!hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Field15031 && this.Method6001() && hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Field15033 != ((int)-1120073180L ^ 1120073179)) {
                        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().player.inventory.currentItem = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Field15033;
                    }
                }
                hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Field15030.Method2801();
                break block11;
            }
            if (!this.Method6001()) {
                v5 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Field15024;
                Intrinsics.checkExpressionValueIsNotNull((Object)v5, (String)"autoXPSilentDelay");
                if (hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Field15030.Method2797(v5.Method369())) {
                    hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Field15030.Method2801();
                    var1_3 = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method116(Items.EXPERIENCE_BOTTLE, (int)-1909970804L ^ -1909970804, (int)-1832301363L ^ -1832301372);
                    if (var1_3 == ((int)409913193L ^ -409913194)) {
                        v6 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Field15016;
                        Intrinsics.checkExpressionValueIsNotNull((Object)v6, (String)"debug1");
                        if (v6.Method365()) {
                            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5508("Initial-AI >> Auto-XP >> No xp in hotbar");
                        }
                    } else {
                        var2_4 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().player.inventory.currentItem;
                        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().player.inventory.currentItem = var1_3;
                        var3_5 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().player.rotationPitch;
                        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
                        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().player.rotationPitch = var3_5;
                        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().player.inventory.currentItem = var2_4;
                    }
                }
            }
        }
        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Field15031 = this.Method6001();
    }

    private final hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Method6000() {
        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = Field15022;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"autoXPSmart");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = (hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)Field15023.Method341();
            return hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        }
        if (Field15032) {
            hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field9330;
            return hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        }
        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field9329;
        return hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
    }

    private final boolean Method6001() {
        boolean bl;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = Field15018;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"moveStateLogic");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341() == hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field17617) {
            bl = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159();
            return bl;
        }
        bl = apMkTOYFgLbmdcA1wMUKdveSwIHOH1BJ.Method5990();
        return bl;
    }

    private final EnumHand Method6002(Item item) {
        EnumHand enumHand;
        EntityPlayerSP entityPlayerSP = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (Intrinsics.areEqual((Object)entityPlayerSP.getHeldItemMainhand().item, (Object)item)) {
            enumHand = EnumHand.MAIN_HAND;
            return enumHand;
        }
        EntityPlayerSP entityPlayerSP2 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
        if (!Intrinsics.areEqual((Object)entityPlayerSP2.getHeldItemOffhand().item, (Object)item)) return null;
        enumHand = EnumHand.OFF_HAND;
        return enumHand;
    }

    private final jD2gtZTnCH19EGvbKbXGsOxMql8GByzW Method6003(Entity entity) {
        ArrayList<jD2gtZTnCH19EGvbKbXGsOxMql8GByzW> arrayList = new ArrayList<jD2gtZTnCH19EGvbKbXGsOxMql8GByzW>();
        Iterator iterator = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7756(entity, Float.intBitsToFloat((int)((long)1034271681 ^ (long)2103819201)), ((int)-1349455422L ^ 0xAF90F1C3) != 0, ((int)-1711681842L ^ 0x99F9CECE) != 0).iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos;
            BlockPos blockPos2 = blockPos = (BlockPos)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos");
            if (!Intrinsics.areEqual((Object)agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3703(blockPos2).getBlock(), (Object)Blocks.AIR)) continue;
            BlockPos blockPos3 = blockPos.up();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"pos.up()");
            if (!Intrinsics.areEqual((Object)agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3703(blockPos3).getBlock(), (Object)Blocks.AIR) || blockPos.getY() < ((int)791290060L ^ 0x2F2A20CD) || this.Method6005(blockPos)) continue;
            World world = (World)hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().world;
            double d = (double)blockPos.getX() + Double.longBitsToDouble((long)302001021 ^ 0x3FE0000012002B7DL);
            double d2 = blockPos.getY();
            double d3 = (double)blockPos.getZ() + Double.longBitsToDouble((long)1712011939 ^ 0x3FE00000660B3AA3L);
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = Field15014;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"terrain");
            arrayList.add(new jD2gtZTnCH19EGvbKbXGsOxMql8GByzW(entity, blockPos, vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7759(world, d, d2, d3, entity, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365())));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = arrayList;
        Comparator comparator = Comparator.comparingDouble(hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field10819);
        Intrinsics.checkExpressionValueIsNotNull(comparator, (String)"Comparator.comparingDoub\u2026 { it.damage.toDouble() }");
        CollectionsKt.sortWith((List)list, comparator);
        return (jD2gtZTnCH19EGvbKbXGsOxMql8GByzW)arrayList.get((int)1706964814L ^ 0x65BE374E);
    }

    private final void Method6004(Entity entity) {
        Object object;
        jD2gtZTnCH19EGvbKbXGsOxMql8GByzW jD2gtZTnCH19EGvbKbXGsOxMql8GByzW2 = this.Method6007(entity);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = Field15017;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"debug2");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            object = "Spot != null is " + ((jD2gtZTnCH19EGvbKbXGsOxMql8GByzW2 != null ? (int)-407614244L ^ 0xE7B44CDD : (int)((long)1800639101 ^ (long)1800639101)) != 0);
            int n = (int)1340751913L ^ 0x4FEA4029;
            System.out.println(object);
        }
        if (jD2gtZTnCH19EGvbKbXGsOxMql8GByzW2 == null) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = Field15016;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"debug1");
            if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) return;
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5508("Initial-AI >> No safe spot found.");
            return;
        }
        object = jD2gtZTnCH19EGvbKbXGsOxMql8GByzW2.Method1866();
        apMkTOYFgLbmdcA1wMUKdveSwIHOH1BJ.Method5986(object);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = Field15016;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"debug1");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method365()) return;
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5508("Initial-AI >> Going to " + object.getX() + ", " + object.getY() + ", " + object.getZ());
    }

    private final boolean Method6005(BlockPos blockPos) {
        int n;
        BlockPos blockPos2 = blockPos.north();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos.north()");
        if (!this.Method6006(blockPos2)) {
            BlockPos blockPos3 = blockPos.east();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"pos.east()");
            if (!this.Method6006(blockPos3)) {
                BlockPos blockPos4 = blockPos.west();
                Intrinsics.checkExpressionValueIsNotNull((Object)blockPos4, (String)"pos.west()");
                if (!this.Method6006(blockPos4)) {
                    BlockPos blockPos5 = blockPos.south();
                    Intrinsics.checkExpressionValueIsNotNull((Object)blockPos5, (String)"pos.south()");
                    if (!this.Method6006(blockPos5)) {
                        n = (int)52338039L ^ 0x31E9D77;
                        return n != 0;
                    }
                }
            }
        }
        n = (int)-628593782L ^ 0xDA886B8B;
        return n != 0;
    }

    private final boolean Method6006(BlockPos blockPos) {
        return vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7755(blockPos, ((int)63217274L ^ 0x3C49E7B) != 0, (boolean)((long)274938430 ^ (long)274938431), Field15015.Method365(), (boolean)((long)-508460338 ^ (long)-508460337));
    }

    private final jD2gtZTnCH19EGvbKbXGsOxMql8GByzW Method6007(Entity entity) {
        ArrayList<jD2gtZTnCH19EGvbKbXGsOxMql8GByzW> arrayList = new ArrayList<jD2gtZTnCH19EGvbKbXGsOxMql8GByzW>();
        double d = Double.longBitsToDouble((long)2029359978 ^ 0x3FE0000078F5936AL);
        Iterator iterator = this.Method6009(entity).iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos;
            BlockPos blockPos2 = blockPos = (BlockPos)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"hole");
            float f = this.Method6008(blockPos2, Float.intBitsToFloat(0x35C4F25A ^ 0x7504F25A), entity);
            if (!((double)f > d)) continue;
            d = f;
            arrayList.add(new jD2gtZTnCH19EGvbKbXGsOxMql8GByzW(entity, blockPos, f));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = arrayList;
        Comparator comparator = Comparator.comparingDouble(hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field11083);
        Intrinsics.checkExpressionValueIsNotNull(comparator, (String)"Comparator.comparingDoub\u2026 { it.damage.toDouble() }");
        CollectionsKt.sortWith((List)list, comparator);
        return (jD2gtZTnCH19EGvbKbXGsOxMql8GByzW)arrayList.get((int)-46617253L ^ 0xFD38AD5B);
    }

    private final float Method6008(BlockPos blockPos, float f, Entity entity) {
        double d = Double.longBitsToDouble(0xC879BBD912A61549L ^ 0xF799BBD912A61549L);
        Iterator iterator = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1946(blockPos, f, (int)f + (int)((long)-172918548 ^ (long)-172918547), ((int)-938151669L ^ 0xC814F10B) != 0, ((int)-450254541L ^ 0xE529A932) != 0, (int)((long)-1299364682 ^ (long)-1299364682)).iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos2 = (BlockPos)iterator.next();
            World world = (World)hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().world;
            BlockPos blockPos3 = blockPos2;
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"pos");
            double d2 = (double)blockPos3.getX() + Double.longBitsToDouble((long)618989735 ^ 0x3FE0000024E508A7L);
            double d3 = blockPos2.getY();
            double d4 = (double)blockPos2.getZ() + Double.longBitsToDouble(0x8BEAC9D2D61BADBAL ^ 0xB40AC9D2D61BADBAL);
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = Field15014;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"terrain");
            float f2 = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7759(world, d2, d3, d4, entity, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365());
            if (!((double)f2 > d)) continue;
            d = f2;
        }
        return (float)d;
    }

    private final ArrayList Method6009(Entity entity) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        Iterator iterator = this.Method6010(entity, Float.intBitsToFloat((int)((long)1908805975 ^ (long)822481239))).iterator();
        while (iterator.hasNext()) {
            AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
            BlockPos blockPos = (BlockPos)iterator.next();
            AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2 = ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM.Method7131(blockPos, (boolean)((long)436396747 ^ (long)436396747), (boolean)((long)-905874047 ^ (long)-905874048));
            Intrinsics.checkExpressionValueIsNotNull((Object)ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2, (String)"info");
            if (ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2.Method6959() == AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field9771) continue;
            arrayList.add(blockPos);
        }
        return arrayList;
    }

    private final ArrayList Method6010(Entity entity, float f) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>((int)((long)-1980582023 ^ (long)-1980582024) << 6);
        List list = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1946(entity.getPosition(), f, (int)f + ((int)-762148118L ^ 0xD2928AEB), ((int)-1767528878L ^ 0x96A5A652) != 0, ((int)-2012256865L ^ 0x880F659E) != 0, (int)1104683829L ^ 0x41D82335);
        list = list.stream().sorted(hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field13708).collect(Collectors.toList());
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            IBlockState iBlockState = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().world.getBlockState(blockPos);
            Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(pos)");
            if ((Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR) ^ (int)((long)-1155697453 ^ (long)-1155697454)) != 0) continue;
            IBlockState iBlockState2 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().world.getBlockState(blockPos.add((int)((long)577073744 ^ (long)577073744), (int)((long)436539506 ^ (long)-436539507), (int)((long)1945060020 ^ (long)1945060020)));
            Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState2, (String)"mc.world.getBlockState(pos.add(0, -1, 0))");
            if (Intrinsics.areEqual((Object)iBlockState2.getBlock(), (Object)Blocks.AIR)) continue;
            IBlockState iBlockState3 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().world.getBlockState(blockPos.add((int)-1581376855L ^ 0xA1BE1AA9, (int)((long)782350845 ^ (long)782350844), (int)((long)-1498302076 ^ (long)-1498302076)));
            Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState3, (String)"mc.world.getBlockState(pos.add(0, 1, 0))");
            if ((Intrinsics.areEqual((Object)iBlockState3.getBlock(), (Object)Blocks.AIR) ^ (int)((long)1707363231 ^ (long)1707363230)) != 0) continue;
            IBlockState iBlockState4 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk.Method6011().world.getBlockState(blockPos.add((int)((long)133267585 ^ (long)133267585), (int)((long)421242022 ^ (long)421242023) << 1, (int)1595324385L ^ 0x5F16B7E1));
            Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState4, (String)"mc.world.getBlockState(pos.add(0, 2, 0))");
            if (!Intrinsics.areEqual((Object)iBlockState4.getBlock(), (Object)Blocks.AIR)) continue;
            arrayList.add(blockPos);
        }
        return arrayList;
    }

    private hMvNpVNolah9lHVSC6HzLOZcg4ariBCk() {
        super("AutoCrystalPvP", "crystal pvp go brr", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
    }

    static {
        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2;
        Field15034 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2 = new hMvNpVNolah9lHVSC6HzLOZcg4ariBCk();
        Field15014 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Terrain", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2, (boolean)((long)-131589383 ^ (long)-131589384)));
        Field15015 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Target Is Using Multi Place", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2, (boolean)((long)1118745445 ^ (long)1118745445));
        Field15016 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Debug 1", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2, ((int)-601578993L ^ 0xDC24A20F) != 0));
        Field15017 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Debug 2", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2, (boolean)((long)-929794182 ^ (long)-929794182)));
        Field15018 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Move State Logic", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2, hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field17617));
        Field15019 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2, Double.longBitsToDouble((long)1079343196 ^ 0x404900004055785CL), 1.0, Double.longBitsToDouble(0xCD94A06E1092B4EAL ^ 0x8DCDA06E1092B4EAL), ((int)232877628L ^ 0xDE16E3D) != 0));
        Field15020 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Auto XP", hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2)));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Auto XP", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2, (boolean)((long)-379858149 ^ (long)-379858149)).Method355("State");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"Setting(\"Auto XP\", this, false).setTitle(\"State\")");
        Field15021 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2.Method23(Field15020.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Auto XP Smart", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2, ((int)1636513491L ^ 0x618B36D3) != 0).Method355("Smart");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"Setting(\"Auto XP Smart\",\u2026 false).setTitle(\"Smart\")");
        Field15022 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2.Method23(Field15020.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3));
        M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk m5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Auto XP Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2, hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field9329).Method5300("Mode");
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2 = Field15020;
        Intrinsics.checkExpressionValueIsNotNull((Object)xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2, (String)"autoXPGroup");
        Field15023 = m5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk.Method5304(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2).Method5303();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Auto Xp Silent Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2, Double.longBitsToDouble(0xC6D8B4217CF462D3L ^ 0x8681B4217CF462D3L), 0.0, Double.longBitsToDouble((long)1955345823 ^ 0x408F4000748C359FL), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method355("Silent Delay");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"Setting(\"Auto Xp Silent \u2026.setTitle(\"Silent Delay\")");
        Field15024 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2.Method23(Field15020.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Auto XP Armor Percent", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2, Double.longBitsToDouble(0x8C36C4EF64C63C9FL ^ 0xCC7FC4EF64C63C9FL), 0.0, Double.longBitsToDouble((long)1956246685 ^ 0x405900007499F49DL), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9942).Method355("Armor Percent");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"Setting(\"Auto XP Armor P\u2026setTitle(\"Armor Percent\")");
        Field15025 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2.Method23(Field15020.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5));
        Field15026 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Auto Eat", hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2)));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Auto Eat", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2, (boolean)((long)816048186 ^ (long)816048186)).Method355("State");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"Setting(\"Auto Eat\", this, false).setTitle(\"State\")");
        Field15027 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2.Method23(Field15026.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6));
        Field15028 = new Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ(hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2).Method2003();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = Field15019;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"targetRange");
        Supplier supplier = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7.Method393();
        Intrinsics.checkExpressionValueIsNotNull((Object)supplier, (String)"targetRange.supplierDouble");
        Field15029 = new IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk(supplier, Field15028);
        Field15030 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
        Field15033 = (int)-655003360L ^ 0x270A8EDF;
        super.Method44(hMvNpVNolah9lHVSC6HzLOZcg4ariBCk$1.Field14620);
    }

    public static final Minecraft Method6011() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method6012(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method6013(hMvNpVNolah9lHVSC6HzLOZcg4ariBCk hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2) {
        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk hMvNpVNolah9lHVSC6HzLOZcg4ariBCk3 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2;
        return Field15017;
    }

    public static final void Method6014(hMvNpVNolah9lHVSC6HzLOZcg4ariBCk hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2, Entity entity) {
        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2.Method6004(entity);
    }

    public static final IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk Method6015(hMvNpVNolah9lHVSC6HzLOZcg4ariBCk hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2) {
        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk hMvNpVNolah9lHVSC6HzLOZcg4ariBCk3 = hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2;
        return Field15029;
    }

    public static final void Method6016(hMvNpVNolah9lHVSC6HzLOZcg4ariBCk hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2) {
        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2.Method5999();
    }

    public static final void Method6017(hMvNpVNolah9lHVSC6HzLOZcg4ariBCk hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2) {
        hMvNpVNolah9lHVSC6HzLOZcg4ariBCk2.Method5997();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-945234546L ^ 0xC7A8DD8E;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1737481788L ^ 0x9870213B);
            int n2 = ((int)2056755527L ^ 0x7A979942) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-2119654998 ^ (long)-2119651243) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

