//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.projectile.EntityFishHook
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketConfirmTeleport
 *  net.minecraft.network.play.client.CPacketPlayer$Rotation
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItem
 *  net.minecraft.network.play.client.CPacketVehicleMove
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 */
package lavahack.client;

import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1206;
import lavahack.client.Class1348;
import lavahack.client.Class158;
import lavahack.client.Class1796;
import lavahack.client.Class2022;
import lavahack.client.Class247;
import lavahack.client.Class254;
import lavahack.client.Class618;
import lavahack.client.Class719;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketConfirmTeleport;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.network.play.client.CPacketVehicleMove;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0002J#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0016\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2={"Lcom/kisman/cc/features/command/commands/RollBackCommand;", "Lcom/kisman/cc/features/command/Command;", "()V", "id", "", "pos", "Lnet/minecraft/util/math/Vec3d;", "receive", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "send", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "getDescription", "", "getSyntax", "onDisconnect", "", "runCommand", "s", "args", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "Companion", "Mode", "kisman.cc"})
public final class Class538
extends Class158 {
    private Vec3d Field10269;
    private int Field10270;
    private final Class618 Field10271;
    private final Class618 Field10272;
    @Nullable
    private static Class538 Field10273;
    public static final Class247 Field10274;
    private String Field10275 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        boolean bl;
        Object object;
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"s");
        Intrinsics.checkParameterIsNotNull((Object)stringArray, (String)"args");
        if (this.Field10270 == -1) {
            this.Field10269 = new Vec3d(0.0, 0.0, 0.0);
            Class1796.Field16242.Method706(this.Field10271);
            Class1796.Field16242.Method706(this.Field10272);
            return;
        }
        Object object2 = Class1206.Field13475;
        if (stringArray.length > 1) {
            object = stringArray[1];
            bl = false;
            if (object == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String string2 = object.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull((Object)string2, (String)"(this as java.lang.String).toLowerCase()");
            object2 = object = Class1206.valueOf(string2);
        }
        bl = false;
        object = new Packet[]{};
        if (object2 == Class1206.Field13475) {
            object[0] = (Packet)new CPacketConfirmTeleport(this.Field10270);
            object[1] = (Packet)new CPacketPlayer.Rotation(Class538.Method2430().player.rotationYaw, Class538.Method2430().player.rotationPitch, true);
        } else if (object2 == Class1206.Field13478) {
            if (Class538.Method2430().player.fishEntity != null) {
                Entity entity;
                EntityFishHook entityFishHook = Class538.Method2430().player.fishEntity;
                Object object3 = entity = entityFishHook != null ? entityFishHook.caughtEntity : null;
                if (entity != null && Intrinsics.areEqual((Object)entity, (Object)Class538.Method2430().player.getRidingEntity())) {
                    Vec3d vec3d = this.Field10269;
                    Double d = vec3d != null ? Double.valueOf(vec3d.x) : null;
                    if (d == null) {
                        Intrinsics.throwNpe();
                    }
                    double d2 = d;
                    EntityFishHook entityFishHook2 = Class538.Method2430().player.fishEntity;
                    if (entityFishHook2 == null) {
                        Intrinsics.throwNpe();
                    }
                    double d3 = d2 - entityFishHook2.posX;
                    Vec3d vec3d2 = this.Field10269;
                    Double d4 = vec3d2 != null ? Double.valueOf(vec3d2.y) : null;
                    if (d4 == null) {
                        Intrinsics.throwNpe();
                    }
                    double d5 = d4;
                    EntityFishHook entityFishHook3 = Class538.Method2430().player.fishEntity;
                    if (entityFishHook3 == null) {
                        Intrinsics.throwNpe();
                    }
                    double d6 = d5 - entityFishHook3.posY;
                    Vec3d vec3d3 = this.Field10269;
                    Double d7 = vec3d3 != null ? Double.valueOf(vec3d3.z) : null;
                    if (d7 == null) {
                        Intrinsics.throwNpe();
                    }
                    double d8 = d7;
                    EntityFishHook entityFishHook4 = Class538.Method2430().player.fishEntity;
                    if (entityFishHook4 == null) {
                        Intrinsics.throwNpe();
                    }
                    double d9 = d8 - entityFishHook4.posZ;
                    entity.motionX += d3 * Double.longBitsToDouble((long)512840944 ^ 0x3FB999998708CD6AL);
                    entity.motionY += d6 * Double.longBitsToDouble((long)670696214 ^ 0x3FB99999BE639A8CL);
                    entity.motionZ += d9 * Double.longBitsToDouble((long)1174519737 ^ 0x3FB99999DF982623L);
                }
            }
            object[0] = (Packet)new CPacketConfirmTeleport(this.Field10270);
            object[1] = (Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND);
        } else {
            Entity entity = Class538.Method2430().player.getRidingEntity();
            if (entity == null) {
                this.Method438("You are not riding anything");
                return;
            }
            WorldClient worldClient = Class538.Method2430().world;
            Intrinsics.checkExpressionValueIsNotNull((Object)worldClient, (String)"mc.world");
            Class719 class719 = new Class719((World)worldClient, 0);
            class719.setPosition(entity.posX, entity.posY - Double.longBitsToDouble((long)180900274 ^ 0x3FD3333339FB6281L), entity.posZ);
            if (object2 == Class1206.Field13476) {
                object[0] = (Packet)new CPacketConfirmTeleport(this.Field10270);
                object[1] = (Packet)new CPacketPlayer.Rotation(Class538.Method2430().player.rotationYaw, Class538.Method2430().player.rotationPitch, true);
            } else {
                object[0] = (Packet)new CPacketPlayer.Rotation(Class538.Method2430().player.rotationYaw, Class538.Method2430().player.rotationPitch, true);
                object[1] = (Packet)new CPacketPlayerTryUseItem(EnumHand.OFF_HAND);
            }
            object[2] = (Packet)new CPacketVehicleMove((Entity)class719);
        }
        EntityPlayerSP entityPlayerSP = Class538.Method2430().player;
        Vec3d vec3d = this.Field10269;
        Double d = vec3d != null ? Double.valueOf(vec3d.x) : null;
        if (d == null) {
            Intrinsics.throwNpe();
        }
        double d9 = d;
        Vec3d vec3d4 = this.Field10269;
        Double d10 = vec3d4 != null ? Double.valueOf(vec3d4.y) : null;
        if (d10 == null) {
            Intrinsics.throwNpe();
        }
        double d11 = d10;
        Vec3d vec3d5 = this.Field10269;
        Double d12 = vec3d5 != null ? Double.valueOf(vec3d5.z) : null;
        if (d12 == null) {
            Intrinsics.throwNpe();
        }
        entityPlayerSP.setPosition(d9, d11, d12.doubleValue());
        for (Packet packet : object) {
            Class538.Method2430().player.connection.sendPacket(packet);
        }
        if (object2 != Class1206.Field13477) {
            this.Method2429();
        }
        Object[] objectArray = new Object[3];
        Vec3d vec3d6 = this.Field10269;
        objectArray[0] = vec3d6 != null ? Double.valueOf(vec3d6.x) : null;
        Vec3d vec3d7 = this.Field10269;
        objectArray[1] = vec3d7 != null ? Double.valueOf(vec3d7.y) : null;
        Vec3d vec3d8 = this.Field10269;
        objectArray[2] = vec3d8 != null ? Double.valueOf(vec3d8.z) : null;
        String string3 = String.format("Rollback to (%.2f, %.2f, %.2f)", objectArray);
        Intrinsics.checkExpressionValueIsNotNull((Object)string3, (String)"java.lang.String.format(\u2026     pos?.z\n            )");
        this.Method437(string3);
    }

    private final void Method2429() {
        this.Field10270 = -1;
        Class1796.Field16242.Method711(this.Field10271);
        Class1796.Field16242.Method711(this.Field10272);
    }

    @Override
    @NotNull
    @NotNull
    public String Method447() {
        return "problems?";
    }

    @Override
    @NotNull
    @NotNull
    public String Method448() {
        return "rollback simple/double/tmp";
    }

    public Class538() {
        super("rollback");
        Field10273 = this;
        this.Field10270 = -1;
        this.Field10271 = new Class618((Class254)Class1348.Field14135, new Predicate[0]);
        this.Field10272 = new Class618((Class254)new Class2022(this), new Predicate[0]);
    }

    static {
        Field10274 = new Class247(null);
    }

    public static final Minecraft Method2430() {
        return Class158.Field8619;
    }

    public static final void Method2431(Minecraft minecraft) {
        Class158.Field8619 = minecraft;
    }

    public static final Vec3d Method2432(Class538 class538) {
        return class538.Field10269;
    }

    public static final void Method2433(Class538 class538, Vec3d vec3d) {
        class538.Field10269 = vec3d;
    }

    public static final int Method2434(Class538 class538) {
        return class538.Field10270;
    }

    public static final void Method2435(Class538 class538, int n) {
        class538.Field10270 = n;
    }

    public static final Class538 Method2436() {
        return Field10273;
    }

    public static final void Method2437(Class538 class538) {
        Field10273 = class538;
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 197;
            cArray2[n] = (char)(cArray[n] ^ (0x155E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

