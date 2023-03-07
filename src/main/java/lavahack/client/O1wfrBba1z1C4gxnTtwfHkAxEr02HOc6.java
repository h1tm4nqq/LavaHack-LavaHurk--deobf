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
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.VKNIwSUCQUw8Y8J9DVJeBWjGHMomWUXv;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
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
public final class O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
    private Vec3d Field10269;
    private int Field10270;
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field10271;
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field10272;
    @Nullable
    private static O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6 Field10273;
    public static final O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10274;
    private String Field10275 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        int n;
        Object object;
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"s");
        Intrinsics.checkParameterIsNotNull((Object)stringArray, (String)"args");
        if (this.Field10270 == (int)((long)1876493449 ^ (long)-1876493450)) {
            this.Field10269 = new Vec3d(0.0, 0.0, 0.0);
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field10271);
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field10272);
            return;
        }
        Object object2 = O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field13475;
        if (stringArray.length > (int)((long)922933749 ^ (long)922933748)) {
            object = stringArray[(int)-866325432L ^ 0xCC5CEC49];
            n = (int)((long)1454315987 ^ (long)1454315987);
            if (object == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String string2 = object.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull((Object)string2, (String)"(this as java.lang.String).toLowerCase()");
            object2 = object = O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.valueOf(string2);
        }
        n = (int)((long)172491065 ^ (long)172491065);
        object = new Packet[(int)((long)-1629790488 ^ (long)-1629790488)];
        if (object2 == O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field13475) {
            object[(int)((long)-1541374458 ^ (long)-1541374458)] = (Packet)new CPacketConfirmTeleport(this.Field10270);
            object[(int)-101380685L ^ 0xF9F50DB2] = (Packet)new CPacketPlayer.Rotation(O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2430().player.rotationYaw, O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2430().player.rotationPitch, (boolean)((long)-76102053 ^ (long)-76102054));
        } else if (object2 == O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field13478) {
            if (O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2430().player.fishEntity != null) {
                Entity entity;
                EntityFishHook entityFishHook = O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2430().player.fishEntity;
                Object object3 = entity = entityFishHook != null ? entityFishHook.caughtEntity : null;
                if (entity != null && Intrinsics.areEqual((Object)entity, (Object)O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2430().player.getRidingEntity())) {
                    Vec3d vec3d = this.Field10269;
                    Double d = vec3d != null ? Double.valueOf(vec3d.x) : null;
                    if (d == null) {
                        Intrinsics.throwNpe();
                    }
                    double d2 = d;
                    EntityFishHook entityFishHook2 = O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2430().player.fishEntity;
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
                    EntityFishHook entityFishHook3 = O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2430().player.fishEntity;
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
                    EntityFishHook entityFishHook4 = O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2430().player.fishEntity;
                    if (entityFishHook4 == null) {
                        Intrinsics.throwNpe();
                    }
                    double d9 = d8 - entityFishHook4.posZ;
                    entity.motionX += d3 * Double.longBitsToDouble((long)512840944 ^ 0x3FB999998708CD6AL);
                    entity.motionY += d6 * Double.longBitsToDouble((long)670696214 ^ 0x3FB99999BE639A8CL);
                    entity.motionZ += d9 * Double.longBitsToDouble((long)1174519737 ^ 0x3FB99999DF982623L);
                }
            }
            object[(int)2107794339L ^ 0x7DA263A3] = (Packet)new CPacketConfirmTeleport(this.Field10270);
            object[(int)((long)-468550327 ^ (long)-468550328)] = (Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND);
        } else {
            Entity entity = O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2430().player.getRidingEntity();
            if (entity == null) {
                this.Method438("You are not riding anything");
                return;
            }
            WorldClient worldClient = O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2430().world;
            Intrinsics.checkExpressionValueIsNotNull((Object)worldClient, (String)"mc.world");
            VKNIwSUCQUw8Y8J9DVJeBWjGHMomWUXv vKNIwSUCQUw8Y8J9DVJeBWjGHMomWUXv = new VKNIwSUCQUw8Y8J9DVJeBWjGHMomWUXv((World)worldClient, (int)-2107157835L ^ 0x826752B5);
            vKNIwSUCQUw8Y8J9DVJeBWjGHMomWUXv.setPosition(entity.posX, entity.posY - Double.longBitsToDouble((long)180900274 ^ 0x3FD3333339FB6281L), entity.posZ);
            if (object2 == O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field13476) {
                object[(int)535533978L ^ 0x1FEB999A] = (Packet)new CPacketConfirmTeleport(this.Field10270);
                object[(int)-1057369234L ^ 0xC0F9D36F] = (Packet)new CPacketPlayer.Rotation(O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2430().player.rotationYaw, O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2430().player.rotationPitch, (boolean)((long)1169612383 ^ (long)1169612382));
            } else {
                object[(int)((long)-88586550 ^ (long)-88586550)] = (Packet)new CPacketPlayer.Rotation(O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2430().player.rotationYaw, O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2430().player.rotationPitch, (boolean)((long)-263587198 ^ (long)-263587197));
                object[(int)1430669505L ^ 0x554648C0] = (Packet)new CPacketPlayerTryUseItem(EnumHand.OFF_HAND);
            }
            object[((int)-1058148843L ^ 0xC0EDEE14) << 1] = (Packet)new CPacketVehicleMove((Entity)vKNIwSUCQUw8Y8J9DVJeBWjGHMomWUXv);
        }
        EntityPlayerSP entityPlayerSP = O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2430().player;
        Vec3d vec3d = this.Field10269;
        Double d = vec3d != null ? Double.valueOf(vec3d.x) : null;
        if (d == null) {
            Intrinsics.throwNpe();
        }
        double d10 = d;
        Vec3d vec3d4 = this.Field10269;
        Double d11 = vec3d4 != null ? Double.valueOf(vec3d4.y) : null;
        if (d11 == null) {
            Intrinsics.throwNpe();
        }
        double d12 = d11;
        Vec3d vec3d5 = this.Field10269;
        Double d13 = vec3d5 != null ? Double.valueOf(vec3d5.z) : null;
        if (d13 == null) {
            Intrinsics.throwNpe();
        }
        entityPlayerSP.setPosition(d10, d12, d13.doubleValue());
        Object object4 = object;
        int n2 = ((Packet[])object4).length;
        for (int i = (int)((long)870119615 ^ (long)870119615); i < n2; ++i) {
            Packet packet = object4[i];
            O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method2430().player.connection.sendPacket(packet);
        }
        if (object2 != O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field13477) {
            this.Method2429();
        }
        Object[] objectArray = new Object[(int)((long)240022133 ^ (long)240022134)];
        Vec3d vec3d6 = this.Field10269;
        objectArray[(int)((long)-1742646817 ^ (long)-1742646817)] = vec3d6 != null ? Double.valueOf(vec3d6.x) : null;
        Vec3d vec3d7 = this.Field10269;
        objectArray[(int)-1696069652L ^ 0x9AE807ED] = vec3d7 != null ? Double.valueOf(vec3d7.y) : null;
        Vec3d vec3d8 = this.Field10269;
        objectArray[(int)((long)-563047354 ^ (long)-563047353) << 1] = vec3d8 != null ? Double.valueOf(vec3d8.z) : null;
        String string3 = String.format("Rollback to (%.2f, %.2f, %.2f)", objectArray);
        Intrinsics.checkExpressionValueIsNotNull((Object)string3, (String)"java.lang.String.format(\u2026     pos?.z\n            )");
        this.Method437(string3);
    }

    private final void Method2429() {
        this.Field10270 = (int)72740659L ^ 0xFBAA10CC;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field10271);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field10272);
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

    public O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6() {
        super("rollback");
        Field10273 = this;
        this.Field10270 = (int)-372041779L ^ 0x162CE832;
        this.Field10271 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field14135, new Predicate[(int)137992445L ^ 0x83998FD]);
        this.Field10272 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)new O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(this), new Predicate[(int)((long)-1737018367 ^ (long)-1737018367)]);
    }

    static {
        Field10274 = new O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(null);
    }

    public static final Minecraft Method2430() {
        return FrvoqED59Mj96pmO7hxn2tEew1fZAOzj.Field8619;
    }

    public static final void Method2431(Minecraft minecraft) {
        FrvoqED59Mj96pmO7hxn2tEew1fZAOzj.Field8619 = minecraft;
    }

    public static final Vec3d Method2432(O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6 o1wfrBba1z1C4gxnTtwfHkAxEr02HOc6) {
        return o1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Field10269;
    }

    public static final void Method2433(O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6 o1wfrBba1z1C4gxnTtwfHkAxEr02HOc6, Vec3d vec3d) {
        o1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Field10269 = vec3d;
    }

    public static final int Method2434(O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6 o1wfrBba1z1C4gxnTtwfHkAxEr02HOc6) {
        return o1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Field10270;
    }

    public static final void Method2435(O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6 o1wfrBba1z1C4gxnTtwfHkAxEr02HOc6, int n) {
        o1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Field10270 = n;
    }

    public static final O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6 Method2436() {
        return Field10273;
    }

    public static final void Method2437(O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6 o1wfrBba1z1C4gxnTtwfHkAxEr02HOc6) {
        Field10273 = o1wfrBba1z1C4gxnTtwfHkAxEr02HOc6;
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1692120775L ^ 0x64DBB6C7;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1365285848 ^ (long)1365285671);
            int n2 = (int)-1401203534L ^ 0xAC7B5477;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1394440639 ^ (long)1394438928) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

