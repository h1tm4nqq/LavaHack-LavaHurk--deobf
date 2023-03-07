//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  kotlin.Metadata
 *  kotlin.NoWhenBranchMatchedException
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.Regex
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.network.NetHandlerPlayClient
 *  net.minecraft.client.network.NetworkPlayerInfo
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.launchwrapper.Launch
 *  net.minecraft.launchwrapper.LaunchClassLoader
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 */
package com.kisman.cc.util;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import com.kisman.cc.util.QDCXH9agJwY6VzukEM6t94IC3iSpNB1w;
import com.kisman.cc.util.W3C0y9394VvVcZKAtDfQSnqXm5zLQGty;
import com.mojang.authlib.GameProfile;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.swing.JOptionPane;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.launchwrapper.Launch;
import net.minecraft.launchwrapper.LaunchClassLoader;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000\u009c\u0001\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\b\u0010\u0002\u001a\u0004\u0018\u0001H\u0001\u00a2\u0006\u0002\u0010\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u0012\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00020\u000b\"\u00020\r\u001a\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015\u001a\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017\u001a\u0006\u0010\u0018\u001a\u00020\u0005\u001a\u001e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0013\u001a\u0016\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005\u001a\u0006\u0010 \u001a\u00020\u001c\u001a\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020#0\"\u001a\u0006\u0010$\u001a\u00020%\u001a\u000e\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020(\u001a\u000e\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+\u001a\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u000200\u001a\u0014\u00101\u001a\u00020\u001c2\f\u00102\u001a\b\u0012\u0004\u0012\u00020+03\u001a\u0010\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u000207\u001a\u0010\u00104\u001a\u0004\u0018\u0001052\u0006\u00108\u001a\u00020\u001c\u001a1\u00109\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020+2\f\u0010:\u001a\b\u0012\u0004\u0012\u0002H\u00010;2\f\u0010<\u001a\b\u0012\u0004\u0012\u0002H\u00010;\u00a2\u0006\u0002\u0010=\u00a8\u0006>"}, d2={"clone", "T", "object", "(Ljava/lang/Object;)Ljava/lang/Object;", "contains", "", "ch", "", "array", "", "createDoubleArray", "", "elements", "", "getBlockStateSafe", "Lnet/minecraft/block/state/IBlockState;", "pos", "Lnet/minecraft/util/math/BlockPos;", "getPing", "", "id", "Ljava/util/UUID;", "player", "Lnet/minecraft/entity/player/EntityPlayer;", "nullCheck", "popupDialog", "", "message", "", "exit", "type", "popupErrorDialog", "properties", "resourceCache", "", "", "sr", "Lnet/minecraft/client/gui/ScaledResolution;", "stackTrace", "throwable", "", "stringFixer", "toFix", "", "toAABB", "Lnet/minecraft/util/math/AxisAlignedBB;", "aabb", "side", "Lnet/minecraft/util/EnumFacing;", "toString", "list", "", "toUrl", "Ljava/net/URL;", "uri", "Ljava/net/URI;", "url", "tryCatch", "try", "Lcom/kisman/cc/util/ReturnableRunnable;", "catch", "(Lcom/kisman/cc/util/ReturnableRunnable;Lcom/kisman/cc/util/ReturnableRunnable;)Ljava/lang/Object;", "kisman.cc"})
public final class agYEaptPUW8OPC6jB7DK1WZuIoCKRIex {
    private int Field11723;

    public static final int Method3699(@NotNull @NotNull EntityPlayer entityPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, (String)"player");
        UUID uUID = entityPlayer.getUniqueID();
        Intrinsics.checkExpressionValueIsNotNull((Object)uUID, (String)"player.uniqueID");
        return agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3701(uUID);
    }

    public static final int Method3700() {
        NetHandlerPlayClient netHandlerPlayClient = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.connection;
        Intrinsics.checkExpressionValueIsNotNull((Object)netHandlerPlayClient, (String)"mc.player.connection");
        GameProfile gameProfile = netHandlerPlayClient.getGameProfile();
        Intrinsics.checkExpressionValueIsNotNull((Object)gameProfile, (String)"mc.player.connection.gameProfile");
        UUID uUID = gameProfile.getId();
        Intrinsics.checkExpressionValueIsNotNull((Object)uUID, (String)"mc.player.connection.gameProfile.id");
        return agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3701(uUID);
    }

    public static final int Method3701(@NotNull @NotNull UUID uUID) {
        int n;
        int n2;
        Intrinsics.checkParameterIsNotNull((Object)uUID, (String)"id");
        Minecraft minecraft = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803;
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft, (String)"mc");
        if (minecraft.isSingleplayer()) {
            n2 = (int)-1417084814L ^ 0xAB890072;
            return n2;
        }
        NetworkPlayerInfo networkPlayerInfo = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.connection.getPlayerInfo(uUID);
        Intrinsics.checkExpressionValueIsNotNull((Object)networkPlayerInfo, (String)"mc.player.connection.getPlayerInfo(id)");
        n2 = n = networkPlayerInfo.getResponseTime();
        return n2;
    }

    @NotNull
    @NotNull
    public static final double[] Method3702(double ... dArray) {
        Intrinsics.checkParameterIsNotNull((Object)dArray, (String)"elements");
        double[] dArray2 = new double[dArray.length];
        int n = (int)357470984L ^ 0x154E9308;
        int n2 = dArray.length;
        if (n > n2) return dArray2;
        while (true) {
            dArray2[n] = dArray[n];
            if (n == n2) return dArray2;
            ++n;
        }
    }

    @NotNull
    @NotNull
    public static final IBlockState Method3703(@NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        IBlockState iBlockState = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world.getBlockState(blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(pos)");
        return iBlockState;
    }

    public static final boolean Method3704(char c, @NotNull @NotNull char[] cArray) {
        Intrinsics.checkParameterIsNotNull((Object)cArray, (String)"array");
        char[] cArray2 = cArray;
        int n = cArray2.length;
        int n2 = (int)((long)623112991 ^ (long)623112991);
        while (n2 < n) {
            char c2 = cArray2[n2];
            if (c == c2) {
                return (int)((long)-1522730197 ^ (long)-1522730198) != 0;
            }
            ++n2;
        }
        return ((int)1194847347L ^ 0x4737EC73) != 0;
    }

    @Nullable
    @Nullable
    public static final URL Method3705(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"url");
        return new URL(string);
    }

    @Nullable
    @Nullable
    public static final URL Method3706(@NotNull @NotNull URI uRI) {
        Intrinsics.checkParameterIsNotNull((Object)uRI, (String)"uri");
        return uRI.toURL();
    }

    @NotNull
    @NotNull
    public static final ScaledResolution Method3707() {
        return new ScaledResolution(Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803);
    }

    @NotNull
    @NotNull
    public static final String Method3708(@NotNull @NotNull List list) {
        Intrinsics.checkParameterIsNotNull((Object)list, (String)"list");
        String string = "";
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object e = iterator.next();
            string = string + e.toString();
        }
        return string;
    }

    @NotNull
    @NotNull
    public static final String Method3709() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object object : System.getProperties().keySet()) {
            if (!(object instanceof String) || (Intrinsics.areEqual((Object)object, (Object)"line.separator") ^ (int)((long)-740870399 ^ (long)-740870400)) == 0 || (Intrinsics.areEqual((Object)object, (Object)"java.class.path") ^ (int)((long)926205581 ^ (long)926205580)) == 0) continue;
            stringBuilder.append((String)object).append("|").append(System.getProperty(object.toString())).append("&");
        }
        Iterator<Object> iterator = System.getenv().keySet().iterator();
        while (iterator.hasNext()) {
            Object object;
            object = (String)iterator.next();
            if ((Intrinsics.areEqual((Object)object, (Object)"line.separator") ^ ((int)-510771168L ^ 0xE18E4021)) == 0 || (Intrinsics.areEqual((Object)object, (Object)"java.class.path") ^ (int)((long)2052732138 ^ (long)2052732139)) == 0) continue;
            stringBuilder.append((String)object).append("|").append(System.getenv((String)object)).append("&");
        }
        return agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3710(stringBuilder);
    }

    @NotNull
    @NotNull
    public static final String Method3710(@NotNull @NotNull Object object) {
        Intrinsics.checkParameterIsNotNull((Object)object, (String)"toFix");
        CharSequence charSequence = object.toString();
        String string = " ";
        int n = (int)-833052496L ^ 0xCE58A0B0;
        string = new Regex(string);
        String string2 = "_";
        return string.replace(charSequence, string2);
    }

    public static final void Method3711(@NotNull @NotNull Throwable throwable) {
        Intrinsics.checkParameterIsNotNull((Object)throwable, (String)"throwable");
        if (!leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6789()) return;
        throwable.printStackTrace();
    }

    public static final boolean Method3712() {
        int n;
        if (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player != null && Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world != null && Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.connection != null) {
            n = (int)-561492996L ^ 0xDE884BFD;
            return n != 0;
        }
        n = (int)-1923650461L ^ 0x8D576C63;
        return n != 0;
    }

    @NotNull
    @NotNull
    public static final Object Method3713(@NotNull @NotNull QDCXH9agJwY6VzukEM6t94IC3iSpNB1w qDCXH9agJwY6VzukEM6t94IC3iSpNB1w, @NotNull @NotNull QDCXH9agJwY6VzukEM6t94IC3iSpNB1w qDCXH9agJwY6VzukEM6t94IC3iSpNB1w2) {
        Intrinsics.checkParameterIsNotNull((Object)qDCXH9agJwY6VzukEM6t94IC3iSpNB1w, (String)"try");
        Intrinsics.checkParameterIsNotNull((Object)qDCXH9agJwY6VzukEM6t94IC3iSpNB1w2, (String)"catch");
        return qDCXH9agJwY6VzukEM6t94IC3iSpNB1w.Method2399();
    }

    @Nullable
    @Nullable
    public static final Object Method3714(@Nullable @Nullable Object object) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(object);
        objectOutputStream.close();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return objectInputStream.readObject();
    }

    @NotNull
    @NotNull
    public static final AxisAlignedBB Method3715(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull EnumFacing enumFacing) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, (String)"side");
        switch (W3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field17558[enumFacing.ordinal()]) {
            case 1: {
                AxisAlignedBB axisAlignedBB2 = new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ);
                return axisAlignedBB2;
            }
            case 2: {
                AxisAlignedBB axisAlignedBB2 = new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
                return axisAlignedBB2;
            }
            case 3: {
                AxisAlignedBB axisAlignedBB2 = new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ);
                return axisAlignedBB2;
            }
            case 4: {
                AxisAlignedBB axisAlignedBB2 = new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ, axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
                return axisAlignedBB2;
            }
            case 5: {
                AxisAlignedBB axisAlignedBB2 = new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
                return axisAlignedBB2;
            }
            case 6: {
                AxisAlignedBB axisAlignedBB2 = new AxisAlignedBB(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
                return axisAlignedBB2;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void Method3716(@NotNull @NotNull String string, boolean bl, int n) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"message");
        JOptionPane.showMessageDialog(null, string, "LavaHack b0.1.6.5-9", n);
        if (!bl) return;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6791();
    }

    public static final void Method3717(@NotNull @NotNull String string, boolean bl) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"message");
        agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3716(string, bl, (int)((long)-1553558911 ^ (long)-1553558911));
    }

    @NotNull
    @NotNull
    public static final Map Method3718() {
        Field field = LaunchClassLoader.class.getDeclaredField("resourceCache");
        int n = (int)-971883977L ^ 0xC6123A37;
        int n2 = (int)435287043L ^ 0x19F1F403;
        Field field2 = field;
        int n3 = (int)-926054245L ^ 0xC8CD889B;
        Field field3 = field2;
        Intrinsics.checkExpressionValueIsNotNull((Object)field3, (String)"it");
        field3.setAccessible(((int)18213953L ^ 0x115EC40) != 0);
        Object object = field.get(Launch.classLoader);
        if (object != null) return (Map)object;
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.ByteArray>");
    }

    private static String Method3719(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-451009855 ^ (long)-451009855);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)466866262L ^ 0x1BD3D0A9);
            int n2 = (int)((long)772033972 ^ (long)772034013) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)312911782 ^ (long)312933219) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

