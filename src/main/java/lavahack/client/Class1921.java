//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import java.util.function.*;
import net.minecraft.entity.player.*;
import kotlin.jvm.internal.*;
import net.minecraft.entity.*;
import java.util.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BS\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003?\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0015" }, d2 = { "Lcom/kisman/cc/features/module/combat/autorer/AutoRerTargetFinder;", "Lcom/kisman/cc/util/entity/TargetFinder;", "logic", "Ljava/util/function/Supplier;", "Lcom/kisman/cc/util/enums/AutoRerTargetFinderLogic;", "placeRange", "", "autoRer", "Lcom/kisman/cc/features/module/combat/AutoRer;", "range", "", "delay", "", "threadded", "", "(Ljava/util/function/Supplier;Ljava/util/function/Supplier;Lcom/kisman/cc/features/module/combat/AutoRer;Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V", "getDamageForPlayer", "player", "Lnet/minecraft/entity/player/EntityPlayer;", "getTarget", "wallRange", "kisman.cc" })
public final class Class1921 extends Class61
{
    private final Supplier Field16928;
    private final Supplier Field16929;
    private final Class1416 Field16930;
    private String Field16931 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Nullable
    @Nullable
    @Override
    public EntityPlayer Method501(final float n, final float n2) {
        EntityPlayer entityPlayer = null;
        float n3 = Float.intBitsToFloat(1112014848);
        float intBitsToFloat = Float.intBitsToFloat(1056964608);
        for (final Entity entity : this.Method495().world.loadedEntityList) {
            if (entity instanceof EntityPlayer) {
                final Class42 class42 = null;
                Intrinsics.checkExpressionValueIsNotNull((Object)class42, "AntiBot.instance");
                if (class42.Method35() && null.Field10954.Method309("Zamorozka") && !Class394.Method1927((EntityLivingBase)entity)) {
                    continue;
                }
                if (this.Method502((EntityLivingBase)entity, n, n2) || (entityPlayer != null && this.Method495().player.getDistanceSq(entity) >= this.Method495().player.getDistanceSq((Entity)entityPlayer))) {
                    continue;
                }
                final float method7173 = this.Method7173((EntityPlayer)entity);
                if (this.Field16928.get() == Class1727.Field15931) {
                    if (method7173 < intBitsToFloat) {
                        continue;
                    }
                }
                else if (this.Field16928.get() == Class1727.Field15930 && ((EntityPlayer)entity).getHealth() > n3) {
                    continue;
                }
                entityPlayer = (EntityPlayer)entity;
                if (method7173 > intBitsToFloat) {
                    intBitsToFloat = method7173;
                }
                if (((EntityPlayer)entity).getHealth() >= n3) {
                    continue;
                }
                n3 = ((EntityPlayer)entity).getHealth();
            }
        }
        return entityPlayer;
    }
    
    private final float Method7173(final EntityPlayer entityPlayer) {
        float n = Float.intBitsToFloat(1056964608);
        final BlockPos getPosition = entityPlayer.getPosition();
        final Number value = this.Field16929.get();
        Intrinsics.checkExpressionValueIsNotNull((Object)value, "placeRange.get()");
        for (final BlockPos blockPos : Class394.Method1946(getPosition, value.floatValue(), 1 + (int)this.Field16929.get().floatValue(), false, true, 0)) {
            final Class44 field14490 = this.Field16930.Field14490;
            Intrinsics.checkExpressionValueIsNotNull((Object)field14490, "autoRer.thirdCheck");
            if (!field14490.Method365() || this.Field16930.Method5622(blockPos)) {
                final BlockPos blockPos2 = blockPos;
                final Class44 field14491 = this.Field16930.Field14489;
                Intrinsics.checkExpressionValueIsNotNull((Object)field14491, "autoRer.secondCheck");
                final boolean method365 = field14491.Method365();
                final boolean b = true;
                final boolean method366 = this.Field16930.Method27();
                final Class44 field14492 = this.Field16930.Field14493;
                Intrinsics.checkExpressionValueIsNotNull((Object)field14492, "autoRer.firePlace");
                if (!Class2155.Method7755(blockPos2, method365, b, method366, field14492.Method365())) {
                    continue;
                }
                final float n2 = n;
                final World world = (World)this.Method495().world;
                final BlockPos blockPos3 = blockPos;
                Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, "pos");
                final double n3 = blockPos3.getX() + Double.longBitsToDouble((long)566020868 ^ 0x3FE0000021BCCB04L);
                final double n4 = blockPos.getY() + 1;
                final double n5 = blockPos.getZ() + Double.longBitsToDouble((long)690312300 ^ 0x3FE000002925546CL);
                final Entity entity = (Entity)entityPlayer;
                final Class44 field14493 = this.Field16930.Field14454;
                Intrinsics.checkExpressionValueIsNotNull((Object)field14493, "autoRer.terrain");
                n = Class1047.Method4280(n2, Class2155.Method7759(world, n3, n4, n5, entity, field14493.Method365()));
            }
        }
        return n;
    }
    
    public Class1921(@NotNull @NotNull final Supplier field16928, @NotNull @NotNull final Supplier field16929, @NotNull @NotNull final Class1416 field16930, @NotNull @NotNull final Supplier supplier, @NotNull @NotNull final Supplier supplier2, @NotNull @NotNull final Supplier supplier3) {
        Intrinsics.checkParameterIsNotNull((Object)field16928, "logic");
        Intrinsics.checkParameterIsNotNull((Object)field16929, "placeRange");
        Intrinsics.checkParameterIsNotNull((Object)field16930, "autoRer");
        Intrinsics.checkParameterIsNotNull((Object)supplier, "range");
        Intrinsics.checkParameterIsNotNull((Object)supplier2, "delay");
        Intrinsics.checkParameterIsNotNull((Object)supplier3, "threadded");
        super(supplier, supplier2, supplier3);
        this.Field16928 = field16928;
        this.Field16929 = field16929;
        this.Field16930 = field16930;
    }
    
    private static String Method504(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x26CA ^ 0x22));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
