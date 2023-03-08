//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.client.entity.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.player.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0010Jn\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010J\u0016\u0010%\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J \u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0002J\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020.2\u0006\u0010'\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n?\u0006/" }, d2 = { "Lcom/kisman/cc/features/module/combat/autorer/AutoRerUtil$Companion;", "", "()V", "mc", "Lnet/minecraft/client/Minecraft;", "targetFinder", "Lcom/kisman/cc/features/module/combat/autorer/AutoRerTargetFinder;", "getTargetFinder", "()Lcom/kisman/cc/features/module/combat/autorer/AutoRerTargetFinder;", "setTargetFinder", "(Lcom/kisman/cc/features/module/combat/autorer/AutoRerTargetFinder;)V", "getDamageByCrystal", "", "target", "Lnet/minecraft/entity/Entity;", "terrain", "", "crystal", "Lnet/minecraft/util/math/BlockPos;", "getPlaceInfo", "Lcom/kisman/cc/features/module/combat/autorer/PlaceInfo;", "placePos", "Lnet/minecraft/entity/EntityLivingBase;", "getPlacePos", "range", "wallRange", "Lnet/minecraft/entity/player/EntityPlayer;", "multiPlace", "firePlace", "secondCheck", "thirdCheck", "minDamage", "", "maxSelfDamage", "lethalMult", "wallRangeUsage", "noSuicide", "getSelfDamageByCrystal", "isPosValid", "pos", "placeRange", "", "placeWallRange", "onEnable", "", "toVec3dCenter", "Lnet/minecraft/util/math/Vec3d;", "kisman.cc" })
public final class Class1757
{
    private String Field16050 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class1921 Method6685() {
        return Class1955.Method7266();
    }
    
    public final void Method6686(@NotNull @NotNull final Class1921 class1921) {
        Intrinsics.checkParameterIsNotNull((Object)class1921, "<set-?>");
        Class1955.Method7267(class1921);
    }
    
    public final void Method6687() {
        this.Method6685().Method498();
    }
    
    public final float Method6688(@NotNull @NotNull final Entity entity, final boolean b, @NotNull @NotNull final BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)entity, "target");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "crystal");
        if (Class1955.Method7268().world == null) {
            return 0.0f;
        }
        return Class2155.Method7773(Class1955.Method7268().world, blockPos.getX() + Float.intBitsToFloat(1056964608), blockPos.getY() + 1, blockPos.getZ() + Double.longBitsToDouble((long)521932150 ^ 0x3FE000001F1C0D76L), entity, b, true);
    }
    
    public final float Method6689(final boolean b, @NotNull @NotNull final BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "crystal");
        final Class1757 class1757 = this;
        final EntityPlayerSP player = Class1955.Method7268().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
        return class1757.Method6688((Entity)player, b, blockPos);
    }
    
    @NotNull
    @NotNull
    public final Class204 Method6690(@NotNull @NotNull final BlockPos blockPos, @NotNull @NotNull final EntityLivingBase entityLivingBase, final boolean b) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "placePos");
        Intrinsics.checkParameterIsNotNull((Object)entityLivingBase, "target");
        return new Class204(entityLivingBase, blockPos, this.Method6689(b, blockPos), this.Method6688((Entity)entityLivingBase, b, blockPos), null, null, null);
    }
    
    @NotNull
    @NotNull
    public final Vec3d Method6691(@NotNull @NotNull final BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos");
        return new Vec3d((double)blockPos.getX(), (double)blockPos.getY(), (double)blockPos.getZ());
    }
    
    private final boolean Method6692(final BlockPos blockPos, final double n, final double n2) {
        return Class1955.Method7268().player.getDistance(blockPos.getX() + Double.longBitsToDouble(4602678819172646912L), (double)blockPos.getY(), blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L)) <= (Class394.Method1917(blockPos) ? n : n2);
    }
    
    @NotNull
    @NotNull
    public final Class204 Method6693(final float n, final float n2, @NotNull @NotNull final EntityPlayer entityPlayer, final boolean b, final boolean b2, final boolean b3, final boolean b4, final int n3, final int n4, final float n5, final boolean b5, final boolean b6, final boolean b7) {
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, "target");
        float intBitsToFloat = Float.intBitsToFloat(1056964608);
        float n6 = 0.0f;
        BlockPos blockPos = null;
        final EntityPlayerSP player = Class1955.Method7268().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
        final BlockPos getPosition = player.getPosition();
        Intrinsics.checkExpressionValueIsNotNull((Object)getPosition, "mc.player.position");
        int n7 = getPosition.getX() - (int)n;
        while (true) {
            final float n8 = (float)n7;
            final EntityPlayerSP player2 = Class1955.Method7268().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
            final BlockPos getPosition2 = player2.getPosition();
            Intrinsics.checkExpressionValueIsNotNull((Object)getPosition2, "mc.player.position");
            if (n8 > getPosition2.getX() + n) {
                break;
            }
            final EntityPlayerSP player3 = Class1955.Method7268().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player3, "mc.player");
            final BlockPos getPosition3 = player3.getPosition();
            Intrinsics.checkExpressionValueIsNotNull((Object)getPosition3, "mc.player.position");
            int n9 = getPosition3.getZ() - (int)n;
            while (true) {
                final float n10 = (float)n9;
                final EntityPlayerSP player4 = Class1955.Method7268().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player4, "mc.player");
                final BlockPos getPosition4 = player4.getPosition();
                Intrinsics.checkExpressionValueIsNotNull((Object)getPosition4, "mc.player.position");
                if (n10 > getPosition4.getZ() + n) {
                    break;
                }
                final EntityPlayerSP player5 = Class1955.Method7268().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player5, "mc.player");
                final BlockPos getPosition5 = player5.getPosition();
                Intrinsics.checkExpressionValueIsNotNull((Object)getPosition5, "mc.player.position");
                int n11 = getPosition5.getY() - (int)n;
                while (true) {
                    final float n12 = (float)n11;
                    final EntityPlayerSP player6 = Class1955.Method7268().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)player6, "mc.player");
                    final BlockPos getPosition6 = player6.getPosition();
                    Intrinsics.checkExpressionValueIsNotNull((Object)getPosition6, "mc.player.position");
                    if (n12 >= getPosition6.getY() + n) {
                        break;
                    }
                    final EntityPlayerSP player7 = Class1955.Method7268().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)player7, "mc.player");
                    final BlockPos getPosition7 = player7.getPosition();
                    Intrinsics.checkExpressionValueIsNotNull((Object)getPosition7, "mc.player.position");
                    final double n13 = getPosition7.getX() - (n7 + Double.longBitsToDouble(4602678819172646912L));
                    final EntityPlayerSP player8 = Class1955.Method7268().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)player8, "mc.player");
                    final BlockPos getPosition8 = player8.getPosition();
                    Intrinsics.checkExpressionValueIsNotNull((Object)getPosition8, "mc.player.position");
                    final double n14 = n13 * (getPosition8.getX() - (n7 + Double.longBitsToDouble((long)1646136673 ^ 0x3FE00000621E0D61L)));
                    final EntityPlayerSP player9 = Class1955.Method7268().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)player9, "mc.player");
                    final BlockPos getPosition9 = player9.getPosition();
                    Intrinsics.checkExpressionValueIsNotNull((Object)getPosition9, "mc.player.position");
                    final double n15 = getPosition9.getZ() - (n9 + Double.longBitsToDouble((long)576132734 ^ 0x3FE000002257167EL));
                    final EntityPlayerSP player10 = Class1955.Method7268().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)player10, "mc.player");
                    final BlockPos getPosition10 = player10.getPosition();
                    Intrinsics.checkExpressionValueIsNotNull((Object)getPosition10, "mc.player.position");
                    final double n16 = n14 + n15 * (getPosition10.getZ() - (n9 + Double.longBitsToDouble((long)1670298331 ^ 0x3FE00000638EBADBL)));
                    final EntityPlayerSP player11 = Class1955.Method7268().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)player11, "mc.player");
                    final BlockPos getPosition11 = player11.getPosition();
                    Intrinsics.checkExpressionValueIsNotNull((Object)getPosition11, "mc.player.position");
                    final int n17 = getPosition11.getY() - n11;
                    final EntityPlayerSP player12 = Class1955.Method7268().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)player12, "mc.player");
                    final BlockPos getPosition12 = player12.getPosition();
                    Intrinsics.checkExpressionValueIsNotNull((Object)getPosition12, "mc.player.position");
                    final double n18 = n16 + n17 * (getPosition12.getY() - n11);
                    if (n18 < n * n) {
                        final BlockPos blockPos2 = new BlockPos(n7, n11, n9);
                        if ((!b4 || !b6 || !Class394.Method1917(blockPos2) || n18 <= n2 * n2) && Class2155.Method7755(blockPos2, b3, true, b, b2)) {
                            final float method6688 = this.Method6688((Entity)entityPlayer, b5, blockPos2);
                            if ((Class1416.Field14544.Method28() && (Class1416.Field14544.Method5617(method6688) || Class1416.Field14544.Method29())) || method6688 > n3 || method6688 * n5 > entityPlayer.getHealth() + entityPlayer.absorptionAmount) {
                                final float method6689 = this.Method6689(b5, blockPos2);
                                if (method6689 <= n4) {
                                    final float n19 = method6689 + 2;
                                    final EntityPlayerSP player13 = Class1955.Method7268().player;
                                    Intrinsics.checkExpressionValueIsNotNull((Object)player13, "mc.player");
                                    if ((n19 < player13.getHealth() + Class1955.Method7268().player.absorptionAmount || !b7) && method6689 < method6688) {
                                        intBitsToFloat = method6688;
                                        n6 = method6689;
                                        blockPos = blockPos2;
                                    }
                                }
                            }
                        }
                    }
                    ++n11;
                }
                ++n9;
            }
            ++n7;
        }
        return new Class204((EntityLivingBase)entityPlayer, blockPos, n6, intBitsToFloat, null, null, null);
    }
    
    private Class1757() {
    }
    
    public Class1757(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
    
    private static String Method6694(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3173 ^ 0xE8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
