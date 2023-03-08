//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.client.*;
import net.minecraft.entity.player.*;
import org.jetbrains.annotations.*;
import java.util.function.*;
import kotlin.jvm.internal.*;
import net.minecraft.entity.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006?\u0006\u0002\u0010\u0007B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003?\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0002\u001a\u00020\u0019J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0002\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J \u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0004J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001fR\u0014\u0010\r\u001a\u00020\u000eX\u0084\u0004?\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004?\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e?\u0006\u0002\n\u0000?\u0006!" }, d2 = { "Lcom/kisman/cc/util/entity/TargetFinder;", "", "range", "Ljava/util/function/Supplier;", "", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "(Ljava/util/function/Supplier;Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;)V", "delay", "", "threadded", "", "(Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V", "mc", "Lnet/minecraft/client/Minecraft;", "getMc", "()Lnet/minecraft/client/Minecraft;", "target", "Lnet/minecraft/entity/player/EntityPlayer;", "getTarget", "()Lnet/minecraft/entity/player/EntityPlayer;", "setTarget", "(Lnet/minecraft/entity/player/EntityPlayer;)V", "targetFinderTHandler", "Lcom/kisman/cc/util/thread/kisman/ThreadHandler;", "", "wallRange", "isntValid", "entity", "Lnet/minecraft/entity/EntityLivingBase;", "reset", "", "update", "kisman.cc" })
public class Class61
{
    @NotNull
    private final Minecraft Field8200;
    @Nullable
    private EntityPlayer Field8201;
    private Class511 Field8202;
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
    
    public final void Method497(@Nullable @Nullable final EntityPlayer field8201) {
        this.Field8201 = field8201;
    }
    
    public final void Method498() {
        this.Field8202.Method2360();
    }
    
    public final void Method499() {
        this.Field8202.Method2361((Runnable)new Class1136(this));
    }
    
    @Nullable
    @Nullable
    public final EntityPlayer Method500(final float n) {
        return this.Method501(n, n);
    }
    
    @Nullable
    @Nullable
    public EntityPlayer Method501(final float n, final float n2) {
        EntityPlayer entityPlayer = null;
        for (int size = this.Field8200.world.playerEntities.size(), i = 0; i < size; ++i) {
            final EntityPlayer entityPlayer2 = this.Field8200.world.playerEntities.get(i);
            final Class697 class697 = null;
            Intrinsics.checkExpressionValueIsNotNull((Object)class697, "AntiBot.instance");
            if (!class697.Method35() || !null.Field10954.Method309("Zamorozka") || Class394.Method1927((EntityLivingBase)entityPlayer2)) {
                final EntityPlayer entityPlayer3 = entityPlayer2;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayer3, "player");
                if (!this.Method502((EntityLivingBase)entityPlayer3, n, n2)) {
                    if (entityPlayer == null) {
                        entityPlayer = entityPlayer2;
                    }
                    else if (this.Field8200.player.getDistanceSq((Entity)entityPlayer2) < this.Field8200.player.getDistanceSq((Entity)entityPlayer)) {
                        entityPlayer = entityPlayer2;
                    }
                }
            }
        }
        return entityPlayer;
    }
    
    protected final boolean Method502(@NotNull @NotNull final EntityLivingBase entityLivingBase, final double n, final double n2) {
        Intrinsics.checkParameterIsNotNull((Object)entityLivingBase, "entity");
        return this.Field8200.player.getDistanceSq((Entity)entityLivingBase) > (this.Field8200.player.canEntityBeSeen((Entity)entityLivingBase) ? n : n2) || entityLivingBase == this.Field8200.player || entityLivingBase.getHealth() <= 0.0f || entityLivingBase.isDead || Class726.Field11086.Method3043(entityLivingBase.getName());
    }
    
    public Class61(@NotNull @NotNull final Supplier field8203, @NotNull @NotNull final Supplier supplier, @NotNull @NotNull final Supplier supplier2) {
        Intrinsics.checkParameterIsNotNull((Object)field8203, "range");
        Intrinsics.checkParameterIsNotNull((Object)supplier, "delay");
        Intrinsics.checkParameterIsNotNull((Object)supplier2, "threadded");
        this.Field8203 = field8203;
        final Minecraft getMinecraft = Minecraft.getMinecraft();
        Intrinsics.checkExpressionValueIsNotNull((Object)getMinecraft, "Minecraft.getMinecraft()");
        this.Field8200 = getMinecraft;
        this.Field8202 = new Class511(supplier, supplier2);
    }
    
    public Class61(@NotNull @NotNull final Supplier supplier, @NotNull @NotNull final Class411 class411) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, "range");
        Intrinsics.checkParameterIsNotNull((Object)class411, "threads");
        this(supplier, (Supplier)new Class571(class411), (Supplier)new Class570(class411));
    }
    
    public static final Supplier Method503(final Class61 class61) {
        return class61.Field8203;
    }
    
    private static String Method504(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x851 ^ 0xAD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
