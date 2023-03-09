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

import com.kisman.cc.util.Class2098;
import com.kisman.cc.util.Class2142;
import com.kisman.cc.util.Class527;
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
import lavahack.client.Class1796;
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
public final class Class886 {
    private int Field11723;

    public static final int Method3699(@NotNull @NotNull EntityPlayer entityPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, (String)"player");
        UUID uUID = entityPlayer.getUniqueID();
        Intrinsics.checkExpressionValueIsNotNull((Object)uUID, (String)"player.uniqueID");
        return Class886.Method3701(uUID);
    }

    public static final int Method3700() {
        NetHandlerPlayClient netHandlerPlayClient = Class2142.Field17803.player.connection;
        Intrinsics.checkExpressionValueIsNotNull((Object)netHandlerPlayClient, (String)"mc.player.connection");
        GameProfile gameProfile = netHandlerPlayClient.getGameProfile();
        Intrinsics.checkExpressionValueIsNotNull((Object)gameProfile, (String)"mc.player.connection.gameProfile");
        UUID uUID = gameProfile.getId();
        Intrinsics.checkExpressionValueIsNotNull((Object)uUID, (String)"mc.player.connection.gameProfile.id");
        return Class886.Method3701(uUID);
    }

    public static final int Method3701(@NotNull @NotNull UUID uUID) {
        int n;
        Intrinsics.checkParameterIsNotNull((Object)uUID, (String)"id");
        Minecraft minecraft = Class2142.Field17803;
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft, (String)"mc");
        if (minecraft.isSingleplayer()) {
            return 0;
        }
        NetworkPlayerInfo networkPlayerInfo = Class2142.Field17803.player.connection.getPlayerInfo(uUID);
        Intrinsics.checkExpressionValueIsNotNull((Object)networkPlayerInfo, (String)"mc.player.connection.getPlayerInfo(id)");
        int n2 = n = networkPlayerInfo.getResponseTime();
        return n2;
    }

    @NotNull
    @NotNull
    public static final double[] Method3702(double ... dArray) {
        Intrinsics.checkParameterIsNotNull((Object)dArray, (String)"elements");
        double[] dArray2 = new double[dArray.length];
        int n = 0;
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
        IBlockState iBlockState = Class2142.Field17803.world.getBlockState(blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(pos)");
        return iBlockState;
    }

    public static final boolean Method3704(char c, @NotNull @NotNull char[] cArray) {
        Intrinsics.checkParameterIsNotNull((Object)cArray, (String)"array");
        char[] cArray2 = cArray;
        int n = cArray2.length;
        int n2 = 0;
        while (n2 < n) {
            char c2 = cArray2[n2];
            if (c == c2) {
                return true;
            }
            ++n2;
        }
        return false;
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
        return new ScaledResolution(Class2142.Field17803);
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
            if (!(object instanceof String) || !(Intrinsics.areEqual((Object)object, (Object)"line.separator") ^ true) || !(Intrinsics.areEqual((Object)object, (Object)"java.class.path") ^ true)) continue;
            stringBuilder.append((String)object).append("|").append(System.getProperty(object.toString())).append("&");
        }
        Iterator<Object> iterator = System.getenv().keySet().iterator();
        while (iterator.hasNext()) {
            Object object;
            object = (String)iterator.next();
            if (!(Intrinsics.areEqual((Object)object, (Object)"line.separator") ^ true) || !(Intrinsics.areEqual((Object)object, (Object)"java.class.path") ^ true)) continue;
            stringBuilder.append((String)object).append("|").append(System.getenv((String)object)).append("&");
        }
        return Class886.Method3710(stringBuilder);
    }

    @NotNull
    @NotNull
    public static final String Method3710(@NotNull @NotNull Object object) {
        Intrinsics.checkParameterIsNotNull((Object)object, (String)"toFix");
        CharSequence charSequence = object.toString();
        String string = " ";
        boolean bl = false;
        string = new Regex(string);
        String string2 = "_";
        return string.replace(charSequence, string2);
    }

    public static final void Method3711(@NotNull @NotNull Throwable throwable) {
        Intrinsics.checkParameterIsNotNull((Object)throwable, (String)"throwable");
        if (!Class1796.Method6789()) return;
        throwable.printStackTrace();
    }

    public static final boolean Method3712() {
        if (Class2142.Field17803.player == null) return false;
        if (Class2142.Field17803.world == null) return false;
        if (Class2142.Field17803.player.connection == null) return false;
        return true;
    }

    @NotNull
    @NotNull
    public static final Object Method3713(@NotNull @NotNull Class527 class527, @NotNull @NotNull Class527 class5272) {
        Intrinsics.checkParameterIsNotNull((Object)class527, (String)"try");
        Intrinsics.checkParameterIsNotNull((Object)class5272, (String)"catch");
        return class527.Method2399();
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
        switch (Class2098.Field17558[enumFacing.ordinal()]) {
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
        Class1796.Method6791();
    }

    public static final void Method3717(@NotNull @NotNull String string, boolean bl) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"message");
        Class886.Method3716(string, bl, 0);
    }

    @NotNull
    @NotNull
    public static final Map Method3718() {
        Field field = LaunchClassLoader.class.getDeclaredField("resourceCache");
        boolean bl = false;
        boolean bl2 = false;
        Field field2 = field;
        boolean bl3 = false;
        Field field3 = field2;
        Intrinsics.checkExpressionValueIsNotNull((Object)field3, (String)"it");
        field3.setAccessible(true);
        Object object = field.get(Launch.classLoader);
        if (object != null) return (Map)object;
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.ByteArray>");
    }

    private static String Method3719(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 210;
            cArray2[n] = (char)(cArray[n] ^ (0x5CC5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

