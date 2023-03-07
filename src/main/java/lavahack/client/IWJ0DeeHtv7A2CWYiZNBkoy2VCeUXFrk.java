//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 */
package lavahack.client;

import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk$1;
import lavahack.client.IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk$2;
import lavahack.client.IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.dLRp42sXVbFaJ5rZZSCKqqXbZCgvDQiP;
import lavahack.client.n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0002\u001a\u00020\u0019J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0002\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J \u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0004J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001fR\u0014\u0010\r\u001a\u00020\u000eX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2={"Lcom/kisman/cc/util/entity/TargetFinder;", "", "range", "Ljava/util/function/Supplier;", "", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "(Ljava/util/function/Supplier;Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;)V", "delay", "", "threadded", "", "(Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V", "mc", "Lnet/minecraft/client/Minecraft;", "getMc", "()Lnet/minecraft/client/Minecraft;", "target", "Lnet/minecraft/entity/player/EntityPlayer;", "getTarget", "()Lnet/minecraft/entity/player/EntityPlayer;", "setTarget", "(Lnet/minecraft/entity/player/EntityPlayer;)V", "targetFinderTHandler", "Lcom/kisman/cc/util/thread/kisman/ThreadHandler;", "", "wallRange", "isntValid", "entity", "Lnet/minecraft/entity/EntityLivingBase;", "reset", "", "update", "kisman.cc"})
public class IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk {
    @NotNull
    private final Minecraft Field8200;
    @Nullable
    private EntityPlayer Field8201;
    private dLRp42sXVbFaJ5rZZSCKqqXbZCgvDQiP Field8202;
    private final Supplier Field8203;
    private String Field8204 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    protected final Minecraft Method495() {
        return this.Field8200;
    }

    @Nullable
    @Nullable
    public final EntityPlayer Method496() {
        return this.Field8201;
    }

    public final void Method497(@Nullable @Nullable EntityPlayer entityPlayer) {
        this.Field8201 = entityPlayer;
    }

    public final void Method498() {
        this.Field8202.Method2360();
    }

    public final void Method499() {
        this.Field8202.Method2361(new IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this));
    }

    @Nullable
    @Nullable
    public final EntityPlayer Method500(float f) {
        return this.Method501(f, f);
    }

    @Nullable
    @Nullable
    public EntityPlayer Method501(float f, float f2) {
        EntityPlayer entityPlayer = null;
        int n = this.Field8200.world.playerEntities.size();
        int n2 = (int)((long)1064425646 ^ (long)1064425646);
        while (n2 < n) {
            EntityPlayer entityPlayer2 = (EntityPlayer)this.Field8200.world.playerEntities.get(n2);
            Intrinsics.checkExpressionValueIsNotNull(null, (String)"AntiBot.instance");
            if (((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)null).Method35() && null.Field10954.Method309("Zamorozka") && !EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1927((EntityLivingBase)entityPlayer2)) {
                ++n2;
                continue;
            }
            EntityPlayer entityPlayer3 = entityPlayer2;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayer3, (String)"player");
            if (!this.Method502((EntityLivingBase)entityPlayer3, f, f2)) {
                if (entityPlayer == null) {
                    entityPlayer = entityPlayer2;
                } else if (this.Field8200.player.getDistanceSq((Entity)entityPlayer2) < this.Field8200.player.getDistanceSq((Entity)entityPlayer)) {
                    entityPlayer = entityPlayer2;
                }
            }
            ++n2;
        }
        return entityPlayer;
    }

    protected final boolean Method502(@NotNull @NotNull EntityLivingBase entityLivingBase, double d, double d2) {
        int n;
        Intrinsics.checkParameterIsNotNull((Object)entityLivingBase, (String)"entity");
        if (!(this.Field8200.player.getDistanceSq((Entity)entityLivingBase) > (this.Field8200.player.canEntityBeSeen((Entity)entityLivingBase) ? d : d2) || entityLivingBase == this.Field8200.player || entityLivingBase.getHealth() <= 0.0f || entityLivingBase.isDead || n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI.Field11086.Method3043(entityLivingBase.getName()))) {
            n = (int)-738097428L ^ 0xD40186EC;
            return n != 0;
        }
        n = (int)-818910325L ^ 0xCF306B8A;
        return n != 0;
    }

    public IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk(@NotNull @NotNull Supplier supplier, @NotNull @NotNull Supplier supplier2, @NotNull @NotNull Supplier supplier3) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, (String)"range");
        Intrinsics.checkParameterIsNotNull((Object)supplier2, (String)"delay");
        Intrinsics.checkParameterIsNotNull((Object)supplier3, (String)"threadded");
        this.Field8203 = supplier;
        Minecraft minecraft = Minecraft.getMinecraft();
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft, (String)"Minecraft.getMinecraft()");
        this.Field8200 = minecraft;
        this.Field8202 = new dLRp42sXVbFaJ5rZZSCKqqXbZCgvDQiP(supplier2, supplier3);
    }

    public IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk(@NotNull @NotNull Supplier supplier, @NotNull @NotNull Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, (String)"range");
        Intrinsics.checkParameterIsNotNull((Object)q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ, (String)"threads");
        this(supplier, new IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk$1(q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ), new IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk$2(q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ));
    }

    public static final Supplier Method503(IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk iWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk) {
        return iWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk.Field8203;
    }

    private static String Method504(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-60184093L ^ 0xFC69A9E3;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-177153419 ^ (long)-177153398);
            int n2 = (int)((long)678260127 ^ (long)678260018);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1755040075 ^ (long)-1755037980) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

