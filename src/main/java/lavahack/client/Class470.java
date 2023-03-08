//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.*;
import net.minecraft.util.math.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.renderer.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J.\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0011J\u0010\u0010\u0019\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\f8\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000?\u0006\u001a" }, d2 = { "Lcom/kisman/cc/features/module/Debug/SmoothRenderer$Renderer;", "", "()V", "currentPlaceInfo", "Lcom/kisman/cc/features/module/Debug/SmoothRenderer$PlaceInfo;", "lastPlaceInfo", "lastRenderPos", "Lnet/minecraft/util/math/BlockPos;", "lastSelfDamage", "", "lastTargetDamage", "lastUpdateTime", "", "prevPlaceInfo", "scale", "startTime", "onRenderWorld", "", "movingLength", "fadeLength", "placeInfo", "depth", "", "alpha", "reset", "update", "kisman.cc" })
public final class Class470
{
    @JvmField
    @Nullable
    public Class1266 Field9956;
    @JvmField
    @Nullable
    public Class1266 Field9957;
    @JvmField
    @Nullable
    public Class1266 Field9958;
    @JvmField
    @Nullable
    public BlockPos Field9959;
    @JvmField
    public long Field9960;
    @JvmField
    public long Field9961;
    @JvmField
    public float Field9962;
    @JvmField
    public float Field9963;
    @JvmField
    public float Field9964;
    private String Field9965 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final void Method2204() {
        this.Field9956 = null;
        this.Field9957 = null;
        this.Field9958 = null;
        this.Field9959 = null;
        this.Field9960 = 0L;
        this.Field9961 = 0L;
        this.Field9962 = 0.0f;
        this.Field9963 = 0.0f;
        this.Field9964 = 0.0f;
    }
    
    public final void Method2205(final float n, final float n2, @NotNull @NotNull final Class1266 class1266, final boolean b, final boolean b2) {
        Intrinsics.checkParameterIsNotNull((Object)class1266, "placeInfo");
        this.Method2206(class1266);
        final Class1266 field9957 = this.Field9957;
        if (field9957 != null) {
            final Class1266 class1267 = field9957;
            final Class1266 field9958 = this.Field9958;
            if (field9958 != null) {
                final Class1266 class1268 = field9958;
                final double method845 = Class187.Field8825.Method845(Class1047.Method4285(this.Field9960, n));
                final Class1811 class1269 = (class1267.Method5099() != null && class1268.Method5099() != null) ? class1267.Method5099().Method6833((Class495)new Class840(method845), class1268.Method5099()) : null;
                this.Field9962 = (float)((class1266.Method5098() != null) ? Class187.Field8822.Method845(Class1047.Method4285(this.Field9961, n2)) : Class187.Field8822.Method848(Class1047.Method4285(this.Field9961, n2)));
                if (class1269 != null) {
                    GlStateManager.pushMatrix();
                    GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
                    GlStateManager.popMatrix();
                }
                this.Field9959 = class1266.Method5098();
            }
        }
    }
    
    public final void Method2206(@Nullable @Nullable final Class1266 class1266) {
        final BlockPos field9959 = (class1266 != null) ? class1266.Method5098() : null;
        if (Intrinsics.areEqual((Object)field9959, (Object)this.Field9959) ^ true) {
            Class1266 field9960;
            if ((field9960 = this.Field9956) == null) {
                field9960 = this.Field9958;
            }
            this.Field9957 = field9960;
            this.Field9960 = System.currentTimeMillis();
            if (this.Field9956 == null) {
                this.Field9961 = System.currentTimeMillis();
            }
            this.Field9959 = field9959;
        }
    }
    
    private static String Method2207(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3C0A ^ 0x97));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
