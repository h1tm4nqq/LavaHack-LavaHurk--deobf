//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import java.util.function.*;
import kotlin.jvm.internal.*;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B9\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005?\u0006\u0002\u0010\nBK\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005?\u0006\u0002\u0010\u000eJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u0018\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0006H\u0002R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e?\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0019" }, d2 = { "Lcom/kisman/cc/features/module/combat/autorer/ExtrapolationHelper;", "", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "ticks", "Ljava/util/function/Supplier;", "", "outOfBlocks", "", "shrink", "(Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V", "delay", "", "threadded", "(Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V", "handler", "Lcom/kisman/cc/util/thread/kisman/ThreadHandler;", "predictor", "Lcom/kisman/cc/features/module/combat/autorer/MotionPredictor;", "player", "Lnet/minecraft/entity/player/EntityPlayer;", "reset", "", "update", "updatePredictor", "kisman.cc" })
public final class Class1285
{
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
    
    private final void Method5224(final Class2032 class2032, final int n) {
        class2032.Field17351 = false;
        final Boolean value = this.Field13859.get();
        Intrinsics.checkExpressionValueIsNotNull((Object)value, "outOfBlocks.get()");
        class2032.Field17347 = value;
        final Boolean value2 = this.Field13860.get();
        Intrinsics.checkExpressionValueIsNotNull((Object)value2, "shrink.get()");
        class2032.Field17353 = value2;
        class2032.copyLocationAndAnglesFrom((Entity)class2032.Field17348);
        class2032.detectWasPhasing();
        int n2 = 1;
        if (n2 <= n) {
            while (true) {
                class2032.updateFromTrackedEntity();
                if (n2 == n) {
                    break;
                }
                ++n2;
            }
        }
        class2032.Field17351 = true;
    }
    
    @Nullable
    @Nullable
    public final Class2032 Method5225(@NotNull @NotNull final EntityPlayer entityPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, "player");
        return ((Class2051)entityPlayer).Method2145();
    }
    
    public Class1285(@NotNull @NotNull final Supplier supplier, @NotNull @NotNull final Supplier supplier2, @NotNull @NotNull final Supplier field13858, @NotNull @NotNull final Supplier field13859, @NotNull @NotNull final Supplier field13860) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, "delay");
        Intrinsics.checkParameterIsNotNull((Object)supplier2, "threadded");
        Intrinsics.checkParameterIsNotNull((Object)field13858, "ticks");
        Intrinsics.checkParameterIsNotNull((Object)field13859, "outOfBlocks");
        Intrinsics.checkParameterIsNotNull((Object)field13860, "shrink");
        this.Field13858 = field13858;
        this.Field13859 = field13859;
        this.Field13860 = field13860;
        this.Field13857 = new Class511(supplier, supplier2);
    }
    
    public Class1285(@NotNull @NotNull final Class411 class411, @NotNull @NotNull final Supplier supplier, @NotNull @NotNull final Supplier supplier2, @NotNull @NotNull final Supplier supplier3) {
        Intrinsics.checkParameterIsNotNull((Object)class411, "threads");
        Intrinsics.checkParameterIsNotNull((Object)supplier, "ticks");
        Intrinsics.checkParameterIsNotNull((Object)supplier2, "outOfBlocks");
        Intrinsics.checkParameterIsNotNull((Object)supplier3, "shrink");
        final Supplier method395 = class411.Method2000().Method395();
        Intrinsics.checkExpressionValueIsNotNull((Object)method395, "threads.delay.supplierLong");
        final Supplier method396 = class411.Method2001().Method397();
        Intrinsics.checkExpressionValueIsNotNull((Object)method396, "threads.multiThread.supplierBoolean");
        this(method395, method396, supplier, supplier2, supplier3);
    }
    
    public static final Supplier Method5226(final Class1285 class1285) {
        return class1285.Field13858;
    }
    
    public static final void Method5227(final Class1285 class1285, final Class2032 class1286, final int n) {
        class1285.Method5224(class1286, n);
    }
    
    private static String Method5228(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x39B9 ^ 0x77));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
