//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.util;

import net.minecraft.entity.player.*;
import kotlin.jvm.internal.*;
import com.mojang.authlib.*;
import net.minecraft.client.*;
import net.minecraft.client.network.*;
import net.minecraft.block.state.*;
import org.jetbrains.annotations.*;
import java.net.*;
import net.minecraft.client.gui.*;
import kotlin.text.*;
import lavahack.client.*;
import java.io.*;
import net.minecraft.util.math.*;
import net.minecraft.util.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import net.minecraft.launchwrapper.*;
import kotlin.*;
import java.lang.reflect.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000\u009c\u0001\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\b\u0010\u0002\u001a\u0004\u0018\u0001H\u0001?\u0006\u0002\u0010\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u0012\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00020\u000b\"\u00020\r\u001a\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015\u001a\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017\u001a\u0006\u0010\u0018\u001a\u00020\u0005\u001a\u001e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0013\u001a\u0016\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005\u001a\u0006\u0010 \u001a\u00020\u001c\u001a\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020#0\"\u001a\u0006\u0010$\u001a\u00020%\u001a\u000e\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020(\u001a\u000e\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+\u001a\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u000200\u001a\u0014\u00101\u001a\u00020\u001c2\f\u00102\u001a\b\u0012\u0004\u0012\u00020+03\u001a\u0010\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u000207\u001a\u0010\u00104\u001a\u0004\u0018\u0001052\u0006\u00108\u001a\u00020\u001c\u001a1\u00109\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020+2\f\u0010:\u001a\b\u0012\u0004\u0012\u0002H\u00010;2\f\u0010<\u001a\b\u0012\u0004\u0012\u0002H\u00010;?\u0006\u0002\u0010=?\u0006>" }, d2 = { "clone", "T", "object", "(Ljava/lang/Object;)Ljava/lang/Object;", "contains", "", "ch", "", "array", "", "createDoubleArray", "", "elements", "", "getBlockStateSafe", "Lnet/minecraft/block/state/IBlockState;", "pos", "Lnet/minecraft/util/math/BlockPos;", "getPing", "", "id", "Ljava/util/UUID;", "player", "Lnet/minecraft/entity/player/EntityPlayer;", "nullCheck", "popupDialog", "", "message", "", "exit", "type", "popupErrorDialog", "properties", "resourceCache", "", "", "sr", "Lnet/minecraft/client/gui/ScaledResolution;", "stackTrace", "throwable", "", "stringFixer", "toFix", "", "toAABB", "Lnet/minecraft/util/math/AxisAlignedBB;", "aabb", "side", "Lnet/minecraft/util/EnumFacing;", "toString", "list", "", "toUrl", "Ljava/net/URL;", "uri", "Ljava/net/URI;", "url", "tryCatch", "try", "Lcom/kisman/cc/util/ReturnableRunnable;", "catch", "(Lcom/kisman/cc/util/ReturnableRunnable;Lcom/kisman/cc/util/ReturnableRunnable;)Ljava/lang/Object;", "kisman.cc" })
public final class Class886
{
    private int Field11723;
    
    public static final int Method3699(@NotNull @NotNull final EntityPlayer entityPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, "player");
        final UUID getUniqueID = entityPlayer.getUniqueID();
        Intrinsics.checkExpressionValueIsNotNull((Object)getUniqueID, "player.uniqueID");
        return Method3701(getUniqueID);
    }
    
    public static final int Method3700() {
        final NetHandlerPlayClient connection = Class2142.Field17803.player.connection;
        Intrinsics.checkExpressionValueIsNotNull((Object)connection, "mc.player.connection");
        final GameProfile getGameProfile = connection.getGameProfile();
        Intrinsics.checkExpressionValueIsNotNull((Object)getGameProfile, "mc.player.connection.gameProfile");
        final UUID id = getGameProfile.getId();
        Intrinsics.checkExpressionValueIsNotNull((Object)id, "mc.player.connection.gameProfile.id");
        return Method3701(id);
    }
    
    public static final int Method3701(@NotNull @NotNull final UUID uuid) {
        Intrinsics.checkParameterIsNotNull((Object)uuid, "id");
        final Minecraft field17803 = Class2142.Field17803;
        Intrinsics.checkExpressionValueIsNotNull((Object)field17803, "mc");
        int getResponseTime;
        if (field17803.isSingleplayer()) {
            getResponseTime = 0;
        }
        else {
            final NetworkPlayerInfo getPlayerInfo = Class2142.Field17803.player.connection.getPlayerInfo(uuid);
            Intrinsics.checkExpressionValueIsNotNull((Object)getPlayerInfo, "mc.player.connection.getPlayerInfo(id)");
            getResponseTime = getPlayerInfo.getResponseTime();
        }
        return getResponseTime;
    }
    
    @NotNull
    @NotNull
    public static final double[] Method3702(@NotNull @NotNull final double... array) {
        Intrinsics.checkParameterIsNotNull((Object)array, "elements");
        final double[] array2 = new double[array.length];
        int n = 0;
        final int length = array.length;
        if (n <= length) {
            while (true) {
                array2[n] = array[n];
                if (n == length) {
                    break;
                }
                ++n;
            }
        }
        return array2;
    }
    
    @NotNull
    @NotNull
    public static final IBlockState Method3703(@NotNull @NotNull final BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos");
        final IBlockState getBlockState = Class2142.Field17803.world.getBlockState(blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState, "mc.world.getBlockState(pos)");
        return getBlockState;
    }
    
    public static final boolean Method3704(final char c, @NotNull @NotNull final char[] array) {
        Intrinsics.checkParameterIsNotNull((Object)array, "array");
        for (int length = array.length, i = 0; i < length; ++i) {
            if (c == array[i]) {
                return true;
            }
        }
        return false;
    }
    
    @Nullable
    @Nullable
    public static final URL Method3705(@NotNull @NotNull final String spec) {
        Intrinsics.checkParameterIsNotNull((Object)spec, "url");
        return new URL(spec);
    }
    
    @Nullable
    @Nullable
    public static final URL Method3706(@NotNull @NotNull final URI uri) {
        Intrinsics.checkParameterIsNotNull((Object)uri, "uri");
        return uri.toURL();
    }
    
    @NotNull
    @NotNull
    public static final ScaledResolution Method3707() {
        return new ScaledResolution(Class2142.Field17803);
    }
    
    @NotNull
    @NotNull
    public static final String Method3708(@NotNull @NotNull final List list) {
        Intrinsics.checkParameterIsNotNull((Object)list, "list");
        String string = "";
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            string += iterator.next().toString();
        }
        return string;
    }
    
    @NotNull
    @NotNull
    public static final String Method3709() {
        final StringBuilder sb = new StringBuilder();
        for (final String next : System.getProperties().keySet()) {
            if (next instanceof String && (Intrinsics.areEqual((Object)next, (Object)"line.separator") ^ true) && (Intrinsics.areEqual((Object)next, (Object)"java.class.path") ^ true)) {
                sb.append(next).append("|").append(System.getProperty(next.toString())).append("&");
            }
        }
        for (final String s : System.getenv().keySet()) {
            if ((Intrinsics.areEqual((Object)s, (Object)"line.separator") ^ true) && (Intrinsics.areEqual((Object)s, (Object)"java.class.path") ^ true)) {
                sb.append(s).append("|").append(System.getenv(s)).append("&");
            }
        }
        return Method3710(sb);
    }
    
    @NotNull
    @NotNull
    public static final String Method3710(@NotNull @NotNull final Object o) {
        Intrinsics.checkParameterIsNotNull(o, "toFix");
        return new Regex(" ").replace((CharSequence)o.toString(), "_");
    }
    
    public static final void Method3711(@NotNull @NotNull final Throwable t) {
        Intrinsics.checkParameterIsNotNull((Object)t, "throwable");
        if (Class1796.Method6789()) {
            t.printStackTrace();
        }
    }
    
    public static final boolean Method3712() {
        return Class2142.Field17803.player != null && Class2142.Field17803.world != null && Class2142.Field17803.player.connection != null;
    }
    
    @NotNull
    @NotNull
    public static final Object Method3713(@NotNull @NotNull final Class527 class527, @NotNull @NotNull final Class527 class528) {
        Intrinsics.checkParameterIsNotNull((Object)class527, "try");
        Intrinsics.checkParameterIsNotNull((Object)class528, "catch");
        return class527.Method2399();
    }
    
    @Nullable
    @Nullable
    public static final Object Method3714(@Nullable @Nullable final Object obj) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.close();
        return new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).readObject();
    }
    
    @NotNull
    @NotNull
    public static final AxisAlignedBB Method3715(@NotNull @NotNull final AxisAlignedBB axisAlignedBB, @NotNull @NotNull final EnumFacing enumFacing) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, "aabb");
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, "side");
        AxisAlignedBB axisAlignedBB2 = null;
        switch (Class2098.Field17558[enumFacing.ordinal()]) {
            case 1: {
                axisAlignedBB2 = new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ);
                break;
            }
            case 2: {
                axisAlignedBB2 = new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
                break;
            }
            case 3: {
                axisAlignedBB2 = new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ);
                break;
            }
            case 4: {
                axisAlignedBB2 = new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ, axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
                break;
            }
            case 5: {
                axisAlignedBB2 = new AxisAlignedBB(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
                break;
            }
            case 6: {
                axisAlignedBB2 = new AxisAlignedBB(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return axisAlignedBB2;
    }
    
    public static final void Method3716(@NotNull @NotNull final String message, final boolean b, final int messageType) {
        Intrinsics.checkParameterIsNotNull((Object)message, "message");
        JOptionPane.showMessageDialog(null, message, "LavaHack b0.1.6.5-9", messageType);
        if (b) {
            Class1796.Method6791();
        }
    }
    
    public static final void Method3717(@NotNull @NotNull final String s, final boolean b) {
        Intrinsics.checkParameterIsNotNull((Object)s, "message");
        Method3716(s, b, 0);
    }
    
    @NotNull
    @NotNull
    public static final Map Method3718() {
        final Field declaredField;
        final Field field = declaredField = LaunchClassLoader.class.getDeclaredField("resourceCache");
        Intrinsics.checkExpressionValueIsNotNull((Object)declaredField, "it");
        declaredField.setAccessible(true);
        final Object value = field.get(Launch.classLoader);
        if (value == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.ByteArray>");
        }
        return (Map)value;
    }
    
    private static String Method3719(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5CC5 ^ 0xD2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
