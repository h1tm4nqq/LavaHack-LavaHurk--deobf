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
import lavahack.client.DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.VKNIwSUCQUw8Y8J9DVJeBWjGHMomWUXv;
import lavahack.client.loeSCLRsSG1UAVAmTYNc32l2flRwtz2N;
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
public final class DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
    @Nullable
    private static DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD Field13663;
    public static final DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field13664;
    private String Field13665 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"s");
        Intrinsics.checkParameterIsNotNull((Object)stringArray, (String)"args");
        int n = (int)((long)1617977258 ^ (long)1617977258);
        int n2 = (int)-602555333L ^ 0xDC15BC3B;
        int n3 = (int)509103719L ^ 0x1E584E67;
        int n4 = (int)((long)-379651298 ^ (long)-379651297);
        int n5 = (int)((long)2118931859 ^ (long)2118931859);
        int n6 = (int)((long)-2109575907 ^ (long)-2109575907);
        DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf dWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = null;
        while (true) {
            Integer n7 = stringArray != null ? Integer.valueOf(stringArray.length) : null;
            if (n7 == null) {
                Intrinsics.throwNpe();
            }
            if (n4 >= n7) break;
            if (Intrinsics.areEqual((Object)stringArray[n4], (Object)"sneak")) {
                n5 = (int)529910724L ^ 0x1F95CBC5;
                n4 += (int)790059979L ^ 0x2F175BCA;
                continue;
            }
            if (!Intrinsics.areEqual((Object)stringArray[n4], (Object)"attack")) break;
            n6 = (int)((long)-147594357 ^ (long)-147594358);
            n4 += (int)((long)-44930779 ^ (long)-44930780);
        }
        if (stringArray.length - n4 >= (int)((long)-543229003 ^ (long)-543229002)) {
            String string2 = stringArray[n4++];
            int n8 = (int)((long)537927537 ^ (long)537927537);
            n = Integer.parseInt(string2);
            string2 = stringArray[n4++];
            n8 = (int)((long)306859782 ^ (long)306859782);
            n2 = Integer.parseInt(string2);
            string2 = stringArray[n4];
            n8 = (int)((long)1254150822 ^ (long)1254150822);
            n3 = Integer.parseInt(string2);
            dWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field10477;
        } else if (stringArray.length - n4 >= (int)((long)648932681 ^ (long)648932680)) {
            int n9;
            String string3 = stringArray[n4];
            int n10 = (int)((long)2081066246 ^ (long)2081066246);
            n = n9 = Integer.parseInt(string3);
            dWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field10478;
        } else {
            RayTraceResult rayTraceResult = DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD.Method5013().objectMouseOver;
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
                dWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field10477;
            } else {
                if (rayTraceResult.typeOfHit != RayTraceResult.Type.ENTITY) {
                    this.Method438("No Target");
                    return;
                }
                n = rayTraceResult.entityHit.getEntityId();
                dWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field10478;
            }
        }
        String string4 = null;
        DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf dWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf2 = dWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        if (dWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf2 != null) {
            switch (loeSCLRsSG1UAVAmTYNc32l2flRwtz2N.Field12797[dWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf2.ordinal()]) {
                case 1: {
                    EntityPlayerSP entityPlayerSP = DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD.Method5013().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                    Vec3d vec3d = entityPlayerSP.getLookVec();
                    Intrinsics.checkExpressionValueIsNotNull((Object)vec3d, (String)"mc.player.lookVec");
                    Vec3d vec3d2 = vec3d;
                    DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD.Method5013().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(new BlockPos(n, n2, n3), EnumFacing.UP, EnumHand.MAIN_HAND, ((Float)vec3d2.x).floatValue(), ((Float)vec3d2.y).floatValue(), ((Float)vec3d2.z).floatValue()));
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String string5 = "Using block (%d, %d, %d)";
                    Object[] objectArray = new Object[(int)((long)560424765 ^ (long)560424766)];
                    objectArray[(int)284712040L ^ 0x10F85C68] = n;
                    objectArray[(int)((long)-1356294698 ^ (long)-1356294697)] = n2;
                    objectArray[((int)-942028895L ^ 0xC7D9C7A0) << 1] = n3;
                    Object[] objectArray2 = objectArray;
                    int n11 = (int)((long)1017846885 ^ (long)1017846885);
                    String string6 = String.format(string5, Arrays.copyOf(objectArray2, objectArray2.length));
                    Intrinsics.checkExpressionValueIsNotNull((Object)string6, (String)"java.lang.String.format(format, *args)");
                    string4 = string6;
                    break;
                }
                case 2: {
                    NetHandlerPlayClient netHandlerPlayClient = DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD.Method5013().player.connection;
                    WorldClient worldClient = DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD.Method5013().world;
                    Intrinsics.checkExpressionValueIsNotNull((Object)worldClient, (String)"mc.world");
                    netHandlerPlayClient.sendPacket((Packet)new CPacketUseEntity((Entity)new VKNIwSUCQUw8Y8J9DVJeBWjGHMomWUXv((World)worldClient, n), EnumHand.MAIN_HAND));
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String string7 = "Using entity [%d]";
                    Object[] objectArray = new Object[(int)((long)1268932789 ^ (long)1268932788)];
                    objectArray[(int)((long)847735260 ^ (long)847735260)] = n;
                    Object[] objectArray3 = objectArray;
                    int n12 = (int)((long)744678788 ^ (long)744678788);
                    String string8 = String.format(string7, Arrays.copyOf(objectArray3, objectArray3.length));
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

    public DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD() {
        super("use");
        Field13663 = this;
    }

    static {
        Field13664 = new DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(null);
    }

    public static final Minecraft Method5013() {
        return FrvoqED59Mj96pmO7hxn2tEew1fZAOzj.Field8619;
    }

    public static final void Method5014(Minecraft minecraft) {
        FrvoqED59Mj96pmO7hxn2tEew1fZAOzj.Field8619 = minecraft;
    }

    public static final DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD Method5015() {
        return Field13663;
    }

    public static final void Method5016(DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD dWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD) {
        Field13663 = dWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD;
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1735378680 ^ (long)-1735378680);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1653677780 ^ (long)-1653677613);
            int n2 = (int)((long)-652860457 ^ (long)-652860518) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1193741743L ^ 0xB8D8F4B0 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

