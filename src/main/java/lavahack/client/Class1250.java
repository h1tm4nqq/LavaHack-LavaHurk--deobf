//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.StringCompanionObject
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.network.NetHandlerPlayClient
 *  net.minecraft.entity.Entity
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.RayTraceResult$Type
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 */
package lavahack.client;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import lavahack.client.Class1078;
import lavahack.client.Class158;
import lavahack.client.Class1930;
import lavahack.client.Class581;
import lavahack.client.Class719;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J#\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\u000e"}, d2={"Lcom/kisman/cc/features/command/commands/UseCommand;", "Lcom/kisman/cc/features/command/Command;", "()V", "getDescription", "", "getSyntax", "runCommand", "", "s", "args", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "Companion", "Mode", "kisman.cc"})
public final class Class1250
extends Class158 {
    @Nullable
    private static Class1250 Field13663;
    public static final Class1930 Field13664;
    private String Field13665 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"s");
        Intrinsics.checkParameterIsNotNull((Object)stringArray, (String)"args");
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 1;
        boolean bl = false;
        boolean bl2 = false;
        Class581 class581 = null;
        while (true) {
            Integer n5 = stringArray != null ? Integer.valueOf(stringArray.length) : null;
            if (n5 == null) {
                Intrinsics.throwNpe();
            }
            if (n4 >= n5) break;
            if (Intrinsics.areEqual((Object)stringArray[n4], (Object)"sneak")) {
                bl = true;
                ++n4;
                continue;
            }
            if (!Intrinsics.areEqual((Object)stringArray[n4], (Object)"attack")) break;
            bl2 = true;
            ++n4;
        }
        if (stringArray.length - n4 >= 3) {
            String string2 = stringArray[n4++];
            boolean bl3 = false;
            n = Integer.parseInt(string2);
            string2 = stringArray[n4++];
            bl3 = false;
            n2 = Integer.parseInt(string2);
            string2 = stringArray[n4];
            bl3 = false;
            n3 = Integer.parseInt(string2);
            class581 = Class581.Field10477;
        } else if (stringArray.length - n4 >= 1) {
            int n6;
            String string3 = stringArray[n4];
            boolean bl4 = false;
            n = n6 = Integer.parseInt(string3);
            class581 = Class581.Field10478;
        } else {
            RayTraceResult rayTraceResult = Class1250.Method5013().objectMouseOver;
            if (rayTraceResult == null) {
                this.Method438("No Target");
                return;
            }
            if (rayTraceResult.typeOfHit == RayTraceResult.Type.BLOCK) {
                BlockPos blockPos;
                BlockPos blockPos2 = blockPos = rayTraceResult.getBlockPos();
                Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos");
                n = blockPos2.getX();
                n2 = blockPos.getY();
                n3 = blockPos.getZ();
                class581 = Class581.Field10477;
            } else {
                if (rayTraceResult.typeOfHit != RayTraceResult.Type.ENTITY) {
                    this.Method438("No Target");
                    return;
                }
                n = rayTraceResult.entityHit.getEntityId();
                class581 = Class581.Field10478;
            }
        }
        String string4 = null;
        Class581 class5812 = class581;
        if (class5812 != null) {
            switch (Class1078.Field12797[class5812.ordinal()]) {
                case 1: {
                    EntityPlayerSP entityPlayerSP = Class1250.Method5013().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                    Vec3d vec3d = entityPlayerSP.getLookVec();
                    Intrinsics.checkExpressionValueIsNotNull((Object)vec3d, (String)"mc.player.lookVec");
                    Vec3d vec3d2 = vec3d;
                    Class1250.Method5013().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(new BlockPos(n, n2, n3), EnumFacing.UP, EnumHand.MAIN_HAND, ((Float)vec3d2.x).floatValue(), ((Float)vec3d2.y).floatValue(), ((Float)vec3d2.z).floatValue()));
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String string5 = "Using block (%d, %d, %d)";
                    Object[] objectArray = new Object[]{n, n2, n3};
                    boolean bl5 = false;
                    String string6 = String.format(string5, Arrays.copyOf(objectArray, objectArray.length));
                    Intrinsics.checkExpressionValueIsNotNull((Object)string6, (String)"java.lang.String.format(format, *args)");
                    string4 = string6;
                    break;
                }
                case 2: {
                    NetHandlerPlayClient netHandlerPlayClient = Class1250.Method5013().player.connection;
                    WorldClient worldClient = Class1250.Method5013().world;
                    Intrinsics.checkExpressionValueIsNotNull((Object)worldClient, (String)"mc.world");
                    netHandlerPlayClient.sendPacket((Packet)new CPacketUseEntity((Entity)new Class719((World)worldClient, n), EnumHand.MAIN_HAND));
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String string7 = "Using entity [%d]";
                    Object[] objectArray = new Object[]{n};
                    boolean bl6 = false;
                    String string8 = String.format(string7, Arrays.copyOf(objectArray, objectArray.length));
                    Intrinsics.checkExpressionValueIsNotNull((Object)string8, (String)"java.lang.String.format(format, *args)");
                    string4 = string8;
                    break;
                }
            }
        }
        this.Method437(string4);
    }

    @Override
    @NotNull
    @NotNull
    public String Method447() {
        return "idk";
    }

    @Override
    @NotNull
    @NotNull
    public String Method448() {
        return "use sneak/attack <entity_id> | <block_x> <block_y> <block_z>";
    }

    public Class1250() {
        super("use");
        Field13663 = this;
    }

    static {
        Field13664 = new Class1930(null);
    }

    public static final Minecraft Method5013() {
        return Class158.Field8619;
    }

    public static final void Method5014(Minecraft minecraft) {
        Class158.Field8619 = minecraft;
    }

    public static final Class1250 Method5015() {
        return Field13663;
    }

    public static final void Method5016(Class1250 class1250) {
        Field13663 = class1250;
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 154;
            cArray2[n] = (char)(cArray[n] ^ (0x6E1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

