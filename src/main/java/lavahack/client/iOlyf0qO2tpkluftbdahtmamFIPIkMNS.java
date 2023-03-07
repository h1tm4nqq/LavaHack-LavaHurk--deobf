//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.multiplayer.PlayerControllerMP
 *  net.minecraft.client.network.NetHandlerPlayClient
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemAxe
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemSword
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketAnimation
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.util.EnumHand
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.EfXHaWvRZ3sJRgPAk4iWnLScsCeNBnTH;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.Fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrG;
import lavahack.client.JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU;
import lavahack.client.KjrOCoQhxsxPltWeRSN6l89ExVE5NRMF;
import lavahack.client.Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZX5l34WZTiSWaIllRlAGuD3u17hrxKep;
import lavahack.client.a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs;
import lavahack.client.iOlyf0qO2tpkluftbdahtmamFIPIkMNS$1;
import lavahack.client.iOlyf0qO2tpkluftbdahtmamFIPIkMNS$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.iOlyf0qO2tpkluftbdahtmamFIPIkMNS$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.iOlyf0qO2tpkluftbdahtmamFIPIkMNS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.util.EnumHand;
import org.jetbrains.annotations.Nullable;

@EfXHaWvRZ3sJRgPAk4iWnLScsCeNBnTH
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0018H\u0002J\b\u0010\"\u001a\u00020#H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0019\u0010\u0002R\u0016\u0010\u001a\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2={"Lcom/kisman/cc/features/module/combat/KillAuraRewrite;", "Lcom/kisman/cc/features/module/Module;", "()V", "ccOnlyCrits", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "checks", "Lcom/kisman/cc/settings/types/SettingGroup;", "cooldownCheck", "hit", "logic", "monsters", "packetAttack", "passive", "players", "range", "ranges", "resetCooldown", "rotation", "rotationLogic", "shieldBreaker", "swap", "swing", "targetNoStatic", "Lnet/minecraft/entity/Entity;", "targetNoStatic$annotations", "targets", "wallRange", "weapon", "getWeaponSlot", "", "isShieldActive", "", "entity", "update", "", "Companion", "kisman.cc"})
public final class iOlyf0qO2tpkluftbdahtmamFIPIkMNS
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field13339 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Logic", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13340 = this.Method23(this.Field13339.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Swap", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11026)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13341 = this.Method23(this.Field13339.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotation", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field8498)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13342;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13343;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13344;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13345;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field13346;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13347;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13348;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field13349;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13350;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13351;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13352;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field13353;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13354;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13355;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field13356;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13357;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13358;
    private final Entity Field13359;
    @Nullable
    private static iOlyf0qO2tpkluftbdahtmamFIPIkMNS Field13360;
    @Nullable
    private static Entity Field13361;
    public static final iOlyf0qO2tpkluftbdahtmamFIPIkMNS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field13362;
    private int Field13363;

    @Override
    public void Method45() {
        if (iOlyf0qO2tpkluftbdahtmamFIPIkMNS.Method4754().player == null) return;
        if (iOlyf0qO2tpkluftbdahtmamFIPIkMNS.Method4754().world == null) return;
        if (iOlyf0qO2tpkluftbdahtmamFIPIkMNS.Method4754().player.isDead) {
            return;
        }
        int n = iOlyf0qO2tpkluftbdahtmamFIPIkMNS.Method4754().player.inventory.currentItem;
        JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU = new JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU().Method7793();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field13340;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"swap");
        Enum enum_ = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.dynamic.SwapEnum2.Swap");
        }
        FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi fKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = (FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)enum_;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field13341;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"rotation");
        Enum enum_2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method341();
        if (enum_2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.dynamic.RotationEnum.Rotation");
        }
        a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = (a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)enum_2;
        int n2 = this.Method4752();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field13357;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"cooldownCheck");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method365() && n != n2 && fKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi == FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11026) {
            float f = iOlyf0qO2tpkluftbdahtmamFIPIkMNS.Method4754().player.getCooledAttackStrength(0.0f);
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field13358;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"ccOnlyCrits");
            float f2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method365() ? Float.intBitsToFloat((int)91045794L ^ 0x3A1E0C91) : 1.0f;
            if (f <= f2) {
                return;
            }
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = this.Field13347;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"range");
        float f = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method368();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = this.Field13348;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"wallRange");
        float f3 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7.Method368();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8 = this.Field13350;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8, (String)"players");
        boolean bl = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8.Method365();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9 = this.Field13352;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9, (String)"passive");
        boolean bl2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9.Method365();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10 = this.Field13351;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10, (String)"monsters");
        Field13361 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1925(f, f3, bl, bl2, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10.Method365());
        if (Field13361 == null) {
            return;
        }
        if (n == (int)((long)184412369 ^ (long)-184412370)) return;
        if (n2 != n && fKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi == FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11026) {
            return;
        }
        Object[] objectArray = new Object[(int)((long)-1958074170 ^ (long)-1958074169) << 1];
        objectArray[(int)((long)751675658 ^ (long)751675658)] = n2;
        objectArray[(int)-1719783267L ^ 0x997E309C] = ((int)1977896596L ^ 0x75E44E94) != 0;
        fKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method2972().Method1726(objectArray);
        hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs2 = a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method929();
        Object[] objectArray2 = new Object[(int)((long)1788356269 ^ (long)1788356268) << 1];
        int n3 = (int)1880919826L ^ 0x701C8F12;
        hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs3 = a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method931();
        Object[] objectArray3 = new Object[(int)((long)-438722719 ^ (long)-438722720) << 1];
        Entity entity = Field13361;
        objectArray3[(int)((long)1797368706 ^ (long)1797368706)] = entity != null ? Integer.valueOf(entity.entityId) : null;
        int n4 = (int)200540719L ^ 0xBF4022E;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11 = this.Field13342;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11, (String)"rotationLogic");
        Enum enum_3 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11.Method341();
        if (enum_3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RotationLogic");
        }
        objectArray3[n4] = (Fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrG)enum_3;
        objectArray2[n3] = hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs3.Method1726(objectArray3);
        objectArray2[(int)-1998553585L ^ 0x88E07E0E] = ((int)-979470446L ^ 0xC59E7792) != 0;
        hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs2.Method1726(objectArray2);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12 = this.Field13357;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12, (String)"cooldownCheck");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12.Method365() && n == n2 && fKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi != FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11026) {
            float f4 = iOlyf0qO2tpkluftbdahtmamFIPIkMNS.Method4754().player.getCooledAttackStrength(0.0f);
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13 = this.Field13358;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13, (String)"ccOnlyCrits");
            float f5 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13.Method365() ? Float.intBitsToFloat((int)((long)211627283 ^ (long)871243296)) : 1.0f;
            if (f4 > f5) {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD14 = this.Field13355;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD14, (String)"packetAttack");
                if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD14.Method365()) {
                    NetHandlerPlayClient netHandlerPlayClient = iOlyf0qO2tpkluftbdahtmamFIPIkMNS.Method4754().player.connection;
                    Entity entity2 = Field13361;
                    if (entity2 == null) {
                        Intrinsics.throwNpe();
                    }
                    netHandlerPlayClient.sendPacket((Packet)new CPacketUseEntity(entity2));
                } else {
                    PlayerControllerMP playerControllerMP = iOlyf0qO2tpkluftbdahtmamFIPIkMNS.Method4754().playerController;
                    EntityPlayer entityPlayer = (EntityPlayer)iOlyf0qO2tpkluftbdahtmamFIPIkMNS.Method4754().player;
                    Entity entity3 = Field13361;
                    if (entity3 == null) {
                        Intrinsics.throwNpe();
                    }
                    playerControllerMP.attackEntity(entityPlayer, entity3);
                }
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD15 = this.Field13345;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD15, (String)"swing");
                Enum enum_4 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD15.Method341();
                if (enum_4 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.SwingHands");
                }
                switch (ZX5l34WZTiSWaIllRlAGuD3u17hrxKep.Field10844[((KjrOCoQhxsxPltWeRSN6l89ExVE5NRMF)enum_4).ordinal()]) {
                    case 1: {
                        iOlyf0qO2tpkluftbdahtmamFIPIkMNS.Method4754().player.swingArm(EnumHand.MAIN_HAND);
                        break;
                    }
                    case 2: {
                        iOlyf0qO2tpkluftbdahtmamFIPIkMNS.Method4754().player.swingArm(EnumHand.OFF_HAND);
                        break;
                    }
                    case 3: {
                        iOlyf0qO2tpkluftbdahtmamFIPIkMNS.Method4754().player.connection.sendPacket((Packet)new CPacketAnimation(EnumHand.MAIN_HAND));
                        break;
                    }
                }
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD16 = this.Field13354;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD16, (String)"resetCooldown");
                if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD16.Method365()) {
                    iOlyf0qO2tpkluftbdahtmamFIPIkMNS.Method4754().player.resetCooldown();
                }
            }
        }
        Object[] objectArray4 = new Object[((int)-1738229722L ^ 0x9864B827) << 1];
        objectArray4[(int)-1916333433L ^ 0x8DC71287] = jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU;
        objectArray4[(int)((long)366855219 ^ (long)366855218)] = ((int)547435223L ^ 0x20A132D6) != 0;
        a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method930().Method1726(objectArray4);
        Object[] objectArray5 = new Object[(int)((long)-1786031725 ^ (long)-1786031726) << 1];
        objectArray5[(int)((long)-2073720903 ^ (long)-2073720903)] = n;
        objectArray5[(int)-138986792L ^ 0xF7B73AD9] = ((int)-646104852L ^ 0xD97D38ED) != 0;
        fKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method2972().Method1726(objectArray5);
    }

    private final int Method4752() {
        int n = (int)1714671151L ^ 0x6633CE2F;
        int n2 = (int)((long)1854046438 ^ (long)1854046447);
        while (true) {
            ItemStack itemStack = iOlyf0qO2tpkluftbdahtmamFIPIkMNS.Method4754().player.inventory.getStackInSlot(n);
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field13344;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"shieldBreaker");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
                Entity entity = Field13361;
                if (entity == null) {
                    Intrinsics.throwNpe();
                }
                if (this.Method4753(entity) && itemStack.item instanceof ItemAxe) {
                    return n;
                }
            }
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field13343;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"weapon");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method341() != Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i.Field13166) {
                if (itemStack.item instanceof ItemSword) {
                    qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field13343;
                    Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"weapon");
                    if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method341() == Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i.Field13167) return n;
                    qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field13343;
                    Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"weapon");
                    if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method341() == Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i.Field13169) return n;
                }
                if (itemStack.item instanceof ItemAxe) {
                    qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = this.Field13343;
                    Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"weapon");
                    if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method341() == Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i.Field13168) return n;
                    qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = this.Field13343;
                    Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"weapon");
                    if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7.Method341() == Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i.Field13169) {
                        return n;
                    }
                }
            }
            ++n;
        }
    }

    private final boolean Method4753(Entity entity) {
        if (!(entity instanceof EntityPlayer)) return (int)((long)1925563644 ^ (long)1925563644) != 0;
        if (!((EntityPlayer)entity).isHandActive()) return (int)((long)1925563644 ^ (long)1925563644) != 0;
        if (Intrinsics.areEqual((Object)((EntityPlayer)entity).getHeldItemMainhand().item, (Object)Items.SHIELD)) {
            if (((EntityPlayer)entity).getActiveHand() == EnumHand.MAIN_HAND) return (int)((long)-1742534712 ^ (long)-1742534711) != 0;
        }
        if (!Intrinsics.areEqual((Object)((EntityPlayer)entity).getHeldItemOffhand().item, (Object)Items.SHIELD)) return (int)((long)1925563644 ^ (long)1925563644) != 0;
        if (((EntityPlayer)entity).getActiveHand() != EnumHand.OFF_HAND) return (int)((long)1925563644 ^ (long)1925563644) != 0;
        return (int)((long)-1742534712 ^ (long)-1742534711) != 0;
    }

    public iOlyf0qO2tpkluftbdahtmamFIPIkMNS() {
        super("KillAuraRewrite", "Rewrite version of KillAura", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotation Logic", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrG.Field12640).Method313(new iOlyf0qO2tpkluftbdahtmamFIPIkMNS$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"Setting(\"Rotation Logic\"\u2026e { rotation.valBoolean }");
        this.Field13342 = this.Method23(this.Field13339.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2));
        this.Field13343 = this.Method23(this.Field13339.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Weapon", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Pm928zvTk2tvLxV4NLe5uV2Fmnaepg2i.Field13167)));
        this.Field13344 = this.Method23(this.Field13339.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Shield Breaker", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)828238249 ^ (long)828238249))));
        this.Field13345 = this.Method23(this.Field13339.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Swing", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, KjrOCoQhxsxPltWeRSN6l89ExVE5NRMF.Field17158)));
        this.Field13346 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Ranges", this)));
        this.Field13347 = this.Method23(this.Field13346.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)987028919 ^ 0x401100003AD4DDB7L), 1.0, Double.longBitsToDouble((long)1846257333 ^ 0x401800006E0BA6B5L), ((int)1324052903L ^ 0x4EEB71A7) != 0)));
        this.Field13348 = this.Method23(this.Field13346.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Wall Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)514678283 ^ 0x400800001EAD5E0BL), 1.0, Double.longBitsToDouble(0xBFEC982AF9597804L ^ 0xFFF4982AF9597804L), ((int)1442141825L ^ 0x55F55681) != 0)));
        this.Field13349 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Targets", this)));
        this.Field13350 = this.Method23(this.Field13349.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Players", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1141769190L ^ 0xBBF1FC1B) != 0)));
        this.Field13351 = this.Method23(this.Field13349.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Monsters", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)893606325 ^ (long)893606325))));
        this.Field13352 = this.Method23(this.Field13349.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Passive", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-714510766 ^ (long)-714510766))));
        this.Field13353 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Hit", this)));
        this.Field13354 = this.Method23(this.Field13353.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Reset Cooldown", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1440330718L ^ 0xAA264C23) != 0)));
        this.Field13355 = this.Method23(this.Field13353.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet Attack", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1471698933L ^ 0xA847A80B) != 0)));
        this.Field13356 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Checks", this)));
        this.Field13357 = this.Method23(this.Field13356.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Cooldown Check", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)2077546368L ^ 0x7BD4D781) != 0)));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("CC Only Crits", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)361556655L ^ 0x158CEAAE) != 0).Method313(new iOlyf0qO2tpkluftbdahtmamFIPIkMNS$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"Setting(\"CC Only Crits\",\u2026ooldownCheck.valBoolean }");
        this.Field13358 = this.Method23(this.Field13356.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3));
        this.Method44(iOlyf0qO2tpkluftbdahtmamFIPIkMNS$1.Field9614);
        Field13360 = this;
    }

    static {
        Field13362 = new iOlyf0qO2tpkluftbdahtmamFIPIkMNS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(null);
    }

    public static final Minecraft Method4754() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method4755(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4756(iOlyf0qO2tpkluftbdahtmamFIPIkMNS iOlyf0qO2tpkluftbdahtmamFIPIkMNS2) {
        return iOlyf0qO2tpkluftbdahtmamFIPIkMNS2.Field13341;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4757(iOlyf0qO2tpkluftbdahtmamFIPIkMNS iOlyf0qO2tpkluftbdahtmamFIPIkMNS2) {
        return iOlyf0qO2tpkluftbdahtmamFIPIkMNS2.Field13357;
    }

    public static final iOlyf0qO2tpkluftbdahtmamFIPIkMNS Method4758() {
        return Field13360;
    }

    public static final void Method4759(iOlyf0qO2tpkluftbdahtmamFIPIkMNS iOlyf0qO2tpkluftbdahtmamFIPIkMNS2) {
        Field13360 = iOlyf0qO2tpkluftbdahtmamFIPIkMNS2;
    }

    public static final Entity Method4760() {
        return Field13361;
    }

    public static final void Method4761(Entity entity) {
        Field13361 = entity;
    }

    @Nullable
    @Nullable
    public static final iOlyf0qO2tpkluftbdahtmamFIPIkMNS Method4762() {
        iOlyf0qO2tpkluftbdahtmamFIPIkMNS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi iOlyf0qO2tpkluftbdahtmamFIPIkMNS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = Field13362;
        return Field13360;
    }

    public static final void Method4763(@Nullable @Nullable iOlyf0qO2tpkluftbdahtmamFIPIkMNS iOlyf0qO2tpkluftbdahtmamFIPIkMNS2) {
        iOlyf0qO2tpkluftbdahtmamFIPIkMNS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi iOlyf0qO2tpkluftbdahtmamFIPIkMNS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = Field13362;
        Field13360 = iOlyf0qO2tpkluftbdahtmamFIPIkMNS2;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1305271156L ^ 0xB233248C;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1082658740 ^ (long)-1082658637);
            int n2 = (int)((long)1741309245 ^ (long)1741309212) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-716960542 ^ (long)-716961409) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

