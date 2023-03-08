//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import org.jetbrains.annotations.*;
import kotlin.*;
import net.minecraft.network.*;
import net.minecraft.util.*;
import net.minecraft.world.*;
import net.minecraft.network.play.client.*;
import net.minecraft.entity.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.entity.*;
import java.util.function.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0002J#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0016?\u0006\u0002\u0010\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e?\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e?\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0018" }, d2 = { "Lcom/kisman/cc/features/command/commands/RollBackCommand;", "Lcom/kisman/cc/features/command/Command;", "()V", "id", "", "pos", "Lnet/minecraft/util/math/Vec3d;", "receive", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "send", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "getDescription", "", "getSyntax", "onDisconnect", "", "runCommand", "s", "args", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "Companion", "Mode", "kisman.cc" })
public final class Class538 extends Class158
{
    private Vec3d Field10269;
    private int Field10270;
    private final Class618 Field10271;
    private final Class618 Field10272;
    @Nullable
    private static Class538 Field10273;
    public static final Class247 Field10274;
    private String Field10275 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method443(@NotNull @NotNull final String s, @NotNull @NotNull final String[] array) {
        Intrinsics.checkParameterIsNotNull((Object)s, "s");
        Intrinsics.checkParameterIsNotNull((Object)array, "args");
        if (this.Field10270 == -1) {
            this.Field10269 = new Vec3d(0.0, 0.0, 0.0);
            Class1796.Field16242.Method706(this.Field10271);
            Class1796.Field16242.Method706(this.Field10272);
        }
        else {
            Class1206 class1206 = Class1206.Field13475;
            if (array.length > 1) {
                final String s2 = array[1];
                if (s2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                final String lowerCase = s2.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull((Object)lowerCase, "(this as java.lang.String).toLowerCase()");
                class1206 = Class1206.valueOf(lowerCase);
            }
            final Packet[] array2 = new Packet[0];
            if (class1206 == Class1206.Field13475) {
                array2[0] = (Packet)new CPacketConfirmTeleport(this.Field10270);
                array2[1] = (Packet)new CPacketPlayer$Rotation(Method2430().player.rotationYaw, Method2430().player.rotationPitch, true);
            }
            else if (class1206 == Class1206.Field13478) {
                if (Method2430().player.fishEntity != null) {
                    final EntityFishHook fishEntity = Method2430().player.fishEntity;
                    final Entity entity = (fishEntity != null) ? fishEntity.caughtEntity : null;
                    if (entity != null && Intrinsics.areEqual((Object)entity, (Object)Method2430().player.getRidingEntity())) {
                        final Vec3d field10269 = this.Field10269;
                        final Double n = (field10269 != null) ? Double.valueOf(field10269.x) : null;
                        if (n == null) {
                            Intrinsics.throwNpe();
                        }
                        final double doubleValue = n;
                        final EntityFishHook fishEntity2 = Method2430().player.fishEntity;
                        if (fishEntity2 == null) {
                            Intrinsics.throwNpe();
                        }
                        final double n2 = doubleValue - fishEntity2.posX;
                        final Vec3d field10270 = this.Field10269;
                        final Double n3 = (field10270 != null) ? Double.valueOf(field10270.y) : null;
                        if (n3 == null) {
                            Intrinsics.throwNpe();
                        }
                        final double doubleValue2 = n3;
                        final EntityFishHook fishEntity3 = Method2430().player.fishEntity;
                        if (fishEntity3 == null) {
                            Intrinsics.throwNpe();
                        }
                        final double n4 = doubleValue2 - fishEntity3.posY;
                        final Vec3d field10271 = this.Field10269;
                        final Double n5 = (field10271 != null) ? Double.valueOf(field10271.z) : null;
                        if (n5 == null) {
                            Intrinsics.throwNpe();
                        }
                        final double doubleValue3 = n5;
                        final EntityFishHook fishEntity4 = Method2430().player.fishEntity;
                        if (fishEntity4 == null) {
                            Intrinsics.throwNpe();
                        }
                        final double n6 = doubleValue3 - fishEntity4.posZ;
                        final Entity entity2 = entity;
                        entity2.motionX += n2 * Double.longBitsToDouble((long)512840944 ^ 0x3FB999998708CD6AL);
                        final Entity entity3 = entity;
                        entity3.motionY += n4 * Double.longBitsToDouble((long)670696214 ^ 0x3FB99999BE639A8CL);
                        final Entity entity4 = entity;
                        entity4.motionZ += n6 * Double.longBitsToDouble((long)1174519737 ^ 0x3FB99999DF982623L);
                    }
                }
                array2[0] = (Packet)new CPacketConfirmTeleport(this.Field10270);
                array2[1] = (Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND);
            }
            else {
                final Entity getRidingEntity = Method2430().player.getRidingEntity();
                if (getRidingEntity == null) {
                    this.Method438("You are not riding anything");
                    return;
                }
                final WorldClient world = Method2430().world;
                Intrinsics.checkExpressionValueIsNotNull((Object)world, "mc.world");
                final Class719 class1207 = new Class719((World)world, 0);
                class1207.setPosition(getRidingEntity.posX, getRidingEntity.posY - Double.longBitsToDouble((long)180900274 ^ 0x3FD3333339FB6281L), getRidingEntity.posZ);
                if (class1206 == Class1206.Field13476) {
                    array2[0] = (Packet)new CPacketConfirmTeleport(this.Field10270);
                    array2[1] = (Packet)new CPacketPlayer$Rotation(Method2430().player.rotationYaw, Method2430().player.rotationPitch, true);
                }
                else {
                    array2[0] = (Packet)new CPacketPlayer$Rotation(Method2430().player.rotationYaw, Method2430().player.rotationPitch, true);
                    array2[1] = (Packet)new CPacketPlayerTryUseItem(EnumHand.OFF_HAND);
                }
                array2[2] = (Packet)new CPacketVehicleMove((Entity)class1207);
            }
            final EntityPlayerSP player = Method2430().player;
            final Vec3d field10272 = this.Field10269;
            final Double n7 = (field10272 != null) ? Double.valueOf(field10272.x) : null;
            if (n7 == null) {
                Intrinsics.throwNpe();
            }
            final double doubleValue4 = n7;
            final Vec3d field10273 = this.Field10269;
            final Double n8 = (field10273 != null) ? Double.valueOf(field10273.y) : null;
            if (n8 == null) {
                Intrinsics.throwNpe();
            }
            final double doubleValue5 = n8;
            final Vec3d field10274 = this.Field10269;
            final Double n9 = (field10274 != null) ? Double.valueOf(field10274.z) : null;
            if (n9 == null) {
                Intrinsics.throwNpe();
            }
            player.setPosition(doubleValue4, doubleValue5, (double)n9);
            final Packet[] array3 = array2;
            for (int length = array3.length, i = 0; i < length; ++i) {
                Method2430().player.connection.sendPacket(array3[i]);
            }
            if (class1206 != Class1206.Field13477) {
                this.Method2429();
            }
            final String format = "Rollback to (%.2f, %.2f, %.2f)";
            final Object[] args = new Object[3];
            final int n10 = 0;
            final Vec3d field10275 = this.Field10269;
            args[n10] = ((field10275 != null) ? Double.valueOf(field10275.x) : null);
            final int n11 = 1;
            final Vec3d field10276 = this.Field10269;
            args[n11] = ((field10276 != null) ? Double.valueOf(field10276.y) : null);
            final int n12 = 2;
            final Vec3d field10277 = this.Field10269;
            args[n12] = ((field10277 != null) ? Double.valueOf(field10277.z) : null);
            final String format2 = String.format(format, args);
            Intrinsics.checkExpressionValueIsNotNull((Object)format2, "java.lang.String.format(\u2026     pos?.z\n            )");
            this.Method437(format2);
        }
    }
    
    private final void Method2429() {
        this.Field10270 = -1;
        Class1796.Field16242.Method711(this.Field10271);
        Class1796.Field16242.Method711(this.Field10272);
    }
    
    @NotNull
    @NotNull
    public String Method447() {
        return "problems?";
    }
    
    @NotNull
    @NotNull
    public String Method448() {
        return "rollback simple/double/tmp";
    }
    
    public Class538() {
        super("rollback");
        Class538.Field10273 = this;
        this.Field10270 = -1;
        this.Field10271 = new Class618((Class254)Class1348.Field14135, new Predicate[0]);
        this.Field10272 = new Class618((Class254)new Class2022(this), new Predicate[0]);
    }
    
    static {
        Field10274 = new Class247((DefaultConstructorMarker)null);
    }
    
    public static final Minecraft Method2430() {
        return Class158.Field8619;
    }
    
    public static final void Method2431(final Minecraft field8619) {
        Class158.Field8619 = field8619;
    }
    
    public static final Vec3d Method2432(final Class538 class538) {
        return class538.Field10269;
    }
    
    public static final void Method2433(final Class538 class538, final Vec3d field10269) {
        class538.Field10269 = field10269;
    }
    
    public static final int Method2434(final Class538 class538) {
        return class538.Field10270;
    }
    
    public static final void Method2435(final Class538 class538, final int field10270) {
        class538.Field10270 = field10270;
    }
    
    public static final Class538 Method2436() {
        return Class538.Field10273;
    }
    
    public static final void Method2437(final Class538 field10273) {
        Class538.Field10273 = field10273;
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x155E ^ 0xC5));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
