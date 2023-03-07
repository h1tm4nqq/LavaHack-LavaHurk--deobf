//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 */
package lavahack.client;

import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.DH1H695Ac7tbIgJH29mL6vYZdjYnf9BH;
import lavahack.client.Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ;
import lavahack.client.RIhfMBGyAK9DkxAEjgwAXL20KiC6veIl;
import lavahack.client.dLRp42sXVbFaJ5rZZSCKqqXbZCgvDQiP;
import lavahack.client.vshPN0Zet2trEECZ8oUiA9u7vPR3nQoi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B9\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\u0002\u0010\nBK\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u0018\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0006H\u0002R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2={"Lcom/kisman/cc/features/module/combat/autorer/ExtrapolationHelper;", "", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "ticks", "Ljava/util/function/Supplier;", "", "outOfBlocks", "", "shrink", "(Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V", "delay", "", "threadded", "(Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V", "handler", "Lcom/kisman/cc/util/thread/kisman/ThreadHandler;", "predictor", "Lcom/kisman/cc/features/module/combat/autorer/MotionPredictor;", "player", "Lnet/minecraft/entity/player/EntityPlayer;", "reset", "", "update", "updatePredictor", "kisman.cc"})
public final class vshPN0Zet2trEECZ8oUiA9u7vPR3nQoi {
    private dLRp42sXVbFaJ5rZZSCKqqXbZCgvDQiP Field13857;
    private final Supplier Field13858;
    private final Supplier Field13859;
    private final Supplier Field13860;
    private String Field13861 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method5222() {
        this.Field13857.Method2360();
    }

    public final void Method5223() {
        this.Field13857.Method2361(new vshPN0Zet2trEECZ8oUiA9u7vPR3nQoi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this));
    }

    private final void Method5224(RIhfMBGyAK9DkxAEjgwAXL20KiC6veIl rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl, int n) {
        rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl.Field17351 = (int)997610065L ^ 0x3B765251;
        Object t = this.Field13859.get();
        Intrinsics.checkExpressionValueIsNotNull(t, (String)"outOfBlocks.get()");
        rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl.Field17347 = (Boolean)t;
        Object t2 = this.Field13860.get();
        Intrinsics.checkExpressionValueIsNotNull(t2, (String)"shrink.get()");
        rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl.Field17353 = (Boolean)t2;
        rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl.copyLocationAndAnglesFrom((Entity)rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl.Field17348);
        rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl.detectWasPhasing();
        int n2 = (int)((long)1525310564 ^ (long)1525310565);
        int n3 = n;
        if (n2 <= n3) {
            while (true) {
                rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl.updateFromTrackedEntity();
                if (n2 == n3) break;
                ++n2;
            }
        }
        rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl.Field17351 = (int)((long)-2007256694 ^ (long)-2007256693);
    }

    @Nullable
    @Nullable
    public final RIhfMBGyAK9DkxAEjgwAXL20KiC6veIl Method5225(@NotNull @NotNull EntityPlayer entityPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, (String)"player");
        return ((DH1H695Ac7tbIgJH29mL6vYZdjYnf9BH)entityPlayer).Method2145();
    }

    public vshPN0Zet2trEECZ8oUiA9u7vPR3nQoi(@NotNull @NotNull Supplier supplier, @NotNull @NotNull Supplier supplier2, @NotNull @NotNull Supplier supplier3, @NotNull @NotNull Supplier supplier4, @NotNull @NotNull Supplier supplier5) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, (String)"delay");
        Intrinsics.checkParameterIsNotNull((Object)supplier2, (String)"threadded");
        Intrinsics.checkParameterIsNotNull((Object)supplier3, (String)"ticks");
        Intrinsics.checkParameterIsNotNull((Object)supplier4, (String)"outOfBlocks");
        Intrinsics.checkParameterIsNotNull((Object)supplier5, (String)"shrink");
        this.Field13858 = supplier3;
        this.Field13859 = supplier4;
        this.Field13860 = supplier5;
        this.Field13857 = new dLRp42sXVbFaJ5rZZSCKqqXbZCgvDQiP(supplier, supplier2);
    }

    public vshPN0Zet2trEECZ8oUiA9u7vPR3nQoi(@NotNull @NotNull Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ, @NotNull @NotNull Supplier supplier, @NotNull @NotNull Supplier supplier2, @NotNull @NotNull Supplier supplier3) {
        Intrinsics.checkParameterIsNotNull((Object)q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ, (String)"threads");
        Intrinsics.checkParameterIsNotNull((Object)supplier, (String)"ticks");
        Intrinsics.checkParameterIsNotNull((Object)supplier2, (String)"outOfBlocks");
        Intrinsics.checkParameterIsNotNull((Object)supplier3, (String)"shrink");
        Supplier supplier4 = q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ.Method2000().Method395();
        Intrinsics.checkExpressionValueIsNotNull((Object)supplier4, (String)"threads.delay.supplierLong");
        Supplier supplier5 = q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ.Method2001().Method397();
        Intrinsics.checkExpressionValueIsNotNull((Object)supplier5, (String)"threads.multiThread.supplierBoolean");
        this(supplier4, supplier5, supplier, supplier2, supplier3);
    }

    public static final Supplier Method5226(vshPN0Zet2trEECZ8oUiA9u7vPR3nQoi vshPN0Zet2trEECZ8oUiA9u7vPR3nQoi2) {
        return vshPN0Zet2trEECZ8oUiA9u7vPR3nQoi2.Field13858;
    }

    public static final void Method5227(vshPN0Zet2trEECZ8oUiA9u7vPR3nQoi vshPN0Zet2trEECZ8oUiA9u7vPR3nQoi2, RIhfMBGyAK9DkxAEjgwAXL20KiC6veIl rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl, int n) {
        vshPN0Zet2trEECZ8oUiA9u7vPR3nQoi2.Method5224(rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl, n);
    }

    private static String Method5228(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)562785029L ^ 0x218B6B05;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1590579083L ^ 0x5ECE4F74);
            int n2 = (int)1383761029L ^ 0x527A84F2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-52440590 ^ (long)-52434869) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

