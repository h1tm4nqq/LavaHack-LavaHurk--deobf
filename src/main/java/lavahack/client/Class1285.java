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
import lavahack.client.Class2032;
import lavahack.client.Class2051;
import lavahack.client.Class207;
import lavahack.client.Class411;
import lavahack.client.Class511;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B9\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\u0002\u0010\nBK\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u0018\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0006H\u0002R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2={"Lcom/kisman/cc/features/module/combat/autorer/ExtrapolationHelper;", "", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "ticks", "Ljava/util/function/Supplier;", "", "outOfBlocks", "", "shrink", "(Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V", "delay", "", "threadded", "(Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V", "handler", "Lcom/kisman/cc/util/thread/kisman/ThreadHandler;", "predictor", "Lcom/kisman/cc/features/module/combat/autorer/MotionPredictor;", "player", "Lnet/minecraft/entity/player/EntityPlayer;", "reset", "", "update", "updatePredictor", "kisman.cc"})
public final class Class1285 {
    private Class511 Field13857;
    private final Supplier Field13858;
    private final Supplier Field13859;
    private final Supplier Field13860;
    private String Field13861 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method5222() {
        this.Field13857.Method2360();
    }

    public final void Method5223() {
        this.Field13857.Method2361(new Class207(this));
    }

    private final void Method5224(Class2032 class2032, int n) {
        class2032.Field17351 = false;
        Object t = this.Field13859.get();
        Intrinsics.checkExpressionValueIsNotNull(t, (String)"outOfBlocks.get()");
        class2032.Field17347 = (Boolean)t;
        Object t2 = this.Field13860.get();
        Intrinsics.checkExpressionValueIsNotNull(t2, (String)"shrink.get()");
        class2032.Field17353 = (Boolean)t2;
        class2032.copyLocationAndAnglesFrom((Entity)class2032.Field17348);
        class2032.detectWasPhasing();
        int n2 = 1;
        int n3 = n;
        if (n2 <= n3) {
            while (true) {
                class2032.updateFromTrackedEntity();
                if (n2 == n3) break;
                ++n2;
            }
        }
        class2032.Field17351 = true;
    }

    @Nullable
    @Nullable
    public final Class2032 Method5225(@NotNull @NotNull EntityPlayer entityPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, (String)"player");
        return ((Class2051)entityPlayer).Method2145();
    }

    public Class1285(@NotNull @NotNull Supplier supplier, @NotNull @NotNull Supplier supplier2, @NotNull @NotNull Supplier supplier3, @NotNull @NotNull Supplier supplier4, @NotNull @NotNull Supplier supplier5) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, (String)"delay");
        Intrinsics.checkParameterIsNotNull((Object)supplier2, (String)"threadded");
        Intrinsics.checkParameterIsNotNull((Object)supplier3, (String)"ticks");
        Intrinsics.checkParameterIsNotNull((Object)supplier4, (String)"outOfBlocks");
        Intrinsics.checkParameterIsNotNull((Object)supplier5, (String)"shrink");
        this.Field13858 = supplier3;
        this.Field13859 = supplier4;
        this.Field13860 = supplier5;
        this.Field13857 = new Class511(supplier, supplier2);
    }

    public Class1285(@NotNull @NotNull Class411 class411, @NotNull @NotNull Supplier supplier, @NotNull @NotNull Supplier supplier2, @NotNull @NotNull Supplier supplier3) {
        Intrinsics.checkParameterIsNotNull((Object)class411, (String)"threads");
        Intrinsics.checkParameterIsNotNull((Object)supplier, (String)"ticks");
        Intrinsics.checkParameterIsNotNull((Object)supplier2, (String)"outOfBlocks");
        Intrinsics.checkParameterIsNotNull((Object)supplier3, (String)"shrink");
        Supplier supplier4 = class411.Method2000().Method395();
        Intrinsics.checkExpressionValueIsNotNull((Object)supplier4, (String)"threads.delay.supplierLong");
        Supplier supplier5 = class411.Method2001().Method397();
        Intrinsics.checkExpressionValueIsNotNull((Object)supplier5, (String)"threads.multiThread.supplierBoolean");
        this(supplier4, supplier5, supplier, supplier2, supplier3);
    }

    public static final Supplier Method5226(Class1285 class1285) {
        return class1285.Field13858;
    }

    public static final void Method5227(Class1285 class1285, Class2032 class2032, int n) {
        class1285.Method5224(class2032, n);
    }

    private static String Method5228(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 119;
            cArray2[n] = (char)(cArray[n] ^ (0x39B9 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

